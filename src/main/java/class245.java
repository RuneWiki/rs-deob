import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class245 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "[I")
    public static int[] field3205 = new int[8];

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "[I")
    public static int[] field3207;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "[I")
    public static int[] field3211;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IB)I")
    public static final int method1497(int arg0, byte arg1) {
        field3206++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (arg1 != -124) {
            method1499(56);
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(IB)I")
    public static final int method1498(int arg0, byte arg1) {
        field3209++;
        if (arg1 >= -79) {
            field3211 = null;
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public static void method1499(int arg0) {
        if (arg0 < 125) {
            field3211 = null;
        }
        field3211 = null;
        field3207 = null;
        field3205 = null;
    }
}
