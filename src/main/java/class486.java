import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class486 extends class239 {

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public int field6777;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public int field6780;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public int field6787;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public int field6786;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public int field6778;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public int field6781;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public int field6779;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lei;")
    public static class331 field6776 = new class331();

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "Z")
    public static boolean field6790 = false;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field6792 = 0;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "Lkr;")
    public static class329 field6784;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/awt/Component;IIILgaa;)Llj;")
    public static final class59 method2742(Component arg0, int arg1, int arg2, int arg3, class279 arg4) {
        field6783++;
        if (class10.field98 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class59 var5 = (class59) Class.forName("wj").getDeclaredConstructor().newInstance();
                var5.field816 = arg1;
                var5.field803 = new int[(class85.field1155 ? 2 : 1) * 256];
                var5.method327(arg0);
                var5.field811 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field811 > 16384) {
                    var5.field811 = 16384;
                }
                var5.method330(var5.field811);
                if (~class553.field7739 < arg3 && class254.field3160 == null) {
                    class254.field3160 = new class291();
                    class254.field3160.field3774 = arg4;
                    arg4.method1730(class553.field7739, arg3 ^ 0xFFFFFFFD, class254.field3160);
                }
                if (class254.field3160 != null) {
                    if (class254.field3160.field3771[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class254.field3160.field3771[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class240 var6 = new class240(arg4, arg2);
                    var6.field816 = arg1;
                    var6.field803 = new int[(class85.field1155 ? 2 : 1) * 256];
                    var6.method327(arg0);
                    var6.field811 = 16384;
                    var6.method330(var6.field811);
                    if (class553.field7739 > 0 && class254.field3160 == null) {
                        class254.field3160 = new class291();
                        class254.field3160.field3774 = arg4;
                        arg4.method1730(class553.field7739, 2, class254.field3160);
                    }
                    if (class254.field3160 != null) {
                        if (class254.field3160.field3771[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class254.field3160.field3771[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class59();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)I")
    public abstract int method2135(int arg0);

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        field6789++;
        if (arg0 != 52) {
            field6792 = 23;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V")
    public static void method2743(boolean arg0) {
        field6776 = null;
        if (arg0) {
            field6784 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        if (arg1 < 67) {
            method2743(false);
        }
        field6791++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        if (arg0 == -1) {
            field6788++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)V")
    public static final void method2744(int arg0, byte arg1) {
        class58 var2 = class255.field3171;
        synchronized (class255.field3171) {
            class255.field3171.method320(arg0, -306674912);
        }
        field6785++;
        if (arg1 != -19) {
            field6790 = true;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIII)V")
    public class486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6777 = arg5;
        this.field6780 = arg2;
        this.field6787 = arg0;
        this.field6786 = arg4;
        this.field6778 = arg6;
        this.field6781 = arg3;
        this.field6779 = arg1;
    }
}
