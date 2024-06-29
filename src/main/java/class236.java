import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class236 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field3631 = 2;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
    public boolean field3634 = false;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field3633 = 1;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field3632 = -1;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public int field3640 = 64;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field3641 = 64;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Z")
    public boolean field3635 = false;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3643 = "";

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "F")
    public static float field3630;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[I")
    public static int[] field3639;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 3)
    public static void method1545(int arg0) {
        field3643 = null;
        field3639 = null;
        if (arg0 != -16979) {
            field3643 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILnn;II)V", line = 29)
    private final void method1546(int arg0, class289 arg1, int arg2, int arg3) {
        field3636++;
        if (arg3 == 1) {
            this.field3632 = arg1.method1841((byte) -121);
            if (this.field3632 == 65535) {
                this.field3632 = -1;
            }
        } else if (arg3 == 2) {
            this.field3641 = arg1.method1841((byte) -124) + 1;
            this.field3640 = arg1.method1841((byte) -120) + 1;
        } else if (arg3 == 3) {
            arg1.method1816(true);
        } else if (arg3 == 4) {
            this.field3631 = arg1.method1858(arg0 ^ 0xCB1);
        } else if (arg3 == 5) {
            this.field3633 = arg1.method1858(-3256);
        } else if (arg3 == 6) {
            this.field3635 = true;
        } else if (arg3 == 7) {
            this.field3634 = true;
        }
        if (arg0 != -7) {
            field3630 = 0.120768085F;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZI)V", line = 79)
    public static final void method1547(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3643 = null;
        }
        field3637++;
        class322.field4926 = arg0 - class319.field4869;
        class79.field1578 = arg2 - class319.field4876;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLnn;I)V", line = 108)
    public final void method1548(boolean arg0, class289 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1858(-3256);
            if (var4 == 0) {
                if (arg0) {
                    return;
                }
                field3638++;
                return;
            }
            this.method1546(-7, arg1, arg2, var4);
        }
    }
}
