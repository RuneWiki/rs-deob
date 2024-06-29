import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class329 extends class666 {

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public static int field4268 = 0;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "Z")
    public static boolean field4271 = true;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field4267;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[BB)[B")
    public static final byte[] method1856(int arg0, byte[] arg1, byte arg2) {
        ++field4270;
        if (arg2 > -35) {
            method1858((byte) 127);
        }
        byte[] var3 = new byte[arg0];
        class652.method3679(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BCLjava/lang/String;)I")
    public static final int method1857(byte arg0, char arg1, String arg2) {
        ++field4269;
        if (arg0 >= -34) {
            field4267 = null;
        }
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            if (~arg1 == ~arg2.charAt(var5)) {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
    public class329() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public static void method1858(byte arg0) {
        field4267 = null;
        if (arg0 != 67) {
            field4271 = false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field4272;
        int[] var3 = super.field9466.method1811(arg1, 88);
        if (arg0 > -21) {
            field4267 = null;
        }
        if (super.field9466.field4172) {
            class652.method3676(var3, 0, class501.field7222, class476.field6935[arg1]);
        }
        return var3;
    }
}
