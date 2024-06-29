import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class173 {

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "Lwm;")
    public class562 field2044 = new class562();

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "Lsq;")
    public static class178 field2037 = new class178(13, 0, 1, 0);

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "Lhu;")
    public static class131 field2041;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "Ltw;")
    public static class202 field2036;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "Lwm;")
    private class562 field2046;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BLig;)Lcn;", line = 5)
    public static final class514 method1070(byte arg0, class244 arg1) {
        if (arg0 != -26) {
            method1077(28, null);
        }
        field2043++;
        return new class514(arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1466((byte) 31), arg1.method1458((byte) 29), arg1.method1423(-11));
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)Lwm;", line = 18)
    public final class562 method1071(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field2038++;
        class562 var2 = this.field2044.field8004;
        if (this.field2044 == var2) {
            this.field2046 = null;
            return null;
        } else {
            this.field2046 = var2.field8004;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V", line = 40)
    public final void method1072(byte arg0) {
        while (true) {
            class562 var2 = this.field2044.field8004;
            if (this.field2044 == var2) {
                if (arg0 != 82) {
                    return;
                }
                field2045++;
                this.field2046 = null;
                return;
            }
            var2.method3279((byte) 67);
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(B)V", line = 62)
    public static void method1073(byte arg0) {
        field2036 = null;
        field2041 = null;
        int var1 = 95 % ((arg0 + 9) / 61);
        field2037 = null;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)Lwm;", line = 81)
    public final class562 method1074(boolean arg0) {
        field2039++;
        if (arg0) {
            field2041 = null;
        }
        class562 var2 = this.field2046;
        if (this.field2044 == var2) {
            this.field2046 = null;
            return null;
        } else {
            this.field2046 = var2.field8004;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)I", line = 108)
    public final int method1075(int arg0) {
        field2040++;
        int var2 = 0;
        if (arg0 != 1) {
            this.field2044 = null;
        }
        class562 var3 = this.field2044.field8004;
        while (this.field2044 != var3) {
            var3 = var3.field8004;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lwm;I)V", line = 132)
    public final void method1076(class562 arg0, int arg1) {
        if (arg0.field8006 != null) {
            arg0.method3279((byte) 38);
        }
        field2042++;
        arg0.field8006 = this.field2044.field8006;
        arg0.field8004 = this.field2044;
        arg0.field8006.field8004 = arg0;
        arg0.field8004.field8006 = arg0;
        if (arg1 != -26776) {
            field2037 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V", line = 167)
    public class173() {
        this.field2044.field8004 = this.field2044;
        this.field2044.field8006 = this.field2044;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I[B)[B", line = 154)
    public static final byte[] method1077(int arg0, byte[] arg1) {
        field2047++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class143.method894(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }
}
