import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class54 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Llb;")
    private class106 field1105 = new class106();

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lff;")
    private class57 field1112 = new class57();

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    private int field1109;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Lge;")
    private class65 field1110;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lrf;")
    private static class163 field1102 = class53.method392(-99, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field1114 = 0;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lrf;")
    public static class163 field1106 = field1102;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method395(int arg0) {
        if (arg0 != 1) {
            method396(-66, 85);
        }
        field1106 = null;
        field1102 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
    public static final void method396(int arg0, int arg1) {
        class111 var2 = class97.field2054[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class111 var4 = class97.field2054[var3][arg0][arg1] = class97.field2054[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2353--;
                for (int var5 = 0; var5 < var4.field2359; var5++) {
                    class121 var6 = var4.field2344[var5];
                    if ((var6.field2536 >> 29 & 0x3L) == 2L && var6.field2544 == arg0 && var6.field2542 == arg1) {
                        var6.field2550--;
                    }
                }
            }
        }
        if (class97.field2054[0][arg0][arg1] == null) {
            class97.field2054[0][arg0][arg1] = new class111(0, arg0, arg1);
        }
        class97.field2054[0][arg0][arg1].field2360 = var2;
        class97.field2054[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Ljd;")
    public final class90 method397(byte arg0) {
        field1107++;
        if (arg0 >= -115) {
            this.method400(-40);
        }
        return this.field1110.method468(1);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Llb;JB)V")
    public final void method398(class106 arg0, long arg1, byte arg2) {
        if (this.field1109 == 0) {
            class106 var5 = this.field1112.method419((byte) 121);
            var5.method630(11);
            var5.method722((byte) 54);
            if (this.field1105 == var5) {
                class106 var6 = this.field1112.method419((byte) 121);
                var6.method630(94);
                var6.method722((byte) 121);
            }
        } else {
            this.field1109--;
        }
        field1108++;
        this.field1110.method462(123, arg0, arg1);
        this.field1112.method418(0, arg0);
        if (arg2 < 65) {
            this.field1110 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public final void method399(boolean arg0) {
        while (true) {
            class106 var2 = this.field1112.method419((byte) 121);
            if (var2 == null) {
                if (arg0) {
                    method396(99, -15);
                }
                this.field1109 = this.field1111;
                field1103++;
                return;
            }
            var2.method630(94);
            var2.method722((byte) 20);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Ljd;")
    public final class90 method400(int arg0) {
        field1104++;
        return arg0 == 3 ? this.field1110.method471(arg0 ^ 0xFFFFEC8B) : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JB)Llb;")
    public final class106 method401(long arg0, byte arg1) {
        field1101++;
        int var4 = 1 % ((39 - arg1) / 50);
        class106 var5 = (class106) this.field1110.method465(arg0, (byte) 75);
        if (var5 != null) {
            this.field1112.method418(0, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)V")
    public final void method402(byte arg0, long arg1) {
        class106 var4 = (class106) this.field1110.method465(arg1, (byte) 69);
        if (arg0 != 27) {
            field1114 = -66;
        }
        field1113++;
        if (var4 != null) {
            var4.method630(arg0 ^ 0x4A);
            var4.method722((byte) 86);
            this.field1109++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
    public class54(int arg0) {
        this.field1111 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1109 = arg0;
        this.field1110 = new class65(var2);
    }
}
