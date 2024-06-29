import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class675 {

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "I")
    public static int field9604 = 104;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
    public static int field9599 = 0;

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "[Lnr;")
    public static class53[] field9606 = new class53[128];

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "I")
    public static int field9603 = -1;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLom;)I")
    public static final int method3799(byte arg0, class344 arg1) {
        field9602++;
        int var2 = 0;
        if (arg1.method2230((byte) 50, class542.field7566)) {
            var2++;
        }
        if (arg1.method2230((byte) 70, class302.field4504)) {
            var2++;
        }
        if (arg1.method2230((byte) 41, class372.field5532)) {
            var2++;
        }
        if (arg1.method2230((byte) -81, class208.field3178)) {
            var2++;
        }
        if (arg1.method2230((byte) -112, class537.field7522)) {
            var2++;
        }
        if (arg1.method2230((byte) 48, class493.field7048)) {
            var2++;
        }
        if (arg1.method2230((byte) 63, class75.field1526)) {
            var2++;
        }
        if (arg1.method2230((byte) -80, class454.field6488)) {
            var2++;
        }
        if (arg1.method2230((byte) -111, class7.field514)) {
            var2++;
        }
        if (arg1.method2230((byte) -125, class365.field5418)) {
            var2++;
        }
        if (arg1.method2230((byte) -101, class210.field3204)) {
            var2++;
        }
        if (arg1.method2230((byte) 64, class681.field9650)) {
            var2++;
        }
        if (arg1.method2230((byte) -92, class173.field2863)) {
            var2++;
        }
        if (arg1.method2230((byte) -87, class604.field8763)) {
            var2++;
        }
        if (arg0 >= -41) {
            return 30;
        }
        if (arg1.method2230((byte) 80, class365.field5414)) {
            var2++;
        }
        if (arg1.method2230((byte) -94, class405.field5855)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z)V")
    public static final void method3800(boolean arg0) {
        class438.field6315 = class208.method1458(0.4F, 8, 2048, 35, 8, 4, true, (byte) 103);
        if (arg0) {
            method3801(-56);
        }
        field9605++;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
    public static void method3801(int arg0) {
        if (arg0 < 26) {
            method3799((byte) 31, null);
        }
        field9606 = null;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lbw;II)Z")
    public static final boolean method3802(class641 arg0, int arg1, int arg2) {
        field9601++;
        int var3 = arg0.method3648(arg2 + 53, 2);
        if (var3 == 0) {
            if (arg0.method3648(90, 1) != 0) {
                method3802(arg0, arg1, arg2);
            }
            int var4 = arg0.method3648(66, 6);
            int var5 = arg0.method3648(arg2 + 106, 6);
            boolean var6 = arg0.method3648(81, 1) == 1;
            if (var6) {
                class305.field4526[class507.field7186++] = arg1;
            }
            if (class59.field1341[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class455 var7 = class568.field8276[arg1];
            class602 var8 = class59.field1341[arg1] = new class602();
            var8.field8728 = arg1;
            if (class577.field8397[arg1] != null) {
                var8.method3450(class577.field8397[arg1], arg2 ^ 0xFFFFFFD9);
            }
            var8.method3454(var7.field6489, 0, true);
            var8.field8770 = var7.field6493;
            int var9 = var7.field6491;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FC01F) >> 14;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class33.field967;
            int var14 = (var12 << 6) + var5 - class323.field4749;
            var8.field8645 = var7.field6490;
            var8.field8786[0] = class301.field4499[arg1];
            var8.field9814 = var8.field9804 = (byte) var10;
            if (class89.method868(arg2 ^ 0x1403, var13, var14)) {
                var8.field9804++;
            }
            var8.method3445(arg2 - 30432, var13, var14);
            var8.field8635 = false;
            class568.field8276[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg0.method3648(61, 2);
            int var16 = class568.field8276[arg1].field6491;
            class568.field8276[arg1].field6491 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method3648(-72, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class568.field8276[arg1].field6491;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FEE79) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class568.field8276[arg1].field6491 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method3648(-66, 18);
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFF31) >> 8;
            int var27 = var24 & 0xFF;
            int var28 = class568.field8276[arg1].field6491;
            if (arg2 != 6) {
                method3802(null, 111, -22);
            }
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var28 + var27 & 0xFF;
            class568.field8276[arg1].field6491 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }
}
