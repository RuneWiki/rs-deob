import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class152 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lic;")
    public static class59 field3296 = class59.method433(0, " )2> ");

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lic;")
    public static class59 field3300 = class59.method433(0, "(Y<)4col>");

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lm;")
    public static class83 field3301 = new class83();

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lic;")
    public static class59 field3304 = class59.method433(0, "Passwort: ");

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lic;")
    public static class59 field3303 = class59.method433(0, "(Udns");

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[J")
    public static long[] field3305 = new long[32];

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[Lt;")
    public static class132[] field3298;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public static final void method1116(int arg0, int arg1) {
        field3295++;
        if (!class114.method923(arg1, (byte) -128)) {
            return;
        }
        class159[] var2 = class46.field1173[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class159 var4 = var2[var3];
            if (var4 != null) {
                var4.field3615 = 0;
                var4.field3637 = 0;
            }
        }
        if (arg0 != -2055025328) {
            field3303 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[Lwf;I)V")
    public static final void method1117(byte arg0, class159[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class159 var4 = arg1[var3];
            if (var4 != null && var4.field3660 == arg2 && (!var4.field3596 || !class5.method28(-1, var4))) {
                if (var4.field3612 == 0) {
                    if (!var4.field3596 && class5.method28(-1, var4) && class17.field343 != var4) {
                        continue;
                    }
                    method1117((byte) -103, arg1, var4.field3573);
                    if (var4.field3598 != null) {
                        method1117((byte) -91, var4.field3598, var4.field3573);
                    }
                    class41 var5 = (class41) class33.field889.method35((long) var4.field3573, 105);
                    if (var5 != null) {
                        class48.method374(-1, var5.field1044);
                    }
                }
                if (var4.field3612 == 6) {
                    if (var4.field3611 != -1 || var4.field3540 != -1) {
                        boolean var6 = class19.method99(var4, (byte) -72);
                        int var7;
                        if (var6) {
                            var7 = var4.field3540;
                        } else {
                            var7 = var4.field3611;
                        }
                        if (var7 != -1) {
                            class25 var8 = class49.method381(var7, (byte) 126);
                            var4.field3637 += class76.field1872;
                            while (var8.field610[var4.field3615] < var4.field3637) {
                                var4.field3637 -= var8.field610[var4.field3615];
                                var4.field3615++;
                                if (var4.field3615 >= var8.field625.length) {
                                    var4.field3615 -= var8.field639;
                                    if (var4.field3615 < 0 || var8.field625.length <= var4.field3615) {
                                        var4.field3615 = 0;
                                    }
                                }
                                class42.method320(false, var4);
                            }
                        }
                    }
                    if (var4.field3640 != 0 && !var4.field3596) {
                        int var9 = var4.field3640 << 16 >> 16;
                        int var10 = var4.field3640 >> 16;
                        int var11 = class76.field1872 * var9;
                        var4.field3641 = var4.field3641 + var11 & 0x7FF;
                        int var12 = class76.field1872 * var10;
                        var4.field3536 = var4.field3536 + var12 & 0x7FF;
                        class42.method320(false, var4);
                    }
                }
            }
        }
        if (arg0 >= -10) {
            method1119(111);
        }
        field3299++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILic;Ldd;Lic;)[Lt;")
    public static final class132[] method1118(int arg0, class59 arg1, class26 arg2, class59 arg3) {
        int var4 = 82 / ((arg0 + 48) / 62);
        field3302++;
        int var5 = arg2.method201(arg1, -1);
        int var6 = arg2.method196(6, var5, arg3);
        return class10.method47((byte) 111, var5, arg2, var6);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method1119(int arg0) {
        if (arg0 != 0) {
            field3305 = null;
        }
        field3296 = null;
        field3303 = null;
        field3298 = null;
        field3305 = null;
        field3304 = null;
        field3300 = null;
        field3301 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILdd;)Z")
    public static final boolean method1120(int arg0, int arg1, class26 arg2) {
        field3297++;
        byte[] var3 = arg2.method194(arg1, -112);
        if (var3 == null) {
            return false;
        } else {
            class148.method1100(var3, (byte) 19);
            return arg0 == 0;
        }
    }
}
