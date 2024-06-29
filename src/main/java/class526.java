import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class526 {

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "[I")
    public static int[] field7778 = new int[200];

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "F")
    public static float field7779 = 0.0F;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field7775;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLcu;[B)V")
    public final void method3126(byte arg0, class145 arg1, byte[] arg2) {
        field7776++;
        if (arg1.field2270[arg1.field2289] != 31 || arg1.field2270[arg1.field2289 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field7775 == null) {
            this.field7775 = new Inflater(true);
        }
        try {
            this.field7775.setInput(arg1.field2270, arg1.field2289 + 10, arg1.field2270.length + -10 + -arg1.field2289 + -8);
            int var4 = -29 / ((arg0 - 13) / 58);
            this.field7775.inflate(arg2);
        } catch (Exception var5) {
            this.field7775.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field7775.reset();
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class526() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)I")
    public static final int method3127(byte arg0, int arg1) {
        field7777++;
        int var2 = 7 % ((arg0 + 39) / 41);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
    public static void method3128(boolean arg0) {
        field7778 = null;
        if (!arg0) {
            method3128(true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(III)V")
    private class526(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z[Lf;)V")
    public static final void method3129(boolean arg0, class529[] arg1) {
        field7780++;
        class214.field3081 = arg1.length;
        class11.field186 = new class529[class214.field3081 + 10];
        class378.field5719 = new int[class214.field3081 + 10];
        class73.method592(arg1, 0, class11.field186, 0, class214.field3081);
        if (!arg0) {
            method3129(true, null);
        }
        for (int var2 = 0; var2 < class214.field3081; var2++) {
            class378.field5719[var2] = class11.field186[var2].method104();
        }
        for (int var3 = class214.field3081; var3 < class11.field186.length; var3++) {
            class378.field5719[var3] = 12;
        }
    }
}
