import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class605 {

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public int field8728 = -1;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public int field8733 = -1;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8725 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
    public static int[] field8736 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "[[I")
    public static int[][] field8735 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Z")
    public static boolean field8734 = false;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Ljj;")
    public static class99 field8726;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Z")
    public static boolean field8729;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
    public int[] field8730;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILos;I)V")
    private final void method3478(int arg0, class374 arg1, int arg2) {
        if (arg0 != 19977) {
            return;
        }
        field8727++;
        if (arg2 == 1) {
            this.field8733 = arg1.method2136(false);
        } else if (arg2 == 2) {
            this.field8730 = new int[arg1.method2129(-84)];
            for (int var4 = 0; var4 < this.field8730.length; var4++) {
                this.field8730[var4] = arg1.method2136(false);
            }
        } else if (arg2 == 3) {
            this.field8728 = arg1.method2129(-80);
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjj;)I")
    public static final int method3479(boolean arg0, class99 arg1) {
        field8731++;
        String var2 = class348.method1941(arg1, -40);
        int[] var3 = null;
        if (class240.method1361(0, arg1.field1227)) {
            var3 = class449.field6217.method2026((byte) -63, (int) arg1.field1235).field8766;
        } else if (arg1.field1232 != -1) {
            var3 = class449.field6217.method2026((byte) -110, arg1.field1232).field8766;
        } else if (class564.method3292(arg1.field1227, -26)) {
            class415 var4 = (class415) class309.field3938.method2645((long) ((int) arg1.field1235), (byte) -128);
            if (var4 != null) {
                class459 var5 = var4.field5390;
                class74 var6 = var5.field6334;
                if (var6.field800 != null) {
                    var6 = var6.method420(class281.field3700, 119);
                }
                if (var6 != null) {
                    var3 = var6.field812;
                }
            }
        } else if (class364.method2039((byte) 120, arg1.field1227)) {
            Object var7 = null;
            class437 var8;
            if (arg1.field1227 == 1010) {
                var8 = class16.field126.method1759(false, (int) arg1.field1235);
            } else {
                var8 = class16.field126.method1759(!arg0, (int) (arg1.field1235 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field6004 != null) {
                var8 = var8.method2545(-1, class281.field3700);
            }
            if (var8 != null) {
                var3 = var8.field5967;
            }
        }
        if (var3 != null) {
            var2 = var2 + class404.method2305(0, var3);
        }
        int var9 = class410.field5340.method1244(var2, class7.field59, arg0);
        if (arg1.field1225) {
            var9 += class257.field3312.method291() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method3480(int arg0) {
        field8735 = null;
        field8725 = null;
        field8736 = null;
        if (arg0 == 28117) {
            field8726 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static final void method3481(boolean arg0) {
        field8732++;
        if (!arg0) {
            return;
        }
        class641 var1 = class342.field4407;
        synchronized (class342.field4407) {
            class342.field4407.method3694(0);
        }
        class641 var2 = class325.field4116;
        synchronized (class325.field4116) {
            class325.field4116.method3694(0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Los;Z)V")
    public final void method3482(class374 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2129(-95);
            if (var3 == 0) {
                field8724++;
                if (arg1) {
                    this.method3478(-69, null, -115);
                    return;
                }
                return;
            }
            this.method3478(19977, arg0, var3);
        }
    }
}
