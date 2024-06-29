import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class248 extends class529 {

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "Lof;")
    public static class446 field3458 = new class446("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "Ljd;")
    public static class155 field3454;

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "[B")
    private byte[] field3457;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZII)[B")
    public final byte[] method1608(int arg0, boolean arg1, int arg2, int arg3) {
        this.field3457 = new byte[arg0 * arg3 * arg2 * 2];
        field3459++;
        this.method1731(arg0, arg3, arg2, (byte) 122);
        return arg1 ? this.field3457 : null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method1609(String arg0, byte arg1) throws ClassNotFoundException {
        field3456++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg1 != -49) {
            return null;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)V")
    public static void method1610(boolean arg0) {
        if (arg0) {
            field3454 = null;
        }
        field3454 = null;
        field3458 = null;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
    public class248() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIB)V")
    public final void method1611(byte arg0, int arg1, byte arg2) {
        field3455++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field3457[var10001] = (byte) (var5 * 3 >> 5);
        if (arg0 < -46) {
            this.field3457[var6] = (byte) (var5 * 3 >> 5);
        }
    }
}
