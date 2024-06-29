import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class338 extends class13 {

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lwe;")
    public class408 field4762;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "[I")
    public static int[] field4761 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2137(int arg0, byte arg1, int arg2) {
        field4760++;
        if (arg1 < 109) {
            return false;
        } else {
            return (arg2 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method2138(int arg0) {
        if (arg0 > -64) {
            method2137(-45, (byte) 72, -104);
        }
        field4761 = null;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1164(int arg0);

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lwe;I)V")
    public class338(class408 arg0, int arg1) {
        this.field4762 = arg0;
        this.field4759 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)Z")
    public abstract boolean method1165(byte arg0);
}
