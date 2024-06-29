import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class90 {

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    private int field1469 = 128;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public int field1477 = -1;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    private int field1476 = 0;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    private int field1475 = 0;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    private int field1482 = 0;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Z")
    public boolean field1483 = false;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    private int field1484 = 128;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lob;")
    public static class292 field1468;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[S")
    private short[] field1467;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[S")
    private short[] field1470;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[S")
    private short[] field1471;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "[S")
    private short[] field1481;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 4)
    public static final void method647(int arg0) {
        field1478++;
        if (arg0 != -7833) {
            method647(-13);
        }
        class159.field2506.method1837(41);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLpe;)V", line = 18)
    public final void method648(byte arg0, class101 arg1) {
        while (true) {
            int var3 = arg1.method741(72);
            if (var3 == 0) {
                field1465++;
                if (arg0 > -65) {
                    this.method648((byte) 73, (class101) null);
                }
                return;
            }
            this.method650(-113, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIIIIZI)Z", line = 39)
    public static final boolean method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        field1466++;
        if (arg4 > -82) {
            return true;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class125.field1997[var13][var14] = 0;
                class86.field1321[var13][var14] = 99999999;
            }
        }
        int var15 = arg6;
        class125.field1997[arg6][arg12] = 99;
        class86.field1321[arg6][arg12] = 0;
        int var16 = 0;
        int var17 = arg12;
        byte var18 = 0;
        boolean var19 = false;
        class217.field3470[var18] = arg6;
        int var41 = var18 + 1;
        class297.field4688[var18] = arg12;
        int[][] var20 = class244.field3772[class41.field734].field879;
        label396: while (var16 != var41) {
            var15 = class217.field3470[var16];
            var17 = class297.field4688[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg10 == var15 && arg1 == var17) {
                var19 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class244.field3772[class41.field734].method422(arg10, arg1, (byte) -55, var17, arg3 - 1, arg9, var15, arg8)) {
                    var19 = true;
                    break;
                }
                if (arg3 < 10 && class244.field3772[class41.field734].method410(arg10, (byte) 63, arg3 - 1, var17, arg1, arg8, var15, arg9)) {
                    var19 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg2 != 0 && class244.field3772[class41.field734].method425(arg7, var17, -42, var15, arg8, arg5, arg10, arg2, arg1)) {
                var19 = true;
                break;
            }
            int var21 = class86.field1321[var15][var17] + 1;
            if (var15 > 0 && class125.field1997[var15 - 1][var17] == 0 && (var20[var15 - 1][var17] & 0x12C010E) == 0 && (var20[var15 - 1][var17 + arg8 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= (arg8 - 1)) {
                        class217.field3470[var41] = var15 - 1;
                        class297.field4688[var41] = var17;
                        class125.field1997[var15 - 1][var17] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class86.field1321[var15 - 1][var17] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var17 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class125.field1997[var15 + 1][var17] == 0 && (var20[arg8 + var15][var17] & 0x12C0183) == 0 && (var20[arg8 + var15][arg8 + var17 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (arg8 - 1 <= var23) {
                        class217.field3470[var41] = var15 + 1;
                        class297.field4688[var41] = var17;
                        var41 = var41 + 1 & 0xFFF;
                        class125.field1997[var15 + 1][var17] = 8;
                        class86.field1321[var15 + 1][var17] = var21;
                        break;
                    }
                    if ((var20[arg8 + var15][var17 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var17 > 0 && class125.field1997[var15][var17 - 1] == 0 && (var20[var15][var17 - 1] & 0x12C010E) == 0 && (var20[arg8 + var15 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if ((arg8 - 1) <= var24) {
                        class217.field3470[var41] = var15;
                        class297.field4688[var41] = var17 - 1;
                        class125.field1997[var15][var17 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class86.field1321[var15][var17 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var17 < 102 && class125.field1997[var15][var17 + 1] == 0 && (var20[var15][arg8 + var17] & 0x12C0138) == 0 && (var20[arg8 + var15 - 1][arg8 + var17] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if ((arg8 - 1) <= var25) {
                        class217.field3470[var41] = var15;
                        class297.field4688[var41] = var17 + 1;
                        class125.field1997[var15][var17 + 1] = 4;
                        var41 = var41 + 1 & 0xFFF;
                        class86.field1321[var15][var17 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg8 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var17 > 0 && class125.field1997[var15 - 1][var17 - 1] == 0 && (var20[var15 - 1][var17 + arg8 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var17 - 1] & 0x12C010E) == 0 && (var20[arg8 + var15 - 1 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= arg8 - 1) {
                        class217.field3470[var41] = var15 - 1;
                        class297.field4688[var41] = var17 - 1;
                        class125.field1997[var15 - 1][var17 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class86.field1321[var15 - 1][var17 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var17 + var26 - 1] & 0x12C013E) != 0 || (var20[var15 + var26 - 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var17 > 0 && class125.field1997[var15 + 1][var17 - 1] == 0 && (var20[var15 + 1][var17 - 1] & 0x12C010E) == 0 && (var20[arg8 + var15][var17 - 1] & 0x12C0183) == 0 && (var20[arg8 + var15][var17 + arg8 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= arg8 - 1) {
                        class217.field3470[var41] = var15 + 1;
                        class297.field4688[var41] = var17 - 1;
                        class125.field1997[var15 + 1][var17 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class86.field1321[var15 + 1][var17 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + arg8][var17 + var27 - 1] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var17 < 102 && class125.field1997[var15 - 1][var17 + 1] == 0 && (var20[var15 - 1][var17 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg8 + var17] & 0x12C0138) == 0 && (var20[var15][arg8 + var17] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg8 - 1 <= var28) {
                        class217.field3470[var41] = var15 - 1;
                        class297.field4688[var41] = var17 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class125.field1997[var15 - 1][var17 + 1] = 6;
                        class86.field1321[var15 - 1][var17 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var17 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][arg8 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var17 < 102 && class125.field1997[var15 + 1][var17 + 1] == 0 && (var20[var15 + 1][arg8 + var17] & 0x12C0138) == 0 && (var20[var15 + arg8][arg8 + var17] & 0x12C01E0) == 0 && (var20[arg8 + var15][var17 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg8 - 1); var29++) {
                    if ((var20[var29 + var15 + 1][arg8 + var17] & 0x12C01F8) != 0 || (var20[var15 + arg8][var17 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label396;
                    }
                }
                class217.field3470[var41] = var15 + 1;
                class297.field4688[var41] = var17 + 1;
                var41 = var41 + 1 & 0xFFF;
                class125.field1997[var15 + 1][var17 + 1] = 12;
                class86.field1321[var15 + 1][var17 + 1] = var21;
            }
        }
        class122.field1951 = 0;
        if (!var19) {
            if (!arg11) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg10 - var32; var33 <= (arg10 + var32); var33++) {
                for (int var34 = arg1 - var32; var34 <= (arg1 + var32); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class86.field1321[var33][var34] < 100) {
                        int var35 = 0;
                        if (var33 < arg10) {
                            var35 = arg10 - var33;
                        } else if (var33 > (arg7 + arg10 - 1)) {
                            var35 = 1 - (arg7 + arg10 - var33);
                        }
                        int var36 = 0;
                        if (var34 < arg1) {
                            var36 = arg1 - var34;
                        } else if (arg1 + arg2 - 1 < var34) {
                            var36 = var34 + 1 - arg1 - arg2;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var30 || var30 == var37 && var31 > class86.field1321[var33][var34]) {
                            var31 = class86.field1321[var33][var34];
                            var17 = var34;
                            var15 = var33;
                            var30 = var37;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg6 == var15 && arg12 == var17) {
                return false;
            }
            class122.field1951 = 1;
        }
        byte var38 = 0;
        class217.field3470[var38] = var15;
        int var42 = var38 + 1;
        class297.field4688[var38] = var17;
        int var39;
        int var40 = var39 = class125.field1997[var15][var17];
        while (arg6 != var15 || arg12 != var17) {
            if (var39 != var40) {
                var39 = var40;
                class217.field3470[var42] = var15;
                class297.field4688[var42++] = var17;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var17++;
            } else if ((var40 & 0x4) != 0) {
                var17--;
            }
            var40 = class125.field1997[var15][var17];
        }
        if (var42 > 0) {
            class303.method2108(arg0, var42, 1);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILpe;)V", line = 548)
    private final void method650(int arg0, int arg1, class101 arg2) {
        field1472++;
        if (arg1 == 1) {
            this.field1473 = arg2.method731(false);
        } else if (arg1 == 2) {
            this.field1477 = arg2.method731(false);
        } else if (arg1 == 4) {
            this.field1469 = arg2.method731(false);
        } else if (arg1 == 5) {
            this.field1484 = arg2.method731(false);
        } else if (arg1 == 6) {
            this.field1476 = arg2.method731(false);
        } else if (arg1 == 7) {
            this.field1475 = arg2.method741(14);
        } else if (arg1 == 8) {
            this.field1482 = arg2.method741(76);
        } else if (arg1 == 9) {
            this.field1483 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method741(44);
            this.field1481 = new short[var4];
            this.field1471 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1481[var5] = (short) arg2.method731(false);
                this.field1471[var5] = (short) arg2.method731(false);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method741(76);
            this.field1470 = new short[var6];
            this.field1467 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1470[var7] = (short) arg2.method731(false);
                this.field1467[var7] = (short) arg2.method731(false);
            }
        }
        if (arg0 >= -41) {
            this.method650(3, 97, (class101) null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 636)
    public static void method651(int arg0) {
        int var1 = 113 / ((arg0 - 76) / 41);
        field1468 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)Lfa;", line = 645)
    public final class199 method652(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 2026) {
            return (class199) null;
        }
        field1480++;
        class199 var5 = (class199) class215.field3431.method1830((long) this.field1479, (byte) 52);
        if (var5 == null) {
            class130 var6 = class130.method969(class14.field257, this.field1473, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field1481 != null) {
                for (int var7 = 0; var7 < this.field1481.length; var7++) {
                    var6.method971(this.field1481[var7], this.field1471[var7]);
                }
            }
            if (this.field1470 != null) {
                for (int var8 = 0; var8 < this.field1470.length; var8++) {
                    var6.method979(this.field1470[var8], this.field1467[var8]);
                }
            }
            var5 = var6.method976(this.field1475 + 64, this.field1482 + 850, -30, -50, -30);
            class215.field3431.method1831((long) this.field1479, var5, arg0 ^ 0xFFFFCE5D);
        }
        class199 var9;
        if (this.field1477 == -1 || arg1 == -1) {
            var9 = var5.method1103(true, true, true);
        } else {
            var9 = class6.method28(this.field1477, 2).method1940(arg2, arg1, arg3, var5, true);
        }
        if (this.field1469 != 128 || this.field1484 != 128) {
            var9.method1106(this.field1469, this.field1484, this.field1469);
        }
        if (this.field1476 != 0) {
            if (this.field1476 == 90) {
                var9.method1105();
            }
            if (this.field1476 == 180) {
                var9.method1112();
            }
            if (this.field1476 == 270) {
                var9.method1115();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILja;)[Lnb;", line = 734)
    public static final class315[] method653(boolean arg0, int arg1, class64 arg2) {
        field1474++;
        if (arg0) {
            method653(false, -49, (class64) null);
        }
        return class289.method2030(arg2, 128, arg1) ? class273.method1969(0) : null;
    }
}
