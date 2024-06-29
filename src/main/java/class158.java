import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class158 {

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lp;")
    private class161 field1845 = new class161();

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    private int field1857;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    private int field1850;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Ltm;")
    private class349 field1851;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    public static int[] field1842 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field1849 = -1;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Z")
    public static boolean field1840 = true;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[[I")
    public static int[][] field1848 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
    public static int[] field1847 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1006(boolean arg0) {
        field1854++;
        if (!arg0) {
            method1011(-17);
        }
        class219.field2708.method2290(13831);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V", line = 15)
    public final void method1007(int arg0, byte arg1) {
        if (arg1 != -77) {
            this.field1850 = -112;
        }
        if (class364.field4952 != null) {
            for (class41 var3 = (class41) this.field1845.method1027(-20578); var3 != null; var3 = (class41) this.field1845.method1023(87)) {
                if (var3.method118(29257)) {
                    if (var3.method121(95) == null) {
                        var3.method263(false);
                        var3.method1123((byte) -31);
                        this.field1850++;
                    }
                } else if ((++var3.field2090) > ((long) arg0)) {
                    class41 var4 = class364.field4952.method805(-7992, var3);
                    this.field1851.method2227(var4, arg1 - 8141, var3.field505);
                    class300.method1905(27417, var3, var4);
                    var3.method263(false);
                    var3.method1123((byte) -31);
                }
            }
        }
        field1846++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 62)
    public final void method1008(int arg0) {
        field1843++;
        if (arg0 != 7) {
            field1848 = null;
        }
        this.field1845.method1021(arg0 + 20784);
        this.field1851.method2216((byte) 60);
        this.field1850 = this.field1857;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/Object;Luk;B)V", line = 77)
    public final void method1009(Object arg0, class309 arg1, byte arg2) {
        this.method1013(93, arg1);
        field1858++;
        if (this.field1850 == 0) {
            class41 var4 = (class41) this.field1845.method1024(256);
            var4.method263(false);
            var4.method1123((byte) -31);
        } else {
            this.field1850--;
        }
        class20 var5 = new class20(arg1, arg0);
        this.field1851.method2227(var5, -8218, arg1.method1029(true));
        this.field1845.method1028((byte) 33, var5);
        if (arg2 > -57) {
            method1006(false);
        }
        var5.field2090 = 0L;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLuk;)Ljava/lang/Object;", line = 106)
    public final Object method1010(byte arg0, class309 arg1) {
        field1852++;
        long var3 = arg1.method1029(true);
        class41 var5 = (class41) this.field1851.method2218(1, var3);
        int var6 = -92 % ((arg0 - 30) / 38);
        while (var5 != null) {
            if (var5.field490.method1030(125, arg1)) {
                Object var7 = var5.method121(109);
                if (var7 != null) {
                    if (var5.method118(29257)) {
                        class20 var8 = new class20(arg1, var7);
                        this.field1851.method2227(var8, -8218, var5.field505);
                        this.field1845.method1028((byte) 33, var8);
                        var8.field2090 = 0L;
                        var5.method263(false);
                        var5.method1123((byte) -31);
                    } else {
                        this.field1845.method1028((byte) 33, var5);
                        var5.field2090 = 0L;
                    }
                    return var7;
                }
                var5.method263(false);
                var5.method1123((byte) -31);
                this.field1850++;
            }
            var5 = (class41) this.field1851.method2221(34);
        }
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 159)
    public static void method1011(int arg0) {
        field1842 = null;
        if (arg0 != 4) {
            field1848 = null;
        }
        field1848 = null;
        field1847 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I", line = 185)
    public final int method1012(byte arg0) {
        if (arg0 == 87) {
            field1855++;
            return this.field1850;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILuk;)V", line = 196)
    private final void method1013(int arg0, class309 arg1) {
        field1853++;
        int var3 = 41 % ((-arg0 - 23) / 52);
        long var4 = arg1.method1029(true);
        for (class41 var6 = (class41) this.field1851.method2218(1, var4); var6 != null; var6 = (class41) this.field1851.method2221(-91)) {
            if (var6.field490.method1030(125, arg1)) {
                var6.method263(false);
                var6.method1123((byte) -31);
                this.field1850++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Lqc;", line = 229)
    public static final class226 method1014(int arg0, int arg1, int arg2) {
        class316 var3 = class347.field4722[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4269;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)I", line = 243)
    public final int method1015(int arg0) {
        field1841++;
        if (arg0 > -40) {
            this.method1008(33);
        }
        return this.field1857;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 264)
    public final void method1016(byte arg0) {
        field1856++;
        for (class41 var2 = (class41) this.field1845.method1027(-20578); var2 != null; var2 = (class41) this.field1845.method1023(arg0 ^ 0x4E)) {
            if (var2.method118(29257)) {
                var2.method263(false);
                var2.method1123((byte) -31);
                this.field1850++;
            }
        }
        if (arg0 != -45) {
            this.field1857 = -42;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V", line = 291)
    public class158(int arg0) {
        this.field1857 = arg0;
        this.field1850 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1851 = new class349(var2);
    }
}
