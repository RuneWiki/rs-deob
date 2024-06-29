import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class21 extends class513 {

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "[I")
    public static int[] field542 = new int[2];

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "Lwo;")
    public static class690 field544 = new class690(68, 7);

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method341(byte arg0) {
        field542 = null;
        int var1 = -124 / ((-arg0 - 26) / 33);
        field544 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != 3) {
            return;
        }
        field543++;
        if (arg6 < 1 || arg3 < 1 || class473.field6604 - 2 < arg6 || class205.field2465 - 2 < arg3) {
            return;
        }
        int var9 = arg7;
        if (arg7 < 3 && class626.method3602(arg6, arg3, (byte) 15)) {
            var9 = arg7 + 1;
        }
        if (!class221.field2851.method1747(arg4 - 3, class375.field5039) && !class500.method2909(arg4 ^ 0x5E, arg6, class656.field9319, var9, arg3)) {
            return;
        }
        if (class281.field3808 == null) {
            return;
        }
        class75.field1116.method1790(arg6, class349.field4642[arg7], arg3, arg7, arg1, arg4 - 3, class68.field1045);
        if (arg0 < 0) {
            return;
        }
        boolean var10 = class221.field2851.field4165;
        class221.field2851.field4165 = true;
        class75.field1116.method1796(class349.field4642[arg7], arg8, arg6, arg2, arg0, arg4 ^ 0x3, class68.field1045, arg3, arg7, var9, arg5);
        class221.field2851.field4165 = var10;
        return;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)I")
    public static final int method343(boolean arg0) {
        field545++;
        if (class361.field4805) {
            return 6;
        } else if (class590.field8544 == null) {
            return 0;
        } else {
            int var1 = class590.field8544.field5062;
            if (class358.method2016(var1, -106)) {
                return 1;
            } else if (class267.method1619(var1, arg0)) {
                return 2;
            } else if (class19.method333(-1002, var1)) {
                return 3;
            } else if (class660.method3740((byte) 125, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }
}
