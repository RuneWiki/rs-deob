import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class560 extends class775 {

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
    private int field7527 = -1;

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "B")
    private byte field7528;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
    private int field7523;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!tp", name = "A", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "Ljava/lang/String;")
    private String field7524;

    @OriginalMember(owner = "client!tp", name = "B", descriptor = "[[B")
    public static byte[][] field7531;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V", line = 3)
    public static void method3147(int arg0) {
        field7531 = null;
        if (arg0 != 2) {
            field7530 = -59;
        }
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "(I)V", line = 17)
    public static final void method3148(int arg0) {
        field7522++;
        class15[] var1 = class90.field1244;
        synchronized (class90.field1244) {
            int var2 = -62 / ((arg0 - 34) / 40);
            for (int var3 = 0; var3 < class90.field1244.length; var3++) {
                class90.field1244[var3] = new class15();
                class303.field4362[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILjp;)V", line = 42)
    public final void method2934(int arg0, class376 arg1) {
        field7525++;
        this.field7527 = arg1.method2359(-1);
        this.field7528 = arg1.method2387((byte) 48);
        this.field7523 = arg1.method2359(arg0 - 4);
        arg1.method2366(true);
        this.field7524 = arg1.method2379((byte) 85);
        if (arg0 != 3) {
            field7531 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V", line = 61)
    public static final void method3149(byte arg0) {
        class156.field2150 = (int) ((double) class597.field8132 * 34.46D);
        field7529++;
        class632.field8831 = 200;
        if (arg0 != -109) {
            field7531 = null;
        }
        class156.field2150 <<= 0x2;
        if (class379.field5542.method542()) {
            class156.field2150 += 512;
        }
        class565.method3163(false, (byte) -102);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLhka;)V", line = 87)
    public final void method2935(byte arg0, class56 arg1) {
        field7532++;
        class179 var3 = arg1.field786[this.field7527];
        var3.field2378 = this.field7524;
        var3.field2381 = this.field7528;
        int var4 = 86 / ((-arg0 - 58) / 57);
        var3.field2382 = this.field7523;
    }
}
