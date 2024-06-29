import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class97 implements Runnable {

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
    public boolean field2242 = true;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field2234 = new Object();

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "[I")
    public int[] field2247 = new int[500];

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "[I")
    public int[] field2248 = new int[500];

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public int field2249 = 0;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
    public static int[] field2230 = new int[256];

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lrc;")
    private static class105 field2228 = class43.method374("Connecting to update server", 0);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lrc;")
    public static class105 field2235 = class43.method374("Verbindung mit Freunde)2Server)3)3)3", 0);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2237 = 0;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lrc;")
    private static class105 field2239 = class43.method374("Close", 0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lrc;")
    private static class105 field2229 = class43.method374("M", 0);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lrc;")
    private static class105 field2238 = class43.method374("RuneScape is loading )2 please wait)3)3)3", 0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lrc;")
    public static class105 field2227 = field2229;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Lrc;")
    public static class105 field2240 = class43.method374("oder ung-Ultiges Passwort)3", 0);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Lrc;")
    public static class105 field2245 = field2228;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2244 = 1;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lrc;")
    public static class105 field2231 = field2238;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lrc;")
    public static class105 field2233 = field2239;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lmb;")
    public static class74 field2232 = new class74(4096);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field2250 = 0;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Lrc;")
    public static class105 field2251 = class43.method374("Okay", 0);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[I")
    public static int[] field2241;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 27)
    public static void method803(int arg0) {
        field2228 = null;
        field2251 = null;
        field2235 = null;
        if (arg0 != 500) {
            method803(10);
        }
        field2238 = null;
        field2245 = null;
        field2229 = null;
        field2231 = null;
        field2227 = null;
        field2239 = null;
        field2232 = null;
        field2240 = null;
        field2230 = null;
        field2241 = null;
        field2233 = null;
    }

    @OriginalMember(owner = "client!qa", name = "run", descriptor = "()V", line = 67)
    public final void run() {
        field2246++;
        while (this.field2242) {
            Object var1 = this.field2234;
            synchronized (this.field2234) {
                if (this.field2249 < 500) {
                    this.field2247[this.field2249] = class75.field1664;
                    this.field2248[this.field2249] = class35.field816;
                    this.field2249++;
                }
            }
            class75.method634(50L, 20306);
        }
    }
}
