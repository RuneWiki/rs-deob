import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class107 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Z")
    public boolean field1641 = true;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1646 = "Loading - please wait.";

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIIZ)V", line = 70)
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1641 = arg6;
        this.field1645 = arg1;
        this.field1638 = arg2;
        this.field1637 = arg4;
        this.field1639 = arg0;
        this.field1642 = arg5;
        this.field1636 = arg3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 27)
    public static void method827(byte arg0) {
        field1646 = null;
        int var1 = -22 / ((arg0 - 75) / 33);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 36)
    public static final void method828(byte arg0) {
        field1640++;
        for (int var1 = -1; var1 < class262.field3900; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class225.field3504[var1];
            }
            class121 var3 = class319.field4964[var2];
            if (var3 != null) {
                class230.method1637(var3, var3.method929(12), -18967);
            }
        }
        if (arg0 > -5) {
            method828((byte) -31);
        }
    }
}
