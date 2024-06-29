import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class375 extends class112 {

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "Z")
    public boolean field4700 = false;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    private int field4715 = 0;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "Liq;")
    public class633 field4707 = new class633();

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "Liq;")
    private class633 field4716 = new class633();

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "Z")
    private boolean field4720 = false;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "Lmk;")
    public class62 field4714;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "Lsia;")
    public class766 field4713;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "J")
    private long field4710;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "Lat;")
    public class398 field4711;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "Lml;")
    public class408 field4705;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "[I")
    public static int[] field4709 = new int[2];

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "[[B")
    public static byte[][] field4703 = new byte[250][];

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "[I")
    public static int[] field4701 = new int[4];

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4702 = new String[200];

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public int field4699;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    private int field4717;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    private int field4718;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    private int field4719;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    private int field4721;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    private int field4722;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
    private int field4723;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    private int field4724;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lha;JB)V", line = 10)
    public final void method2184(class66 arg0, long arg1, byte arg2) {
        field4712++;
        for (class360 var5 = (class360) this.field4705.method2447(-119); var5 != null; var5 = (class360) this.field4705.method2439(-105)) {
            var5.method2103(arg0, arg1);
        }
        int var6 = 72 % ((-arg2 - 33) / 53);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 32)
    public static void method2185(int arg0) {
        field4703 = null;
        field4701 = null;
        field4702 = null;
        field4709 = null;
        if (arg0 != -2660) {
            field4701 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZILha;J)V", line = 45)
    public final void method2186(int arg0, boolean arg1, int arg2, class66 arg3, long arg4) {
        field4706++;
        if (this.field4700) {
            arg1 = false;
        } else if (this.field4711.field5179 > class538.field7580) {
            arg1 = false;
        } else if (class453.field6386 > class340.field4271[class538.field7580]) {
            arg1 = false;
        } else if (this.field4720) {
            arg1 = false;
        } else if (this.field4711.field5157 != -1) {
            int var7 = (int) (arg4 - this.field4710);
            if (this.field4711.field5214 || var7 <= this.field4711.field5157) {
                var7 %= this.field4711.field5157;
            } else {
                arg1 = false;
            }
            if (!this.field4711.field5215 && var7 < this.field4711.field5191) {
                arg1 = false;
            }
            if (this.field4711.field5215 && var7 >= this.field4711.field5191) {
                arg1 = false;
            }
        }
        if (arg1) {
            class482.field6732++;
            int var8 = (this.field4707.field8645 + this.field4707.field8635 + this.field4707.field8639) / 3;
            int var9 = (this.field4707.field8650 + this.field4707.field8646 + this.field4707.field8640) / 3;
            int var10 = (this.field4707.field8643 + this.field4707.field8637 + this.field4707.field8647) / 3;
            if (this.field4707.field8648 != var8 || this.field4707.field8642 != var9 || this.field4707.field8651 != var10) {
                this.field4707.field8651 = var10;
                this.field4707.field8648 = var8;
                this.field4707.field8642 = var9;
                int var11 = this.field4707.field8635 - this.field4707.field8645;
                int var12 = this.field4707.field8646 - this.field4707.field8650;
                int var13 = this.field4707.field8643 - this.field4707.field8637;
                int var14 = this.field4707.field8639 - this.field4707.field8645;
                int var15 = this.field4707.field8640 - this.field4707.field8650;
                int var16 = this.field4707.field8647 - this.field4707.field8637;
                this.field4718 = var13 * var14 - var11 * var16;
                this.field4721 = var11 * var15 - (var12 * var14);
                this.field4717 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field4717 <= 32767 && this.field4718 <= 32767 && this.field4721 <= 32767 && this.field4717 >= -32767 && this.field4718 >= -32767 && this.field4721 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field4721 * this.field4721 + this.field4718 * this.field4718 + this.field4717 * this.field4717));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field4721 = this.field4721 * 32767 / var17;
                        this.field4717 = this.field4717 * 32767 / var17;
                        this.field4718 = this.field4718 * 32767 / var17;
                        if (this.field4711.field5182 > 0 || this.field4711.field5203 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field4721, (double) this.field4717) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field4718, Math.sqrt((double) (this.field4721 * this.field4721 + this.field4717 * this.field4717))) * 2607.5945876176133D);
                            this.field4724 = this.field4711.field5182 - this.field4711.field5208;
                            this.field4723 = this.field4711.field5203 - this.field4711.field5201;
                            this.field4722 = var18 + this.field4711.field5208 - (this.field4724 >> 1);
                            this.field4719 = this.field4711.field5201 + var19 - (this.field4723 >> 1);
                        }
                        break;
                    }
                    this.field4717 >>= 0x1;
                    this.field4718 >>= 0x1;
                    this.field4721 >>= 0x1;
                }
            }
            this.field4715 += (int) (((double) this.field4711.field5181 + Math.random() * (double) (this.field4711.field5149 - this.field4711.field5181)) * (double) arg0);
            if (this.field4715 > 63) {
                int var20 = this.field4715 >> 6;
                this.field4715 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field4711.field5182 <= 0 && this.field4711.field5203 <= 0) {
                        var22 = this.field4717;
                        var23 = this.field4718;
                        var24 = this.field4721;
                    } else {
                        int var25 = this.field4722 + (int) (Math.random() * (double) this.field4724);
                        int var26 = var25 & 0x3FFF;
                        int var27 = class789.field10868[var26];
                        int var28 = class789.field10864[var26];
                        int var29 = (int) (Math.random() * (double) this.field4723) + this.field4719;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class789.field10868[var30];
                        int var32 = class789.field10864[var30];
                        byte var33 = 13;
                        var22 = var28 * var31 >> var33;
                        var23 = (var32 << 1) * -1;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var35 = 1.0F - var35;
                        var34 = 1.0F - var34;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field4707.field8639 * var36 + (float) this.field4707.field8645 * var34 + (float) this.field4707.field8635 * var35);
                    int var38 = (int) ((float) this.field4707.field8640 * var36 + (float) this.field4707.field8650 * var34 + (float) this.field4707.field8646 * var35);
                    int var39 = (int) ((float) this.field4707.field8647 * var36 + (float) this.field4707.field8643 * var35 + (float) this.field4707.field8637 * var34);
                    int var40 = (int) ((float) this.field4716.field8639 * var36 + (float) this.field4716.field8645 * var34 + (float) this.field4716.field8635 * var35);
                    int var41 = (int) ((float) this.field4716.field8640 * var36 + (float) this.field4716.field8650 * var34 + (float) this.field4716.field8646 * var35);
                    int var42 = (int) ((float) this.field4716.field8647 * var36 + (float) this.field4716.field8643 * var35 + (float) this.field4716.field8637 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + Math.random() * (double) var43);
                    int var47 = (int) ((double) var44 * Math.random() + (double) var41);
                    int var48 = (int) ((double) var45 * Math.random() + (double) var42);
                    int var49 = (int) (Math.random() * (double) (this.field4711.field5147 - this.field4711.field5180)) + this.field4711.field5180;
                    int var50 = this.field4711.field5152 + (int) ((double) (this.field4711.field5159 - this.field4711.field5152) * Math.random());
                    int var51 = (int) (Math.random() * (double) (this.field4711.field5161 - this.field4711.field5196)) + this.field4711.field5196;
                    int var54;
                    if (this.field4711.field5156) {
                        double var52 = Math.random();
                        var54 = (int) (Math.random() * (double) this.field4711.field5176 + (double) this.field4711.field5197) << 24 | (int) ((double) this.field4711.field5210 * var52 + (double) this.field4711.field5174) | (int) ((double) this.field4711.field5211 * var52 + (double) this.field4711.field5190) << 8 | (int) ((double) this.field4711.field5170 * var52 + (double) this.field4711.field5202) << 16;
                    } else {
                        var54 = (int) ((double) this.field4711.field5211 * Math.random() + (double) this.field4711.field5190) << 8 | (int) ((double) this.field4711.field5170 * Math.random() + (double) this.field4711.field5202) << 16 | (int) (Math.random() * (double) this.field4711.field5210 + (double) this.field4711.field5174) | (int) ((double) this.field4711.field5197 + Math.random() * (double) this.field4711.field5176) << 24;
                    }
                    int var55 = this.field4711.field5178;
                    if (!arg3.method601() && !this.field4711.field5162) {
                        var55 = -1;
                    }
                    if (class321.field3974 == class196.field2342) {
                        new class360(this, var46, var47, var48, var22, var23, var24, var49, var50, var54, var51, var55, this.field4711.field5146, this.field4711.field5173);
                    } else {
                        class360 var56 = class116.field1474[class321.field3974];
                        class321.field3974 = class321.field3974 + 1 & 0x3FF;
                        var56.method2106(this, var46, var47, var48, var22, var23, var24, var49, var50, var54, var51, var55, this.field4711.field5146, this.field4711.field5173);
                    }
                }
            }
        }
        if (!this.field4707.method3573((byte) -102, this.field4716)) {
            class633 var58 = this.field4716;
            this.field4716 = this.field4707;
            this.field4707 = var58;
            this.field4707.field8648 = this.field4716.field8648;
            this.field4707.field8635 = this.field4714.field833;
            this.field4707.field8643 = this.field4714.field827;
            this.field4707.field8639 = this.field4714.field828;
            this.field4707.field8650 = this.field4714.field849;
            this.field4707.field8647 = this.field4714.field848;
            this.field4707.field8645 = this.field4714.field834;
            this.field4707.field8646 = this.field4714.field835;
            this.field4707.field8637 = this.field4714.field840;
            this.field4707.field8640 = this.field4714.field832;
            this.field4707.field8642 = this.field4716.field8642;
            this.field4707.field8651 = this.field4716.field8651;
        }
        this.field4699 = 0;
        for (class360 var59 = (class360) this.field4705.method2447(-88); var59 != null; var59 = (class360) this.field4705.method2439(-88)) {
            var59.method2104(arg4, arg0);
            this.field4699++;
        }
        if (arg2 <= 25) {
            method2188(null, true, false);
        }
        class254.field2962 += this.field4699;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lha;Lmk;Lsia;J)V", line = 429)
    public class375(class66 arg0, class62 arg1, class766 arg2, long arg3) {
        this.field4714 = arg1;
        this.field4713 = arg2;
        this.field4710 = arg3;
        this.field4711 = this.field4714.method533((byte) 69);
        if (!arg0.method601() && this.field4711.field5151 != -1) {
            this.field4711 = class209.method1322((byte) 123, this.field4711.field5151);
        }
        this.field4705 = new class408();
        this.field4715 = (int) ((double) this.field4715 + Math.random() * 64.0D);
        this.method2187(63);
        this.field4716.field8646 = this.field4707.field8646;
        this.field4716.field8643 = this.field4707.field8643;
        this.field4716.field8650 = this.field4707.field8650;
        this.field4716.field8639 = this.field4707.field8639;
        this.field4716.field8647 = this.field4707.field8647;
        this.field4716.field8640 = this.field4707.field8640;
        this.field4716.field8645 = this.field4707.field8645;
        this.field4716.field8635 = this.field4707.field8635;
        this.field4716.field8637 = this.field4707.field8637;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V", line = 316)
    public final void method2187(int arg0) {
        this.field4707.field8637 = this.field4714.field840;
        this.field4707.field8639 = this.field4714.field828;
        this.field4707.field8645 = this.field4714.field834;
        this.field4707.field8646 = this.field4714.field835;
        if (arg0 != 63) {
            return;
        }
        this.field4707.field8643 = this.field4714.field827;
        field4704++;
        this.field4707.field8640 = this.field4714.field832;
        this.field4707.field8635 = this.field4714.field833;
        this.field4707.field8650 = this.field4714.field849;
        this.field4707.field8647 = this.field4714.field848;
        if (this.field4707.field8645 == this.field4707.field8635 && this.field4707.field8639 == this.field4707.field8635 && this.field4707.field8650 == this.field4707.field8646 && this.field4707.field8646 == this.field4707.field8640 && this.field4707.field8643 == this.field4707.field8637 && this.field4707.field8647 == this.field4707.field8643) {
            this.field4720 = true;
        } else if (this.field4720) {
            this.field4716.field8635 = this.field4707.field8635;
            this.field4716.field8646 = this.field4707.field8646;
            this.field4716.field8637 = this.field4707.field8637;
            this.field4716.field8643 = this.field4707.field8643;
            this.field4716.field8645 = this.field4707.field8645;
            this.field4716.field8639 = this.field4707.field8639;
            this.field4716.field8640 = this.field4707.field8640;
            this.field4720 = false;
            this.field4716.field8647 = this.field4707.field8647;
            this.field4716.field8650 = this.field4707.field8650;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lgda;ZZ)V", line = 368)
    public static final void method2188(class61 arg0, boolean arg1, boolean arg2) {
        arg0.field810 = arg2;
        if (!class309.field3847) {
            class518.method3107(arg0, class237.field2796);
        } else if (arg1) {
            class468.field6545[class468.field6545.length - 1].method2306(arg0, (byte) 56);
        } else {
            int var3 = class299.method1745(arg0.field817);
            int var4 = class212.field2508[2] * arg0.method508(-4798) / arg0.field816;
            int var5 = class299.method1745(arg0.field817 - var4);
            int var6 = class299.method1745(arg0.field817 + var4);
            if (var5 == var6) {
                class468.field6545[var3].method2306(arg0, (byte) 88);
            } else if (var6 - var5 == 1) {
                class468.field6545[class46.field612 + var5].method2306(arg0, (byte) -128);
            } else {
                class468.field6545[class468.field6545.length - 1].method2306(arg0, (byte) -86);
            }
        }
    }
}
