import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class298 extends class85 {

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4702 = "Loaded update list";

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static volatile int field4703 = 0;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field4700 = 0;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4707 = "Connecting to update server";

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "B")
    public byte field4706;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "I")
    public int field4711;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "Lak;")
    public static class172 field4705;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Lf;")
    public static class201 field4698;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "Ljj;")
    public class44 field4710;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)V", line = 14)
    public static final void method2122(int arg0, int arg1, byte arg2) {
        if (arg2 != -94) {
            method2122(33, 7, (byte) -44);
        }
        field4709++;
        int var3 = class210.field3447 * arg0 >> 8;
        if (arg1 == -1 && !class137.field2164) {
            class224.method1592((byte) -124);
        } else if (arg1 != -1 && (class108.field1584 != arg1 || !class11.method61(0)) && var3 != 0 && !class137.field2164) {
            class83.method560(var3, 0, 2, class243.field3846, (byte) 33, arg1, false);
        }
        class108.field1584 = arg1;
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)I", line = 40)
    public final int method579(int arg0) {
        if (arg0 >= -43) {
            field4707 = (String) null;
        }
        field4701++;
        return this.field4710 == null ? 0 : this.field4710.field586 * 100 / (this.field4710.field573.length - this.field4706);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)[B", line = 57)
    public final byte[] method578(int arg0) {
        field4708++;
        if (this.field1190 || this.field4710.field573.length - this.field4706 > this.field4710.field586) {
            throw new RuntimeException();
        }
        if (arg0 != 26) {
            method2124((class133) null, -69);
        }
        return this.field4710.field573;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V", line = 78)
    public static void method2123(byte arg0) {
        field4707 = null;
        field4702 = null;
        field4698 = null;
        field4705 = null;
        if (arg0 != 14) {
            method2122(-106, 72, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lkm;I)V", line = 92)
    public static final void method2124(class133 arg0, int arg1) {
        if (arg1 == 2) {
            field4699++;
            class18.field254 = arg0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILak;)V", line = 113)
    public static final void method2125(int arg0, class172 arg1) {
        field4697++;
        class108.field1607 = arg1;
        class219.field3543 = class108.field1607.method1299(16, (byte) 125);
        if (arg0 != -1) {
            method2123((byte) 92);
        }
    }
}
