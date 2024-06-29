import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class123 extends class115 {

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    public static int field2007 = 0;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "Lok;")
    public static class146 field2005 = class235.method1724(-12908, "Gestionnaire de saisie charg-B");

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field2008 = 0;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "Z")
    public static boolean field2014 = false;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lmd;")
    public class245 field2011;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "[B")
    public byte[] field2006;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lcl;Loh;Loh;ILoh;)Z", line = 21)
    public static final boolean method850(class128 arg0, class15 arg1, class15 arg2, int arg3, class15 arg4) {
        class55.field983 = arg4;
        if (arg3 != 0) {
            field2008 = 7;
        }
        field2017++;
        class52.field950 = arg1;
        class215.field3560 = arg0;
        class4.field46 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)I", line = 44)
    public final int method703(int arg0) {
        if (arg0 != 28977) {
            this.method703(-18);
        }
        field2016++;
        return this.field1856 ? 0 : 100;
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V", line = 70)
    public static void method851(int arg0) {
        int var1 = 115 / ((-arg0 - 44) / 43);
        field2005 = null;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)[B", line = 87)
    public final byte[] method706(int arg0) {
        field2010++;
        if (this.field1856) {
            throw new RuntimeException();
        } else if (arg0 == 100) {
            return this.field2006;
        } else {
            return (byte[]) null;
        }
    }
}
