import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class103 {

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Luv;")
    public static class2 field1546 = new class2(60, 12);

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field1555 = 0;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public static void method777(byte arg0) {
        if (arg0 < 101) {
            method777((byte) 105);
        }
        field1546 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static final void method778(int arg0) {
        field1549++;
        class100.field1522 = new String[500];
        class228.field3213 = class192.field2837.field6516 + class192.field2837.field6503 + 2;
        class286.field4293 = class342.field5252.field6516 + class342.field5252.field6503 + 2;
        for (int var1 = arg0; var1 < class100.field1522.length; var1++) {
            class100.field1522[var1] = "";
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public static final void method779(int arg0) {
        field1550++;
        class222.field3158.method4(0);
        for (int var1 = 0; var1 < 32; var1++) {
            class59.field816[var1] = 0L;
        }
        if (arg0 != 12592) {
            method777((byte) 34);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class53.field676[var2] = 0L;
        }
        class345.field5322 = 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Lpm;")
    public final class103 method780(byte arg0, int arg1) {
        if (arg0 >= -16) {
            return null;
        } else {
            field1553++;
            return new class103(this.field1551, arg1, this.field1547, this.field1552);
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIII)V")
    public class103(int arg0, int arg1, int arg2, int arg3) {
        this.field1552 = arg3;
        this.field1547 = arg2;
        this.field1548 = arg1;
        this.field1551 = arg0;
    }
}
