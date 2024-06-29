import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class109 extends class227 {

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "Ljc;")
    public static class305 field1461 = new class305("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "[I")
    public static int[] field1467 = new int[4096];

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "[S")
    public static short[] field1463;

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
    public class109() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        ++field1466;
        int[][] var3 = super.field3059.method28((byte) -100, arg0);
        if (super.field3059.field57) {
            int[] var4 = this.method1459(arg0, 109, 2);
            int[][] var5 = this.method1460(arg0, 0, 0);
            int[][] var6 = this.method1460(arg0, 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class446.field6486; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                }
            }
        }
        if (!arg1) {
            field1467 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field1464;
        if (~arg2 == -1) {
            super.field3066 = arg0.method2388((byte) -111) == 1;
        }
        if (arg1 != 487215116) {
            field1467 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public static void method673(byte arg0) {
        field1463 = null;
        field1461 = null;
        field1467 = null;
        if (arg0 <= 107) {
            method674(40, 88, true);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field1462;
        int[] var3 = super.field3068.method1970(arg1, (byte) 117);
        if (arg0 != 15811) {
            this.method112(-120, false);
        }
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(arg1, -109, 0);
            int[] var5 = this.method1459(arg1, 114, 1);
            int[] var6 = this.method1459(arg1, arg0 + -15856, 2);
            for (int var7 = 0; class446.field6486 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZ)V")
    public static final void method674(int arg0, int arg1, boolean arg2) {
        ++field1460;
        class47.field493 = arg1;
        class48.field505 = 3;
        class89.method494((byte) -25, class422.field6149.field3559, class422.field6149.field3564);
        if (arg0 < 61) {
            method674(85, -23, false);
        }
        if (arg2) {
            class481.method2942(-3, "", "");
        } else {
            class442.method2714(true);
            class481.method2942(-3, class524.field7707, class289.field3809);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field1467[var0] = class13.method82(40960, var0);
        }
    }
}
