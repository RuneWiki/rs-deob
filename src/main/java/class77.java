import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class77 extends class513 {

    @OriginalMember(owner = "client!in", name = "r", descriptor = "Lqf;")
    public static class632 field1133 = new class632();

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "J")
    public static long field1127;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "[I")
    public int[] field1128;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "[I")
    public int[] field1129;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "[I")
    public int[] field1130;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "[Lnga;")
    public class477[] field1126;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "[Lnga;")
    public class477[] field1135;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "[[[B")
    public byte[][][] field1131;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 10)
    public static void method650(int arg0) {
        if (arg0 == -9751) {
            field1133 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V", line = 28)
    public static final void method651(File arg0, int arg1, String arg2) {
        if (arg1 != -984) {
            method650(35);
        }
        field1132++;
        class540.field7845.put(arg2, arg0);
    }
}
