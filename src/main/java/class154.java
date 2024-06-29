import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public abstract class class154 extends class577 {

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "F")
    public float field2174;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public int field2175;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    private int field2182;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    private int field2190;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "Lvea;")
    public static class288 field2178 = new class288(1);

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "[F")
    public static float[] field2187 = new float[4];

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "[I")
    public static int[] field2185 = new int[1000];

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public static int field2189 = 0;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)I")
    public final int method1051(byte arg0) {
        int var2 = -28 / ((-arg0 - 32) / 55);
        field2192++;
        return this.field2190;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)I")
    public final int method1052(boolean arg0) {
        field2183++;
        return arg0 ? 122 : this.field2182;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIB)V")
    public abstract void method1053(int arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILha;I)V")
    public static final void method1054(int arg0, int arg1, class65 arg2, int arg3) {
        field2193++;
        class601.field8423 = new class114[arg1][arg3];
        class274.field3951 = arg2;
        if (arg0 != 0) {
            field2189 = -67;
        }
        if (class511.field7230 != null) {
            class528.field7541 = class678.method3846(class511.field7230[2], class511.field7230[0], class511.field7230[1], class511.field7230[5], class511.field7230[4], class511.field7230[3], 1);
        }
        class758.field10462 = new class114();
        class607.method3524(arg0 - 109);
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)I")
    public final int method1055(byte arg0) {
        field2180++;
        if (arg0 != -71) {
            field2178 = null;
        }
        return this.field2175;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)Z")
    public static final boolean method1056(int arg0, int arg1, int arg2) {
        field2184++;
        if (arg0 >= -66) {
            field2188 = 39;
        }
        return (arg1 & 0x40000) != 0 | class316.method2025(256, arg2, arg1) || class26.method240(10420, arg2, arg1);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)F")
    public final float method1057(boolean arg0) {
        field2186++;
        if (arg0) {
            method1060(85, -20);
        }
        return this.field2174;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
    public final int method1058(int arg0) {
        if (arg0 < 62) {
            return -124;
        } else {
            field2177++;
            return this.field2191;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
    public final int method1059(int arg0) {
        field2179++;
        if (arg0 != -6131) {
            field2189 = 124;
        }
        return this.field2181;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)I")
    public static final int method1060(int arg0, int arg1) {
        field2176++;
        if (arg1 <= 10) {
            field2187 = null;
        }
        byte var2;
        if (arg0 > 12000) {
            var2 = 4;
            class563.method3322((byte) 40);
        } else if (arg0 > 5000) {
            var2 = 3;
            class424.method2567(0);
        } else if (arg0 <= 2000) {
            class142.method1016(124, true);
            var2 = 1;
        } else {
            var2 = 2;
            class474.method2821(101);
        }
        if (class21.field353.field10098.method1588(-20) != 2) {
            class21.field353.method4080(true, class21.field353.field10076, 2);
            class9.method61(2, false, (byte) -40);
        }
        class580.method3397((byte) 13);
        return var2;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(FI)V")
    public abstract void method1061(float arg0, int arg1);

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIIF)V")
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field2174 = arg5;
        this.field2175 = arg1;
        this.field2182 = arg4;
        this.field2181 = arg0;
        this.field2190 = arg3;
        this.field2191 = arg2;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public static void method1062(int arg0) {
        if (arg0 <= 27) {
            field2178 = null;
        }
        field2185 = null;
        field2187 = null;
        field2178 = null;
    }
}
