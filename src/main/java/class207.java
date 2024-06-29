import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class207 extends class287 {

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Luj;")
    public static class169 field3284;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "[[B")
    public static byte[][] field3298;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjava/util/Random;)I", line = 7)
    public static final int method1523(int arg0, int arg1, Random arg2) {
        field3285++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class251.method1802(arg0, (byte) -108)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg1 > -99) {
                method1523(-54, -112, (Random) null);
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class150.method1096((byte) -18, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 50)
    public static void method1524(int arg0) {
        if (arg0 != 8887) {
            method1525(69, 110);
        }
        field3284 = null;
        field3298 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Ljava/lang/String;", line = 70)
    public static final String method1525(int arg0, int arg1) {
        field3287++;
        if (arg0 != 8) {
            method1525(72, -93);
        }
        return class342.field5324[arg1].length() > 0 ? class32.field472[arg1] + class113.field1569 + class342.field5324[arg1] : class32.field472[arg1];
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V", line = 85)
    public static final void method1526(int arg0) {
        field3290++;
        class119.field1659 = null;
        class213.field3355 = null;
        class81.field1103 = null;
        if (arg0 == 0) {
            class81.field1101 = null;
            class206.field3261 = null;
            field3298 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)V", line = 105)
    public static final void method1527(boolean arg0, int arg1) {
        field3283++;
        byte[][] var2;
        byte var3;
        if (class109.field1458 && arg0) {
            var2 = class174.field2857;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class293.field4540;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            int var7 = class232.field3616[var5] >> 8;
            int var8 = class232.field3616[var5] & 0xFF;
            int[] var9 = null;
            int var10 = var7 * 64 - class326.field5108;
            int var11 = var8 * 64 - class198.field3168;
            if (var6 != null) {
                class50.method373((byte) 94);
                var9 = class305.method2115(class134.field1970, true, var11, var6, class198.field3168, arg0, var10, class326.field5108);
            }
            if (!arg0 && (class78.field1052 / 8) == var7 && class257.field4057 / 8 == var8) {
                if (var9 == null) {
                    class34.field507 = -1;
                } else {
                    class318.field5037 = var9[4];
                    class84.field1150 = var9[2];
                    class184.field2981 = var9[1];
                    class34.field507 = var9[0];
                    class216.field3404 = var9[3];
                }
            }
        }
        if (arg1 <= 42) {
            field3284 = (class169) null;
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class232.field3616[var12] >> 8) * 64 - class326.field5108;
            int var14 = (class232.field3616[var12] & 0xFF) * 64 - class198.field3168;
            byte[] var15 = var2[var12];
            if (var15 == null && class257.field4057 < 800) {
                class50.method373((byte) 107);
                for (int var16 = 0; var16 < var3; var16++) {
                    class126.method916(13513, var14, var13, 64, var16, 64);
                }
            }
        }
    }
}
