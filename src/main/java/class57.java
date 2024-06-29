import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class57 extends class327 {

    @OriginalMember(owner = "client!il", name = "h", descriptor = "[J")
    private long[] field909 = new long[10];

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    private int field920 = 256;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    private int field912 = 0;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    private int field916 = 1;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "J")
    private long field921 = class154.method1172((byte) 99);

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[Ljava/lang/String;")
    private static String[] field908 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!il", name = "r", descriptor = "J")
    public static long field919 = 0L;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Ljava/lang/String;")
    public static String field913 = "Loaded fonts";

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Ljava/lang/String;")
    public static String field917 = "Use";

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    private int field914;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 291)
    public class57() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field909[var1] = this.field921;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILt;IIII)V", line = 17)
    public static final void method428(int arg0, class254 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 > -41) {
            field913 = (String) null;
        }
        field910++;
        if (arg1.field3927 == -1 && arg1.field3926 == null) {
            return;
        }
        int var6 = 0;
        if (arg2 > arg1.field3939) {
            var6 += arg2 - arg1.field3939;
        } else if (arg2 < arg1.field3921) {
            var6 += arg1.field3921 - arg2;
        }
        if (arg1.field3936 < arg5) {
            var6 += arg5 - arg1.field3936;
        } else if (arg5 < arg1.field3929) {
            var6 += arg1.field3929 - arg5;
        }
        if (arg1.field3930 == 0 || arg1.field3930 < var6 - 64 || class14.field263 == 0 || arg1.field3919 != arg3) {
            if (arg1.field3925 != null) {
                class128.field2045.method358(arg1.field3925);
                arg1.field3925 = null;
            }
            if (arg1.field3935 != null) {
                class128.field2045.method358(arg1.field3935);
                arg1.field3935 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg1.field3930 - var6) * class14.field263 / arg1.field3930;
        if (arg1.field3925 != null) {
            arg1.field3925.method910(var7);
        } else if (arg1.field3927 >= 0) {
            class58 var8 = class58.method433(class285.field4372, arg1.field3927, 0);
            if (var8 != null) {
                class144 var9 = var8.method436().method1095(class19.field359);
                class119 var10 = class119.method896(var9, 100, var7);
                var10.method882(-1);
                class128.field2045.method354(var10);
                arg1.field3925 = var10;
            }
        }
        if (arg1.field3935 != null) {
            arg1.field3935.method910(var7);
            if (!arg1.field3935.method1700(0)) {
                arg1.field3935 = null;
            }
        } else if (arg1.field3926 != null && (arg1.field3932 -= arg0) <= 0) {
            int var11 = (int) ((double) arg1.field3926.length * Math.random());
            class58 var12 = class58.method433(class285.field4372, arg1.field3926[var11], 0);
            if (var12 != null) {
                class144 var13 = var12.method436().method1095(class19.field359);
                class119 var14 = class119.method896(var13, 100, var7);
                var14.method882(0);
                class128.field2045.method354(var14);
                arg1.field3932 = arg1.field3933 + (int) ((double) (arg1.field3928 - arg1.field3933) * Math.random());
                arg1.field3935 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 145)
    public static final String method429(int arg0, long arg1) {
        class14.field260.setTime(new Date(arg1));
        field915++;
        int var3 = class14.field260.get(7);
        int var4 = class14.field260.get(5);
        int var5 = class14.field260.get(2);
        int var6 = class14.field260.get(1);
        int var7 = class14.field260.get(11);
        int var8 = class14.field260.get(12);
        int var9 = class14.field260.get(13);
        if (arg0 != -2611) {
            method428(4, (class254) null, 26, -74, -77, -47);
        }
        return field908[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class233.field3697[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V", line = 171)
    public final void method430(boolean arg0) {
        field918++;
        if (arg0) {
            method429(-113, 31L);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field909[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)V", line = 190)
    public static void method431(boolean arg0) {
        if (!arg0) {
            field917 = (String) null;
        }
        field908 = null;
        field913 = null;
        field917 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)I", line = 207)
    public final int method432(int arg0, int arg1, int arg2) {
        if (arg1 < 98) {
            return -81;
        }
        field911++;
        int var4 = this.field920;
        int var5 = this.field916;
        this.field920 = 300;
        this.field916 = 1;
        this.field921 = class154.method1172((byte) 120);
        if (this.field909[this.field914] == 0L) {
            this.field916 = var5;
            this.field920 = var4;
        } else if (this.field909[this.field914] < this.field921) {
            this.field920 = (int) ((long) (arg0 * 2560) / (this.field921 - this.field909[this.field914]));
        }
        if (this.field920 < 25) {
            this.field920 = 25;
        }
        if (this.field920 > 256) {
            this.field920 = 256;
            this.field916 = (int) ((long) arg0 - (this.field921 - this.field909[this.field914]) / 10L);
        }
        if (this.field916 > arg0) {
            this.field916 = arg0;
        }
        this.field909[this.field914] = this.field921;
        this.field914 = (this.field914 + 1) % 10;
        if (this.field916 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field909[var6] != 0L) {
                    this.field909[var6] += (long) this.field916;
                }
            }
        }
        if (this.field916 < arg2) {
            this.field916 = arg2;
        }
        class279.method1991(107, (long) this.field916);
        int var7 = 0;
        while (this.field912 < 256) {
            var7++;
            this.field912 += this.field920;
        }
        this.field912 &= 0xFF;
        return var7;
    }
}
