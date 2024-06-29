import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class239 extends class166 {

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "S")
    public static short field3878 = 1;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "[Z")
    public static boolean[] field3885 = new boolean[5];

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field3887 = 0;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZI)V")
    public static final void method1639(int arg0, int arg1, boolean arg2, int arg3) {
        field3882++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class7.field160 = arg2;
        class296.field4688 = arg3;
        int var4 = 18 % ((arg1 - 73) / 49);
        class186.field2873 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    public static final void method1640(int arg0) {
        field3888++;
        if (arg0 != 22859) {
            field3881 = -64;
        }
        class25.field333.method1888(95);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BZ)V")
    public static final void method1641(byte arg0, boolean arg1) {
        field3880++;
        if (arg0 != 31) {
            field3881 = 46;
        }
        byte[][] var2 = class90.field1573;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class230.field3653[var5] >> 8;
            int var14 = class230.field3653[var5] & 0xFF;
            int var15 = var14 * 64 - class260.field4162;
            int var16 = var13 * 64 - class46.field656;
            if (var12 != null) {
                class230.method1534(false);
                var11 = class165.method1114(var16, class46.field656, var15, (byte) 14, class260.field4162, arg1, class176.field2765, var12);
            }
            if (!arg1 && (class219.field3376 / 8) == var13 && (class3.field14 / 8) == var14) {
                if (var11 == null) {
                    class7.field155 = -1;
                } else {
                    class7.field155 = var11[0];
                    class238.field3862 = var11[3];
                    class205.field3194 = var11[4];
                    class20.field294 = var11[1];
                    class30.field432 = var11[2];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class230.field3653[var6] & 0xFF) * 64 - class260.field4162;
            byte[] var8 = var2[var6];
            int var9 = (class230.field3653[var6] >> 8) * 64 - class46.field656;
            if (var8 == null && class3.field14 < 800) {
                class230.method1534(false);
                for (int var10 = 0; var10 < var3; var10++) {
                    class179.method1213(64, 64, true, var10, var7, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -36 % ((-arg1 - 64) / 43);
        if (class223.field3423 <= (arg4 - arg0) && class148.field2338 >= (arg0 + arg4) && arg5 - arg0 >= class90.field1568 && arg5 + arg0 <= class266.field4247) {
            class190.method1276(arg4, -43, arg5, arg6, arg2, arg3, arg0);
        } else {
            class112.method794(arg5, arg2, arg3, arg6, arg0, arg4, (byte) 121);
        }
        field3886++;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(II)V")
    public class239(int arg0, int arg1) {
        this.field3879 = arg1;
        this.field3884 = arg0;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
    public static void method1643(int arg0) {
        int var1 = 67 % ((-arg0 - 4) / 53);
        field3885 = null;
    }
}
