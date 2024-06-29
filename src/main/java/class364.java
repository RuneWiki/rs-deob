import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class364 extends class297 {

    @OriginalMember(owner = "client!uia", name = "I", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!uia", name = "K", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!uia", name = "L", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!uia", name = "M", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!uia", name = "J", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5213;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        if (arg1 != -1564599039) {
            return null;
        } else {
            ++field5212;
            int[][] var3 = super.field4166.method2180(-90, arg0);
            if (super.field4166.field4849) {
                int[] var4 = this.method1951(arg0, arg1 + -2096661920, 2);
                int[][] var5 = this.method1948((byte) -74, arg0, 0);
                int[][] var6 = this.method1948((byte) -58, arg0, 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class525.field7275 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (var17 != 4096) {
                        if (~var17 != -1) {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                            var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                        } else {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field5215;
            int[] var3 = super.field4165.method127(0, arg0);
            if (super.field4165.field266) {
                int[] var4 = this.method1951(arg0, arg1 ^ 633706398, 0);
                int[] var5 = this.method1951(arg0, 633706337, 1);
                int[] var6 = this.method1951(arg0, arg1 + 633706082, 2);
                for (int var7 = 0; class525.field7275 > var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (~var8 == -1) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(B)V")
    public static void method2322(byte arg0) {
        field5213 = null;
        if (arg0 <= 21) {
            field5213 = null;
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "()V")
    public class364() {
        super(3, false);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field5214;
        if (arg2 != 31015) {
            field5216 = -16;
        }
        if (arg1 == 0) {
            super.field4178 = arg0.method1535(255) == 1;
        }
    }
}
