import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class434 extends class221 {

    @OriginalMember(owner = "client!te", name = "l", descriptor = "F")
    public static float field6365 = 0.0F;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lbg;")
    public static class324 field6366;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILet;ILjava/awt/Component;)Lln;", line = 3)
    public static final class257 method2631(int arg0, int arg1, class419 arg2, int arg3, Component arg4) {
        field6367++;
        if (class405.field6017 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 != 2) {
                method2632(41, (byte) 82, false, 75L, -46, null, false, null, -32, 115, -126);
            }
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class257 var5 = (class257) Class.forName("dh").getDeclaredConstructor().newInstance();
                var5.field3788 = arg3;
                var5.field3777 = new int[(class241.field3572 ? 2 : 1) * 256];
                var5.method1454(arg4);
                var5.field3786 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field3786 > 16384) {
                    var5.field3786 = 16384;
                }
                var5.method1451(var5.field3786);
                if (class312.field4449 > 0 && class398.field5830 == null) {
                    class398.field5830 = new class132();
                    class398.field5830.field1911 = arg2;
                    arg2.method2564(95, class312.field4449, class398.field5830);
                }
                if (class398.field5830 != null) {
                    if (class398.field5830.field1914[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class398.field5830.field1914[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class357 var6 = new class357(arg2, arg0);
                    var6.field3777 = new int[(class241.field3572 ? 2 : 1) * 256];
                    var6.field3788 = arg3;
                    var6.method1454(arg4);
                    var6.field3786 = 16384;
                    var6.method1451(var6.field3786);
                    if (class312.field4449 > 0 && class398.field5830 == null) {
                        class398.field5830 = new class132();
                        class398.field5830.field1911 = arg2;
                        arg2.method2564(arg1 - 120, class312.field4449, class398.field5830);
                    }
                    if (class398.field5830 != null) {
                        if (class398.field5830.field1914[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class398.field5830.field1914[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class257();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBZJILjava/lang/String;ZLjava/lang/String;III)V", line = 89)
    public static final void method2632(int arg0, byte arg1, boolean arg2, long arg3, int arg4, String arg5, boolean arg6, String arg7, int arg8, int arg9, int arg10) {
        field6363++;
        if (class500.field7415 || class291.field4175 >= 500) {
            return;
        }
        int var12 = arg10 == -1 ? class86.field1177 : arg10;
        class97 var13 = new class97(arg7, arg5, var12, arg0, arg9, arg3, arg4, arg8, arg6, arg2);
        class498.field7394.method1015(false, var13);
        if (arg1 != -55) {
            field6365 = 0.3593247F;
        }
        class291.field4175++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lfs;ILjava/lang/String;Z)Lqk;", line = 112)
    public static final class14 method2633(class387 arg0, int arg1, String arg2, boolean arg3) {
        field6364++;
        int var4 = -107 % ((arg1 + 30) / 50);
        int var5 = arg0.method2358(arg2, (byte) 107);
        if (var5 == -1) {
            return new class14(0);
        }
        int[] var6 = arg0.method2383(16947, var5);
        class14 var7 = new class14(var6.length);
        int var8 = 0;
        int var9 = 0;
        while (true) {
            while (var7.field165 > var8) {
                class65 var10 = new class65(arg0.method2363(var6[var9++], var5, 99));
                int var11 = var10.method616((byte) 91);
                int var12 = var10.method623((byte) 104);
                int var13 = var10.method577(255);
                if (!arg3 && var13 == 1) {
                    var7.field165--;
                } else {
                    var7.field166[var8] = var11;
                    var7.field160[var8] = var12;
                    var8++;
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 164)
    public static void method2634(int arg0) {
        field6366 = null;
        if (arg0 <= 83) {
            field6366 = null;
        }
    }
}
