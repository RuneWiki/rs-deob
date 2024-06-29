import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class136 extends class223 {

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "Z")
    public boolean field1966;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[Loc;")
    public class136[] field1954;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Z")
    public static boolean field1953 = false;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "Lbg;")
    public static class324 field1959 = new class324(12, 5);

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Lgi;")
    public class477 field1957;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lms;")
    public class530 field1952;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)[I", line = 5)
    public final int[] method1033(int arg0, int arg1, int arg2) {
        field1962++;
        if (arg2 == 0) {
            return this.field1954[arg1].field1966 ? this.field1954[arg1].method82(123, arg0) : this.field1954[arg1].method272((byte) 92, arg0)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 34)
    public void method269(boolean arg0) {
        if (arg0) {
            this.field1966 = true;
        }
        field1963++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I", line = 44)
    public int[] method82(int arg0, int arg1) {
        field1958++;
        int var3 = 110 / ((arg0 - 67) / 50);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I", line = 54)
    public int method1034(int arg0) {
        field1955++;
        return arg0 == -1 ? -1 : -30;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)I", line = 65)
    public int method660(int arg0) {
        if (arg0 == 3) {
            field1965++;
            return -1;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V", line = 82)
    public void method661(int arg0, byte arg1, int arg2) {
        field1956++;
        if (arg1 != -54) {
            this.method659(7);
        }
        int var4 = this.field1951 == 255 ? arg0 : this.field1951;
        if (this.field1966) {
            this.field1957 = new class477(var4, arg0, arg2);
        } else {
            this.field1952 = new class530(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)[[I", line = 105)
    public int[][] method272(byte arg0, int arg1) {
        if (arg0 < 33) {
            return null;
        } else {
            field1950++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V", line = 116)
    public static void method1035(int arg0) {
        field1959 = null;
        if (arg0 != -256) {
            method1035(-23);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)[[I", line = 130)
    public final int[][] method1036(int arg0, int arg1, int arg2) {
        field1961++;
        if (arg0 != 3) {
            return null;
        } else if (this.field1954[arg1].field1966) {
            int[] var4 = this.field1954[arg1].method82(117, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1954[arg1].method272((byte) 127, arg2);
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 164)
    public void method659(int arg0) {
        if (this.field1966) {
            this.field1957.method2881(258510055);
            this.field1957 = null;
        } else {
            this.field1952.method3131((byte) 56);
            this.field1952 = null;
        }
        if (arg0 > 120) {
            field1960++;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILiv;)V", line = 195)
    public void method268(int arg0, int arg1, class65 arg2) {
        field1964++;
        if (arg0 != 4) {
            this.method659(-35);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IZ)V", line = 205)
    public class136(int arg0, boolean arg1) {
        this.field1966 = arg1;
        this.field1954 = new class136[arg0];
    }
}
