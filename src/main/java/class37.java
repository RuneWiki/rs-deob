import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class37 extends OutputStream {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "[I")
    public static int[] field287 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "Lrg;")
    public static class548 field288 = new class548(58, 3);

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "Lsc;")
    public static class290 field291 = new class290();

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "Lg;")
    public static class135 field293 = new class135(1);

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IB)V", line = 3)
    public static final void method203(int arg0, byte arg1) {
        field290++;
        if (arg1 == -92) {
            class557 var2 = class93.method564(1, -14073, arg0);
            var2.method3264(-1037624096);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V", line = 18)
    public static void method204(byte arg0) {
        field293 = null;
        field288 = null;
        field291 = null;
        if (arg0 <= -64) {
            field287 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)V", line = 31)
    public static final void method205(byte arg0) {
        field292++;
        class418.method2378(17984, class224.field2758);
        if (arg0 > -71) {
            field288 = null;
        }
        class276.field3630++;
        class136.field1663.method2093(class99.method608(false), -117);
        class136.field1663.method2115(class185.field2239, 3324);
        class136.field1663.method2115(class426.field5495, 3324);
        class136.field1663.method2093(class565.field8299.field2170, -120);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLoj;)V", line = 53)
    public static final void method206(boolean arg0, class318 arg1) {
        arg1.field4057 = null;
        field286++;
        int var2 = arg1.field4059.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field4059[var3].field7289 = false;
        }
        class354[] var4 = class463.field6478;
        synchronized (class463.field6478) {
            if (class463.field6478.length > var2 && class509.field7204[var2] < 200) {
                class463.field6478[var2].method1991(arg1, -116);
                int var10002 = class509.field7204[var2]++;
            }
        }
        if (!arg0) {
            method204((byte) 87);
        }
    }

    @OriginalMember(owner = "client!vba", name = "write", descriptor = "(I)V", line = 87)
    public final void write(int arg0) throws IOException {
        field289++;
        throw new IOException();
    }
}
