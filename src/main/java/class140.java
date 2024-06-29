import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class140 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public int field1799 = 1;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lgm;")
    public static class125 field1800 = new class125("", 15);

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field1805 = 4;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "C")
    public char field1804;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public static void method865(byte arg0) {
        field1800 = null;
        if (arg0 != -27) {
            method867(88);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([I[JB)V")
    public static final void method866(int[] arg0, long[] arg1, byte arg2) {
        class570.method3209(arg0, arg1, 0, arg1.length - 1, false);
        field1803++;
        if (arg2 != 118) {
            field1800 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Lbr;")
    public static final class396 method867(int arg0) {
        field1798++;
        class396 var1 = (class396) class342.field4599.method115((byte) -72);
        if (var1 == null) {
            return arg0 > 0 ? null : new class396();
        } else {
            class677.field9458--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILji;B)V")
    private final void method868(int arg0, class611 arg1, byte arg2) {
        field1801++;
        if (arg0 == 1) {
            this.field1804 = class14.method54(arg1.method3390((byte) -19), (byte) 122);
        } else if (arg0 == 2) {
            this.field1799 = 0;
        }
        if (arg2 != -37) {
            this.field1799 = -63;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lji;I)V")
    public final void method869(class611 arg0, int arg1) {
        field1802++;
        if (arg1 != -23453) {
            return;
        }
        while (true) {
            int var3 = arg0.method3428((byte) 50);
            if (var3 == 0) {
                return;
            }
            this.method868(var3, arg0, (byte) -37);
        }
    }
}
