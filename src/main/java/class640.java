import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class640 {

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "[I")
    public static int[] field8984 = new int[3];

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "Lmia;")
    public static class63 field8988 = new class63(10, 7);

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "[I")
    public static int[] field8989 = new int[2];

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public int field8982;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public int field8983;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public int field8985;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "Lvd;")
    public static class39 field8990;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
    public static void method3674(byte arg0) {
        if (arg0 != -30) {
            field8984 = null;
        }
        field8990 = null;
        field8988 = null;
        field8984 = null;
        field8989 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lvd;I[ILvd;)V")
    public static final void method3675(class39 arg0, int arg1, int[] arg2, class39 arg3) {
        class256.field3683 = arg3;
        class323.field4609 = arg0;
        if (arg1 > 94) {
            if (arg2 != null) {
                class716.field10074 = arg2;
            }
            field8986++;
        }
    }
}
