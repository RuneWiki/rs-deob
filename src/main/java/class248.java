import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class248 extends class170 {

    @OriginalMember(owner = "client!ik", name = "hb", descriptor = "I")
    private int field4278 = 0;

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "I")
    private int field4272 = 1365;

    @OriginalMember(owner = "client!ik", name = "gb", descriptor = "I")
    private int field4277 = 0;

    @OriginalMember(owner = "client!ik", name = "jb", descriptor = "I")
    private int field4280 = 20;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "Lmh;")
    private static class128 field4268 = class22.method156(126, "Started 3d Library");

    @OriginalMember(owner = "client!ik", name = "db", descriptor = "I")
    public static int field4274 = 0;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "Lmh;")
    public static class128 field4270 = field4268;

    @OriginalMember(owner = "client!ik", name = "fb", descriptor = "[I")
    public static int[] field4276 = new int[2];

    @OriginalMember(owner = "client!ik", name = "kb", descriptor = "I")
    public static int field4281 = -1;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!ik", name = "cb", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ik", name = "eb", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ik", name = "ib", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "Ldj;")
    public static class314 field4267;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method1719(boolean arg0, int arg1) {
        if (arg0) {
            field4275++;
            return (arg1 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ldj;I)V", line = 18)
    public static final void method1720(class314 arg0, int arg1) {
        field4266++;
        class109.field1857 = arg0;
        if (arg1 <= 31) {
            field4281 = -26;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 29)
    public class248() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[I", line = 33)
    public final int[] method69(byte arg0, int arg1) {
        field4271++;
        if (arg0 != 85) {
            return (int[]) null;
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            for (int var4 = 0; var4 < class185.field3225; var4++) {
                int var5 = (class118.field2002[var4] << 12) / this.field4272 + this.field4277;
                int var6 = (class307.field5221[arg1] << 12) / this.field4272 + this.field4278;
                int var7 = var5;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while ((var12 + var11) < 16384 && var13 < this.field4280) {
                    var10 = (var8 * var10 >> 12) * 2 + var9;
                    var13++;
                    var8 = var12 + var7 - var11;
                    var11 = var10 * var10 >> 12;
                    var12 = var8 * var8 >> 12;
                }
                var3[var4] = var13 >= (this.field4280 - 1) ? 0 : (var13 << 12) / this.field4280;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILbg;B)V", line = 93)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field4265++;
        if (arg2 != 13) {
            method1725(114, -4, 40, 82, -123, -86);
        }
        if (arg0 == 0) {
            this.field4272 = arg1.method1308(-95);
        } else if (arg0 == 1) {
            this.field4280 = arg1.method1308(-46);
        } else if (arg0 == 2) {
            this.field4277 = arg1.method1308(-38);
        } else if (arg0 == 3) {
            this.field4278 = arg1.method1308(-93);
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)V", line = 172)
    public static void method1721(byte arg0) {
        field4276 = null;
        field4267 = null;
        field4270 = null;
        field4268 = null;
        if (arg0 < 73) {
            method1719(false, -74);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(BI)I", line = 186)
    public static final int method1722(byte arg0, int arg1) {
        int var2 = 54 / ((-arg0 - 45) / 37);
        field4279++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIBI)V", line = 197)
    public static final void method1723(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4269++;
        if (arg4 != -88) {
            field4270 = (class128) null;
        }
        if (class181.field3173 < arg3 || class70.field1315 > arg0) {
            return;
        }
        boolean var6;
        if (class193.field3335 > arg2) {
            var6 = false;
            arg2 = class193.field3335;
        } else if (arg2 <= class43.field875) {
            var6 = true;
        } else {
            arg2 = class43.field875;
            var6 = false;
        }
        boolean var7;
        if (arg1 < class193.field3335) {
            var7 = false;
            arg1 = class193.field3335;
        } else if (class43.field875 < arg1) {
            arg1 = class43.field875;
            var7 = false;
        } else {
            var7 = true;
        }
        if (class70.field1315 <= arg3) {
            class314.method2138(arg2, true, arg5, class219.field3850[arg3++], arg1);
        } else {
            arg3 = class70.field1315;
        }
        if (class181.field3173 >= arg0) {
            class314.method2138(arg2, true, arg5, class219.field3850[arg0--], arg1);
        } else {
            arg0 = class181.field3173;
        }
        if (var7 && var6) {
            for (int var8 = arg3; var8 <= arg0; var8++) {
                int[] var9 = class219.field3850[var8];
                var9[arg1] = var9[arg2] = arg5;
            }
        } else if (var7) {
            for (int var11 = arg3; var11 <= arg0; var11++) {
                class219.field3850[var11][arg1] = arg5;
            }
        } else if (var6) {
            for (int var10 = arg3; var10 <= arg0; var10++) {
                class219.field3850[var10][arg2] = arg5;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIBIIII)V", line = 301)
    public static final void method1724(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4273++;
        if (arg5 >= 0 && arg7 >= 0 && arg5 < 103 && arg7 < 103) {
            if (arg6 == 0) {
                class65 var8 = class229.method1572(arg2, arg5, arg7);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field1264 >>> 32);
                    if (arg4 == 2) {
                        var8.field1252 = new class271(var9, 2, arg1 + 4, arg2, arg5, arg7, arg0, false, var8.field1252);
                        var8.field1251 = new class271(var9, 2, arg1 + 1 & 0x3, arg2, arg5, arg7, arg0, false, var8.field1251);
                    } else {
                        var8.field1252 = new class271(var9, arg4, arg1, arg2, arg5, arg7, arg0, false, var8.field1252);
                    }
                }
            }
            if (arg6 == 1) {
                class161 var10 = class123.method755(arg2, arg5, arg7);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field2762 >>> 32);
                    if (arg4 == 4 || arg4 == 5) {
                        var10.field2761 = new class271(var11, 4, arg1, arg2, arg5, arg7, arg0, false, var10.field2761);
                    } else if (arg4 == 6) {
                        var10.field2761 = new class271(var11, 4, arg1 + 4, arg2, arg5, arg7, arg0, false, var10.field2761);
                    } else if (arg4 == 7) {
                        var10.field2761 = new class271(var11, 4, (arg1 + 2 & 0x3) + 4, arg2, arg5, arg7, arg0, false, var10.field2761);
                    } else if (arg4 == 8) {
                        var10.field2761 = new class271(var11, 4, arg1 + 4, arg2, arg5, arg7, arg0, false, var10.field2761);
                        var10.field2764 = new class271(var11, 4, (arg1 + 2 & 0x3) + 4, arg2, arg5, arg7, arg0, false, var10.field2764);
                    }
                }
            }
            if (arg6 == 2) {
                if (arg4 == 11) {
                    arg4 = 10;
                }
                class5 var12 = class314.method2172(arg2, arg5, arg7);
                if (var12 != null) {
                    var12.field105 = new class271(Integer.MAX_VALUE & (int) (var12.field89 >>> 32), arg4, arg1, arg2, arg5, arg7, arg0, false, var12.field105);
                }
            }
            if (arg6 == 3) {
                class92 var13 = class8.method66(arg2, arg5, arg7);
                if (var13 != null) {
                    var13.field1572 = new class271((int) (var13.field1568 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg2, arg5, arg7, arg0, false, var13.field1572);
                }
            }
        }
        if (arg3 >= -19) {
            method1723(55, 84, -28, 25, (byte) -12, -28);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII)V", line = 393)
    public static final void method1725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg2 - 32) * arg2 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        if (arg1 != -30984) {
            field4267 = (class314) null;
        }
        class222.field3896[0].method448(arg3, arg0);
        field4263++;
        class222.field3896[1].method448(arg3, arg2 + arg0 - 16);
        int var7 = (arg2 - var6 - 32) * arg5 / (arg4 - arg2);
        if (!class247.field4247) {
            class213.method1464(arg3, arg0 + 16, 16, arg2 - 32, class311.field5272);
            class213.method1464(arg3, arg0 + var7 + 16, 16, var6, class30.field678);
            class213.method1474(arg3, var7 + arg0 + 16, var6, class180.field3153);
            class213.method1474(arg3 + 1, arg0 + 16 + var7, var6, class180.field3153);
            class213.method1481(arg3, arg0 + var7 + 16, 16, class180.field3153);
            class213.method1481(arg3, arg0 + var7 + 17, 16, class180.field3153);
            class213.method1474(arg3 + 15, var7 + 16 + arg0, var6, class249.field4324);
            class213.method1474(arg3 + 14, arg0 + 17 + var7, var6 - 1, class249.field4324);
            class213.method1481(arg3, arg0 + var6 + var7 + 15, 16, class249.field4324);
            class213.method1481(arg3 + 1, arg0 + var7 + 14 - -var6, 15, class249.field4324);
            return;
        }
        class269.method1878(arg3, arg0 + 16, 16, arg2 - 32, class311.field5272);
        class269.method1878(arg3, arg0 + var7 + 16, 16, var6, class30.field678);
        class269.method1885(arg3, arg0 - (-var7 - 16), var6, class180.field3153);
        class269.method1885(arg3 + 1, arg0 - (-16 - var7), var6, class180.field3153);
        class269.method1882(arg3, arg0 + var7 + 16, 16, class180.field3153);
        class269.method1882(arg3, arg0 + var7 + 17, 16, class180.field3153);
        class269.method1885(arg3 + 15, arg0 - -16 - -var7, var6, class249.field4324);
        class269.method1885(arg3 + 14, arg0 - (-17 - var7), var6 - 1, class249.field4324);
        class269.method1882(arg3, arg0 + var6 - (-15 - var7), 16, class249.field4324);
        class269.method1882(arg3 + 1, arg0 + 14 + var6 + var7, 15, class249.field4324);
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V", line = 441)
    public static final void method1726(int arg0) {
        field4264++;
        class175.method1204(47);
        class145.method967(-96);
        class171.method1147(-105);
        class3.method22(false);
        class182.method1238((byte) 72);
        class212.method1458((byte) -118);
        class99.method619(46);
        class306.method2088((byte) 122);
        class62.method411(-71);
        if (arg0 != 16) {
            field4268 = (class128) null;
        }
        class188.method1259(true);
        class288.method1988(-19681);
        class290.method1999(arg0 + 71);
        class159.method1059((byte) 38);
        class42.method290((byte) 127);
        if (!class247.field4247) {
            ((class163) class141.field2419).method1076((byte) 56);
        }
        class205.field3611.method1451(20650);
        class234.field4035.method2158((byte) 117);
        field4267.method2158((byte) 122);
        class129.field2252.method2158((byte) 120);
        class143.field2439.method2158((byte) 125);
        class288.field4924.method2158((byte) 121);
        class162.field2765.method2158((byte) 123);
        class147.field2539.method2158((byte) 118);
        class4.field74.method2158((byte) 119);
        class108.field1829.method2158((byte) 124);
        class104.field1781.method2158((byte) 120);
        class311.field5266.method2158((byte) 116);
        class93.field1575.method1832((byte) 65);
    }
}
