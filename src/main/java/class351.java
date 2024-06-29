import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class351 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5414 = "Loading fonts - ";

    @OriginalMember(owner = "client!si", name = "f", descriptor = "[Lgo;")
    public static class230[] field5417 = new class230[8];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBIZ)I", line = 15)
    public static final int method2450(int arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 != -13) {
            field5413 = 29;
        }
        field5415++;
        class206 var4 = (class206) class135.field1968.method1405((long) arg0, false);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field3008.length; var6++) {
            if (var4.field3008[var6] >= 0 && class240.field3578 > var4.field3008[var6]) {
                class122 var7 = class175.method1228((byte) 54, var4.field3008[var6]);
                if (var7.field1753 != null) {
                    class35 var8 = (class35) var7.field1753.method1405((long) arg2, false);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field3014[var6] * var8.field515;
                        } else {
                            var5 += var8.field515;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILph;Z)Lin;", line = 65)
    public static final class177 method2451(int arg0, int arg1, class361 arg2, boolean arg3) {
        if (arg3) {
            field5412 = 59;
        }
        field5418++;
        return class62.method508(0, arg1, arg0, arg2) ? class110.method845((byte) -108) : null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 80)
    public static void method2452(byte arg0) {
        if (arg0 >= 2) {
            field5414 = null;
            field5417 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 99)
    public static final void method2453(String arg0, byte arg1) {
        field5416++;
        if (arg0 == null || arg1 != -4) {
            return;
        }
        String var2 = class19.method117(20563, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class255.field3810; var3++) {
            String var4 = class19.method117(20563, class192.field2806[var3]);
            if (var4 != null && var4.equals(var2)) {
                class302.field4510++;
                class255.field3810--;
                for (int var5 = var3; var5 < class255.field3810; var5++) {
                    class192.field2806[var5] = class192.field2806[var5 + 1];
                    class170.field2455[var5] = class170.field2455[var5 + 1];
                    class333.field5161[var5] = class333.field5161[var5 + 1];
                }
                class348.field5376 = class68.field989;
                class107.field1533.method1915(true, 121);
                class107.field1533.method1355((byte) -124, class225.method1646(-24, arg0));
                class107.field1533.method1343(arg0, arg1 + 4);
                break;
            }
        }
    }
}
