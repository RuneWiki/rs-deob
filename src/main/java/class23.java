import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class23 extends class135 {

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field291 = 100;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "Lqj;")
    public static class196 field296 = class80.method502("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", -48);

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "Lbk;")
    public static class136 field298;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "Ll;")
    public static class190 field292;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field300;
        int[] var3 = super.field1954.method110(arg0, -128);
        if (arg1) {
            field292 = null;
        }
        if (super.field1954.field244) {
            class37.method186(var3, 0, class131.field1862, this.field299);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public static void method136(int arg0) {
        field292 = null;
        if (arg0 != 0) {
            method136(-43);
        }
        field298 = null;
        field296 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field297;
        if (arg2 != -16231) {
            method136(38);
        }
        if (arg1 == 0) {
            this.field299 = (arg0.method367(1) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class23() {
        this(4096);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
    private class23(int arg0) {
        super(0, true);
        this.field299 = 4096;
        this.field299 = arg0;
    }
}
