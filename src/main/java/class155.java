import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class155 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lfn;")
    public static class31 field2334 = new class31(0, 0);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "J")
    public static long field2337 = 0L;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2339 = "Walk here";

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1132(int arg0, int arg1) {
        field2335++;
        class264.method1823(class264.field3950, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class264.method1822(-50.0F, (float) arg1, -50.0F);
        class264.method1825(class264.field3949, 0);
        class264.method1824();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILjava/lang/String;)V", line = 15)
    public static final void method1133(int arg0, int arg1, String arg2) {
        class159.field2372.method59(204, (byte) 73);
        if (arg0 != -14331) {
            method1135(97L, (byte) -43);
        }
        class224.field3490++;
        field2336++;
        class159.field2372.method251(arg1, -124);
        class159.field2372.method270(class224.method1597(true, arg2), (byte) 50);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 39)
    public static void method1134(byte arg0) {
        if (arg0 != -112) {
            method1133(-22, 106, (String) null);
        }
        field2339 = null;
        field2334 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(JB)V", line = 55)
    public static final void method1135(long arg0, byte arg1) {
        field2338++;
        if (arg1 > -74) {
            field2334 = (class31) null;
        }
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class314.field4873; var3++) {
            if (class37.field549[var3] == arg0) {
                class135.field2108++;
                class314.field4873--;
                for (int var4 = var3; var4 < class314.field4873; var4++) {
                    class119.field1874[var4] = class119.field1874[var4 + 1];
                    class299.field4709[var4] = class299.field4709[var4 + 1];
                    class34.field430[var4] = class34.field430[var4 + 1];
                    class37.field549[var4] = class37.field549[var4 + 1];
                    class171.field2541[var4] = class171.field2541[var4 + 1];
                    class270.field4077[var4] = class270.field4077[var4 + 1];
                }
                class271.field4090 = class319.field4980;
                class159.field2372.method59(44, (byte) 73);
                class159.field2372.method261(1523335144, arg0);
                break;
            }
        }
    }
}
