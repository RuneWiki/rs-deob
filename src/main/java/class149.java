import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class149 {

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field2414 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Ldi;")
    public static class111 field2406;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "[[[B")
    public static byte[][][] field2415;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method1085(int arg0, byte arg1) {
        if (class281.field4656 == arg0 && arg0 != 0) {
            class14 var2 = class282.field4678[arg0];
            var2.method84(class330.field5623);
        }
        field2417++;
        if (arg1 != 64) {
            field2414 = 21;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Lki;", line = 31)
    public static final class152 method1086(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1211; var4++) {
            class152 var5 = var3.field1216[var4];
            if ((var5.field2479 >> 29 & 0x3L) == 2L && var5.field2464 == arg1 && var5.field2468 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Z", line = 74)
    public static final boolean method1087(int arg0, int arg1) {
        int var2 = -65 % ((arg0 - 52) / 51);
        field2418++;
        return (arg1 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 92)
    public static void method1088(int arg0) {
        field2406 = null;
        field2415 = (byte[][][]) null;
        if (arg0 != 1) {
            field2406 = (class111) null;
        }
    }
}
