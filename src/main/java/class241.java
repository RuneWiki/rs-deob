import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class241 extends class89 {

    @OriginalMember(owner = "client!wg", name = "pb", descriptor = "I")
    public static int field4326 = 0;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "Lq;")
    public static class174 field4321 = new class174(5);

    @OriginalMember(owner = "client!wg", name = "qb", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!wg", name = "sb", descriptor = "Lmb;")
    public static class132 field4329 = class166.method1092("<col=ffff00>*V", 124);

    @OriginalMember(owner = "client!wg", name = "rb", descriptor = "I")
    public static int field4328 = 0;

    @OriginalMember(owner = "client!wg", name = "lb", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!wg", name = "mb", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!wg", name = "nb", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!wg", name = "ob", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)I")
    public static final int method1537(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 / arg0;
        int var5 = arg2 / arg0;
        ++field4322;
        if (arg1 != -102) {
            return 91;
        } else {
            int var6 = arg0 - 1 & arg3;
            int var7 = class161.method1043(var4, (byte) 81, var5);
            int var8 = class161.method1043(var4 + 1, (byte) -116, var5);
            int var9 = arg2 & arg0 - 1;
            int var10 = class161.method1043(var4, (byte) -95, var5 + 1);
            int var11 = class161.method1043(var4 + 1, (byte) 76, var5 - -1);
            int var12 = class56.method380(var8, arg0, var7, var6, -14446);
            int var13 = class56.method380(var11, arg0, var10, var6, -14446);
            return class56.method380(var13, arg0, var12, var9, -14446);
        }
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
    public static void method1538(int arg0) {
        field4321 = null;
        if (arg0 != -11666) {
            field4328 = 91;
        }
        field4329 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (super.field764.field3960 && this.method555(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1555 * super.field1555;
            for (int var8 = 0; ~class131.field2427 < ~var8; ++var8) {
                int var9 = super.field1554[var7 - -(var8 % super.field1562)];
                var6[var8] = class75.method450(255, var9) << 4;
                var5[var8] = class75.method450(var9 >> 4, 4080);
                var4[var8] = class75.method450(16711680, var9) >> 12;
            }
        }
        ++field4324;
        if (arg0 != -1893) {
            field4326 = 105;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lkd;B)V")
    public static final void method1539(class112 arg0, byte arg1) {
        if (arg1 == 25) {
            ++field4325;
            byte[] var2 = new byte[24];
            if (class169.field3130 != null) {
                try {
                    class169.field3130.method68(arg1 ^ 25, 0L);
                    class169.field3130.method70((byte) -94, var2);
                    int var3;
                    for (var3 = 0; ~var3 > -25 && ~var2[var3] == -1; ++var3) {
                    }
                    if (var3 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var5) {
                    for (int var4 = 0; var4 < 24; ++var4) {
                        var2[var4] = -1;
                    }
                }
            }
            arg0.method742((byte) -121, 0, 24, var2);
        }
    }
}
