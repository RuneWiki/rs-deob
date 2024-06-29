import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class139 implements class216 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lkca;")
    private class83 field2210;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lwu;")
    private class376 field2209;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lwu;")
    private class376 field2206;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lda;")
    private class60 field2208;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZB)V")
    public final void method328(boolean arg0, byte arg1) {
        if (arg1 > -60) {
            this.method328(true, (byte) -52);
        }
        if (arg0) {
            int var3 = this.field2210.field1003.method1911(this.field2210.field997, 0, class69.field844) + this.field2210.field1001;
            int var4 = this.field2210.field998.method2861((byte) 116, class304.field4321, this.field2210.field1000) + this.field2210.field1006;
            this.field2208.method528(var4, this.field2210.field1004, null, this.field2210.field993, 0, null, this.field2210.field996, var3, this.field2210.field1000, this.field2210.field995, 0, this.field2210.field1007, null, 0, this.field2210.field999, this.field2210.field997);
        }
        field2211++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public final void method324(byte arg0) {
        if (arg0 <= 34) {
            this.field2209 = null;
        }
        field2207++;
        class539 var2 = class165.method1184(this.field2209, 13580, this.field2210.field1008);
        this.field2208 = class341.field4807.method425(var2, class720.method4046(this.field2206, this.field2210.field1008), true);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Z")
    public final boolean method320(int arg0) {
        field2205++;
        boolean var2 = true;
        if (!this.field2206.method2216(this.field2210.field1008, -118)) {
            var2 = false;
        }
        if (!this.field2209.method2216(this.field2210.field1008, -107)) {
            var2 = false;
        }
        if (arg0 != 5618) {
            this.method320(-51);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lwu;Lwu;Lkca;)V")
    public class139(class376 arg0, class376 arg1, class83 arg2) {
        this.field2210 = arg2;
        this.field2209 = arg1;
        this.field2206 = arg0;
    }
}
