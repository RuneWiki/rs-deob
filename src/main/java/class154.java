import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class154 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2281 = 0;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
    public static boolean field2289 = true;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ltj;")
    public static class108 field2284;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Ltj;")
    public static class108 field2286;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lug;")
    public static class335 field2285;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 5)
    public static void method1132(int arg0) {
        field2284 = null;
        field2285 = null;
        if (arg0 > 94) {
            field2286 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 28)
    public static final void method1135(String arg0, byte arg1) {
        if (arg1 >= -108) {
            field2284 = null;
        }
        field2283++;
        class373.method2391("", -1, 0, 0, arg0, "");
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 50)
    public static final void method1138(byte arg0) {
        if (arg0 != 107) {
            method1141(121);
        }
        field2287++;
        class187.field2662 = null;
        class407.method2558(0, -1, class24.field307, class316.field4643, 0, 0, false, 0, class265.field3898);
        if (class187.field2662 != null) {
            class242.method1653(class97.field1235, class24.field307, 0, class187.field2662, 0, class70.field935, class316.field4643, -1412584499, 15, class363.field5212.field3233);
            class187.field2662 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V", line = 72)
    public static final void method1141(int arg0) {
        field2290++;
        for (class359 var1 = (class359) class335.field4860.method2752(-69); var1 != null; var1 = (class359) class335.field4860.method2754(arg0 ^ 0xFFFF8F75)) {
            class431 var2 = var1.field5180;
            if (class158.field2302 != var2.field4464 || class34.field434 > var2.field6124) {
                var1.method2660((byte) 113);
                var2.method2690(arg0 - 35188);
            } else if (class34.field434 >= var2.field6136) {
                if (var2.field6140 > 0) {
                    class446 var3 = class442.field6317[var2.field6140 - 1];
                    if (var3 != null && var3.field4463 >= 0 && class80.field1034 * 128 > var3.field4463 && var3.field4466 >= 0 && (class381.field5414 * 128) > var3.field4466) {
                        var2.method2688(var3.field4466, var3.field4463, class452.method2820(var2.field4464, var3.field4466, false, var3.field4463) - var2.field6143, class34.field434, 89);
                    }
                }
                if (var2.field6140 < 0) {
                    int var4 = -var2.field6140 - 1;
                    class128 var5;
                    if (class302.field4417 == var4) {
                        var5 = class181.field2555;
                    } else {
                        var5 = class243.field3596[var4];
                    }
                    if (var5 != null && var5.field4463 >= 0 && var5.field4463 < (class80.field1034 * 128) && var5.field4466 >= 0 && class381.field5414 * 128 > var5.field4466) {
                        var2.method2688(var5.field4466, var5.field4463, class452.method2820(var2.field4464, var5.field4466, false, var5.field4463) - var2.field6143, class34.field434, arg0 ^ 0x70C4);
                    }
                }
                var2.method2687(class239.field3529, (byte) -88);
                class196.method1395(var2, true);
            }
        }
        if (arg0 != 28810) {
            method1138((byte) 14);
        }
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)Lmd;", line = 140)
    public static final class323 method1146(int arg0) {
        if (arg0 < 123) {
            field2284 = null;
        }
        field2282++;
        try {
            return (class323) Class.forName("mr").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public abstract void method1131(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
    public abstract void method1133(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
    public abstract void method1134(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
    public abstract void method1136(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
    public abstract void method1137();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ls;)V")
    public abstract void method1139(class154 arg0);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public abstract void method1140(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public abstract void method1143(int arg0);

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
    public abstract void method1144(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([I)V")
    public abstract void method1145(int[] arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[I)V")
    public abstract void method1147(int arg0, int arg1, int arg2, int[] arg3);
}
