import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class347 extends class695 {

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public static int field4431 = 0;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "Z")
    public static boolean field4428 = false;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "Lnj;")
    public static class415 field4433 = new class415(66, 2);

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "[I")
    public static int[] field4429;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 4)
    public final void method491(int arg0) {
        super.field9493.method3144(false, -2);
        ++field4427;
        if (arg0 < 38) {
            this.method491(5);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lnm;ZI)V", line = 15)
    public final void method488(class391 arg0, boolean arg1, int arg2) {
        super.field9493.method3091(true, arg0);
        ++field4430;
        super.field9493.method3072((byte) -57, arg2);
        if (arg1) {
            field4429 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)Z", line = 29)
    public final boolean method494(boolean arg0) {
        if (!arg0) {
            field4429 = null;
        }
        ++field4432;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V", line = 42)
    public final void method489(int arg0, int arg1, int arg2) {
        if (arg2 < 69) {
            this.method495(-54, false);
        }
        ++field4434;
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(B)V", line = 57)
    public static void method1994(byte arg0) {
        field4433 = null;
        field4429 = null;
        int var1 = 33 / ((42 - arg0) / 54);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)V", line = 69)
    public final void method495(int arg0, boolean arg1) {
        if (arg0 != 1) {
            field4429 = null;
        }
        ++field4425;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZB)V", line = 79)
    public final void method498(boolean arg0, byte arg1) {
        if (arg1 < -82) {
            ++field4424;
            super.field9493.method3144(true, -2);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 90)
    public static final String method1995(byte arg0, String arg1) {
        ++field4426;
        String var2 = class283.method1694(0, class510.method2746(arg1, (byte) 72));
        if (arg0 != -3) {
            field4431 = -123;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(I)V", line = 107)
    public static final void method1996(int arg0) {
        ++field4435;
        for (int var1 = arg0; var1 < class287.field3714.length; ++var1) {
            for (int var2 = 0; ~class287.field3714[var1].length < ~var2; ++var2) {
                class287.field3714[var1][var2] = class224.field2920;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lfc;)V", line = 140)
    public class347(class575 arg0) {
        super(arg0);
    }
}
