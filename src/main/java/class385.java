import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class385 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "[Lfu;")
    private class363[] field4942;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    private int field4945;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Z")
    public static boolean field4948 = false;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "J")
    private long field4944;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "Lfu;")
    private class363 field4947;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(JB)Lfu;", line = 4)
    public final class363 method2208(long arg0, byte arg1) {
        field4949++;
        this.field4944 = arg0;
        class363 var4 = this.field4942[(int) ((long) (this.field4945 - 1) & arg0)];
        this.field4947 = var4.field4652;
        if (arg1 > -72) {
            method2210((byte) -92);
        }
        while (this.field4947 != var4) {
            if (this.field4947.field4648 == arg0) {
                class363 var5 = this.field4947;
                this.field4947 = this.field4947.field4652;
                return var5;
            }
            this.field4947 = this.field4947.field4652;
        }
        this.field4947 = null;
        return null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lfu;JI)V", line = 43)
    public final void method2209(class363 arg0, long arg1, int arg2) {
        field4950++;
        if (arg0.field4647 != null) {
            arg0.method2110(106);
        }
        class363 var5 = this.field4942[(int) (arg1 & (long) (this.field4945 - 1))];
        arg0.field4652 = var5;
        arg0.field4647 = var5.field4647;
        arg0.field4647.field4652 = arg0;
        arg0.field4648 = arg1;
        if (arg2 != 15512) {
            field4946 = -19;
        }
        arg0.field4652.field4647 = arg0;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 64)
    public static final void method2210(byte arg0) {
        field4951++;
        if (class99.field1273 != null) {
            if (class99.field1273.field2546 == 1) {
                class99.field1273 = null;
                return;
            }
            if (class99.field1273.field2546 == 2) {
                class192.method1132(class428.field5410, 22711, class289.field3651, 2);
                class99.field1273 = null;
                return;
            }
        }
        if (arg0 != -54) {
            method2210((byte) 84);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)Lfu;", line = 104)
    public final class363 method2211(int arg0) {
        if (arg0 != -1) {
            this.field4942 = null;
        }
        field4943++;
        if (this.field4947 == null) {
            return null;
        }
        class363 var2 = this.field4942[(int) ((long) (this.field4945 - 1) & this.field4944)];
        while (this.field4947 != var2) {
            if (this.field4947.field4648 == this.field4944) {
                class363 var3 = this.field4947;
                this.field4947 = this.field4947.field4652;
                return var3;
            }
            this.field4947 = this.field4947.field4652;
        }
        this.field4947 = null;
        return null;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V", line = 141)
    public class385(int arg0) {
        this.field4942 = new class363[arg0];
        this.field4945 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class363 var3 = this.field4942[var2] = new class363();
            var3.field4647 = var3;
            var3.field4652 = var3;
        }
    }
}
