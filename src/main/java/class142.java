import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class142 extends class525 {

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "Ltb;")
    public class280 field2192;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "Llr;")
    public class539 field2191;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "J")
    public static long field2183 = 0L;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "Z")
    public static boolean field2186 = false;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "Lqv;")
    public static class316 field2188 = new class316(22, 0);

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "Lhl;")
    public static class375 field2196 = new class375(16);

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V", line = 9)
    public final void method1026(byte arg0) {
        this.field2190 = this.field2192.field4178;
        this.field2189 = this.field2192.field4172;
        field2195++;
        this.field2187 = this.field2192.field4166;
        if (this.field2192.field4171 != null) {
            this.field2192.field4171.method42(this.field2191.field7923, this.field2191.field7924, this.field2191.field7934, class71.field1159);
        }
        this.field2194 = class71.field1159[0];
        if (arg0 != 77) {
            this.method1026((byte) -113);
        }
        this.field2185 = class71.field1159[2];
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IB)V", line = 33)
    public static final void method1027(int arg0, byte arg1) {
        if (arg1 < 40) {
            field2196 = null;
        }
        field2193++;
        class211.field3186.method2989(false, arg0);
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V", line = 49)
    public static final void method1028(int arg0) {
        class101.method745();
        field2184++;
        if (arg0 != 22) {
            field2196 = null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class19.field213[var1].method1129((byte) -43);
        }
        class322.method2064(false);
        class501.method2928(false);
        System.gc();
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V", line = 71)
    public static void method1029(int arg0) {
        field2196 = null;
        if (arg0 <= -126) {
            field2188 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ltb;Luh;)V", line = 93)
    public class142(class280 arg0, class115 arg1) {
        this.field2192 = arg0;
        this.field2191 = this.field2192.method1801((byte) 71);
        this.method1026((byte) 77);
    }
}
