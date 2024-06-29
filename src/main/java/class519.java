import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class519 extends class402 {

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "Lrn;")
    public static class633 field6600 = new class633(41, 7);

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "[I")
    public static int[] field6602 = new int[5];

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(CB)Z", line = 4)
    public static final boolean method2863(char arg0, byte arg1) {
        field6599++;
        if (arg1 != 69) {
            method2865(116L, (byte) 85);
        }
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class638.method3449(arg0, -91)) {
            return true;
        } else {
            char[] var2 = class21.field196;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class499.field6408;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 56)
    public static void method2864(byte arg0) {
        field6600 = null;
        if (arg0 != 105) {
            method2863('F', (byte) -77);
        }
        field6602 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(JB)V", line = 67)
    public static final void method2865(long arg0, byte arg1) {
        field6601++;
        int var3 = class12.field125;
        if (class599.field7622 != var3) {
            int var4 = var3 - class599.field7622;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var4 > var5) {
                var5 = var4;
            }
            class599.field7622 += var5;
        }
        int var6 = class433.field5674;
        if (class572.field7251 != var6) {
            int var7 = var6 - class572.field7251;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class572.field7251 += var8;
        }
        class698.field9250 += (float) arg0 * class436.field5733 / 40.0F * 8.0F;
        class297.field3762 += (float) arg0 * class327.field4010 / 40.0F * 8.0F;
        class291.method1757(-4);
        if (arg1 > -37) {
            field6600 = null;
        }
    }
}
