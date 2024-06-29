import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class197 extends class152 {

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    private int field3368 = 4;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    private int field3379 = 4;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field3367 = 0;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field3371 = 0;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lce;")
    public static class126 field3373 = class206.method1445(-7923, ")4j");

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "Z")
    public static boolean field3376 = false;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field3372 = 0;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "Lml;")
    public static class160 field3369 = new class160(50);

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "[I")
    public static int[] field3378;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)[I", line = 5)
    public final int[] method6(boolean arg0, int arg1) {
        field3380++;
        if (!arg0) {
            field3376 = true;
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int var4 = class244.field4133 / this.field3368;
            int var5 = class143.field2599 / this.field3379;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1132(0, 42, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1132(class143.field2599 * var7 / var5, -119, 0);
            }
            for (int var8 = 0; var8 < class244.field4133; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class244.field4133 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V", line = 61)
    public static final void method1395(byte arg0) {
        if (arg0 != 127) {
            field3378 = (int[]) null;
        }
        class279.field4643 = null;
        class63.field1032 = null;
        class241.field4062 = null;
        class27.field386 = null;
        field3374++;
        class263.field4389 = null;
        class190.field3255 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V", line = 80)
    public static final void method1396(int arg0) {
        class95.field1496 = new class237(32);
        if (arg0 != 31362) {
            field3377 = -64;
        }
        field3366++;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)[[I", line = 101)
    public final int[][] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            field3377 = -40;
        }
        field3365++;
        int[][] var3 = this.field2775.method319(-120, arg1);
        if (this.field2775.field775) {
            int var4 = class244.field4133 / this.field3368;
            int var5 = class143.field2599 / this.field3379;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method1133(0, 0, true);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1133(class143.field2599 * var7 / var5, 0, true);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var3[0];
            int[] var11 = var6[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class244.field4133; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class244.field4133 * var16 / var4;
                }
                var10[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var11[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 217)
    public class197() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILbb;)V", line = 176)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field3370++;
        if (arg0 != 8) {
            return;
        }
        if (arg1 == 0) {
            this.field3368 = arg2.method948(-128);
        } else if (arg1 == 1) {
            this.field3379 = arg2.method948(arg0 ^ 0xFFFFFF8F);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)I", line = 230)
    public static final int method1397(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 65536 - class236.field3971[arg0 * 1024 / arg1] >> 1;
        if (arg2 != 734607760) {
            method1398((byte) -2);
        }
        field3375++;
        return ((65536 - var5) * arg3 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(B)V", line = 242)
    public static void method1398(byte arg0) {
        if (arg0 <= -40) {
            field3378 = null;
            field3373 = null;
            field3369 = null;
        }
    }
}
