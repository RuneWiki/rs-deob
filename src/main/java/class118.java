import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class118 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1781 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1782 = 100;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1783 = 0;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1785 = -1;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1787 = "glow3:";

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[[[B")
    public static byte[][][] field1784;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method749(int arg0) {
        if (arg0 != -31390) {
            method750(-96, 77, -52);
        }
        field1784 = null;
        field1787 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    public static final void method750(int arg0, int arg1, int arg2) {
        field1788++;
        class35.field494[arg0] = arg2;
        class63 var3 = (class63) class273.field4110.method1666((long) arg0, (byte) 66);
        if (var3 == null) {
            class63 var4 = new class63(class263.method1754(-49) + 500L);
            class273.field4110.method1663((long) arg0, var4, -123);
        } else {
            var3.field987 = class263.method1754(-11) + 500L;
        }
        if (arg1 >= -97) {
            field1785 = 57;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILqa;I)V")
    public static final void method751(int arg0, class153 arg1, int arg2) {
        field1786++;
        if (arg1.field2262 > class270.field4058) {
            class212.method1355(arg1, (byte) -117);
        } else if (class270.field4058 <= arg1.field2289) {
            class146.method890(arg1, 128);
        } else {
            class70.method474((byte) -92, arg1);
        }
        if (arg2 != 64) {
            field1781 = -115;
        }
        if (arg1.field2251 < 128 || arg1.field2234 < 128 || arg1.field2251 >= 13184 || arg1.field2234 >= 13184) {
            arg1.field2230 = -1;
            arg1.field2289 = 0;
            arg1.field2262 = 0;
            arg1.field2260 = -1;
            arg1.field2251 = arg1.field2297[0] * 128 + (arg1.method676(arg2 - 30281) * 64);
            arg1.field2234 = arg1.field2275[0] * 128 + (arg1.method676(arg2 ^ 0xFFFF89B7) * 64);
            arg1.method922(0);
        }
        if (class165.field2537 == arg1 && (arg1.field2251 < 1536 || arg1.field2234 < 1536 || arg1.field2251 >= 11776 || arg1.field2234 >= 11776)) {
            arg1.field2289 = 0;
            arg1.field2262 = 0;
            arg1.field2260 = -1;
            arg1.field2230 = -1;
            arg1.field2251 = arg1.field2297[0] * 128 + arg1.method676(-30217) * 64;
            arg1.field2234 = arg1.field2275[0] * 128 + arg1.method676(-30217) * 64;
            arg1.method922(0);
        }
        class23.method148((byte) 39, arg1);
        class177.method1099((byte) -110, arg1);
    }
}
