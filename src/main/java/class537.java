import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class537 extends class272 {

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "Z")
    public boolean field6766 = false;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    private int field6767 = 0;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Law;")
    public class71 field6760 = new class71();

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Law;")
    private class71 field6771 = new class71();

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "Z")
    private boolean field6775 = false;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Ll;")
    public class18 field6764;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "J")
    private long field6763;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "Let;")
    public class556 field6762;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Lrba;")
    public class401 field6757;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lca;")
    public class285 field6768;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field6769 = 0;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field6770 = -1;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Lcga;")
    public static class449 field6756 = new class449(43, 7);

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public int field6755;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    private int field6772;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    private int field6773;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    private int field6774;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    private int field6776;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    private int field6777;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    private int field6778;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    private int field6779;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(JZLoa;)V")
    public final void method2890(long arg0, boolean arg1, class650 arg2) {
        if (!arg1) {
            for (class137 var5 = (class137) this.field6768.method1715((byte) 126); var5 != null; var5 = (class137) this.field6768.method1712((byte) 126)) {
                var5.method874(arg2, arg0);
            }
            field6761++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILoa;IZJ)V")
    public final void method2891(int arg0, class650 arg1, int arg2, boolean arg3, long arg4) {
        if (this.field6766) {
            arg3 = false;
        } else if (this.field6757.field5128 > class477.field5949) {
            arg3 = false;
        } else if (field6769 > class510.field6380[class477.field5949]) {
            arg3 = false;
        } else if (this.field6775) {
            arg3 = false;
        } else if (this.field6757.field5125 != -1) {
            int var7 = (int) (arg4 - this.field6763);
            if (this.field6757.field5096 || var7 <= this.field6757.field5125) {
                var7 %= this.field6757.field5125;
            } else {
                arg3 = false;
            }
            if (!this.field6757.field5084 && var7 < this.field6757.field5117) {
                arg3 = false;
            }
            if (this.field6757.field5084 && var7 >= this.field6757.field5117) {
                arg3 = false;
            }
        }
        field6765++;
        if (arg3) {
            class72.field929++;
            int var8 = (this.field6760.field918 + this.field6760.field911 + this.field6760.field906) / 3;
            int var9 = (this.field6760.field924 + this.field6760.field921 + this.field6760.field913) / 3;
            int var10 = (this.field6760.field915 + this.field6760.field909 + this.field6760.field908) / 3;
            if (this.field6760.field910 != var8 || this.field6760.field923 != var9 || this.field6760.field920 != var10) {
                this.field6760.field910 = var8;
                this.field6760.field923 = var9;
                this.field6760.field920 = var10;
                int var11 = this.field6760.field911 - this.field6760.field906;
                int var12 = this.field6760.field924 - this.field6760.field913;
                int var13 = this.field6760.field908 - this.field6760.field915;
                int var14 = this.field6760.field918 - this.field6760.field906;
                int var15 = this.field6760.field921 - this.field6760.field913;
                int var16 = this.field6760.field909 - this.field6760.field915;
                this.field6779 = var13 * var14 - (var11 * var16);
                this.field6774 = var12 * var16 - (var13 * var15);
                this.field6773 = var11 * var15 - var12 * var14;
                while (true) {
                    if (this.field6774 <= 32767 && this.field6779 <= 32767 && this.field6773 <= 32767 && this.field6774 >= -32767 && this.field6779 >= -32767 && this.field6773 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field6779 * this.field6779 + (this.field6774 * this.field6774 + (this.field6773 * this.field6773))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field6779 = this.field6779 * 32767 / var17;
                        this.field6773 = this.field6773 * 32767 / var17;
                        this.field6774 = this.field6774 * 32767 / var17;
                        if (this.field6757.field5100 > 0 || this.field6757.field5118 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field6773, (double) this.field6774) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field6779, Math.sqrt((double) (this.field6774 * this.field6774 + this.field6773 * this.field6773))) * 2607.5945876176133D);
                            this.field6772 = this.field6757.field5100 - this.field6757.field5139;
                            this.field6777 = this.field6757.field5139 + var18 - (this.field6772 >> 1);
                            this.field6778 = this.field6757.field5118 - this.field6757.field5127;
                            this.field6776 = this.field6757.field5127 + var19 - (this.field6778 >> 1);
                        }
                        break;
                    }
                    this.field6773 >>= 0x1;
                    this.field6774 >>= 0x1;
                    this.field6779 >>= 0x1;
                }
            }
            this.field6767 += (int) (((double) this.field6757.field5083 + Math.random() * (double) (this.field6757.field5122 - this.field6757.field5083)) * (double) arg2);
            if (this.field6767 > 63) {
                int var20 = this.field6767 >> 6;
                this.field6767 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field6757.field5100 <= 0 && this.field6757.field5118 <= 0) {
                        var22 = this.field6774;
                        var23 = this.field6773;
                        var24 = this.field6779;
                    } else {
                        int var25 = this.field6777 + (int) (Math.random() * (double) this.field6772);
                        int var26 = var25 & 0x3FFF;
                        int var27 = class243.field3129[var26];
                        int var28 = class243.field3128[var26];
                        int var29 = this.field6776 + ((int) (Math.random() * (double) this.field6778));
                        int var30 = var29 & 0x1FFF;
                        int var31 = class243.field3129[var30];
                        int var32 = class243.field3128[var30];
                        byte var33 = 13;
                        var22 = var28 * var31 >> var33;
                        var24 = (var32 << 1) * -1;
                        var23 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var34 - var35;
                    int var37 = (int) ((float) this.field6760.field918 * var36 + (float) this.field6760.field911 * var35 + (float) this.field6760.field906 * var34);
                    int var38 = (int) ((float) this.field6760.field921 * var36 + (float) this.field6760.field924 * var35 + (float) this.field6760.field913 * var34);
                    int var39 = (int) ((float) this.field6760.field909 * var36 + (float) this.field6760.field915 * var34 + (float) this.field6760.field908 * var35);
                    int var40 = (int) ((float) this.field6771.field918 * var36 + (float) this.field6771.field911 * var35 + (float) this.field6771.field906 * var34);
                    int var41 = (int) ((float) this.field6771.field921 * var36 + (float) this.field6771.field924 * var35 + (float) this.field6771.field913 * var34);
                    int var42 = (int) ((float) this.field6771.field909 * var36 + (float) this.field6771.field915 * var34 + (float) this.field6771.field908 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) (Math.random() * (double) var43 + (double) var40);
                    int var47 = (int) ((double) var41 + Math.random() * (double) var44);
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = (int) ((double) (this.field6757.field5141 - this.field6757.field5093) * Math.random()) + this.field6757.field5093;
                    int var50 = (int) (Math.random() * (double) (this.field6757.field5091 - this.field6757.field5126)) + this.field6757.field5126;
                    int var51 = this.field6757.field5109 + ((int) ((double) (this.field6757.field5121 - this.field6757.field5109) * Math.random()));
                    int var54;
                    if (this.field6757.field5148) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field6757.field5136 * var52 + (double) this.field6757.field5099) << 16 | (int) ((double) this.field6757.field5113 * var52 + (double) this.field6757.field5145) << 8 | (int) ((double) this.field6757.field5108 * var52 + (double) this.field6757.field5142) | (int) (Math.random() * (double) this.field6757.field5146 + (double) this.field6757.field5095) << 24;
                    } else {
                        var54 = (int) ((double) this.field6757.field5145 + Math.random() * (double) this.field6757.field5113) << 8 | (int) ((double) this.field6757.field5099 + (double) this.field6757.field5136 * Math.random()) << 16 | (int) ((double) this.field6757.field5142 + Math.random() * (double) this.field6757.field5108) | (int) ((double) this.field6757.field5095 + Math.random() * (double) this.field6757.field5146) << 24;
                    }
                    int var55 = this.field6757.field5103;
                    if (!arg1.method492() && !this.field6757.field5088) {
                        var55 = -1;
                    }
                    if (class356.field4591 == class241.field3114) {
                        new class137(this, var46, var47, var48, var22, var24, var23, var49, var50, var54, var51, var55, this.field6757.field5094, this.field6757.field5081);
                    } else {
                        class137 var56 = class710.field9931[class241.field3114];
                        class241.field3114 = class241.field3114 + 1 & 0x3FF;
                        var56.method877(this, var46, var47, var48, var22, var24, var23, var49, var50, var54, var51, var55, this.field6757.field5094, this.field6757.field5081);
                    }
                }
            }
        }
        if (!this.field6760.method559(this.field6771, 4)) {
            class71 var58 = this.field6771;
            this.field6771 = this.field6760;
            this.field6760 = var58;
            this.field6760.field908 = this.field6762.field6957;
            this.field6760.field921 = this.field6762.field6952;
            this.field6760.field915 = this.field6762.field6960;
            this.field6760.field911 = this.field6762.field6944;
            this.field6760.field918 = this.field6762.field6945;
            this.field6760.field913 = this.field6762.field6958;
            this.field6760.field924 = this.field6762.field6947;
            this.field6760.field909 = this.field6762.field6964;
            this.field6760.field906 = this.field6762.field6943;
        }
        this.field6755 = 0;
        for (class137 var59 = (class137) this.field6768.method1715((byte) 124); var59 != null; var59 = (class137) this.field6768.method1712((byte) -23)) {
            var59.method875(arg4, arg2);
            this.field6755++;
        }
        if (arg0 != 1) {
            this.field6778 = -115;
        }
        class561.field7018 += this.field6755;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public final void method2892(int arg0) {
        this.field6760.field924 = this.field6762.field6947;
        this.field6760.field909 = this.field6762.field6964;
        this.field6760.field915 = this.field6762.field6960;
        this.field6760.field906 = this.field6762.field6943;
        this.field6760.field908 = this.field6762.field6957;
        this.field6760.field913 = this.field6762.field6958;
        this.field6760.field911 = this.field6762.field6944;
        this.field6760.field918 = this.field6762.field6945;
        field6758++;
        this.field6760.field921 = this.field6762.field6952;
        if (arg0 != 0) {
            this.field6763 = -58L;
        }
        if (this.field6760.field911 == this.field6760.field906 && this.field6760.field918 == this.field6760.field911 && this.field6760.field924 == this.field6760.field913 && this.field6760.field924 == this.field6760.field921 && this.field6760.field915 == this.field6760.field908 && this.field6760.field909 == this.field6760.field908) {
            this.field6775 = true;
        } else if (this.field6775) {
            this.field6771.field913 = this.field6760.field913;
            this.field6771.field906 = this.field6760.field906;
            this.field6775 = false;
            this.field6771.field924 = this.field6760.field924;
            this.field6771.field911 = this.field6760.field911;
            this.field6771.field921 = this.field6760.field921;
            this.field6771.field909 = this.field6760.field909;
            this.field6771.field918 = this.field6760.field918;
            this.field6771.field915 = this.field6760.field915;
            this.field6771.field908 = this.field6760.field908;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public static void method2893(int arg0) {
        if (arg0 > -95) {
            field6769 = -5;
        }
        field6756 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Loa;Let;Ll;J)V")
    public class537(class650 arg0, class556 arg1, class18 arg2, long arg3) {
        this.field6764 = arg2;
        this.field6763 = arg3;
        this.field6762 = arg1;
        this.field6757 = this.field6762.method2960(-92);
        if (!arg0.method492() && this.field6757.field5110 != -1) {
            this.field6757 = class72.method568(-67, this.field6757.field5110);
        }
        this.field6768 = new class285();
        this.field6767 = (int) ((double) this.field6767 + Math.random() * 64.0D);
        this.method2892(0);
        this.field6771.field924 = this.field6760.field924;
        this.field6771.field913 = this.field6760.field913;
        this.field6771.field915 = this.field6760.field915;
        this.field6771.field918 = this.field6760.field918;
        this.field6771.field909 = this.field6760.field909;
        this.field6771.field908 = this.field6760.field908;
        this.field6771.field921 = this.field6760.field921;
        this.field6771.field906 = this.field6760.field906;
        this.field6771.field911 = this.field6760.field911;
    }
}
