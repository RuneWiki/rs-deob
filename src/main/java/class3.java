import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 implements class67 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lh;")
    private class42 field30 = new class42();

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    private int field51 = 0;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    private int field58 = 128;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "D")
    private double field47 = 1.0D;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "Lvb;")
    private class122 field57;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[Lva;")
    private class121[] field40;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lec;")
    public static class28 field44 = class28.method210(-46, "This world is full)3");

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lec;")
    public static class28 field33 = class28.method210(-46, ":chalreq:");

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Lec;")
    public static class28 field49 = class28.method210(-46, "To change your recovery questions:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WSet new recovery questions(W)3");

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field41 = 1;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lec;")
    public static class28 field43 = class28.method210(-46, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Lec;")
    public static class28 field50 = class28.method210(-46, " has logged in)3");

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lec;")
    public static class28 field35 = class28.method210(-46, "mapscene");

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lec;")
    public static class28 field34 = class28.method210(-46, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lcc;")
    public static class16 field31;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "[[B")
    public static byte[][] field52;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)Z")
    public final boolean method8(int arg0, int arg1) {
        if (arg0 != -20525) {
            this.field30 = null;
        }
        field45++;
        return this.field58 == 64;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)Z")
    public final boolean method9(int arg0, int arg1) {
        if (arg1 != 6920) {
            field33 = null;
        }
        field39++;
        return this.field40[arg0].field2601;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(II)V")
    public static final void method10(int arg0, int arg1) {
        field28++;
        int var2 = class110.method753((byte) 121, arg1).field644;
        if (var2 == 0) {
            return;
        }
        int var3 = class36.field818[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class60.method485(0.9D);
                ((class3) class60.field1331).method19(0.9D, arg0 - 24253);
            }
            if (var3 == 2) {
                class60.method485(0.8D);
                ((class3) class60.field1331).method19(0.8D, arg0 - 24207);
            }
            if (var3 == 3) {
                class60.method485(0.7D);
                ((class3) class60.field1331).method19(0.7D, -103);
            }
            if (var3 == 4) {
                class60.method485(0.6D);
                ((class3) class60.field1331).method19(0.6D, -101);
            }
            class95.method683((byte) 65);
            class117.field2492 = true;
        }
        if (arg0 != 24166) {
            return;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class77.field1735 != var4) {
                if (class77.field1735 == 0 && class47.field1074 != -1) {
                    class66.method533(class47.field1074, 0, var4, 0, 111, class61.field1344, false);
                    class7.field121 = 0;
                } else if (var4 == 0) {
                    class66.method528(false);
                    class7.field121 = 0;
                } else {
                    class98.method703(var4, (byte) 119);
                }
                class77.field1735 = var4;
            }
        }
        if (var2 == 9) {
            class119.field2544 = var3;
        }
        if (var2 == 8) {
            class80.field1847 = var3;
            class95.field2092 = true;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class50.field1176 = 127;
            }
            if (var3 == 1) {
                class50.field1176 = 96;
            }
            if (var3 == 2) {
                class50.field1176 = 64;
            }
            if (var3 == 3) {
                class50.field1176 = 32;
            }
            if (var3 == 4) {
                class50.field1176 = 0;
            }
        }
        if (var2 == 5) {
            class9.field175 = var3;
        }
        if (var2 == 6) {
            class4.field71 = var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)I")
    public static final int method11(int arg0) {
        int var1 = 3;
        if (class4.field72 < 310) {
            int var2 = class88.field1966 >> 7;
            int var3 = class37.field848.field1446 >> 7;
            int var4 = class37.field848.field1501 >> 7;
            int var5 = class94.field2079 >> 7;
            int var6;
            if (var4 > var5) {
                var6 = var4 - var5;
            } else {
                var6 = var5 - var4;
            }
            if ((class47.field1080[class122.field2657][var2][var5] & 0x4) != 0) {
                var1 = class122.field2657;
            }
            int var7;
            if (var2 < var3) {
                var7 = var3 - var2;
            } else {
                var7 = var2 - var3;
            }
            if (var6 >= var7) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var4 != var5) {
                    var9 += var8;
                    if (var5 < var4) {
                        var5++;
                    } else if (var5 > var4) {
                        var5--;
                    }
                    if ((class47.field1080[class122.field2657][var2][var5] & 0x4) != 0) {
                        var1 = class122.field2657;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var3 > var2) {
                            var2++;
                        } else if (var3 < var2) {
                            var2--;
                        }
                        if ((class47.field1080[class122.field2657][var2][var5] & 0x4) != 0) {
                            var1 = class122.field2657;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var6 * 65536 / var7;
                while (var2 != var3) {
                    if (var3 > var2) {
                        var2++;
                    } else if (var2 > var3) {
                        var2--;
                    }
                    if ((class47.field1080[class122.field2657][var2][var5] & 0x4) != 0) {
                        var1 = class122.field2657;
                    }
                    var10 += var11;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 > var5) {
                            var5++;
                        } else if (var5 > var4) {
                            var5--;
                        }
                        if ((class47.field1080[class122.field2657][var2][var5] & 0x4) != 0) {
                            var1 = class122.field2657;
                        }
                    }
                }
            }
        }
        if (arg0 < 69) {
            return -68;
        }
        field55++;
        if ((class47.field1080[class122.field2657][class37.field848.field1446 >> 7][class37.field848.field1501 >> 7] & 0x4) != 0) {
            var1 = class122.field2657;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method12(int arg0) {
        if (arg0 != 24976) {
            field52 = null;
        }
        field49 = null;
        field52 = null;
        field44 = null;
        field35 = null;
        field33 = null;
        field43 = null;
        field50 = null;
        field31 = null;
        field34 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)V")
    public final void method13(int arg0, byte arg1) {
        field48++;
        int var3 = 0;
        if (arg1 != 79) {
            return;
        }
        while (var3 < this.field40.length) {
            class121 var4 = this.field40[var3];
            if (var4 != null && var4.field2597 != 0 && var4.field2606) {
                var4.method919(arg0);
                var4.field2606 = false;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        field29++;
        if (arg0 != 68) {
            this.method8(-33, -5);
        }
        class121 var3 = this.field40[arg1];
        if (var3 != null) {
            if (var3.field2604 != null) {
                this.field30.method324(-75, var3);
                var3.field2606 = true;
                return var3.field2604;
            }
            boolean var4 = var3.method920(this.field47, this.field58, this.field57);
            if (var4) {
                if (this.field51 == 0) {
                    class121 var5 = (class121) this.field30.method338((byte) 108);
                    var5.method921();
                } else {
                    this.field51--;
                }
                this.field30.method324(-102, var3);
                var3.field2606 = true;
                return var3.field2604;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public static final void method15(int arg0) {
        if (arg0 != -17859) {
            method16(-47, -33, -23, null, null, 101, 34, -36, 89);
        }
        field37++;
        class111.field2340 = true;
        class72.field1591 = true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILta;Lub;IIII)V")
    public static final void method16(int arg0, int arg1, int arg2, class111 arg3, class117 arg4, int arg5, int arg6, int arg7, int arg8) {
        field38++;
        if (class72.field1591 && (class47.field1080[0][arg6][arg0] & 0x2) == 0) {
            if ((class47.field1080[arg7][arg6][arg0] & 0x10) != 0) {
                return;
            }
            if (class16.method88(arg6, arg0, (byte) 96, arg7) != class42.field905) {
                return;
            }
        }
        if (class32.field681 > arg7) {
            class32.field681 = arg7;
        }
        int var9 = class118.field2523[arg7][arg6][arg0];
        int var10 = class118.field2523[arg7][arg6 + 1][arg0];
        int var11 = class118.field2523[arg7][arg6][arg0 + 1];
        int var12 = class118.field2523[arg7][arg6 + 1][arg0 + 1];
        int var13 = var10 + var12 + var9 + var11 >> 2;
        class45 var14 = class72.method566(arg2, 106);
        int var15 = (arg0 << 7) + arg6 + (arg2 << 14) + 1073741824;
        if (var14.field977 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = (arg1 << 6) + arg8;
        if (var14.field991 == 1) {
            var16 += 256;
        }
        if (arg8 == 22) {
            if (!class72.field1591 || var14.field977 != 0 || var14.field960) {
                class87 var17;
                if (var14.field973 == -1 && var14.field982 == null) {
                    var17 = var14.method362(var12, arg1, 22, var11, var9, -91, var10);
                } else {
                    var17 = new class86(arg2, 22, arg1, var9, var10, var12, var11, var14.field973, true);
                }
                arg3.method792(arg7, arg6, arg0, var13, var17, var15, var16);
                if (var14.field980 && var14.field977 == 1 && arg4 != null) {
                    arg4.method845(arg6, 2097152, arg0);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class87 var37;
            if (var14.field973 == -1 && var14.field982 == null) {
                var37 = var14.method362(var12, arg1, 10, var11, var9, arg5 - 113, var10);
            } else {
                var37 = new class86(arg2, 10, arg1, var9, var10, var12, var11, var14.field973, true);
            }
            if (var37 != null) {
                int var38 = 0;
                if (arg8 == 11) {
                    var38 += 256;
                }
                int var39;
                int var40;
                if (arg1 == 1 || arg1 == 3) {
                    var39 = var14.field979;
                    var40 = var14.field1002;
                } else {
                    var39 = var14.field1002;
                    var40 = var14.field979;
                }
                if (arg3.method807(arg7, arg6, arg0, var13, var39, var40, var37, var38, var15, var16) && var14.field1007) {
                    class33 var41;
                    if (var37 instanceof class33) {
                        var41 = (class33) var37;
                    } else {
                        var41 = var14.method362(var12, arg1, 10, var11, var9, -100, var10);
                    }
                    if (var41 != null) {
                        for (int var42 = 0; var42 <= var39; var42++) {
                            for (int var43 = 0; var43 <= var40; var43++) {
                                int var44 = var41.method262() / 4;
                                if (var44 > 30) {
                                    var44 = 30;
                                }
                                if (var44 > class76.field1720[arg7][arg6 + var42][arg0 + var43]) {
                                    class76.field1720[arg7][arg6 + var42][arg0 + var43] = (byte) var44;
                                }
                            }
                        }
                    }
                }
            }
            if (var14.field980 && arg4 != null) {
                arg4.method831(arg6, var14.field976, arg1, arg5 + 18693, var14.field979, var14.field1002, arg0);
            }
        } else if (arg8 >= 12) {
            class87 var18;
            if (var14.field973 == -1 && var14.field982 == null) {
                var18 = var14.method362(var12, arg1, arg8, var11, var9, -96, var10);
            } else {
                var18 = new class86(arg2, arg8, arg1, var9, var10, var12, var11, var14.field973, true);
            }
            arg3.method807(arg7, arg6, arg0, var13, 1, 1, var18, 0, var15, var16);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg7 > 0) {
                class117.field2472[arg7][arg6][arg0] = class117.method840(class117.field2472[arg7][arg6][arg0], 2340);
            }
            if (var14.field980 && arg4 != null) {
                arg4.method831(arg6, var14.field976, arg1, 18691, var14.field979, var14.field1002, arg0);
            }
        } else if (arg8 == 0) {
            class87 var19;
            if (var14.field973 == -1 && var14.field982 == null) {
                var19 = var14.method362(var12, arg1, 0, var11, var9, -107, var10);
            } else {
                var19 = new class86(arg2, 0, arg1, var9, var10, var12, var11, var14.field973, true);
            }
            arg3.method803(arg7, arg6, arg0, var13, var19, null, class16.field319[arg1], 0, var15, var16);
            if (arg1 == 0) {
                if (var14.field1007) {
                    class76.field1720[arg7][arg6][arg0] = 50;
                    class76.field1720[arg7][arg6][arg0 + 1] = 50;
                }
                if (var14.field963) {
                    class117.field2472[arg7][arg6][arg0] = class117.method840(class117.field2472[arg7][arg6][arg0], 585);
                }
            } else if (arg1 == 1) {
                if (var14.field1007) {
                    class76.field1720[arg7][arg6][arg0 + 1] = 50;
                    class76.field1720[arg7][arg6 + 1][arg0 + 1] = 50;
                }
                if (var14.field963) {
                    class117.field2472[arg7][arg6][arg0 + 1] = class117.method840(class117.field2472[arg7][arg6][arg0 + 1], 1170);
                }
            } else if (arg1 == 2) {
                if (var14.field1007) {
                    class76.field1720[arg7][arg6 + 1][arg0] = 50;
                    class76.field1720[arg7][arg6 + 1][arg0 + 1] = 50;
                }
                if (var14.field963) {
                    class117.field2472[arg7][arg6 + 1][arg0] = class117.method840(class117.field2472[arg7][arg6 + 1][arg0], 585);
                }
            } else if (arg1 == 3) {
                if (var14.field1007) {
                    class76.field1720[arg7][arg6][arg0] = 50;
                    class76.field1720[arg7][arg6 + 1][arg0] = 50;
                }
                if (var14.field963) {
                    class117.field2472[arg7][arg6][arg0] = class117.method840(class117.field2472[arg7][arg6][arg0], 1170);
                }
            }
            if (var14.field980 && arg4 != null) {
                arg4.method841(19398920, var14.field976, arg0, arg1, arg8, arg6);
            }
            if (var14.field955 != 16) {
                arg3.method785(arg7, arg6, arg0, var14.field955);
            }
        } else if (~arg8 == arg5) {
            class87 var20;
            if (var14.field973 == -1 && var14.field982 == null) {
                var20 = var14.method362(var12, arg1, 1, var11, var9, arg5 ^ 0x6E, var10);
            } else {
                var20 = new class86(arg2, 1, arg1, var9, var10, var12, var11, var14.field973, true);
            }
            arg3.method803(arg7, arg6, arg0, var13, var20, null, class92.field2022[arg1], 0, var15, var16);
            if (var14.field1007) {
                if (arg1 == 0) {
                    class76.field1720[arg7][arg6][arg0 + 1] = 50;
                } else if (arg1 == 1) {
                    class76.field1720[arg7][arg6 + 1][arg0 + 1] = 50;
                } else if (arg1 == 2) {
                    class76.field1720[arg7][arg6 + 1][arg0] = 50;
                } else if (arg1 == 3) {
                    class76.field1720[arg7][arg6][arg0] = 50;
                }
            }
            if (var14.field980 && arg4 != null) {
                arg4.method841(19398920, var14.field976, arg0, arg1, arg8, arg6);
            }
        } else if (arg8 == 2) {
            int var21 = arg1 + 1 & 0x3;
            class87 var22;
            class87 var23;
            if (var14.field973 == -1 && var14.field982 == null) {
                var22 = var14.method362(var12, arg1 + 4, 2, var11, var9, arg5 ^ 0x7B, var10);
                var23 = var14.method362(var12, var21, 2, var11, var9, -119, var10);
            } else {
                var22 = new class86(arg2, 2, arg1 + 4, var9, var10, var12, var11, var14.field973, true);
                var23 = new class86(arg2, 2, var21, var9, var10, var12, var11, var14.field973, true);
            }
            arg3.method803(arg7, arg6, arg0, var13, var22, var23, class16.field319[arg1], class16.field319[var21], var15, var16);
            if (var14.field963) {
                if (arg1 == 0) {
                    class117.field2472[arg7][arg6][arg0] = class117.method840(class117.field2472[arg7][arg6][arg0], 585);
                    class117.field2472[arg7][arg6][arg0 + 1] = class117.method840(class117.field2472[arg7][arg6][arg0 + 1], 1170);
                } else if (arg1 == 1) {
                    class117.field2472[arg7][arg6][arg0 + 1] = class117.method840(class117.field2472[arg7][arg6][arg0 + 1], 1170);
                    class117.field2472[arg7][arg6 + 1][arg0] = class117.method840(class117.field2472[arg7][arg6 + 1][arg0], 585);
                } else if (arg1 == 2) {
                    class117.field2472[arg7][arg6 + 1][arg0] = class117.method840(class117.field2472[arg7][arg6 + 1][arg0], 585);
                    class117.field2472[arg7][arg6][arg0] = class117.method840(class117.field2472[arg7][arg6][arg0], 1170);
                } else if (arg1 == 3) {
                    class117.field2472[arg7][arg6][arg0] = class117.method840(class117.field2472[arg7][arg6][arg0], 1170);
                    class117.field2472[arg7][arg6][arg0] = class117.method840(class117.field2472[arg7][arg6][arg0], 585);
                }
            }
            if (var14.field980 && arg4 != null) {
                arg4.method841(19398920, var14.field976, arg0, arg1, arg8, arg6);
            }
            if (var14.field955 != 16) {
                arg3.method785(arg7, arg6, arg0, var14.field955);
            }
        } else if (arg8 == 3) {
            class87 var24;
            if (var14.field973 == -1 && var14.field982 == null) {
                var24 = var14.method362(var12, arg1, 3, var11, var9, -125, var10);
            } else {
                var24 = new class86(arg2, 3, arg1, var9, var10, var12, var11, var14.field973, true);
            }
            arg3.method803(arg7, arg6, arg0, var13, var24, null, class92.field2022[arg1], 0, var15, var16);
            if (var14.field1007) {
                if (arg1 == 0) {
                    class76.field1720[arg7][arg6][arg0 + 1] = 50;
                } else if (arg1 == 1) {
                    class76.field1720[arg7][arg6 + 1][arg0 + 1] = 50;
                } else if (arg1 == 2) {
                    class76.field1720[arg7][arg6 + 1][arg0] = 50;
                } else if (arg1 == 3) {
                    class76.field1720[arg7][arg6][arg0] = 50;
                }
            }
            if (var14.field980 && arg4 != null) {
                arg4.method841(19398920, var14.field976, arg0, arg1, arg8, arg6);
            }
        } else if (arg8 == 9) {
            class87 var25;
            if (var14.field973 == -1 && var14.field982 == null) {
                var25 = var14.method362(var12, arg1, arg8, var11, var9, -94, var10);
            } else {
                var25 = new class86(arg2, arg8, arg1, var9, var10, var12, var11, var14.field973, true);
            }
            arg3.method807(arg7, arg6, arg0, var13, 1, 1, var25, 0, var15, var16);
            if (var14.field980 && arg4 != null) {
                arg4.method831(arg6, var14.field976, arg1, 18691, var14.field979, var14.field1002, arg0);
            }
        } else {
            if (var14.field1004) {
                if (arg1 == 1) {
                    int var29 = var11;
                    var11 = var12;
                    var12 = var10;
                    var10 = var9;
                    var9 = var29;
                } else if (arg1 == 2) {
                    int var26 = var11;
                    var11 = var10;
                    var10 = var26;
                    int var27 = var12;
                    var12 = var9;
                    var9 = var27;
                } else if (arg1 == 3) {
                    int var28 = var11;
                    var11 = var9;
                    var9 = var10;
                    var10 = var12;
                    var12 = var28;
                }
            }
            if (arg8 == 4) {
                class87 var30;
                if (var14.field973 == -1 && var14.field982 == null) {
                    var30 = var14.method362(var12, 0, 4, var11, var9, -92, var10);
                } else {
                    var30 = new class86(arg2, 4, 0, var9, var10, var12, var11, var14.field973, true);
                }
                arg3.method801(arg7, arg6, arg0, var13, var30, class16.field319[arg1], arg1 * 512, 0, 0, var15, var16);
            } else if (arg8 == 5) {
                int var31 = 16;
                int var32 = arg3.method783(arg7, arg6, arg0);
                if (var32 > 0) {
                    var31 = class72.method566(var32 >> 14 & 0x7FFF, -50).field955;
                }
                class87 var33;
                if (var14.field973 == -1 && var14.field982 == null) {
                    var33 = var14.method362(var12, 0, 4, var11, var9, -109, var10);
                } else {
                    var33 = new class86(arg2, 4, 0, var9, var10, var12, var11, var14.field973, true);
                }
                arg3.method801(arg7, arg6, arg0, var13, var33, class16.field319[arg1], arg1 * 512, class118.field2516[arg1] * var31, class36.field825[arg1] * var31, var15, var16);
            } else if (arg8 == 6) {
                class87 var34;
                if (var14.field973 == -1 && var14.field982 == null) {
                    var34 = var14.method362(var12, 0, 4, var11, var9, -111, var10);
                } else {
                    var34 = new class86(arg2, 4, 0, var9, var10, var12, var11, var14.field973, true);
                }
                arg3.method801(arg7, arg6, arg0, var13, var34, 256, arg1, 0, 0, var15, var16);
            } else if (arg8 == 7) {
                class87 var35;
                if (var14.field973 == -1 && var14.field982 == null) {
                    var35 = var14.method362(var12, 0, 4, var11, var9, -96, var10);
                } else {
                    var35 = new class86(arg2, 4, 0, var9, var10, var12, var11, var14.field973, true);
                }
                arg3.method801(arg7, arg6, arg0, var13, var35, 512, arg1, 0, 0, var15, var16);
            } else if (arg8 == 8) {
                class87 var36;
                if (var14.field973 == -1 && var14.field982 == null) {
                    var36 = var14.method362(var12, 0, 4, var11, var9, -99, var10);
                } else {
                    var36 = new class86(arg2, 4, 0, var9, var10, var12, var11, var14.field973, true);
                }
                arg3.method801(arg7, arg6, arg0, var13, var36, 768, arg1, 0, 0, var15, var16);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
    public final int method17(int arg0, int arg1) {
        int var3 = 80 / ((arg0 + 29) / 58);
        field42++;
        return this.field40[arg1] == null ? 0 : this.field40[arg1].field2598;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public final void method18(int arg0) {
        for (int var2 = 0; var2 < this.field40.length; var2++) {
            if (this.field40[var2] != null) {
                this.field40[var2].method921();
            }
        }
        this.field30 = new class42();
        this.field51 = this.field56;
        if (arg0 != 24798) {
            this.method14((byte) -45, 84);
        }
        field32++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(DI)V")
    private final void method19(double arg0, int arg1) {
        int var4 = 40 % ((67 - arg1) / 58);
        field59++;
        this.field47 = arg0;
        this.method18(24798);
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public static final void method20(int arg0) {
        field36++;
        short var1 = 256;
        if (class13.field234 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class13.field234 > 768) {
                    class77.field1727[var4] = class50.method408(false, 1024 - class13.field234, class65.field1456[var4], class21.field483[var4]);
                } else if (class13.field234 > 256) {
                    class77.field1727[var4] = class65.field1456[var4];
                } else {
                    class77.field1727[var4] = class50.method408(false, 256 - class13.field234, class21.field483[var4], class65.field1456[var4]);
                }
            }
        } else if (class7.field114 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class77.field1727[var2] = class21.field483[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class7.field114 > 768) {
                    class77.field1727[var3] = class50.method408(false, 1024 - class7.field114, class125.field2720[var3], class21.field483[var3]);
                } else if (class7.field114 <= 256) {
                    class77.field1727[var3] = class50.method408(false, 256 - class7.field114, class21.field483[var3], class125.field2720[var3]);
                } else {
                    class77.field1727[var3] = class125.field2720[var3];
                }
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class61.field1367.field312[var5] = class51.field1190.field563[var5];
        }
        if (arg0 != -1) {
            field52 = null;
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var22 = (var1 - var8) * class12.field193[var8] / var1;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var6 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class83.field1898[var6++];
                if (var25 == 0) {
                    var7++;
                } else {
                    int var26 = class61.field1367.field312[var7];
                    int var27 = 256 - var25;
                    int var29 = class77.field1727[var25];
                    class61.field1367.field312[var7++] = class106.method732(-16711936, class106.method732(var26, 16711935) * var27 + class106.method732(16711935, var29) * var25) + class106.method732(16711680, var25 * class106.method732(65280, var29) + class106.method732(var26, 65280) * var27) >> 8;
                }
            }
            var7 += var23;
        }
        int var9 = 1176;
        for (int var10 = 0; var10 < 33920; var10++) {
            class86.field1910.field312[var10] = class70.field1557.field563[var10];
        }
        int var11 = 0;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class12.field193[var12] / var1;
            int var14 = var9 + var13;
            int var15 = 103 - var13;
            for (int var16 = 0; var16 < var15; var16++) {
                int var17 = class83.field1898[var11++];
                if (var17 == 0) {
                    var14++;
                } else {
                    int var18 = 256 - var17;
                    int var19 = class86.field1910.field312[var14];
                    int var21 = class77.field1727[var17];
                    class86.field1910.field312[var14++] = class106.method732(class106.method732(16711935, var21) * var17 + class106.method732(var19, 16711935) * var18, -16711936) + class106.method732(var18 * class106.method732(65280, var19) + var17 * class106.method732(var21, 65280), 16711680) >> 8;
                }
            }
            var11 += 128 - var15;
            var9 = var14 + 128 - var13 - var15;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)Lea;")
    public static final class26 method21(int arg0, int arg1, int arg2, int arg3) {
        field54++;
        if (arg2 == 0) {
            class26 var4 = (class26) class61.field1353.method660(-2, (long) arg0);
            if (var4 != null && var4.field564 != arg3 && var4.field564 != -1) {
                var4.method319((byte) -126);
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        class129 var5 = class129.method992(arg0, -75);
        if (var5.field2808 == null) {
            arg3 = -1;
        }
        if (arg3 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg3 >= var5.field2811[var7] && var5.field2811[var7] != 0) {
                    var6 = var5.field2808[var7];
                }
            }
            if (var6 != -1) {
                var5 = class129.method992(var6, -126);
            }
        }
        class33 var8 = var5.method990((byte) 121, true, 1);
        if (var8 == null) {
            return null;
        }
        class26 var9 = null;
        if (var5.field2794 != -1) {
            var9 = method21(var5.field2800, arg1, -1, 10);
            if (var9 == null) {
                return null;
            }
        }
        int[] var10 = class60.method486();
        int[] var11 = class120.field2594;
        int var12 = class120.field2595;
        int var13 = class120.field2591;
        int var14 = class120.field2596;
        int var15 = class120.field2592;
        int var16 = class120.field2590;
        int var17 = class120.field2593;
        class26 var18 = new class26(32, 32);
        class120.method913(var18.field563, 32, 32);
        class55.field1271 = class60.method491(class55.field1271);
        class120.method915(0, 0, 32, 32, 0);
        class60.field1330 = false;
        int var19 = var5.field2774;
        if (arg2 == -1) {
            var19 = (int) ((double) var19 * 1.5D);
        }
        if (arg2 > 0) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class60.field1323[var5.field2781] * var19 >> 16;
        int var21 = class60.field1326[var5.field2781] * var19 >> 16;
        var8.method265();
        var8.method258(0, var5.field2786, var5.field2767, var5.field2781, var5.field2807, var5.field2782 + var21 + var8.field1938 / 2, var5.field2782 + var20);
        for (int var22 = arg1; var22 >= 0; var22--) {
            for (int var29 = 31; var29 >= 0; var29--) {
                if (var18.field563[var29 * 32 + var22] == 0) {
                    if (var22 > 0 && var18.field563[var29 * 32 + var22 - 1] > 1) {
                        var18.field563[var29 * 32 + var22] = 1;
                    } else if (var29 > 0 && var18.field563[(var29 - 1) * 32 + var22] > 1) {
                        var18.field563[var29 * 32 + var22] = 1;
                    } else if (var22 < 31 && var18.field563[var22 + var29 * 32 + 1] > 1) {
                        var18.field563[var22 + var29 * 32] = 1;
                    } else if (var29 < 31 && var18.field563[(var29 + 1) * 32 + var22] > 1) {
                        var18.field563[var29 * 32 + var22] = 1;
                    }
                }
            }
        }
        if (arg2 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var18.field563[var28 * 32 + var25] == 0) {
                        if (var25 > 0 && var18.field563[var28 * 32 + var25 - 1] == 1) {
                            var18.field563[var28 * 32 + var25] = arg2;
                        } else if (var28 > 0 && var18.field563[(var28 - 1) * 32 + var25] == 1) {
                            var18.field563[var28 * 32 + var25] = arg2;
                        } else if (var25 < 31 && var18.field563[var28 * 32 + var25 + 1] == 1) {
                            var18.field563[var28 * 32 + var25] = arg2;
                        } else if (var28 < 31 && var18.field563[var28 * 32 + var25 + 32] == 1) {
                            var18.field563[var25 + var28 * 32] = arg2;
                        }
                    }
                }
            }
        } else if (arg2 == 0) {
            for (int var23 = 31; var23 >= 0; var23--) {
                for (int var24 = 31; var24 >= 0; var24--) {
                    if (var18.field563[var23 + var24 * 32] == 0 && var23 > 0 && var24 > 0 && var18.field563[var24 * 32 + var23 - 32 - 1] > 0) {
                        var18.field563[var24 * 32 + var23] = 3153952;
                    }
                }
            }
        }
        if (var5.field2794 != -1) {
            int var26 = var9.field564;
            int var27 = var9.field566;
            var9.field566 = 32;
            var9.field564 = 32;
            var9.method188(0, 0);
            var9.field564 = var26;
            var9.field566 = var27;
        }
        if (arg2 == 0) {
            class61.field1353.method666(false, var18, (long) arg0);
        }
        class120.method913(var11, var13, var12);
        class120.method918(var14, var17, var16, var15);
        class60.method491(var10);
        var18.field564 = arg3;
        class60.field1330 = true;
        if (var5.field2801) {
            var18.field566 = 33;
        } else {
            var18.field566 = 32;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lvb;Lvb;IDI)V")
    public class3(class122 arg0, class122 arg1, int arg2, double arg3, int arg4) {
        this.field47 = arg3;
        this.field57 = arg1;
        this.field58 = arg4;
        this.field56 = arg2;
        this.field51 = this.field56;
        int[] var7 = arg0.method931(1, 0);
        int var8 = var7.length;
        this.field40 = new class121[arg0.method947(0, (byte) 56)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method932(126, var7[var9], 0));
            this.field40[var7[var9]] = new class121(var10);
        }
    }
}
