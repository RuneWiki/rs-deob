import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class class298 extends class424 {

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "S")
    public static short field3897 = 205;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "Lft;")
    public static class285 field3898 = new class285(4, 16);

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field3901 = 0;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "[I")
    public int[] field3895;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static final void method1758(int arg0) {
        field3896++;
        class138.field1810.method3656((byte) 0);
        if (arg0 <= 75) {
            method1763(13);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public abstract void method1759(Graphics arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(CB)Z")
    public static final boolean method1760(char arg0, byte arg1) {
        if (arg1 >= -54) {
            field3897 = 110;
        }
        field3893++;
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method1761(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)I")
    public static final int method1762(byte arg0) {
        field3902++;
        if (class594.field8025) {
            return 6;
        } else if (class218.field2855 == null) {
            return 0;
        } else if (arg0 == 120) {
            int var1 = class218.field2855.field776;
            if (class33.method266(-12281, var1)) {
                return 1;
            } else if (class302.method1770(1002, var1)) {
                return 2;
            } else if (class226.method1419(var1, (byte) 111)) {
                return 3;
            } else if (class478.method2652(112, var1)) {
                return 4;
            } else {
                return 5;
            }
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
    public static void method1763(int arg0) {
        field3898 = null;
        if (arg0 != -18972) {
            field3897 = 20;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZIZLhw;)V")
    public static final void method1764(boolean arg0, int arg1, boolean arg2, class270 arg3) {
        field3900++;
        int var4 = arg3.field3588;
        int var5 = (int) arg3.field5499;
        arg3.method2438((byte) 113);
        if (arg2) {
            class469.method2601(var4, (byte) -99);
        }
        class365.method2105(var4, (byte) -113);
        class477 var6 = class600.method3268(-66, var5);
        if (var6 != null) {
            class386.method2199(var6, false);
        }
        class459.method2583((byte) -30);
        if (!arg0 && class196.field2562 != -1) {
            class491.method2685(1, 2626, class196.field2562);
        }
        class45 var7 = new class45(class700.field9763);
        if (arg1 >= -75) {
            field3897 = -17;
        }
        for (class270 var8 = (class270) var7.method420(0); var8 != null; var8 = (class270) var7.method421(116)) {
            if (!var8.method2440(19)) {
                var8 = (class270) var7.method420(0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field3591 == 3) {
                int var9 = (int) var8.field5499;
                if ((var9 >>> 16) == var4) {
                    method1764(arg0, -95, true, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method1765(Canvas arg0, int arg1);
}
