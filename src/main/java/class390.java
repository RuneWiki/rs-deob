import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class390 {

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public int field5776 = -1;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "[Lps;")
    public static class62[] field5783 = new class62[2048];

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Lsv;")
    public static class467 field5778 = new class467(11, 0, 1, 2);

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field5792 = -1;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "Lao;")
    public static class188 field5791 = new class188(32, 11);

    @OriginalMember(owner = "client!si", name = "D", descriptor = "Lao;")
    public static class188 field5793 = new class188(47, 2);

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "Lcv;")
    private class398 field5788;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Ljava/lang/String;")
    private String field5764;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Ljava/lang/String;")
    private String field5773;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[I")
    private int[] field5765;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[I")
    private int[] field5768;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[I")
    private int[] field5770;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "[I")
    private int[] field5771;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[I")
    private int[] field5774;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "[I")
    private int[] field5780;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "[I")
    private int[] field5782;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "[I")
    private int[] field5784;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field5777;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field5787;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[[I")
    private int[][] field5779;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "[[I")
    private int[][] field5786;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "[[I")
    private int[][] field5790;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2445(int arg0, int arg1, int arg2) {
        if (arg1 != -5) {
            field5783 = null;
        }
        field5769++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILps;BI)V", line = 18)
    public static final void method2446(int arg0, int arg1, class62 arg2, byte arg3, int arg4) {
        field5781++;
        int var5 = arg2.field409[0];
        int var6 = arg2.field416[0];
        if (arg4 != 2 || var5 < 0 || class237.field3436 <= var5 || var6 < 0 || class83.field1366 <= var6 || arg1 < 0 || class237.field3436 <= arg1 || arg0 < 0 || class83.field1366 <= arg0) {
            return;
        }
        int var7 = class319.method2000(-1, 0, class248.field3581, 0, var6, 0, true, arg1, arg0, -4, arg2.method184(1), 0, class203.field2939, var5, class255.field3679[arg2.field5538]);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg2.method553(class203.field2939[var8], arg3, (byte) -96, class248.field3581[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)V", line = 55)
    public static final void method2447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class400 var7 = (class400) class389.field5758.method1639(-1); var7 != null; var7 = (class400) class389.field5758.method1642((byte) -106)) {
            if (var7.field5867 <= class180.field2734) {
                var7.method1540(-1);
            } else {
                class205.method1372(arg0, (byte) 126, (var7.field5876 << 7) + 64, arg4 >> 1, arg1 >> 1, var7.field5868, var7.field5866 * 2, (var7.field5872 << 7) + 64, arg5);
                class526.field7731.method2913(var7.field5875 | 0xFF000000, arg3 + class387.field5746[1], 0, arg2 + class387.field5746[0], var7.field5874, (byte) 115);
            }
        }
        field5767++;
        if (arg6 != 0) {
            field5783 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILti;)V", line = 86)
    public final void method2448(int arg0, class303 arg1) {
        while (true) {
            int var3 = arg1.method1918((byte) -109);
            if (var3 == 0) {
                if (arg0 != -1) {
                    method2453(23, -53);
                }
                field5775++;
                return;
            }
            this.method2451(var3, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 127)
    public static void method2449(int arg0) {
        if (arg0 != -26745) {
            field5792 = 43;
        }
        field5791 = null;
        field5793 = null;
        field5783 = null;
        field5778 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 143)
    public final void method2450(byte arg0) {
        field5766++;
        if (arg0 < -102 && this.field5773 == null) {
            this.field5773 = this.field5764;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILti;I)V", line = 160)
    private final void method2451(int arg0, class303 arg1, int arg2) {
        if (arg2 != -1) {
            method2449(-98);
        }
        field5789++;
        if (arg0 == 1) {
            this.field5764 = arg1.method1862((byte) -128);
        } else if (arg0 == 2) {
            this.field5773 = arg1.method1862((byte) -97);
        } else if (arg0 == 3) {
            int var22 = arg1.method1918((byte) 107);
            this.field5779 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field5779[var23][0] = arg1.method1868(0);
                this.field5779[var23][1] = arg1.method1870(-1945262512);
                this.field5779[var23][2] = arg1.method1870(-1945262512);
            }
        } else if (arg0 == 4) {
            int var4 = arg1.method1918((byte) -61);
            this.field5790 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5790[var5][0] = arg1.method1868(0);
                this.field5790[var5][1] = arg1.method1870(-1945262512);
                this.field5790[var5][2] = arg1.method1870(class113.method838(arg2, 1945262511));
            }
        } else if (arg0 == 5) {
            arg1.method1868(0);
        } else if (arg0 == 6) {
            arg1.method1918((byte) 102);
        } else if (arg0 == 7) {
            arg1.method1918((byte) 75);
            return;
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method1918((byte) 112);
                return;
            }
            if (arg0 == 10) {
                int var6 = arg1.method1918((byte) -95);
                this.field5784 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5784[var7] = arg1.method1870(-1945262512);
                }
                return;
            }
            if (arg0 == 12) {
                arg1.method1870(arg2 - 1945262511);
                return;
            }
            if (arg0 != 13) {
                if (arg0 == 14) {
                    int var8 = arg1.method1918((byte) 90);
                    this.field5786 = new int[var8][2];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field5786[var9][0] = arg1.method1918((byte) 92);
                        this.field5786[var9][1] = arg1.method1918((byte) 92);
                    }
                    return;
                }
                if (arg0 != 15) {
                    if (arg0 == 17) {
                        this.field5776 = arg1.method1868(0);
                        return;
                    }
                    if (arg0 == 18) {
                        int var10 = arg1.method1918((byte) 121);
                        this.field5770 = new int[var10];
                        this.field5780 = new int[var10];
                        this.field5771 = new int[var10];
                        this.field5777 = new String[var10];
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5770[var11] = arg1.method1870(-1945262512);
                            this.field5780[var11] = arg1.method1870(class113.method838(arg2, 1945262511));
                            this.field5771[var11] = arg1.method1870(-1945262512);
                            this.field5777[var11] = arg1.method1879(30669);
                        }
                        return;
                    }
                    if (arg0 == 19) {
                        int var18 = arg1.method1918((byte) 122);
                        this.field5782 = new int[var18];
                        this.field5765 = new int[var18];
                        this.field5787 = new String[var18];
                        this.field5768 = new int[var18];
                        for (int var19 = 0; var19 < var18; var19++) {
                            this.field5768[var19] = arg1.method1870(-1945262512);
                            this.field5782[var19] = arg1.method1870(-1945262512);
                            this.field5765[var19] = arg1.method1870(arg2 - 1945262511);
                            this.field5787[var19] = arg1.method1879(arg2 + 30670);
                        }
                    } else if (arg0 == 249) {
                        int var12 = arg1.method1918((byte) 67);
                        if (this.field5788 == null) {
                            int var13 = class159.method1146(false, var12);
                            this.field5788 = new class398(var13);
                        }
                        for (int var14 = 0; var14 < var12; var14++) {
                            boolean var15 = arg1.method1918((byte) 97) == 1;
                            int var16 = arg1.method1866(false);
                            class439 var17;
                            if (var15) {
                                var17 = new class411(arg1.method1879(arg2 ^ 0xFFFF8832));
                            } else {
                                var17 = new class242(arg1.method1870(-1945262512));
                            }
                            this.field5788.method2486(-7, var17, (long) var16);
                        }
                        return;
                    }
                    return;
                }
                arg1.method1868(0);
                return;
            }
            int var20 = arg1.method1918((byte) 124);
            this.field5774 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field5774[var21] = arg1.method1868(0);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)Z", line = 392)
    public static final boolean method2452(int arg0, int arg1, int arg2) {
        if (arg0 != 33) {
            method2449(77);
        }
        field5785++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Z", line = 412)
    public static final boolean method2453(int arg0, int arg1) {
        if (arg0 != -2628) {
            method2452(-16, -121, 35);
        }
        field5772++;
        return (-arg1 & arg1) == arg1;
    }
}
