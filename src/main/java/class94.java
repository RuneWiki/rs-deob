import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 extends class47 {

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "[B")
    public byte[] field2289;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Loc;")
    public static class99 field2285 = class48.method402((byte) -104, "overlay_multiway");

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "[I")
    public static int[] field2283 = new int[2000];

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Loc;")
    public static class99 field2278 = class48.method402((byte) -104, ":: (X");

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Loc;")
    private static class99 field2282 = class48.method402((byte) -104, " has logged out)3");

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Loc;")
    private static class99 field2279 = class48.method402((byte) -104, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Loc;")
    public static class99 field2280 = field2282;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Loc;")
    public static class99 field2287 = field2279;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lr;")
    public static class118 field2284 = new class118(20);

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field2292 = -1;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "Loc;")
    private static class99 field2295 = class48.method402((byte) -104, "Enter message to send to ");

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field2296 = 0;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "Loc;")
    public static class99 field2299 = class48.method402((byte) -104, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "Loc;")
    public static class99 field2293 = class48.method402((byte) -104, "backhmid1");

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "Loc;")
    public static class99 field2294 = field2295;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "Loc;")
    public static class99 field2300 = class48.method402((byte) -104, "Freunde");

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "Loc;")
    private static class99 field2301 = class48.method402((byte) -104, "Loading fonts )2 ");

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "Loc;")
    public static class99 field2297 = field2301;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "Lef;")
    public static class35 field2298;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Loc;Loc;ILpc;)Ljc;")
    public static final class64 method774(class99 arg0, class99 arg1, int arg2, class105 arg3) {
        field2286++;
        if (arg2 >= -93) {
            method775(false);
        }
        int var4 = arg3.method883(arg0, 98);
        int var5 = arg3.method898(arg1, 60, var4);
        return class86.method734(arg3, var4, var5, 8784);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
    public static void method775(boolean arg0) {
        field2299 = null;
        field2285 = null;
        field2301 = null;
        field2279 = null;
        field2297 = null;
        field2283 = null;
        field2278 = null;
        field2293 = null;
        if (arg0) {
            method775(false);
        }
        field2295 = null;
        field2300 = null;
        field2287 = null;
        field2284 = null;
        field2298 = null;
        field2280 = null;
        field2282 = null;
        field2294 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Loc;")
    public static final class99 method776(int arg0, int arg1) {
        field2277++;
        if (arg1 < 999999999) {
            return class5.method31(arg1, 10);
        } else {
            int var2 = -42 / ((arg0 - 76) / 35);
            return class17.field446;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
    public class94(byte[] arg0) {
        this.field2289 = arg0;
    }
}
