import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class68 extends class280 {

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Z")
    private boolean field1060 = true;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    private int field1066 = 0;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Lla;")
    private class178 field1073 = null;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    private int field1062 = 0;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    private int field1065 = -1;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    private int field1081 = -32768;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    private int field1079 = 0;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    private int field1086 = -1;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Lu;")
    private class33 field1072;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZZ)Lkb;", line = 4)
    private final class280 method487(boolean arg0, boolean arg1) {
        field1068++;
        boolean var3 = class88.field1318 != class208.field3304;
        class185 var4 = class77.method536(this.field1074, 116);
        if (var4.field2843 != null) {
            var4 = var4.method1216(0);
        }
        if (var4 == null) {
            if (!var3) {
                this.method488((byte) -91);
            }
            return null;
        }
        int var5 = this.field1083 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field2859;
            var7 = var4.field2840;
        } else {
            var6 = var4.field2840;
            var7 = var4.field2859;
        }
        int var8 = (var6 >> 1) + this.field1080;
        int var9 = this.field1080 + (var6 + 1 >> 1);
        int var10 = (var7 >> 1) + this.field1064;
        int var11 = (var7 + 1 >> 1) + this.field1064;
        this.method490(var10 * 128, (byte) 48, var8 * 128);
        boolean var12 = !var3 && var4.field2898 && (this.field1065 != var4.field2893 || this.field1086 != this.field1069 && class236.field3895 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class208.field3304[this.field1084];
        int var14 = var13[var8][var10] + var13[var8][var11] + var13[var9][var11] + var13[var9][var10] >> 2;
        int var15 = (this.field1080 << 7) + (var6 << 6);
        int var16 = (this.field1064 << 7) + (var7 << 6);
        int[][] var17 = (int[][]) null;
        if (!arg0) {
            return (class280) null;
        }
        if (var3) {
            var17 = class88.field1318[0];
        } else if (this.field1084 < 3) {
            var17 = class208.field3304[this.field1084 + 1];
        }
        if (var12) {
            class134.method881(this.field1073, this.field1079, this.field1062, this.field1066);
        }
        boolean var18 = this.field1073 == null;
        class286 var19;
        if (this.field1072 == null) {
            var19 = var4.method1214(var17, this.field1083, (byte) 86, var16, this.field1076, var12, false, var15, var18 ? class156.field2313 : this.field1073, var14, var13);
        } else {
            var19 = var4.method1213(var18 ? class156.field2313 : this.field1073, -25451, var15, var13, var17, this.field1076, var16, var12, this.field1069, this.field1072, var14, this.field1083);
        }
        if (var19 == null) {
            return null;
        }
        if (var12) {
            int var20 = 0;
            if (var18) {
                class156.field2313 = var19.field4825;
            }
            if (this.field1084 != 0) {
                int[][] var21 = class208.field3304[0];
                var20 = var14 - (var21[var8][var10] + var21[var9][var10] + var21[var8][var11] + var21[var9][var11] >> 2);
            }
            class178 var22 = var19.field4825;
            if (this.field1060 && class134.method869(var22, var15, var20, var16)) {
                this.field1060 = false;
            }
            if (!this.field1060) {
                class134.method877(var22, var15, var20, var16);
                this.field1066 = var16;
                this.field1079 = var15;
                this.field1073 = var22;
                if (var18) {
                    class156.field2313 = null;
                }
                this.field1062 = var20;
            }
            this.field1065 = var4.field2893;
            this.field1086 = this.field1069;
        }
        return var19.field4823;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 137)
    public final void method488(byte arg0) {
        field1087++;
        if (this.field1073 != null) {
            class134.method881(this.field1073, this.field1079, this.field1062, this.field1066);
        }
        if (arg0 < -13) {
            this.field1086 = -1;
            this.field1073 = null;
            this.field1065 = -1;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIII)Z", line = 162)
    public static final boolean method489(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class61.field952 * arg3 + class171.field2633 * arg0 >> 16;
        int var6 = class171.field2633 * arg3 - class61.field952 * arg0 >> 16;
        int var7 = class259.field4423 * var6 + class111.field1658 * arg1 >> 16;
        int var8 = class259.field4423 * arg1 - class111.field1658 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class259.field4423 * var6 + class111.field1658 * arg2 >> 16;
        int var12 = class259.field4423 * arg2 - class111.field1658 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class196.field3067 && var13 < class196.field3067) {
            return false;
        } else if (var9 > class99.field1476 && var13 > class99.field1476) {
            return false;
        } else if (var10 < class280.field4750 && var14 < class280.field4750) {
            return false;
        } else {
            return var10 <= class84.field1276 || var14 <= class84.field1276;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)V", line = 220)
    private final void method490(int arg0, byte arg1, int arg2) {
        field1070++;
        if (this.field1072 != null) {
            int var4 = class50.field784 - this.field1078;
            if (var4 > 100 && this.field1072.field513 > 0) {
                int var5 = this.field1072.field529.length - this.field1072.field513;
                while (this.field1069 < var5 && var4 > this.field1072.field502[this.field1069]) {
                    var4 -= this.field1072.field502[this.field1069];
                    this.field1069++;
                }
                if (this.field1069 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1072.field529.length; var7++) {
                        var6 += this.field1072.field502[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field1072.field502[this.field1069]) {
                            break label62;
                        }
                        class272.method1859(arg2, arg0, 64, this.field1069, this.field1072, false);
                        var4 -= this.field1072.field502[this.field1069];
                        this.field1069++;
                    } while (this.field1072.field529.length > this.field1069);
                    this.field1069 -= this.field1072.field513;
                } while (this.field1069 >= 0 && this.field1069 < this.field1072.field529.length);
                this.field1072 = null;
            }
            this.field1078 = class50.field784 - var4;
        }
        if (arg1 != 48) {
            method489(-81, -102, 23, -61, -15);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IIIIIIIZLkb;)V", line = 893)
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class280 arg8) {
        this.field1074 = arg0;
        this.field1080 = arg4;
        this.field1084 = arg3;
        this.field1083 = arg2;
        this.field1064 = arg5;
        this.field1076 = arg1;
        if (arg8 != null) {
            if (arg8 instanceof class68) {
                ((class68) arg8).method488((byte) -66);
            } else {
                class185 var10 = class77.method536(this.field1074, 118);
                if (var10.field2843 != null) {
                    var10 = var10.method1216(0);
                }
                if (var10 != null) {
                    class211.method1397(0, var10, this.field1064, true, this.field1080, this.field1084, this.field1083, 0, this.field1076);
                }
            }
        }
        if (arg6 != -1) {
            this.field1072 = class171.method1136(arg6, -6722);
            this.field1069 = 0;
            this.field1078 = class50.field784 - 1;
            if (this.field1072.field499 == 0 && arg8 != null && arg8 instanceof class68) {
                class68 var11 = (class68) arg8;
                if (this.field1072 == var11.field1072) {
                    this.field1078 = var11.field1078;
                    this.field1069 = var11.field1069;
                    return;
                }
            }
            if (arg7 && this.field1072.field513 != -1) {
                this.field1069 = (int) (Math.random() * (double) this.field1072.field529.length);
                this.field1078 -= (int) ((double) this.field1072.field502[this.field1069] * Math.random());
            }
        }
        if (arg8 != null) {
            this.method487(true, true);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Lkb;", line = 299)
    private final class280 method491(boolean arg0) {
        if (arg0) {
            this.field1081 = 95;
        }
        field1067++;
        return this.method487(true, false);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I", line = 310)
    public final int method248() {
        field1075++;
        return this.field1081;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V", line = 334)
    public final void method492(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method487(true, true);
        field1071++;
        int var6 = -7 % ((61 - arg2) / 56);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 345)
    public static final void method493(int arg0) {
        field1063++;
        if (class167.field2549 == 215) {
            int var101 = class200.field3184.method1527(true);
            int var102 = class200.field3184.method1544((byte) -73);
            int var103 = (var102 >> 4 & 0x7) + class228.field3779;
            int var104 = (var102 & 0x7) + class174.field2661;
            if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                class218 var105 = class91.field1358[class276.field4701][var103][var104];
                if (var105 != null) {
                    for (class236 var106 = (class236) var105.method1475(14); var106 != null; var106 = (class236) var105.method1486(arg0 ^ 0x58)) {
                        if ((var101 & 0x7FFF) == var106.field3891.field1572) {
                            var106.method1997(arg0 ^ 0xFFFF9575);
                            break;
                        }
                    }
                    if (var105.method1475(14) == null) {
                        class91.field1358[class276.field4701][var103][var104] = null;
                    }
                    class217.method1470((byte) -57, var104, var103);
                }
            }
        } else if (class167.field2549 == 252) {
            int var92 = class200.field3184.method1509(true);
            int var93 = class228.field3779 + ((var92 & 0x7C) >> 4);
            int var94 = (var92 & 0x7) + class174.field2661;
            int var95 = class200.field3184.method1524((byte) 110);
            int var96 = class200.field3184.method1509(true);
            int var97 = class200.field3184.method1524((byte) 67);
            if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                int var98 = var93 * 128 + 64;
                int var99 = var94 * 128 + 64;
                class92 var100 = new class92(var95, class276.field4701, var98, var99, class20.method161(var99, var98, 1, class276.field4701) - var96, var97, class50.field784);
                class110.field1629.method1485(-8564, new class145(var100));
            }
        } else {
            if (class167.field2549 == 93) {
                class200.field3184.method1555(25570);
                class200.field3184.method1515(arg0 ^ 0xFFFFFFE4);
                class200.field3184.method1499(false);
                int var1 = class200.field3184.method1528(-87);
                class200.field3184.method1547((byte) 124);
                class200.field3184.method1498((byte) -27);
                class200.field3184.method1528(-110);
                class200.field3184.method1543(false);
                class200.field3184.method1521((byte) -79);
                class200.field3184.method1498((byte) -27);
                if (class161.field2460 == var1) {
                }
            }
            if (class167.field2549 == 64) {
                int var83 = class200.field3184.method1509(true);
                int var84 = class228.field3779 + (var83 >> 4 & 0x7);
                int var85 = (var83 & 0x7) + class174.field2661;
                int var86 = class200.field3184.method1524((byte) 121);
                if (var86 == 65535) {
                    var86 = -1;
                }
                int var87 = class200.field3184.method1509(true);
                int var88 = (var87 & 0xFA) >> 4;
                int var89 = var87 & 0x7;
                int var90 = class200.field3184.method1509(true);
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    int var91 = var88 + 1;
                    if (var84 - var91 <= class151.field2183.field175[0] && var84 + var91 >= class151.field2183.field175[0] && class151.field2183.field186[0] >= (var85 - var91) && (var85 + var91) >= class151.field2183.field186[0] && class130.field1955 != 0 && var89 > 0 && class186.field2934 < 50 && var86 != -1) {
                        class152.field2222[class186.field2934] = var86;
                        class24.field411[class186.field2934] = var89;
                        class29.field470[class186.field2934] = var90;
                        class142.field2085[class186.field2934] = null;
                        class185.field2894[class186.field2934] = (var85 << 8) + (var84 << 16) + var88;
                        class186.field2934++;
                    }
                }
            } else if (class167.field2549 == 250) {
                int var2 = class200.field3184.method1509(true);
                int var3 = (var2 >> 4 & 0xF) + class228.field3779 * 2;
                int var4 = (var2 & 0xF) + class174.field2661 * 2;
                int var5 = class200.field3184.method1543(false) + var3;
                int var6 = class200.field3184.method1543(false) + var4;
                int var7 = class200.field3184.method1505(arg0 - 22);
                int var8 = class200.field3184.method1524((byte) 67);
                int var9 = class200.field3184.method1509(true) * 4;
                int var10 = class200.field3184.method1509(true) * 4;
                int var11 = class200.field3184.method1524((byte) 119);
                int var12 = class200.field3184.method1524((byte) 59);
                int var13 = class200.field3184.method1509(true);
                int var14 = class200.field3184.method1509(true);
                if (var3 >= 0 && var4 >= 0 && var3 < 208 && var4 < 208 && var5 >= 0 && var6 >= 0 && var5 < 208 && var6 < 208 && var8 != 65535) {
                    int var15 = var3 * 64;
                    int var16 = var4 * 64;
                    int var17 = var5 * 64;
                    int var18 = var6 * 64;
                    class267 var19 = new class267(var8, class276.field4701, var15, var16, class20.method161(var16, var15, 1, class276.field4701) - var9, class50.field784 + var11, class50.field784 + var12, var13, var14, var7, var10);
                    var19.method1840(var18, class50.field784 + var11, 116, class20.method161(var18, var17, arg0 - 125, class276.field4701) - var10, var17);
                    class77.field1203.method1485(arg0 - 8690, new class206(var19));
                }
            } else if (class167.field2549 == arg0) {
                int var75 = class200.field3184.method1499(false);
                int var76 = var75 >> 2;
                int var77 = var75 & 0x3;
                int var78 = class103.field1526[var76];
                int var79 = class200.field3184.method1544((byte) -32);
                int var80 = (var79 & 0x7) + class174.field2661;
                int var81 = ((var79 & 0x70) >> 4) + class228.field3779;
                int var82 = class200.field3184.method1528(arg0 - 217);
                if (var81 >= 0 && var80 >= 0 && var81 < 104 && var80 < 104) {
                    class70.method500(-82, var81, -1, var80, 0, var82, var76, class276.field4701, var77, var78);
                }
            } else if (class167.field2549 == 73) {
                int var20 = class200.field3184.method1509(true);
                int var21 = var20 >> 2;
                int var22 = class103.field1526[var21];
                int var23 = class200.field3184.method1509(true);
                int var24 = var20 & 0x3;
                int var25 = ((var23 & 0x78) >> 4) + class228.field3779;
                int var26 = class174.field2661 + (var23 & 0x7);
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                    class70.method500(-106, var25, -1, var26, 0, -1, var21, class276.field4701, var24, var22);
                }
            } else if (class167.field2549 == 213) {
                int var57 = class200.field3184.method1509(true);
                int var58 = (var57 >> 4 & 0x7) + class228.field3779;
                int var59 = (var57 & 0x7) + class174.field2661;
                int var60 = var58 + class200.field3184.method1543(false);
                int var61 = class200.field3184.method1543(false) + var59;
                int var62 = class200.field3184.method1505(89);
                int var63 = class200.field3184.method1524((byte) 71);
                int var64 = class200.field3184.method1509(true) * 4;
                int var65 = class200.field3184.method1509(true) * 4;
                int var66 = class200.field3184.method1524((byte) 121);
                int var67 = class200.field3184.method1524((byte) 64);
                int var68 = class200.field3184.method1509(true);
                int var69 = class200.field3184.method1509(true);
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104 && var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && var63 != 65535) {
                    int var70 = var59 * 128 + 64;
                    int var71 = var60 * 128 + 64;
                    int var72 = var61 * 128 + 64;
                    int var73 = var58 * 128 + 64;
                    class267 var74 = new class267(var63, class276.field4701, var73, var70, class20.method161(var70, var73, 1, class276.field4701) - var64, class50.field784 + var66, class50.field784 + var67, var68, var69, var62, var65);
                    var74.method1840(var72, var66 + class50.field784, 124, class20.method161(var72, var71, 1, class276.field4701) - var65, var71);
                    class77.field1203.method1485(arg0 ^ 0xFFFFDEF2, new class206(var74));
                }
            } else if (class167.field2549 == 52) {
                int var51 = class200.field3184.method1528(-124);
                int var52 = class200.field3184.method1509(true);
                int var53 = class174.field2661 + (var52 & 0x7);
                int var54 = class228.field3779 + ((var52 & 0x75) >> 4);
                int var55 = class200.field3184.method1527(true);
                if (var54 >= 0 && var53 >= 0 && var54 < 104 && var53 < 104) {
                    class106 var56 = new class106();
                    var56.field1573 = var51;
                    var56.field1572 = var55;
                    if (class91.field1358[class276.field4701][var54][var53] == null) {
                        class91.field1358[class276.field4701][var54][var53] = new class218();
                    }
                    class91.field1358[class276.field4701][var54][var53].method1485(-8564, new class236(var56));
                    class217.method1470((byte) -57, var53, var54);
                }
            } else if (class167.field2549 == 55) {
                int var44 = class200.field3184.method1544((byte) -94);
                int var45 = class228.field3779 + (var44 >> 4 & 0x7);
                int var46 = (var44 & 0x7) + class174.field2661;
                int var47 = class200.field3184.method1528(arg0 - 243);
                int var48 = class200.field3184.method1528(-128);
                int var49 = class200.field3184.method1528(-113);
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && class161.field2460 != var49) {
                    class106 var50 = new class106();
                    var50.field1573 = var47;
                    var50.field1572 = var48;
                    if (class91.field1358[class276.field4701][var45][var46] == null) {
                        class91.field1358[class276.field4701][var45][var46] = new class218();
                    }
                    class91.field1358[class276.field4701][var45][var46].method1485(-8564, new class236(var50));
                    class217.method1470((byte) -57, var46, var45);
                }
            } else if (class167.field2549 == 9) {
                int var27 = class200.field3184.method1509(true);
                int var28 = ((var27 & 0x73) >> 4) + class228.field3779;
                int var29 = (var27 & 0x7) + class174.field2661;
                int var30 = class200.field3184.method1524((byte) 108);
                int var31 = class200.field3184.method1524((byte) 92);
                int var32 = class200.field3184.method1524((byte) 72);
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    class218 var33 = class91.field1358[class276.field4701][var28][var29];
                    if (var33 != null) {
                        for (class236 var34 = (class236) var33.method1475(arg0 - 112); var34 != null; var34 = (class236) var33.method1486(38)) {
                            class106 var35 = var34.field3891;
                            if ((var30 & 0x7FFF) == var35.field1572 && var35.field1573 == var31) {
                                var35.field1573 = var32;
                                break;
                            }
                        }
                        class217.method1470((byte) -57, var29, var28);
                    }
                }
            } else if (class167.field2549 == 237) {
                int var36 = class200.field3184.method1544((byte) -47);
                int var37 = var36 >> 2;
                int var38 = class103.field1526[var37];
                int var39 = class200.field3184.method1524((byte) 79);
                int var40 = var36 & 0x3;
                if (var39 == 65535) {
                    var39 = -1;
                }
                int var41 = class200.field3184.method1544((byte) -43);
                int var42 = ((var41 & 0x70) >> 4) + class228.field3779;
                int var43 = (var41 & 0x7) + class174.field2661;
                class116.method757(var38, var43, class276.field4701, -29360, var42, var37, var39, var40);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIJ)V", line = 838)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class280 var11 = this.method491(false);
        field1061++;
        if (var11 != null) {
            var11.method242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1081 = var11.method248();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lbf;ILud;)Lwh;", line = 860)
    public static final class56 method494(class209 arg0, int arg1, class16 arg2) {
        long var3 = ((long) arg2.field286 << 56) + ((long) arg2.field282 << 32) + (long) ((arg2.field283 - -1 << 16) + arg2.field301);
        class56 var5 = (class56) arg0.method1372(false, var3);
        if (arg1 != -389482464) {
            field1082 = -101;
        }
        field1077++;
        if (var5 == null) {
            var5 = new class56(arg2.field283, (float) arg2.field301, true, false, arg2.field282);
            arg0.method1376(var3, arg1 + 389482463, var5);
        }
        return var5;
    }
}
