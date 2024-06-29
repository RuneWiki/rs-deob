import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class168 {

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Lwk;")
    private class196 field2742;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lfd;")
    private class63 field2735;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Ljb;")
    private class225 field2748;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2732 = 0;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "[I")
    public static int[] field2739 = new int[1000];

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2731 = "Connected to update server";

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2745 = 20;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Z")
    public static boolean field2744 = true;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Lwd;")
    private class162 field2743;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[Lvg;")
    private class32[] field2730;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "[S")
    public static short[] field2741;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
    public final boolean method1221(byte arg0) {
        field2729++;
        if (this.field2743 != null) {
            return true;
        } else if (arg0 == -115) {
            if (this.field2748 == null) {
                if (this.field2735.method443(115)) {
                    return false;
                }
                this.field2748 = this.field2735.method441((byte) 0, true, 255, 255, (byte) 120);
            }
            if (this.field2748.field205) {
                return false;
            } else {
                this.field2743 = new class162(this.field2748.method66(-51));
                this.field2730 = new class32[(this.field2743.field2573.length - 5) / 8];
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public final void method1222(int arg0) {
        if (arg0 < 103) {
            return;
        }
        field2749++;
        if (this.field2730 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2730.length; var2++) {
            if (this.field2730[var2] != null) {
                this.field2730[var2].method212(84);
            }
        }
        for (int var3 = 0; var3 < this.field2730.length; var3++) {
            if (this.field2730[var3] != null) {
                this.field2730[var3].method208(-126);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIII)V")
    public static final void method1223(byte arg0, int arg1, int arg2, int arg3) {
        field2747++;
        if (arg0 < 64) {
            method1226(-86);
        }
        String var4 = "::tele " + arg1 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class40.method262(11668, var4);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILlj;Llj;Z)Lvg;")
    private final class32 method1224(int arg0, int arg1, class25 arg2, class25 arg3, boolean arg4) {
        field2733++;
        if (this.field2743 == null) {
            throw new RuntimeException();
        }
        this.field2743.field2568 = arg0 * 8 + 5;
        if (this.field2743.field2573.length <= this.field2743.field2568) {
            throw new RuntimeException();
        } else if (this.field2730[arg0] != null) {
            return this.field2730[arg0];
        } else if (arg1 == -18024) {
            int var6 = this.field2743.method1157(arg1 ^ 0xFFFF4698);
            int var7 = this.field2743.method1157(65280);
            class32 var8 = new class32(arg0, arg3, arg2, this.field2735, this.field2742, var6, var7, arg4);
            this.field2730[arg0] = var8;
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILlj;Llj;)Lvg;")
    public final class32 method1225(int arg0, int arg1, class25 arg2, class25 arg3) {
        field2750++;
        return arg1 >= -19 ? null : this.method1224(arg0, -18024, arg3, arg2, true);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method1226(int arg0) {
        if (arg0 == -9536) {
            field2731 = null;
            field2741 = null;
            field2739 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static final void method1227(boolean arg0) {
        if (arg0) {
            method1227(false);
        }
        int var1 = (class239.field3829.field637 >> 7) + class276.field4438;
        field2740++;
        class66.field1104 = 0;
        int var2 = (class239.field3829.field710 >> 7) + class108.field1732;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class66.field1104 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class66.field1104 = 1;
        }
        if (class66.field1104 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class66.field1104 = 0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)V")
    public static final void method1228(int arg0, int arg1, byte arg2) {
        int var3 = 50 % ((arg2 - 37) / 56);
        field2736++;
        class175 var4 = class182.method1317(7, arg1, false);
        var4.method1279((byte) -80);
        var4.field2855 = arg0;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lfd;Lwk;)V")
    public class168(class63 arg0, class196 arg1) {
        this.field2742 = arg1;
        this.field2735 = arg0;
        if (!this.field2735.method443(119)) {
            this.field2748 = this.field2735.method441((byte) 0, true, 255, 255, (byte) 93);
        }
    }
}
