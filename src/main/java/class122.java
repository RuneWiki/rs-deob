import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class122 {

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    private int field1839 = 1;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    private int field1843 = 0;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    private int field1833 = 1;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    private int field1830 = 0;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "Lvp;")
    private class123 field1835 = new class123();

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "Z")
    private boolean field1850 = true;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "[Lah;")
    private class260[] field1852 = new class260[2];

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "Z")
    private boolean field1854 = false;

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "I")
    private int field1857 = 0;

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "Z")
    private boolean field1858 = true;

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "Z")
    private boolean field1859 = true;

    @OriginalMember(owner = "client!ov", name = "F", descriptor = "Z")
    private boolean field1860 = true;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
    private int field1851 = -1;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "Lod;")
    private class349 field1838;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Lfv;")
    private class77 field1829;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "Lfv;")
    private class77 field1846;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "Lfv;")
    private class77 field1834;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "Lah;")
    private class260 field1856;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "Lve;")
    private class347 field1853;

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "Lve;")
    private class347 field1855;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "Z")
    private boolean field1841;

    static {
        new class475("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field1847 = -1;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lic;ZBIII)V", line = 3)
    public static final void method799(class491 arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1849++;
        if (arg2 != -16) {
            method799(null, true, (byte) -102, -102, -80, -29);
        }
        class146.field2162 = arg4;
        class23.field239 = arg1;
        class237.field3495 = arg3;
        class88.field1343 = 10000;
        class197.field2869 = arg0;
        class150.field2232 = 1;
        class107.field1546 = arg5;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLbi;)Z", line = 22)
    public final boolean method800(byte arg0, class334 arg1) {
        field1837++;
        if (this.field1846 != null) {
            if (arg1.method2042(0) || arg1.method2038(0)) {
                this.field1835.method809(arg1, false);
                this.method805((byte) 52);
                if (this.method801(-2)) {
                    if (this.field1833 != -1 && this.field1839 != -1) {
                        arg1.method2035((byte) -48, this.field1839, this.field1833);
                    }
                    arg1.field4711 = true;
                    return true;
                }
            }
            this.method807((byte) 125, arg1);
        }
        int var3 = 72 % ((arg0 - 8) / 54);
        return false;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Z", line = 67)
    private final boolean method801(int arg0) {
        field1836++;
        if (this.field1858) {
            if (this.field1853 != null) {
                this.field1853.method2112(-1);
                this.field1853 = null;
            }
            if (this.field1856 != null) {
                this.field1856.method2681(54);
                this.field1856 = null;
            }
            if (this.field1834 != null) {
                this.field1853 = new class347(this.field1838, 6402, this.field1833, this.field1839, this.field1838.field5222);
            }
            if (this.field1854) {
                this.field1856 = new class260(this.field1838, 34037, 6402, this.field1833, this.field1839);
            } else if (this.field1853 == null) {
                this.field1853 = new class347(this.field1838, 6402, this.field1833, this.field1839);
            }
            this.field1859 = true;
            this.field1850 = true;
            this.field1858 = false;
        }
        if (arg0 != -2) {
            this.method801(63);
        }
        if (this.field1860) {
            if (this.field1855 != null) {
                this.field1855.method2112(-1);
                this.field1855 = null;
            }
            if (this.field1852[0] != null) {
                this.field1852[0].method2681(51);
                this.field1852[0] = null;
            }
            if (this.field1852[1] != null) {
                this.field1852[1].method2681(107);
                this.field1852[1] = null;
            }
            if (this.field1834 != null) {
                this.field1855 = new class347(this.field1838, this.field1851, this.field1833, this.field1839, this.field1838.field5222);
            }
            this.field1852[0] = new class260(this.field1838, 34037, this.field1851, this.field1833, this.field1839);
            this.field1852[1] = this.field1857 > 1 ? new class260(this.field1838, 34037, this.field1851, this.field1833, this.field1839) : null;
            this.field1859 = true;
            this.field1860 = false;
            this.field1850 = true;
        }
        if (this.field1850) {
            if (this.field1834 == null) {
                this.field1838.method2137(this.field1829, arg0 ^ 0x1EE0);
                this.field1829.method451(70, 0);
                this.field1829.method451(59, 1);
                this.field1829.method451(arg0 ^ 0xFFFFFFBA, 8);
                this.field1829.method448(this.field1852[0], 0, (byte) -20);
                if (this.field1857 > 1) {
                    this.field1829.method448(this.field1852[1], 1, (byte) 106);
                }
                if (this.field1854) {
                    this.field1829.method448(this.field1856, 8, (byte) -58);
                } else {
                    this.field1829.method444(97, this.field1853, 8);
                }
                this.field1838.method2133(this.field1829, arg0 ^ 0x72);
            } else {
                this.field1838.method2137(this.field1829, arg0 ^ 0x1EE0);
                this.field1829.method451(92, 0);
                this.field1829.method451(28, 1);
                this.field1829.method451(103, 8);
                this.field1829.method448(this.field1852[0], 0, (byte) -35);
                if (this.field1857 > 1) {
                    this.field1829.method448(this.field1852[1], 1, (byte) 104);
                }
                if (this.field1854) {
                    this.field1829.method448(this.field1856, 8, (byte) -75);
                }
                this.field1838.method2133(this.field1829, -88);
                this.field1838.method2137(this.field1834, arg0 - 7904);
                this.field1834.method451(arg0 + 47, 0);
                this.field1834.method451(26, 8);
                this.field1834.method444(arg0 ^ 0xFFFFFFA1, this.field1855, 0);
                this.field1834.method444(73, this.field1853, 8);
                this.field1838.method2133(this.field1834, -125);
            }
            this.field1850 = false;
            this.field1859 = true;
        }
        if (this.field1859) {
            this.field1838.method2137(this.field1846, arg0 ^ 0x1EE0);
            this.field1859 = !this.field1846.method446(-128);
            this.field1838.method2133(this.field1846, arg0 ^ 0x79);
        }
        return !this.field1859;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V", line = 199)
    public final void method802(byte arg0) {
        this.field1852 = null;
        this.field1846 = this.field1834 = this.field1829 = null;
        this.field1853 = null;
        if (arg0 != -118) {
            field1848 = 87;
        }
        this.field1856 = null;
        this.field1855 = null;
        field1845++;
        if (!this.field1835.method823((byte) 120)) {
            for (class337 var2 = this.field1835.method816(103); var2 != this.field1835.field1879; var2 = var2.field4737) {
                ((class334) var2).method2034(arg0 + 16);
            }
        }
        this.field1833 = this.field1839 = 1;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lod;)V", line = 532)
    public class122(class349 arg0) {
        this.field1838 = arg0;
        if (this.field1838.field5318 && this.field1838.field5358) {
            this.field1846 = this.field1829 = new class77(this.field1838);
            if (this.field1838.field5222 > 1 && this.field1838.field5283 && this.field1838.field5366) {
                this.field1846 = this.field1834 = new class77(this.field1838);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)Z", line = 232)
    public final boolean method803(boolean arg0) {
        if (arg0) {
            field1842++;
            return this.field1846 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIII)Z", line = 244)
    public final boolean method804(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1844++;
        if (this.field1846 == null || this.field1835.method823((byte) 90)) {
            return false;
        }
        if (this.field1833 != arg4 || this.field1839 != arg2) {
            this.field1839 = arg2;
            this.field1833 = arg4;
            for (class337 var6 = this.field1835.method816(103); var6 != this.field1835.field1879; var6 = var6.field4737) {
                ((class334) var6).method2035((byte) 91, this.field1839, this.field1833);
            }
            this.field1860 = true;
            this.field1858 = true;
            this.field1850 = true;
        }
        if (arg1 != -28946) {
            this.method802((byte) -107);
        }
        if (!this.method801(-2)) {
            return false;
        }
        this.field1841 = true;
        this.field1843 = arg0;
        this.field1830 = arg3;
        this.field1838.method2137(this.field1846, -7906);
        this.field1846.method437(0, true);
        this.field1838.method2198((byte) 67, -this.field1830, this.field1839 - (this.field1846.method440(431) + this.field1843));
        return true;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)V", line = 298)
    private final void method805(byte arg0) {
        field1832++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class334 var5 = (class334) this.field1835.method816(102); var5 != null; var5 = (class334) this.field1835.method812(92)) {
            int var9 = var5.method2037(0);
            if (var3 < var9) {
                var3 = var9;
            }
            var4 += var5.method2039(-119);
            var2 |= var5.method2041(-1);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1851 != var6) {
            this.field1851 = var6;
            this.field1860 = true;
        }
        int var7 = this.field1857 > 2 ? 2 : this.field1857;
        int var8 = var4 > 2 ? 2 : var4;
        if (arg0 < 11) {
            return;
        }
        if (var2 != this.field1854) {
            this.field1858 = true;
            this.field1854 = var2;
        }
        if (var7 != var8) {
            this.field1850 = this.field1860 = true;
        }
        this.field1857 = var4;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V", line = 367)
    public final void method806(int arg0) {
        field1840++;
        if (!this.field1841) {
            return;
        }
        if (this.field1834 != null) {
            this.field1838.method2134(this.field1834, false);
            int var2 = 16384;
            this.field1838.method2169(this.field1829, (byte) -36);
            this.field1834.method445(arg0 ^ 0x7A, 0);
            this.field1829.method437(0, true);
            if (this.field1854) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field1833, this.field1839, 0, 0, this.field1833, this.field1839, var2, 9728);
            this.field1838.method2124(true, this.field1834);
            this.field1838.method2180(this.field1829, (byte) -107);
        }
        this.field1838.method2181((byte) -127);
        this.field1838.method2162(0, arg0);
        this.field1838.method2186(1, arg0 ^ 0x33);
        this.field1838.method1112();
        int var3 = 0;
        int var4 = arg0;
        class334 var6;
        for (class334 var5 = (class334) this.field1835.method816(122); var5 != null; var5 = var6) {
            var6 = (class334) this.field1835.method812(arg0 ^ 0x5B);
            int var7 = var5.method2039(arg0 + 38);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method2040(arg0 - 109, this.field1852[var3], var8, this.field1856);
                if (var6 == null && var7 - 1 == var8) {
                    this.field1838.method2133(this.field1829, -98);
                    this.field1838.method2198((byte) 115, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1839);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1830, this.field1843);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1830, this.field1843 + this.field1839);
                    OpenGL.glTexCoord2f((float) this.field1833, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1830 + this.field1833, this.field1843 + this.field1839);
                    OpenGL.glTexCoord2f((float) this.field1833, (float) this.field1839);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1830 + this.field1833, this.field1843);
                    OpenGL.glEnd();
                } else {
                    this.field1829.method437(var4, true);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1839);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field1839);
                    OpenGL.glTexCoord2f((float) this.field1833, (float) this.field1839);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1833, this.field1839);
                    OpenGL.glTexCoord2f((float) this.field1833, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1833, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method2030((byte) 116, var8);
            }
        }
        this.field1841 = false;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(BLbi;)V", line = 467)
    public final void method807(byte arg0, class334 arg1) {
        arg1.field4711 = false;
        field1831++;
        int var3 = 114 / ((arg0 - 68) / 56);
        arg1.method2034(-55);
        arg1.method2049(-82);
        this.method805((byte) 88);
    }
}
