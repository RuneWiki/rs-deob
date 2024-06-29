import java.awt.Canvas;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class414 extends OutputStream {

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lsba;")
    public static class218 field5851 = null;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field5846 = 500;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Llga;")
    public static class712 field5852 = new class712(8, 3);

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
    public static boolean field5853 = false;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "[I")
    public static int[] field5856 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lpca;")
    public static class715 field5854;

    @OriginalMember(owner = "client!dg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5850++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ld;IILjava/awt/Canvas;I)Lha;")
    public static final class60 method2389(class152 arg0, int arg1, int arg2, Canvas arg3, int arg4) {
        field5847++;
        if (arg4 != 500) {
            field5856 = null;
        }
        return new class217(arg3, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILee;IIZIIIIILhaa;)V")
    public static final void method2390(int arg0, int arg1, class676 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class82 arg11) {
        class39.field405 = null;
        class132.field1700 = null;
        class704.field9881 = arg7;
        class87.field1195 = arg1;
        class191.field2297 = null;
        class759.field10573 = arg6;
        class368.field5168 = arg3;
        class391.field5527 = arg10;
        class283.field3751 = arg2;
        if (arg5) {
            field5846 = 118;
        }
        class201.field2384 = arg8;
        field5848++;
        class116.field1521 = arg4;
        class735.field10261 = arg9;
        class468.field6472 = arg0;
        class321.field4309 = arg11;
        class367.method2181(-4264);
        class243.field3155 = true;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
    public static final void method2391(int arg0, int arg1, int arg2) {
        class425.method2432(arg2, arg0, arg1 ^ arg1);
        field5849++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method2392(byte arg0) {
        field5852 = null;
        field5854 = null;
        field5851 = null;
        field5856 = null;
        if (arg0 != 4) {
            field5846 = -72;
        }
    }
}
