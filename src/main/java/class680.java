import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class680 extends class651 {

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Z")
    public boolean field9550 = false;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    private int field9546 = 0;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Ltm;")
    public class185 field9554 = new class185();

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Ltm;")
    private class185 field9559 = new class185();

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Z")
    private boolean field9563 = false;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Lit;")
    public class464 field9553;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "J")
    private long field9552;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lkw;")
    public class510 field9556;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Lpf;")
    public class424 field9549;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Lvs;")
    public class470 field9555;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field9568 = new String[] { method4889(method4888("\rFkY")), method4889(method4888("\u000eW)\tX\rZs\u000b\u0019")), method4889(method4888("\u0018\u001d)\u001bL")), method4889(method4888("\u000eW)v\u0019")), method4889(method4888("\u000eW)p\u0019")), method4889(method4888("\u000eW)t\u0019")), method4889(method4888("\u000eW)q\u0019")), method4889(method4888("\u000eW)w\u0019")), method4889(method4888("\u000eW)s\u0019")) };

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public int field9544;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    private int field9560;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    private int field9561;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    private int field9562;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    private int field9564;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    private int field9565;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    private int field9566;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    private int field9567;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZII)V")
    public static final void method4882(boolean arg0, int arg1, int arg2) {
        try {
            field9547++;
            if (!arg0) {
                class277 var3 = class387.field5654[arg2][arg1];
                if (var3 != null) {
                    class359.field5223 = var3.field3912;
                    class353.field5114 = var3.field3915;
                    class698.field9772 = var3.field3914;
                }
                class23.method273((byte) -40);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9568[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
    public static final int method4883(int arg0) {
        try {
            int var1 = 17 / ((-arg0 - 54) / 47);
            field9545++;
            if (class321.field4374 == null) {
                return class740.field10525 ? 2 : 1;
            } else {
                return 3;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9568[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public final void method4884(int arg0) {
        try {
            this.field9554.field2394 = this.field9556.field7494;
            this.field9554.field2399 = this.field9556.field7493;
            this.field9554.field2398 = this.field9556.field7481;
            this.field9554.field2390 = this.field9556.field7478;
            this.field9554.field2396 = this.field9556.field7479;
            field9551++;
            this.field9554.field2388 = this.field9556.field7477;
            this.field9554.field2393 = this.field9556.field7480;
            this.field9554.field2392 = this.field9556.field7489;
            this.field9554.field2401 = this.field9556.field7492;
            if (arg0 == -26041) {
                if (this.field9554.field2392 == this.field9554.field2388 && this.field9554.field2401 == this.field9554.field2392 && this.field9554.field2399 == this.field9554.field2398 && this.field9554.field2399 == this.field9554.field2390 && this.field9554.field2396 == this.field9554.field2394 && this.field9554.field2394 == this.field9554.field2393) {
                    this.field9563 = true;
                } else if (this.field9563) {
                    this.field9559.field2390 = this.field9554.field2390;
                    this.field9559.field2388 = this.field9554.field2388;
                    this.field9559.field2401 = this.field9554.field2401;
                    this.field9559.field2394 = this.field9554.field2394;
                    this.field9559.field2398 = this.field9554.field2398;
                    this.field9559.field2393 = this.field9554.field2393;
                    this.field9559.field2392 = this.field9554.field2392;
                    this.field9559.field2399 = this.field9554.field2399;
                    this.field9559.field2396 = this.field9554.field2396;
                    this.field9563 = false;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9568[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[Luu;")
    public static final class240[] method4885(int arg0) {
        try {
            field9558++;
            int var1 = 110 % ((arg0 + 25) / 34);
            return new class240[] { class679.field9540, class345.field5029, class112.field1447, class314.field4301, class80.field1126, class583.field8420, class76.field1085, class248.field3553, class694.field9695, class324.field4416 };
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9568[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lha;IJZZ)V")
    public final void method4886(class18 arg0, int arg1, long arg2, boolean arg3, boolean arg4) {
        try {
            if (this.field9550) {
                arg3 = false;
            } else if (this.field9549.field6065 > class323.field4403) {
                arg3 = false;
            } else if (class160.field2054[class323.field4403] < class530.field7689) {
                arg3 = false;
            } else if (this.field9563) {
                arg3 = false;
            } else if (this.field9549.field6077 != -1) {
                int var7 = (int) (arg2 - this.field9552);
                if (this.field9549.field6068 || var7 <= this.field9549.field6077) {
                    var7 %= this.field9549.field6077;
                } else {
                    arg3 = false;
                }
                if (!this.field9549.field6056 && this.field9549.field6082 > var7) {
                    arg3 = false;
                }
                if (this.field9549.field6056 && var7 >= this.field9549.field6082) {
                    arg3 = false;
                }
            }
            if (!arg4) {
                method4885(38);
            }
            field9557++;
            if (arg3) {
                class57.field809++;
                int var8 = (this.field9554.field2388 - (-this.field9554.field2401 - this.field9554.field2392)) / 3;
                int var9 = (this.field9554.field2398 - (-this.field9554.field2399 - this.field9554.field2390)) / 3;
                int var10 = (this.field9554.field2396 + this.field9554.field2393 + this.field9554.field2394) / 3;
                if (this.field9554.field2403 != var8 || this.field9554.field2386 != var9 || this.field9554.field2387 != var10) {
                    this.field9554.field2387 = var10;
                    this.field9554.field2386 = var9;
                    this.field9554.field2403 = var8;
                    int var11 = this.field9554.field2392 - this.field9554.field2388;
                    int var12 = this.field9554.field2399 - this.field9554.field2398;
                    int var13 = this.field9554.field2394 - this.field9554.field2396;
                    int var14 = this.field9554.field2401 - this.field9554.field2388;
                    int var15 = this.field9554.field2390 - this.field9554.field2398;
                    int var16 = this.field9554.field2393 - this.field9554.field2396;
                    this.field9567 = var12 * var16 - (var13 * var15);
                    this.field9560 = var11 * var15 - (var12 * var14);
                    this.field9564 = var13 * var14 - (var11 * var16);
                    while (true) {
                        if (this.field9567 <= 32767 && this.field9564 <= 32767 && this.field9560 <= 32767 && this.field9567 >= -32767 && this.field9564 >= -32767 && this.field9560 >= -32767) {
                            int var17 = (int) Math.sqrt((double) (this.field9560 * this.field9560 + this.field9567 * this.field9567 + this.field9564 * this.field9564));
                            if (var17 <= 0) {
                                var17 = 1;
                            }
                            this.field9567 = this.field9567 * 32767 / var17;
                            this.field9564 = this.field9564 * 32767 / var17;
                            this.field9560 = this.field9560 * 32767 / var17;
                            if (this.field9549.field6090 > 0 || this.field9549.field6103 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field9560, (double) this.field9567) * 2607.5945876176133D);
                                int var19 = (int) (Math.atan2((double) this.field9564, Math.sqrt((double) (this.field9567 * this.field9567 + this.field9560 * this.field9560))) * 2607.5945876176133D);
                                this.field9562 = this.field9549.field6090 - this.field9549.field6051;
                                this.field9561 = this.field9549.field6051 + var18 - (this.field9562 >> 1);
                                this.field9565 = this.field9549.field6103 - this.field9549.field6099;
                                this.field9566 = var19 + this.field9549.field6099 - (this.field9565 >> 1);
                            }
                            break;
                        }
                        this.field9560 >>= 0x1;
                        this.field9564 >>= 0x1;
                        this.field9567 >>= 0x1;
                    }
                }
                this.field9546 += (int) (((double) this.field9549.field6075 + Math.random() * (double) (this.field9549.field6106 - this.field9549.field6075)) * (double) arg1);
                if (this.field9546 > 63) {
                    int var20 = this.field9546 >> 6;
                    this.field9546 &= 0x3F;
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var31;
                        int var32;
                        int var33;
                        if (this.field9549.field6090 <= 0 && this.field9549.field6103 <= 0) {
                            var31 = this.field9564;
                            var33 = this.field9560;
                            var32 = this.field9567;
                        } else {
                            int var22 = (int) (Math.random() * (double) this.field9562) + this.field9561;
                            int var23 = var22 & 0x3FFF;
                            int var24 = class487.field7151[var23];
                            int var25 = class487.field7150[var23];
                            int var26 = (int) (Math.random() * (double) this.field9565) + this.field9566;
                            int var27 = var26 & 0x1FFF;
                            int var28 = class487.field7151[var27];
                            int var29 = class487.field7150[var27];
                            byte var30 = 13;
                            var31 = (var29 << 1) * -1;
                            var32 = var25 * var28 >> var30;
                            var33 = var24 * var28 >> var30;
                        }
                        float var34 = (float) Math.random();
                        float var35 = (float) Math.random();
                        if (var34 + var35 > 1.0F) {
                            var35 = 1.0F - var35;
                            var34 = 1.0F - var34;
                        }
                        float var36 = 1.0F - (var34 + var35);
                        int var37 = (int) ((float) this.field9554.field2401 * var36 + (float) this.field9554.field2392 * var35 + (float) this.field9554.field2388 * var34);
                        int var38 = (int) ((float) this.field9554.field2390 * var36 + (float) this.field9554.field2399 * var35 + (float) this.field9554.field2398 * var34);
                        int var39 = (int) ((float) this.field9554.field2393 * var36 + (float) this.field9554.field2396 * var34 + (float) this.field9554.field2394 * var35);
                        int var40 = (int) ((float) this.field9559.field2401 * var36 + (float) this.field9559.field2392 * var35 + (float) this.field9559.field2388 * var34);
                        int var41 = (int) ((float) this.field9559.field2390 * var36 + (float) this.field9559.field2399 * var35 + (float) this.field9559.field2398 * var34);
                        int var42 = (int) ((float) this.field9559.field2393 * var36 + (float) this.field9559.field2396 * var34 + (float) this.field9559.field2394 * var35);
                        int var43 = var37 - var40;
                        int var44 = var38 - var41;
                        int var45 = var39 - var42;
                        int var46 = (int) ((double) var40 + Math.random() * (double) var43);
                        int var47 = (int) ((double) var44 * Math.random() + (double) var41);
                        int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                        int var49 = this.field9549.field6062 + (int) (Math.random() * (double) (this.field9549.field6080 - this.field9549.field6062));
                        int var50 = this.field9549.field6116 + ((int) ((double) (this.field9549.field6050 - this.field9549.field6116) * Math.random()));
                        int var51 = this.field9549.field6109 + (int) ((double) (this.field9549.field6098 - this.field9549.field6109) * Math.random());
                        int var52;
                        if (this.field9549.field6060) {
                            double var53 = Math.random();
                            var52 = (int) ((double) this.field9549.field6114 * var53 + (double) this.field9549.field6091) << 8 | (int) ((double) this.field9549.field6083 * var53 + (double) this.field9549.field6102) << 16 | (int) ((double) this.field9549.field6059 * var53 + (double) this.field9549.field6072) | (int) ((double) this.field9549.field6070 + Math.random() * (double) this.field9549.field6096) << 24;
                        } else {
                            var52 = (int) ((double) this.field9549.field6070 + (double) this.field9549.field6096 * Math.random()) << 24 | (int) (Math.random() * (double) this.field9549.field6083 + (double) this.field9549.field6102) << 16 | (int) ((double) this.field9549.field6091 + (double) this.field9549.field6114 * Math.random()) << 8 | (int) ((double) this.field9549.field6072 + (double) this.field9549.field6059 * Math.random());
                        }
                        int var55 = this.field9549.field6097;
                        if (!arg0.method137() && !this.field9549.field6100) {
                            var55 = -1;
                        }
                        if (class723.field10292 == class326.field4466) {
                            new class31(this, var46, var47, var48, var32, var31, var33, var49, var50, var52, var51, var55, this.field9549.field6081, this.field9549.field6053);
                        } else {
                            class31 var57 = class115.field1478[class723.field10292];
                            class723.field10292 = class723.field10292 + 1 & 0x3FF;
                            var57.method336(this, var46, var47, var48, var32, var31, var33, var49, var50, var52, var51, var55, this.field9549.field6081, this.field9549.field6053);
                        }
                    }
                }
            }
            if (!this.field9554.method1527(this.field9559, 1)) {
                class185 var58 = this.field9559;
                this.field9559 = this.field9554;
                this.field9554 = var58;
                this.field9554.field2396 = this.field9556.field7479;
                this.field9554.field2386 = this.field9559.field2386;
                this.field9554.field2390 = this.field9556.field7478;
                this.field9554.field2393 = this.field9556.field7480;
                this.field9554.field2394 = this.field9556.field7494;
                this.field9554.field2403 = this.field9559.field2403;
                this.field9554.field2387 = this.field9559.field2387;
                this.field9554.field2399 = this.field9556.field7493;
                this.field9554.field2388 = this.field9556.field7477;
                this.field9554.field2401 = this.field9556.field7492;
                this.field9554.field2398 = this.field9556.field7481;
                this.field9554.field2392 = this.field9556.field7489;
            }
            this.field9544 = 0;
            for (class31 var59 = (class31) this.field9555.method3617(false); var59 != null; var59 = (class31) this.field9555.method3612(3)) {
                var59.method339(arg2, arg1);
                this.field9544++;
            }
            class623.field8909 += this.field9544;
        } catch (RuntimeException var61) {
            throw class665.method4799(var61, field9568[8] + (arg0 == null ? field9568[0] : field9568[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lha;IJ)V")
    public final void method4887(class18 arg0, int arg1, long arg2) {
        try {
            if (arg1 != 1) {
                this.field9559 = null;
            }
            for (class31 var5 = (class31) this.field9555.method3617(false); var5 != null; var5 = (class31) this.field9555.method3612(arg1 ^ 0x2)) {
                var5.method335(arg0, arg2);
            }
            field9548++;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9568[3] + (arg0 == null ? field9568[0] : field9568[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lha;Lkw;Lit;J)V")
    public class680(class18 arg0, class510 arg1, class464 arg2, long arg3) {
        try {
            this.field9553 = arg2;
            this.field9552 = arg3;
            this.field9556 = arg1;
            this.field9549 = this.field9556.method3896((byte) 110);
            if (!arg0.method137() && this.field9549.field6105 != -1) {
                this.field9549 = class734.method5336(0, this.field9549.field6105);
            }
            this.field9555 = new class470();
            this.field9546 = (int) ((double) this.field9546 + Math.random() * 64.0D);
            this.method4884(-26041);
            this.field9559.field2399 = this.field9554.field2399;
            this.field9559.field2396 = this.field9554.field2396;
            this.field9559.field2388 = this.field9554.field2388;
            this.field9559.field2394 = this.field9554.field2394;
            this.field9559.field2392 = this.field9554.field2392;
            this.field9559.field2398 = this.field9554.field2398;
            this.field9559.field2401 = this.field9554.field2401;
            this.field9559.field2393 = this.field9554.field2393;
            this.field9559.field2390 = this.field9554.field2390;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9568[1] + (arg0 == null ? field9568[0] : field9568[2]) + ',' + (arg1 == null ? field9568[0] : field9568[2]) + ',' + (arg2 == null ? field9568[0] : field9568[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!md", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4888(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!md", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4889(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 7;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
