import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class class429 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public int field5688;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public int field5685;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public int field5686;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IBI)V")
    public abstract void method57(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIB)V")
    public abstract void method55(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Z")
    public static final boolean method2304(int arg0, int arg1) {
        field5689++;
        if (arg0 != 15311) {
            method2304(-122, 35);
        }
        if (arg1 == 3 || arg1 == 45 || arg1 == 58 || arg1 == 5 || arg1 == 1011) {
            return true;
        } else {
            return arg1 == 30 || arg1 == 1009;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IBI)V")
    public abstract void method54(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(III)V")
    public class429(int arg0, int arg1, int arg2) {
        this.field5688 = arg1;
        this.field5685 = arg2;
        this.field5686 = arg0;
    }
}
