import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class230 {

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "B")
    private byte field3431;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public int field3436;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public int field3443;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "Llt;")
    public static class475 field3437 = new class475("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "[[I")
    public static int[][] field3438 = new int[128][128];

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "[I")
    public static int[] field3444 = new int[4];

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "Lst;")
    public static class296 field3442 = new class296();

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/String;IZI)Z")
    public static final boolean method1578(String arg0, int arg1, boolean arg2, int arg3) {
        field3432++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg3 != -44) {
            return true;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
    public final int method1579(int arg0) {
        field3439++;
        if (arg0 <= 121) {
            this.method1579(26);
        }
        return (this.field3431 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)Lnp;")
    public static final class338 method1580(int arg0, int arg1, int arg2) {
        if (arg1 != -1332166328) {
            return null;
        }
        field3433++;
        class338 var3 = (class338) class299.field4258.method2605(false, (long) arg0 << 32 | (long) arg2);
        if (var3 == null) {
            var3 = new class338(arg0, arg2);
            class299.field4258.method2606(var3, var3.field4736, 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)I")
    public final int method1581(int arg0) {
        if (arg0 == 7) {
            field3441++;
            return this.field3431 & 0x7;
        } else {
            return 85;
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
    public static void method1582(int arg0) {
        field3438 = null;
        int var1 = -72 % ((9 - arg0) / 62);
        field3437 = null;
        field3442 = null;
        field3444 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ltd;[[BB)V")
    public static final void method1583(class314 arg0, byte[][] arg1, byte arg2) {
        field3440++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        int var5 = 0;
        if (arg2 != 96) {
            return;
        }
        while (var5 < var4) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class209 var11 = new class209(var10);
                int var12 = class331.field4689[var5] >> 8;
                int var13 = class331.field4689[var5] & 0xFF;
                int var14 = var12 * 64 - class68.field1038;
                int var15 = var13 * 64 - class24.field259;
                class110.method675(19315);
                arg0.method1635(var15, class68.field1038, var11, (byte) -6, var14, class24.field259, class434.field6500);
                arg0.method1958(var15, class348.field5015, true, var11, var3, var14);
                if (!arg0.field3583 && (class116.field1744 / 8) == var12 && class210.field3062 / 8 == var13 && var3[0] != -1) {
                    class323.field4623 = class77.field1154.method2335(var3[3], class515.field7515, var3[2], var3[1], var3[0], arg2 ^ 0xFFFFFFEB);
                    class318.field4562 = var3[4];
                }
            }
            var5++;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class331.field4689[var6] >> 8) * 64 - class68.field1038;
            int var8 = (class331.field4689[var6] & 0xFF) * 64 - class24.field259;
            byte[] var9 = arg1[var6];
            if (var9 == null && class210.field3062 < 800) {
                class110.method675(19315);
                arg0.method1636(var8, var7, 64, false, 64);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
    public class230() {
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Ldh;)V")
    public class230(class209 arg0) {
        this.field3431 = arg0.method1417(false);
        this.field3434 = arg0.method1450((byte) 68);
        this.field3430 = arg0.method1452(65280);
        this.field3436 = arg0.method1452(65280);
        this.field3443 = arg0.method1452(65280);
        this.field3435 = arg0.method1452(65280);
    }
}
