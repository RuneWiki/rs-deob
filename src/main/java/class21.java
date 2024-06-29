import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 extends class254 {

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    private int field273 = 0;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Z")
    private boolean field299 = false;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "Z")
    public boolean field304 = false;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lbq;")
    public class190 field270;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "J")
    private long field283;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lqc;")
    public class521 field278;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "Lhc;")
    public class94 field293;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "Lht;")
    public class410 field301;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "Lem;")
    public static class150 field303 = null;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Lwj;")
    public static class270 field286 = new class270(56, 5);

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "[S")
    public static short[] field288;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 23)
    public final void method131(boolean arg0) {
        field284++;
        this.field276 = this.field278.field7717;
        this.field281 = this.field278.field7716;
        this.field282 = this.field278.field7711;
        this.field294 = this.field278.field7713;
        this.field272 = this.field278.field7718;
        this.field295 = this.field278.field7710;
        this.field290 = this.field278.field7708;
        this.field298 = this.field278.field7712;
        this.field285 = this.field278.field7714;
        if (this.field294 == this.field272 && this.field295 == this.field272 && this.field298 == this.field281 && this.field298 == this.field282 && this.field290 == this.field285 && this.field290 == this.field276) {
            this.field299 = true;
            return;
        }
        this.field299 = false;
        if (!arg0) {
            return;
        }
        int var2 = (this.field295 + this.field272 + this.field294) / 3;
        int var3 = (this.field281 - (-this.field298 - this.field282)) / 3;
        int var4 = (this.field290 + this.field276 + this.field285) / 3;
        if (this.field291 == var2 && this.field287 == var3 && this.field289 == var4) {
            return;
        }
        this.field291 = var2;
        this.field287 = var3;
        this.field289 = var4;
        int var5 = this.field272 - this.field294;
        int var6 = this.field298 - this.field281;
        int var7 = this.field290 - this.field285;
        int var8 = this.field295 - this.field294;
        int var9 = this.field282 - this.field281;
        int var10 = this.field276 - this.field285;
        this.field297 = var6 * var10 - (var7 * var9);
        this.field296 = var5 * var9 - (var6 * var8);
        this.field300 = var7 * var8 - (var5 * var10);
        while (this.field297 > 32767 || this.field300 > 32767 || this.field296 > 32767 || this.field297 < -32767 || this.field300 < -32767 || this.field296 < -32767) {
            this.field296 >>= 0x1;
            this.field300 >>= 0x1;
            this.field297 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field296 * this.field296 + (this.field297 * this.field297 + (this.field300 * this.field300))));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field296 = this.field296 * 32767 / var11;
        this.field300 = this.field300 * 32767 / var11;
        this.field297 = this.field297 * 32767 / var11;
        if (this.field293.field1380 <= 0 && this.field293.field1416 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field296, (double) this.field297) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field300, Math.sqrt((double) (this.field297 * this.field297 + (this.field296 * this.field296)))) * 2607.5945876176133D);
        this.field275 = this.field293.field1380 - this.field293.field1406;
        this.field279 = this.field293.field1416 - this.field293.field1395;
        this.field277 = this.field293.field1406 + var12 - (this.field275 >> 1);
        this.field302 = var13 + this.field293.field1395 - (this.field279 >> 1);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lya;Lqc;Lbq;J)V", line = 335)
    public class21(class38 arg0, class521 arg1, class190 arg2, long arg3) {
        this.field270 = arg2;
        this.field283 = arg3;
        this.field278 = arg1;
        this.field293 = this.field278.method3109((byte) -54);
        if (!arg0.method223() && this.field293.field1442 != -1) {
            this.field293 = class283.method1686((byte) -124, this.field293.field1442);
        }
        this.field301 = new class410();
        this.field273 = (int) ((double) this.field273 + Math.random() * 64.0D);
        this.method131(true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILya;ZIJ)V", line = 121)
    public final void method132(int arg0, class38 arg1, boolean arg2, int arg3, long arg4) {
        field274++;
        if (this.field304) {
            arg2 = false;
        } else if (class359.field5234 < this.field293.field1427) {
            arg2 = false;
        } else if (class493.field7208[class359.field5234] < class507.field7466) {
            arg2 = false;
        } else if (this.field299) {
            arg2 = false;
        } else if (this.field293.field1389 != -1) {
            int var7 = (int) (arg4 - this.field283);
            if (this.field293.field1425 || var7 <= this.field293.field1389) {
                var7 %= this.field293.field1389;
            } else {
                arg2 = false;
            }
            if (!this.field293.field1410 && var7 < this.field293.field1388) {
                arg2 = false;
            }
            if (this.field293.field1410 && var7 >= this.field293.field1388) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field273 += (int) (((double) (this.field293.field1450 - this.field293.field1446) * Math.random() + (double) this.field293.field1446) * (double) arg3);
            if (this.field273 > 63) {
                int var8 = this.field273 >> 6;
                this.field273 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field293.field1380 <= 0 && this.field293.field1416 <= 0) {
                        var10 = this.field300;
                        var11 = this.field297;
                        var12 = this.field296;
                    } else {
                        int var13 = (int) ((double) this.field275 * Math.random()) + this.field277;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class183.field2684[var14];
                        int var16 = class183.field2678[var14];
                        int var17 = (int) (Math.random() * (double) this.field279) + this.field302;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class183.field2684[var18];
                        int var20 = class183.field2678[var18];
                        byte var21 = 15;
                        var11 = var16 * var19 >> var21;
                        var10 = (var20 << 0) * -1;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if ((var22 + var23) > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - (var22 + var23);
                    int var25 = this.field294 * var22 - (-(this.field295 * var24) - (this.field272 * var23)) >> 16;
                    int var26 = this.field282 * var24 + (this.field281 * var22 + (this.field298 * var23)) >> 16;
                    int var27 = this.field290 * var23 + this.field285 * var22 + (this.field276 * var24) >> 16;
                    int var28 = this.field293.field1438 + ((int) ((double) (this.field293.field1403 - this.field293.field1438) * Math.random()));
                    int var29 = this.field293.field1397 + (int) (Math.random() * (double) (this.field293.field1386 - this.field293.field1397));
                    int var30 = this.field293.field1381 + ((int) (Math.random() * (double) (this.field293.field1440 - this.field293.field1381)));
                    int var31;
                    if (this.field293.field1383) {
                        double var32 = Math.random();
                        var31 = (int) ((double) this.field293.field1439 * var32 + (double) this.field293.field1433) << 8 | (int) ((double) this.field293.field1435 * var32 + (double) this.field293.field1418) << 16 | (int) ((double) this.field293.field1419 * var32 + (double) this.field293.field1431) | (int) (Math.random() * (double) this.field293.field1436 + (double) this.field293.field1449) << 24;
                    } else {
                        var31 = (int) ((double) this.field293.field1436 * Math.random() + (double) this.field293.field1449) << 24 | (int) (Math.random() * (double) this.field293.field1419 + (double) this.field293.field1431) | (int) ((double) this.field293.field1418 + (double) this.field293.field1435 * Math.random()) << 16 | (int) ((double) this.field293.field1433 + (double) this.field293.field1439 * Math.random()) << 8;
                    }
                    int var34 = this.field293.field1430;
                    if (!arg1.method223() && !this.field293.field1432) {
                        var34 = -1;
                    }
                    if (class295.field4058 == class266.field3670) {
                        new class114(this, var25, var26, var27, var11, var10, var12, var28, var29, var31, var30, var34, this.field293.field1398, this.field293.field1424);
                    } else {
                        class114 var36 = class527.field7796[class295.field4058];
                        class295.field4058 = class295.field4058 + 1 & 0x3FF;
                        var36.method815(this, var25, var26, var27, var11, var10, var12, var28, var29, var31, var30, var34, this.field293.field1398, this.field293.field1424);
                    }
                }
            }
        }
        this.field292 = 0;
        if (arg0 != 65535) {
            return;
        }
        for (class114 var37 = (class114) this.field301.method2461(arg0 ^ 0xFFFF0068); var37 != null; var37 = (class114) this.field301.method2458(18)) {
            var37.method817(arg4, arg3);
            this.field292++;
        }
        class85.field1260 += this.field292;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)V", line = 287)
    public final void method133(int arg0, long arg1) {
        field271++;
        for (class114 var4 = (class114) this.field301.method2461(-114); var4 != null; var4 = (class114) this.field301.method2458(112)) {
            var4.method816(arg1);
        }
        if (arg0 != 1134647088) {
            this.method131(false);
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V", line = 318)
    public static void method134(int arg0) {
        if (arg0 != -27677) {
            method134(-30);
        }
        field286 = null;
        field303 = null;
        field288 = null;
    }
}
