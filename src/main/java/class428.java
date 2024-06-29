import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class428 {

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lt;")
    private class454 field6305;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lqc;")
    private class502 field6300;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lrb;")
    private class225 field6296;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "[I")
    public static int[] field6311 = new int[4096];

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Z")
    public static boolean field6308 = false;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "F")
    public static float field6301;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lae;")
    private class156 field6302;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Lit;")
    public static class439 field6307;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "[Lrr;")
    private class233[] field6306;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lek;Lek;II)Lrr;", line = 3)
    public final class233 method2547(class334 arg0, class334 arg1, int arg2, int arg3) {
        field6304++;
        return arg3 == -32078 ? this.method2549(arg0, arg1, true, arg2, arg3 ^ 0xFFFF82BA) : null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Z", line = 17)
    public final boolean method2548(int arg0) {
        field6297++;
        if (this.field6302 != null) {
            return true;
        }
        if (this.field6296 == null) {
            if (this.field6305.method2651(0)) {
                return false;
            }
            this.field6296 = this.field6305.method2643(255, 255, (byte) 0, (byte) -30, true);
        }
        if (this.field6296.field1128) {
            return false;
        }
        this.field6302 = new class156(this.field6296.method524(-6554));
        this.field6306 = new class233[(this.field6302.field2041.length - 5) / 8];
        if (arg0 != 15286) {
            this.method2550(-5);
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lek;Lek;ZII)Lrr;", line = 47)
    private final class233 method2549(class334 arg0, class334 arg1, boolean arg2, int arg3, int arg4) {
        field6310++;
        if (this.field6302 == null) {
            throw new RuntimeException();
        }
        this.field6302.field2018 = arg3 * arg4 + 5;
        if (this.field6302.field2041.length <= this.field6302.field2018) {
            throw new RuntimeException();
        } else if (this.field6306[arg3] == null) {
            int var6 = this.field6302.method950(186);
            int var7 = this.field6302.method950(186);
            class233 var8 = new class233(arg3, arg0, arg1, this.field6305, this.field6300, var6, var7, arg2);
            this.field6306[arg3] = var8;
            return var8;
        } else {
            return this.field6306[arg3];
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 89)
    public final void method2550(int arg0) {
        field6298++;
        if (this.field6306 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field6306.length; var2++) {
            if (this.field6306[var2] != null) {
                this.field6306[var2].method1412(arg0 ^ 0x64);
            }
        }
        for (int var3 = arg0; var3 < this.field6306.length; var3++) {
            if (this.field6306[var3] != null) {
                this.field6306[var3].method1411(false);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V", line = 127)
    public static final void method2551(int arg0) {
        field6303++;
        class409.field6006 = true;
        int var1 = 11 / ((15 - arg0) / 55);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lt;Lqc;)V", line = 136)
    public class428(class454 arg0, class502 arg1) {
        this.field6305 = arg0;
        this.field6300 = arg1;
        if (!this.field6305.method2651(0)) {
            this.field6296 = this.field6305.method2643(255, 255, (byte) 0, (byte) -30, true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V", line = 150)
    public static final void method2552(int arg0) {
        class278.field3965 = null;
        field6309++;
        if (arg0 != 18583) {
            method2553(110);
        }
        class270.field3778 = -1;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V", line = 162)
    public static void method2553(int arg0) {
        field6307 = null;
        field6311 = null;
        if (arg0 != 0) {
            method2551(-78);
        }
    }
}
