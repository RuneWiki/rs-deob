import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class79 {

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[[I")
    private int[][] field1109;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[Lwm;")
    public static class152[] field1104 = new class152[8];

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lwm;")
    public static class152 field1113 = class157.method1048("<col=ffffff> )4 ", 103);

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I", line = 4)
    public final int method520(int arg0, int arg1) {
        if (arg0 != -4460) {
            field1108 = 69;
        }
        if (this.field1109 != null) {
            arg1 = (int) ((long) this.field1111 * (long) arg1 / (long) this.field1105) + 6;
        }
        field1107++;
        return arg1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 23)
    public static final void method521(byte arg0) {
        if (class146.field2244 < 0) {
            class208.field3392 = -1;
            class183.field2920 = -1;
            class146.field2244 = 0;
        }
        if (class146.field2244 > class239.field3921) {
            class208.field3392 = -1;
            class183.field2920 = -1;
            class146.field2244 = class239.field3921;
        }
        field1112++;
        if (class84.field1158 < 0) {
            class84.field1158 = 0;
            class183.field2920 = -1;
            class208.field3392 = -1;
        }
        if (class26.field446 < class84.field1158) {
            class84.field1158 = class26.field446;
            class208.field3392 = -1;
            class183.field2920 = -1;
        }
        if (arg0 >= -78) {
            field1104 = (class152[]) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BI)[B", line = 77)
    public final byte[] method522(byte[] arg0, int arg1) {
        field1110++;
        if (arg1 <= 123) {
            method523((byte) -72);
        }
        if (this.field1109 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1111 / (long) this.field1105) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field1109[var4];
                for (int var10 = 0; var10 < 14; var10++) {
                    var5[var6 + var10] += var9[var10] * var8;
                }
                int var11 = this.field1111 + var4;
                int var12 = var11 / this.field1105;
                var6 += var12;
                var4 = var11 - this.field1105 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var5[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 145)
    public static final void method523(byte arg0) {
        class120.field1695.method1619(11300);
        field1106++;
        if (arg0 != -74) {
            method523((byte) 86);
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V", line = 160)
    public static void method524(byte arg0) {
        field1113 = null;
        field1104 = null;
        if (arg0 > -74) {
            method525((byte) 92);
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V", line = 176)
    public static final void method525(byte arg0) {
        int var1 = 0;
        if (arg0 >= -16) {
            return;
        }
        while (var1 < class238.field3912) {
            int var2 = class235.field3851[var1];
            class4 var3 = class40.field649[var2];
            int var4 = class73.field1058.method2011(-81);
            if ((var4 & 0x80) != 0) {
                var4 += class73.field1058.method2011(-115) << 8;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class73.field1058.method1990((byte) 96);
                int var6 = class73.field1058.method1990((byte) 83);
                var3.method1712(class142.field2187, var6, 124, var5);
            }
            if ((var4 & 0x10) != 0) {
                var3.field4179 = class73.field1058.method1976((byte) 86);
                if (var3.field4179 == 65535) {
                    var3.field4179 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                int var7 = class73.field1058.method1997(22720);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class73.field1058.method1979(0);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var9[var11] = var12;
                    var10[var11] = class73.field1058.method1997(22720);
                    var8[var11] = class73.field1058.method1979(0);
                }
                class236.method1623(var3, var8, var9, 2, var10);
            }
            if ((var4 & 0x40) != 0) {
                var3.field4167 = class73.field1058.method2017(true);
                var3.field4189 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field4234 = class73.field1058.method1957(810960104);
                var3.field4191 = class73.field1058.method1979(0);
            }
            if ((var4 & 0x1) != 0) {
                int var13 = class73.field1058.method1976((byte) 86);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class73.field1058.method1997(22720);
                class12.method62(var13, (byte) -116, var3, var14);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field72.method1654(9193)) {
                    class288.method1936(4096, var3);
                }
                var3.method15(class98.method659(255, class73.field1058.method1957(810960104)), 0);
                var3.method1703(var3.field72.field3984, 1159);
                var3.field4171 = var3.field72.field3982;
                if (var3.field72.method1654(9193)) {
                    class313.method2184(82, var3, 0, class23.field400, (class270) null, (class12) null, var3.field4188[0], var3.field4245[0]);
                }
            }
            if ((var4 & 0x20) != 0) {
                int var15 = class73.field1058.method1990((byte) 115);
                int var16 = class73.field1058.method1990((byte) 109);
                var3.method1712(class142.field2187, var16, 47, var15);
                var3.field4178 = class142.field2187 + 300;
                var3.field4192 = class73.field1058.method2011(-60);
            }
            if ((var4 & 0x4) != 0) {
                int var17 = class73.field1058.method2021((byte) 74);
                if (var17 == 65535) {
                    var17 = -1;
                }
                int var18 = class73.field1058.method2008(-24427);
                boolean var19 = true;
                if (var17 != -1 && var3.field4182 != -1 && class133.method851(class189.method1255(var17, (byte) 74).field5170, -55).field2152 < class133.method851(class189.method1255(var3.field4182, (byte) 41).field5170, 127).field2152) {
                    var19 = false;
                }
                if (var19) {
                    var3.field4182 = var17;
                    var3.field4164 = (var18 & 0xFFFF) + class142.field2187;
                    var3.field4233 = 0;
                    var3.field4196 = 0;
                    var3.field4242 = 1;
                    if (var3.field4164 > class142.field2187) {
                        var3.field4233 = -1;
                    }
                    var3.field4205 = var18 >> 16;
                    if (var3.field4182 != -1 && class142.field2187 == var3.field4164) {
                        int var20 = class189.method1255(var3.field4182, (byte) -128).field5170;
                        if (var20 != -1) {
                            class141 var21 = class133.method851(var20, 115);
                            if (var21 != null && var21.field2177 != null) {
                                class18.method114(var3.field4162, 0, var3.field4231, var21, false, 28972);
                            }
                        }
                    }
                }
            }
            var1++;
        }
        field1116++;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(II)V", line = 358)
    public class79(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class80.method530(arg0, 122, arg1);
            int var4 = arg1 / var3;
            this.field1111 = var4;
            int var5 = arg0 / var3;
            this.field1105 = var5;
            this.field1109 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1109[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (-1.0E-4D > var16 || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)J", line = 427)
    public static final long method526(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        return var3 == null || var3.field573 == null ? 0L : var3.field573.field5019;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)I", line = 439)
    public final int method527(boolean arg0, int arg1) {
        if (this.field1109 != null) {
            arg1 = (int) ((long) this.field1111 * (long) arg1 / (long) this.field1105);
        }
        field1114++;
        return arg0 ? arg1 : 121;
    }
}
