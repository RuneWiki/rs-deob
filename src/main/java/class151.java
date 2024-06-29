import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class151 extends class51 {

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    private final int field2348;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    private final int field2353;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    private final int field2350;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    private final int field2352;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    private final int field2342;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    private final int field2355;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    private final int field2357;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    private final int field2346;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "[I")
    public static int[] field2343 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "[I")
    public static int[] field2341 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "Lok;")
    public static class41 field2354 = class137.method956("Ablegen", 45);

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Lak;")
    public static class20 field2344 = new class20(64);

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "Lok;")
    public static class41 field2359 = class137.method956("Bitte entfernen Sie ", 45);

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
    public static int field2358 = 0;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "[I")
    public static int[] field2347;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)V", line = 19)
    public final void method72(int arg0, int arg1, int arg2) {
        if (arg0 != -15071) {
            this.method73(-79, 99, 10);
        }
        field2351++;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 39)
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2348 = arg3;
        this.field2353 = arg5;
        this.field2350 = arg7;
        this.field2352 = arg2;
        this.field2342 = arg1;
        this.field2355 = arg0;
        this.field2357 = arg6;
        this.field2346 = arg4;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(III)V", line = 67)
    public final void method73(int arg0, int arg1, int arg2) {
        field2345++;
        if (arg0 != 0) {
            method1042(-16);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)V", line = 82)
    public final void method71(int arg0, int arg1, int arg2) {
        field2349++;
        int var4 = this.field2355 * arg0 >> 12;
        int var5 = this.field2342 * arg2 >> 12;
        int var6 = this.field2348 * arg2 >> 12;
        int var7 = this.field2346 * arg0 >> 12;
        int var8 = this.field2357 * arg0 >> 12;
        int var9 = this.field2350 * arg2 >> 12;
        int var10 = this.field2352 * arg0 >> 12;
        int var11 = this.field2353 * arg2 >> 12;
        class213.method1510(var4, var6, var7, var8, var10, this.field767, var9, arg1, var5, var11);
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V", line = 111)
    public static void method1041(byte arg0) {
        field2341 = null;
        field2343 = null;
        field2354 = null;
        if (arg0 == -61) {
            field2344 = null;
            field2347 = null;
            field2359 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 136)
    public static final void method1042(int arg0) {
        field2356++;
        if (arg0 != -2871) {
            field2347 = (int[]) null;
        }
        if (class48.field742 <= 0) {
            class91.field1321 = class118.field1724;
            class118.field1724 = null;
            class282.method1991(-8, 40);
        } else {
            class238.method1705(108);
        }
    }
}
