import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class472 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public int field6836 = -1;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public int field6838 = 2;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Z")
    public boolean field6839 = false;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public int field6841 = 64;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Z")
    public boolean field6845 = false;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public int field6837 = 1;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public int field6846 = 64;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[B")
    public static byte[] field6840 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lek;")
    public static class352 field6843 = new class352(8);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILfh;I)V", line = 7)
    private final void method2845(int arg0, int arg1, class463 arg2, int arg3) {
        if (arg0 == 1) {
            this.field6836 = arg2.method2758((byte) 82);
            if (this.field6836 == 65535) {
                this.field6836 = -1;
            }
        } else if (arg0 == 2) {
            this.field6841 = arg2.method2758((byte) 127) + 1;
            this.field6846 = arg2.method2758((byte) 109) + 1;
        } else if (arg0 == 3) {
            arg2.method2793(32767);
        } else if (arg0 == 4) {
            this.field6838 = arg2.method2737(false);
        } else if (arg0 == 5) {
            this.field6837 = arg2.method2737(false);
        } else if (arg0 == 6) {
            this.field6845 = true;
        } else if (arg0 == 7) {
            this.field6839 = true;
        }
        field6844++;
        if (arg1 != 14750) {
            this.field6839 = true;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 56)
    public static void method2846(int arg0) {
        field6843 = null;
        field6840 = null;
        if (arg0 != 12250) {
            field6840 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BILfh;)V", line = 83)
    public final void method2847(byte arg0, int arg1, class463 arg2) {
        field6842++;
        int var4 = 82 % ((arg0 - 11) / 35);
        while (true) {
            int var5 = arg2.method2737(false);
            if (var5 == 0) {
                return;
            }
            this.method2845(var5, 14750, arg2, arg1);
        }
    }
}
