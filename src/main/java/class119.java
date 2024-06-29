import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class119 extends class389 {

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Z")
    public boolean field1224 = false;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    private int field1223 = 0;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "Lqda;")
    public class103 field1226 = new class103();

    @OriginalMember(owner = "client!co", name = "B", descriptor = "Lqda;")
    private class103 field1235 = new class103();

    @OriginalMember(owner = "client!co", name = "C", descriptor = "Z")
    private boolean field1236 = false;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "Lpd;")
    public class257 field1219;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "Lnda;")
    public class555 field1231;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "J")
    private long field1230;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "Lgw;")
    public class170 field1232;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "Lgt;")
    public class454 field1221;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "Z")
    public static boolean field1229 = false;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "Ldh;")
    public static class320 field1216 = new class320(35, 6);

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "Ldda;")
    public static class381 field1233;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "[Lrr;")
    public static class361[] field1228;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
    public final void method770(int arg0) {
        this.field1226.field1065 = this.field1231.field7956;
        this.field1226.field1074 = this.field1231.field7952;
        this.field1226.field1069 = this.field1231.field7961;
        this.field1226.field1073 = this.field1231.field7946;
        this.field1226.field1076 = this.field1231.field7948;
        field1227++;
        this.field1226.field1068 = this.field1231.field7949;
        this.field1226.field1072 = this.field1231.field7942;
        this.field1226.field1075 = this.field1231.field7958;
        this.field1226.field1067 = this.field1231.field7947;
        int var2 = -92 % ((arg0 + 31) / 44);
        if (this.field1226.field1075 == this.field1226.field1074 && this.field1226.field1076 == this.field1226.field1075 && this.field1226.field1073 == this.field1226.field1065 && this.field1226.field1067 == this.field1226.field1065 && this.field1226.field1072 == this.field1226.field1069 && this.field1226.field1069 == this.field1226.field1068) {
            this.field1236 = true;
        } else if (this.field1236) {
            this.field1235.field1076 = this.field1226.field1076;
            this.field1235.field1069 = this.field1226.field1069;
            this.field1235.field1068 = this.field1226.field1068;
            this.field1235.field1072 = this.field1226.field1072;
            this.field1235.field1074 = this.field1226.field1074;
            this.field1235.field1067 = this.field1226.field1067;
            this.field1236 = false;
            this.field1235.field1075 = this.field1226.field1075;
            this.field1235.field1073 = this.field1226.field1073;
            this.field1235.field1065 = this.field1226.field1065;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IBIII)V")
    public static final void method771(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = -28 / ((-arg1 - 65) / 32);
        field1218++;
        for (int var6 = 0; var6 < class717.field10056; var6++) {
            Rectangle var7 = class452.field6510[var6];
            if (var7.x + var7.width > arg3 && arg3 + arg2 > var7.x && (var7.y + var7.height) > arg4 && arg0 + arg4 > var7.y) {
                class272.field3360[var6] = true;
            }
        }
        class16.method75(arg4, (byte) 77, arg4 + arg0, arg3, arg2 + arg3);
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
    public static final void method772(int arg0) {
        field1220++;
        class454[] var1 = class62.field640;
        synchronized (class62.field640) {
            for (int var2 = arg0; var2 < class62.field640.length; var2++) {
                class62.field640[var2] = new class454();
                class501.field7045[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public static void method773(boolean arg0) {
        if (!arg0) {
            field1216 = null;
        }
        field1233 = null;
        field1228 = null;
        field1216 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZIJLha;B)V")
    public final void method774(boolean arg0, int arg1, long arg2, class58 arg3, byte arg4) {
        if (this.field1224) {
            arg0 = false;
        } else if (this.field1232.field1975 > class518.field7364) {
            arg0 = false;
        } else if (class324.field4144 > class608.field8640[class518.field7364]) {
            arg0 = false;
        } else if (this.field1236) {
            arg0 = false;
        } else if (this.field1232.field1941 != -1) {
            int var7 = (int) (arg2 - this.field1230);
            if (this.field1232.field1937 || var7 <= this.field1232.field1941) {
                var7 %= this.field1232.field1941;
            } else {
                arg0 = false;
            }
            if (!this.field1232.field1912 && var7 < this.field1232.field1956) {
                arg0 = false;
            }
            if (this.field1232.field1912 && this.field1232.field1956 <= var7) {
                arg0 = false;
            }
        }
        field1217++;
        if (arg0) {
            class90.field940++;
            int var8 = (this.field1226.field1075 + this.field1226.field1074 + this.field1226.field1076) / 3;
            int var9 = (this.field1226.field1073 + this.field1226.field1065 + this.field1226.field1067) / 3;
            int var10 = (this.field1226.field1069 + this.field1226.field1068 + this.field1226.field1072) / 3;
            if (this.field1226.field1070 != var8 || this.field1226.field1066 != var9 || this.field1226.field1071 != var10) {
                this.field1226.field1066 = var9;
                this.field1226.field1071 = var10;
                this.field1226.field1070 = var8;
                int var11 = this.field1226.field1075 - this.field1226.field1074;
                int var12 = this.field1226.field1065 - this.field1226.field1073;
                int var13 = this.field1226.field1069 - this.field1226.field1072;
                int var14 = this.field1226.field1076 - this.field1226.field1074;
                int var15 = this.field1226.field1067 - this.field1226.field1073;
                int var16 = this.field1226.field1068 - this.field1226.field1072;
                this.field1240 = var13 * var14 - (var11 * var16);
                this.field1241 = var11 * var15 - (var12 * var14);
                this.field1242 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field1242 <= 32767 && this.field1240 <= 32767 && this.field1241 <= 32767 && this.field1242 >= -32767 && this.field1240 >= -32767 && this.field1241 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field1241 * this.field1241 + this.field1242 * this.field1242 + this.field1240 * this.field1240));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field1241 = this.field1241 * 32767 / var17;
                        this.field1240 = this.field1240 * 32767 / var17;
                        this.field1242 = this.field1242 * 32767 / var17;
                        if (this.field1232.field1954 > 0 || this.field1232.field1981 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field1241, (double) this.field1242) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field1240, Math.sqrt((double) (this.field1242 * this.field1242 + this.field1241 * this.field1241))) * 2607.5945876176133D);
                            this.field1238 = this.field1232.field1954 - this.field1232.field1947;
                            this.field1239 = this.field1232.field1981 - this.field1232.field1972;
                            this.field1243 = var18 + this.field1232.field1947 - (this.field1238 >> 1);
                            this.field1237 = this.field1232.field1972 + var19 - (this.field1239 >> 1);
                        }
                        break;
                    }
                    this.field1241 >>= 0x1;
                    this.field1242 >>= 0x1;
                    this.field1240 >>= 0x1;
                }
            }
            this.field1223 += (int) ((double) arg1 * ((double) this.field1232.field1924 + Math.random() * (double) (this.field1232.field1918 - this.field1232.field1924)));
            if (this.field1223 > 63) {
                int var20 = this.field1223 >> 6;
                this.field1223 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field1232.field1954 <= 0 && this.field1232.field1981 <= 0) {
                        var22 = this.field1242;
                        var23 = this.field1240;
                        var24 = this.field1241;
                    } else {
                        int var25 = (int) ((double) this.field1238 * Math.random()) + this.field1243;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class260.field3230[var26];
                        int var28 = class260.field3229[var26];
                        int var29 = this.field1237 + (int) ((double) this.field1239 * Math.random());
                        int var30 = var29 & 0x1FFF;
                        int var31 = class260.field3230[var30];
                        int var32 = class260.field3229[var30];
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
                    float var36 = 1.0F - var34 - var35;
                    int var37 = (int) ((float) this.field1226.field1076 * var36 + (float) this.field1226.field1075 * var35 + (float) this.field1226.field1074 * var34);
                    int var38 = (int) ((float) this.field1226.field1067 * var36 + (float) this.field1226.field1073 * var34 + (float) this.field1226.field1065 * var35);
                    int var39 = (int) ((float) this.field1226.field1068 * var36 + (float) this.field1226.field1072 * var34 + (float) this.field1226.field1069 * var35);
                    int var40 = (int) ((float) this.field1235.field1076 * var36 + (float) this.field1235.field1075 * var35 + (float) this.field1235.field1074 * var34);
                    int var41 = (int) ((float) this.field1235.field1067 * var36 + (float) this.field1235.field1073 * var34 + (float) this.field1235.field1065 * var35);
                    int var42 = (int) ((float) this.field1235.field1068 * var36 + (float) this.field1235.field1072 * var34 + (float) this.field1235.field1069 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var41 + (double) var44 * Math.random());
                    int var48 = (int) ((double) var42 + Math.random() * (double) var45);
                    int var49 = this.field1232.field1964 + (int) ((double) (this.field1232.field1959 - this.field1232.field1964) * Math.random());
                    int var50 = (int) (Math.random() * (double) (this.field1232.field1948 - this.field1232.field1963)) + this.field1232.field1963;
                    int var51 = (int) ((double) (this.field1232.field1917 - this.field1232.field1968) * Math.random()) + this.field1232.field1968;
                    int var52;
                    if (this.field1232.field1955) {
                        double var53 = Math.random();
                        var52 = (int) (Math.random() * (double) this.field1232.field1979 + (double) this.field1232.field1927) << 24 | (int) ((double) this.field1232.field1911 * var53 + (double) this.field1232.field1969) | (int) ((double) this.field1232.field1934 * var53 + (double) this.field1232.field1958) << 8 | (int) ((double) this.field1232.field1919 * var53 + (double) this.field1232.field1909) << 16;
                    } else {
                        var52 = (int) (Math.random() * (double) this.field1232.field1979 + (double) this.field1232.field1927) << 24 | (int) ((double) this.field1232.field1909 + Math.random() * (double) this.field1232.field1919) << 16 | (int) ((double) this.field1232.field1958 + Math.random() * (double) this.field1232.field1934) << 8 | (int) ((double) this.field1232.field1969 + (double) this.field1232.field1911 * Math.random());
                    }
                    int var55 = this.field1232.field1971;
                    if (!arg3.method420() && !this.field1232.field1920) {
                        var55 = -1;
                    }
                    if (class89.field933 == class676.field9579) {
                        new class554(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field1232.field1944, this.field1232.field1977);
                    } else {
                        class554 var56 = class465.field6672[class676.field9579];
                        class676.field9579 = class676.field9579 + 1 & 0x3FF;
                        var56.method3247(this, var46, var47, var48, var22, var23, var24, var49, var50, var52, var51, var55, this.field1232.field1944, this.field1232.field1977);
                    }
                }
            }
        }
        if (!this.field1226.method715(this.field1235, (byte) 56)) {
            class103 var58 = this.field1235;
            this.field1235 = this.field1226;
            this.field1226 = var58;
            this.field1226.field1073 = this.field1231.field7946;
            this.field1226.field1071 = this.field1235.field1071;
            this.field1226.field1076 = this.field1231.field7948;
            this.field1226.field1070 = this.field1235.field1070;
            this.field1226.field1068 = this.field1231.field7949;
            this.field1226.field1072 = this.field1231.field7942;
            this.field1226.field1075 = this.field1231.field7958;
            this.field1226.field1067 = this.field1231.field7947;
            this.field1226.field1065 = this.field1231.field7956;
            this.field1226.field1074 = this.field1231.field7952;
            this.field1226.field1066 = this.field1235.field1066;
            this.field1226.field1069 = this.field1231.field7961;
        }
        this.field1225 = 0;
        for (class554 var59 = (class554) this.field1221.method2790(117); var59 != null; var59 = (class554) this.field1221.method2794(87)) {
            var59.method3249(arg2, arg1);
            this.field1225++;
        }
        class313.field3890 += this.field1225;
        int var60 = 116 % ((arg4 + 62) / 60);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lha;IJ)V")
    public final void method775(class58 arg0, int arg1, long arg2) {
        for (class554 var5 = (class554) this.field1221.method2790(104); var5 != null; var5 = (class554) this.field1221.method2794(96)) {
            var5.method3246(arg0, arg2);
        }
        field1222++;
        if (arg1 != 1430383297) {
            this.field1219 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lha;Lnda;Lpd;J)V")
    public class119(class58 arg0, class555 arg1, class257 arg2, long arg3) {
        this.field1219 = arg2;
        this.field1231 = arg1;
        this.field1230 = arg3;
        this.field1232 = this.field1231.method3252(true);
        if (!arg0.method420() && this.field1232.field1952 != -1) {
            this.field1232 = class27.method130(this.field1232.field1952, -128);
        }
        this.field1221 = new class454();
        this.field1223 = (int) ((double) this.field1223 + Math.random() * 64.0D);
        this.method770(-103);
        this.field1235.field1067 = this.field1226.field1067;
        this.field1235.field1065 = this.field1226.field1065;
        this.field1235.field1076 = this.field1226.field1076;
        this.field1235.field1074 = this.field1226.field1074;
        this.field1235.field1075 = this.field1226.field1075;
        this.field1235.field1072 = this.field1226.field1072;
        this.field1235.field1068 = this.field1226.field1068;
        this.field1235.field1069 = this.field1226.field1069;
        this.field1235.field1073 = this.field1226.field1073;
    }
}
