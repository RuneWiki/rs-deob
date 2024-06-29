import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class388 extends class539 {

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field5452 = 0;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Lfc;")
    public static class235 field5454 = new class235(66, 10);

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field5439;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public int field5440;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field5442;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public int field5444;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public int field5447;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lfaa;")
    public class140 field5443;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lfaa;")
    public class140 field5453;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "Ljava/lang/String;")
    public String field5450;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "Z")
    public boolean field5448;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "[I")
    public static int[] field5445;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "[Ljava/lang/Object;")
    public Object[] field5451;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method2234(byte arg0) {
        if (arg0 <= -2) {
            field5454 = null;
            field5445 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lps;I)I")
    public static final int method2235(class82 arg0, int arg1) {
        int var2 = -122 / ((arg1 - 34) / 58);
        field5446++;
        if (class82.field1143 == arg0) {
            return 5120;
        } else if (class82.field1145 == arg0) {
            return 5122;
        } else if (class82.field1146 == arg0) {
            return 5124;
        } else if (class82.field1147 == arg0) {
            return 5121;
        } else if (class82.field1148 == arg0) {
            return 5123;
        } else if (class82.field1149 == arg0) {
            return 5125;
        } else if (class82.field1150 == arg0) {
            return 5131;
        } else if (class82.field1151 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
