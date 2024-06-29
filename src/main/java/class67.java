import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class67 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Leb;")
    public static class230 field1266 = class68.method589(0, "Fps:");

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1263 = Calendar.getInstance();

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lkk;")
    public static class223 field1268;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Z")
    public static boolean field1264;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII[Lhh;BII[BZI)V")
    public static final void method585(int arg0, int arg1, int arg2, int arg3, class116[] arg4, byte arg5, int arg6, int arg7, byte[] arg8, boolean arg9, int arg10) {
        field1262++;
        if (arg5 > -70) {
            method586((byte) 29);
        }
        int var11 = -1;
        class14 var12 = new class14(arg8);
        while (true) {
            int var13 = var12.method152((byte) 30);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method202(69);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFF7) >> 6;
                int var18 = var14 >> 12;
                int var19 = var12.method200(255);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg0 == var18 && var17 >= arg3 && var17 < arg3 + 8 && var16 >= arg7 && arg7 + 8 > var16) {
                    class194 var22 = class251.method1776(var11, 65280);
                    int var23 = arg10 + class78.method652(var22.field3500, var16 & 0x7, 16, var20, arg6, var17 & 0x7, var22.field3476);
                    int var24 = arg1 + class9.method86(var20, var22.field3476, var16 & 0x7, var22.field3500, 1, var17 & 0x7, arg6);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class116 var25 = null;
                        if (!arg9) {
                            int var26 = arg2;
                            if ((class79.field1435[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg4[var26];
                            }
                        }
                        class130.method1026(var24, arg6 + var20 & 0x3, 82, var23, !arg9, var25, arg2, var11, var21, arg9, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method586(byte arg0) {
        field1263 = null;
        if (arg0 >= -125) {
            method586((byte) 121);
        }
        field1268 = null;
        field1266 = null;
    }
}
