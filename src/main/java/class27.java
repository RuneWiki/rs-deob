import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 extends class53 {

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field513 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "Lp;")
    public static class280 field510 = class18.method140((byte) -122, "hint_headicons");

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "Lp;")
    public static class280 field520 = class18.method140((byte) -119, "Objet d(Wabonn-Bs");

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "[Lp;")
    public static class280[] field521 = new class280[100];

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Lp;")
    public class280 field518;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public static final void method241(int arg0, int arg1) {
        field519++;
        class157 var2 = class257.method1740(arg1, (byte) -94, 4);
        if (arg0 >= -12) {
            method245(0, true, 106, true, 60);
        }
        var2.method1121(24223);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)J")
    public static final long method242(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        return var3 == null || var3.field2839 == null ? 0L : var3.field2839.field4303;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Z")
    public final boolean method243(int arg0) {
        field517++;
        if (arg0 != -18424) {
            this.field515 = 112;
        }
        return this.field516 == 115;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLlj;)V")
    public final void method244(byte arg0, class25 arg1) {
        field512++;
        while (true) {
            int var3 = arg1.method189((byte) -103);
            if (var3 == 0) {
                if (arg0 < 45) {
                    method245(-122, true, -123, true, -50);
                    return;
                } else {
                    return;
                }
            }
            this.method247(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZIZI)V")
    public static final void method245(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        class242.field4242 = 0L;
        field522++;
        boolean var5 = arg1;
        int var6 = class210.method1410(0);
        if (arg4 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (class198.field3457.startsWith("mac") && arg4 > 0) {
            arg3 = true;
        }
        if (var6 > 0 == arg4 <= 0) {
            var5 = true;
        }
        if (arg3 && arg4 > 0) {
            var5 = true;
        }
        class92.method658(var6, false, arg2, arg0, var5, arg4, arg3);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZI)Lna;")
    public static final class31 method246(int arg0, boolean arg1, int arg2) {
        field511++;
        class31 var3 = new class31();
        for (class103 var4 = (class103) class104.field1725.method651(12916); var4 != null; var4 = (class103) class104.field1725.method643(11066)) {
            if (var4.field1711 && var4.method724(arg2, arg0, 94)) {
                var3.method273(0, var4);
            }
        }
        if (!arg1) {
            field513 = 2;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLlj;I)V")
    private final void method247(boolean arg0, class25 arg1, int arg2) {
        if (!arg0) {
            method248(-1);
        }
        field523++;
        if (arg2 == 1) {
            this.field516 = arg1.method189((byte) -103);
        } else if (arg2 == 2) {
            this.field515 = arg1.method199((byte) -85);
        } else if (arg2 == 5) {
            this.field518 = arg1.method198(false);
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    public static void method248(int arg0) {
        field520 = null;
        field510 = null;
        field521 = null;
        if (arg0 != -1) {
            method245(102, true, 97, true, 44);
        }
    }
}
