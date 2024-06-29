import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class575 extends class569 {

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "Z")
    public boolean field8023 = false;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    private int field8028 = 0;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "Lhs;")
    public class591 field8017 = new class591();

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "Lhs;")
    private class591 field8029 = new class591();

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "Z")
    private boolean field8031 = false;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "Ltq;")
    public class93 field8025;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "Lhi;")
    public class64 field8013;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "J")
    private long field8018;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "Lce;")
    public class446 field8020;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "Lfca;")
    public class139 field8027;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field8014 = 2;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field8021 = -1;

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
    public static int field8033 = 500;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    public int field8024;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
    private int field8030;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
    private int field8032;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    private int field8034;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    private int field8035;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    private int field8036;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    private int field8037;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    private int field8038;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "[Lf;")
    public static class536[] field8015;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZLr;IJI)V")
    public final void method3170(boolean arg0, class566 arg1, int arg2, long arg3, int arg4) {
        if (this.field8023) {
            arg0 = false;
        } else if (class608.field8541 < this.field8020.field5670) {
            arg0 = false;
        } else if (class583.field8151[class608.field8541] < class321.field4091) {
            arg0 = false;
        } else if (this.field8031) {
            arg0 = false;
        } else if (this.field8020.field5726 != -1) {
            int var7 = (int) (arg3 - this.field8018);
            if (this.field8020.field5675 || this.field8020.field5726 >= var7) {
                var7 %= this.field8020.field5726;
            } else {
                arg0 = false;
            }
            if (!this.field8020.field5733 && var7 < this.field8020.field5679) {
                arg0 = false;
            }
            if (this.field8020.field5733 && var7 >= this.field8020.field5679) {
                arg0 = false;
            }
        }
        field8012++;
        if (arg0) {
            class426.field5342++;
            int var8 = (this.field8017.field8299 + this.field8017.field8307 + this.field8017.field8295) / 3;
            int var9 = (this.field8017.field8298 + this.field8017.field8296 + this.field8017.field8301) / 3;
            int var10 = (this.field8017.field8304 + this.field8017.field8293 + this.field8017.field8306) / 3;
            if (this.field8017.field8292 != var8 || this.field8017.field8308 != var9 || this.field8017.field8300 != var10) {
                this.field8017.field8292 = var8;
                this.field8017.field8308 = var9;
                this.field8017.field8300 = var10;
                int var11 = this.field8017.field8307 - this.field8017.field8299;
                int var12 = this.field8017.field8298 - this.field8017.field8296;
                int var13 = this.field8017.field8304 - this.field8017.field8306;
                int var14 = this.field8017.field8295 - this.field8017.field8299;
                int var15 = this.field8017.field8301 - this.field8017.field8296;
                int var16 = this.field8017.field8293 - this.field8017.field8306;
                this.field8037 = var13 * var14 - (var11 * var16);
                this.field8030 = var11 * var15 - (var12 * var14);
                this.field8035 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field8035 <= 32767 && this.field8037 <= 32767 && this.field8030 <= 32767 && this.field8035 >= -32767 && this.field8037 >= -32767 && this.field8030 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field8035 * this.field8035 - (-(this.field8037 * this.field8037) - this.field8030 * this.field8030)));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field8035 = this.field8035 * 32767 / var17;
                        this.field8030 = this.field8030 * 32767 / var17;
                        this.field8037 = this.field8037 * 32767 / var17;
                        if (this.field8020.field5714 > 0 || this.field8020.field5716 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field8030, (double) this.field8035) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field8037, Math.sqrt((double) (this.field8035 * this.field8035 + (this.field8030 * this.field8030)))) * 2607.5945876176133D);
                            this.field8038 = this.field8020.field5714 - this.field8020.field5662;
                            this.field8032 = this.field8020.field5716 - this.field8020.field5727;
                            this.field8036 = this.field8020.field5662 + var18 - (this.field8038 >> 1);
                            this.field8034 = this.field8020.field5727 + var19 - (this.field8032 >> 1);
                        }
                        break;
                    }
                    this.field8030 >>= 0x1;
                    this.field8035 >>= 0x1;
                    this.field8037 >>= 0x1;
                }
            }
            this.field8028 += (int) ((double) arg2 * ((double) (this.field8020.field5681 - this.field8020.field5728) * Math.random() + (double) this.field8020.field5728));
            if (this.field8028 > 63) {
                int var20 = this.field8028 >> 6;
                this.field8028 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field8020.field5714 <= 0 && this.field8020.field5716 <= 0) {
                        var22 = this.field8037;
                        var23 = this.field8035;
                        var24 = this.field8030;
                    } else {
                        int var25 = (int) ((double) this.field8038 * Math.random()) + this.field8036;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class453.field5810[var26];
                        int var28 = class453.field5811[var26];
                        int var29 = this.field8034 + (int) (Math.random() * (double) this.field8032);
                        int var30 = var29 & 0x1FFF;
                        int var31 = class453.field5810[var30];
                        int var32 = class453.field5811[var30];
                        byte var33 = 13;
                        var23 = var28 * var31 >> var33;
                        var22 = (var32 << 1) * -1;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var34 - var35;
                    int var37 = (int) ((float) this.field8017.field8295 * var36 + (float) this.field8017.field8307 * var35 + (float) this.field8017.field8299 * var34);
                    int var38 = (int) ((float) this.field8017.field8301 * var36 + (float) this.field8017.field8298 * var35 + (float) this.field8017.field8296 * var34);
                    int var39 = (int) ((float) this.field8017.field8293 * var36 + (float) this.field8017.field8306 * var34 + (float) this.field8017.field8304 * var35);
                    int var40 = (int) ((float) this.field8029.field8295 * var36 + (float) this.field8029.field8307 * var35 + (float) this.field8029.field8299 * var34);
                    int var41 = (int) ((float) this.field8029.field8301 * var36 + (float) this.field8029.field8298 * var35 + (float) this.field8029.field8296 * var34);
                    int var42 = (int) ((float) this.field8029.field8293 * var36 + (float) this.field8029.field8306 * var34 + (float) this.field8029.field8304 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + (double) var43 * Math.random());
                    int var47 = (int) ((double) var44 * Math.random() + (double) var41);
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = this.field8020.field5690 + (int) ((double) (this.field8020.field5683 - this.field8020.field5690) * Math.random());
                    int var50 = (int) ((double) (this.field8020.field5707 - this.field8020.field5691) * Math.random()) + this.field8020.field5691;
                    int var51 = this.field8020.field5689 + (int) (Math.random() * (double) (this.field8020.field5669 - this.field8020.field5689));
                    int var54;
                    if (this.field8020.field5699) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field8020.field5688 * var52 + (double) this.field8020.field5694) | (int) ((double) this.field8020.field5708 * var52 + (double) this.field8020.field5682) << 16 | (int) ((double) this.field8020.field5717 * var52 + (double) this.field8020.field5711) << 8 | (int) (Math.random() * (double) this.field8020.field5722 + (double) this.field8020.field5701) << 24;
                    } else {
                        var54 = (int) ((double) this.field8020.field5722 * Math.random() + (double) this.field8020.field5701) << 24 | (int) ((double) this.field8020.field5688 * Math.random() + (double) this.field8020.field5694) | (int) ((double) this.field8020.field5682 + Math.random() * (double) this.field8020.field5708) << 16 | (int) ((double) this.field8020.field5711 + (double) this.field8020.field5717 * Math.random()) << 8;
                    }
                    int var55 = this.field8020.field5705;
                    if (!arg1.method996() && !this.field8020.field5720) {
                        var55 = -1;
                    }
                    if (class642.field9044 == class11.field195) {
                        new class202(this, var46, var47, var48, var23, var22, var24, var49, var50, var54, var51, var55, this.field8020.field5696, this.field8020.field5724);
                    } else {
                        class202 var57 = class508.field6875[class642.field9044];
                        class642.field9044 = class642.field9044 + 1 & 0x3FF;
                        var57.method1220(this, var46, var47, var48, var23, var22, var24, var49, var50, var54, var51, var55, this.field8020.field5696, this.field8020.field5724);
                    }
                }
            }
        }
        if (!this.field8017.method3249(this.field8029, -128)) {
            class591 var58 = this.field8029;
            this.field8029 = this.field8017;
            this.field8017 = var58;
            this.field8017.field8306 = this.field8013.field870;
            this.field8017.field8307 = this.field8013.field860;
            this.field8017.field8296 = this.field8013.field859;
            this.field8017.field8295 = this.field8013.field878;
            this.field8017.field8299 = this.field8013.field868;
            this.field8017.field8301 = this.field8013.field873;
            this.field8017.field8298 = this.field8013.field861;
            this.field8017.field8293 = this.field8013.field872;
            this.field8017.field8304 = this.field8013.field871;
        }
        this.field8024 = 0;
        int var59 = 17 / ((7 - arg4) / 36);
        for (class202 var60 = (class202) this.field8027.method802((byte) 119); var60 != null; var60 = (class202) this.field8027.method800((byte) -106)) {
            var60.method1217(arg3, arg2);
            this.field8024++;
        }
        class260.field3215 += this.field8024;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILr;J)V")
    public final void method3171(int arg0, class566 arg1, long arg2) {
        int var5 = 84 / ((-arg0 - 45) / 47);
        for (class202 var6 = (class202) this.field8027.method802((byte) 75); var6 != null; var6 = (class202) this.field8027.method800((byte) -106)) {
            var6.method1216(arg1, arg2);
        }
        field8019++;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public final void method3172(int arg0) {
        field8026++;
        this.field8017.field8304 = this.field8013.field871;
        this.field8017.field8293 = this.field8013.field872;
        this.field8017.field8296 = this.field8013.field859;
        this.field8017.field8307 = this.field8013.field860;
        this.field8017.field8306 = this.field8013.field870;
        if (arg0 != -32768) {
            this.method3171(-124, null, 21L);
        }
        this.field8017.field8299 = this.field8013.field868;
        this.field8017.field8301 = this.field8013.field873;
        this.field8017.field8295 = this.field8013.field878;
        this.field8017.field8298 = this.field8013.field861;
        if (this.field8017.field8307 == this.field8017.field8299 && this.field8017.field8307 == this.field8017.field8295 && this.field8017.field8298 == this.field8017.field8296 && this.field8017.field8301 == this.field8017.field8298 && this.field8017.field8306 == this.field8017.field8304 && this.field8017.field8304 == this.field8017.field8293) {
            this.field8031 = true;
        } else if (this.field8031) {
            this.field8029.field8296 = this.field8017.field8296;
            this.field8029.field8295 = this.field8017.field8295;
            this.field8029.field8298 = this.field8017.field8298;
            this.field8029.field8304 = this.field8017.field8304;
            this.field8029.field8293 = this.field8017.field8293;
            this.field8029.field8299 = this.field8017.field8299;
            this.field8029.field8307 = this.field8017.field8307;
            this.field8031 = false;
            this.field8029.field8301 = this.field8017.field8301;
            this.field8029.field8306 = this.field8017.field8306;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([[[Lvf;I)V")
    public static final void method3173(class75[][][] arg0, int arg1) {
        if (arg1 != -6429) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class75[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class75 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1031 instanceof class339) {
                            ((class339) var6.field1031).method81(false);
                        }
                        if (var6.field1022 instanceof class339) {
                            ((class339) var6.field1022).method81(false);
                        }
                        if (var6.field1034 instanceof class339) {
                            ((class339) var6.field1034).method81(false);
                        }
                        if (var6.field1030 instanceof class339) {
                            ((class339) var6.field1030).method81(false);
                        }
                        if (var6.field1026 instanceof class339) {
                            ((class339) var6.field1026).method81(false);
                        }
                        for (class138 var7 = var6.field1024; var7 != null; var7 = var7.field1789) {
                            class172 var8 = var7.field1786;
                            if (var8 instanceof class339) {
                                ((class339) var8).method81(false);
                            }
                        }
                    }
                }
            }
        }
        field8016++;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public static void method3174(byte arg0) {
        if (arg0 != 7) {
            method3174((byte) -44);
        }
        field8015 = null;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lr;Lhi;Ltq;J)V")
    public class575(class566 arg0, class64 arg1, class93 arg2, long arg3) {
        this.field8025 = arg2;
        this.field8013 = arg1;
        this.field8018 = arg3;
        this.field8020 = this.field8013.method384(true);
        if (!arg0.method996() && this.field8020.field5712 != -1) {
            this.field8020 = class429.method2269((byte) 75, this.field8020.field5712);
        }
        this.field8027 = new class139();
        this.field8028 = (int) ((double) this.field8028 + Math.random() * 64.0D);
        this.method3172(-32768);
        this.field8029.field8301 = this.field8017.field8301;
        this.field8029.field8293 = this.field8017.field8293;
        this.field8029.field8298 = this.field8017.field8298;
        this.field8029.field8296 = this.field8017.field8296;
        this.field8029.field8299 = this.field8017.field8299;
        this.field8029.field8307 = this.field8017.field8307;
        this.field8029.field8306 = this.field8017.field8306;
        this.field8029.field8304 = this.field8017.field8304;
        this.field8029.field8295 = this.field8017.field8295;
    }
}
