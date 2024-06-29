import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class113 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field1657 = 0;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1660 = "Discard";

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
    public static int[] field1659 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
    public static int[] field1662 = new int[1000];

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lle;")
    public static class137 field1655;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lrj;")
    public static class282 field1658;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILfh;)V", line = 9)
    private final void method739(int arg0, int arg1, class313 arg2) {
        if (arg1 == 5) {
            this.field1657 = arg2.method2250(-1613178296);
        }
        field1663++;
        if (arg0 > -63) {
            field1662 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 26)
    public static void method740(int arg0) {
        if (arg0 != -6) {
            return;
        }
        field1660 = null;
        field1659 = null;
        field1662 = null;
        field1658 = null;
        field1655 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)Lsi;", line = 41)
    public static final class264 method741(int arg0, byte arg1, int arg2) {
        if (arg1 < 123) {
            return (class264) null;
        }
        field1656++;
        class264 var3 = class94.method629(5386, arg0);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4314 == null || var3.field4314.length <= arg2) {
            return null;
        } else {
            return var3.field4314[arg2];
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lfh;I)V", line = 69)
    public final void method742(class313 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2224(-126);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method739(-18, -15, (class313) null);
                }
                field1661++;
                return;
            }
            this.method739(-97, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)J", line = 105)
    public static final long method743(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field735; var4++) {
            class258 var5 = var3.field752[var4];
            if ((var5.field4076 >> 29 & 0x3L) == 2L && var5.field4082 == arg1 && var5.field4081 == arg2) {
                return var5.field4076;
            }
        }
        return 0L;
    }
}
