import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class624 {

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public int field8868 = -1;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Z")
    public boolean field8875 = false;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public int field8869 = 1;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public int field8873 = 64;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public int field8871 = 2;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public int field8870 = 64;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Z")
    public boolean field8877 = false;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Llc;")
    public static class435 field8874 = new class435(15, 17);

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Lgr;")
    public static class530 field8878 = new class530(54, 3);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "[I")
    public static int[] field8879;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "[I")
    public static int[] field8880;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILsl;II)V", line = 21)
    private final void method3603(int arg0, class479 arg1, int arg2, int arg3) {
        field8872++;
        if (arg3 != -6) {
            this.method3605(null, -36, (byte) 26);
        }
        if (arg2 == 1) {
            this.field8868 = arg1.method2882(-1);
            if (this.field8868 == 65535) {
                this.field8868 = -1;
                return;
            }
        } else if (arg2 == 2) {
            this.field8873 = arg1.method2882(-1) + 1;
            this.field8870 = arg1.method2882(-1) + 1;
        } else if (arg2 == 3) {
            arg1.method2915(-118);
            return;
        } else if (arg2 == 4) {
            this.field8871 = arg1.method2886(true);
            return;
        } else if (arg2 == 5) {
            this.field8869 = arg1.method2886(true);
            return;
        } else {
            if (arg2 == 6) {
                this.field8875 = true;
            } else if (arg2 == 7) {
                this.field8877 = true;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 70)
    public static void method3604(int arg0) {
        field8880 = null;
        if (arg0 >= 94) {
            field8878 = null;
            field8879 = null;
            field8874 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lsl;IB)V", line = 83)
    public final void method3605(class479 arg0, int arg1, byte arg2) {
        field8876++;
        if (arg2 != 117) {
            return;
        }
        while (true) {
            int var4 = arg0.method2886(true);
            if (var4 == 0) {
                return;
            }
            this.method3603(arg1, arg0, var4, -6);
        }
    }
}
