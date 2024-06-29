import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class class403 extends class134 {

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "Lnv;")
    public class417 field5497;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "Ldh;")
    public static class320 field5495 = new class320(107, -1);

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Z")
    public boolean field5490;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V")
    public abstract void method1053(int arg0, int arg1);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)V")
    public abstract void method1048(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static final void method2454(int arg0) {
        class12.method51(64);
        field5491++;
        class591.field8336 = null;
        class82.field858 = null;
        class697.field9811 = null;
        if (arg0 == -18958) {
            class231.field2699 = null;
            class97.field1020 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public abstract void method1050(int arg0);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lwn;IILwn;)V")
    public abstract void method1046(class720 arg0, int arg1, int arg2, class720 arg3);

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Z")
    public final boolean method2455(int arg0) {
        if (arg0 != 0) {
            method2457((byte) 7);
        }
        field5496++;
        return false;
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)Z")
    public final boolean method2456(int arg0) {
        if (arg0 != -1) {
            this.method2459((byte) 37);
        }
        field5498++;
        return this.field5490;
    }

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)Z")
    public abstract boolean method1047(int arg0);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static void method2457(byte arg0) {
        if (arg0 <= -55) {
            field5495 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "(I)Z")
    public abstract boolean method1045(int arg0);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
    public static final void method2458(String arg0, byte arg1, String arg2) {
        class352.field4528 = 1;
        int var3 = -15 % ((arg1 + 1) / 39);
        class126.field1328 = -1;
        field5493++;
        class714.method3989(arg0, false, arg2, 47);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)I")
    public final int method2459(byte arg0) {
        if (arg0 != -66) {
            field5495 = null;
        }
        field5494++;
        return 1;
    }

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "(I)I")
    public int method1052(int arg0) {
        if (arg0 == 0) {
            field5492++;
            return 0;
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lnv;)V")
    public class403(class417 arg0) {
        this.field5497 = arg0;
    }
}
