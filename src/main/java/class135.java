import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class135 {

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "B")
    public byte field1838;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "B")
    public byte field1835;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "S")
    public short field1839;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "Lot;")
    public class615 field1837;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "Lir;")
    public static class28 field1830 = class129.method913(true);

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "Lgm;")
    public static class134 field1836 = new class134("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "[Loq;")
    public static class378[] field1833;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)I", line = 5)
    public static final int method945(int arg0) {
        if (arg0 != 31635) {
            field1833 = null;
        }
        field1832++;
        return class344.field4830++;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 17)
    public static final long method946(String arg0, int arg1) {
        field1831++;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
        }
        int var6 = -100 % ((arg1 - 49) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I", line = 38)
    public static final int method947(int arg0) {
        if (arg0 <= 121) {
            method945(-83);
        }
        field1834++;
        byte var2;
        if (class115.field1557 >= 96) {
            int var1 = class127.method897(100);
            if (var1 <= 100) {
                class630.method3480(false);
                var2 = 4;
            } else if (var1 <= 500) {
                var2 = 3;
                class383.method2379(-2);
            } else if (var1 <= 1000) {
                var2 = 2;
                class517.method3013((byte) -128);
            } else {
                class37.method212(28974, true);
                var2 = 1;
            }
        } else {
            var2 = 1;
            class37.method212(28974, true);
        }
        if (class125.field1721.field5141.method2541(43) != 0) {
            class125.field1721.method2255(true, 0, class125.field1721.field5140);
            class399.method2434(false, (byte) -43, 0);
        }
        class515.method3006(-2);
        return var2;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V", line = 99)
    public static void method948(byte arg0) {
        field1833 = null;
        if (arg0 >= -69) {
            method947(-51);
        }
        field1830 = null;
        field1836 = null;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lot;III)V", line = 127)
    public class135(class615 arg0, int arg1, int arg2, int arg3) {
        this.field1838 = (byte) arg2;
        this.field1835 = (byte) arg3;
        this.field1839 = (short) arg1;
        this.field1837 = arg0;
    }
}
