import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class98 extends class316 {

    @OriginalMember(owner = "client!aja", name = "s", descriptor = "Llh;")
    public static class551 field1109 = new class551();

    @OriginalMember(owner = "client!aja", name = "y", descriptor = "Z")
    public static boolean field1115 = true;

    @OriginalMember(owner = "client!aja", name = "x", descriptor = "Lfba;")
    public static class27 field1114 = new class27(67, -1);

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1116 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!aja", name = "p", descriptor = "B")
    private byte field1106;

    @OriginalMember(owner = "client!aja", name = "r", descriptor = "B")
    private byte field1108;

    @OriginalMember(owner = "client!aja", name = "u", descriptor = "B")
    private byte field1111;

    @OriginalMember(owner = "client!aja", name = "w", descriptor = "B")
    private byte field1113;

    @OriginalMember(owner = "client!aja", name = "q", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!aja", name = "v", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!aja", name = "A", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!aja", name = "t", descriptor = "Z")
    private boolean field1110;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)V")
    public static void method706(int arg0) {
        if (arg0 == 16777215) {
            field1114 = null;
            field1116 = null;
            field1109 = null;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(BLmda;)V")
    public final void method152(byte arg0, class276 arg1) {
        arg1.field3999 = this.field1110;
        arg1.field4009 = this.field1108;
        field1112++;
        arg1.field3995 = this.field1111;
        if (arg0 <= 80) {
            this.field1106 = 24;
        }
        arg1.field3988 = this.field1113;
        arg1.field3996 = this.field1106;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILso;)V")
    public final void method148(int arg0, class494 arg1) {
        this.field1110 = arg1.method2964((byte) 114) == 1;
        field1107++;
        this.field1108 = arg1.method2943((byte) 16);
        this.field1106 = arg1.method2943((byte) 16);
        if (arg0 != -1001) {
            method706(107);
        }
        this.field1111 = arg1.method2943((byte) 16);
        this.field1113 = arg1.method2943((byte) 16);
    }
}
