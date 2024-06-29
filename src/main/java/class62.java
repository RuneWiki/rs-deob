import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class62 extends class220 {

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "F")
    public static float field707;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "[B")
    private byte[] field705;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([BB)[B")
    public static final byte[] method512(byte[] arg0, byte arg1) {
        field703++;
        if (arg0 == null) {
            return null;
        }
        byte[] var2 = new byte[arg0.length];
        if (arg1 != 40) {
            field707 = -0.12819184F;
        }
        class359.method2053(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class62() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIB)V")
    public final void method513(byte arg0, int arg1, byte arg2) {
        field704++;
        int var4 = arg1 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field705[var10001] = -1;
        int var5 = arg2 & 0xFF;
        if (arg0 != 115) {
            this.field705 = null;
        }
        this.field705[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method514(String arg0, boolean arg1, int arg2) {
        field709++;
        if (arg1) {
            method512(null, (byte) -86);
        }
        class51 var3 = class703.method3938(-1989279584, arg2, 2);
        var3.method402((byte) 40);
        var3.field600 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method515(int arg0, String arg1) {
        int var2 = -27 / ((arg0 + 47) / 39);
        class628.method3510("", -1, 0, 0, "", arg1, "");
        field708++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)[B")
    public final byte[] method516(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 92 % (-arg3 / 32);
        field706++;
        this.field705 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1792(arg2, (byte) -124, arg0, arg1);
        return this.field705;
    }
}
