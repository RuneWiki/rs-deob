import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class138 extends class542 {

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    private int field1839;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    private int field1840;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    private int field1846;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "[I")
    public static int[] field1841 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "F")
    public static float field1845 = 0.0F;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Llp;")
    public static class272 field1842 = new class272(16);

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIII)V", line = 3)
    public class138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1839 = arg0;
        this.field1847 = arg1;
        this.field1840 = arg2;
        this.field1846 = arg3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILuu;)V", line = 18)
    public static final void method926(int arg0, class191 arg1) {
        ++field1837;
        class73.field1013 = arg1.method1265("p11_full", 62);
        if (arg0 <= 19) {
            method929((byte) -103);
        }
        class84.field1221 = arg1.method1265("p12_full", 104);
        class526.field7720 = arg1.method1265("b12_full", 115);
        class180.field2426 = arg1.method1265("hitmarks", 71);
        class254.field3522 = arg1.method1265("hitbar_default", 103);
        class41.field611 = arg1.method1265("timerbar_default", 118);
        class435.field6592 = arg1.method1265("headicons_pk", 61);
        class248.field3453 = arg1.method1265("headicons_prayer", 69);
        class498.field7350 = arg1.method1265("hint_headicons", 70);
        class334.field5193 = arg1.method1265("hint_mapmarkers", 54);
        class165.field2240 = arg1.method1265("mapflag", 73);
        class484.field7134 = arg1.method1265("cross", 109);
        class247.field3450 = arg1.method1265("mapdots", 73);
        class418.field6366 = arg1.method1265("scrollbar", 76);
        class163.field2149 = arg1.method1265("name_icons", 56);
        class209.field2892 = arg1.method1265("floorshadows", 48);
        class229.field3280 = arg1.method1265("compass", 83);
        class191.field2578 = arg1.method1265("otherlevel", 77);
        class304.field4437 = arg1.method1265("hint_mapedge", 77);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V", line = 49)
    public static final void method927(byte arg0, int arg1) {
        ++field1844;
        if (arg1 != -1) {
            if (class24.field351[arg1]) {
                class25.field359.method1267(arg1, true);
                class263.field3690[arg1] = null;
                class41.field614[arg1] = null;
                class24.field351[arg1] = false;
                if (arg0 <= 3) {
                    field1842 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V", line = 70)
    public final void method928(int arg0, int arg1, int arg2) {
        if (arg0 != 21074) {
            this.field1847 = -114;
        }
        ++field1836;
        int var4 = this.field1839 * arg2 >> 12;
        int var5 = this.field1840 * arg2 >> 12;
        int var6 = this.field1847 * arg1 >> 12;
        int var7 = this.field1846 * arg1 >> 12;
        class427.method2604(var4, super.field7925, var5, var6, var7, 32);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 89)
    public static void method929(byte arg0) {
        if (arg0 != 48) {
            method929((byte) 106);
        }
        field1842 = null;
        field1841 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)V", line = 104)
    public final void method930(byte arg0, int arg1, int arg2) {
        ++field1838;
        int var4 = this.field1839 * arg1 >> 12;
        int var5 = this.field1840 * arg1 >> 12;
        int var6 = this.field1847 * arg2 >> 12;
        int var7 = this.field1846 * arg2 >> 12;
        if (arg0 < -107) {
            class291.method1861(super.field7921, var6, var4, var5, var7, super.field7925, 1357, super.field7926);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB)V", line = 130)
    public final void method931(int arg0, int arg1, byte arg2) {
        ++field1835;
        int var4 = this.field1839 * arg0 >> 12;
        int var5 = this.field1840 * arg0 >> 12;
        int var6 = this.field1847 * arg1 >> 12;
        int var7 = this.field1846 * arg1 >> 12;
        class32.method275(var6, var5, -116, var7, super.field7921, var4, super.field7926);
        if (arg2 != 0) {
            this.field1847 = 36;
        }
    }
}
