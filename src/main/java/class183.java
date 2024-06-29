import java.awt.Component;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class183 extends InputStream {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field2958 = 0;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[Z")
    public static boolean[] field2957 = new boolean[200];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
    public static int[] field2956;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLkb;II)[Lfj;", line = 9)
    public static final class254[] method1260(byte arg0, class39 arg1, int arg2, int arg3) {
        if (arg0 >= -123) {
            method1262(32, (Component) null, -122, 102, (class6) null);
        }
        field2954++;
        return class288.method2026(arg3, arg2, arg1, -49) ? class93.method672((byte) 124) : null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 24)
    public static void method1261(int arg0) {
        field2956 = null;
        field2957 = null;
        if (arg0 != -1024) {
            method1260((byte) 124, (class39) null, 11, -85);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/awt/Component;IILgn;)Lbi;", line = 39)
    public static final class91 method1262(int arg0, Component arg1, int arg2, int arg3, class6 arg4) {
        field2955++;
        if (class264.field4185 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class91 var5 = (class91) Class.forName("tk").getDeclaredConstructor().newInstance();
                var5.field1416 = arg0;
                var5.field1383 = new int[(class98.field1499 ? 2 : 1) * 256];
                var5.method4(arg1);
                var5.field1415 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field1415 > 16384) {
                    var5.field1415 = 16384;
                }
                var5.method5(var5.field1415);
                if (class168.field2703 > 0 && class342.field5323 == null) {
                    class342.field5323 = new class324();
                    class342.field5323.field5062 = arg4;
                    arg4.method40(class168.field2703, class342.field5323, -110);
                }
                if (class342.field5323 != null) {
                    if (class342.field5323.field5060[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class342.field5323.field5060[arg3] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class1 var7 = new class1(arg4, arg3);
                    if (arg2 != 13554) {
                        field2956 = (int[]) null;
                    }
                    var7.field1383 = new int[(class98.field1499 ? 2 : 1) * 256];
                    var7.field1416 = arg0;
                    var7.method4(arg1);
                    var7.field1415 = 16384;
                    var7.method5(var7.field1415);
                    if (class168.field2703 > 0 && class342.field5323 == null) {
                        class342.field5323 = new class324();
                        class342.field5323.field5062 = arg4;
                        arg4.method40(class168.field2703, class342.field5323, -95);
                    }
                    if (class342.field5323 != null) {
                        if (class342.field5323.field5060[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class342.field5323.field5060[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class91();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 125)
    public static final void method1263(int arg0) {
        field2959++;
        if (class224.field3569) {
            return;
        }
        if (class325.field5079) {
            class329.field5112 = (float) ((int) class329.field5112 + 47 & 0xFFFFFFF0);
        } else {
            class218.field3504 += (12.0F - class218.field3504) / 2.0F;
        }
        if (arg0 != -10793) {
            field2957 = (boolean[]) null;
        }
        client.field4231 = true;
        class224.field3569 = true;
    }

    @OriginalMember(owner = "client!rd", name = "read", descriptor = "()I", line = 157)
    public final int read() {
        class20.method128(0, 30000L);
        field2953++;
        return -1;
    }
}
