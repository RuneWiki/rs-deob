import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class196 extends class30 {

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "Z")
    public boolean field3805 = false;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public int field3812 = -1;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "[I")
    private int[] field3822 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public static int field3818 = 0;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "Lrd;")
    public static class173 field3819 = class133.method843("blaugr-Un:", -81);

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Llc;")
    public static class112 field3811 = new class112(4096);

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "Lrd;")
    public static class173 field3828 = class133.method843(":assist:", 67);

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "Lrd;")
    public static class173 field3830 = class133.method843("(U2", -101);

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
    public static int field3827 = 0;

    @OriginalMember(owner = "client!tg", name = "lb", descriptor = "Lrd;")
    private static class173 field3831 = class133.method843("This computers address has been blocked", 82);

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "Lrd;")
    public static class173 field3829 = field3831;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "[I")
    private int[] field3816;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "[S")
    private short[] field3806;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "[S")
    private short[] field3808;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "[S")
    private short[] field3817;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "[S")
    private short[] field3823;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lmb;Z)V")
    public final void method1299(class121 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method751((byte) 98);
            if (var3 == 0) {
                field3815++;
                return;
            }
            this.method1300(arg0, (byte) -118, var3);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lmb;BI)V")
    private final void method1300(class121 arg0, byte arg1, int arg2) {
        if (arg1 > -117) {
            field3827 = -123;
        }
        if (arg2 == 1) {
            this.field3812 = arg0.method751((byte) 107);
        } else if (arg2 == 2) {
            int var8 = arg0.method751((byte) 116);
            this.field3816 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3816[var9] = arg0.method755((byte) -110);
            }
        } else if (arg2 == 3) {
            this.field3805 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method751((byte) -26);
            this.field3806 = new short[var4];
            this.field3817 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3806[var5] = (short) arg0.method755((byte) -48);
                this.field3817[var5] = (short) arg0.method755((byte) -93);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method751((byte) -43);
            this.field3823 = new short[var6];
            this.field3808 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3823[var7] = (short) arg0.method755((byte) -110);
                this.field3808[var7] = (short) arg0.method755((byte) -97);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3822[arg2 - 60] = arg0.method755((byte) -63);
        }
        field3821++;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(B)Z")
    public final boolean method1301(byte arg0) {
        field3820++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3822[var3] != -1 && !class190.field3722.method134(true, this.field3822[var3], 0)) {
                var2 = false;
            }
        }
        if (arg0 != 73) {
            this.field3817 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)Z")
    public final boolean method1302(int arg0) {
        field3809++;
        if (this.field3816 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field3816.length; var3++) {
            if (!class190.field3722.method134(true, this.field3816[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)Lob;")
    public final class141 method1303(int arg0) {
        field3807++;
        class141[] var2 = new class141[5];
        int var3 = 0;
        if (arg0 != -24409) {
            field3819 = null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3822[var4] != -1) {
                var2[var3++] = class141.method900(class190.field3722, this.field3822[var4], 0);
            }
        }
        class141 var5 = new class141(var2, var3);
        if (this.field3806 != null) {
            for (int var6 = 0; var6 < this.field3806.length; var6++) {
                var5.method890(this.field3806[var6], this.field3817[var6]);
            }
        }
        if (this.field3823 != null) {
            for (int var7 = 0; var7 < this.field3823.length; var7++) {
                var5.method888(this.field3823[var7], this.field3808[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
    public static final void method1304(int arg0) {
        int var1 = 84 / ((arg0 + 57) / 43);
        field3813++;
        while (class70.field1358.method1022(class45.field919, 0) >= 27) {
            int var2 = class70.field1358.method1029(15, 0);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (client.field632[var2] == null) {
                var3 = true;
                client.field632[var2] = new class120();
            }
            class120 var4 = client.field632[var2];
            class139.field2597[class66.field1291++] = var2;
            var4.field2800 = class217.field4203;
            var4.field2215 = class94.method593(class70.field1358.method1029(14, 0), (byte) -38);
            int var5 = class70.field1358.method1029(5, 0);
            int var6 = class135.field2559[class70.field1358.method1029(3, 0)];
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var3) {
                var4.field2794 = var4.field2786 = var6;
            }
            int var7 = class70.field1358.method1029(1, 0);
            if (var7 == 1) {
                class4.field97[class36.field783++] = var2;
            }
            int var8 = class70.field1358.method1029(1, 0);
            int var9 = class70.field1358.method1029(5, 0);
            var4.field2815 = var4.field2215.field937;
            var4.field2796 = var4.field2215.field925;
            var4.field2755 = var4.field2215.field946;
            var4.field2804 = var4.field2215.field941;
            if (var9 > 15) {
                var9 -= 32;
            }
            var4.field2766 = var4.field2215.field915;
            var4.field2811 = var4.field2215.field908;
            var4.field2754 = var4.field2215.field929;
            var4.field2787 = var4.field2215.field923;
            if (var4.field2787 == 0) {
                var4.field2786 = 0;
            }
            var4.field2760 = var4.field2215.field945;
            var4.method970(128, var8 == 1, class175.field3447.field2764[0] + var5, class175.field3447.field2814[0] + var9);
        }
        class70.field1358.method1025(-122);
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V")
    public static final void method1305(int arg0) {
        field3825++;
        if (arg0 >= -43) {
            method1309(59);
        }
        if (class60.field1199 != null) {
            class60.field1199.method485(true);
        }
        if (class140.field2604 != null) {
            class140.field2604.method485(true);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
    public static final void method1306(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            return;
        }
        class37 var5 = (class37) class8.field150.method677(-2755, (long) arg4);
        if (var5 == null) {
            var5 = new class37();
            class8.field150.method675((long) arg4, var5, false);
        }
        field3804++;
        if (arg2 >= var5.field786.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field786.length; var8++) {
                var6[var8] = var5.field786[var8];
                var7[var8] = var5.field784[var8];
            }
            for (int var9 = var5.field786.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field786 = var6;
            var5.field784 = var7;
        }
        var5.field786[arg2] = arg3;
        var5.field784[arg2] = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "(I)Lob;")
    public final class141 method1307(int arg0) {
        field3814++;
        if (this.field3816 == null) {
            return null;
        }
        if (arg0 < 43) {
            method1308(-5, -15, 63, 41, 112, -121, -110, -94, 32);
        }
        class141[] var2 = new class141[this.field3816.length];
        for (int var3 = 0; var3 < this.field3816.length; var3++) {
            var2[var3] = class141.method900(class190.field3722, this.field3816[var3], 0);
        }
        class141 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class141(var2, var2.length);
        }
        if (this.field3806 != null) {
            for (int var5 = 0; var5 < this.field3806.length; var5++) {
                var4.method890(this.field3806[var5], this.field3817[var5]);
            }
        }
        if (this.field3823 != null) {
            for (int var6 = 0; var6 < this.field3823.length; var6++) {
                var4.method888(this.field3823[var6], this.field3808[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3826++;
        if (class212.method1389(-111, arg6)) {
            if (arg2 == 21565) {
                class176.field3456 = null;
                class164.method1056(-1, arg8, arg3, arg0, arg5, arg4, arg1, class63.field1232[arg6], 0, arg7);
                if (class176.field3456 != null) {
                    class164.method1056(-1412584499, arg8, class163.field3024, arg0, arg5, arg4, arg1, class176.field3456, 0, class169.field3267);
                    class176.field3456 = null;
                }
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class70.field1373[var9] = true;
            }
        } else {
            class70.field1373[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "(I)V")
    public static void method1309(int arg0) {
        field3830 = null;
        field3819 = null;
        field3829 = null;
        field3831 = null;
        field3828 = null;
        field3811 = null;
        if (arg0 != 1) {
            field3818 = 101;
        }
    }
}
