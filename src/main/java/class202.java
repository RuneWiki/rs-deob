import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class202 extends class183 {

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "[I")
    public int[] field2878 = new int[5];

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public int field2871 = 0;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "[Lco;")
    public class280[] field2896 = new class280[5];

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public int field2884;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public int field2881;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field2874 = 0;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field2875;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Lvh;")
    public class144 field2872;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "Lnf;")
    public class149 field2886;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "Ldi;")
    public class186 field2887;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "Lpi;")
    public class202 field2888;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Lid;")
    public class269 field2879;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Lfd;")
    public class306 field2869;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Lj;")
    public class7 field2873;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Z")
    public boolean field2870;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "Z")
    public boolean field2892;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Z")
    public boolean field2893;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[I")
    public static int[] field2866;

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(III)V", line = 5)
    public class202(int arg0, int arg1, int arg2) {
        this.field2876 = arg1;
        this.field2891 = this.field2884 = arg0;
        this.field2881 = arg2;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 18)
    public static void method1433(boolean arg0) {
        if (arg0) {
            field2889 = 114;
        }
        field2866 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Component;III)Loa;", line = 47)
    public static final class153 method1434(Component arg0, int arg1, int arg2, int arg3) {
        field2867++;
        if (arg3 > -33) {
            return (class153) null;
        }
        try {
            Class var4 = Class.forName("ln");
            class153 var5 = (class153) var4.getDeclaredConstructor().newInstance();
            var5.method1105(arg1, arg2, (byte) 71, arg0);
            return var5;
        } catch (Throwable var8) {
            class206 var7 = new class206();
            var7.method1105(arg1, arg2, (byte) 117, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZLin;B)V", line = 76)
    public static final void method1435(int arg0, int arg1, boolean arg2, class344 arg3, byte arg4) {
        field2885++;
        int var5 = arg3.field5293;
        if (arg3.field5259 == 0) {
            arg3.field5293 = arg3.field5236;
        } else if (arg3.field5259 == 1) {
            arg3.field5293 = arg1 - arg3.field5236;
        } else if (arg3.field5259 == 2) {
            arg3.field5293 = arg3.field5236 * arg1 >> 14;
        } else if (arg3.field5259 == 3) {
            if (arg3.field5316 == 2) {
                arg3.field5293 = (arg3.field5236 - 1) * arg3.field5256 + arg3.field5236 * 32;
            } else if (arg3.field5316 == 7) {
                arg3.field5293 = (arg3.field5236 - 1) * arg3.field5256 + arg3.field5236 * 12;
            }
        }
        if (arg4 < 119) {
            return;
        }
        int var6 = arg3.field5334;
        if (arg3.field5173 == 0) {
            arg3.field5334 = arg3.field5305;
        } else if (arg3.field5173 == 1) {
            arg3.field5334 = arg0 - arg3.field5305;
        } else if (arg3.field5173 == 2) {
            arg3.field5334 = arg3.field5305 * arg0 >> 14;
        } else if (arg3.field5173 == 3) {
            if (arg3.field5316 == 2) {
                arg3.field5334 = (arg3.field5305 - 1) * arg3.field5198 + arg3.field5305 * 32;
            } else if (arg3.field5316 == 7) {
                arg3.field5334 = (arg3.field5305 - 1) * arg3.field5198 + arg3.field5305 * 115;
            }
        }
        if (arg3.field5173 == 4) {
            arg3.field5334 = arg3.field5293 * arg3.field5225 / arg3.field5327;
        }
        if (arg3.field5259 == 4) {
            arg3.field5293 = arg3.field5334 * arg3.field5327 / arg3.field5225;
        }
        if (class63.field823 && (client.method821(arg3).field4426 != 0 || arg3.field5316 == 0)) {
            if (arg3.field5293 < 5 && arg3.field5334 < 5) {
                arg3.field5293 = 5;
                arg3.field5334 = 5;
            } else {
                if (arg3.field5334 <= 0) {
                    arg3.field5334 = 5;
                }
                if (arg3.field5293 <= 0) {
                    arg3.field5293 = 5;
                }
            }
        }
        if (arg3.field5317 == 1337) {
            class198.field2782 = arg3;
        }
        if (arg2 && arg3.field5188 != null && (arg3.field5334 != var6 || arg3.field5293 != var5)) {
            class171 var7 = new class171();
            var7.field2333 = arg3.field5188;
            var7.field2341 = arg3;
            class218.field3123.method1339((byte) -113, var7);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 193)
    public static final void method1436(int arg0) {
        field2883++;
        class148.field2045.method724(arg0 - 5);
        if (arg0 != 5) {
            field2889 = 49;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lfj;I)I", line = 205)
    public static final int method1437(class241 arg0, int arg1) {
        field2880++;
        int var2 = arg0.field3424;
        class194 var3 = arg0.method1753(arg1);
        if (arg0.field3719 == var3.field2665) {
            var2 = arg0.field3443;
        } else if (arg0.field3719 == var3.field2682 || arg0.field3719 == var3.field2691 || arg0.field3719 == var3.field2680 || arg0.field3719 == var3.field2701) {
            var2 = arg0.field3409;
        } else if (arg0.field3719 == var3.field2699 || arg0.field3719 == var3.field2667 || arg0.field3719 == var3.field2670 || arg0.field3719 == var3.field2685) {
            var2 = arg0.field3440;
        }
        return var2;
    }
}
