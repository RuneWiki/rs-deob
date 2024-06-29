import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class463 extends OutputStream {

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lmq;")
    public static class78 field6709 = new class78(11, -2);

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field6710 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static final void method2742(byte arg0) {
        field6705++;
        if (!class138.field1656) {
            return;
        }
        class460 var1 = class611.method3340(class210.field2693, class545.field7651, -110);
        if (var1 != null && var1.field6603 != null) {
            class575 var2 = new class575();
            var2.field8028 = var1;
            var2.field8027 = var1.field6603;
            class445.method2625(var2);
        }
        class138.field1656 = false;
        class563.field7893 = -1;
        class105.field1289 = -1;
        if (var1 != null) {
            class663.method3591(16886, var1);
        }
        if (arg0 != 88) {
            method2744(-61);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
    public static final void method2743(int arg0, int arg1) {
        field6707++;
        class303 var2 = (class303) class274.field3460.method3248((long) arg0, arg1 + 2);
        if (arg1 != -2) {
            field6710 = -32;
        }
        if (var2 != null) {
            var2.field3893 = !var2.field3893;
            var2.field3898.method1826(var2.field3893, (byte) 4);
        }
    }

    @OriginalMember(owner = "client!bd", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field6708++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method2744(int arg0) {
        if (arg0 == 0) {
            field6709 = null;
        }
    }
}
