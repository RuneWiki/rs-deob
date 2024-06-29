import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class346 extends class451 {

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    private int field4897;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    private int field4896;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    private int field4893;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    private int field4892;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field4890 = -2;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field4899 = 0;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Ltq;")
    public static class376 field4898;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "[B")
    public static byte[] field4891;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V", line = 4)
    public static void method2212(boolean arg0) {
        field4898 = null;
        if (arg0) {
            field4898 = null;
        }
        field4891 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V", line = 16)
    public final void method261(int arg0, int arg1, int arg2) {
        ++field4895;
        if (arg1 > -56) {
            this.method260(-122, -99, 119);
        }
        int var4 = this.field4897 * arg0 >> 12;
        int var5 = this.field4893 * arg0 >> 12;
        int var6 = this.field4896 * arg2 >> 12;
        int var7 = this.field4892 * arg2 >> 12;
        class249.method1692(var6, var7, 2, var4, var5, super.field6456);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 39)
    public static final void method2213(int arg0) {
        ++field4900;
        if (class151.field1873.method678()) {
            class278.method1837((byte) -105);
            class151.field1873.method685(class402.field5767);
            class406.method2593(false);
        } else {
            class377.method2441(class26.field329, (byte) -117);
        }
        if (arg0 != 2005892332) {
            field4898 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIII)V", line = 60)
    public class346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4897 = arg0;
        this.field4896 = arg1;
        this.field4893 = arg2;
        this.field4892 = arg3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBI)V", line = 71)
    public final void method259(int arg0, byte arg1, int arg2) {
        ++field4889;
        int var4 = this.field4897 * arg0 >> 12;
        int var5 = this.field4893 * arg0 >> 12;
        int var6 = this.field4896 * arg2 >> 12;
        int var7 = this.field4892 * arg2 >> 12;
        if (arg1 != 12) {
            method2212(false);
        }
        class42.method257(super.field6457, var4, super.field6458, var5, 60, var6, var7);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V", line = 95)
    public final void method260(int arg0, int arg1, int arg2) {
        ++field4894;
        int var4 = this.field4897 * arg1 >> 12;
        int var5 = -106 / ((arg0 - -78) / 40);
        int var6 = this.field4893 * arg1 >> 12;
        int var7 = this.field4896 * arg2 >> 12;
        int var8 = this.field4892 * arg2 >> 12;
        class12.method92(super.field6458, var7, super.field6457, var4, var6, var8, super.field6456, (byte) -74);
    }
}
