import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class318 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    private int field4637;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
    public static int[] field4641 = new int[4096];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lmo;")
    public static class618 field4640;

    @OriginalMember(owner = "client!cb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4642++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static final void method2055(byte arg0) {
        int var1 = 19 % ((arg0 - 5) / 60);
        field4635++;
        class422.field5875 = true;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(II)V")
    public class318(int arg0, int arg1) {
        this.field4637 = arg0;
        this.field4636 = arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
    public final int method2056(int arg0) {
        field4638++;
        if (arg0 < 47) {
            field4640 = null;
        }
        return this.field4637;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBIILng;)V")
    public static final void method2057(int arg0, byte arg1, int arg2, int arg3, class172 arg4) {
        field4639++;
        long var5 = (long) (arg0 << 28 | arg2 << 14 | arg3);
        class397 var7 = (class397) class645.field9141.method2506(61, var5);
        if (var7 == null) {
            class397 var8 = new class397();
            class645.field9141.method2504(var5, -18, var8);
            var8.field5665.method378(arg4, 31316);
            return;
        }
        class660 var9 = class237.field3088.method1349(-1, arg4.field2150);
        int var10 = var9.field9348;
        if (var9.field9331 == 1) {
            var10 = (arg4.field2157 + 1) * var10;
        }
        for (class172 var11 = (class172) var7.field5665.method374((byte) 71); var11 != null; var11 = (class172) var7.field5665.method372(arg1 - 20695)) {
            class660 var12 = class237.field3088.method1349(arg1 + 44, var11.field2150);
            int var13 = var12.field9348;
            if (var12.field9331 == 1) {
                var13 = (var11.field2157 + 1) * var13;
            }
            if (var10 > var13) {
                class412.method2416(arg4, var11, -1);
                return;
            }
        }
        if (arg1 != -45) {
            method2055((byte) -104);
        }
        var7.field5665.method378(arg4, 31316);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static void method2058(byte arg0) {
        if (arg0 < 117) {
            method2055((byte) 55);
        }
        field4640 = null;
        field4641 = null;
    }
}
