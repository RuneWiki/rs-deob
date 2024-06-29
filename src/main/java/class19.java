import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class19 {

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lth;")
    private class288 field138;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lwa;")
    private class661 field141;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lcq;")
    public static class110 field149 = new class110(77, -1);

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Z")
    public static boolean field151 = false;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lfb;")
    public static class53 field153;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method78(int arg0, long arg1) {
        field137++;
        if (arg0 != 0) {
            method82(-24);
        }
        class691 var4 = (class691) this.field141.method3669(arg1, -1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method77(arg0 + 34168);
        if (var5 == null) {
            var4.method1922(108);
            var4.method3443(116);
            this.field148 += var4.field9713;
            return null;
        }
        if (var4.method76(5890)) {
            class170 var6 = new class170(var5, var4.field9713);
            this.field141.method3671(false, var6, var4.field4176);
            this.field138.method1680(99, var6);
            var6.field8693 = 0L;
            var4.method1922(arg0 + 121);
            var4.method3443(101);
        } else {
            this.field138.method1680(70, var4);
            var4.field8693 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I")
    public final int method79(byte arg0) {
        field150++;
        if (arg0 != 40) {
            this.field148 = 33;
        }
        return this.field146;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    public final void method80(byte arg0) {
        int var2 = 116 % ((arg0 + 6) / 58);
        field154++;
        for (class691 var3 = (class691) this.field138.method1677(101); var3 != null; var3 = (class691) this.field138.method1681(119)) {
            if (var3.method76(5890)) {
                var3.method1922(82);
                var3.method3443(117);
                this.field148 += var3.field9713;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I)V")
    public class19(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Object;JII)V")
    public final void method81(Object arg0, long arg1, int arg2, int arg3) {
        field147++;
        if (this.field146 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        if (arg3 > -60) {
            method85(null, false);
        }
        this.method91(arg1, 763848965);
        this.field148 -= arg2;
        while (this.field148 < 0) {
            class691 var7 = (class691) this.field138.method1678(true);
            this.method84(0, var7);
        }
        class170 var6 = new class170(arg0, arg2);
        this.field141.method3671(false, var6, arg1);
        this.field138.method1680(62, var6);
        var6.field8693 = 0L;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method82(int arg0) {
        field149 = null;
        field153 = null;
        if (arg0 != 763848965) {
            method82(9);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
    public final void method83(byte arg0, int arg1) {
        if (arg0 != -2) {
            this.method84(-77, null);
        }
        if (class103.field1118 != null) {
            for (class691 var3 = (class691) this.field138.method1677(82); var3 != null; var3 = (class691) this.field138.method1681(arg0 ^ 0xFFFFFF93)) {
                if (var3.method76(5890)) {
                    if (var3.method77(34168) == null) {
                        var3.method1922(102);
                        var3.method3443(arg0 + 114);
                        this.field148++;
                    }
                } else if (++var3.field8693 > (long) arg1) {
                    class691 var4 = class103.field1118.method2112(var3, arg0 + 4);
                    this.field141.method3671(false, var4, var3.field4176);
                    class91.method462(var3, 124, var4);
                    var3.method1922(arg0 ^ 0xFFFFFFB0);
                    var3.method3443(108);
                }
            }
        }
        field145++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILmga;)V")
    private final void method84(int arg0, class691 arg1) {
        if (arg0 != 0) {
            field158 = -28;
        }
        field142++;
        if (arg1 != null) {
            arg1.method1922(95);
            arg1.method3443(arg0 ^ 0x63);
            this.field148 += arg1.field9713;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method85(String arg0, boolean arg1) {
        field156++;
        int var2 = arg0.length();
        if (arg1) {
            return 88;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class180.method1097(-2740, arg0.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method86(byte arg0) {
        if (arg0 != -13) {
            this.field146 = -27;
        }
        field155++;
        class691 var2 = (class691) this.field141.method3674(126);
        while (var2 != null) {
            Object var3 = var2.method77(34168);
            if (var3 != null) {
                return var3;
            }
            class691 var4 = var2;
            var2 = (class691) this.field141.method3672(-1);
            var4.method1922(123);
            var4.method3443(arg0 ^ 0xFFFFFF9D);
            this.field148 += var4.field9713;
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
    public final int method87(int arg0) {
        field144++;
        if (arg0 != 0) {
            this.method89(57);
        }
        return this.field148;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public final void method88(int arg0) {
        field143++;
        if (arg0 <= 47) {
            this.method86((byte) 37);
        }
        this.field138.method1682(0);
        this.field141.method3667(5488);
        this.field148 = this.field146;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)I")
    public final int method89(int arg0) {
        if (arg0 >= -47) {
            return 84;
        }
        field157++;
        int var2 = 0;
        for (class691 var3 = (class691) this.field138.method1677(92); var3 != null; var3 = (class691) this.field138.method1681(124)) {
            if (!var3.method76(5890)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method90(boolean arg0) {
        if (!arg0) {
            this.method87(-71);
        }
        field152++;
        class691 var2 = (class691) this.field141.method3672(-1);
        while (var2 != null) {
            Object var3 = var2.method77(34168);
            if (var3 != null) {
                return var3;
            }
            class691 var4 = var2;
            var2 = (class691) this.field141.method3672(-1);
            var4.method1922(115);
            var4.method3443(118);
            this.field148 += var4.field9713;
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)V")
    private final void method91(long arg0, int arg1) {
        if (arg1 == 763848965) {
            field140++;
            class691 var4 = (class691) this.field141.method3669(arg0, -1);
            this.method84(0, var4);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method92(int arg0, long arg1, Object arg2) {
        this.method81(arg2, arg1, arg0, -72);
        field139++;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V")
    public class19(int arg0, int arg1) {
        this.field138 = new class288();
        this.field146 = arg0;
        this.field148 = arg0;
        int var3;
        for (var3 = 1; arg0 > var3 + var3 && var3 < arg1; var3 += var3) {
        }
        this.field141 = new class661(var3);
    }
}
