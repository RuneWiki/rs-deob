import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class191 extends class310 {

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3055 = "wave:";

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3057 = "yellow:";

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Lth;")
    public static class57 field3058;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "Lth;")
    public static class57 field3060;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "[I")
    public static int[] field3056;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)[[I", line = 6)
    public final int[][] method391(int arg0, boolean arg1) {
        field3054++;
        if (!arg1) {
            field3060 = (class57) null;
        }
        int[][] var3 = this.field4942.method10((byte) -113, arg0);
        if (this.field4942.field30) {
            int[] var4 = this.method2200(2, arg0, (byte) 74);
            int[][] var5 = this.method2199(21101, arg0, 0);
            int[][] var6 = this.method2199(21101, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var5[2];
            for (int var16 = 0; var16 < class261.field4405; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var9[var16] = var11[var16];
                    var8[var16] = var15[var16];
                } else if (var17 == 0) {
                    var7[var16] = var12[var16];
                    var9[var16] = var13[var16];
                    var8[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var12[var16] * var18 >> 12;
                    var9[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var14[var16] * var18 + var15[var16] * var17 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lqm;II)V", line = 87)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field3059++;
        if (arg1 != -2470) {
            this.method391(25, true);
        }
        if (arg2 == 0) {
            this.field4940 = arg0.method1720((byte) -92) == 1;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I", line = 104)
    public final int[] method77(int arg0, int arg1) {
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            int[] var4 = this.method2200(0, arg0, (byte) 74);
            int[] var5 = this.method2200(1, arg0, (byte) 74);
            int[] var6 = this.method2200(2, arg0, (byte) 74);
            for (int var7 = 0; var7 < class261.field4405; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        if (arg1 != -13093) {
            this.method75((class227) null, 98, 115);
        }
        field3053++;
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(B)V", line = 156)
    public static void method1497(byte arg0) {
        if (arg0 != -64) {
            method1497((byte) 100);
        }
        field3058 = null;
        field3057 = null;
        field3060 = null;
        field3056 = null;
        field3055 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 178)
    public class191() {
        super(3, false);
    }
}
