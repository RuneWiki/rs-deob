import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class495 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lwq;")
    public static class115 field7225 = new class115(13, 7);

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lao;")
    public static class191 field7231 = new class191(94, -1);

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[F")
    public static float[] field7233 = new float[4];

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "F")
    public static float field7228;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Lsk;")
    public class442 field7229;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
    public static boolean field7227;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
    public int[] field7226;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[S")
    public static short[] field7232;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "[[[I")
    public static int[][][] field7230;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 3)
    public static void method2984(int arg0) {
        if (arg0 < 97) {
            method2984(104);
        }
        field7225 = null;
        field7232 = null;
        field7231 = null;
        field7233 = null;
        field7230 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 38)
    public static final void method2985(byte arg0) {
        field7222++;
        if (arg0 >= -35) {
            method2984(-48);
        }
        for (class36 var1 = (class36) class69.field806.method970(12); var1 != null; var1 = (class36) class69.field806.method976((byte) -122)) {
            if (class196.method1122(28263, var1.field361)) {
                class104.method633(var1, 92);
            }
        }
        if (class391.field5656 == 1) {
            class95.method530((byte) 8);
            return;
        }
        class317.method1889(class155.field2026, (byte) 116, class425.field6180, class366.field4993, class451.field6723);
        int var2 = class121.field1570.method1066(-116, class246.field3233.method1823(class374.field5072, (byte) -88));
        for (class36 var3 = (class36) class69.field806.method970(12); var3 != null; var3 = (class36) class69.field806.method976((byte) -120)) {
            int var4 = class183.method1065(var3, 98);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class366.field4993 = var2 + 8;
        class425.field6180 = (class144.field1922 ? 26 : 22) + class391.field5656 * 16;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljk;BI)I", line = 84)
    public static final int method2986(class450 arg0, byte arg1, int arg2) {
        if (arg1 != 7) {
            field7233 = null;
        }
        field7224++;
        if (!client.method1253(arg0).method1398(arg2, 0) && arg0.field6675 == null) {
            return -1;
        } else if (arg0.field6655 == null || arg2 >= arg0.field6655.length) {
            return -1;
        } else {
            return arg0.field6655[arg2];
        }
    }
}
