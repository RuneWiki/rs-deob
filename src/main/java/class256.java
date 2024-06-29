import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class256 extends class166 {

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field4091 = 0;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field4099 = new String[500];

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field4105 = 0;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4092 = "glow1:";

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4095 = "Please wait...";

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "B")
    public byte field4097;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lbk;")
    public static class21 field4096;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lhc;")
    public static class235 field4094;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "Ljava/lang/String;")
    public String field4102;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Ljava/lang/String;")
    public String field4104;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public static final void method1738(int arg0) {
        field4101++;
        for (int var1 = 0; var1 < 100; var1++) {
            class25.field335[var1] = true;
        }
        if (arg0 < 10) {
            field4095 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)Lul;")
    public static final class192 method1739(byte arg0) {
        field4098++;
        class290 var1 = new class290(class213.field3317, class130.field2056, class193.field3066[0], class108.field1779[0], class28.field390[0], class171.field2679[0], class198.field3123[0], class94.field1601);
        if (arg0 == 92) {
            class19.method179(8);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public static void method1740(int arg0) {
        field4096 = null;
        field4094 = null;
        field4095 = null;
        if (arg0 != 100) {
            method1741((byte) -6, -75);
        }
        field4099 = null;
        field4092 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)I")
    public static final int method1741(byte arg0, int arg1) {
        if (arg0 != -84) {
            field4094 = null;
        }
        field4093++;
        return arg1 & 0x7F;
    }
}
