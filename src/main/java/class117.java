import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class117 extends class136 {

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "Li;")
    private static class88 field2114 = class208.method1425(105, " has logged out)3");

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field2115 = 0;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Li;")
    public static class88 field2116 = class208.method1425(105, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "Li;")
    private static class88 field2122 = class208.method1425(105, "Sorry invited players only)3");

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "Li;")
    public static class88 field2125 = field2114;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "Li;")
    public static class88 field2113 = field2122;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field2129 = 0;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "Lqe;")
    public static class179 field2126;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "Li;")
    public class88 field2130;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "[I")
    public int[] field2118;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "[I")
    public int[] field2121;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "[I")
    public int[] field2123;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "[I")
    public int[] field2132;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "[S")
    public static short[] field2110;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "[[[B")
    public static byte[][][] field2128;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)I")
    public static final int method793(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)I")
    public final int method794(int arg0, int arg1) {
        field2111++;
        if (this.field2123 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 <= 78) {
            return 106;
        }
        while (this.field2123.length > var3) {
            if (this.field2132[var3] == arg1) {
                return this.field2123[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILea;B)V")
    private final void method795(int arg0, class46 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field2130 = arg1.method298(-125);
        } else if (arg0 == 2) {
            int var4 = arg1.method347(26119);
            this.field2121 = new int[var4];
            this.field2118 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2118[var5] = arg1.method301(56);
                int var6 = arg1.method347(26119);
                if (var6 == 0) {
                    this.field2121[var5] = -1;
                } else {
                    this.field2121[var5] = var6;
                }
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method347(26119);
            this.field2132 = new int[var7];
            this.field2123 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2123[var8] = arg1.method301(106);
                int var9 = arg1.method347(26119);
                if (var9 == 0) {
                    this.field2132[var8] = -1;
                } else {
                    this.field2132[var8] = var9;
                }
            }
        }
        if (arg2 > -103) {
            method797(-85, 125);
        }
        field2112++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLea;)V")
    public final void method796(byte arg0, class46 arg1) {
        field2117++;
        if (arg0 != -45) {
            method800(false);
        }
        while (true) {
            int var3 = arg1.method347(26119);
            if (var3 == 0) {
                return;
            }
            this.method795(var3, arg1, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(II)V")
    public static final void method797(int arg0, int arg1) {
        class242.field4482 = -1;
        class11.field159 = 0;
        class172.field3345 = arg1;
        class158.field3041 = null;
        field2124++;
        class17.field277 = false;
        class122.field2232 = 1;
        class228.field4270 = -1;
        if (arg0 != 25335) {
            field2113 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(II)I")
    public final int method798(int arg0, int arg1) {
        field2127++;
        if (this.field2118 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2118.length; var3++) {
            if (this.field2121[var3] == arg0) {
                return this.field2118[var3];
            }
        }
        if (arg1 != 20552) {
            method797(-107, 47);
        }
        return -1;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)V")
    public final void method799(boolean arg0) {
        field2131++;
        if (this.field2123 != null) {
            for (int var2 = 0; var2 < this.field2123.length; var2++) {
                this.field2123[var2] = class204.method1405(this.field2123[var2], 32768);
            }
        }
        if (!arg0) {
            field2110 = null;
        }
        if (this.field2118 != null) {
            for (int var3 = 0; var3 < this.field2118.length; var3++) {
                this.field2118[var3] = class204.method1405(this.field2118[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)V")
    public static void method800(boolean arg0) {
        field2114 = null;
        field2116 = null;
        field2126 = null;
        if (!arg0) {
            field2114 = null;
        }
        field2125 = null;
        field2122 = null;
        field2128 = null;
        field2110 = null;
        field2113 = null;
    }
}
