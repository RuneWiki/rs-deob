import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class135 extends class454 {

    @OriginalMember(owner = "client!eda", name = "H", descriptor = "Lgfa;")
    public class740 field2254;

    @OriginalMember(owner = "client!eda", name = "A", descriptor = "Lis;")
    public class119 field2247;

    @OriginalMember(owner = "client!eda", name = "B", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!eda", name = "C", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!eda", name = "D", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!eda", name = "E", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!eda", name = "F", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!eda", name = "G", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!eda", name = "I", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!eda", name = "J", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public final void method1121(int arg0) {
        field2256++;
        this.field2251 = this.field2254.field10251;
        this.field2249 = this.field2254.field10245;
        this.field2253 = this.field2254.field10244;
        if (this.field2254.field10247 != null) {
            this.field2254.field10247.method1549(this.field2247.field2036, this.field2247.field2037, this.field2247.field2027, class33.field401);
        }
        this.field2248 = class33.field401[0];
        this.field2250 = class33.field401[arg0];
    }

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "(I)[Ljd;")
    public static final class624[] method1122(int arg0) {
        if (arg0 == 2) {
            field2255++;
            return new class624[] { class51.field729, class229.field3356, class92.field1319 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Luf;I)V")
    public static final void method1123(class519 arg0, int arg1) {
        field2252++;
        if (class399.field5494 != arg0.field7232) {
            int var3 = -107 / ((arg1 - 37) / 36);
        } else if (class719.field10041.field212 == null) {
            arg0.field7226 = 0;
            arg0.field7211 = 0;
        } else {
            arg0.field7162 = 150;
            arg0.field7133 = (int) (Math.sin((double) class594.field8494 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field7146 = 5;
            arg0.field7211 = class541.field7492;
            arg0.field7226 = class743.method4104(class719.field10041.field212, -63);
            arg0.field7219 = class719.field10041.field4040;
            arg0.field7152 = class719.field10041.field4110;
            arg0.field7275 = class719.field10041.field4122;
            arg0.field7258 = 0;
            class98 var2 = arg0.field7219 == -1 ? null : class168.field2552.method3287(108, arg0.field7219);
            if (var2 != null) {
                class354.method2142(255, arg0.field7275, var2);
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Lgfa;Leea;)V")
    public class135(class740 arg0, class187 arg1) {
        this.field2254 = arg0;
        this.field2247 = this.field2254.method4076(-1);
        this.method1121(2);
    }
}
