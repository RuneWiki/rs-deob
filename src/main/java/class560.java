import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class560 {

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "Z")
    public boolean field7672 = true;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "Ltq;")
    public static class654 field7673 = new class654("", 15);

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "Laf;")
    public static class459 field7678 = new class459(15000);

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field7682 = new String[100];

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "[I")
    public static int[] field7681 = new int[4096];

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "C")
    private char field7676;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
    public int field7679;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "Luq;")
    public static class172 field7680;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "Ljava/lang/String;")
    public String field7683;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILdt;B)V", line = 3)
    private final void method3195(int arg0, class254 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field7676 = class207.method1357(true, arg1.method1737(true));
        } else if (arg0 == 2) {
            this.field7679 = arg1.method1672(-16516);
        } else if (arg0 == 4) {
            this.field7672 = false;
        } else if (arg0 == 5) {
            this.field7683 = arg1.method1699(arg2 ^ 0xFFFFFFB8);
        }
        field7675++;
        if (arg2 != 30) {
            method3197(true);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)Z", line = 40)
    public final boolean method3196(int arg0) {
        if (arg0 >= -84) {
            this.method3195(35, null, (byte) -18);
        }
        field7674++;
        return this.field7676 == 's';
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)V", line = 55)
    public static void method3197(boolean arg0) {
        field7680 = null;
        field7678 = null;
        field7673 = null;
        if (arg0) {
            method3197(false);
        }
        field7682 = null;
        field7681 = null;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLdt;)V", line = 79)
    public final void method3198(byte arg0, class254 arg1) {
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                if (arg0 != 17) {
                    this.method3198((byte) -12, null);
                }
                field7677++;
                return;
            }
            this.method3195(var3, arg1, (byte) 30);
        }
    }
}
