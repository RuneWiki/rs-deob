import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class111 extends class62 {

    @OriginalMember(owner = "client!w", name = "F", descriptor = "[Lwc;")
    public class27[] field1858 = new class27[5];

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "[I")
    public int[] field1877 = new int[5];

    @OriginalMember(owner = "client!w", name = "db", descriptor = "I")
    public int field1881 = 0;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public int field1867;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public int field1871;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Leg;")
    public static class37 field1850 = class174.method1167("M-Bmoire attribu-Be", 108);

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Leg;")
    public static class37 field1849 = class174.method1167(":chalreq:", 100);

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Leg;")
    private static class37 field1852 = class174.method1167("slide:", -76);

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Leg;")
    public static class37 field1856 = class174.method1167("rect_debug=", -46);

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Leg;")
    public static class37 field1855 = field1852;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Leg;")
    public static class37 field1851 = field1852;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "B")
    public byte field1863;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field1857;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "I")
    public int field1880;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "Lw;")
    public class111 field1869;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Laj;")
    public class116 field1860;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Lli;")
    public class164 field1865;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Lia;")
    public class228 field1862;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "Lwa;")
    public class239 field1876;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "Loa;")
    public class273 field1875;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "Lvb;")
    public class68 field1870;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "Lp;")
    public class79 field1868;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
    public boolean field1866;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "Z")
    public boolean field1873;

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "Z")
    public boolean field1879;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[I")
    public static int[] field1854;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static void method777(int arg0) {
        field1854 = null;
        field1852 = null;
        field1855 = null;
        field1849 = null;
        field1851 = null;
        field1850 = null;
        if (arg0 != -11940) {
            method778(-21, 105, 15, -30, -25, 64, -83);
        }
        field1856 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
    public static final void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1864++;
        if (arg0 != 128) {
            method777(124);
        }
        int var7 = class139.method975(class286.field5050, true, arg5, class96.field1507);
        int var8 = class139.method975(class286.field5050, true, arg6, class96.field1507);
        int var9 = class139.method975(class178.field2972, true, arg3, class217.field3741);
        int var10 = class139.method975(class178.field2972, true, arg1, class217.field3741);
        int var11 = class139.method975(class286.field5050, true, arg4 + arg5, class96.field1507);
        int var12 = class139.method975(class286.field5050, true, arg6 - arg4, class96.field1507);
        for (int var13 = var7; var13 < var11; var13++) {
            class145.method1010(var10, var9, -25086, arg2, class210.field3617[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class145.method1010(var10, var9, arg0 ^ 0xFFFF9E82, arg2, class210.field3617[var14]);
        }
        int var15 = class139.method975(class178.field2972, true, arg3 + arg4, class217.field3741);
        int var16 = class139.method975(class178.field2972, true, arg1 - arg4, class217.field3741);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class210.field3617[var17];
            class145.method1010(var15, var9, arg0 - 25214, arg2, var18);
            class145.method1010(var10, var16, -25086, arg2, var18);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIIII)V")
    public static final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class256 var7 = new class256();
        var7.field4534 = arg1 / 128;
        var7.field4552 = arg2 / 128;
        var7.field4531 = arg3 / 128;
        var7.field4546 = arg4 / 128;
        var7.field4549 = arg0;
        var7.field4539 = arg1;
        var7.field4540 = arg2;
        var7.field4550 = arg3;
        var7.field4542 = arg4;
        var7.field4553 = arg5;
        var7.field4538 = arg6;
        class66.field1054[class152.field2561++] = var7;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(III)V")
    public class111(int arg0, int arg1, int arg2) {
        this.field1859 = arg2;
        this.field1871 = this.field1867 = arg0;
        this.field1878 = arg1;
    }
}
