import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class539 extends class490 {

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "Ldj;")
    public static class362 field7586 = new class362(512);

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "B")
    private byte field7585;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "B")
    private byte field7588;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "Ljava/lang/String;")
    private String field7584;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBI)V")
    public static final void method3196(int arg0, byte arg1, int arg2) {
        field7589++;
        class714 var3 = class350.method2072((long) arg0 | (long) arg2 << 32, 18, (byte) 108);
        var3.method4044((byte) -128);
        if (arg1 < 12) {
            field7586 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Les;I)V")
    public final void method2457(class403 arg0, int arg1) {
        field7591++;
        if (arg1 < 118) {
            method3198((byte) 56);
        }
        this.field7584 = arg0.method2383(7540);
        if (this.field7584 != null) {
            arg0.method2396((byte) -99);
            this.field7588 = arg0.method2392(-1);
            this.field7585 = arg0.method2392(-67);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V")
    public static final void method3197(int arg0, int arg1, int arg2) {
        if (arg2 == 18) {
            field7587++;
            class714 var3 = class350.method2072((long) arg0, 16, (byte) 107);
            var3.method4043(arg2 + 6362);
            var3.field10021 = arg1;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public static void method3198(byte arg0) {
        int var1 = -36 / ((arg0 + 56) / 44);
        field7586 = null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3199(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method3196(-107, (byte) -50, 17);
        }
        field7592++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lwt;I)V")
    public final void method2459(class330 arg0, int arg1) {
        if (arg1 != 0) {
            this.method2457(null, -72);
        }
        if (this.field7584 != null) {
            arg0.field4090 = this.field7588;
            arg0.field4087 = this.field7585;
        }
        field7590++;
        arg0.field4074 = this.field7584;
    }
}
