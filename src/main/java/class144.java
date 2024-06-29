import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class144 extends class126 {

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
    public static int field2137 = 0;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "[I")
    public static int[] field2143 = new int[14];

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "I")
    public static int field2148 = 100;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "[I")
    public static int[] field2140 = new int[32];

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "F")
    public static float field2138;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "[B")
    private byte[] field2139;

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "[Ld;")
    public static class136[] field2149;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "[[S")
    public static short[][] field2144;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V", line = 6)
    public static void method1010(int arg0) {
        field2143 = null;
        field2149 = null;
        if (arg0 != 14) {
            method1010(-106);
        }
        field2140 = null;
        field2144 = null;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V", line = 24)
    public class144() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V", line = 27)
    public static final void method1011(int arg0) {
        class328.field4851 = null;
        field2141++;
        if (arg0 == 0) {
            class580.field7940 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BIII)[B", line = 42)
    public final byte[] method1012(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -53) {
            method1011(65);
        }
        this.field2139 = new byte[arg1 * arg2 * arg3 * 2];
        field2150++;
        this.method1824(arg3, arg0 ^ 0xFFFFFF34, arg2, arg1);
        return this.field2139;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(III)V", line = 70)
    public static final void method1013(int arg0, int arg1, int arg2) {
        field2146++;
        class679 var3 = class669.method3708(14, arg2, 1403048928);
        if (arg1 == 2) {
            var3.method3748(true);
            var3.field9574 = arg0;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([BIZIII)V", line = 84)
    public static final void method1014(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2147++;
        if (arg3 >= arg4) {
            return;
        }
        int var6 = arg1 + arg3;
        if (!arg2) {
            field2140 = null;
        }
        int var7 = arg4 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg4 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var6++] = 1;
                }
            }
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
            arg0[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZB)V", line = 114)
    public final void method899(int arg0, boolean arg1, byte arg2) {
        if (!arg1) {
            this.method899(44, true, (byte) 25);
        }
        field2142++;
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2139[var10001] = var5;
        this.field2139[var6] = var5;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)I", line = 131)
    public static final int method1015(int arg0, int arg1) {
        field2145++;
        if (arg1 > -102) {
            method1013(-5, -16, -53);
        }
        return arg0 & 0xFF;
    }
}
