import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class224 extends class197 {

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    private int field3838 = 0;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    private int field3837 = 4096;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Loh;")
    public static class258 field3831 = class153.method1046("runes", 106);

    @OriginalMember(owner = "client!m", name = "S", descriptor = "J")
    public static volatile long field3835 = 0L;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Loh;")
    public static class258 field3829 = class153.method1046("Lade Sprites )2 ", 126);

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field3840 = -1;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "Z")
    public static boolean field3836 = false;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "Lmd;")
    public static class114 field3844;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "Ls;")
    public static class171 field3843;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 4)
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I", line = 23)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            this.field3838 = 126;
        }
        field3841++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(0, arg0 ^ 0x3F2D, arg1);
            for (int var5 = 0; var5 < class190.field3362; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field3838) {
                    var3[var5] = this.field3838;
                } else if (this.field3837 < var6) {
                    var3[var5] = this.field3837;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)[[I", line = 65)
    public final int[][] method101(int arg0, byte arg1) {
        field3830++;
        int var3 = -44 % ((arg1 - 1) / 37);
        int[][] var4 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[][] var5 = this.method1322(0, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class190.field3362; var12++) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (this.field3838 > var13) {
                    var9[var12] = this.field3838;
                } else if (var13 <= this.field3837) {
                    var9[var12] = var13;
                } else {
                    var9[var12] = this.field3837;
                }
                if (this.field3838 > var14) {
                    var10[var12] = this.field3838;
                } else if (var14 <= this.field3837) {
                    var10[var12] = var14;
                } else {
                    var10[var12] = this.field3837;
                }
                if (this.field3838 > var15) {
                    var11[var12] = this.field3838;
                } else if (this.field3837 < var15) {
                    var11[var12] = this.field3837;
                } else {
                    var11[var12] = var15;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(B)V", line = 144)
    public static void method1506(byte arg0) {
        field3831 = null;
        field3843 = null;
        field3829 = null;
        int var1 = -30 % ((arg0 + 6) / 49);
        field3844 = null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 156)
    public static final void method1507(int arg0) {
        field3834++;
        class29.field342.method1157(arg0 ^ 0xFFFFEF00);
        if (arg0 != -4348) {
            method1509((class235) null, true);
        }
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(B)I", line = 168)
    public static final int method1508(byte arg0) {
        int var1 = 62 % ((arg0 - 74) / 37);
        field3839++;
        return 2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lva;Z)V", line = 198)
    public static final void method1509(class235 arg0, boolean arg1) {
        field3832++;
        if ((arg0.field4066.length - arg0.field4051) < 1) {
            return;
        }
        int var2 = arg0.method1589(91);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field4066.length - arg0.field4051) < var3) {
            return;
        }
        class151.field2557 = arg0.method1589(54);
        if (class151.field2557 < 1) {
            class151.field2557 = 1;
        } else if (class151.field2557 > 4) {
            class151.field2557 = 4;
        }
        class16.method106(arg0.method1589(86) == 1, (byte) -14);
        class45.field672 = arg0.method1589(124) == 1;
        class119.field2110 = arg0.method1589(105) == 1;
        class173.field3101 = arg0.method1589(110) == 1;
        class146.field2477 = arg0.method1589(117) == 1;
        class271.field4697 = arg0.method1589(111) == 1;
        class50.field743 = arg0.method1589(116) == 1;
        class90.field1587 = arg0.method1589(82) == 1;
        class250.field4312 = arg0.method1589(121);
        if (class250.field4312 > 2) {
            class250.field4312 = 2;
        }
        if (var2 >= 2) {
            class4.field62 = arg0.method1589(79) == 1;
        } else {
            class4.field62 = arg0.method1589(70) == 1;
            arg0.method1589(115);
        }
        class20.field239 = arg0.method1589(123) == 1;
        class57.field896 = arg0.method1589(80) == 1;
        class58.field917 = arg0.method1589(106);
        if (class58.field917 > 2) {
            class58.field917 = 2;
        }
        class197.field3463 = arg0.method1589(79) == 1;
        class186.field3307 = arg0.method1589(108);
        if (class186.field3307 > 127) {
            class186.field3307 = 127;
        }
        class244.field4233 = arg0.method1589(82);
        class317.field5345 = arg0.method1589(121);
        if (class317.field5345 > 127) {
            class317.field5345 = 127;
        }
        if (var2 >= 1) {
            class259.field4501 = arg0.method1615(11);
            class239.field4171 = arg0.method1615(60);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1589(54);
        }
        if (var2 >= 4) {
            arg0.method1589(115);
        }
        if (var2 >= 5) {
            class99.field1758 = arg0.method1611(29);
        }
        if (!arg1) {
            field3829 = (class258) null;
        }
        if (var2 >= 6) {
            class61.field1022 = arg0.method1589(126);
        }
        if (var2 >= 7) {
            class242.field4196 = arg0.method1589(84) == 1;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)V", line = 332)
    public static final void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3833++;
        if (class92.method685(-1, arg0)) {
            if (arg2 < 47) {
                method1507(-63);
            }
            client.method356(class23.field290[arg0], -1, arg5, arg6, arg4, arg7, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILva;I)V", line = 360)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            field3844 = (class114) null;
        }
        if (arg2 == 0) {
            this.field3838 = arg1.method1615(arg0 ^ 0xFFFFE0E9);
        } else if (arg2 == 1) {
            this.field3837 = arg1.method1615(-1);
        } else if (arg2 == 2) {
            this.field3462 = arg1.method1589(67) == 1;
        }
        field3842++;
    }
}
