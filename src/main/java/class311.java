import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class311 {

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "Lvl;")
    public static class15 field4247 = new class15(1, -1);

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "B")
    public byte field4236;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "B")
    public byte field4238;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "B")
    public byte field4241;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "B")
    public byte field4243;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "B")
    public byte field4249;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "B")
    public byte field4250;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "B")
    public byte field4251;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public int field4240;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "S")
    public short field4239;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Z")
    public boolean field4232;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Z")
    public boolean field4233;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "Z")
    public boolean field4234;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Z")
    public boolean field4235;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "Z")
    public boolean field4244;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "Z")
    public boolean field4245;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "Z")
    public boolean field4248;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "Z")
    public boolean field4253;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 7)
    public static final void method1976(boolean arg0, String arg1, int arg2) {
        if (arg2 < -56) {
            class547.method3073(-1, arg0, (byte) 105, arg1, -1);
            field4231++;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 24)
    public static final String[] method1977(int arg0, String[] arg1) {
        field4252++;
        String[] var2 = new String[arg0];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V", line = 50)
    public static void method1978(byte arg0) {
        if (arg0 == -46) {
            field4247 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V", line = 60)
    public static final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class509.field6995 = arg5;
        field4230++;
        if (arg0 != -1) {
            return;
        }
        class245.field3474 = arg3;
        class375.field5077 = arg4;
        class551.field7559 = arg1;
        class518.field7042 = arg6;
        class18.field431 = arg2;
    }
}
