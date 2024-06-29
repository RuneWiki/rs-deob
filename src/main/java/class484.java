import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class484 extends class42 {

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Z")
    public boolean field7016;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public int field7014;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public int field7015;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public int field7022;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public int field7023;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public int field7024;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Lqt;")
    public static class459 field7020 = new class459(63, 0);

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Lbd;")
    public static class44 field7025 = new class44("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLci;)I")
    public static final int method2853(byte arg0, class320 arg1) {
        field7013++;
        int var2 = 0;
        if (arg1.method2035(class473.field6896, (byte) -94)) {
            var2++;
        }
        if (arg0 < 92) {
            method2853((byte) -11, null);
        }
        if (arg1.method2035(class322.field4797, (byte) -94)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
    public static final void method2854(int arg0, byte arg1) {
        field7026++;
        if (class92.field1478 == 0) {
            class336.field4972.method1472(127, arg0);
        } else {
            class414.field5863 = arg0;
        }
        if (arg1 < -84) {
            ;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method2855(int arg0) {
        field7025 = null;
        field7020 = null;
        if (arg0 != -17852) {
            method2856(117, -58, 14);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public static final void method2856(int arg0, int arg1, int arg2) {
        field7018++;
        class275 var3 = class213.method1433((byte) 100, 1, arg2);
        var3.method1778(0);
        var3.field4113 = arg0;
        if (arg1 > -89) {
            method2855(-40);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIB)Luc;")
    public static final class23 method2857(int arg0, int arg1, int arg2, byte arg3) {
        field7017++;
        int var4 = 86 % ((35 - arg3) / 36);
        class188 var5 = class461.field6675[arg1][arg0][arg2];
        if (var5 == null) {
            return null;
        }
        class23 var6 = null;
        int var7 = -1;
        for (class317 var8 = var5.field2773; var8 != null; var8 = var8.field4709) {
            class478 var9 = var8.field4711;
            if (var9 instanceof class23) {
                class23 var10 = (class23) var9;
                int var11 = (var10.method135((byte) 72) - 1) * 64 + 60;
                int var12 = var10.field6961 - var11 >> 7;
                int var13 = var10.field6965 - var11 >> 7;
                int var14 = var10.field6961 + var11 >> 7;
                int var15 = var10.field6965 + var11 >> 7;
                if (var12 <= arg0 && var13 <= arg2 && arg0 <= var14 && arg2 <= var15) {
                    int var16 = (var14 + 1 - arg0) * (var15 + 1 - arg2);
                    if (var16 > var7) {
                        var7 = var16;
                        var6 = var10;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V")
    public static final void method2858(byte arg0, long arg1) {
        if (class461.field6675 != null) {
            if (class294.field4381 == 1 || class294.field4381 == 5) {
                class262.method1697(-1, arg1);
            } else if (class294.field4381 == 4) {
                class122.method902(-1, arg1);
            }
        }
        field7019++;
        class203.method1402(class76.field1256, (long) class24.field349, 0);
        if (class188.field2765 != -1) {
            class444.method2626((byte) -50, class188.field2765);
        }
        for (int var3 = 0; var3 < class7.field52; var3++) {
            if (class25.field361[var3]) {
                class130.field2043[var3] = true;
            }
            class283.field4212[var3] = class25.field361[var3];
            class25.field361[var3] = false;
        }
        class364.field5295 = class24.field349;
        if (class76.field1256.method189()) {
            class241.field3614 = true;
        }
        if (class188.field2765 != -1) {
            class7.field52 = 0;
            class57.method486(false);
        }
        class76.field1256.method179();
        class56.method480(15320, class76.field1256);
        int var4 = -71 % ((-arg0 - 11) / 45);
        int var5 = class470.method2782(true);
        if (var5 == -1) {
            var5 = class276.field4122;
        }
        if (var5 == -1) {
            var5 = class306.field4543;
        }
        class253.method1635(var5, 0);
        class425.method2520(class364.field5293.field6961, -1612111866, class364.field5293.field6956, class364.field5293.field6965, class163.field2465);
        class163.field2465 = 0;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIZ)V")
    public class484(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field7016 = arg5;
        this.field7014 = arg3;
        this.field7015 = arg1;
        this.field7022 = arg4;
        this.field7023 = arg0;
        this.field7024 = arg2;
    }
}
