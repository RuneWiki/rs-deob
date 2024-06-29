import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class173 {

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "B")
    public byte field2075;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "S")
    public short field2076;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "S")
    public short field2072;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "Z")
    public boolean field2071;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "S")
    public short field2074;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "B")
    public byte field2070;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "[I")
    public static int[] field2068 = new int[8];

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "F")
    public static float field2066;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1170(int arg0, byte arg1, int arg2) {
        field2067++;
        if (arg1 <= 20) {
            method1173(35);
        }
        return (arg0 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static final void method1171(int arg0) {
        field2065++;
        class108.method876((byte) 85);
        if (arg0 < 92) {
            return;
        }
        class390.field5065 = null;
        class731.field10241 = null;
        class777.field10738 = null;
        class448.field6026 = null;
        class655.field9031 = null;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([[BZLer;)V")
    public static final void method1172(byte[][] arg0, boolean arg1, class117 arg2) {
        if (!arg1) {
            field2068 = null;
        }
        field2077++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class403 var11 = new class403(var10);
                int var12 = class471.field6569[var5] >> 8;
                int var13 = class471.field6569[var5] & 0xFF;
                int var14 = var12 * 64 - class632.field8626;
                int var15 = var13 * 64 - class620.field8435;
                class580.method3339((byte) -58);
                arg2.method1643(var15, (byte) -94, class633.field8649, var11, class632.field8626, var14, class620.field8435);
                arg2.method918(class363.field4526, var14, var15, (byte) -127, var3, var11);
                if (!arg2.field3316 && (class226.field2638 / 8) == var12 && (class518.field7310 / 8) == var13 && var3[0] != -1) {
                    class454.field6403 = class153.field1907.method1237(var3[3], 5, var3[2], var3[1], var3[0], class305.field3675);
                    class691.field9401 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class471.field6569[var6] >> 8) * 64 - class632.field8626;
            int var8 = (class471.field6569[var6] & 0xFF) * 64 - class620.field8435;
            byte[] var9 = arg0[var6];
            if (var9 == null && class518.field7310 < 800) {
                class580.method3339((byte) -58);
                arg2.method1647(-9, var8, var7, 64, 64);
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    public static void method1173(int arg0) {
        field2068 = null;
        if (arg0 != -1) {
            field2068 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field2075 = (byte) arg8;
        this.field2076 = (short) arg6;
        this.field2069 = arg0;
        this.field2072 = (short) arg5;
        this.field2071 = arg9;
        this.field2073 = arg10;
        this.field2074 = (short) arg4;
        this.field2070 = (byte) arg7;
    }
}
