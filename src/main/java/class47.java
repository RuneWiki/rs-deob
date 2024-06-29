import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class31 {

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "[Lce;")
    public class20[] field1236;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lof;")
    public static class103 field1233 = new class103(8);

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "[Z")
    public static boolean[] field1237 = new boolean[100];

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lid;")
    private static class60 field1241 = class11.method72("Press (Wchange your password(W on front page)3", (byte) -26);

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "Lid;")
    public static class60 field1242 = field1241;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lqd;")
    public static class115 field1239 = new class115(64);

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "Lid;")
    public static class60 field1244 = class11.method72("sl_stars", (byte) 94);

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "Lid;")
    public static class60 field1245 = class11.method72("Ladevorgang )2 bitte warten Sie)3", (byte) 94);

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "Ljd;")
    public static class66 field1243 = new class66();

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "Lid;")
    private static class60 field1247 = class11.method72("Password: ", (byte) 121);

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "[B")
    public static byte[] field1249 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "Lid;")
    public static class60 field1246 = field1247;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
    public static int field1248 = 128;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lie;I)V")
    public static final void method368(class61 arg0, int arg1) {
        field1238++;
        class19.field467 = arg0;
        int var2 = 54 / ((arg1 + 64) / 57);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lid;BLid;Lie;)Le;")
    public static final class29 method369(class60 arg0, byte arg1, class60 arg2, class61 arg3) {
        field1232++;
        int var4 = arg3.method482(13975, arg2);
        int var5 = -4 / ((14 - arg1) / 37);
        int var6 = arg3.method464((byte) -113, arg0, var4);
        return class132.method1046(var6, arg3, var4, true);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lie;Lie;IZ)V")
    public class47(class61 arg0, class61 arg1, int arg2, boolean arg3) {
        class66 var5 = new class66();
        int var6 = arg0.method479(arg2, (byte) -98);
        this.field1236 = new class20[var6];
        int[] var7 = arg0.method480((byte) -52, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method473((byte) 114, arg2, var7[var8]);
            class45 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class45 var12 = (class45) var5.method496(10153); var12 != null; var12 = (class45) var5.method500(-1)) {
                if (var12.field1191 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method477(var11, 18734, 0);
                } else {
                    var13 = arg1.method477(0, 18734, var11);
                }
                var10 = new class45(var11, var13);
                var5.method508(var10, (byte) 87);
            }
            this.field1236[var7[var8]] = new class20(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Z")
    public static final boolean method370(int arg0, int arg1) {
        if (arg1 != -1) {
            method370(18, -16);
        }
        field1231++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public static void method371(byte arg0) {
        field1237 = null;
        field1243 = null;
        field1241 = null;
        field1239 = null;
        field1246 = null;
        field1247 = null;
        if (arg0 != 104) {
            return;
        }
        field1242 = null;
        field1244 = null;
        field1249 = null;
        field1233 = null;
        field1245 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)Z")
    public final boolean method372(int arg0, boolean arg1) {
        if (arg1) {
            method368(null, 54);
        }
        field1235++;
        return this.field1236[arg0].field478;
    }
}
