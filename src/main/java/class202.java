import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class202 extends class17 {

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "Z")
    private boolean field3649 = true;

    @OriginalMember(owner = "client!fh", name = "kb", descriptor = "Z")
    private boolean field3655 = true;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "Lsf;")
    public static class108 field3653 = class140.method973(255, "T");

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "Lsf;")
    public static class108 field3651 = class140.method973(255, "niveau ");

    @OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
    public static int field3654 = 1;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "[I")
    public static int[] field3648;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "[[[B")
    public static byte[][][] field3650;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)[I", line = 8)
    public final int[] method120(int arg0, int arg1) {
        field3645++;
        if (arg0 > -95) {
            this.method122(true, -104);
        }
        int[] var3 = this.field217.method1698(125, arg1);
        if (this.field217.field4295) {
            int[] var4 = this.method124(80, 0, this.field3655 ? class219.field3899 - arg1 : arg1);
            if (this.field3649) {
                for (int var5 = 0; var5 < class116.field2008; var5++) {
                    var3[var5] = var4[class249.field4327 - var5];
                }
            } else {
                class23.method159(var4, 0, var3, 0, class116.field2008);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V", line = 52)
    public static void method1425(byte arg0) {
        field3648 = null;
        field3651 = null;
        field3653 = null;
        if (arg0 < 78) {
            field3650 = (byte[][][]) ((byte[][][]) null);
        }
        field3650 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)[[I", line = 71)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            field3651 = (class108) null;
        }
        int[][] var3 = this.field224.method2081(arg1, -111);
        field3646++;
        if (this.field224.field5106) {
            int[][] var4 = this.method111(3, this.field3655 ? class219.field3899 - arg1 : arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field3649) {
                for (int var12 = 0; var12 < class116.field2008; var12++) {
                    var7[var12] = var5[class249.field4327 - var12];
                    var9[var12] = var8[class249.field4327 - var12];
                    var10[var12] = var6[class249.field4327 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class116.field2008; var11++) {
                    var7[var11] = var5[var11];
                    var9[var11] = var8[var11];
                    var10[var11] = var6[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLrm;I)V", line = 137)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field3647++;
        if (arg2 == 0) {
            this.field3649 = arg1.method1731(true) == 1;
        } else if (arg2 == 1) {
            this.field3655 = arg1.method1731(true) == 1;
        } else if (arg2 == 2) {
            this.field225 = arg1.method1731(true) == 1;
        }
        if (arg0 != -114) {
            this.method122(true, 18);
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 191)
    public class202() {
        super(1, false);
    }
}
