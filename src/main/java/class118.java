import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class118 implements Runnable {

    @OriginalMember(owner = "client!l", name = "n", descriptor = "[Lbh;")
    public volatile class20[] field2242 = new class20[2];

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Z")
    public volatile boolean field2240 = false;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Z")
    public volatile boolean field2233 = false;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lvd;")
    public static class222 field2232 = class212.method1357("settings=", 10731);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2231 = 0;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lvd;")
    private static class222 field2235 = class212.method1357("Take", 10731);

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Lvd;")
    public static class222 field2238 = field2235;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lvd;")
    public static class222 field2237 = class212.method1357("p12_full", 10731);

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lcf;")
    public static class28 field2244 = new class28();

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lnc;")
    public static class141 field2229;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lve;")
    public static class223 field2241;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ld;")
    public class33 field2230;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[I")
    public static int[] field2239;

    @OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
    public final void run() {
        this.field2233 = true;
        try {
            while (!this.field2240) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class20 var2 = this.field2242[var1];
                    if (var2 != null) {
                        var2.method200(-89);
                    }
                }
                class225.method1471(10L, -23364);
                class181.method1139(null, (byte) 60, this.field2230);
            }
        } catch (Exception var9) {
            class68.method464(var9, 128, null);
        } finally {
            Object var6 = null;
            this.field2233 = false;
        }
        field2234++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILvd;)Ldg;")
    public static final class40 method756(int arg0, class222 arg1) {
        field2236++;
        int var2 = 11 / ((-arg0 - 37) / 58);
        if (arg1.method1444(-24) == 0) {
            return null;
        }
        for (class40 var3 = (class40) class128.field2479.method236(0); var3 != null; var3 = (class40) class128.field2479.method237(true)) {
            if (var3.field878.method1435((byte) -19, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method757(int arg0) {
        field2235 = null;
        field2237 = null;
        field2238 = null;
        field2244 = null;
        field2232 = null;
        field2239 = null;
        field2241 = null;
        if (arg0 >= -112) {
            field2231 = -90;
        }
        field2229 = null;
    }
}
