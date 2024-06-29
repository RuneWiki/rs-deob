import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class151 extends class476 {

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Ljn;")
    public static class134 field1981 = new class134(108, -2);

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1983 = -1;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "[I")
    public static int[] field1984;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIZ)V", line = 4)
    public final void method995(int arg0, int arg1, int arg2, boolean arg3) {
        ++field1980;
        class111.field1332.method171(arg1 + -2, arg2, super.field6598.field5723 + 4, super.field6598.field5722 + 2, ((class702) super.field6598).field9786, 0);
        class111.field1332.method171(arg1 + -1, arg2 - -1, super.field6598.field5723 + 2, super.field6598.field5722, 0, 0);
        if (arg0 != -29993) {
            this.method997(56, false, 118, 25);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V", line = 16)
    public static void method996(int arg0) {
        field1984 = null;
        field1981 = null;
        if (arg0 != 0) {
            field1984 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZII)V", line = 27)
    public final void method997(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = -69 / ((arg3 - -12) / 34);
        ++field1982;
        int var6 = this.method2838(true) * super.field6598.field5723 / 10000;
        class111.field1332.method233(arg0, arg2 + 2, var6, super.field6598.field5722 + -2, ((class702) super.field6598).field9788, 0);
        class111.field1332.method233(arg0 - -var6, arg2 + 2, super.field6598.field5723 - var6, super.field6598.field5722 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILjava/awt/Canvas;Ld;)Lha;", line = 40)
    public static final class473 method998(int arg0, int arg1, Canvas arg2, class101 arg3) {
        ++field1979;
        if (arg0 != 10000) {
            field1981 = null;
        }
        return new class194(arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lae;Lae;Lhu;)V", line = 54)
    public class151(class283 arg0, class283 arg1, class702 arg2) {
        super(arg0, arg1, arg2);
    }
}
