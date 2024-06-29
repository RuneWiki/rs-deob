import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class181 extends class141 {

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public int field3082 = 0;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public int field3099 = -1;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "Lhi;")
    public static class82 field3096 = class95.method664((byte) -37, "Versteckt");

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field3080 = 50;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "Lhi;")
    public static class82 field3101 = class95.method664((byte) -44, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Lhi;")
    private static class82 field3083 = class95.method664((byte) -87, "Loading textures )2 ");

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "Lhi;")
    public static class82 field3086 = field3083;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "[Ljm;")
    public static class303[] field3100;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 14)
    public static final void method1263(int arg0) {
        class167.field2914.method2168(0);
        if (arg0 != 10206) {
            method1263(19);
        }
        class256.field4399.method2168(0);
        field3091++;
        class200.field3432.method2168(0);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 33)
    public static void method1264(int arg0) {
        if (arg0 != -6) {
            return;
        }
        field3083 = null;
        field3101 = null;
        field3100 = null;
        field3086 = null;
        field3096 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)V", line = 62)
    public static final void method1265(int arg0, byte arg1) {
        class214.method1529((byte) 121);
        field3098++;
        class135.method923((byte) -119);
        if (arg1 <= 95) {
            return;
        }
        int var2 = class281.method1958(false, arg0).field2095;
        if (var2 == 0) {
            return;
        }
        int var3 = class312.field5398[arg0];
        if (var2 == 9) {
            class61.field961 = var3;
        }
        if (var2 == 5) {
            class245.field4256 = var3;
        }
        if (var2 == 6) {
            class165.field2890 = var3;
        }
    }
}
