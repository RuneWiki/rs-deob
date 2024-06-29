import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class341 {

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Lad;")
    private class244 field4768 = new class244();

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "Lad;")
    private class244 field4771 = new class244();

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lad;")
    private class244 field4772 = new class244();

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Lad;")
    private class244 field4775 = new class244();

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "Leb;")
    private class371 field4778 = new class371(4);

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public volatile int field4781 = 0;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "B")
    private byte field4783 = 0;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
    public volatile int field4780 = 0;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "Leb;")
    private class371 field4782 = new class371(8);

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4770 = "Select";

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field4765 = 0;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Lbr;")
    public static class223 field4756 = new class223(128);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    private int field4779;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "J")
    private long field4777;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "Lfc;")
    private class141 field4784;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Lpr;")
    private class258 field4776;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 3)
    public final void method2183(int arg0) {
        field4769++;
        try {
            this.field4776.method1593(3);
        } catch (Exception var2) {
        }
        this.field4783 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4781++;
        this.field4776 = null;
        this.field4780 = arg0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 19)
    public final void method2184(byte arg0) {
        if (this.field4776 != null) {
            this.field4776.method1590(-63);
        }
        field4758++;
        if (arg0 < 58) {
            this.method2192((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z", line = 35)
    public final boolean method2185(int arg0) {
        if (arg0 != 16) {
            method2191(-128);
        }
        field4767++;
        return this.method2192((byte) -115) >= 20;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljk;Luk;)V", line = 46)
    public static final void method2186(class378 arg0, class142 arg1) {
        if (!arg1.field2033) {
            return;
        }
        short var2 = arg1.field2054;
        short var3 = arg1.field2045;
        byte var4 = arg1.field2040;
        byte var5 = arg1.field2053;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class142[][] var8 = class5.field79[var4];
        float var10;
        if (class435.field6248 == class249.field3456) {
            int var9 = class270.field3683[var2][var3];
            class352.field4917.method1766(class156.field2213[0].method278(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 251.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class352.field4917.method1805(3000.0F, var10 * 1.5F);
        if (arg1.field2050) {
            if (class8.field122) {
                if (var4 > 0) {
                    class142 var11 = class5.field79[var4 - 1][var2][var3];
                    if (var11 != null && var11.field2033) {
                        return;
                    }
                }
                if (var2 <= class451.field6574 && var2 > class265.field3623) {
                    class142 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field2033 && (var12.field2050 || (arg1.field2036 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class451.field6574 && var2 < class350.field4887 - 1) {
                    class142 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field2033 && (var13.field2050 || (arg1.field2036 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class48.field738 && var3 > class179.field2506) {
                    class142 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field2033 && (var14.field2050 || (arg1.field2036 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class48.field738 && var3 < class426.field6112 - 1) {
                    class142 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field2033 && (var15.field2050 || (arg1.field2036 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class8.field122 = true;
            }
            arg1.field2050 = false;
            if (arg1.field2041 != null) {
                class142 var16 = arg1.field2041;
                class352.field4917.method1805(3000.0F, (201.5F - (float) (var16.field2053 + 1) * 50.0F) * 1.5F);
                if (!class326.method2050(var16.field2053, var2, var3)) {
                    class249.field3456[var16.field2053].method267(var2, var3);
                }
                class254 var17 = var16.field2031;
                if (var17 != null) {
                    if (class105.field1575) {
                        if ((var17.field3491 & arg1.field2037) == 0) {
                            class169.method1141(arg0, var4, var2, var3);
                        } else {
                            class144.method993(arg0, var17.field3491, var5, var2, var3);
                        }
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    var17.method131(class352.field4917, 94);
                }
                for (class218 var18 = var16.field2043; var18 != null; var18 = var18.field2884) {
                    class430 var19 = var18.field2882;
                    if (var19 != null) {
                        if (class105.field1575) {
                            class169.method1141(arg0, var4, var2, var3);
                            class352.field4917.method1745(arg0.field5386, arg0.field5391);
                        }
                        var19.method131(class352.field4917, 116);
                    }
                }
                class352.field4917.method1805(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class326.method2050(var5, var2, var3);
            if (var20) {
                class249.field3456[var5].method267(var2, var3);
                class127 var21 = arg1.field2047;
                if (var21 != null && var21.field1780) {
                    if (var21.field1788) {
                        class352.field4917.method1805(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class105.field1575) {
                        class169.method1141(arg0, var4, var2, var3);
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    class300 var22 = var21.method131(class352.field4917, 100);
                    if (var22 != null) {
                        var22.field4157 = var21;
                        var22.field4153 = var4;
                        var22.field4149 = var2;
                        var22.field4155 = var3;
                        class145.field2112.method2310(var22, -12918);
                    }
                    if (var21.field1788) {
                        class352.field4917.method1805(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class254 var25 = arg1.field2031;
            class81 var26 = arg1.field2052;
            if (var25 != null || var26 != null) {
                if (class451.field6574 == var2) {
                    var23++;
                } else if (class451.field6574 < var2) {
                    var23 += 2;
                }
                if (class48.field738 == var3) {
                    var23 += 3;
                } else if (class48.field738 > var3) {
                    var23 += 6;
                }
                var24 = class221.field2913[var23];
                arg1.field2037 = class214.field2855[var23];
            }
            if (var25 != null) {
                if ((var25.field3491 & class366.field5121[var23]) == 0) {
                    arg1.field2032 = 0;
                } else if (var25.field3491 == 16) {
                    arg1.field2032 = 3;
                    arg1.field2034 = class12.field158[var23];
                    arg1.field2055 = (byte) (3 - arg1.field2034);
                } else if (var25.field3491 == 32) {
                    arg1.field2032 = 6;
                    arg1.field2034 = class250.field3457[var23];
                    arg1.field2055 = (byte) (6 - arg1.field2034);
                } else if (var25.field3491 == 64) {
                    arg1.field2032 = 12;
                    arg1.field2034 = class109.field1609[var23];
                    arg1.field2055 = (byte) (12 - arg1.field2034);
                } else {
                    arg1.field2032 = 9;
                    arg1.field2034 = class299.field4143[var23];
                    arg1.field2055 = (byte) (9 - arg1.field2034);
                }
                if ((var25.field3491 & var24) != 0 && !class365.method2346(var5, var2, var3, var25.field3491)) {
                    if (class105.field1575) {
                        class169.method1141(arg0, var4, var2, var3);
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    class300 var27 = var25.method131(class352.field4917, 77);
                    if (var27 != null) {
                        var27.field4157 = var25;
                        var27.field4153 = var4;
                        var27.field4149 = var2;
                        var27.field4155 = var3;
                        class145.field2112.method2310(var27, -12918);
                    }
                }
                class254 var28 = arg1.field2044;
                if (var28 != null && (var28.field3491 & var24) != 0 && !class365.method2346(var5, var2, var3, var28.field3491)) {
                    if (class105.field1575) {
                        class169.method1141(arg0, var4, var2, var3);
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    class300 var29 = var28.method131(class352.field4917, 103);
                    if (var29 != null) {
                        var29.field4157 = var28;
                        var29.field4153 = var4;
                        var29.field4149 = var2;
                        var29.field4155 = var3;
                        class145.field2112.method2310(var29, -12918);
                    }
                }
            }
            if (var26 != null && !class45.method319(var5, var2, var3, var26.method579((byte) 89))) {
                class81 var30 = arg1.field2035;
                class352.field4917.method1805(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field1255 & var24) != 0) {
                    if (class105.field1575) {
                        class169.method1141(arg0, var4, var2, var3);
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    class300 var31 = var26.method131(class352.field4917, 76);
                    if (var31 != null) {
                        var31.field4157 = var26;
                        var31.field4153 = var4;
                        var31.field4149 = var2;
                        var31.field4155 = var3;
                        class145.field2112.method2310(var31, -12918);
                    }
                } else if (var26.field1255 == 256) {
                    int var32 = var26.field1251 - class167.field2387;
                    int var33 = var26.field1256 - class180.field2514;
                    int var34 = var26.field1261;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class105.field1575) {
                        class169.method1141(arg0, var4, var2, var3);
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    if (var36 < var35) {
                        class300 var37 = var26.method131(class352.field4917, 75);
                        if (var37 != null) {
                            var37.field4157 = var26;
                            var37.field4153 = var4;
                            var37.field4149 = var2;
                            var37.field4155 = var3;
                            class145.field2112.method2310(var37, -12918);
                        }
                    } else if (var30 != null) {
                        class300 var38 = var30.method131(class352.field4917, 114);
                        if (var38 != null) {
                            var38.field4157 = var30;
                            var38.field4153 = var4;
                            var38.field4149 = var2;
                            var38.field4155 = var3;
                            class145.field2112.method2310(var38, -12918);
                        }
                    }
                }
                class352.field4917.method1805(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class127 var39 = arg1.field2047;
                if (var39 != null && !var39.field1780) {
                    if (var39.field1788) {
                        class352.field4917.method1805(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class105.field1575) {
                        class169.method1141(arg0, var4, var2, var3);
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    class300 var40 = var39.method131(class352.field4917, 117);
                    if (var40 != null) {
                        var40.field4157 = var39;
                        var40.field4153 = var4;
                        var40.field4149 = var2;
                        var40.field4155 = var3;
                        class145.field2112.method2310(var40, -12918);
                    }
                    if (var39.field1788) {
                        class352.field4917.method1805(3000.0F, var10 * 1.5F);
                    }
                }
                class319 var41 = arg1.field2038;
                if (var41 != null && !var41.field4379) {
                    if (class105.field1575) {
                        class169.method1141(arg0, var4, var2, var3);
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    class300 var42 = var41.method131(class352.field4917, 96);
                    if (var42 != null) {
                        var42.field4157 = var41;
                        var42.field4153 = var4;
                        var42.field4149 = var2;
                        var42.field4155 = var3;
                        class145.field2112.method2310(var42, -12918);
                    }
                }
            }
            byte var43 = arg1.field2036;
            if (var43 != 0) {
                if (var2 < class451.field6574 && (var43 & 0x4) != 0) {
                    class142 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field2033) {
                        class165.field2357.method1162((byte) -79, var44);
                    }
                }
                if (var3 < class48.field738 && (var43 & 0x2) != 0) {
                    class142 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field2033) {
                        class165.field2357.method1162((byte) 124, var45);
                    }
                }
                if (var2 > class451.field6574 && (var43 & 0x1) != 0) {
                    class142 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field2033) {
                        class165.field2357.method1162((byte) 124, var46);
                    }
                }
                if (var3 > class48.field738 && (var43 & 0x8) != 0) {
                    class142 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field2033) {
                        class165.field2357.method1162((byte) 124, var47);
                    }
                }
            }
        }
        if (arg1.field2032 != 0) {
            boolean var48 = true;
            for (class218 var49 = arg1.field2043; var49 != null; var49 = var49.field2884) {
                if (class352.field4922 != var49.field2882.field6187 && (var49.field2881 & arg1.field2032) == arg1.field2034) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class254 var50 = arg1.field2031;
                if (!class365.method2346(var5, var2, var3, var50.field3491)) {
                    if (class105.field1575) {
                        label687: {
                            if (var50.field3491 >= 16) {
                                int var51 = var2 - class451.field6574;
                                int var52 = var3 - class48.field738;
                                if (var50.field3491 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class371.field5311) {
                                        class169.method1141(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field3491 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class386.field5629 && var3 < class371.field5311) {
                                        class169.method1141(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field3491 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class386.field5629 && var3 > 0) {
                                        class169.method1141(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field3491 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class169.method1141(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class169.method1141(arg0, var4, var2, var3);
                        }
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    class300 var53 = var50.method131(class352.field4917, 121);
                    if (var53 != null) {
                        var53.field4157 = var50;
                        var53.field4153 = var4;
                        var53.field4149 = var2;
                        var53.field4155 = var3;
                        class145.field2112.method2310(var53, -12918);
                    }
                }
                arg1.field2032 = 0;
            }
        }
        if (arg1.field2056) {
            try {
                arg1.field2056 = false;
                int var54 = 0;
                label630: for (class218 var55 = arg1.field2043; var55 != null; var55 = var55.field2884) {
                    class430 var56 = var55.field2882;
                    if (class352.field4922 != var56.field6187) {
                        for (int var57 = var56.field6182; var57 <= var56.field6195; var57++) {
                            for (int var58 = var56.field6186; var58 <= var56.field6185; var58++) {
                                class142 var59 = var8[var57][var58];
                                if (var59.field2050) {
                                    arg1.field2056 = true;
                                    continue label630;
                                }
                                if (var59.field2032 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field6182) {
                                        var60++;
                                    }
                                    if (var57 < var56.field6195) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field6186) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field6185) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field2032) == arg1.field2055) {
                                        arg1.field2056 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class451.field6574 - var56.field6182;
                        int var62 = var56.field6195 - class451.field6574;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class48.field738 - var56.field6186;
                        int var64 = var56.field6185 - class48.field738;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field5392[var54] = var56;
                        arg0.field5384[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class430 var68 = arg0.field5392[var67];
                        if (class352.field4922 != var68.field6187) {
                            int var69 = arg0.field5384[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field6197 - class167.field2387;
                                int var71 = var68.field6192 - class180.field2514;
                                int var72 = arg0.field5392[var66].field6197 - class167.field2387;
                                int var73 = arg0.field5392[var66].field6192 - class180.field2514;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class430 var74 = arg0.field5392[var66];
                    var74.field6187 = class352.field4922;
                    if (!class91.method624(var5, var74.field6182, var74.field6195, var74.field6186, var74.field6185, var74.method600(true))) {
                        if (class105.field1575) {
                            if (var74.field6184 == 0) {
                                class152.method1028(arg0, var4, var74.field6182, var74.field6186, var74.field6195, var74.field6185);
                            } else {
                                class169.method1141(arg0, var4, var2, var3);
                                int var75 = var2 - class451.field6574;
                                int var76 = var3 - class48.field738;
                                if (var74.field6184 == 2) {
                                    if (var76 > -var75) {
                                        class188.method1232(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class188.method1232(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class188.method1232(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class188.method1232(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class352.field4917.method1745(arg0.field5386, arg0.field5391);
                        }
                        class300 var77 = var74.method131(class352.field4917, 101);
                        if (var77 != null) {
                            var77.field4157 = var74;
                            var77.field4153 = var4;
                            var77.field4149 = var74.field6182;
                            var77.field4155 = var74.field6186;
                            class145.field2112.method2310(var77, -12918);
                        }
                    }
                    for (int var78 = var74.field6182; var78 <= var74.field6195; var78++) {
                        for (int var79 = var74.field6186; var79 <= var74.field6185; var79++) {
                            class142 var80 = var8[var78][var79];
                            if (var80.field2032 != 0) {
                                class165.field2357.method1162((byte) 126, var80);
                            } else if ((var2 != var78 || var3 != var79) && var80.field2033) {
                                class165.field2357.method1162((byte) 122, var80);
                            }
                        }
                    }
                }
                if (arg1.field2056) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field2056 = false;
            }
        }
        if (arg1.field2051 != null) {
            if ((byte) (class336.field4550 & 0xFF) == arg1.field2039) {
                class260 var81 = arg1.field2051;
                int var82 = class249.field3456[var4].method275(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class249.field3456[var4].method275(var2, var3) - class249.field3456[var4 + 1].method275(var2, var3);
                } else {
                    var83 = 1024;
                }
                class258.field3539.method881(var6, var82, var7, arg0.field5390);
                int var84 = arg0.field5390[2];
                class258.field3539.method881(var6, var82 - var83, var7, arg0.field5390);
                int var85 = arg0.field5390[2];
                int var86 = var84;
                int var87 = var85;
                if (var84 > var85) {
                    var86 = var85;
                    var87 = var84;
                }
                var86 -= 91;
                var87 += 91;
                if (var86 < var87 - 1597) {
                    var86 = var87 - 1597;
                }
                var81.field3565 = var86;
                var81.field3563 = var87;
                var81.field3566 = true;
                class352.field4917.method1737(var81);
            } else {
                arg1.field2051 = null;
            }
        }
        if (!arg1.field2033) {
            return;
        }
        if (arg1.field2032 != 0) {
            return;
        }
        if (var2 <= class451.field6574 && var2 > class265.field3623) {
            class142 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field2033) {
                return;
            }
        }
        if (var2 >= class451.field6574 && var2 < class350.field4887 - 1) {
            class142 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field2033) {
                return;
            }
        }
        if (var3 <= class48.field738 && var3 > class179.field2506) {
            class142 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field2033) {
                return;
            }
        }
        if (var3 >= class48.field738 && var3 < class426.field6112 - 1) {
            class142 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field2033) {
                return;
            }
        }
        arg1.field2033 = false;
        class13.field162--;
        class319 var92 = arg1.field2038;
        if (var92 != null && var92.field4379) {
            if (class105.field1575) {
                class169.method1141(arg0, var4, var2, var3);
                class352.field4917.method1745(arg0.field5386, arg0.field5391);
            }
            class300 var93 = var92.method131(class352.field4917, 83);
            if (var93 != null) {
                var93.field4157 = var92;
                var93.field4153 = var4;
                var93.field4149 = var2;
                var93.field4155 = var3;
                class145.field2112.method2310(var93, -12918);
            }
        }
        if (arg1.field2037 != 0) {
            class81 var94 = arg1.field2052;
            if (var94 != null && !class45.method319(var5, var2, var3, var94.method579((byte) 82))) {
                if ((var94.field1255 & arg1.field2037) != 0) {
                    if (class105.field1575) {
                        class169.method1141(arg0, var4, var2, var3);
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    class300 var95 = var94.method131(class352.field4917, 97);
                    if (var95 != null) {
                        var95.field4157 = var94;
                        var95.field4153 = var4;
                        var95.field4149 = var2;
                        var95.field4155 = var3;
                        class145.field2112.method2310(var95, -12918);
                    }
                } else if (var94.field1255 == 256) {
                    int var96 = var94.field1251 - class167.field2387;
                    int var97 = var94.field1256 - class180.field2514;
                    int var98 = var94.field1261;
                    int var99;
                    if (var98 == 1 || var98 == 2) {
                        var99 = -var96;
                    } else {
                        var99 = var96;
                    }
                    int var100;
                    if (var98 == 2 || var98 == 3) {
                        var100 = -var97;
                    } else {
                        var100 = var97;
                    }
                    if (class105.field1575) {
                        class169.method1141(arg0, var4, var2, var3);
                        class352.field4917.method1745(arg0.field5386, arg0.field5391);
                    }
                    class81 var101 = arg1.field2035;
                    if (var100 > var99) {
                        class300 var102 = var94.method131(class352.field4917, 92);
                        if (var102 != null) {
                            var102.field4157 = var94;
                            var102.field4153 = var4;
                            var102.field4149 = var2;
                            var102.field4155 = var3;
                            class145.field2112.method2310(var102, -12918);
                        }
                    } else if (var101 != null) {
                        class300 var103 = var101.method131(class352.field4917, 91);
                        if (var103 != null) {
                            var103.field4157 = var101;
                            var103.field4153 = var4;
                            var103.field4149 = var2;
                            var103.field4155 = var3;
                            class145.field2112.method2310(var103, -12918);
                        }
                    }
                }
            }
            class254 var104 = arg1.field2031;
            class254 var105 = arg1.field2044;
            if (var105 != null && (var105.field3491 & arg1.field2037) != 0 && !class365.method2346(var5, var2, var3, var105.field3491)) {
                if (class105.field1575) {
                    class144.method993(arg0, var105.field3491, var4, var2, var3);
                    class352.field4917.method1745(arg0.field5386, arg0.field5391);
                }
                class300 var106 = var105.method131(class352.field4917, 86);
                if (var106 != null) {
                    var106.field4157 = var105;
                    var106.field4153 = var4;
                    var106.field4149 = var2;
                    var106.field4155 = var3;
                    class145.field2112.method2310(var106, -12918);
                }
            }
            if (var104 != null && (var104.field3491 & arg1.field2037) != 0 && !class365.method2346(var5, var2, var3, var104.field3491)) {
                if (class105.field1575) {
                    class144.method993(arg0, var104.field3491, var4, var2, var3);
                    class352.field4917.method1745(arg0.field5386, arg0.field5391);
                }
                class300 var107 = var104.method131(class352.field4917, 107);
                if (var107 != null) {
                    var107.field4157 = var104;
                    var107.field4153 = var4;
                    var107.field4149 = var2;
                    var107.field4155 = var3;
                    class145.field2112.method2310(var107, -12918);
                }
            }
        }
        if (var4 < class176.field2480 - 1) {
            class142 var108 = class5.field79[var4 + 1][var2][var3];
            if (var108 != null && var108.field2033) {
                class165.field2357.method1155(-125, var108);
            }
        }
        if (var2 < class451.field6574) {
            class142 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field2033) {
                class165.field2357.method1162((byte) 121, var109);
            }
        }
        if (var3 < class48.field738) {
            class142 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field2033) {
                class165.field2357.method1162((byte) 124, var110);
            }
        }
        if (var2 > class451.field6574) {
            class142 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field2033) {
                class165.field2357.method1162((byte) 121, var111);
            }
        }
        if (var3 > class48.field738) {
            class142 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field2033) {
                class165.field2357.method1162((byte) 123, var112);
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLpr;B)V", line = 1171)
    public final void method2187(boolean arg0, class258 arg1, byte arg2) {
        field4764++;
        if (this.field4776 != null) {
            try {
                this.field4776.method1593(3);
            } catch (Exception var8) {
            }
            this.field4776 = null;
        }
        this.field4776 = arg1;
        this.method2189((byte) -106);
        this.method2196(arg0, -108);
        this.field4782.field5273 = 0;
        this.field4784 = null;
        while (true) {
            class141 var4 = (class141) this.field4771.method1533(-4174);
            if (var4 == null) {
                while (true) {
                    class141 var5 = (class141) this.field4775.method1533(-4174);
                    if (var5 == null) {
                        if (this.field4783 != 0) {
                            try {
                                this.field4778.field5273 = 0;
                                this.field4778.method2396(4, 12450);
                                this.field4778.method2396(this.field4783, 12450);
                                this.field4778.method2416(22064, 0);
                                this.field4776.method1579(0, 5000, this.field4778.field5258, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field4776.method1593(3);
                                } catch (Exception var6) {
                                }
                                this.field4780 = -2;
                                this.field4781++;
                                this.field4776 = null;
                            }
                        }
                        this.field4779 = 0;
                        this.field4777 = class224.method1425(-26805);
                        if (arg2 > -99) {
                            method2191(47);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.field4772.method1530(var5, true);
                }
            }
            this.field4768.method1530(var4, true);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)Z", line = 1243)
    public final boolean method2188(byte arg0) {
        field4755++;
        if (this.field4776 != null) {
            long var2 = class224.method1425(-26805);
            int var4 = (int) (var2 - this.field4777);
            this.field4777 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4779 += var4;
            if (this.field4779 > 30000) {
                try {
                    this.field4776.method1593(3);
                } catch (Exception var27) {
                }
                this.field4776 = null;
            }
        }
        if (this.field4776 == null) {
            return this.method2192((byte) -108) == 0 && this.method2194(0) == 0;
        }
        try {
            this.field4776.method1588(1);
            for (class141 var5 = (class141) this.field4768.method1527((byte) 84); var5 != null; var5 = (class141) this.field4768.method1532(-11786)) {
                this.field4778.field5273 = 0;
                this.field4778.method2396(1, 12450);
                this.field4778.method2405((int) var5.field6446, -7);
                this.field4776.method1579(0, arg0 + 5069, this.field4778.field5258, 4);
                this.field4771.method1530(var5, true);
            }
            for (class141 var6 = (class141) this.field4772.method1527((byte) 84); var6 != null; var6 = (class141) this.field4772.method1532(-11786)) {
                this.field4778.field5273 = 0;
                this.field4778.method2396(0, 12450);
                this.field4778.method2405((int) var6.field6446, arg0 ^ 0x32);
                this.field4776.method1579(0, 5000, this.field4778.field5258, 4);
                this.field4775.method1530(var6, true);
            }
            if (arg0 != -69) {
                this.method2189((byte) 48);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4776.method1580(1031);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4779 = 0;
                byte var9 = 0;
                if (this.field4784 == null) {
                    var9 = 8;
                } else if (this.field4784.field2011 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4784.field2010.field5258.length - this.field4784.field2009;
                    int var11 = 512 - this.field4784.field2011;
                    if (var11 > var10 - this.field4784.field2010.field5273) {
                        var11 = var10 - this.field4784.field2010.field5273;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field4776.method1584(var11, this.field4784.field2010.field5258, 117, this.field4784.field2010.field5273);
                    if (this.field4783 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4784.field2010.field5258[this.field4784.field2010.field5273 + var12] = (byte) class28.method220(this.field4784.field2010.field5258[this.field4784.field2010.field5273 + var12], this.field4783);
                        }
                    }
                    this.field4784.field2010.field5273 += var11;
                    this.field4784.field2011 += var11;
                    if (this.field4784.field2010.field5273 == var10) {
                        this.field4784.method2788((byte) -111);
                        this.field4784.field4169 = false;
                        this.field4784 = null;
                    } else if (this.field4784.field2011 == 512) {
                        this.field4784.field2011 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4782.field5273;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field4776.method1584(var13, this.field4782.field5258, arg0 + 194, this.field4782.field5273);
                    if (this.field4783 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4782.field5258[this.field4782.field5273 + var14] = (byte) class28.method220(this.field4782.field5258[this.field4782.field5273 + var14], this.field4783);
                        }
                    }
                    this.field4782.field5273 += var13;
                    if (this.field4782.field5273 >= var9) {
                        if (this.field4784 == null) {
                            this.field4782.field5273 = 0;
                            int var15 = this.field4782.method2429(0);
                            int var16 = this.field4782.method2403((byte) 59);
                            int var17 = this.field4782.method2429(arg0 ^ 0xFFFFFFBB);
                            int var18 = this.field4782.method2413((byte) -30);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class141 var24;
                            if (var20) {
                                for (var24 = (class141) this.field4775.method1527((byte) 84); var24 != null && var24.field6446 != var21; var24 = (class141) this.field4775.method1532(-11786)) {
                                }
                            } else {
                                for (var24 = (class141) this.field4771.method1527((byte) 84); var24 != null && var24.field6446 != var21; var24 = (class141) this.field4771.method1532(-11786)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field4784 = var24;
                            this.field4784.field2010 = new class371(var18 + this.field4784.field2009 + var25);
                            this.field4784.field2010.method2396(var19, arg0 ^ 0xFFFFCF19);
                            this.field4784.field2010.method2386(var18, arg0 ^ 0xFFFFB4C7);
                            this.field4784.field2011 = 8;
                            this.field4782.field5273 = 0;
                        } else if (this.field4784.field2011 != 0) {
                            throw new IOException();
                        } else if (this.field4782.field5258[0] == -1) {
                            this.field4784.field2011 = 1;
                            this.field4782.field5273 = 0;
                        } else {
                            this.field4784 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4776.method1593(3);
            } catch (Exception var26) {
            }
            this.field4780 = -2;
            this.field4776 = null;
            this.field4781++;
            return this.method2192((byte) -108) == 0 && this.method2194(0) == 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V", line = 1522)
    private final void method2189(byte arg0) {
        field4761++;
        if (this.field4776 == null) {
            return;
        }
        try {
            this.field4778.field5273 = 0;
            int var2 = -122 % ((arg0 - 18) / 51);
            this.field4778.method2396(6, 12450);
            this.field4778.method2405(3, 87);
            this.field4776.method1579(0, 5000, this.field4778.field5258, 4);
        } catch (IOException var4) {
            try {
                this.field4776.method1593(3);
            } catch (Exception var3) {
            }
            this.field4781++;
            this.field4776 = null;
            this.field4780 = -2;
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(B)V", line = 1552)
    public final void method2190(byte arg0) {
        if (this.field4776 != null) {
            this.field4776.method1593(3);
        }
        field4754++;
        if (arg0 != -102) {
            this.field4784 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 1565)
    public static void method2191(int arg0) {
        field4770 = null;
        if (arg0 != 1) {
            method2198(-111);
        }
        field4756 = null;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)I", line = 1578)
    public final int method2192(byte arg0) {
        if (arg0 > -104) {
            return -36;
        } else {
            field4774++;
            return this.field4768.method1528(64) + this.field4771.method1528(68);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 1589)
    public final void method2193(boolean arg0) {
        field4760++;
        if (this.field4776 == null) {
            return;
        }
        if (arg0) {
            this.method2196(false, 116);
        }
        try {
            this.field4778.field5273 = 0;
            this.field4778.method2396(7, 12450);
            this.field4778.method2405(0, 53);
            this.field4776.method1579(0, 5000, this.field4778.field5258, 4);
        } catch (IOException var3) {
            try {
                this.field4776.method1593(3);
            } catch (Exception var2) {
            }
            this.field4781++;
            this.field4780 = -2;
            this.field4776 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)I", line = 1617)
    private final int method2194(int arg0) {
        field4763++;
        if (arg0 != 0) {
            this.method2187(true, (class258) null, (byte) 38);
        }
        return this.field4772.method1528(arg0 ^ 0x56) + this.field4775.method1528(47);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZIIB)Lfc;", line = 1630)
    public final class141 method2195(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field4757++;
        long var6 = (long) ((arg0 << 16) + arg2);
        class141 var8 = new class141();
        var8.field2009 = arg4;
        var8.field4174 = arg1;
        var8.field6446 = var6;
        if (arg1) {
            if (this.method2192((byte) -106) >= 20) {
                throw new RuntimeException();
            }
            this.field4768.method1530(var8, true);
        } else if (this.method2194(0) < 20) {
            this.field4772.method1530(var8, true);
        } else {
            throw new RuntimeException();
        }
        if (arg3 != 0) {
            this.field4775 = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)V", line = 1675)
    public final void method2196(boolean arg0, int arg1) {
        field4762++;
        if (this.field4776 == null || arg1 >= -76) {
            return;
        }
        try {
            this.field4778.field5273 = 0;
            this.field4778.method2396(arg0 ? 2 : 3, 12450);
            this.field4778.method2405(0, -112);
            this.field4776.method1579(0, 5000, this.field4778.field5258, 4);
        } catch (IOException var4) {
            try {
                this.field4776.method1593(3);
            } catch (Exception var3) {
            }
            this.field4781++;
            this.field4780 = -2;
            this.field4776 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(B)Z", line = 1705)
    public final boolean method2197(byte arg0) {
        field4759++;
        if (arg0 != 90) {
            this.method2188((byte) -18);
        }
        return this.method2194(0) >= 20;
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V", line = 1721)
    public static final void method2198(int arg0) {
        field4773++;
        if (arg0 != 3) {
            method2198(-8);
        }
        for (class308 var1 = (class308) class430.field6190.method1312((byte) 25); var1 != null; var1 = (class308) class430.field6190.method1304(arg0 - 123)) {
            if (var1.field4223 > 0) {
                var1.field4223--;
            }
            if (var1.field4223 != 0) {
                if (var1.field4215 > 0) {
                    var1.field4215--;
                }
                if (var1.field4215 == 0 && var1.field4233 >= 1 && var1.field4232 >= 1 && var1.field4233 <= class432.field6220 - 2 && var1.field4232 <= class267.field3646 - 2 && (var1.field4226 < 0 || class105.method720(var1.field4226, -17669, var1.field4234))) {
                    class190.method1256(var1.field4233, var1.field4226, -1, var1.field4232, arg0 - 1, var1.field4218, var1.field4216, var1.field4234, var1.field4229);
                    var1.field4215 = -1;
                    if (var1.field4226 == var1.field4220 && var1.field4220 == -1) {
                        var1.method2459(198);
                    } else if (var1.field4226 == var1.field4220 && var1.field4228 == var1.field4218 && var1.field4234 == var1.field4219) {
                        var1.method2459(198);
                    }
                }
            } else if (var1.field4220 < 0 || class105.method720(var1.field4220, arg0 - 17672, var1.field4219)) {
                class190.method1256(var1.field4233, var1.field4220, -1, var1.field4232, 2, var1.field4228, var1.field4216, var1.field4219, var1.field4229);
                var1.method2459(198);
            }
        }
    }
}
