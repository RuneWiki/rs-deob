import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class319 {

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lll;")
    public static class248 field4366 = new class248("WTRC", 1);

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Ldt;")
    public static class184 field4368 = new class184(64);

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Lfn;")
    public static class52 field4369 = new class52(71, 10);

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field4370 = 0;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Z")
    public static boolean field4371 = false;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILlk;)V", line = 9)
    private final void method1925(int arg0, int arg1, class425 arg2) {
        if (arg1 == 1) {
            this.field4363 = arg2.method2508(true);
            this.field4365 = arg2.method2503(true);
            this.field4364 = arg2.method2503(true);
        }
        field4361++;
        int var4 = -94 / ((arg0 - 45) / 35);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 29)
    public static void method1926(byte arg0) {
        field4366 = null;
        if (arg0 == -117) {
            field4369 = null;
            field4368 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 44)
    public static final void method1927(byte arg0) {
        if (arg0 > -118) {
            field4367 = 126;
        }
        field4362++;
        int var1 = 0;
        if (class312.field4249) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class50.method398(var1, (byte) -55);
        class304.field4160.method2073((byte) -79, var1);
        class58.field918.method340(var1, (byte) 118);
        class467.field6550.method1358(0, var1);
        class163.field2348.method540(var1, (byte) 2);
        class288.method1771(true, var1);
        class51.method403(var1, 8);
        class304.method1844(16, var1);
        class431.method2525(var1, 57);
        if (class478.field6764 == 10) {
            class8.method94(28, -119);
        } else if (class478.field6764 == 30) {
            class8.method94(25, 121);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Llk;I)V", line = 87)
    public final void method1928(class425 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.method1925(-29, 114, (class425) null);
                }
                field4360++;
                return;
            }
            this.method1925(-9, var3, arg0);
        }
    }
}
