import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class427 extends class82 {

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
    private int field5499 = 4096;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "Z")
    private boolean field5498 = true;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "Lrg;")
    public static class548 field5502 = new class548(37, 7);

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "(I)V", line = 4)
    public static void method2402(int arg0) {
        if (arg0 == -1350635487) {
            field5502 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 16)
    public static final String[] method2403(String[] arg0, byte arg1) {
        ++field5500;
        String[] var2 = new String[5];
        if (arg1 != -88) {
            method2402(27);
        }
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V", line = 45)
    public class427() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILos;)V", line = 54)
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field5498 = arg2.method2129(-93) == 1;
            }
        } else {
            this.field5499 = arg2.method2136(false);
        }
        ++field5496;
        int var5 = -3 / ((-69 - arg1) / 42);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)[[I", line = 94)
    public final int[][] method481(int arg0, int arg1) {
        ++field5501;
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (arg0 != 1000) {
            return null;
        } else {
            if (super.field992.field7962) {
                int[] var4 = this.method489(false, 0, arg1 + -1 & class466.field6523);
                int[] var5 = this.method489(false, 0, arg1);
                int[] var6 = this.method489(false, 0, class466.field6523 & arg1 + 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; class629.field9033 > var10; ++var10) {
                    int var11 = (var6[var10] - var4[var10]) * this.field5499;
                    int var12 = (var5[class129.field1590 & var10 + 1] + -var5[class129.field1590 & var10 - 1]) * this.field5499;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 - -var16) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = var11 / var17;
                        var19 = 16777216 / var17;
                        var20 = var12 / var17;
                    } else {
                        var20 = 0;
                        var18 = 0;
                        var19 = 0;
                    }
                    if (this.field5498) {
                        var20 = (var20 >> 1) + 2048;
                        var18 = 2048 - -(var18 >> 1);
                        var19 = (var19 >> 1) + 2048;
                    }
                    var7[var10] = var20;
                    var8[var10] = var18;
                    var9[var10] = var19;
                }
            }
            return var3;
        }
    }
}
