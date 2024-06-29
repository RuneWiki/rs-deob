import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class116 extends class69 {

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public static int field1571 = 0;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "[I")
    public static int[] field1577 = new int[3];

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!iaa", name = "u", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "Lqk;")
    public class1 field1578;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lgs;")
    public class432 field1575;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "Lee;")
    public static class506 field1580;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method845(int arg0, int arg1, byte[] arg2, int arg3) {
        field1574++;
        char[] var4 = new char[arg0];
        if (arg3 != -28992) {
            field1582 = -28;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg2[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class171.field2172[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
    public final void method846(byte arg0) {
        field1576++;
        if (class533.field7335.length > class408.field5743) {
            class533.field7335[class408.field5743++] = this;
            if (arg0 != 120) {
                method847(-37);
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public static void method847(int arg0) {
        field1577 = null;
        if (arg0 != 255) {
            field1582 = 29;
        }
        field1580 = null;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIZ)V")
    public static final void method848(int arg0, int arg1, int arg2, boolean arg3) {
        field1579++;
        if (~arg0 > arg2 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class568.field8000 = arg1;
        class568.field8013 = arg3;
        class223.field3174 = arg0;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)J")
    public static final long method849(int arg0, int arg1) {
        field1581++;
        return arg1 == -11745 ? (long) (arg0 + 11745) * 86400000L : -82L;
    }
}
