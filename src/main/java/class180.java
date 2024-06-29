import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class180 extends class123 {

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "[I")
    private int[] field3156 = new int[3];

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    private int field3154 = 4096;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    private int field3157 = 4096;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    private int field3152 = 4096;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    private int field3160 = 409;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "[Leb;")
    public static class230[] field3153 = new class230[200];

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "I")
    public static int field3163 = 0;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "Lsf;")
    public static class93 field3151;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Leb;II)V")
    public static final void method1304(class230 arg0, int arg1, int arg2) {
        ++field3162;
        ++class24.field461;
        if (arg1 != 2037412908) {
            method1305(false);
        }
        class153.field2747.method978(arg1 + -2037412797, 187);
        class153.field2747.method148(arg0.method1587(arg1 + -2037412804), (byte) 113);
        class153.field2747.method170((byte) 113, arg2);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
    public static void method1305(boolean arg0) {
        field3151 = null;
        field3153 = null;
        if (!arg0) {
            field3153 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 != 1876195788) {
            this.method2(110, -112);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg1.method190(arg2 ^ -1876171647);
                            this.field3156[2] = class189.method1350(var5 >> 12, 0);
                            this.field3156[1] = class189.method1350(65280, var5) >> 4;
                            this.field3156[0] = class189.method1350(16711680, var5) << 4;
                        }
                    } else {
                        this.field3152 = arg1.method161(arg2 + -1876195784);
                    }
                } else {
                    this.field3154 = arg1.method161(4);
                }
            } else {
                this.field3157 = arg1.method161(4);
            }
        } else {
            this.field3160 = arg1.method161(4);
        }
        ++field3158;
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Lej;")
    public static final class49 method1306(int arg0) {
        ++field3159;
        class69 var1 = new class69(class47.field839, class15.field346, class96.field1735[0], class113.field2034[0], class7.field124[0], class273.field4806[arg0], class215.field3725[0], class263.field4676);
        class78.method650(true);
        return var1;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field3161;
        if (arg1 != 26080) {
            method1305(true);
        }
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (super.field2152.field2616) {
            int[][] var4 = this.method960(0, arg0, (byte) -30);
            int[] var5 = var3[0];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class140.field2505 > var11; ++var11) {
                int var12 = var7[var11];
                int var13 = -this.field3156[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field3160 < var13) {
                    var5[var11] = var12;
                    var8[var11] = var9[var11];
                    var10[var11] = var6[var11];
                } else {
                    int var14 = var9[var11];
                    int var15 = -this.field3156[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field3160 < var15) {
                        var5[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var6[var11];
                    } else {
                        int var16 = var6[var11];
                        int var17 = -this.field3156[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field3160) {
                            var5[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var5[var11] = this.field3152 * var12 >> 12;
                            var8[var11] = this.field3154 * var14 >> 12;
                            var10[var11] = this.field3157 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
    public class180() {
        super(1, false);
    }
}
