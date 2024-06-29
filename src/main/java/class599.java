import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class599 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field8510 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lnn;")
    public static class214 field8509 = new class214(4, 3);

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!em", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field8511++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 18)
    public static void method3408(int arg0) {
        if (arg0 <= 82) {
            method3408(-94);
        }
        field8509 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method3409(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class168.field2451; var3++) {
            class314 var4 = class54.field781[var3];
            if (var4.field4584 == 1) {
                int var5 = var4.field4574 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4590 * var5 >> 8) + var4.field4578;
                    int var7 = (var4.field4573 * var5 >> 8) + var4.field4575;
                    int var8 = (var4.field4593 * var5 >> 8) + var4.field4582;
                    int var9 = (var4.field4594 * var5 >> 8) + var4.field4583;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4584 == 2) {
                int var10 = arg0 - var4.field4574;
                if (var10 > 0) {
                    int var11 = (var4.field4590 * var10 >> 8) + var4.field4578;
                    int var12 = (var4.field4573 * var10 >> 8) + var4.field4575;
                    int var13 = (var4.field4593 * var10 >> 8) + var4.field4582;
                    int var14 = (var4.field4594 * var10 >> 8) + var4.field4583;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4584 == 3) {
                int var15 = var4.field4578 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4589 * var15 >> 8) + var4.field4574;
                    int var17 = (var4.field4586 * var15 >> 8) + var4.field4580;
                    int var18 = (var4.field4593 * var15 >> 8) + var4.field4582;
                    int var19 = (var4.field4594 * var15 >> 8) + var4.field4583;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4584 == 4) {
                int var20 = arg2 - var4.field4578;
                if (var20 > 0) {
                    int var21 = (var4.field4589 * var20 >> 8) + var4.field4574;
                    int var22 = (var4.field4586 * var20 >> 8) + var4.field4580;
                    int var23 = (var4.field4593 * var20 >> 8) + var4.field4582;
                    int var24 = (var4.field4594 * var20 >> 8) + var4.field4583;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4584 == 5) {
                int var25 = arg1 - var4.field4582;
                if (var25 > 0) {
                    int var26 = (var4.field4589 * var25 >> 8) + var4.field4574;
                    int var27 = (var4.field4586 * var25 >> 8) + var4.field4580;
                    int var28 = (var4.field4590 * var25 >> 8) + var4.field4578;
                    int var29 = (var4.field4573 * var25 >> 8) + var4.field4575;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
