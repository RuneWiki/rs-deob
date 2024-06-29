import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class603 {

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public int field8575 = 16777215;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public int field8577 = 8;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Lhga;")
    public static class158 field8574 = new class158(90, 6);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public int field8568;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public int field8572;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public int field8573;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public int field8576;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public int field8578;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Z")
    public boolean field8567;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI[BI)[B", line = 9)
    public static final byte[] method3513(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field8570++;
        if (!arg0) {
            field8574 = null;
        }
        byte[] var4 = new byte[arg1];
        class398.method2566(arg2, arg3, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 27)
    public static void method3514(boolean arg0) {
        field8574 = null;
        if (arg0) {
            method3514(false);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lie;II)V", line = 43)
    private final void method3515(class6 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field8577 = arg0.method67(12021);
        } else if (arg1 == 2) {
            this.field8567 = true;
        } else if (arg1 == 3) {
            this.field8578 = arg0.method45(-8652);
            this.field8568 = arg0.method45(-8652);
            this.field8576 = arg0.method45(-8652);
        } else if (arg1 == 4) {
            this.field8572 = arg0.method70(-9059);
        } else if (arg1 == 5) {
            this.field8573 = arg0.method67(12021);
        } else if (arg1 == 6) {
            this.field8575 = arg0.method86(-26);
        }
        field8571++;
        if (arg2 <= 3) {
            this.field8573 = 102;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLie;)V", line = 93)
    public final void method3516(byte arg0, class6 arg1) {
        int var3 = -70 % ((arg0 - 54) / 55);
        while (true) {
            int var4 = arg1.method70(-9059);
            if (var4 == 0) {
                field8569++;
                return;
            }
            this.method3515(arg1, var4, 70);
        }
    }
}
