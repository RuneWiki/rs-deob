import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class112 {

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field1186 = 0;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Lwp;")
    public static class452 field1183;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Ltf;")
    public static class701 field1187;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "[I")
    public static int[] field1185;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public static void method595(byte arg0) {
        if (arg0 != 113) {
            method597(null, -5);
        }
        field1183 = null;
        field1185 = null;
        field1187 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B[J[Ljava/lang/Object;)V")
    public static final void method596(byte arg0, long[] arg1, Object[] arg2) {
        field1182++;
        class435.method2496(-124, arg2, arg1.length - 1, 0, arg1);
        if (arg0 > -120) {
            method596((byte) 72, null, null);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lvj;I)V")
    public static final void method597(class422 arg0, int arg1) {
        if (class271.field3378 == null) {
            class104 var2 = new class104();
            byte[] var3 = var2.method564(128, 16, 128, -2);
            class271.field3378 = class489.method2836(var3, false, true);
        }
        field1181++;
        if (arg1 != 128) {
            field1183 = null;
        }
        if (class289.field3614 == null) {
            class572 var4 = new class572();
            byte[] var5 = var4.method3233(16, (byte) 117, 128, 128);
            class289.field3614 = class489.method2836(var5, false, true);
        }
        class168 var6 = arg0.field5822;
        if (var6.method916(-101) && class619.field8754 == null) {
            byte[] var7 = class124.method713(128, 4.0F, 8, new class124(419684), 1341, 4.0F, 16.0F, 128, 16, 0.6F, 0.5F);
            class619.field8754 = class489.method2836(var7, false, true);
        }
    }
}
