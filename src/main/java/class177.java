import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class177 {

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Z")
    public boolean field2510 = false;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2509 = 0;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Z")
    public static boolean field2518 = false;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Ltl;")
    public static class240 field2507;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Z")
    public static boolean field2517;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILqi;I)V")
    private final void method1145(int arg0, int arg1, class216 arg2, int arg3) {
        if (arg1 != 4375) {
            this.field2510 = true;
        }
        field2508++;
        if (arg0 == 1) {
            this.field2512 = arg2.method1380(true);
        } else if (arg0 == 2) {
            this.field2515 = arg2.method1382(-64);
        } else if (arg0 == 3) {
            this.field2510 = true;
        } else if (arg0 == 4) {
            this.field2512 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILqi;Z)V")
    public final void method1146(int arg0, class216 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field2513++;
        while (true) {
            int var4 = arg1.method1407(118);
            if (var4 == 0) {
                return;
            }
            this.method1145(var4, 4375, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZBI)Lpk;")
    public final class43 method1147(boolean arg0, byte arg1, int arg2) {
        class43 var4 = (class43) class1.field21.method65((byte) -103, (long) (this.field2512 | arg2 << 16 | (arg0 ? 262144 : 0)));
        field2511++;
        if (var4 != null) {
            return var4;
        }
        class6.field75.method1842(this.field2512, -5012);
        if (arg1 != 111) {
            return null;
        }
        class43 var5 = class166.method1088(class6.field75, this.field2512, 0, (byte) -126);
        if (var5 != null) {
            var5.method275(class42.field519, class233.field3365, class108.field1459);
            var5.field2 = var5.field18;
            var5.field5 = var5.field11;
            if (arg0) {
                var5.method274();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method276();
            }
            class1.field21.method64((long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field2512), -1, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method1148(int arg0) {
        field2507 = null;
        if (arg0 != 31280) {
            method1148(25);
        }
    }
}
