import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class662 {

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "Z")
    public static boolean field8730 = false;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "[F")
    public static float[] field8733 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field8734 = 0;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    public static void method3586(int arg0) {
        field8733 = null;
        if (arg0 != -33) {
            method3587(58, -72);
        }
    }

    @OriginalMember(owner = "client!bca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8735++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V")
    public static final void method3587(int arg0, int arg1) {
        field8732++;
        class677.field9400 = 1000000000L / (long) arg0;
        if (arg1 != -1) {
            field8734 = -76;
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)I")
    public static final int method3588(int arg0) {
        field8731++;
        int var1 = -99 / ((arg0 + 3) / 36);
        if (class137.field2182 == null) {
            if (!class403.field5625 && class218.field3147 != null) {
                return class218.field3147.field5968;
            }
            int var2 = class569.field7492.method780((byte) -109);
            int var3 = class569.field7492.method772(61);
            if (class163.field2471) {
                if (var2 > class477.field6534 && (class477.field6534 + class575.field7554) > var2) {
                    int var4 = -1;
                    for (int var5 = 0; var5 < class172.field2634; var5++) {
                        if (class743.field10329) {
                            int var9 = var5 * 16 + (class733.field10151 + 33);
                            if ((var9 - 13) < var3 && var3 <= var9 + 3) {
                                var4 = var5;
                            }
                        } else {
                            int var10 = var5 * 16 + (class733.field10151 + 31);
                            if (var10 - 13 < var3 && var10 + 3 >= var3) {
                                var4 = var5;
                            }
                        }
                    }
                    if (var4 != -1) {
                        int var6 = 0;
                        class327 var7 = new class327(class592.field7703);
                        for (class236 var8 = (class236) var7.method1981((byte) 47); var8 != null; var8 = (class236) var7.method1979(false)) {
                            if (var4 == (var6++)) {
                                return ((class433) var8.field3322.field10032.field5748).field5968;
                            }
                        }
                    }
                } else if (class21.field392 != null && class267.field3716 < var2 && (class267.field3716 + class366.field5133) > var2) {
                    int var11 = -1;
                    for (int var12 = 0; var12 < class21.field392.field3323; var12++) {
                        if (class743.field10329) {
                            int var17 = var12 * 16 + class214.field3121 + 33;
                            if (var3 > (var17 - 13) && var3 <= (var17 + 3)) {
                                var11 = var12;
                            }
                        } else {
                            int var16 = var12 * 16 + (class214.field3121 + 31);
                            if (var16 - 13 < var3 && var3 <= var16 + 3) {
                                var11 = var12;
                            }
                        }
                    }
                    if (var11 != -1) {
                        int var13 = 0;
                        class327 var14 = new class327(class21.field392.field3322);
                        for (class433 var15 = (class433) var14.method1981((byte) 47); var15 != null; var15 = (class433) var14.method1979(false)) {
                            if (var11 == var13++) {
                                return var15.field5968;
                            }
                        }
                    }
                }
            } else if (class477.field6534 < var2 && var2 < class477.field6534 + class575.field7554) {
                int var18 = -1;
                for (int var19 = 0; var19 < class181.field2730; var19++) {
                    if (class743.field10329) {
                        int var24 = (class181.field2730 - var19 - 1) * 16 + class733.field10151 + 33;
                        if (var24 - 13 < var3 && var3 <= var24 + 3) {
                            var18 = var19;
                        }
                    } else {
                        int var23 = (class181.field2730 - var19 - 1) * 16 + class733.field10151 + 31;
                        if (var23 - 13 < var3 && var3 <= (var23 + 3)) {
                            var18 = var19;
                        }
                    }
                }
                if (var18 != -1) {
                    int var20 = 0;
                    class716 var21 = new class716(class446.field6126);
                    for (class433 var22 = (class433) var21.method4010(true); var22 != null; var22 = (class433) var21.method4011((byte) -120)) {
                        if ((var20++) == var18) {
                            return var22.field5968;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
