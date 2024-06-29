import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class109 extends class690 {

    @OriginalMember(owner = "client!cea", name = "F", descriptor = "Z")
    public static boolean field1314 = true;

    @OriginalMember(owner = "client!cea", name = "M", descriptor = "Lcw;")
    public static class144 field1320 = new class144();

    @OriginalMember(owner = "client!cea", name = "Q", descriptor = "I")
    public static int field1324 = 0;

    @OriginalMember(owner = "client!cea", name = "K", descriptor = "F")
    public static float field1318;

    @OriginalMember(owner = "client!cea", name = "E", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!cea", name = "G", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!cea", name = "H", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!cea", name = "I", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!cea", name = "L", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!cea", name = "O", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!cea", name = "N", descriptor = "[B")
    private byte[] field1321;

    @OriginalMember(owner = "client!cea", name = "P", descriptor = "[I")
    public static int[] field1323;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)V")
    public static final void method797(int arg0, int arg1) {
        field1317++;
        class531.field7311 = 1000000000L / (long) arg1;
        if (arg0 != 0) {
            method797(-16, 119);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIB)V")
    public final void method798(int arg0, int arg1, byte arg2) {
        field1315++;
        if (arg0 != 11829) {
            field1320 = null;
        }
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var6 = var4 + 1;
        this.field1321[var4] = (byte) (var5 * 3 >> 5);
        this.field1321[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V")
    public class109() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BIII)[B")
    public final byte[] method799(byte arg0, int arg1, int arg2, int arg3) {
        this.field1321 = new byte[arg1 * arg2 * arg3 * 2];
        field1319++;
        if (arg0 >= -31) {
            field1314 = true;
        }
        this.method1806(arg2, arg1, (byte) -85, arg3);
        return this.field1321;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIII)I")
    public static final int method800(int arg0, int arg1, int arg2, int arg3) {
        field1313++;
        if ((class533.field7338[arg1][arg3][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class533.field7338[1][arg3][arg2] & 0x2) == 0) {
            if (arg0 != -1) {
                method800(-80, 54, 40, 68);
            }
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "(I)V")
    public static void method801(int arg0) {
        field1320 = null;
        if (arg0 != 5) {
            method800(-47, 53, 85, 20);
        }
        field1323 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZIIII[Lsha;)V")
    public static final void method802(boolean arg0, int arg1, int arg2, int arg3, int arg4, class115[] arg5) {
        field1322++;
        int var6 = 0;
        if (arg1 != 23783) {
            field1323 = null;
        }
        while (var6 < arg5.length) {
            class115 var7 = arg5[var6];
            if (var7 != null && var7.field1436 == arg3) {
                class122.method859(arg0, var7, arg2, 125, arg4);
                class70.method531((byte) 113, var7, arg4, arg2);
                if ((var7.field1511 - var7.field1560) < var7.field1559) {
                    var7.field1559 = var7.field1511 - var7.field1560;
                }
                if (var7.field1559 < 0) {
                    var7.field1559 = 0;
                }
                if (var7.field1495 > var7.field1422 - var7.field1517) {
                    var7.field1495 = var7.field1422 - var7.field1517;
                }
                if (var7.field1495 < 0) {
                    var7.field1495 = 0;
                }
                if (var7.field1564 == 0) {
                    class324.method2053((byte) 113, var7, arg0);
                }
            }
            var6++;
        }
    }
}
