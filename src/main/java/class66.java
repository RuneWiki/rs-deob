import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class66 extends class185 {

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    private int field1055 = 585;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "[I")
    public static int[] field1052 = new int[32];

    @OriginalMember(owner = "client!e", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1054 = "";

    @OriginalMember(owner = "client!e", name = "T", descriptor = "Z")
    public static boolean field1059 = false;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "[S")
    public static short[] field1060 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!e", name = "X", descriptor = "Ljava/lang/String;")
    public static String field1062;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "Lik;")
    public static class267 field1063;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IC)C")
    public static final char method446(int arg0, char arg1) {
        ++field1053;
        return (char) arg0 != arg1 && arg1 != 402 ? Character.toTitleCase(arg1) : arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field1061;
        if (arg0 == 0) {
            this.field1055 = arg1.method1575(false);
        }
        if (arg2 != -6357) {
            field1054 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIILsk;JZ)V")
    public static final void method447(int arg0, int arg1, int arg2, int arg3, class114 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class108 var8 = new class108();
            var8.field1684 = arg4;
            var8.field1686 = arg1 * 128 + 64;
            var8.field1682 = arg2 * 128 + 64;
            var8.field1685 = arg3;
            var8.field1687 = arg5;
            if (class33.field487[arg0][arg1][arg2] == null) {
                class33.field487[arg0][arg1][arg2] = new class270(arg0, arg1, arg2);
            }
            class33.field487[arg0][arg1][arg2].field4063 = var8;
        }
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "(I)V")
    public static void method448(int arg0) {
        field1052 = null;
        field1060 = null;
        if (arg0 >= -121) {
            field1064 = -71;
        }
        field1054 = null;
        field1062 = null;
        field1063 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZC)Z")
    public static final boolean method449(boolean arg0, char arg1) {
        if (arg0) {
            method450(-67, 49, 125);
        }
        ++field1049;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Lrf;")
    public static final class289 method450(int arg0, int arg1, int arg2) {
        class289 var3 = class89.method574((byte) -15, arg0);
        ++field1056;
        if (~arg2 == arg1) {
            return var3;
        } else {
            return var3 != null && var3.field4472 != null && arg2 < var3.field4472.length ? var3.field4472[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lpf;III)Z")
    public static final boolean method451(class294 arg0, int arg1, int arg2, int arg3) {
        ++field1051;
        byte[] var4 = arg0.method1973(1, arg1, arg3);
        if (var4 == null) {
            return false;
        } else {
            if (arg2 != 2048) {
                field1052 = null;
            }
            class6.method29(var4, 117);
            return true;
        }
    }

    @OriginalMember(owner = "client!e", name = "j", descriptor = "(I)V")
    public static final void method452(int arg0) {
        class233.field3516 = 0;
        class272.field4096 = -1;
        class237.field3570 = 1;
        ++field1057;
        class115.field1761 = -3;
        class191.field2933 = 0;
        class247.field3689 = arg0;
        class254.field3859 = false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 <= 70) {
            method446(89, (char) 65518);
        }
        ++field1058;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int var4 = class85.field1356[arg0];
            for (int var5 = 0; var5 < class174.field2648; ++var5) {
                int var6 = class153.field2304[var5];
                if (~this.field1055 > ~var6 && -this.field1055 + 4096 > var6 && ~var4 < ~(2048 - this.field1055) && this.field1055 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1055 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field1055 + 2048) && ~var6 > ~(this.field1055 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1055;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1055 + 2048);
                } else if (this.field1055 <= var4 && ~var4 >= ~(-this.field1055 + 4096)) {
                    if (var6 >= this.field1055 && -this.field1055 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field1055);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field1055;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1055 + 2048);
                }
            }
        }
        return var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field1052[var1] = var0 + -1;
            var0 += var0;
        }
        field1062 = "green:";
        field1063 = new class267(50);
        field1064 = 0;
    }
}
