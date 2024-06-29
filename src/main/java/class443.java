import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class443 {

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "[Ldg;")
    private class416[] field6103;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    private int field6100;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static volatile int field6101 = -1;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "J")
    private long field6106;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Ldg;")
    private class416 field6099;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Ldg;", line = 3)
    public final class416 method2548(int arg0) {
        field6102++;
        if (this.field6099 == null) {
            return null;
        }
        class416 var2 = this.field6103[(int) ((long) (this.field6100 - 1) & this.field6106)];
        while (this.field6099 != var2) {
            if (this.field6099.field5747 == this.field6106) {
                class416 var3 = this.field6099;
                this.field6099 = this.field6099.field5748;
                return var3;
            }
            this.field6099 = this.field6099.field5748;
        }
        this.field6099 = null;
        if (arg0 != 6594) {
            this.field6099 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ldg;JZ)V", line = 51)
    public final void method2549(class416 arg0, long arg1, boolean arg2) {
        if (arg0.field5744 != null) {
            arg0.method2414((byte) -26);
        }
        field6105++;
        class416 var5 = this.field6103[(int) ((long) (this.field6100 - 1) & arg1)];
        arg0.field5744 = var5.field5744;
        arg0.field5748 = var5;
        arg0.field5744.field5748 = arg0;
        arg0.field5747 = arg1;
        arg0.field5748.field5744 = arg0;
        if (arg2) {
            field6101 = -91;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 73)
    public static final void method2550(byte arg0) {
        if (arg0 <= -127) {
            class384.field5373.method561((byte) -78);
            field6104++;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(JI)Ldg;", line = 88)
    public final class416 method2551(long arg0, int arg1) {
        this.field6106 = arg0;
        if (arg1 != 23574) {
            return null;
        }
        field6107++;
        class416 var4 = this.field6103[(int) (arg0 & (long) (this.field6100 - 1))];
        for (this.field6099 = var4.field5748; this.field6099 != var4; this.field6099 = this.field6099.field5748) {
            if (this.field6099.field5747 == arg0) {
                class416 var5 = this.field6099;
                this.field6099 = this.field6099.field5748;
                return var5;
            }
        }
        this.field6099 = null;
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V", line = 117)
    public class443(int arg0) {
        this.field6103 = new class416[arg0];
        this.field6100 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class416 var3 = this.field6103[var2] = new class416();
            var3.field5748 = var3;
            var3.field5744 = var3;
        }
    }
}
