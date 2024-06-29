import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class149 extends class182 {

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "[I")
    public static int[] field2746 = new int[500];

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Lsg;")
    private static class169 field2748 = class165.method1060(" from your ignore list first)3", 1536);

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "Lsg;")
    private static class169 field2750 = class165.method1060("Choose Option", 1536);

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "Lsg;")
    public static class169 field2751 = field2750;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field2756 = 0;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field2754 = 0;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "Lsg;")
    private static class169 field2760 = class165.method1060("Free world", 1536);

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Lsg;")
    public static class169 field2747 = field2760;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "Lsg;")
    public static class169 field2752 = field2748;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "Lsg;")
    private static class169 field2759 = class165.method1060("Loading )2 please wait)3", 1536);

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "Lsg;")
    public static class169 field2749 = field2759;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "Lua;")
    public static class181 field2765 = new class181(20);

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Lqe;")
    public class149 field2757;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Lqe;")
    public class149 field2763;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "Lud;")
    public static class184 field2762;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final void method973(int arg0) {
        field2755++;
        if (this.field2763 == null) {
            return;
        }
        this.field2763.field2757 = this.field2757;
        this.field2757.field2763 = this.field2763;
        this.field2763 = null;
        if (arg0 != 11076) {
            method976(true, -65);
        }
        this.field2757 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Ltd;")
    public static final class175 method974(int arg0, int arg1) {
        field2758++;
        class175 var2 = (class175) class192.field3787.method1206((long) arg0, -24742);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class176.field3436.method552(arg0, arg1, 0);
        class175 var4 = new class175();
        var4.field3404 = arg0;
        if (var3 != null) {
            var4.method1174(new class127(var3), (byte) 112);
        }
        var4.method1169((byte) -24);
        class192.field3787.method1208((long) arg0, arg1 + 115, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method975(byte arg0) {
        field2750 = null;
        field2747 = null;
        if (arg0 < 101) {
            return;
        }
        field2748 = null;
        field2765 = null;
        field2759 = null;
        field2749 = null;
        field2751 = null;
        field2752 = null;
        field2762 = null;
        field2746 = null;
        field2760 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)I")
    public static final int method976(boolean arg0, int arg1) {
        if (!arg0) {
            return 44;
        }
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        field2761++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Z")
    public static final boolean method977(int arg0, int arg1) {
        field2753++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 < 20) {
            method977(-102, 112);
        }
        int var2 = field2746[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1004;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)Z")
    public static final boolean method978(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return true;
        }
        field2764++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class17 var3 = class138.method925(6, arg2);
        return var3.method106(arg1, false);
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)Lbg;")
    public static final class18 method979(int arg0) {
        field2766++;
        if (arg0 != -15580) {
            field2746 = null;
        }
        class18 var1 = new class18();
        var1.field410 = class41.field770[0];
        var1.field412 = class182.field3544[0];
        var1.field414 = class16.field334;
        var1.field413 = class2.field43[0];
        var1.field409 = class203.field3976[0];
        int var2 = var1.field413 * var1.field409;
        var1.field411 = class156.field2992;
        var1.field408 = new int[var2];
        byte[] var3 = class193.field3814[0];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field408[var4] = class197.field3873[class150.method984(var3[var4], 255)];
        }
        class66.method424((byte) -48);
        return var1;
    }
}
