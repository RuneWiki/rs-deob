import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class94 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2352 = -1;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lrd;")
    private static class117 field2353 = class95.method812("Login", (byte) 8);

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2357 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
    public static int[] field2360 = new int[500];

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field2364 = 0;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lrd;")
    private static class117 field2355 = class95.method812("Your account is already logged in)3", (byte) 8);

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[[I")
    public static int[][] field2359 = new int[104][104];

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lrd;")
    private static class117 field2366 = class95.method812("flash1:", (byte) 8);

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lrd;")
    public static class117 field2361 = field2355;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lrd;")
    public static class117 field2356 = field2366;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lrd;")
    public static class117 field2358 = field2366;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    public static int[] field2367 = new int[100];

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Lrd;")
    public static class117 field2369 = class95.method812("Benutzen Sie die (WPasswort -=ndern(W Option", (byte) 8);

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lrd;")
    public static class117 field2368 = field2353;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "[I")
    public static int[] field2354;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[[[B")
    public static byte[][][] field2350;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method808(byte arg0) {
        field2359 = null;
        field2353 = null;
        field2367 = null;
        field2350 = null;
        field2358 = null;
        field2366 = null;
        field2369 = null;
        field2355 = null;
        field2361 = null;
        if (arg0 < 73) {
            method809(1);
        }
        field2356 = null;
        field2368 = null;
        field2360 = null;
        field2354 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static final void method809(int arg0) {
        class101.field2501.method815(-126);
        for (int var1 = 0; var1 < 32; var1++) {
            class35.field1049[var1] = 0L;
        }
        field2363++;
        for (int var2 = 0; var2 < 32; var2++) {
            class132.field3171[var2] = 0L;
        }
        class80.field2131 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([Lrd;B)[Lrd;")
    public static final class117[] method810(class117[] arg0, byte arg1) {
        field2362++;
        class117[] var2 = new class117[5];
        if (arg1 != -87) {
            field2358 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class18.method193(new class117[] { class142.method1131(var3, true), class120.field2937 }, 90);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class18.method193(new class117[] { var2[var3], arg0[var3] }, 82);
            }
        }
        return var2;
    }
}
