import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class2 extends class328 {

    @OriginalMember(owner = "client!is", name = "F", descriptor = "[I")
    public static int[] field15 = new int[50];

    @OriginalMember(owner = "client!is", name = "E", descriptor = "Z")
    public static boolean field14 = false;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "[F")
    public static float[] field16 = new float[16];

    @OriginalMember(owner = "client!is", name = "K", descriptor = "Z")
    public static boolean field20;

    @OriginalMember(owner = "client!is", name = "J", descriptor = "Liu;")
    public static class517 field19;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!is", name = "D", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!is", name = "I", descriptor = "I")
    public static int field18;

    static {
        new class567((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field20 = false;
        field19 = new class517(57, 7);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V", line = 5)
    public class2() {
        super(1, false);
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(B)V", line = 9)
    public static void method6(byte arg0) {
        field19 = null;
        if (arg0 != -49) {
            field15 = null;
        }
        field16 = null;
        field15 = null;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(II)[[I", line = 21)
    public final int[][] method7(int arg0, int arg1) {
        int var3 = 12 / ((arg1 - 46) / 54);
        ++field12;
        int[][] var4 = super.field4725.method1886((byte) 93, arg0);
        if (super.field4725.field4371) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class449.field6539 > var8; ++var8) {
                this.method8(1, arg0, var8);
                int[][] var9 = this.method2040(0, class437.field6384, 0);
                var5[var8] = var9[0][class289.field4191];
                var6[var8] = var9[1][class289.field4191];
                var7[var8] = var9[2][class289.field4191];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(III)V", line = 61)
    private final void method8(int arg0, int arg1, int arg2) {
        ++field17;
        int var4 = class206.field2924[arg2];
        int var5 = class638.field9258[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if (arg0 == 1) {
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class289.field4191 = arg2;
                class437.field6384 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class289.field4191 = arg1;
                class437.field6384 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class289.field4191 = -arg1 + class449.field6539;
                class437.field6384 = arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class289.field4191 = arg2;
                class437.field6384 = -arg1 + class527.field7334;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class437.field6384 = -arg1 + class527.field7334;
                class289.field4191 = class449.field6539 - arg2;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class289.field4191 = -arg1 + class449.field6539;
                class437.field6384 = -arg2 + class527.field7334;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class437.field6384 = -arg2 + class527.field7334;
                class289.field4191 = arg1;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class289.field4191 = -arg2 + class449.field6539;
                class437.field6384 = arg1;
            }
            class289.field4191 &= class108.field1799;
            class437.field6384 &= class589.field8379;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BILco;)V", line = 134)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field18;
        if (arg1 == 0) {
            super.field4728 = arg2.method1738(255) == 1;
        }
        if (arg0 <= 75) {
            field15 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZLgp;IZII)V", line = 154)
    public static final void method9(int arg0, boolean arg1, class561 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class66.field1086 = arg6;
        class617.field8732 = arg0;
        class444.field6479 = arg5;
        class376.field5531 = 1;
        if (arg4) {
            ++field11;
            class161.field2392 = arg1;
            class69.field1309 = arg2;
            class442.field6468 = class193.field2780.method177(16) / arg3;
            if (~class442.field6468 > -2) {
                class442.field6468 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)[I", line = 183)
    public final int[] method4(int arg0, int arg1) {
        int var3 = 54 / ((arg1 - 48) / 56);
        ++field13;
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            for (int var5 = 0; var5 < class449.field6539; ++var5) {
                this.method8(1, arg0, var5);
                int[] var6 = this.method2042(0, class437.field6384, (byte) 119);
                var4[var5] = var6[class289.field4191];
            }
        }
        return var4;
    }
}
