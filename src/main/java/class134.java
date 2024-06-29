import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class134 {

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2202 = "flash1:";

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2205 = "Drop";

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2201++;
        if (arg0 != 0) {
            field2202 = null;
        }
        if (class184.method1364(arg6, (byte) 85)) {
            class181.method1351(arg5, 121, arg7, arg4, arg3, arg8, -1, arg2, class113.field1631[arg6], arg1);
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class190.field3070[var9] = true;
            }
        } else {
            class190.field3070[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lhf;BLhf;)V")
    public static final void method967(class139 arg0, byte arg1, class139 arg2) {
        if (arg0.field2249 != null) {
            arg0.method986(arg1 ^ 0xFFFFFFE3);
        }
        field2199++;
        arg0.field2249 = arg2;
        if (arg1 != -29) {
            method968(2);
        }
        arg0.field2250 = arg2.field2250;
        arg0.field2249.field2250 = arg0;
        arg0.field2250.field2249 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method968(int arg0) {
        field2202 = null;
        field2205 = null;
        if (arg0 <= 61) {
            method967((class139) null, (byte) 66, (class139) null);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)V")
    public static final void method969(int arg0, byte arg1, int arg2) {
        field2204++;
        if (arg1 > -71) {
            field2203 = 116;
        }
        if (class20.field221 != arg2) {
            class184.field2967 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class184.field2967[var3] = (var3 << 12) / arg2;
            }
            class36.field497 = arg2 - 1;
            class213.field3407 = arg2 * 32;
            class20.field221 = arg2;
        }
        if (class49.field718 == arg0) {
            return;
        }
        if (class20.field221 == arg0) {
            class26.field301 = class184.field2967;
        } else {
            class26.field301 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class26.field301[var4] = (var4 << 12) / arg0;
            }
        }
        class49.field718 = arg0;
        class58.field822 = arg0 - 1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Lvk;")
    public static final class36 method970(int arg0, int arg1) {
        field2198++;
        class36 var2 = (class36) class21.field232.method1553((long) arg0, (byte) -85);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class21.field245.method643(class64.method464(256, arg0), class276.method1908(arg0, (byte) -126), false);
        class36 var4 = new class36();
        var4.field477 = arg0;
        if (var3 != null) {
            var4.method281((byte) -106, new class152(var3));
        }
        var4.method284((byte) 71);
        if (!class110.field1583 && var4.field455) {
            var4.field467 = null;
        }
        if (var4.field479) {
            var4.field491 = false;
            var4.field516 = 0;
        }
        class21.field232.method1551(var4, arg1, (long) arg0);
        return var4;
    }
}
