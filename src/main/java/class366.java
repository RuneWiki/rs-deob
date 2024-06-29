import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class366 {

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lau;")
    private class692 field5085;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field5078 = 0;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Z")
    public static boolean field5081 = true;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "F")
    public static float field5076;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Ltv;")
    private class435 field5082;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[[I")
    public static int[][] field5086;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Z", line = 3)
    public static final boolean method2194(byte arg0) {
        if (arg0 >= -17) {
            return false;
        } else {
            field5077++;
            return class400.field5784 > 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 14)
    public static void method2195(int arg0) {
        if (arg0 < -122) {
            field5086 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)Ltv;", line = 27)
    public final class435 method2196(int arg0) {
        field5080++;
        class435 var2 = this.field5085.field9799.field6259;
        if (arg0 != -1) {
            field5081 = false;
        }
        if (this.field5085.field9799 == var2) {
            this.field5082 = null;
            return null;
        } else {
            this.field5082 = var2.field6259;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lau;B)V", line = 56)
    public final void method2197(class692 arg0, byte arg1) {
        this.field5085 = arg0;
        if (arg1 < -15) {
            field5083++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II[F)[F", line = 70)
    public static final float[] method2198(int arg0, int arg1, float[] arg2) {
        field5087++;
        if (arg1 != -30895) {
            method2201(-4, 98, -102);
        }
        float[] var3 = new float[arg0];
        class553.method3240(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)Ltv;", line = 89)
    public final class435 method2199(byte arg0) {
        int var2 = -113 % ((arg0 + 23) / 44);
        field5089++;
        class435 var3 = this.field5082;
        if (this.field5085.field9799 == var3) {
            this.field5082 = null;
            return null;
        } else {
            this.field5082 = var3.field6259;
            return var3;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII[BII)Z", line = 108)
    public static final boolean method2200(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field5084++;
        int var7 = arg2 % arg6;
        int var8;
        if (arg1 == var7) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg6 + arg0 - 1) / arg6);
        int var10 = -((arg2 + arg6 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg3] == 0) {
                    return true;
                }
                arg3 += arg6;
            }
            int var13 = arg3 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg5 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V", line = 157)
    public static final void method2201(int arg0, int arg1, int arg2) {
        class293 var3 = class541.field7946[arg0][arg1][arg2];
        if (var3 != null) {
            class443.method2584(var3.field4084);
            if (var3.field4084 != null) {
                var3.field4084 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 167)
    public class366() {
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lau;)V", line = 170)
    public class366(class692 arg0) {
        this.field5085 = arg0;
    }
}
