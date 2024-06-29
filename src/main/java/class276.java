import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class276 {

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "Lhh;")
    private class177 field4876 = new class177();

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    private int field4875;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    private int field4874;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lak;")
    private class269 field4871;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "[I")
    public static int[] field4869 = new int[1000];

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Lvf;")
    public static class265 field4872 = class87.method582(-46, ")2");

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lvf;")
    public static class265 field4867 = class87.method582(-46, "null");

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "J")
    public static long field4873;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lfl;")
    public static class192 field4868;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "[I")
    public static int[] field4879;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method1884(int arg0) {
        field4872 = null;
        field4867 = null;
        field4869 = null;
        field4868 = null;
        field4879 = null;
        if (arg0 <= 68) {
            method1885(68, 125, -10, -82, 18);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public static final void method1885(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4878++;
        class256 var5 = (class256) class4.field52.method1842(arg1 ^ 0x3400, (long) arg0);
        if (var5 == null) {
            var5 = new class256();
            class4.field52.method1838((long) arg0, var5, (byte) 8);
        }
        if (arg3 >= var5.field4378.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field4378.length; var8++) {
                var6[var8] = var5.field4378[var8];
                var7[var8] = var5.field4382[var8];
            }
            for (int var9 = var5.field4378.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4378 = var6;
            var5.field4382 = var7;
        }
        var5.field4378[arg3] = arg4;
        var5.field4382[arg3] = arg2;
        if (arg1 != -13313) {
            method1885(64, 86, -95, -6, -3);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static final void method1886(int arg0) {
        field4864++;
        for (class106 var1 = (class106) class204.field3650.method789((byte) -83); var1 != null; var1 = (class106) class204.field3650.method787((byte) -76)) {
            class205 var2 = var1.field1876;
            if (class216.field3902 != var2.field3670 || var2.field3664 < class93.field1655) {
                var1.method97(158);
            } else if (class93.field1655 >= var2.field3695) {
                if (var2.field3673 > 0) {
                    class23 var3 = class4.field67[var2.field3673 - 1];
                    if (var3 != null && var3.field2600 >= 0 && var3.field2600 < 13312 && var3.field2564 >= 0 && var3.field2564 < 13312) {
                        var2.method1406(class67.method483(var3.field2564, -124, var3.field2600, var2.field3670) - var2.field3667, class93.field1655, var3.field2564, -124, var3.field2600);
                    }
                }
                if (var2.field3673 < 0) {
                    int var4 = -var2.field3673 - 1;
                    class122 var5;
                    if (class45.field1012 == var4) {
                        var5 = class214.field3827;
                    } else {
                        var5 = class209.field3766[var4];
                    }
                    if (var5 != null && var5.field2600 >= 0 && var5.field2600 < 13312 && var5.field2564 >= 0 && var5.field2564 < 13312) {
                        var2.method1406(class67.method483(var5.field2564, -124, var5.field2600, var2.field3670) - var2.field3667, class93.field1655, var5.field2564, -124, var5.field2600);
                    }
                }
                var2.method1408(class84.field1572, (byte) 48);
                class78.method543(class216.field3902, (int) var2.field3677, (int) var2.field3683, (int) var2.field3665, 60, var2, var2.field3666, -1L, false);
            }
        }
        if (arg0 <= 55) {
            method1884(99);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method1887(int arg0, long arg1) {
        if (arg0 < 106) {
            return null;
        }
        class126 var4 = (class126) this.field4871.method1842(-1, arg1);
        field4870++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method341(false);
        if (var5 == null) {
            var4.method97(158);
            var4.method238((byte) 115);
            this.field4874++;
            return null;
        }
        if (var4.method337(710)) {
            class40 var6 = new class40(var5);
            this.field4871.method1838(var4.field393, var6, (byte) 8);
            this.field4876.method1154(var6, -31849);
            var6.field727 = 0L;
            var4.method97(158);
            var4.method238((byte) 59);
        } else {
            this.field4876.method1154(var4, -31849);
            var4.field727 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public final void method1888(byte arg0) {
        for (class126 var2 = (class126) this.field4876.method1148(10); var2 != null; var2 = (class126) this.field4876.method1153(100)) {
            if (var2.method337(710)) {
                var2.method97(158);
                var2.method238((byte) 40);
                this.field4874++;
            }
        }
        if (arg0 <= 94) {
            method1884(-118);
        }
        field4862++;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)I")
    public final int method1889(byte arg0) {
        int var2 = 0;
        for (class126 var3 = (class126) this.field4876.method1148(-124); var3 != null; var3 = (class126) this.field4876.method1153(100)) {
            if (!var3.method337(710)) {
                var2++;
            }
        }
        if (arg0 < 79) {
            field4872 = null;
        }
        field4863++;
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(JB)V")
    public final void method1890(long arg0, byte arg1) {
        if (arg1 != -117) {
            this.method1891(-83, -25);
        }
        class126 var4 = (class126) this.field4871.method1842(arg1 ^ 0x74, arg0);
        if (var4 != null) {
            var4.method97(158);
            var4.method238((byte) 41);
            this.field4874++;
        }
        field4861++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    public final void method1891(int arg0, int arg1) {
        if (class187.field3379 != null) {
            for (class126 var3 = (class126) this.field4876.method1148(64); var3 != null; var3 = (class126) this.field4876.method1153(100)) {
                if (var3.method337(arg0 + 24259)) {
                    if (var3.method341(false) == null) {
                        var3.method97(arg0 + 23707);
                        var3.method238((byte) 106);
                        this.field4874++;
                    }
                } else if (++var3.field727 > (long) arg1) {
                    class126 var4 = class187.field3379.method389(var3, (byte) 124);
                    this.field4871.method1838(var3.field393, var4, (byte) 8);
                    class44.method365(var3, var4, (byte) 66);
                    var3.method97(158);
                    var3.method238((byte) 30);
                }
            }
        }
        if (arg0 != -23549) {
            method1885(-125, 46, -105, -34, -38);
        }
        field4866++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/Object;JB)V")
    public final void method1892(Object arg0, long arg1, byte arg2) {
        this.method1890(arg1, (byte) -117);
        if (this.field4874 == 0) {
            class126 var5 = (class126) this.field4876.method1147(false);
            var5.method97(158);
            var5.method238((byte) 37);
        } else {
            this.field4874--;
        }
        class40 var6 = new class40(arg0);
        this.field4871.method1838(arg1, var6, (byte) 8);
        int var7 = -49 % ((-arg2 - 79) / 42);
        field4865++;
        this.field4876.method1154(var6, -31849);
        var6.field727 = 0L;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public final void method1893(int arg0) {
        this.field4876.method1155((byte) -62);
        this.field4871.method1844((byte) -112);
        this.field4874 = this.field4875;
        field4877++;
        if (arg0 > -16) {
            this.method1889((byte) 36);
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
    public class276(int arg0) {
        int var2 = 1;
        this.field4875 = arg0;
        this.field4874 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field4871 = new class269(var2);
    }
}
