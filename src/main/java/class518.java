import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class518 {

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "[I")
    public static int[] field6906 = new int[1000];

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method2886(byte[] arg0, boolean arg1) {
        field6905++;
        class335 var2 = new class335(arg0);
        if (!arg1) {
            method2886(null, true);
        }
        int var3 = var2.method2034(255);
        int var4 = var2.method2045(-98);
        if (var4 < 0 || class256.field3548 != 0 && var4 > class256.field3548) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1985((byte) 0, var4, var5, 0);
            return var5;
        } else {
            int var6 = var2.method2045(-98);
            if (var6 < 0 || class256.field3548 != 0 && var6 > class256.field3548) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class245.method1502(var7, var6, arg0, var4, 9);
            } else {
                class132 var8 = class381.field5092;
                synchronized (class381.field5092) {
                    class381.field5092.method993((byte) -96, var2, var7);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public static final void method2887(int arg0) {
        int var1 = -37 / ((11 - arg0) / 52);
        field6904++;
        int var2 = class344.field4718.method1568((byte) -126, class571.field7587);
        if (var2 == 0) {
            class431.field5903 = null;
            class600.method3311((byte) 112, 0);
        } else if (var2 == 1) {
            class527.method2941(111, (byte) 0);
            class600.method3311((byte) 49, 512);
            if (class477.field6362 != null) {
                class355.method2104((byte) 110);
            }
        } else {
            class527.method2941(-14, (byte) (class20.field321 - 4 & 0xFF));
            class600.method3311((byte) 107, 2);
        }
        class315.field4342 = class29.field476;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V")
    public static void method2888(boolean arg0) {
        if (arg0) {
            method2888(true);
        }
        field6906 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB)Z")
    public static final boolean method2889(int arg0, byte arg1) {
        if (arg1 != 0) {
            method2887(-80);
        }
        field6907++;
        return arg0 == 4 || arg0 == 8 || arg0 == 11;
    }
}
