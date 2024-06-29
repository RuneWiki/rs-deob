import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class397 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lau;")
    private class692 field5997 = new class692(64);

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public int field6003 = 0;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lmv;")
    private class295 field5996;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public int field6000;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Liba;")
    public static class211 field6001 = new class211(67, 2);

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "F")
    public static float field6002;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "[I")
    public static int[] field6004;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2466(int arg0, int arg1, int arg2) {
        if (arg2 <= 122) {
            field6001 = null;
        }
        field5994++;
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIIIII)V", line = 14)
    public static final void method2467(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class14[] var7 = class700.field9879;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class14 var9 = var7[var8];
            if (var9 != null && var9.field317 == 2) {
                class375.method2325(arg1 >> 1, arg5, var9.field321, var9.field315, var9.field313, arg4 >> 1, var9.field323 * 2, arg2, -36);
                if (class194.field2602[0] > -1 && class45.field685 % 20 < 10) {
                    class519.field7280[var9.field312].method1534(class194.field2602[0] + arg6 - 12, class194.field2602[1] + arg3 + -28);
                }
            }
        }
        if (arg0 != 103) {
            method2469((byte) 110);
        }
        field5999++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 45)
    public final void method2468(int arg0, int arg1) {
        class692 var3 = this.field5997;
        synchronized (this.field5997) {
            this.field5997.method3900(arg1, 0);
            if (arg0 != -1044219647) {
                method2467((byte) -73, 115, -4, -50, -111, 43, -74);
            }
        }
        field5993++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 60)
    public static void method2469(byte arg0) {
        field6004 = null;
        field6001 = null;
        int var1 = 38 / ((35 - arg0) / 35);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 73)
    public final void method2470(int arg0) {
        if (arg0 <= 123) {
            this.method2472(126, 74);
        }
        class692 var2 = this.field5997;
        synchronized (this.field5997) {
            this.field5997.method3891(13747);
        }
        field5995++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 86)
    public final void method2471(boolean arg0) {
        field5998++;
        if (!arg0) {
            field6001 = null;
        }
        class692 var2 = this.field5997;
        synchronized (this.field5997) {
            this.field5997.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Ljo;", line = 103)
    public final class335 method2472(int arg0, int arg1) {
        if (arg0 != 4) {
            method2466(112, -58, -6);
        }
        field5992++;
        class692 var3 = this.field5997;
        class335 var4;
        synchronized (this.field5997) {
            var4 = (class335) this.field5997.method3901((long) arg1, arg0 ^ 0xFFFFFFC1);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field5996;
        byte[] var6;
        synchronized (this.field5996) {
            var6 = this.field5996.method1844(4, arg0 ^ 0x7A66, arg1);
        }
        class335 var7 = new class335();
        var7.field4871 = arg1;
        var7.field4869 = this;
        if (var6 != null) {
            var7.method2057((byte) -118, new class540(var6));
        }
        var7.method2055((byte) 100);
        class692 var8 = this.field5997;
        synchronized (this.field5997) {
            this.field5997.method3894(var7, (byte) 60, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 150)
    public class397(class373 arg0, int arg1, class295 arg2) {
        this.field5996 = arg2;
        this.field6000 = this.field5996.method1845(4, true);
    }
}
