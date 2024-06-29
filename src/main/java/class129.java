import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class129 {

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lma;")
    public static class5 field1934 = class12.method119("m", (byte) 112);

    @OriginalMember(owner = "client!b", name = "e", descriptor = "[Lii;")
    public static class221[] field1933 = new class221[2048];

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[[I")
    public static int[][] field1931 = new int[5][5000];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
    public static int[] field1929 = new int[128];

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lma;")
    public static class5 field1941 = class12.method119("W-=hlen Sie eine Welt", (byte) 91);

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lma;")
    public static class5 field1938 = class12.method119("<col=80ff00>", (byte) 79);

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1940 = 0;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public int field1939;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 4)
    public static void method856(int arg0) {
        field1938 = null;
        field1931 = (int[][]) null;
        field1929 = null;
        field1933 = null;
        if (arg0 != -546) {
            field1933 = (class221[]) null;
        }
        field1934 = null;
        field1941 = null;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 46)
    public static final void method857(int arg0) {
        int var1 = 19 % ((26 - arg0) / 49);
        field1932++;
        class293.method1970();
        class293.method1968();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILhf;Ljava/awt/Component;BI)Lq;", line = 89)
    public static final class169 method858(int arg0, class154 arg1, Component arg2, byte arg3, int arg4) {
        field1936++;
        if (class138.field2049 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class169 var5 = (class169) Class.forName("ff").getDeclaredConstructor().newInstance();
                var5.field2594 = new int[(class37.field591 ? 2 : 1) * 256];
                var5.field2603 = arg0;
                var5.method20(arg2);
                var5.field2605 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field2605 > 16384) {
                    var5.field2605 = 16384;
                }
                var5.method24(var5.field2605);
                if (class290.field4937 > 0 && class236.field3906 == null) {
                    class236.field3906 = new class9();
                    class236.field3906.field142 = arg1;
                    arg1.method991(class236.field3906, false, class290.field4937);
                }
                if (class236.field3906 != null) {
                    if (class236.field3906.field137[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class236.field3906.field137[arg4] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class120 var7 = new class120(arg1, arg4);
                    var7.field2594 = new int[(class37.field591 ? 2 : 1) * 256];
                    if (arg3 <= 7) {
                        field1937 = 67;
                    }
                    var7.field2603 = arg0;
                    var7.method20(arg2);
                    var7.field2605 = 16384;
                    var7.method24(var7.field2605);
                    if (class290.field4937 > 0 && class236.field3906 == null) {
                        class236.field3906 = new class9();
                        class236.field3906.field142 = arg1;
                        arg1.method991(class236.field3906, false, class290.field4937);
                    }
                    if (class236.field3906 != null) {
                        if (class236.field3906.field137[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class236.field3906.field137[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class169();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
