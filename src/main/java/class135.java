import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class135 extends class26 {

    @OriginalMember(owner = "client!io", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1837 = "slide:";

    @OriginalMember(owner = "client!io", name = "B", descriptor = "Lcc;")
    public static class327 field1842 = new class327(64);

    @OriginalMember(owner = "client!io", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1848 = "slide:";

    @OriginalMember(owner = "client!io", name = "G", descriptor = "[Z")
    public static boolean[] field1847 = new boolean[8];

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "Lfh;")
    public static class140 field1844;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "Lwf;")
    public class333 field1829;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "Lwf;")
    public class333 field1831;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "Ljava/lang/String;")
    public String field1838;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "Z")
    public boolean field1835;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field1836;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1023(boolean arg0) {
        field1832++;
        Container var1;
        if (class117.field1519 != null) {
            var1 = class117.field1519;
        } else if (class288.field4173 == null) {
            var1 = class157.field2216.field883;
        } else {
            var1 = class288.field4173;
        }
        class95.field1246 = var1.getSize().width;
        class125.field1665 = var1.getSize().height;
        if (class288.field4173 == var1) {
            Insets var2 = class288.field4173.getInsets();
            class95.field1246 -= var2.left + var2.right;
            class125.field1665 -= var2.top + var2.bottom;
        }
        if (class33.method213(26) >= 2) {
            class66.field834 = 0;
            class163.field2314 = class95.field1246;
            class242.field3508 = 0;
            class192.field2660 = class125.field1665;
        } else {
            class163.field2314 = 765;
            class192.field2660 = 503;
            class242.field3508 = (class95.field1246 - 765) / 2;
            class66.field834 = 0;
        }
        if (arg0) {
            field1848 = (String) null;
        }
        if (class47.field623) {
            class47.method344(class163.field2314, class192.field2660);
        }
        class26.field307.setSize(class163.field2314, class192.field2660);
        if (class288.field4173 == var1) {
            Insets var3 = class288.field4173.getInsets();
            class26.field307.setLocation(var3.left + class242.field3508, class66.field834 + var3.top);
        } else {
            class26.field307.setLocation(class242.field3508, class66.field834);
        }
        if (class233.field3340 != -1) {
            class313.method2169((byte) 122, true);
        }
        class186.method1349(-30965);
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V", line = 70)
    public static void method1024(byte arg0) {
        field1847 = null;
        if (arg0 >= -106) {
            field1846 = -128;
        }
        field1842 = null;
        field1837 = null;
        field1844 = null;
        field1848 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lvc;IIIII)V", line = 85)
    public static final void method1025(class260 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class23.field258 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class66.field847) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class300.field4413 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class119 var14 = class345.field5367[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class74.field978[var11][var12 + 1][var13] + class74.field978[var11][var12][var13] + class74.field978[var11][var12][var13 + 1] + class74.field978[var11][var12 + 1][var13 + 1]) / 4 - (class74.field978[arg1][arg2 + 1][arg3] + class74.field978[arg1][arg2][arg3] + class74.field978[arg1][arg2][arg3 + 1] + class74.field978[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class231 var16 = var14.field1552;
                                    if (var16 != null) {
                                        if (var16.field3309.method950()) {
                                            arg0.method962(var16.field3309, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3305 != null && var16.field3305.method950()) {
                                            arg0.method962(var16.field3305, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1563; var17++) {
                                        class294 var18 = var14.field1549[var17];
                                        if (var18 != null && var18.field4275.method950() && (var18.field4283 == var12 || var7 == var12) && (var18.field4287 == var13 || var9 == var13)) {
                                            int var19 = var18.field4285 + 1 - var18.field4283;
                                            int var20 = var18.field4276 + 1 - var18.field4287;
                                            arg0.method962(var18.field4275, (var18.field4283 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4287 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZI)I", line = 186)
    public static final int method1026(int arg0, int arg1, boolean arg2, int arg3) {
        field1840++;
        if (arg0 == arg1) {
            return arg0;
        }
        if (arg2) {
            field1844 = (class140) null;
        }
        int var4 = 128 - arg3;
        int var5 = ((arg0 & 0xFF00FF00) >>> 7) * var4 + ((arg1 & 0xFF00FF00) >>> 7) * arg3 & 0xFF00FF00;
        int var6 = (arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg3 & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BII)I", line = 213)
    public static final int method1027(byte arg0, int arg1, int arg2) {
        int var3 = class32.method202(arg2 - 1, 25528, arg1 - 1) + (class32.method202(arg2 + 1, 25528, arg1 - 1) + class32.method202(arg2 - 1, 25528, arg1 + 1) + class32.method202(arg2 + 1, 25528, arg1 + 1));
        if (arg0 >= -48) {
            return 6;
        } else {
            int var4 = class32.method202(arg2 - 1, 25528, arg1) - (-class32.method202(arg2 + 1, 25528, arg1) - class32.method202(arg2, 25528, arg1 - 1) - class32.method202(arg2, 25528, arg1 + 1));
            field1834++;
            int var5 = class32.method202(arg2, 25528, arg1);
            return var5 / 4 + var3 / 16 + var4 / 8;
        }
    }
}
