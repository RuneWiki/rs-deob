import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class81 implements Runnable {

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "Z")
    public boolean field2053 = true;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field2045 = new Object();

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public int field2061 = 0;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "[I")
    public int[] field2060 = new int[500];

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "[I")
    public int[] field2062 = new int[500];

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "La;")
    public static class1 field2038 = class113.method934(-11538, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "La;")
    public static class1 field2039 = class113.method934(-11538, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "La;")
    private static class1 field2040 = class113.method934(-11538, "Ok");

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "La;")
    public static class1 field2051 = class113.method934(-11538, "Spiel)2Fenster geladen)3");

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "La;")
    private static class1 field2050 = class113.method934(-11538, " from your ignore list first");

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2049 = 0;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "La;")
    public static class1 field2054 = class113.method934(-11538, "Stufe)2");

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
    public static boolean field2046 = false;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "La;")
    public static class1 field2057 = field2050;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2052 = 20;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "La;")
    public static class1 field2059 = field2040;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "La;")
    private static class1 field2055 = class113.method934(-11538, " more options");

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "La;")
    public static class1 field2044 = field2055;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lwc;")
    public static class134 field2047;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lwc;")
    public static class134 field2048;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Ljd;")
    public static class58 field2058;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ldc;I)V", line = 6)
    public static final void method736(class22 arg0, int arg1) {
        int var2 = 0;
        field2042++;
        int var3 = -1;
        int var4 = 0;
        if (arg0.field689 == 0) {
            var2 = class130.field3186.method79(arg0.field680, arg0.field701, arg0.field700);
        }
        int var5 = 0;
        if (arg0.field689 == 1) {
            var2 = class130.field3186.method48(arg0.field680, arg0.field701, arg0.field700);
        }
        if (arg0.field689 == 2) {
            var2 = class130.field3186.method67(arg0.field680, arg0.field701, arg0.field700);
        }
        if (arg0.field689 == 3) {
            var2 = class130.field3186.method50(arg0.field680, arg0.field701, arg0.field700);
        }
        if (arg1 != 19813) {
            return;
        }
        if (var2 != 0) {
            int var6 = class130.field3186.method98(arg0.field680, arg0.field701, arg0.field700, var2);
            var3 = var2 >> 14 & 0x7FFF;
            var5 = var6 >> 6 & 0x3;
            var4 = var6 & 0x1F;
        }
        arg0.field687 = var5;
        arg0.field690 = var3;
        arg0.field698 = var4;
    }

    @OriginalMember(owner = "client!nc", name = "run", descriptor = "()V", line = 69)
    public final void run() {
        field2043++;
        while (this.field2053) {
            Object var1 = this.field2045;
            synchronized (this.field2045) {
                if (this.field2061 < 500) {
                    this.field2062[this.field2061] = class24.field742;
                    this.field2060[this.field2061] = class102.field2571;
                    this.field2061++;
                }
            }
            class86.method756(50L, 44);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Llc;BZ)Z", line = 98)
    public static final boolean method737(class69 arg0, byte arg1, boolean arg2) {
        class62.field1551 = 20;
        field2056++;
        try {
            class9.field312 = (class45) Class.forName("da").getDeclaredConstructor().newInstance();
            return true;
        } catch (Throwable var4) {
            class21 var3 = arg0.method656(1048576);
            if (var3 != null) {
                class9.field312 = new class55(arg0, var3);
                return true;
            }
            if (arg1 < 6) {
                field2051 = null;
            }
            if (arg2) {
                class9.field312 = new class38(arg0);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 151)
    public static void method738(byte arg0) {
        field2040 = null;
        field2047 = null;
        field2039 = null;
        field2057 = null;
        field2051 = null;
        if (arg0 > -69) {
            method736(null, 36);
        }
        field2058 = null;
        field2044 = null;
        field2059 = null;
        field2054 = null;
        field2038 = null;
        field2048 = null;
        field2050 = null;
        field2055 = null;
    }
}
