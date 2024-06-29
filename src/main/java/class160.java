import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class160 extends class383 {

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "Z")
    public boolean field2040 = false;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public int field2035 = -1;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field2037 = 1;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "Z")
    public static boolean field2032 = false;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "Lap;")
    public static class335 field2042 = new class335("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "Ldq;")
    public static class493 field2044 = new class493(80, -1);

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "Lap;")
    public static class335 field2046 = new class335("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILwg;[I[I[I)V")
    public static final void method1030(int arg0, class295 arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var5 = arg0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && arg1.field4909.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field4909[var9] = null;
                    } else {
                        class415 var10 = class404.field5756.method557(var6, arg0 ^ 0xF);
                        int var11 = var10.field5931;
                        class203 var12 = arg1.field4909[var9];
                        if (var12 != null) {
                            if (var12.field2638 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field4909[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2637 = var8;
                                    var12.field2640 = 0;
                                    var12.field2635 = 0;
                                    var12.field2642 = 0;
                                    var12.field2645 = 1;
                                    class334.method1931(arg1.field2666, (byte) 106, var10, arg1.field2676, false, 0, arg1.field2677);
                                } else if (var11 == 2) {
                                    var12.field2635 = 0;
                                }
                            } else if (var10.field5913 >= class404.field5756.method557(var12.field2638, 15).field5913) {
                                var12 = arg1.field4909[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class203 var13 = arg1.field4909[var9] = new class203();
                            var13.field2640 = 0;
                            var13.field2637 = var8;
                            var13.field2638 = var6;
                            var13.field2635 = 0;
                            var13.field2642 = 0;
                            var13.field2645 = 1;
                            class334.method1931(arg1.field2666, (byte) 111, var10, arg1.field2676, false, 0, arg1.field2677);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field2045++;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field2044 = null;
        field2042 = null;
        if (arg0 != -1) {
            method1032((byte) 71);
        }
        field2046 = null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
    public static final void method1032(byte arg0) {
        field2033++;
        if (class24.field347 != null) {
            return;
        }
        int var1 = class468.field6762;
        if (arg0 != 75) {
            return;
        }
        int var2 = class252.field3218;
        int var3 = class250.field3209 - var1 - class174.field2262;
        int var4 = class3.field33 - class390.field5236 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class123.field1656 == null) {
                var5 = class219.field2794.field6891;
            } else {
                var5 = class123.field1656;
            }
            int var6 = 0;
            int var7 = 0;
            if (class123.field1656 == var5) {
                Insets var8 = class123.field1656.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class3.field33);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class250.field3209, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class250.field3209 + var6 - var3, var7, var3, class3.field33);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class3.field33 + var7 - var4, class250.field3209, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)Lbh;")
    public static final class28 method1033(byte arg0) {
        field2038++;
        if (arg0 > -18) {
            field2046 = null;
        }
        try {
            return (class28) Class.forName("ao").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "([IIIIIIBLis;IZIII[II)I")
    public static final int method1034(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class348 arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        field2041++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class203.field2644[var15][var35] = 0;
                class315.field4018[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg5 == 1) {
            var16 = class528.method3137(arg7, arg10, arg4, arg12, arg8, arg1, arg2, arg11, arg14, arg3, 127);
        } else if (arg5 == 2) {
            var16 = class117.method844(arg12, arg7, arg10, arg11, -2, arg8, arg1, arg2, arg14, arg3, arg4);
        } else {
            var16 = class226.method1376(arg4, arg14, arg8, (byte) -6, arg12, arg7, arg5, arg11, arg10, arg2, arg1, arg3);
        }
        int var17 = arg11 - 64;
        int var18 = arg1 - 64;
        int var19 = class531.field7812;
        int var20 = class391.field5262;
        if (!var16) {
            if (!arg9) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg12 - var23; var24 <= (arg12 + var23); var24++) {
                for (int var25 = arg10 - var23; var25 <= arg10 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class315.field4018[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg12 > var24) {
                            var28 = arg12 - var24;
                        } else if ((arg4 + arg12 - 1) < var24) {
                            var28 = var24 + 1 - arg12 - arg4;
                        }
                        int var29 = 0;
                        if (var25 < arg10) {
                            var29 = arg10 - var25;
                        } else if (arg10 + arg8 - 1 < var25) {
                            var29 = var25 + 1 - arg10 - arg8;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class315.field4018[var26][var27]) {
                            var22 = class315.field4018[var26][var27];
                            var21 = var30;
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg11 == var19 && arg1 == var20) {
            return 0;
        }
        if (arg6 != 72) {
            field2042 = null;
        }
        byte var31 = 0;
        class448.field6412[var31] = var19;
        int var37 = var31 + 1;
        class85.field1069[var31] = var20;
        int var32;
        int var33 = var32 = class203.field2644[var19 - var17][var20 - var18];
        while (arg11 != var19 || arg1 != var20) {
            if (var32 != var33) {
                class448.field6412[var37] = var19;
                var32 = var33;
                class85.field1069[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class203.field2644[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg13[var34] = class448.field6412[var37];
            arg0[var34++] = class85.field1069[var37];
            if (var34 >= arg13.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(I)V")
    public class160(int arg0) {
        this.field2035 = arg0;
    }
}
