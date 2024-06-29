import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class480 extends class341 {

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "Ldi;")
    public static class83 field7019 = new class83(14, 6);

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "[B")
    private byte[] field7017;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V", line = 3)
    public static void method2821(byte arg0) {
        if (arg0 < -41) {
            field7019 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIZ)V", line = 15)
    public final void method2029(byte arg0, int arg1, boolean arg2) {
        field7014++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field7017[var10001] = (byte) (var5 * 3 >> 5);
        this.field7017[var6] = (byte) (var5 * 3 >> 5);
        if (arg2) {
            this.field7017 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)[B", line = 31)
    public final byte[] method2822(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 126) {
            return null;
        } else {
            this.field7017 = new byte[arg0 * 2 * arg1 * arg2];
            field7016++;
            this.method421(arg0, (byte) 90, arg2, arg1);
            return this.field7017;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 44)
    public class480() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)Lhq;", line = 47)
    public static final class109 method2823(int arg0) {
        field7015++;
        int var1 = -88 % ((arg0 - 44) / 47);
        if (class350.field5114 == null || class290.field4019 == null) {
            return null;
        }
        for (class109 var2 = (class109) class290.field4019.method900(-8); var2 != null; var2 = (class109) class290.field4019.method900(-8)) {
            class146 var3 = class350.field5106.method141(var2.field1639, false);
            if (var3 != null && var3.field2083 && var3.method985((byte) -113, class350.field5104)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)I", line = 74)
    public static final int method2824(int arg0) {
        field7018++;
        if (arg0 != 16) {
            field7020 = -58;
        }
        return 16;
    }
}
