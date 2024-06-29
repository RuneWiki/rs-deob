import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class65 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lwb;")
    public static class130 field1646 = class26.method212("Hier klicken)1 um fortzufahren)3)3)3", -32376);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lwb;")
    private static class130 field1653 = class26.method212("Enter name of friend to delete from list", -32376);

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lwb;")
    public static class130 field1656 = class26.method212("Titelbild geladen)3", -32376);

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lwb;")
    private static class130 field1657 = class26.method212("No matching objects found)1 please shorten search", -32376);

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lwb;")
    public static class130 field1663 = field1657;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lwb;")
    public static class130 field1660 = class26.method212(" zuerst von Ihrer Ignorieren)2Liste(Q", -32376);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lwb;")
    public static class130 field1655 = field1653;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1652 = 0;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "[[B")
    public static byte[][] field1664 = new byte[250][];

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lk;")
    public static class60 field1647;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V", line = 12)
    public static final synchronized void method531(int arg0, byte arg1) {
        field1666++;
        if (class54.method464(107)) {
            class54.method461(arg0, -17895);
            class99.field2403 = null;
            int var2 = -106 % ((arg1 + 64) / 52);
            class46.field1240 = false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 35)
    public static void method532(int arg0) {
        field1647 = null;
        field1664 = null;
        field1646 = null;
        field1660 = null;
        field1657 = null;
        if (arg0 != 1) {
            method532(-54);
        }
        field1663 = null;
        field1656 = null;
        field1655 = null;
        field1653 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 54)
    public static final synchronized void method533(byte arg0) {
        field1662++;
        if (!class54.method464(arg0 ^ 0x67)) {
            return;
        }
        if (arg0 != 1) {
            method539(-77, null, 127, -95, false, 59, (byte) -80);
        }
        if (class46.field1240) {
            byte[] var1 = class92.method684(class99.field2403, class120.field2943, class56.field1437, class22.field644, (byte) 52);
            if (var1 != null) {
                if (class29.field804 >= 0) {
                    class130.method955(class29.field804, 0, class48.field1289, var1, class32.field899);
                } else if (class45.field1217 < 0) {
                    class129.method951(class48.field1289, var1, class32.field899, false);
                } else {
                    method537(class45.field1217, var1, false, class32.field899, class48.field1289);
                }
                class99.field2403 = null;
                class46.field1240 = false;
            }
        }
        class58.method481(0);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 115)
    public static final synchronized void method534(int arg0) {
        field1659++;
        if (!class54.method464(107)) {
            return;
        }
        if (arg0 != 0) {
            method537(64, null, true, true, 34);
        }
        class15.method112(-16146);
        class46.field1240 = false;
        class99.field2403 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILwb;ZIIILk;Lwb;)V", line = 133)
    public static final synchronized void method535(int arg0, class130 arg1, boolean arg2, int arg3, int arg4, int arg5, class60 arg6, class130 arg7) {
        field1651++;
        if (!class54.method464(96)) {
            return;
        }
        if (arg3 != -1) {
            field1668 = 26;
        }
        int var8 = arg6.method507(arg7, -1);
        int var9 = arg6.method502(arg1, false, var8);
        method538(arg5, var9, 0, var8, arg0, arg6, arg2, arg4);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 171)
    public static final void method536(int arg0) {
        field1650++;
        for (class23 var1 = (class23) class23.field653.method813(-104); var1 != null; var1 = (class23) class23.field653.method814((byte) -19)) {
            if (var1.field657 != null) {
                var1.method202(-119);
            }
        }
        if (arg0 < 28) {
            field1653 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[BZZI)V", line = 203)
    private static final void method537(int arg0, byte[] arg1, boolean arg2, boolean arg3, int arg4) {
        field1654++;
        if (class93.field2250 == null) {
            return;
        }
        if (class30.field839 >= 0) {
            arg0 -= 20;
            if (arg0 < 1) {
                arg0 = 1;
            }
            class45.field1202 = arg0;
            if (class30.field839 == 0) {
                class2.field34 = 0;
            } else {
                int var5 = class97.method725(class30.field839, -4456);
                int var6 = var5 - class132.field3186;
                class2.field34 = (var6 + arg0 + 3600 - 1) / arg0;
            }
            class7.field254 = arg3;
            class88.field2127 = arg1;
            class14.field399 = arg4;
        } else if (class45.field1202 == 0) {
            class129.method951(arg4, arg1, arg3, false);
        } else {
            class88.field2127 = arg1;
            class14.field399 = arg4;
            class7.field254 = arg3;
        }
        if (arg2) {
            field1663 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIILk;ZI)V", line = 250)
    public static final synchronized void method538(int arg0, int arg1, int arg2, int arg3, int arg4, class60 arg5, boolean arg6, int arg7) {
        field1649++;
        if (!class54.method464(arg2 ^ 0x6F)) {
            return;
        }
        class99.field2403 = arg5;
        class29.field804 = arg0;
        class48.field1289 = arg7;
        class120.field2943 = arg3;
        if (arg2 != 0) {
            return;
        }
        class45.field1217 = -1;
        class32.field899 = arg6;
        class46.field1240 = true;
        class56.field1437 = arg4;
        class22.field644 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILk;IIZIB)V", line = 274)
    public static final synchronized void method539(int arg0, class60 arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        field1667++;
        if (!class54.method464(arg6 ^ 0x5E)) {
            return;
        }
        class56.field1437 = arg2;
        class32.field899 = arg4;
        class120.field2943 = arg0;
        class46.field1240 = true;
        class29.field804 = -1;
        if (arg6 == 16) {
            class22.field644 = arg3;
            class48.field1289 = arg5;
            class99.field2403 = arg1;
            class45.field1217 = -1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 297)
    public static final void method540(boolean arg0) {
        if (class45.field1207 != null) {
            class45.field1207.method148(-96);
        }
        if (arg0) {
            method535(70, null, true, -57, 44, 48, null, null);
        }
        field1648++;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 319)
    public static final synchronized void method541(int arg0) {
        class101.method759(arg0 ^ 0xFFFF89D8);
        if (arg0 == 27762) {
            field1665++;
        }
    }
}
