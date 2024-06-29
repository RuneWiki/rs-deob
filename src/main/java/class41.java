import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class41 extends class93 {

    @OriginalMember(owner = "client!e", name = "W", descriptor = "Ljd;")
    public static class92 field914 = class202.method1325((byte) 90, "::autoshadow on");

    @OriginalMember(owner = "client!e", name = "V", descriptor = "Ljd;")
    public static class92 field913 = class202.method1325((byte) 90, "(Y<)4col>");

    @OriginalMember(owner = "client!e", name = "X", descriptor = "Ljd;")
    public static class92 field915 = class202.method1325((byte) 90, "Weiter");

    @OriginalMember(owner = "client!e", name = "U", descriptor = "Ljd;")
    public static class92 field912 = class202.method1325((byte) 90, "(U0a )2 in: ");

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "Ljd;")
    public static class92 field918 = class202.method1325((byte) 90, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field910;
        int[][] var3 = super.field1873.method553(arg0, arg1 ^ arg1);
        if (super.field1873.field1656) {
            int[] var4 = this.method648((byte) 41, arg0, 2);
            int[][] var5 = this.method649(0, true, arg0);
            int[][] var6 = this.method649(1, true, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[1];
            int[] var10 = var5[0];
            int[] var11 = var3[2];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; class150.field2985 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 != 0) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var9[var16] * var17 + var15[var16] * var18 >> 12;
                        var11[var16] = var12[var16] * var17 - -(var14[var16] * var18) >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var15[var16];
                        var11[var16] = var14[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var9[var16];
                    var11[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
    public static void method261(int arg0) {
        field912 = null;
        field918 = null;
        field913 = null;
        if (arg0 != -30812) {
            method261(-46);
        }
        field915 = null;
        field914 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 != 0) {
            field912 = null;
        }
        if (~arg0 == -1) {
            super.field1885 = arg1.method443(255) == 1;
        }
        ++field916;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class41() {
        super(3, false);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int var3 = -64 / ((arg1 - 67) / 42);
        ++field911;
        int[] var4 = super.field1887.method916(arg0, -70);
        if (super.field1887.field2757) {
            int[] var5 = this.method648((byte) 57, arg0, 0);
            int[] var6 = this.method648((byte) 78, arg0, 1);
            int[] var7 = this.method648((byte) 87, arg0, 2);
            for (int var8 = 0; class150.field2985 > var8; ++var8) {
                int var9 = var7[var8];
                if (var9 != 4096) {
                    if (var9 == 0) {
                        var4[var8] = var6[var8];
                    } else {
                        var4[var8] = (4096 - var9) * var6[var8] + var5[var8] * var9 >> 12;
                    }
                } else {
                    var4[var8] = var5[var8];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)V")
    public static final void method262(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field979; ++var4) {
                class185 var5 = var3.field966[var4];
                if ((var5.field3495 >> 29 & 3L) == 2L && var5.field3488 == arg1 && var5.field3486 == arg2) {
                    class67.method394(var5);
                    return;
                }
            }
        }
    }
}
