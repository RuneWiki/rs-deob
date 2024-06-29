import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class414 {

    @OriginalMember(owner = "client!aka", name = "d", descriptor = "I")
    public int field5679 = -1;

    @OriginalMember(owner = "client!aka", name = "g", descriptor = "I")
    public int field5682 = -1;

    @OriginalMember(owner = "client!aka", name = "i", descriptor = "I")
    public static int field5684 = -1;

    @OriginalMember(owner = "client!aka", name = "j", descriptor = "I")
    public static int field5685 = 0;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "Lsv;")
    public static class570 field5676 = new class570(3, 3);

    @OriginalMember(owner = "client!aka", name = "l", descriptor = "F")
    public static float field5687;

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!aka", name = "c", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!aka", name = "e", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!aka", name = "h", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!aka", name = "k", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!aka", name = "m", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!aka", name = "f", descriptor = "[I")
    public int[] field5681;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILol;)V")
    public final void method2435(int arg0, class431 arg1) {
        field5677++;
        if (arg0 != -4) {
            this.method2435(4, null);
        }
        while (true) {
            int var3 = arg1.method2557(arg0 ^ 0xFFFFC5AD);
            if (var3 == 0) {
                return;
            }
            this.method2436(arg1, (byte) -81, var3);
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lol;BI)V")
    private final void method2436(class431 arg0, byte arg1, int arg2) {
        if (arg1 >= -79) {
            this.field5682 = -121;
        }
        field5683++;
        if (arg2 == 1) {
            this.field5682 = arg0.method2565((byte) -83);
        } else if (arg2 == 2) {
            this.field5681 = new int[arg0.method2557(14929)];
            for (int var4 = 0; var4 < this.field5681.length; var4++) {
                this.field5681[var4] = arg0.method2565((byte) -98);
            }
        } else if (arg2 == 3) {
            this.field5679 = arg0.method2557(14929);
            return;
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)V")
    public static void method2437(int arg0) {
        field5676 = null;
        if (arg0 < 76) {
            method2438(true, 4);
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2438(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field5686++;
            return arg1 == 3 || arg1 == 5 || arg1 == 6;
        }
    }
}
