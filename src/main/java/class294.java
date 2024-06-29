import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class294 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
    public int[] field4312 = new int[3];

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[I")
    public int[] field4317 = new int[3];

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[I")
    public int[] field4319 = new int[2];

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
    public int[] field4318 = new int[2];

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[S")
    public short[] field4311;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[S")
    public short[] field4314;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "[[I")
    public static int[][] field4316 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "F")
    public static float field4310;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 15938) {
            field4316 = null;
        }
        field4315++;
        if (arg4 == arg8 && arg3 == arg7 && arg0 == arg1 && arg6 == arg9) {
            class734.method4076(arg2 ^ 0x5951, arg6, arg3, arg4, arg0, arg5);
            return;
        }
        int var10 = arg4;
        int var11 = arg3;
        int var12 = arg4 * 3;
        int var13 = arg3 * 3;
        int var14 = arg8 * 3;
        int var15 = arg7 * 3;
        int var16 = arg1 * 3;
        int var17 = arg9 * 3;
        int var18 = arg0 + var14 - var16 - arg4;
        int var19 = arg6 - arg3 - (-var15 + var17);
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var17 - (var15 + var15 - var13);
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
            int var33 = (var27 + var31 + var29 >> 12) + arg4;
            int var34 = (var28 + var32 + var30 >> 12) + arg3;
            class734.method4076(26387, var34, var11, var10, var33, arg5);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1937(long arg0, int arg1) {
        field4313++;
        class192.field2384.setTime(new Date(arg0));
        int var3 = class192.field2384.get(7);
        int var4 = class192.field2384.get(5);
        int var5 = class192.field2384.get(arg1);
        int var6 = class192.field2384.get(1);
        int var7 = class192.field2384.get(11);
        int var8 = class192.field2384.get(12);
        int var9 = class192.field2384.get(13);
        return class230.field3473[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class157.field2038[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1938(int arg0) {
        if (arg0 == -19476) {
            field4316 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1939(boolean arg0, int arg1) {
        field4309++;
        if (arg0) {
            field4310 = -0.09902365F;
        }
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Llv;)V")
    public class294(class581 arg0) {
        this.field4312[0] = arg0.field8222;
        this.field4312[1] = arg0.field8237;
        this.field4312[2] = arg0.field8184;
        this.field4317[2] = arg0.field8223;
        this.field4317[1] = arg0.field8163;
        this.field4317[0] = arg0.field8202;
        this.field4319[0] = arg0.field8197;
        this.field4319[1] = arg0.field8176;
        this.field4318[1] = arg0.field8225;
        this.field4318[0] = arg0.field8228;
        if (arg0.field8194 != null) {
            this.field4311 = new short[arg0.field8194.length];
            class335.method2119(arg0.field8194, 0, this.field4311, 0, this.field4311.length);
        }
        if (arg0.field8164 != null) {
            this.field4314 = new short[arg0.field8164.length];
            class335.method2119(arg0.field8164, 0, this.field4314, 0, this.field4314.length);
        }
    }
}
