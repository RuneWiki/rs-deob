import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class249 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Ldf;")
    public static class51 field4376 = class46.method233(")3)3)3", 100);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Ldf;")
    private static class51 field4377 = class46.method233("Starting 3d library", 100);

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Ldf;")
    public static class51 field4375 = field4377;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Ldf;")
    private static class51 field4380 = class46.method233("Loaded sprites", 100);

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Ldf;")
    public static class51 field4378 = field4380;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class72.field1151[arg0][var8][var14] == -class170.field2786) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class172.field2820[arg0][arg1][arg3] + arg5;
            if (!class218.method1500(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class218.method1500(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class218.method1500(var9, var11, var13)) {
                return false;
            } else if (class218.method1500(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class177.method1238(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class218.method1500(var6 + 1, class172.field2820[arg0][arg1][arg3] + arg5, var7 + 1) && class218.method1500(var6 + 128 - 1, class172.field2820[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class218.method1500(var6 + 128 - 1, class172.field2820[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class218.method1500(var6 + 1, class172.field2820[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lu;ILu;)V")
    public static final void method1693(class111 arg0, int arg1, class111 arg2) {
        class163.field2663 = arg0;
        if (arg1 != -129) {
            method1695((byte) -35);
        }
        class210.field3494 = arg2;
        field4374++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field4381++;
        if (arg4 < 128 || arg3 < 128 || arg4 > 13056 || arg3 > 13056) {
            class176.field2887 = -1;
            class205.field3424 = -1;
            return;
        }
        int var8 = class207.method1424(class257.field4496, arg4, (byte) 15, arg3) - arg5;
        int var9 = arg3 - class144.field2408;
        int var10 = class73.field1155[class128.field2143];
        int var11 = arg4 - class209.field3488;
        int var12 = var8 - class120.field2001;
        int var13 = class73.field1155[class107.field1763];
        int var14 = class73.field1167[class107.field1763];
        int var15 = class73.field1167[class128.field2143];
        int var16 = var9 * var10 + (var11 * var15) >> 16;
        int var17 = -38 % ((37 - arg7) / 40);
        int var18 = var9 * var15 - (var10 * var11) >> 16;
        int var20 = var12 * var14 - (var13 * var18) >> 16;
        int var21 = var12 * var13 + (var14 * var18) >> 16;
        if (var21 < 50) {
            class205.field3424 = -1;
            class176.field2887 = -1;
        } else {
            class176.field2887 = (var20 << 9) / var21 + arg1;
            class205.field3424 = (var16 << 9) / var21 + arg0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method1695(byte arg0) {
        field4377 = null;
        if (arg0 <= 115) {
            method1694(-68, 5, 34, 12, -50, -10, -110, (byte) -46);
        }
        field4375 = null;
        field4376 = null;
        field4378 = null;
        field4380 = null;
    }
}
