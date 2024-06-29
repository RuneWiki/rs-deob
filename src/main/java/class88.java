import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class88 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lak;")
    public static class137 field1742 = new class137();

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lcc;")
    public static class209 field1745 = class95.method669(104, "Hidden)2");

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Lsg;")
    public static class162 field1744 = new class162();

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[J")
    public static long[] field1746 = new long[32];

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[I")
    public static int[] field1747 = new int[2];

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field1748 = 0;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lcc;")
    public static class209 field1749 = class95.method669(100, "Choisir une option");

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Ljb;")
    public static final class269 method632(byte arg0) {
        field1741++;
        int var1 = class185.field3332[0] * class110.field2226[0];
        byte[] var2 = class202.field3638[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        if (arg0 != 55) {
            return null;
        }
        while (var4 < var1) {
            var3[var4] = class117.field2341[class27.method220(var2[var4], 255)];
            var4++;
        }
        class269 var5 = new class269(class241.field4360, class50.field996, class182.field3289[0], class271.field4815[0], class110.field2226[0], class185.field3332[0], var3);
        class63.method468(121);
        return var5;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1746 = null;
        field1742 = null;
        field1744 = null;
        field1745 = null;
        field1747 = null;
        field1749 = null;
        if (arg0 != 0) {
            method633(6);
        }
    }
}
