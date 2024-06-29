import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class342 extends class302 {

    @OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
    public static int field4940 = 0;

    @OriginalMember(owner = "client!mu", name = "J", descriptor = "Lrb;")
    public static class283 field4948 = new class283(65, -2);

    @OriginalMember(owner = "client!mu", name = "K", descriptor = "[I")
    public static int[] field4949 = new int[200];

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!mu", name = "E", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "I")
    public int field4945;

    @OriginalMember(owner = "client!mu", name = "I", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!mu", name = "H", descriptor = "Lro;")
    public class126 field4946;

    @OriginalMember(owner = "client!mu", name = "F", descriptor = "[B")
    public byte[] field4944;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)V")
    public static final void method2069(boolean arg0, int arg1) {
        ++field4942;
        if (~class441.field6349.length() != -1) {
            class353.method2116("--> " + class441.field6349, false);
            class142.method989(arg0, class441.field6349, -10, false);
            class178.field2666 = 0;
            class480.field6949 = 0;
            int var2 = 67 / ((arg1 - -34) / 52);
            class441.field6349 = "";
        }
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(B)V")
    public static void method2070(byte arg0) {
        int var1 = 46 % ((45 - arg0) / 49);
        field4948 = null;
        field4949 = null;
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)I")
    public final int method1720(byte arg0) {
        ++field4943;
        if (arg0 != -48) {
            return -68;
        } else {
            return super.field4123 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "(I)[B")
    public final byte[] method1716(int arg0) {
        ++field4947;
        if (arg0 != 255) {
            return null;
        } else if (super.field4123) {
            throw new RuntimeException();
        } else {
            return this.field4944;
        }
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(II)I")
    public static final int method2071(int arg0, int arg1) {
        ++field4941;
        int var2 = (arg0 & 1431655765) - -(arg0 >>> 1 & -715827883);
        int var3 = (-214748365 & var2 >>> 2) + (var2 & 858993459);
        int var4 = (var3 >>> 4) + var3 & 252645135;
        if (arg1 != 13549) {
            return 90;
        } else {
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 255;
        }
    }
}
