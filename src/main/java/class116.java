import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class116 extends class90 {

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2450 = 0;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Lrf;")
    private static class163 field2457 = class53.method392(70, "Malformed login packet)3");

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lrf;")
    public static class163 field2451 = field2457;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "Lrf;")
    private static class163 field2467 = class53.method392(46, "You have only just left another world)3");

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field2468 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Lrf;")
    public static class163 field2465 = class53.method392(124, "Lade)3)3)3");

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Lrf;")
    public static class163 field2463 = field2467;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "[I")
    public int[] field2453;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "[I")
    public int[] field2469;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "[I")
    public int[] field2470;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "[Lea;")
    public class42[] field2459;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "[Lea;")
    public class42[] field2462;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "[[[B")
    public byte[][][] field2461;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)Z")
    public static final boolean method800(int arg0, byte arg1) {
        field2464++;
        if (arg0 < 0) {
            return false;
        } else if (arg1 > -34) {
            return false;
        } else {
            int var2 = class21.field373[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1003;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static void method801(boolean arg0) {
        field2451 = null;
        field2465 = null;
        if (!arg0) {
            method803(91, 86, -6);
        }
        field2457 = null;
        field2463 = null;
        field2467 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JZ)Lrf;")
    public static final class163 method802(long arg0, boolean arg1) {
        field2452++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class17.field288[(int) (var8 - arg0 * 37L)];
            }
            if (!arg1) {
                method800(-33, (byte) 90);
            }
            class163 var7 = new class163();
            var7.field3320 = var6;
            var7.field3341 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V")
    public static final void method803(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field2359; var4++) {
            class121 var5 = var3.field2344[var4];
            if ((var5.field2536 >> 29 & 0x3L) == 2L && var5.field2544 == arg1 && var5.field2542 == arg2) {
                class167.method1135(var5);
                return;
            }
        }
    }
}
