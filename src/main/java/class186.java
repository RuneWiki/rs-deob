import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class186 {

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field3414 = 0;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field3417 = -1;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lle;")
    public class234 field3413;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lqh;")
    public static class69 field3408;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[I")
    public int[] field3411;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "[I")
    public static int[] field3416;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[Lvf;")
    public static class71[] field3410;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1372(int arg0) {
        field3410 = null;
        field3408 = null;
        if (arg0 == 0) {
            field3416 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method1373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg5;
            arg5 = var7;
        }
        int var8 = arg3 & 0x3;
        field3418++;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg0 - arg1;
        } else {
            if (arg6 != 62) {
                field3414 = -10;
            }
            return 7 + 1 - arg5 - arg4;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z")
    public static final boolean method1374(byte arg0) {
        field3407++;
        if (class135.field2617 != 0) {
            try {
                class93.field1751.method1189(class169.field3090.field3055, (byte) -108);
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 > -31;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
    public static final void method1375(int arg0, int arg1, int arg2, int arg3) {
        class144 var4 = class259.field4542[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class93 var5 = var4.field2742;
        if (var5 != null) {
            var5.field1756 = var5.field1756 * arg3 / 16;
            var5.field1769 = var5.field1769 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Component;III)Lfj;")
    public static final class90 method1376(Component arg0, int arg1, int arg2, int arg3) {
        field3419++;
        try {
            Class var4 = Class.forName("ua");
            class90 var5 = (class90) var4.getDeclaredConstructor().newInstance();
            if (arg3 != 2047) {
                method1372(38);
            }
            var5.method697(arg3 - 1977, arg2, arg1, arg0);
            return var5;
        } catch (Throwable var7) {
            class220 var6 = new class220();
            var6.method697(74, arg2, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([Lqh;IB)V")
    public static final void method1377(class69[] arg0, int arg1, byte arg2) {
        int var3 = 37 % ((-arg2 - 23) / 48);
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class69 var5 = arg0[var4];
            if (var5 != null && var5.field1302 == arg1 && (!var5.field1240 || !client.method839(var5))) {
                if (var5.field1294 == 0) {
                    if (!var5.field1240 && client.method839(var5) && field3408 != var5) {
                        continue;
                    }
                    method1377(arg0, var5.field1188, (byte) -86);
                    if (var5.field1291 != null) {
                        method1377(var5.field1291, var5.field1188, (byte) 70);
                    }
                    class222 var6 = (class222) class92.field1739.method1743((long) var5.field1188, false);
                    if (var6 != null) {
                        class96.method763(var6.field4049, (byte) 46);
                    }
                }
                if (var5.field1294 == 6) {
                    if (var5.field1192 != -1 || var5.field1261 != -1) {
                        boolean var7 = class24.method159(true, var5);
                        int var8;
                        if (var7) {
                            var8 = var5.field1261;
                        } else {
                            var8 = var5.field1192;
                        }
                        if (var8 != -1) {
                            class18 var9 = class212.method1511(var8, -1);
                            if (var9 != null) {
                                var5.field1288 += class52.field877;
                                while (var5.field1288 > var9.field268[var5.field1252]) {
                                    var5.field1288 -= var9.field268[var5.field1252];
                                    var5.field1252++;
                                    if (var5.field1252 >= var9.field265.length) {
                                        var5.field1252 -= var9.field271;
                                        if (var5.field1252 < 0 || var9.field265.length <= var5.field1252) {
                                            var5.field1252 = 0;
                                        }
                                    }
                                    class213.method1517((byte) 11, var5);
                                }
                            }
                        }
                    }
                    if (var5.field1322 != 0 && !var5.field1240) {
                        int var10 = var5.field1322 >> 16;
                        int var11 = var5.field1322 << 16 >> 16;
                        int var12 = class52.field877 * var11;
                        var5.field1227 = var5.field1227 + var12 & 0x7FF;
                        int var13 = class52.field877 * var10;
                        var5.field1193 = var5.field1193 + var13 & 0x7FF;
                        class213.method1517((byte) 11, var5);
                    }
                }
            }
        }
        field3409++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lpg;B)Lka;")
    public static final class6 method1378(class81 arg0, byte arg1) {
        field3412++;
        int var2 = -128 / ((arg1 + 81) / 41);
        return new class6(arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method615(-116), arg0.method622(true));
    }
}
