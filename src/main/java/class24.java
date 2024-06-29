import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class24 {

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lsk;")
    private class170 field307 = new class170();

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lhc;")
    public static class368 field304 = new class368("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field309 = 0;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field312 = -1;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Ljava/lang/String;")
    public static String field308 = null;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lsk;")
    private class170 field313;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "[I")
    public static int[] field310;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 4)
    public static final void method143(byte arg0) {
        if (arg0 > -74) {
            return;
        }
        while (class75.field1068.method1145(8, class213.field2982) >= 11) {
            int var1 = class75.field1068.method1146((byte) -109, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class87.field1227[var1] == null) {
                class87.field1227[var1] = new class423();
                class87.field1227[var1].field2622 = var1;
                var2 = true;
                if (class149.field2170[var1] != null) {
                    class87.field1227[var1].method2615(class149.field2170[var1], (byte) -35);
                }
            }
            class18.field243[class11.field86++] = var1;
            class423 var3 = class87.field1227[var1];
            var3.field2575 = class246.field3467;
            int var4 = class75.field1068.method1146((byte) -86, 1);
            if (var4 == 1) {
                class251.field3505[class418.field5783++] = var1;
            }
            int var5 = class75.field1068.method1146((byte) -120, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class75.field1068.method1146((byte) -102, 1);
            int var7 = class111.field1716[class75.field1068.method1146((byte) -91, 3)];
            int var8 = class75.field1068.method1146((byte) -76, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            if (var2) {
                var3.method1290(var7, 0);
            }
            var3.method2609(var6 == 1, class359.field4970.field2662[0] + var5, class343.field4623, class359.field4970.field2659[0] + var8, (byte) 92);
        }
        field302++;
        class75.field1068.method1147((byte) -76);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIBZ)V", line = 73)
    public static final void method144(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        if (arg3 >= -7) {
            return;
        }
        field297++;
        if (class22.field284 == 0) {
            class387.method2383(false, false);
        } else {
            class422.field5842 = class22.field284;
            class90.method715(107, 0);
        }
        class278.field3790 = arg4;
        class2.field11 = arg1;
        class423.field5881 = arg2;
        class333.method2031(arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lsk;Z)V", line = 96)
    public final void method145(class170 arg0, boolean arg1) {
        field301++;
        if (arg0.field2408 != null) {
            arg0.method1213((byte) 106);
        }
        arg0.field2408 = this.field307.field2408;
        if (!arg1) {
            arg0.field2409 = this.field307;
            arg0.field2408.field2409 = arg0;
            arg0.field2409.field2408 = arg0;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)Lsk;", line = 113)
    public final class170 method146(byte arg0) {
        if (arg0 != 121) {
            field310 = null;
        }
        field300++;
        class170 var2 = this.field307.field2409;
        if (this.field307 == var2) {
            return null;
        } else {
            var2.method1213((byte) 106);
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 143)
    public static void method147(int arg0) {
        if (arg0 != -4154) {
            field312 = 69;
        }
        field304 = null;
        field310 = null;
        field308 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Lsk;", line = 156)
    public final class170 method148(int arg0) {
        if (arg0 != 5) {
            return null;
        }
        field299++;
        class170 var2 = this.field313;
        if (this.field307 == var2) {
            this.field313 = null;
            return null;
        } else {
            this.field313 = var2.field2409;
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)I", line = 179)
    public final int method149(byte arg0) {
        field306++;
        if (arg0 > -103) {
            return -87;
        }
        int var2 = 0;
        class170 var3 = this.field307.field2409;
        while (this.field307 != var3) {
            var3 = var3.field2409;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLij;)V", line = 203)
    public static final void method150(byte arg0, class316 arg1) {
        field305++;
        if (arg0 != -81) {
            field308 = null;
        }
        class300.field4102 = arg1;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V", line = 224)
    public final void method151(int arg0) {
        field303++;
        while (true) {
            class170 var2 = this.field307.field2409;
            if (this.field307 == var2) {
                if (arg0 <= 64) {
                    field304 = null;
                }
                this.field313 = null;
                return;
            }
            var2.method1213((byte) 106);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 277)
    public class24() {
        this.field307.field2408 = this.field307;
        this.field307.field2409 = this.field307;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)Lsk;", line = 248)
    public final class170 method152(int arg0) {
        field298++;
        class170 var2 = this.field307.field2409;
        if (this.field307 == var2) {
            this.field313 = null;
            return null;
        } else {
            int var3 = -124 % ((-arg0 - 3) / 35);
            this.field313 = var2.field2409;
            return var2;
        }
    }
}
