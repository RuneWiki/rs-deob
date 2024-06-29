import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class473 extends class189 {

    @OriginalMember(owner = "client!oga", name = "x", descriptor = "I")
    public int field6712;

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "I")
    public int field6714;

    @OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
    private int field6716;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
    private int field6703;

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "I")
    private int field6708;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "I")
    private int field6700;

    @OriginalMember(owner = "client!oga", name = "D", descriptor = "I")
    private int field6718;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    public int field6704;

    @OriginalMember(owner = "client!oga", name = "C", descriptor = "I")
    public int field6717;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field6707 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
    public static int field6702 = -1;

    @OriginalMember(owner = "client!oga", name = "F", descriptor = "[[I")
    public static int[][] field6720 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!oga", name = "E", descriptor = "[I")
    public static int[] field6719 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!oga", name = "v", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!oga", name = "w", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!oga", name = "y", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!oga", name = "A", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!oga", name = "G", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!oga", name = "H", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "Lhaa;")
    public static class80 field6698;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIB)Z", line = 3)
    public final boolean method2823(int arg0, int arg1, byte arg2) {
        field6705++;
        if (arg2 <= 4) {
            method2827((byte) -82);
        }
        return this.field6704 <= arg1 && this.field6714 >= arg1 && arg0 >= this.field6717 && this.field6712 >= arg0;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(III)Ldha;", line = 19)
    public static final class77 method2824(int arg0, int arg1, int arg2) {
        class165 var3 = class553.field7776[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class77 var4 = var3.field2271;
            var3.field2271 = null;
            class461.method2739(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(III)Z", line = 30)
    public final boolean method2825(int arg0, int arg1, int arg2) {
        field6722++;
        if (arg2 < 52) {
            this.method2823(-122, -61, (byte) 119);
        }
        return arg0 >= this.field6718 && this.field6716 >= arg0 && this.field6700 <= arg1 && arg1 <= this.field6703;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II[II)V", line = 45)
    public final void method2826(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[0] = 0;
        field6710++;
        if (arg3 == -9528) {
            arg2[1] = arg1 - (this.field6718 - this.field6704);
            arg2[2] = this.field6717 + arg0 - this.field6700;
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V", line = 66)
    public static void method2827(byte arg0) {
        field6698 = null;
        if (arg0 > 113) {
            field6719 = null;
            field6720 = null;
            field6707 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIB)Z", line = 80)
    public final boolean method2828(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -100) {
            method2831(null, (byte) 95);
        }
        field6713++;
        return this.field6708 == arg2 && this.field6718 <= arg1 && this.field6716 >= arg1 && arg0 >= this.field6700 && this.field6703 >= arg0;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "([IIII)V", line = 104)
    public final void method2829(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[2] = this.field6700 + arg3 - this.field6717;
        arg0[1] = this.field6718 + arg1 - this.field6704;
        field6721++;
        arg0[arg2] = this.field6708;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lag;ZI)V", line = 117)
    public static final void method2830(class682 arg0, boolean arg1, int arg2) {
        field6709++;
        boolean var3 = arg0.method3821(1, (byte) 108) == 1;
        if (var3) {
            class136.field1976[class319.field4418++] = arg2;
        }
        int var4 = arg0.method3821(2, (byte) 108);
        class280 var5 = class309.field4311[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field3958 = false;
            } else if (class389.field5512 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class408 var6 = class711.field9886[arg2] = new class408();
                var6.field5776 = (class228.field3063 + var5.field8009[0] >> 6 << 14) + (var5.field1266 << 28) + (var5.field8015[0] + class3.field30 >> 6);
                if (var5.field3966 == -1) {
                    var6.field5779 = var5.field7917.method2122(-1);
                } else {
                    var6.field5779 = var5.field3966;
                }
                var6.field5778 = var5.field8001;
                var6.field5782 = var5.field3985;
                if (var5.field3948 > 0) {
                    class690.method3857(120, var5);
                }
                class309.field4311[arg2] = null;
                if (arg0.method3821(1, (byte) 108) != 0) {
                    class96.method707(arg2, arg0, 0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method3821(3, (byte) 108);
            int var8 = var5.field8009[0];
            int var9 = var5.field8015[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field3967 = var9;
                var5.field3989 = var8;
                var5.field3958 = true;
            } else {
                var5.method1830(false, var8, var9, class471.field6687[arg2]);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method3821(4, (byte) 108);
            int var11 = var5.field8009[0];
            int var12 = var5.field8015[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field3989 = var11;
                var5.field3967 = var12;
                var5.field3958 = true;
            } else {
                var5.method1830(arg1, var11, var12, class471.field6687[arg2]);
            }
        } else {
            int var13 = arg0.method3821(1, (byte) 108);
            if (var13 == 0) {
                int var14 = arg0.method3821(12, (byte) 108);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F1) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field8009[0] + var16;
                int var19 = var5.field8015[0] + var17;
                if (var3) {
                    var5.field3989 = var18;
                    var5.field3958 = true;
                    var5.field3967 = var19;
                } else {
                    var5.method1830(false, var18, var19, class471.field6687[arg2]);
                }
                var5.field1266 = var5.field1258 = (byte) (var5.field1266 + var15 & 0x3);
                if (class364.method2319((byte) -71, var18, var19)) {
                    var5.field1258++;
                }
                if (class389.field5512 == arg2) {
                    if (class526.field7430 != var5.field1266) {
                        class230.field3098 = true;
                    }
                    class526.field7430 = var5.field1266;
                }
            } else if (!arg1) {
                int var20 = arg0.method3821(30, (byte) 108);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFE8C2) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class228.field3063 + var22 + var5.field8009[0] & 0x3FFF) - class228.field3063;
                int var25 = (var5.field8015[0] - (-class3.field30 - var23) & 0x3FFF) - class3.field30;
                if (var3) {
                    var5.field3989 = var24;
                    var5.field3958 = true;
                    var5.field3967 = var25;
                } else {
                    var5.method1830(false, var24, var25, class471.field6687[arg2]);
                }
                var5.field1266 = var5.field1258 = (byte) (var5.field1266 + var21 & 0x3);
                if (class364.method2319((byte) -9, var24, var25)) {
                    var5.field1258++;
                }
                if (class389.field5512 == arg2) {
                    class526.field7430 = var5.field1266;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(IIIIIIIII)V", line = 458)
    public class473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field6712 = arg8;
        this.field6714 = arg7;
        this.field6716 = arg3;
        this.field6703 = arg4;
        this.field6708 = arg0;
        this.field6700 = arg2;
        this.field6718 = arg1;
        this.field6704 = arg5;
        this.field6717 = arg6;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "([IB)Ljava/lang/String;", line = 483)
    public static final String method2831(int[] arg0, byte arg1) {
        field6706++;
        StringBuffer var2 = new StringBuffer();
        int var3 = -63 % ((64 - arg1) / 35);
        int var4 = class511.field7299;
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class692 var6 = class70.field890.method1203(arg0[var5], (byte) 75);
            if (var6.field9518 != -1) {
                class88 var7 = (class88) class723.field10076.method4022((long) var6.field9518, (byte) 92);
                if (var7 == null) {
                    class204 var8 = class204.method1237(class374.field5245, var6.field9518, 0);
                    if (var8 != null) {
                        var7 = class268.field3831.method484(var8, true);
                        class723.field10076.method4018((byte) 127, var7, (long) var6.field9518);
                    }
                }
                if (var7 != null) {
                    class748.field10391[var4] = var7;
                    var2.append(" <img=").append(var4).append(">");
                    var4++;
                }
            }
        }
        return var2.toString();
    }
}
