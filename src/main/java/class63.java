import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class63 extends class270 {

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
    private int field958 = 0;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    private int field960 = 4096;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "[I")
    public static int[] field955 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "Lmh;")
    private static class62 field961 = class201.method1405(true, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field962 = 2;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "Lmh;")
    public static class62 field954 = field961;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "[I")
    public static int[] field953;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[I", line = 12)
    public final int[] method6(int arg0, int arg1) {
        field959++;
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(0, 0, arg1);
            for (int var5 = 0; var5 < class109.field1770; var5++) {
                int var6 = var4[var5];
                if (this.field958 > var6) {
                    var3[var5] = this.field958;
                } else if (var6 > this.field960) {
                    var3[var5] = this.field960;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg0 != 18693) {
            this.field958 = 109;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 54)
    public class63() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 59)
    public static void method459(int arg0) {
        if (arg0 != 0) {
            field962 = -38;
        }
        field954 = null;
        field961 = null;
        field955 = null;
        field953 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lmi;II)V", line = 98)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field956++;
        if (arg1 == 0) {
            this.field958 = arg0.method721(106);
        } else if (arg1 == 1) {
            this.field960 = arg0.method721(28);
        } else if (arg1 == 2) {
            this.field4588 = arg0.method702(-1) == 1;
        }
        int var5 = -31 % ((arg2 + 8) / 53);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)[[I", line = 155)
    public final int[][] method11(boolean arg0, int arg1) {
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[][] var4 = this.method1855(false, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class109.field1770; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (this.field958 > var12) {
                    var8[var11] = this.field958;
                } else if (var12 > this.field960) {
                    var8[var11] = this.field960;
                } else {
                    var8[var11] = var12;
                }
                if (var13 < this.field958) {
                    var9[var11] = this.field958;
                } else if (this.field960 >= var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field960;
                }
                if (var14 < this.field958) {
                    var10[var11] = this.field958;
                } else if (this.field960 < var14) {
                    var10[var11] = this.field960;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        field957++;
        if (arg0) {
            field955 = (int[]) null;
        }
        return var3;
    }
}
