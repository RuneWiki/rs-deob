import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class37 extends class45 {

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field502 = 0;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "F")
    public static float field503;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "J")
    public static long field500;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Llp;")
    public static class202 field501;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "[[B")
    public static byte[][] field506;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method208(byte arg0) {
        field506 = null;
        field501 = null;
        int var1 = -24 % ((-arg0 - 51) / 33);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public static final void method209(byte arg0) {
        class380 var1 = class133.field1843;
        synchronized (class133.field1843) {
            class133.field1843.method2172(-15112);
        }
        field504++;
        if (arg0 >= -45) {
            field502 = 27;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class37() {
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
    public class37(int arg0) {
        this.field505 = arg0;
    }
}
