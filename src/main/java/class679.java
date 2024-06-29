import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class679 extends class585 {

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "Lda;")
    public static class66 field9437;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILmea;Z)V", line = 4)
    public static final void method3849(int arg0, class451 arg1, boolean arg2) {
        ++field9435;
        int var3 = ~arg1.field6301 != -1 ? arg1.field6301 : arg1.field6290;
        int var4 = ~arg1.field6169 == -1 ? arg1.field6288 : arg1.field6169;
        class489.method2916(class787.field10812[arg1.field6222 >> 16], (byte) -11, var3, arg1.field6222, arg2, var4);
        if (arg1.field6270 != null) {
            class489.method2916(arg1.field6270, (byte) -11, var3, arg1.field6222, arg2, var4);
        }
        class744 var5 = (class744) class11.field217.method2242((long) arg1.field6222, -1);
        if (var5 != null) {
            class100.method712(var4, var5.field10314, arg2, 119, var3);
        }
        int var6 = -126 % ((29 - arg0) / 45);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V", line = 27)
    public static void method3850(int arg0) {
        int var1 = -92 / ((arg0 - -11) / 38);
        field9437 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)[I", line = 37)
    public final int[] method55(int arg0, int arg1) {
        if (arg1 <= 123) {
            return null;
        } else {
            ++field9438;
            int[] var3 = super.field8255.method1637(-29827, arg0);
            if (super.field8255.field3677) {
                int var4 = class633.field8892[arg0];
                for (int var5 = 0; var5 < class293.field4278; ++var5) {
                    var3[var5] = this.method3851(class581.field8200[var5], var4, -125) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(III)I", line = 70)
    private final int method3851(int arg0, int arg1, int arg2) {
        ++field9436;
        int var4 = arg1 * 57 + arg0;
        if (arg2 > -86) {
            this.method55(-15, 30);
        }
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 85)
    public class679() {
        super(0, true);
    }
}
