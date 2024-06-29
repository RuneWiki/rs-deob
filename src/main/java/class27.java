import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 implements Runnable {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[Lqc;")
    public volatile class114[] field487 = new class114[2];

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Z")
    public volatile boolean field501 = false;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Z")
    public volatile boolean field497 = false;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
    public static volatile boolean field484 = true;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "[I")
    public static int[] field495 = new int[1000];

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lec;")
    public static class32 field490 = class73.method594(")4lang)4de", true);

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lec;")
    private static class32 field496 = class73.method594("flash1:", true);

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field499 = 0;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Z")
    public static boolean field500 = false;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field493 = 0;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lec;")
    public static class32 field488 = field496;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lec;")
    private static class32 field491 = class73.method594(" seconds)3", true);

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lec;")
    public static class32 field489 = field496;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lec;")
    public static class32 field481 = field491;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lec;")
    public static class32 field502 = class73.method594(":clan:", true);

    @OriginalMember(owner = "client!de", name = "x", descriptor = "[I")
    public static int[] field504 = new int[2000];

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ldc;")
    public class25 field485;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[[B")
    public static byte[][] field483;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Lec;")
    public static final class32 method187(int arg0, int arg1, int arg2) {
        int var3 = arg2 - arg0;
        if (arg1 != -3156) {
            return null;
        }
        field503++;
        if (var3 < -9) {
            return class103.field2420;
        } else if (var3 < -6) {
            return class135.field3146;
        } else if (var3 < -3) {
            return class45.field1071;
        } else if (var3 < 0) {
            return class23.field402;
        } else if (var3 > 9) {
            return class134.field3130;
        } else if (var3 > 6) {
            return class56.field1307;
        } else if (var3 > 3) {
            return class5.field87;
        } else if (var3 > 0) {
            return class64.field1494;
        } else {
            return class137.field3184;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method188(byte arg0) {
        field489 = null;
        field496 = null;
        field490 = null;
        field495 = null;
        field483 = null;
        field481 = null;
        field502 = null;
        field491 = null;
        field504 = null;
        field488 = null;
        if (arg0 != -33) {
            method189(-93, -51L);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
    public static final void method189(int arg0, long arg1) {
        field494++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class106.field2506; var3++) {
            if (class103.field2409[var3] == arg1) {
                class115.field2688++;
                class106.field2506--;
                for (int var4 = var3; var4 < class106.field2506; var4++) {
                    class103.field2409[var4] = class103.field2409[var4 + 1];
                    class71.field1686[var4] = class71.field1686[var4 + 1];
                }
                class2.field26 = class115.field2769;
                class44.field1027.method357(239, -79);
                class44.field1027.method542(arg1, (byte) 56);
                break;
            }
        }
        int var5 = -88 % ((64 - arg0) / 52);
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
    public final void run() {
        this.field497 = true;
        field482++;
        try {
            while (!this.field501) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class114 var2 = this.field487[var1];
                    if (var2 != null) {
                        var2.method895(0);
                    }
                }
                class54.method427(10L, -27166);
                class56.method442(null, this.field485, 1);
            }
        } catch (Exception var9) {
            class110.method872(var9, null, 95);
        } finally {
            Object var6 = null;
            this.field497 = false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ltb;I[BI)V")
    public static final void method190(class134 arg0, int arg1, byte[] arg2, int arg3) {
        field486++;
        if (arg3 != -31194) {
            field483 = null;
        }
        class142 var4 = new class142();
        var4.field3251 = arg2;
        var4.field3326 = arg1;
        var4.field3247 = arg0;
        var4.field3245 = 0;
        class157 var5 = class2.field18;
        synchronized (class2.field18) {
            class2.field18.method1216(var4, (byte) 120);
        }
        class111.method877((byte) -53);
    }
}
