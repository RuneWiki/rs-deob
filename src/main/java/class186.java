import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class186 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lju;")
    public static class81 field2584 = new class81(0, 0);

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Luf;")
    public static class310 field2588 = new class310(59, -2);

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lrl;")
    public static class507 field2589;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1116(boolean arg0) {
        field2588 = null;
        field2589 = null;
        if (arg0) {
            field2584 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method1117(int arg0, int arg1, int arg2) {
        field2586++;
        if (arg0 != 2048) {
            field2589 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)I", line = 32)
    public static final int method1118(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 12840) {
            return 112;
        }
        field2585++;
        if (class383.field5391 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > (class442.field6435 - 1) || (class232.field3217 - 1) < var5) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class456.field6661[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return class383.field5391[var6].method232(arg0, arg1);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Loa;Ljava/lang/String;IZ)V", line = 80)
    public static final void method1119(class490 arg0, String arg1, int arg2, boolean arg3) {
        field2587++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class68.field987.method372(1, null, 250, arg1);
        int var8 = class68.field987.method363(250, null, arg1, (byte) 86) * 13;
        class418.field6109.method459(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - (-var4 - var4), -16777216, 0);
        class418.field6109.method431(var5 - var4, var6 - var4, var7 + var4 + var4, var4 + var8 + var4, -1, 0);
        arg0.method2886(-1, null, (byte) 126, 0, null, var8, 1, arg2, var5, null, 1, -1, 0, arg1, var7, var6);
        class469.method2758(var4 + var4 + var7, -var4 + var6, var4 + var8 + var4, var5 - var4, arg2);
        if (arg3) {
            class418.field6109.method435();
        }
    }
}
