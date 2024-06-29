import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class792 {

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field10888 = -1;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field10889 = new Rectangle[100];

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Llja;")
    public static class744 field10887 = new class744(82, -1);

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field10890;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field10891;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static void method4367(byte arg0) {
        field10887 = null;
        if (arg0 < -12) {
            field10889 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)Z")
    public static final boolean method4368(int arg0, int arg1, byte arg2) {
        int var3 = 41 / ((6 - arg2) / 46);
        field10890++;
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILka;BI)Loba;")
    public static final class276 method4369(int arg0, int arg1, class498 arg2, byte arg3, int arg4) {
        field10891++;
        if (arg2 == null) {
            return null;
        }
        class276 var5 = new class276(arg1, arg0, arg4, arg2.method367(), arg2.method381(), arg2.method383(), arg2.method404(), arg2.method400(), arg2.method361(), arg2.method393());
        if (arg3 != -5) {
            field10887 = null;
        }
        return var5;
    }
}
