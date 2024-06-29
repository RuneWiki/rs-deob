import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class486 extends class4 {

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "J")
    public static long field7002 = 0L;

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "[I")
    public static int[] field7004 = new int[4];

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "Lhn;")
    public static class509 field7005 = new class509(62, 1);

    @OriginalMember(owner = "client!bs", name = "O", descriptor = "Z")
    public static boolean field7007 = false;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "Lam;")
    public static class449 field7000;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "[B")
    private byte[] field7001;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIII)[B", line = 3)
    public final byte[] method2904(int arg0, int arg1, int arg2, int arg3) {
        field6999++;
        if (arg0 == 255) {
            this.field7001 = new byte[arg1 * arg3 * arg2 * 2];
            this.method1336(arg2, arg1, arg3, 732);
            return this.field7001;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BIB)V", line = 21)
    public final void method11(byte arg0, int arg1, byte arg2) {
        field7003++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field7001[var10001] = (byte) (var5 * 3 >> 5);
        if (arg2 != 103) {
            this.method2904(-26, 60, -5, -16);
        }
        this.field7001[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V", line = 39)
    public class486() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V", line = 45)
    public static void method2905(byte arg0) {
        field7004 = null;
        field7000 = null;
        if (arg0 != -85) {
            field7007 = false;
        }
        field7005 = null;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V", line = 59)
    public static final void method2906(byte arg0) {
        if (class532.field7841 != null) {
            class532.field7841.method1075(false);
        }
        field7006++;
        if (class98.field1401 != null) {
            class98.field1401.method1075(false);
        }
        if (arg0 != 123) {
            method2905((byte) 8);
        }
    }
}
