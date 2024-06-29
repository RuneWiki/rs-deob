import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class576 extends class243 {

    @OriginalMember(owner = "client!fia", name = "F", descriptor = "Z")
    private boolean field8088 = true;

    @OriginalMember(owner = "client!fia", name = "H", descriptor = "Z")
    private boolean field8089 = true;

    @OriginalMember(owner = "client!fia", name = "J", descriptor = "Lkba;")
    public static class108 field8091 = new class108();

    @OriginalMember(owner = "client!fia", name = "E", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!fia", name = "I", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!fia", name = "L", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!fia", name = "K", descriptor = "[[S")
    public static short[][] field8092;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)V")
    public static void method3230(int arg0) {
        field8092 = null;
        int var1 = 62 % ((-2 - arg0) / 59);
        field8091 = null;
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field8090;
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (arg0 > -76) {
            return null;
        } else {
            if (super.field3156.field8335) {
                int[][] var4 = this.method1457(!this.field8089 ? arg1 : class625.field8744 - arg1, 24431, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field8088) {
                    for (int var11 = 0; var11 < class687.field9628; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; ~class687.field9628 < ~var12; ++var12) {
                        var8[var12] = var5[class28.field206 - var12];
                        var9[var12] = var6[-var12 + class28.field206];
                        var10[var12] = var7[-var12 + class28.field206];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field8093;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field3159 = arg1.method3428((byte) -107) == 1;
                }
            } else {
                this.field8089 = arg1.method3428((byte) -116) == 1;
            }
        } else {
            this.field8088 = arg1.method3428((byte) 43) == 1;
        }
        if (arg2 > -92) {
            this.method1(7, (class611) null, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "()V")
    public class576() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(II)[I")
    public final int[] method5(int arg0, int arg1) {
        if (arg0 != 255) {
            this.field8088 = true;
        }
        ++field8087;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (super.field3164.field9250) {
            int[] var4 = this.method1462(!this.field8089 ? arg1 : class625.field8744 - arg1, 0, arg0 ^ 255);
            if (this.field8088) {
                for (int var5 = 0; ~var5 > ~class687.field9628; ++var5) {
                    var3[var5] = var4[-var5 + class28.field206];
                }
            } else {
                class373.method2191(var4, 0, var3, 0, class687.field9628);
            }
        }
        return var3;
    }
}
