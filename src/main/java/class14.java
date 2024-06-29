import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 extends class109 {

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "Ldd;")
    public static class35 field257 = class180.method1196((byte) -47, "(U1");

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Ldd;")
    private static class35 field253 = class180.method1196((byte) 126, "glow3:");

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Ldd;")
    public static class35 field243 = field253;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Ldd;")
    public static class35 field249 = field253;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Ldd;")
    public static class35 field262 = class180.method1196((byte) -75, "gleiten:");

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "Loa;")
    public static class135 field264;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lpb;")
    public class145 field247;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Lfd;")
    public static class55 field242;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lae;")
    public static class6 field250;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "Lje;")
    public class94 field258;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "Lje;")
    public class94 field261;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "[I")
    public int[] field252;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static void method119(int arg0) {
        field257 = null;
        field249 = null;
        field253 = null;
        field250 = null;
        if (arg0 != 128) {
            method119(-11);
        }
        field264 = null;
        field243 = null;
        field242 = null;
        field262 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        field248++;
        int var2 = this.field266;
        if (arg0) {
            return;
        }
        class145 var3 = this.field247.method1002((byte) 62);
        if (var3 == null) {
            this.field251 = 0;
            this.field245 = 0;
            this.field255 = 0;
            this.field252 = null;
            this.field266 = -1;
        } else {
            this.field255 = var3.field3016;
            this.field245 = var3.field3047;
            this.field266 = var3.field3050;
            this.field252 = var3.field3063;
            this.field251 = var3.field3064 * 128;
        }
        if (this.field266 != var2 && this.field261 != null) {
            class88.field1958.method982(this.field261);
            this.field261 = null;
        }
    }
}
