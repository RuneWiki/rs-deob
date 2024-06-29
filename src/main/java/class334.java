import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class334 {

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Lgk;")
    public static class331 field4633 = new class331("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "[I")
    public static int[] field4634 = new int[2048];

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "Ltn;")
    public static class59 field4636 = new class59();

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIZI)I")
    public static final int method2037(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4635++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (arg2) {
            return -91;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public static void method2038(byte arg0) {
        int var1 = -24 % ((arg0 + 65) / 55);
        field4634 = null;
        field4633 = null;
        field4636 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)I")
    public static final int method2039(int arg0, int arg1, int arg2) {
        int var3 = -51 % ((23 - arg0) / 37);
        field4632++;
        int var4 = class525.method3114((byte) 126, arg2 - 1, arg1 + -1) + class525.method3114((byte) 119, arg2 - 1, arg1 + 1) + class525.method3114((byte) 123, arg2 - -1, arg1 + -1) + class525.method3114((byte) 124, arg2 + 1, arg1 + 1);
        int var5 = class525.method3114((byte) 124, arg2, arg1 - 1) + class525.method3114((byte) 122, arg2, arg1 + 1) + (class525.method3114((byte) 127, arg2 + -1, arg1) - -class525.method3114((byte) 120, arg2 + 1, arg1));
        int var6 = class525.method3114((byte) 119, arg2, arg1);
        return var4 / 16 - (-(var5 / 8) - var6 / 4);
    }
}
