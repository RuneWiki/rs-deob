import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class276 extends class681 {

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "[Lut;")
    public static class109[] field3810 = new class109[14];

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "Lgi;")
    public static class631 field3814 = new class631();

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(Z)V", line = 3)
    public static void method1720(boolean arg0) {
        field3814 = null;
        field3810 = null;
        if (!arg0) {
            field3817 = 97;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZI)V", line = 16)
    public final void method739(boolean arg0, int arg1) {
        if (arg1 == 7) {
            ++field3816;
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lnv;)V", line = 27)
    public class276(class382 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "(I)V", line = 30)
    public final void method740(int arg0) {
        ++field3815;
        if (arg0 != -3) {
            this.method744(89, (class218) null, -103);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIB)V", line = 46)
    public final void method742(int arg0, int arg1, byte arg2) {
        int var4 = -74 / ((-38 - arg2) / 35);
        ++field3811;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(ZI)V", line = 55)
    public final void method741(boolean arg0, int arg1) {
        ++field3812;
        if (arg1 != 3) {
            this.method751(false);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILrga;I)V", line = 70)
    public final void method744(int arg0, class218 arg1, int arg2) {
        if (arg2 == -3) {
            super.field9721.method2241(arg1, (byte) 44);
            ++field3818;
            super.field9721.method2246(arg0, 26770);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)Z", line = 87)
    public final boolean method751(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field3813;
            return false;
        }
    }
}
