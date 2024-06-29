import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class346 {

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    private int field4839 = 0;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    private int field4836 = -1;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "Luh;")
    private class168 field4835 = new class168();

    @OriginalMember(owner = "client!afa", name = "r", descriptor = "Z")
    public boolean field4849 = false;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    private int field4834;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    private int field4838;

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "[Lls;")
    private class141[] field4847;

    @OriginalMember(owner = "client!afa", name = "l", descriptor = "[[[I")
    private int[][][] field4843;

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "I")
    public static int field4846 = -1;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "Lmu;")
    public static class303 field4841 = new class303(90, 10);

    @OriginalMember(owner = "client!afa", name = "s", descriptor = "Lwu;")
    public static class373 field4850 = new class373(128);

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!afa", name = "m", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!afa", name = "q", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!afa", name = "n", descriptor = "[I")
    public static int[] field4845;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZIII)I")
    public static final int method2175(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -24667) {
            method2177((byte) 95);
        }
        field4837++;
        class6 var4 = class284.method1863((byte) 4, arg1, arg0);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && var4.field44.length > arg2) {
            return var4.field44[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method2176(int arg0) {
        field4832++;
        if (this.field4838 != this.field4834) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field4834; var2++) {
            this.field4847[var2] = class236.field3428;
        }
        return this.field4843;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V")
    public static final void method2177(byte arg0) {
        if (arg0 != -45) {
            field4846 = 61;
        }
        field4844++;
        if (class482.field6727 == 1 || class482.field6727 == 3 || class648.field8918 != class482.field6727 && (class482.field6727 == 0 || class648.field8918 == 0)) {
            class77.field1375 = 0;
            class738.field9939 = 0;
            class86.field1546.method1466(0);
        }
        class648.field8918 = class482.field6727;
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)V")
    public static void method2178(byte arg0) {
        if (arg0 != 28) {
            method2177((byte) 21);
        }
        field4845 = null;
        field4841 = null;
        field4850 = null;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZILkda;)V")
    public static final void method2179(boolean arg0, int arg1, class390 arg2) {
        field4842++;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field5665 > class641.field8810) {
            class85.method816(arg2, (byte) -16);
        } else if (arg2.field5726 >= class641.field8810) {
            class420.method2582(-1, arg2);
        } else {
            class293.method1918(false, 0, arg2);
            var3 = class309.field4289;
            var4 = class422.field6094;
        }
        if (arg0) {
            field4841 = null;
        }
        if (arg2.field5922 < 512 || arg2.field5933 < 512 || arg2.field5922 >= (class376.field5325 * 512 - 512) || arg2.field5933 >= (class175.field2711 * 512 - 512)) {
            arg2.field5717 = -1;
            arg2.field5726 = 0;
            var4 = 0;
            var3 = -1;
            arg2.field5662 = null;
            arg2.field5695 = -1;
            arg2.field5712 = -1;
            arg2.field5665 = 0;
            arg2.field5922 = arg2.field5746[0] * 512 + arg2.method2457((byte) 120) * 256;
            arg2.field5933 = arg2.field5743[0] * 512 + arg2.method2457((byte) 88) * 256;
            arg2.method2448(70);
        }
        if (class58.field1147 == arg2 && (arg2.field5922 < 6144 || arg2.field5933 < 6144 || ((class376.field5325 - 12) * 512) <= arg2.field5922 || (class175.field2711 - 12) * 512 <= arg2.field5933)) {
            arg2.field5717 = -1;
            var3 = -1;
            arg2.field5726 = 0;
            arg2.field5695 = -1;
            arg2.field5665 = 0;
            var4 = 0;
            arg2.field5662 = null;
            arg2.field5712 = -1;
            arg2.field5922 = arg2.field5746[0] * 512 + arg2.method2457((byte) 115) * 256;
            arg2.field5933 = arg2.field5743[0] * 512 + arg2.method2457((byte) 115) * 256;
            arg2.method2448(54);
        }
        int var5 = class272.method1796((byte) 108, arg2);
        class221.method1572(true, arg2);
        class545.method3149(var3, var5, (byte) 67, arg2, var4);
        class147.method1167(arg2, var3, -98);
        class460.method2725(-69, arg2);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)[[I")
    public final int[][] method2180(int arg0, int arg1) {
        field4848++;
        if (arg0 >= -75) {
            method2177((byte) -61);
        }
        if (this.field4838 == this.field4834) {
            this.field4849 = this.field4847[arg1] == null;
            this.field4847[arg1] = class236.field3428;
            return this.field4843[arg1];
        } else if (this.field4834 == 1) {
            this.field4849 = this.field4836 != arg1;
            this.field4836 = arg1;
            return this.field4843[0];
        } else {
            class141 var3 = this.field4847[arg1];
            if (var3 == null) {
                this.field4849 = true;
                if (this.field4839 >= this.field4834) {
                    class141 var4 = (class141) this.field4835.method1267(-126);
                    var3 = new class141(arg1, var4.field2332);
                    this.field4847[var4.field2329] = null;
                    var4.method2314((byte) 56);
                } else {
                    var3 = new class141(arg1, this.field4839);
                    this.field4839++;
                }
                this.field4847[arg1] = var3;
            } else {
                this.field4849 = false;
            }
            this.field4835.method1275(var3, -110);
            return this.field4843[var3.field2332];
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
    public final void method2181(int arg0) {
        field4833++;
        if (arg0 != 6144) {
            this.field4843 = null;
        }
        for (int var2 = 0; var2 < this.field4834; var2++) {
            this.field4843[var2][0] = null;
            this.field4843[var2][1] = null;
            this.field4843[var2][2] = null;
            this.field4843[var2] = null;
        }
        this.field4847 = null;
        this.field4843 = null;
        this.field4835.method1270(99);
        this.field4835 = null;
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(III)V")
    public class346(int arg0, int arg1, int arg2) {
        this.field4834 = arg0;
        this.field4838 = arg1;
        this.field4847 = new class141[this.field4838];
        this.field4843 = new int[this.field4834][3][arg2];
    }
}
