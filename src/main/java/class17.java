import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lmb;")
    public static class84 field371 = class79.method672(true, "null");

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lmb;")
    public static class84 field366 = class79.method672(true, "title)3jpg");

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lmb;")
    public static class84 field367 = null;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "[I")
    public static int[] field374 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "[I")
    public static int[] field377 = new int[100];

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lmb;")
    public static class84 field373 = class79.method672(true, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field388 = 0;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "J")
    public long field370;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "J")
    public static long field379;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Lsd;")
    public static class122 field386;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lcb;")
    public class17 field369;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Lcb;")
    public class17 field382;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ljd;")
    public static class66 field368;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Ljd;")
    public static class66 field378;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method114(int arg0) {
        field387++;
        class120.field2887.method966(false);
        if (arg0 != -1) {
            method117(true, 33L);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method115(int arg0) {
        field372++;
        if (class76.field1906 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class76.field1906 > 768) {
                    class60.field1501[var1] = class53.method444(class13.method86(arg0, -6298), 1024 - class76.field1906, class117.field2790[var1], class117.field2786[var1]);
                } else if (class76.field1906 <= 256) {
                    class60.field1501[var1] = class53.method444(6553, 256 - class76.field1906, class117.field2786[var1], class117.field2790[var1]);
                } else {
                    class60.field1501[var1] = class117.field2786[var1];
                }
            }
        } else if (class115.field2760 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class115.field2760 > 768) {
                    class60.field1501[var2] = class53.method444(6553, 1024 - class115.field2760, class117.field2790[var2], class71.field1734[var2]);
                } else if (class115.field2760 > 256) {
                    class60.field1501[var2] = class71.field1734[var2];
                } else {
                    class60.field1501[var2] = class53.method444(class13.method86(arg0, -6298), 256 - class115.field2760, class71.field1734[var2], class117.field2790[var2]);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                class60.field1501[var3] = class117.field2790[var3];
            }
        }
        for (int var4 = 0; var4 < 33920; var4++) {
            class144.field3459.field1623[var4] = class128.field3078.field2691[var4];
        }
        int var5 = 0;
        int var6 = 1152;
        if (arg0 != -257) {
            method114(48);
        }
        short var7 = 256;
        for (int var8 = 1; var8 < var7 - 1; var8++) {
            int var22 = (var7 - var8) * class108.field2602[var8] / var7;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var5 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class143.field3448[var5++];
                if (var25 == 0) {
                    var6++;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class144.field3459.field1623[var6];
                    int var29 = class60.field1501[var25];
                    class144.field3459.field1623[var6++] = client.method144(-16711936, var27 * client.method144(var28, 16711935) + var25 * client.method144(16711935, var29)) + client.method144(client.method144(65280, var29) * var25 + client.method144(var28, 65280) * var27, 16711680) >> 8;
                }
            }
            var6 += var23;
        }
        int var9 = 1176;
        int var10 = 0;
        for (int var11 = 0; var11 < 33920; var11++) {
            class128.field3097.field1623[var11] = class124.field3011.field2691[var11];
        }
        for (int var12 = 1; var12 < var7 - 1; var12++) {
            int var13 = (var7 - var12) * class108.field2602[var12] / var7;
            int var14 = var9 + var13;
            int var15 = 103 - var13;
            for (int var16 = 0; var16 < var15; var16++) {
                int var17 = class143.field3448[var10++];
                if (var17 == 0) {
                    var14++;
                } else {
                    int var19 = class128.field3097.field1623[var14];
                    int var20 = 256 - var17;
                    int var21 = class60.field1501[var17];
                    class128.field3097.field1623[var14++] = client.method144(-16711936, client.method144(var19, 16711935) * var20 + client.method144(var21, 16711935) * var17) + client.method144(16711680, client.method144(65280, var19) * var20 + client.method144(65280, var21) * var17) >> 8;
                }
            }
            var9 = var14 + 128 - var13 - var15;
            var10 += 128 - var15;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static final void method116(byte arg0) {
        field376++;
        try {
            Graphics var1 = class92.field2296.getGraphics();
            class14.field279.method122(var1, 17, 357, 0);
            if (arg0 >= -66) {
                field373 = null;
            }
        } catch (Exception var2) {
            class92.field2296.repaint();
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZJ)V")
    public static final void method117(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0) {
            field377 = null;
        }
        field381++;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static void method118(int arg0) {
        field386 = null;
        field366 = null;
        field377 = null;
        field371 = null;
        field374 = null;
        field378 = null;
        if (arg0 != 23164) {
            method117(false, -23L);
        }
        field373 = null;
        field368 = null;
        field367 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
    public static final void method119(byte arg0) {
        for (int var1 = -1; var1 < class71.field1746; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class80.field1990[var1];
            }
            class62 var6 = class44.field978[var5];
            if (var6 != null && var6.field3507 > 0) {
                var6.field3507--;
                if (var6.field3507 == 0) {
                    var6.field3520 = null;
                }
            }
        }
        field383++;
        if (arg0 < 52) {
            return;
        }
        for (int var2 = 0; var2 < class77.field1940; var2++) {
            int var3 = class87.field2146[var2];
            class103 var4 = class69.field1673[var3];
            if (var4 != null && var4.field3507 > 0) {
                var4.field3507--;
                if (var4.field3507 == 0) {
                    var4.field3520 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
    public final boolean method120(boolean arg0) {
        if (arg0) {
            this.method120(true);
        }
        field375++;
        return this.field382 != null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        field385++;
        if (this.field382 == null) {
            return;
        }
        this.field382.field369 = this.field369;
        if (!arg0) {
            this.field369.field382 = this.field382;
            this.field382 = null;
            this.field369 = null;
        }
    }
}
