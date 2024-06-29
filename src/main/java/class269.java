import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class269 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[[I")
    public static int[][] field4533 = new int[104][104];

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lwm;")
    public static class152 field4534 = class157.method1048("::breakcon", 96);

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lwm;")
    private static class152 field4538 = class157.method1048("Loaded config", 123);

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4537 = 0;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lwm;")
    public static class152 field4535 = field4538;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I", line = 10)
    public static final int method1836(int arg0, int arg1) {
        field4531++;
        if (arg0 != -16310) {
            field4538 = (class152) null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 24)
    public static void method1837(int arg0) {
        int var1 = -92 / ((arg0 - 81) / 38);
        field4534 = null;
        field4535 = null;
        field4533 = (int[][]) null;
        field4538 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lah;I)I", line = 40)
    public static final int method1838(class205 arg0, int arg1) {
        field4530++;
        int var2 = 0;
        if (arg0.method1361(-1, class83.field1154)) {
            var2++;
        }
        if (arg0.method1361(-1, class80.field1125)) {
            var2++;
        }
        if (arg0.method1361(-1, class289.field4894)) {
            var2++;
        }
        if (arg0.method1361(-1, class113.field1610)) {
            var2++;
        }
        if (arg0.method1361(-1, class235.field3858)) {
            var2++;
        }
        if (arg0.method1361(-1, class4.field67)) {
            var2++;
        }
        if (arg0.method1361(-1, class27.field459)) {
            var2++;
        }
        if (arg0.method1361(-1, class44.field704)) {
            var2++;
        }
        if (arg0.method1361(-1, class260.field4453)) {
            var2++;
        }
        if (arg0.method1361(arg1 ^ 0xFFFF9A5F, class195.field3126)) {
            var2++;
        }
        if (arg0.method1361(arg1 - 26017, class48.field745)) {
            var2++;
        }
        if (arg0.method1361(-1, class172.field2726)) {
            var2++;
        }
        if (arg0.method1361(-1, class63.field953)) {
            var2++;
        }
        if (arg0.method1361(-1, class80.field1121)) {
            var2++;
        }
        if (arg1 != 26016) {
            method1840(97, 106, 28, -27, (class73) null, 32L, (class73) null, (class73) null);
        }
        if (arg0.method1361(arg1 - 26017, class101.field1468)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 105)
    public static final void method1839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class215 var20 = new class215(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class287.field4857[var21][arg1][arg2] == null) {
                    class287.field4857[var21][arg1][arg2] = new class34(var21, arg1, arg2);
                }
            }
            class287.field4857[arg0][arg1][arg2].field578 = var20;
        } else if (arg3 == 1) {
            class215 var22 = new class215(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class287.field4857[var23][arg1][arg2] == null) {
                    class287.field4857[var23][arg1][arg2] = new class34(var23, arg1, arg2);
                }
            }
            class287.field4857[arg0][arg1][arg2].field578 = var22;
        } else {
            class95 var24 = new class95(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class287.field4857[var25][arg1][arg2] == null) {
                    class287.field4857[var25][arg1][arg2] = new class34(var25, arg1, arg2);
                }
            }
            class287.field4857[arg0][arg1][arg2].field561 = var24;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIILv;JLv;Lv;)V", line = 158)
    public static final void method1840(int arg0, int arg1, int arg2, int arg3, class73 arg4, long arg5, class73 arg6, class73 arg7) {
        class51 var9 = new class51();
        var9.field799 = arg4;
        var9.field804 = arg1 * 128 + 64;
        var9.field787 = arg2 * 128 + 64;
        var9.field789 = arg3;
        var9.field786 = arg5;
        var9.field794 = arg6;
        var9.field788 = arg7;
        int var10 = 0;
        class34 var11 = class287.field4857[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field579; var12++) {
                class248 var13 = var11.field580[var12];
                if ((var13.field4156 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4144.method22();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field790 = -var10;
        if (class287.field4857[arg0][arg1][arg2] == null) {
            class287.field4857[arg0][arg1][arg2] = new class34(arg0, arg1, arg2);
        }
        class287.field4857[arg0][arg1][arg2].field574 = var9;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 202)
    public static final void method1841(int arg0) {
        class293.method2028();
        class239.field3928 = new class29[7];
        field4532++;
        class239.field3928[1] = new class32();
        class239.field3928[2] = new class274();
        class239.field3928[3] = new class168();
        if (arg0 != -6770) {
            method1837(118);
        }
        class239.field3928[4] = new class103();
        class239.field3928[5] = new class118();
        class239.field3928[6] = new class7();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)V", line = 234)
    public static final void method1842(int arg0, int arg1, int arg2, int arg3) {
        field4536++;
        class152 var4 = class195.method1307(new class152[] { class65.field985, class38.method280(arg3 ^ 0xFFFFE503, arg2), class140.field2126, class38.method280(arg3 ^ 0xFFFFE51B, arg1 >> 6), class140.field2126, class38.method280(71, arg0 >> 6), class140.field2126, class38.method280(121, arg1 & 0x3F), class140.field2126, class38.method280(118, arg0 & 0x3F) }, (byte) 29);
        var4.method975((byte) 17);
        if (arg3 != -6810) {
            method1842(6, -125, -2, 94);
        }
        class94.method620((byte) -119, var4);
    }
}
