import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class class424 extends class311 {

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "Z")
    public boolean field5893;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "[Lsp;")
    public class424[] field5899;

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "[[I")
    public static int[][] field5903 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public static int field5895 = 0;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
    public int field5907;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "Ltb;")
    public class103 field5892;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "Lcr;")
    public static class191 field5894;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "Ldq;")
    public class87 field5896;

    static {
        new class368("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field5913 = 0;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V", line = 3)
    public void method113(int arg0) {
        field5897++;
        if (arg0 != 3) {
            this.field5899 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(IB)[I", line = 15)
    public int[] method43(int arg0, byte arg1) {
        field5905++;
        if (arg1 == -10) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)I", line = 28)
    public int method1941(int arg0) {
        if (arg0 != -32563) {
            this.field5907 = 26;
        }
        field5911++;
        return -1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)V", line = 41)
    public void method1942(int arg0, int arg1, int arg2) {
        field5901++;
        int var4 = this.field5907 == 255 ? arg1 : this.field5907;
        if (this.field5893) {
            this.field5892 = new class103(var4, arg1, arg0);
        } else {
            this.field5896 = new class87(var4, arg1, arg0);
        }
        if (arg2 != 2) {
            method2619(-95);
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V", line = 64)
    public void method1940(byte arg0) {
        if (this.field5893) {
            this.field5892.method782(0);
            this.field5892 = null;
        } else {
            this.field5896.method690(2);
            this.field5896 = null;
        }
        field5912++;
        if (arg0 <= 25) {
            this.method1940((byte) 38);
        }
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(B)V", line = 94)
    public static final void method2618(byte arg0) {
        field5898++;
        for (int var1 = 0; var1 < class418.field5783; var1++) {
            int var2 = class251.field3505[var1];
            class423 var3 = class87.field1227[var2];
            int var4 = class75.field1068.method2306((byte) 123);
            if ((var4 & 0x10) != 0) {
                var4 += class75.field1068.method2306((byte) 105) << 8;
            }
            class55.method436(var2, var3, var4, 119);
        }
        if (arg0 <= 83) {
            method2620((byte) -103, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZ)[[I", line = 124)
    public int[][] method21(int arg0, boolean arg1) {
        field5900++;
        if (arg1) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lrg;BI)V", line = 137)
    public void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 != -48) {
            this.method113(-2);
        }
        field5908++;
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)V", line = 150)
    public static void method2619(int arg0) {
        field5903 = null;
        int var1 = 84 % ((-arg0 - 7) / 51);
        field5894 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLjava/awt/Canvas;)Lui;", line = 161)
    public static final class367 method2620(byte arg0, Canvas arg1) {
        field5906++;
        try {
            if (arg0 != -1) {
                field5894 = null;
            }
            Class var2 = Class.forName("ab");
            class367 var3 = (class367) var2.getDeclaredConstructor().newInstance();
            var3.method416((byte) -12, arg1);
            return var3;
        } catch (Throwable var5) {
            class51 var4 = new class51();
            var4.method416((byte) -12, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)[I", line = 198)
    public final int[] method2621(int arg0, int arg1, int arg2) {
        field5902++;
        if (arg1 > -113) {
            field5913 = 117;
        }
        return this.field5899[arg0].field5893 ? this.field5899[arg0].method43(arg2, (byte) -10) : this.field5899[arg0].method21(arg2, true)[0];
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)I", line = 221)
    public int method2622(int arg0) {
        field5909++;
        if (arg0 != -8793) {
            this.field5893 = false;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZIIII)V", line = 236)
    public static final void method2623(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5904++;
        for (class328 var5 = (class328) class159.field2268.method1173(0); var5 != null; var5 = (class328) class159.field2268.method1165(true)) {
            class213.method1423(var5, arg4, false, arg2, arg3, arg1);
        }
        for (class328 var6 = (class328) class39.field520.method1173(0); var6 != null; var6 = (class328) class39.field520.method1165(true)) {
            byte var11 = 1;
            class60 var12 = var6.field4469.method1283((byte) 113);
            if (var6.field4469.field2597) {
                var11 = 0;
            } else if (var6.field4469.field2587 == var12.field765 || var6.field4469.field2587 == var12.field782 || var6.field4469.field2587 == var12.field786 || var6.field4469.field2587 == var12.field769) {
                var11 = 2;
            } else if (var6.field4469.field2587 == var12.field770 || var6.field4469.field2587 == var12.field806 || var6.field4469.field2587 == var12.field814 || var6.field4469.field2587 == var12.field802) {
                var11 = 3;
            }
            if (var6.field4453 != var11) {
                int var13 = class403.method2492(var6.field4469, false);
                if (var6.field4458 != var13) {
                    if (var6.field4452 != null) {
                        class48.field616.method1128(var6.field4452);
                        var6.field4452 = null;
                    }
                    var6.field4458 = var13;
                }
                var6.field4453 = var11;
            }
            var6.field4466 = var6.field4469.field40;
            var6.field4451 = var6.field4469.field40 + var6.field4469.method1285(-81) * 64;
            var6.field4467 = var6.field4469.field44;
            var6.field4459 = var6.field4469.field44 + var6.field4469.method1285(-115) * 64;
            class213.method1423(var6, arg4, false, arg2, arg3, arg1);
        }
        class328 var7 = (class328) class156.field2220.method842((byte) -25);
        if (arg0) {
            method2620((byte) -113, (Canvas) null);
        }
        while (var7 != null) {
            byte var8 = 1;
            class60 var9 = var7.field4457.method1283((byte) -46);
            if (var7.field4457.field2597) {
                var8 = 0;
            } else if (var7.field4457.field2587 == var9.field765 || var7.field4457.field2587 == var9.field782 || var7.field4457.field2587 == var9.field786 || var7.field4457.field2587 == var9.field769) {
                var8 = 2;
            } else if (var7.field4457.field2587 == var9.field770 || var7.field4457.field2587 == var9.field806 || var7.field4457.field2587 == var9.field814 || var7.field4457.field2587 == var9.field802) {
                var8 = 3;
            }
            if (var7.field4453 != var8) {
                int var10 = class47.method389(var7.field4457, false);
                if (var7.field4458 != var10) {
                    if (var7.field4452 != null) {
                        class48.field616.method1128(var7.field4452);
                        var7.field4452 = null;
                    }
                    var7.field4458 = var10;
                }
                var7.field4453 = var8;
            }
            var7.field4466 = var7.field4457.field40;
            var7.field4451 = var7.field4457.field40 + (var7.field4457.method1285(-120) * 64);
            var7.field4467 = var7.field4457.field44;
            var7.field4459 = var7.field4457.field44 + (var7.field4457.method1285(-112) * 64);
            class213.method1423(var7, arg4, false, arg2, arg3, arg1);
            var7 = (class328) class156.field2220.method836(-6);
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(IZ)V", line = 357)
    public class424(int arg0, boolean arg1) {
        this.field5893 = arg1;
        this.field5899 = new class424[arg0];
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZII)[[I", line = 379)
    public final int[][] method2624(boolean arg0, int arg1, int arg2) {
        field5910++;
        if (!arg0) {
            return null;
        } else if (this.field5899[arg1].field5893) {
            int[] var4 = this.field5899[arg1].method43(arg2, (byte) -10);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5899[arg1].method21(arg2, true);
        }
    }
}
