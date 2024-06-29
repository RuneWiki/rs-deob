import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class606 extends class601 {

    @OriginalMember(owner = "client!kaa", name = "F", descriptor = "I")
    private int field7676 = 4096;

    @OriginalMember(owner = "client!kaa", name = "H", descriptor = "Z")
    private boolean field7678 = true;

    @OriginalMember(owner = "client!kaa", name = "I", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!kaa", name = "J", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!kaa", name = "K", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!kaa", name = "L", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!kaa", name = "M", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!kaa", name = "G", descriptor = "Lrca;")
    public static class389 field7677;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "(I)V")
    public static void method3256(int arg0) {
        field7677 = null;
        if (arg0 != -14695) {
            method3256(111);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "()V")
    public class606() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field7683;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field7678 = ~arg0.method1509(true) == -2;
            }
        } else {
            this.field7676 = arg0.method1553((byte) 21);
        }
        int var5 = -117 / ((40 - arg2) / 52);
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(II)[[I")
    public final int[][] method638(int arg0, int arg1) {
        if (arg0 != 2017) {
            this.field7676 = 124;
        }
        ++field7680;
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[] var4 = this.method3243(arg1 + -1 & class104.field1388, 27123, 0);
            int[] var5 = this.method3243(arg1, 27123, 0);
            int[] var6 = this.method3243(arg1 + 1 & class104.field1388, 27123, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class418.field5518 > var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field7676;
                int var12 = (var5[class511.field6519 & var10 + 1] + -var5[class511.field6519 & var10 - 1]) * this.field7676;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - -4096 + var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field7678) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = 2048 - -(var18 >> 1);
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3257(int arg0, int arg1, byte arg2) {
        ++field7679;
        if (arg2 >= -36) {
            field7682 = 2;
        }
        return (384 & arg0) != 0;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(CI)Z")
    public static final boolean method3258(char arg0, int arg1) {
        ++field7681;
        if (arg1 != -123) {
            method3256(-35);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && ~arg0 >= -123;
    }
}
