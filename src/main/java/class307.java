import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class307 {

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "Lbr;")
    public static class223 field4207 = new class223(16);

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static volatile int field4213 = 0;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "Lbr;")
    public static class223 field4212 = new class223(16);

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Lke;")
    public static class354 field4211;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
    public static void method1953(boolean arg0) {
        if (arg0) {
            method1954((String) null, -81, 5);
        }
        field4207 = null;
        field4211 = null;
        field4212 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1954(String arg0, int arg1, int arg2) {
        field4208++;
        boolean var3 = false;
        int var4 = 21 / ((70 - arg2) / 50);
        for (int var5 = 0; var5 < class169.field2407; var5++) {
            class354 var6 = class12.field153[class67.field1055[var5]];
            if (var6 != null && var6.field4994 != null && var6.field4994.equalsIgnoreCase(arg0)) {
                if (arg1 == 1) {
                    class442.field6400.method158((byte) 7, 54);
                    class125.field1767++;
                    class442.field6400.method2396(0, 12450);
                    class442.field6400.method2430(class67.field1055[var5], 70);
                } else if (arg1 == 4) {
                    class442.field6400.method158((byte) 7, 203);
                    class294.field4061++;
                    class442.field6400.method2416(22064, class67.field1055[var5]);
                    class442.field6400.method2396(0, 12450);
                } else if (arg1 == 5) {
                    class442.field6400.method158((byte) 7, 195);
                    class73.field1131++;
                    class442.field6400.method2416(22064, class67.field1055[var5]);
                    class442.field6400.method2384(0, true);
                } else if (arg1 == 6) {
                    class143.field2067++;
                    class442.field6400.method158((byte) 7, 129);
                    class442.field6400.method2404(0, (byte) 124);
                    class442.field6400.method2438(68, class67.field1055[var5]);
                } else if (arg1 == 7) {
                    class354.field4989++;
                    class442.field6400.method158((byte) 7, 237);
                    class442.field6400.method2416(22064, class67.field1055[var5]);
                    class442.field6400.method2404(0, (byte) 127);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class141.method966((byte) 69, class436.field6255 + arg0);
        }
    }
}
