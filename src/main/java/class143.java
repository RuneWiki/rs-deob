import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class143 extends OutputStream {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lao;")
    public static class188 field2117 = new class188(80, 12);

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lgf;")
    public static class180 field2119 = new class180("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lvp;")
    public static class123 field2121 = new class123(36, 11);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lhh;")
    public static class84 field2120;

    @OriginalMember(owner = "client!jf", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2116++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method1034(int arg0) {
        field2120 = null;
        field2121 = null;
        field2117 = null;
        if (arg0 != 80) {
            method1034(-20);
        }
        field2119 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILti;)Lie;")
    public static final class6 method1035(int arg0, class303 arg1) {
        field2114++;
        if (arg0 != 11) {
            field2122 = 126;
        }
        return new class6(arg1.method1901(126), arg1.method1901(arg0 ^ 0x72), arg1.method1901(123), arg1.method1901(124), arg1.method1866(false), arg1.method1866(false), arg1.method1918((byte) -39));
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
    public static final void method1036(int arg0, int arg1) {
        field2118++;
        if (~arg0 != arg1 && class210.field3022[arg0]) {
            class335.field5139.method670(arg0, 0);
            class416.field6157[arg0] = null;
            class103.field1643[arg0] = null;
            class210.field3022[arg0] = false;
        }
    }
}
