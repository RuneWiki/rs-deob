import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class3 {

    @OriginalMember(owner = "client!en", name = "t", descriptor = "Luk;")
    private class105 field35 = new class105();

    @OriginalMember(owner = "client!en", name = "w", descriptor = "Luk;")
    private class105 field38 = new class105();

    @OriginalMember(owner = "client!en", name = "x", descriptor = "Luk;")
    private class105 field39 = new class105();

    @OriginalMember(owner = "client!en", name = "y", descriptor = "Luk;")
    private class105 field40 = new class105();

    @OriginalMember(owner = "client!en", name = "A", descriptor = "Lfd;")
    private class299 field42 = new class299(4);

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public volatile int field46 = 0;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public volatile int field47 = 0;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "B")
    private byte field48 = 0;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "Lfd;")
    private class299 field45 = new class299(8);

    @OriginalMember(owner = "client!en", name = "j", descriptor = "Ljava/lang/String;")
    public static String field25 = "Loading wordpack - ";

    @OriginalMember(owner = "client!en", name = "r", descriptor = "Ljava/lang/String;")
    public static String field33 = "Starting 3d Library";

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "J")
    private long field43;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Lfh;")
    public static class140 field24;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "Lul;")
    private class172 field49;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "Leo;")
    private class71 field44;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field31;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I", line = 6)
    private final int method9(int arg0) {
        int var2 = -15 % ((arg0 - 25) / 62);
        field21++;
        return this.field39.method741(true) + this.field40.method741(true);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 15)
    public final void method10(int arg0) {
        field29++;
        if (this.field44 == null) {
            return;
        }
        try {
            this.field42.field4351 = 0;
            this.field42.method2048(7, arg0 ^ 0x6C);
            this.field42.method2069((byte) 9, 0);
            this.field44.method530(arg0, this.field42.field4350, 4, 30000);
        } catch (IOException var5) {
            try {
                this.field44.method526(-19055);
            } catch (Exception var4) {
            }
            this.field44 = null;
            this.field46++;
            this.field47 = -2;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V", line = 43)
    public static final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class346.method2404(arg0, (byte) -14);
        int var7 = arg0 - arg1;
        field28++;
        int var8 = arg0;
        int var9 = 0;
        int var10 = -arg0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var11 = var7;
        if (class207.field2937 <= arg6 && arg6 <= class25.field292) {
            int[] var12 = class331.field4902[arg6];
            int var13 = class289.method1984(class245.field3574, arg2 - arg0, 1, class321.field4722);
            int var14 = class289.method1984(class245.field3574, arg0 + arg2, 1, class321.field4722);
            int var15 = class289.method1984(class245.field3574, arg2 - var7, arg4 ^ 0xFFFFFFFE, class321.field4722);
            int var16 = class289.method1984(class245.field3574, arg2 + var7, arg4 ^ 0xFFFFFFFE, class321.field4722);
            class96.method697((byte) 115, var12, arg3, var13, var15);
            class96.method697((byte) 115, var12, arg5, var15, var16);
            class96.method697((byte) 115, var12, arg3, var16, var14);
        }
        int var17 = -var7;
        int var18 = -1;
        int var19 = arg4;
        while (var9 < var8) {
            var18 += 2;
            var17 += var18;
            var19 += 2;
            if (var17 >= 0 && var11 >= 1) {
                var11--;
                var17 -= var11 << 1;
                class317.field4680[var11] = var9;
            }
            var9++;
            var10 += var19;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                int var20 = arg6 - var8;
                int var21 = arg6 + var8;
                if (class207.field2937 <= var21 && var20 <= class25.field292) {
                    if (var8 >= var7) {
                        int var22 = class289.method1984(class245.field3574, arg2 + var9, 1, class321.field4722);
                        int var23 = class289.method1984(class245.field3574, arg2 - var9, 1, class321.field4722);
                        if (class25.field292 >= var21) {
                            class96.method697((byte) 115, class331.field4902[var21], arg3, var23, var22);
                        }
                        if (var20 >= class207.field2937) {
                            class96.method697((byte) 115, class331.field4902[var20], arg3, var23, var22);
                        }
                    } else {
                        int var24 = class317.field4680[var8];
                        int var25 = class289.method1984(class245.field3574, arg2 + var9, arg4 ^ 0xFFFFFFFE, class321.field4722);
                        int var26 = class289.method1984(class245.field3574, arg2 - var9, 1, class321.field4722);
                        int var27 = class289.method1984(class245.field3574, arg2 + var24, 1, class321.field4722);
                        int var28 = class289.method1984(class245.field3574, arg2 - var24, 1, class321.field4722);
                        if (class25.field292 >= var21) {
                            int[] var29 = class331.field4902[var21];
                            class96.method697((byte) 115, var29, arg3, var26, var28);
                            class96.method697((byte) 115, var29, arg5, var28, var27);
                            class96.method697((byte) 115, var29, arg3, var27, var25);
                        }
                        if (class207.field2937 <= var20) {
                            int[] var30 = class331.field4902[var20];
                            class96.method697((byte) 115, var30, arg3, var26, var28);
                            class96.method697((byte) 115, var30, arg5, var28, var27);
                            class96.method697((byte) 115, var30, arg3, var27, var25);
                        }
                    }
                }
            }
            int var31 = arg6 + var9;
            int var32 = arg6 - var9;
            if (class207.field2937 <= var31 && class25.field292 >= var32) {
                int var33 = arg2 + var8;
                int var34 = arg2 - var8;
                if (var33 >= class245.field3574 && class321.field4722 >= var34) {
                    int var35 = class289.method1984(class245.field3574, var33, 1, class321.field4722);
                    int var36 = class289.method1984(class245.field3574, var34, 1, class321.field4722);
                    if (var9 >= var7) {
                        if (class25.field292 >= var31) {
                            class96.method697((byte) 115, class331.field4902[var31], arg3, var36, var35);
                        }
                        if (class207.field2937 <= var32) {
                            class96.method697((byte) 115, class331.field4902[var32], arg3, var36, var35);
                        }
                    } else {
                        int var37 = var11 >= var9 ? var11 : class317.field4680[var9];
                        int var38 = class289.method1984(class245.field3574, arg2 + var37, 1, class321.field4722);
                        int var39 = class289.method1984(class245.field3574, arg2 - var37, 1, class321.field4722);
                        if (class25.field292 >= var31) {
                            int[] var40 = class331.field4902[var31];
                            class96.method697((byte) 115, var40, arg3, var36, var39);
                            class96.method697((byte) 115, var40, arg5, var39, var38);
                            class96.method697((byte) 115, var40, arg3, var38, var35);
                        }
                        if (class207.field2937 <= var32) {
                            int[] var41 = class331.field4902[var32];
                            class96.method697((byte) 115, var41, arg3, var36, var39);
                            class96.method697((byte) 115, var41, arg5, var39, var38);
                            class96.method697((byte) 115, var41, arg3, var38, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)Z", line = 223)
    public final boolean method12(int arg0) {
        if (arg0 != 0) {
            this.method24(false);
        }
        field32++;
        return this.method21(false) >= 20;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)I", line = 234)
    public static final int method13(int arg0) {
        if (arg0 < 113) {
            method23((byte) -67, (byte[][]) ((byte[][]) null), -45, (class339[]) null, (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), 115, (byte[][]) ((byte[][]) null));
        }
        field22++;
        return 14;
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V", line = 246)
    public static void method14(int arg0) {
        field33 = null;
        field25 = null;
        if (arg0 == -29587) {
            field31 = null;
            field24 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 259)
    public final void method15(byte arg0) {
        if (arg0 > -71) {
            this.field44 = (class71) null;
        }
        if (this.field44 != null) {
            this.field44.method527((byte) 52);
        }
        field16++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILeo;Z)V", line = 281)
    public final void method16(int arg0, class71 arg1, boolean arg2) {
        field30++;
        if (this.field44 != null) {
            try {
                this.field44.method526(-19055);
            } catch (Exception var12) {
            }
            this.field44 = null;
        }
        this.field44 = arg1;
        this.method25((byte) 22);
        this.method22((byte) 122, arg2);
        this.field49 = null;
        this.field45.field4351 = 0;
        while (true) {
            class172 var5 = (class172) this.field38.method743(false);
            if (var5 == null) {
                int var6 = -96 % ((arg0 + 11) / 42);
                while (true) {
                    class172 var7 = (class172) this.field40.method743(false);
                    if (var7 == null) {
                        if (this.field48 != 0) {
                            try {
                                this.field42.field4351 = 0;
                                this.field42.method2048(4, 62);
                                this.field42.method2048(this.field48, 63);
                                this.field42.method2098(-104, 0);
                                this.field44.method530(0, this.field42.field4350, 4, 30000);
                            } catch (IOException var11) {
                                try {
                                    this.field44.method526(-19055);
                                } catch (Exception var10) {
                                }
                                this.field44 = null;
                                this.field46++;
                                this.field47 = -2;
                            }
                        }
                        this.field41 = 0;
                        this.field43 = class6.method37(10828);
                        return;
                    }
                    this.field39.method740(-121, var7);
                }
            }
            this.field35.method740(-120, var5);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BIZII)Lul;", line = 348)
    public final class172 method17(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != -24559) {
            return (class172) null;
        }
        field17++;
        long var6 = (long) ((arg1 << 16) + arg4);
        class172 var8 = new class172();
        var8.field2378 = arg0;
        var8.field1105 = arg2;
        var8.field3011 = var6;
        if (arg2) {
            if (this.method21(false) >= 20) {
                throw new RuntimeException();
            }
            this.field35.method740(70, var8);
        } else if (this.method9(93) < 20) {
            this.field39.method740(105, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)Z", line = 394)
    public static final boolean method18(int arg0, int arg1, int arg2, int arg3) {
        if (class163.method1233(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class218.method1582(var4 + 1, class74.field978[arg0][arg1][arg2] + arg3, var5 + 1) && class218.method1582(var4 + 128 - 1, class74.field978[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class218.method1582(var4 + 128 - 1, class74.field978[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class218.method1582(var4 + 1, class74.field978[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V", line = 411)
    public final void method19(int arg0) {
        if (arg0 > -83) {
            this.field45 = (class299) null;
        }
        field23++;
        if (this.field44 != null) {
            this.field44.method526(-19055);
        }
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V", line = 425)
    public final void method20(int arg0) {
        field37++;
        try {
            this.field44.method526(-19055);
        } catch (Exception var3) {
        }
        this.field44 = null;
        if (arg0 == -30223) {
            this.field48 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field47 = -1;
            this.field46++;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I", line = 444)
    public final int method21(boolean arg0) {
        field18++;
        return arg0 ? 123 : this.field35.method741(true) + this.field38.method741(true);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)V", line = 456)
    public final void method22(byte arg0, boolean arg1) {
        field27++;
        if (this.field44 == null) {
            return;
        }
        try {
            this.field42.field4351 = 0;
            if (arg0 < 116) {
                this.field45 = (class299) null;
            }
            this.field42.method2048(arg1 ? 2 : 3, 87);
            this.field42.method2069((byte) 9, 0);
            this.field44.method530(0, this.field42.field4350, 4, 30000);
        } catch (IOException var6) {
            try {
                this.field44.method526(-19055);
            } catch (Exception var5) {
            }
            this.field46++;
            this.field44 = null;
            this.field47 = -2;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B[[BI[Lem;[[I[[B[[F[[B[[F[[FI[[B)V", line = 484)
    public static final void method23(byte arg0, byte[][] arg1, int arg2, class339[] arg3, int[][] arg4, byte[][] arg5, float[][] arg6, byte[][] arg7, float[][] arg8, float[][] arg9, int arg10, byte[][] arg11) {
        field26++;
        if (arg0 != -99) {
            return;
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            class339 var13 = arg3[var12];
            if (var13.field5293 == arg10) {
                class63 var14 = new class63();
                int var15 = (var13.field5282 >> 7) - var13.field5278;
                int var16 = 0;
                if (var15 < 0) {
                    var16 -= var15;
                    var15 = 0;
                }
                int var17 = (var13.field5282 >> 7) + var13.field5278;
                if (var17 > 103) {
                    var17 = 103;
                }
                int var18 = (var13.field5309 >> 7) - var13.field5278;
                for (int var19 = var15; var19 <= var17; var19++) {
                    short var20 = var13.field5281[var16];
                    int var21 = (var20 >> 8) + var18;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg5[var23][var19] & 0xFF;
                        int var25 = arg7[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class216 var27 = class311.method2165((byte) -127, var25 - 1);
                            if (var27.field3050 == -1) {
                                continue;
                            }
                            if (arg11[var23][var19] != 0) {
                                int[] var28 = class33.field411[arg11[var23][var19]];
                                var14.field782 += (var28.length >> 1) * 3 - 6;
                                var14.field780 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class216 var29 = class311.method2165((byte) -128, var25 - 1);
                            if (var29.field3050 == -1) {
                                byte var31 = arg11[var23][var19];
                                if (var31 != 0) {
                                    int[] var32 = class42.field529[var31];
                                    var14.field782 += (var32.length >> 1) * 3 - 6;
                                    var14.field780 += var32.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg11[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class294 var33 = class347.method2412(arg10, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field4289 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field4289 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var37 = (var23 - 1) >= var21;
                                    if (!var37 && var17 >= var19 + 1) {
                                        short var38 = var13.field5281[var16 + 1];
                                        int var39 = (var38 >> 8) + var18;
                                        int var40 = (var38 & 0xFF) + var39;
                                        var37 = var23 > var39 && var40 > var23;
                                    }
                                    boolean var41 = var22 >= (var23 + 1);
                                    if (!var41 && (var19 - 1) >= var15) {
                                        short var42 = var13.field5281[var16 - 1];
                                        int var43 = var18 + (var42 >> 8);
                                        int var44 = (var42 & 0xFF) + var43;
                                        var41 = var43 < var23 && var23 < var44;
                                    }
                                    if (var37 && var41) {
                                        var35 = class33.field411[0];
                                    } else if (var37) {
                                        var35 = class33.field411[1];
                                    } else if (var41) {
                                        var35 = class33.field411[1];
                                    }
                                } else {
                                    boolean var45 = var21 <= var23 - 1;
                                    if (!var45 && var15 <= var19 - 1) {
                                        short var46 = var13.field5281[var16 - 1];
                                        int var47 = (var46 >> 8) + var18;
                                        int var48 = (var46 & 0xFF) + var47;
                                        var45 = var23 > var47 && var48 > var23;
                                    }
                                    boolean var49 = (var23 + 1) <= var22;
                                    if (!var49 && var17 >= (var19 + 1)) {
                                        short var50 = var13.field5281[var16 + 1];
                                        int var51 = (var50 >> 8) + var18;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var49 = var51 < var23 && var23 < var52;
                                    }
                                    if (var45 && var49) {
                                        var35 = class33.field411[0];
                                    } else if (var45) {
                                        var35 = class33.field411[1];
                                    } else if (var49) {
                                        var35 = class33.field411[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field782 += ((var35.length >> 1) - 2) * 3;
                                    var14.field780 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var54 = class33.field411[arg11[var23][var19]];
                            int[] var55 = class42.field529[arg11[var23][var19]];
                            var14.field782 += ((var54.length >> 1) - 2) * 3;
                            var14.field782 += ((var55.length >> 1) - 2) * 3;
                            var14.field780 += var54.length >> 1;
                            var14.field780 += var55.length >> 1;
                        } else {
                            int[] var53 = class33.field411[0];
                            var14.field782 += ((var53.length >> 1) - 2) * 3;
                            var14.field780 += var53.length >> 1;
                        }
                    }
                    var16++;
                }
                var14.method461();
                int var56 = 0;
                if ((var13.field5282 >> 7) - var13.field5278 < 0) {
                    var56 -= (var13.field5282 >> 7) - var13.field5278;
                }
                for (int var57 = var15; var57 <= var17; var57++) {
                    short var58 = var13.field5281[var56];
                    int var59 = var18 + (var58 >> 8);
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg1[var61][var57];
                        int var63 = arg5[var61][var57] & 0xFF;
                        int var64 = arg7[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class216 var66 = class311.method2165((byte) -128, var64 - 1);
                            if (var66.field3050 == -1) {
                                continue;
                            }
                            if (arg11[var61][var57] != 0) {
                                class251.method1766(var13, class33.field411[arg11[var61][var57]], arg8, var57, var61, var14, arg6, 1, arg9, arg1[var61][var57], arg4);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class216 var67 = class311.method2165((byte) -126, var64 - 1);
                            if (var67.field3050 == -1) {
                                class251.method1766(var13, class42.field529[arg11[var61][var57]], arg8, var57, var61, var14, arg6, 1, arg9, arg1[var61][var57], arg4);
                                continue;
                            }
                            byte var68 = arg11[var61][var57];
                            if (var68 != 0) {
                                var65 = true;
                            }
                        }
                        class294 var69 = class347.method2412(arg10, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4289 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4289 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var73 = var59 <= var61 - 1;
                                    boolean var74 = (var61 + 1) <= var60;
                                    if (!var73 && var17 >= var57 + 1) {
                                        short var75 = var13.field5281[var56 + 1];
                                        int var76 = (var75 >> 8) + var18;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var76 < var61 && var61 < var77;
                                    }
                                    if (!var74 && var57 - 1 >= var15) {
                                        short var78 = var13.field5281[var56 - 1];
                                        int var79 = var18 + (var78 >> 8);
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var79 < var61 && var61 < var80;
                                    }
                                    if (var73 && var74) {
                                        var71 = class33.field411[0];
                                    } else if (var73) {
                                        var71 = class33.field411[1];
                                        var62 = 1;
                                    } else if (var74) {
                                        var71 = class33.field411[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var81 = var61 - 1 >= var59;
                                    boolean var82 = var60 >= (var61 + 1);
                                    if (!var81 && var57 - 1 >= var15) {
                                        short var83 = var13.field5281[var56 - 1];
                                        int var84 = (var83 >> 8) + var18;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var84 < var61 && var61 < var85;
                                    }
                                    if (!var82 && var17 >= var57 + 1) {
                                        short var86 = var13.field5281[var56 + 1];
                                        int var87 = var18 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var61 > var87 && var61 < var88;
                                    }
                                    if (var81 && var82) {
                                        var71 = class33.field411[0];
                                    } else if (var81) {
                                        var71 = class33.field411[1];
                                        var62 = 0;
                                    } else if (var82) {
                                        var71 = class33.field411[1];
                                        var62 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class251.method1766(var13, var71, arg8, var57, var61, var14, arg6, 1, arg9, var62, arg4);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class251.method1766(var13, class42.field529[arg11[var61][var57]], arg8, var57, var61, var14, arg6, arg0 ^ 0xFFFFFF9C, arg9, arg1[var61][var57], arg4);
                            class251.method1766(var13, class33.field411[arg11[var61][var57]], arg8, var57, var61, var14, arg6, arg0 ^ 0xFFFFFF9C, arg9, arg1[var61][var57], arg4);
                        } else {
                            class251.method1766(var13, class33.field411[0], arg8, var57, var61, var14, arg6, 1, arg9, var62, arg4);
                        }
                    }
                    var56++;
                }
                if (var14.field787 > 0 && var14.field791 > 0) {
                    var14.method463();
                    var13.field5289 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Z", line = 1004)
    public final boolean method24(boolean arg0) {
        field36++;
        if (!arg0) {
            this.field40 = (class105) null;
        }
        return this.method9(-66) >= 20;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V", line = 1016)
    private final void method25(byte arg0) {
        field19++;
        if (this.field44 == null) {
            return;
        }
        try {
            this.field42.field4351 = 0;
            this.field42.method2048(6, 69);
            if (arg0 <= 3) {
                return;
            }
            this.field42.method2069((byte) 9, 3);
            this.field44.method530(0, this.field42.field4350, 4, 30000);
        } catch (IOException var5) {
            try {
                this.field44.method526(-19055);
            } catch (Exception var4) {
            }
            this.field44 = null;
            this.field47 = -2;
            this.field46++;
        }
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(I)Z", line = 1055)
    public final boolean method26(int arg0) {
        if (this.field44 != null) {
            long var2 = class6.method37(arg0 ^ 0xFFFFBC3A);
            int var4 = (int) (var2 - this.field43);
            this.field43 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field41 += var4;
            if (this.field41 > 30000) {
                try {
                    this.field44.method526(-19055);
                } catch (Exception var30) {
                }
                this.field44 = null;
            }
        }
        field34++;
        if (this.field44 == null) {
            return this.method21(false) == 0 && this.method9(arg0 ^ -27089) == 0;
        }
        try {
            this.field44.method529((byte) -120);
            for (class172 var6 = (class172) this.field35.method739((byte) 46); var6 != null; var6 = (class172) this.field35.method747(arg0 ^ 0xFFFF9677)) {
                this.field42.field4351 = 0;
                this.field42.method2048(1, arg0 + 27137);
                this.field42.method2069((byte) 9, (int) var6.field3011);
                this.field44.method530(0, this.field42.field4350, 4, arg0 ^ 0xFFFFE346);
                this.field38.method740(-121, var6);
            }
            if (arg0 != -27018) {
                this.field43 = -62L;
            }
            for (class172 var7 = (class172) this.field39.method739((byte) 101); var7 != null; var7 = (class172) this.field39.method747(1)) {
                this.field42.field4351 = 0;
                this.field42.method2048(0, 104);
                this.field42.method2069((byte) 9, (int) var7.field3011);
                this.field44.method530(0, this.field42.field4350, 4, 30000);
                this.field40.method740(54, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field44.method524((byte) -68);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                byte var10 = 0;
                if (this.field49 == null) {
                    var10 = 8;
                } else if (this.field49.field2374 == 0) {
                    var10 = 1;
                }
                this.field41 = 0;
                if (var10 <= 0) {
                    int var11 = 512 - this.field49.field2374;
                    int var12 = this.field49.field2381.field4350.length - this.field49.field2378;
                    if ((var12 - this.field49.field2381.field4351) < var11) {
                        var11 = var12 - this.field49.field2381.field4351;
                    }
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field44.method522(this.field49.field2381.field4351, this.field49.field2381.field4350, var11, (byte) 86);
                    if (this.field48 != 0) {
                        for (int var13 = 0; var13 < var11; var13++) {
                            this.field49.field2381.field4350[this.field49.field2381.field4351 + var13] = (byte) class300.method2107(this.field49.field2381.field4350[this.field49.field2381.field4351 + var13], this.field48);
                        }
                    }
                    this.field49.field2381.field4351 += var11;
                    this.field49.field2374 += var11;
                    if (this.field49.field2381.field4351 == var12) {
                        this.field49.method1556(arg0 ^ 0xFFFF9689);
                        this.field49.field1109 = false;
                        this.field49 = null;
                    } else if (this.field49.field2374 == 512) {
                        this.field49.field2374 = 0;
                    }
                } else {
                    int var14 = var10 - this.field45.field4351;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field44.method522(this.field45.field4351, this.field45.field4350, var14, (byte) 108);
                    if (this.field48 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field45.field4350[this.field45.field4351 + var15] = (byte) class300.method2107(this.field45.field4350[this.field45.field4351 + var15], this.field48);
                        }
                    }
                    this.field45.field4351 += var14;
                    if (var10 <= this.field45.field4351) {
                        if (this.field49 == null) {
                            this.field45.field4351 = 0;
                            int var16 = this.field45.method2096((byte) -122);
                            int var17 = this.field45.method2083((byte) -102);
                            int var18 = this.field45.method2096((byte) -122);
                            int var19 = var18 & 0x7F;
                            boolean var20 = (var18 & 0x80) != 0;
                            int var21 = this.field45.method2062(-25795);
                            long var22 = (long) ((var16 << 16) + var17);
                            Object var24 = null;
                            class172 var25;
                            if (var20) {
                                for (var25 = (class172) this.field40.method739((byte) 67); var25 != null && var25.field3011 != var22; var25 = (class172) this.field40.method747(1)) {
                                }
                            } else {
                                for (var25 = (class172) this.field38.method739((byte) 123); var25 != null && var25.field3011 != var22; var25 = (class172) this.field38.method747(1)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field49 = var25;
                            int var26 = var19 == 0 ? 5 : 9;
                            this.field49.field2381 = new class299(this.field49.field2378 + var21 + var26);
                            this.field49.field2381.method2048(var19, 98);
                            this.field49.field2381.method2084(true, var21);
                            this.field49.field2374 = 8;
                            this.field45.field4351 = 0;
                        } else if (this.field49.field2374 != 0) {
                            throw new IOException();
                        } else if (this.field45.field4350[0] == -1) {
                            this.field45.field4351 = 0;
                            this.field49.field2374 = 1;
                        } else {
                            this.field49 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field44.method526(-19055);
            } catch (Exception var29) {
            }
            this.field44 = null;
            this.field46++;
            this.field47 = -2;
            return this.method21(false) == 0 && this.method9(arg0 ^ 0x69A2) == 0;
        }
    }
}
