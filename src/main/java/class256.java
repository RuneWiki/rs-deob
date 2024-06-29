import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class256 extends class105 {

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "B")
    public byte field4057;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "Lah;")
    public static class176 field4056;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "Lfh;")
    public class313 field4055;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)[B", line = 7)
    public final byte[] method697(int arg0) {
        field4052++;
        if (this.field1513 || this.field4055.field5137 < this.field4055.field5124.length - this.field4057) {
            throw new RuntimeException();
        }
        int var2 = 100 / ((arg0 - 24) / 40);
        return this.field4055.field5124;
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "(I)V", line = 25)
    public static void method1817(int arg0) {
        if (arg0 != 20) {
            method1817(100);
        }
        field4056 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I", line = 35)
    public final int method696(byte arg0) {
        field4051++;
        if (arg0 < 97) {
            return -23;
        } else if (this.field4055 == null) {
            return 0;
        } else {
            return this.field4055.field5137 * 100 / (this.field4055.field5124.length - this.field4057);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)I", line = 55)
    public static final int method1818(int arg0, byte arg1, int arg2) {
        field4047++;
        if (arg1 != -23) {
            method1818(-34, (byte) -92, 75);
        }
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lnm;ILnm;)V", line = 84)
    public static final void method1819(class221 arg0, int arg1, class221 arg2) {
        class251.field4010 = arg0;
        class99.field1438 = arg2;
        class251.field4010.method1486(34, -27734);
        field4049++;
        int var3 = arg1 + (int) (Math.random() * 21.0D);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class3.field27 = var3 + var5;
        class150.field2419 = var4 + var5;
        class222.field3435 = var5 + var6;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V", line = 107)
    public static final void method1820(byte arg0) {
        class101.field1458 = null;
        class223.field3449 = null;
        client.field2073 = null;
        class141.field2278 = null;
        if (arg0 <= 70) {
            field4056 = (class176) null;
        }
        field4054++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lnm;IIB)[Llj;", line = 119)
    public static final class289[] method1821(class221 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 82) {
            method1820((byte) 20);
        }
        field4046++;
        return class334.method2361(arg2, arg0, 16836, arg1) ? class77.method527(true) : null;
    }
}
