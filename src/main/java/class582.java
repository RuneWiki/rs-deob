import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class582 extends class331 {

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field8084 = new Rectangle[100];

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "[I")
    public static int[] field8081;

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(ILts;)V")
    public class582(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lgaa;I)V")
    public static final void method3241(class460 arg0, int arg1) {
        ++field8085;
        class460 var2 = class389.method2323(arg0, 31);
        int var3;
        int var4;
        if (var2 != null) {
            var3 = var2.field6566;
            var4 = var2.field6514;
        } else {
            var4 = class84.field1083;
            var3 = class599.field8320;
        }
        if (arg1 != 3) {
            field8084 = null;
        }
        class5.method23(false, var4, (byte) -41, arg0, var3);
        class738.method4137(var3, -897306066, var4, arg0);
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lts;)V")
    public class582(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
    public static void method3242(int arg0) {
        field8081 = null;
        field8084 = null;
        if (arg0 < 9) {
            field8081 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        if (~super.field4202 > -2 || super.field4202 > 3) {
            super.field4202 = this.method226((byte) 13);
        }
        if (arg0 != -1959) {
            this.method227(0, 103);
        }
        ++field8082;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        super.field4202 = arg1;
        ++field8087;
        if (arg0 < 113) {
            field8081 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            return 70;
        } else {
            ++field8088;
            return !super.field4203.method343((byte) 124).method353((byte) -84) ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)I")
    public final int method3243(byte arg0) {
        if (arg0 >= -119) {
            return -14;
        } else {
            ++field8083;
            return super.field4202;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        if (arg1 != 1) {
            this.method226((byte) 6);
        }
        ++field8086;
        return 1;
    }
}
