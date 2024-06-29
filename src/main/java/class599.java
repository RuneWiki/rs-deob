import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class599 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[Lwc;")
    public static class73[] field8149 = new class73[2048];

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field8155 = -60;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field8150 = 0;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field8153;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method3328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8156++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg0 - arg7;
        int var12 = arg6 - arg7;
        int var13 = arg0 * arg0;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = arg3 * var19;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class523.field7178 <= arg5 && arg5 <= class495.field6845) {
            int[] var39 = class785.field10808[arg5];
            int var40 = class573.method3204(arg4 - arg0, class174.field2335, 124915076, class751.field10402);
            int var41 = class573.method3204(arg4 + arg0, class174.field2335, 124915076, class751.field10402);
            int var42 = class573.method3204(arg4 - var11, class174.field2335, 124915076, class751.field10402);
            int var43 = class573.method3204(arg4 + var11, class174.field2335, arg3 + 124915073, class751.field10402);
            class138.method1069(var39, (byte) 94, var40, var42, arg2);
            class138.method1069(var39, (byte) -88, var42, var43, arg1);
            class138.method1069(var39, (byte) 124, var43, var41, arg2);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (class523.field7178 <= var46 && class495.field6845 >= var45) {
                int var47 = class573.method3204(arg4 + var8, class174.field2335, 124915076, class751.field10402);
                int var48 = class573.method3204(arg4 - var8, class174.field2335, 124915076, class751.field10402);
                if (var44) {
                    int var49 = class573.method3204(arg4 + var10, class174.field2335, 124915076, class751.field10402);
                    int var50 = class573.method3204(arg4 - var10, class174.field2335, 124915076, class751.field10402);
                    if (var45 >= class523.field7178) {
                        int[] var51 = class785.field10808[var45];
                        class138.method1069(var51, (byte) -102, var48, var50, arg2);
                        class138.method1069(var51, (byte) 93, var50, var49, arg1);
                        class138.method1069(var51, (byte) 82, var49, var47, arg2);
                    }
                    if (class495.field6845 >= var46) {
                        int[] var52 = class785.field10808[var46];
                        class138.method1069(var52, (byte) 87, var48, var50, arg2);
                        class138.method1069(var52, (byte) -67, var50, var49, arg1);
                        class138.method1069(var52, (byte) -72, var49, var47, arg2);
                    }
                } else {
                    if (var45 >= class523.field7178) {
                        class138.method1069(class785.field10808[var45], (byte) -41, var48, var47, arg2);
                    }
                    if (class495.field6845 >= var46) {
                        class138.method1069(class785.field10808[var46], (byte) -123, var48, var47, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 209)
    public static final void method3329(boolean arg0) {
        field8152++;
        if (!arg0) {
            method3329(true);
        }
        for (class275 var1 = (class275) class280.field4138.method2551((byte) -108); var1 != null; var1 = (class275) class280.field4138.method2542(-122)) {
            if (class99.method780(var1.field4080, (byte) -102)) {
                class87.method714(var1, (byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIIIII)V", line = 234)
    public static final void method3330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 11922) {
            field8153 = null;
        }
        if (arg2 == arg9 && arg1 == arg5 && arg0 == arg7 && arg4 == arg6) {
            class214.method1415(arg3 - 11808, arg4, arg0, arg5, arg9, arg8);
        } else {
            int var10 = arg9;
            int var11 = arg5;
            int var12 = arg9 * 3;
            int var13 = arg5 * 3;
            int var14 = arg2 * 3;
            int var15 = arg1 * 3;
            int var16 = arg7 * 3;
            int var17 = arg6 * 3;
            int var18 = arg0 + var14 - var16 - arg9;
            int var19 = arg4 + var15 - var17 - arg5;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg9 + (var27 + var29 + var31 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg5;
                class214.method1415(105, var34, var33, var11, var10, arg8);
                var10 = var33;
                var11 = var34;
            }
        }
        field8151++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lha;ZII)Lda;", line = 317)
    public static final class66 method3331(class65 arg0, boolean arg1, int arg2, int arg3) {
        field8154++;
        class93 var4 = class526.method3032(arg0, arg1, arg2, (byte) 10);
        if (var4 == null) {
            return null;
        } else {
            if (arg3 != 0) {
                method3329(false);
            }
            return var4.field1326;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 338)
    public static void method3332(int arg0) {
        if (arg0 != -1355324126) {
            field8149 = null;
        }
        field8149 = null;
        field8153 = null;
    }
}
