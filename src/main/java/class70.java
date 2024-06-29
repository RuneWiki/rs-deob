import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class70 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Loc;")
    public static class99 field1790 = class48.method402((byte) -104, "va");

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Z")
    public static boolean field1792 = false;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lr;")
    public static class118 field1791 = new class118(30);

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Loc;")
    public static class99 field1798 = class48.method402((byte) -104, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1801 = 0;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Loc;")
    private static class99 field1800 = class48.method402((byte) -104, "Loaded sprites");

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Loc;")
    public static class99 field1797 = field1800;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lpc;")
    public static class105 field1789;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lpc;")
    public static class105 field1796;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field1794++;
        if (arg6 && class35.method306((byte) 5, arg3)) {
            class57.method517(98, arg7, -1, 0, arg5, arg0, arg2, class132.field3230[arg3], arg8, 0, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method611(byte arg0) {
        field1795++;
        if (class144.field3601 < 2 && class46.field1130 == 0 && !class121.field2957) {
            return;
        }
        if (arg0 != -16) {
            field1791 = null;
        }
        class99 var1;
        if (class46.field1130 == 1 && class144.field3601 < 2) {
            var1 = class20.method189(new class99[] { class48.field1166, client.field513, class89.field2206, class142.field3520 }, arg0 ^ 0xFFFFFFFD);
        } else if (class121.field2957 && class144.field3601 < 2) {
            var1 = class20.method189(new class99[] { class32.field766, client.field513, class63.field1678, class142.field3520 }, arg0 + 57);
        } else {
            var1 = class145.field3619[class144.field3601 - 1];
        }
        if (class144.field3601 > 2) {
            var1 = class20.method189(new class99[] { var1, class23.field547, class5.method31(class144.field3601 - 2, 10), class60.field1608 }, arg0 ^ 0xFFFFFFE3);
        }
        class48.field1162.method972(var1, 4, 15, 16777215, true, class101.field2444 / 1000);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static void method612(byte arg0) {
        field1790 = null;
        field1797 = null;
        field1798 = null;
        field1789 = null;
        field1796 = null;
        field1791 = null;
        field1800 = null;
        int var1 = -24 / ((arg0 - 53) / 62);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)Z")
    public static final boolean method613(boolean arg0, int arg1) {
        field1793++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else {
            if (arg0) {
                method610(-30, 30, -48, -86, -87, 14, true, 58, -21);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIII)V")
    public static final void method614(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1799++;
        class36 var5 = (class36) class14.field327.method1001((long) arg0, (byte) 80);
        if (var5 == null) {
            var5 = new class36();
            class14.field327.method1006((long) arg0, var5, -117);
        }
        if (arg2 >= var5.field923.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field923.length; var8++) {
                var6[var8] = var5.field923[var8];
                var7[var8] = var5.field917[var8];
            }
            for (int var9 = var5.field923.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field917 = var7;
            var5.field923 = var6;
        }
        if (arg1 < 11) {
            method613(false, -85);
        }
        var5.field923[arg2] = arg3;
        var5.field917[arg2] = arg4;
    }
}
