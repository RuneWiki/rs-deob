import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class229 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3347 = 0;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lgf;")
    public static class180 field3348 = new class180("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3350 = 0;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
    public static int[] field3351 = new int[25];

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3352 = -1;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1502(int arg0) {
        if (arg0 >= -96) {
            method1502(125);
        }
        field3351 = null;
        field3348 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[Lf;)V")
    public static final void method1503(byte arg0, class528[] arg1) {
        field3349++;
        if (arg0 >= -104) {
            return;
        }
        class138.field2081 = arg1.length;
        class444.field6515 = new class528[class138.field2081 + 10];
        class147.field2166 = new int[class138.field2081 + 10];
        class486.method2904(arg1, 0, class444.field6515, 0, class138.field2081);
        for (int var2 = 0; var2 < class138.field2081; var2++) {
            class147.field2166[var2] = class444.field6515[var2].method131();
        }
        for (int var3 = class138.field2081; var3 < class444.field6515.length; var3++) {
            class147.field2166[var3] = 12;
        }
    }
}
