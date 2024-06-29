import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class20 {

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Lna;")
    public static class26 field211 = class6.method40("Saw Mill", 48);

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "I")
    public static volatile int field212 = 0;

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "[I")
    public static int[] field214;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "([Lna;B)Lna;", line = 13)
    public static final class26 method121(class26[] arg0, byte arg1) {
        if (arg1 >= -22) {
            method121(null, (byte) 50);
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class25.method174(0, arg0.length, arg0, (byte) 116);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 30)
    public static void method122(int arg0) {
        field211 = null;
        field214 = null;
        if (arg0 != 29823) {
            field216 = -67;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)V", line = 47)
    public static final void method123(byte arg0) {
        if (arg0 == -64 && class11.field132 != null) {
            class6 var1 = class11.field132;
            synchronized (class11.field132) {
                class11.field132 = null;
            }
        }
    }
}
