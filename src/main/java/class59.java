import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class59 implements Runnable {

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Z")
    public boolean field1526 = true;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1523 = new Object();

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
    public int[] field1534 = new int[500];

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
    public int[] field1536 = new int[500];

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public int field1533 = 0;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static volatile int field1520 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
    public static int[] field1519 = new int[1000];

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lv;")
    public static class122 field1525 = class55.method425(-66, "backvmid3");

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Lv;")
    public static class122 field1535 = class55.method425(-82, "overlay_multiway");

    @OriginalMember(owner = "client!je", name = "t", descriptor = "[J")
    public static long[] field1537 = new long[200];

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lv;")
    public static class122 field1529 = class55.method425(-117, "invback");

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Ljb;")
    public static class56 field1518 = new class56(100);

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lv;")
    private static class122 field1538 = class55.method425(-112, "Login limit exceeded)3");

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lv;")
    public static class122 field1539 = field1538;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lrd;")
    public static class106 field1531;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "[Lvb;")
    public static class124[] field1528;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([Lv;I)Lv;", line = 8)
    public static final class122 method454(class122[] arg0, int arg1) {
        field1524++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 != 5176) {
            field1525 = null;
        }
        return class25.method259(-32637, 0, arg0, arg0.length);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 28)
    public static void method455(byte arg0) {
        field1518 = null;
        field1525 = null;
        field1519 = null;
        field1531 = null;
        field1537 = null;
        field1538 = null;
        field1539 = null;
        field1529 = null;
        field1528 = null;
        int var1 = -128 / ((49 - arg0) / 60);
        field1535 = null;
    }

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V", line = 57)
    public final void run() {
        while (this.field1526) {
            Object var1 = this.field1523;
            synchronized (this.field1523) {
                if (this.field1533 < 500) {
                    this.field1536[this.field1533] = class7.field171;
                    this.field1534[this.field1533] = class72.field1855;
                    this.field1533++;
                }
            }
            class30.method282((byte) -54, 50L);
        }
        field1522++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 81)
    public static final void method456(int arg0) {
        field1532++;
        int var1 = class16.field409;
        int var2 = class2.field85;
        if (arg0 >= -121) {
            method456(14);
        }
        int var3 = class38.field1003;
        int var4 = class55.field1424;
        int var5 = 6116423;
        class117.method895(var1, var2, var3, var4, var5);
        class117.method895(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class117.method894(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        class103.field2545.method800(class74.field2001, var1 + 3, var2 + 14, var5);
        int var6 = class7.field171;
        int var7 = class72.field1855;
        if (class7.field176 == 0) {
            var6 -= 4;
            var7 -= 4;
        }
        if (class7.field176 == 1) {
            var6 -= 553;
            var7 -= 205;
        }
        if (class7.field176 == 2) {
            var7 -= 357;
            var6 -= 17;
        }
        for (int var8 = 0; var8 < class51.field1313; var8++) {
            int var9 = 16777215;
            int var10 = (class51.field1313 - var8 - 1) * 15 + var2 + 31;
            if (var1 < var6 && var6 < var1 + var3 && var10 - 13 < var7 && var7 < var10 + 3) {
                var9 = 16776960;
            }
            class103.field2545.method802(class23.field617[var8], var1 + 3, var10, var9, true);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([IIIZI)V", line = 159)
    public static final void method457(int[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class88.field2264.method473((byte) -4);
        field1521++;
        class100.field2466.method63(0, 0);
        if (arg3) {
            if (arg0[arg1] != -1) {
                if (arg1 == 0) {
                    class7.field172.method63(22, 10);
                }
                if (arg1 == 1) {
                    class64.field1642.method63(54, 8);
                }
                if (arg1 == 2) {
                    class64.field1642.method63(82, 8);
                }
                if (arg1 == 3) {
                    class18.field435.method63(110, 8);
                }
                if (arg1 == 4) {
                    class126.field3063.method63(153, 8);
                }
                if (arg1 == 5) {
                    class126.field3063.method63(181, 8);
                }
                if (arg1 == 6) {
                    class58.field1510.method63(209, 9);
                }
            }
            if (arg0[0] != -1 && arg2 != 0) {
                class73.field1899[0].method63(29, 13);
            }
            if (arg0[1] != -1 && arg2 != 1) {
                class73.field1899[1].method63(53, 11);
            }
            if (arg0[2] != -1 && arg2 != 2) {
                class73.field1899[2].method63(82, 11);
            }
            if (arg0[3] != -1 && arg2 != 3) {
                class73.field1899[3].method63(115, 12);
            }
            if (arg0[4] != -1 && arg2 != 4) {
                class73.field1899[4].method63(153, 13);
            }
            if (arg0[5] != -1 && arg2 != 5) {
                class73.field1899[5].method63(180, 11);
            }
            if (arg0[6] != -1 && arg2 != 6) {
                class73.field1899[6].method63(208, 13);
            }
        }
        class75.field2011.method473((byte) -4);
        class106.field2630.method63(0, 0);
        if (arg4 != 2) {
            field1529 = null;
        }
        if (arg3) {
            if (arg0[arg1] != -1) {
                if (arg1 == 7) {
                    class11.field346.method63(42, 0);
                }
                if (arg1 == 8) {
                    class47.field1203.method63(74, 0);
                }
                if (arg1 == 9) {
                    class47.field1203.method63(102, 0);
                }
                if (arg1 == 10) {
                    class28.field724.method63(130, 1);
                }
                if (arg1 == 11) {
                    class69.field1809.method63(173, 0);
                }
                if (arg1 == 12) {
                    class69.field1809.method63(201, 0);
                }
                if (arg1 == 13) {
                    class8.field199.method63(229, 0);
                }
            }
            if (arg0[8] != -1 && arg2 != 8) {
                class73.field1899[7].method63(74, 2);
            }
            if (arg0[9] != -1 && arg2 != 9) {
                class73.field1899[8].method63(102, 3);
            }
            if (arg0[10] != -1 && arg2 != 10) {
                class73.field1899[9].method63(137, 4);
            }
            if (arg0[11] != -1 && arg2 != 11) {
                class73.field1899[10].method63(174, 2);
            }
            if (arg0[12] != -1 && arg2 != 12) {
                class73.field1899[11].method63(201, 2);
            }
            if (arg0[13] != -1 && arg2 != 13) {
                class73.field1899[12].method63(226, 2);
            }
        }
        try {
            Graphics var5 = class54.field1411.getGraphics();
            class88.field2264.method122(arg4 ^ 0x76, var5, 516, 160);
            class75.field2011.method122(-22, var5, 496, 466);
        } catch (Exception var6) {
            class54.field1411.repaint();
        }
    }
}
