import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class394 extends class227 {

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    private int field5684;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "[I")
    public static int[] field5689 = new int[100];

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "Lvs;")
    public static class420 field5690;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(II)V", line = 7)
    public static final void method2372(int arg0, int arg1) {
        class96.field1184 = new int[arg0];
        class371.field5043 = new int[arg0];
        class430.field6256 = new int[arg0];
        if (arg1 == 19351) {
            class113.field1486 = new int[arg0];
            ++field5687;
            class225.field3027 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 22)
    public static void method2373(byte arg0) {
        field5690 = null;
        field5689 = null;
        if (arg0 > -101) {
            method2372(86, -39);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V", line = 126)
    public class394(int arg0) {
        super(0, true);
        this.field5684 = 4096;
        this.field5684 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lug;II)V", line = 38)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg1 != 487215116) {
            field5689 = null;
        }
        if (arg2 == 0) {
            this.field5684 = (arg0.method2388((byte) -118) << 12) / 255;
        }
        ++field5685;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lza;ZILla;III)V", line = 65)
    public static final void method2374(class287 arg0, boolean arg1, int arg2, class316 arg3, int arg4, int arg5, int arg6) {
        ++field5686;
        if (arg1) {
            class337.field4467.method144((class372.field5051 - class337.field4467.method155()) / 2, (class430.field6244 + -class337.field4467.method153()) / 2);
            class34.field349.method144((class372.field5051 + -class34.field349.method155()) / 2, 18);
        }
        String var7 = "";
        if (class381.field5520 == class111.field1480) {
            var7 = class7.field94.method1823(class374.field5072, (byte) -88);
        } else if (class381.field5520 == class373.field5065) {
            var7 = class302.field3997.method1823(class374.field5072, (byte) -88);
        }
        arg3.method1885(-1, arg6 + arg6, arg5, class372.field5051 / 2, var7, class430.field6244 / 2 + -26);
        int var8 = class430.field6244 / 2 + -18;
        arg0.method1157(class372.field5051 / 2 - 152, var8, 304, 34, arg4, 0);
        arg0.method1157(class372.field5051 / 2 + -151, var8 + 1, 302, 32, 0, 0);
        arg0.method1153(class372.field5051 / 2 + -150, var8 + 2, class397.field5788 * 3, 30, arg2, 0);
        arg0.method1153(class372.field5051 / 2 + class397.field5788 * 3 + -150, var8 - -2, -(class397.field5788 * 3) + 300, 30, 0, 0);
        arg3.method1885(-1, arg6 + 2, arg5, class372.field5051 / 2, class266.field3568, class430.field6244 / 2 + 4);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 98)
    public class394() {
        this(4096);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I", line = 101)
    public final int[] method62(int arg0, int arg1) {
        ++field5683;
        int[] var3 = super.field3068.method1970(arg1, (byte) 71);
        if (arg0 != 15811) {
            method2372(27, 69);
        }
        if (super.field3068.field4480) {
            class438.method2688(var3, 0, class446.field6486, this.field5684);
        }
        return var3;
    }
}
