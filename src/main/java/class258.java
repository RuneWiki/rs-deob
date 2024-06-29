import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class258 extends class288 {

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    private int field3972 = 0;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Z")
    public boolean field3995 = false;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "Z")
    public boolean field3999 = true;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lgi;")
    public class286 field3977;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "Lui;")
    public class88 field3992;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "Lwc;")
    public class29 field3998;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Lce;")
    public class124 field3981;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "J")
    private long field3996;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field3980 = new String[200];

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lpi;")
    public static class201 field3968 = new class201(64);

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Z")
    public static boolean field4001 = true;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4004 = "purple:";

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    private int field3970;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    private int field3971;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    private int field3978;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    private int field3979;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    private int field3982;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    private int field3983;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    private int field3985;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    private int field3987;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    private int field3988;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "I")
    private int field3989;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    private int field3993;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    private int field3994;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    private int field4002;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3988 = arg3;
        this.field3987 = arg2;
        this.field3979 = arg0;
        this.field3983 = arg7;
        if (arg6 != 1024) {
            this.field3976 = 77;
        }
        this.field3985 = arg1;
        this.field3994 = arg4;
        int var11 = (this.field3983 + this.field3985 + this.field3987) / 3 + this.field3992.field1430;
        this.field3982 = arg9;
        this.field3970 = arg8;
        int var12 = (this.field3988 + this.field3982 + this.field3979) / 3 + this.field3992.field1422;
        field3990++;
        this.field3969 = arg5;
        int var13 = (this.field3994 + this.field3970 + this.field3969) / 3 + this.field3992.field1418;
        if (this.field3976 != var12 || this.field3975 != var13 || this.field3973 != var11) {
            this.field3975 = var13;
            this.field3973 = var11;
            this.field3999 = true;
            this.field3976 = var12;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static final void method1776(boolean arg0) {
        class287.field4602.method1420((byte) 113);
        class269.field4333.method1420((byte) -124);
        if (!arg0) {
            field3980 = null;
        }
        class82.field1314.method1420((byte) -95);
        field4000++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method1777(int arg0, int arg1, String arg2, String arg3) {
        field3974++;
        class194.method1376(arg2, arg1, (byte) 38, (String) null, arg0, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIJZ)V")
    public final void method1778(int arg0, int arg1, int arg2, int arg3, long arg4, boolean arg5) {
        if (this.field3995) {
            arg5 = false;
        } else if (class88.field1413 < this.field3981.field2093) {
            arg5 = false;
        } else if (class88.field1409 > class114.field1889[class88.field1413]) {
            arg5 = false;
        } else if (this.field3988 == this.field3979 && this.field3988 == this.field3982 && this.field3994 == this.field3969 && this.field3970 == this.field3969 && this.field3985 == this.field3983 && this.field3987 == this.field3985) {
            arg5 = false;
        } else if (this.field3981.field2100 != -1) {
            int var8 = (int) (arg4 - this.field3996);
            if (this.field3981.field2114 || this.field3981.field2100 >= var8) {
                var8 %= this.field3981.field2100;
            } else {
                arg5 = false;
            }
            if (!this.field3981.field2103 && var8 < this.field3981.field2059) {
                arg5 = false;
            }
            if (this.field3981.field2103 && this.field3981.field2059 <= var8) {
                arg5 = false;
            }
        }
        field3986++;
        if (arg5) {
            this.field3972 += (int) ((double) arg2 * ((double) this.field3981.field2056 + Math.random() * (double) (this.field3981.field2107 - this.field3981.field2056)));
            if (this.field3972 > 63) {
                int var9 = this.field3972 >> 6;
                this.field3972 &= 0x3F;
                if (this.field3999) {
                    int var10 = this.field3982 - this.field3979;
                    int var11 = this.field3969 - this.field3994;
                    int var12 = this.field3988 - this.field3979;
                    int var13 = this.field3985 - this.field3983;
                    int var14 = this.field3970 - this.field3994;
                    this.field3978 = var12 * var14 - (var10 * var11);
                    int var15 = this.field3987 - this.field3983;
                    this.field4002 = var10 * var13 - var12 * var15;
                    this.field3971 = var11 * var15 - (var13 * var14);
                    while (true) {
                        if (this.field3971 <= 32767 && this.field4002 <= 32767 && this.field3978 <= 32767 && this.field3971 >= -32767 && this.field4002 >= -32767 && this.field3978 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field4002 * this.field4002 + this.field3971 * this.field3971 + (this.field3978 * this.field3978)));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field3971 = this.field3971 * 32767 / var16;
                            this.field4002 = this.field4002 * 32767 / var16;
                            this.field3978 = this.field3978 * 32767 / var16;
                            if (this.field3981.field2072 > 0 || this.field3981.field2116 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field3978, (double) this.field3971) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field4002, Math.sqrt((double) (this.field3978 * this.field3978 + this.field3971 * this.field3971))) * 2047.0D / 6.283185307179586D);
                                int var20 = var18 - this.field3992.field1416;
                                this.field3997 = this.field3981.field2116 - this.field3981.field2094;
                                this.field3984 = this.field3981.field2072 - this.field3981.field2060;
                                this.field3989 = this.field3981.field2060 + var20 - (this.field3984 / 2);
                                this.field3993 = var19 - ((this.field3997 / 2) - this.field3981.field2094);
                            } else if (this.field3992.field1416 != 0) {
                                int var17 = this.field3978 * arg3 + this.field3971 * arg0 >> 16;
                                this.field3978 = this.field3978 * arg0 - (this.field3971 * arg3) >> 16;
                                this.field3971 = var17;
                            }
                            this.field3999 = false;
                            break;
                        }
                        this.field3978 >>= 0x1;
                        this.field4002 >>= 0x1;
                        this.field3971 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field3981.field2072 <= 0 && this.field3981.field2116 <= 0) {
                        var22 = this.field3978;
                        var23 = this.field4002;
                        var24 = this.field3971;
                    } else {
                        int var25 = this.field3989 + ((int) ((double) this.field3984 * Math.random()));
                        int var26 = var25 & 0x7FF;
                        int var27 = class244.field3590[var26] >> 1;
                        int var28 = class244.field3592[var26] >> 1;
                        int var29 = (int) ((double) this.field3997 * Math.random()) + this.field3993;
                        int var30 = var29 & 0x3FF;
                        int var31 = class244.field3590[var30] >> 1;
                        var22 = var27 * var31 >> 15;
                        var24 = var28 * var31 >> 15;
                        int var32 = class244.field3592[var30] >> 1;
                        var23 = var32 * -1;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var33 - var35;
                    int var37 = this.field3979 * var33 + (this.field3988 * var35 + (this.field3982 * var36)) >> 8;
                    int var38 = this.field3994 * var33 + this.field3969 * var35 + (this.field3970 * var36) >> 8;
                    int var39 = this.field3983 * var33 + this.field3987 * var36 + this.field3985 * var35 >> 8;
                    if (this.field3992.field1416 != 0) {
                        int var40 = arg3 * var39 + (arg0 * var37) >> 16;
                        var39 = arg0 * var39 - (arg3 * var37) >> 16;
                        var37 = var40;
                    }
                    int var41 = (int) ((double) (this.field3981.field2065 - this.field3981.field2106) * Math.random()) + this.field3981.field2106;
                    int var44;
                    if (this.field3981.field2064) {
                        double var42 = Math.random();
                        var44 = (int) ((double) this.field3981.field2110 * var42 + (double) this.field3981.field2086) << 24 | (int) ((double) this.field3981.field2101 * var42 + (double) this.field3981.field2095) | (int) ((double) this.field3981.field2063 * var42 + (double) this.field3981.field2071) << 8 | (int) ((double) this.field3981.field2108 * var42 + (double) this.field3981.field2089) << 16;
                    } else {
                        var44 = (int) ((double) this.field3981.field2110 * Math.random() + (double) this.field3981.field2086) << 24 | (int) ((double) this.field3981.field2063 * Math.random() + (double) this.field3981.field2071) << 8 | (int) ((double) this.field3981.field2089 + (double) this.field3981.field2108 * Math.random()) << 16 | (int) (Math.random() * (double) this.field3981.field2101 + (double) this.field3981.field2095);
                    }
                    int var45 = this.field3981.field2091 + ((int) ((double) (this.field3981.field2109 - this.field3981.field2091) * Math.random()));
                    if (class88.field1401 == class88.field1399) {
                        new class198(this, this.field3992.field1422 + var37, this.field3992.field1418 + var38, this.field3992.field1430 + var39, var24, var23, var22, var41, var45, var44);
                    } else {
                        class198 var47 = class88.field1397[class88.field1401];
                        class88.field1401 = class88.field1401 + 1 & 0x3FF;
                        var47.method1400(this, this.field3992.field1422 + var37, this.field3992.field1418 + var38, this.field3992.field1430 + var39, var24, var23, var22, var41, var45, var44);
                    }
                }
            }
        }
        this.field3991 = 0;
        if (arg1 != 2) {
            this.method1778(-32, -47, -33, 120, 76L, true);
        }
        for (class198 var48 = (class198) this.field3998.method182(arg1 + 3); var48 != null; var48 = (class198) this.field3998.method188(10)) {
            var48.method1399(arg4, arg2);
            this.field3991++;
        }
        class88.field1404 += this.field3991;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static void method1779(int arg0) {
        int var1 = -69 % ((60 - arg0) / 34);
        field3980 = null;
        field4004 = null;
        field3968 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lgi;Lui;J)V")
    public class258(class286 arg0, class88 arg1, long arg2) {
        this.field3977 = arg0;
        this.field3992 = arg1;
        this.field3998 = new class29();
        this.field3972 = (int) ((double) this.field3972 + Math.random() * 64.0D);
        this.field3981 = this.field3977.field4583;
        this.field3996 = arg2;
    }
}
