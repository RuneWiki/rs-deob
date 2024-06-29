import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class198 {

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lcl;")
    private class98 field3448 = new class98();

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lmb;")
    public static class96 field3449 = class243.method1708("::rect_debug", (byte) 109);

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lmb;")
    public static class96 field3447 = class243.method1708("leuchten1:", (byte) 96);

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lmb;")
    public static class96 field3456 = class243.method1708("welle:", (byte) 98);

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lmb;")
    public static class96 field3455 = class243.method1708("<)4col>", (byte) 126);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lmb;")
    public static class96 field3446 = class243.method1708("Lade Wordpack )2 ", (byte) 122);

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[S")
    public static short[] field3461 = new short[256];

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Lff;")
    public static class3 field3465;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lcl;")
    private class98 field3463;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Lcl;")
    public final class98 method1382(int arg0) {
        field3450++;
        if (arg0 != -1) {
            this.field3463 = null;
        }
        class98 var2 = this.field3463;
        if (this.field3448 == var2) {
            this.field3463 = null;
            return null;
        } else {
            this.field3463 = var2.field1666;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)I")
    public final int method1383(int arg0) {
        int var2 = arg0;
        field3454++;
        for (class98 var3 = this.field3448.field1666; var3 != this.field3448; var3 = var3.field1666) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)I")
    public static final int method1384(int arg0, byte arg1) {
        if (arg1 != -110) {
            method1389((byte) 63);
        }
        field3452++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Lcl;")
    public final class98 method1385(byte arg0) {
        field3445++;
        class98 var2 = this.field3448.field1666;
        if (this.field3448 == var2) {
            return null;
        } else {
            int var3 = -88 / ((arg0 + 2) / 41);
            var2.method740(-22949);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final void method1386(int arg0) {
        field3460++;
        if (arg0 < 42) {
            field3447 = null;
        }
        while (true) {
            class98 var2 = this.field3448.field1666;
            if (this.field3448 == var2) {
                this.field3463 = null;
                return;
            }
            var2.method740(-22949);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIIZIIZ)V")
    public static final void method1387(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 > -78) {
            method1388((byte) -106);
        }
        field3457++;
        if (arg5 <= arg4) {
            return;
        }
        int var7 = (arg4 + arg5) / 2;
        class36 var8 = class62.field1053[var7];
        int var9 = arg4;
        class62.field1053[var7] = class62.field1053[arg5];
        class62.field1053[arg5] = var8;
        for (int var10 = arg4; var10 < arg5; var10++) {
            if (class49.method377(var8, class62.field1053[var10], arg1, arg3, arg2, -72, arg6) <= 0) {
                class36 var11 = class62.field1053[var10];
                class62.field1053[var10] = class62.field1053[var9];
                class62.field1053[var9++] = var11;
            }
        }
        class62.field1053[arg5] = class62.field1053[var9];
        class62.field1053[var9] = var8;
        method1387((byte) -98, arg1, arg2, arg3, arg4, var9 - 1, arg6);
        method1387((byte) -89, arg1, arg2, arg3, var9 + 1, arg5, arg6);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static final void method1388(byte arg0) {
        int var1 = -80 % ((-arg0 - 4) / 32);
        field3451++;
        class213.field3667.method96(false);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)Lng;")
    public static final class124 method1389(byte arg0) {
        field3453++;
        if (arg0 > -95) {
            method1384(-45, (byte) -43);
        }
        try {
            return (class124) Class.forName("j").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lcl;I)V")
    public final void method1390(class98 arg0, int arg1) {
        field3462++;
        if (arg0.field1667 != null) {
            arg0.method740(-22949);
        }
        arg0.field1667 = this.field3448.field1667;
        arg0.field1666 = this.field3448;
        arg0.field1667.field1666 = arg0;
        arg0.field1666.field1667 = arg0;
        if (arg1 >= -58) {
            this.field3448 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)Lcl;")
    public final class98 method1391(int arg0) {
        class98 var2 = this.field3448.field1666;
        int var3 = 34 % ((arg0 + 16) / 58);
        field3459++;
        if (this.field3448 == var2) {
            this.field3463 = null;
            return null;
        } else {
            this.field3463 = var2.field1666;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
    public static void method1392(byte arg0) {
        field3461 = null;
        field3455 = null;
        field3447 = null;
        field3456 = null;
        field3446 = null;
        field3465 = null;
        if (arg0 < 122) {
            field3447 = null;
        }
        field3449 = null;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class198() {
        this.field3448.field1666 = this.field3448;
        this.field3448.field1667 = this.field3448;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
    public static final void method1393(int arg0, int arg1) {
        field3464++;
        class43 var2 = class270.method1847(arg1, -10277, arg0);
        var2.method339(true);
    }
}
