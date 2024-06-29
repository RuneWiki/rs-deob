import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class194 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field2591 = -1;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Z")
    public static boolean field2589 = false;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2599 = "slide:";

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2602 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field2592;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field2593;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[Ldk;")
    public static class432[] field2604;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)Z")
    public static final boolean method1163(boolean arg0) {
        field2598++;
        if (arg0) {
            method1164((class405) null, false);
        }
        class212 var1 = (class212) class321.field4726.field663.field641;
        if (var1 == null || class321.field4726.field663 == var1) {
            return false;
        } else {
            if (var1.field2836 >= 2000) {
                var1.field2836 -= 2000;
            }
            return var1.field2836 == 1003;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lii;Z)V")
    public static final void method1164(class405 arg0, boolean arg1) {
        if (class282.field4109) {
            class240.method1443(16, arg0);
        } else {
            class235.method1411((byte) 89, arg0);
        }
        field2595++;
        if (arg1) {
            method1163(false);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method1165(int arg0) {
        field2604 = null;
        if (arg0 != -2001) {
            field2602 = null;
        }
        field2599 = null;
        field2602 = null;
    }
}
