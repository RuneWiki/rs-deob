import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class92 extends class43 {

    @OriginalMember(owner = "client!si", name = "r", descriptor = "[I")
    public static int[] field1077 = new int[13];

    @OriginalMember(owner = "client!si", name = "o", descriptor = "[Lgl;")
    public static class417[] field1074 = new class417[50];

    @OriginalMember(owner = "client!si", name = "p", descriptor = "F")
    public float field1075;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
    public static void method575(byte arg0) {
        field1074 = null;
        int var1 = 25 % ((arg0 + 19) / 61);
        field1077 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)I")
    public static final int method576(int arg0, int arg1) {
        if (arg0 != 13) {
            field1077 = null;
        }
        field1070++;
        return arg1 >>> 8;
    }
}
