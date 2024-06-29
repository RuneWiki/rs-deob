import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class236 implements class114 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field4058 = 0;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "S")
    public static short field4060 = 205;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field4059 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Leg;")
    public static class37 field4057 = class174.method1167(" loggt sich ein)3", 117);

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[I")
    public static int[] field4062 = new int[1000];

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIBII)V")
    public static final void method1616(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class81.field1268 = arg0;
        class148.field2507 = arg2;
        class86.field1352 = arg5;
        class81.field1262 = arg4;
        if (arg3 >= -89) {
            return;
        }
        field4061++;
        class24.field327 = arg1;
        if (class148.field2507 >= 100) {
            int var6 = class81.field1268 * 128 + 64;
            int var7 = class24.field327 * 128 + 64;
            int var8 = class262.method1768(class237.field4140, var6, var7, (byte) -104) - class81.field1262;
            int var9 = var6 - class213.field3683;
            int var10 = var7 - class200.field3403;
            int var11 = var8 - class137.field2338;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class159.field2655 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class117.field1990 = (int) (-325.949D * Math.atan2((double) var9, (double) var10)) & 0x7FF;
            if (class159.field2655 < 128) {
                class159.field2655 = 128;
            }
            if (class159.field2655 > 383) {
                class159.field2655 = 383;
            }
        }
        class273.field4794 = 2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(JII[I)Leg;")
    public final class37 method813(long arg0, int arg1, int arg2, int[] arg3) {
        if (arg1 != -12) {
            method1618(81, 12);
        }
        field4063++;
        if (arg2 == 0) {
            class10 var6 = class174.method1165((byte) 18, arg3[0]);
            return var6.method68((int) arg0, arg1 ^ 0xFFFFFFA3);
        } else if (arg2 == 1 || arg2 == 10) {
            class241 var7 = class9.method52(true, (int) arg0);
            return var7.field4325;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class174.method1165((byte) 18, arg3[0]).method68((int) arg0, arg1 ^ 0xFFFFFFAE);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)V")
    public static final void method1617(byte arg0, int arg1) {
        field4064++;
        if (arg0 > 21) {
            class280.field4949.method1402((byte) -63, arg1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I")
    public static final int method1618(int arg0, int arg1) {
        field4065++;
        if (arg0 != 0) {
            method1616(6, -81, -41, (byte) -119, 11, 97);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method1619(byte arg0) {
        int var1 = -125 % ((arg0 - 37) / 42);
        field4062 = null;
        field4057 = null;
    }
}
