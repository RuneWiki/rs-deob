import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class159 extends class61 {

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "[I")
    public static int[] field2877 = new int[1000];

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
    public static int[] field2863 = new int[2];

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "[Llc;")
    public static class143[] field2885 = new class143[100];

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field2874 = 0;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "Lce;")
    public class216 field2893;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Lrc;")
    public class288 field2875;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "Lwa;")
    public class67 field2884;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "Lgk;")
    public class6 field2880;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)V")
    public static final void method1039(boolean arg0, int arg1, int arg2) {
        class166 var3 = class262.method1746(119, arg2, 1);
        var3.method1097((byte) -74);
        if (!arg0) {
            field2883 = -44;
        }
        var3.field2978 = arg1;
        field2868++;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public static void method1040(int arg0) {
        field2885 = null;
        field2877 = null;
        field2863 = null;
        if (arg0 != 1) {
            method1041(-76);
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public static final void method1041(int arg0) {
        field2886++;
        for (int var1 = 0; var1 < 100; var1++) {
            class69.field1323[var1] = true;
        }
        if (arg0 < 53) {
            field2885 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public final void method1042(int arg0) {
        field2869++;
        this.field2880 = null;
        if (arg0 != -101) {
            method1039(true, -125, -5);
        }
        this.field2884 = null;
        this.field2875 = null;
        this.field2893 = null;
    }
}
