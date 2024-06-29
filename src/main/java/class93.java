import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class93 extends class270 {

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[F")
    public static float[] field1227 = new float[16];

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field1230 = 1405;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[I")
    public static int[] field1228 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
    public static int[] field1229 = new int[2048];

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field1231 = 1;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V", line = 5)
    public static void method685(byte arg0) {
        field1229 = null;
        field1228 = null;
        field1227 = null;
        if (arg0 != -49) {
            field1229 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([[BILop;)V", line = 21)
    public static final void method686(byte[][] arg0, int arg1, class172 arg2) {
        field1226++;
        for (int var3 = 0; var3 < arg2.field3766; var3++) {
            class74.method592(0);
            for (int var4 = 0; var4 < (class86.field1185 >> 3); var4++) {
                for (int var5 = 0; var5 < (class526.field7212 >> 3); var5++) {
                    int var6 = class308.field4593[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x38DE41B) >> 24;
                        if (!arg2.field3775 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFD) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class234.field3367.length; var12++) {
                                if (class234.field3367[var12] == var11 && arg0[var12] != null) {
                                    arg2.method1180(var5 * 8, class630.field8790, class480.field6696, (var10 & 0x7) * 8, var7, var3, arg0[var12], (var9 & 0x7) * 8, var4 * 8, (byte) 96, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 <= 45) {
            method686(null, 17, null);
        }
    }
}
