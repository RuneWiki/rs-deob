import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class119 {

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "J")
    public long field2142 = 0L;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lda;")
    public static class275 field2129 = class255.method1672(94, ": ");

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2138 = 2;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field2140 = -2;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lma;")
    public static class105 field2130;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lak;")
    public class234 field2135;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lak;")
    public class234 field2136;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLma;)V")
    public static final void method873(byte arg0, class105 arg1) {
        class207.field3488 = arg1;
        if (arg0 != -99) {
            method873((byte) -126, (class105) null);
        }
        field2133++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method874(byte arg0) {
        field2130 = null;
        if (arg0 == -15) {
            field2129 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public static final void method875(int arg0, int arg1, int arg2) {
        field2139++;
        if (arg1 != -907) {
            field2140 = -106;
        }
        class184 var3 = class147.method1044(7, (byte) 47, arg2);
        var3.method1226((byte) 26);
        var3.field3145 = arg0;
    }
}
