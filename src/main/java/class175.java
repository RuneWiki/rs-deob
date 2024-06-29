import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public abstract class class175 extends class159 {

    @OriginalMember(owner = "client!pha", name = "l", descriptor = "Z")
    public boolean field2305;

    @OriginalMember(owner = "client!pha", name = "B", descriptor = "[Lpha;")
    public class175[] field2321;

    @OriginalMember(owner = "client!pha", name = "n", descriptor = "Lfea;")
    public static class152 field2307 = new class152();

    @OriginalMember(owner = "client!pha", name = "k", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!pha", name = "m", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!pha", name = "o", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!pha", name = "p", descriptor = "I")
    public int field2309;

    @OriginalMember(owner = "client!pha", name = "r", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!pha", name = "s", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!pha", name = "t", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!pha", name = "v", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!pha", name = "x", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!pha", name = "A", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!pha", name = "C", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!pha", name = "D", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!pha", name = "q", descriptor = "Lds;")
    public class16 field2310;

    @OriginalMember(owner = "client!pha", name = "u", descriptor = "Lmba;")
    public static class441 field2314;

    @OriginalMember(owner = "client!pha", name = "w", descriptor = "Lsk;")
    public class648 field2316;

    @OriginalMember(owner = "client!pha", name = "y", descriptor = "[Loq;")
    public static class378[] field2318;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IB)[[I")
    public int[][] method238(int arg0, byte arg1) {
        if (arg1 >= -47) {
            return null;
        } else {
            field2312++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)I")
    public int method1201(int arg0) {
        field2320++;
        return arg0 <= 118 ? 96 : -1;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(III)[I")
    public final int[] method1202(int arg0, int arg1, int arg2) {
        field2315++;
        if (arg1 != -1150480797) {
            this.method47(false, 21);
        }
        return this.field2321[arg2].field2305 ? this.field2321[arg2].method47(true, arg0) : this.field2321[arg2].method238(arg0, (byte) -126)[0];
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(B)V")
    public void method1203(byte arg0) {
        if (this.field2305) {
            this.field2310.method92(false);
            this.field2310 = null;
        } else {
            this.field2316.method3601((byte) -86);
            this.field2316 = null;
        }
        field2304++;
        if (arg0 != 40) {
            this.field2316 = null;
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIB)V")
    public void method1204(int arg0, int arg1, byte arg2) {
        field2317++;
        int var4 = this.field2309 == 255 ? arg0 : this.field2309;
        if (this.field2305) {
            this.field2310 = new class16(var4, arg0, arg1);
        } else {
            this.field2316 = new class648(var4, arg0, arg1);
        }
        if (arg2 != -87) {
            field2307 = null;
        }
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(III)[[I")
    public final int[][] method1205(int arg0, int arg1, int arg2) {
        if (arg2 != 29179) {
            return null;
        }
        field2323++;
        if (this.field2321[arg0].field2305) {
            int[] var4 = this.field2321[arg0].method47(true, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2321[arg0].method238(arg1, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(I)V")
    public void method46(int arg0) {
        field2306++;
        if (arg0 != -8) {
            this.method238(-122, (byte) 10);
        }
    }

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "(I)V")
    public static void method1206(int arg0) {
        field2318 = null;
        field2314 = null;
        int var1 = -39 / ((arg0 - 49) / 54);
        field2307 = null;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)I")
    public int method1207(boolean arg0) {
        if (arg0) {
            field2311++;
            return -1;
        } else {
            return 6;
        }
    }

    @OriginalMember(owner = "client!pha", name = "f", descriptor = "(I)V")
    public static final void method1208(int arg0) {
        field2313++;
        for (int var1 = 0; var1 < class770.field10602; var1++) {
            int var2 = class318.field4517[var1];
            class22 var3 = ((class316) class176.field2326.method1248(118, (long) var2)).field4455;
            int var4 = class560.field7678.method1731((byte) 64);
            if ((var4 & 0x8) != 0) {
                var4 += class560.field7678.method1731((byte) 64) << 8;
            }
            if ((var4 & 0x8000) != 0) {
                var4 += class560.field7678.method1731((byte) 64) << 16;
            }
            if ((var4 & 0x100) != 0) {
                int var5 = class560.field7678.method1691(117);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                for (int var8 = 0; var8 < var5; var8++) {
                    int var9 = class560.field7678.method1703((byte) 75);
                    if ((var9 & 0xC000) == 49152) {
                        int var10 = class560.field7678.method1703((byte) 81);
                        var6[var8] = class670.method3699(var9 << 16, var10);
                    } else {
                        var6[var8] = var9;
                    }
                    var7[var8] = class560.field7678.method1703((byte) 116);
                }
                var3.method2572(var6, -28573, var7);
            }
            if ((var4 & 0x2000) != 0) {
                var3.field6105 = class560.field7678.method1683(-32070);
                var3.field6126 = class560.field7678.method1737(true);
                var3.field6154 = class560.field7678.method1683(-32070);
                var3.field6102 = class560.field7678.method1680(-84);
                var3.field6165 = class560.field7678.method1712(arg0 - 1) + class572.field7788;
                var3.field6104 = class560.field7678.method1736(arg0 - 91) + class572.field7788;
                var3.field6107 = class560.field7678.method1711(-120);
                var3.field6126 += var3.field6197[0];
                var3.field6154 += var3.field6198[0];
                var3.field6195 = 1;
                var3.field6200 = 0;
                var3.field6102 += var3.field6197[0];
                var3.field6105 += var3.field6198[0];
            }
            if ((var4 & 0x400) != 0) {
                var3.field6148 = class560.field7678.method1683(-32070);
                var3.field6113 = class560.field7678.method1737(true);
                var3.field6120 = class560.field7678.method1737(true);
                var3.field6153 = (byte) class560.field7678.method1676(255);
                var3.field6185 = class572.field7788 + class560.field7678.method1736(arg0 + 119);
                var3.field6129 = class572.field7788 + class560.field7678.method1712(0);
            }
            if ((var4 & 0x1000) != 0) {
                int var11 = class560.field7678.method1691(95);
                int[] var12 = new int[var11];
                int[] var13 = new int[var11];
                int[] var14 = new int[var11];
                for (int var15 = 0; var15 < var11; var15++) {
                    int var16 = class560.field7678.method1712(0);
                    if (var16 == 65535) {
                        var16 = -1;
                    }
                    var12[var15] = var16;
                    var13[var15] = class560.field7678.method1711(-120);
                    var14[var15] = class560.field7678.method1703((byte) 103);
                }
                class444.method2652(var3, var14, var12, -25927, var13);
            }
            if ((var4 & 0x80000) != 0) {
                var3.field228 = class560.field7678.method1712(0);
                if (var3.field228 == 65535) {
                    var3.field228 = var3.field217.field4313;
                }
            }
            if ((var4 & 0x20000) != 0) {
                int var17 = var3.field217.field4333.length;
                int var18 = 0;
                if (var3.field217.field4296 != null) {
                    var18 = var3.field217.field4296.length;
                }
                if (var3.field217.field4303 != null) {
                    var18 = var3.field217.field4303.length;
                }
                byte var19 = 0;
                int var20 = class560.field7678.method1691(125);
                if ((var20 & 0x1) != 1) {
                    int[] var21 = null;
                    if ((var20 & 0x2) == 2) {
                        var21 = new int[var17];
                        for (int var22 = 0; var22 < var17; var22++) {
                            var21[var22] = class560.field7678.method1712(0);
                        }
                    }
                    short[] var23 = null;
                    if ((var20 & 0x4) == 4) {
                        var23 = new short[var18];
                        for (int var24 = 0; var24 < var18; var24++) {
                            var23[var24] = (short) class560.field7678.method1728((byte) 116);
                        }
                    }
                    short[] var25 = null;
                    if ((var20 & 0x8) == 8) {
                        var25 = new short[var19];
                        for (int var26 = 0; var26 < var19; var26++) {
                            var25[var26] = (short) class560.field7678.method1728((byte) 81);
                        }
                    }
                    long var27 = (long) var2 | (long) (var3.field227++) << 32;
                    new class400(var27, var21, var23, var25);
                }
            }
            if ((var4 & 0x800) != 0) {
                int var29 = class560.field7678.method1728((byte) 23);
                var3.field6131 = class560.field7678.method1711(arg0 - 124);
                var3.field6152 = class560.field7678.method1691(122);
                var3.field6145 = (var29 & 0x8000) != 0;
                var3.field6159 = var29 & 0x7FFF;
                var3.field6130 = class572.field7788 + var3.field6159 + var3.field6131;
            }
            if ((var4 & 0x10000) != 0) {
                var3.field211 = class560.field7678.method1699(-104);
                if ("".equals(var3.field211) || var3.field211.equals(var3.field217.field4278)) {
                    var3.field211 = var3.field217.field4278;
                }
            }
            if ((var4 & 0x1) != 0) {
                int[] var30 = new int[4];
                for (int var31 = 0; var31 < 4; var31++) {
                    var30[var31] = class560.field7678.method1703((byte) 97);
                    if (var30[var31] == 65535) {
                        var30[var31] = -1;
                    }
                }
                int var32 = class560.field7678.method1676(255);
                class56.method355(var3, var30, var32, -29);
            }
            if ((var4 & 0x40) != 0) {
                var3.field6182 = class560.field7678.method1699(-128);
                var3.field6133 = 100;
            }
            if ((var4 & 0x40000) != 0) {
                int var33 = class560.field7678.method1712(0);
                if (var33 == 65535) {
                    var33 = -1;
                }
                int var34 = class560.field7678.method1706(-55);
                int var35 = class560.field7678.method1731((byte) 64);
                int var36 = var35 & 0x7;
                int var37 = (var35 & 0x7B) >> 3;
                if (var37 == 15) {
                    var37 = -1;
                }
                var3.method2557(2, (byte) -84, var36, var37, var33, var34);
            }
            if ((var4 & 0x4000) != 0) {
                int var38 = var3.field217.field4298.length;
                int var39 = 0;
                if (var3.field217.field4296 != null) {
                    var39 = var3.field217.field4296.length;
                }
                int var40 = 0;
                if (var3.field217.field4303 != null) {
                    var40 = var3.field217.field4303.length;
                }
                int var41 = class560.field7678.method1676(arg0 + 254);
                if ((var41 & 0x1) == 1) {
                    var3.field226 = null;
                } else {
                    int[] var42 = null;
                    if ((var41 & 0x2) == 2) {
                        var42 = new int[var38];
                        for (int var43 = 0; var43 < var38; var43++) {
                            var42[var43] = class560.field7678.method1712(0);
                        }
                    }
                    short[] var44 = null;
                    if ((var41 & 0x4) == 4) {
                        var44 = new short[var39];
                        for (int var45 = 0; var45 < var39; var45++) {
                            var44[var45] = (short) class560.field7678.method1736(-11);
                        }
                    }
                    short[] var46 = null;
                    if ((var41 & 0x8) == 8) {
                        var46 = new short[var40];
                        for (int var47 = 0; var47 < var40; var47++) {
                            var46[var47] = (short) class560.field7678.method1728((byte) 48);
                        }
                    }
                    long var48 = (long) var2 | (long) (var3.field222++) << 32;
                    var3.field226 = new class400(var48, var42, var44, var46);
                }
            }
            if ((var4 & 0x20) != 0) {
                int var50 = class560.field7678.method1676(255);
                if (var50 > 0) {
                    for (int var51 = 0; var51 < var50; var51++) {
                        int var52 = -1;
                        int var53 = -1;
                        int var54 = class560.field7678.method1673(arg0 ^ 0xFFFF8001);
                        int var55 = -1;
                        if (var54 == 32767) {
                            var54 = class560.field7678.method1673(-32768);
                            var53 = class560.field7678.method1673(-32768);
                            var52 = class560.field7678.method1673(arg0 ^ 0xFFFF8001);
                            var55 = class560.field7678.method1673(-32768);
                        } else if (var54 == 32766) {
                            var54 = -1;
                        } else {
                            var53 = class560.field7678.method1673(-32768);
                        }
                        int var56 = class560.field7678.method1673(-32768);
                        int var57 = class560.field7678.method1691(115);
                        var3.method2569(var54, var52, var56, class572.field7788, var55, arg0 + 199, var53, var57);
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field6149 = class560.field7678.method1703((byte) 82);
                if (var3.field6149 == 65535) {
                    var3.field6149 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field217.method1963(arg0 ^ 0x1)) {
                    class487.method2846(var3, -12);
                }
                var3.method132((byte) -117, class107.field1507.method3587(class560.field7678.method1736(125), 0));
                var3.method2559((byte) -81, var3.field217.field4300);
                var3.field6101 = var3.field217.field4299 << 3;
                if (var3.field217.method1963(0)) {
                    class603.method3373(0, var3.field2813, null, arg0 ^ 0x4C3A, var3.field6198[0], var3, var3.field6197[0], null);
                }
            }
            if ((var4 & 0x200) != 0) {
                int var58 = class560.field7678.method1703((byte) 87);
                if (var58 == 65535) {
                    var58 = -1;
                }
                int var59 = class560.field7678.method1698((byte) 76);
                int var60 = class560.field7678.method1711(-120);
                int var61 = var60 & 0x7;
                int var62 = (var60 & 0x78) >> 3;
                if (var62 == 15) {
                    var62 = -1;
                }
                var3.method2557(1, (byte) -84, var61, var62, var58, var59);
            }
            if ((var4 & 0x80) != 0) {
                var3.field212 = class560.field7678.method1736(arg0 - 109);
                var3.field214 = class560.field7678.method1736(arg0 ^ 0x7D);
            }
            if ((var4 & 0x10) != 0) {
                int var63 = class560.field7678.method1736(125);
                if (var63 == 65535) {
                    var63 = -1;
                }
                int var64 = class560.field7678.method1672(-16516);
                int var65 = class560.field7678.method1676(arg0 ^ 0xFE);
                int var66 = var65 & 0x7;
                int var67 = var65 >> 3 & 0xF;
                if (var67 == 15) {
                    var67 = -1;
                }
                var3.method2557(0, (byte) -84, var66, var67, var63, var64);
            }
        }
        if (arg0 != 1) {
            method1206(-22);
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZI)[I")
    public int[] method47(boolean arg0, int arg1) {
        field2322++;
        if (arg0) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILdt;Z)V")
    public void method44(int arg0, class254 arg1, boolean arg2) {
        field2308++;
        if (arg2) {
            field2307 = null;
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(IZ)V")
    public class175(int arg0, boolean arg1) {
        this.field2305 = arg1;
        this.field2321 = new class175[arg0];
    }
}
