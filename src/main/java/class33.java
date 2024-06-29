import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class33 extends class201 {

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Llj;")
    public class25 field492;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Ljd;")
    public static class85 field498 = class221.method1499(" weitere Optionen", (byte) -106);

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "Ljb;")
    public static class255 field501 = null;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Lik;")
    public static class247 field499 = new class247(new byte[5000]);

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lge;")
    public static class68 field496;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)I")
    public static final int method225(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field495++;
        int var5 = 65536 - class173.field2995[arg4 * 1024 / arg2] >> 1;
        if (arg0 != -807166032) {
            method227((byte) 31);
        }
        return ((65536 - var5) * arg1 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static final void method226(byte arg0) {
        if (arg0 != -77) {
            field496 = null;
        }
        field500++;
        class267.field4757.method1270((byte) 107);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
    public static final void method227(byte arg0) {
        class15.field217.method1270((byte) 107);
        field493++;
        class68.field1268.method1270((byte) 107);
        class74.field1381.method1270((byte) 107);
        if (arg0 >= -57) {
            method226((byte) -118);
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
    public static void method228(byte arg0) {
        field496 = null;
        field501 = null;
        if (arg0 == 3) {
            field499 = null;
            field498 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Llj;)V")
    public class33(class25 arg0) {
        this.field492 = arg0;
    }
}
