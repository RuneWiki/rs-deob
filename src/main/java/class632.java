import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class632 extends class349 {

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "I")
    public static int field8579 = -1;

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
    public static int field8585 = 0;

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "Ljj;")
    public static class398 field8580 = new class398(18, 2);

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "F")
    public static float field8583;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!ms", name = "H", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(III)V")
    private final void method3446(int arg0, int arg1, int arg2) {
        ++field8581;
        int var4 = class29.field283[arg1];
        int var5 = class54.field709[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (arg0 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class162.field2058 = arg1;
            class97.field1197 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class97.field1197 = arg1;
            class162.field2058 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class97.field1197 = arg1;
            class162.field2058 = -arg2 + class39.field497;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class97.field1197 = -arg2 + class442.field6080;
            class162.field2058 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class162.field2058 = -arg1 + class39.field497;
            class97.field1197 = -arg2 + class442.field6080;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class162.field2058 = -arg2 + class39.field497;
            class97.field1197 = -arg1 + class442.field6080;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class162.field2058 = arg2;
            class97.field1197 = -arg1 + class442.field6080;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class162.field2058 = -arg1 + class39.field497;
            class97.field1197 = arg2;
        }
        class162.field2058 &= class144.field1839;
        class97.field1197 &= class4.field38;
    }

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "(I)V")
    public static void method3447(int arg0) {
        if (arg0 == -1) {
            field8580 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        ++field8584;
        int[][] var3 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class39.field497; ++var7) {
                this.method3446(-2048, var7, arg0);
                int[][] var8 = this.method2180(0, 74, class97.field1197);
                var4[var7] = var8[0][class162.field2058];
                var5[var7] = var8[1][class162.field2058];
                var6[var7] = var8[2][class162.field2058];
            }
        }
        int var9 = -34 % ((-32 - arg1) / 47);
        return var3;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
    public class632() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        int var3 = -40 % ((56 - arg0) / 41);
        ++field8582;
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            for (int var5 = 0; var5 < class39.field497; ++var5) {
                this.method3446(-2048, var5, arg1);
                int[] var6 = this.method2181(0, -1090477337, class97.field1197);
                var4[var5] = var6[class162.field2058];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        ++field8578;
        if (arg1 == 0) {
            super.field5100 = ~arg2.method957((byte) -87) == -2;
        }
        if (arg0 != 4095) {
            this.method13((byte) 54, 52);
        }
    }
}
