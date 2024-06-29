import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class443 {

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
    public int field6161 = -1;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "Lbaa;")
    private class130 field6158;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Ljava/lang/String;")
    private String field6148;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "Ljava/lang/String;")
    private String field6162;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "[I")
    private int[] field6143;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "[I")
    private int[] field6145;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "[I")
    private int[] field6149;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "[I")
    private int[] field6150;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
    private int[] field6152;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "[I")
    private int[] field6157;

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "[I")
    private int[] field6163;

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "[I")
    private int[] field6164;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field6146;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field6154;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "[[I")
    private int[][] field6142;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "[[I")
    private int[][] field6151;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "[[I")
    private int[][] field6155;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static final void method2709(int arg0) {
        field6160++;
        if (class221.field2991 != null) {
            class221.field2991.method3153((byte) 117);
        }
        if (class264.field3869 != null) {
            class264.field3869.method3153((byte) 36);
        }
        if (arg0 != 5660) {
            method2714(-18, 21);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BIIILts;)V")
    public static final void method2710(byte arg0, int arg1, int arg2, int arg3, class220 arg4) {
        field6147++;
        if (arg0 != -83) {
            method2714(70, 94);
        }
        for (class457 var5 = (class457) class303.field4285.method3618(arg0 ^ 0xFFFFFFDD); var5 != null; var5 = (class457) class303.field4285.method3619(0)) {
            if (var5.field6342 == arg3 && (arg1 << 9) == var5.field6344 && (arg2 << 9) == var5.field6338 && var5.field6330.field2964 == arg4.field2964) {
                if (var5.field6340 != null) {
                    class483.field6739.method361(var5.field6340);
                    var5.field6340 = null;
                }
                if (var5.field6350 != null) {
                    class483.field6739.method361(var5.field6350);
                    var5.field6350 = null;
                }
                var5.method549(6410);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public final void method2711(byte arg0) {
        field6144++;
        if (arg0 != 78) {
            this.field6148 = null;
        }
        if (this.field6148 == null) {
            this.field6148 = this.field6162;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLdc;)V")
    public final void method2712(byte arg0, class63 arg1) {
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                field6153++;
                if (arg0 <= 40) {
                    method2709(-63);
                    return;
                }
                return;
            }
            this.method2713(var3, (byte) -128, arg1);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IBLdc;)V")
    private final void method2713(int arg0, byte arg1, class63 arg2) {
        if (arg0 == 1) {
            this.field6162 = arg2.method477(true);
        } else if (arg0 == 2) {
            this.field6148 = arg2.method477(true);
        } else if (arg0 == 3) {
            int var22 = arg2.method505((byte) -119);
            this.field6155 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field6155[var23][0] = arg2.method482(-772591672);
                this.field6155[var23][1] = arg2.method457(-14532);
                this.field6155[var23][2] = arg2.method457(-14532);
            }
        } else if (arg0 == 4) {
            int var20 = arg2.method505((byte) -119);
            this.field6151 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field6151[var21][0] = arg2.method482(-772591672);
                this.field6151[var21][1] = arg2.method457(-14532);
                this.field6151[var21][2] = arg2.method457(-14532);
            }
        } else if (arg0 == 5) {
            arg2.method482(-772591672);
        } else if (arg0 == 6) {
            arg2.method505((byte) -119);
        } else if (arg0 == 7) {
            arg2.method505((byte) -119);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg2.method505((byte) -119);
            } else if (arg0 == 10) {
                int var18 = arg2.method505((byte) -119);
                this.field6164 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field6164[var19] = arg2.method457(-14532);
                }
            } else if (arg0 == 12) {
                arg2.method457(-14532);
            } else if (arg0 == 13) {
                int var4 = arg2.method505((byte) -119);
                this.field6157 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6157[var5] = arg2.method482(-772591672);
                }
            } else if (arg0 == 14) {
                int var16 = arg2.method505((byte) -119);
                this.field6142 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field6142[var17][0] = arg2.method505((byte) -119);
                    this.field6142[var17][1] = arg2.method505((byte) -119);
                }
            } else if (arg0 == 15) {
                arg2.method482(-772591672);
            } else if (arg0 == 17) {
                this.field6161 = arg2.method482(-772591672);
            } else if (arg0 == 18) {
                int var6 = arg2.method505((byte) -119);
                this.field6154 = new String[var6];
                this.field6149 = new int[var6];
                this.field6152 = new int[var6];
                this.field6163 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6163[var7] = arg2.method457(-14532);
                    this.field6149[var7] = arg2.method457(-14532);
                    this.field6152[var7] = arg2.method457(-14532);
                    this.field6154[var7] = arg2.method479((byte) -33);
                }
            } else if (arg0 == 19) {
                int var8 = arg2.method505((byte) -119);
                this.field6145 = new int[var8];
                this.field6150 = new int[var8];
                this.field6146 = new String[var8];
                this.field6143 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6150[var9] = arg2.method457(-14532);
                    this.field6143[var9] = arg2.method457(-14532);
                    this.field6145[var9] = arg2.method457(-14532);
                    this.field6146[var9] = arg2.method479((byte) -90);
                }
            } else if (arg0 == 249) {
                int var10 = arg2.method505((byte) -119);
                if (this.field6158 == null) {
                    int var11 = class606.method3450(var10, (byte) -25);
                    this.field6158 = new class130(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg2.method505((byte) -119) == 1;
                    int var14 = arg2.method476((byte) 116);
                    class71 var15;
                    if (var13) {
                        var15 = new class481(arg2.method479((byte) -72));
                    } else {
                        var15 = new class27(arg2.method457(-14532));
                    }
                    this.field6158.method820((long) var14, (byte) -42, var15);
                }
            }
        }
        field6159++;
        if (arg1 >= -126) {
            this.method2712((byte) -83, null);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
    public static final void method2714(int arg0, int arg1) {
        field6156++;
        if (arg0 > 107) {
            class346 var2 = class299.method1976(0, 3, arg1);
            var2.method2208(-1719);
        }
    }
}
