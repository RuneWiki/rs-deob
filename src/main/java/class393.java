import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class393 extends class238 {

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "Lpr;")
    public static class407 field5236 = new class407(37, 6);

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "[I")
    public static int[] field5238 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "Ljda;")
    public static class207 field5239 = new class207("runescape", 0);

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public int field5231;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public int field5232;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public int field5233;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public int field5237;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Lfp;")
    public class292 field5230;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "Ljo;")
    public static class303 field5240;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lfp;I)V")
    public static final void method2142(class292 arg0, int arg1) {
        field5235++;
        int var2 = 10 / ((-arg1 - 65) / 49);
        if (arg0 instanceof class625) {
            class625 var3 = (class625) arg0;
            if (var3.field8855 != null) {
                class111.method695(class377.field4914.field4638 != var3.field4638, 70, var3);
                return;
            }
        } else if ((arg0 instanceof class455)) {
            class455 var4 = (class455) arg0;
            class315.method1779(var4, class377.field4914.field4638 != var4.field4638, -72);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lfu;)V")
    public static final void method2143(class354 arg0) {
        for (int var1 = arg0.field4642; var1 <= arg0.field4645; var1++) {
            for (int var2 = arg0.field4648; var2 <= arg0.field4639; var2++) {
                class287 var3 = class97.field1074[arg0.field4638][var1][var2];
                if (var3 != null) {
                    class60 var4 = var3.field3680;
                    class60 var5 = null;
                    while (var4 != null) {
                        if (var4.field625 == arg0) {
                            if (var5 == null) {
                                var3.field3680 = var4.field623;
                            } else {
                                var5.field623 = var4.field623;
                            }
                            var4.method403((byte) -77);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field623;
                    }
                    var3.field3679 = 0;
                    for (class60 var6 = var3.field3680; var6 != null; var6 = var6.field623) {
                        var3.field3679 = (byte) (var3.field3679 | var6.field624);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
    public static final void method2144(int arg0) {
        int var1 = -7 / ((62 - arg0) / 57);
        field5234++;
        for (class319 var2 = (class319) class369.field4792.method3174((byte) 49); var2 != null; var2 = (class319) class369.field4792.method3168(false)) {
            class132 var3 = var2.field4127;
            if (var3.field1490) {
                var2.method1519((byte) 121);
                var3.method741((byte) -97);
            } else if (class469.field6549 >= var3.field1488) {
                var3.method744(14723, class233.field2978);
                if (var3.field1490) {
                    var2.method1519((byte) 121);
                } else {
                    class223.method1309(var3, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)V")
    public static void method2145(int arg0) {
        field5239 = null;
        if (arg0 != 2) {
            field5236 = null;
        }
        field5238 = null;
        field5236 = null;
        field5240 = null;
    }
}
