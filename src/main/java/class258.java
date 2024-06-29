import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class258 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lna;")
    public static class26 field4203 = class69.method505("::fpson", (byte) -124);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4202 = -1;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Z")
    public static boolean field4206 = false;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lof;")
    public static class237 field4210 = null;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[[[I")
    public static int[][][] field4204 = new int[2][][];

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
    public static int[] field4205 = new int[14];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Ljb;")
    public static class28 field4212;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[[[I")
    public static int[][][] field4209;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 11)
    public static void method1814(int arg0) {
        field4210 = null;
        field4204 = (int[][][]) null;
        field4209 = (int[][][]) null;
        field4212 = null;
        field4205 = null;
        if (arg0 != -26723) {
            field4209 = (int[][][]) ((int[][][]) null);
        }
        field4203 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 26)
    public static final void method1815(int arg0) {
        if (arg0 != -16385) {
            return;
        }
        field4207++;
        if (class23.field329 != null) {
            class23.field329.method387((byte) -34);
        }
        if (class166.field2580 != null) {
            class166.field2580.method387((byte) -34);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILll;Ljava/awt/Component;II)Lvh;", line = 58)
    public static final class53 method1816(int arg0, class156 arg1, Component arg2, int arg3, int arg4) {
        field4213++;
        if (class168.field2603 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class53 var5 = (class53) Class.forName("qa").getDeclaredConstructor().newInstance();
                var5.field859 = arg0;
                var5.field839 = new int[(class26.field395 ? 2 : 1) * 256];
                var5.method398(arg2);
                var5.field862 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field862 > 16384) {
                    var5.field862 = 16384;
                }
                var5.method384(var5.field862);
                if (class146.field2236 > 0 && class11.field151 == null) {
                    class11.field151 = new class316();
                    class11.field151.field5416 = arg1;
                    arg1.method1054(0, class146.field2236, class11.field151);
                }
                if (class11.field151 != null) {
                    if (class11.field151.field5419[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class11.field151.field5419[arg3] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                if (arg4 != 14) {
                    field4202 = 124;
                }
                try {
                    class65 var7 = new class65(arg1, arg3);
                    var7.field839 = new int[(class26.field395 ? 2 : 1) * 256];
                    var7.field859 = arg0;
                    var7.method398(arg2);
                    var7.field862 = 16384;
                    var7.method384(var7.field862);
                    if (class146.field2236 > 0 && class11.field151 == null) {
                        class11.field151 = new class316();
                        class11.field151.field5416 = arg1;
                        arg1.method1054(arg4 ^ 0xE, class146.field2236, class11.field151);
                    }
                    if (class11.field151 != null) {
                        if (class11.field151.field5419[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class11.field151.field5419[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class53();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBII)V", line = 153)
    public static final void method1817(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class27.field454 = arg4;
        field4208++;
        if (arg2 != 111) {
            field4206 = true;
        }
        class225.field3572 = arg1;
        class80.field1259 = arg0;
        class117.field1840 = arg3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lve;B)V", line = 196)
    public static final void method1818(class266 arg0, byte arg1) {
        if (arg1 != 69) {
            method1816(-53, (class156) null, (Component) null, 79, 12);
        }
        field4201++;
        class191.field2989 = arg0;
    }
}
