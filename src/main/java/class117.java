import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class117 extends class19 {

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    private int field2269 = 128;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "I")
    private int field2272 = 0;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    private int field2264 = 0;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
    public int field2275 = -1;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
    private int field2271 = 128;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "I")
    private int field2273 = 0;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "Lsd;")
    public static class166 field2263 = class135.method935("(U5", 0);

    @OriginalMember(owner = "client!n", name = "V", descriptor = "Z")
    public static boolean field2265 = false;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "Lsd;")
    public static class166 field2270 = class135.method935(")4l", 0);

    @OriginalMember(owner = "client!n", name = "N", descriptor = "Lsd;")
    public static class166 field2257 = class135.method935(": ", 0);

    @OriginalMember(owner = "client!n", name = "hb", descriptor = "Lsd;")
    public static class166 field2277 = class135.method935("Ung-Ultiger Benutzername", 0);

    @OriginalMember(owner = "client!n", name = "gb", descriptor = "Lsd;")
    private static class166 field2276 = class135.method935("glow1:", 0);

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Lsd;")
    public static class166 field2261 = field2276;

    @OriginalMember(owner = "client!n", name = "ib", descriptor = "Lsd;")
    public static class166 field2278 = field2276;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!n", name = "kb", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!n", name = "lb", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!n", name = "jb", descriptor = "[Lkf;")
    public static class96[] field2279;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "[S")
    private short[] field2258;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "[S")
    private short[] field2266;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "[S")
    private short[] field2268;

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "[S")
    private short[] field2274;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "(I)V")
    public static void method839(int arg0) {
        if (arg0 != 128) {
            return;
        }
        field2276 = null;
        field2263 = null;
        field2279 = null;
        field2257 = null;
        field2278 = null;
        field2270 = null;
        field2261 = null;
        field2277 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)Z")
    public static final boolean method840(int arg0, boolean arg1) {
        field2259++;
        if (!arg1) {
            method840(110, false);
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILff;I)V")
    private final void method841(int arg0, class53 arg1, int arg2) {
        if (arg0 != 0) {
            field2279 = null;
        }
        field2262++;
        if (arg2 == 1) {
            this.field2255 = arg1.method405(2);
        } else if (arg2 == 2) {
            this.field2275 = arg1.method405(arg0 + 2);
        } else if (arg2 == 4) {
            this.field2269 = arg1.method405(arg0 + 2);
        } else if (arg2 == 5) {
            this.field2271 = arg1.method405(arg0 + 2);
        } else if (arg2 == 6) {
            this.field2273 = arg1.method405(2);
        } else if (arg2 == 7) {
            this.field2272 = arg1.method400(255);
        } else if (arg2 == 8) {
            this.field2264 = arg1.method400(255);
        } else if (arg2 == 40) {
            int var6 = arg1.method400(arg0 ^ 0xFF);
            this.field2258 = new short[var6];
            this.field2274 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2274[var7] = (short) arg1.method405(2);
                this.field2258[var7] = (short) arg1.method405(2);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method400(255);
            this.field2268 = new short[var4];
            this.field2266 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2268[var5] = (short) arg1.method405(2);
                this.field2266[var5] = (short) arg1.method405(2);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lff;B)V")
    public final void method842(class53 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method400(arg1 ^ 0xFFFFFF1A);
            if (var3 == 0) {
                if (arg1 != -27) {
                    return;
                }
                field2280++;
                return;
            }
            this.method841(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lo;")
    public final class126 method843(byte arg0, int arg1) {
        class126 var3 = (class126) class124.field2441.method64((byte) 28, (long) this.field2267);
        field2281++;
        if (var3 == null) {
            class101 var4 = class101.method768(class159.field3041, this.field2255, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2274 != null) {
                for (int var5 = 0; var5 < this.field2274.length; var5++) {
                    var4.method749(this.field2274[var5], this.field2258[var5]);
                }
            }
            if (this.field2268 != null) {
                for (int var6 = 0; var6 < this.field2268.length; var6++) {
                    var4.method762(this.field2268[var6], this.field2266[var6]);
                }
            }
            var3 = var4.method755(this.field2272 + 64, this.field2264 + 850, -30, -50, -30, true, true);
            class124.field2441.method67(var3, 15266, (long) this.field2267);
        }
        if (arg0 != 117) {
            return null;
        }
        class126 var7;
        if (this.field2275 == -1 || arg1 == -1) {
            var7 = var3.method845(true);
        } else {
            var7 = class110.method798(this.field2275, 12).method516(var3, arg1, 65535);
        }
        if (this.field2269 != 128 || this.field2271 != 128) {
            var7.method898(this.field2269, this.field2271, this.field2269);
        }
        if (this.field2273 != 0) {
            if (this.field2273 == 90) {
                var7.method902();
            }
            if (this.field2273 == 180) {
                var7.method902();
                var7.method902();
            }
            if (this.field2273 == 270) {
                var7.method902();
                var7.method902();
                var7.method902();
            }
        }
        return var7;
    }
}
