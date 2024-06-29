import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class38 extends OutputStream {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "[S")
    public static short[] field560 = new short[256];

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field561 = 0;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 12)
    public static void method306(int arg0) {
        if (arg0 != 256) {
            method308((class39) null, 90);
        }
        field560 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lvn;", line = 25)
    public static final class139 method307(int arg0, int arg1) {
        field563++;
        class139 var2 = (class139) class39.field583.method652((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class291.field4827.method1504(class98.method649((byte) -8, arg0), true, class45.method345(95, arg0));
        class139 var4 = new class139();
        var4.field2242 = arg0;
        if (var3 != null) {
            var4.method983(new class313(var3), -65536);
        }
        var4.method975(true);
        if (arg1 != 0) {
            field561 = -100;
        }
        class39.field583.method642(var4, (long) arg0, arg1 - 98);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lkl;I)V", line = 55)
    public static final void method308(class39 arg0, int arg1) {
        if (arg1 != 0) {
            field560 = (short[]) null;
        }
        field562++;
        class250 var2 = (class250) class109.field1586.method29(class265.method1872(arg0.field597, 86), 103);
        if (var2 == null) {
            return;
        }
        if (var2.field3983 != null) {
            class28.field434.method1412(var2.field3983);
            var2.field3983 = null;
        }
        var2.method1131(8);
    }

    @OriginalMember(owner = "client!u", name = "write", descriptor = "(I)V", line = 82)
    public final void write(int arg0) throws IOException {
        field564++;
        throw new IOException();
    }
}
