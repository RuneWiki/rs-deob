import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class361 extends class189 {

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public static int field5123 = 0;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public int field5119;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public int field5124;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "[I")
    public int[] field5117;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "[I")
    public int[] field5120;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "[I")
    public int[] field5126;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "[Lgca;")
    public class249[] field5118;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "[Lgca;")
    public class249[] field5121;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "[[[B")
    public byte[][][] field5125;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
    public static final void method2312(int arg0) {
        field5122++;
        for (class508 var1 = (class508) class455.field6429.method4000((byte) -7); var1 != null; var1 = (class508) class455.field6429.method4002(arg0 ^ 0xFFFFFFBD)) {
            if (var1.field7268 > 1) {
                var1.field7268 = 0;
                class609.field8569.method4018((byte) 125, var1, ((class37) var1.field7267.field9891.field8206).field466);
                var1.field7267.method4003(3);
            }
        }
        class350.field4958 = 0;
        class25.field341 = arg0;
        class215.field2820.method2767((byte) -19);
        class417.field5899.method1175((byte) 109);
        class455.field6429.method4003(3);
        class436.field6192 = false;
    }
}
