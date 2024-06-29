import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class291 {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[[Z")
    public static boolean[][] field3947 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13] };

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lbi;")
    public static class139 field3953 = null;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lrk;")
    public static class427 field3954;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[[Lbi;")
    public static class139[][] field3949;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 9)
    public static void method1886(int arg0) {
        field3954 = null;
        field3947 = null;
        field3953 = null;
        field3949 = null;
        if (arg0 <= 17) {
            method1888(-58, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 32)
    public static final void method1887(int arg0) {
        int var1 = 73 % ((-arg0 - 57) / 36);
        field3944++;
        class156.field2361.method2533(0);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V", line = 47)
    public static final void method1888(int arg0, byte arg1) {
        class410 var2 = class107.field1569;
        synchronized (class107.field1569) {
            if (arg1 != -77) {
                field3947 = null;
            }
            class107.field1569.method2534(arg1 + 77, arg0);
        }
        field3950++;
    }
}
