import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class96 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1438 = " from your ignore list first.";

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1439 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Z")
    public static boolean field1446 = false;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Z")
    public static boolean field1445;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[[B")
    public static byte[][] field1443;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(SI)Z", line = 8)
    public static final boolean method680(short arg0, int arg1) {
        field1441++;
        if (arg0 == 13 || arg0 == 19 || arg0 == 31 || arg0 == 25 || arg0 == 18 || arg0 == 41 || arg0 == 33 || arg0 == 26) {
            return true;
        } else if (arg0 == 15 || arg0 == 28 || arg0 == 1003 || arg0 == 1001) {
            return true;
        } else if (arg0 == 6 || arg0 == 9 || arg0 == 60 || arg0 == 32 || arg0 == 8) {
            return true;
        } else if (arg0 == 51 || arg0 == 2 || arg0 == 1 || arg0 == 3 || arg0 == 38 || arg0 == 11) {
            return true;
        } else {
            if (arg1 != 1003) {
                method681(118);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 46)
    public static void method681(int arg0) {
        field1439 = null;
        field1438 = null;
        if (arg0 != -9) {
            method682(15, 20);
        }
        field1443 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Ljava/lang/String;", line = 61)
    public static final String method682(int arg0, int arg1) {
        field1437++;
        if (arg1 != 255) {
            field1440 = -57;
        }
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF34D7) >> 16) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I", line = 74)
    public static final int method683(int arg0, int arg1) {
        field1442++;
        if (arg0 != 1954325552) {
            field1438 = (String) null;
        }
        return arg1 & 0x7F;
    }
}
