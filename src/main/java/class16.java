import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class16 extends class243 {

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lub;")
    public static class227 field291 = class257.method1749("Schrifts-=tze geladen)3", 17263);

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "I")
    public static int field297 = 0;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "Lph;")
    public static class32 field295;

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class16() {
        super(3, false);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)I")
    public static final int method75(int arg0, int arg1, int arg2) {
        ++field290;
        class151 var3 = (class151) class42.field688.method1298(-128, (long) arg0);
        if (var3 == null) {
            return -1;
        } else {
            return ~arg2 <= arg1 && ~arg2 > ~var3.field2625.length ? var3.field2625[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ln;Ltb;Ln;Ln;B)Z")
    public static final boolean method76(class138 arg0, class253 arg1, class138 arg2, class138 arg3, byte arg4) {
        class103.field1801 = arg2;
        if (arg4 != -19) {
            field297 = -64;
        }
        class149.field2605 = arg3;
        class235.field4078 = arg1;
        class47.field835 = arg0;
        ++field298;
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field288;
        int[] var3 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int[] var4 = this.method1614(0, arg1, 107);
            int[] var5 = this.method1614(1, arg1, 81);
            int[] var6 = this.method1614(2, arg1, 108);
            for (int var7 = 0; ~var7 > ~class212.field3586; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        int var9 = 48 % ((-15 - arg0) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V")
    public static void method78(int arg0) {
        if (arg0 != 0) {
            field289 = -57;
        }
        field291 = null;
        field295 = null;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)I")
    public static final int method79(int arg0, int arg1) {
        ++field293;
        int var2 = 0;
        if (arg1 < 0 || ~arg1 <= -65537) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (~arg1 <= -257) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 4;
        }
        if (arg0 != 3439) {
            method79(1, 107);
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (~arg1 <= -2) {
            arg1 >>>= 1;
            ++var2;
        }
        return var2 - -arg1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        if (arg0 != 230) {
            method78(-127);
        }
        ++field294;
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (super.field4213.field3771) {
            int[] var4 = this.method1614(2, arg1, 104);
            int[][] var5 = this.method1616(-1, arg1, 0);
            int[][] var6 = this.method1616(-1, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; ~class212.field3586 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var13[var16];
                    var8[var16] = var15[var16];
                    var9[var16] = var14[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var15[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field297 = 12;
        }
        if (~arg2 == -1) {
            super.field4230 = arg0.method1471(255) == 1;
        }
        ++field292;
    }
}
