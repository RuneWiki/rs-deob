import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class194 extends class306 {

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    private int field2941 = -1;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field2951 = 0;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public int field2943;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "[I")
    public int[] field2953;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "[Lhi;")
    public static class323[] field2940;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "[[[Lwk;")
    public static class196[][][] field2947;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V", line = 7)
    public final void method1343(int arg0) {
        field2942++;
        super.method1343(arg0);
        this.field2953 = null;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(B)V", line = 17)
    public static final void method1344(byte arg0) {
        if (arg0 < 54) {
            field2951 = -8;
        }
        class344.field5462.method378(0);
        field2948++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILlf;I)V", line = 28)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg0 != -15334) {
            this.field2941 = -41;
        }
        field2939++;
        if (arg2 == 0) {
            this.field2941 = arg1.method1051(1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)[[I", line = 50)
    public int[][] method681(int arg0, byte arg1) {
        if (arg1 != -119) {
            field2940 = (class323[]) null;
        }
        field2952++;
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179 && this.method1345(arg1 - 3)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class99.field1344 == this.field2943 ? arg0 : this.field2943 * arg0 / class99.field1344) * this.field2955;
            if (class31.field367 == this.field2955) {
                for (int var11 = 0; var11 < class31.field367; var11++) {
                    int var12 = this.field2953[var7++];
                    var6[var11] = class261.method1840(var12, 255) << 4;
                    var5[var11] = class261.method1840(4080, var12 >> 4);
                    var4[var11] = class261.method1840(var12 >> 12, 4080);
                }
            } else {
                for (int var8 = 0; var8 < class31.field367; var8++) {
                    int var9 = this.field2955 * var8 / class31.field367;
                    int var10 = this.field2953[var7 + var9];
                    var6[var8] = class261.method1840(255, var10) << 4;
                    var5[var8] = class261.method1840(65280, var10) >> 4;
                    var4[var8] = class261.method1840(4080, var10 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)Z", line = 115)
    public final boolean method1345(int arg0) {
        field2950++;
        if (arg0 > -119) {
            return false;
        } else if (this.field2953 != null) {
            return true;
        } else if (this.field2941 >= 0) {
            class158 var2 = class30.field350 < 0 ? class93.method588(this.field2941, class49.field559, -1) : class14.method88(this.field2941, class49.field559, 50, class30.field350);
            var2.method1147();
            this.field2943 = var2.field24;
            this.field2953 = var2.field2455;
            this.field2955 = var2.field13;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 142)
    public static final void method1346(int arg0) {
        field2946++;
        if (arg0 != 31440) {
            return;
        }
        for (class298 var1 = (class298) class50.field570.method1812(1); var1 != null; var1 = (class298) class50.field570.method1809(arg0 - 31312)) {
            class349 var2 = var1.field4679;
            if (class219.field3290 != var2.field5546 || var2.field5541 < class102.field1381) {
                var1.method1290(arg0 - 31526);
            } else if (var2.field5568 <= class102.field1381) {
                if (var2.field5562 > 0) {
                    class231 var3 = class251.field3974[var2.field5562 - 1];
                    if (var3 != null && var3.field3767 >= 0 && var3.field3767 < 13312 && var3.field3763 >= 0 && var3.field3763 < 13312) {
                        var2.method2416(var3.field3767, class102.field1381, class14.method80(var3.field3763, var2.field5546, var3.field3767, (byte) -126) - var2.field5527, -87, var3.field3763);
                    }
                }
                if (var2.field5562 < 0) {
                    int var4 = -var2.field5562 - 1;
                    class67 var5;
                    if (class50.field573 == var4) {
                        var5 = class11.field113;
                    } else {
                        var5 = class105.field1443[var4];
                    }
                    if (var5 != null && var5.field3767 >= 0 && var5.field3767 < 13312 && var5.field3763 >= 0 && var5.field3763 < 13312) {
                        var2.method2416(var5.field3767, class102.field1381, class14.method80(var5.field3763, var2.field5546, var5.field3767, (byte) -126) - var2.field5527, -13, var5.field3763);
                    }
                }
                var2.method2422(arg0 ^ 0x7D2F, class266.field4193);
                class214.method1495(class219.field3290, (int) var2.field5565, (int) var2.field5543, (int) var2.field5539, 60, var2, var2.field5532, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 423)
    public class194() {
        super(0, false);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)I", line = 203)
    public final int method1347(byte arg0) {
        if (arg0 == -120) {
            field2945++;
            return this.field2941;
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(B)V", line = 215)
    public static final void method1348(byte arg0) {
        field2944++;
        if (class50.field571) {
            return;
        }
        if (class222.field3355) {
            class190.field2855 = (float) ((int) class190.field2855 - 65 & 0xFFFFFF80);
        } else {
            class296.field4650 += (-24.0F - class296.field4650) / 2.0F;
        }
        class50.field571 = true;
        if (arg0 > -118) {
            field2947 = (class196[][][]) ((class196[][][]) null);
        }
        class234.field3560 = true;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V", line = 241)
    public static final void method1349(int arg0) {
        field2938++;
        if (!class272.field4317 || class41.field449) {
            return;
        }
        class196[][][] var1 = field2947;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class196[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class196 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3003 != null && var6.field3003.field5697 instanceof class124) {
                            class124 var7 = (class124) var6.field3003.field5697;
                            if ((Long.MIN_VALUE & var6.field3003.field5699) == 0L) {
                                var7.method812(false, true, true, true, false, true, true);
                            } else {
                                var7.method812(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field2994 != null) {
                            if (var6.field2994.field630 instanceof class124) {
                                class124 var8 = (class124) var6.field2994.field630;
                                if ((var6.field2994.field627 & Long.MIN_VALUE) == 0L) {
                                    var8.method812(false, true, true, true, false, true, true);
                                } else {
                                    var8.method812(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2994.field632 instanceof class124) {
                                class124 var9 = (class124) var6.field2994.field632;
                                if ((var6.field2994.field627 & Long.MIN_VALUE) == 0L) {
                                    var9.method812(false, true, true, true, false, true, true);
                                } else {
                                    var9.method812(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field2999 != null) {
                            if (var6.field2999.field1697 instanceof class124) {
                                class124 var10 = (class124) var6.field2999.field1697;
                                if ((Long.MIN_VALUE & var6.field2999.field1702) == 0L) {
                                    var10.method812(false, true, true, true, false, true, true);
                                } else {
                                    var10.method812(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2999.field1705 instanceof class124) {
                                class124 var11 = (class124) var6.field2999.field1705;
                                if ((Long.MIN_VALUE & var6.field2999.field1702) == 0L) {
                                    var11.method812(false, true, true, true, false, true, true);
                                } else {
                                    var11.method812(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field2979; var12++) {
                            if (var6.field2998[var12].field494 instanceof class124) {
                                class124 var13 = (class124) var6.field2998[var12].field494;
                                if ((var6.field2998[var12].field502 & Long.MIN_VALUE) == 0L) {
                                    var13.method812(false, true, true, true, false, true, true);
                                } else {
                                    var13.method812(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class41.field449 = true;
        if (arg0 != -32315) {
            field2951 = 59;
        }
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(B)V", line = 390)
    public static final void method1350(byte arg0) {
        field2954++;
        if (class227.field3436 > 0) {
            class68.method425(false);
            return;
        }
        class187.field2827 = class147.field2352;
        if (arg0 == 106) {
            class147.field2352 = null;
            class219.method1525((byte) 63, 40);
        }
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V", line = 409)
    public static void method1351(int arg0) {
        field2947 = (class196[][][]) null;
        field2940 = null;
        if (arg0 != 0) {
            method1346(-32);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)V", line = 427)
    public static final void method1352(int arg0, int arg1) {
        class71.field883.method387(arg1, false);
        if (arg0 != -65) {
            method1351(-36);
        }
        field2949++;
    }
}
