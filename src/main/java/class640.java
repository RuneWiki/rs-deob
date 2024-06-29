import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class640 {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lhm;")
    private class208 field8672 = new class208(128);

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lpfa;")
    private class275 field8673;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field8666 = 0;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field8670 = new String[100];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    public static int[] field8667 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field8675 = -1;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lvf;")
    public static class141 field8674 = new class141(12, 0, 1, 0);

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
    public static final void method3589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -124 % ((67 - arg1) / 33);
        for (int var6 = 0; var6 < class211.field2489; var6++) {
            Rectangle var7 = class68.field824[var6];
            if (arg2 < (var7.x + var7.width) && arg2 + arg4 > var7.x && (var7.y + var7.height) > arg3 && var7.y < arg0 + arg3) {
                class128.field1559[var6] = true;
            }
        }
        field8668++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([BLjava/lang/String;II)I")
    public static final int method3590(byte[] arg0, String arg1, int arg2, int arg3) {
        field8671++;
        int var4 = arg2;
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class245.method1469(arg1.charAt(var6), (byte) 9);
            int var8 = var5 <= var6 + 1 ? -1 : class245.method1469(arg1.charAt(var6 + 1), (byte) 9);
            int var9 = var6 + 2 >= var5 ? -1 : class245.method1469(arg1.charAt(var6 + 2), (byte) 9);
            int var10 = var5 > var6 + 3 ? class245.method1469(arg1.charAt(var6 + 3), (byte) 9) : -1;
            arg0[arg2++] = (byte) class364.method2113(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class364.method2113(class109.method762(240, var8 << 4), var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class364.method2113(class109.method762(var9, 3) << 6, var10);
        }
        if (arg3 != 16711935) {
            field8674 = null;
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method3591(byte arg0) {
        field8670 = null;
        if (arg0 != 114) {
            field8667 = null;
        }
        field8667 = null;
        field8674 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)Lcl;")
    public final class250 method3592(boolean arg0, int arg1) {
        field8669++;
        class208 var3 = this.field8672;
        class250 var5;
        synchronized (this.field8672) {
            if (arg0) {
                return null;
            }
            var5 = (class250) this.field8672.method1221((long) arg1, true);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field8673.method1659(89, class318.method1849(arg1, (byte) 93), class699.method3860((byte) -70, arg1));
        class250 var7 = new class250();
        if (var6 != null) {
            var7.method1498(arg0, new class572(var6));
        }
        class208 var8 = this.field8672;
        synchronized (this.field8672) {
            this.field8672.method1230((byte) 93, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lbs;ILpfa;)V")
    public class640(class643 arg0, int arg1, class275 arg2) {
        this.field8673 = arg2;
        if (this.field8673 != null) {
            int var4 = this.field8673.method1642(-82) - 1;
            this.field8673.method1655(var4, (byte) -82);
        }
    }
}
