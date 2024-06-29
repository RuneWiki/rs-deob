import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class289 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lus;")
    public static class1 field4204 = new class1(47, 5);

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Ldk;")
    public static class326 field4208 = new class326("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
    public static int[] field4209 = new int[32];

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lal;")
    public static class58 field4210;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static final void method1806(boolean arg0) {
        class22.method152(-31, false);
        field4205++;
        class125.field1636 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class114.field1462.length; var2++) {
            if (class61.field813[var2] != -1 && class114.field1462[var2] == null) {
                class114.field1462[var2] = class303.field4311.method1257(0, class61.field813[var2], 24558);
                if (class114.field1462[var2] == null) {
                    var1 = false;
                    class125.field1636++;
                }
            }
            if (class287.field4195[var2] != -1 && class118.field1499[var2] == null) {
                class118.field1499[var2] = class303.field4311.method1254(0, class287.field4195[var2], -22152, class386.field5482[var2]);
                if (class118.field1499[var2] == null) {
                    class125.field1636++;
                    var1 = false;
                }
            }
            if (class96.field1233[var2] != -1 && class472.field6643[var2] == null) {
                class472.field6643[var2] = class303.field4311.method1257(0, class96.field1233[var2], 24558);
                if (class472.field6643[var2] == null) {
                    var1 = false;
                    class125.field1636++;
                }
            }
            if (class241.field3617[var2] != -1 && class93.field1184[var2] == null) {
                class93.field1184[var2] = class303.field4311.method1257(0, class241.field3617[var2], 24558);
                if (class93.field1184[var2] == null) {
                    class125.field1636++;
                    var1 = false;
                }
            }
            if (class38.field511 != null && class325.field4693[var2] == null && class38.field511[var2] != -1) {
                class325.field4693[var2] = class303.field4311.method1254(0, class38.field511[var2], -22152, class386.field5482[var2]);
                if (class325.field4693[var2] == null) {
                    class125.field1636++;
                    var1 = false;
                }
            }
        }
        if (class269.field3929 == null) {
            if (class367.field5264 == null || !class120.field1512.method1250(111, class367.field5264.field2571 + "_staticelements")) {
                class269.field3929 = new class39(0);
            } else if (class120.field1512.method1253(22473, class367.field5264.field2571 + "_staticelements")) {
                class269.field3929 = class427.method2511(class39.field514, class120.field1512, class367.field5264.field2571 + "_staticelements", (byte) 75);
            } else {
                var1 = false;
                class125.field1636++;
            }
        }
        if (!var1) {
            class39.field516 = 1;
            return;
        }
        boolean var3 = true;
        class132.field1745 = 0;
        for (int var4 = 0; var4 < class114.field1462.length; var4++) {
            byte[] var19 = class118.field1499[var4];
            if (var19 != null) {
                int var20 = (class368.field5294[var4] >> 8) * 64 - class240.field3602;
                int var21 = (class368.field5294[var4] & 0xFF) * 64 - class360.field5180;
                if (class369.field5332) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class487.method2854(var21, var20, 24330, var19, class287.field4181, class58.field758);
            }
            byte[] var22 = class93.field1184[var4];
            if (var22 != null) {
                int var23 = (class368.field5294[var4] >> 8) * 64 - class240.field3602;
                int var24 = (class368.field5294[var4] & 0xFF) * 64 - class360.field5180;
                if (class369.field5332) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class487.method2854(var24, var23, 24330, var22, class287.field4181, class58.field758);
            }
        }
        if (!var3) {
            class39.field516 = 2;
            return;
        }
        if (class39.field516 != 0) {
            class306.method1898(class92.field1166, 868, class27.field363.method2065(109, class326.field4711) + "<br>(100%)", true);
        }
        class164.method1027(false);
        class145.method905(1);
        boolean var5 = false;
        if (class141.field1878.method645() && class314.field4438.field5791) {
            for (int var6 = 0; var6 < class114.field1462.length; var6++) {
                if (class93.field1184[var6] != null || class472.field6643[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class314.field4438.field5772) {
            var7 = class312.field4416[class200.field2922];
        } else {
            var7 = class58.field765[class200.field2922];
        }
        if (class141.field1878.method697()) {
            var7++;
        }
        class355.method2214(7, 4, class58.field758, class287.field4181, var7, var5, class141.field1878.method606() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class422.field5918[var8].method2584(-118);
        }
        class59.method364((byte) -58);
        class411.method2434(1, false);
        class325.method2063((byte) 116);
        class164.method1027(false);
        System.gc();
        class22.method152(-31, arg0);
        class61.method378((byte) -85);
        class145.field2071 = class347.field5026 >= 96;
        class459.field6437 = !class314.field4438.field5780;
        class177.field2543 = class314.field4438.field5791;
        class45.field646 = class314.field4438.field5779;
        class438.field6090 = class314.field4438.field5776;
        class419.field5850 = class314.field4438.method1174((byte) 71, class437.field6083) ? -1 : class42.field619;
        class185.field2744 = class437.field6083 == 1 || class314.field4438.field5774;
        class184.field2718 = new class22(4, class58.field758, class287.field4181, false);
        if (!class369.field5332) {
            class227.method1456(86, class184.field2718, class114.field1462);
        }
        if (class369.field5332) {
            class466.method2741(class114.field1462, class184.field2718, -71);
        }
        class199.method1225(1, class287.field4181 >> 4, class58.field758 >> 4);
        class105.method594(0);
        if (var5) {
            class434.method2566(true);
            class426.field5968 = new class22(1, class58.field758, class287.field4181, true);
            if (!class369.field5332) {
                class227.method1456(70, class426.field5968, class472.field6643);
                class22.method152(-31, true);
            }
            if (class369.field5332) {
                class466.method2741(class472.field6643, class426.field5968, -82);
                class22.method152(-31, true);
            }
            class426.field5968.method2291(0, -30672, class184.field2718.field5407[0]);
            class426.field5968.method2287(class141.field1878, (class441[]) null, (int[][][]) null, 111);
            class434.method2566(false);
        }
        class184.field2718.method2287(class141.field1878, class422.field5918, var5 ? class426.field5968.field5407 : null, 107);
        if (!class369.field5332) {
            class22.method152(-31, true);
            class329.method2088((byte) 125, class184.field2718, class118.field1499);
            if (class325.field4693 != null) {
                class102.method576(3484);
            }
        }
        if (class369.field5332) {
            class22.method152(-31, true);
            class480.method2805(false, class118.field1499, class184.field2718);
        }
        class145.method905(1);
        class22.method152(-31, true);
        class184.field2718.method2283(class141.field1878, var5 ? class28.field388[0] : null, (class426) null, 96);
        class184.field2718.method154(class141.field1878, 128);
        class22.method152(-31, true);
        if (var5) {
            class434.method2566(true);
            class22.method152(-31, true);
            if (!class369.field5332) {
                class329.method2088((byte) 127, class426.field5968, class93.field1184);
            }
            if (class369.field5332) {
                class480.method2805(!arg0, class93.field1184, class426.field5968);
            }
            class145.method905(1);
            class22.method152(-31, true);
            class426.field5968.method2283(class141.field1878, (class426) null, class178.field2556[0], 75);
            class426.field5968.method154(class141.field1878, 128);
            class22.method152(-31, true);
            class434.method2566(false);
        }
        class125.method752(-12390);
        int var9 = class184.field2718.field289;
        if (var9 > class29.field394) {
            var9 = class29.field394;
        }
        if (class29.field394 - 1 > var9) {
            var9 = class29.field394 - 1;
        }
        if (class314.field4438.method1174((byte) 106, class437.field6083)) {
            class453.method2651(0);
        } else {
            class453.method2651(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class58.field758; var17++) {
                for (int var18 = 0; var18 < class287.field4181; var18++) {
                    class486.method2848(var17, var10, -25665, var18);
                }
            }
        }
        class251.method1569(true);
        class164.method1027(false);
        class450.method2628(0);
        class145.method905(1);
        class231.field3492 = false;
        class325.method2059(118);
        if (class239.field3589 != null && class58.field761 != null && class363.field5227 == 25) {
            class203.field3006++;
            class15.method110(class487.field6853, -128);
            class225.field3415.method1744(1057001181, arg0);
        }
        if (!class369.field5332) {
            int var11 = (class310.field4388 - (class58.field758 >> 4)) / 8;
            int var12 = (class310.field4388 + (class58.field758 >> 4)) / 8;
            int var13 = (class242.field3622 - (class287.field4181 >> 4)) / 8;
            int var14 = ((class287.field4181 >> 4) + class242.field3622) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var15 < var11 || var15 > var12 || var13 > var16 || var14 < var16) {
                        class303.field4311.method1249((byte) -94, "m" + var15 + "_" + var16);
                        class303.field4311.method1249((byte) -105, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class363.field5227 == 28) {
            class211.method1368((byte) -98, 10);
        } else {
            class211.method1368((byte) -34, 30);
            if (class58.field761 != null) {
                class15.method110(class342.field4982, -126);
            }
        }
        class295.method1831((byte) 103);
        class164.method1027(false);
        class232.method1474((byte) 80);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method1807(int arg0) {
        field4204 = null;
        field4208 = null;
        field4209 = null;
        if (arg0 != -1375489116) {
            method1807(-75);
        }
        field4210 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
    public static final int method1808(int arg0, int arg1) {
        return class191.field2841 == null ? 0 : class191.field2841[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Lbd;")
    public static final class42 method1809(byte arg0) {
        if (arg0 == -23) {
            field4207++;
            class454.field6397 = 0;
            return class128.method798((byte) 92);
        } else {
            return null;
        }
    }

    static {
        new class326("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field4211 = 0;
    }
}
