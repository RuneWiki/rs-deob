import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class217 {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    private int field3515 = 0;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    private int field3521 = -1;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lhh;")
    private class169 field3512 = new class169();

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Z")
    public boolean field3529 = false;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    private int field3527;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "[[[I")
    private int[][][] field3523;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[Lcm;")
    private class45[] field3522;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3518 = 0;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3519 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Z")
    public static volatile boolean field3524 = true;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static volatile int field3517 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lak;")
    public static class172 field3513;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(III)V", line = 322)
    public class217(int arg0, int arg1, int arg2) {
        this.field3527 = arg0;
        this.field3516 = arg1;
        this.field3523 = new int[this.field3527][3][arg2];
        this.field3522 = new class45[this.field3516];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqn;", line = 22)
    public static final class343 method1548(Throwable arg0, String arg1) {
        field3514++;
        class343 var2;
        if ((arg0 instanceof class343)) {
            var2 = (class343) arg0;
            var2.field5336 = var2.field5336 + ' ' + arg1;
        } else {
            var2 = new class343(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIILle;IIIII)V", line = 45)
    public static final void method1549(int arg0, int arg1, int arg2, class97 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3520++;
        int var9 = arg2 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg3.field1343;
            var11 = arg3.field1337;
        } else {
            var10 = arg3.field1337;
            var11 = arg3.field1343;
        }
        int var12;
        int var13;
        if ((arg5 + var11) > 104) {
            var12 = arg5;
            var13 = arg5 + 1;
        } else {
            var12 = arg5 + (var11 >> 1);
            var13 = (var11 + 1 >> 1) + arg5;
        }
        int var14;
        int var15;
        if ((arg8 + var10) > 104) {
            var14 = arg8;
            var15 = arg8 + 1;
        } else {
            var14 = (var10 >> 1) + arg8;
            var15 = (var10 + 1 >> 1) + arg8;
        }
        if (arg7 != 24) {
            method1549(-26, 53, -95, (class97) null, 112, -74, 82, 1, -108);
        }
        int var16 = (arg5 << 7) + (var11 << 6);
        int var17 = (arg8 << 7) + (var10 << 6);
        int[][] var18 = class110.field1642[arg6];
        int var19 = var18[var14][var12] - (-var18[var14][var13] - var18[var15][var12] - var18[var15][var13]) >> 2;
        int var20 = 0;
        if (arg6 != 0) {
            int[][] var21 = class110.field1642[0];
            var20 = var19 - (var21[var14][var12] + var21[var15][var12] + var21[var14][var13] + var21[var15][var13] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg6 < 3) {
            var22 = class110.field1642[arg6 + 1];
        }
        class67 var23 = arg3.method657(arg2, 19, (class326) null, var16, var17, true, arg1, var22, var18, var19, false);
        class241.method1734(var23.field959, var17 - arg4, var20, var16 - arg0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLjj;)V", line = 131)
    public static final void method1550(byte arg0, class44 arg1) {
        int var2 = -96 % ((-arg0 - 22) / 35);
        field3528++;
        byte[] var3 = new byte[24];
        if (class316.field4901 != null) {
            try {
                class316.field4901.method528(0L, 106);
                class316.field4901.method523(0, var3);
                int var4;
                for (var4 = 0; var4 < 24 && var3[var4] == 0; var4++) {
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var7) {
                for (int var6 = 0; var6 < 24; var6++) {
                    var3[var6] = -1;
                }
            }
        }
        arg1.method244(24, (byte) 98, var3, 0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 175)
    public final void method1551(int arg0) {
        field3511++;
        for (int var2 = 0; var2 < this.field3527; var2++) {
            this.field3523[var2][0] = null;
            this.field3523[var2][1] = null;
            this.field3523[var2][2] = null;
            this.field3523[var2] = (int[][]) null;
        }
        this.field3523 = (int[][][]) null;
        this.field3522 = null;
        this.field3512.method1233(arg0 + 51060);
        this.field3512 = null;
        if (arg0 != -20458) {
            method1553(-12);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I", line = 202)
    public final int[][] method1552(int arg0, byte arg1) {
        if (arg1 != -69) {
            return (int[][]) ((int[][]) null);
        }
        field3526++;
        if (this.field3527 == this.field3516) {
            this.field3529 = this.field3522[arg0] == null;
            this.field3522[arg0] = class111.field1647;
            return this.field3523[arg0];
        } else if (this.field3527 == 1) {
            this.field3529 = this.field3521 != arg0;
            this.field3521 = arg0;
            return this.field3523[0];
        } else {
            class45 var3 = this.field3522[arg0];
            if (var3 == null) {
                this.field3529 = true;
                if (this.field3527 > this.field3515) {
                    var3 = new class45(arg0, this.field3515);
                    this.field3515++;
                } else {
                    class45 var4 = (class45) this.field3512.method1236((byte) -89);
                    var3 = new class45(arg0, var4.field629);
                    this.field3522[var4.field636] = null;
                    var4.method1212((byte) 93);
                }
                this.field3522[arg0] = var3;
            } else {
                this.field3529 = false;
            }
            this.field3512.method1231(-57, var3);
            return this.field3523[var3.field629];
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 270)
    public static void method1553(int arg0) {
        field3519 = null;
        field3513 = null;
        if (arg0 != 1) {
            method1550((byte) 116, (class44) null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)[[[I", line = 299)
    public final int[][][] method1554(int arg0) {
        field3525++;
        if (this.field3527 != this.field3516) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -32648) {
            method1550((byte) -110, (class44) null);
        }
        for (int var2 = 0; var2 < this.field3527; var2++) {
            this.field3522[var2] = class111.field1647;
        }
        return this.field3523;
    }
}
