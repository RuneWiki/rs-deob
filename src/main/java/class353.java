import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class353 {

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public int field5106 = 16777215;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public int field5117 = 8;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5112 = "Loading sprites - ";

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5109 = "Allocating memory";

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
    public static int[] field5111 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5116 = "Loaded world list data";

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public int field5104;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field5105;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field5110;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public int field5113;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public int field5114;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Z")
    public boolean field5103;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZII)V", line = 8)
    public static final void method2320(boolean arg0, int arg1, int arg2) {
        field5108++;
        class185.field2507.method5(-6445, 254);
        class65.field866++;
        class185.field2507.method1339(arg2, -16777216);
        if (arg0) {
            field5111 = null;
        }
        class185.field2507.method1366(arg1, (byte) 99);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lnj;BII)V", line = 25)
    private final void method2321(class228 arg0, byte arg1, int arg2, int arg3) {
        field5107++;
        if (arg1 != 48) {
            method2322(-29, 83, 35);
        }
        if (arg3 == 1) {
            this.field5117 = arg0.method1343(arg1 + 207);
        } else if (arg3 == 2) {
            this.field5103 = true;
        } else if (arg3 == 3) {
            this.field5114 = arg0.method1319((byte) -13);
            this.field5113 = arg0.method1319((byte) -13);
            this.field5105 = arg0.method1319((byte) -13);
        } else if (arg3 == 4) {
            this.field5104 = arg0.method1348(-91);
        } else if (arg3 == 5) {
            this.field5110 = arg0.method1343(255);
        } else if (arg3 == 6) {
            this.field5106 = arg0.method1333((byte) -124);
            return;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V", line = 80)
    public static final void method2322(int arg0, int arg1, int arg2) {
        class254 var3 = class213.field2852[arg0][arg1][arg2];
        if (var3 != null && var3.field3527 != null) {
            var3.field3527 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 92)
    public static void method2323(int arg0) {
        if (arg0 == 0) {
            field5112 = null;
            field5109 = null;
            field5111 = null;
            field5116 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lnj;II)V", line = 107)
    public final void method2324(class228 arg0, int arg1, int arg2) {
        field5115++;
        if (arg1 >= -118) {
            this.method2324((class228) null, -111, 112);
        }
        while (true) {
            int var4 = arg0.method1348(-91);
            if (var4 == 0) {
                return;
            }
            this.method2321(arg0, (byte) 48, arg2, var4);
        }
    }
}
