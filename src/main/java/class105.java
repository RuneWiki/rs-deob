import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class105 extends class12 {

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Z")
    public boolean field1853;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "[Llf;")
    public class105[] field1855;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1851 = 64;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "[Lni;")
    public static class20[] field1860 = new class20[4];

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Lvf;")
    public static class265 field1852 = class87.method582(-46, "Fertigkeit: ");

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Lvf;")
    public static class265 field1857 = class87.method582(-46, "event_opbase");

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field1868 = 255;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "Z")
    public static boolean field1867 = true;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public int field1864;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Lkd;")
    public class62 field1862;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lpe;")
    public class83 field1870;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZI)V")
    public final void method700(int arg0, boolean arg1, int arg2) {
        field1856++;
        if (arg1) {
            field1857 = null;
        }
        int var4 = this.field1864 == 255 ? arg0 : this.field1864;
        if (this.field1853) {
            this.field1862 = new class62(var4, arg0, arg2);
        } else {
            this.field1870 = new class83(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public void method130(int arg0) {
        if (this.field1853) {
            this.field1862.method457(false);
            this.field1862 = null;
        } else {
            this.field1870.method573(12);
            this.field1870 = null;
        }
        field1861++;
        if (arg0 != -1) {
            this.method700(83, true, 82);
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)I")
    public int method433(int arg0) {
        field1866++;
        if (arg0 > -17) {
            method701(false);
        }
        return -1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static void method701(boolean arg0) {
        field1857 = null;
        field1852 = null;
        field1860 = null;
        if (!arg0) {
            method701(false);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I")
    public int[] method16(int arg0, int arg1) {
        field1871++;
        if (arg0 == 8055) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILng;)V")
    public void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 == 255) {
            field1858++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[[I")
    public int[][] method18(int arg0, byte arg1) {
        field1859++;
        if (arg1 > -110) {
            this.field1855 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
    public void method94(boolean arg0) {
        field1848++;
        if (arg0) {
            this.method18(68, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)[[I")
    public final int[][] method702(byte arg0, int arg1, int arg2) {
        field1849++;
        if (arg0 != 94) {
            this.method16(12, 44);
        }
        if (!this.field1855[arg2].field1853) {
            return this.field1855[arg2].method18(arg1, (byte) -122);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field1855[arg2].method16(8055, arg1);
        var4[2] = var5;
        var4[1] = var5;
        var4[0] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)I")
    public int method128(int arg0) {
        if (arg0 != -1) {
            field1850 = -66;
        }
        field1863++;
        return -1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZLvf;)V")
    public static final void method703(byte arg0, boolean arg1, class265 arg2) {
        int var3 = -88 % ((46 - arg0) / 53);
        if (arg1) {
            try {
                class19.field509.getAppletContext().showDocument(arg2.method1775(-11, class19.field509.getCodeBase()), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class19.field509.getAppletContext().showDocument(arg2.method1775(-11, class19.field509.getCodeBase()), "_top");
            } catch (Exception var5) {
            }
        }
        field1865++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V")
    public static final void method704(int arg0, boolean arg1) {
        class54.field1112.method1891(-23549, arg0);
        field1869++;
        if (arg1) {
            field1850 = 90;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBI)[I")
    public final int[] method705(int arg0, byte arg1, int arg2) {
        field1854++;
        if (arg1 >= -2) {
            return null;
        } else if (this.field1855[arg2].field1853) {
            return this.field1855[arg2].method16(8055, arg0);
        } else {
            return this.field1855[arg2].method18(arg0, (byte) -113)[0];
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IZ)V")
    public class105(int arg0, boolean arg1) {
        this.field1853 = arg1;
        this.field1855 = new class105[arg0];
    }
}
