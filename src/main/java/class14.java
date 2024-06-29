import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 extends class540 {

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lkia;")
    public class645 field262;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "[[B")
    public static byte[][] field263 = new byte[1000][];

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/String;")
    public static String field261;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method129(int arg0) {
        field263 = null;
        if (arg0 == -16314) {
            field261 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static final void method130(byte arg0) {
        field260++;
        for (int var1 = 0; var1 < 5; var1++) {
            class259.field3641[var1] = false;
        }
        class777.field10720 = 0;
        class763.field10510 = 1;
        class141.field1822 = -1;
        class645.field9087 = -1;
        class367.field5290 = 0;
        if (arg0 != -15) {
            field259 = -110;
        }
        class180.field2732 = -1;
        class406.field5746 = -1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lwq;B)V")
    public static final void method131(class176 arg0, byte arg1) {
        field258++;
        class176 var2 = class686.method3875(3, arg0);
        if (arg1 != -110) {
            field261 = null;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class512.field7325;
            var4 = class638.field8980;
        } else {
            var3 = var2.field2664;
            var4 = var2.field2673;
        }
        class260.method1711(false, false, var4, var3, arg0);
        class584.method3390(arg0, var4, var3, 3);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lkia;)V")
    public class14(class645 arg0) {
        this.field262 = arg0;
    }
}
