import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class380 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lsw;")
    private class641 field5040 = new class641(256);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Ln;")
    private class17 field5038;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lmh;")
    private class537 field5039;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[C")
    public static char[] field5044 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public final void method2201(byte arg0) {
        field5043++;
        this.field5040.method3686((byte) 53, 5);
        if (arg0 != -111) {
            this.method2202(-7, 101);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Lrr;")
    public final class303 method2202(int arg0, int arg1) {
        if (arg1 < 97) {
            method2204(23);
        }
        field5042++;
        Object var3 = this.field5040.method3682(0, (long) arg0);
        if (var3 != null) {
            return (class303) var3;
        } else if (this.field5038.method118(arg0, (byte) 65)) {
            class217 var4 = this.field5038.method119(-106, arg0);
            int var5 = var4.field2642 ? 64 : this.field5039.field7719;
            class303 var7;
            if (var4.field2655 && this.field5039.method1143()) {
                float[] var6 = this.field5038.method117(var5, var5, 0.7F, 16173, false, arg0);
                var7 = new class303(this.field5039, 3553, 34842, var5, var5, var4.field2654 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field2640) {
                    var8 = this.field5038.method116(0.7F, -115, var5, false, var5, arg0);
                } else {
                    var8 = this.field5038.method120(var5, true, 0.7F, arg0, var5, 120);
                }
                var7 = new class303(this.field5039, 3553, 6408, var5, var5, var4.field2654 != 0, var8, false);
            }
            var7.method1671((byte) -46, var4.field2653, var4.field2659);
            this.field5040.method3684(var7, 0, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lgn;Z)Z")
    public static final boolean method2203(class598 arg0, boolean arg1) {
        boolean var2 = class370.field4884 == class128.field1574;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method321((byte) 100);
        if (arg0.field8653 < 0 || arg0.field8650 < 0 || arg0.field8663 >= class238.field2985 || arg0.field8654 >= class548.field8061) {
            return false;
        }
        for (int var6 = arg0.field8653; var6 <= arg0.field8663; var6++) {
            for (int var9 = arg0.field8650; var9 <= arg0.field8654; var9++) {
                class349 var10 = class78.method450(arg0.field8660, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field8653) {
                        var11++;
                    }
                    if (var6 < arg0.field8663) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field8650) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field8654) {
                        var11 += 2;
                    }
                    class61 var12 = class502.method2897(var11, arg0, -108);
                    class61 var13 = var10.field4499;
                    if (var13 == null) {
                        var10.field4499 = var12;
                    } else {
                        while (var13.field595 != null) {
                            var13 = var13.field595;
                        }
                        var13.field595 = var12;
                    }
                    var10.field4514 = (byte) (var10.field4514 | var11);
                    if (var2 && (class523.field7333[var6][var9] & 0xFF000000) != 0) {
                        var3 = class523.field7333[var6][var9];
                        var4 = class597.field8645[var6][var9];
                        var5 = class640.field9217[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field8653; var7 <= arg0.field8663; var7++) {
                for (int var8 = arg0.field8650; var8 <= arg0.field8654; var8++) {
                    if ((class523.field7333[var7][var8] & 0xFF000000) == 0) {
                        class523.field7333[var7][var8] = var3;
                        class597.field8645[var7][var8] = var4;
                        class640.field9217[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class539.field7889[class639.field9193++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method2204(int arg0) {
        if (arg0 < -111) {
            field5044 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lmh;Ln;)V")
    public class380(class537 arg0, class17 arg1) {
        this.field5038 = arg1;
        this.field5039 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public final void method2205(byte arg0) {
        int var2 = 29 / ((arg0 + 32) / 37);
        this.field5040.method3687(1402);
        field5041++;
    }
}
