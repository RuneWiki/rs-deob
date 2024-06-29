import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class27 {

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
    public static boolean field490 = false;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field503 = 1;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[Z")
    public static boolean[] field498 = new boolean[100];

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lrf;")
    public static class163 field493 = class53.method392(-67, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lfc;")
    public static class54 field496 = new class54(100);

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Lrf;")
    public static class163 field507 = class53.method392(68, "titlebox");

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "[I")
    public static int[] field504 = new int[2048];

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field505 = 0;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
    public static int[] field508 = new int[4000];

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lrf;")
    public static class163 field506 = class53.method392(57, "Fertigkeit)2");

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lrf;")
    public static class163 field509 = class53.method392(-56, "<img=0>");

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lrf;")
    private static class163 field511 = class53.method392(-75, " more options");

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Lrf;")
    public static class163 field512 = field511;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lua;")
    public static class185 field510;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method160(int arg0) {
        field507 = null;
        if (arg0 != -1) {
            field510 = null;
        }
        field496 = null;
        field493 = null;
        field512 = null;
        field498 = null;
        field509 = null;
        field504 = null;
        field508 = null;
        field511 = null;
        field510 = null;
        field506 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method161(int arg0) {
        int var1 = class134.field2772.method560(class43.field864);
        for (int var2 = 0; var2 < class184.field3678; var2++) {
            int var6 = class134.field2772.method560(class177.method1203(var2, 22025));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class4.field43 = class184.field3678 * 15 + 22;
        var1 += 8;
        field491++;
        class32.field638 = true;
        class193.field3803 = var1;
        int var3 = class184.field3678 * 15 + 21;
        int var4 = class193.field3796 - var1 / 2;
        int var5 = class16.field283;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var1 + var4 > 765) {
            var4 = 765 - var1;
        }
        if (var4 < arg0) {
            var4 = 0;
        }
        class118.field2507 = var4;
        class19.field305 = var5;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public static final void method162(int arg0) {
        field501++;
        if (!class189.field3766 || arg0 != 1) {
            return;
        }
        class84 var1 = class48.method298(class181.field3627, class118.field2508, 0);
        if (var1 != null && var1.field1732 != null) {
            class118 var2 = new class118();
            var2.field2502 = var1.field1732;
            var2.field2500 = var1;
            class64.method458((byte) -97, var2);
        }
        class189.field3766 = false;
        class194.method1295((byte) -126, var1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILjava/awt/Component;Lgg;)Lta;")
    public static final class176 method163(int arg0, int arg1, int arg2, Component arg3, class67 arg4) {
        field494++;
        if (class188.field3736 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class176 var5 = (class176) Class.forName("aa").getDeclaredConstructor().newInstance();
                var5.field3529 = new int[(class10.field195 ? 2 : 1) * 256];
                var5.field3563 = arg0;
                var5.method22(arg3);
                var5.field3557 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field3557 > 16384) {
                    var5.field3557 = 16384;
                }
                var5.method19(var5.field3557);
                if (class147.field3018 > 0 && class72.field1503 == null) {
                    class72.field1503 = new class31();
                    class72.field1503.field623 = arg4;
                    arg4.method481(class147.field3018, class72.field1503, (byte) 89);
                }
                if (class72.field1503 != null) {
                    if (class72.field1503.field627[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class72.field1503.field627[arg1] = var5;
                }
                return arg2 == -6064 ? var5 : null;
            } catch (Throwable var8) {
                try {
                    class98 var6 = new class98(arg4, arg1);
                    var6.field3529 = new int[(class10.field195 ? 2 : 1) * 256];
                    var6.field3563 = arg0;
                    var6.method22(arg3);
                    var6.field3557 = 16384;
                    var6.method19(var6.field3557);
                    if (class147.field3018 > 0 && class72.field1503 == null) {
                        class72.field1503 = new class31();
                        class72.field1503.field623 = arg4;
                        arg4.method481(class147.field3018, class72.field1503, (byte) 67);
                    }
                    if (class72.field1503 != null) {
                        if (class72.field1503.field627[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class72.field1503.field627[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class176();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class27() {
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lcf;)V")
    public class27(class27 arg0) {
        this.field497 = arg0.field497;
        this.field495 = arg0.field495;
        this.field492 = arg0.field492;
        this.field500 = arg0.field500;
    }
}
