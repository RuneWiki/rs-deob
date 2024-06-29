import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lad;")
    public static class5 field1 = class88.method674("scape main", 126);

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lad;")
    public static class5 field12 = class88.method674("Spiel)2Engine wird gestartet)3)3)3", 114);

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lad;")
    public static class5 field13 = class88.method674("Welt", -97);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lbb;")
    public static class9 field4 = new class9(64);

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lad;")
    private static class5 field15 = class88.method674("slide:", 101);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "[I")
    public static int[] field18 = new int[1000];

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lad;")
    public static class5 field17 = field15;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lad;")
    public static class5 field16 = class88.method674("Aus", -68);

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lgb;")
    public static class39 field8;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 11)
    public static void method1(byte arg0) {
        field15 = null;
        field17 = null;
        field16 = null;
        field18 = null;
        field12 = null;
        if (arg0 != -101) {
            method3(-67, -5);
        }
        field4 = null;
        field13 = null;
        field8 = null;
        field1 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 31)
    public static final void method2(int arg0) {
        field11++;
        class108.field2711.method101((byte) -89);
        if (arg0 <= 25) {
            method3(-101, 98);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I", line = 62)
    public static final int method3(int arg0, int arg1) {
        class82 var2 = class20.method163(-32, arg1);
        int var3 = var2.field1935;
        field19++;
        int var4 = var2.field1940;
        if (arg0 > -25) {
            field8 = null;
        }
        int var5 = var2.field1943;
        int var6 = class101.field2449[var5 - var4];
        return var6 & class128.field3058[var3] >> var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIILld;)V", line = 101)
    public static final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, class70 arg5) {
        field6++;
        class94 var6 = new class94();
        var6.field2217 = arg5.field1650;
        var6.field2221 = arg5.field1694;
        int var7 = arg5.field1693;
        if (arg2 != 0) {
            method1((byte) 26);
        }
        int var8 = arg5.field1705;
        var6.field2225 = arg3 * 128;
        if (arg0 == 1 || arg0 == 3) {
            var7 = arg5.field1705;
            var8 = arg5.field1693;
        }
        var6.field2222 = arg1;
        var6.field2212 = arg5.field1683 * 128;
        var6.field2240 = arg5.field1672;
        var6.field2211 = arg4 * 128;
        var6.field2235 = (arg4 + var8) * 128;
        var6.field2220 = (arg3 + var7) * 128;
        var6.field2239 = arg5.field1665;
        if (arg5.field1655 != null) {
            var6.field2238 = arg5;
            var6.method721(-17);
        }
        class7.field259.method176(var6, -19597);
        if (var6.field2217 != null) {
            var6.field2226 = var6.field2239 + (int) (Math.random() * (double) (var6.field2240 - var6.field2239));
        }
    }
}
