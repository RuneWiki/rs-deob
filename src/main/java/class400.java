import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class400 {

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Lrm;")
    public static class428 field5681 = new class428();

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public int field5677;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public int field5678;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public int field5679;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public int field5680;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public int field5682;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public int field5683;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public int field5684;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public int field5685;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    public int field5687;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public int field5688;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public int field5689;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)V")
    public static final void method2427(boolean arg0, int arg1) {
        field5690++;
        if (!arg0) {
            class637.field8967 = arg1;
            class634.field8944.method2364(1);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILes;)Z")
    public final boolean method2428(int arg0, class400 arg1) {
        if (arg0 > -56) {
            return true;
        } else {
            field5686++;
            return this.field5680 == arg1.field5680 && this.field5684 == arg1.field5684 && this.field5683 == arg1.field5683;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
    public static void method2429(int arg0) {
        field5681 = null;
        if (arg0 != -7957) {
            method2427(true, 30);
        }
    }
}
