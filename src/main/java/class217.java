import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public abstract class class217 extends class766 {

    @OriginalMember(owner = "client!mfa", name = "r", descriptor = "F")
    public float field3161;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!mfa", name = "C", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
    private int field3171;

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!mfa", name = "x", descriptor = "I")
    private int field3167;

    @OriginalMember(owner = "client!mfa", name = "y", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!mfa", name = "u", descriptor = "[Z")
    public static boolean[] field3164 = new boolean[100];

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!mfa", name = "q", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!mfa", name = "s", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!mfa", name = "t", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!mfa", name = "v", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!mfa", name = "w", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!mfa", name = "A", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!mfa", name = "D", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!mfa", name = "E", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)V", line = 3)
    public static void method1487(byte arg0) {
        field3164 = null;
        int var1 = -98 % ((-arg0 - 77) / 47);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)F", line = 14)
    public final float method1488(boolean arg0) {
        if (arg0) {
            return 0.24164245F;
        } else {
            field3160++;
            return this.field3161;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)I", line = 25)
    public final int method1489(byte arg0) {
        if (arg0 > -100) {
            method1492(null, false);
        }
        field3166++;
        return this.field3171;
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)I", line = 39)
    public final int method1490(byte arg0) {
        field3165++;
        if (arg0 != -126) {
            this.field3161 = 2.1295023F;
        }
        return this.field3172;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)I", line = 50)
    public final int method1491(int arg0) {
        field3170++;
        return arg0 == 0 ? this.field3167 : 51;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lha;Z)V", line = 64)
    public static final void method1492(class475 arg0, boolean arg1) {
        if (class383.field5382) {
            class182.method1322(arg0, (byte) -118);
        } else {
            class598.method3486(99, arg0);
        }
        field3173++;
        if (arg1) {
            method1493(100, (byte) -67, null);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IBLol;)Ljava/lang/String;", line = 79)
    public static final String method1493(int arg0, byte arg1, class431 arg2) {
        int var3 = 27 % ((arg1 + 53) / 56);
        field3163++;
        try {
            int var4 = arg2.method2527((byte) -24);
            if (var4 > arg0) {
                var4 = arg0;
            }
            byte[] var5 = new byte[var4];
            arg2.field5983 += class528.field7367.method3964(arg2.field6002, 0, (byte) -95, var4, var5, arg2.field5983);
            return class142.method1144(var5, var4, (byte) -53, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Z)I", line = 112)
    public final int method1494(boolean arg0) {
        field3158++;
        if (arg0) {
            this.field3167 = -31;
        }
        return this.field3157;
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(Z)I", line = 129)
    public final int method1495(boolean arg0) {
        if (arg0) {
            method1496(-35);
        }
        field3169++;
        return this.field3159;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)I", line = 143)
    public static final int method1496(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class402.field5541 - 1; var2++) {
            if (arg0 < class456.field6222[var2] + class134.field2239[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class402.field5541 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "(I)V", line = 165)
    public static final void method1497(int arg0) {
        class698.field9802.method2881((byte) -66);
        if (arg0 != 100) {
            method1497(-57);
        }
        field3174++;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IIIIIF)V", line = 178)
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field3161 = arg5;
        this.field3157 = arg1;
        this.field3172 = arg2;
        this.field3171 = arg4;
        this.field3159 = arg0;
        this.field3167 = arg3;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIII)V")
    public abstract void method1198(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IF)V")
    public abstract void method1195(int arg0, float arg1);
}
