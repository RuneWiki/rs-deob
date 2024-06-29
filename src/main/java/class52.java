import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 extends class116 {

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "Lic;")
    public static class59 field1296 = class59.method433(0, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Llf;")
    public static class82 field1287 = new class82(30);

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "Lic;")
    private static class59 field1297 = class59.method433(0, "wishes to trade with you)3");

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Lic;")
    public static class59 field1298 = null;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field1300 = 0;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "Lic;")
    public static class59 field1302 = class59.method433(0, "Freie Welt");

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "Lic;")
    public static class59 field1301 = field1297;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Lpd;")
    public class108 field1295;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "Lfd;")
    public static class40 field1299;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "Lmd;")
    public class87 field1292;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "[B")
    public byte[] field1293;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "[Lce;")
    public static class20[] field1286;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBI)Lfe;")
    public static final class41 method390(int arg0, int arg1, byte arg2, int arg3) {
        field1294++;
        class41 var4 = new class41();
        var4.field1043 = arg0;
        var4.field1044 = arg1;
        class33.field889.method38(var4, (byte) 91, (long) arg3);
        class152.method1116(-2055025328, arg1);
        class99.method804(91, arg1);
        class159 var5 = class134.method1032(arg3, 499749840);
        if (var5 != null) {
            class42.method320(false, var5);
        }
        if (class151.field3287 != null) {
            class42.method320(false, class151.field3287);
            class151.field3287 = null;
        }
        class98.field2440 = false;
        class107.field2557 = 0;
        if (arg2 < 79) {
            field1287 = null;
        }
        class149.method1106(-15412, class30.field781, class138.field3081, class128.field2895, class159.field3646);
        if (class126.field2866 != -1) {
            class24.method152(-117, class126.field2866, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public static void method391(byte arg0) {
        field1287 = null;
        field1302 = null;
        field1286 = null;
        field1297 = null;
        field1299 = null;
        field1301 = null;
        field1298 = null;
        if (arg0 < 54) {
            method391((byte) 6);
        }
        field1296 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
    public static int method392(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public static final void method393(int arg0, int arg1, int arg2) {
        field1289++;
        if (class1.field28 != 2) {
            return;
        }
        class81.method667((class158.field3487 - class68.field1756 << 7) + class99.field2454, (-class89.field2229 + class73.field1831 << 7) + class30.field782, 69, class80.field1998 * 2);
        int var3 = -14 / ((-arg0 - 50) / 51);
        if (class95.field2416 > -1 && class23.field561 % 20 < 10) {
            class62.field1576[0].method1023(class95.field2416 + arg2 - 12, class149.field3258 + arg1 - 28);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
    public static final void method394(byte arg0) {
        field1288++;
        if (!class83.field2067) {
            return;
        }
        class30.field770 = null;
        class51.field1281 = null;
        field1286 = null;
        class147.field3200 = null;
        class23.field547 = null;
        class131.field2941 = null;
        class87.field2210 = null;
        class53.field1319 = null;
        class100.field2464 = null;
        class155.field3370 = null;
        class130.field2916 = null;
        class75.field1858 = null;
        class26.field665 = null;
        if (arg0 >= -37) {
            return;
        }
        class84.field2121 = null;
        class49.field1238 = null;
        class118.field2745 = null;
        class88.field2223 = null;
        class89.field2254 = null;
        class64.field1634 = null;
        class138.field3083 = null;
        class82.field2050 = null;
        class136.field3027 = null;
        class56.method415(2, 1);
        class49.method382(true, (byte) 99);
        class83.field2067 = false;
    }
}
