import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class72 extends class17 {

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field1187 = 0;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "J")
    public static long field1186 = 0L;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[I")
    public static int[] field1188 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field1189 = 0;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "[[[Lhj;")
    public static class109[][][] field1185;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZC)C")
    public static final char method435(boolean arg0, char arg1) {
        if (arg0) {
            field1191++;
            return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
        } else {
            return (char) 65450;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method436(byte arg0) {
        field1185 = null;
        field1188 = null;
        int var1 = -45 % ((arg0 + 1) / 35);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)Lfa;")
    public static final class223 method437(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class223 var4 = var3.field1976;
            var3.field1976 = null;
            return var4;
        }
    }
}
