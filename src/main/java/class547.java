import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class547 {

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Loea;")
    public class597 field7538 = null;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lda;")
    public class60 field7537 = null;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lmu;")
    public static class303 field7536 = new class303(31, -1);

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field7542 = -2;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method3153(int arg0) {
        if (arg0 != 2672) {
            method3154(null, -32, 14, -44, 95);
        }
        field7536 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lbe;IIII)V")
    public static final void method3154(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        field7535++;
        long var5 = (long) (arg2 << 14 | arg1 << 28 | arg3);
        class206 var7 = (class206) class491.field6801.method1465(var5, -6008);
        if (var7 == null) {
            class206 var8 = new class206();
            class491.field6801.method1468((byte) 50, var5, var8);
            var8.field2961.method1273(arg0, -20180);
            return;
        }
        class352 var9 = class721.field9801.method162(arg4 ^ 0xFFFFFF8D, arg0.field942);
        int var10 = var9.field4962;
        if (~var9.field4963 == arg4) {
            var10 = (arg0.field940 + 1) * var10;
        }
        for (class38 var11 = (class38) var7.field2961.method1269(arg4 + 6); var11 != null; var11 = (class38) var7.field2961.method1264((byte) 34)) {
            class352 var12 = class721.field9801.method162(104, var11.field942);
            int var13 = var12.field4962;
            if (var12.field4963 == 1) {
                var13 = (var11.field940 + 1) * var13;
            }
            if (var13 < var10) {
                class68.method679(arg4 ^ 0x6C, arg0, var11);
                return;
            }
        }
        var7.field2961.method1273(arg0, arg4 ^ 0x4ED2);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lda;)V")
    public class547(class60 arg0) {
        this.field7537 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lda;Loea;)V")
    public class547(class60 arg0, class597 arg1) {
        this.field7538 = arg1;
        this.field7537 = arg0;
    }
}
