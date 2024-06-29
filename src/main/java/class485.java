import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class485 extends class425 {

    @OriginalMember(owner = "client!baa", name = "x", descriptor = "Lqfa;")
    public static class85 field6946 = new class85(90, -2);

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!baa", name = "s", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!baa", name = "t", descriptor = "I")
    public int field6942;

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!baa", name = "w", descriptor = "I")
    public int field6945;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "[I")
    public int[] field6936;

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "[I")
    public int[] field6937;

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "[I")
    public int[] field6938;

    @OriginalMember(owner = "client!baa", name = "y", descriptor = "[Li;")
    public static class37[] field6947;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "[Lkp;")
    public class456[] field6932;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "[Lkp;")
    public class456[] field6933;

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "[[[B")
    public byte[][][] field6943;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "()V")
    public static final void method2924() {
        for (int var0 = class294.field4412; var0 < class148.field2557; var0++) {
            for (int var1 = 0; var1 < class520.field7369; var1++) {
                for (int var2 = 0; var2 < class107.field1852; var2++) {
                    class370 var3 = class257.field3792[var0][var1][var2];
                    if (var3 != null) {
                        class624 var4 = var3.field5491;
                        class624 var5 = var3.field5493;
                        if (var4 != null && var4.method447(-118)) {
                            class321.method2065(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method447(-105)) {
                                class321.method2065(var5, var0, var1, var2, 1, 1);
                                var5.method455(0, -1008, var4, 0, 0, class521.field7381, false);
                                var5.method448(-15);
                            }
                            var4.method448(-128);
                        }
                        for (class636 var6 = var3.field5497; var6 != null; var6 = var6.field9171) {
                            class122 var8 = var6.field9172;
                            if (var8 != null && var8.method447(-27)) {
                                class321.method2065(var8, var0, var1, var2, var8.field2227 + 1 - var8.field2220, var8.field2222 - var8.field2230 + 1);
                                var8.method448(-18);
                            }
                        }
                        class219 var7 = var3.field5494;
                        if (var7 != null && var7.method447(-58)) {
                            class596.method3398(var7, var0, var1, var2);
                            var7.method448(-116);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BI)Z")
    public static final boolean method2925(byte arg0, int arg1) {
        field6939++;
        if (arg0 > -125) {
            method2926(-74, -41, (char) 65532);
        }
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIC)C")
    public static final char method2926(int arg0, int arg1, char arg2) {
        field6941++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        }
        if (arg0 != -221) {
            field6946 = null;
        }
        if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljava/awt/Canvas;ILfa;I)Lr;")
    public static final class167 method2927(Canvas arg0, int arg1, class214 arg2, int arg3) {
        field6940++;
        return arg1 == -581 ? new class1(arg0, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B[SI)[S")
    public static final short[] method2928(byte arg0, short[] arg1, int arg2) {
        field6934++;
        if (arg0 == 88) {
            short[] var3 = new short[arg2];
            class692.method3876(arg1, 0, var3, 0, arg2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
    public static void method2929(int arg0) {
        field6947 = null;
        if (arg0 != 18431) {
            field6947 = null;
        }
        field6946 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIB)V")
    public static final void method2930(int arg0, int arg1, byte arg2) {
        field6944++;
        class19 var3 = class373.method2355(79, arg1, 16);
        int var4 = -73 / ((arg2 + 37) / 40);
        var3.method432(52);
        var3.field829 = arg0;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIZB)V")
    public static final void method2931(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        if (arg4 >= -36) {
            method2924();
        }
        class309.field4560 = 0L;
        field6935++;
        int var5 = class601.method3434(true);
        if (arg1 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class623.field9017.method147()) {
            arg3 = true;
        }
        class72.method792(arg2, arg0, arg1, arg3, 0, var5);
    }
}
