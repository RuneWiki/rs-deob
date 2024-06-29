import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class154 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    private int field2336;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    private int field2351;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    private int field2338;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    private int field2341;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    private int field2349;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Ltf;")
    public static class198 field2347 = null;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Lgw;")
    public static class118 field2340 = new class118();

    @OriginalMember(owner = "client!em", name = "s", descriptor = "[[Z")
    public static boolean[][] field2352 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1084(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2334++;
        int var5 = 0;
        if (arg0 < 107) {
            field2352 = null;
        }
        while (var5 < class7.field52) {
            Rectangle var6 = class184.field2724[var5];
            if (arg3 < (var6.x + var6.width) && var6.x < (arg2 + arg3) && var6.y + var6.height > arg4 && (arg1 + arg4) > var6.y) {
                class130.field2043[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IBII)Z", line = 27)
    public final boolean method1085(int arg0, byte arg1, int arg2, int arg3) {
        field2343++;
        if (arg2 < this.field2345 || this.field2341 < arg2) {
            return false;
        } else if (arg0 < this.field2335 || arg0 > this.field2337) {
            return false;
        } else if (this.field2349 <= arg3 && this.field2342 >= arg3) {
            int var5 = arg2 - this.field2339;
            int var6 = -108 % ((arg1 - 9) / 43);
            int var7 = arg3 - this.field2351;
            return var5 * var5 + var7 * var7 < this.field2336;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIIIIII)V", line = 57)
    public final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2350++;
        this.field2338 = arg6;
        this.field2339 = arg8;
        this.field2351 = arg10;
        if (arg9 < 27) {
            method1089(3);
        }
        this.field2336 = arg4 * arg4;
        this.field2337 = this.field2338 + arg7;
        this.field2345 = this.field2339 + arg0;
        this.field2341 = this.field2339 + arg2;
        this.field2342 = this.field2351 + arg1;
        this.field2349 = this.field2351 + arg3;
        this.field2335 = this.field2338 + arg5;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Ltf;", line = 78)
    public static final class198 method1087(int arg0, int arg1) {
        field2344++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1 != 2) {
            return null;
        }
        if (class283.field4217[var2] == null || class283.field4217[var2][var3] == null) {
            boolean var4 = class175.method1224(var2, 7607);
            if (!var4) {
                return null;
            }
        }
        return class283.field4217[var2][var3];
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZIIII)V", line = 103)
    public static final void method1088(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg2) {
            method1087(-46, -122);
        }
        for (class230 var7 = (class230) class27.field379.method904(false); var7 != null; var7 = (class230) class27.field379.method907(-1)) {
            if (var7.field3458 <= class24.field349) {
                var7.method2429(123);
            } else {
                class299.method1919(arg0 >> 1, var7.field3446 * 2, arg4 >> 1, arg6, -125, var7.field3447, (var7.field3444 << 7) + 64, arg1, (var7.field3454 << 7) + 64);
                class270.field4072.method1746(!arg2, var7.field3457 | 0xFF000000, class452.field6599[0] + arg5, class452.field6599[1] + arg3, var7.field3451, 0);
            }
        }
        field2346++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 131)
    public static void method1089(int arg0) {
        field2347 = null;
        field2352 = null;
        if (arg0 == 64) {
            field2340 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 153)
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2336 = arg3 * arg3;
        this.field2351 = arg2;
        this.field2339 = arg0;
        this.field2338 = arg1;
        this.field2345 = this.field2339 + arg4;
        this.field2337 = this.field2338 + arg7;
        this.field2342 = this.field2351 + arg9;
        this.field2341 = this.field2339 + arg5;
        this.field2349 = this.field2351 + arg8;
        this.field2335 = this.field2338 + arg6;
    }
}
