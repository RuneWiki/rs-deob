import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class422 extends class156 {

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "C")
    public char field6305;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public int field6298;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public int field6302;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "J")
    public long field6303;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lke;")
    public class422 field6300;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Z")
    public boolean field6299;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)J", line = 3)
    public final long method1175(int arg0) {
        if (arg0 != 8204) {
            this.method1171((byte) -41);
        }
        field6304++;
        return this.field6303;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)C", line = 17)
    public final char method1176(byte arg0) {
        field6301++;
        return arg0 < 30 ? '\u001d' : this.field6305;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I", line = 28)
    public final int method1170(int arg0) {
        field6297++;
        if (arg0 != 4) {
            this.method1169(49);
        }
        return this.field6298;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)I", line = 39)
    public static final int method2549(int arg0, int arg1, byte arg2) {
        field6308++;
        int var3 = 0;
        if (arg2 < 110) {
            method2549(-33, -41, (byte) -54);
        }
        while (arg0 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
            arg0--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z", line = 68)
    public final boolean method1169(int arg0) {
        field6306++;
        if (arg0 != 0) {
            this.method1171((byte) -51);
        }
        return this.field6299;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)I", line = 89)
    public final int method1171(byte arg0) {
        field6307++;
        if (arg0 < 95) {
            this.method1171((byte) -77);
        }
        return this.field6302;
    }
}
