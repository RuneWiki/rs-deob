import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class338 {

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    private int field4549;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Leba;")
    public static class550 field4552 = new class550(17, 6);

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "Leba;")
    public static class550 field4553 = new class550(34, 6);

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Lwo;")
    public static class445 field4554 = new class445();

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field4555 = 0;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field4557 = 1407;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!tt", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field4550++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)I", line = 13)
    public final int method1976(byte arg0) {
        if (arg0 < 3) {
            return 114;
        } else {
            field4548++;
            return this.field4549;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V", line = 27)
    public static void method1977(byte arg0) {
        if (arg0 != 110) {
            method1978((byte) -24, null);
        }
        field4554 = null;
        field4552 = null;
        field4553 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLhe;)I", line = 43)
    public static final int method1978(byte arg0, class231 arg1) {
        field4551++;
        if (arg1.field3013 == 0) {
            return 0;
        }
        if (arg1.field3045 != -1) {
            class231 var2 = null;
            if (arg1.field3045 < 32768) {
                class407 var3 = (class407) class296.field3921.method3057(1, (long) arg1.field3045);
                if (var3 != null) {
                    var2 = var3.field5354;
                }
            } else if (arg1.field3045 >= 32768) {
                var2 = class513.field7145[arg1.field3045 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field398 - var2.field398;
                int var5 = arg1.field397 - var2.field397;
                if (var4 != 0 || var5 != 0) {
                    arg1.method1427(10973, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg1 instanceof class573)) {
            class573 var9 = (class573) arg1;
            if (var9.field7806 != -1 && (var9.field3095 == 0 || var9.field3087 > 0)) {
                var9.method1427(10973, var9.field7806);
                var9.field7806 = -1;
            }
        } else if (arg1 instanceof class351) {
            class351 var6 = (class351) arg1;
            if (var6.field4666 != -1 && (var6.field3095 == 0 || var6.field3087 > 0)) {
                int var7 = var6.field398 - ((var6.field4666 - class125.field1745 - class125.field1745) * 256);
                int var8 = var6.field397 - (var6.field4688 - class4.field23 - class4.field23) * 256;
                if (var7 != 0 || var8 != 0) {
                    var6.method1427(10973, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
                var6.field4666 = -1;
            }
        }
        if (arg0 < 63) {
            method1977((byte) 21);
        }
        return arg1.method1440(17668);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(II)V", line = 141)
    public class338(int arg0, int arg1) {
        this.field4558 = arg1;
        this.field4549 = arg0;
    }
}
