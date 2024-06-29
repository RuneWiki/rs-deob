import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class372 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field5004 = -1;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Llh;")
    public static class487 field5006 = new class487(43, 0);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Z")
    public static boolean field5014 = false;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Leg;")
    public static class93 field5013 = new class93();

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[Lmc;")
    public static class119[] field5017 = new class119[35];

    @OriginalMember(owner = "client!we", name = "p", descriptor = "F")
    public static float field5016;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field5001;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public int field5002;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field5003;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public int field5009;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public int field5011;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public int field5012;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[[B")
    public static byte[][] field5015;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIB)Z", line = 6)
    public static final boolean method2142(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5008++;
        if (!class539.field7280) {
            return false;
        } else if (class676.field9648 < 100) {
            return false;
        } else if (class469.method2648((byte) -122, arg0, arg3, arg1)) {
            int var5 = -1 % ((arg4 - 63) / 54);
            int var6 = arg1 << class588.field8259;
            int var7 = arg0 << class588.field8259;
            if (class566.method3242(class631.field8750, (byte) -74, class409.field5812[arg3].method332(arg0, 1, arg1), var6, class631.field8750, arg2, var7)) {
                class77.field1010++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 52)
    public static void method2143(boolean arg0) {
        if (!arg0) {
            field5013 = null;
        }
        field5017 = null;
        field5006 = null;
        field5015 = null;
        field5013 = null;
    }
}
