import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class511 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ldw;[[BI)V")
    public static final void method3017(class669 arg0, byte[][] arg1, int arg2) {
        int var3 = 0;
        if (arg2 != 8) {
            method3018(null, (byte) -1, null);
        }
        while (arg0.field2258 > var3) {
            class418.method2539(false);
            for (int var4 = 0; var4 < (class675.field9604 >> 3); var4++) {
                for (int var5 = 0; var5 < (class218.field3316 >> 3); var5++) {
                    int var6 = class674.field9598[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3D9C177) >> 24;
                        if (!arg0.field2265 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFC) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class335.field5019.length; var12++) {
                                if (class335.field5019[var12] == var11 && arg1[var12] != null) {
                                    arg0.method3782(-2, class623.field9017, arg1[var12], var7, var4 * 8, (var9 & 0x7) * 8, class223.field3352, var8, (var10 & 0x7) * 8, var5 * 8, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var3++;
        }
        field7231++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Llk;BLlk;)V")
    public static final void method3018(class545 arg0, byte arg1, class545 arg2) {
        class149.field2562++;
        field7229++;
        class275 var3 = class185.method1355(arg1 ^ 0x33, class59.field1335, class395.field5772);
        var3.field4103.method715(arg2.field7755, arg1 ^ 0x743A813B);
        var3.field4103.method717(arg1 - 50098603, arg2.field7697);
        if (arg1 != 51) {
            method3018(null, (byte) 23, null);
        }
        var3.field4103.method717(arg1 ^ 0xFD038EBB, arg0.field7697);
        var3.field4103.method745(arg0.field7702, 128);
        var3.field4103.method746(0, arg2.field7702);
        var3.field4103.method701(arg0.field7755, (byte) -33);
        class140.method1141(var3, 19321);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3019(String arg0, int arg1) {
        if (arg1 > -81) {
            return 45;
        } else {
            field7230++;
            return arg0.length() + 1;
        }
    }
}
