import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public abstract class class95 extends class578 {

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "Lgca;")
    public static class227 field1335 = new class227();

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "I")
    public static int field1338 = 0;

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "F")
    public static float field1334;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "[I")
    public static int[] field1336;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 3)
    public static void method691(byte arg0) {
        if (arg0 > -117) {
            method697(true, null, null);
        }
        field1336 = null;
        field1335 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Lcba;", line = 16)
    public static final class511 method693(int arg0, int arg1, int arg2) {
        class390 var3 = class295.field4051[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class511 var4 = var3.field5531;
            var3.field5531 = null;
            class706.method3954(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(III)I", line = 27)
    public static final int method694(int arg0, int arg1, int arg2) {
        field1337++;
        int var3 = arg2 >>> 24;
        if (arg0 >= -115) {
            field1338 = 121;
        }
        int var4 = 255 - var3;
        int var5 = ((arg2 & 0xFF00) * var3 & 0xFF0000 | (arg2 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZJLjava/lang/String;I)V", line = 45)
    public static final void method695(boolean arg0, long arg1, String arg2, int arg3) {
        field1333++;
        if (arg0) {
            class467.method2639((byte) -95);
            if (class659.field9152.equals("")) {
                class610.field8467 = 39;
                return;
            }
        }
        class501 var5 = new class501(576);
        var5.method2817(10, true);
        if (arg3 < 80) {
            method693(-30, -45, -119);
        }
        var5.method2837((int) (Math.random() * 65535.0D), -2);
        var5.method2834(arg1, 79);
        var5.method2837(arg0 ? class54.field615 : class254.field3462, -2);
        var5.method2820(127, arg2);
        var5.method2834(arg0 ? class63.field725 : class365.field4859, 100);
        if (arg0) {
            var5.method2834(class664.method3757(-47, class659.field9152), 93);
            try {
                var5.method2834(Long.parseLong(class83.field1243), 83);
            } catch (Exception var9) {
                class610.field8467 = 39;
                return;
            }
        } else {
            var5.method2836((int) (Math.random() * 9.9999999E7D), -22164);
            var5.method2836((int) (Math.random() * 9.9999999E7D), -22164);
            var5.method2836((int) (Math.random() * 9.9999999E7D), -22164);
            var5.method2836((int) (Math.random() * 9.9999999E7D), -22164);
        }
        var5.method2836((int) (Math.random() * 9.9999999E7D), -22164);
        var5.method2824(class418.field5910, class181.field2618, true);
        class352 var6 = class555.method3114(-1);
        var6.field4686.method2817(arg0 ? class206.field2898.field6750 : class206.field2895.field6750, true);
        int var7 = 1;
        if (class316.field4350 != null) {
            var7 += class316.field4350.length() + 1;
        }
        var6.field4686.method2837(var7 + var5.field6892 + 28, -2);
        var6.field4686.method2837(626, -2);
        var6.field4686.method2817(class697.field9900, true);
        var6.field4686.method2817(class219.field3065.field5857, true);
        class23.method236(var6.field4686, 1);
        String var8 = arg0 ? class619.field8613 : class316.field4350;
        var6.field4686.method2817(var8 == null ? 0 : 1, true);
        if (var8 != null) {
            var6.field4686.method2820(-127, var8);
        }
        var6.field4686.method2873(var5.field6892, 0, var5.field6855, -29981);
        class602.method3388(var6, (byte) 28);
        class672.field9428 = 0;
        class263.field3571 = 1;
        class129.field1850 = 0;
        class610.field8467 = -3;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V", line = 121)
    public class95(int arg0) {
        this.field1332 = arg0;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLjava/lang/Object;Llaa;)V", line = 130)
    public static final void method697(boolean arg0, Object arg1, class105 arg2) {
        field1331++;
        if (arg2.field1464 == null) {
            return;
        }
        if (arg0) {
            method693(-51, -55, 93);
        }
        for (int var3 = 0; var3 < 50 && arg2.field1464.peekEvent() != null; var3++) {
            class519.method2960(82, 1L);
        }
        try {
            if (arg1 != null) {
                arg2.field1464.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method692(int arg0);

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)Z")
    public abstract boolean method696(byte arg0);
}
