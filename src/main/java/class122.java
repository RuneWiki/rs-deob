import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class122 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public int field1840 = -1;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[I")
    private int[] field1842 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Z")
    public boolean field1858 = false;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lma;")
    public static class5 field1839 = class12.method119("hitmarks", (byte) 116);

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1844 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lma;")
    public static class5 field1841 = class12.method119("leuchten3:", (byte) 78);

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lma;")
    public static class5 field1854 = class12.method119("::errortest", (byte) 97);

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
    private int[] field1849;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "[S")
    private short[] field1850;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[S")
    private short[] field1852;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "[S")
    private short[] field1856;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "[S")
    private short[] field1857;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILii;)V", line = 15)
    public final void method803(int arg0, class221 arg1) {
        field1845++;
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                if (arg0 < 118) {
                    field1844 = -128;
                }
                return;
            }
            this.method809(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Z", line = 41)
    public final boolean method804(int arg0) {
        field1843++;
        if (this.field1849 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1849.length; var3++) {
            if (!class78.field1215.method1331((byte) -124, this.field1849[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Z", line = 67)
    public final boolean method805(int arg0) {
        field1855++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field1842[var3] != -1 && !class78.field1215.method1331((byte) -121, this.field1842[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Lch;", line = 100)
    public final class183 method806(int arg0) {
        field1847++;
        class183[] var2 = new class183[5];
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field1842[var4] != -1) {
                var2[var3++] = class183.method1202(class78.field1215, this.field1842[var4], 0);
            }
        }
        class183 var5 = new class183(var2, var3);
        if (this.field1850 != null) {
            for (int var6 = 0; var6 < this.field1850.length; var6++) {
                var5.method1203(this.field1850[var6], this.field1852[var6]);
            }
        }
        if (this.field1857 != null) {
            for (int var7 = 0; var7 < this.field1857.length; var7++) {
                var5.method1195(this.field1857[var7], this.field1856[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)I", line = 159)
    public static final int method807(int arg0) {
        if (arg0 > -113) {
            method810(-96, -89, 15, -37L);
        }
        field1846++;
        return 6;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V", line = 171)
    public static void method808(int arg0) {
        field1841 = null;
        field1854 = null;
        if (arg0 >= -42) {
            method808(-128);
        }
        field1839 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lii;ZI)V", line = 189)
    private final void method809(class221 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method808(114);
        }
        field1853++;
        if (arg2 == 1) {
            this.field1840 = arg0.method1509(true);
        } else if (arg2 == 2) {
            int var8 = arg0.method1509(true);
            this.field1849 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1849[var9] = arg0.method1524((byte) 65);
            }
        } else if (arg2 == 3) {
            this.field1858 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method1509(true);
            this.field1850 = new short[var4];
            this.field1852 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1850[var5] = (short) arg0.method1524((byte) 93);
                this.field1852[var5] = (short) arg0.method1524((byte) 69);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1509(arg1);
            this.field1857 = new short[var6];
            this.field1856 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1857[var7] = (short) arg0.method1524((byte) 79);
                this.field1856[var7] = (short) arg0.method1524((byte) 68);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1842[arg2 - 60] = arg0.method1524((byte) 62);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIJ)Z", line = 270)
    public static final boolean method810(int arg0, int arg1, int arg2, long arg3) {
        class198 var5 = class43.field646[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3149 != null && var5.field3149.field1335 == arg3) {
            return true;
        } else if (var5.field3144 != null && var5.field3144.field1980 == arg3) {
            return true;
        } else if (var5.field3158 != null && var5.field3158.field813 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3162; var6++) {
                if (var5.field3166[var6].field1590 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)Lch;", line = 298)
    public final class183 method811(int arg0) {
        field1848++;
        if (this.field1849 == null) {
            return null;
        }
        class183[] var2 = new class183[this.field1849.length];
        if (arg0 != 13016) {
            return (class183) null;
        }
        for (int var3 = 0; var3 < this.field1849.length; var3++) {
            var2[var3] = class183.method1202(class78.field1215, this.field1849[var3], 0);
        }
        class183 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class183(var2, var2.length);
        }
        if (this.field1850 != null) {
            for (int var5 = 0; var5 < this.field1850.length; var5++) {
                var4.method1203(this.field1850[var5], this.field1852[var5]);
            }
        }
        if (this.field1857 != null) {
            for (int var6 = 0; var6 < this.field1857.length; var6++) {
                var4.method1195(this.field1857[var6], this.field1856[var6]);
            }
        }
        return var4;
    }
}
