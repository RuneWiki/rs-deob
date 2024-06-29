import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class163 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "J")
    public long field2872;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Luk;")
    public class98 field2862;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Luk;")
    public class98 field2863;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "Luk;")
    public class98 field2875;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)Z")
    public static final boolean method1100(byte arg0, int arg1) {
        field2865++;
        if (arg0 <= 67) {
            field2869 = -32;
        }
        return (arg1 & 0x33DED0) >> 21 != 0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Lpj;")
    public static final class249 method1101(int arg0) {
        field2871++;
        if (arg0 > -10) {
            return null;
        }
        try {
            return (class249) Class.forName("qg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)I")
    public static final int method1102(boolean arg0, int arg1) {
        field2861++;
        return arg0 ? -32 : arg1 >>> 10;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ltg;I)Z")
    public static final boolean method1103(class182 arg0, int arg1) {
        if (arg1 != -11176) {
            method1100((byte) -94, 124);
        }
        field2870++;
        return arg0.method1229(class164.field2882, -1);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public static final void method1104(int arg0) {
        field2864++;
        if (arg0 != -12101) {
            method1101(-28);
        }
        class79.method552(false, 124);
        System.gc();
        class138.method943(0, 25);
    }
}
