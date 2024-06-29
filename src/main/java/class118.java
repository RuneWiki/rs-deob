import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class118 {

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    private int field1978 = -1;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    private int field1977 = 0;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Lud;")
    private class52 field1972 = new class52();

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "Z")
    public boolean field1984 = false;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    private int field1974;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "[[I")
    private int[][] field1967;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    private int field1968;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "[Lmj;")
    private class150[] field1971;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field1964 = 2;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "[I")
    public static int[] field1966 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[S")
    public static short[] field1973 = new short[256];

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field1982 = 0;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Lmh;")
    public static class62 field1981 = class201.method1405(true, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "F")
    public static float field1965;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ltd;B)V", line = 21)
    public static final void method917(class222 arg0, byte arg1) {
        arg0.field3839 = false;
        field1976++;
        if (arg0.field3876 != -1) {
            class96 var2 = class151.method1085(arg0.field3876, (byte) 106);
            if (var2 == null || var2.field1586 == null) {
                arg0.field3876 = -1;
            } else {
                arg0.field3830++;
                if (var2.field1586.length > arg0.field3838 && arg0.field3830 > var2.field1555[arg0.field3838]) {
                    arg0.field3838++;
                    arg0.field3830 = 1;
                    class113.method881(var2, arg0.field3821, arg0.field3814, class268.field4551 == arg0, (byte) -78, arg0.field3838);
                }
                if (var2.field1586.length <= arg0.field3838) {
                    arg0.field3830 = 0;
                    arg0.field3838 = 0;
                    class113.method881(var2, arg0.field3821, arg0.field3814, class268.field4551 == arg0, (byte) -101, arg0.field3838);
                }
            }
        }
        if (arg1 >= -5) {
            method922(124, 57, -39, 79, true, 115, -87, 5);
        }
        if (arg0.field3847 != -1 && arg0.field3871 <= class199.field3367) {
            int var3 = class115.method895(63, arg0.field3847).field4611;
            if (var3 == -1) {
                arg0.field3847 = -1;
            } else {
                class96 var4 = class151.method1085(var3, (byte) 100);
                if (var4 == null || var4.field1586 == null) {
                    arg0.field3847 = -1;
                } else {
                    if (arg0.field3813 < 0) {
                        arg0.field3813 = 0;
                        class113.method881(var4, arg0.field3821, arg0.field3814, class268.field4551 == arg0, (byte) -96, 0);
                    }
                    arg0.field3851++;
                    if (arg0.field3813 < var4.field1586.length && arg0.field3851 > var4.field1555[arg0.field3813]) {
                        arg0.field3851 = 1;
                        arg0.field3813++;
                        class113.method881(var4, arg0.field3821, arg0.field3814, class268.field4551 == arg0, (byte) -65, arg0.field3813);
                    }
                    if (arg0.field3813 >= var4.field1586.length) {
                        arg0.field3847 = -1;
                    }
                }
            }
        }
        if (arg0.field3836 != -1 && arg0.field3843 <= 1) {
            class96 var5 = class151.method1085(arg0.field3836, (byte) 110);
            if (var5.field1582 == 1 && arg0.field3824 > 0 && arg0.field3852 <= class199.field3367 && arg0.field3837 < class199.field3367) {
                arg0.field3843 = 1;
                return;
            }
        }
        if (arg0.field3836 != -1 && arg0.field3843 == 0) {
            class96 var6 = class151.method1085(arg0.field3836, (byte) 126);
            if (var6 == null || var6.field1586 == null) {
                arg0.field3836 = -1;
            } else {
                arg0.field3849++;
                if (var6.field1586.length > arg0.field3872 && var6.field1555[arg0.field3872] < arg0.field3849) {
                    arg0.field3872++;
                    arg0.field3849 = 1;
                    class113.method881(var6, arg0.field3821, arg0.field3814, class268.field4551 == arg0, (byte) -122, arg0.field3872);
                }
                if (var6.field1586.length <= arg0.field3872) {
                    arg0.field3872 -= var6.field1568;
                    arg0.field3826++;
                    if (arg0.field3826 >= var6.field1589) {
                        arg0.field3836 = -1;
                    } else if (arg0.field3872 >= 0 && var6.field1586.length > arg0.field3872) {
                        class113.method881(var6, arg0.field3821, arg0.field3814, class268.field4551 == arg0, (byte) -38, arg0.field3872);
                    } else {
                        arg0.field3836 = -1;
                    }
                }
                arg0.field3839 = var6.field1573;
            }
        }
        if (arg0.field3843 > 0) {
            arg0.field3843--;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 159)
    public final void method918(byte arg0) {
        field1970++;
        for (int var2 = 0; var2 < this.field1974; var2++) {
            this.field1967[var2] = null;
        }
        this.field1967 = (int[][]) null;
        this.field1971 = null;
        this.field1972.method328(false);
        this.field1972 = null;
        if (arg0 != 31) {
            field1973 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[I", line = 182)
    public final int[] method919(int arg0, int arg1) {
        if (arg1 != 26072) {
            return (int[]) null;
        }
        field1963++;
        if (this.field1974 == this.field1968) {
            this.field1984 = this.field1971[arg0] == null;
            this.field1971[arg0] = class292.field4972;
            return this.field1967[arg0];
        } else if (this.field1974 == 1) {
            this.field1984 = this.field1978 != arg0;
            this.field1978 = arg0;
            return this.field1967[0];
        } else {
            class150 var3 = this.field1971[arg0];
            if (var3 == null) {
                this.field1984 = true;
                if (this.field1974 <= this.field1977) {
                    class150 var4 = (class150) this.field1972.method337(-123);
                    var3 = new class150(arg0, var4.field2363);
                    this.field1971[var4.field2369] = null;
                    var4.method1444((byte) 89);
                } else {
                    var3 = new class150(arg0, this.field1977);
                    this.field1977++;
                }
                this.field1971[arg0] = var3;
            } else {
                this.field1984 = false;
            }
            this.field1972.method338(var3, -1);
            return this.field1967[var3.field2363];
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)[[I", line = 257)
    public final int[][] method920(int arg0) {
        field1969++;
        if (this.field1974 != this.field1968) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 >= -80) {
            return (int[][]) ((int[][]) null);
        } else {
            for (int var2 = 0; var2 < this.field1974; var2++) {
                this.field1971[var2] = class292.field4972;
            }
            return this.field1967;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)V", line = 281)
    public static final void method921(boolean arg0, int arg1) {
        if (!arg0) {
            field1965 = -0.4353916F;
        }
        class271.field4603 = 1000 / arg1;
        field1962++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIZIII)V", line = 298)
    public static final void method922(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1979++;
        if (arg3 == arg7) {
            class289.method1973(arg3, arg6, arg2, (byte) 108, arg1, arg5, arg0);
            return;
        }
        if (!arg4) {
            field1964 = 8;
        }
        if (arg6 - arg3 >= class176.field2819 && arg3 + arg6 <= class52.field755 && class99.field1630 <= arg5 - arg7 && arg5 + arg7 <= class81.field1348) {
            class182.method1283(-1, arg7, arg5, arg2, arg6, arg0, arg1, arg3);
        } else {
            class174.method1238(arg6, arg0, arg5, (byte) -84, arg7, arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(III)V", line = 369)
    public class118(int arg0, int arg1, int arg2) {
        this.field1974 = arg0;
        this.field1967 = new int[this.field1974][arg2];
        this.field1968 = arg1;
        this.field1971 = new class150[this.field1968];
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 330)
    public static void method923(int arg0) {
        field1966 = null;
        field1981 = null;
        if (arg0 > 97) {
            field1973 = null;
        }
    }
}
