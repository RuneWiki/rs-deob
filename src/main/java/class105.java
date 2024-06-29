import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class105 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "Lsi;")
    public static class586 field1340 = new class586();

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "Lifa;")
    public static class450 field1346 = new class450();

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "Lkja;")
    public static class686 field1347 = new class686();

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "Llja;")
    public static class744 field1348 = new class744(48, 4);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "Ld;")
    public static class162 field1344;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Les;I)Loc;")
    public static final class217 method859(class403 arg0, int arg1) {
        field1341++;
        if (arg1 != 0) {
            method861(-68, -115, true);
        }
        return new class217(arg0.method2365(true), arg0.method2365(true), arg0.method2365(true), arg0.method2365(true), arg0.method2365(true), arg0.method2365(true), arg0.method2365(true), arg0.method2365(true), arg0.method2358(98), arg0.method2396((byte) -122));
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BII)I")
    public final int method860(byte arg0, int arg1, int arg2) {
        field1345++;
        int var4 = arg1 >= class701.field9880 ? arg1 : class701.field9880;
        if (class595.field8082 == this) {
            return 0;
        } else if (class700.field9521 == this) {
            return var4 - arg2;
        } else if (arg0 == -62) {
            return class301.field3601 == this ? (var4 - arg2) / 2 : 0;
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!ps", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1343++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZ)Lwl;")
    public static final class430 method861(int arg0, int arg1, boolean arg2) {
        field1342++;
        long var3 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
        if (arg1 != Integer.MIN_VALUE) {
            method859(null, 26);
        }
        return (class430) class691.field9420.method2121(arg1 - 2147483597, var3);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public static void method862(byte arg0) {
        if (arg0 <= 88) {
            return;
        }
        field1348 = null;
        field1340 = null;
        field1346 = null;
        field1347 = null;
        field1344 = null;
    }
}
