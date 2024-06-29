import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class474 extends class477 {

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "B")
    public byte field6789;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public int field6788;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "Lco;")
    public class268 field6792;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6795;

    static {
        new class567(" days.", " Tage.", " jours.", " dias.");
        field6791 = -1;
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V", line = 3)
    public static final void method2745(int arg0) {
        class310.field4550.method2404((byte) -52);
        ++field6793;
        if (arg0 < 66) {
            field6791 = -109;
        }
        class258.field3753.method2404((byte) -78);
        class92.field1631.method2404((byte) -110);
        class601.field8528.method2404((byte) -100);
        class185.field2680.method2404((byte) -49);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII[B)Z", line = 26)
    public static final boolean method2746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ++field6790;
        int var7 = arg4 % arg2;
        int var8;
        if (~var7 == arg3) {
            var8 = 0;
        } else {
            var8 = -var7 + arg2;
        }
        int var9 = -((arg5 - -arg2 - 1) / arg2);
        int var10 = -((arg4 + -1 + arg2) / arg2);
        for (int var11 = var9; ~var11 > -1; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (arg6[arg1] == 0) {
                    return true;
                }
                arg1 += arg2;
            }
            int var13 = arg1 - var8;
            if (arg6[var13 + -1] == 0) {
                return true;
            }
            arg1 = arg0 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I", line = 72)
    public final int method2525(int arg0) {
        ++field6797;
        int var2 = -8 / ((-46 - arg0) / 59);
        return this.field6792 == null ? 0 : this.field6792.field3913 * 100 / (this.field6792.field3952.length + -this.field6789);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V", line = 88)
    public static void method2747(byte arg0) {
        if (arg0 != 0) {
            field6791 = -20;
        }
        field6795 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lml;", line = 105)
    public static final class36 method2748(int arg0, int arg1) {
        ++field6794;
        class36[] var2 = class184.method1237(-224);
        for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
            class36 var5 = var2[var3];
            if (~var5.field490 == ~arg1) {
                return var5;
            }
        }
        int var4 = -27 % ((arg0 - 14) / 59);
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)[B", line = 131)
    public final byte[] method2526(int arg0) {
        if (arg0 != -14568) {
            method2746(-96, -121, 92, -85, -120, 115, (byte[]) null);
        }
        ++field6787;
        if (!super.field6814 && ~(this.field6792.field3952.length + -this.field6789) >= ~this.field6792.field3913) {
            return this.field6792.field3952;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILqa;)V", line = 156)
    public static final void method2749(int arg0, class167 arg1) {
        ++field6796;
        if (arg0 != 36) {
            field6791 = -74;
        }
        if (~class97.field1677.method419(101) != -1) {
            if (class646.field9388 != 0) {
                if (class254.field3703 == null) {
                    Canvas var2 = new Canvas();
                    var2.setSize(36, 32);
                    class254.field3703 = class167.method1162(arg0 ^ 36, 0, class227.field3390, 0, var2, class111.field1843);
                    class233.field3431 = class254.field3703.method626(class446.method2633(class517.field7194, (byte) 94, class353.field5059, 0), class518.method2924(class325.field4675, class517.field7194, 0), true);
                }
                for (class229 var3 = (class229) class97.field1677.method427(true); var3 != null; var3 = (class229) class97.field1677.method420(false)) {
                    class611.field8684.method1622(var3.field3401, !var3.field3395 ? null : class644.field9367.field5984, var3.field3392, (byte) -77, var3.field3394, arg1, var3.field3400, false, class233.field3431, var3.field3391, false, class254.field3703);
                    var3.method911(-52);
                }
            } else {
                for (class229 var4 = (class229) class97.field1677.method427(true); var4 != null; var4 = (class229) class97.field1677.method420(false)) {
                    class611.field8684.method1622(var4.field3401, var4.field3395 ? class644.field9367.field5984 : null, var4.field3392, (byte) -77, var4.field3394, arg1, var4.field3400, false, class380.field5593, var4.field3391, false, arg1);
                    var4.method911(-52);
                }
                class530.method2980(-6891);
            }
        }
    }
}
