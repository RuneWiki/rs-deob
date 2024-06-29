import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class416 extends class235 {

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "Lla;")
    public class145 field6196;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "Lle;")
    public class65 field6203;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "[I")
    public static int[] field6202 = new int[1024];

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "Ljava/lang/String;")
    public static String field6192 = null;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "Lpe;")
    public static class391 field6198 = new class391();

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field6206 = 0;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public int field6193;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public int field6197;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public int field6199;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public int field6200;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public int field6205;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "Lro;")
    public static class249 field6207;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "[[Lpp;")
    public static class262[][] field6195;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V", line = 9)
    public final void method2686(int arg0) {
        this.field6193 = this.field6196.field1908;
        this.field6200 = this.field6196.field1913;
        this.field6197 = this.field6196.field1910;
        field6201++;
        if (this.field6196.field1903 != null) {
            this.field6196.field1903.method814(this.field6203.field930, this.field6203.field914, this.field6203.field923, class23.field410);
        }
        this.field6205 = class23.field410[2];
        this.field6199 = class23.field410[arg0];
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V", line = 35)
    public static final void method2687(byte arg0) {
        if (arg0 >= 31) {
            class395.field5932.method212(-99);
            field6204++;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(Z)V", line = 50)
    public static void method2688(boolean arg0) {
        field6198 = null;
        if (arg0) {
            field6202 = null;
        }
        field6195 = null;
        field6207 = null;
        field6192 = null;
        field6202 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lla;Lqp;)V", line = 80)
    public class416(class145 arg0, class279 arg1) {
        this.field6196 = arg0;
        this.field6203 = class446.method2805(arg0.field1905, (byte) -127);
        this.method2686(0);
    }
}
