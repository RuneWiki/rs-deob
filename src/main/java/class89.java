import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public int field2201 = 0;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public int field2207 = 0;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lid;")
    private static class60 field2213 = class11.method72("Connection lost", (byte) -15);

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Lid;")
    public static class60 field2219 = class11.method72("mapmarker", (byte) 113);

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lid;")
    public static class60 field2211 = field2213;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field2204 = 0;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lid;")
    private static class60 field2203 = class11.method72("Your account has been disabled)3", (byte) 102);

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[I")
    public static int[] field2210 = new int[200];

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "Lid;")
    public static class60 field2220 = field2203;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lqd;")
    public static class115 field2209 = new class115(50);

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public int field2218;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lfd;")
    public static class40 field2206;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lha;")
    public class50 field2200;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lha;")
    public class50 field2216;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "[I")
    public static int[] field2222;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "[S")
    public static short[] field2208;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[[B")
    public static byte[][] field2205;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BJ)Lid;")
    public static final class60 method726(byte arg0, long arg1) {
        field2217++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg0 > -88) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class47.field1249[(int) (var8 - arg1 * 37L)];
            }
            class60 var7 = new class60();
            var7.field1453 = var6;
            var7.field1474 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method727(boolean arg0) {
        field2222 = null;
        field2210 = null;
        field2213 = null;
        field2219 = null;
        field2220 = null;
        field2203 = null;
        field2209 = null;
        field2205 = null;
        field2206 = null;
        field2208 = null;
        field2211 = null;
        if (arg0) {
            field2211 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lae;")
    public static final class6 method728(byte arg0) {
        field2215++;
        class6 var1 = new class6();
        var1.field87 = class100.field2442[0];
        var1.field91 = class90.field2236[0];
        var1.field88 = class146.field3281;
        var1.field90 = class136.field3098[0];
        if (arg0 != 120) {
            field2213 = null;
        }
        var1.field92 = class104.field2551[0];
        var1.field93 = class90.field2237;
        int var2 = var1.field92 * var1.field90;
        var1.field89 = new int[var2];
        byte[] var3 = field2205[0];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field89[var4] = class35.field879[class80.method680(var3[var4], 255)];
        }
        class7.method47(12711);
        return var1;
    }
}
