import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class197 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Z")
    public static boolean field3131 = false;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lel;")
    public static class218 field3128 = new class218();

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Lma;")
    public static class5 field3135 = class12.method119("<col=ffffff>", (byte) 77);

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lma;")
    private static class5 field3136 = class12.method119("Loading fonts )2 ", (byte) 122);

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lma;")
    public static class5 field3140 = field3136;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lsj;")
    public static class181 field3139;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lbd;")
    public static class27 field3138;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Loi;")
    public static class32 field3137;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V", line = 13)
    public static final void method1301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3134++;
        if (arg3 < 92) {
            return;
        }
        int var8 = arg1 - arg4;
        int var9 = arg4 + arg7;
        for (int var10 = arg7; var10 < var9; var10++) {
            class239.method1690(arg5, 23267, arg6, class137.field2032[var10], arg2);
        }
        int var11 = arg6 - arg4;
        int var12 = arg5 + arg4;
        for (int var13 = arg1; var13 > var8; var13--) {
            class239.method1690(arg5, 23267, arg6, class137.field2032[var13], arg2);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class137.field2032[var14];
            class239.method1690(arg5, 23267, var12, var15, arg2);
            class239.method1690(var12, 23267, var11, var15, arg0);
            class239.method1690(var11, 23267, arg6, var15, arg2);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lnc;IIIIZI)V", line = 59)
    public static final void method1302(class12 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3133++;
        class290.method1959(arg0.field178, arg1, arg4, false, arg2, arg6, arg0.field211, arg3);
        if (!arg5) {
            field3138 = (class27) null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 93)
    public static void method1303(int arg0) {
        field3138 = null;
        field3135 = null;
        field3136 = null;
        if (arg0 == 8) {
            field3137 = null;
            field3128 = null;
            field3140 = null;
            field3139 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Z", line = 113)
    public static final boolean method1304(int arg0) {
        if (arg0 != 3) {
            return true;
        }
        field3130++;
        try {
            return class243.method1708(-125);
        } catch (IOException var5) {
            class231.method1644((byte) 123);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class167.field2549 + "," + class240.field3988 + "," + class242.field4027 + " - " + class171.field2625 + "," + (class151.field2183.field175[0] + class193.field3017) + "," + (class151.field2183.field186[0] + class74.field1158) + " - ";
            for (int var4 = 0; var4 < class171.field2625 && var4 < 50; var4++) {
                var3 = var3 + class200.field3184.field3617[var4] + ",";
            }
            class98.method630(var3, -96, var6);
            class150.method941((byte) -125);
            return true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)I", line = 145)
    public static final int method1305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        if (arg2 != 7) {
            field3128 = (class218) null;
        }
        field3127++;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return 8 - arg3 - arg0;
        } else if (var7 == 2) {
            return 7 - (arg1 + arg5 - 1);
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lni;B)V", line = 183)
    public static final void method1306(class202 arg0, byte arg1) {
        field3129++;
        if (class209.field3329) {
            return;
        }
        class124.method824();
        class234.field3869 = class180.method1174(class19.field323, arg0, arg1 ^ 0xFFFFFF81);
        int var2 = class156.field2314;
        int var3 = var2 * 956 / 503;
        class234.field3869.method721((class255.field4362 - var3) / 2, 0, var3, var2);
        if (arg1 != -127) {
            method1304(-122);
        }
        class151.field2189 = class225.method1594(class76.field1190, arg0, true);
        class151.field2189.method525(class255.field4362 / 2 - (class151.field2189.field1163 / 2), 18);
        class209.field3329 = true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)I")
    public abstract int method902(byte arg0);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method904(Component arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method903(int arg0, Component arg1);
}
