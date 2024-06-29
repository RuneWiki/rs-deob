import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class380 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[[B")
    public static byte[][] field5536 = new byte[250][];

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method2368(int arg0) {
        field5536 = null;
        if (arg0 != 1) {
            method2368(-91);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static final void method2369(byte arg0) {
        field5537++;
        int var1 = 0;
        if (class125.field1721.field5160.method3282(43) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class125.field1721.field5167.method1438(43) == 0) {
            var1 |= 0x40;
        }
        class550.method3162(4096, var1);
        class210.field2705.method1364(var1, -103);
        if (arg0 != 22) {
            method2368(125);
        }
        class16.field156.method2125(var1, 4);
        class107.field1507.method3585(var1, arg0 ^ 0x16);
        class641.field8643.method916(var1, 21439);
        class645.method3573(-96, var1);
        class631.method3485(var1, (byte) -75);
        class300.method1944(var1, (byte) 111);
        class340.method2164(var1, 128);
        class452.method2690(11);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(JJ)J")
    public static long method2370(long arg0, long arg1) {
        return arg0 ^ arg1;
    }
}
