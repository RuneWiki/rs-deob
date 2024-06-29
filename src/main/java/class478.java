import java.applet.Applet;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class478 extends OutputStream {

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "Lgda;")
    public static class53 field6777 = new class53(0, 7);

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "Lda;")
    public static class59 field6780;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "Ljava/applet/Applet;")
    public static Applet field6779;

    @OriginalMember(owner = "client!iea", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        field6776++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIII)I", line = 16)
    public static final int method2858(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1260895222) {
            field6780 = null;
        }
        field6775++;
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        return ((arg3 & 0xFF) >> 2 << 10) + (arg0 >> 5 << 7) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 43)
    public static final void method2859(int arg0) {
        field6778++;
        for (int var1 = arg0; var1 < class557.field7828; var1++) {
            class319 var2 = class503.field7212[var1];
            if (var2.field4421 == 3) {
                if (var2.field4428 == null) {
                    var2.field4422 = Integer.MIN_VALUE;
                } else {
                    class192.field2560.method1733(var2.field4428);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)V", line = 70)
    public static void method2860(boolean arg0) {
        field6779 = null;
        field6777 = null;
        if (arg0) {
            method2860(false);
        }
        field6780 = null;
    }
}
