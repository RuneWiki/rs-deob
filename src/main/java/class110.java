import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class110 {

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    private int field1799 = -1;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    private int field1804 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lvb;")
    private class247 field1788 = new class247();

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "Z")
    public boolean field1813 = false;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    private int field1802;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "[Ltd;")
    private class256[] field1800;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "[[I")
    private int[][] field1798;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field1803 = -1;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Ljd;")
    public static class265 field1796 = new class265(64);

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field1810 = -1;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "[Lsc;")
    public static class181[] field1809 = new class181[100];

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lsc;")
    private static class181 field1805 = class149.method967(255, "Thu");

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Lsc;")
    private static class181 field1812 = class149.method967(255, "Wed");

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "Lsc;")
    private static class181 field1811 = class149.method967(255, "Tue");

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "Lsc;")
    private static class181 field1806 = class149.method967(255, "Mon");

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lsc;")
    private static class181 field1814 = class149.method967(255, "Fri");

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Lsc;")
    private static class181 field1815 = class149.method967(255, "Sat");

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "Lsc;")
    private static class181 field1807 = class149.method967(255, "Sun");

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "[Lsc;")
    public static class181[] field1808 = new class181[] { field1807, field1806, field1811, field1812, field1805, field1814, field1815 };

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "[Lpd;")
    public static class48[] field1816;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method731(int arg0) {
        for (int var2 = 0; var2 < this.field1789; var2++) {
            this.field1798[var2] = null;
        }
        this.field1798 = null;
        field1801++;
        this.field1800 = null;
        if (arg0 == -4234) {
            this.field1788.method1682(122);
            this.field1788 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static final void method732(boolean arg0) {
        field1791++;
        if (!arg0) {
            field1810 = -19;
        }
        class212.field3655.method1790(0);
        class170.field2848.method1790(0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static final void method733(byte arg0) {
        field1795++;
        try {
            if (class177.field3100 == null) {
                class177.field3100 = new class225(class224.field3870, class175.method1164(new class181[] { class220.method1465((byte) 111), class239.field4160 }, (byte) 127).method1199((byte) -112));
            }
            if (arg0 != 79) {
                field1810 = -119;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class177.field3100 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)[[I")
    public final int[][] method734(byte arg0) {
        field1797++;
        if (this.field1802 != this.field1789) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == 117) {
            for (int var2 = 0; var2 < this.field1789; var2++) {
                this.field1800[var2] = class126.field2094;
            }
            return this.field1798;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public static void method735(int arg0) {
        field1808 = null;
        field1811 = null;
        field1806 = null;
        field1809 = null;
        field1796 = null;
        field1812 = null;
        if (arg0 != -18334) {
            return;
        }
        field1805 = null;
        field1816 = null;
        field1815 = null;
        field1807 = null;
        field1814 = null;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static final void method736(int arg0) {
        field1794++;
        int var1 = class8.field154;
        int var2 = class64.field1002;
        int var3 = class265.field4621;
        int var4 = class250.field4360;
        int var5 = 6116423;
        class17.method156(var1, var4, var2, var3, var5);
        class17.method156(var1 + 1, var4 + 1, var2 - 2, 16, 0);
        class17.method155(var1 + 1, var4 + 18, var2 - 2, var3 + -19, 0);
        class114.field1853.method1659(class38.field594, var1 + 3, var4 - -14, var5, -1);
        int var6 = class79.field1279;
        int var7 = class183.field3215;
        for (int var8 = 0; var8 < class131.field2177; var8++) {
            int var9 = (class131.field2177 - var8 - 1) * 15 + var4 + 31;
            int var10 = 16777215;
            if (var6 > var1 && (var1 + var2) > var6 && var9 - 13 < var7 && (var9 + 3) > var7) {
                var10 = 16776960;
            }
            class114.field1853.method1659(class106.method713(var8, (byte) -58), var1 + 3, var9, var10, 0);
        }
        class265.method1799(class8.field154, class250.field4360, (byte) 66, class64.field1002, class265.field4621);
        if (arg0 >= -25) {
            field1816 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)[I")
    public final int[] method737(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        field1790++;
        if (this.field1802 == this.field1789) {
            this.field1813 = this.field1800[arg1] == null;
            this.field1800[arg1] = class126.field2094;
            return this.field1798[arg1];
        } else if (this.field1789 == 1) {
            this.field1813 = this.field1799 != arg1;
            this.field1799 = arg1;
            return this.field1798[0];
        } else {
            class256 var3 = this.field1800[arg1];
            if (var3 == null) {
                this.field1813 = true;
                if (this.field1789 <= this.field1804) {
                    class256 var4 = (class256) this.field1788.method1685(-231);
                    var3 = new class256(arg1, var4.field4473);
                    this.field1800[var4.field4471] = null;
                    var4.method290((byte) -48);
                } else {
                    var3 = new class256(arg1, this.field1804);
                    this.field1804++;
                }
                this.field1800[arg1] = var3;
            } else {
                this.field1813 = false;
            }
            this.field1788.method1693(-1, var3);
            return this.field1798[var3.field4473];
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Z")
    public static final boolean method738(int arg0) {
        field1793++;
        try {
            if (arg0 >= -74) {
                method732(false);
            }
            if (class97.field1575 == 2) {
                if (class76.field1221 == null) {
                    class76.field1221 = class29.method239(class218.field3765, class43.field674, class203.field3498);
                    if (class76.field1221 == null) {
                        return false;
                    }
                }
                if (class61.field923 == null) {
                    class61.field923 = new class45(class224.field3872, class211.field3621);
                }
                if (class247.field4317.method1263(class244.field4243, 0, 22050, class76.field1221, class61.field923)) {
                    class247.field4317.method1268(true);
                    class247.field4317.method1266((byte) 65, class255.field4466);
                    class247.field4317.method1274((byte) -120, class145.field2376, class76.field1221);
                    class97.field1575 = 0;
                    class76.field1221 = null;
                    class218.field3765 = null;
                    class61.field923 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class247.field4317.method1272(511);
            class97.field1575 = 0;
            class76.field1221 = null;
            class61.field923 = null;
            class218.field3765 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(III)V")
    public class110(int arg0, int arg1, int arg2) {
        this.field1789 = arg0;
        this.field1802 = arg1;
        this.field1800 = new class256[this.field1802];
        this.field1798 = new int[this.field1789][arg2];
    }
}
