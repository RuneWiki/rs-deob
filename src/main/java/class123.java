import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class123 extends class298 {

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "Lvq;")
    public class22 field1950 = new class22();

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "Lsd;")
    public class68 field1956 = new class68();

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "Lfh;")
    private class210 field1944;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "Z")
    public static boolean field1948 = false;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "Ldp;")
    public static class174 field1955;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "Lka;")
    public static class406 field1951;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)V")
    public static final void method1035(int arg0) {
        field1941++;
        if (class336.field4817.length() != 0) {
            class319.method2135("--> " + class336.field4817, (byte) -126);
            class55.method435(1, class336.field4817, false);
            class157.field2397 = arg0;
            class336.field4817 = "";
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "()I")
    public final int method185() {
        field1952++;
        return 0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLdp;)V")
    public static final void method1036(byte arg0, class174 arg1) {
        if (arg0 <= -86) {
            field1949++;
            class152.field2323 = arg1;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "()Lwm;")
    public final class298 method183() {
        field1942++;
        class58 var1;
        do {
            var1 = (class58) this.field1950.method145(92);
            if (var1 == null) {
                return null;
            }
        } while (var1.field919 == null);
        return var1.field919;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "()Lwm;")
    public final class298 method206() {
        field1946++;
        class58 var1 = (class58) this.field1950.method157((byte) -125);
        if (var1 == null) {
            return null;
        } else if (var1.field919 == null) {
            return this.method183();
        } else {
            return var1.field919;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "([III)V")
    public final void method187(int[] arg0, int arg1, int arg2) {
        field1954++;
        this.field1956.method187(arg0, arg1, arg2);
        for (class58 var4 = (class58) this.field1950.method157((byte) -125); var4 != null; var4 = (class58) this.field1950.method145(58)) {
            if (!this.field1944.method1595(var4, 109)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field938) {
                        this.method1037(arg0, (byte) -102, var5, var6 + var5, var4, var6);
                        var4.field938 -= var5;
                        break;
                    }
                    this.method1037(arg0, (byte) -81, var4.field938, var6 + var5, var4, var6);
                    var6 += var4.field938;
                    var5 -= var4.field938;
                } while (!this.field1944.method1587(arg0, var6, 9609, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([IBIILea;I)V")
    private final void method1037(int[] arg0, byte arg1, int arg2, int arg3, class58 arg4, int arg5) {
        field1938++;
        if ((this.field1944.field3109[arg4.field935] & 0x4) != 0 && arg4.field932 < 0) {
            int var7 = this.field1944.field3108[arg4.field935] / class326.field4692;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field925) / var7;
                if (var8 > arg2) {
                    arg4.field925 += arg2 * var7;
                    break;
                }
                arg4.field919.method187(arg0, arg5, var8);
                arg2 -= var8;
                arg5 += var8;
                arg4.field925 += var7 * var8 - 1048576;
                int var9 = class326.field4692 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class24 var11 = arg4.field919;
                if (this.field1944.field3081[arg4.field935] == 0) {
                    arg4.field919 = class24.method167(arg4.field914, var11.method191(), var11.method181(), var11.method169());
                } else {
                    arg4.field919 = class24.method167(arg4.field914, var11.method191(), 0, var11.method169());
                    this.field1944.method1598(arg4, -100, ~arg4.field927.field5942[arg4.field933] > -1);
                    arg4.field919.method170(var9, var11.method181());
                }
                if (arg4.field927.field5942[arg4.field933] < 0) {
                    arg4.field919.method184(-1);
                }
                var11.method207(var9);
                var11.method187(arg0, arg5, arg3 - arg5);
                if (var11.method179()) {
                    this.field1956.method513(var11);
                }
            }
        }
        arg4.field919.method187(arg0, arg5, arg2);
        if (arg1 >= -68) {
            field1951 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ldp;IZ)Lbs;")
    public static final class186 method1038(class174 arg0, int arg1, boolean arg2) {
        if (arg2) {
            return null;
        } else {
            field1940++;
            byte[] var3 = arg0.method1336(-87, arg1);
            return var3 == null ? null : new class186(var3);
        }
    }

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field1951 = null;
        field1955 = null;
        if (arg0 != -8217) {
            method1038((class174) null, 37, false);
        }
    }

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
    public static final void method1040(int arg0) {
        class18 var1 = class46.field747;
        synchronized (class46.field747) {
            class46.field747.method106((byte) -109);
            int var2 = 2 % ((arg0 - 38) / 57);
        }
        field1945++;
        class18 var3 = class234.field3391;
        synchronized (class234.field3391) {
            class234.field3391.method106((byte) -119);
        }
        class18 var4 = class61.field984;
        synchronized (class61.field984) {
            class61.field984.method106((byte) -123);
        }
        class18 var5 = class75.field1286;
        synchronized (class75.field1286) {
            class75.field1286.method106((byte) -110);
        }
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V")
    public static final void method1041(int arg0) {
        field1939++;
        if (class197.field2876 == 165) {
            int var1 = class268.field4020.method288(arg0 ^ 0xFFFFBE46);
            int var2 = class268.field4020.method279((byte) 85);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class9.field121[var3];
            int var6 = class268.field4020.method271((byte) 112);
            int var7 = ((var6 & 0x7B) >> 4) + class156.field2368;
            int var8 = (var6 & 0x7) + class49.field790;
            if (var7 >= 0 && var8 >= 0 && var7 < class183.field2703 && class66.field1056 > var8) {
                class164.method1273(var3, var1, 256, var8, -1, 0, var5, var7, class367.field5213, var4);
            }
        } else if (class197.field2876 == 205) {
            int var9 = class268.field4020.method271((byte) 118);
            int var10 = (var9 >> 4 & 0x7) + class156.field2368;
            int var11 = (var9 & 0x7) + class49.field790;
            int var12 = class268.field4020.method320((byte) -87);
            int var13 = class268.field4020.method320((byte) -87);
            int var14 = class268.field4020.method320((byte) -87);
            if (class186.field2728 != null && var10 >= 0 && var11 >= 0 && var10 < class183.field2703 && var11 < class66.field1056) {
                class110 var15 = (class110) class186.field2728.method1219((long) (var10 | var11 << 14 | class367.field5213 << 28), -123);
                if (var15 != null) {
                    for (class89 var16 = (class89) var15.field1799.method157((byte) -125); var16 != null; var16 = (class89) var15.field1799.method145(-12)) {
                        if ((var12 & 0x7FFF) == var16.field1416 && var16.field1413 == var13) {
                            var16.method251(120);
                            var16.field1413 = var14;
                            class76.method602(var11, class367.field5213, (byte) -40, var16, var10);
                            break;
                        }
                    }
                    class257.method1852(var10, var11, -54, class367.field5213);
                }
            }
        } else {
            if (class197.field2876 == 238) {
                int var17 = class268.field4020.method294(-1280438392);
                byte var18 = class268.field4020.method268((byte) -100);
                byte var19 = class268.field4020.method268((byte) -100);
                int var20 = class268.field4020.method294(arg0 ^ 0xB3AE0F88);
                byte var21 = class268.field4020.method298((byte) -118);
                int var22 = class268.field4020.method307((byte) 92);
                int var23 = class268.field4020.method293(21569);
                byte var24 = class268.field4020.method291(0);
                int var25 = class268.field4020.method276(-1536);
                int var26 = var25 >> 2;
                int var27 = var25 & 0x3;
                int var28 = class268.field4020.method310(-32717);
                int var29 = (var28 >> 4 & 0x7) + class156.field2368;
                int var30 = (var28 & 0x7) + class49.field790;
                if (!class73.field1235.method707()) {
                    class33.method236(var26, var24, var22, var23, var20, var21, var27, var19, var18, var29, -21897, var17, var30);
                }
            }
            if (class197.field2876 == 118) {
                int var31 = class268.field4020.method271((byte) 110);
                int var32 = (var31 >> 4 & 0xF) + class156.field2368 * 2;
                int var33 = (var31 & 0xF) + class49.field790 * 2;
                int var34 = class268.field4020.method291(0) + var32;
                int var35 = class268.field4020.method291(arg0) + var33;
                int var36 = class268.field4020.method321((byte) 99);
                int var37 = class268.field4020.method321((byte) 123);
                int var38 = class268.field4020.method320((byte) -87);
                int var39 = class268.field4020.method291(0);
                int var40 = class268.field4020.method271((byte) 106) * 4;
                int var41 = class268.field4020.method320((byte) -87);
                int var42 = class268.field4020.method320((byte) -87);
                int var43 = class268.field4020.method271((byte) 127);
                if (var43 == 255) {
                    var43 = -1;
                }
                int var44 = class268.field4020.method271((byte) 123);
                if (var32 >= 0 && var33 >= 0 && var32 < 208 && var33 < 208 && var34 >= 0 && var35 >= 0 && var34 < 208 && var35 < 208 && var38 != 65535) {
                    int var45 = var33 * 64;
                    int var46 = var35 * 64;
                    int var47 = var34 * 64;
                    int var48 = var32 * 64;
                    if (var36 != 0) {
                        int var51;
                        class390 var52;
                        if (var36 >= 0) {
                            int var49 = var36 - 1;
                            int var50 = var49 & 0x7FF;
                            var51 = var49 >> 11 & 0xF;
                            var52 = class447.field6512[var50];
                        } else {
                            int var53 = -var36 - 1;
                            int var54 = var53 & 0x7FF;
                            var51 = (var53 & 0x7CD0) >> 11;
                            if (class379.field5381 == var54) {
                                var52 = class86.field1394;
                            } else {
                                var52 = class367.field5225[var54];
                            }
                        }
                        if (var52 != null) {
                            class419 var55 = var52.method2476((byte) 127);
                            if (var55.field6106 != null && var55.field6106[var51] != null) {
                                int var56 = var55.field6106[var51][0];
                                int var57 = var55.field6106[var51][2];
                                int var58 = var52.field5623.method603(arg0 + 16383);
                                int var59 = class56.field897[var58];
                                int var60 = class56.field898[var58];
                                int var61 = var57 * var59 + (var56 * var60) >> 15;
                                int var62 = var57 * var60 - (var56 * var59) >> 15;
                                var39 -= var55.field6106[var51][1];
                                var45 += var62;
                                var48 += var61;
                            }
                        }
                    }
                    class204 var64 = new class204(var38, class367.field5213, var48, var45, class109.method957(var45, var48, class367.field5213, arg0 ^ 0x50B7) - var39, var41 - -class267.field4002, class267.field4002 + var42, var43, var44, var37, var40);
                    var64.method1545(class109.method957(var46, var47, class367.field5213, 20663) - var40, true, var47, class267.field4002 + var41, var46);
                    class321.field4640.method148((byte) 92, new class431(var64));
                }
            } else if (arg0 == 0) {
                if (class197.field2876 == 174) {
                    int var65 = class268.field4020.method294(-1280438392);
                    int var66 = class268.field4020.method271((byte) 117);
                    int var67 = class156.field2368 + ((var66 & 0x75) >> 4);
                    int var68 = (var66 & 0x7) + class49.field790;
                    int var69 = class268.field4020.method294(-1280438392);
                    int var70 = class268.field4020.method294(-1280438392);
                    if (var67 >= 0 && var68 >= 0 && var67 < class183.field2703 && class66.field1056 > var68 && class379.field5381 != var70) {
                        class76.method602(var68, class367.field5213, (byte) -40, new class89(var65, var69), var67);
                        class257.method1852(var67, var68, arg0 ^ 0x59, class367.field5213);
                    }
                } else if (class197.field2876 == 39) {
                    int var71 = class268.field4020.method271((byte) 102);
                    int var72 = (var71 >> 4 & 0xF) + class156.field2368 * 2;
                    int var73 = (var71 & 0xF) + class49.field790 * 2;
                    int var74 = var72 + class268.field4020.method291(0);
                    int var75 = var73 + class268.field4020.method291(0);
                    int var76 = class268.field4020.method321((byte) 107);
                    int var77 = class268.field4020.method320((byte) -87);
                    int var78 = class268.field4020.method271((byte) 102) * 4;
                    int var79 = class268.field4020.method271((byte) 123) * 4;
                    int var80 = class268.field4020.method320((byte) -87);
                    int var81 = class268.field4020.method320((byte) -87);
                    int var82 = class268.field4020.method271((byte) 127);
                    int var83 = class268.field4020.method271((byte) 115);
                    if (var82 == 255) {
                        var82 = -1;
                    }
                    if (var72 >= 0 && var73 >= 0 && var72 < 208 && var73 < 208 && var74 >= 0 && var75 >= 0 && var74 < 208 && var75 < 208 && var77 != 65535) {
                        int var84 = var75 * 64;
                        int var85 = var74 * 64;
                        int var86 = var72 * 64;
                        int var87 = var73 * 64;
                        class204 var88 = new class204(var77, class367.field5213, var86, var87, class109.method957(var87, var86, class367.field5213, 20663) - var78, class267.field4002 + var80, class267.field4002 + var81, var82, var83, var76, var79);
                        var88.method1545(class109.method957(var84, var85, class367.field5213, 20663) - var79, true, var85, class267.field4002 + var80, var84);
                        class321.field4640.method148((byte) 107, new class431(var88));
                    }
                } else if (class197.field2876 == 53) {
                    int var89 = class268.field4020.method276(-1536);
                    int var90 = var89 >> 2;
                    int var91 = var89 & 0x3;
                    int var92 = class9.field121[var90];
                    int var93 = class268.field4020.method271((byte) 108);
                    int var94 = class156.field2368 + ((var93 & 0x7E) >> 4);
                    int var95 = (var93 & 0x7) + class49.field790;
                    if (var94 >= 0 && var95 >= 0 && var94 < class183.field2703 && var95 < class66.field1056) {
                        class164.method1273(var90, -1, 256, var95, -1, 0, var92, var94, class367.field5213, var91);
                    }
                } else if (class197.field2876 == 119) {
                    int var96 = class268.field4020.method293(21569);
                    int var97 = class268.field4020.method288(arg0 ^ 0xFFFFBE46);
                    int var98 = class268.field4020.method271((byte) 122);
                    int var99 = ((var98 & 0x7D) >> 4) + class156.field2368;
                    int var100 = (var98 & 0x7) + class49.field790;
                    if (var99 >= 0 && var100 >= 0 && var99 < class183.field2703 && var100 < class66.field1056) {
                        class76.method602(var100, class367.field5213, (byte) -40, new class89(var97, var96), var99);
                        class257.method1852(var99, var100, -53, class367.field5213);
                    }
                } else if (class197.field2876 == 213) {
                    class268.field4020.method271((byte) 109);
                    int var101 = class268.field4020.method271((byte) 113);
                    int var102 = class156.field2368 + (var101 >> 4 & 0x7);
                    int var103 = (var101 & 0x7) + class49.field790;
                    int var104 = class268.field4020.method320((byte) -87);
                    int var105 = class268.field4020.method271((byte) 120);
                    int var106 = class268.field4020.method295(true);
                    String var107 = class268.field4020.method322((byte) -34);
                    class415.method2597(var104, var106, var105, -21001, var102, var107, var103);
                } else if (class197.field2876 == 189) {
                    int var108 = class268.field4020.method310(-32717);
                    int var109 = var108 >> 2;
                    int var110 = var108 & 0x3;
                    int var111 = class9.field121[var109];
                    int var112 = class268.field4020.method293(arg0 + 21569);
                    if (var112 == 65535) {
                        var112 = -1;
                    }
                    int var113 = class268.field4020.method271((byte) 125);
                    int var114 = class156.field2368 + ((var113 & 0x76) >> 4);
                    int var115 = (var113 & 0x7) + class49.field790;
                    class250.method1799(arg0 + 101, var115, var114, var109, class367.field5213, var111, var112, var110);
                } else if (class197.field2876 == 62) {
                    int var116 = class268.field4020.method271((byte) 105);
                    int var117 = ((var116 & 0x7B) >> 4) + class156.field2368;
                    int var118 = (var116 & 0x7) + class49.field790;
                    int var119 = class268.field4020.method320((byte) -87);
                    if (var119 == 65535) {
                        var119 = -1;
                    }
                    int var120 = class268.field4020.method271((byte) 114);
                    int var121 = (var120 & 0xFD) >> 4;
                    int var122 = var120 & 0x7;
                    int var123 = class268.field4020.method271((byte) 126);
                    int var124 = class268.field4020.method271((byte) 103);
                    if (var117 >= 0 && var118 >= 0 && var117 < class183.field2703 && class66.field1056 > var118) {
                        int var125 = var121 + 1;
                        if (class86.field1394.field5694[0] >= var117 - var125 && class86.field1394.field5694[0] <= var117 + var125 && class86.field1394.field5696[0] >= (var118 - var125) && var118 + var125 >= class86.field1394.field5696[0] && class151.field2315 != 0 && var122 > 0 && class361.field5154 < 50 && var119 != -1) {
                            class169.field2516[class361.field5154] = var119;
                            class169.field2514[class361.field5154] = var122;
                            class196.field2869[class361.field5154] = var123;
                            class225.field3325[class361.field5154] = null;
                            class113.field1815[class361.field5154] = (var117 << 16) - (-(var118 << 8) - var121);
                            class420.field6130[class361.field5154] = var124;
                            class361.field5154++;
                        }
                    }
                } else if (class197.field2876 == 196) {
                    int var126 = class268.field4020.method271((byte) 101);
                    int var127 = (var126 >> 4 & 0x7) + class156.field2368;
                    int var128 = (var126 & 0x7) + class49.field790;
                    int var129 = var127 + class268.field4020.method291(0);
                    int var130 = class268.field4020.method291(0) + var128;
                    int var131 = class268.field4020.method321((byte) 114);
                    int var132 = class268.field4020.method320((byte) -87);
                    int var133 = class268.field4020.method271((byte) 111) * 4;
                    int var134 = class268.field4020.method271((byte) 109) * 4;
                    int var135 = class268.field4020.method320((byte) -87);
                    int var136 = class268.field4020.method320((byte) -87);
                    int var137 = class268.field4020.method271((byte) 123);
                    if (var137 == 255) {
                        var137 = -1;
                    }
                    int var138 = class268.field4020.method271((byte) 124);
                    if (var127 >= 0 && var128 >= 0 && var127 < class183.field2703 && var128 < class66.field1056 && var129 >= 0 && var130 >= 0 && class183.field2703 > var129 && class66.field1056 > var130 && var132 != 65535) {
                        int var139 = var127 * 128 + 64;
                        int var140 = var129 * 128 + 64;
                        int var141 = var128 * 128 + 64;
                        int var142 = var130 * 128 + 64;
                        class204 var143 = new class204(var132, class367.field5213, var139, var141, class109.method957(var141, var139, class367.field5213, 20663) - var133, class267.field4002 + var135, var136 + class267.field4002, var137, var138, var131, var134);
                        var143.method1545(class109.method957(var142, var140, class367.field5213, 20663) - var134, true, var140, class267.field4002 + var135, var142);
                        class321.field4640.method148((byte) 102, new class431(var143));
                    }
                } else if (class197.field2876 == 200) {
                    int var144 = class268.field4020.method271((byte) 106);
                    int var145 = ((var144 & 0x72) >> 4) + class156.field2368;
                    int var146 = (var144 & 0x7) + class49.field790;
                    int var147 = class268.field4020.method320((byte) -87);
                    int var148 = class268.field4020.method271((byte) 118);
                    int var149 = class268.field4020.method320((byte) -87);
                    if (var145 >= 0 && var146 >= 0 && class183.field2703 > var145 && class66.field1056 > var146) {
                        int var150 = var145 * 128 + 64;
                        int var151 = var146 * 128 + 64;
                        class20 var152 = new class20(var147, var149, class267.field4002, class367.field5213, var150, class109.method957(var151, var150, class367.field5213, 20663) - var148, var151, var145, var145, var146, var146);
                        class244.field3549.method148((byte) 127, new class375(var152));
                    }
                } else if (class197.field2876 == 146) {
                    int var153 = class268.field4020.method320((byte) -87);
                    int var154 = class268.field4020.method271((byte) 110);
                    class451.method2812(arg0 + 118, var153).method367(var154, arg0 ^ 0x14);
                } else if (class197.field2876 == 86) {
                    int var155 = class268.field4020.method320((byte) -87);
                    int var156 = class268.field4020.method279((byte) 101);
                    int var157 = (var156 >> 4 & 0x7) + class156.field2368;
                    int var158 = class49.field790 + (var156 & 0x7);
                    if (var157 >= 0 && var158 >= 0 && class183.field2703 > var157 && class66.field1056 > var158) {
                        class110 var159 = (class110) class186.field2728.method1219((long) (var157 | var158 << 14 | class367.field5213 << 28), -124);
                        if (var159 != null) {
                            for (class89 var160 = (class89) var159.field1799.method157((byte) -125); var160 != null; var160 = (class89) var159.field1799.method145(7)) {
                                if ((var155 & 0x7FFF) == var160.field1416) {
                                    var160.method251(23);
                                    break;
                                }
                            }
                            if (var159.field1799.method152((byte) 59)) {
                                var159.method251(107);
                            }
                            class257.method1852(var157, var158, 85, class367.field5213);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
    public final void method173(int arg0) {
        this.field1956.method173(arg0);
        field1947++;
        for (class58 var2 = (class58) this.field1950.method157((byte) -125); var2 != null; var2 = (class58) this.field1950.method145(-120)) {
            if (!this.field1944.method1595(var2, -122)) {
                int var3 = arg0;
                do {
                    if (var2.field938 >= var3) {
                        this.method1043(var2, var3, false);
                        var2.field938 -= var3;
                        break;
                    }
                    this.method1043(var2, var2.field938, false);
                    var3 -= var2.field938;
                } while (!this.field1944.method1587((int[]) null, 0, 9609, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(CI)B")
    public static final byte method1042(char arg0, int arg1) {
        field1943++;
        if (arg1 != -54) {
            method1042((char) 65420, -63);
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lea;IZ)V")
    private final void method1043(class58 arg0, int arg1, boolean arg2) {
        field1953++;
        if ((this.field1944.field3109[arg0.field935] & 0x4) != 0 && arg0.field932 < 0) {
            int var4 = this.field1944.field3108[arg0.field935] / class326.field4692;
            int var5 = (var4 + 1048575 - arg0.field925) / var4;
            arg0.field925 = arg1 * var4 + arg0.field925 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field1944.field3081[arg0.field935] == 0) {
                    arg0.field919 = class24.method167(arg0.field914, arg0.field919.method191(), arg0.field919.method181(), arg0.field919.method169());
                } else {
                    arg0.field919 = class24.method167(arg0.field914, arg0.field919.method191(), 0, arg0.field919.method169());
                    this.field1944.method1598(arg0, -126, arg0.field927.field5942[arg0.field933] < 0);
                }
                if (arg0.field927.field5942[arg0.field933] < 0) {
                    arg0.field919.method184(-1);
                }
                arg1 = arg0.field925 / var4;
            }
        }
        if (arg2) {
            this.method173(-5);
        }
        arg0.field919.method173(arg1);
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lfh;)V")
    public class123(class210 arg0) {
        this.field1944 = arg0;
    }
}
