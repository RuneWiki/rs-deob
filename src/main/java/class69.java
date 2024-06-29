import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class69 extends class87 {

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    private int field1109 = 585;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "[I")
    public static int[] field1107 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!c", name = "P", descriptor = "Z")
    public static boolean field1110 = false;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "S")
    public static short field1104 = 205;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "Z")
    public static boolean field1112 = true;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "Z")
    public static boolean field1115 = false;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "Llc;")
    public static class270 field1114;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lgg;B)Z")
    public static final boolean method522(class66 arg0, byte arg1) {
        ++field1108;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field1024) {
            return false;
        } else if (!arg0.method491(0)) {
            return false;
        } else {
            if (arg1 > -106) {
                field1114 = null;
            }
            if (class171.field2584.method1073(-1, (long) arg0.field1009) != null) {
                return false;
            } else {
                return class312.field4998.method1073(-1, (long) arg0.field987) == null;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)V")
    public static final void method523(int arg0, byte arg1) {
        if (arg0 != 37) {
            if (arg0 == 50) {
                class46.field627 = 4.0F;
            } else if (~arg0 == -76) {
                class46.field627 = 6.0F;
            } else if (arg0 == 100) {
                class46.field627 = 8.0F;
            } else if (arg0 == 200) {
                class46.field627 = 16.0F;
            }
        } else {
            class46.field627 = 3.0F;
        }
        ++field1116;
        class270.field4342 = -1;
        class270.field4342 = -1;
        int var2 = -108 / ((arg1 - 74) / 41);
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public static final void method524(int arg0) {
        class144.field2338.method683(true, 218);
        ++class265.field4247;
        ++field1103;
        if (arg0 != 205) {
            method522((class66) null, (byte) 65);
        }
        class144.field2338.method382(902642416, 0L);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIILmh;)V")
    public static final void method525(byte arg0, int arg1, int arg2, class263 arg3) {
        ++field1105;
        if (~class147.field2360 <= -3 || class165.field2539 != 0 || class6.field57) {
            String var4 = class205.method1457(false);
            if (arg0 == 100) {
                if (arg3 == null) {
                    int var5 = class208.field3084.method73(var4, arg1 + 4, arg2 + 15, 16777215, 0, class203.field2987, class303.field4895);
                    class210.method1482(arg2, true, arg1 + 4, 15, class208.field3084.method78(var4) - -var5);
                } else {
                    class10 var6 = arg3.method1809(class265.field4250, 11457);
                    if (var6 == null) {
                        var6 = class208.field3084;
                    }
                    var6.method61(var4, arg1, arg2, arg3.field4215, arg3.field4046, arg3.field4114, arg3.field4072, arg3.field4051, arg3.field4131, class203.field2987, class303.field4895, class111.field1859);
                    class210.method1482(class111.field1859[1], true, class111.field1859[0], class111.field1859[3], class111.field1859[2]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int var4 = class140.field2272[arg0];
            for (int var5 = 0; class206.field3032 > var5; ++var5) {
                int var6 = class138.field2254[var5];
                if (var6 > this.field1109 && ~var6 > ~(-this.field1109 + 4096) && 2048 - this.field1109 < var4 && ~var4 > ~(this.field1109 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1109 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field1109 + 2048) && this.field1109 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1109;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1109 + 2048);
                } else if (this.field1109 <= var4 && ~(-this.field1109 + 4096) <= ~var4) {
                    if (this.field1109 <= var6 && -this.field1109 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field1109);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field1109;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1109 + 2048);
                }
            }
        }
        ++field1102;
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILmh;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method526(int arg0, class263 arg1, String arg2) {
        ++field1113;
        if (arg2.indexOf("%") != -1) {
            while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (~var4 == 0) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (~var6 == 0) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (~var8 == 0) {
                                                            return arg0 <= 76 ? null : arg2;
                                                        }
                                                        String var9 = "";
                                                        if (class65.field981 != null) {
                                                            if (class65.field981.field932 != null) {
                                                                var9 = (String) class65.field981.field932;
                                                            } else {
                                                                var9 = class17.method119(-125, class65.field981.field934);
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 - -4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class94.method727(false, class242.method1657((byte) -26, arg1, 4)) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class94.method727(false, class242.method1657((byte) 51, arg1, 3)) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class94.method727(false, class242.method1657((byte) 18, arg1, 2)) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class94.method727(false, class242.method1657((byte) 124, arg1, 1)) + arg2.substring(var4 - -2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class94.method727(false, class242.method1657((byte) 124, arg1, 0)) + arg2.substring(var3 + 2);
            }
        } else {
            return arg0 <= 76 ? null : arg2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field1109 = arg0.method331(arg2 ^ -25666);
        }
        ++field1106;
        if (arg2 != 25645) {
            this.method40((class53) null, 43, -48);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
    public static void method527(byte arg0) {
        field1107 = null;
        field1114 = null;
        if (arg0 >= -71) {
            method526(-66, (class263) null, (String) null);
        }
    }
}
