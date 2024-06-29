import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class218 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Loh;")
    public static class263 field3869 = class253.method1681(-128, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Loh;")
    public static class263 field3870 = class253.method1681(-128, "<col=00ff00>");

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Loh;")
    public static class263 field3873 = class253.method1681(-122, "::clientjs5drop");

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Loh;")
    public static class263 field3877 = class253.method1681(-122, "overlay2");

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Lue;")
    public static class86 field3876;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method1484(int arg0) {
        field3871++;
        class249.field4355 = 0;
        class70.field1411 = 0;
        class136.method892(-66);
        class126.method821((byte) -60);
        class60.method368(-127);
        class201.method1395((byte) -91);
        int var1 = 0;
        int var2 = 50 / (arg0 / 56);
        while (var1 < class70.field1411) {
            int var4 = class137.field2499[var1];
            if (class228.field4012 != class151.field2725[var4].field4670) {
                if (class151.field2725[var4].field2530 > 0) {
                    class153.method1012(1, class151.field2725[var4]);
                }
                class151.field2725[var4] = null;
            }
            var1++;
        }
        if (class36.field826 != class189.field3394.field3497) {
            throw new RuntimeException("gpp1 pos:" + class189.field3394.field3497 + " psize:" + class36.field826);
        }
        for (int var3 = 0; var3 < class41.field911; var3++) {
            if (class151.field2725[class249.field4354[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class41.field911);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILue;Lmc;ZLue;)V")
    public static final void method1485(int arg0, class86 arg1, class192 arg2, boolean arg3, class86 arg4) {
        class207.field3751 = arg4;
        class208.field3765 = arg1;
        field3874++;
        class215.field3820 = arg3;
        int var5 = class207.field3751.method574((byte) -122) - 1;
        class268.field4727 = var5 * 256 + class207.field3751.method587((byte) 115, var5);
        class89.field1771 = arg2;
        if (arg0 != 0) {
            method1485(73, (class86) null, (class192) null, false, (class86) null);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lsi;ZLoh;)I")
    public static final int method1486(class194 arg0, boolean arg1, class263 arg2) {
        if (!arg1) {
            field3877 = null;
        }
        int var3 = arg0.field3497;
        field3875++;
        arg0.method1318(arg2.field4591, -10624);
        arg0.field3497 += class24.field686.method1234(arg0.field3469, arg2.field4591, arg2.field4605, 46, arg0.field3497, 0);
        return arg0.field3497 - var3;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)Lfd;")
    public static final class119 method1487(int arg0) {
        class88 var1 = new class88(class240.field4200, class2.field46, class198.field3584[0], class46.field1003[0], class198.field3583[0], class181.field3289[arg0], class191.field3425[0], class103.field1965);
        class14.method111(arg0);
        field3872++;
        return var1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lg;ZZ)V")
    public static final void method1488(class266 arg0, boolean arg1, boolean arg2) {
        field3868++;
        int var3 = (int) arg0.field4226;
        if (!arg2) {
            method1486((class194) null, true, (class263) null);
        }
        int var4 = arg0.field4641;
        arg0.method1614(-1204826926);
        if (arg1) {
            class121.method784(var4, -10619);
        }
        class34.method219(var4, (byte) -113);
        class21 var5 = class8.method55(65535, var3);
        if (var5 != null) {
            class220.method1508(var5, (byte) -57);
        }
        int var6 = class252.field4384;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class165.method1089(class202.field3645[var7], 13)) {
                class258.method1707(var7, -17919);
            }
        }
        if (class252.field4384 == 1) {
            class2.field53 = false;
            class53.method338(class83.field1652, 2, class134.field2455, class55.field1162, class275.field4822);
        } else {
            class53.method338(class83.field1652, 2, class134.field2455, class55.field1162, class275.field4822);
            int var8 = class107.field2026.method408(class38.field864);
            for (int var9 = 0; var9 < class252.field4384; var9++) {
                int var10 = class107.field2026.method408(class200.method1388(var9, false));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class275.field4822 = var8 + 8;
            class134.field2455 = class252.field4384 * 15 + 22;
        }
        if (class186.field3353 != -1) {
            class96.method670(class186.field3353, -5846, 1);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
    public static void method1489(int arg0) {
        field3873 = null;
        if (arg0 == 1) {
            field3869 = null;
            field3876 = null;
            field3870 = null;
            field3877 = null;
        }
    }
}
