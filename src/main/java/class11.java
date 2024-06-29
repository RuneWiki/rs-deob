import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class11 {

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lvi;")
    private class476 field185 = new class476();

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Ljr;")
    private class357 field192;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field172 = 0;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Ldn;")
    public static class201 field179;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lbv;")
    public static class466 field190;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method76(byte arg0) {
        field190 = null;
        int var1 = 56 / ((-arg0 - 7) / 61);
        field179 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method77(int arg0) {
        field191++;
        if (class460.field6432 != null) {
            return;
        }
        int var1 = class351.field4495;
        int var2 = class509.field7474;
        int var3 = class403.field5424 - class23.field419 - var1;
        int var4 = class18.field303 - class92.field1281 - var2;
        if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class516.field7590 == null) {
                    var5 = class172.field2221.field6139;
                } else {
                    var5 = class516.field7590;
                }
                int var6 = 0;
                int var7 = 0;
                if (class516.field7590 == var5) {
                    Insets var8 = class516.field7590.getInsets();
                    var7 = var8.top;
                    var6 = var8.left;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var6, var7, var1, class18.field303);
                }
                if (var2 > 0) {
                    var9.fillRect(var6, var7, class403.field5424, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(var6 + class403.field5424 - var3, var7, var3, class18.field303);
                }
                if (var4 > 0) {
                    var9.fillRect(var6, class18.field303 + var7 - var4, class403.field5424, var4);
                }
            } catch (Exception var11) {
            }
        }
        int var10 = -109 % ((arg0 - 29) / 60);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method78(long arg0, byte arg1) {
        field194++;
        class377 var4 = (class377) this.field192.method2085(arg0, -5423);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1061((byte) 45);
        if (var5 == null) {
            var4.method3021(44);
            var4.method540((byte) -85);
            this.field187 += var4.field4898;
            return null;
        }
        if (arg1 > -84) {
            this.field192 = null;
        }
        if (var4.method1060(-127)) {
            class157 var6 = new class157(var5, var4.field4898);
            this.field192.method2096(var4.field7456, var6, (byte) 76);
            this.field185.method2858(15, var6);
            var6.field1143 = 0L;
            var4.method3021(-108);
            var4.method540((byte) 126);
        } else {
            this.field185.method2858(15, var4);
            var4.field1143 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
    public final int method79(int arg0) {
        field174++;
        return arg0 < 28 ? 29 : this.field178;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public final void method80(int arg0, int arg1) {
        field182++;
        if (class513.field7542 != null) {
            for (class377 var3 = (class377) this.field185.method2860(0); var3 != null; var3 = (class377) this.field185.method2856(false)) {
                if (var3.method1060(122)) {
                    if (var3.method1061((byte) 45) == null) {
                        var3.method3021(50);
                        var3.method540((byte) -16);
                        this.field187++;
                    }
                } else if (++var3.field1143 > (long) arg1) {
                    class377 var4 = class513.field7542.method290(var3, false);
                    this.field192.method2096(var3.field7456, var4, (byte) 76);
                    class388.method2312(var4, true, var3);
                    var3.method3021(-96);
                    var3.method540((byte) 124);
                }
            }
        }
        if (arg0 > -22) {
            field172 = 108;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lqt;B)V")
    public static final void method81(class295 arg0, byte arg1) {
        if (arg1 != -58) {
            return;
        }
        field176++;
        for (class72 var2 = (class72) class368.field4741.method49(arg1 - 47); var2 != null; var2 = (class72) class368.field4741.method46((byte) 15)) {
            if (var2.field891 == arg0) {
                if (var2.field886 != null) {
                    class18.field313.method1890(var2.field886);
                    var2.field886 = null;
                }
                var2.method3021(arg1 - 50);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method82(byte arg0) {
        if (arg0 != 23) {
            return null;
        }
        field175++;
        class377 var2 = (class377) this.field192.method2091(-123);
        while (var2 != null) {
            Object var3 = var2.method1061((byte) 45);
            if (var3 != null) {
                return var3;
            }
            class377 var4 = var2;
            var2 = (class377) this.field192.method2091(arg0 - 145);
            var4.method3021(-96);
            var4.method540((byte) 120);
            this.field187 += var2.field4898;
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)V")
    private final void method83(long arg0, int arg1) {
        field188++;
        class377 var4 = (class377) this.field192.method2085(arg0, -5423);
        this.method87(var4, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public final void method84(int arg0) {
        int var2 = -99 / ((-arg0 - 2) / 51);
        for (class377 var3 = (class377) this.field185.method2860(0); var3 != null; var3 = (class377) this.field185.method2856(false)) {
            if (var3.method1060(-128)) {
                var3.method3021(118);
                var3.method540((byte) 123);
                this.field187 += var3.field4898;
            }
        }
        field193++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)I")
    public final int method85(boolean arg0) {
        field181++;
        if (!arg0) {
            this.method88(96L, -91, null);
        }
        return this.field187;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I")
    public final int method86(byte arg0) {
        field180++;
        int var2 = 0;
        for (class377 var3 = (class377) this.field185.method2860(0); var3 != null; var3 = (class377) this.field185.method2856(false)) {
            if (!var3.method1060(-125)) {
                var2++;
            }
        }
        if (arg0 != -14) {
            field179 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljo;I)V")
    private final void method87(class377 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method3021(94);
            arg0.method540((byte) -121);
            this.field187 += arg0.field4898;
        }
        if (arg1 != 0) {
            field190 = null;
        }
        field177++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method88(long arg0, int arg1, Object arg2) {
        if (arg1 < 25) {
            this.method87(null, -79);
        }
        this.method89(1, (byte) -67, arg2, arg0);
        field189++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLjava/lang/Object;J)V")
    private final void method89(int arg0, byte arg1, Object arg2, long arg3) {
        field186++;
        if (this.field178 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method83(arg3, 0);
        this.field187 -= arg0;
        while (this.field187 < 0) {
            class377 var7 = (class377) this.field185.method2861((byte) -124);
            this.method87(var7, 0);
        }
        if (arg1 >= -34) {
            field179 = null;
        }
        class157 var6 = new class157(arg2, arg0);
        this.field192.method2096(arg3, var6, (byte) 76);
        this.field185.method2858(15, var6);
        var6.field1143 = 0L;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public final void method90(byte arg0) {
        if (arg0 != -27) {
            method76((byte) 39);
        }
        this.field185.method2862(97);
        field184++;
        this.field192.method2088((byte) 116);
        this.field187 = this.field178;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I)V")
    public class11(int arg0) {
        this.field187 = arg0;
        this.field178 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field192 = new class357(var2);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method91(int arg0) {
        field183++;
        class377 var2 = (class377) this.field192.method2087(arg0 ^ arg0);
        while (var2 != null) {
            Object var3 = var2.method1061((byte) 45);
            if (var3 != null) {
                return var3;
            }
            class377 var4 = var2;
            var2 = (class377) this.field192.method2091(arg0 + 3988);
            var4.method3021(110);
            var4.method540((byte) -126);
            this.field187 += var2.field4898;
        }
        return null;
    }
}
