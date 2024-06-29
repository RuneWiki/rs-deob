import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class291 extends class485 {

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "Ltea;")
    public class238 field3585;

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "[[S")
    public static short[][] field3581;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V", line = 4)
    public static void method1732(int arg0) {
        if (arg0 >= -8) {
            field3583 = 38;
        }
        field3581 = null;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([BB)V", line = 22)
    public static final void method1733(byte[] arg0, byte arg1) {
        field3580++;
        if (arg1 >= -20) {
            return;
        }
        class244 var2 = new class244(arg0);
        while (true) {
            int var3 = var2.method1423(-20);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class166.field1851 = var2.method1476(50);
            }
        }
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lnv;II[B)V", line = 48)
    public class291(class417 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3585 = class735.method4094(6406, arg1, arg2, false, arg3, 6406, arg0, 113);
        this.field3585.method4018(false, false, (byte) 125);
    }
}
