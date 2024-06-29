import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class118 extends class321 {

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "Z")
    public boolean field1300 = false;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    private int field1308 = 0;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "Lk;")
    public class92 field1310 = new class92();

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "Lk;")
    private class92 field1315 = new class92();

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "Z")
    private boolean field1316 = false;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "Low;")
    public class93 field1309;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "Lwca;")
    public class339 field1313;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "J")
    private long field1303;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "Lld;")
    public class610 field1305;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "Lkf;")
    public class287 field1312;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "[F")
    public static float[] field1302 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIBLht;)Lbu;")
    public static final class142 method686(int arg0, int arg1, byte arg2, class607 arg3) {
        field1306++;
        int var4 = arg3.field8509 | arg0 << 10;
        class142 var5 = (class142) class79.field806.method1927((long) var4 << 16, 0);
        if (arg2 >= -14) {
            return null;
        } else if (var5 == null) {
            byte[] var6 = class637.field8971.method3859((byte) 114, class637.field8971.method3865((byte) 66, var4));
            if (var6 == null) {
                int var9 = arg3.field8509 | arg1 + 65536 << 10;
                class142 var10 = (class142) class79.field806.method1927((long) var9 << 16, 0);
                if (var10 != null) {
                    return var10;
                }
                byte[] var11 = class637.field8971.method3859((byte) 115, class637.field8971.method3865((byte) 66, var9));
                if (var11 == null) {
                    int var14 = arg3.field8509 | 0x3FFFC00;
                    class142 var15 = (class142) class79.field806.method1927((long) var14 << 16, 0);
                    if (var15 != null) {
                        return var15;
                    }
                    byte[] var16 = class637.field8971.method3859((byte) 118, class637.field8971.method3865((byte) 66, var14));
                    if (var16 == null) {
                        return null;
                    } else if (var16.length <= 1) {
                        return null;
                    } else {
                        class142 var17;
                        try {
                            var17 = class371.method2160(-95, var16);
                        } catch (Exception var21) {
                            throw new RuntimeException(var21.getMessage() + " S: " + var14);
                        }
                        var17.field1566 = arg3;
                        class79.field806.method1928(-37, var17, (long) var14 << 16);
                        return var17;
                    }
                } else if (var11.length <= 1) {
                    return null;
                } else {
                    class142 var12;
                    try {
                        var12 = class371.method2160(-119, var11);
                    } catch (Exception var20) {
                        throw new RuntimeException(var20.getMessage() + " S: " + var9);
                    }
                    var12.field1566 = arg3;
                    class79.field806.method1928(-69, var12, (long) var9 << 16);
                    return var12;
                }
            } else if (var6.length <= 1) {
                return null;
            } else {
                class142 var7;
                try {
                    var7 = class371.method2160(-108, var6);
                } catch (Exception var19) {
                    throw new RuntimeException(var19.getMessage() + " S: " + var4);
                }
                var7.field1566 = arg3;
                class79.field806.method1928(126, var7, (long) var4 << 16);
                return var7;
            }
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public final void method687(int arg0) {
        this.field1310.field916 = this.field1309.field954;
        field1304++;
        this.field1310.field932 = this.field1309.field938;
        this.field1310.field920 = this.field1309.field935;
        this.field1310.field919 = this.field1309.field948;
        this.field1310.field934 = this.field1309.field951;
        this.field1310.field926 = this.field1309.field947;
        int var2 = -66 % ((arg0 - 63) / 56);
        this.field1310.field922 = this.field1309.field942;
        this.field1310.field923 = this.field1309.field956;
        this.field1310.field918 = this.field1309.field957;
        if (this.field1310.field934 == this.field1310.field919 && this.field1310.field934 == this.field1310.field920 && this.field1310.field932 == this.field1310.field926 && this.field1310.field926 == this.field1310.field916 && this.field1310.field923 == this.field1310.field922 && this.field1310.field923 == this.field1310.field918) {
            this.field1316 = true;
        } else if (this.field1316) {
            this.field1316 = false;
            this.field1315.field919 = this.field1310.field919;
            this.field1315.field922 = this.field1310.field922;
            this.field1315.field918 = this.field1310.field918;
            this.field1315.field923 = this.field1310.field923;
            this.field1315.field920 = this.field1310.field920;
            this.field1315.field926 = this.field1310.field926;
            this.field1315.field932 = this.field1310.field932;
            this.field1315.field916 = this.field1310.field916;
            this.field1315.field934 = this.field1310.field934;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(JZIILr;)V")
    public final void method688(long arg0, boolean arg1, int arg2, int arg3, class564 arg4) {
        if (this.field1300) {
            arg1 = false;
        } else if (class609.field8519 < this.field1305.field8533) {
            arg1 = false;
        } else if (class370.field5058 > class151.field1670[class609.field8519]) {
            arg1 = false;
        } else if (this.field1316) {
            arg1 = false;
        } else if (this.field1305.field8572 != -1) {
            int var7 = (int) (arg0 - this.field1303);
            if (this.field1305.field8579 || this.field1305.field8572 >= var7) {
                var7 %= this.field1305.field8572;
            } else {
                arg1 = false;
            }
            if (!this.field1305.field8562 && var7 < this.field1305.field8583) {
                arg1 = false;
            }
            if (this.field1305.field8562 && this.field1305.field8583 <= var7) {
                arg1 = false;
            }
        }
        field1307++;
        if (arg1) {
            class229.field2832++;
            int var8 = (this.field1310.field919 + this.field1310.field920 + this.field1310.field934) / 3;
            int var9 = (this.field1310.field932 + this.field1310.field926 + this.field1310.field916) / 3;
            int var10 = (this.field1310.field922 + this.field1310.field918 + this.field1310.field923) / 3;
            if (this.field1310.field921 != var8 || this.field1310.field929 != var9 || this.field1310.field931 != var10) {
                this.field1310.field929 = var9;
                this.field1310.field931 = var10;
                this.field1310.field921 = var8;
                int var11 = this.field1310.field934 - this.field1310.field919;
                int var12 = this.field1310.field926 - this.field1310.field932;
                int var13 = this.field1310.field923 - this.field1310.field922;
                int var14 = this.field1310.field920 - this.field1310.field919;
                int var15 = this.field1310.field916 - this.field1310.field932;
                int var16 = this.field1310.field918 - this.field1310.field922;
                this.field1322 = var11 * var15 - (var12 * var14);
                this.field1318 = var13 * var14 - (var11 * var16);
                this.field1317 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field1317 <= 32767 && this.field1318 <= 32767 && this.field1322 <= 32767 && this.field1317 >= -32767 && this.field1318 >= -32767 && this.field1322 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field1322 * this.field1322 + this.field1317 * this.field1317 + (this.field1318 * this.field1318)));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field1318 = this.field1318 * 32767 / var17;
                        this.field1317 = this.field1317 * 32767 / var17;
                        this.field1322 = this.field1322 * 32767 / var17;
                        if (this.field1305.field8526 > 0 || this.field1305.field8538 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field1322, (double) this.field1317) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field1318, Math.sqrt((double) (this.field1317 * this.field1317 + (this.field1322 * this.field1322)))) * 2607.5945876176133D);
                            this.field1323 = this.field1305.field8526 - this.field1305.field8564;
                            this.field1319 = this.field1305.field8538 - this.field1305.field8586;
                            this.field1320 = var18 - ((this.field1323 >> 1) - this.field1305.field8564);
                            this.field1321 = var19 + this.field1305.field8586 - (this.field1319 >> 1);
                        }
                        break;
                    }
                    this.field1317 >>= 0x1;
                    this.field1318 >>= 0x1;
                    this.field1322 >>= 0x1;
                }
            }
            this.field1308 += (int) ((double) arg3 * ((double) this.field1305.field8595 + (double) (this.field1305.field8557 - this.field1305.field8595) * Math.random()));
            if (this.field1308 > 63) {
                int var20 = this.field1308 >> 6;
                this.field1308 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field1305.field8526 <= 0 && this.field1305.field8538 <= 0) {
                        var22 = this.field1322;
                        var23 = this.field1317;
                        var24 = this.field1318;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field1323) + this.field1320;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class435.field6134[var26];
                        int var28 = class435.field6135[var26];
                        int var29 = (int) ((double) this.field1319 * Math.random()) + this.field1321;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class435.field6134[var30];
                        int var32 = class435.field6135[var30];
                        byte var33 = 13;
                        var23 = var28 * var31 >> var33;
                        var24 = (var32 << 1) * -1;
                        var22 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field1310.field920 * var36 + (float) this.field1310.field934 * var35 + (float) this.field1310.field919 * var34);
                    int var38 = (int) ((float) this.field1310.field916 * var36 + (float) this.field1310.field932 * var34 + (float) this.field1310.field926 * var35);
                    int var39 = (int) ((float) this.field1310.field918 * var36 + (float) this.field1310.field923 * var35 + (float) this.field1310.field922 * var34);
                    int var40 = (int) ((float) this.field1315.field920 * var36 + (float) this.field1315.field934 * var35 + (float) this.field1315.field919 * var34);
                    int var41 = (int) ((float) this.field1315.field916 * var36 + (float) this.field1315.field932 * var34 + (float) this.field1315.field926 * var35);
                    int var42 = (int) ((float) this.field1315.field918 * var36 + (float) this.field1315.field923 * var35 + (float) this.field1315.field922 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) (Math.random() * (double) var44 + (double) var41);
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = (int) (Math.random() * (double) (this.field1305.field8550 - this.field1305.field8556)) + this.field1305.field8556;
                    int var50 = this.field1305.field8577 + (int) ((double) (this.field1305.field8591 - this.field1305.field8577) * Math.random());
                    int var51 = (int) (Math.random() * (double) (this.field1305.field8551 - this.field1305.field8542)) + this.field1305.field8542;
                    int var54;
                    if (this.field1305.field8561) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field1305.field8559 * var52 + (double) this.field1305.field8539) << 8 | (int) ((double) this.field1305.field8568 * var52 + (double) this.field1305.field8553) << 16 | (int) ((double) this.field1305.field8530 * var52 + (double) this.field1305.field8575) | (int) ((double) this.field1305.field8546 * Math.random() + (double) this.field1305.field8529) << 24;
                    } else {
                        var54 = (int) ((double) this.field1305.field8529 + Math.random() * (double) this.field1305.field8546) << 24 | (int) ((double) this.field1305.field8575 + Math.random() * (double) this.field1305.field8530) | (int) ((double) this.field1305.field8539 + Math.random() * (double) this.field1305.field8559) << 8 | (int) ((double) this.field1305.field8553 + (double) this.field1305.field8568 * Math.random()) << 16;
                    }
                    int var55 = this.field1305.field8548;
                    if (!arg4.method965() && !this.field1305.field8543) {
                        var55 = -1;
                    }
                    if (class555.field7932 == class15.field125) {
                        new class230(this, var46, var47, var48, var23, var24, var22, var49, var50, var54, var51, var55, this.field1305.field8587, this.field1305.field8560);
                    } else {
                        class230 var56 = class285.field3564[class15.field125];
                        class15.field125 = class15.field125 + 1 & 0x3FF;
                        var56.method1381(this, var46, var47, var48, var23, var24, var22, var49, var50, var54, var51, var55, this.field1305.field8587, this.field1305.field8560);
                    }
                }
            }
        }
        if (!this.field1310.method466(this.field1315, -25819)) {
            class92 var58 = this.field1315;
            this.field1315 = this.field1310;
            this.field1310 = var58;
            this.field1310.field922 = this.field1309.field942;
            this.field1310.field916 = this.field1309.field954;
            this.field1310.field932 = this.field1309.field938;
            this.field1310.field919 = this.field1309.field948;
            this.field1310.field934 = this.field1309.field951;
            this.field1310.field920 = this.field1309.field935;
            this.field1310.field918 = this.field1309.field957;
            this.field1310.field923 = this.field1309.field956;
            this.field1310.field926 = this.field1309.field947;
        }
        this.field1311 = arg2;
        for (class230 var59 = (class230) this.field1312.method1672((byte) 111); var59 != null; var59 = (class230) this.field1312.method1669(-2747)) {
            var59.method1378(arg0, arg3);
            this.field1311++;
        }
        class638.field8989 += this.field1311;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
    public static void method689(int arg0) {
        if (arg0 != -112139864) {
            field1302 = null;
        }
        field1302 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLr;J)V")
    public final void method690(boolean arg0, class564 arg1, long arg2) {
        field1314++;
        for (class230 var5 = (class230) this.field1312.method1672((byte) 115); var5 != null; var5 = (class230) this.field1312.method1669(-2747)) {
            var5.method1379(arg1, arg2);
        }
        if (arg0) {
            this.method687(-24);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
    public static final int method691(int arg0, byte arg1) {
        field1301++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else if (arg1 >= -118) {
            return 3;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lr;Low;Lwca;J)V")
    public class118(class564 arg0, class93 arg1, class339 arg2, long arg3) {
        this.field1309 = arg1;
        this.field1313 = arg2;
        this.field1303 = arg3;
        this.field1305 = this.field1309.method470(5);
        if (!arg0.method965() && this.field1305.field8570 != -1) {
            this.field1305 = class412.method2308(-28, this.field1305.field8570);
        }
        this.field1312 = new class287();
        this.field1308 = (int) ((double) this.field1308 + Math.random() * 64.0D);
        this.method687(123);
        this.field1315.field934 = this.field1310.field934;
        this.field1315.field919 = this.field1310.field919;
        this.field1315.field918 = this.field1310.field918;
        this.field1315.field916 = this.field1310.field916;
        this.field1315.field920 = this.field1310.field920;
        this.field1315.field932 = this.field1310.field932;
        this.field1315.field922 = this.field1310.field922;
        this.field1315.field923 = this.field1310.field923;
        this.field1315.field926 = this.field1310.field926;
    }
}
