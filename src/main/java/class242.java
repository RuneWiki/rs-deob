import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class242 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3390 = 0;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3397 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!v", name = "d", descriptor = "B")
    public static byte field3391;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lqj;")
    public static class238 field3395;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[B")
    public byte[] field3399;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[B")
    public byte[] field3402;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILqj;)I")
    public static final int method1493(int arg0, class238 arg1) {
        field3396++;
        if (arg0 != 3160) {
            method1494((byte) 6);
        }
        int var2 = 0;
        if (arg1.method1451(-114, class402.field5981)) {
            var2++;
        }
        if (arg1.method1451(-126, class306.field4373)) {
            var2++;
        }
        if (arg1.method1451(-121, class425.field6319)) {
            var2++;
        }
        if (arg1.method1451(-112, class165.field2143)) {
            var2++;
        }
        if (arg1.method1451(-120, class219.field3102)) {
            var2++;
        }
        if (arg1.method1451(arg0 - 3276, class213.field3021)) {
            var2++;
        }
        if (arg1.method1451(-117, class169.field2217)) {
            var2++;
        }
        if (arg1.method1451(-118, class232.field3278)) {
            var2++;
        }
        if (arg1.method1451(-127, class106.field1423)) {
            var2++;
        }
        if (arg1.method1451(-127, class91.field1265)) {
            var2++;
        }
        if (arg1.method1451(-122, class119.field1603)) {
            var2++;
        }
        if (arg1.method1451(arg0 ^ 0xFFFFF3DB, class125.field1659)) {
            var2++;
        }
        if (arg1.method1451(arg0 ^ 0xFFFFF3D3, class259.field3769)) {
            var2++;
        }
        if (arg1.method1451(-124, class132.field1774)) {
            var2++;
        }
        if (arg1.method1451(-123, class437.field6412)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method1494(byte arg0) {
        int var1 = -34 / ((arg0 + 33) / 37);
        field3397 = null;
        field3395 = null;
    }
}
