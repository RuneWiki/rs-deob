import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class94 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1696 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lqd;")
    public static class40 field1695 = class147.method1106("Titelbild ge-Offnet)3", (byte) -103);

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1698 = 127;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Lqd;")
    public static class40 field1700 = null;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[I")
    public static int[] field1702 = new int[1000];

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1704 = 1;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public int field1697;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Ln;")
    public class274 field1694;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[I")
    public int[] field1699;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 5)
    public static void method713(byte arg0) {
        field1702 = null;
        field1695 = null;
        if (arg0 < 10) {
            method713((byte) -110);
        }
        field1700 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILke;)V", line = 37)
    public static final void method714(int arg0, class107 arg1) {
        field1705++;
        class191 var2 = null;
        try {
            class70 var3 = arg1.method817("runescape", -7930);
            while (var3.field1258 == 0) {
                class160.method1227(1L, false);
            }
            if (var3.field1258 == arg0) {
                var2 = (class191) var3.field1260;
                class26 var4 = class182.method1329(1);
                var2.method1373(var4.field478, (byte) 79, var4.field472, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1376(-1);
            }
        } catch (Exception var7) {
        }
    }
}
