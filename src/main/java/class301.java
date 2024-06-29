import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class301 extends class259 {

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public int field4855 = 0;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "[I")
    public static int[] field4875 = new int[1000];

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "Lpi;")
    public static class201 field4878 = new class201(5);

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "[I")
    public static int[] field4881 = new int[32];

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public int field4859;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public int field4860;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public int field4866;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public int field4872;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public int field4873;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public int field4874;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public int field4879;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "Lnc;")
    public class12 field4858;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Ltd;")
    public class184 field4852;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "Ltd;")
    public class184 field4854;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "Ldk;")
    public class207 field4856;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "Llc;")
    public static class270 field4867;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "Lec;")
    public class93 field4877;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "Z")
    public boolean field4864;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "[I")
    public static int[] field4862;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "[I")
    public int[] field4876;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public final void method2053(byte arg0) {
        int var2 = -85 % ((arg0 - 77) / 46);
        int var3 = this.field4861;
        if (this.field4877 != null) {
            class93 var4 = this.field4877.method710(0);
            if (var4 == null) {
                this.field4873 = 0;
                this.field4861 = -1;
                this.field4876 = null;
                this.field4879 = 0;
                this.field4872 = 0;
                this.field4860 = 0;
            } else {
                this.field4879 = var4.field1504;
                this.field4861 = var4.field1524;
                this.field4876 = var4.field1546;
                this.field4872 = var4.field1560;
                this.field4873 = var4.field1525 * 128;
                this.field4860 = var4.field1548;
            }
        } else if (this.field4858 != null) {
            int var5 = class169.method1204((byte) -63, this.field4858);
            if (var3 != var5) {
                this.field4861 = var5;
                class102 var6 = this.field4858.field137;
                if (var6.field1752 != null) {
                    var6 = var6.method795(65535);
                }
                if (var6 == null) {
                    this.field4860 = this.field4873 = 0;
                } else {
                    this.field4860 = var6.field1743;
                    this.field4873 = var6.field1750 * 128;
                }
            }
        } else if (this.field4856 != null) {
            this.field4861 = class253.method1745(this.field4856, 1);
            this.field4860 = this.field4856.field3047;
            this.field4873 = this.field4856.field3046 * 128;
        }
        if (this.field4861 != var3 && this.field4854 != null) {
            class241.field3543.method1248(this.field4854);
            this.field4854 = null;
        }
        field4870++;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
    public static void method2054(int arg0) {
        field4875 = null;
        field4881 = null;
        field4867 = null;
        field4862 = null;
        if (arg0 != 1000) {
            method2057(false, 25, 10L);
        }
        field4878 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII)V")
    public static final void method2055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= class264.field4230 && class273.field4418 >= arg4 && arg5 >= class73.field1156 && class59.field859 >= arg3) {
            class255.method1753(arg5, arg2, arg3, (byte) 106, arg4, arg0);
        } else {
            class59.method438(arg5, arg3, arg2, arg0, arg4, false);
        }
        if (arg1 <= 121) {
            method2054(43);
        }
        field4868++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)I")
    public static int method2056(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZIJ)V")
    public static final void method2057(boolean arg0, int arg1, long arg2) {
        field4865++;
        if (arg2 == 0L) {
            return;
        }
        if (class47.field659 >= 100) {
            class258.method1777(-1, 0, "", class170.field2575);
            return;
        }
        int var4 = 56 % ((arg1 + 12) / 60);
        String var5 = class121.method920(16, arg2);
        for (int var6 = 0; var6 < class47.field659; var6++) {
            if (class203.field3007[var6] == arg2) {
                class258.method1777(-1, 0, "", var5 + class183.field2743);
                return;
            }
        }
        for (int var7 = 0; var7 < class110.field1832; var7++) {
            if (class245.field3605[var7] == arg2) {
                class258.method1777(-1, 0, "", class280.field4508 + var5 + class264.field4239);
                return;
            }
        }
        if (var5.equals(class213.field3139.field3069)) {
            class258.method1777(-1, 0, "", class129.field2153);
            return;
        }
        class232.field3408++;
        class203.field3007[class47.field659] = arg2;
        class292.field4639[class47.field659] = class20.method140(true, arg2);
        class221.field3226[class47.field659++] = arg0;
        class135.field2210 = class248.field3705;
        class144.field2338.method683(true, 197);
        class144.field2338.method382(902642416, arg2);
    }
}
