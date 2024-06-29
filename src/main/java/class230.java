import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class230 extends class297 {

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public int field3814;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "[I")
    public static int[] field3817 = new int[256];

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "Lma;")
    public static class5 field3816 = class12.method119("scape main", (byte) 80);

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "Lma;")
    public static class5 field3827;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "Lma;")
    public static class5 field3824;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Lhf;")
    public static class154 field3813;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "[[[B")
    public static byte[][][] field3825;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILni;I)[Lrj;", line = 13)
    public static final class237[] method1636(int arg0, int arg1, class202 arg2, int arg3) {
        field3811++;
        if (class180.method1171(arg0, arg1, arg2, (byte) -128)) {
            return arg3 == 256 ? class255.method1781(81) : (class237[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Lma;", line = 28)
    public static final class5 method1637(int arg0, int arg1) {
        field3810++;
        if (arg0 != -9) {
            field3824 = (class5) null;
        }
        class5 var2 = new class5();
        var2.field72 = 0;
        var2.field57 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V", line = 47)
    public static void method1638(boolean arg0) {
        field3817 = null;
        field3827 = null;
        field3825 = (byte[][][]) null;
        field3813 = null;
        field3824 = null;
        if (!arg0) {
            field3816 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3817[var0] = var1;
        }
        field3826 = 0;
        field3827 = class12.method119("<col=ffff00>", (byte) 76);
        field3824 = class12.method119("Texturen geladen)3", (byte) 90);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)Z", line = 66)
    public final boolean method1639(int arg0, int arg1, int arg2) {
        if (arg2 == 128) {
            field3818++;
            return this.field3814 <= arg0 && arg0 <= this.field3809 && this.field3815 <= arg1 && this.field3820 >= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(BI)V", line = 86)
    public static final void method1640(byte arg0, int arg1) {
        if (arg0 >= -40) {
            method1640((byte) -102, -96);
        }
        field3821++;
        class284.field4811 = arg1;
        class171.field2634 = -1;
        class153.field2240 = -1;
        class113.method747((byte) -115);
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)Lrj;", line = 106)
    public static final class237 method1641(int arg0) {
        if (arg0 != 255) {
            method1637(-124, -8);
        }
        int var1 = class179.field2718[0] * class112.field1665[0];
        field3812++;
        byte[] var2 = class37.field590[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class268.field4610[class204.method1354(var2[var4], 255)];
        }
        class109 var5 = new class109(class282.field4786, class281.field4765, class88.field1315[0], class287.field4836[0], class112.field1665[0], class179.field2718[0], var3);
        class207.method1365(9);
        return var5;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILci;ILec;IIILwi;)V", line = 136)
    public static final void method1642(int arg0, class177 arg1, int arg2, class91 arg3, int arg4, int arg5, int arg6, class185 arg7) {
        field3819++;
        class150 var8 = new class150();
        if (arg4 != 0) {
            field3827 = (class5) null;
        }
        var8.field2177 = arg6 * 128;
        var8.field2170 = arg2;
        var8.field2171 = arg0 * 128;
        if (arg7 != null) {
            var8.field2173 = arg7.field2870;
            var8.field2168 = arg7.field2908 * 128;
            var8.field2158 = arg7;
            int var10 = arg7.field2840;
            var8.field2172 = arg7.field2882;
            var8.field2179 = arg7.field2881;
            int var11 = arg7.field2859;
            var8.field2182 = arg7.field2838;
            if (arg5 == 1 || arg5 == 3) {
                var11 = arg7.field2840;
                var10 = arg7.field2859;
            }
            var8.field2169 = (arg0 + var11) * 128;
            var8.field2157 = (arg6 + var10) * 128;
            if (arg7.field2843 != null) {
                var8.field2161 = true;
                var8.method942(-9430);
            }
            if (var8.field2172 != null) {
                var8.field2166 = (int) ((double) (var8.field2182 - var8.field2179) * Math.random()) + var8.field2179;
            }
            class274.field4660.method1485(-8564, var8);
        } else if (arg1 != null) {
            var8.field2154 = arg1;
            class288 var9 = arg1.field2699;
            if (var9.field4891 != null) {
                var8.field2161 = true;
                var9 = var9.method1938((byte) 34);
            }
            if (var9 != null) {
                var8.field2169 = (var9.field4905 + arg0) * 128;
                var8.field2157 = (var9.field4905 + arg6) * 128;
                var8.field2173 = class90.method590(arg1, -20990);
                var8.field2168 = var9.field4868 * 128;
            }
            class239.field3953.method1485(-8564, var8);
        } else if (arg3 != null) {
            var8.field2169 = (arg3.field226 + arg0) * 128;
            var8.field2153 = arg3;
            var8.field2157 = (arg6 + arg3.field226) * 128;
            var8.field2173 = class170.method1131(arg3, -4);
            var8.field2168 = arg3.field1362 * 128;
            class86.field1298.method1376(arg3.field1367.method69(-49), -1, var8);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V", line = 223)
    public static final void method1643(int arg0, int arg1) {
        if (arg0 != 7765) {
            field3816 = (class5) null;
        }
        field3822++;
        class206.field3277.method517(false, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIII)V", line = 239)
    public class230(int arg0, int arg1, int arg2, int arg3) {
        this.field3815 = arg1;
        this.field3809 = arg2;
        this.field3814 = arg0;
        this.field3820 = arg3;
    }
}
