import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class241 extends class379 implements class732 {

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "C")
    public char field2847;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
    public int field2849;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "J")
    public long field2832;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2844;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
    public final int method1451(int arg0) {
        field2835++;
        return arg0 >= -22 ? -87 : this.field2849;
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)I")
    public final int method1452(int arg0) {
        if (arg0 != 6925) {
            method1455(false, -36, null, -52);
        }
        field2837++;
        return this.field2834;
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)C")
    public final char method1453(int arg0) {
        if (arg0 != 1714) {
            this.method1453(-41);
        }
        field2845++;
        return this.field2847;
    }

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)V")
    public static void method1454(int arg0) {
        field2844 = null;
        if (arg0 != 0) {
            field2838 = 26;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZILha;I)Lda;")
    public static final class67 method1455(boolean arg0, int arg1, class66 arg2, int arg3) {
        field2833++;
        class705 var4 = class552.method3232(arg1, (byte) -63, arg2, arg0);
        if (arg3 != 500) {
            method1456(-73);
        }
        return var4 == null ? null : var4.field9922;
    }

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "(I)I")
    public static final int method1456(int arg0) {
        int var1 = -66 % ((arg0 + 84) / 42);
        field2842++;
        return 16;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)J")
    public final long method1457(int arg0) {
        field2841++;
        int var2 = -14 / ((-arg0 - 40) / 52);
        return this.field2832;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I")
    public final int method1458(byte arg0) {
        field2840++;
        if (arg0 >= -46) {
            this.field2848 = 115;
        }
        return this.field2848;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)I")
    public static int method1459(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
    public static final void method1460(byte arg0) {
        class382.field4860 = new class557[500];
        class191.field2289 = class327.field4047;
        class513.field7243 = 0;
        class680.field9312 = 0;
        class92.field1225 = class327.field4047;
        class141.field1767 = new class557[2000];
        class345.field4315 = new class557[1000];
        class379.field4807 = new class557[500];
        class222.field2583 = 0;
        class267.field3161 = false;
        int var1 = 81 / ((arg0 + 36) / 51);
        class552.field7680 = new int[class368.field4569][class307.field3799 + 1][class250.field2938 + 1];
        field2836++;
        class168.field2027 = 0;
        if (class6.field80 instanceof class724) {
            class775.field10694 = false;
        } else {
            class775.field10694 = true;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIII)V")
    public static final void method1461(int arg0, int arg1, int arg2, int arg3) {
        field2839++;
        if (arg2 != 0) {
            field2843 = 10;
        }
        class140 var4 = class448.field6026[arg0][arg1];
        class316.method1862(arg3, var4 == null ? class622.field8543 : var4, 55);
    }
}
