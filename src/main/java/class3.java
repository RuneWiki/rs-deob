import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 implements class758 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lgm;")
    private class123 field21;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "Lvr;")
    private class136 field23;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field20 = -1;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Lpia;")
    public static class94 field25 = new class94(24, 3);

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Lso;")
    public static class468 field26 = new class468(10, 3);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Lcc;")
    public static class728 field18;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
    public static void method8(boolean arg0) {
        field25 = null;
        if (!arg0) {
            field27 = 46;
        }
        field26 = null;
        field18 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)Z")
    public final boolean method9(byte arg0) {
        if (arg0 == 119) {
            field17++;
            return this.field21.method792(arg0 - 39);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;IILda;IB)I")
    private final int method10(String arg0, int arg1, int arg2, class59 arg3, int arg4, byte arg5) {
        field24++;
        return arg5 == 28 ? arg3.method459(this.field23.field1551, 0, null, null, this.field23.field1554 - (arg2 * 2), null, 0, 0, this.field23.field1544, arg2 + arg4, 0, 0, arg0, this.field23.field1552 - (arg2 * 2), arg1 - -arg2, 0) : -107;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 != 23169) {
            field27 = 121;
        }
        field22++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZI)V")
    public final void method12(boolean arg0, int arg1) {
        int var3 = 119 / ((-arg1 - 56) / 42);
        field19++;
        class116 var4 = this.field21.method788(true, this.field23.field1553);
        if (var4 == null) {
            return;
        }
        int var5 = this.field23.field1540.method2395(class12.field92, (byte) -48, this.field23.field1554) + this.field23.field1543;
        int var6 = this.field23.field1549.method1280(true, class181.field2143, this.field23.field1552) + this.field23.field1548;
        if (this.field23.field1539) {
            class275.field3370.method399(var5, var6, this.field23.field1554, this.field23.field1552, this.field23.field1545, 0);
        }
        int var7 = var6 + this.method10(var4.field1208, var6, 5, class567.field8070, var5, (byte) 28) * 12;
        int var10 = var7 + 8;
        if (this.field23.field1539) {
            class275.field3370.method380(var5, var10, this.field23.field1554 + var5 - 1, var10, this.field23.field1545, 0);
        }
        var7 = var10 + 1;
        int var8 = var7 + this.method10(var4.field1210, var7, 5, class567.field8070, var5, (byte) 28) * 12;
        int var11 = var8 + 5;
        int var10000 = var11 + this.method10(var4.field1209, var11, 5, class567.field8070, var5, (byte) 28) * 12;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lgm;Lvr;)V")
    public class3(class123 arg0, class136 arg1) {
        this.field21 = arg0;
        this.field23 = arg1;
    }
}
