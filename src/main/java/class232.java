import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class232 extends class616 implements class90 {

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
    private int field3491;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
    public static int field3488 = 0;

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
    public static int field3493 = 0;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!iw", name = "t", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!iw", name = "u", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!iw", name = "v", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)I", line = 3)
    public final int method665(boolean arg0) {
        ++field3494;
        if (!arg0) {
            field3493 = 30;
        }
        return this.field3491;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 19)
    public static final String method1592(String arg0, byte arg1) {
        if (arg1 != -78) {
            method1593((byte) 29, 59);
        }
        ++field3497;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 - -4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (~var4 <= -1) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var5 > var6; ++var6) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BI)Z", line = 66)
    public static final boolean method1593(byte arg0, int arg1) {
        ++field3495;
        if (arg0 >= -120) {
            field3488 = 57;
        }
        return ~arg1 == -8 || ~arg1 == -9 || ~arg1 == -10;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)I", line = 79)
    public final int method664(int arg0) {
        if (arg0 != -31593) {
            this.method1594(113);
        }
        ++field3492;
        return super.field8648;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)J", line = 90)
    public final long method662(int arg0) {
        if (arg0 != 28748) {
            this.field3491 = 10;
        }
        ++field3496;
        return 0L;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lpq;I[BIZ)V", line = 107)
    public class232(class194 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3491 = arg1;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(III[B)V", line = 115)
    public final void method663(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method3556(arg3, (byte) -56, arg2);
        ++field3489;
        this.field3491 = arg0;
        if (arg1 >= -39) {
            field3488 = -100;
        }
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V", line = 130)
    public final void method1594(int arg0) {
        ++field3490;
        if (arg0 != -9) {
            field3493 = 52;
        }
        super.field8655.method1272(this, (byte) 110);
    }
}
