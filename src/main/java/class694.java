import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class694 extends class256 {

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "S")
    public short field9651;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "S")
    public short field9660;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public static int field9657 = 0;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "[I")
    public static int[] field9653 = new int[13];

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "[I")
    public static int[] field9663 = new int[2];

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field9652;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lkf;Lha;IIIZI)V")
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field9655;
        if (arg3 <= 109) {
            this.field9651 = 101;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "(I)V")
    public static void method3904(int arg0) {
        field9653 = null;
        field9663 = null;
        if (arg0 != 16) {
            field9662 = 105;
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)Z")
    public final boolean method1558(int arg0) {
        if (arg0 > -100) {
            field9658 = 11;
        }
        ++field9661;
        return class672.field9269[(super.field3505 >> class140.field2224) + -class458.field6258 + class183.field2779][(super.field3502 >> class140.field2224) - class610.field8134 + class183.field2779];
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Lha;B)Z")
    public final boolean method1560(class59 arg0, byte arg1) {
        if (arg1 != 35) {
            return true;
        } else {
            ++field9656;
            return class500.method2817(super.field3502 >> class140.field2224, this.method789(-32768), super.field3515, super.field3505 >> class140.field2224, 100);
        }
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)V")
    public final void method803(int arg0) {
        ++field9654;
        if (arg0 == 131072) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method3905(String arg0, int arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        ++field9652;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 - -(arg2 ? class658.field8695.field8139 : class658.field8695.field8142);
        for (int var8 = var6; var8 < var7; ++var8) {
            class430 var11 = class658.field8695.method3326(true, var8);
            if (var11.field5936 && var11.method2485(false).toLowerCase().indexOf(var3) != -1) {
                if (~var5 <= -51) {
                    class284.field4022 = -1;
                    class468.field6429 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var5 > var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        if (arg1 != 2) {
            method3905((String) null, 79, false);
        }
        class284.field4022 = var5;
        class468.field6429 = var4;
        class80.field964 = 0;
        String[] var9 = new String[class284.field4022];
        for (int var10 = 0; class284.field4022 > var10; ++var10) {
            var9[var10] = class658.field8695.method3326(true, var4[var10]).method2485(false);
        }
        class251.method1532(var9, class468.field6429, -90);
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)Z")
    public final boolean method798(int arg0) {
        int var2 = -78 % ((53 - arg0) / 45);
        ++field9664;
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Lnl;")
    public static final class552 method3906(int arg0, int arg1, int arg2) {
        class701 var3 = class660.field8718[arg0][arg1][arg2];
        return var3 != null && var3.field9738 != null ? var3.field9738 : null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([Ltn;B)I")
    public final int method1557(class87[] arg0, byte arg1) {
        if (arg1 != -58) {
            return 89;
        } else {
            ++field9659;
            return this.method1561(arg0, super.field3505 >> class140.field2224, (byte) 85, super.field3502 >> class140.field2224);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIII)V")
    public class694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9651 = (short) arg6;
        super.field3502 = arg2;
        super.field3515 = (byte) arg4;
        this.field9660 = (short) arg5;
        super.field3505 = arg0;
        super.field3510 = arg1;
        super.field3508 = (byte) arg3;
    }
}
