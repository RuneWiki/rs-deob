import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class156 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "[S")
    public short[] field2782;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "[B")
    public byte[] field2792;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "[Leb;")
    public class230[] field2777;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "[S")
    public short[] field2780;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
    public int[] field2776;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Leb;")
    public static class230 field2778 = class68.method589(0, "sch-Utteln:");

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Leb;")
    private static class230 field2788 = class68.method589(0, "glow3:");

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2783 = 0;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Leb;")
    public static class230 field2790 = null;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Leb;")
    public static class230 field2787 = field2788;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Leb;")
    public static class230 field2779 = field2788;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Z")
    public static boolean field2789 = false;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Leb;")
    public static class230 field2795 = class68.method589(0, "Lade Liste der Welten");

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Leb;")
    public static class230 field2796 = class68.method589(0, "null");

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Ldh;")
    public static class118 field2786 = new class118(0, 0);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Ljava/awt/Image;")
    public static Image field2791;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static final void method1185(int arg0) {
        field2794++;
        if (arg0 != 26248 || !class184.field3231) {
            return;
        }
        class245 var1 = class7.method67(class159.field2829, class163.field2915, (byte) -69);
        if (var1 != null && var1.field4221 != null) {
            class75 var2 = new class75();
            var2.field1354 = var1;
            var2.field1364 = var1.field4221;
            class58.method495(var2, 150);
        }
        class184.field3231 = false;
        class92.method777((byte) -65, var1);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)I")
    public final int method1186(int arg0, byte arg1) {
        field2793++;
        return arg1 == -42 ? this.field2792[arg0] & 0x3 : -1;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IB)Z")
    public final boolean method1187(int arg0, byte arg1) {
        field2784++;
        int var3 = 110 / ((2 - arg1) / 60);
        return (this.field2792[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1188(int arg0, int arg1, int arg2, int arg3) {
        if (class35.method318(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class177.method1286(var4 + 1, class106.field1912[arg0][arg1][arg2] + arg3, var5 + 1) && class177.method1286(var4 + 128 - 1, class106.field1912[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class177.method1286(var4 + 128 - 1, class106.field1912[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class177.method1286(var4 + 1, class106.field1912[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static final void method1189(int arg0) {
        field2781++;
        if (!class179.method1302(-98) && class171.field3036 != class124.field2174) {
            class228.method1571(class124.field2174, class273.field4809, class56.field1033.field2253[0], class56.field1033.field2296[0], (byte) -23, class231.field4014, false);
            return;
        }
        if (arg0 != -19854) {
            method1192(98);
        }
        if (class15.field353 != class124.field2174) {
            class15.field353 = class124.field2174;
            class130.method1027(96, class124.field2174);
            class127.method999((byte) 97);
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)I")
    public static final int method1190(int arg0) {
        field2774++;
        if (arg0 != -25146) {
            method1189(-33);
        }
        if (class37.field702) {
            return 0;
        } else if (class179.method1302(-44)) {
            return class42.field774 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)Leb;")
    public static final class230 method1191(int arg0) {
        field2785++;
        class230 var1 = class104.field1901;
        if (class269.field4768 != 0) {
            var1 = class28.field508;
        }
        if (arg0 != -15168) {
            return null;
        }
        class230 var2 = class89.field1580;
        if (class237.field4100 != null) {
            var2 = class173.method1267((byte) 59, new class230[] { class231.field4021, class237.field4100 });
        }
        return class173.method1267((byte) 59, new class230[] { class169.field2999, var1, class111.field1985, class37.method340(class226.field3896, (byte) -26), class151.field2685, class37.method340(class56.field1035, (byte) -26), var2, class259.field4577 });
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
    public static void method1192(int arg0) {
        field2778 = null;
        field2791 = null;
        field2788 = null;
        field2790 = null;
        if (arg0 >= -28) {
            return;
        }
        field2786 = null;
        field2779 = null;
        field2795 = null;
        field2787 = null;
        field2796 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V")
    public class156(int arg0) {
        this.field2775 = arg0;
        this.field2782 = new short[this.field2775];
        this.field2792 = new byte[this.field2775];
        this.field2777 = new class230[this.field2775];
        this.field2780 = new short[this.field2775];
        this.field2776 = new int[this.field2775];
    }
}
