import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class137 {

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Lmc;")
    public static class78 field1989 = new class78(59, 18);

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "[Lpr;")
    public static class284[] field1992 = new class284[4];

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "[[[I")
    public static int[][][] field1993;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I", line = 3)
    public final int method826(byte arg0) {
        field1991++;
        if (arg0 > -124) {
            field1993 = null;
        }
        return this.field1986;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V", line = 14)
    public static final void method827(int arg0) {
        if (arg0 > -114) {
            method827(41);
        }
        class298.field3996 = new class395(class220.field2934.method1176(class110.field1676, (byte) -106), "", class97.field1417, 1001, -1, 0L, 0, 0, true, false);
        field1990++;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILid;)J", line = 26)
    public static final long method828(int arg0, int arg1, int arg2, class381 arg3) {
        field1987++;
        int var4 = 40 % ((arg0 - 69) / 53);
        long var5 = 4194304L;
        long var7 = 2147483648L;
        long var9 = Long.MIN_VALUE;
        class88 var11 = class1.field23.method935(arg3.method13(60), (byte) -82);
        long var12 = (long) (arg3.method4(-10666) | 0x10000 << 14 | arg2 | arg1 << 7 | arg3.method9(-769) << 20);
        if (var11.field1265 == 0) {
            var12 |= var9;
        }
        if (var11.field1302 == 1) {
            var12 |= var5;
        }
        if (var11.field1258) {
            var12 |= var7;
        }
        return var12 | (long) arg3.method13(102) << 32;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 68)
    public class137(String arg0, int arg1) {
        this.field1986 = arg1;
    }

    @OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;", line = 78)
    public final String toString() {
        field1988++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V", line = 88)
    public static void method829(byte arg0) {
        field1993 = null;
        if (arg0 != -53) {
            method828(55, 82, -122, (class381) null);
        }
        field1992 = null;
        field1989 = null;
    }
}
