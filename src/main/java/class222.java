import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class222 {

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    private int field3817 = 1;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    private int field3822 = 0;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    private int field3821 = 1;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    private int field3830 = 0;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "Lpu;")
    private class411 field3835 = new class411();

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    private int field3837 = -1;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "Z")
    private boolean field3840 = true;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    private int field3842 = 0;

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "Z")
    private boolean field3844 = true;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "[Lah;")
    private class187[] field3846 = new class187[2];

    @OriginalMember(owner = "client!jr", name = "E", descriptor = "Z")
    private boolean field3838 = false;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "Z")
    private boolean field3839 = true;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "Z")
    private boolean field3845 = true;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Lih;")
    private class214 field3808;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "Ljk;")
    private class533 field3828;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "Ljk;")
    private class533 field3824;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "Ljk;")
    private class533 field3826;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "Lvv;")
    public static class313 field3812 = new class313(26, 12);

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "[I")
    public static int[] field3816 = new int[32];

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field3819 = 0;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "[I")
    public static int[] field3820 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "Z")
    public static boolean field3823 = false;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "[I")
    public static int[] field3825 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "Lnj;")
    public static class314 field3831 = new class314(0, -1);

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "Lvv;")
    public static class313 field3834 = new class313(54, 12);

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "Lah;")
    private class187 field3843;

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "Lcj;")
    private class213 field3836;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "Lcj;")
    private class213 field3841;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "Z")
    private boolean field3829;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILkf;)V", line = 5)
    public final void method1525(int arg0, class249 arg1) {
        arg1.field4244 = false;
        field3811++;
        arg1.method247((byte) 81);
        if (arg0 != 0) {
            this.field3826 = null;
        }
        arg1.method1821((byte) -127);
        this.method1527(-125);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(ILkf;)Z", line = 19)
    public final boolean method1526(int arg0, class249 arg1) {
        field3814++;
        if (this.field3824 != null) {
            if (arg1.method246(arg0 ^ 0xFFFF8141) || arg1.method239(0)) {
                this.field3835.method2541(0, arg1);
                this.method1527(arg0 ^ 0x79);
                if (this.method1530(117)) {
                    if (this.field3817 != -1 && this.field3821 != -1) {
                        arg1.method243(this.field3821, (byte) -121, this.field3817);
                    }
                    arg1.field4244 = true;
                    return true;
                }
            }
            this.method1525(arg0 + 1, arg1);
        }
        if (arg0 != -1) {
            field3819 = -122;
        }
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 58)
    private final void method1527(int arg0) {
        field3832++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class249 var5 = (class249) this.field3835.method2538(-3); var5 != null; var5 = (class249) this.field3835.method2535((byte) -96)) {
            int var9 = var5.method244(-50);
            var4 += var5.method1688(-116);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method1691(100);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field3837 != var6) {
            this.field3837 = var6;
            this.field3844 = true;
        }
        if (arg0 >= -121) {
            return;
        }
        int var7 = this.field3842 > 2 ? 2 : this.field3842;
        int var8 = var4 > 2 ? 2 : var4;
        this.field3842 = var4;
        if (var7 != var8) {
            this.field3845 = this.field3844 = true;
        }
        if (var2 != this.field3838) {
            this.field3838 = var2;
            this.field3839 = true;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V", line = 120)
    public final void method1528(boolean arg0) {
        field3809++;
        if (!this.field3829) {
            return;
        }
        if (this.field3826 != null) {
            int var2 = 16384;
            this.field3808.method1431(false, this.field3826);
            this.field3808.method1465((byte) -100, this.field3828);
            this.field3826.method3161(0, 18);
            this.field3828.method3150(39, 0);
            if (this.field3838) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field3817, this.field3821, 0, 0, this.field3817, this.field3821, var2, 9728);
            this.field3808.method1438(this.field3826, !arg0);
            this.field3808.method1456(3, this.field3828);
        }
        this.field3808.method1425((byte) 102);
        this.field3808.method1486(0, (byte) 116);
        this.field3808.method1410(1, 7681);
        this.field3808.method848();
        int var3 = 0;
        int var4 = 1;
        class249 var6;
        for (class249 var5 = (class249) this.field3835.method2538(-3); var5 != null; var5 = var6) {
            var6 = (class249) this.field3835.method2535((byte) -74);
            int var7 = var5.method1688(-64);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method245(this.field3843, false, this.field3846[var3], var8);
                if (var6 == null && var7 - 1 == var8) {
                    this.field3808.method1416(this.field3828, 56);
                    this.field3808.method1415(0, 0, true);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3821);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3830, this.field3822);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3830, this.field3822 + this.field3821);
                    OpenGL.glTexCoord2f((float) this.field3817, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3830 + this.field3817, this.field3822 + this.field3821);
                    OpenGL.glTexCoord2f((float) this.field3817, (float) this.field3821);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3830 + this.field3817, this.field3822);
                    OpenGL.glEnd();
                } else {
                    this.field3828.method3150(119, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field3821);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field3821);
                    OpenGL.glTexCoord2f((float) this.field3817, (float) this.field3821);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field3817, this.field3821);
                    OpenGL.glTexCoord2f((float) this.field3817, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field3817, 0);
                    OpenGL.glEnd();
                }
                var5.method238(-30828, var8);
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
            }
        }
        if (arg0) {
            this.field3829 = false;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V", line = 224)
    public final void method1529(boolean arg0) {
        field3833++;
        if (arg0) {
            return;
        }
        this.field3846 = null;
        this.field3836 = null;
        this.field3843 = null;
        this.field3824 = this.field3826 = this.field3828 = null;
        this.field3841 = null;
        if (!this.field3835.method2544((byte) 61)) {
            for (class276 var2 = this.field3835.method2538(-3); var2 != this.field3835.field6207; var2 = var2.field4535) {
                ((class249) var2).method247((byte) 120);
            }
        }
        this.field3817 = this.field3821 = 1;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z", line = 270)
    private final boolean method1530(int arg0) {
        field3810++;
        if (this.field3839) {
            if (this.field3841 != null) {
                this.field3841.method1401(123);
                this.field3841 = null;
            }
            if (this.field3843 != null) {
                this.field3843.method1209(89);
                this.field3843 = null;
            }
            if (this.field3826 != null) {
                this.field3841 = new class213(this.field3808, 6402, this.field3817, this.field3821, this.field3808.field3593);
            }
            if (this.field3838) {
                this.field3843 = new class187(this.field3808, 34037, 6402, this.field3817, this.field3821);
            } else if (this.field3841 == null) {
                this.field3841 = new class213(this.field3808, 6402, this.field3817, this.field3821);
            }
            this.field3845 = true;
            this.field3839 = false;
            this.field3840 = true;
        }
        if (this.field3844) {
            if (this.field3836 != null) {
                this.field3836.method1401(115);
                this.field3836 = null;
            }
            if (this.field3846[0] != null) {
                this.field3846[0].method1209(77);
                this.field3846[0] = null;
            }
            if (this.field3846[1] != null) {
                this.field3846[1].method1209(111);
                this.field3846[1] = null;
            }
            if (this.field3826 != null) {
                this.field3836 = new class213(this.field3808, this.field3837, this.field3817, this.field3821, this.field3808.field3593);
            }
            this.field3846[0] = new class187(this.field3808, 34037, this.field3837, this.field3817, this.field3821);
            this.field3846[1] = this.field3842 > 1 ? new class187(this.field3808, 34037, this.field3837, this.field3817, this.field3821) : null;
            this.field3844 = false;
            this.field3840 = true;
            this.field3845 = true;
        }
        if (arg0 < 96) {
            return false;
        }
        if (this.field3845) {
            if (this.field3826 == null) {
                this.field3808.method1429(0, this.field3828);
                this.field3828.method3157(116, 0);
                this.field3828.method3157(-7, 1);
                this.field3828.method3157(-54, 8);
                this.field3828.method3156(0, (byte) 126, this.field3846[0]);
                if (this.field3842 > 1) {
                    this.field3828.method3156(1, (byte) -61, this.field3846[1]);
                }
                if (this.field3838) {
                    this.field3828.method3156(8, (byte) 127, this.field3843);
                } else {
                    this.field3828.method3154(this.field3841, (byte) 68, 8);
                }
                this.field3808.method1416(this.field3828, -124);
            } else {
                this.field3808.method1429(0, this.field3828);
                this.field3828.method3157(126, 0);
                this.field3828.method3157(119, 1);
                this.field3828.method3157(-85, 8);
                this.field3828.method3156(0, (byte) -39, this.field3846[0]);
                if (this.field3842 > 1) {
                    this.field3828.method3156(1, (byte) 107, this.field3846[1]);
                }
                if (this.field3838) {
                    this.field3828.method3156(8, (byte) 111, this.field3843);
                }
                this.field3808.method1416(this.field3828, -127);
                this.field3808.method1429(0, this.field3826);
                this.field3826.method3157(-126, 0);
                this.field3826.method3157(121, 8);
                this.field3826.method3154(this.field3836, (byte) 29, 0);
                this.field3826.method3154(this.field3841, (byte) 86, 8);
                this.field3808.method1416(this.field3826, -123);
            }
            this.field3845 = false;
            this.field3840 = true;
        }
        if (this.field3840) {
            this.field3808.method1429(0, this.field3824);
            this.field3840 = !this.field3824.method3165((byte) 81);
            this.field3808.method1416(this.field3824, -122);
        }
        return !this.field3840;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBIII)Z", line = 407)
    public final boolean method1531(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3818++;
        if (arg1 > -110) {
            this.method1526(34, null);
        }
        if (this.field3824 == null || this.field3835.method2544((byte) 61)) {
            return false;
        }
        if (this.field3817 != arg4 || this.field3821 != arg0) {
            this.field3817 = arg4;
            this.field3821 = arg0;
            for (class276 var6 = this.field3835.method2538(-3); var6 != this.field3835.field6207; var6 = var6.field4535) {
                ((class249) var6).method243(this.field3821, (byte) -32, this.field3817);
            }
            this.field3845 = true;
            this.field3844 = true;
            this.field3839 = true;
        }
        if (!this.method1530(103)) {
            return false;
        }
        this.field3829 = true;
        this.field3822 = arg2;
        this.field3830 = arg3;
        this.field3808.method1429(0, this.field3824);
        this.field3824.method3150(22, 0);
        this.field3808.method1415(-this.field3830, this.field3821 - this.field3824.method3159(12833) - this.field3822, true);
        return true;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBI)Z", line = 458)
    public static final boolean method1532(int arg0, byte arg1, int arg2) {
        field3815++;
        if (((arg0 & 0x10000) != 0 | class536.method3173(arg2, -1, arg0)) || class345.method2229(arg2, arg0, 122)) {
            return true;
        } else {
            int var3 = -29 % ((-arg1 - 70) / 49);
            return (arg2 & 0x37) == 0 && class206.method1354(-2, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZI)Lbs;", line = 472)
    public static final class111 method1533(boolean arg0, int arg1) {
        field3813++;
        if (arg0) {
            return null;
        }
        class111[] var2 = class350.method2251(true);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class111 var4 = var2[var3];
            if (var4.field1962 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lih;)V", line = 598)
    public class222(class214 arg0) {
        this.field3808 = arg0;
        if (this.field3808.field3724 && this.field3808.field3666) {
            this.field3824 = this.field3828 = new class533(this.field3808);
            if (this.field3808.field3593 > 1 && this.field3808.field3720 && this.field3808.field3737) {
                this.field3824 = this.field3826 = new class533(this.field3808);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V", line = 504)
    public static void method1534(int arg0) {
        field3825 = null;
        field3820 = null;
        if (arg0 != 32647) {
            method1532(-2, (byte) 85, 18);
        }
        field3831 = null;
        field3816 = null;
        field3812 = null;
        field3834 = null;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)Z", line = 540)
    public final boolean method1535(int arg0) {
        field3827++;
        if (arg0 > -29) {
            this.method1528(false);
        }
        return this.field3824 != null;
    }
}
