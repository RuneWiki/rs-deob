import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class98 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lgd;")
    public static class40 field2317 = class14.method90(false, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Lgd;")
    public static class40 field2330 = class14.method90(false, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2318 = 0;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2322 = 0;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lgd;")
    private static class40 field2333 = class14.method90(false, "cyan:");

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lgd;")
    public static class40 field2320 = field2333;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lgd;")
    private static class40 field2319 = class14.method90(false, "Private chat");

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2327 = 0;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lgd;")
    public static class40 field2326 = field2319;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lgd;")
    public static class40 field2325 = class14.method90(false, "b12_full");

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Loe;")
    public static class89 field2323 = new class89();

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Z")
    public static boolean field2334 = false;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lgd;")
    private static class40 field2335 = class14.method90(false, "Please try again)3");

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lgd;")
    public static class40 field2336 = field2335;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lra;")
    public static class102 field2315;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lw;")
    public static class135 field2324;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J", line = 5)
    public static final synchronized long method683(int arg0) {
        if (arg0 != 0) {
            return 103L;
        }
        long var1 = System.currentTimeMillis();
        field2331++;
        if (var1 < class91.field2080) {
            class110.field2683 += class91.field2080 - var1;
        }
        class91.field2080 = var1;
        return class110.field2683 + var1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BILnd;)V", line = 27)
    public static final void method684(int arg0, byte[] arg1, int arg2, class82 arg3) {
        field2316++;
        class53 var4 = new class53();
        var4.field1341 = arg1;
        var4.field1340 = arg2;
        var4.field1339 = arg3;
        var4.field2647 = arg0;
        class89 var5 = class58.field1475;
        synchronized (class58.field1475) {
            class58.field1475.method589(var4, arg2 - 115);
        }
        class74.method502(90);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 94)
    public static void method685(int arg0) {
        field2320 = null;
        field2333 = null;
        if (arg0 != 0) {
            field2320 = null;
        }
        field2325 = null;
        field2315 = null;
        field2323 = null;
        field2324 = null;
        field2330 = null;
        field2336 = null;
        field2317 = null;
        field2326 = null;
        field2335 = null;
        field2319 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILgd;Lgd;III)V", line = 136)
    public static final void method686(int arg0, int arg1, class40 arg2, class40 arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            method686(110, 44, null, null, -72, -47, -32);
        }
        field2328++;
        if (class48.field1231 >= 500) {
            return;
        }
        if (arg2.method255(-10) > 0) {
            class131.field3178[class48.field1231] = client.method114(true, new class40[] { arg3, class34.field867, arg2 });
        } else {
            class131.field3178[class48.field1231] = arg3;
        }
        class45.field1122[class48.field1231] = arg4;
        class13.field338[class48.field1231] = arg5;
        class107.field2612[class48.field1231] = arg0;
        class22.field503[class48.field1231] = arg1;
        class48.field1231++;
    }
}
