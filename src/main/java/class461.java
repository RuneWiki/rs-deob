import jaggl.OpenGL;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class461 extends class409 {

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    private int field6637;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    private int field6633;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    private int field6632;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    private int field6635;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[[I")
    public static int[][] field6638 = new int[6][];

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field6640;

    // $FF: synthetic field
    @OriginalMember(owner = "client!og", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field6641;

    // $FF: synthetic method
    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2688(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII[BI)V", line = 4)
    public static final void method2684(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        ++field6639;
        if (~arg1 < -1 && !class346.method2145(-1, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class346.method2145(arg3 ^ 32175, arg2)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class604.method3446((byte) -48, arg0);
            int var8 = 0;
            if (arg3 == -32176) {
                int var9 = ~arg1 > ~arg2 ? arg1 : arg2;
                int var10 = arg1 >> 1;
                int var11 = arg2 >> 1;
                byte[] var12 = arg5;
                byte[] var13 = new byte[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Dub(arg6, var8, arg4, arg1, arg2, 0, arg0, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg1 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; var7 > var16; ++var16) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var11 > var20; ++var20) {
                            for (int var21 = 0; ~var10 < ~var21; ++var21) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var19 = var7 + var26;
                                var13[var17] = (byte) (var27 >> 2);
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    arg1 = var10;
                    arg2 = var11;
                    var12 = var15;
                    var10 >>= 1;
                    var9 >>= 1;
                    ++var8;
                    var11 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 102)
    public static void method2685(int arg0) {
        if (arg0 != 2) {
            field6638 = null;
        }
        field6638 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZBLjava/awt/Component;)Loea;", line = 114)
    public static final class547 method2686(boolean arg0, byte arg1, Component arg2) {
        ++field6640;
        try {
            if (arg1 < 94) {
                field6638 = null;
            }
            Constructor var3 = Class.forName("td").getDeclaredConstructor(field6641 != null ? field6641 : (field6641 = method2688("java.awt.Component")), Boolean.TYPE);
            return (class547) var3.newInstance(arg2, new Boolean(arg0));
        } catch (Throwable var4) {
            return new class379(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(III)V", line = 131)
    public final void method210(int arg0, int arg1, int arg2) {
        if (arg1 != 27775) {
            method2687((String) null, (byte) -15);
        }
        ++field6634;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIII)V", line = 145)
    public class461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6637 = arg0;
        this.field6633 = arg3;
        this.field6632 = arg2;
        this.field6635 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V", line = 157)
    public final void method207(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            ++field6636;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(III)V", line = 168)
    public final void method205(int arg0, int arg1, int arg2) {
        ++field6631;
        int var4 = this.field6637 * arg2 >> 12;
        int var5 = this.field6632 * arg2 >> 12;
        if (arg0 == 2048) {
            int var6 = this.field6635 * arg1 >> 12;
            int var7 = this.field6633 * arg1 >> 12;
            class381.method2358(super.field6091, var4, true, var6, var7, var5);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 193)
    public static final byte[] method2687(String arg0, byte arg1) {
        ++field6630;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        } else {
            int var3 = var2 - -3 & -4;
            int var4 = var3 / 4 * 3;
            if (~var2 < ~(var3 + -2) && class12.method80(-1, arg0.charAt(var3 - 2)) != -1) {
                if (var3 + -1 >= var2 || ~class12.method80(-1, arg0.charAt(var3 + -1)) == 0) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            if (arg1 <= 18) {
                return null;
            } else {
                byte[] var5 = new byte[var4];
                class418.method2538(0, var5, false, arg0);
                return var5;
            }
        }
    }
}
