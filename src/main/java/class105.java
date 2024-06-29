import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class105 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1572 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[S")
    public static short[] field1576 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field1577 = null;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "[I")
    public static int[] field1575 = new int[50];

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[I")
    public static int[] field1578 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1579 = 2;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
    public static final void method676(int arg0, int arg1) {
        field1571++;
        if (class235.method1632(84, arg0)) {
            int var2 = -20 % ((12 - arg1) / 45);
            class118.method771(true, class283.field4741[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static final void method677(int arg0) {
        if (arg0 == 0) {
            class134.field2100.method874((byte) -125);
            field1573++;
            class297.field4887.method1192((byte) 0);
            class281.field4643.method1192((byte) 0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZIIBIIIII)V")
    public static final void method678(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (class309.field5006.method362(25892) == 2) {
            class128.method853(arg1, arg6, arg0, arg2, arg9, arg3, arg10, arg8, arg4, (byte) 124, arg7);
        } else if (class309.field5006.method362(25892) > 2) {
            class154.method1016(arg9, arg8, arg0, arg6, arg2, arg7, class309.field5006.method362(25892), arg3, 1, arg4, arg1, arg10);
        } else {
            class280.method1947(arg4, arg3, arg7, arg1, arg8, arg9, (byte) 92, arg2, arg10, arg6, arg0);
        }
        field1570++;
        if (arg5 < 126) {
            field1577 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1574++;
        if (arg2 == arg6 && arg3 == arg7 && arg0 == arg5 && arg1 == arg9) {
            class119.method780(arg3, arg1, arg8, arg5, arg2, (byte) 48);
        } else {
            int var10 = arg2;
            int var11 = arg3;
            int var12 = arg6 * 3;
            int var13 = arg2 * 3;
            int var14 = arg7 * 3;
            int var15 = arg3 * 3;
            int var16 = arg0 * 3;
            int var17 = arg9 * 3;
            int var18 = arg5 + var12 - var16 - arg2;
            int var19 = arg1 + var14 - var17 - arg3;
            int var20 = var16 + var13 - var12 - var12;
            int var21 = var17 + var15 - var14 - var14;
            int var22 = var14 - var15;
            int var23 = var12 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var25;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var27 + var30 + var31 >> 12) + arg2;
                int var34 = (var28 + var29 + var32 >> 12) + arg3;
                class119.method780(var11, var34, arg8, var33, var10, (byte) 48);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg4 != 23044) {
            field1576 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static void method680(int arg0) {
        if (arg0 > -18) {
            field1577 = null;
        }
        field1575 = null;
        field1578 = null;
        field1572 = null;
        field1576 = null;
        field1577 = null;
    }
}
