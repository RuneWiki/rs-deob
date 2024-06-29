import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class359 extends class36 {

    @OriginalMember(owner = "client!br", name = "Y", descriptor = "[I")
    public int[] field5128 = new int[12];

    @OriginalMember(owner = "client!br", name = "bb", descriptor = "[[I")
    public int[][] field5131 = new int[2200][64];

    @OriginalMember(owner = "client!br", name = "gb", descriptor = "[I")
    public int[] field5136 = new int[class636.field8969];

    @OriginalMember(owner = "client!br", name = "lb", descriptor = "[I")
    public int[] field5141 = new int[32];

    @OriginalMember(owner = "client!br", name = "hb", descriptor = "[I")
    public int[] field5137 = new int[12];

    @OriginalMember(owner = "client!br", name = "ab", descriptor = "[I")
    public int[] field5130 = new int[class636.field9009 + 8191];

    @OriginalMember(owner = "client!br", name = "cb", descriptor = "[[I")
    public int[][] field5132 = new int[12][class636.field9009 + 8191];

    @OriginalMember(owner = "client!br", name = "mb", descriptor = "[[I")
    public int[][] field5142 = new int[32][512];

    @OriginalMember(owner = "client!br", name = "nb", descriptor = "[I")
    public int[] field5143 = new int[2200];

    @OriginalMember(owner = "client!br", name = "eb", descriptor = "[I")
    public int[] field5134 = new int[class636.field9009 - -8191];

    @OriginalMember(owner = "client!br", name = "jb", descriptor = "Ljf;")
    public class197 field5139;

    @OriginalMember(owner = "client!br", name = "ib", descriptor = "I")
    public static int field5138 = -1;

    @OriginalMember(owner = "client!br", name = "kb", descriptor = "I")
    public static int field5140 = -1;

    @OriginalMember(owner = "client!br", name = "Z", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!br", name = "db", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!br", name = "fb", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!br", name = "ob", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!br", name = "pb", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lfv;)V", line = 64)
    public class359(class107 arg0) {
        super(arg0);
        this.field5139 = new class197(arg0);
        super.field486 = new class248(super.field458);
        super.field493 = new class248(super.field458);
        super.field475 = new class248(super.field458);
        super.field468 = new class248(super.field458);
        super.field490 = new class248(super.field458);
        super.field479 = new class248(super.field458);
        super.field488 = new class248(super.field458);
        super.field463 = new class248(super.field458);
        super.field481 = new class248(super.field458);
        super.field492 = new class248(super.field458);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILfaa;II)V", line = 18)
    public static final void method2116(int arg0, class140 arg1, int arg2, int arg3) {
        class375.field5315 = arg1;
        ++field5129;
        class495.field6814 = arg3;
        if (arg2 != 8191) {
            method2116(-84, (class140) null, -42, 93);
        }
        class17.field251 = arg0;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IIII)I", line = 31)
    public static final int method2117(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field5145;
        if (~var4 == -1) {
            return arg3;
        } else if (var4 == 1) {
            return -arg0 + 4095;
        } else {
            return arg2 == var4 ? -arg3 + 4095 : arg0;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 53)
    public final void method171(int arg0) {
        this.field5139 = new class197(super.field458);
        if (arg0 != 896) {
            method2118(-90);
        }
        ++field5144;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V", line = 90)
    public static final void method2118(int arg0) {
        class292.field4399.method465(((float) class274.field3872.field889 * 0.1F + 0.7F) * 1.1523438F);
        ++field5133;
        class292.field4399.method450(class137.field1930, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class292.field4399.method453(class448.field6270, arg0, 0);
        class292.field4399.method432(class421.field5949);
    }
}
