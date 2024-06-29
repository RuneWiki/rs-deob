import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class431 extends class405 {

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "Lada;")
    public static class144 field5777 = new class144(55, -2);

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "Z")
    public static boolean field5778 = false;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field5779 = -1;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BIII)V", line = 5)
    public final void method1437(byte arg0, int arg1, int arg2, int arg3) {
        super.field5537 = arg2;
        super.field5533 = arg3;
        super.field5536 = arg1;
        ++field5775;
        int var5 = 47 % ((arg0 - -59) / 53);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FZ)V", line = 17)
    public final void method1439(float arg0, boolean arg1) {
        if (arg1) {
            method2523((byte) 80);
        }
        ++field5774;
        super.field5546 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V", line = 30)
    public static void method2523(byte arg0) {
        int var1 = 49 % ((arg0 - 68) / 35);
        field5777 = null;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IIIIIF)V", line = 40)
    public class431(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "(I)V", line = 51)
    public static final void method2524(int arg0) {
        class402.method2367(class78.field1033, (byte) 119);
        ++field5776;
        ++class623.field9184;
        int var1 = -47 % ((arg0 - 40) / 46);
        class112.field1589.method1027(255, class404.field5531);
    }
}
