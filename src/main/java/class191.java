import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class191 {

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field3379 = 0;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field3378 = 0;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Loh;")
    public static class258 field3375 = class153.method1046("<col=ff9040>", 127);

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field3382 = 0;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Loh;")
    public static class258 field3374 = class153.method1046(")2", 94);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3373 = 0;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[Lwh;")
    public static class309[] field3372 = new class309[50];

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lgb;")
    public static class213 field3384;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[[B")
    public static byte[][] field3383;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method1288(int arg0, boolean arg1) {
        field3387++;
        class69.field1195--;
        if (class69.field1195 == arg0) {
            return;
        }
        class275.method1929(class242.field4205, arg0 + 1, class242.field4205, arg0, class69.field1195 - arg0);
        class275.method1929(class225.field3849, arg0 + 1, class225.field3849, arg0, class69.field1195 - arg0);
        class275.method1934(class227.field3910, arg0 + 1, class227.field3910, arg0, class69.field1195 - arg0);
        class275.method1935(class217.field3741, arg0 + 1, class217.field3741, arg0, class69.field1195 - arg0);
        class275.method1930(class225.field3863, arg0 + 1, class225.field3863, arg0, class69.field1195 - arg0);
        if (!arg1) {
            field3374 = (class258) null;
        }
        class275.method1930(class70.field1219, arg0 + 1, class70.field1219, arg0, class69.field1195 - arg0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lme;Ljava/awt/Frame;B)V", line = 33)
    public static final void method1289(class295 arg0, Frame arg1, byte arg2) {
        if (arg2 != 93) {
            field3383 = (byte[][]) ((byte[][]) null);
        }
        field3381++;
        while (true) {
            class116 var3 = arg0.method2080(arg1, false);
            while (var3.field2067 == 0) {
                class237.method1628((byte) -88, 10L);
            }
            if (var3.field2067 == 1) {
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class237.method1628((byte) -88, 100L);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 69)
    public static final void method1290(int arg0) {
        if (arg0 != 100) {
            field3378 = 81;
        }
        field3380++;
        class159.field2712.method1161(arg0 ^ 0xFFFFFFA0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lgb;I)V", line = 81)
    public static final void method1291(class213 arg0, int arg1) {
        if (arg1 != 1) {
            method1290(119);
        }
        class293.field5031 = arg0;
        field3386++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lva;I)V", line = 93)
    public static final void method1292(class235 arg0, int arg1) {
        field3377++;
        while (true) {
            while (arg0.field4051 < arg0.field4066.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method1589(arg1 ^ 0xFFFFD9C4) == 1) {
                    var3 = true;
                    var2 = arg0.method1589(63);
                    var4 = arg0.method1589(49);
                }
                int var5 = arg0.method1589(75);
                int var6 = arg0.method1589(87);
                int var7 = class225.field3870 + class317.field5348 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class49.field735;
                if (var8 >= 0 && var7 - 63 >= 0 && var8 + 63 < class57.field907 && class225.field3870 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && (var2 * 8 + 8) > var11 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method1589(53);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1589(62);
                                        if (class115.field2053[var9][var10] == null) {
                                            class115.field2053[var9][var10] = new byte[4096];
                                        }
                                        class115.field2053[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1615(arg1 ^ 0xFFFFD994);
                                        if (class243.field4223[var9][var10] == null) {
                                            class243.field4223[var9][var10] = new short[4096];
                                        }
                                        class243.field4223[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg0.method1589(108) & 0xFF << 16) + ((arg0.method1589(90) & 0xFF) << 8) + (arg0.method1589(arg1 + 9972) & 0xFF);
                                        if (class272.field4710[var9][var10] == null) {
                                            class272.field4710[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class101 var17 = class123.method898(-935, var16);
                                        if (var17.field1797 != null) {
                                            var17 = var17.method768(-50);
                                            if (var17 == null || var17.field1848 == -1) {
                                                continue;
                                            }
                                        }
                                        class272.field4710[var9][var10][(63 - var12 << 6) + var11] = var17.field1801 + 1;
                                        class237 var18 = new class237();
                                        var18.field4144 = var17.field1848;
                                        var18.field4150 = var8;
                                        var18.field4142 = var7;
                                        class15.field201.method82(var18, (byte) -39);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg0.method1589(arg1 + 9953);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field4051++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field4051 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field4051 += 3;
                            }
                        }
                    }
                }
            }
            if (arg1 != -9847) {
                method1288(-27, false);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 271)
    public static final void method1293(int arg0) {
        field3376++;
        for (int var1 = 0; var1 < class311.field5289; var1++) {
            int var2 = class225.field3857[var1];
            class231 var3 = class38.field527[var2];
            int var4 = class293.field5036.method1589(108);
            if ((var4 & 0x1) != 0) {
                var4 += class293.field5036.method1589(114) << 8;
            }
            class65.method497(var3, 7259, var4, var2);
        }
        if (arg0 != -15228) {
            method1292((class235) null, -1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 308)
    public static void method1294(int arg0) {
        field3372 = null;
        field3384 = null;
        field3375 = null;
        field3374 = null;
        field3383 = (byte[][]) null;
        if (arg0 != 4096) {
            method1288(12, false);
        }
    }
}
