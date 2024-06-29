import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class44 {

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Z")
    public boolean field154 = false;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    private int field149 = -32768;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    private int field169 = 0;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    private int field158 = 0;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "Lre;")
    private class183 field173;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Lvd;")
    private static class222 field151 = class212.method1357("Ok", 10731);

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "Lvd;")
    public static class222 field161 = field151;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Lvd;")
    public static class222 field168 = class212.method1357("null", 10731);

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "Lvd;")
    private static class222 field157 = class212.method1357("Loaded config", 10731);

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "Lvd;")
    public static class222 field170 = class212.method1357("und loggen sich dann erneut ein)3", 10731);

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "Lvd;")
    public static class222 field162 = class212.method1357(" loggt sich ein)3", 10731);

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "Lvd;")
    private static class222 field156 = class212.method1357("This world is full)3", 10731);

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Lvd;")
    public static class222 field163 = field156;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lvd;")
    public static class222 field174 = field157;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "[Lhd;")
    public static class80[] field165;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V")
    public final void method83(int arg0, byte arg1) {
        field146++;
        if (this.field154) {
            return;
        }
        this.field169 += arg0;
        while (this.field169 > this.field173.field3396[this.field158]) {
            this.field169 -= this.field173.field3396[this.field158];
            this.field158++;
            if (this.field158 >= this.field173.field3404.length) {
                this.field154 = true;
                break;
            }
        }
        int var3 = -72 / ((-arg1 - 13) / 40);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
    public static final void method84(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class129.field2514 = arg1;
        field164++;
        class127.field2448 = arg4;
        class230.field4322 = arg3;
        class112.field2107 = arg2;
        if (arg0 != -1) {
            method86();
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method85(int arg0) {
        field156 = null;
        field151 = null;
        if (arg0 <= 123) {
            method84(-104, -30, -47, 78, -13);
        }
        field170 = null;
        field165 = null;
        field157 = null;
        field163 = null;
        field161 = null;
        field162 = null;
        field168 = null;
        field174 = null;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "()V")
    public static final void method86() {
        for (int var0 = 0; var0 < class67.field1262; var0++) {
            class23 var1 = class29.field632[var0];
            class196.method1205(var1);
            class29.field632[var0] = null;
        }
        class67.field1262 = 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()I")
    public final int method87() {
        field172++;
        return this.field149;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Lee;")
    private final class49 method88(int arg0) {
        field147++;
        class98 var2 = class127.method805(this.field160, (byte) 104);
        class49 var3;
        if (this.field154) {
            var3 = var2.method613(-1, arg0 + 16754);
        } else {
            var3 = var2.method613(this.field158, 1067);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -15687) {
                field170 = null;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field155++;
        class49 var11 = this.method88(-15687);
        if (var11 != null) {
            var11.method89(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field149 = var11.method87();
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public static final void method90(int arg0) {
        field153++;
        if (arg0 != -1) {
            return;
        }
        for (class138 var1 = (class138) class56.field1059.method236(0); var1 != null; var1 = (class138) class56.field1059.method237(true)) {
            if (var1.field2680 != null) {
                var1.method871(92);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIII)V")
    public class9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field167 = arg2;
        this.field160 = arg0;
        this.field166 = arg1;
        this.field159 = arg6 + arg5;
        this.field148 = arg4;
        this.field150 = arg3;
        int var8 = class127.method805(this.field160, (byte) 126).field1827;
        if (var8 == -1) {
            this.field154 = true;
        } else {
            this.field154 = false;
            this.field173 = class93.method599((byte) -16, var8);
        }
    }
}
