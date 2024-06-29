import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class496 extends class23 {

    @OriginalMember(owner = "client!nt", name = "N", descriptor = "Lsq;")
    public static class485 field7182 = new class485(1);

    @OriginalMember(owner = "client!nt", name = "Q", descriptor = "Lcea;")
    public static class107 field7185 = new class107();

    @OriginalMember(owner = "client!nt", name = "K", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!nt", name = "M", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!nt", name = "O", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!nt", name = "P", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!nt", name = "R", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!nt", name = "S", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(Z)V", line = 3)
    public static final void method2865(boolean arg0) {
        if (arg0) {
            class487.field7044 = class604.field8494;
            class156.field1743 = class666.field9303;
        } else {
            class487.field7044 = class50.field506;
            class156.field1743 = class385.field5193;
        }
        class612.field8618 = class487.field7044.length;
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(III)Z", line = 19)
    public static final boolean method2866(int arg0, int arg1, int arg2) {
        if (arg0 > -57) {
            return true;
        } else {
            ++field7184;
            return (class600.method3366(arg2, arg1, -1) | ~(arg1 & 8192) != -1 | class619.method3452(true, arg2, arg1)) & class494.method2858((byte) 95, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZI)[[I", line = 30)
    public final int[][] method104(boolean arg0, int arg1) {
        ++field7187;
        int[][] var3 = super.field6889.method2091(51, arg1);
        if (!arg0) {
            field7181 = -85;
        }
        if (super.field6889.field4765 && this.method106((byte) -67)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field171 * super.field171;
            for (int var8 = 0; class436.field6154 > var8; ++var8) {
                int var9 = super.field170[var7 - -(var8 % super.field177)];
                var6[var8] = class105.method572(var9, 255) << 4;
                var5[var8] = class105.method572(var9, 65280) >> 4;
                var4[var8] = class105.method572(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "()V", line = 80)
    public static final void method2867() {
        class614.method3416(1, class612.field8618);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/Object;BLpi;)V", line = 84)
    public static final void method2868(Object arg0, byte arg1, class464 arg2) {
        ++field7186;
        if (arg2.field6625 != null) {
            if (arg1 < 62) {
                field7182 = null;
            }
            for (int var3 = 0; ~var3 > -51 && arg2.field6625.peekEvent() != null; ++var3) {
                class452.method2602(1L, (byte) -97);
            }
            try {
                if (arg0 != null) {
                    arg2.field6625.postEvent(new ActionEvent(arg0, 1001, "dummy"));
                }
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Lqq;", line = 112)
    public static final class653 method2869(int arg0) {
        ++field7180;
        if (arg0 >= -90) {
            return null;
        } else {
            class653 var1 = class273.method1604(0);
            var1.field9159 = 0;
            var1.field9161 = null;
            var1.field9158 = new class445(5000);
            return var1;
        }
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(B)V", line = 137)
    public static void method2870(byte arg0) {
        field7182 = null;
        if (arg0 != -118) {
            field7185 = null;
        }
        field7185 = null;
    }
}
