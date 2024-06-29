import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class189 {

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Leg;")
    private static class37 field3252 = class174.method1167("Attack", -102);

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Leg;")
    public static class37 field3249 = class174.method1167("ondulation:", -55);

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Leg;")
    public static class37 field3247 = field3252;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Leg;")
    public static class37 field3253 = class174.method1167("floorshadows", 75);

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Leg;")
    public static class37 field3256 = class174.method1167("Zugewiesener Speicher)3", 77);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Leg;")
    public static class37 field3245 = class174.method1167("welle:", -59);

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3257 = -1;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lve;")
    public class189 field3248;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lve;")
    public class189 field3251;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
    public static int[] field3246;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method1308(byte arg0) {
        field3258++;
        if (this.field3251 == null) {
            return;
        }
        this.field3251.field3248 = this.field3248;
        this.field3248.field3251 = this.field3251;
        this.field3248 = null;
        if (arg0 == 64) {
            this.field3251 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1309(int arg0) {
        field3245 = null;
        if (arg0 != -31122) {
            method1309(-96);
        }
        field3252 = null;
        field3247 = null;
        field3249 = null;
        field3253 = null;
        field3256 = null;
        field3246 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILva;)Lqk;")
    public static final class7 method1310(int arg0, class187 arg1) {
        field3244++;
        class7 var2 = new class7(arg1.method1253(-71), arg1.method1253(37), arg1.method1244(false), arg1.method1244(false), arg1.method1290((byte) 90), arg1.method1268(255) == 1);
        if (arg0 != -1) {
            return null;
        }
        int var3 = arg1.method1268(255);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field118.method1574(new class259(arg1.method1244(false), arg1.method1244(false), arg1.method1244(false), arg1.method1244(false)), 0);
        }
        var2.method41(126);
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljl;Ljl;ZLjl;Ljl;)V")
    public static final void method1311(class101 arg0, class101 arg1, boolean arg2, class101 arg3, class101 arg4) {
        class126.field2112 = arg0;
        if (arg2) {
            method1309(15);
        }
        class112.field1907 = arg4;
        field3250++;
        class234.field4043 = arg1;
        class30.field444 = arg3;
        class232.field4000 = new class237[class30.field444.method676(false)][];
        class40.field638 = new boolean[class30.field444.method676(false)];
    }
}
