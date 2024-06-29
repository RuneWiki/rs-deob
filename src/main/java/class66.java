import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class66 {

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "J")
    public long field851 = 0L;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "J")
    public static volatile long field844 = 0L;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field834 = 0;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "Ljava/lang/String;")
    public static String field850 = "scroll:";

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Z")
    public static boolean field846 = false;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field835 = 0;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "Z")
    public static boolean field849 = false;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field853 = 0;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "Lvc;")
    public class260 field845;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Lvc;")
    public class260 field848;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 6)
    public static final void method479(int arg0) {
        class318.field4689 = 0;
        field833++;
        class296.field4301 = 0;
        class347.method2406((byte) 43);
        class16.method115(-122);
        class305.method2135(0);
        for (int var1 = 0; var1 < class296.field4301; var1++) {
            int var2 = class341.field5322[var1];
            if (class313.field4603 != class251.field3688[var2].field4875) {
                if (class251.field3688[var2].field2345.method1205(0)) {
                    class65.method478((byte) 117, class251.field3688[var2]);
                }
                class251.field3688[var2].method1250((byte) -98, (class157) null);
                class251.field3688[var2] = null;
            }
        }
        if (class315.field4648 != class240.field3490.field4351) {
            throw new RuntimeException("gnp1 pos:" + class240.field3490.field4351 + " psize:" + class315.field4648);
        }
        for (int var3 = 0; var3 < class257.field3747; var3++) {
            if (class251.field3688[class305.field4455[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class257.field3747);
            }
        }
        int var4 = 17 / ((arg0 - 63) / 58);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILfh;Lfh;)V", line = 63)
    public static final void method480(int arg0, class140 arg1, class140 arg2) {
        field842++;
        if (arg0 == -12879) {
            class133.field1804 = arg1;
            class258.field3751 = arg2;
            class1.field5 = class258.field3751.method1088(3, 1);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V", line = 79)
    public static final void method481(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class47.field623) {
            class129.method989(arg3, arg4, arg2 + arg3, arg0 + arg4);
            class129.method997(arg3, arg4, arg2, arg0, 0);
        } else {
            class37.method235(arg3, arg4, arg2 + arg3, arg0 + arg4);
            class37.method231(arg3, arg4, arg2, arg0, 0);
        }
        field840++;
        if (class82.field1061 < 100) {
            return;
        }
        float var5 = (float) class38.field459 / (float) class38.field467;
        if (arg1 != -18418) {
            return;
        }
        int var6 = arg2;
        int var7 = arg0;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = (arg2 - var6) / 2 + arg3;
        int var9 = (arg0 - var7) / 2 + arg4;
        if (class253.field3694 == null || class253.field3694.field2252 != arg2 || class253.field3694.field2250 != arg0) {
            class11 var10 = new class11(arg2, arg0);
            class37.method250(var10.field124, arg2, arg0);
            if (class38.field458.field4550 != -1) {
                class37.method231(0, 0, arg2, arg0, class38.field458.field4550);
            }
            class38.method266(0, 0, class38.field467, class38.field459, 0, 0, var6, var7);
            class38.method268();
            if (class47.field623) {
                class253.field3694 = new class361(var10);
            } else {
                class253.field3694 = var10;
            }
            if (class47.field623) {
                class37.field452 = null;
            } else {
                class283.field4035.method1224(84167136);
            }
        }
        int var11 = 16711680;
        class253.field3694.method84(var8, var9);
        int var12 = class56.field721 * var6 / class38.field467;
        int var13 = class119.field1551 * var7 / class38.field459 + var9;
        int var14 = class248.field3608 * var7 / class38.field459;
        if (class299.field4362 == 1) {
            var11 = 16777215;
        }
        int var15 = var8 + (class321.field4707 * var6 / class38.field467);
        if (class47.field623) {
            class129.method987(var15, var13, var12, var14, var11, 128);
            class129.method986(var15, var13, var12, var14, var11);
        } else {
            class37.method239(var15, var13, var12, var14, var11, 128);
            class37.method248(var15, var13, var12, var14, var11);
        }
        if (class308.field4544 <= 0) {
            return;
        }
        int var16;
        if (class193.field2672 > 50) {
            var16 = 500 - (class193.field2672 * 5);
        } else {
            var16 = class193.field2672 * 5;
        }
        for (class352 var17 = (class352) class38.field457.method739((byte) 83); var17 != null; var17 = (class352) class38.field457.method747(1)) {
            class287 var18 = class282.method1924(true, var17.field5493);
            if (class306.method2142(var18, -1)) {
                if (class144.field2014 == var17.field5493) {
                    int var19 = var17.field5503 * var6 / class38.field467 + var8;
                    int var20 = var17.field5504 * var7 / class38.field459 + var9;
                    if (class47.field623) {
                        class129.method987(var19 - 2, var20 - 2, 4, 4, 16776960, var16);
                    } else {
                        class37.method239(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    }
                } else if (class130.field1774 != -1 && class130.field1774 == var18.field4139) {
                    int var21 = var8 + (var17.field5503 * var6 / class38.field467);
                    int var22 = var17.field5504 * var7 / class38.field459 + var9;
                    if (class47.field623) {
                        class129.method987(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    } else {
                        class37.method239(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 242)
    public static void method482(int arg0) {
        if (arg0 == 10262) {
            field850 = null;
        }
    }
}
