import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class109 extends class137 {

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "S")
    public static short field1690 = 1;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field1686 = 0;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static volatile int field1691 = 0;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "[Z")
    public static boolean[] field1692;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static void method765(byte arg0) {
        field1692 = null;
        if (arg0 >= -110) {
            field1692 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIILie;IJ)Z")
    public static final boolean method766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class154.method1046(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZIIIII)V")
    public static final void method767(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class135.field2182 = arg4;
        field1688++;
        class296.field4840 = arg3;
        class8.field176 = arg1;
        if (!arg0) {
            method767(true, 31, 116, 87, 107, 27);
        }
        class251.field4132 = arg2;
        class74.field1189 = arg5;
        if (class74.field1189 >= 100) {
            int var6 = class8.field176 * 128 + 64;
            int var7 = class135.field2182 * 128 + 64;
            int var8 = class60.method387(-18796, var7, var6, class214.field3389) - class296.field4840;
            int var9 = var8 - class182.field3028;
            int var10 = var6 - class135.field2184;
            int var11 = var7 - class123.field1960;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class95.field1506 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class211.field3361 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class95.field1506 < 128) {
                class95.field1506 = 128;
            }
            if (class95.field1506 > 383) {
                class95.field1506 = 383;
            }
        }
        class231.field3613 = 2;
    }
}
