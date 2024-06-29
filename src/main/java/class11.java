import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class class11 {

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field258 = 0;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Loc;")
    public static class99 field253 = class48.method402((byte) -104, "Name eingeben:");

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Loc;")
    public static class99 field256 = class48.method402((byte) -104, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lpc;")
    public static class105 field257;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[I")
    public static int[] field264;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
    public static final int method121(int arg0, int arg1) {
        if (arg1 == 4728) {
            field255++;
            return arg0 >> 11 & 0x3F;
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)[B")
    public abstract byte[] method122(byte arg0);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLhe;)Z")
    public static final boolean method123(byte arg0, class54 arg1) {
        if (arg0 != 94) {
            return false;
        }
        field260++;
        if (class54.field1367) {
            if (class20.method188(arg1, -604452832) != 0) {
                return false;
            }
            if (arg1.field1341 == 0) {
                return false;
            }
        }
        return arg1.field1311;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BB)V")
    public abstract void method124(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method125(int arg0) {
        field253 = null;
        if (arg0 == 0) {
            field256 = null;
            field264 = null;
            field257 = null;
        }
    }
}
