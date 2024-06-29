import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class93 extends class243 {

    @OriginalMember(owner = "client!aja", name = "D", descriptor = "Lhda;")
    public static class750 field1228 = new class750(6, 1);

    @OriginalMember(owner = "client!aja", name = "E", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!aja", name = "F", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)V")
    public static void method647(boolean arg0) {
        if (!arg0) {
            method647(false);
        }
        field1228 = null;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        ++field1230;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            field1228 = null;
        }
        if (super.field3164.field9250) {
            class373.method2196(var3, 0, class687.field9628, class685.field9613[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "()V")
    public class93() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lha;B)V")
    public static final void method648(class60 arg0, byte arg1) {
        ++field1229;
        int var2 = 0;
        int var3 = 0;
        if (class247.field3206) {
            var2 = class63.method488((byte) 42);
            var3 = class231.method1364(false);
        }
        arg0.method426(var2, var3, class546.field7710 - -var2, 350 - -var3);
        arg0.method447(var2, var3, class546.field7710, 350, 3351159 | class586.field8201 << 24, 1);
        if (arg1 <= 122) {
            method648((class60) null, (byte) -3);
        }
        class207.method1157(var3 + 350, var3, false, var2, class546.field7710 + var2);
        int var4 = 350 / class531.field7219;
        if (class543.field7690 > 0) {
            int var5 = -class531.field7219 + -4 + 346;
            int var6 = var4 * var5 / (var4 + -1 + class543.field7690);
            int var7 = 4;
            if (class543.field7690 > 1) {
                var7 += (-class52.field549 + class543.field7690 + -1) * (-var6 + var5) / (class543.field7690 + -1);
            }
            arg0.method447(class546.field7710 + var2 + -16, var3 - -var7, 12, var6, class586.field8201 << 24 | 3351159, 2);
            for (int var8 = class52.field549; var8 < class52.field549 + var4 && ~var8 > ~class543.field7690; ++var8) {
                String[] var9 = class490.method2753(class73.field784[var8], '\b', false);
                int var10 = (class546.field7710 + -16 - 8) / var9.length;
                for (int var11 = 0; ~var9.length < ~var11; ++var11) {
                    int var12 = 8 - -(var10 * var11);
                    arg0.method426(var2 - -var12, var3, var2 + var12 + var10 - 8, var3 + 350);
                    class399.field5650.method475((byte) 85, -class294.field3954.field5236 + 348 + -((-class52.field549 + var8) * class531.field7219) + -class437.field6130 + var3, class182.method1033(0, var9[var11]), -1, -16777216, var2 - -var12);
                }
            }
        }
        class497.field6764.method462(-1, 0, var2 - -class546.field7710 + -25, -16777216, "Build: 637", var3 - -350 + -20);
        arg0.method426(var2, var3, var2 - -class546.field7710, var3 + 350);
        arg0.method359(22294, class546.field7710, -1, var3 + 350 - class437.field6130, var2);
        class214.field2575.method475((byte) -97, -class616.field8643.field5236 + var3 + 349, "--> " + class182.method1033(0, class704.field9878), -1, -16777216, var2 + 10);
        if (class51.field539) {
            int var13 = -1;
            if (class406.field5732 % 30 > 15) {
                var13 = 16777215;
            }
            arg0.method361(8479, var3 + 350 + -class616.field8643.field5236 + -11, class616.field8643.method2216("--> " + class182.method1033(0, class704.field9878).substring(0, class304.field4125), 127) + var2 + 10, var13, 12);
        }
    }
}
