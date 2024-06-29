import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class291 extends class507 {

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "[Lft;")
    public static class4[] field3850;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "Ljava/lang/String;")
    public String field3840;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "[C")
    public char[] field3834;

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "[C")
    public char[] field3847;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "[I")
    public int[] field3831;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "[I")
    public int[] field3843;

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "[I")
    public static int[] field3845;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "[[I")
    public static int[][] field3842;

    static {
        new class305("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field3850 = new class4[30];
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BC)I", line = 3)
    public final int method1744(byte arg0, char arg1) {
        field3839++;
        if (this.field3831 == null) {
            return -1;
        } else if (arg0 == 32) {
            for (int var3 = 0; var3 < this.field3831.length; var3++) {
                if (this.field3847[var3] == arg1) {
                    return this.field3831[var3];
                }
            }
            return -1;
        } else {
            return 52;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIB)V", line = 27)
    public static final void method1745(int arg0, int arg1, byte arg2) {
        if (arg2 != 107) {
            method1746(-21);
        }
        field3844++;
        class184 var3 = class277.method1682(arg0, 12, -103);
        var3.method1069(true);
        var3.field2393 = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V", line = 41)
    public static final void method1746(int arg0) {
        class106.field1443.method2398(118, class461.field6872.method2137(-8785));
        field3833++;
        class106.field1443.method2398(-30, class434.field6336.method2137(-8785));
        class106.field1443.method2398(115, class517.field7627.method2137(-8785));
        class106.field1443.method2398(-79, class258.field3450.method2137(-8785));
        class106.field1443.method2398(-96, class273.field3641.method2137(-8785));
        class106.field1443.method2398(123, class426.field6186.method2137(-8785));
        class106.field1443.method2398(-1, class96.field1214.method2137(-8785));
        class106.field1443.method2398(113, class95.field1136.method2137(-8785));
        class106.field1443.method2398(-95, class282.field3733.method2137(-8785));
        class106.field1443.method2398(121, class524.field7702.method2137(-8785));
        if (arg0 <= 12) {
            field3837 = 114;
        }
        class106.field1443.method2398(127, class98.field1322.method2137(-8785));
        class106.field1443.method2398(116, class154.field2017.method2137(-8785));
        class106.field1443.method2398(2, class230.field3101.method2137(-8785));
        class106.field1443.method2398(117, class98.field1309.method2137(-8785));
        class106.field1443.method2398(-112, class75.field938.method2137(-8785));
        class106.field1443.method2398(125, class287.field3782.method2137(-8785));
        class106.field1443.method2398(124, class316.field4207.method2137(-8785));
        class106.field1443.method2398(119, class306.field4088.method2137(-8785));
        class106.field1443.method2398(127, class232.field3114.method2137(-8785));
        class106.field1443.method2398(-128, class533.field7851.method2137(-8785));
        class106.field1443.method2398(120, class117.field1533.method2137(-8785));
        class106.field1443.method2398(122, class49.field558.method2137(-8785));
        class106.field1443.method2398(-45, class6.field76.method2137(-8785));
        class106.field1443.method2398(126, class413.field5904.method2137(-8785));
        class106.field1443.method2398(-90, class479.field7093.method2137(-8785));
        class106.field1443.method2398(-85, class374.field5075.method2137(-8785));
        class106.field1443.method2398(123, class346.field4613.method2137(-8785));
        class106.field1443.method2398(-85, class48.field543.method2137(-8785));
        class106.field1443.method2398(-17, class337.field4466.method2137(-8785));
        class106.field1443.method2398(-27, class32.field333.method2137(-8785));
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(CI)Z", line = 84)
    public static final boolean method1747(char arg0, int arg1) {
        if (arg1 != 30987) {
            field3850 = null;
        }
        field3846++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)V", line = 95)
    public static void method1748(int arg0) {
        field3842 = null;
        field3845 = null;
        field3850 = null;
        if (arg0 != 17104) {
            method1748(7);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILug;I)V", line = 111)
    private final void method1749(int arg0, class396 arg1, int arg2) {
        field3841++;
        if (arg0 != -5) {
            this.method1750(74);
        }
        if (arg2 == 1) {
            this.field3840 = arg1.method2432((byte) 125);
        } else if (arg2 == 2) {
            int var4 = arg1.method2388((byte) -125);
            this.field3847 = new char[var4];
            this.field3831 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3831[var5] = arg1.method2386(-23648);
                byte var6 = arg1.method2418(arg0 ^ 0x8);
                this.field3847[var5] = var6 == 0 ? 0 : class42.method246(arg0 + 5, var6);
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg1.method2388((byte) -121);
            this.field3834 = new char[var7];
            this.field3843 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3843[var8] = arg1.method2386(class335.method1958(arg0, 23643));
                byte var9 = arg1.method2418(106);
                this.field3834[var8] = var9 == 0 ? 0 : class42.method246(0, var9);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V", line = 184)
    public final void method1750(int arg0) {
        if (this.field3843 != null) {
            for (int var2 = 0; var2 < this.field3843.length; var2++) {
                this.field3843[var2] = class219.method1381(this.field3843[var2], 32768);
            }
        }
        field3832++;
        if (arg0 < 60) {
            this.method1750(7);
        }
        if (this.field3831 != null) {
            for (int var3 = 0; var3 < this.field3831.length; var3++) {
                this.field3831[var3] = class219.method1381(this.field3831[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IJ)V", line = 220)
    public static final void method1751(int arg0, long arg1) {
        if (arg0 <= 101) {
            field3842 = null;
        }
        field3836++;
        int var3 = class200.field2665;
        if (class412.field5886 != var3) {
            int var4 = var3 - class412.field5886;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var5 < var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class412.field5886 += var5;
        }
        int var6 = class299.field3936;
        if (class492.field7214 != var6) {
            int var7 = var6 - class492.field7214;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class492.field7214 += var8;
        }
        if (!class319.field4256.field4651) {
            class199.field2650 += (float) arg1 * class283.field3745 / 40.0F * 8.0F;
            class143.field1907 += (float) arg1 * class249.field3321 / 40.0F * 8.0F;
        }
        class408.method2499((byte) 98);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(CI)I", line = 311)
    public final int method1752(char arg0, int arg1) {
        field3835++;
        if (this.field3843 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field3843.length; var3++) {
            if (this.field3834[var3] == arg0) {
                return this.field3843[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lug;Z)V", line = 332)
    public final void method1753(class396 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -128);
            if (var3 == 0) {
                if (!arg1) {
                    this.field3843 = null;
                }
                field3848++;
                return;
            }
            this.method1749(-5, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(CI)B", line = 356)
    public static final byte method1754(char arg0, int arg1) {
        if (arg1 != 24391) {
            method1748(-89);
        }
        field3838++;
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
}
