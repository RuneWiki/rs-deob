import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public abstract class class723 {

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public static int field10144 = -1;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 3)
    public static final void method4071(Canvas arg0, int arg1) {
        field10146++;
        Dimension var2 = arg0.getSize();
        class578.method3357(1, var2.height, var2.width);
        if (class463.field6612 == 1) {
            class438.field6281.method505(arg0, class745.field10372, class212.field3070);
        } else {
            class438.field6281.method505(arg0, class377.field5425, class333.field4974);
        }
        if (arg1 != 6412) {
            field10144 = -125;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)Z", line = 24)
    public final boolean method4072(int arg0) {
        field10145++;
        if (arg0 != -1) {
            field10144 = 63;
        }
        return this.method3199(-1) || this.method3195(-1) || this.method3203(-1);
    }

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)V", line = 36)
    public static final void method4073(int arg0) {
        class110.field1382 = new class176[class611.field8623.method3136(false)][];
        if (arg0 != 1) {
            field10144 = 97;
        }
        field10143++;
        class222.field3192 = new class176[class611.field8623.method3136(false)][];
        class323.field4845 = new boolean[class611.field8623.method3136(false)];
    }

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "(I)V", line = 63)
    public static final void method4074(int arg0) {
        if (class638.field8979.method509()) {
            class638.field8979.method405(class359.field5219);
            class725.method4079(-1);
            if (class607.field8578) {
                class685.method3865(class359.field5219, true);
            } else {
                Dimension var1 = class359.field5219.getSize();
                class638.field8979.method498(class359.field5219, var1.width, var1.height);
            }
            class638.field8979.method510(class359.field5219);
        } else {
            class226.method1559((byte) 51, false, class145.field1852.field9002.method2258((byte) -127));
        }
        field10142++;
        class149.method1028(-19376);
        class432.field6151 = true;
        if (arg0 != -1) {
            field10144 = 76;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
    public abstract void method3196(int arg0);

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)Z")
    public abstract boolean method3195(int arg0);

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)I")
    public abstract int method3197(byte arg0);

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(B)V")
    public abstract void method3205(byte arg0);

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "(I)Z")
    public abstract boolean method3199(int arg0);

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "(I)Z")
    public abstract boolean method3203(int arg0);

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "(I)Lik;")
    public abstract class218 method3209(int arg0);

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "(B)I")
    public abstract int method3201(byte arg0);
}
