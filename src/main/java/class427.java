import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class427 extends class555 {

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "[B")
    private byte[] field5401;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBII)[B")
    public final byte[] method2351(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -69) {
            this.method683(true, -34, (byte) -48);
        }
        field5400++;
        this.field5401 = new byte[arg0 * arg3 * arg2 * 2];
        this.method751(arg3, arg0, false, arg2);
        return this.field5401;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZIB)V")
    public final void method683(boolean arg0, int arg1, byte arg2) {
        field5402++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5401[var10001] = (byte) (var5 * 3 >> 5);
        this.field5401[var6] = (byte) (var5 * 3 >> 5);
        if (!arg0) {
            field5398 = -50;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBLoa;I)V")
    public static final void method2352(int arg0, byte arg1, class650 arg2, int arg3) {
        int var4 = 54 % ((arg1 - 30) / 63);
        class367.field4732 = new class284[arg0][arg3];
        class71.field919 = arg2;
        field5399++;
        if (class157.field1843 != null) {
            class37.field543 = class666.method3705(class157.field1843[3], class157.field1843[5], class157.field1843[0], 5179, class157.field1843[1], class157.field1843[4], class157.field1843[2]);
        }
        class593.field7959 = new class284();
        class195.method1146((byte) -125);
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class427() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
