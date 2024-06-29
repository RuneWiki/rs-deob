import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class412 {

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Z")
    public boolean field5458;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    public static int field5459 = 0;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "Lcq;")
    public class233 field5462;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "Lcq;")
    public class233 field5463;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "Lim;")
    public static class652 field5466;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "Z")
    public boolean field5456;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "[[[J")
    public static long[][][] field5464;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 4)
    public final void method2386(int arg0) {
        if (this.field5462 != null) {
            this.field5462.method284((byte) 45);
        }
        field5461++;
        int var2 = -35 % ((arg0 - 42) / 36);
        this.field5456 = false;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z", line = 19)
    public final boolean method2387(int arg0) {
        if (arg0 != 0) {
            this.field5458 = false;
        }
        field5465++;
        return this.field5456 && !this.field5458;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V", line = 30)
    public static void method2388(byte arg0) {
        field5464 = null;
        field5466 = null;
        if (arg0 != -109) {
            field5464 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)[Lf;", line = 42)
    public static final class134[] method2389(int arg0) {
        if (arg0 <= 79) {
            field5459 = 111;
        }
        field5460++;
        return new class134[] { class117.field1562, class117.field1577, class117.field1580, class117.field1583, class117.field1585, class117.field1588, class117.field1589, class117.field1590, class117.field1591, class117.field1592, class117.field1593, class117.field1594 };
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)Z", line = 58)
    public static final boolean method2390(int arg0) {
        field5457++;
        if (class693.field8903 == 0) {
            if (arg0 != -6858) {
                field5464 = null;
            }
            return class687.field8841.method3566((byte) 127);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Z)V", line = 79)
    public class412(boolean arg0) {
        this.field5458 = arg0;
    }
}
