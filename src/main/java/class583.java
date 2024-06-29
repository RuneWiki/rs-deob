import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class583 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field7786 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ltm;")
    public static class412 field7785 = new class412();

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Laj;")
    public static class333 field7790;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)I", line = 3)
    public final int method3244(int arg0, long arg1) {
        if (arg0 != 15841) {
            this.method603(-20L, -97);
        }
        field7788++;
        long var4 = this.method601((byte) -96);
        if (var4 > 0L) {
            class438.method2636(true, var4);
        }
        return this.method603(arg1, -21626);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 21)
    public static final void method3245(int arg0) {
        if (arg0 != 0) {
            return;
        }
        class207.field2705.method4180(10293);
        field7787++;
        class549.field7445 = null;
        class633.field8849 = null;
        class99.field1374 = 1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V", line = 44)
    public static final void method3246(int arg0, int arg1) {
        for (class101 var2 = class298.field4316.method3960(arg1); var2 != null; var2 = class298.field4316.method3955((byte) 56)) {
            if (((long) arg0) == (var2.field1409 >> 48 & 0xFFFFL)) {
                var2.method792((byte) -119);
            }
        }
        field7789++;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 64)
    public static void method3247(int arg0) {
        field7785 = null;
        if (arg0 == 22759) {
            field7790 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(JI)I")
    public abstract int method603(long arg0, int arg1);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public abstract void method600(byte arg0);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)J")
    public abstract long method601(byte arg0);

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)J")
    public abstract long method604(byte arg0);
}
