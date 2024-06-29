import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 extends class141 {

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "[I")
    public static int[] field2484 = new int[256];

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Lkd;")
    public static class73 field2466 = class126.method1070((byte) -66, "b12_full");

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "Lkd;")
    public static class73 field2488;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lkd;")
    public static class73 field2489;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lkd;")
    public static class73 field2496;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "[I")
    public static int[] field2498;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "Lkd;")
    private static class73 field2497;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "Z")
    public static boolean field2495;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "Lkd;")
    public static class73 field2499;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "[I")
    public static int[] field2493;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public int field2470;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "Lpd;")
    public class108 field2468;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "Lpf;")
    public class110 field2485;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "Luc;")
    public class139 field2474;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "Lde;")
    public static class27 field2491;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Li;")
    public class56 field2464;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "[I")
    public static int[] field2490;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "[Lwc;")
    public static class151[] field2500;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
    public static final void method807(boolean arg0) {
        if (!arg0) {
            return;
        }
        try {
            if (class41.field1102 == null) {
                class41.field1102 = new class72(class107.field2637, class32.method258(-69, new class73[] { class153.field3753, class9.field290, class41.field1099 }).method614(121));
            } else {
                byte[] var1 = class41.field1102.method602((byte) -36);
                if (var1 != null) {
                    class114 var2 = new class114(var1);
                    class13.field422 = var2.method944((byte) 122);
                    field2500 = new class151[class13.field422];
                    for (int var3 = 0; var3 < class13.field422; var3++) {
                        class151 var4 = field2500[var3] = new class151();
                        int var5 = var2.method944((byte) 113);
                        var4.field3738 = var5 & 0x7FFF;
                        var4.field3734 = (var5 & 0x8000) != 0;
                        var4.field3731 = var2.method927((byte) 122);
                        var4.field3732 = var2.method945(true);
                        var4.field3739 = var3;
                        var4.field3744 = class105.method838(var4.field3731, 16711935);
                    }
                    class24.method196(class119.field3053, class143.field3554, field2500.length - 1, 0, 65, field2500);
                    class34.field945 = true;
                    class41.field1102 = null;
                }
            }
        } catch (Exception var6) {
            class41.field1102 = null;
        }
        field2475++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method808(int arg0) {
        field2500 = null;
        field2493 = null;
        field2499 = null;
        field2466 = null;
        field2488 = null;
        field2491 = null;
        field2489 = null;
        if (arg0 != -1) {
            method807(true);
        }
        field2498 = null;
        field2497 = null;
        field2490 = null;
        field2496 = null;
        field2484 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public final void method809(int arg0) {
        int var2 = 21 / ((-arg0 - 38) / 52);
        field2479++;
        this.field2468 = null;
        this.field2464 = null;
        this.field2485 = null;
        this.field2474 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2484[var0] = var1;
        }
        field2488 = class126.method1070((byte) -66, "Angreifen");
        field2489 = class126.method1070((byte) -66, "Fallen lassen");
        field2496 = class126.method1070((byte) -66, "null");
        field2494 = 0;
        field2498 = new int[1000];
        field2497 = class126.method1070((byte) -66, "Location");
        field2495 = false;
        field2499 = field2497;
        field2493 = new int[] { 16, 32, 64, 128 };
        field2492 = 127;
    }
}
