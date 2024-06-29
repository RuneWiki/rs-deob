import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class554 extends class101 {

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Ljava/lang/String;")
    public String field7477;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Lmt;")
    public static class419 field7475 = new class419(1, 2, 2, 0);

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Laj;")
    public static class333 field7478;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 4)
    public static void method3127(byte arg0) {
        field7478 = null;
        int var1 = -104 % ((84 - arg0) / 38);
        field7475 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;ZI)V", line = 14)
    public static final void method3128(int arg0, String arg1, boolean arg2, int arg3) {
        class474.method2782(arg0 ^ 0xFFFFFF90);
        field7473++;
        class499.method2879((byte) -126);
        class625.method3434(arg0 ^ arg0);
        class489.method2844(arg1, -109, arg3, arg2);
        class283.method1820(18);
        class183.method1272((byte) 122, class379.field5542);
        class652.method3634(-1719661332, class379.field5542);
        class312.method1959(class379.field5542, class643.field8927, arg0 ^ 0x7C);
        class45.method347((byte) 95);
        class267.method1745(class416.field5975, 1);
        class229.method1502(0);
        class686.method3808(false);
        if (class458.field6355 == 3) {
            class300.method1901(4, 2);
        } else if (class458.field6355 == 7) {
            class300.method1901(8, 2);
        } else if (class458.field6355 == 10) {
            class300.method1901(11, 2);
        } else if (class458.field6355 == 1 || class458.field6355 == 2) {
            class6.method42(0);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BD)V", line = 48)
    public static final void method3129(byte arg0, double arg1) {
        class198.field2650.method986(class298.field4325);
        field7474++;
        class198.field2650.method970(0, 0, (int) arg1);
        class86.field1200.method526(class198.field2650);
        if (arg0 >= -50) {
            method3129((byte) -24, 2.2801631161471616D);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[BIII[BI)V", line = 66)
    public static final void method3130(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field7476++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        int var11 = -73 % ((46 - arg8) / 47);
        for (int var12 = -arg6; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg0++;
                arg3[var10001] += arg7[arg4++];
                int var15 = arg0++;
                arg3[var15] += arg7[arg4++];
                int var16 = arg0++;
                arg3[var16] += arg7[arg4++];
                int var17 = arg0++;
                arg3[var17] += arg7[arg4++];
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg0++;
                arg3[var10001] += arg7[arg4++];
            }
            arg0 += arg5;
            arg4 += arg1;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)Z", line = 111)
    public static final boolean method3131(int arg0, int arg1, boolean arg2) {
        field7472++;
        if (arg2) {
            method3130(3, 8, 35, null, -33, 83, -80, null, 33);
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 122)
    public class554() {
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 124)
    public class554(String arg0, int arg1) {
        this.field7477 = arg0;
    }
}
