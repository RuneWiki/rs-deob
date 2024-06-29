import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class204 extends class53 {

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Lrg;")
    public class224 field3542;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field3543 = 0;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Lsb;")
    public static class221 field3546 = new class221(64);

    @OriginalMember(owner = "client!se", name = "N", descriptor = "Lp;")
    public static class280 field3547 = class18.method140((byte) -120, "Attaquer");

    @OriginalMember(owner = "client!se", name = "R", descriptor = "[I")
    public static int[] field3551 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!se", name = "S", descriptor = "Lp;")
    public static class280 field3552 = class18.method140((byte) -122, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!se", name = "G", descriptor = "B")
    public static byte field3541;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "Ltg;")
    public static class180 field3548;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "Ltg;")
    public static class180 field3550;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "[I")
    public static int[] field3540;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public static final void method1389(int arg0, int arg1, int arg2) {
        if (class185.field3261 > 0) {
            class35.method291(arg0 + 6526, class185.field3261);
            class185.field3261 = 0;
        }
        field3545++;
        if (arg0 != 255) {
            return;
        }
        short var3 = 256;
        int var4 = class151.field2615 * arg1;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class124.field2170[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var5 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class151.field2616[arg2 + (var4++)];
                int var12 = class148.field2571[var5++];
                if (var12 == 0) {
                    class57.field930.field3858[var6++] = var11;
                } else {
                    int var13 = 256 - (var12 + 18);
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = var12 + 18;
                    int var15 = class241.field4227[var12];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class57.field930.field3858[var6++] = class214.method1432(16711680, class214.method1432(var11, 65280) * var13 + class214.method1432(var15, 65280) * var14) + class214.method1432(var13 * class214.method1432(16711935, var11) + var14 * class214.method1432(var15, 16711935), -16711936) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class57.field930.field3858[var6++] = class151.field2616[arg2 + (var4++)];
            }
            var4 += class151.field2615 - 128;
        }
        class57.field930.method755(arg2, arg1);
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lrg;)V")
    public class204(class224 arg0) {
        this.field3542 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public static void method1390(int arg0) {
        field3548 = null;
        field3546 = null;
        if (arg0 != 31969) {
            field3550 = null;
        }
        field3550 = null;
        field3551 = null;
        field3552 = null;
        field3547 = null;
        field3540 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)[Llk;")
    public static final class82[] method1391(boolean arg0) {
        field3539++;
        if (arg0) {
            field3543 = -94;
        }
        class82[] var1 = new class82[class149.field2579];
        for (int var2 = 0; var2 < class149.field2579; var2++) {
            var1[var2] = new class5(class93.field1512, class221.field3828, class243.field4263[var2], class124.field2172[var2], class97.field1562[var2], class57.field915[var2], class182.field3178[var2], class16.field309);
        }
        class126.method868(-15434);
        return var1;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(BI)V")
    public static final void method1392(byte arg0, int arg1) {
        field3538++;
        if (arg1 == -1 || !class48.method356(-664, arg1) || arg0 != -7) {
            return;
        }
        class113[] var2 = class251.field4394[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class113 var4 = var2[var3];
            if (var4.field1968 != null) {
                class178 var5 = new class178();
                var5.field3106 = var4;
                var5.field3107 = var4.field1968;
                class73.method545(2000000, -5310, var5);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLua;)Lp;")
    public static final class280 method1393(byte arg0, class113 arg1) {
        field3544++;
        if (arg0 != 103) {
            field3552 = null;
        }
        if (class140.method972((byte) 100, client.method1099(arg1)) == 0) {
            return null;
        } else if (arg1.field1990 == null || arg1.field1990.method1877(255).method1889(-1) == 0) {
            return class250.field4377 ? class8.field172 : null;
        } else {
            return arg1.field1990;
        }
    }
}
