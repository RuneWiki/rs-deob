import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class264 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljf;")
    public static class229 field4554 = class212.method1457((byte) 122, "<br>");

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Le;")
    public static class161 field4555;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lek;")
    public static class185 field4557;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lek;")
    public static class185 field4560;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIIB)V", line = 7)
    public static final void method1869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        int var10 = 35 / ((arg9 - 53) / 48);
        field4559++;
        if (arg1 == arg3 && arg2 == arg5 && arg0 == arg7 && arg4 == arg6) {
            class22.method215(arg7, (byte) 37, arg8, arg2, arg1, arg6);
            return;
        }
        int var11 = arg1;
        int var12 = arg1 * 3;
        int var13 = arg2;
        int var14 = arg2 * 3;
        int var15 = arg5 * 3;
        int var16 = arg3 * 3;
        int var17 = arg0 * 3;
        int var18 = arg4 * 3;
        int var19 = var16 + arg7 - arg1 - var17;
        int var20 = arg6 + var15 - arg2 - var18;
        int var21 = var17 + var12 - var16 - var16;
        int var22 = var18 + var14 - var15 - var15;
        int var23 = var16 - var12;
        int var24 = var15 - var14;
        for (int var25 = 128; var25 <= 4096; var25 += 128) {
            int var26 = var25 * var25 >> 12;
            int var27 = var25 * var26 >> 12;
            int var28 = var20 * var27;
            int var29 = var19 * var27;
            int var30 = var21 * var26;
            int var31 = var23 * var25;
            int var32 = var22 * var26;
            int var33 = (var29 + var30 + var31 >> 12) + arg1;
            int var34 = var24 * var25;
            int var35 = (var32 + var34 + var28 >> 12) + arg2;
            class22.method215(var33, (byte) 37, arg8, var13, var11, var35);
            var11 = var33;
            var13 = var35;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lra;Lui;I)Lkc;", line = 82)
    public static final class37 method1870(class323 arg0, class268 arg1, int arg2) {
        field4558++;
        long var3 = ((long) arg0.field5447 << 32) + ((long) arg0.field5449 << 56) + (long) ((arg0.field5442 - -1 << 16) + arg0.field5452);
        if (arg2 != -29966) {
            method1870((class323) null, (class268) null, 32);
        }
        class37 var5 = (class37) arg1.method1890(var3, -101);
        if (var5 == null) {
            var5 = new class37(arg0.field5442, (float) arg0.field5452, true, false, arg0.field5447);
            arg1.method1885(var3, var5, (byte) -68);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 122)
    public static void method1871(byte arg0) {
        field4560 = null;
        field4557 = null;
        field4555 = null;
        int var1 = 95 % ((arg0 + 37) / 56);
        field4554 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 138)
    public static final void method1872(int arg0) {
        field4556++;
        if (class252.field4409 == 0) {
            return;
        }
        try {
            if (++class161.field2732 > 2000) {
                if (class160.field2720 != null) {
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                }
                if (class16.field242 >= 1) {
                    class169.field2893 = -5;
                    class252.field4409 = 0;
                    return;
                }
                class161.field2732 = 0;
                if (class6.field67 == class192.field3337) {
                    class192.field3337 = class84.field1614;
                } else {
                    class192.field3337 = class6.field67;
                }
                class252.field4409 = 1;
                class16.field242++;
            }
            if (class252.field4409 == 1) {
                class193.field3354 = class215.field3689.method1376(class152.field2631, 0, class192.field3337);
                class252.field4409 = 2;
            }
            if (class252.field4409 == 2) {
                if (class193.field3354.field4011 == 2) {
                    throw new IOException();
                }
                if (class193.field3354.field4011 != 1) {
                    return;
                }
                class160.field2720 = new class205((Socket) class193.field3354.field4009, class215.field3689);
                class193.field3354 = null;
                class160.field2720.method1428(22974, class84.field1608.field195, class84.field1608.field174, 0);
                if (class244.field4353 != null) {
                    class244.field4353.method401((byte) -83);
                }
                if (class180.field3124 != null) {
                    class180.field3124.method401((byte) -83);
                }
                int var1 = class160.field2720.method1435(arg0 + 26129);
                if (class244.field4353 != null) {
                    class244.field4353.method401((byte) -83);
                }
                if (class180.field3124 != null) {
                    class180.field3124.method401((byte) -83);
                }
                if (var1 != 21) {
                    class169.field2893 = var1;
                    class252.field4409 = 0;
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                    return;
                }
                class252.field4409 = 3;
            }
            if (class252.field4409 == 3) {
                if (class160.field2720.method1436(-3616) < 1) {
                    return;
                }
                class131.field2319 = new class229[class160.field2720.method1435(arg0 ^ 0xFFFF99EF)];
                class252.field4409 = 4;
            }
            if (class252.field4409 == 4) {
                if (class160.field2720.method1436(-3616) < class131.field2319.length * 8) {
                    return;
                }
                class171.field2972.field195 = 0;
                class160.field2720.method1431(class131.field2319.length * 8, class171.field2972.field174, 0, (byte) -92);
                for (int var2 = 0; var2 < class131.field2319.length; var2++) {
                    class131.field2319[var2] = class252.method1800(false, class171.field2972.method132(-1));
                }
                class169.field2893 = 21;
                class252.field4409 = 0;
                class160.field2720.method1433((byte) -115);
                class160.field2720 = null;
                return;
            }
            if (arg0 != -26129) {
                method1872(-17);
            }
        } catch (IOException var4) {
            if (class160.field2720 != null) {
                class160.field2720.method1433((byte) -115);
                class160.field2720 = null;
            }
            if (class16.field242 >= 1) {
                class252.field4409 = 0;
                class169.field2893 = -4;
            } else {
                class16.field242++;
                class252.field4409 = 1;
                if (class6.field67 == class192.field3337) {
                    class192.field3337 = class84.field1614;
                } else {
                    class192.field3337 = class6.field67;
                }
                class161.field2732 = 0;
            }
        }
    }
}
