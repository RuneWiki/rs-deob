import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class162 extends InputStream {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Lmb;")
    public static class96 field2875 = class243.method1708("k", (byte) 122);

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Lmb;")
    private static class96 field2881 = class243.method1708("Tue", (byte) 101);

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lmb;")
    private static class96 field2874 = class243.method1708("Sun", (byte) 126);

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field2884 = 100;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lmb;")
    public static class96 field2878 = class243.method1708("3D)2Softwarebibliothek gestartet)3", (byte) 109);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Lmb;")
    private static class96 field2871 = class243.method1708("Thu", (byte) 101);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lmb;")
    private static class96 field2873 = class243.method1708("Mon", (byte) 112);

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lmb;")
    private static class96 field2887 = class243.method1708("Wed", (byte) 125);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lmb;")
    private static class96 field2872 = class243.method1708("Sat", (byte) 120);

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Lmb;")
    private static class96 field2888 = class243.method1708("Fri", (byte) 118);

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[Lmb;")
    public static class96[] field2879 = new class96[] { field2874, field2873, field2881, field2887, field2871, field2888, field2872 };

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "[[[I")
    public static int[][][] field2889;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Lri;")
    public static final class36 method1175(int arg0) {
        if (arg0 != -1) {
            method1178(57, 11);
        }
        field2886++;
        return class197.field3435 < class62.field1053.length ? class62.field1053[class197.field3435++] : null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)Z")
    public static final boolean method1176(byte arg0, int arg1) {
        field2890++;
        if (arg0 != -54) {
            method1182(9);
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)J")
    public static final long method1177(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        return var3 == null || var3.field3269 == null ? 0L : var3.field3269.field1766;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lmb;")
    public static final class96 method1178(int arg0, int arg1) {
        if (arg1 <= 120) {
            field2880 = -6;
        }
        field2885++;
        class96 var2 = new class96();
        var2.field1580 = new byte[arg0];
        var2.field1600 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILff;I)Lmj;")
    public static final class246 method1179(int arg0, class3 arg1, int arg2) {
        field2882++;
        if (arg2 >= -71) {
            field2884 = 73;
        }
        return class153.method1119(arg1, arg0, 4) ? class161.method1174(0) : null;
    }

    @OriginalMember(owner = "client!vj", name = "read", descriptor = "()I")
    public final int read() {
        field2877++;
        class226.method1543(30000L, -738);
        return -1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lff;III)Lmj;")
    public static final class246 method1180(class3 arg0, int arg1, int arg2, int arg3) {
        field2883++;
        if (class224.method1530(arg2, arg1, (byte) 101, arg0)) {
            int var4 = -106 % ((46 - arg3) / 55);
            return class161.method1174(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method1181(byte arg0) {
        field2879 = null;
        field2875 = null;
        if (arg0 <= 126) {
            return;
        }
        field2887 = null;
        field2881 = null;
        field2872 = null;
        field2878 = null;
        field2873 = null;
        field2888 = null;
        field2889 = null;
        field2871 = null;
        field2874 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static final void method1182(int arg0) {
        field2876++;
        if (class254.field4390 || class44.field755 == 2) {
            return;
        }
        try {
            class272.field4731.method692(class242.field4209, Integer.MAX_VALUE);
        } catch (Throwable var2) {
        }
        int var1 = 110 % ((arg0 - 41) / 61);
    }
}
