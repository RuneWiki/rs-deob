import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class36 extends class87 {

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "Z")
    private boolean field456 = true;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    private int field461 = 4096;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "[J")
    public static long[] field458 = new long[256];

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "Lpi;")
    public static class201 field463;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "[I")
    public static int[] field464;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "[I")
    public static int[] field465;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Lpg;")
    public static class305 field467;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "F")
    public static float field466;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "[I")
    public static int[] field459;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IZ)V")
    public static final void method228(int arg0, boolean arg1) {
        class279 var2 = class111.method844(arg0, 10, -1780180960);
        ++field457;
        if (arg1) {
            var2.method1934((byte) -114);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        ++field460;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field456 = arg0.method366(-16505) == 1;
            }
        } else {
            this.field461 = arg0.method331(-30);
        }
        if (arg2 != 25645) {
            this.field461 = 27;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        if (arg1 != 6) {
            return null;
        } else {
            int[][] var3 = super.field1390.method1902(-106, arg0);
            if (super.field1390.field4428) {
                int[] var4 = this.method642(0, class32.field406 & arg0 + -1, true);
                int[] var5 = this.method642(0, arg0, true);
                int[] var6 = this.method642(0, arg0 + 1 & class32.field406, true);
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var3[0];
                for (int var10 = 0; ~class206.field3032 < ~var10; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field461;
                    int var12 = var11 >> 12;
                    int var13 = (var5[class181.field2722 & var10 + 1] + -var5[var10 + -1 & class181.field2722]) * this.field461;
                    int var14 = var13 >> 12;
                    int var15 = var14 * var14 >> 12;
                    int var16 = var12 * var12 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (~var17 != -1) {
                        var18 = var13 / var17;
                        var19 = var11 / var17;
                        var20 = 16777216 / var17;
                    } else {
                        var20 = 0;
                        var18 = 0;
                        var19 = 0;
                    }
                    if (this.field456) {
                        var18 = (var18 >> 1) + 2048;
                        var20 = (var20 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                    }
                    var9[var10] = var18;
                    var7[var10] = var19;
                    var8[var10] = var20;
                }
            }
            ++field454;
            return var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
    public static void method229(byte arg0) {
        field464 = null;
        field458 = null;
        if (arg0 <= -112) {
            field463 = null;
            field465 = null;
            field467 = null;
            field459 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class36() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(IZ)Lqg;")
    public static final class187 method230(int arg0, boolean arg1) {
        ++field462;
        class187 var2 = (class187) class136.field2219.method1418((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class292.field4646.method1868(arg0, 33, 1);
            class187 var4 = new class187();
            if (var3 != null) {
                var4.method1334(new class53(var3), arg0, (byte) 92);
            }
            if (arg1) {
                return null;
            } else {
                class136.field2219.method1421((long) arg0, var4, (byte) -90);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method231(boolean arg0, String arg1, int arg2) {
        ++field455;
        class279 var3 = class111.method844(arg2, 2, -1780180960);
        var3.method1928(arg0);
        var3.field4491 = arg1;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(var1 & 1L) == -2L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field458[var0] = var1;
        }
        field463 = new class201(64);
        field464 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
        field465 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
        field467 = class255.method1750(false);
    }
}
