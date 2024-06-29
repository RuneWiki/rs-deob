import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class182 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
    public boolean field2488 = false;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public int field2502 = -1;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public int field2497 = -1;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field2489 = 5;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field2505 = -1;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
    public boolean field2490 = false;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public int field2487 = 2;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public int field2508 = -1;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public int field2510 = -1;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Z")
    public boolean field2504 = false;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Z")
    public boolean field2496 = false;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public int field2512 = 99;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field2511 = 0;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lvn;")
    public static class169 field2495 = new class169();

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field2494;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[I")
    public int[] field2493;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "[I")
    private int[] field2506;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "[I")
    public int[] field2513;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[Z")
    public boolean[] field2486;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "[[I")
    public int[][] field2501;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 10)
    public static final void method1180(byte arg0) {
        field2507++;
        if (arg0 != 45) {
            return;
        }
        for (int var1 = 0; var1 < class166.field2327.length; var1++) {
            for (int var2 = 0; var2 < class166.field2327[0].length; var2++) {
                for (int var3 = 0; var3 < class166.field2327[0][0].length; var3++) {
                    class166.field2327[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILmj;IBIIII)Lmj;", line = 49)
    public final class393 method1181(int arg0, class393 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2509++;
        int var9 = this.field2513[arg7];
        int var10 = this.field2493[arg7];
        class152 var11 = class158.method1040(var10 >> 16, false);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method717((byte) 1, arg6, true);
        }
        class152 var13 = null;
        if ((this.field2490 || class98.field1105) && arg0 != -1 && this.field2493.length > arg0) {
            int var14 = this.field2493[arg0];
            var13 = class158.method1040(var14 >> 16, false);
            arg0 = var14 & 0xFFFF;
        }
        int var15 = 48 % ((3 - arg4) / 45);
        if (this.field2496) {
            arg6 |= 0x200;
        }
        if (var11.method914(var12, -1)) {
            arg6 |= 0x80;
        }
        if (var11.method908(var12, (byte) -90)) {
            arg6 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method914(arg0, -1)) {
                arg6 |= 0x80;
            }
            if (var13.method908(arg0, (byte) -90)) {
                arg6 |= 0x100;
            }
        }
        int var16 = arg6 | 0x20;
        class393 var17 = arg1.method717(arg3, var16, true);
        var17.method2503(var9, arg0, var12, (byte) -104, this.field2496, var11, arg2 - 1, arg5, var13);
        return var17;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZI)I", line = 105)
    public final int method1182(int arg0, int arg1, boolean arg2, int arg3) {
        field2492++;
        if (arg3 != 128) {
            this.field2493 = null;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2493[arg0];
        class152 var8 = null;
        class152 var9 = class158.method1040(var7 >> 16, false);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2490 || class98.field1105) && arg1 != -1 && arg1 < this.field2493.length) {
            int var11 = this.field2493[arg1];
            var8 = class158.method1040(var11 >> 16, false);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2496) {
            var5 |= 0x200;
        }
        if (var9.method914(var10, -1)) {
            var5 |= 0x80;
        }
        if (var9.method908(var10, (byte) -125)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method914(var6, -1)) {
                var5 |= 0x80;
            }
            if (var8.method908(var6, (byte) -118)) {
                var5 |= 0x100;
            }
        }
        if (this.field2506 != null && arg2) {
            if (arg0 < this.field2506.length) {
                int var12 = this.field2506[arg0];
                if (var12 != 65535) {
                    class152 var13 = class158.method1040(var12 >> 16, false);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method914(var14, -1)) {
                            var5 |= 0x80;
                        }
                        if (var13.method908(var14, (byte) -105)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field2490 || class98.field1105) && arg1 != -1 && this.field2506.length > arg1) {
                int var15 = this.field2506[arg1];
                if (var15 != 65535) {
                    class152 var16 = class158.method1040(var15 >> 16, false);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method914(var17, arg3 - 129)) {
                            var5 |= 0x80;
                        }
                        if (var16.method908(var17, (byte) -124)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 217)
    public static void method1183(int arg0) {
        if (arg0 != 2) {
            field2511 = -70;
        }
        field2495 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljf;Len;III)V", line = 228)
    public static final void method1184(class119 arg0, class174 arg1, int arg2, int arg3, int arg4) {
        field2491++;
        class121 var5 = arg0.method678((byte) -37, arg1);
        if (arg3 != -1637) {
            method1187(87);
        }
        if (var5 == null) {
            return;
        }
        arg1.method968(arg2, arg4, arg0.field1552 + arg2, arg0.field1498 + arg4);
        if (class114.field1318 == 2 || class114.field1318 == 5 || class196.field2672 == null) {
            arg1.method980(-16777216, var5, arg2, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class231.field3128 == 4) {
            var6 = class355.field5200;
            var7 = (int) (-class276.field3893) & 0x3FFF;
            var8 = 4096;
            var9 = class132.field1811;
        } else {
            var9 = class390.field5715.field1311;
            var8 = 4096 - (class164.field2288 * 16);
            var6 = class390.field5715.field1304;
            var7 = (int) (-class276.field3893) + class260.field3585 & 0x3FFF;
        }
        int var10 = var6 / 32 + 48 - ((class279.field3935 + -104) * 2);
        int var11 = (class164.field2287 * 4) + 48 + 208 - (var9 / 32) - (class164.field2287 * 2);
        class196.field2672.method91((float) arg0.field1552 / 2.0F + (float) arg2, (float) arg0.field1498 / 2.0F + (float) arg4, (float) var10, (float) var11, var8, var7 << 2, var5, arg2, arg4);
        for (class193 var12 = (class193) class93.field1027.method1124(arg3 + 1636); var12 != null; var12 = (class193) class93.field1027.method1119(false)) {
            int var50 = var12.field2631;
            int var51 = (class407.field5911.field3015[var50] >> 14 & 0x3FFF) - class40.field427;
            int var52 = (class407.field5911.field3015[var50] & 0x3FFF) - class217.field2975;
            int var53 = var51 * 4 + 2 - var6 / 32;
            int var54 = var52 * 4 + 2 - (var9 / 32);
            class116.method644(65535, arg0, var54, arg4, arg1, arg2, class407.field5911.field3016[var50], var5, var53);
        }
        for (int var13 = 0; var13 < class26.field253; var13++) {
            int var47 = class366.field5350[var13] * 4 + 2 - (var6 / 32);
            int var48 = class138.field1968[var13] * 4 + (2 - var9 / 32);
            class327 var49 = class157.method1036(arg3 + 1637, class21.field227[var13]);
            if (var49.field4645 != null) {
                var49 = var49.method2029(-1);
                if (var49 == null || var49.field4648 == -1) {
                    continue;
                }
            }
            class116.method644(65535, arg0, var48, arg4, arg1, arg2, var49.field4648, var5, var47);
        }
        for (class111 var14 = (class111) class319.field4527.method1212(-111); var14 != null; var14 = (class111) class319.field4527.method1207(false)) {
            int var44 = (int) (var14.field5248 >> 28 & 0x3L);
            if (class19.field204 == var44) {
                int var45 = (int) (var14.field5248 & 0x3FFFL) * 4 + 2 - (var6 / 32);
                int var46 = (int) (var14.field5248 >> 14 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                class327.method2016(arg2, arg4, var46, var5, arg0, (byte) -52, var45, class12.field130[0]);
            }
        }
        for (int var15 = 0; var15 < class426.field6168; var15++) {
            class358 var40 = class81.field917[class201.field2770[var15]];
            if (var40 != null && var40.method2280(255)) {
                class335 var41 = var40.field5229;
                if (var41 != null && var41.field4984 != null) {
                    var41 = var41.method2162(0);
                }
                if (var41 != null && var41.field4927 && var41.field4921) {
                    int var42 = var40.field1304 / 32 - (var6 / 32);
                    int var43 = var40.field1311 / 32 - (var9 / 32);
                    if (var41.field4947 == -1) {
                        class327.method2016(arg2, arg4, var43, var5, arg0, (byte) -110, var42, class12.field130[1]);
                    } else {
                        class116.method644(65535, arg0, var43, arg4, arg1, arg2, var41.field4947, var5, var42);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class148.field2082; var16++) {
            class133 var32 = class375.field5473[class294.field4217[var16]];
            if (var32 != null && var32.method793(255)) {
                int var33 = var32.field1304 / 32 - (var6 / 32);
                int var34 = var32.field1311 / 32 - (var9 / 32);
                boolean var35 = false;
                for (int var36 = 0; var36 < class100.field1124; var36++) {
                    if (var32.field1847.equals(class302.field4300[var36]) && class315.field4490[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class54.field607; var38++) {
                    if (var32.field1847.equals(class166.field2323[var38].field5054)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class390.field5715.field1825 != 0 && var32.field1825 != 0 && class390.field5715.field1825 == var32.field1825) {
                    var39 = true;
                }
                if (var35) {
                    class327.method2016(arg2, arg4, var34, var5, arg0, (byte) -53, var33, class12.field130[3]);
                } else if (var37) {
                    class327.method2016(arg2, arg4, var34, var5, arg0, (byte) -56, var33, class12.field130[5]);
                } else if (var39) {
                    class327.method2016(arg2, arg4, var34, var5, arg0, (byte) -113, var33, class12.field130[4]);
                } else {
                    class327.method2016(arg2, arg4, var34, var5, arg0, (byte) -111, var33, class12.field130[2]);
                }
            }
        }
        class58[] var17 = class286.field4039;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class58 var21 = var17[var18];
            if (var21 != null && var21.field708 != 0 && (class221.field3033 % 20) < 10) {
                if (var21.field708 == 1 && var21.field697 >= 0 && var21.field697 < class81.field917.length) {
                    class358 var22 = class81.field917[var21.field697];
                    if (var22 != null) {
                        int var23 = var22.field1304 / 32 - (var6 / 32);
                        int var24 = var22.field1311 / 32 - (var9 / 32);
                        class269.method1707(arg4, var21.field696, var5, 360000, arg2, arg0, var23, 1093438415, var24);
                    }
                }
                if (var21.field708 == 2) {
                    int var25 = (var21.field707 - class40.field427) * 4 + 2 - (var6 / 32);
                    int var26 = (var21.field702 - class217.field2975) * 4 + 2 - (var9 / 32);
                    int var27 = var21.field698 * 4;
                    int var28 = var27 * var27;
                    class269.method1707(arg4, var21.field696, var5, var28, arg2, arg0, var25, arg3 ^ 0xBED37254, var26);
                }
                if (var21.field708 == 10 && var21.field697 >= 0 && var21.field697 < class375.field5473.length) {
                    class133 var29 = class375.field5473[var21.field697];
                    if (var29 != null) {
                        int var30 = var29.field1304 / 32 - (var6 / 32);
                        int var31 = var29.field1311 / 32 - (var9 / 32);
                        class269.method1707(arg4, var21.field696, var5, 360000, arg2, arg0, var30, 1093438415, var31);
                    }
                }
            }
        }
        if (class231.field3128 == 4) {
            return;
        }
        if (class450.field6576 != 0) {
            int var19 = class450.field6576 * 4 + 2 - (var6 / 32 + -((class390.field5715.method786((byte) 70) + -1) * 2));
            int var20 = class435.field6384 * 4 + ((class390.field5715.method786((byte) 70) - 1) * 2) + 2 - var9 / 32;
            class327.method2016(arg2, arg4, var20, var5, arg0, (byte) -126, var19, class137.field1928[class196.field2658 ? 1 : 0]);
        }
        arg1.method1150((byte) 126, arg0.field1498 / 2 + (arg4 - 1), arg0.field1552 / 2 + -1 + arg2, 3, 3, -1);
        return;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILbk;)V", line = 524)
    private final void method1185(int arg0, int arg1, class211 arg2) {
        int var4 = -89 / ((arg0 - 76) / 37);
        field2500++;
        if (arg1 == 1) {
            int var14 = arg2.method1355(32136);
            this.field2513 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field2513[var15] = arg2.method1355(32136);
            }
            this.field2493 = new int[var14];
            for (int var16 = 0; var16 < var14; var16++) {
                this.field2493[var16] = arg2.method1355(32136);
            }
            for (int var17 = 0; var17 < var14; var17++) {
                this.field2493[var17] = (arg2.method1355(32136) << 16) + this.field2493[var17];
            }
        } else if (arg1 == 2) {
            this.field2510 = arg2.method1355(32136);
        } else if (arg1 == 3) {
            this.field2486 = new boolean[256];
            int var12 = arg2.method1342((byte) -127);
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2486[arg2.method1342((byte) -127)] = true;
            }
        } else if (arg1 == 4) {
            this.field2488 = true;
        } else if (arg1 == 5) {
            this.field2489 = arg2.method1342((byte) -126);
        } else if (arg1 == 6) {
            this.field2497 = arg2.method1355(32136);
        } else if (arg1 == 7) {
            this.field2502 = arg2.method1355(32136);
        } else if (arg1 == 8) {
            this.field2512 = arg2.method1342((byte) -128);
        } else if (arg1 == 9) {
            this.field2505 = arg2.method1342((byte) -127);
        } else if (arg1 == 10) {
            this.field2508 = arg2.method1342((byte) -127);
        } else if (arg1 == 11) {
            this.field2487 = arg2.method1342((byte) -126);
        } else if (arg1 == 12) {
            int var9 = arg2.method1342((byte) -126);
            this.field2506 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2506[var10] = arg2.method1355(32136);
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2506[var11] = (arg2.method1355(32136) << 16) + this.field2506[var11];
            }
        } else if (arg1 == 13) {
            int var5 = arg2.method1355(32136);
            this.field2501 = new int[var5][];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method1342((byte) -128);
                if (var7 > 0) {
                    this.field2501[var6] = new int[var7];
                    this.field2501[var6][0] = arg2.method1353(102);
                    for (int var8 = 1; var8 < var7; var8++) {
                        this.field2501[var6][var8] = arg2.method1355(32136);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2496 = true;
        } else if (arg1 == 15) {
            this.field2490 = true;
        } else if (arg1 == 16) {
            this.field2504 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 682)
    public final void method1186(int arg0) {
        if (this.field2508 == -1) {
            if (this.field2486 == null) {
                this.field2508 = 0;
            } else {
                this.field2508 = 2;
            }
        }
        int var2 = 1 / ((arg0 + 62) / 62);
        field2503++;
        if (this.field2505 != -1) {
            return;
        }
        if (this.field2486 == null) {
            this.field2505 = 0;
        } else {
            this.field2505 = 2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Luh;", line = 711)
    public static final class92 method1187(int arg0) {
        field2499++;
        try {
            if (arg0 != 2) {
                method1184((class119) null, (class174) null, 89, -76, -69);
            }
            return (class92) Class.forName("uq").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZLmj;II)Lmj;", line = 751)
    public final class393 method1188(int arg0, int arg1, boolean arg2, class393 arg3, int arg4, int arg5) {
        field2498++;
        int var7 = this.field2513[arg4];
        int var8 = this.field2493[arg4];
        class152 var9 = class158.method1040(var8 >> 16, false);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method717((byte) 1, arg0, true);
        }
        class152 var11 = null;
        if ((this.field2490 || class98.field1105) && arg5 != -1 && arg5 < this.field2493.length) {
            int var12 = this.field2493[arg5];
            var11 = class158.method1040(var12 >> 16, false);
            arg5 = var12 & 0xFFFF;
        }
        class152 var13 = null;
        class152 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2506 != null) {
            if (this.field2506.length > arg4) {
                var15 = this.field2506[arg4];
                if (var15 != 65535) {
                    var13 = class158.method1040(var15 >> 16, !arg2);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2490 || class98.field1105) && arg5 != -1 && arg5 < this.field2506.length) {
                var16 = this.field2506[arg5];
                if (var16 != 65535) {
                    var14 = class158.method1040(var16 >> 16, false);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2496) {
            arg0 |= 0x200;
        }
        if (var9.method914(var10, -1)) {
            arg0 |= 0x80;
        }
        if (var9.method908(var10, (byte) -111)) {
            arg0 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method914(var15, -1)) {
                arg0 |= 0x80;
            }
            if (var13.method908(var15, (byte) -108)) {
                arg0 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method914(arg5, -1)) {
                arg0 |= 0x80;
            }
            if (var11.method908(arg5, (byte) -103)) {
                arg0 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method914(var16, -1)) {
                arg0 |= 0x80;
            }
            if (var14.method908(var16, (byte) -103)) {
                arg0 |= 0x100;
            }
        }
        int var17 = arg0 | 0x20;
        class393 var18 = arg3.method717((byte) 1, var17, arg2);
        var18.method2503(var7, arg5, var10, (byte) 39, this.field2496, var9, arg1 - 1, 0, var11);
        if (var13 != null) {
            var18.method2503(var7, var16, var15, (byte) -107, this.field2496, var13, arg1 - 1, 0, var14);
        }
        return var18;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLbk;)V", line = 888)
    public final void method1189(boolean arg0, class211 arg1) {
        if (!arg0) {
            return;
        }
        field2514++;
        while (true) {
            int var3 = arg1.method1342((byte) -126);
            if (var3 == 0) {
                return;
            }
            this.method1185(-104, var3, arg1);
        }
    }
}
