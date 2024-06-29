import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class373 {

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "Lnga;")
    private class510 field5236 = new class510(256);

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "Lgt;")
    private class453 field5235;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "Ld;")
    private class149 field5240;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field5233 = -1;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field5232 = 0;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
    public static int field5241 = 0;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5234;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public static final void method2347(Canvas arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field5237++;
        Dimension var2 = arg0.getSize();
        class223.method1547(var2.height, var2.width, (byte) 42);
        if (class435.field6079 == 1) {
            class154.field2309.method572(arg0, class575.field8149, class584.field8240);
        } else {
            class154.field2309.method572(arg0, class546.field7700, class198.field2843);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
    public final void method2348(byte arg0) {
        this.field5236.method3049(5, (byte) 126);
        if (arg0 != 99) {
            this.field5240 = null;
        }
        field5238++;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)Lwda;")
    public final class636 method2349(byte arg0, int arg1) {
        field5231++;
        Object var3 = this.field5236.method3054((byte) -111, (long) arg1);
        if (var3 != null) {
            return (class636) var3;
        } else if (this.field5240.method1152(arg1, arg0 + 67)) {
            if (arg0 != 29) {
                field5234 = null;
            }
            class546 var4 = this.field5240.method1154(-104, arg1);
            int var5 = var4.field7706 ? 64 : this.field5235.field6504;
            class636 var7;
            if (var4.field7699 && this.field5235.method562()) {
                float[] var6 = this.field5240.method1153(false, arg1, false, 0.7F, var5, var5);
                var7 = this.field5235.method2719(6636, var5, var6, class282.field4019, var5, var4.field7709 != 0);
            } else {
                int[] var8;
                if (var4.field7708 != 2 && class471.method2857((byte) 72, var4.field7711)) {
                    var8 = this.field5240.method1151(0.7F, var5, true, -18596, arg1, var5);
                } else {
                    var8 = this.field5240.method1155(var5, false, arg1, (byte) 79, 0.7F, var5);
                }
                var7 = this.field5235.method2740(var4.field7709 != 0, var5, var5, var8, (byte) -100);
            }
            var7.method427(var4.field7704, (byte) 66, var4.field7702);
            this.field5236.method3047(false, var7, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public final void method2350(int arg0) {
        this.field5236.method3048(false);
        field5239++;
        if (arg0 != 32025) {
            method2351(-44);
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
    public static final void method2351(int arg0) {
        class702.field9857 = arg0;
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
    public static void method2352(int arg0) {
        if (arg0 < -5) {
            field5234 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lgt;Ld;)V")
    public class373(class453 arg0, class149 arg1) {
        this.field5235 = arg0;
        this.field5240 = arg1;
    }
}
