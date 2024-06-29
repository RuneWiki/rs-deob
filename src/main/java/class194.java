import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class194 extends class196 {

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    private int field3166;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    private int field3178;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "[F")
    public static float[] field3176 = new float[4];

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field3174 = 0;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Lpf;")
    public static class342 field3175 = new class342(5000);

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "Log;")
    public static class157 field3181 = null;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Lak;")
    public static class172 field3171;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)V", line = 8)
    public final void method1081(int arg0, int arg1, int arg2) {
        field3167++;
        int var4 = this.field3166 * arg1 >> 12;
        int var5 = this.field3180 * arg0 >> 12;
        int var6 = this.field3170 * arg0 >> 12;
        int var7 = this.field3178 * arg1 >> 12;
        class79.method540(var5, false, this.field3203, var4, var7, var6);
        if (arg2 != 31947) {
            method1434(74, 61);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V", line = 29)
    public static void method1431(boolean arg0) {
        field3176 = null;
        if (!arg0) {
            field3175 = null;
            field3181 = null;
            field3171 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJZIB)Ljava/lang/String;", line = 49)
    public static final String method1432(int arg0, long arg1, boolean arg2, int arg3, byte arg4) {
        int var6 = 81 / ((arg4 - 28) / 46);
        boolean var7 = false;
        char var8 = ',';
        field3177++;
        char var9 = '.';
        StringBuffer var10 = new StringBuffer(26);
        if (arg1 < 0L) {
            arg1 = -arg1;
            var7 = true;
        }
        if (arg0 == 0) {
            var9 = ',';
            var8 = '.';
        }
        if (arg0 == 2) {
            var9 = ' ';
        }
        if (arg3 > 0) {
            for (int var11 = 0; var11 < arg3; var11++) {
                int var12 = (int) arg1;
                arg1 /= 10L;
                var10.append((char) (var12 + 48 - ((int) arg1 * 10)));
            }
            var10.append(var8);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg1;
            arg1 /= 10L;
            var10.append((char) (var14 + 48 - ((int) arg1 * 10)));
            if (arg1 == 0L) {
                if (var7) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg2) {
                var13++;
                if ((var13 % 3) == 0) {
                    var10.append(var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V", line = 131)
    public static final void method1433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3179++;
        class344 var5 = class110.method759(10, arg4, false);
        var5.method2390((byte) -61);
        var5.field5349 = arg3;
        var5.field5344 = arg0;
        var5.field5354 = arg1;
        if (arg2 >= -102) {
            field3174 = 4;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V", line = 147)
    public final void method1080(int arg0, int arg1, int arg2) {
        if (arg1 != -6577) {
            method1433(-42, -84, 104, 67, -109);
        }
        field3173++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZ)V", line = 167)
    public final void method1083(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3174 = -74;
        }
        field3169++;
        int var4 = this.field3180 * arg1 >> 12;
        int var5 = this.field3178 * arg0 >> 12;
        int var6 = this.field3170 * arg1 >> 12;
        int var7 = this.field3166 * arg0 >> 12;
        class192.method1420(-122, var7, this.field3203, this.field3200, var6, var4, var5, this.field3196);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIII)V", line = 185)
    public class194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3166 = arg3;
        this.field3170 = arg2;
        this.field3178 = arg1;
        this.field3180 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V", line = 198)
    public static final void method1434(int arg0, int arg1) {
        field3172++;
        if (arg0 != -1) {
            method1432(-79, 102L, false, -16, (byte) -107);
        }
        class279.field4492.method708(arg1, true);
        class106.field1572.method708(arg1, true);
    }
}
