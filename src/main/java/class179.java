import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class179 {

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lar;")
    private class47 field2378;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lps;")
    public static class394 field2370 = null;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lfb;")
    private class45 field2376;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)Lfb;", line = 6)
    public final class45 method1092(byte arg0) {
        field2374++;
        if (arg0 != 54) {
            this.field2378 = null;
        }
        class45 var2 = this.field2378.field663.field636;
        if (this.field2378.field663 == var2) {
            this.field2376 = null;
            return null;
        } else {
            this.field2376 = var2.field636;
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)V", line = 27)
    public static final void method1093(int arg0, int arg1, byte arg2) {
        field2369++;
        int var3 = class227.field2988.field4360[0];
        if (arg2 >= -122) {
            method1094(30, -26, -110, -23, -71);
        }
        int var4 = class227.field2988.field4362[0];
        if (class71.field1017 == 1) {
            if (!class254.method1552(0, arg0, -2, arg1, var4, 1, -2, false, 0, var3, 1)) {
                class254.method1552(0, arg0, -3, arg1, var4, 1, -2, false, 0, var3, 1);
            }
        } else if (!class254.method1552(0, arg0, -3, arg1, var4, 1, -2, false, 0, var3, 1)) {
            class254.method1552(0, arg0, -2, arg1, var4, 1, -2, false, 0, var3, 1);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V", line = 58)
    public static final void method1094(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2368++;
        for (int var5 = arg3; var5 < class1.field13; var5++) {
            Rectangle var6 = class229.field3062[var5];
            if ((var6.x + var6.width) > arg0 && arg0 + arg4 > var6.x && var6.y + var6.height > arg2 && arg1 + arg2 > var6.y) {
                class270.field3927[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lar;I)V", line = 81)
    public final void method1095(class47 arg0, int arg1) {
        if (arg1 != 1) {
            field2370 = null;
        }
        field2375++;
        this.field2378 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V", line = 93)
    public static void method1096(byte arg0) {
        field2370 = null;
        if (arg0 >= -10) {
            field2371 = -40;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)Lfb;", line = 104)
    public final class45 method1097(byte arg0) {
        field2377++;
        int var2 = 61 % ((arg0 - 16) / 39);
        class45 var3 = this.field2376;
        if (this.field2378.field663 == var3) {
            this.field2376 = null;
            return null;
        } else {
            this.field2376 = var3.field636;
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Llm;BLlm;)V", line = 133)
    public static final void method1098(class347 arg0, byte arg1, class347 arg2) {
        class33.field471 = arg2;
        if (arg1 != -37) {
            field2371 = -64;
        }
        class233.field3100 = arg0;
        field2372++;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 148)
    public class179() {
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lar;)V", line = 153)
    public class179(class47 arg0) {
        this.field2378 = arg0;
    }
}
