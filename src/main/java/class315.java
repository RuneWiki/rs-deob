import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class315 {

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4590 = "cyan:";

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
    public static int[] field4589 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Z")
    public static boolean field4587 = false;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field4585;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[[[I")
    public static int[][][] field4586;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static final void method2126(int arg0) {
        field4588++;
        int var1 = class347.field4911 * 128 + 64;
        int var2 = class423.field6165 * 128 + 64;
        int var3 = class109.method957(var2, var1, class367.field5213, arg0 ^ 0x50B7) - class336.field4815;
        if (class372.field5277 >= 100) {
            class286.field4288 = class423.field6165 * 128 + 64;
            class265.field3985 = class347.field4911 * 128 + 64;
            class437.field6364 = class109.method957(class286.field4288, class265.field3985, class367.field5213, arg0 ^ 0x50B7) - class336.field4815;
        } else {
            if (class265.field3985 < var1) {
                class265.field3985 += (var1 - class265.field3985) * class372.field5277 / 1000 + class198.field2889;
                if (var1 < class265.field3985) {
                    class265.field3985 = var1;
                }
            }
            if (var3 > class437.field6364) {
                class437.field6364 += (var3 - class437.field6364) * class372.field5277 / 1000 + class198.field2889;
                if (var3 < class437.field6364) {
                    class437.field6364 = var3;
                }
            }
            if (var1 < class265.field3985) {
                class265.field3985 -= (class265.field3985 - var1) * class372.field5277 / 1000 + class198.field2889;
                if (var1 > class265.field3985) {
                    class265.field3985 = var1;
                }
            }
            if (var2 > class286.field4288) {
                class286.field4288 += (var2 - class286.field4288) * class372.field5277 / 1000 + class198.field2889;
                if (class286.field4288 > var2) {
                    class286.field4288 = var2;
                }
            }
            if (var3 < class437.field6364) {
                class437.field6364 -= class198.field2889 + ((class437.field6364 - var3) * class372.field5277 / 1000);
                if (class437.field6364 < var3) {
                    class437.field6364 = var3;
                }
            }
            if (class286.field4288 > var2) {
                class286.field4288 -= class198.field2889 + ((class286.field4288 - var2) * class372.field5277 / 1000);
                if (class286.field4288 < var2) {
                    class286.field4288 = var2;
                }
            }
        }
        int var4 = class288.field4300 * 128 + 64;
        int var5 = class64.field1040 * 128 + 64;
        int var6 = class109.method957(var4, var5, class367.field5213, 20663) - class364.field5183;
        int var7 = var5 - class265.field3985;
        int var8 = var6 - class437.field6364;
        int var9 = var4 - class286.field4288;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class40.field623) {
            class40.field623 += (var11 - class40.field623 >> 3) * class377.field5369 / 1000 + class273.field4106 << 3;
            if (class40.field623 > var11) {
                class40.field623 = var11;
            }
        }
        if (class40.field623 > var11) {
            class40.field623 -= (class40.field623 - var11 >> 3) * class377.field5369 / 1000 + class273.field4106 << 3;
            if (class40.field623 < var11) {
                class40.field623 = var11;
            }
        }
        int var13 = var12 - class291.field4330;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > arg0) {
            class291.field4330 += class377.field5369 * var14 / 1000 + class273.field4106 << 3;
            class291.field4330 &= 0x3FFF;
        }
        if (var14 < 0) {
            class291.field4330 -= -var14 * class377.field5369 / 1000 + class273.field4106 << 3;
            class291.field4330 &= 0x3FFF;
        }
        int var15 = var12 - class291.field4330;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class291.field4330 = var12;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2127(int arg0, byte[] arg1) {
        field4584++;
        class37 var2 = new class37(arg1);
        int var3 = var2.method271((byte) 121);
        if (arg0 != 25055) {
            method2127(-91, (byte[]) null);
        }
        int var4 = var2.method278(12);
        if (var4 < 0 || class107.field1773 != 0 && class107.field1773 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method285(0, (byte) 61, var4, var5);
            return var5;
        } else {
            int var6 = var2.method278(arg0 ^ 0x61BF);
            if (var6 < 0 || !(class107.field1773 == 0 || var6 <= class107.field1773)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class352.method2263(var7, var6, arg1, var4, 9);
            } else {
                class375.field5313.method2409(-5736, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
    public static void method2128(int arg0) {
        if (arg0 != 128) {
            field4589 = null;
        }
        field4585 = null;
        field4590 = null;
        field4586 = null;
        field4589 = null;
    }
}
