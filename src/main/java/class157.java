import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class157 extends class254 {

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    public int field2781 = -1;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public int field2770 = -1;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
    public int field2782 = 12800;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public int field2783 = 0;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public int field2784 = 0;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public int field2772 = 12800;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "Z")
    public boolean field2794 = true;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    public int field2786;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "Lcf;")
    public class93 field2777;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "Lcf;")
    public class93 field2773;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "Lmb;")
    public class160 field2775;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "Lnh;")
    public static class54 field2774 = new class54(500);

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public static int field2789 = -1;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "Lcf;")
    public static class93 field2792 = class147.method1066("::noclip", -48);

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "Z")
    public static volatile boolean field2791 = false;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2787;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "[Luf;")
    public static class173[] field2790;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([Lcf;Z)[Lcf;")
    public static final class93[] method1123(class93[] arg0, boolean arg1) {
        field2769++;
        class93[] var2 = new class93[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class130.method949((byte) -77, new class93[] { class148.method1067(-7015, var3), class241.field4360 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class130.method949((byte) -77, new class93[] { var2[var3], arg0[var3] });
            }
        }
        if (!arg1) {
            method1128(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
    public final boolean method1124(int arg0, int arg1, int arg2) {
        field2779++;
        if (this.field2782 > arg2 || arg2 > this.field2784 || this.field2772 > arg0 || this.field2783 < arg0) {
            return false;
        }
        if (arg1 != 0) {
            this.field2782 = -72;
        }
        for (class9 var4 = (class9) this.field2775.method1151(114); var4 != null; var4 = (class9) this.field2775.method1159(35)) {
            if (var4.method43(arg2, arg0, -114)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([IB)[I")
    public static final int[] method1125(int[] arg0, byte arg1) {
        int var2 = 99 / ((-arg1 - 13) / 43);
        field2778++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var3 = new int[arg0.length];
            class107.method768(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)I")
    public static final int method1126(int arg0, int arg1) {
        if (arg1 != -489923128) {
            field2791 = false;
        }
        field2776++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)V")
    public static final void method1127(long arg0, int arg1) {
        field2771++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class145.field2567 < 100 || class196.field3593) || class145.field2567 >= 200) {
            class263.method1764(0, (byte) -116, class178.field3144, class104.field1807);
            return;
        }
        class93 var3 = class205.method1454((byte) -99, arg0).method687(-96);
        for (int var4 = arg1; var4 < class145.field2567; var4++) {
            if (class284.field5095[var4] == arg0) {
                class263.method1764(0, (byte) -116, class178.field3144, class130.method949((byte) -77, new class93[] { var3, class46.field749 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class284.field5098; var5++) {
            if (class223.field4025[var5] == arg0) {
                class263.method1764(0, (byte) -116, class178.field3144, class130.method949((byte) -77, new class93[] { class183.field3379, var3, class50.field830 }));
                return;
            }
        }
        if (var3.method667(class166.field2927.field4247, (byte) -128)) {
            class263.method1764(0, (byte) -116, class178.field3144, class15.field204);
            return;
        }
        class171.field3004[class145.field2567] = var3;
        class213.field3904++;
        class284.field5095[class145.field2567] = arg0;
        class220.field3999[class145.field2567] = 0;
        class210.field3825[class145.field2567] = class178.field3144;
        class24.field296[class145.field2567] = 0;
        class267.field4745[class145.field2567] = false;
        class9.field128 = class193.field3542;
        class145.field2567++;
        class285.field5105.method1568(21, (byte) 91);
        class285.field5105.method1882(arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static void method1128(boolean arg0) {
        field2774 = null;
        field2787 = null;
        field2790 = null;
        field2792 = null;
        if (!arg0) {
            method1126(106, -62);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
    public final void method1129(int arg0) {
        this.field2772 = 12800;
        this.field2784 = arg0;
        field2785++;
        this.field2782 = 12800;
        this.field2783 = 0;
        for (class9 var2 = (class9) this.field2775.method1151(110); var2 != null; var2 = (class9) this.field2775.method1159(124)) {
            if (var2.field125 > this.field2784) {
                this.field2784 = var2.field125;
            }
            if (var2.field121 < this.field2782) {
                this.field2782 = var2.field121;
            }
            if (var2.field135 > this.field2783) {
                this.field2783 = var2.field135;
            }
            if (var2.field126 < this.field2772) {
                this.field2772 = var2.field126;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lcf;Lcf;IIIZI)V")
    public class157(class93 arg0, class93 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2786 = arg3;
        this.field2777 = arg1;
        this.field2781 = arg4;
        this.field2794 = arg5;
        this.field2770 = arg6;
        this.field2780 = arg2;
        if (this.field2770 == 255) {
            this.field2770 = 0;
        }
        this.field2773 = arg0;
        this.field2775 = new class160();
    }
}
