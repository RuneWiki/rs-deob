import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class167 extends class249 {

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "[[B")
    public static byte[][] field2945 = new byte[1000][];

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Luc;")
    public static class11 field2946 = new class11(64);

    @OriginalMember(owner = "client!td", name = "x", descriptor = "S")
    public static short field2949 = 205;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field2950 = 0;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "[[B")
    public static byte[][] field2951;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method1205(int arg0) {
        if (arg0 == 16384) {
            field2945 = null;
            field2946 = null;
            field2951 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
    public final boolean method1206(int arg0, int arg1, int arg2) {
        field2947++;
        if (arg1 != 205) {
            this.method1206(52, -36, 92);
        }
        return this.field2948 <= arg2 && arg2 <= this.field2944 && this.field2941 <= arg0 && this.field2942 >= arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILgd;Ljava/awt/Component;)Lgb;")
    public static final class74 method1207(int arg0, int arg1, int arg2, class123 arg3, Component arg4) {
        field2940++;
        if (arg1 != -20722) {
            field2951 = null;
        }
        if (class139.field2490 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class74 var5 = (class74) Class.forName("ei").getDeclaredConstructor().newInstance();
                var5.field1288 = arg0;
                var5.field1281 = new int[(class22.field380 ? 2 : 1) * 256];
                var5.method433(arg4);
                var5.field1291 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field1291 > 16384) {
                    var5.field1291 = 16384;
                }
                var5.method432(var5.field1291);
                if (class77.field1324 > 0 && class193.field3340 == null) {
                    class193.field3340 = new class58();
                    class193.field3340.field1014 = arg3;
                    arg3.method946(class77.field1324, arg1 ^ 0xFFFFAF0E, class193.field3340);
                }
                if (class193.field3340 != null) {
                    if (class193.field3340.field1017[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class193.field3340.field1017[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class88 var6 = new class88(arg3, arg2);
                    var6.field1288 = arg0;
                    var6.field1281 = new int[(class22.field380 ? 2 : 1) * 256];
                    var6.method433(arg4);
                    var6.field1291 = 16384;
                    var6.method432(var6.field1291);
                    if (class77.field1324 > 0 && class193.field3340 == null) {
                        class193.field3340 = new class58();
                        class193.field3340.field1014 = arg3;
                        arg3.method946(class77.field1324, 0, class193.field3340);
                    }
                    if (class193.field3340 != null) {
                        if (class193.field3340.field1017[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class193.field3340.field1017[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class74();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lmb;")
    public static final class96 method1208(int arg0, int arg1) {
        field2943++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        } else if (arg1 == -256) {
            class96 var2 = new class96();
            var2.field1580 = new byte[1];
            var2.field1600 = 1;
            var2.field1580[0] = (byte) arg0;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIII)V")
    public class167(int arg0, int arg1, int arg2, int arg3) {
        this.field2948 = arg0;
        this.field2942 = arg3;
        this.field2944 = arg2;
        this.field2941 = arg1;
    }
}
