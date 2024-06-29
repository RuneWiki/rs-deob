import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class270 {

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "[I")
    public static int[] field3186 = new int[32];

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "Llja;")
    public static class744 field3184 = new class744(9, 3);

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "Lhj;")
    public static class596 field3191 = new class596(38, -1);

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "Z")
    public static boolean field3189;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILes;I)V", line = 7)
    private final void method1593(int arg0, class403 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3188 = arg1.method2390((byte) 32);
            this.field3187 = arg1.method2396((byte) 124);
            this.field3183 = arg1.method2396((byte) 35);
        }
        if (arg2 != 38) {
            this.method1596(9, null);
        }
        field3185++;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V", line = 27)
    public static void method1594(byte arg0) {
        field3191 = null;
        if (arg0 > 106) {
            field3184 = null;
            field3186 = null;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZII)V", line = 43)
    public static final void method1595(boolean arg0, int arg1, int arg2) {
        field3190++;
        if (arg2 != 38) {
            method1594((byte) -27);
        }
        class430 var3 = class105.method861(arg1, Integer.MIN_VALUE, arg0);
        if (var3 != null) {
            var3.method2219(13630);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILes;)V", line = 73)
    public final void method1596(int arg0, class403 arg1) {
        field3182++;
        while (true) {
            int var3 = arg1.method2396((byte) 60);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    method1595(true, -84, 121);
                    return;
                }
            }
            this.method1593(var3, arg1, arg0 ^ 0xFFFFFFD9);
        }
    }
}
