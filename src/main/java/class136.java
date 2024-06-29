import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class136 extends class306 {

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    private int field2032;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Lpa;")
    public static class2 field2033;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZILnk;Lnk;)V", line = 5)
    public static final void method935(boolean arg0, int arg1, class16 arg2, class16 arg3) {
        class111.field1532 = arg0;
        if (arg1 == 2) {
            class92.field1204 = arg3;
            class346.field5486 = arg2;
            field2036++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V", line = 18)
    public static void method936(boolean arg0) {
        field2033 = null;
        if (arg0) {
            field2033 = (class2) null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 29)
    public class136() {
        this(0);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lnk;I)V", line = 33)
    public static final void method937(class16 arg0, int arg1) {
        class74.field940 = arg0;
        if (arg1 != 10570) {
            field2033 = (class2) null;
        }
        field2034++;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V", line = 45)
    private class136(int arg0) {
        super(0, false);
        this.method938(arg0, 116);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I", line = 60)
    public final int[][] method681(int arg0, byte arg1) {
        if (arg1 != -119) {
            field2033 = (class2) null;
        }
        field2037++;
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class31.field367; var7++) {
                var5[var7] = this.field2031;
                var4[var7] = this.field2028;
                var6[var7] = this.field2032;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILlf;I)V", line = 94)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field2030++;
        if (arg0 != -15334) {
            method937((class16) null, -62);
        }
        if (arg2 == 0) {
            this.method938(arg1.method1017((byte) 101), arg0 ^ 0x3BB1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)V", line = 123)
    private final void method938(int arg0, int arg1) {
        field2029++;
        this.field2032 = (arg0 & 0xFF) << 4;
        this.field2028 = arg0 >> 4 & 0xFF0;
        this.field2031 = arg0 >> 12 & 0xFF0;
        int var3 = -103 % ((-arg1 - 45) / 32);
    }
}
