import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class211 extends Canvas {

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field3746;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Le;")
    public static class191 field3745 = class54.method368("Mem:", 2047);

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Le;")
    private static class191 field3751 = class54.method368("RuneScape is loading )2 please wait)3)3)3", 2047);

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Le;")
    public static class191 field3743 = field3751;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lpk;")
    public static class66 field3738 = new class66(64);

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Le;")
    public static class191 field3752 = class54.method368("headicons_prayer", 2047);

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field3753 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lij;")
    public static class151 field3737;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lmh;")
    public static class232 field3735;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILng;)V")
    public static final void method1448(int arg0, class121 arg1) {
        field3741++;
        class46.field814 = arg1;
        class32.field442 = class46.field814.method805((byte) 67, arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3747++;
        if (arg6 >= 59 && class127.method858(arg1, -10)) {
            client.method658(class242.field4325[arg1], -1, arg0, arg3, arg2, arg5, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!nf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field3746.paint(arg0);
        field3744++;
    }

    @OriginalMember(owner = "client!nf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3746.update(arg0);
        field3736++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method1450(byte arg0) {
        field3738 = null;
        if (arg0 != -20) {
            method1454(-25L, -71);
        }
        field3737 = null;
        field3735 = null;
        field3751 = null;
        field3752 = null;
        field3743 = null;
        field3745 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V")
    public static final void method1451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class209.field3714 < 100) {
            class268.method1839(arg1 - 4);
        }
        if (arg1 != -1) {
            method1453(62, false);
        }
        field3750++;
        class7.method54(arg0, arg2, arg0 + arg3, arg2 + arg4);
        if (class209.field3714 < 100) {
            byte var5 = 20;
            int var6 = arg3 / 2 + arg0;
            int var7 = arg2 + (arg4 / 2) - var5 - 18;
            class7.method55(arg0, arg2, arg3, arg4, 0);
            class7.method48(var6 - 152, var7, 304, 34, 9179409);
            class7.method48(var6 - 151, var7 + 1, 302, 32, 0);
            class7.method55(var6 - 150, var7 + 2, class209.field3714 * 3, 30, 9179409);
            class7.method55(class209.field3714 * 3 + var6 - 150, var7 + 2, 300 - (class209.field3714 * 3), 30, 0);
            class230.field4128.method288(class236.field4205, var6, var5 + var7, 16777215, -1);
            return;
        }
        class193.field3483 = class67.field1160 - ((int) ((float) arg4 / class115.field1905));
        int var8 = class30.field420 - ((int) ((float) arg3 / class115.field1905));
        class132.field2223 = (int) ((float) (arg4 * 2) / class115.field1905);
        int var9 = class30.field420 + ((int) ((float) arg3 / class115.field1905));
        class224.field3987 = (int) ((float) (arg3 * 2) / class115.field1905);
        int var10 = class67.field1160 - (int) ((float) arg4 / class115.field1905);
        class68.field1198 = class30.field420 - ((int) ((float) arg3 / class115.field1905));
        int var11 = (int) ((float) arg4 / class115.field1905) + class67.field1160;
        class130.method880(var11, var10, var8, (byte) 59, arg2, arg2 + arg4, arg0 + arg3, var9, arg0);
        class196.method1383(103, arg2, var10, var8, arg0 + arg3, var9, arg2 + arg4, arg0, var11);
        class127.method865(var11, arg2, var10, arg0, arg0 + arg3, arg2 + arg4, -114, var8, var9);
        if (class199.field3561 > 0) {
            class199.field3561--;
        }
        if (!class181.field3114) {
            return;
        }
        int var12 = arg0 + arg3 - 5;
        int var13 = arg2 + arg4 - 8;
        class138.field2325.method295(class228.method1629(new class191[] { class29.field413, class92.method563(-79, class199.field3548) }, (byte) -14), var12, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var17 = var13 - 15;
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var16 = 16776960;
        if (var15 > 65536) {
            var16 = 16711680;
        }
        class138.field2325.method295(class228.method1629(new class191[] { class11.field129, class92.method563(-97, var15), class37.field669 }, (byte) -92), var12, var17, var16, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lng;Z)V")
    public static final void method1452(class121 arg0, boolean arg1) {
        field3748++;
        class223.field3978 = arg0.method824(arg1, class23.field329);
        class222.field3970 = arg0.method824(arg1, class106.field1763);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)Ldj;")
    public static final class122 method1453(int arg0, boolean arg1) {
        field3733++;
        if (arg1) {
            field3738 = null;
        }
        class122 var2 = (class122) class70.field1237.method437((byte) 122, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class255.field4525.method826((byte) 35, class260.method1787(134663368, arg0), class148.method1001(-25702, arg0));
        class122 var4 = new class122();
        if (var3 != null) {
            var4.method836(new class225(var3), arg1);
        }
        class70.field1237.method439(var4, -1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(JI)V")
    public static final void method1454(long arg0, int arg1) {
        field3749++;
        if (arg0 == 0L) {
            return;
        }
        class256.field4538++;
        class53.field963.method1096(173, 0);
        class53.field963.method1589(arg0, false);
        if (arg1 != 2) {
            method1448(7, (class121) null);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBI[Leg;Z)V")
    public static final void method1455(int arg0, int arg1, byte arg2, int arg3, class33[] arg4, boolean arg5) {
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class33 var7 = arg4[var6];
            if (var7 != null && var7.field478 == arg1) {
                class52.method355(arg0, arg5, var7, arg3, -85);
                class23.method170(arg3, var7, arg0, false);
                if (var7.field482 - var7.field561 < var7.field534) {
                    var7.field534 = var7.field482 - var7.field561;
                }
                if (var7.field534 < 0) {
                    var7.field534 = 0;
                }
                if (var7.field585 > (var7.field462 - var7.field537)) {
                    var7.field585 = var7.field462 - var7.field537;
                }
                if (var7.field585 < 0) {
                    var7.field585 = 0;
                }
                if (var7.field493 == 0) {
                    class27.method196(var7, arg5, 109);
                }
            }
        }
        field3739++;
        if (arg2 != 95) {
            method1448(43, (class121) null);
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class211(Component arg0) {
        this.field3746 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lja;")
    public static final class99 method1456(int arg0, int arg1) {
        field3734++;
        class99 var2 = (class99) class69.field1213.method437((byte) 113, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class43.field748.method826((byte) 35, arg0, arg1);
        class99 var4 = new class99();
        if (var3 != null) {
            var4.method616(new class225(var3), -1);
        }
        class69.field1213.method439(var4, arg0 ^ 0xFFFFFFFA, (long) arg1);
        return var4;
    }
}
