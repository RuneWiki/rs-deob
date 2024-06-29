import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class314 extends class456 {

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "Z")
    private boolean field4725 = true;

    @OriginalMember(owner = "client!bq", name = "S", descriptor = "Z")
    private boolean field4731 = true;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
    public static int field4722 = 0;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!bq", name = "R", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "Lat;")
    public static class412 field4720;

    @OriginalMember(owner = "client!bq", name = "T", descriptor = "Z")
    public static boolean field4732;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "[[B")
    public static byte[][] field4724;

    @OriginalMember(owner = "client!bq", name = "U", descriptor = "[[S")
    public static short[][] field4733;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBLre;)V", line = 4)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        ++field4721;
        if (arg1 != 55) {
            field4724 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field6486 = arg2.method2628(49152) == 1;
                }
            } else {
                this.field4725 = ~arg2.method2628(49152) == -2;
            }
        } else {
            this.field4731 = arg2.method2628(49152) == 1;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)[[I", line = 50)
    public final int[][] method212(int arg0, int arg1) {
        ++field4729;
        int[][] var3 = super.field6468.method1090(arg0 + -2, arg1);
        if (super.field6468.field2227) {
            int[][] var4 = this.method2709(false, !this.field4725 ? arg1 : -arg1 + class493.field6947, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4731) {
                for (int var11 = 0; ~class156.field2169 < ~var11; ++var11) {
                    var8[var11] = var5[-var11 + class428.field6112];
                    var9[var11] = var6[-var11 + class428.field6112];
                    var10[var11] = var7[class428.field6112 - var11];
                }
            } else {
                for (int var12 = 0; ~class156.field2169 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        if (arg0 != 0) {
            this.method210(-78, (byte) -107, (class446) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)[I", line = 124)
    public final int[] method33(int arg0, int arg1) {
        ++field4726;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int[] var4 = this.method2707(!this.field4725 ? arg1 : -arg1 + class493.field6947, -31797, 0);
            if (this.field4731) {
                for (int var5 = 0; var5 < class156.field2169; ++var5) {
                    var3[var5] = var4[-var5 + class428.field6112];
                }
            } else {
                class149.method1009(var4, 0, var3, 0, class156.field2169);
            }
        }
        if (arg0 != -1) {
            method1941(9);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V", line = 168)
    public class314() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "(I)V", line = 172)
    public static void method1941(int arg0) {
        field4733 = null;
        if (arg0 > 43) {
            field4724 = null;
            field4720 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLjava/lang/String;)J", line = 184)
    public static final long method1942(byte arg0, String arg1) {
        ++field4730;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            var3 = (var3 << 5) - var3 + (long) arg1.charAt(var5);
        }
        int var6 = -30 % ((arg0 - 23) / 41);
        return var3;
    }
}
