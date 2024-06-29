import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class128 {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3026 = 0;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3028 = 99;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[I")
    public static int[] field3027 = new int[5];

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lwb;")
    public static class130 field3023 = class26.method212(")1", -32376);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Z")
    public static boolean field3029 = false;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lwb;")
    public static class130 field3032 = class26.method212("@whi@ )4 ", -32376);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lwb;")
    public static class130 field3024 = class26.method212("60 Sekunden noch einmal)3)3)3", -32376);

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field3036 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Ldc;")
    public class22 field3039;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLfe;)Lwb;", line = 4)
    public static final class130 method944(byte arg0, class36 arg1) {
        if (arg0 != 13) {
            method947((byte) 30);
        }
        field3020++;
        return class106.method799(arg1, 32767, -17817);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 24)
    public static final void method945(int arg0) {
        field3037++;
        Object var1 = class31.field871;
        synchronized (class31.field871) {
            if (class21.field600 != arg0) {
                class21.field600 = 1;
                try {
                    class31.field871.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BJ)V", line = 62)
    public static final void method946(byte arg0, long arg1) {
        field3035++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 <= 106) {
            field3027 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 91)
    public static void method947(byte arg0) {
        field3024 = null;
        if (arg0 > 117) {
            field3023 = null;
            field3027 = null;
            field3032 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V", line = 138)
    public static final void method948(int arg0, boolean arg1) {
        field3038++;
        class92.field2208++;
        if (class92.field2208 < 50 && !arg1) {
            return;
        }
        class92.field2208 = 0;
        if (!class15.field421 && class47.field1255 != null) {
            class29.field811++;
            class14.field406.method727(196, arg0 ^ 0x3A36);
            try {
                class47.field1255.method145(0, class14.field406.field1057, 0, class14.field406.field1067);
                class14.field406.field1057 = 0;
            } catch (IOException var2) {
                class15.field421 = true;
            }
        }
        if (arg0 != 14935) {
            field3023 = null;
        }
    }
}
