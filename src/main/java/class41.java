import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class41 {

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lok;")
    public static class146 field733 = class235.method1724(-12908, "Memory before cleanup=");

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lje;")
    public static class70 field727;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 10)
    public static final void method290(int arg0) {
        field729++;
        class280.field4809.method791(8);
        class122.field2001.method791(8);
        if (arg0 != 4) {
            field727 = (class70) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 23)
    public static final void method291(byte arg0, Component arg1) {
        if (arg0 < 73) {
            field727 = (class70) null;
        }
        arg1.addMouseListener(class66.field1117);
        field730++;
        arg1.addMouseMotionListener(class66.field1117);
        arg1.addFocusListener(class66.field1117);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIII)V", line = 36)
    public static final void method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0 && arg7 >= 0 && arg5 < 103 && arg7 < 103) {
            if (arg0 == 0) {
                class278 var8 = class280.method2033(arg6, arg5, arg7);
                if (var8 != null) {
                    int var9 = (int) (var8.field4780 >>> 32) & Integer.MAX_VALUE;
                    if (arg4 == 2) {
                        var8.field4779 = new class161(var9, 2, arg3 + 4, arg6, arg5, arg7, arg2, false, var8.field4779);
                        var8.field4774 = new class161(var9, 2, arg3 + 1 & 0x3, arg6, arg5, arg7, arg2, false, var8.field4774);
                    } else {
                        var8.field4779 = new class161(var9, arg4, arg3, arg6, arg5, arg7, arg2, false, var8.field4779);
                    }
                }
            }
            if (arg0 == 1) {
                class19 var10 = class268.method1948(arg6, arg5, arg7);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field364 >>> 32);
                    if (arg4 == 4 || arg4 == 5) {
                        var10.field371 = new class161(var11, 4, arg3, arg6, arg5, arg7, arg2, false, var10.field371);
                    } else if (arg4 == 6) {
                        var10.field371 = new class161(var11, 4, arg3 + 4, arg6, arg5, arg7, arg2, false, var10.field371);
                    } else if (arg4 == 7) {
                        var10.field371 = new class161(var11, 4, (arg3 + 2 & 0x3) + 4, arg6, arg5, arg7, arg2, false, var10.field371);
                    } else if (arg4 == 8) {
                        var10.field371 = new class161(var11, 4, arg3 + 4, arg6, arg5, arg7, arg2, false, var10.field371);
                        var10.field373 = new class161(var11, 4, (arg3 + 2 & 0x3) + 4, arg6, arg5, arg7, arg2, false, var10.field373);
                    }
                }
            }
            if (arg0 == 2) {
                if (arg4 == 11) {
                    arg4 = 10;
                }
                class311 var12 = class40.method285(arg6, arg5, arg7);
                if (var12 != null) {
                    var12.field5300 = new class161(Integer.MAX_VALUE & (int) (var12.field5289 >>> 32), arg4, arg3, arg6, arg5, arg7, arg2, false, var12.field5300);
                }
            }
            if (arg0 == 3) {
                class164 var13 = class98.method683(arg6, arg5, arg7);
                if (var13 != null) {
                    var13.field2785 = new class161((int) (var13.field2787 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg6, arg5, arg7, arg2, false, var13.field2785);
                }
            }
        }
        if (arg1 != 103) {
            method294(94, 106, -89, -41, -115);
        }
        field731++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)I", line = 124)
    public static final int method293(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1) {
            field733 = (class146) null;
        }
        field726++;
        if (arg0 == arg2) {
            return arg2;
        } else {
            int var4 = 128 - arg3;
            int var5 = (arg0 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00;
            int var6 = ((arg2 & 0xFF00FF00) >>> 7) * var4 + (arg0 >>> 7 & 0x1FE01FE) * arg3 & 0xFF00FF00;
            return var6 + (var5 >> 7);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)Z", line = 151)
    public static final boolean method294(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class72.field1175 * arg0 + class293.field4978 * arg3 >> 16;
        int var6 = class72.field1175 * arg3 - class293.field4978 * arg0 >> 16;
        int var7 = class180.field3020 * arg1 + class138.field2295 * var6 >> 16;
        int var8 = class138.field2295 * arg1 - class180.field3020 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class180.field3020 * arg2 + class138.field2295 * var6 >> 16;
        int var12 = class138.field2295 * arg2 - class180.field3020 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class120.field1970 && var13 < class120.field1970) {
            return false;
        } else if (var9 > class167.field2822 && var13 > class167.field2822) {
            return false;
        } else if (var10 < class137.field2281 && var14 < class137.field2281) {
            return false;
        } else {
            return var10 <= class148.field2512 || var14 <= class148.field2512;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIZIIII)V", line = 204)
    public static final void method295(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class197[] var7 = class216.field3569;
        if (!arg2) {
            field733 = (class146) null;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class197 var9 = var7[var8];
            if (var9 != null && var9.field3285 == 2) {
                class214.method1597((var9.field3279 - class201.field3357 << 7) + var9.field3284, arg3, -304494096, arg5 >> 1, arg4 >> 1, (var9.field3277 - class15.field300 << 7) + var9.field3286, arg6, var9.field3283 * 2);
                if (class51.field920 > -1 && class203.field3385 % 20 < 10) {
                    class126.field2056[var9.field3288].method47(arg1 + class51.field920 - 12, class303.field5207 + -28 + arg0);
                }
            }
        }
        field732++;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 235)
    public static void method296(int arg0) {
        if (arg0 < 11) {
            method293(-48, -28, -64, -19);
        }
        field727 = null;
        field733 = null;
    }
}
