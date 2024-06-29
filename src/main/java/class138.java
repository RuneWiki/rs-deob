import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class138 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field1927 = 99;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[Z")
    public static boolean[] field1928 = new boolean[112];

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Lhc;")
    public static class235 field1931;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
    public static final int method935(boolean arg0) {
        if (arg0) {
            field1930++;
            return ((class122.field1701 == 0 ? 0 : 1) << 22) + ((class168.field2312 == 0 ? 0 : 1) << 21) + ((class261.field3954 ? 1 : 0) << 19) + ((class208.field2951 ? 1 : 0) << 15) + ((class212.field3187 ? 1 : 0) << 9) + ((class245.field3744 ? 1 : 0) << 8) + ((class251.field3847 ? 1 : 0) << 3) + (class266.field3984 & 0x7) + ((class148.field2048 ? 1 : 0) << 4) + (((class75.field1053 ? 1 : 0) << 5) + ((class86.field1174 ? 1 : 0) << 6) - (-((class246.field3763 ? 1 : 0) << 7) + -((class29.field390 ? 1 : 0) << 10)) + (class213.field3211 & 0x3 << 11) - (-((class141.field1957 ? 1 : 0) << 13) - (((class41.field617 ? 1 : 0) << 16) + (class219.field3294 << 17)) + -((class205.field2860 == 0 ? 0 : 1) << 20) + -(class97.method641() << 23)));
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method936(byte arg0) {
        field1931 = null;
        field1928 = null;
        int var1 = -48 / ((arg0 + 4) / 45);
    }
}
