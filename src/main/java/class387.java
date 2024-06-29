import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class387 {

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lof;")
    private class620 field5375 = new class620(64);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Loh;")
    private class404 field5370;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Loh;")
    private class404 field5369;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Z")
    public static boolean field5368 = false;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "J")
    public static long field5372;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lbaa;", line = 11)
    public final class521 method2392(int arg0, int arg1) {
        field5373++;
        class521 var3 = (class521) this.field5375.method3538((long) arg1, arg0 ^ 0x8000);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field5369.method2481(0, arg1, (byte) 125);
        } else {
            var4 = this.field5370.method2481(0, arg1 & 0x7FFF, (byte) 101);
        }
        class521 var5 = new class521();
        if (var4 != null) {
            var5.method3062(new class244(var4), -4270);
        }
        if (arg0 <= arg1) {
            var5.method3064(126);
        }
        this.field5375.method3537(115, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 45)
    public static final void method2393(String arg0, boolean arg1, int arg2) {
        field5374++;
        int var3 = class585.field8256;
        int[] var4 = class399.field5459;
        boolean var5 = false;
        int var6 = 0;
        if (!arg1) {
            return;
        }
        while (var3 > var6) {
            class183 var7 = class75.field792[var4[var6]];
            if (var7 != null && class90.field937 != var7 && var7.field2157 != null && var7.field2157.equalsIgnoreCase(arg0)) {
                if (arg2 == 1) {
                    class480.field6873++;
                    class249 var12 = class289.method1715(class472.field6756, 126, class41.field470);
                    var12.field3016.method1460(0, 24710);
                    var12.field3016.method1446(var4[var6], true);
                    class510.method3017(var12, 124);
                } else if (arg2 == 4) {
                    class375.field4820++;
                    class249 var11 = class289.method1715(class44.field496, 110, class41.field470);
                    var11.field3016.method1456((byte) -112, 0);
                    var11.field3016.method1444(1507430696, var4[var6]);
                    class510.method3017(var11, 100);
                } else if (arg2 == 5) {
                    class260.field3207++;
                    class249 var10 = class289.method1715(class570.field8087, 52, class41.field470);
                    var10.field3016.method1460(0, 24710);
                    var10.field3016.method1444(1507430696, var4[var6]);
                    class510.method3017(var10, 60);
                } else if (arg2 == 6) {
                    class251.field3029++;
                    class249 var8 = class289.method1715(class253.field3051, 117, class41.field470);
                    var8.field3016.method1444(1507430696, var4[var6]);
                    var8.field3016.method1471(-78, 0);
                    class510.method3017(var8, 104);
                } else if (arg2 == 7) {
                    class252.field3043++;
                    class249 var9 = class289.method1715(class451.field6499, 90, class41.field470);
                    var9.field3016.method1470((byte) -122, var4[var6]);
                    var9.field3016.method1471(-77, 0);
                    class510.method3017(var9, 79);
                }
                var5 = true;
                break;
            }
            var6++;
        }
        if (!var5) {
            class490.method2948((byte) -55, class486.field6925.method2936(class489.field6978, 75) + arg0, 4);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(ILoh;Loh;)V", line = 154)
    public class387(int arg0, class404 arg1, class404 arg2) {
        this.field5370 = arg2;
        this.field5369 = arg1;
        if (this.field5369 != null) {
            this.field5369.method2482(0, 0);
        }
        if (this.field5370 != null) {
            this.field5370.method2482(0, 0);
        }
    }
}
