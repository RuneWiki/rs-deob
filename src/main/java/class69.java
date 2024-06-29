import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class69 {

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public int field1032 = -1;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[[I")
    public static int[][] field1025 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[I")
    public static int[] field1028 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "J")
    public static long field1030 = 0L;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lek;")
    public class173 field1031;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
    public int[] field1027;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field1026;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZ)V")
    public static final void method455(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class231.field3748 = arg1;
        class175.field2759 = arg2;
        class303.field4815 = arg3;
        class212.field3297 = new class113[arg0][class231.field3748][class175.field2759];
        class285.field4613 = new int[arg0][class231.field3748 + 1][class175.field2759 + 1];
        if (arg4) {
            class100.field1496 = new class113[1][class231.field3748][class175.field2759];
            class100.field1497 = new int[class231.field3748][class175.field2759];
            class79.field1192 = new int[1][class231.field3748 + 1][class175.field2759 + 1];
        } else {
            class100.field1496 = null;
            class100.field1497 = null;
            class79.field1192 = null;
        }
        class89.method605(false);
        class179.field2824 = new class27[500];
        class24.field303 = 0;
        class266.field4330 = new class27[500];
        class283.field4597 = 0;
        class283.field4595 = new int[arg0][class231.field3748 + 1][class175.field2759 + 1];
        class21.field276 = new class158[5000];
        class66.field974 = 0;
        class27.field320 = new class158[100];
        class33.field394 = new boolean[class303.field4815 + class303.field4815 + 1][class303.field4815 + class303.field4815 + 1];
        class180.field2827 = new boolean[class303.field4815 + class303.field4815 + 2][class303.field4815 + class303.field4815 + 2];
        class15.field218 = new byte[arg0][class231.field3748][class175.field2759];
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method456(int arg0) {
        if (arg0 == -4832) {
            field1028 = null;
            field1025 = null;
        }
    }
}
