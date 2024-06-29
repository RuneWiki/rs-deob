import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class656 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field8854 = 16777215;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public int field8860 = 8;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public int field8852;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field8853;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public int field8855;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public int field8856;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public int field8861;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Z")
    public boolean field8859;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLdt;)V", line = 3)
    public final void method3646(byte arg0, class254 arg1) {
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                int var4 = 107 % ((65 - arg0) / 40);
                field8857++;
                return;
            }
            this.method3647(var3, -6, arg1);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILdt;)V", line = 33)
    private final void method3647(int arg0, int arg1, class254 arg2) {
        if (arg1 != -6) {
            this.method3647(104, -125, null);
        }
        if (arg0 == 1) {
            this.field8860 = arg2.method1728((byte) 127);
        } else if (arg0 == 2) {
            this.field8859 = true;
        } else if (arg0 == 3) {
            this.field8852 = arg2.method1695(423951304);
            this.field8855 = arg2.method1695(423951304);
            this.field8861 = arg2.method1695(423951304);
        } else if (arg0 == 4) {
            this.field8853 = arg2.method1731((byte) 64);
        } else if (arg0 == 5) {
            this.field8856 = arg2.method1728((byte) 71);
        } else if (arg0 == 6) {
            this.field8854 = arg2.method1722(false);
        }
        field8858++;
    }
}
