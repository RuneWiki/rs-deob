import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class182 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lsc;")
    public static class181 field3206 = class149.method967(255, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[[B")
    public static byte[][] field3210 = new byte[1000][];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3205 = 0;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3207 = 0;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3212 = -1;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[J")
    public static long[] field3213 = new long[200];

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method1250(byte arg0) {
        field3208++;
        int var1 = 0;
        if (arg0 != 16) {
            field3212 = 20;
        }
        while (var1 < class8.field136) {
            class68 var2 = class234.method1607(true, var1);
            if (var2 != null && var2.field1089 == 0) {
                class107.field1751[var1] = 0;
                class196.field3426[var1] = 0;
            }
            var1++;
        }
        class143.field2314 = new class214(16);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1251(int arg0) {
        field3213 = null;
        field3210 = null;
        field3206 = null;
        int var1 = -63 / ((-arg0 - 55) / 33);
    }
}
