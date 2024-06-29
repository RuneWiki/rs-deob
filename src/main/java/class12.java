import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class12 extends class4 {

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field102 = -2;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field109 = -1;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Lwn;")
    public class585 field115;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "Ljava/lang/String;")
    public String field110;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "[I")
    public int[] field107;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "[I")
    public int[] field114;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "[Lbaa;")
    public class130[] field113;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "[Ljava/lang/String;")
    public String[] field105;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method57(boolean arg0) {
        class381.field5467 = null;
        class456.field6317 = null;
        if (arg0) {
            return;
        }
        class178.field2446 = null;
        class694.field9641 = null;
        class266.field3897 = null;
        class232.field3147 = null;
        class299.field4242 = null;
        class339.field4775 = null;
        class272.field3950 = null;
        class349.field4955 = null;
        class289.field4129 = null;
        class129.field1804 = null;
        class113.field1513 = null;
        class758.field10575 = null;
        class577.field7930 = null;
        class345.field4907 = null;
        class55.field785 = null;
        class1.field14 = null;
        field104++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B[I[I)V", line = 32)
    public static final void method58(byte arg0, int[] arg1, int[] arg2) {
        field116++;
        if (arg1 == null || arg2 == null) {
            class585.field7975 = null;
            class250.field3665 = null;
            class608.field8193 = null;
            return;
        }
        class250.field3665 = arg1;
        if (arg0 >= -4) {
            field109 = -70;
        }
        class585.field7975 = new int[arg1.length];
        class608.field8193 = new byte[arg1.length][][];
        for (int var3 = 0; var3 < class250.field3665.length; var3++) {
            class608.field8193[var3] = new byte[arg2[var3]][];
        }
    }
}
