import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class318 {

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Lpf;")
    public static class425 field4807 = new class425(20, 16);

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field4811 = -1;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4805;

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
    public class318() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILef;[B)V")
    public final void method1942(int arg0, class385 arg1, byte[] arg2) {
        field4810++;
        if (arg1.field5685[arg1.field5666] != 31 || arg1.field5685[arg1.field5666 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4805 == null) {
            this.field4805 = new Inflater(true);
        }
        try {
            this.field4805.setInput(arg1.field5685, arg1.field5666 + 10, arg1.field5685.length + -arg1.field5666 + -18);
            this.field4805.inflate(arg2);
        } catch (Exception var4) {
            this.field4805.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4805.reset();
        if (arg0 <= 106) {
            method1943(-58, -30, -44);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
    public static final void method1943(int arg0, int arg1, int arg2) {
        field4808++;
        class306.field4631[arg1] = arg0;
        class106 var3 = (class106) class456.field6773.method2302((long) arg1, 23576);
        int var4 = -124 / ((arg2 - 46) / 62);
        if (var3 == null) {
            class106 var5 = new class106(4611686018427387905L);
            class456.field6773.method2301(23, var5, (long) arg1);
        } else if (var3.field1418 != 4611686018427387905L) {
            var3.field1418 = class445.method2750(-27580) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public static void method1944(byte arg0) {
        field4807 = null;
        if (arg0 != -30) {
            method1945((byte) 18);
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V")
    public static final void method1945(byte arg0) {
        int var1 = -41 / ((-arg0 - 28) / 54);
        class160.field2208.method2307(5142);
        field4806++;
        class387.field5720.method2307(5142);
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(III)V")
    private class318(int arg0, int arg1, int arg2) {
    }
}
