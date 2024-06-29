import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class98 extends Canvas {

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1591;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1581 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lok;")
    public static class146 field1584 = class235.method1724(-12908, "headicons_prayer");

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "[[I")
    public static int[][] field1588 = new int[104][104];

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lok;")
    public static class146 field1586 = class235.method1724(-12908, "null");

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lok;")
    public static class146 field1592 = class235.method1724(-12908, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lqd;")
    public static class40 field1582;

    @OriginalMember(owner = "client!qb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void paint(Graphics arg0) {
        field1597++;
        this.field1591.paint(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIII)V", line = 21)
    public static final void method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class40.method281(arg3, arg5, class81.field1297[arg0], arg4, 7);
        field1590++;
        int var9 = arg2 - 1;
        class40.method281(arg3, arg5, class81.field1297[arg2], arg4, 7);
        if (arg1 <= 99) {
            method684((class15) null, false, (class15) null, -112, -50);
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class81.field1297[var6];
            var7[arg5] = var7[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 49)
    public static final void method675(byte arg0) {
        if (arg0 != 94) {
            field1589 = 85;
        }
        class81.field1293 = 0;
        field1594++;
        class182.field3045 = 0;
        class72.method532((byte) 104);
        class225.method1665(-129);
        class263.method1899(false);
        for (int var1 = 0; var1 < class81.field1293; var1++) {
            int var2 = class190.field3140[var1];
            if (class203.field3385 != class173.field2906[var2].field5440) {
                if (class173.field2906[var2].field4838.method2128(-1)) {
                    class207.method1567(114, class173.field2906[var2]);
                }
                class173.field2906[var2].method2044((class301) null, (byte) 119);
                class173.field2906[var2] = null;
            }
        }
        if (class46.field781 != client.field4080.field857) {
            throw new RuntimeException("gnp1 pos:" + client.field4080.field857 + " psize:" + class46.field781);
        }
        for (int var3 = 0; var3 < class151.field2574; var3++) {
            if (class173.field2906[class210.field3476[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class151.field2574);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z", line = 107)
    public static final boolean method676(int arg0, int arg1, int arg2) {
        if (arg1 != 65535) {
            field1582 = (class40) null;
        }
        field1595++;
        return (arg2 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 119)
    public static void method677(int arg0) {
        if (arg0 != -1466711632) {
            return;
        }
        field1592 = null;
        field1582 = null;
        field1584 = null;
        field1588 = (int[][]) null;
        field1586 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 148)
    public static final void method678(byte arg0) {
        class2.method5(100);
        class21.method151((byte) 117);
        field1583++;
        class88.method610(true);
        class184.method1446(-125);
        class260.method1884((byte) 45);
        class313.method2196(-128);
        class94.method645(false);
        class155.method1208(16);
        class277.method2020(8);
        class44.method310(56);
        class1.method3(127);
        class41.method290(4);
        class300.method2120((byte) -119);
        if (class101.field1628 != 0) {
            for (int var1 = 0; var1 < class137.field2283.length; var1++) {
                class137.field2283[var1] = null;
            }
            class222.field3708 = 0;
        }
        class319.method2224((byte) 40);
        class39.method275(Integer.MAX_VALUE);
        class281.field4821.method791(8);
        if (!class271.field4640) {
            ((class120) class109.field1747).method821((byte) -111);
        }
        class66.field1112.method1510((byte) -127);
        class84.field1335.method120(0);
        class168.field2844.method120(0);
        class75.field1218.method120(0);
        class313.field5333.method120(0);
        class280.field4807.method120(0);
        class116.field1865.method120(0);
        class275.field4728.method120(0);
        if (arg0 >= -113) {
            method674(72, 107, 54, -109, -26, -25);
        }
        class196.field3273.method120(0);
        class280.field4810.method120(0);
        class144.field2406.method120(0);
        class283.field4843.method120(0);
        class89.field1421.method791(8);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V", line = 206)
    public static final void method679(byte arg0) {
        if (class142.field2369 != null) {
            class142.field2369.method1491(-123);
        }
        field1596++;
        if (class138.field2303 != null) {
            class138.field2303.method1491(110);
        }
        int var1 = -78 % ((arg0 - 40) / 54);
        class62.method480(class119.field1927, 22050, (byte) -125, 2);
        class142.field2369 = class258.method1875(0, class232.field3876, 22050, -111, class75.field1228);
        class142.field2369.method1487(2, class155.field2600);
        class138.field2303 = class258.method1875(1, class232.field3876, 2048, -108, class75.field1228);
        class138.field2303.method1487(2, class82.field1315);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)Lr;", line = 228)
    public static final class264 method680(int arg0, boolean arg1) {
        if (arg1) {
            return (class264) null;
        }
        field1585++;
        int var2 = arg0 & 0xFFFF;
        int var3 = arg0 >> 16;
        if (class92.field1459[var3] == null || class92.field1459[var3][var2] == null) {
            boolean var4 = class272.method1992(2306, var3);
            if (!var4) {
                return null;
            }
        }
        return class92.field1459[var3][var2];
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIBII)V", line = 256)
    public static final void method681(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class318.field5394 = arg0;
        if (arg2 > -49) {
            method681(101, 45, (byte) -20, 24, 3);
        }
        field1593++;
        class126.field2058 = arg3;
        class151.field2564 = arg4;
        class123.field2008 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Loh;IIIZII)V", line = 285)
    public static final void method682(class15 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class146.field2456 = arg5;
        class205.field3412 = arg4;
        if (arg2 >= -62) {
            method678((byte) -65);
        }
        class195.field3242 = arg3;
        class223.field3718 = 1;
        class266.field4562 = arg1;
        field1599++;
        class86.field1372 = arg0;
        class144.field2404 = arg6;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)Lgb;", line = 304)
    public static final class164 method683(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        return var3 == null || var3.field205 == null ? null : var3.field205;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 318)
    public class98(Component arg0) {
        this.field1591 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Loh;ZLoh;II)Lkd;", line = 337)
    public static final class72 method684(class15 arg0, boolean arg1, class15 arg2, int arg3, int arg4) {
        field1587++;
        boolean var5 = true;
        int[] var6 = arg2.method99(-4577, arg3);
        for (int var7 = arg4; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method111(var6[var7], 2047798024, arg3);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method111(var9, 2047798024, 0);
                } else {
                    var10 = arg0.method111(0, 2047798024, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class72(arg2, arg0, arg3, arg1);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 390)
    public final void update(Graphics arg0) {
        field1600++;
        this.field1591.update(arg0);
    }
}
