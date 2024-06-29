import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class506 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field7447 = 8;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field7452 = 16777215;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "[F")
    public static float[] field7457 = new float[4];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public int field7445;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public int field7449;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field7450;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field7454;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public int field7455;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Ltr;")
    public static class195 field7448;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Z")
    public boolean field7446;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILnj;)V")
    public final void method3032(int arg0, class164 arg1) {
        field7453++;
        if (arg0 != -1) {
            this.field7445 = 22;
        }
        while (true) {
            int var3 = arg1.method1087(false);
            if (var3 == 0) {
                return;
            }
            this.method3033(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZLnj;)V")
    private final void method3033(int arg0, boolean arg1, class164 arg2) {
        field7456++;
        if (arg0 == 1) {
            this.field7447 = arg2.method1074(-635989152);
        } else if (arg0 == 2) {
            this.field7446 = true;
        } else if (arg0 == 3) {
            this.field7449 = arg2.method1056(1024);
            this.field7445 = arg2.method1056(1024);
            this.field7455 = arg2.method1056(1024);
        } else if (arg0 == 4) {
            this.field7454 = arg2.method1087(false);
        } else if (arg0 == 5) {
            this.field7450 = arg2.method1074(-635989152);
        } else if (arg0 == 6) {
            this.field7452 = arg2.method1090(-1);
        }
        if (arg1) {
            this.field7452 = 30;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
    public static final boolean method3034(int arg0, int arg1) {
        field7451++;
        int var2 = 88 % ((arg0 + 14) / 36);
        return arg1 == 6 || arg1 == 8;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method3035(byte arg0) {
        if (arg0 <= 92) {
            field7457 = null;
        }
        field7448 = null;
        field7457 = null;
    }
}
