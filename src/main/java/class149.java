import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class149 {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "B")
    private byte field2398;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2403 = null;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2399 = -1;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[[S")
    public static short[][] field2392;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V")
    public static final void method1020(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 27) {
            method1022(-13);
        }
        if (arg2 >= arg3) {
            class56.method420(class29.field452[arg1], arg4, -7, arg3, arg2);
        } else {
            class56.method420(class29.field452[arg1], arg4, -7, arg2, arg3);
        }
        field2402++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
    public static final void method1021(int arg0, byte arg1) {
        class85.field1331.method476(false, arg0);
        field2400++;
        class75.field1208.method476(false, arg0);
        int var2 = -73 / ((-arg1 - 75) / 42);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1022(int arg0) {
        field2392 = null;
        field2403 = null;
        if (arg0 != 8) {
            field2394 = 74;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)I")
    public final int method1023(int arg0) {
        if (arg0 != 7) {
            this.method1023(86);
        }
        field2396++;
        return this.field2398 & 0x7;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1024(String arg0, boolean arg1) {
        field2395++;
        if (class110.field1819 == null || !arg1) {
            return;
        }
        int var2 = 0;
        long var3 = class74.method522((byte) -124, arg0);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class110.field1819.length && class110.field1819[var2].field3247 != var3) {
            var2++;
        }
        if (class110.field1819.length > var2 && class110.field1819[var2] != null) {
            class275.field4353++;
            class68.field1113.method534((byte) -117, 35);
            class68.field1113.method1502((byte) 118, class110.field1819[var2].field3247);
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)I")
    public final int method1025(int arg0) {
        field2404++;
        if (arg0 != -8) {
            field2394 = 123;
        }
        return (this.field2398 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class149() {
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Log;)V")
    public class149(class221 arg0) {
        this.field2398 = arg0.method1535((byte) -110);
        this.field2405 = arg0.method1521((byte) 113);
        this.field2401 = arg0.method1526(-16777216);
        this.field2393 = arg0.method1526(-16777216);
        this.field2406 = arg0.method1526(-16777216);
        this.field2397 = arg0.method1526(-16777216);
    }
}
