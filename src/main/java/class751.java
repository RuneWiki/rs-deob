import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class751 extends class601 {

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Luw;")
    public static class208 field10239 = new class208(132, 9);

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field10241 = 0;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field10240 = 1;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public static int field10234;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public static int field10235;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
    public static void method4069(int arg0) {
        field10239 = null;
        if (arg0 < 96) {
            field10239 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class751() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field10235;
        if (arg1 > -76) {
            this.method261(74, (byte) 51);
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            for (int var4 = 0; class418.field5518 > var4; ++var4) {
                this.method4070(arg0, var4, false);
                int[] var5 = this.method3243(class434.field5697, 27123, 0);
                var3[var4] = var5[class470.field6132];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[[I")
    public final int[][] method638(int arg0, int arg1) {
        ++field10234;
        if (arg0 != 2017) {
            field10240 = 126;
        }
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class418.field5518; ++var7) {
                this.method4070(arg1, var7, false);
                int[][] var8 = this.method3247((byte) -120, 0, class434.field5697);
                var4[var7] = var8[0][class470.field6132];
                var5[var7] = var8[1][class470.field6132];
                var6[var7] = var8[2][class470.field6132];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZ)V")
    private final void method4070(int arg0, int arg1, boolean arg2) {
        ++field10236;
        int var4 = class64.field839[arg1];
        if (!arg2) {
            int var5 = class427.field5623[arg0];
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class470.field6132 = arg1;
                class434.field5697 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class470.field6132 = arg0;
                class434.field5697 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class434.field5697 = arg1;
                class470.field6132 = class418.field5518 - arg0;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class434.field5697 = -arg0 + class418.field5514;
                class470.field6132 = arg1;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class434.field5697 = -arg0 + class418.field5514;
                class470.field6132 = class418.field5518 - arg1;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class434.field5697 = -arg1 + class418.field5514;
                class470.field6132 = -arg0 + class418.field5518;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class434.field5697 = -arg1 + class418.field5514;
                class470.field6132 = arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class434.field5697 = arg0;
                class470.field6132 = -arg1 + class418.field5518;
            }
            class434.field5697 &= class104.field1388;
            class470.field6132 &= class511.field6519;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field10237;
        int var4 = 94 / ((arg2 - 40) / 52);
        if (arg1 == 0) {
            super.field7646 = arg0.method1509(true) == 1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(III)Z")
    public static final boolean method4071(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            field10240 = -86;
        }
        ++field10238;
        return (458752 & arg1) != 0 | class307.method1811(arg0, arg1, arg2 ^ 90) || class19.method85(arg1, (byte) 112, arg0);
    }
}
