import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class138 extends class240 {

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "Lcd;")
    private static class64 field2450 = class44.method335((byte) 71, "Please remove ");

    @OriginalMember(owner = "client!va", name = "R", descriptor = "Lcd;")
    public static class64 field2451 = class44.method335((byte) 71, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field2456 = -2;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "Z")
    public static boolean field2459 = false;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "Lcd;")
    public static class64 field2457 = class44.method335((byte) 71, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!va", name = "V", descriptor = "[I")
    public static int[] field2455 = new int[2];

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lcd;")
    private static class64 field2460 = class44.method335((byte) 71, "M");

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Lcd;")
    public static class64 field2448 = field2460;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "Lcd;")
    public static class64 field2462 = class44.method335((byte) 71, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!va", name = "S", descriptor = "Lcd;")
    public static class64 field2452 = field2450;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "Lcd;")
    public static class64 field2464 = field2460;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field2461 = 0;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "Lcd;")
    public static class64 field2453 = field2450;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "Lqm;")
    public static class222 field2449;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "Z")
    public static boolean field2454;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V", line = 9)
    public static void method986(int arg0) {
        field2451 = null;
        field2464 = null;
        field2450 = null;
        field2448 = null;
        field2460 = null;
        if (arg0 != 57) {
            return;
        }
        field2452 = null;
        field2449 = null;
        field2457 = null;
        field2455 = null;
        field2462 = null;
        field2453 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 36)
    public class138() {
        super(1, true);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Z", line = 49)
    public static final boolean method987(int arg0, int arg1) {
        if (arg0 > -125) {
            return false;
        } else {
            field2458++;
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I", line = 62)
    public final int[] method12(int arg0, int arg1) {
        field2463++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int[][] var4 = this.method1746(117, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class169.field2936; var8++) {
                var3[var8] = (var6[var8] + var5[var8] + var7[var8]) / 3;
            }
        }
        if (arg0 != 64) {
            method986(46);
        }
        return var3;
    }
}
