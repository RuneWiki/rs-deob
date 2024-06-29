import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class178 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Lla;")
    public static class319 field2377 = new class319(18, -1);

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "[I")
    public static int[] field2379 = new int[13];

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Z")
    public static boolean field2378 = false;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field2381 = 0;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "[[[B")
    public static byte[][][] field2382;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z[B)Lew;", line = 3)
    public static final class346 method1195(boolean arg0, byte[] arg1) {
        field2375++;
        class346 var2 = new class346();
        class164 var3 = new class164(arg1);
        var3.field2185 = var3.field2219.length - 2;
        int var4 = var3.method1074(-635989152);
        int var5 = var3.field2219.length - var4 - 2 - 12;
        var3.field2185 = var5;
        int var6 = var3.method1099(-125);
        var2.field5331 = var3.method1074(-635989152);
        var2.field5332 = var3.method1074(-635989152);
        var2.field5338 = var3.method1074(-635989152);
        var2.field5333 = var3.method1074(-635989152);
        int var7 = var3.method1087(!arg0);
        if (var7 > 0) {
            var2.field5335 = new class272[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1074(-635989152);
                class272 var10 = new class272(class475.method2835(var9, -1));
                var2.field5335[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1099(-125);
                    int var12 = var3.method1099(108);
                    var10.method1751((long) var11, -120, new class160(var12));
                }
            }
        }
        var3.field2185 = 0;
        var2.field5334 = var3.method1080((byte) -123);
        var2.field5341 = new int[var6];
        var2.field5344 = new String[var6];
        var2.field5343 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field2185) {
            int var14 = var3.method1074(-635989152);
            if (var14 == 3) {
                var2.field5344[var13] = var3.method1064(false).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field5341[var13] = var3.method1087(false);
            } else {
                var2.field5341[var13] = var3.method1099(-123);
            }
            var2.field5343[var13++] = var14;
        }
        if (!arg0) {
            field2378 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 103)
    public static final void method1196(int arg0) {
        class507[] var1 = class176.field2356;
        synchronized (class176.field2356) {
            if (arg0 != -19942) {
                field2378 = false;
            }
            int var2 = 0;
            while (true) {
                if (class176.field2356.length <= var2) {
                    break;
                }
                class176.field2356[var2] = new class507();
                class471.field7020[var2] = 0;
                var2++;
            }
        }
        field2383++;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Lga;", line = 181)
    public static final class282 method1197(int arg0, int arg1, int arg2) {
        field2380++;
        class282 var3 = class21.method194(-119, arg1);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field4108 == null || arg0 >= var3.field4108.length) {
            return null;
        } else {
            if (arg2 <= 3) {
                method1195(false, null);
            }
            return var3.field4108[arg0];
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V", line = 207)
    public static void method1198(int arg0) {
        field2377 = null;
        field2379 = null;
        if (arg0 != -1) {
            field2377 = null;
        }
        field2382 = null;
    }
}
