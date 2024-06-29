import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class610 implements class134 {

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "Leea;")
    private class116 field8746;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "Leg;")
    private class91 field8752;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lla;IIIILjava/lang/String;)I", line = 5)
    private final int method3500(class419 arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field8750++;
        return arg1 == -4598 ? arg0.method2518(0, this.field8752.field1270, 0, null, arg5, this.field8752.field1275 - (arg2 * 2), this.field8752.field1271, (byte) 98, 0, null, arg2 + arg3, null, this.field8752.field1274 - (arg2 * 2), arg4 - -arg2, 0, 0) : 35;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZ)V", line = 17)
    public final void method893(byte arg0, boolean arg1) {
        field8751++;
        if (arg0 != -61) {
            this.method3500(null, 14, -5, 15, -16, null);
        }
        class193 var3 = this.field8746.method827(this.field8752.field1269, (byte) -106);
        if (var3 == null) {
            return;
        }
        int var4 = this.field8752.field1273.method3298(false, class589.field8535, this.field8752.field1275) + this.field8752.field1272;
        int var5 = this.field8752.field1277.method1080(this.field8752.field1274, class6.field60, 110) + this.field8752.field1265;
        if (this.field8752.field1280) {
            class68.field1045.method278(var4, var5, this.field8752.field1275, this.field8752.field1274, this.field8752.field1266, 0);
        }
        int var6 = var5 + this.method3500(class36.field691, arg0 - 4537, 5, var5, var4, var3.field2354) * 12;
        int var9 = var6 + 8;
        if (this.field8752.field1280) {
            class68.field1045.method259(var4, var9, this.field8752.field1275 + var4 - 1, var9, this.field8752.field1266, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method3500(class36.field691, -4598, 5, var6, var4, var3.field2356) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method3500(class36.field691, -4598, 5, var10, var4, var3.field2351) * 12;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 57)
    public final void method749(int arg0) {
        field8747++;
        if (arg0 != 27471) {
            this.method3500(null, -53, -49, 85, 59, null);
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)Z", line = 69)
    public final boolean method753(int arg0) {
        if (arg0 == -29791) {
            field8749++;
            return this.field8746.method825((byte) 103);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Leea;Leg;)V", line = 79)
    public class610(class116 arg0, class91 arg1) {
        this.field8746 = arg0;
        this.field8752 = arg1;
    }
}
