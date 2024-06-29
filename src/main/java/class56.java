import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class56 {

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Ljr;")
    private class112 field1134 = new class112(256);

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "Lwga;")
    private class745 field1129;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "Ld;")
    private class152 field1131;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field1135 = 1407;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public final void method608(int arg0) {
        field1133++;
        if (arg0 == 7271) {
            this.field1134.method999(0);
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
    public final void method609(int arg0) {
        this.field1134.method987(2, 5);
        if (arg0 != -16130) {
            this.method609(-94);
        }
        field1130++;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)Lwfa;")
    public final class200 method610(byte arg0, int arg1) {
        field1132++;
        Object var3 = this.field1134.method992((long) arg1, 107);
        if (var3 != null) {
            return (class200) var3;
        } else if (this.field1131.method1181(-7953, arg1)) {
            if (arg0 > -30) {
                field1135 = 37;
            }
            class739 var4 = this.field1131.method1180(arg1, -6662);
            int var5 = var4.field9941 ? 64 : this.field1129.field10264;
            class200 var7;
            if (var4.field9960 && this.field1129.method328()) {
                float[] var6 = this.field1131.method1178(var5, 0.7F, false, -30824, var5, arg1);
                var7 = this.field1129.method4121(var6, var5, var5, class746.field10332, -109, ~var4.field9947 != -1);
            } else {
                int[] var8;
                if (var4.field9942 != 2 && class296.method1944((byte) 4, var4.field9955)) {
                    var8 = this.field1131.method1182(true, arg1, 0.7F, var5, var5, 83);
                } else {
                    var8 = this.field1131.method1183(-21540, var5, 0.7F, arg1, false, var5);
                }
                var7 = this.field1129.method4091(var5, var5, -15137, ~var4.field9947 != -1, var8);
            }
            var7.method1014(var4.field9959, var4.field9957, 25688);
            this.field1134.method991(var7, (long) arg1, (byte) -107);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lwga;Ld;)V")
    public class56(class745 arg0, class152 arg1) {
        this.field1129 = arg0;
        this.field1131 = arg1;
    }
}
