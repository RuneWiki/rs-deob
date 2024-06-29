import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class38 extends class512 {

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "Lec;")
    public static class68 field570 = null;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "Ljava/awt/Image;")
    public static Image field566;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method75(int arg0, byte arg1) {
        ++field569;
        int var3 = -22 / ((arg1 - 43) / 48);
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            for (int var5 = 0; var5 < class402.field6113; ++var5) {
                this.method277(var5, -2048, arg0);
                int[] var6 = this.method3013(false, 0, class182.field2878);
                var4[var5] = var6[class343.field5358];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(III)V", line = 38)
    private final void method277(int arg0, int arg1, int arg2) {
        ++field571;
        int var4 = class276.field4540[arg0];
        int var5 = class412.field6233[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (arg1 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class343.field5358 = arg0;
            class182.field2878 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class343.field5358 = arg2;
            class182.field2878 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class343.field5358 = -arg2 + class402.field6113;
            class182.field2878 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class182.field2878 = -arg2 + class227.field3953;
            class343.field5358 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class343.field5358 = -arg0 + class402.field6113;
            class182.field2878 = -arg2 + class227.field3953;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class182.field2878 = -arg0 + class227.field3953;
            class343.field5358 = -arg2 + class402.field6113;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class343.field5358 = arg2;
            class182.field2878 = -arg0 + class227.field3953;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class182.field2878 = arg2;
            class343.field5358 = class402.field6113 - arg0;
        }
        class343.field5358 &= class269.field4478;
        class182.field2878 &= class270.field4492;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)[[I", line = 112)
    public final int[][] method278(int arg0, int arg1) {
        ++field568;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class402.field6113; ++var7) {
                this.method277(var7, -2048, arg1);
                int[][] var8 = this.method3012(class182.field2878, 115, 0);
                var4[var7] = var8[0][class343.field5358];
                var5[var7] = var8[1][class343.field5358];
                var6[var7] = var8[2][class343.field5358];
            }
        }
        int var9 = -91 / ((-40 - arg0) / 47);
        return var3;
    }

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "(I)V", line = 157)
    public static void method279(int arg0) {
        field570 = null;
        field566 = null;
        if (arg0 != 15254) {
            field567 = 72;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V", line = 168)
    public class38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZILia;)V", line = 174)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (!arg0) {
            this.method278(-59, -17);
        }
        ++field565;
        if (~arg1 == -1) {
            super.field7491 = ~arg2.method126((byte) -123) == -2;
        }
    }
}
