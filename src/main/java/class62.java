import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class62 extends class177 {

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Z")
    private boolean field933 = true;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "Z")
    private boolean field938 = true;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Z")
    public static boolean field939 = false;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "F")
    public static float field947;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Lvd;")
    public static class134 field940;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "[[S")
    public static short[][] field948;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "[[[B")
    public static byte[][][] field944;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lhb;II)V", line = 15)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field938 = arg0.method273(65280) == 1;
        } else if (arg2 == 1) {
            this.field933 = arg0.method273(65280) == 1;
        } else if (arg2 == 2) {
            this.field2649 = arg0.method273(65280) == 1;
        }
        if (arg1 != -18061) {
            this.field938 = true;
        }
        field937++;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 59)
    public static final void method546(int arg0) {
        if (arg0 >= -104) {
            return;
        }
        if (class12.field136 < 0) {
            class12.field136 = 0;
            class45.field713 = -1;
            class257.field3832 = -1;
        }
        if (class87.field1280 < class12.field136) {
            class257.field3832 = -1;
            class45.field713 = -1;
            class12.field136 = class87.field1280;
        }
        field942++;
        if (class241.field3631 < 0) {
            class45.field713 = -1;
            class257.field3832 = -1;
            class241.field3631 = 0;
        }
        if (class193.field3089 < class241.field3631) {
            class257.field3832 = -1;
            class45.field713 = -1;
            class241.field3631 = class193.field3089;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(IIZ)Ljava/lang/String;", line = 103)
    public static final String method547(int arg0, int arg1, boolean arg2) {
        if (arg0 != 0) {
            field948 = (short[][]) ((short[][]) null);
        }
        field945++;
        return arg2 && arg1 >= 0 ? class38.method346(arg1, arg0 ^ 0x1, 10, arg2) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(BI)I", line = 123)
    public static final int method548(byte arg0, int arg1) {
        field946++;
        return arg0 <= 1 ? 86 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V", line = 134)
    public static void method549(boolean arg0) {
        if (!arg0) {
            method550(36, 89);
        }
        field948 = (short[][]) null;
        field944 = (byte[][][]) null;
        field940 = null;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 235)
    public class62() {
        super(1, false);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[[I", line = 152)
    public final int[][] method99(int arg0, int arg1) {
        field943++;
        if (arg1 != -23387) {
            this.method99(-87, 81);
        }
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int[][] var4 = this.method1285(0, this.field933 ? class11.field120 - arg0 : arg0, 27847);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (this.field938) {
                for (int var11 = 0; var11 < class287.field4415; var11++) {
                    var9[var11] = var5[class133.field2090 - var11];
                    var7[var11] = var6[class133.field2090 - var11];
                    var10[var11] = var8[class133.field2090 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class287.field4415; var12++) {
                    var9[var12] = var5[var12];
                    var7[var12] = var6[var12];
                    var10[var12] = var8[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V", line = 226)
    public static final void method550(int arg0, int arg1) {
        field941++;
        class147 var2 = class92.method731(-29125, arg1, arg0);
        var2.method1099(-121);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I", line = 244)
    public final int[] method95(int arg0, int arg1) {
        field935++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -65);
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(this.field933 ? class11.field120 - arg1 : arg1, 0, false);
            if (this.field938) {
                for (int var5 = 0; var5 < class287.field4415; var5++) {
                    var3[var5] = var4[class133.field2090 - var5];
                }
            } else {
                class151.method1115(var4, 0, var3, 0, class287.field4415);
            }
        }
        return arg0 >= -52 ? (int[]) null : var3;
    }
}
