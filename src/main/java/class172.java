import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class172 extends class57 {

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field3227 = 0;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lvd;")
    public static class222 field3226 = class212.method1357("Das ist eine Mitglieder)2Welt(Q", 10731);

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lvd;")
    public static class222 field3229 = class212.method1357("Diese Welt ist voll)3", 10731);

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lvd;")
    private static class222 field3234 = class212.method1357("Please wait)3)3)3", 10731);

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lvd;")
    public static class222 field3232 = field3234;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "[I")
    public static int[] field3237;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[Lba;")
    public static class13[] field3233;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static void method1088(int arg0) {
        field3226 = null;
        field3237 = null;
        field3233 = null;
        if (arg0 != 32307) {
            method1091(null, (byte) 72, -43);
        }
        field3229 = null;
        field3234 = null;
        field3232 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZB)V")
    public static final void method1089(boolean arg0, byte arg1) {
        class153.method980((byte) 55);
        class129.field2516++;
        field3230++;
        if (arg1 <= 23 || class129.field2516 < 50 && !arg0) {
            return;
        }
        class129.field2516 = 0;
        if (class42.field896 || class31.field656 == null) {
            return;
        }
        class42.field895.method1347((byte) -75, 207);
        try {
            class31.field656.method785(0, 0, class42.field895.field2006, class42.field895.field2053);
            class42.field895.field2053 = 0;
        } catch (IOException var2) {
            class42.field896 = true;
        }
        class27.field604++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1090(Component arg0, byte arg1) {
        arg0.removeKeyListener(class180.field3335);
        field3236++;
        arg0.removeFocusListener(class180.field3335);
        class114.field2140 = -1;
        if (arg1 != -17) {
            method1089(false, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lvd;BI)V")
    public static final void method1091(class222 arg0, byte arg1, int arg2) {
        field3231++;
        class222 var3 = arg0.method1412((byte) 58).method1409(-7899);
        boolean var4 = false;
        int var5 = 0;
        if (arg1 > -75) {
            return;
        }
        while (class38.field859 > var5) {
            class38 var6 = class54.field1024[class122.field2328[var5]];
            if (var6 != null && var6.field853 != null && var6.field853.method1452(var3, (byte) -127)) {
                var4 = true;
                class62.method431(false, 2, 0, 1, 1, 0, class17.field432.field1333[0], class17.field432.field1358[0], 0, var6.field1358[0], var6.field1333[0], -119);
                if (arg2 == 1) {
                    class42.field895.method1347((byte) -58, 222);
                    class42.field895.method660(0, class122.field2328[var5]);
                    class157.field2994++;
                } else if (arg2 == 4) {
                    class42.field895.method1347((byte) -110, 35);
                    class42.field895.method672(-279704376, class122.field2328[var5]);
                    class46.field944++;
                } else if (arg2 == 6) {
                    class42.field895.method1347((byte) -128, 85);
                    class129.field2517++;
                    class42.field895.method663(-115, class122.field2328[var5]);
                } else if (arg2 == 7) {
                    class14.field404++;
                    class42.field895.method1347((byte) -57, 120);
                    class42.field895.method671((byte) 99, class122.field2328[var5]);
                }
                break;
            }
            var5++;
        }
        if (!var4) {
            class160.method1007(false, class234.method1531(new class222[] { class84.field1606, var3 }, -10949), class29.field646, 0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)Lbj;")
    public static final class21 method1092(int arg0, int arg1, int arg2, int arg3) {
        field3235++;
        class21 var4 = new class21();
        var4.field493 = arg2;
        var4.field492 = arg1;
        class208.field3863.method1519(true, var4, (long) arg3);
        client.method268(-17403, arg2);
        class13 var5 = class10.method92(923, arg3);
        if (var5 != null) {
            class80.method527(var5, 31702);
        }
        if (class91.field1713 != null) {
            class80.method527(class91.field1713, 31702);
            class91.field1713 = null;
        }
        field3227 = 0;
        class38.field834 = false;
        if (arg0 <= 25) {
            return null;
        }
        class77.method512(class217.field4034, class34.field735, 0, class192.field3543, class222.field4140);
        if (var5 != null) {
            class78.method516(var5, 229);
        }
        class10.method91((byte) 65, arg2);
        if (class25.field580 != -1) {
            class8.method65(class25.field580, 1, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILab;)V")
    public static final void method1093(int arg0, class3 arg1) {
        field3225++;
        if (arg0 != -4805) {
            method1092(123, -25, -33, 76);
        }
        class81.field1555 = arg1;
        class95.field1779 = class81.field1555.method38(5, 4);
    }
}
