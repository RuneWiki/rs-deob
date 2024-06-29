import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class182 {

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field2693 = -1;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "J")
    public static volatile long field2699 = 0L;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Lsh;")
    public static class472 field2696 = new class472(94, 9);

    @OriginalMember(owner = "client!js", name = "h", descriptor = "Lsh;")
    public static class472 field2700 = new class472(69, 0);

    @OriginalMember(owner = "client!js", name = "j", descriptor = "Les;")
    public static class441 field2702 = new class441("LOCAL", 4);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "[Ldp;")
    public static class319[] field2701;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BIII)Lsk;", line = 5)
    public static final class309 method1249(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 86) {
            return null;
        }
        field2694++;
        class337 var4 = class170.field2427[arg2][arg1][arg3];
        if (var4 == null) {
            return null;
        }
        class309 var5 = null;
        int var6 = -1;
        for (class448 var7 = var4.field5054; var7 != null; var7 = var7.field6340) {
            class305 var8 = var7.field6343;
            if (var8 instanceof class309) {
                class309 var9 = (class309) var8;
                int var10 = var9.method1705((byte) 65) * 64 + 60 - 64;
                int var11 = var9.field4543 - var10 >> 7;
                int var12 = var9.field4538 - var10 >> 7;
                int var13 = var9.field4543 + var10 >> 7;
                int var14 = var9.field4538 + var10 >> 7;
                if (var11 <= arg1 && var12 <= arg3 && arg1 <= var13 && var14 >= arg3) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg3);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V", line = 71)
    public static void method1250(byte arg0) {
        field2702 = null;
        field2696 = null;
        field2700 = null;
        int var1 = -77 / ((38 - arg0) / 56);
        field2701 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([[BLjb;B)V", line = 85)
    public static final void method1251(byte[][] arg0, class350 arg1, byte arg2) {
        field2695++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg2 < 89) {
            return;
        }
        for (int var4 = 0; var4 < arg1.field698; var4++) {
            class418.method2483((byte) 124);
            for (int var5 = 0; var5 < class379.field5642 >> 3; var5++) {
                for (int var6 = 0; var6 < class456.field6477 >> 3; var6++) {
                    boolean var7 = false;
                    int var8 = class38.field530[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1.field713 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = (var8 & 0xFFE44E) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class145.field2052.length; var14++) {
                                if (class145.field2052[var14] == var13 && arg0[var14] != null) {
                                    class446 var15 = new class446(arg0[var14]);
                                    arg1.method353(var5 * 8, var11, var4, var6 * 8, class183.field2717, var9, 88, var10, var12, var15);
                                    var7 = true;
                                    arg1.method2165(-126, var6 * 8, var9, var5 * 8, class138.field1976, var4, var12, var11, var10, var15, var3[0] == -1 ? var3 : null);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg1.method361(false, var5 * 8, var4, var6 * 8, 8, 8);
                    }
                }
            }
        }
        if (var3[0] == -1) {
            class378.field5629 = null;
        } else {
            class378.field5629 = class365.field5529.method681(var3[2], var3[0], class431.field6129, var3[3], (byte) 53, var3[1]);
            class378.field5616 = var3[4];
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lbg;I)I", line = 174)
    public static final int method1252(class257 arg0, int arg1) {
        field2698++;
        int var2 = arg0.field3803;
        class322 var3 = arg0.method1917(0);
        if (arg0.field4663) {
            var2 = arg0.field3836;
        } else if (arg0.field4620 == var3.field4806 || arg0.field4620 == var3.field4817 || arg0.field4620 == var3.field4832 || arg0.field4620 == var3.field4812) {
            var2 = arg0.field3810;
        } else if (arg0.field4620 == var3.field4834 || arg0.field4620 == var3.field4816 || arg0.field4620 == var3.field4800 || arg0.field4620 == var3.field4825) {
            var2 = arg0.field3835;
        }
        if (arg1 != -1) {
            method1253(-33, true, -64, 122, 121, -78);
        }
        return var2;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZIIII)V", line = 203)
    public static final void method1253(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2697++;
        for (int var6 = arg3; var6 <= arg5; var6++) {
            class345.method2125(false, class49.field723[var6], arg2, arg0, arg4);
        }
        if (arg1) {
            field2696 = null;
        }
    }
}
