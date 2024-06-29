import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class505 implements class655 {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field7151;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "[I")
    public static int[] field7147;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIILr;)V")
    public static final void method2874(boolean arg0, int arg1, int arg2, class98 arg3) {
        class20.field383 = new class453[arg1][arg2];
        class170.field2401 = arg3;
        if (arg0) {
            return;
        }
        field7152++;
        if (class9.field265 != null) {
            class329.field4779 = class581.method3336(class9.field265[0], class9.field265[1], class9.field265[3], class9.field265[2], class9.field265[5], 124, class9.field265[4]);
        }
        class641.field9195 = new class453();
        class365.method2238((byte) 112);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Lmh;")
    public final class139 method599(int arg0) {
        field7149++;
        int var2 = 63 % ((arg0 + 89) / 34);
        return class20.field385;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method2875(byte arg0) {
        field7147 = null;
        if (arg0 != 115) {
            field7147 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Z")
    public static final boolean method2876(int arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            method2877(null, 45, 50, null);
        }
        field7153++;
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Canvas;IILfa;)Lr;")
    public static final class98 method2877(Canvas arg0, int arg1, int arg2, class615 arg3) {
        if (arg1 != 16) {
            method2877(null, -63, -7, null);
        }
        field7150++;
        return new class287(arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILps;IB)V")
    public static final void method2878(int arg0, class5 arg1, int arg2, byte arg3) {
        field7148++;
        if (arg3 != -16) {
            field7147 = null;
        }
        class591 var4 = arg1.method18(class332.field4821, (byte) 68);
        if (var4 == null) {
            return;
        }
        class332.field4821.method652(arg2, arg0, arg2 + arg1.field202, arg1.field76 + arg0);
        if (class65.field1038 < 3) {
            class416.field6153.method1525((float) arg1.field202 / 2.0F + (float) arg2, (float) arg1.field76 / 2.0F + (float) arg0, 4096, (int) (-class311.field4589) & 0x3FFF << 2, var4, arg2, arg0);
        } else {
            class332.field4821.method715(-16777216, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
    public class505(int arg0) {
        this.field7151 = arg0;
    }
}
