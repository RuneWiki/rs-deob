import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class69 {

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lid;")
    public static class274 field897 = new class274(0, 0);

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field900 = -1;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lsh;")
    public static class303 field899 = new class303();

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
    public static int[] field902 = new int[2];

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Ldm;")
    public static class300 field901;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field895;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLim;[B)V", line = 7)
    public final void method454(byte arg0, class192 arg1, byte[] arg2) {
        field896++;
        if (arg1.field3128[arg1.field3129] != 31 || arg1.field3128[arg1.field3129 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field895 == null) {
            this.field895 = new Inflater(true);
        }
        try {
            this.field895.setInput(arg1.field3128, arg1.field3129 + 10, -arg1.field3129 - 10 + arg1.field3128.length + -8);
            this.field895.inflate(arg2);
            if (arg0 != -117) {
                field902 = (int[]) null;
            }
        } catch (Exception var5) {
            this.field895.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field895.reset();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lqm;B)V", line = 34)
    public static final void method455(class247 arg0, byte arg1) {
        class149.method1039(arg1 - 1215, 200000, arg0);
        field894++;
        if (arg1 != -64) {
            field902 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)Ljava/lang/String;", line = 48)
    public static final String method456(int arg0) {
        field898++;
        if (arg0 != 31152) {
            field902 = (int[]) null;
        }
        String var1;
        if (class49.field676 == 1 && class126.field1887 < 2) {
            var1 = class138.field2068 + class37.field500 + class318.field4930 + " ->";
        } else if (class313.field4874 && class126.field1887 < 2) {
            var1 = class282.field4458 + class37.field500 + class315.field4903 + " ->";
        } else if (class12.field146 && class333.field5177[81] && class126.field1887 > 2) {
            var1 = class93.method675(class126.field1887 - 2, true);
        } else {
            var1 = class93.method675(class126.field1887 - 1, true);
        }
        if (class126.field1887 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class126.field1887 - 2) + class45.field621;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 77)
    public class69() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 84)
    public static void method457(int arg0) {
        field897 = null;
        if (arg0 != 12288) {
            field900 = 115;
        }
        field899 = null;
        field901 = null;
        field902 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(III)V", line = 98)
    private class69(int arg0, int arg1, int arg2) {
    }
}
