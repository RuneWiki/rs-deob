import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class72 extends class48 implements class439 {

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "[I")
    public static int[] field981 = new int[1000];

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field970 = 50;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "[I")
    public static int[] field978 = new int[field970];

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field983 = new String[field970];

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "[I")
    public static int[] field985 = new int[field970];

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "[I")
    public static int[] field988 = new int[field970];

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "[I")
    public static int[] field982 = new int[field970];

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "[I")
    public static int[] field971 = new int[field970];

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "[I")
    public static int[] field989 = new int[field970];

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "Lffa;")
    public static class562 field980 = new class562();

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Lnj;")
    public static class415 field992 = new class415(0, 7);

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "Lra;")
    public static class361 field993 = new class361(104, 7);

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(CB)Z")
    public static final boolean method572(char arg0, byte arg1) {
        if (arg1 != 127) {
            return true;
        } else {
            ++field984;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        super.field682.method3444(124, this);
        ++field990;
        if (arg0 >= -1) {
            field983 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V")
    public static void method573(boolean arg0) {
        field985 = null;
        field992 = null;
        field971 = null;
        field978 = null;
        field988 = null;
        field982 = null;
        field981 = null;
        field983 = null;
        field989 = null;
        field993 = null;
        field980 = null;
        if (!arg0) {
            method578((class622) null, (String) null, 115, -98);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II[BI)V")
    public final void method574(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method438(arg3, (byte) -15, arg2);
        ++field977;
        this.field974 = arg0;
        if (arg1 != -18622) {
            this.method576((byte) -52);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)I")
    public final int method575(boolean arg0) {
        ++field975;
        if (!arg0) {
            method578((class622) null, (String) null, 105, 18);
        }
        return this.field974;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)J")
    public final long method576(byte arg0) {
        if (arg0 > -23) {
            field970 = 42;
        }
        ++field987;
        return 0L;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lji;I[BIZ)V")
    public class72(class622 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field974 = arg1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I")
    public final int method577(int arg0) {
        if (arg0 != 23152) {
            return 125;
        } else {
            ++field979;
            return super.field681;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lji;Ljava/lang/String;II)Lmt;")
    public static final class420 method578(class622 arg0, String arg1, int arg2, int arg3) {
        ++field973;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class32.field473, 0);
        if (~class32.field473[arg3] != 0) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class420(arg0, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method579(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class421.field5441 = arg1;
        class65.field884 = arg2;
        if (!arg5) {
            ++field986;
            class235.field3140 = arg4;
            class688.field9415 = arg3;
            class71.field965 = arg0;
            if (~class71.field965 <= -101) {
                int var6 = class421.field5441 * 512 + 256;
                int var7 = class688.field9415 * 512 + 256;
                int var8 = class332.method1916(1218445319, var7, class390.field4991, var6) + -class65.field884;
                int var9 = -class499.field6555 + var6;
                int var10 = -class655.field9120 + var8;
                int var11 = -class549.field7132 + var7;
                int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
                class299.field3911 = 16383 & (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D);
                class358.field4639 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 16383;
                if (~class299.field3911 > -1025) {
                    class299.field3911 = 1024;
                }
                class470.field6146 = 0;
                if (~class299.field3911 < -3073) {
                    class299.field3911 = 3072;
                }
            }
            class704.field9810 = 2;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZIIILcn;)V")
    public static final void method580(boolean arg0, int arg1, int arg2, int arg3, class558 arg4) {
        ++field972;
        long var5 = (long) (arg3 << 14 | arg1 << 28 | arg2);
        class37 var7 = (class37) class197.field2589.method39(var5, 31750);
        if (var7 == null) {
            class37 var8 = new class37();
            class197.field2589.method38(var8, 28, var5);
            var8.field542.method2087(arg4, -122);
        } else {
            if (arg0) {
                field989 = null;
            }
            class696 var9 = class232.field3109.method1292(0, arg4.field7283);
            int var10 = var9.field9500;
            if (~var9.field9579 == -2) {
                var10 = (arg4.field7284 + 1) * var10;
            }
            for (class558 var11 = (class558) var7.field542.method2090(true); var11 != null; var11 = (class558) var7.field542.method2088(-152)) {
                class696 var12 = class232.field3109.method1292(0, var11.field7283);
                int var13 = var12.field9500;
                if (~var12.field9579 == -2) {
                    var13 = (var11.field7284 + 1) * var13;
                }
                if (var13 < var10) {
                    class481.method2657(0, var11, arg4);
                    return;
                }
            }
            var7.field542.method2087(arg4, -127);
        }
    }
}
