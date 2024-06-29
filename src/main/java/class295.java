import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class295 extends class273 {

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4678 = "Loading sprites - ";

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field4680 = -1;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "Lkj;")
    public static class114 field4677 = null;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field4681 = 0;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "Lsb;")
    public static class124 field4674;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)Lhe;")
    public static final class97 method1979(int arg0, int arg1) {
        ++field4679;
        class97 var2 = (class97) class224.field3574.method1518((long) arg0, 116);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class28.field487.method900(arg1, arg0, false);
            class97 var4 = new class97();
            if (var3 != null) {
                var4.method737((byte) 122, new class136(var3));
            }
            class224.field3574.method1514(false, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
    public static void method1980(int arg0) {
        if (arg0 > -42) {
            method1980(-12);
        }
        field4677 = null;
        field4674 = null;
        field4678 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field4676;
        int[] var3 = super.field4359.method387((byte) 120, arg1);
        if (super.field4359.field833) {
            int[][] var4 = this.method1853(0, arg1, (byte) 8);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; class26.field458 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg0) {
            field4678 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class295() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IJ)V")
    public static final void method1981(int arg0, long arg1) {
        if (arg0 != 499) {
            field4677 = null;
        }
        if (!class256.field4075) {
            class161.field2619 += (float) arg1 * class296.field4687 / 40.0F;
            class1.field1 += (float) arg1 * class290.field4630 / 40.0F;
        }
        ++field4675;
        int var3 = class288.field4606 + class48.field878.field2849;
        int var4 = class27.field465 + class48.field878.field2887;
        if (-var3 + class260.field4134 < -500 || -var3 + class260.field4134 > 500 || ~(-var4 + class29.field507) > 499 || -var4 + class29.field507 > 500) {
            class260.field4134 = var3;
            class29.field507 = var4;
        }
        if (class260.field4134 != var3) {
            int var5 = -class260.field4134 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 < -1) {
                if (var6 != 0) {
                    if (var6 > var5) {
                        var6 = var5;
                    }
                } else {
                    var6 = 1;
                }
            } else if (var6 != 0) {
                if (var5 > var6) {
                    var6 = var5;
                }
            } else {
                var6 = -1;
            }
            class260.field4134 += var6;
        }
        if (~class29.field507 != ~var4) {
            int var7 = -class29.field507 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 < -1) {
                if (~var8 != -1) {
                    if (var7 < var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (~var8 != -1) {
                if (var7 > var8) {
                    var8 = var7;
                }
            } else {
                var8 = -1;
            }
            class29.field507 += var8;
        }
        class238.method1573(1);
    }
}
