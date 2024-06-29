import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class169 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lsh;")
    public static class472 field2405 = new class472(8, 8);

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Ltl;")
    public static class400 field2409 = new class400(20);

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Ltb;")
    public static class304 field2411 = new class304(64);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field2412;

    static {
        new class332("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILcl;)V", line = 3)
    public static final void method1171(int arg0, class48 arg1) {
        class479.field6745[arg0] = arg1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILtq;)V", line = 11)
    public static final void method1172(int arg0, class63 arg1) {
        field2404++;
        if (!(class186.field2817 >= 2 || class432.field6152) || class100.field1419 != null) {
            return;
        }
        if (arg0 <= 109) {
            field2409 = null;
        }
        String var2;
        if (class432.field6152 && class186.field2817 < 2) {
            var2 = class184.field2803 + class45.field633.method2036(class4.field85, (byte) -21) + class357.field5428 + " ->";
        } else if (class193.field2944 && class296.field4445.method1100(false, 81) && class186.field2817 > 2) {
            var2 = class340.method2087(false, (class146) class451.field6377.field5951.field435.field435);
        } else {
            class146 var3 = (class146) class451.field6377.field5951.field435;
            var2 = class340.method2087(false, var3);
            int[] var4 = null;
            if (class9.method104(var3.field2056, 0)) {
                var4 = class23.field309.method2364((byte) 118, (int) var3.field2066).field2795;
            } else if (var3.field2057 != -1) {
                var4 = class23.field309.method2364((byte) 118, var3.field2057).field2795;
            } else if (class120.method851((byte) -111, var3.field2056)) {
                class349 var7 = class18.field241[(int) var3.field2066];
                if (var7 != null) {
                    class273 var8 = var7.field5309;
                    if (var8.field4107 != null) {
                        var8 = var8.method1781(class315.field4736, true);
                    }
                    if (var8 != null) {
                        var4 = var8.field4142;
                    }
                }
            } else if (class450.method2656(1008, var3.field2056)) {
                Object var5 = null;
                class271 var6;
                if (var3.field2056 == 1008) {
                    var6 = class206.field3124.method338((byte) 102, (int) var3.field2066);
                } else {
                    var6 = class206.field3124.method338((byte) 115, (int) (var3.field2066 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field4015 != null) {
                    var6 = var6.method1759(class315.field4736, true);
                }
                if (var6 != null) {
                    var4 = var6.field4029;
                }
            }
            if (var4 != null) {
                var2 = var2 + class220.method1450(-1, var4);
            }
        }
        if (class186.field2817 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class186.field2817 - 2) + class299.field4465.method2036(class4.field85, (byte) -21);
        }
        if (class475.field6647 != null) {
            class229 var10 = class475.field6647.method1237(arg1, -19010);
            if (var10 == null) {
                var10 = class462.field6513;
            }
            var10.method1486(class412.field5962, class475.field6647.field2552, class475.field6647.field2595, class475.field6647.field2625, class288.field4395, var2, class475.field6647.field2607, class408.field5919, class307.field4572, (byte) 123, class57.field799, class465.field6550, class475.field6647.field2589, class475.field6647.field2610, class163.field2265);
            class247.method1579(class412.field5962[1], class412.field5962[2], -2472, class412.field5962[0], class412.field5962[3]);
        } else if (class157.field2192 != null && class13.field195 == class124.field1710) {
            int var9 = class462.field6513.method1506(0, 16777215, class199.field3008 + 16, class163.field2265, class184.field2802 + 4, var2, false, class57.field799, class408.field5919, class288.field4395);
            class247.method1579(class199.field3008, class131.field1828.method3(var2, (byte) 92) + var9, -2472, class184.field2802 + 4, 16);
            return;
        }
    }

    @OriginalMember(owner = "client!eh", name = "toString", descriptor = "()Ljava/lang/String;", line = 116)
    public final String toString() {
        field2406++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 124)
    public static void method1173(int arg0) {
        if (arg0 != 8) {
            field2405 = null;
        }
        field2409 = null;
        field2405 = null;
        field2411 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 137)
    public static final void method1174(int arg0, int arg1) {
        class171.field2435 = 1000 / arg1;
        field2410++;
        if (arg0 != -2433) {
            method1174(-69, 49);
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V", line = 155)
    public class169(int arg0, int arg1) {
        this.field2407 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 166)
    public static final void method1175(String arg0, int arg1) {
        System.out.println("Error: " + class467.method2739("\n", arg0, 17186, "%0a"));
        if (arg1 <= 55) {
            method1174(-102, -124);
        }
        field2408++;
    }
}
