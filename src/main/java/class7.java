import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class7 extends class202 {

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "[I")
    public static int[] field77 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "Z")
    public static boolean field85 = false;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field87 = 0;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "Lru;")
    public static class177 field82 = new class177(8);

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Lqu;")
    public static class219 field88 = new class219(21, 8);

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "Lgf;")
    public static class46 field89 = new class46("", 15);

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "Lo;")
    public static class139 field79;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
    public static void method57(int arg0) {
        field88 = null;
        field77 = null;
        if (arg0 != 0) {
            field85 = true;
        }
        field79 = null;
        field89 = null;
        field82 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLtq;)V")
    public static final void method58(byte arg0, class276 arg1) {
        if (arg0 <= 40) {
            method60(-12, (byte[]) null, -8, -111);
        }
        for (int var2 = 0; var2 < class275.field4367; ++var2) {
            int var3 = class530.field7787[var2];
            class350 var4 = class264.field4276[var3];
            int var5 = arg1.method1445(19);
            if ((1 & var5) != 0) {
                var5 += arg1.method1445(-74) << 8;
            }
            if (~(32768 & var5) != -1) {
                var5 += arg1.method1445(68) << 16;
            }
            class48.method349(var3, var4, arg1, 122, var5);
        }
        ++field86;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)V")
    public static final void method59(boolean arg0, int arg1) {
        class81.method578((byte) 66, class293.field4621);
        ++class4.field45;
        ++field84;
        if (arg1 != -1) {
            method61((byte) -7);
        }
        for (class301 var2 = (class301) class423.field6414.method1119(false); var2 != null; var2 = (class301) class423.field6414.method1121((byte) 50)) {
            if (!var2.method3147(103)) {
                var2 = (class301) class423.field6414.method1119(false);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field4720 == 0) {
                class215.method1588(true, -124, var2, arg0);
            }
        }
        if (class322.field5031 != null) {
            class479.method2962(-95, class322.field5031);
            class322.field5031 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[BII)I")
    public static final int method60(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field81;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; ++var5) {
            var4 = class18.field193[(var4 ^ arg1[var5]) & 255] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        return arg2 != 255 ? -77 : var6;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public static final void method61(byte arg0) {
        class467.field7155 = null;
        class490.field7412 = null;
        class243.field3946 = null;
        class361.field5591 = null;
        field79 = null;
        class9.field98 = null;
        class52.field708 = null;
        if (arg0 < 92) {
            method57(125);
        }
        class417.field6327 = null;
        class189.field2751 = null;
        ++field78;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field83;
        int[] var3 = super.field3064.method2452((byte) 110, arg0);
        if (super.field3064.field5837) {
            class324.method2167(var3, 0, class276.field4375, class521.field7716[arg0]);
        }
        if (!arg1) {
            method57(55);
        }
        return var3;
    }
}
