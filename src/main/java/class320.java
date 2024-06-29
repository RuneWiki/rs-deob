import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class320 implements Runnable {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[Lea;")
    public volatile class395[] field4752 = new class395[2];

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Z")
    public volatile boolean field4758 = false;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "Z")
    public volatile boolean field4760 = false;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
    public static boolean field4757 = false;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4761 = "yellow:";

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[Z")
    public static boolean[] field4759 = new boolean[200];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lde;")
    public class364 field4756;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lua;", line = 5)
    public static final class400 method2106(int arg0, int arg1, int arg2) {
        class77 var3 = class106.field1405[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1087;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method2107(boolean arg0) {
        field4750++;
        class51 var1 = class239.field3357;
        synchronized (class239.field3357) {
            class239.field3357.method372(127);
        }
        class51 var2 = class390.field5701;
        synchronized (class390.field5701) {
            class390.field5701.method372(114);
        }
        class216 var3 = class444.field6413;
        synchronized (class444.field6413) {
            class444.field6413.method1420(-1);
            if (arg0) {
                method2111((byte) -41);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZC)Z", line = 45)
    public static final boolean method2108(boolean arg0, char arg1) {
        field4755++;
        if (!arg0) {
            field4761 = null;
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!dj", name = "run", descriptor = "()V", line = 57)
    public final void run() {
        this.field4760 = true;
        field4753++;
        try {
            while (!this.field4758) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class395 var2 = this.field4752[var1];
                    if (var2 != null) {
                        var2.method2545(500000);
                    }
                }
                class31.method245(10L, 94);
                class321.method2115(this.field4756, -45, (Object) null);
            }
        } catch (Exception var9) {
            class266.method1780(1, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field4760 = false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 93)
    public static final void method2109(byte arg0) {
        class421.field6124 = 0;
        class388.field5678 = 0;
        field4751++;
        int var1 = -100 % ((27 - arg0) / 60);
        class247.method1613((byte) -107);
        class431.method2697(3);
        class197.method1307(-92);
        class264.method1771(0);
        for (int var2 = 0; var2 < class388.field5678; var2++) {
            int var4 = class3.field41[var2];
            if (class231.field3179 != class176.field2382[var4].field2154) {
                if (class176.field2382[var4].field4660 > 0) {
                    class356.method2336((byte) -52, class176.field2382[var4]);
                }
                class176.field2382[var4] = null;
            }
        }
        if (class20.field342 != class27.field471.field5049) {
            throw new RuntimeException("gpp1 pos:" + class27.field471.field5049 + " psize:" + class20.field342);
        }
        for (int var3 = 0; var3 < class402.field5869; var3++) {
            if (class176.field2382[class117.field1528[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class402.field5869);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)Z", line = 143)
    public static final boolean method2110(byte arg0) {
        field4754++;
        if (class191.field2655) {
            try {
                if ((Boolean) class177.method1170(74, "showingVideoAd", class63.field948.field5381)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == -108 ? true : true;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V", line = 173)
    public static void method2111(byte arg0) {
        int var1 = 32 / ((-arg0 - 42) / 50);
        field4761 = null;
        field4759 = null;
    }
}
