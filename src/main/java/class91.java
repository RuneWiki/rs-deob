import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class91 extends class190 {

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "Lkn;")
    public static class442 field1275 = new class442("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "Lnq;")
    public static class268 field1271;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Loo;")
    public class374 field1279;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uq", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field1282;

    // $FF: synthetic method
    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method652(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lmc;III[Z)Z", line = 6)
    public static final boolean method648(class69 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class375.field5354 != class214.field2979) {
            int var6 = class418.field5939[arg1].method725(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class242 var8 = class418.field5939[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method725(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method726(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method739(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 47)
    public static final String method649(int arg0, long arg1) {
        class243.field3443.setTime(new Date(arg1));
        field1272++;
        int var3 = class243.field3443.get(7);
        int var4 = class243.field3443.get(5);
        int var5 = class243.field3443.get(2);
        int var6 = class243.field3443.get(1);
        if (arg0 != 12560) {
            method648((class69) null, -124, 57, 101, (boolean[]) null);
        }
        int var7 = class243.field3443.get(11);
        int var8 = class243.field3443.get(12);
        int var9 = class243.field3443.get(13);
        return class331.field4577[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class352.field4825[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIII)Z", line = 76)
    public static final boolean method650(int arg0, int arg1, int arg2, int arg3) {
        field1280++;
        boolean var4 = true;
        class193 var5 = (class193) class244.method1655(arg2, arg3, arg0);
        if (var5 != null) {
            var4 &= class120.method820((byte) 78, var5);
        }
        if (arg1 <= 77) {
            field1275 = null;
        }
        class193 var6 = (class193) class139.method952(arg2, arg3, arg0, field1282 == null ? (field1282 = method652("sc")) : field1282);
        if (var6 != null) {
            var4 &= class120.method820((byte) 93, var6);
        }
        class193 var7 = (class193) class19.method259(arg2, arg3, arg0);
        if (var7 != null) {
            var4 &= class120.method820((byte) 113, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V", line = 103)
    public static void method651(boolean arg0) {
        if (!arg0) {
            method651(false);
        }
        field1271 = null;
        field1275 = null;
    }
}
