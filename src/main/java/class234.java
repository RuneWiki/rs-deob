import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class234 extends class152 {

    @OriginalMember(owner = "client!le", name = "P", descriptor = "[I")
    public static int[] field4186 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!le", name = "X", descriptor = "Lhh;")
    public static class163 field4194 = class137.method1065("RuneScape wird geladen )2 bitte warten)3)3)3", 17);

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "Lhh;")
    private static class163 field4195 = class137.method1065("Members object", 17);

    @OriginalMember(owner = "client!le", name = "R", descriptor = "Lhh;")
    public static class163 field4188 = field4195;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Lv;")
    public static class22 field4176;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "[I")
    public int[] field4177;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "[I")
    private int[] field4181;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "[Lhh;")
    private class163[] field4178;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "[[I")
    private int[][] field4183;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "[[[B")
    public static byte[][][] field4180;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)Z")
    public static final boolean method1620(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class63.field1070; var3++) {
            class201 var4 = class18.field287[var3];
            if (var4.field3600 == 1) {
                int var5 = var4.field3590 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3603 * var5 >> 8) + var4.field3604;
                    int var7 = (var4.field3591 * var5 >> 8) + var4.field3599;
                    int var8 = (var4.field3596 * var5 >> 8) + var4.field3608;
                    int var9 = (var4.field3587 * var5 >> 8) + var4.field3597;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3600 == 2) {
                int var10 = arg0 - var4.field3590;
                if (var10 > 0) {
                    int var11 = (var4.field3603 * var10 >> 8) + var4.field3604;
                    int var12 = (var4.field3591 * var10 >> 8) + var4.field3599;
                    int var13 = (var4.field3596 * var10 >> 8) + var4.field3608;
                    int var14 = (var4.field3587 * var10 >> 8) + var4.field3597;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3600 == 3) {
                int var15 = var4.field3604 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3595 * var15 >> 8) + var4.field3590;
                    int var17 = (var4.field3589 * var15 >> 8) + var4.field3606;
                    int var18 = (var4.field3596 * var15 >> 8) + var4.field3608;
                    int var19 = (var4.field3587 * var15 >> 8) + var4.field3597;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3600 == 4) {
                int var20 = arg2 - var4.field3604;
                if (var20 > 0) {
                    int var21 = (var4.field3595 * var20 >> 8) + var4.field3590;
                    int var22 = (var4.field3589 * var20 >> 8) + var4.field3606;
                    int var23 = (var4.field3596 * var20 >> 8) + var4.field3608;
                    int var24 = (var4.field3587 * var20 >> 8) + var4.field3597;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3600 == 5) {
                int var25 = arg1 - var4.field3608;
                if (var25 > 0) {
                    int var26 = (var4.field3595 * var25 >> 8) + var4.field3590;
                    int var27 = (var4.field3589 * var25 >> 8) + var4.field3606;
                    int var28 = (var4.field3603 * var25 >> 8) + var4.field3604;
                    int var29 = (var4.field3591 * var25 >> 8) + var4.field3599;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)I")
    public static final int method1621(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        field4179++;
        int var4 = -9 / ((arg2 - 60) / 50);
        return (arg1 >> 1) + (arg0 >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lte;IIIIIIIZ)V")
    public static final void method1622(class29 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class134.field2601;
        int var11;
        int var12 = var11 = (arg7 << 7) - class30.field476;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class228.field4107[arg1][arg6][arg7] - class127.field2472;
        int var18 = class228.field4107[arg1][arg6 + 1][arg7] - class127.field2472;
        int var19 = class228.field4107[arg1][arg6 + 1][arg7 + 1] - class127.field2472;
        int var20 = class228.field4107[arg1][arg6][arg7 + 1] - class127.field2472;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class98.field1841;
        int var46 = (var24 << 9) / var25 + class98.field1848;
        int var47 = (var27 << 9) / var31 + class98.field1841;
        int var48 = (var30 << 9) / var31 + class98.field1848;
        int var49 = (var33 << 9) / var37 + class98.field1841;
        int var50 = (var36 << 9) / var37 + class98.field1848;
        int var51 = (var39 << 9) / var43 + class98.field1841;
        int var52 = (var42 << 9) / var43 + class98.field1848;
        class98.field1846 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class55.field908 && class250.method1710(class98.field1841 + class59.field974, class98.field1848 + class8.field138, var50, var52, var48, var49, var51, var47)) {
                class13.field211 = arg6;
                class49.field818 = arg7;
            }
            if (!arg8) {
                class98.field1842 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class98.field1849 || var51 > class98.field1849 || var47 > class98.field1849) {
                    class98.field1842 = true;
                }
                if (arg0.field464 == -1) {
                    if (arg0.field457 != 12345678) {
                        class98.method778(var50, var52, var48, var49, var51, var47, arg0.field457, arg0.field447, arg0.field446);
                    }
                } else if (!class9.field154) {
                    int var53 = class98.field1852.method669(101, arg0.field464);
                    class98.method778(var50, var52, var48, var49, var51, var47, class246.method1694(var53, arg0.field457), class246.method1694(var53, arg0.field447), class246.method1694(var53, arg0.field446));
                } else if (arg0.field452) {
                    class98.method784(var50, var52, var48, var49, var51, var47, arg0.field457, arg0.field447, arg0.field446, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field464);
                } else {
                    class98.method784(var50, var52, var48, var49, var51, var47, arg0.field457, arg0.field447, arg0.field446, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field464);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class55.field908 && class250.method1710(class98.field1841 + class59.field974, class98.field1848 + class8.field138, var46, var48, var52, var45, var47, var51)) {
            class13.field211 = arg6;
            class49.field818 = arg7;
        }
        if (arg8) {
            return;
        }
        class98.field1842 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class98.field1849 || var47 > class98.field1849 || var51 > class98.field1849) {
            class98.field1842 = true;
        }
        if (arg0.field464 != -1) {
            if (class9.field154) {
                class98.method784(var46, var48, var52, var45, var47, var51, arg0.field451, arg0.field446, arg0.field447, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field464);
                return;
            }
            int var54 = class98.field1852.method669(122, arg0.field464);
            class98.method778(var46, var48, var52, var45, var47, var51, class246.method1694(var54, arg0.field451), class246.method1694(var54, arg0.field446), class246.method1694(var54, arg0.field447));
        } else if (arg0.field451 != 12345678) {
            class98.method778(var46, var48, var52, var45, var47, var51, arg0.field451, arg0.field446, arg0.field447);
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Lhh;")
    public final class163 method1623(int arg0) {
        class163 var2 = class187.method1383((byte) -124, 80);
        field4184++;
        if (arg0 < 70) {
            return null;
        } else if (this.field4178 == null) {
            return class147.field2788;
        } else {
            var2.method1231(this.field4178[0], -32);
            for (int var3 = 1; var3 < this.field4178.length; var3++) {
                var2.method1231(class16.field234, -116);
                var2.method1231(this.field4178[var3], -69);
            }
            return var2.method1187((byte) -22);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILpg;I)V")
    private final void method1624(int arg0, class81 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4178 = arg1.method605(true).method1220((byte) 33, 60);
        } else if (arg2 == 2) {
            int var8 = arg1.method622(true);
            this.field4177 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4177[var9] = arg1.method658(75);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method622(true);
            this.field4181 = new int[var4];
            this.field4183 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method658(-86);
                this.field4181[var5] = var6;
                this.field4183[var5] = new int[class3.field66[var6]];
                for (int var7 = 0; var7 < class3.field66[var6]; var7++) {
                    this.field4183[var5][var7] = arg1.method658(-81);
                }
            }
        }
        if (arg0 > -64) {
            field4180 = null;
        }
        field4190++;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)I")
    public final int method1625(int arg0) {
        if (arg0 == 128) {
            field4187++;
            return this.field4181 == null ? 0 : this.field4181.length;
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method1626(boolean arg0) {
        field4194 = null;
        field4195 = null;
        field4186 = null;
        field4176 = null;
        field4188 = null;
        field4180 = null;
        if (!arg0) {
            field4194 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V")
    public final void method1627(byte arg0) {
        int var2 = 15 / ((29 - arg0) / 54);
        if (this.field4177 != null) {
            for (int var3 = 0; var3 < this.field4177.length; var3++) {
                this.field4177[var3] = class3.method27(this.field4177[var3], 32768);
            }
        }
        field4175++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lpg;I)V")
    public final void method1628(class81 arg0, int arg1) {
        field4192++;
        while (true) {
            int var3 = arg0.method622(true);
            if (var3 == 0) {
                if (arg1 == 30772) {
                    return;
                } else {
                    method1622((class29) null, -67, -72, -79, -37, -60, -107, 123, true);
                    return;
                }
            }
            this.method1624(arg1 - 30839, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
    public final int method1629(int arg0, int arg1) {
        field4191++;
        if (arg0 < 23) {
            field4194 = null;
        }
        return this.field4181 == null || arg1 < 0 || this.field4181.length < arg1 ? -1 : this.field4181[arg1];
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)I")
    public final int method1630(int arg0, int arg1, byte arg2) {
        if (arg2 <= 70) {
            this.method1623(-83);
        }
        field4189++;
        if (this.field4181 == null || arg0 < 0 || arg0 > this.field4181.length) {
            return -1;
        } else if (this.field4183[arg0] == null || arg1 < 0 || this.field4183[arg0].length < arg1) {
            return -1;
        } else {
            return this.field4183[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[ILpg;)V")
    public final void method1631(int arg0, int[] arg1, class81 arg2) {
        field4193++;
        if (this.field4181 == null) {
            return;
        }
        for (int var4 = arg0; var4 < this.field4181.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class244.field4315[this.method1629(arg0 + 64, var4)];
            if (var5 > 0) {
                arg2.method641(var5, (long) arg1[var4], (byte) -27);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLpg;)Lhh;")
    public final class163 method1632(boolean arg0, class81 arg1) {
        if (arg0) {
            this.field4183 = null;
        }
        field4185++;
        class163 var3 = class187.method1383((byte) -116, 80);
        if (this.field4181 != null) {
            for (int var4 = 0; var4 < this.field4181.length; var4++) {
                var3.method1231(this.field4178[var4], -67);
                var3.method1231(class259.method1749(0, this.field4181[var4], this.field4183[var4], arg1.method601(class257.field4508[this.field4181[var4]], 15)), -75);
            }
        }
        var3.method1231(this.field4178[this.field4178.length - 1], -117);
        return var3.method1187((byte) 94);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILpa;)Lcd;")
    public static final class4 method1633(int arg0, int arg1, class123 arg2) {
        field4182++;
        byte[] var3 = arg2.method968((byte) -122, arg0);
        if (arg1 < 55) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            return new class4(var3);
        }
    }
}
