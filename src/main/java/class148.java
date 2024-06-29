import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class148 {

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "J")
    private long field2506;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    private int field2500;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Lla;")
    public static class395 field2503;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V", line = 4)
    public static void method1128(byte arg0) {
        field2503 = null;
        int var1 = -4 / ((-arg0 - 34) / 54);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Lefa;", line = 15)
    public final class324 method1129(int arg0, int arg1) {
        field2507++;
        if (arg1 <= 70) {
            method1128((byte) -80);
        }
        return class324.method1938(this.method1131(10785, arg0), (byte) 122);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILefa;)V", line = 27)
    private final void method1130(int arg0, class324 arg1) {
        this.field2506 |= (arg1.field4507 << this.field2500++ * class324.field4517);
        field2505++;
        if (arg0 <= 4) {
            this.method1131(-61, -32);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)I", line = 39)
    private final int method1131(int arg0, int arg1) {
        if (arg0 == 10785) {
            field2501++;
            return (int) (this.field2506 >> class324.field4517 * arg1) & 0xF;
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I", line = 52)
    public final int method1132(int arg0) {
        if (arg0 > -118) {
            this.field2506 = 5L;
        }
        field2502++;
        return this.field2500;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lefa;)V", line = 64)
    public class148(class324 arg0) {
        this.field2506 = arg0.field4507;
        this.field2500 = 1;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "([Lefa;)V", line = 72)
    public class148(class324[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1130(30, arg0[var2]);
        }
    }
}
