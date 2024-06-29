import java.awt.Color;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class500 {

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "Lvd;")
    private class39 field7102;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "[Z")
    private boolean[] field7105;

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "I")
    private int field7104;

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "[[I")
    private int[][] field7108;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "[I")
    public static int[] field7107 = new int[32];

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!bia", name = "i", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!bia", name = "j", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!bia", name = "k", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)Z")
    public final boolean method2971(byte arg0) {
        field7106++;
        if (arg0 == 114) {
            return this.field7104 != -1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)[I")
    public final int[] method2972(int arg0, int arg1) {
        field7110++;
        if (arg0 < 0 || this.field7108.length <= arg0) {
            return this.field7104 == -1 ? new int[0] : new int[] { this.field7104 };
        } else if (this.field7105[arg0] && this.field7108[arg0].length > 1) {
            int var3 = this.field7104 == -1 ? 0 : 1;
            Random var4 = new Random();
            if (arg1 != 13867) {
                return null;
            }
            int[] var5 = new int[this.field7108[arg0].length];
            class319.method2016(this.field7108[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class162.method1180(var4, var5.length - var3, arg1 ^ 0xFFFFC9AE);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field7108[arg0];
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2973(byte arg0, String arg1) {
        field7109++;
        int var2 = -100 / ((-arg0 - 62) / 59);
        for (int var3 = 0; var3 < class303.field4296.length; var3++) {
            if (class303.field4296[var3].equalsIgnoreCase(arg1)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)V")
    public static final void method2974(byte arg0) {
        class35.field371.method2475(0);
        field7111++;
        class632.field8840.method2696(16384);
        class236.field3433.method1002((byte) 126);
        class106.field1476.setBackground(Color.black);
        class724.field10105 = -1;
        if (arg0 < 120) {
            field7107 = null;
        }
        class35.field371 = class218.method1465(-1, class106.field1476);
        class632.field8840 = class173.method1235(class106.field1476, true, (byte) -116);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7103++;
        int var8 = arg0 - arg5;
        int var9 = arg2 + arg5;
        for (int var10 = arg2; var10 < var9; var10++) {
            class238.method1577(arg4, class664.field9322[var10], arg3, arg6, (byte) 126);
        }
        int var11 = arg3 - arg5;
        int var12 = arg6 + arg5;
        for (int var13 = arg0; var13 > var8; var13--) {
            class238.method1577(arg4, class664.field9322[var13], arg3, arg6, (byte) 121);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class664.field9322[var14];
            class238.method1577(arg4, var15, var12, arg6, (byte) 127);
            class238.method1577(arg1, var15, var11, var12, (byte) 124);
            class238.method1577(arg4, var15, arg3, var11, (byte) 125);
        }
        if (arg7 != -31469) {
            field7107 = null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IB)Lf;")
    public final class758 method2976(int arg0, byte arg1) {
        field7112++;
        byte[] var3 = this.field7102.method211(true, 1, arg0);
        class758 var4 = new class758();
        var4.method4227(new class645(var3), 0);
        int var5 = -125 / ((arg1 + 58) / 61);
        return var4;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V")
    public static void method2977(int arg0) {
        if (arg0 == 0) {
            field7107 = null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class500(class464 arg0, int arg1, class39 arg2) {
        this.field7102 = arg2;
        this.field7102.method229(1, 0);
        class645 var4 = new class645(this.field7102.method211(true, 0, 0));
        int var5 = var4.method3745(-6314);
        if (var5 > 3) {
            this.field7105 = new boolean[0];
            this.field7104 = -1;
            this.field7108 = new int[0][];
        } else {
            int var6 = var4.method3745(-6314);
            class439[] var7 = class75.method629((byte) 126);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method3745(-6314);
                    if (var7[var9].field6502 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method3745(-6314);
                int var12 = var4.method3745(-6314);
                if (var5 > 2) {
                    this.field7104 = var4.method3756(65536);
                } else {
                    this.field7104 = -1;
                }
                this.field7105 = new boolean[var12 + 1];
                this.field7108 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method3745(-6314);
                    this.field7105[var15] = var4.method3745(-6314) == 1;
                    int var16 = var4.method3712((byte) 58);
                    if (this.field7104 == -1) {
                        this.field7108[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field7108[var15][var17] = var4.method3712((byte) -125);
                        }
                    } else {
                        this.field7108[var15] = new int[var16 + 1];
                        this.field7108[var15][0] = this.field7104;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field7108[var15][var18 + 1] = var4.method3712((byte) -15);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field7108[var14] == null) {
                        if (this.field7104 == -1) {
                            this.field7108[var14] = new int[0];
                        } else {
                            this.field7108[var14] = new int[] { this.field7104 };
                        }
                    }
                }
            } else {
                this.field7108 = new int[0][];
                this.field7104 = -1;
                this.field7105 = new boolean[0];
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field7107[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
