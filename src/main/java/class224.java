import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class224 {

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Z")
    public boolean field3816 = false;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    private int field3817 = 0;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    private int field3820 = 128;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    private int field3812 = 128;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field3829 = -1;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    private int field3825 = 0;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    private int field3833 = 0;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Ljg;")
    public static class303 field3831 = new class303();

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Ljf;")
    public static class229 field3836 = class212.method1457((byte) 116, "Chargement des fichiers config )2 ");

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Lui;")
    public static class268 field3834 = new class268(512);

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "Ljf;")
    public static class229 field3838 = class212.method1457((byte) 75, "cookiehost");

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "Ljf;")
    public static class229 field3837 = class212.method1457((byte) 120, "null");

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Lek;")
    public static class185 field3835;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "[S")
    private short[] field3821;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[S")
    private short[] field3824;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "[S")
    private short[] field3826;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "[S")
    private short[] field3832;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1538(int arg0, int arg1) {
        class81.field1483 = new int[arg1];
        class303.field5145 = new int[arg1];
        class223.field3810 = new int[arg1];
        field3830++;
        class186.field3255 = new int[arg1];
        class90.field1644 = new int[arg1];
        if (arg0 != 1508) {
            field3838 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)V", line = 20)
    public static final void method1539(int arg0, int arg1) {
        if (arg0 < 125) {
            field3837 = (class229) null;
        }
        field3827++;
        class57.field1009.method231((byte) 113, arg1);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I", line = 36)
    public static final int method1540(int arg0, int arg1, int arg2) {
        field3818++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == arg2) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Leh;", line = 73)
    public static final class169 method1541(byte arg0, int arg1) {
        if (arg0 != 20) {
            return (class169) null;
        }
        class169 var2 = (class169) class111.field1951.method229((long) arg1, -14);
        field3814++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class274.field4691.method1275(class249.method1796(arg0 + 108, arg1), class4.method20(115, arg1), -5211);
        class169 var4 = new class169();
        var4.field2890 = arg1;
        if (var3 != null) {
            var4.method1158(128, new class14(var3));
        }
        var4.method1149((byte) -72);
        class111.field1951.method227(arg0 ^ 0xFFFF9E1F, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 103)
    public static void method1542(boolean arg0) {
        field3837 = null;
        field3835 = null;
        if (arg0) {
            method1542(false);
        }
        field3838 = null;
        field3834 = null;
        field3836 = null;
        field3831 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILkh;I)V", line = 128)
    private final void method1543(int arg0, class14 arg1, int arg2) {
        if (arg0 > -113) {
            return;
        }
        field3815++;
        if (arg2 == 1) {
            this.field3828 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field3829 = arg1.method116(-1);
        } else if (arg2 == 4) {
            this.field3820 = arg1.method116(-1);
        } else if (arg2 == 5) {
            this.field3812 = arg1.method116(-1);
        } else if (arg2 == 6) {
            this.field3817 = arg1.method116(-1);
        } else if (arg2 == 7) {
            this.field3825 = arg1.method93(false);
        } else if (arg2 == 8) {
            this.field3833 = arg1.method93(false);
        } else if (arg2 == 9) {
            this.field3816 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method93(false);
            this.field3824 = new short[var4];
            this.field3821 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3824[var5] = (short) arg1.method116(-1);
                this.field3821[var5] = (short) arg1.method116(-1);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method93(false);
            this.field3826 = new short[var6];
            this.field3832 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3826[var7] = (short) arg1.method116(-1);
                this.field3832[var7] = (short) arg1.method116(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILkh;)V", line = 211)
    public final void method1544(int arg0, class14 arg1) {
        field3813++;
        if (arg0 != 126) {
            this.field3828 = -83;
        }
        while (true) {
            int var3 = arg1.method93(false);
            if (var3 == 0) {
                return;
            }
            this.method1543(arg0 ^ 0xFFFFFFFA, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)Lrl;", line = 252)
    public final class196 method1545(int arg0, byte arg1) {
        field3822++;
        class196 var3 = (class196) client.field4463.method229((long) this.field3819, -14);
        if (var3 == null) {
            class197 var4 = class197.method1356(class115.field2076, this.field3828, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3824 != null) {
                for (int var5 = 0; var5 < this.field3824.length; var5++) {
                    var4.method1359(this.field3824[var5], this.field3821[var5]);
                }
            }
            if (this.field3826 != null) {
                for (int var6 = 0; var6 < this.field3826.length; var6++) {
                    var4.method1368(this.field3826[var6], this.field3832[var6]);
                }
            }
            var3 = var4.method1355(this.field3825 + 64, 850 - -this.field3833, -30, -50, -30);
            client.field4463.method227(-25077, var3, (long) this.field3819);
        }
        class196 var7;
        if (this.field3829 == -1 || arg0 == -1) {
            var7 = var3.method279(true, true);
        } else {
            var7 = class280.method1965(this.field3829, 95).method1324(var3, arg1 ^ 0x61, arg0);
        }
        if (this.field3820 != 128 || this.field3812 != 128) {
            var7.method271(this.field3820, this.field3812, this.field3820);
        }
        if (arg1 != 103) {
            return (class196) null;
        }
        if (this.field3817 != 0) {
            if (this.field3817 == 90) {
                var7.method281();
            }
            if (this.field3817 == 180) {
                var7.method270();
            }
            if (this.field3817 == 270) {
                var7.method267();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)I", line = 333)
    public static final int method1546(int arg0, int arg1, int arg2, int arg3) {
        field3823++;
        int var4 = arg2 & 0x3;
        if (arg1 != -3) {
            field3838 = (class229) null;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }
}
