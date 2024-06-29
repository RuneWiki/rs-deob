import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class582 implements class88 {

    @OriginalMember(owner = "client!du", name = "e", descriptor = "Ljava/lang/Object;")
    public static volatile Object field7961 = null;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "[[I")
    public static int[][] field7960 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!du", name = "g", descriptor = "[I")
    public static int[] field7963 = new int[3];

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "Lba;")
    public static class661 field7965;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "[[I")
    public static int[][] field7958;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BLjava/lang/String;)V", line = 13)
    public static final void method3212(byte arg0, String arg1) {
        int var2 = -71 / ((-arg0 - 57) / 58);
        class116.method681("", "", "", 48, 0, arg1, 0);
        field7962++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIIIIII)V", line = 23)
    public static final void method3213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 0) {
            method3213(-53, 112, -63, 59, 72, -58, -71, -15, 26, -97);
        }
        field7964++;
        if (arg1 == arg6 && arg2 == arg9 && arg3 == arg7 && arg4 == arg8) {
            class193.method1264(arg9, arg3, arg0, arg4, (byte) -34, arg6);
            return;
        }
        int var10 = arg6;
        int var11 = arg9;
        int var12 = arg6 * 3;
        int var13 = arg9 * 3;
        int var14 = arg1 * 3;
        int var15 = arg2 * 3;
        int var16 = arg7 * 3;
        int var17 = arg8 * 3;
        int var18 = arg3 + var14 - var16 - arg6;
        int var19 = arg4 + var15 - var17 - arg9;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var13 + var17 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = arg6 + (var27 + var29 + var31 >> 12);
            int var34 = (var28 + var30 + var32 >> 12) + arg9;
            class193.method1264(var11, var33, arg0, var34, (byte) -34, var10);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V", line = 104)
    public static void method3214(byte arg0) {
        field7958 = null;
        field7963 = null;
        int var1 = 0 % ((70 - arg0) / 36);
        field7960 = null;
        field7965 = null;
        field7961 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(JLlg;[IB)Ljava/lang/String;", line = 124)
    public final String method480(long arg0, class32 arg1, int[] arg2, byte arg3) {
        field7957++;
        if (class210.field2802 == arg1) {
            class440 var6 = class340.field4573.method2135(arg2[0], (byte) -90);
            return var6.method2488((byte) -77, (int) arg0);
        } else if (arg3 >= -127) {
            return null;
        } else if (class27.field382 == arg1 || class271.field3537 == arg1) {
            class584 var7 = class87.field1058.method1394(-58, (int) arg0);
            return var7.field8032;
        } else if (class361.field4782 == arg1 || class513.field7144 == arg1 || class81.field944 == arg1) {
            return class340.field4573.method2135(arg2[0], (byte) -114).method2488((byte) -75, (int) arg0);
        } else {
            return null;
        }
    }
}
