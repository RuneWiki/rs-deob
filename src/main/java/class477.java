import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class477 {

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "Lnn;")
    private class291 field6641 = new class291();

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "[[I")
    public static int[][] field6648 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Lnn;")
    private class291 field6645;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Loi;")
    public static class53 field6643;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "[[Z")
    public static boolean[][] field6647;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lnn;", line = 4)
    public final class291 method2745(int arg0) {
        if (arg0 >= -100) {
            field6648 = null;
        }
        field6642++;
        class291 var2 = this.field6641.field4253;
        if (this.field6641 == var2) {
            return null;
        } else {
            var2.method1805((byte) 89);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V", line = 24)
    public static void method2746(int arg0) {
        field6643 = null;
        field6648 = null;
        if (arg0 != 12103) {
            field6648 = null;
        }
        field6647 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Z", line = 37)
    public final boolean method2747(byte arg0) {
        if (arg0 >= -81) {
            return true;
        } else {
            field6637++;
            return this.field6641.field4253 == this.field6641;
        }
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)Lnn;", line = 53)
    public final class291 method2748(int arg0) {
        field6644++;
        class291 var2 = this.field6641.field4253;
        if (this.field6641 == var2) {
            this.field6645 = null;
            return null;
        }
        if (arg0 != 2) {
            field6647 = null;
        }
        this.field6645 = var2.field4253;
        return var2;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IC)Z", line = 75)
    public static final boolean method2749(int arg0, char arg1) {
        field6638++;
        int var2 = -71 / ((-arg0 - 56) / 47);
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)I", line = 85)
    public final int method2750(byte arg0) {
        field6635++;
        int var2 = 0;
        class291 var3 = this.field6641.field4253;
        while (this.field6641 != var3) {
            var3 = var3.field4253;
            var2++;
        }
        if (arg0 != 77) {
            field6647 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)Lnn;", line = 107)
    public final class291 method2751(int arg0) {
        if (arg0 != -16195) {
            this.method2753(-111, null);
        }
        field6640++;
        class291 var2 = this.field6645;
        if (this.field6641 == var2) {
            this.field6645 = null;
            return null;
        } else {
            this.field6645 = var2.field4253;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)Lnn;", line = 128)
    public final class291 method2752(boolean arg0) {
        field6639++;
        if (arg0) {
            return null;
        }
        class291 var2 = this.field6641.field4257;
        if (this.field6641 == var2) {
            this.field6645 = null;
            return null;
        } else {
            this.field6645 = var2.field4257;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILnn;)V", line = 156)
    public final void method2753(int arg0, class291 arg1) {
        if (arg0 != 4) {
            field6648 = null;
        }
        field6646++;
        if (arg1.field4257 != null) {
            arg1.method1805((byte) 89);
        }
        arg1.field4253 = this.field6641;
        arg1.field4257 = this.field6641.field4257;
        arg1.field4257.field4253 = arg1;
        arg1.field4253.field4257 = arg1;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V", line = 209)
    public class477() {
        this.field6641.field4257 = this.field6641;
        this.field6641.field4253 = this.field6641;
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V", line = 179)
    public final void method2754(byte arg0) {
        field6636++;
        while (true) {
            class291 var2 = this.field6641.field4253;
            if (this.field6641 == var2) {
                if (arg0 <= 16) {
                    field6647 = null;
                }
                this.field6645 = null;
                return;
            }
            var2.method1805((byte) 89);
        }
    }
}
