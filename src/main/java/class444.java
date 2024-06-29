import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class444 {

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    private int field6152 = -32768;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Z")
    private boolean field6142 = false;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    private int field6151 = -1;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    private int field6158 = -1;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Z")
    private boolean field6150 = false;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "B")
    private byte field6139;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    private int field6159;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public int field6163;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public int field6132;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field6136;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    private int field6140;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "B")
    private byte field6137;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
    private boolean field6126;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field6135 = 2;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "F")
    public static float field6133;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    private int field6127;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    private int field6128;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    private int field6160;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    private int field6162;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Lbo;")
    private class156 field6157;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Lge;")
    private class386 field6156;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Lgi;")
    private class416 field6153;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lkq;")
    public class69 field6131;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[Z")
    private boolean[] field6138;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BZ)I")
    public static final int method2744(byte arg0, boolean arg1) {
        if (arg0 >= -95) {
            method2744((byte) 111, true);
        }
        field6143++;
        long var2 = class164.method1038(8635);
        for (class113 var4 = arg1 ? (class113) class23.field241.method2222(0) : (class113) class23.field241.method2215(false); var4 != null; var4 = (class113) class23.field241.method2215(false)) {
            if ((var4.field1320 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field1320 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field505;
                    class56.field649[var5] = class104.field1231[var5];
                    var4.method263(false);
                    return var5;
                }
                var4.method263(false);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
    public final int method2745(byte arg0) {
        if (arg0 != -124) {
            this.field6158 = -91;
        }
        field6129++;
        return this.field6152;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILuo;IIZZZ)Lge;")
    public final class386 method2746(int arg0, class118 arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) {
        field6145++;
        class446 var8 = class380.method2361(this.field6132, -29012);
        if (var8.field6233 != null) {
            var8 = var8.method2759(24964);
        }
        if (var8 == null) {
            this.method2747(arg1, 13694);
            this.field6151 = this.field6162;
            this.field6158 = -1;
            return null;
        }
        if (!this.field6150 && this.field6158 != var8.field6209) {
            this.field6156 = null;
            this.method2751(-1, false);
        }
        this.method2749(arg2, arg3, -102);
        boolean var9 = arg4 & this.field6126 & class333.field4548 != 0;
        boolean var10 = var9 & (this.field6158 != var8.field6209 || (this.field6162 != this.field6151 || this.field6157 != null && (this.field6157.field1800 || class338.field4610) && this.field6162 != this.field6160) && class333.field4548 >= 2);
        if (arg6 && !var10) {
            this.field6158 = var8.field6209;
            this.field6151 = this.field6162;
            return null;
        }
        if (var10) {
            class183.method1139(this.field6153, this.field6139, this.field6159, this.field6140, this.field6138);
        }
        class279 var11 = class304.field4096[this.field6139];
        class279 var12;
        if (this.field6142) {
            var12 = class219.field2709[0];
        } else {
            var12 = this.field6139 < 3 ? class304.field4096[this.field6139 + 1] : null;
        }
        class386 var13 = null;
        if (this.field6157 != null) {
            if (var10) {
                arg0 |= 0x20000;
            }
            var13 = var8.method2764(this.field6157, this.field6162, this.field6128, arg0, var12, var11.method1054(this.field6159, this.field6140), arg1, this.field6159, 1589565354, this.field6163 == 11 ? 10 : this.field6163, this.field6160, this.field6140, var11, this.field6163 == 11 ? this.field6136 + 4 : this.field6136);
            if (var13 == null) {
                this.field6138 = null;
                this.field6152 = 0;
                this.field6153 = null;
            } else {
                if (var10) {
                    if (this.field6138 == null) {
                        this.field6138 = new boolean[4];
                    }
                    this.field6153 = var13.method1461(this.field6153);
                    class434.method2649(this.field6153, this.field6139, arg3, arg2, this.field6138);
                }
                this.field6152 = var13.method1458();
            }
            this.field6156 = null;
        } else if (this.field6156 != null && arg0 == (arg0 & this.field6156.method1465()) && this.field6158 == var8.field6209) {
            var13 = this.field6156;
        } else {
            if (this.field6156 != null) {
                arg0 |= this.field6156.method1465();
            }
            class52 var14 = var8.method2774(var12, this.field6163 == 11 ? this.field6136 + 4 : this.field6136, var11.method1054(this.field6159, this.field6140), this.field6140, this.field6159, false, var11, this.field6163 == 11 ? 10 : this.field6163, arg1, arg0, var10);
            if (var14 == null) {
                this.field6153 = null;
                this.field6152 = 0;
                this.field6138 = null;
                this.field6156 = null;
            } else {
                var13 = var14.field610;
                this.field6156 = var14.field610;
                if (var10) {
                    this.field6153 = var14.field611;
                    this.field6138 = null;
                    class434.method2649(this.field6153, this.field6139, arg3, arg2, (boolean[]) null);
                }
                this.field6152 = var13.method1458();
            }
        }
        this.field6151 = this.field6162;
        if (arg5) {
            this.field6138 = null;
        }
        this.field6158 = var8.field6209;
        this.field6159 = arg3;
        this.field6140 = arg2;
        return var13;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Luo;I)V")
    public final void method2747(class118 arg0, int arg1) {
        if (this.field6153 != null) {
            class183.method1139(this.field6153, this.field6139, this.field6159, this.field6140, this.field6138);
            this.field6153 = null;
            this.field6138 = null;
        }
        field6141++;
        if (arg1 != 13694) {
            this.method2750(15, (class118) null);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BIIIZ[[[Lsq;)Z")
    public static final boolean method2748(byte arg0, int arg1, int arg2, int arg3, boolean arg4, class316[][][] arg5) {
        field6149++;
        int var6 = -49 % ((11 - arg0) / 41);
        byte var7 = arg4 ? 1 : (byte) (class302.field4057 & 0xFF);
        if (class183.field2126[class43.field513][arg1][arg3] == var7) {
            return false;
        } else if ((class222.field2770[class43.field513][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var8 = 0;
            class52.field615[var8] = arg1;
            int var9 = 0;
            int var36 = var8 + 1;
            class150.field1747[var8] = arg3;
            class183.field2126[class43.field513][arg1][arg3] = var7;
            while (var36 != var9) {
                int var10 = class52.field615[var9] & 0xFFFF;
                int var11 = (class52.field615[var9] & 0xFFAD52) >> 16;
                int var12 = class52.field615[var9] >> 24 & 0xFF;
                int var13 = class150.field1747[var9] & 0xFFFF;
                int var14 = (class150.field1747[var9] & 0xFF4B20) >> 16;
                var9 = var9 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class222.field2770[class43.field513][var10][var13] & 0x4) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                label233: for (int var17 = class43.field513 + 1; var17 <= 3; var17++) {
                    if ((class222.field2770[var17][var10][var13] & 0x8) == 0) {
                        if (var15 && arg5[var17][var10][var13] != null) {
                            if (arg5[var17][var10][var13].field4268 != null) {
                                int var21 = class236.method1519(var11, 128);
                                if (arg5[var17][var10][var13].field4268.field2873 == var21 || arg5[var17][var10][var13].field4269 != null && arg5[var17][var10][var13].field4269.field2873 == var21) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var22 = class236.method1519(var12, 128);
                                    if (arg5[var17][var10][var13].field4268.field2873 == var22 || arg5[var17][var10][var13].field4269 != null && arg5[var17][var10][var13].field4269.field2873 == var22) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var23 = class236.method1519(var14, 128);
                                    if (arg5[var17][var10][var13].field4268.field2873 == var23 || arg5[var17][var10][var13].field4269 != null && arg5[var17][var10][var13].field4269.field2873 == var23) {
                                        continue;
                                    }
                                }
                            }
                            class316 var24 = arg5[var17][var10][var13];
                            if (var24.field4256 != null) {
                                for (class272 var25 = var24.field4256; var25 != null; var25 = var25.field3514) {
                                    class133 var26 = var25.field3512;
                                    if (var26 instanceof class171) {
                                        class171 var27 = (class171) var26;
                                        int var28 = var27.method420((byte) -67);
                                        int var29 = var27.method417((byte) -116);
                                        if (var28 == 21) {
                                            var28 = 19;
                                        }
                                        int var30 = var29 << 6 | var28;
                                        if (var11 == var30 || var12 != 0 && var12 == var30 || var14 != 0 && var14 == var30) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class316 var31 = arg5[var17][var10][var13];
                        if (var31 != null && var31.field4256 != null) {
                            for (class272 var32 = var31.field4256; var32 != null; var32 = var32.field3514) {
                                class133 var33 = var32.field3512;
                                if (var33.field1512 != var33.field1510 || var33.field1518 != var33.field1517) {
                                    for (int var34 = var33.field1512; var34 <= var33.field1510; var34++) {
                                        for (int var35 = var33.field1518; var35 <= var33.field1517; var35++) {
                                            class183.field2126[var17][var34][var35] = var7;
                                        }
                                    }
                                }
                            }
                        }
                        class183.field2126[var17][var10][var13] = var7;
                        var16 = true;
                    }
                }
                if (var16) {
                    int var18 = class304.field4096[class43.field513 + 1].method1050(var10, var13);
                    if (class17.field188[arg2] < var18) {
                        class17.field188[arg2] = var18;
                    }
                    int var19 = var10 << 7;
                    if (var19 < class416.field5691[arg2]) {
                        class416.field5691[arg2] = var19;
                    } else if (class336.field4584[arg2] < var19) {
                        class336.field4584[arg2] = var19;
                    }
                    int var20 = var13 << 7;
                    if (class440.field6074[arg2] > var20) {
                        class440.field6074[arg2] = var20;
                    } else if (class186.field2160[arg2] < var20) {
                        class186.field2160[arg2] = var20;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class183.field2126[class43.field513][var10 - 1][var13] != var7) {
                        class52.field615[var36] = class213.method1307(-754974720, class213.method1307(var10 - 1, 1179648));
                        class150.field1747[var36] = class213.method1307(var13, 1245184);
                        class183.field2126[class43.field513][var10 - 1][var13] = var7;
                        var36 = var36 + 1 & 0xFFF;
                    }
                    var13++;
                    if (var13 < class196.field2329) {
                        if ((var10 - 1) >= 0 && class183.field2126[class43.field513][var10 - 1][var13] != var7 && (class222.field2770[class43.field513][var10][var13] & 0x4) == 0 && (class222.field2770[class43.field513][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class52.field615[var36] = class213.method1307(class213.method1307(var10 - 1, 1179648), 1375731712);
                            class150.field1747[var36] = class213.method1307(1245184, var13);
                            class183.field2126[class43.field513][var10 - 1][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class183.field2126[class43.field513][var10][var13] != var7) {
                            class52.field615[var36] = class213.method1307(318767104, class213.method1307(var10, 5373952));
                            class150.field1747[var36] = class213.method1307(5439488, var13);
                            class183.field2126[class43.field513][var10][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class22.field232 > var10 + 1 && class183.field2126[class43.field513][var10 + 1][var13] != var7 && (class222.field2770[class43.field513][var10][var13] & 0x4) == 0 && (class222.field2770[class43.field513][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class52.field615[var36] = class213.method1307(-1845493760, class213.method1307(5373952, var10 + 1));
                            class150.field1747[var36] = class213.method1307(var13, 5439488);
                            class183.field2126[class43.field513][var10 + 1][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if (class22.field232 > (var10 + 1) && class183.field2126[class43.field513][var10 + 1][var13] != var7) {
                        class52.field615[var36] = class213.method1307(1392508928, class213.method1307(var10 + 1, 9568256));
                        class150.field1747[var36] = class213.method1307(9633792, var13);
                        var36 = var36 + 1 & 0xFFF;
                        class183.field2126[class43.field513][var10 + 1][var13] = var7;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var10 - 1) >= 0 && class183.field2126[class43.field513][var10 - 1][var13] != var7 && (class222.field2770[class43.field513][var10][var13] & 0x4) == 0 && (class222.field2770[class43.field513][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class52.field615[var36] = class213.method1307(301989888, class213.method1307(13762560, var10 - 1));
                            class150.field1747[var36] = class213.method1307(13828096, var13);
                            var36 = var36 + 1 & 0xFFF;
                            class183.field2126[class43.field513][var10 - 1][var13] = var7;
                        }
                        if (class183.field2126[class43.field513][var10][var13] != var7) {
                            class52.field615[var36] = class213.method1307(-1828716544, class213.method1307(var10, 13762560));
                            class150.field1747[var36] = class213.method1307(13828096, var13);
                            class183.field2126[class43.field513][var10][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                        if (class22.field232 > (var10 + 1) && class183.field2126[class43.field513][var10 + 1][var13] != var7 && (class222.field2770[class43.field513][var10][var13] & 0x4) == 0 && (class222.field2770[class43.field513][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class52.field615[var36] = class213.method1307(class213.method1307(9568256, var10 + 1), -771751936);
                            class150.field1747[var36] = class213.method1307(9633792, var13);
                            class183.field2126[class43.field513][var10 + 1][var13] = var7;
                            var36 = var36 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class17.field188[arg2] != -1000000) {
                class17.field188[arg2] += 10;
                class416.field5691[arg2] -= 50;
                class336.field4584[arg2] += 50;
                class186.field2160[arg2] += 50;
                class440.field6074[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6130++;
        if (this.field6131 != null) {
            this.field6131.method405();
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
    private final void method2749(int arg0, int arg1, int arg2) {
        field6154++;
        if (arg2 >= -64) {
            return;
        }
        label90: while (true) {
            if (this.field6157 == null) {
                if (this.field6150) {
                    return;
                }
                this.method2751(-1, false);
                if (this.field6157 == null) {
                    return;
                }
            }
            int var4 = class106.field1273 - this.field6127;
            if (var4 > 100 && this.field6157.field1801 > 0) {
                int var5 = this.field6157.field1821.length - this.field6157.field1801;
                while (var5 > this.field6162 && var4 > this.field6157.field1817[this.field6162]) {
                    var4 -= this.field6157.field1817[this.field6162];
                    this.field6162++;
                }
                if (var5 <= this.field6162) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field6157.field1821.length; var7++) {
                        var6 += this.field6157.field1817[var7];
                    }
                    var4 %= var6;
                }
                this.field6160 = this.field6162 + 1;
                if (this.field6160 >= this.field6157.field1821.length) {
                    this.field6160 -= this.field6157.field1801;
                    if (this.field6160 < 0 || this.field6157.field1821.length <= this.field6160) {
                        this.field6160 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field6157.field1817[this.field6162]) {
                            this.field6128 = var4;
                            this.field6127 = class106.field1273 - var4;
                            return;
                        }
                        class325.method2038(arg1, arg0, false, this.field6157, this.field6162, (byte) -100);
                        var4 -= this.field6157.field1817[this.field6162];
                        this.field6162++;
                        if (this.field6162 >= this.field6157.field1821.length) {
                            this.field6162 -= this.field6157.field1801;
                            if (this.field6162 < 0 || this.field6162 >= this.field6157.field1821.length) {
                                this.field6157 = null;
                                continue label90;
                            }
                        }
                        this.field6160 = this.field6162 + 1;
                    } while (this.field6157.field1821.length > this.field6160);
                    this.field6160 -= this.field6157.field1801;
                } while (this.field6160 >= 0 && this.field6160 < this.field6157.field1821.length);
                this.field6160 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILuo;)V")
    public final void method2750(int arg0, class118 arg1) {
        if (arg0 < -114) {
            field6144++;
            this.method2746(131072, arg1, this.field6140, this.field6159, true, false, true);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
    private final void method2751(int arg0, boolean arg1) {
        field6134++;
        int var3 = arg0;
        boolean var4 = arg1;
        if (arg0 == -1) {
            class446 var5 = class380.method2361(this.field6132, -29012);
            class446 var6 = var5;
            if (var5.field6233 != null) {
                var5 = var5.method2759(24964);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field6245 != null) {
                if (this.field6157 != null && var5.method2771(this.field6157.field1809, (byte) 124)) {
                    return;
                }
                var3 = var5.method2760(false);
                if (this.field6158 != var5.field6209) {
                    var4 = var5.field6236;
                }
            } else if (var5.field6207 == -1) {
                if (var6 != null && var6.field6245 != null) {
                    if (this.field6157 != null && var6.method2771(this.field6157.field1809, (byte) 124)) {
                        return;
                    }
                    var3 = var6.method2760(arg1);
                    if (this.field6158 != var6.field6209) {
                        var4 = var6.field6236;
                    }
                } else if (var6 != null && var6.field6207 != -1 && this.field6158 != var6.field6209) {
                    var4 = var6.field6236;
                    var3 = var6.field6207;
                }
            } else if (this.field6158 != var5.field6209) {
                var4 = var5.field6236;
                var3 = var5.field6207;
            }
        }
        if (var3 == -1) {
            this.field6157 = null;
            return;
        }
        this.field6156 = null;
        if (this.field6157 == null || this.field6157.field1809 != var3) {
            this.field6157 = class430.method2621((byte) -44, var3);
        } else if (this.field6157.field1804 == 0) {
            return;
        }
        if (this.field6157.field1821 == null) {
            this.field6157 = null;
            return;
        }
        if (var4) {
            this.field6162 = (int) ((double) this.field6157.field1821.length * Math.random());
            this.field6128 = (int) (Math.random() * (double) this.field6157.field1817[this.field6162]) + 1;
        } else {
            this.field6162 = 0;
            this.field6128 = 1;
        }
        this.field6160 = this.field6162 + 1;
        if (this.field6160 < 0 || this.field6157.field1821.length <= this.field6160) {
            this.field6160 = -1;
        }
        this.field6127 = class106.field1273 - this.field6128;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public final void method2752(int arg0, int arg1) {
        if (arg0 == -9833) {
            field6147++;
            this.field6150 = true;
            this.method2751(arg1, false);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBI)V")
    public static final void method2753(int arg0, byte arg1, int arg2) {
        field6148++;
        int var3 = -80 / ((54 - arg1) / 63);
        class326 var4 = class212.method1300(arg0, (byte) -128);
        int var5 = var4.field4344;
        int var6 = var4.field4343;
        int var7 = var4.field4345;
        int var8 = class186.field2162[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        class247.method1613((byte) 30, var9 & arg2 << var6 | ~var9 & class56.field649[var5], var5);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLuo;Lge;IIZII)V")
    public final void method2754(byte arg0, class118 arg1, class386 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field6161++;
        class103[] var9 = arg2.method1443();
        class345[] var10 = arg2.method1475();
        if ((this.field6131 == null || this.field6131.field828) && (var9 != null || var10 != null)) {
            class446 var11 = class380.method2361(this.field6132, -29012);
            if (var11.field6233 != null) {
                var11 = var11.method2759(24964);
            }
            if (var11 != null) {
                this.field6131 = new class69(class106.field1273);
            }
        }
        if (arg0 != -32) {
            this.field6140 = 6;
        }
        if (this.field6131 == null) {
            return;
        }
        if (arg5) {
            this.field6131.method396(arg1, (long) class106.field1273, var9, var10, false);
        } else {
            this.field6131.method402((long) class106.field1273);
        }
        this.field6131.method406(this.field6137, arg7, arg4, arg3, arg6);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
    public final boolean method2755(int arg0) {
        if (arg0 == -1) {
            field6155++;
            return this.field6126;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class220[] var7 = class307.field4159;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class220 var10 = var7[var8];
            if (var10 != null && var10.field2716 == 2) {
                class320.method1996(arg3, arg5, arg1 >> 1, (var10.field2718 - class129.field1432 << 7) + var10.field2712, (-class278.field3608 + var10.field2721 << 7) + var10.field2724, false, var10.field2714 * 2, arg4 >> 1);
                if (class242.field3234[0] > -1 && class106.field1273 % 20 < 10) {
                    class150.field1756[var10.field2715].method2659(class242.field3234[0] + arg2 - 12, class242.field3234[1] + -28 + arg0);
                }
            }
        }
        int var9 = -44 % ((21 - arg6) / 49);
        field6146++;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Luo;Lnd;IIIIIIZI)V")
    public class444(class118 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field6139 = (byte) arg5;
        this.field6159 = arg6;
        this.field6163 = arg2;
        this.field6142 = arg8;
        this.field6132 = arg1.field6209;
        this.field6136 = arg3;
        this.field6140 = arg7;
        this.field6137 = (byte) arg4;
        this.field6126 = arg0.method708() && arg1.field6210 && !this.field6142;
        if (arg9 != -1) {
            this.field6150 = true;
        }
        this.method2751(arg9, false);
    }
}
