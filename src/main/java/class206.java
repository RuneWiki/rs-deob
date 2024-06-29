import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class206 {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3512 = 0;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[Ln;")
    public static class16[] field3514 = new class16[27];

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Lak;")
    public static class135 field3510 = new class135(64);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[[[I")
    public static int[][][] field3509;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
    public static final boolean method1382(int arg0) {
        field3508++;
        class213 var1 = class87.field1600;
        synchronized (class87.field1600) {
            if (field3512 == class156.field2788) {
                return false;
            }
            class89.field1626 = class125.field2189[field3512];
            int var3 = 2 % ((-arg0 - 78) / 40);
            class56.field1150 = class139.field2397[field3512];
            field3512 = field3512 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static void method1383(boolean arg0) {
        field3509 = null;
        if (!arg0) {
            field3509 = null;
        }
        field3510 = null;
        field3514 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
    public static final void method1384(int arg0, int arg1) {
        class35 var2 = class274.field4775[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class35 var4 = class274.field4775[var3][arg0][arg1] = class274.field4775[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field777--;
                for (int var5 = 0; var5 < var4.field759; var5++) {
                    class191 var6 = var4.field755[var5];
                    if ((var6.field3314 >> 29 & 0x3L) == 2L && var6.field3316 == arg0 && var6.field3315 == arg1) {
                        var6.field3323--;
                    }
                }
            }
        }
        if (class274.field4775[0][arg0][arg1] == null) {
            class274.field4775[0][arg0][arg1] = new class35(0, arg0, arg1);
        }
        class274.field4775[0][arg0][arg1].field774 = var2;
        class274.field4775[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static final void method1385(byte arg0) {
        field3511++;
        int var1 = class49.field1050 * 128 + 64;
        int var2 = class199.field3454 * 128 + 64;
        int var3 = class23.method216(arg0 ^ 0xFFFFFFD2, var2, var1, class274.field4798) - class26.field478;
        if (class62.field1240 < 100) {
            if (class112.field1957 < var3) {
                class112.field1957 += (var3 - class112.field1957) * class62.field1240 / 1000 + class131.field2295;
                if (class112.field1957 > var3) {
                    class112.field1957 = var3;
                }
            }
            if (class112.field1957 > var3) {
                class112.field1957 -= class131.field2295 + ((class112.field1957 - var3) * class62.field1240 / 1000);
                if (var3 > class112.field1957) {
                    class112.field1957 = var3;
                }
            }
            if (var1 > class20.field380) {
                class20.field380 += (var1 - class20.field380) * class62.field1240 / 1000 + class131.field2295;
                if (var1 < class20.field380) {
                    class20.field380 = var1;
                }
            }
            if (class167.field2957 < var2) {
                class167.field2957 += (var2 - class167.field2957) * class62.field1240 / 1000 + class131.field2295;
                if (var2 < class167.field2957) {
                    class167.field2957 = var2;
                }
            }
            if (class20.field380 > var1) {
                class20.field380 -= (class20.field380 - var1) * class62.field1240 / 1000 + class131.field2295;
                if (class20.field380 < var1) {
                    class20.field380 = var1;
                }
            }
            if (class167.field2957 > var2) {
                class167.field2957 -= (class167.field2957 - var2) * class62.field1240 / 1000 + class131.field2295;
                if (class167.field2957 < var2) {
                    class167.field2957 = var2;
                }
            }
        } else {
            class20.field380 = class49.field1050 * 128 + 64;
            class167.field2957 = class199.field3454 * 128 + 64;
            class112.field1957 = class23.method216(-70, class167.field2957, class20.field380, class274.field4798) - class26.field478;
        }
        int var4 = class235.field4089 * 128 + 64;
        int var5 = class160.field2879 * 128 + 64;
        int var6 = class23.method216(-27, var4, var5, class274.field4798) - field3513;
        int var7 = var5 - class20.field380;
        int var8 = var6 - class112.field1957;
        int var9 = var4 - class167.field2957;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        if (arg0 != 58) {
            method1384(-45, 96);
        }
        int var13 = var12 - class189.field3289;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class189.field3289 += class258.field4429 * var13 / 1000 + class273.field4734;
            class189.field3289 &= 0x7FF;
        }
        if (class214.field3654 < var11) {
            class214.field3654 += (var11 - class214.field3654) * class258.field4429 / 1000 + class273.field4734;
            if (var11 < class214.field3654) {
                class214.field3654 = var11;
            }
        }
        if (class214.field3654 > var11) {
            class214.field3654 -= class273.field4734 + ((class214.field3654 - var11) * class258.field4429 / 1000);
            if (var11 > class214.field3654) {
                class214.field3654 = var11;
            }
        }
        if (var13 < 0) {
            class189.field3289 -= class273.field4734 + (-var13 * class258.field4429 / 1000);
            class189.field3289 &= 0x7FF;
        }
        int var14 = var12 - class189.field3289;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class189.field3289 = var12;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIILqe;JLqe;Lqe;)V")
    public static final void method1386(int arg0, int arg1, int arg2, int arg3, class95 arg4, long arg5, class95 arg6, class95 arg7) {
        class244 var9 = new class244();
        var9.field4271 = arg4;
        var9.field4284 = arg1 * 128 + 64;
        var9.field4273 = arg2 * 128 + 64;
        var9.field4277 = arg3;
        var9.field4275 = arg5;
        var9.field4278 = arg6;
        var9.field4272 = arg7;
        int var10 = 0;
        class35 var11 = class274.field4775[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field759; var12++) {
                class191 var13 = var11.field755[var12];
                if ((var13.field3314 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3318.method176();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4281 = -var10;
        if (class274.field4775[arg0][arg1][arg2] == null) {
            class274.field4775[arg0][arg1][arg2] = new class35(arg0, arg1, arg2);
        }
        class274.field4775[arg0][arg1][arg2].field762 = var9;
    }
}
