import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class52 extends class313 {

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    private int field813 = 4096;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    private int field810 = 0;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "[I")
    public static int[] field814 = new int[] { 0, 1, 12, 0, 0, 3, -1, 11, 0, 0, -1, 0, 0, 0, 0, -1, 0, 2, -2, 0, 3, 2, 0, -1, -1, 0, 0, 0, 5, 0, 4, 5, 0, 0, 0, 0, 3, 0, 12, 10, 0, 0, 0, 0, -2, 7, 0, 0, 0, 6, 0, 0, 0, 0, -2, 10, 0, 0, 0, 0, 0, -2, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, -2, 17, 12, 0, 0, 0, 4, 12, 0, 6, 0, 0, 0, 0, -1, 0, 8, 0, 8, 0, 6, 6, 0, 0, 10, 3, 0, 0, -1, 0, 8, 6, 8, 0, 0, 0, -2, 15, -1, 0, 0, 0, 0, 0, 0, 6, 0, -2, -2, 3, 5, 5, 8, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 14, 14, 0, 0, 0, 1, 10, 0, 2, 0, 0, 6, 0, 28, 0, 6, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 0, 2, 0, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 6, 0, 2, 0, 0, 0, 0, 7, 0, -1, 0, 0, -1, 7, 0, 3, 0, 0, 0, 0, 0, 0, -2, 1, 1, 0, 0, -1, 6, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 15, 7, 0, 0, 3, 0, 2, 8, 0, -1, 0, 6, 0, 0, 0, 0, 0, -2, 0, -2, 0, 4, 8, 4, 20, 0, 0, 0, 0, 0, 0, -1 };

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field818 = -1;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[I", line = 9)
    public final int[] method111(int arg0, int arg1) {
        if (arg0 != 4) {
            this.method111(-124, -123);
        }
        field816++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(0, true, arg1);
            for (int var5 = 0; var5 < class133.field2269; var5++) {
                int var6 = var4[var5];
                if (this.field810 > var6) {
                    var3[var5] = this.field810;
                } else if (this.field813 < var6) {
                    var3[var5] = this.field813;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)V", line = 51)
    public static final void method474(int arg0, byte arg1) {
        field819++;
        class230.field3836.method469(-11815, arg0);
        class213.field3582.method469(-11815, arg0);
        if (arg1 >= -66) {
            field811 = -17;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 153)
    public class52() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[[I", line = 73)
    public final int[][] method299(int arg0, int arg1) {
        field815++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 125);
        if (arg1 != 2) {
            method474(1, (byte) 124);
        }
        if (this.field4958.field5463) {
            int[][] var4 = this.method2161(0, arg1 + 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class133.field2269; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 < this.field810) {
                    var8[var11] = this.field810;
                } else if (this.field813 < var12) {
                    var8[var11] = this.field813;
                } else {
                    var8[var11] = var12;
                }
                if (var13 < this.field810) {
                    var9[var11] = this.field810;
                } else if (var13 > this.field813) {
                    var9[var11] = this.field813;
                } else {
                    var9[var11] = var13;
                }
                if (var14 < this.field810) {
                    var10[var11] = this.field810;
                } else if (var14 <= this.field813) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field813;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V", line = 158)
    public static final void method475(int arg0) {
        class242.field3947 = arg0;
        for (int var1 = 0; var1 < class123.field2134; var1++) {
            for (int var2 = 0; var2 < class185.field3144; var2++) {
                if (class279.field4430[arg0][var1][var2] == null) {
                    class279.field4430[arg0][var1][var2] = new class257(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILpi;)V", line = 181)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field817++;
        if (arg0 == 0) {
            this.field810 = arg2.method2339((byte) -46);
        } else if (arg0 == 1) {
            this.field813 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field4968 = arg2.method2364(-9069) == 1;
        }
        if (arg1 != -17848) {
            method475(77);
        }
    }

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)V", line = 226)
    public static void method476(int arg0) {
        field814 = null;
        if (arg0 != 8941) {
            field814 = (int[]) null;
        }
    }
}
