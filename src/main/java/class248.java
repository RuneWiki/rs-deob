import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class248 {

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lsb;")
    public static class221 field4343 = new class221(64);

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lka;")
    public static class253 field4344 = new class253(64);

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field4347 = -1;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "J")
    public static long field4351 = 0L;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lp;")
    private static class280 field4350 = class18.method140((byte) -128, "Cancel");

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lp;")
    public static class280 field4345 = field4350;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field4341;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Z")
    public static boolean field4346;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Llj;IB)V")
    private final void method1675(class25 arg0, int arg1, byte arg2) {
        field4349++;
        if (arg2 <= 83) {
            field4348 = -26;
        }
        if (arg1 == 1) {
            this.field4342 = arg0.method193((byte) 77);
            this.field4338 = arg0.method189((byte) -103);
            this.field4341 = arg0.method189((byte) -103);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILlj;)V")
    public final void method1676(int arg0, class25 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method189((byte) -103);
            if (var3 == 0) {
                field4339++;
                return;
            }
            this.method1675(arg1, var3, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method1677(byte arg0) {
        int var1 = -89 / ((-arg0 - 49) / 41);
        field4350 = null;
        field4344 = null;
        field4343 = null;
        field4345 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lqg;")
    public static final class103 method1678(byte arg0) {
        field4337++;
        if (arg0 != -30) {
            field4343 = null;
        }
        return class90.field1460;
    }
}
