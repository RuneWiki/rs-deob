import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class388 {

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public int field5459 = -1;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Lpf;")
    public static class133 field5458 = new class133(5000);

    @OriginalMember(owner = "client!er", name = "g", descriptor = "Lfn;")
    public static class52 field5463 = new class52(46, 12);

    @OriginalMember(owner = "client!er", name = "i", descriptor = "F")
    public static float field5465 = 0.0F;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Lni;")
    public class33 field5457;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "[I")
    public int[] field5461;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "[Laq;")
    public static class385[] field5462;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field5464;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)I", line = 12)
    public static final int method2306(int arg0, boolean arg1) {
        if (arg1) {
            field5460++;
            return arg0 & 0x3FF;
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 23)
    public static void method2307(int arg0) {
        field5463 = null;
        field5458 = null;
        if (arg0 != 1023) {
            field5463 = null;
        }
        field5462 = null;
    }
}
