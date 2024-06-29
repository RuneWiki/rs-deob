import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class430 extends class85 {

    @OriginalMember(owner = "client!re", name = "N", descriptor = "Ls;")
    public static class186 field6423 = new class186(7, 18);

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Ljava/lang/String;")
    public static String field6424 = null;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "[B")
    private byte[] field6422;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIB)V", line = 3)
    public final void method795(boolean arg0, int arg1, byte arg2) {
        if (arg0) {
            method2590((byte) -109);
        }
        field6419++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field6422[var10001] = (byte) (var5 * 3 >> 5);
        this.field6422[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIB)[B", line = 22)
    public final byte[] method2589(int arg0, int arg1, int arg2, byte arg3) {
        this.field6422 = new byte[arg1 * arg2 * 2 * arg0];
        if (arg3 == 4) {
            field6418++;
            this.method1914(arg0, arg3 - 4, arg1, arg2);
            return this.field6422;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V", line = 35)
    public static void method2590(byte arg0) {
        if (arg0 == 25) {
            field6424 = null;
            field6423 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILsf;Z)V", line = 49)
    public static final void method2591(int arg0, int arg1, class366 arg2, boolean arg3) {
        if (arg3) {
            field6424 = null;
        }
        if (arg2.field7768 == arg1 && arg1 != -1) {
            class57 var4 = class422.field6355.method236(arg1, (byte) 122);
            int var5 = var4.field1203;
            if (var5 == 1) {
                arg2.field7783 = 0;
                arg2.field7837 = 1;
                arg2.field7793 = 0;
                arg2.field7830 = 0;
                arg2.field7815 = arg0;
                class433.method2602(var4, arg2.field6073, arg2.field6078, (byte) 50, arg2.field6084, arg2.field7793, class15.field266 == arg2);
            }
            if (var5 == 2) {
                arg2.field7830 = 0;
            }
        } else if (arg1 == -1 || arg2.field7768 == -1 || class422.field6355.method236(arg1, (byte) 54).field1204 >= class422.field6355.method236(arg2.field7768, (byte) 63).field1204) {
            arg2.field7830 = 0;
            arg2.field7837 = 1;
            arg2.field7783 = 0;
            arg2.field7873 = arg2.field7863;
            arg2.field7768 = arg1;
            arg2.field7815 = arg0;
            arg2.field7793 = 0;
            if (arg2.field7768 != -1) {
                class433.method2602(class422.field6355.method236(arg2.field7768, (byte) -108), arg2.field6073, arg2.field6078, (byte) 67, arg2.field6084, arg2.field7793, class15.field266 == arg2);
            }
        }
        field6421++;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 98)
    public class430() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V", line = 103)
    public static final void method2592(boolean arg0) {
        if (!arg0) {
            field6423 = null;
        }
        field6420++;
        if (class307.field4660 == null) {
            return;
        }
        if (class307.field4660.field2119 == 1) {
            class307.field4660 = null;
            return;
        }
        if (class307.field4660.field2119 == 2) {
            class449.method2683(2, class151.field2485, class188.field3013, (byte) 123);
            class307.field4660 = null;
            return;
        }
    }
}
