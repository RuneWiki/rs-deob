import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class282 extends class86 {

    @OriginalMember(owner = "client!id", name = "K", descriptor = "[I")
    public static int[] field4356 = new int[100];

    @OriginalMember(owner = "client!id", name = "N", descriptor = "S")
    public static short field4359 = 32767;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field4366 = -1;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(II)V", line = 4)
    public static final void method2053(int arg0, int arg1) {
        class340.field5226.method649((byte) 75, arg0);
        if (arg1 != 0) {
            field4366 = 9;
        }
        field4362++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lrn;ZLrn;)V", line = 17)
    public static final void method2054(class18 arg0, boolean arg1, class18 arg2) {
        class128.field2124 = arg2;
        class131.field2223 = arg0;
        field4357++;
        class253.field3904 = class128.field2124.method197((byte) -75, 3);
        if (arg1) {
            method2054((class18) null, true, (class18) null);
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 29)
    public class282() {
        super(3, false);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lrn;B)V", line = 34)
    public static final void method2055(class18 arg0, byte arg1) {
        int var2 = -120 % ((-arg1 - 55) / 53);
        field4360++;
        class105.field1582 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZLug;)V", line = 57)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (!arg1) {
            field4358++;
            if (arg0 == 0) {
                this.field1228 = arg2.method281(81) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILrn;I)Z", line = 76)
    public static final boolean method2056(int arg0, int arg1, class18 arg2, int arg3) {
        if (arg1 != 0) {
            return true;
        }
        field4363++;
        byte[] var4 = arg2.method187(arg3, arg0, -1);
        if (var4 == null) {
            return false;
        } else {
            class146.method1218(var4, -1835684146);
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)[[I", line = 92)
    public final int[][] method156(int arg0, byte arg1) {
        if (arg1 > -126) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int[] var4 = this.method774(0, arg0, 2);
            int[][] var5 = this.method782(arg0, 0, 1);
            int[][] var6 = this.method782(arg0, 1, 1);
            int[] var7 = var5[0];
            int[] var8 = var3[2];
            int[] var9 = var5[2];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var5[1];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class93.field1424; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var10[var16] = var7[var16];
                    var11[var16] = var12[var16];
                    var8[var16] = var9[var16];
                } else if (var17 == 0) {
                    var10[var16] = var13[var16];
                    var11[var16] = var14[var16];
                    var8[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var10[var16] = var7[var16] * var17 + (var13[var16] * var18) >> 12;
                    var11[var16] = var12[var16] * var17 + (var14[var16] * var18) >> 12;
                    var8[var16] = var9[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        field4365++;
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I", line = 171)
    public final int[] method158(int arg0, int arg1) {
        field4364++;
        if (arg1 < 7) {
            field4366 = 22;
        }
        int[] var3 = this.field1225.method1914(arg0, 57);
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, arg0, 0);
            int[] var5 = this.method774(0, arg0, 1);
            int[] var6 = this.method774(0, arg0, 2);
            for (int var7 = 0; var7 < class93.field1424; var7++) {
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
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V", line = 223)
    public static void method2057(int arg0) {
        if (arg0 > -68) {
            method2056(-115, -51, (class18) null, -125);
        }
        field4356 = null;
    }
}
