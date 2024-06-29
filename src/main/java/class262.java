import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class262 extends class27 {

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    private int field4163;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    private int field4156;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    private int field4162;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    private int field4159;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    private int field4164;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    private int field4154;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    private int field4148;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "[J")
    public static long[] field4152 = new long[256];

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "Lqh;")
    public static class201 field4166;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Ld;")
    public static class238 field4157;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "Ljb;")
    public static class269 field4165;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(JIII)Z")
    public static final boolean method1784(long arg0, int arg1, int arg2, int arg3) {
        int var5 = (514316 & (int) arg0) >> 14;
        int var6 = (3319081 & (int) arg0) >> 20;
        ++field4167;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (~var5 != -11 && var5 != 11 && ~var5 != -23) {
            class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], 0, arg1, 0, 2, var6, 11027, var5 + 1, 0, true, arg3);
        } else {
            class135 var8 = class209.method1447(var7, -6653);
            int var9;
            int var10;
            if (~var6 != -1 && ~var6 != -3) {
                var9 = var8.field2175;
                var10 = var8.field2225;
            } else {
                var10 = var8.field2175;
                var9 = var8.field2225;
            }
            int var11 = var8.field2161;
            if (var6 != 0) {
                var11 = (15 & var11 << var6) - -(var11 >> -var6 + 4);
            }
            class85.method621(class167.field2655.field3340[0], class167.field2655.field3321[0], var9, arg1, var10, 2, 0, 11027, 0, var11, true, arg3);
        }
        class184.field2903 = class235.field3829;
        class41.field771 = class248.field3953;
        class39.field732 = 0;
        class252.field4019 = 2;
        return arg2 == 2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBI)V")
    public final void method234(int arg0, byte arg1, int arg2) {
        if (arg1 >= -74) {
            this.field4156 = -23;
        }
        ++field4150;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4151 = arg7;
        this.field4163 = arg5;
        this.field4156 = arg3;
        this.field4162 = arg4;
        this.field4159 = arg2;
        this.field4164 = arg1;
        this.field4154 = arg0;
        this.field4148 = arg6;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(IBI)V")
    public final void method238(int arg0, byte arg1, int arg2) {
        ++field4155;
        int var4 = -49 / ((arg1 - -2) / 58);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lf;II)I")
    public static final int method1785(class36 arg0, int arg1, int arg2) {
        ++field4158;
        if (!client.method1093(arg0).method605(true, arg1) && arg0.field672 == null) {
            return -1;
        } else if (arg2 != -20959) {
            return -64;
        } else {
            return arg0.field551 != null && ~arg1 > ~arg0.field551.length ? arg0.field551[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)V")
    public final void method236(int arg0, int arg1, byte arg2) {
        ++field4161;
        int var4 = this.field4164 * arg1 >> 12;
        int var5 = this.field4159 * arg0 >> 12;
        int var6 = this.field4154 * arg0 >> 12;
        int var7 = 104 / ((arg2 - 33) / 54);
        int var8 = this.field4162 * arg0 >> 12;
        int var9 = this.field4156 * arg1 >> 12;
        int var10 = this.field4163 * arg1 >> 12;
        int var11 = this.field4148 * arg0 >> 12;
        int var12 = this.field4151 * arg1 >> 12;
        class154.method1073(super.field423, var8, var4, 6192, var9, var6, var10, var5, var12, var11);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public static void method1786(int arg0) {
        if (arg0 != 0) {
            field4157 = null;
        }
        field4165 = null;
        field4166 = null;
        field4157 = null;
        field4152 = null;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if ((1L & var1) == 1L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field4152[var0] = var1;
        }
    }
}
