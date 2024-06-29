import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class505 extends class59 {

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "Lnk;")
    public class505 field7378;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "Lnk;")
    public class505 field7383;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nk", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field7387;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "[I")
    public static int[] field7380;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "[I")
    public static int[] field7381;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "[I")
    public static int[] field7384;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "[I")
    public static int[] field7385;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3014(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 3)
    public static void method3007(int arg0) {
        field7380 = null;
        if (arg0 != 0) {
            method3007(20);
        }
        field7385 = null;
        field7381 = null;
        field7384 = null;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V", line = 17)
    public final void method3008(int arg0) {
        field7386++;
        if (arg0 >= 20 && this.field7383 != null) {
            this.field7383.field7378 = this.field7378;
            this.field7378.field7383 = this.field7383;
            this.field7378 = null;
            this.field7383 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V", line = 35)
    public static final void method3009() {
        if (class258.field3939 != null) {
            for (int var0 = 0; var0 < class258.field3939.length; var0++) {
                for (int var1 = 0; var1 < class497.field7147; var1++) {
                    for (int var2 = 0; var2 < class385.field5799; var2++) {
                        if (class258.field3939[var0][var1][var2] != null) {
                            class258.field3939[var0][var1][var2].method1006((byte) 29);
                        }
                        class258.field3939[var0][var1][var2] = null;
                    }
                }
            }
        }
        class258.field3939 = null;
        class289.field4358 = null;
        if (class75.field1076 != null) {
            for (int var3 = 0; var3 < class75.field1076.length; var3++) {
                for (int var4 = 0; var4 < class497.field7147; var4++) {
                    for (int var5 = 0; var5 < class385.field5799; var5++) {
                        if (class75.field1076[var3][var4][var5] != null) {
                            class75.field1076[var3][var4][var5].method1006((byte) 125);
                        }
                        class75.field1076[var3][var4][var5] = null;
                    }
                }
            }
        }
        class75.field1076 = null;
        class290.field4367 = null;
        client.field3311 = null;
        class491.field7059 = null;
        class233.field3756 = 0;
        if (class506.field7399 != null) {
            for (int var6 = 0; var6 < class233.field3756; var6++) {
                class506.field7399[var6] = null;
            }
        }
        if (class308.field4643 != null) {
            for (int var7 = 0; var7 < class295.field4506; var7++) {
                class308.field4643[var7] = null;
            }
            class295.field4506 = 0;
        }
        if (class503.field7256 != null) {
            for (int var8 = 0; var8 < class316.field4756; var8++) {
                class503.field7256[var8] = null;
            }
            for (int var9 = 0; var9 < class213.field3467; var9++) {
                for (int var10 = 0; var10 < class497.field7147; var10++) {
                    for (int var11 = 0; var11 < class385.field5799; var11++) {
                        class329.field4942[var9][var10][var11] = 0L;
                    }
                }
            }
            class316.field4756 = 0;
        }
        class534.field7849 = null;
        class285.method1842(0);
        class515.field7496.method1959(0);
        class182.field2722 = null;
        class368.field5403 = null;
        class76.field1100 = null;
        class358.field5320 = null;
        class348.field5152 = null;
        class291.field4407 = null;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 180)
    public static final void method3010(int arg0) {
        if (class429.field6373 == 2) {
            class74.method643(3, (byte) -115);
        } else if (class429.field6373 == 6) {
            class74.method643(7, (byte) -25);
        } else if (class429.field6373 == 9) {
            class74.method643(10, (byte) -121);
        }
        if (arg0 <= -57) {
            field7376++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(FFIF)F", line = 208)
    public static final float method3011(float arg0, float arg1, int arg2, float arg3) {
        field7382++;
        if (arg2 != 0) {
            field7384 = null;
        }
        return (arg0 - arg1) * arg3 + arg1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIZIFII)[[I", line = 220)
    public static final int[][] method3012(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, float arg6, int arg7, int arg8) {
        field7377++;
        int[][] var9 = new int[arg8][arg0];
        class517 var10 = new class517();
        var10.field7513 = arg2;
        var10.field7521 = arg5;
        var10.field7529 = arg4;
        var10.field7516 = arg7;
        var10.field7525 = (int) (arg6 * 4096.0F);
        if (arg3 >= -118) {
            field7384 = null;
        }
        var10.method174((byte) 31);
        class344.method2149(0, arg0, arg8);
        for (int var11 = 0; var11 < arg8; var11++) {
            var10.method3065(-117, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V", line = 252)
    public static final void method3013(byte arg0) {
        if (class352.field5196 == 2) {
            class494.field7129 = 96;
        } else {
            try {
                Method var1 = (field7387 == null ? (field7387 = method3014("java.lang.Runtime")) : field7387).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class494.field7129 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field7379++;
        if (arg0 < 104) {
            method3007(35);
        }
    }
}
