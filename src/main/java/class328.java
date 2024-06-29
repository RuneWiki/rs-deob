import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class328 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
    public static boolean field5085 = true;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Lqs;")
    public static class560 field5090 = new class560();

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "[I")
    public static int[] field5091;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BILjava/lang/String;)V", line = 9)
    public static final void method2207(byte arg0, int arg1, String arg2) {
        field5088++;
        class413 var3 = class674.method3852(3, arg1, 122);
        var3.method2633(16777215);
        var3.field6339 = arg2;
        if (arg0 >= -107) {
            field5091 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V", line = 23)
    public static final void method2208(int arg0, int arg1, int arg2) {
        field5089++;
        class413 var3 = class674.method3852(arg0, arg1, 124);
        var3.method2633(16777215);
        var3.field6337 = arg2;
    }

    @OriginalMember(owner = "client!ws", name = "toString", descriptor = "()Ljava/lang/String;", line = 35)
    public final String toString() {
        field5086++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLoo;I)V", line = 44)
    public static final void method2209(byte arg0, class580 arg1, int arg2) {
        class422.field6437 = 0;
        class668.field9444 = false;
        int var3 = -94 / ((arg0 + 15) / 54);
        field5087++;
        class43.method529(arg1, (byte) 108);
        class286.method2033(12947, arg1);
        if (class668.field9444) {
            System.out.println("---endgpp---");
        }
        if (arg1.field57 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field57 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(II)V", line = 75)
    public class328(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V", line = 86)
    public static void method2210(byte arg0) {
        field5091 = null;
        if (arg0 >= -106) {
            method2208(-109, -68, 75);
        }
        field5090 = null;
    }
}
