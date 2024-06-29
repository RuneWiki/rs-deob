import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class118 {

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "B")
    private byte field2172;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public int field2164;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public int field2165;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Lpja;")
    public static class43 field2169 = new class43(64);

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Lvl;")
    public static class15 field2175 = new class15(67, -1);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method1042(int arg0) {
        class656.method3689(false, -201);
        field2166++;
        if (class229.field3346 >= 0 && class229.field3346 != 0) {
            class624.method3517(false, 0, class229.field3346);
            class229.field3346 = -1;
        }
        if (arg0 != 8) {
            method1044(false);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1043(int arg0, String arg1) {
        if (arg0 != 64) {
            field2169 = null;
        }
        field2167++;
        return arg1.length() + 2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static final void method1044(boolean arg0) {
        class471.field6387 = null;
        field2173++;
        class95.field1473 = null;
        if (!arg0) {
            field2169 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)I")
    public final int method1045(byte arg0) {
        field2162++;
        if (arg0 == 42) {
            return (this.field2172 & 0x8) == 8 ? 1 : 0;
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I")
    public final int method1046(int arg0) {
        if (arg0 != 0) {
            this.method1045((byte) -62);
        }
        field2160++;
        return this.field2172 & 0x7;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static void method1047(byte arg0) {
        field2169 = null;
        field2175 = null;
        if (arg0 >= -13) {
            field2169 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1048(byte arg0, int arg1) {
        field2170++;
        if (arg0 > -44) {
            method1044(false);
        }
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class118() {
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lfca;)V")
    public class118(class93 arg0) {
        this.field2172 = arg0.method766((byte) 122);
        this.field2164 = arg0.method763(81);
        this.field2168 = arg0.method773(3);
        this.field2165 = arg0.method773(3);
        this.field2174 = arg0.method773(3);
        this.field2163 = arg0.method773(3);
    }
}
