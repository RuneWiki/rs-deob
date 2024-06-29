import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class238 extends class200 {

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "[Lb;")
    public class12[] field4409;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field4406 = 0;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "Ldj;")
    public static class44 field4411 = class89.method650(255, " loggt sich aus)3");

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public static void method1542(int arg0) {
        field4411 = null;
        if (arg0 != -4097) {
            field4406 = -122;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(II)V")
    public static final void method1543(int arg0, int arg1) {
        class68 var2 = class32.field567[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class68 var4 = class32.field567[var3][arg0][arg1] = class32.field567[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1299--;
                for (int var5 = 0; var5 < var4.field1300; var5++) {
                    class106 var6 = var4.field1314[var5];
                    if ((var6.field1953 >> 29 & 0x3L) == 2L && var6.field1945 == arg0 && var6.field1955 == arg1) {
                        var6.field1952--;
                    }
                }
            }
        }
        if (class32.field567[0][arg0][arg1] == null) {
            class32.field567[0][arg0][arg1] = new class68(0, arg0, arg1);
        }
        class32.field567[0][arg0][arg1].field1311 = var2;
        class32.field567[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg8 && arg1 == arg9 && arg0 == arg4 && arg2 == arg6) {
            class75.method584(arg9, arg4, arg7, arg5, 100, arg2);
        } else {
            int var10 = arg5;
            int var11 = arg9;
            int var12 = arg5 * 3;
            int var13 = arg9 * 3;
            int var14 = arg8 * 3;
            int var15 = arg1 * 3;
            int var16 = arg0 * 3;
            int var17 = arg6 * 3;
            int var18 = arg2 + var15 - arg9 - var17;
            int var19 = var17 + var13 - var15 - var15;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var14 - var12;
            int var22 = arg4 + var14 - var16 - arg5;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var22 * var27;
                int var29 = var18 * var27;
                int var30 = var20 * var26;
                int var31 = var19 * var26;
                int var32 = var21 * var24;
                int var33 = var23 * var24;
                int var34 = arg5 + (var28 + var30 + var32 >> 12);
                int var35 = (var29 + var33 + var31 >> 12) + arg9;
                class75.method584(var11, var34, arg7, var10, 86, var35);
                var10 = var34;
                var11 = var35;
            }
        }
        int var25 = -12 / ((-arg3 - 65) / 37);
        field4408++;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(II)I")
    public static int method1545(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lve;Lve;IZ)V")
    public class238(class225 arg0, class225 arg1, int arg2, boolean arg3) {
        class190 var5 = new class190();
        int var6 = arg0.method1473(20756, arg2);
        this.field4409 = new class12[var6];
        int[] var7 = arg0.method1481(arg2, -21860);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1466(arg2, var7[var8], (byte) -123);
            class143 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class143 var12 = (class143) var5.method1189(0); var12 != null; var12 = (class143) var5.method1192((byte) -80)) {
                if (var12.field2532 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1462(var11, 59, 0);
                } else {
                    var13 = arg1.method1462(0, 109, var11);
                }
                var10 = new class143(var11, var13);
                var5.method1185(var10, (byte) -110);
            }
            this.field4409[var7[var8]] = new class12(var9, var10);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Z")
    public final boolean method1546(int arg0, byte arg1) {
        if (arg1 != -127) {
            field4406 = 26;
        }
        field4407++;
        return this.field4409[arg0].field230;
    }
}
