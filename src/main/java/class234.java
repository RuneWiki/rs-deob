import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class234 extends class452 {

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    private int field3287;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    private int field3295;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    private int field3293;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field3285 = 0;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "[Z")
    public static boolean[] field3286 = new boolean[100];

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "[Lc;")
    public static class159[] field3291 = new class159[0];

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field3290 = -9017772;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "Lqj;")
    public static class238 field3296;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZI)V")
    public final void method493(int arg0, boolean arg1, int arg2) {
        ++field3289;
        if (arg1) {
            this.method492(36, 103, -38);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)V")
    public static final void method1433(boolean arg0, int arg1) {
        ++field3297;
        class231.field3263 = arg1;
        class24 var2 = class29.field500;
        synchronized (class29.field500) {
            class29.field500.method212(-124);
        }
        if (!arg0) {
            method1433(false, -25);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIB)V")
    public final void method496(int arg0, int arg1, byte arg2) {
        ++field3288;
        int var4 = this.field3287 * arg1 >> 12;
        if (arg2 == 75) {
            int var5 = this.field3294 * arg1 >> 12;
            int var6 = this.field3295 * arg0 >> 12;
            int var7 = this.field3293 * arg0 >> 12;
            class93.method573(var4, var7, (byte) -126, var5, super.field6589, var6);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V")
    public final void method492(int arg0, int arg1, int arg2) {
        ++field3284;
        int var4 = this.field3287 * arg0 >> 12;
        int var5 = this.field3294 * arg0 >> 12;
        int var6 = this.field3295 * arg1 >> 12;
        if (arg2 == 0) {
            int var7 = this.field3293 * arg1 >> 12;
            class132.method893(super.field6582, super.field6589, 1, var6, var7, var5, var4, super.field6585);
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIIIII)V")
    public class234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3287 = arg0;
        this.field3295 = arg1;
        this.field3293 = arg3;
        this.field3294 = arg2;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method1434(int arg0) {
        field3291 = null;
        field3286 = null;
        field3296 = null;
        int var1 = 33 / ((arg0 - 26) / 37);
    }
}
