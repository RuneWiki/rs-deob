import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class407 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field6101 = 255;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field6102 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[Lqa;")
    public static class243[] field6100;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[[B")
    public static byte[][] field6104;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)I", line = 17)
    public static final int method2644(int arg0, int arg1, byte arg2) {
        field6106++;
        if (arg2 == 58) {
            int var3 = arg1 >>> 24;
            int var4 = 255 - var3;
            int var5 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
            return (((arg0 & 0xFF00) * var4 & 0xFF0000 | (arg0 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 51)
    public static void method2645(int arg0) {
        if (arg0 != -26610) {
            field6100 = null;
        }
        field6104 = null;
        field6100 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V", line = 89)
    public static final void method2646(int arg0, int arg1, int arg2) {
        field6105++;
        class256 var3 = class363.method2385(arg2, arg0, (byte) 1);
        var3.method1614(arg2 - 5);
        var3.field3756 = arg1;
    }
}
