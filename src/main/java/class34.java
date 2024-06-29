import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class34 {

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "B")
    public byte field408;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Lbh;")
    public class34 field413;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
    public static int[] field402 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[I")
    public static int[] field404 = new int[4];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 6)
    public static void method157(int arg0) {
        if (arg0 >= 4) {
            field402 = null;
            field404 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)J", line = 20)
    public static final long method158(int arg0) {
        if (arg0 != -8502) {
            field404 = null;
        }
        field411++;
        return class258.field3683.method1060(arg0 ^ 0xFFFFDE83);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIII)Lbh;", line = 35)
    public final class34 method159(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -63) {
            return null;
        } else {
            field414++;
            return new class34(this.field399, arg3, arg2, arg1, this.field408);
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Lsda;", line = 61)
    public final class234 method160(int arg0) {
        if (arg0 != 1) {
            this.method159((byte) -12, 22, 96, 80);
        }
        field409++;
        return class690.method3797(this.field399, (byte) 119);
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIB)V", line = 71)
    public class34(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field401 = arg3;
        this.field408 = arg4;
        this.field395 = arg1;
        this.field399 = arg0;
        this.field403 = arg2;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lbh;I)V", line = 82)
    public class34(class34 arg0, int arg1) {
        this.field413 = arg0;
        this.field401 = this.field413.field401 + arg1;
        this.field408 = this.field413.field408;
        this.field395 = this.field413.field395 + arg1;
        this.field399 = this.field413.field399;
        this.field403 = this.field413.field403 + arg1;
    }
}
