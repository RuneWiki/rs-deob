import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class224 {

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public int field3282 = 1;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public int field3290 = 2;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public int field3283 = -1;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field3292 = 64;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Z")
    public boolean field3291 = false;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public int field3285 = 64;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Z")
    public boolean field3280 = false;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lfs;")
    public static class387 field3286;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "[Ll;")
    public static class16[] field3293;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILiv;)V")
    public final void method1526(int arg0, int arg1, class65 arg2) {
        field3284++;
        while (true) {
            int var4 = arg2.method577(255);
            if (var4 == 0) {
                if (arg0 == 8554) {
                    return;
                } else {
                    field3293 = null;
                    return;
                }
            }
            this.method1527(arg2, var4, arg0 - 8555, arg1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Liv;III)V")
    private final void method1527(class65 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field3283 = arg0.method623((byte) 88);
            if (this.field3283 == 65535) {
                this.field3283 = -1;
            }
        } else if (arg1 == 2) {
            this.field3285 = arg0.method623((byte) 104) + 1;
            this.field3292 = arg0.method623((byte) -64) + 1;
        } else if (arg1 == 3) {
            arg0.method629(false);
        } else if (arg1 == 4) {
            this.field3290 = arg0.method577(255);
        } else if (arg1 == 5) {
            this.field3282 = arg0.method577(255);
        } else if (arg1 == 6) {
            this.field3280 = true;
        } else if (arg1 == 7) {
            this.field3291 = true;
        }
        field3287++;
        if (arg2 != -1) {
            this.field3290 = -64;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V")
    public static final void method1528(int arg0, boolean arg1) {
        class393.field5784 = new int[arg0];
        class133.field1929 = new int[arg0];
        field3279++;
        class452.field6656 = new int[arg0];
        if (!arg1) {
            method1528(-65, false);
        }
        class516.field7605 = new int[arg0];
        class325.field4562 = new int[arg0];
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1529(int arg0) {
        field3293 = null;
        if (arg0 == -2) {
            field3286 = null;
        }
    }
}
