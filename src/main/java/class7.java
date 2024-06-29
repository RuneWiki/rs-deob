import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 {

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "Lwd;")
    private class65 field168 = new class65();

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Ldl;")
    private class31 field154;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[J")
    public static long[] field152 = new long[100];

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "J")
    public static long field159 = 0L;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Z")
    public static boolean field160 = true;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lli;")
    public static class185 field158 = class245.method1649("Ablegen", -53);

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lli;")
    private static class185 field164 = class245.method1649("green:", -16);

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lli;")
    public static class185 field155 = field164;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Lli;")
    public static class185 field163 = class245.method1649("; Max)2Age=", -42);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Lli;")
    public static class185 field148 = field164;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lli;IIILli;Lli;)V")
    public static final void method77(class185 arg0, int arg1, int arg2, int arg3, class185 arg4, class185 arg5) {
        if (arg3 != -14486) {
            field164 = null;
        }
        field149++;
        for (int var6 = 99; var6 > 0; var6--) {
            class240.field4291[var6] = class240.field4291[var6 - 1];
            class229.field4165[var6] = class229.field4165[var6 - 1];
            class249.field4419[var6] = class249.field4419[var6 - 1];
            class254.field4509[var6] = class254.field4509[var6 - 1];
            class93.field1781[var6] = class93.field1781[var6 - 1];
        }
        class240.field4291[0] = arg1;
        class229.field4165[0] = arg0;
        class128.field2297++;
        class93.field1781[0] = arg2;
        class249.field4419[0] = arg5;
        class254.field4509[0] = arg4;
        class22.field370 = class38.field593;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZZ)V")
    public static final void method78(boolean arg0, boolean arg1) {
        for (class58 var2 = (class58) class113.field2049.method1375(16259); var2 != null; var2 = (class58) class113.field2049.method1377(-19546)) {
            if (var2.field1007 != null) {
                class90.field1744.method802(var2.field1007);
                var2.field1007 = null;
            }
            if (var2.field1013 != null) {
                class90.field1744.method802(var2.field1013);
                var2.field1013 = null;
            }
            var2.method476(-82);
        }
        field161++;
        if (arg0 || !arg1) {
            return;
        }
        for (class58 var3 = (class58) class157.field2979.method1375(16259); var3 != null; var3 = (class58) class157.field2979.method1377(-19546)) {
            if (var3.field1007 != null) {
                class90.field1744.method802(var3.field1007);
                var3.field1007 = null;
            }
            var3.method476(106);
        }
        for (class58 var4 = (class58) class262.field4641.method192(120); var4 != null; var4 = (class58) class262.field4641.method189(0)) {
            if (var4.field1007 != null) {
                class90.field1744.method802(var4.field1007);
                var4.field1007 = null;
            }
            var4.method476(-103);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method79(int arg0) {
        field148 = null;
        if (arg0 < 29) {
            return;
        }
        field158 = null;
        field155 = null;
        field164 = null;
        field152 = null;
        field163 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method80(int arg0) {
        for (class281 var2 = (class281) this.field168.method437(arg0 ^ 0xFFFFC8D5); var2 != null; var2 = (class281) this.field168.method439(arg0 + 19552)) {
            if (var2.method1472(false)) {
                var2.method476(89);
                var2.method1276((byte) 82);
                this.field150++;
            }
        }
        if (arg0 != -14113) {
            this.field168 = null;
        }
        field166++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
    public final int method81(byte arg0) {
        field167++;
        int var2 = 0;
        for (class281 var3 = (class281) this.field168.method437(10); var3 != null; var3 = (class281) this.field168.method439(5439)) {
            if (!var3.method1472(false)) {
                var2++;
            }
        }
        if (arg0 > -16) {
            return -69;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method82(int arg0, long arg1) {
        int var4 = -35 / ((arg0 - 83) / 38);
        class281 var5 = (class281) this.field154.method195(44, arg1);
        field170++;
        if (var5 == null) {
            return null;
        }
        Object var6 = var5.method1471(false);
        if (var6 == null) {
            var5.method476(-94);
            var5.method1276((byte) 82);
            this.field150++;
            return null;
        }
        if (var5.method1472(false)) {
            class280 var7 = new class280(var6);
            this.field154.method190(var7, (byte) -84, var5.field1278);
            this.field168.method436((byte) -86, var7);
            var7.field3318 = 0L;
            var5.method476(-84);
            var5.method1276((byte) 82);
        } else {
            this.field168.method436((byte) -86, var5);
            var5.field3318 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(JI)V")
    public final void method83(long arg0, int arg1) {
        if (arg1 != -22138) {
            this.method80(-110);
        }
        field165++;
        class281 var4 = (class281) this.field154.method195(27, arg0);
        if (var4 != null) {
            var4.method476(-80);
            var4.method1276((byte) 82);
            this.field150++;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method84(int arg0, long arg1, Object arg2) {
        field151++;
        this.method83(arg1, -22138);
        if (this.field150 == 0) {
            class281 var5 = (class281) this.field168.method441((byte) -47);
            var5.method476(116);
            var5.method1276((byte) 82);
        } else {
            this.field150--;
        }
        class280 var6 = new class280(arg2);
        this.field154.method190(var6, (byte) -119, arg1);
        this.field168.method436((byte) -86, var6);
        var6.field3318 = 0L;
        if (arg0 < 79) {
            this.field156 = 47;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
    public class7(int arg0) {
        this.field150 = arg0;
        this.field156 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field154 = new class31(var2);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
    public final void method85(byte arg0, int arg1) {
        field147++;
        if (class59.field1064 != null) {
            for (class281 var3 = (class281) this.field168.method437(10); var3 != null; var3 = (class281) this.field168.method439(5439)) {
                if (var3.method1472(false)) {
                    if (var3.method1471(false) == null) {
                        var3.method476(118);
                        var3.method1276((byte) 82);
                        this.field150++;
                    }
                } else if (((long) arg1) < (++var3.field3318)) {
                    class281 var4 = class59.field1064.method228(var3, (byte) -109);
                    this.field154.method190(var4, (byte) -126, var3.field1278);
                    class32.method202(var3, (byte) -14, var4);
                    var3.method476(113);
                    var3.method1276((byte) 82);
                }
            }
        }
        if (arg0 != 75) {
            this.method83(22L, -72);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
    public final void method86(int arg0) {
        this.field168.method442((byte) 74);
        this.field154.method194(1123);
        if (arg0 != 0) {
            method78(false, false);
        }
        field169++;
        this.field150 = this.field156;
    }
}
