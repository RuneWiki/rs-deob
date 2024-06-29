import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class125 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2171 = 1;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[[I")
    public static int[][] field2175 = new int[104][104];

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lbf;")
    public static class199 field2174 = new class199(2);

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lqk;")
    public static class207 field2177 = class24.method212(255, "Utiliser");

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Ldd;")
    public static class132 field2178 = new class132();

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2179 = -1;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lbl;")
    public static class33 field2180;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLpk;)V")
    public static final void method881(byte arg0, class99 arg1) {
        field2173++;
        if (arg0 >= 40) {
            class120.field2090 = arg1;
            class135.field2333 = class120.field2090.method698(7, 4);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V")
    public static final void method882(int arg0, boolean arg1) {
        field2176++;
        class141.field2436 = arg1;
        int var2 = 96 / ((-arg0 - 73) / 37);
        class46.field914 = !class212.method1512(-103);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method883(int arg0) {
        field2180 = null;
        field2174 = null;
        field2177 = null;
        field2178 = null;
        if (arg0 <= 118) {
            method883(-4);
        }
        field2175 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static final int method884(int arg0, int arg1) {
        field2172++;
        if (arg0 != 18514) {
            field2180 = null;
        }
        return arg1 & 0xFF;
    }
}
