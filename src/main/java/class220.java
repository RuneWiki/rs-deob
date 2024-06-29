import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class220 extends class48 {

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field3707 = 0;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "Lbe;")
    public static class283 field3711 = class153.method941(126, "Versteckt");

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "Lek;")
    public static class172 field3709;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "[[Lsf;")
    public static class100[][] field3710;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILea;III)V", line = 4)
    public static final void method1443(int arg0, class191 arg1, int arg2, int arg3, int arg4) {
        field3713++;
        if (class213.field3624 == arg1 || class42.field589 >= 400) {
            return;
        }
        class283 var5;
        if (arg1.field3271 == 0) {
            var5 = class299.method2022(new class283[] { arg1.method1240(false), class231.method1560(arg1.field3259, (byte) -108, class213.field3624.field3259), class18.field224, class37.field540, class296.method2012(arg1.field3259, (byte) -117), class72.field1273 }, (byte) 90);
        } else {
            var5 = class299.method2022(new class283[] { arg1.method1240(false), class18.field224, class140.field2330, class296.method2012(arg1.field3271, (byte) -92), class72.field1273 }, (byte) 64);
        }
        if (class222.field3727 == 1) {
            class275.method1848(arg4, class40.field562, (long) arg2, (byte) -60, arg3, class299.method2022(new class283[] { class222.field3745, class190.field3244, var5 }, (byte) 53), (short) 9);
            class304.field5179++;
        } else if (!class103.field1760) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class12.field121[var6] != null) {
                    class263.field4480++;
                    short var7 = 0;
                    if (class280.field4678 == 0 && class12.field121[var6].method1910(16369, class71.field1221)) {
                        if (arg1.field3259 > class213.field3624.field3259) {
                            var7 = 2000;
                        }
                        if (class213.field3624.field3266 != 0 && arg1.field3266 != 0) {
                            if (class213.field3624.field3266 == arg1.field3266) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class122.field2029[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    short var9 = class86.field1448[var6];
                    short var10 = (short) (var7 + var9);
                    class275.method1848(arg4, class12.field121[var6], (long) arg2, (byte) -60, arg3, class299.method2022(new class283[] { class87.field1479, var5 }, (byte) 124), var10);
                }
            }
        } else if ((class12.field112 & 0x8) == 8) {
            class275.method1848(arg4, class89.field1514, (long) arg2, (byte) -60, arg3, class299.method2022(new class283[] { class135.field2272, class190.field3244, var5 }, (byte) 112), (short) 28);
            class223.field3755++;
        }
        int var11 = 0;
        int var12 = 51 % ((-arg0 - 32) / 49);
        while (class42.field589 > var11) {
            if (class110.field1868[var11] == 35) {
                class216.field3656[var11] = class299.method2022(new class283[] { class87.field1479, var5 }, (byte) 39);
                break;
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)V", line = 109)
    public static final void method1444(byte arg0, int arg1) {
        if (class208.field3567 == null) {
            class208.field3567 = new byte[4][104][104];
        }
        for (int var2 = arg1; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class208.field3567[var2][var3][var4] = arg0;
                }
            }
        }
        field3708++;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 145)
    public static void method1445(byte arg0) {
        field3710 = (class100[][]) null;
        field3711 = null;
        if (arg0 == 75) {
            field3709 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIIZIIIII)Z", line = 163)
    public static final boolean method1446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class36.field528[var13][var14] = 0;
                class202.field3446[var13][var14] = 99999999;
            }
        }
        class36.field528[arg1][arg3] = 99;
        int var15 = arg1;
        byte var16 = 0;
        field3714++;
        int var17 = arg3;
        int var18 = 0;
        boolean var19 = false;
        class202.field3446[arg1][arg3] = 0;
        class126.field2082[var16] = arg1;
        int var41 = var16 + 1;
        class298.field5046[var16] = arg3;
        int[][] var20 = class180.field3102[class61.field850].field1765;
        label391: while (var41 != var18) {
            var17 = class298.field5046[var18];
            var15 = class126.field2082[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg9 == var15 && arg11 == var17) {
                var19 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class180.field3102[class61.field850].method699(var15, arg0 - 1, (byte) 25, arg9, var17, arg12, arg6, arg11)) {
                    var19 = true;
                    break;
                }
                if (arg0 < 10 && class180.field3102[class61.field850].method687(arg0 - 1, arg6, var17, var15, arg9, arg4 + 3, arg12, arg11)) {
                    var19 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg5 != 0 && class180.field3102[class61.field850].method681(arg11, arg2, (byte) -120, arg5, arg9, arg8, var15, arg6, var17)) {
                var19 = true;
                break;
            }
            int var21 = class202.field3446[var15][var17] + 1;
            if (var15 > 0 && class36.field528[var15 - 1][var17] == 0 && (var20[var15 - 1][var17] & 0x12C010E) == 0 && (var20[var15 - 1][arg6 + var17 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= (arg6 - 1)) {
                        class126.field2082[var41] = var15 - 1;
                        class298.field5046[var41] = var17;
                        var41 = var41 + 1 & 0xFFF;
                        class36.field528[var15 - 1][var17] = 2;
                        class202.field3446[var15 - 1][var17] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var17 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class36.field528[var15 + 1][var17] == 0 && (var20[arg6 + var15][var17] & 0x12C0183) == 0 && (var20[arg6 + var15][var17 + arg6 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg6 - 1) {
                        class126.field2082[var41] = var15 + 1;
                        class298.field5046[var41] = var17;
                        var41 = var41 + 1 & 0xFFF;
                        class36.field528[var15 + 1][var17] = 8;
                        class202.field3446[var15 + 1][var17] = var21;
                        break;
                    }
                    if ((var20[arg6 + var15][var17 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var17 > 0 && class36.field528[var15][var17 - 1] == 0 && (var20[var15][var17 - 1] & 0x12C010E) == 0 && (var20[arg6 + var15 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= (arg6 - 1)) {
                        class126.field2082[var41] = var15;
                        class298.field5046[var41] = var17 - 1;
                        class36.field528[var15][var17 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class202.field3446[var15][var17 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var17 < 102 && class36.field528[var15][var17 + 1] == 0 && (var20[var15][arg6 + var17] & 0x12C0138) == 0 && (var20[arg6 + var15 - 1][arg6 + var17] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= arg6 - 1) {
                        class126.field2082[var41] = var15;
                        class298.field5046[var41] = var17 + 1;
                        class36.field528[var15][var17 + 1] = 4;
                        var41 = var41 + 1 & 0xFFF;
                        class202.field3446[var15][var17 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg6 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var17 > 0 && class36.field528[var15 - 1][var17 - 1] == 0 && (var20[var15 - 1][arg6 + var17 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var17 - 1] & 0x12C010E) == 0 && (var20[arg6 + var15 - 1 - 1][var17 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= (arg6 - 1)) {
                        class126.field2082[var41] = var15 - 1;
                        class298.field5046[var41] = var17 - 1;
                        class36.field528[var15 - 1][var17 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class202.field3446[var15 - 1][var17 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var17 + var26 - 1] & 0x12C013E) != 0 || (var20[var15 + var26 - 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var17 > 0 && class36.field528[var15 + 1][var17 - 1] == 0 && (var20[var15 + 1][var17 - 1] & 0x12C010E) == 0 && (var20[arg6 + var15][var17 - 1] & 0x12C0183) == 0 && (var20[arg6 + var15][arg6 + var17 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= (arg6 - 1)) {
                        class126.field2082[var41] = var15 + 1;
                        class298.field5046[var41] = var17 - 1;
                        class36.field528[var15 + 1][var17 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class202.field3446[var15 + 1][var17 - 1] = var21;
                        break;
                    }
                    if ((var20[arg6 + var15][var27 + var17 - 1] & 0x12C01E3) != 0 || (var20[var27 + var15 + 1][var17 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var17 < 102 && class36.field528[var15 - 1][var17 + 1] == 0 && (var20[var15 - 1][var17 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][var17 + arg6] & 0x12C0138) == 0 && (var20[var15][arg6 + var17] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= (arg6 - 1)) {
                        class126.field2082[var41] = var15 - 1;
                        class298.field5046[var41] = var17 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class36.field528[var15 - 1][var17 + 1] = 6;
                        class202.field3446[var15 - 1][var17 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var17 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][arg6 + var17] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var17 < 102 && class36.field528[var15 + 1][var17 + 1] == 0 && (var20[var15 + 1][var17 + arg6] & 0x12C0138) == 0 && (var20[var15 + arg6][arg6 + var17] & 0x12C01E0) == 0 && (var20[arg6 + var15][var17 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg6 - 1); var29++) {
                    if ((var20[var15 + var29 + 1][arg6 + var17] & 0x12C01F8) != 0 || (var20[arg6 + var15][var17 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label391;
                    }
                }
                class126.field2082[var41] = var15 + 1;
                class298.field5046[var41] = var17 + 1;
                class36.field528[var15 + 1][var17 + 1] = 12;
                class202.field3446[var15 + 1][var17 + 1] = var21;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class216.field3658 = 0;
        if (!var19) {
            if (!arg7) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg9 - var32; var33 <= arg9 + var32; var33++) {
                for (int var34 = arg11 - var32; var34 <= (arg11 + var32); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class202.field3446[var33][var34] < 100) {
                        int var35 = 0;
                        if (arg9 > var33) {
                            var35 = arg9 - var33;
                        } else if (arg8 + arg9 - 1 < var33) {
                            var35 = var33 - (arg9 + arg8 - 1);
                        }
                        int var36 = 0;
                        if (var34 < arg11) {
                            var36 = arg11 - var34;
                        } else if ((arg11 + arg5 - 1) < var34) {
                            var36 = var34 + 1 - arg5 - arg11;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var30 > var37 || var30 == var37 && class202.field3446[var33][var34] < var31) {
                            var30 = var37;
                            var31 = class202.field3446[var33][var34];
                            var17 = var34;
                            var15 = var33;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg1 == var15 && arg3 == var17) {
                return false;
            }
            class216.field3658 = 1;
        }
        byte var38 = 0;
        class126.field2082[var38] = var15;
        int var42 = var38 + 1;
        class298.field5046[var38] = var17;
        int var39;
        int var40 = var39 = class36.field528[var15][var17];
        while (arg1 != var15 || arg3 != var17) {
            if (var39 != var40) {
                class126.field2082[var42] = var15;
                class298.field5046[var42++] = var17;
                var39 = var40;
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
            var40 = class36.field528[var15][var17];
        }
        if (var42 > 0) {
            class203.method1297(var42, (byte) -20, arg10);
            return true;
        } else if (~arg10 == arg4) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lbe;I)V", line = 678)
    public static final void method1447(class283 arg0, int arg1) {
        class79.method522(0);
        field3706++;
        class305.method2071(arg0, (byte) 88);
        if (arg1 != 19661112) {
            field3711 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Z)V", line = 699)
    public static final void method1448(boolean arg0) {
        class46.field632.method1631(-27875);
        if (!arg0) {
            field3710 = (class100[][]) ((class100[][]) null);
        }
        field3705++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lui;IZ)V", line = 717)
    public static final void method1449(class251 arg0, int arg1, boolean arg2) {
        field3712++;
        if (arg1 != -1) {
            field3709 = (class172) null;
        }
        if (arg2) {
            class155.field2552 = 3;
            class61.method402(false, false);
            class33.field501 = false;
            class55.field769 = false;
            class91.field1541 = false;
            class119.field2007 = 0;
            class23.field345 = 0;
            class2.field26 = false;
            class96.field1612 = false;
            class44.field601 = false;
            class47.field650 = false;
            class228.field3839 = false;
            class83.field1408 = false;
            class71.field1230 = false;
            class149.field2432 = false;
            class118.field1990 = 255;
            class255.field4301 = 127;
            class297.field5039 = 0;
            class33.field500 = 127;
            class104.field1784 = 0;
            class178.field3068 = false;
            class202.method1293(arg0, -104);
            return;
        }
        class274 var3 = null;
        class155.field2552 = 3;
        class61.method402(false, true);
        class55.field769 = true;
        class44.field601 = true;
        class23.field345 = 2;
        class2.field26 = true;
        class119.field2007 = 0;
        class255.field4301 = 127;
        class47.field650 = true;
        class71.field1230 = true;
        class104.field1784 = 0;
        class33.field501 = true;
        class33.field500 = 127;
        class178.field3068 = true;
        class149.field2432 = true;
        class228.field3839 = true;
        class297.field5039 = 0;
        class118.field1990 = 255;
        class91.field1541 = true;
        class83.field1408 = true;
        class96.field1612 = true;
        try {
            class310 var4 = arg0.method1704(arg1 - 122, "runescape");
            while (var4.field5293 == 0) {
                class2.method11((byte) -20, 1L);
            }
            if (var4.field5293 == 1) {
                var3 = (class274) var4.field5296;
                byte[] var5 = new byte[(int) var3.method1841(true)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method1844(var6, true, var5.length - var6, var5);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class69.method449(new class229(var5), (byte) -79);
            }
        } catch (Exception var11) {
        }
        try {
            if (var3 != null) {
                var3.method1843(-109);
            }
        } catch (Exception var10) {
        }
    }
}
