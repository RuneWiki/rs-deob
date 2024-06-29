import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class525 extends class297 {

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
    private int field7269 = 32768;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "[I")
    public static int[] field7271;

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "[[[B")
    public static byte[][][] field7270;

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
    public class525() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field7273;
        int[] var3 = super.field4165.method127(0, arg0);
        if (arg1 != 255) {
            this.method17((class215) null, -123, 82);
        }
        if (super.field4165.field266) {
            int[] var4 = this.method1951(arg0, arg1 + 633706082, 1);
            int[] var5 = this.method1951(arg0, arg1 ^ 633706398, 2);
            for (int var6 = 0; ~field7275 < ~var6; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field7269 >> 12;
                int var9 = class551.field7593[var7] * var8 >> 12;
                int var10 = class309.field4295[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class677.field9204;
                int var12 = arg0 - -(var10 >> 12) & class319.field4394;
                int[] var13 = this.method1951(var12, 633706337, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(Z)V")
    public static void method3040(boolean arg0) {
        if (!arg0) {
            field7270 = null;
        }
        field7271 = null;
        field7270 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field4178 = ~arg0.method1535(255) == -2;
            }
        } else {
            this.field7269 = arg0.method1478(842397944) << 4;
        }
        if (arg2 != 31015) {
            method3040(false);
        }
        ++field7274;
    }

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "(I)V")
    public final void method711(int arg0) {
        class45.method545(26188);
        ++field7272;
        if (arg0 < 108) {
            field7275 = 126;
        }
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        ++field7267;
        int[][] var3 = super.field4166.method2180(arg1 ^ 1564598916, arg0);
        if (arg1 != -1564599039) {
            field7270 = null;
        }
        if (super.field4166.field4849) {
            int[] var4 = this.method1951(arg0, 633706337, 1);
            int[] var5 = this.method1951(arg0, 633706337, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; field7275 > var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field7269 >> 12;
                int var12 = class551.field7593[var10] * var11 >> 12;
                int var13 = class309.field4295[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class677.field9204;
                int var15 = (var13 >> 12) + arg0 & class319.field4394;
                int[][] var16 = this.method1948((byte) -57, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(Z)I")
    public static final int method3041(boolean arg0) {
        ++field7268;
        int var1 = class594.field8134.method1042(-125);
        if (arg0) {
            field7271 = null;
        }
        if (var1 < class222.field3181.length + -1) {
            class594.field8134 = class222.field3181[var1 + 1];
        }
        return 100;
    }
}
