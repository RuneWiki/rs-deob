import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class546 {

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    public int[] field7521 = new int[4];

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
    public int[] field7528 = new int[4];

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "B")
    public byte field7529;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "B")
    public byte field7518;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
    public int[] field7524;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "S")
    public short field7522;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "S")
    public short field7519;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "S")
    public short field7530;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "S")
    public short field7527;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[S")
    public short[] field7525;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[S")
    public short[] field7520;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[S")
    public short[] field7531;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
    public static int[] field7533 = new int[5];

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lvaa;")
    public static class469 field7534;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZI)Luba;", line = 4)
    public static final class432 method3150(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 != 2) {
            method3150(31, -43, 32, true, -110);
        }
        field7526++;
        class432 var5 = new class432();
        var5.field6181 = arg0;
        var5.field6184 = arg2;
        class323.field4473.method1468((byte) 109, (long) arg1, var5);
        class54.method603(arg0, (byte) 110);
        class378 var6 = class60.method633(arg4 + 1512932718, arg1);
        if (var6 != null) {
            class296.method1945(-9343, var6);
        }
        if (class647.field8909 != null) {
            class296.method1945(-9343, class647.field8909);
            class647.field8909 = null;
        }
        class172.method1290((byte) 120);
        if (var6 != null) {
            class296.method1942(!arg3, arg4 - 104, var6);
        }
        if (!arg3) {
            class83.method786(arg0);
        }
        if (!arg3 && class184.field2784 != -1) {
            class640.method3635((byte) -8, class184.field2784, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 55)
    public static void method3151(int arg0) {
        field7534 = null;
        field7533 = null;
        if (arg0 != 4) {
            method3152(91, -57, -85, 14, 6);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V", line = 70)
    public static final void method3152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7532++;
        if (class215.field3119 != 1) {
            return;
        }
        int var5 = arg1 / class273.field3847;
        int var6 = arg2 / class273.field3847;
        int var7 = arg3 / class386.field5603;
        int var8 = arg4 / class386.field5603;
        if (var5 >= class589.field8025 || var6 < 0 || class391.field5761 <= var7 || var8 < 0 || arg0 != -5590) {
            return;
        }
        if (var6 >= class589.field8025) {
            var6 = class589.field8025 - 1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class391.field5761 <= var8) {
            var8 = class391.field5761 - 1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class179.method1318(class369.field5253 + var9, (byte) -15, class391.field5761) * class589.field8025;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class179.method1318(class94.field1656 + var11, (byte) -15, class589.field8025);
                class58.field1149[var12] = class576.field7925;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 127)
    public class546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field7529 = (byte) arg0;
        this.field7518 = (byte) arg1;
        this.field7524 = new int[4];
        this.field7524[0] = arg2;
        this.field7524[1] = arg3;
        this.field7524[3] = arg5;
        this.field7524[2] = arg4;
        this.field7528[0] = arg6;
        this.field7528[2] = arg8;
        this.field7528[3] = arg9;
        this.field7528[1] = arg7;
        this.field7521[1] = arg11;
        this.field7522 = (short) (arg2 >> class130.field2185);
        this.field7521[3] = arg13;
        this.field7521[0] = arg10;
        this.field7521[2] = arg12;
        this.field7519 = (short) (arg4 >> class130.field2185);
        this.field7530 = (short) (arg10 >> class130.field2185);
        this.field7527 = (short) (arg12 >> class130.field2185);
        this.field7525 = new short[4];
        this.field7520 = new short[4];
        this.field7531 = new short[4];
    }
}
