import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class117 extends class616 {

    @OriginalMember(owner = "client!qca", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field1603;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
    public static int field1602 = -1;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "Lqe;")
    public static class469 field1601 = new class469(64, -1);

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!qca", name = "I", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!qca", name = "J", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "(B)V")
    public static final void method857(byte arg0) {
        if (arg0 >= -103) {
            field1601 = null;
        }
        for (int var1 = 0; var1 < class60.field847.length; var1++) {
            for (int var2 = 0; var2 < class60.field847[0].length; var2++) {
                for (int var3 = 0; var3 < class60.field847[0][0].length; var3++) {
                    class60.field847[var1][var2][var3] = 0;
                }
            }
        }
        field1607++;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Z")
    public final boolean method36(boolean arg0) {
        field1604++;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(Z)V")
    public static void method858(boolean arg0) {
        field1601 = null;
        if (arg0) {
            field1602 = -54;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IBI)V")
    public static final void method859(int arg0, byte arg1, int arg2) {
        field1606++;
        class150 var3 = class676.method3885(1000, 15, 0);
        var3.method1116(60);
        var3.field2346 = arg2;
        var3.field2342 = arg0;
        if (arg1 != 5) {
            method858(true);
        }
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method35(byte arg0) {
        field1605++;
        if (arg0 != 88) {
            field1602 = 93;
        }
        return this.field1603;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lvm;Ljava/lang/Object;I)V")
    public class117(class688 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1603 = arg1;
    }
}
