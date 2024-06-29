import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class241 {

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public int field3835 = -1;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public int field3837 = -1;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field3836 = -1;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public int field3842 = -1;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public int field3851 = -1;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public int field3838 = -1;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public int field3852 = 0;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public int field3844 = -1;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public int field3850 = 0;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public int field3854 = -1;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public int field3846 = 0;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public int field3858 = 0;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public int field3856 = -1;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field3832 = -1;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public int field3834 = -1;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public int field3861 = 0;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public int field3845 = -1;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public int field3862 = -1;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public int field3863 = 0;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public int field3855 = -1;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public int field3859 = -1;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public int field3840 = -1;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public int field3866 = -1;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public int field3865 = 0;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public int field3843 = -1;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public int field3870 = -1;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public int field3871 = 0;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public int field3860 = 0;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public int field3853 = -1;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public int field3868 = -1;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public int field3867 = 0;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public int field3872 = -1;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lud;")
    public static class2 field3841 = new class2();

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field3873 = new String[200];

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "[I")
    public static int[] field3869;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[[I")
    public int[][] field3849;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public final void method1643(int arg0) {
        if (arg0 == 51) {
            field3848++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lha;I)V")
    public final void method1644(class31 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method265(-115);
            if (var3 == 0) {
                field3857++;
                if (arg1 != -46) {
                    this.field3851 = -99;
                    return;
                }
                return;
            }
            this.method1648(var3, (byte) 119, arg0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method1645(byte arg0) {
        field3873 = null;
        field3869 = null;
        field3841 = null;
        int var1 = -64 % ((arg0 - 33) / 34);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
    public static final boolean method1646(int arg0, int arg1, String arg2, boolean arg3) {
        field3864++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        if (arg0 <= 114) {
            field3873 = null;
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg1) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static final void method1647(byte arg0) {
        class188.field2959.method1169(true);
        class80.field1226.method1169(true);
        field3833++;
        if (arg0 >= -66) {
            field3841 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBLha;)V")
    private final void method1648(int arg0, byte arg1, class31 arg2) {
        field3839++;
        if (arg1 <= 17) {
            return;
        }
        if (arg0 == 1) {
            this.field3872 = arg2.method260((byte) -67);
            this.field3851 = arg2.method260((byte) -67);
            if (this.field3872 == 65535) {
                this.field3872 = -1;
            }
            if (this.field3851 == 65535) {
                this.field3851 = -1;
            }
        } else if (arg0 == 2) {
            this.field3835 = arg2.method260((byte) -67);
        } else if (arg0 == 3) {
            this.field3840 = arg2.method260((byte) -67);
        } else if (arg0 == 4) {
            this.field3834 = arg2.method260((byte) -67);
        } else if (arg0 == 5) {
            this.field3837 = arg2.method260((byte) -67);
        } else if (arg0 == 6) {
            this.field3844 = arg2.method260((byte) -67);
        } else if (arg0 == 7) {
            this.field3855 = arg2.method260((byte) -67);
        } else if (arg0 == 8) {
            this.field3842 = arg2.method260((byte) -67);
        } else if (arg0 == 9) {
            this.field3843 = arg2.method260((byte) -67);
        } else if (arg0 == 26) {
            this.field3865 = (short) (arg2.method265(-118) * 4);
            this.field3863 = (short) (arg2.method265(-102) * 4);
        } else if (arg0 == 27) {
            if (this.field3849 == null) {
                this.field3849 = new int[12][];
            }
            int var4 = arg2.method265(-107);
            this.field3849[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field3849[var4][var5] = arg2.method308((byte) 101);
            }
        } else if (arg0 == 29) {
            this.field3852 = arg2.method265(-94);
        } else if (arg0 == 30) {
            this.field3850 = arg2.method260((byte) -67);
        } else if (arg0 == 31) {
            this.field3846 = arg2.method265(-122);
        } else if (arg0 == 32) {
            this.field3871 = arg2.method260((byte) -67);
        } else if (arg0 == 33) {
            this.field3858 = arg2.method308((byte) 118);
        } else if (arg0 == 34) {
            this.field3860 = arg2.method265(-128);
        } else if (arg0 == 35) {
            this.field3867 = arg2.method260((byte) -67);
        } else if (arg0 == 36) {
            this.field3861 = arg2.method308((byte) 15);
        } else if (arg0 == 37) {
            this.field3853 = arg2.method265(-104);
        } else if (arg0 == 38) {
            this.field3845 = arg2.method260((byte) -67);
        } else if (arg0 == 39) {
            this.field3868 = arg2.method260((byte) -67);
        } else if (arg0 == 40) {
            this.field3870 = arg2.method260((byte) -67);
        } else if (arg0 == 41) {
            this.field3866 = arg2.method260((byte) -67);
        } else if (arg0 == 42) {
            this.field3862 = arg2.method260((byte) -67);
        } else if (arg0 == 43) {
            arg2.method260((byte) -67);
        } else if (arg0 == 44) {
            arg2.method260((byte) -67);
        } else if (arg0 == 45) {
            arg2.method260((byte) -67);
        } else if (arg0 == 46) {
            this.field3838 = arg2.method260((byte) -67);
        } else if (arg0 == 47) {
            this.field3836 = arg2.method260((byte) -67);
        } else if (arg0 == 48) {
            this.field3859 = arg2.method260((byte) -67);
        } else if (arg0 == 49) {
            this.field3832 = arg2.method260((byte) -67);
        } else if (arg0 == 50) {
            this.field3856 = arg2.method260((byte) -67);
        } else if (arg0 == 51) {
            this.field3854 = arg2.method260((byte) -67);
            return;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
    public static final void method1649(int arg0, int arg1, int arg2) {
        class118.field1789 = true;
        class94.field1482 = arg0;
        class26.field441 = arg1;
        class254.field4064 = arg2;
        class106.field1659 = -1;
        class49.field810 = -1;
    }
}
