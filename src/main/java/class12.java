import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class12 extends class139 {

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "[S")
    public static short[] field232 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "Lrf;")
    public static class163 field233 = class53.method392(-68, ")4l");

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "Lrf;")
    public static class163 field237 = class53.method392(73, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lrf;")
    public static class163 field239 = class53.method392(57, "sl_button");

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "Z")
    public static volatile boolean field238 = true;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)V")
    public static void method91(byte arg0) {
        field232 = null;
        field237 = null;
        field239 = null;
        int var1 = 16 / (-arg0 / 44);
        field233 = null;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            field233 = null;
        }
        int[] var3 = super.field2859.method1319(arg1 + -7552, arg0);
        if (super.field2859.field3966) {
            int[] var4 = this.method917(arg0, 0, true);
            int[] var5 = this.method917(arg0, 1, true);
            int[] var6 = this.method917(arg0, 2, true);
            for (int var7 = 0; ~var7 > ~class23.field402; ++var7) {
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
        ++field231;
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int[] var4 = this.method917(arg1, 2, true);
            int[][] var5 = this.method910((byte) -96, arg1, 0);
            int[][] var6 = this.method910((byte) -40, arg1, 1);
            int[] var7 = var3[1];
            int[] var8 = var5[0];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            int[] var11 = var5[2];
            int[] var12 = var5[1];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class23.field402; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 == 0) {
                        var9[var16] = var13[var16];
                        var7[var16] = var14[var16];
                        var10[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var9[var16] = var8[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var7[var16] = var12[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var10[var16] = var11[var16] * var17 - -(var15[var16] * var18) >> 12;
                    }
                } else {
                    var9[var16] = var8[var16];
                    var7[var16] = var12[var16];
                    var10[var16] = var11[var16];
                }
            }
        }
        ++field236;
        if (arg0 < 53) {
            field232 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(B)V")
    public static final void method92(byte arg0) {
        class135.field2787.method399(false);
        class32.field632.method399(false);
        ++field230;
        if (arg0 <= 57) {
            method92((byte) 18);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class12() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 != 21) {
            field238 = false;
        }
        if (arg0 == 0) {
            super.field2872 = ~arg2.method344(255) == -2;
        }
        ++field235;
    }
}
