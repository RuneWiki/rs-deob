import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class285 {

    @OriginalMember(owner = "client!i", name = "c", descriptor = "J")
    public static long field4373 = 0L;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4372 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[Z")
    public static boolean[] field4371 = new boolean[100];

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4377 = "M";

    @OriginalMember(owner = "client!i", name = "e", descriptor = "[Lwa;")
    public static class142[] field4375 = new class142[29];

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
    public static int[] field4379 = new int[32768];

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method1895(int arg0) {
        if (arg0 != -3668) {
            method1896(-1, 85, -42, -81);
        }
        field4375 = null;
        field4377 = null;
        field4372 = null;
        field4379 = null;
        field4371 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)I")
    public static final int method1896(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        field4378++;
        if (arg3 != -5706) {
            method1895(-24);
        }
        return (arg1 >> 5 << 7) + (arg0 >> 2 << 10) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method1897(int arg0, boolean arg1) {
        if (arg1) {
            method1896(-36, 16, 91, -79);
        }
        field4374++;
        if (arg0 == 100 && class150.field2174 > 0) {
            byte[] var2 = class154.field2254[--class150.field2174];
            class154.field2254[class150.field2174] = null;
            return var2;
        } else if (arg0 == 5000 && class223.field3468 > 0) {
            byte[] var3 = class226.field3532[--class223.field3468];
            class226.field3532[class223.field3468] = null;
            return var3;
        } else if (arg0 == 30000 && class9.field108 > 0) {
            byte[] var4 = class109.field1623[--class9.field108];
            class109.field1623[class9.field108] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
