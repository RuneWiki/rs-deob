import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class78 extends InputStream {

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field1092 = 0;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[I")
    public static int[] field1094 = new int[1000];

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[I")
    public static int[] field1098 = new int[4096];

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Lir;")
    public static class185 field1096;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Ltm;")
    public static class20 field1095;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lea;")
    public static class395 field1088;

    @OriginalMember(owner = "client!wj", name = "read", descriptor = "()I", line = 3)
    public final int read() {
        field1093++;
        class31.method245(30000L, 68);
        return -1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 30)
    public static void method619(byte arg0) {
        if (arg0 != 45) {
            method619((byte) -13);
        }
        field1098 = null;
        field1088 = null;
        field1095 = null;
        field1094 = null;
        field1096 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V", line = 46)
    public static final void method620(int arg0, int arg1) {
        field1089++;
        if (arg0 != 30000) {
            method620(-123, -42);
        }
        class440 var2 = class186.method1241(arg1, 9, (byte) 56);
        var2.method2749(13828096);
    }
}
