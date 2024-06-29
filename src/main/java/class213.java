import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class213 {

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Z")
    public boolean field3400 = true;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    private int field3411 = -1;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Z")
    public boolean field3407 = false;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "Z")
    public boolean field3414 = true;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field3397 = -1;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field3408 = new String[5];

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    private int field3418 = -1;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public int field3417 = 0;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public int field3413 = -1;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public int field3425 = -1;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    private int field3404 = -1;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    private int field3419 = -1;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "Z")
    public boolean field3426 = true;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public int field3431 = -1;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public int field3421 = -1;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field3398 = 0;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3396 = "Loaded interfaces";

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "[Lui;")
    public static class257[] field3427 = new class257[14];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public int field3391;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    private int field3412;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    private int field3416;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    private int field3423;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    private int field3424;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Lcj;")
    public static class147 field3409;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Ljo;")
    public static class175 field3420;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Ljava/lang/String;")
    public String field3401;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Ljava/lang/String;")
    public String field3406;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[I")
    public int[] field3395;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZZ)Lem;", line = 6)
    public final class285 method1605(int arg0, boolean arg1, boolean arg2) {
        int var4 = arg1 ? this.field3425 : this.field3413;
        field3415++;
        class285 var5 = (class285) class180.field2878.method2329((byte) 107, (long) ((arg1 ? 65536 : 0) | var4));
        if (arg0 != -23) {
            return (class285) null;
        } else if (var5 != null) {
            return var5;
        } else if (class288.field4694.method452(var4, (byte) 49)) {
            class341 var6 = class201.method1543(false, class288.field4694, var4, 0);
            class285 var7;
            if (class42.field607 && !arg2) {
                var7 = new class265(var6);
            } else {
                var7 = var6;
            }
            if (var7 != null) {
                var7.field4642 = var7.field4652;
                var7.field4645 = 0;
                var7.field4644 = var7.field4649;
                var7.field4650 = 0;
                class180.field2878.method2333((long) (var4 | (arg1 ? 65536 : 0)), 0, var7);
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 51)
    public static final void method1606(int arg0) {
        field3403++;
        if (arg0 == -1) {
            class187.field3003.method2327(arg0 + 2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 67)
    public static final boolean method1607(byte arg0, String arg1) {
        field3393++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class38.field570; var2++) {
            if (arg1.equalsIgnoreCase(class241.field3986[var2])) {
                return true;
            }
        }
        if (arg0 >= -45) {
            field3420 = (class175) null;
        }
        if (arg1.equalsIgnoreCase(class6.field55.field4349)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Llb;", line = 102)
    public final class341 method1608(boolean arg0) {
        field3402++;
        class341 var2 = (class341) class180.field2878.method2329((byte) 107, (long) (this.field3411 | 0x20000));
        if (var2 != null) {
            return var2;
        }
        class288.field4694.method452(this.field3411, (byte) 82);
        class341 var3 = class201.method1543(arg0, class288.field4694, this.field3411, 0);
        if (var3 != null) {
            var3.field4645 = 0;
            var3.field4642 = var3.field4652;
            var3.field4644 = var3.field4649;
            var3.field4650 = 0;
            class180.field2878.method2333((long) (this.field3411 | 0x20000), 0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBLqm;)V", line = 156)
    private final void method1609(int arg0, byte arg1, class227 arg2) {
        if (arg1 < 103) {
            return;
        }
        if (arg0 == 1) {
            this.field3413 = arg2.method1765(true);
        } else if (arg0 == 2) {
            this.field3425 = arg2.method1765(true);
        } else if (arg0 == 3) {
            this.field3401 = arg2.method1758((byte) -65);
        } else if (arg0 == 4) {
            this.field3399 = arg2.method1736(255);
        } else if (arg0 == 5) {
            this.field3431 = arg2.method1736(255);
        } else if (arg0 == 6) {
            this.field3417 = arg2.method1720((byte) -76);
        } else if (arg0 == 7) {
            int var6 = arg2.method1720((byte) -96);
            if ((var6 & 0x2) == 2) {
                this.field3407 = true;
            }
            if ((var6 & 0x1) == 0) {
                this.field3400 = false;
            }
        } else if (arg0 == 8) {
            this.field3414 = arg2.method1720((byte) -29) == 1;
        } else if (arg0 == 9) {
            this.field3419 = arg2.method1765(true);
            if (this.field3419 == 65535) {
                this.field3419 = -1;
            }
            this.field3404 = arg2.method1765(true);
            if (this.field3404 == 65535) {
                this.field3404 = -1;
            }
            this.field3412 = arg2.method1715((byte) -111);
            this.field3423 = arg2.method1715((byte) -120);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field3408[arg0 - 10] = arg2.method1758((byte) -87);
        } else if (arg0 == 15) {
            int var4 = arg2.method1720((byte) -45);
            this.field3395 = new int[var4 * 2];
            for (int var5 = 0; var5 < (var4 * 2); var5++) {
                this.field3395[var5] = arg2.method1769(-30726);
            }
            this.field3389 = arg2.method1715((byte) -82);
            this.field3422 = arg2.method1715((byte) 125);
        } else if (arg0 == 16) {
            this.field3426 = false;
        } else if (arg0 == 17) {
            this.field3406 = arg2.method1758((byte) 75);
        } else if (arg0 == 18) {
            this.field3411 = arg2.method1765(true);
        } else if (arg0 == 19) {
            this.field3421 = arg2.method1765(true);
        } else if (arg0 == 20) {
            this.field3397 = arg2.method1765(true);
            if (this.field3397 == 65535) {
                this.field3397 = -1;
            }
            this.field3418 = arg2.method1765(true);
            if (this.field3418 == 65535) {
                this.field3418 = -1;
            }
            this.field3416 = arg2.method1715((byte) -90);
            this.field3424 = arg2.method1715((byte) 57);
        } else if (arg0 == 21) {
            this.field3394 = arg2.method1715((byte) 126);
        } else if (arg0 == 22) {
            this.field3390 = arg2.method1715((byte) 68);
        }
        field3429++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Z", line = 296)
    public final boolean method1610(byte arg0) {
        int var2 = -58 % ((arg0 - 22) / 36);
        field3410++;
        if (this.field3404 == -1 && this.field3419 == -1) {
            return true;
        }
        boolean var3 = false;
        int var4;
        if (this.field3404 == -1) {
            var4 = class106.method820(this.field3419, (byte) -67);
        } else {
            var4 = class66.field1178[this.field3404];
        }
        if (this.field3412 > var4 || var4 > this.field3423) {
            return false;
        } else if (this.field3418 == -1 && this.field3397 == -1) {
            return true;
        } else {
            boolean var5 = false;
            int var6;
            if (this.field3418 == -1) {
                var6 = class106.method820(this.field3397, (byte) -123);
            } else {
                var6 = class66.field1178[this.field3418];
            }
            return var6 >= this.field3416 && this.field3424 >= var6;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 342)
    public static void method1611(int arg0) {
        field3427 = null;
        field3420 = null;
        field3409 = null;
        field3396 = null;
        if (arg0 != 4) {
            field3420 = (class175) null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 360)
    public static final void method1612(byte arg0) {
        field3405++;
        int var1 = class29.field383.method2227(-27542, 8);
        if (class345.field5501 > var1) {
            for (int var2 = var1; var2 < class345.field5501; var2++) {
                class211.field3379[class309.field4925++] = class306.field4895[var2];
            }
        }
        if (class345.field5501 < var1) {
            throw new RuntimeException("gppov1");
        }
        class345.field5501 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class306.field4895[var3];
            class258 var5 = class56.field924[var4];
            int var6 = class29.field383.method2227(-27542, 1);
            if (var6 == 0) {
                class306.field4895[class345.field5501++] = var4;
                var5.field3550 = class332.field5261;
            } else {
                int var7 = class29.field383.method2227(-27542, 2);
                if (var7 == 0) {
                    class306.field4895[class345.field5501++] = var4;
                    var5.field3550 = class332.field5261;
                    class330.field5248[class356.field5645++] = var4;
                } else if (var7 == 1) {
                    class306.field4895[class345.field5501++] = var4;
                    var5.field3550 = class332.field5261;
                    int var12 = class29.field383.method2227(-27542, 3);
                    var5.method1639(true, 1, var12);
                    int var13 = class29.field383.method2227(-27542, 1);
                    if (var13 == 1) {
                        class330.field5248[class356.field5645++] = var4;
                    }
                } else if (var7 == 2) {
                    class306.field4895[class345.field5501++] = var4;
                    var5.field3550 = class332.field5261;
                    if (class29.field383.method2227(-27542, 1) == 1) {
                        int var8 = class29.field383.method2227(-27542, 3);
                        var5.method1639(true, 2, var8);
                        int var9 = class29.field383.method2227(-27542, 3);
                        var5.method1639(true, 2, var9);
                    } else {
                        int var10 = class29.field383.method2227(-27542, 3);
                        var5.method1639(true, 0, var10);
                    }
                    int var11 = class29.field383.method2227(-27542, 1);
                    if (var11 == 1) {
                        class330.field5248[class356.field5645++] = var4;
                    }
                } else if (var7 == 3) {
                    class211.field3379[class309.field4925++] = var4;
                }
            }
        }
        if (arg0 >= -42) {
            method1613(-97, (class220) null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILug;)V", line = 473)
    public static final void method1613(int arg0, class220 arg1) {
        field3430++;
        int var2 = arg1.field3515 - class332.field5261;
        int var3 = arg1.field3563 * 128 + (arg1.method1634(-1) * 64);
        int var4 = arg1.field3530 * arg0 + arg1.method1634(-1) * 64;
        arg1.field3573 = 0;
        if (arg1.field3569 == 0) {
            arg1.field3549 = 1024;
        }
        arg1.field3577 += (var3 - arg1.field3577) / var2;
        if (arg1.field3569 == 1) {
            arg1.field3549 = 1536;
        }
        arg1.field3511 += (var4 - arg1.field3511) / var2;
        if (arg1.field3569 == 2) {
            arg1.field3549 = 0;
        }
        if (arg1.field3569 == 3) {
            arg1.field3549 = 512;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lqm;I)V", line = 509)
    public final void method1614(class227 arg0, int arg1) {
        int var3 = 88 / ((arg1 - 58) / 34);
        field3428++;
        while (true) {
            int var4 = arg0.method1720((byte) -110);
            if (var4 == 0) {
                return;
            }
            this.method1609(var4, (byte) 124, arg0);
        }
    }
}
