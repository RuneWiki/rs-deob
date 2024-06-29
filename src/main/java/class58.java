import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class58 extends class35 {

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field916 = 1;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[[Z")
    public static boolean[][] field915 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13] };

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Lfg;")
    public static class18 field923 = new class18(50);

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "Ljl;")
    public static class391 field937 = new class391();

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "Lub;")
    public class133 field930;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lhk;")
    public class201 field914;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Lwe;")
    public class24 field919;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Lmi;")
    public class408 field927;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
    public static final void method444(int arg0, int arg1) {
        field917++;
        if (arg1 > -56) {
            method445(108);
        }
        class221 var2 = class447.method2795(4, (byte) -49, arg0);
        var2.method1689(-108);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method445(int arg0) {
        field923 = null;
        if (arg0 != -10708) {
            field916 = -28;
        }
        field915 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public final void method446(byte arg0) {
        this.field927 = null;
        this.field919 = null;
        field926++;
        if (arg0 == 80) {
            this.field930 = null;
            this.field914 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lbr;IIIII)V")
    public static final void method447(class348 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4927 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class450.field6537[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class420 var11 = class115.field1834[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field4927; var12++) {
                            if (arg0.field4925[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field4925[arg0.field4927++] = var11;
                        if (arg0.field4927 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field4927; var13 < 4; var13++) {
            arg0.field4925[var13] = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    public static final void method448(int arg0, int arg1, int arg2) {
        field912++;
        int var3 = 48 % ((82 - arg1) / 33);
        class221 var4 = class447.method2795(5, (byte) -49, arg0);
        var4.method1692(0);
        var4.field3297 = arg2;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V")
    public static final void method449(int arg0, int arg1) {
        field910++;
        if (!class282.field4224) {
            arg1 = -1;
        }
        if (class107.field1772 == arg1 || arg0 < 63) {
            return;
        }
        if (arg1 != -1) {
            class128 var2 = class124.method1048(arg1, true);
            class344 var3 = var2.method1081(false);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class188.field2783.method1380(var3.method2223(), new Point(var2.field2091, var2.field2088), var3.method2219(), (byte) 48, var3.method2221(), class33.field475);
                class107.field1772 = arg1;
            }
        }
        if (arg1 == -1 && class107.field1772 != -1) {
            class188.field2783.method1380(-1, new Point(), (int[]) null, (byte) 48, -1, class33.field475);
            class107.field1772 = -1;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public static final void method450(int arg0) {
        field931++;
        if (class315.field4585 != null) {
            return;
        }
        int var1 = class358.field5107;
        int var2 = class284.field4259;
        int var3 = class349.field4962 - class113.field1819 - var1;
        int var4 = class311.field4526 - class277.field4170 - var2;
        if (arg0 >= var1 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class239.field3443 == null) {
                var5 = class188.field2783.field2639;
            } else {
                var5 = class239.field3443;
            }
            int var6 = 0;
            int var7 = 0;
            if (class239.field3443 == var5) {
                Insets var8 = class239.field3443.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class311.field4526);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class349.field4962, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class349.field4962 - var3, var7, var3, class311.field4526);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class311.field4526 + var7 - var4, class349.field4962, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lbr;IIII)V")
    public static final void method451(class348 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class359.method2302(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class139.field2209) {
            class359.method2302(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class359.method2302(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class436.field6353) {
            class359.method2302(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class436.field6353) {
            class359.method2302(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class139.field2209 && arg4 <= class436.field6353) {
            class359.method2302(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class359.method2302(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class139.field2209 && arg4 > 0) {
            class359.method2302(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILdp;)V")
    public static final void method452(int arg0, class174 arg1) {
        field918++;
        if (arg0 == 1) {
            class285.field4278 = arg1.method1359(arg0 ^ 0x38, "titlebg");
            class176.field2616 = arg1.method1359(76, "logo");
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
    public static final void method453(boolean arg0, int arg1) {
        field921++;
        if (arg1 != 50) {
            method445(94);
        }
        client.field3638 = arg0;
        class237.field3415 = !class122.method1034(24037);
    }
}
