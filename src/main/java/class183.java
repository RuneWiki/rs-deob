import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class183 extends class242 {

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Z")
    public boolean field3166;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "[Lmc;")
    public class183[] field3180;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Ljf;")
    private static class229 field3156 = class212.method1457((byte) 108, "Allocating memory");

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Ljf;")
    public static class229 field3157 = class212.method1457((byte) 104, "jaune:");

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Z")
    public static boolean field3165 = false;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field3172 = -1;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Ljf;")
    public static class229 field3169 = field3156;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Ljf;")
    private static class229 field3171 = class212.method1457((byte) 80, "Created gameworld");

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Ljf;")
    public static class229 field3181 = field3171;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lni;")
    public static class24 field3159 = new class24(5);

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "Ljf;")
    public static class229 field3184 = class212.method1457((byte) 121, " ");

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Ljf;")
    public static class229 field3185 = class212.method1457((byte) 69, "gr-Un:");

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "B")
    public static byte field3183;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Lmg;")
    public class157 field3160;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Lea;")
    public static class205 field3162;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lq;")
    public class97 field3161;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1249(int arg0, int arg1) {
        if (arg1 <= -88) {
            field3155++;
            class122 var2 = class323.method2175(6, arg0, -25873);
            var2.method865(-80);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)[[I", line = 31)
    public final int[][] method1250(int arg0, int arg1, byte arg2) {
        field3167++;
        if (arg2 <= 47) {
            field3165 = false;
        }
        if (this.field3180[arg1].field3166) {
            int[] var4 = this.field3180[arg1].method10(arg0, -1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3180[arg1].method12(-127, arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V", line = 78)
    public final void method1251(int arg0, int arg1, int arg2) {
        if (arg0 != 5) {
            return;
        }
        field3158++;
        int var4 = this.field3170 == 255 ? arg1 : this.field3170;
        if (this.field3166) {
            this.field3161 = new class97(var4, arg1, arg2);
        } else {
            this.field3160 = new class157(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[[I", line = 117)
    public int[][] method12(int arg0, int arg1) {
        int var3 = 34 / ((arg0 - 18) / 61);
        field3173++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I", line = 127)
    public int method451(int arg0) {
        if (arg0 != -1) {
            field3185 = (class229) null;
        }
        field3176++;
        return -1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILkh;I)V", line = 141)
    public void method14(int arg0, class14 arg1, int arg2) {
        field3179++;
        if (arg0 >= -43) {
            field3162 = (class205) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)I", line = 153)
    public int method988(byte arg0) {
        int var2 = -88 / ((arg0 + 44) / 33);
        field3164++;
        return -1;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 165)
    public void method25(int arg0) {
        field3182++;
        if (arg0 != -8) {
            field3171 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 176)
    public void method454(int arg0) {
        if (this.field3166) {
            this.field3161.method667(-5228);
            this.field3161 = null;
        } else {
            this.field3160.method1056((byte) -73);
            this.field3160 = null;
        }
        int var2 = 48 / ((arg0 - 70) / 42);
        field3174++;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)[I", line = 200)
    public int[] method10(int arg0, int arg1) {
        if (arg1 == -1) {
            field3178++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 218)
    public static final void method1252(long[] arg0, int arg1, Object[] arg2) {
        field3175++;
        class118.method842(arg1, arg0, arg2, arg0.length - 1, 1);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IZ)V", line = 235)
    public class183(int arg0, boolean arg1) {
        this.field3166 = arg1;
        this.field3180 = new class183[arg0];
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)[I", line = 266)
    public final int[] method1253(int arg0, int arg1, int arg2) {
        field3177++;
        if (arg2 < 75) {
            this.method1253(-119, -67, 35);
        }
        return this.field3180[arg0].field3166 ? this.field3180[arg0].method10(arg1, -1) : this.field3180[arg0].method12(127, arg1)[0];
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V", line = 287)
    public static void method1254(byte arg0) {
        field3181 = null;
        field3156 = null;
        field3185 = null;
        field3171 = null;
        if (arg0 <= 123) {
            field3162 = (class205) null;
        }
        field3157 = null;
        field3169 = null;
        field3162 = null;
        field3184 = null;
        field3159 = null;
    }
}
