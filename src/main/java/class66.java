import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class66 extends class694 {

    @OriginalMember(owner = "client!u", name = "L", descriptor = "[I")
    public static int[] field871 = new int[50];

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Lfc;")
    public static class235 field870 = new class235(97, 1);

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(III)Z", line = 6)
    public static final boolean method538(int arg0, int arg1, int arg2) {
        if (arg1 >= -122) {
            return false;
        } else {
            ++field867;
            return (arg2 & 262144) != 0 | class480.method2723((byte) 94, arg0, arg2) || class564.method3121(-1, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)V", line = 17)
    public static final void method539(byte arg0, int arg1) {
        ++field869;
        if (class101.field1370 != arg1) {
            class86.field1185 = class526.field7212 = class350.field5044[arg1];
            class213.method1398(-69);
            class205.field3022 = new int[class86.field1185][class526.field7212];
            class308.field4593 = new int[4][class86.field1185 >> 3][class526.field7212 >> 3];
            class561.field7570 = new int[class86.field1185][class526.field7212];
            for (int var2 = 0; var2 < 4; ++var2) {
                class480.field6696[var2] = class633.method3518(true, class86.field1185, class526.field7212);
            }
            if (arg0 <= 74) {
                method541(112);
            }
            class446.field6246 = new byte[4][class86.field1185][class526.field7212];
            class674.method3732(class86.field1185, class526.field7212, 4, -128);
            class305.method1874(class526.field7212 >> 3, 1, class86.field1185 >> 3, class630.field8790);
            class101.field1370 = arg1;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 49)
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I", line = 52)
    public final int[] method39(int arg0, int arg1) {
        if (arg0 < 112) {
            this.method540(32, 71, 111);
        }
        ++field868;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int var4 = class105.field1409[arg1];
            for (int var5 = 0; var5 < class465.field6544; ++var5) {
                var3[var5] = this.method540(class346.field4994[var5], var4, -98) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(III)I", line = 85)
    private final int method540(int arg0, int arg1, int arg2) {
        int var4 = -97 / ((arg2 - 67) / 56);
        ++field866;
        int var5 = arg1 * 57 + arg0;
        int var6 = var5 << 1 ^ var5;
        return 4096 - (Integer.MAX_VALUE & (var6 * 15731 * var6 - -789221) * var6 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!u", name = "i", descriptor = "(I)V", line = 98)
    public static void method541(int arg0) {
        field870 = null;
        field871 = null;
        if (arg0 != 28121) {
            method539((byte) -128, -16);
        }
    }
}
