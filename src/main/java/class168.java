import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class168 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field2925 = -1;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Lvh;")
    public static class61 field2931;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V", line = 7)
    public static final void method1317(byte arg0, int arg1) {
        if (arg0 != -83) {
            field2930 = 3;
        }
        class303.field4793 = new int[arg1];
        field2932++;
        class100.field1626 = new int[arg1];
        class300.field4780 = new int[arg1];
        class146.field2640 = new int[arg1];
        class193.field3238 = new int[arg1];
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)I", line = 23)
    public static final int method1318(int arg0, boolean arg1) {
        field2929++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1) {
            field2925 = 107;
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 40)
    public static void method1319(byte arg0) {
        if (arg0 == 44) {
            field2931 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 57)
    public static final int method1320(String arg0, int arg1) {
        int var2 = -17 % ((-arg1 - 68) / 36);
        field2928++;
        if (arg0 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < class352.field5570; var3++) {
            if (arg0.equalsIgnoreCase(class98.field1601[var3])) {
                return var3;
            }
        }
        return -1;
    }
}
