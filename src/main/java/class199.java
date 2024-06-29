import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class199 extends class198 {

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "Z")
    private boolean field3159 = true;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "Z")
    private boolean field3160 = true;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field3158 = 0;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field3161 = 0;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field3164 = -1;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "Lek;")
    public static class173 field3155;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "[Lh;")
    public static class294[] field3156;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        int var4 = -71 % ((60 - arg0) / 61);
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3139 = arg1.method1420((byte) 0) == 1;
                }
            } else {
                this.field3160 = arg1.method1420((byte) 0) == 1;
            }
        } else {
            this.field3159 = ~arg1.method1420((byte) 0) == -2;
        }
        ++field3157;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILkk;IILjj;II)V")
    public static final void method1375(int arg0, class254 arg1, int arg2, int arg3, class110 arg4, int arg5, int arg6) {
        ++field3162;
        if (arg4 != null) {
            int var7;
            if (class92.field1402 == 4) {
                var7 = (int) class202.field3253 & 2047;
            } else {
                var7 = (int) class202.field3253 - -class262.field4330 & 2047;
            }
            int var8 = Math.max(arg1.field4085 / 2, arg1.field4152 / 2) - -10;
            if (arg6 <= -114) {
                int var9 = arg0 * arg0 + arg3 * arg3;
                if (var8 * var8 >= var9) {
                    int var10 = class172.field2669[var7];
                    int var11 = class172.field2658[var7];
                    if (~class92.field1402 != -5) {
                        var11 = var11 * 256 / (class265.field4365 + 256);
                        var10 = var10 * 256 / (class265.field4365 - -256);
                    }
                    int var12 = arg0 * var11 + -(arg3 * var10) >> 16;
                    int var13 = arg0 * var10 + arg3 * var11 >> 16;
                    ((class5) arg4).method19(arg5 - -(arg1.field4085 / 2) - -var13 + -(arg4.field1680 / 2), arg1.field4152 / 2 + -var12 + arg2 - arg4.field1682 / 2, arg1.field4193, arg1.field4092);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field3163;
        if (!arg0) {
            this.method52(-95, (class202) null, -103);
        }
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int[] var4 = this.method1367((byte) -79, 0, this.field3160 ? -arg1 + class52.field704 : arg1);
            if (!this.field3159) {
                class158.method1045(var4, 0, var3, 0, class42.field590);
            } else {
                for (int var5 = 0; var5 < class42.field590; ++var5) {
                    var3[var5] = var4[class227.field3594 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field3165;
        int[][] var3 = super.field3150.method642(arg0, arg1 + 3);
        if (arg1 != -2) {
            this.method52(-30, (class202) null, 13);
        }
        if (super.field3150.field1498) {
            int[][] var4 = this.method1372(0, !this.field3160 ? arg0 : class52.field704 - arg0, (byte) -17);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field3159) {
                for (int var11 = 0; ~class42.field590 < ~var11; ++var11) {
                    var7[var11] = var5[-var11 + class227.field3594];
                    var9[var11] = var6[-var11 + class227.field3594];
                    var10[var11] = var8[class227.field3594 - var11];
                }
            } else {
                for (int var12 = 0; ~class42.field590 < ~var12; ++var12) {
                    var7[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var8[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
    public static void method1376(int arg0) {
        field3155 = null;
        field3156 = null;
        if (arg0 != 10367) {
            method1376(-97);
        }
    }
}
