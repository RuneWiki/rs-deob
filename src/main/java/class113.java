import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class113 {

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Lt;")
    private class132 field2638 = null;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    private int field2644 = 65000;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lt;")
    private class132 field2656 = null;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    private int field2652;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field2646 = 0;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Lv;")
    public static class146 field2645 = class159.method1226((byte) -37, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Lv;")
    public static class146 field2647 = class159.method1226((byte) -37, ":assistreq:");

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Lv;")
    private static class146 field2651 = class159.method1226((byte) -37, "Please enter your username)3");

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[I")
    public static int[] field2640 = new int[128];

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "[I")
    public static int[] field2635 = new int[1000];

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lv;")
    public static class146 field2648 = class159.method1226((byte) -37, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Lv;")
    private static class146 field2653 = class159.method1226((byte) -37, "Loaded config");

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lv;")
    public static class146 field2634 = field2651;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lv;")
    public static class146 field2639 = field2653;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Lv;")
    public static class146 field2661 = class159.method1226((byte) -37, "<col=ffff00>*V");

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lgf;")
    public static class48 field2637 = new class48(4096);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
    public static int[] field2643;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILdd;I)V")
    public static final void method877(int arg0, int arg1, class26 arg2, int arg3) {
        field2654++;
        if (arg2.field497 == 1) {
            class95.method742(255, 6, 0, arg2.field547, 0, arg2.field465, class158.field3633);
            class145.field3317++;
        }
        if (arg2.field497 == 2 && !class22.field367) {
            class146 var4 = class52.method351(false, arg2);
            if (var4 != null) {
                class95.method742(255, 2, 0, arg2.field547, -1, var4, class71.method509(new class146[] { class60.field1381, arg2.field572 }, (byte) 90));
                class94.field2243++;
            }
        }
        if (arg2.field497 == 3) {
            class95.method742(255, 19, 0, arg2.field547, 0, class38.field847, class158.field3633);
            class20.field306++;
        }
        if (arg3 != -1466) {
            field2661 = null;
        }
        if (arg2.field497 == 4) {
            class95.method742(255, 44, 0, arg2.field547, 0, arg2.field465, class158.field3633);
            class44.field1027++;
        }
        if (arg2.field497 == 5) {
            class155.field3540++;
            class95.method742(255, 20, 0, arg2.field547, 0, arg2.field465, class158.field3633);
        }
        if (arg2.field497 == 6 && class77.field1874 == null) {
            class95.method742(255, 48, 0, arg2.field547, -1, arg2.field465, class158.field3633);
            class136.field3093++;
        }
        if (arg2.field479 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field513; var6++) {
                for (int var7 = 0; var7 < arg2.field543; var7++) {
                    int var8 = (arg2.field469 + 32) * var7;
                    int var9 = (arg2.field552 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field452[var5];
                        var9 += arg2.field549[var5];
                    }
                    if (arg0 >= var8 && arg1 >= var9 && arg0 < var8 + 32 && arg1 < var9 + 32) {
                        class126.field2917 = var5;
                        class157.field3617 = arg2;
                        if (arg2.field519[var5] > 0) {
                            class59 var10 = class73.method524((byte) 105, arg2.field519[var5] - 1);
                            if (class47.field1087 == 1 && class67.method478((byte) 27, class42.method281(arg2, 1299495520))) {
                                if (class155.field3544 != arg2.field547 || class12.field189 != var5) {
                                    class145.field3308++;
                                    class95.method742(arg3 + 1721, 46, var10.field1322, arg2.field547, var5, class88.field2091, class71.method509(new class146[] { class59.field1359, class121.field2805, var10.field1338 }, (byte) -84));
                                }
                            } else if (!class22.field367 || !class67.method478((byte) 27, class42.method281(arg2, arg3 + 1299496986))) {
                                class146[] var11 = var10.field1321;
                                if (class67.field1528) {
                                    var11 = class75.method563((byte) -116, var11);
                                }
                                if (class67.method478((byte) 27, class42.method281(arg2, arg3 + 1299496986))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class108.field2579++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 43;
                                            } else {
                                                var13 = 7;
                                            }
                                            class95.method742(255, var13, var10.field1322, arg2.field547, var5, var11[var12], class71.method509(new class146[] { class66.field1486, var10.field1338 }, (byte) -81));
                                        } else if (var12 == 4) {
                                            class95.method742(255, 7, var10.field1322, arg2.field547, var5, class74.field1767, class71.method509(new class146[] { class66.field1486, var10.field1338 }, (byte) -122));
                                            class48.field1114++;
                                        }
                                    }
                                }
                                if (class146.method1081(class42.method281(arg2, 1299495520), 1957)) {
                                    class95.method742(arg3 ^ 0xFFFFFAB9, 33, var10.field1322, arg2.field547, var5, class88.field2091, class71.method509(new class146[] { class66.field1486, var10.field1338 }, (byte) 78));
                                    class67.field1503++;
                                }
                                if (class67.method478((byte) 27, class42.method281(arg2, 1299495520)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class145.field3309++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 57;
                                            }
                                            if (var14 == 1) {
                                                var15 = 28;
                                            }
                                            if (var14 == 2) {
                                                var15 = 25;
                                            }
                                            class95.method742(255, var15, var10.field1322, arg2.field547, var5, var11[var14], class71.method509(new class146[] { class66.field1486, var10.field1338 }, (byte) 108));
                                        }
                                    }
                                }
                                class15.field244++;
                                class146[] var16 = arg2.field533;
                                if (class67.field1528) {
                                    var16 = class75.method563((byte) -116, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class40.field907++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 47;
                                            }
                                            if (var17 == 1) {
                                                var18 = 51;
                                            }
                                            if (var17 == 2) {
                                                var18 = 31;
                                            }
                                            if (var17 == 3) {
                                                var18 = 58;
                                            }
                                            if (var17 == 4) {
                                                var18 = 26;
                                            }
                                            class95.method742(arg3 ^ 0xFFFFFAB9, var18, var10.field1322, arg2.field547, var5, var16[var17], class71.method509(new class146[] { class66.field1486, var10.field1338 }, (byte) 74));
                                        }
                                    }
                                }
                                class95.method742(arg3 ^ 0xFFFFFAB9, 1005, var10.field1322, arg2.field547, var5, class155.field3536, class71.method509(new class146[] { class66.field1486, var10.field1338 }, (byte) -103));
                            } else if ((class142.field3241 & 0x10) == 16) {
                                class95.method742(255, 50, var10.field1322, arg2.field547, var5, class122.field2850, class71.method509(new class146[] { class140.field3206, class121.field2805, var10.field1338 }, (byte) -103));
                                class140.field3202++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field510) {
            return;
        }
        if (!class22.field367) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class146 var23 = class136.method1013(arg2, var19, -2321);
                if (var23 != null) {
                    class6.field143++;
                    class95.method742(255, 1004, var19 + 1, arg2.field547, arg2.field461, var23, arg2.field524);
                }
            }
            class146 var20 = class52.method351(false, arg2);
            if (var20 != null) {
                class95.method742(255, 2, 0, arg2.field547, arg2.field461, var20, arg2.field524);
                class94.field2243++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class146 var22 = class136.method1013(arg2, var21, -2321);
                if (var22 != null) {
                    class6.field143++;
                    class95.method742(255, 13, var21 + 1, arg2.field547, arg2.field461, var22, arg2.field524);
                }
            }
            if (!class26.method180(class42.method281(arg2, 1299495520), arg3 ^ 0x5B0)) {
                return;
            }
            class136.field3093++;
            class95.method742(255, 48, 0, arg2.field547, arg2.field461, class44.field1004, class158.field3633);
        } else if (class59.method414(arg3 + 1399, class42.method281(arg2, 1299495520)) && (class142.field3241 & 0x20) == 32) {
            class63.field1430++;
            class95.method742(255, 10, 0, arg2.field547, arg2.field461, class122.field2850, class71.method509(new class146[] { class140.field3206, class152.field3516, arg2.field524 }, (byte) 105));
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILv;)Z")
    public static final boolean method878(int arg0, class146 arg1) {
        field2650++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class124.field2892; var2++) {
            if (arg1.method1111(class63.field1423[var2], -41)) {
                return true;
            }
        }
        if (arg0 != -4509) {
            field2647 = null;
        }
        return arg1.method1111(class116.field2696.field1506, -41);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI[BIB)Z")
    private final boolean method879(boolean arg0, int arg1, byte[] arg2, int arg3, byte arg4) {
        field2641++;
        class132 var6 = this.field2638;
        synchronized (this.field2638) {
            try {
                int var7;
                if (arg0) {
                    if ((long) (arg3 * 6 + 6) > this.field2656.method982(-1)) {
                        return false;
                    }
                    this.field2656.method994((long) (arg3 * 6), 0);
                    this.field2656.method993(-1, class119.field2761, 0, 6);
                    var7 = ((class119.field2761[4] & 0xFF) << 8) + ((class119.field2761[3] & 0xFF) << 16) + (class119.field2761[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field2638.method982(-1) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2638.method982(-1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                if (arg4 != 76) {
                    this.method881(0, -4);
                }
                class119.field2761[3] = (byte) (var7 >> 16);
                class119.field2761[0] = (byte) (arg1 >> 16);
                class119.field2761[2] = (byte) arg1;
                class119.field2761[4] = (byte) (var7 >> 8);
                int var10 = 0;
                class119.field2761[1] = (byte) (arg1 >> 8);
                int var11 = 0;
                class119.field2761[5] = (byte) var7;
                this.field2656.method994((long) (arg3 * 6), 0);
                this.field2656.method991(0, class119.field2761, 6, (byte) -128);
                while (var11 < arg1) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field2638.method994((long) (var7 * 520), arg4 - 76);
                            try {
                                this.field2638.method993(-1, class119.field2761, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class119.field2761[4] & 0xFF) << 16) + ((class119.field2761[5] & 0xFF) << 8) + (class119.field2761[6] & 0xFF);
                            int var13 = ((class119.field2761[0] & 0xFF) << 8) + (class119.field2761[1] & 0xFF);
                            int var14 = ((class119.field2761[2] & 0xFF) << 8) + (class119.field2761[3] & 0xFF);
                            int var15 = class119.field2761[7] & 0xFF;
                            if (arg3 == var13 && var10 == var14 && this.field2652 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field2638.method982(-1) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field2638.method982(-1) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg0 = false;
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    int var18 = arg1 - var11;
                    if (arg1 - var11 <= 512) {
                        var12 = 0;
                    }
                    class119.field2761[7] = (byte) this.field2652;
                    class119.field2761[0] = (byte) (arg3 >> 8);
                    class119.field2761[1] = (byte) arg3;
                    class119.field2761[3] = (byte) var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class119.field2761[2] = (byte) (var10 >> 8);
                    class119.field2761[4] = (byte) (var12 >> 16);
                    class119.field2761[6] = (byte) var12;
                    class119.field2761[5] = (byte) (var12 >> 8);
                    this.field2638.method994((long) (var7 * 520), arg4 - 76);
                    var7 = var12;
                    var10++;
                    this.field2638.method991(0, class119.field2761, 8, (byte) -127);
                    this.field2638.method991(var11, arg2, var18, (byte) -127);
                    var11 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II[BI)Z")
    public final boolean method880(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = 9 / ((arg3 - 27) / 44);
        field2649++;
        class132 var6 = this.field2638;
        synchronized (this.field2638) {
            if (arg0 < 0 || this.field2644 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method879(true, arg0, arg2, arg1, (byte) 76);
            if (!var7) {
                var7 = this.method879(false, arg0, arg2, arg1, (byte) 76);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[B")
    public final byte[] method881(int arg0, int arg1) {
        int var3 = 36 / ((arg0 - 22) / 50);
        field2636++;
        class132 var4 = this.field2638;
        synchronized (this.field2638) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field2656.method982(-1)) {
                    return null;
                }
                this.field2656.method994((long) (arg1 * 6), 0);
                this.field2656.method993(-1, class119.field2761, 0, 6);
                int var6 = ((class119.field2761[3] & 0xFF) << 16) + (class119.field2761[4] << 8 & 0xFF00) + (class119.field2761[5] & 0xFF);
                int var7 = ((class119.field2761[0] & 0xFF) << 16) + ((class119.field2761[1] & 0xFF) << 8) + (class119.field2761[2] & 0xFF);
                if (var7 < 0 || this.field2644 < var7) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field2638.method982(-1) / 520L) {
                    byte[] var10 = new byte[var7];
                    int var11 = 0;
                    int var12 = 0;
                    while (var7 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var14 = var7 - var11;
                        this.field2638.method994((long) (var6 * 520), 0);
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2638.method993(-1, class119.field2761, 0, var14 + 8);
                        int var15 = class119.field2761[7] & 0xFF;
                        int var16 = ((class119.field2761[2] & 0xFF) << 8) + (class119.field2761[3] & 0xFF);
                        int var17 = (class119.field2761[6] & 0xFF) + ((class119.field2761[5] & 0xFF) << 8) + ((class119.field2761[4] & 0xFF) << 16);
                        int var18 = ((class119.field2761[0] & 0xFF) << 8) + (class119.field2761[1] & 0xFF);
                        if (arg1 == var18 && var12 == var16 && this.field2652 == var15) {
                            if (var17 >= 0 && (long) var17 <= this.field2638.method982(-1) / 520L) {
                                var6 = var17;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class119.field2761[var21 + 8];
                                }
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BBI)Lv;")
    public static final class146 method882(int arg0, byte[] arg1, byte arg2, int arg3) {
        field2657++;
        class146 var4 = new class146();
        var4.field3365 = new byte[arg3];
        var4.field3372 = 0;
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field3365[var4.field3372++] = arg1[var5];
            }
        }
        if (arg2 < 122) {
            method886(-83, null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([BB)V")
    public static final void method883(byte[] arg0, byte arg1) {
        field2660++;
        class95 var2 = new class95(arg0);
        var2.field2304 = arg0.length - 2;
        int var3 = 104 / ((90 - arg1) / 33);
        class3.field86 = var2.method795(1);
        class122.field2840 = new int[class3.field86];
        class41.field935 = new int[class3.field86];
        class30.field617 = new int[class3.field86];
        class37.field833 = new int[class3.field86];
        class46.field1063 = new byte[class3.field86][];
        var2.field2304 = arg0.length - class3.field86 * 8 - 7;
        class67.field1538 = var2.method795(1);
        class22.field373 = var2.method795(1);
        int var4 = (var2.method790((byte) 73) & 0xFF) + 1;
        for (int var5 = 0; var5 < class3.field86; var5++) {
            class37.field833[var5] = var2.method795(1);
        }
        for (int var6 = 0; var6 < class3.field86; var6++) {
            class122.field2840[var6] = var2.method795(1);
        }
        for (int var7 = 0; var7 < class3.field86; var7++) {
            class41.field935[var7] = var2.method795(1);
        }
        for (int var8 = 0; var8 < class3.field86; var8++) {
            class30.field617[var8] = var2.method795(1);
        }
        var2.field2304 = arg0.length - (var4 + -1) * 3 - class3.field86 * 8 - 7;
        class59.field1358 = new int[var4];
        for (int var9 = 1; var9 < var4; var9++) {
            class59.field1358[var9] = var2.method763(true);
            if (class59.field1358[var9] == 0) {
                class59.field1358[var9] = 1;
            }
        }
        var2.field2304 = 0;
        for (int var10 = 0; var10 < class3.field86; var10++) {
            int var11 = class41.field935[var10];
            int var12 = class30.field617[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class46.field1063[var10] = var14;
            int var15 = var2.method790((byte) 73);
            if (var15 == 0) {
                for (int var18 = 0; var18 < var13; var18++) {
                    var14[var18] = var2.method770((byte) -108);
                }
            } else if (var15 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var12; var17++) {
                        var14[var16 + var11 * var17] = var2.method770((byte) -119);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method884(boolean arg0) {
        field2637 = null;
        field2661 = null;
        field2639 = null;
        field2645 = null;
        field2647 = null;
        field2651 = null;
        field2634 = null;
        field2635 = null;
        field2643 = null;
        if (arg0) {
            field2640 = null;
            field2648 = null;
            field2653 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILv;Ljava/awt/Color;B)V")
    public static final void method885(int arg0, class146 arg1, Color arg2, byte arg3) {
        field2658++;
        try {
            if (arg3 < 26) {
                field2661 = null;
            }
            Graphics var4 = class1.field3.getGraphics();
            if (class115.field2673 == null) {
                class115.field2673 = new Font("Helvetica", 1, 13);
                class125.field2898 = class1.field3.getFontMetrics(class115.field2673);
            }
            if (class124.field2869) {
                class124.field2869 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class95.field2323, class35.field805);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class91.field2172 == null) {
                    class91.field2172 = class1.field3.createImage(304, 34);
                }
                Graphics var5 = class91.field2172.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class115.field2673);
                var5.setColor(Color.white);
                arg1.method1093(var5, (byte) -6, (304 - arg1.method1104(24812, class125.field2898)) / 2, 22);
                var4.drawImage(class91.field2172, class95.field2323 / 2 - 152, class35.field805 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class95.field2323 / 2 - 152;
                int var7 = class35.field805 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var6 + 2, var7 - -2, 300 - arg0 * 3, 30);
                var4.setFont(class115.field2673);
                var4.setColor(Color.white);
                arg1.method1093(var4, (byte) -6, (304 - arg1.method1104(24812, class125.field2898)) / 2 + var6, var7 - -22);
            }
        } catch (Exception var9) {
            class1.field3.repaint();
        }
    }

    @OriginalMember(owner = "client!qb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2659++;
        return "Cache:" + this.field2652;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(ILt;Lt;I)V")
    public class113(int arg0, class132 arg1, class132 arg2, int arg3) {
        this.field2652 = arg0;
        this.field2644 = arg3;
        this.field2638 = arg1;
        this.field2656 = arg2;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILhc;)V")
    public static final void method886(int arg0, class52 arg1) {
        field2642++;
        if (class123.field2859) {
            class5.method40(arg1, -62);
            return;
        }
        if (class46.field1065 == 1 && class90.field2150 >= 715 && class25.field401 >= 453) {
            class101.field2454 = !class101.field2454;
            if (class101.field2454) {
                class100.method831(20096);
            } else {
                class13.method73(class134.field3064, 255, class126.field2916, false, 0, class60.field1377);
            }
        }
        if (class47.field1071 == 5) {
            return;
        }
        class75.field1804++;
        if (class47.field1071 != 10) {
            return;
        }
        if (class157.field3607 != 2 && class67.field1505 == 0) {
            if (class46.field1065 == 1) {
                byte var2 = 5;
                byte var3 = 100;
                short var4 = 463;
                byte var5 = 35;
                if (var2 <= class90.field2150 && var2 + var3 >= class90.field2150 && var4 <= class25.field401 && class25.field401 <= var4 + var5) {
                    class153.method1152((byte) 125);
                    return;
                }
            }
            if (class95.field2272 != null) {
                class153.method1152((byte) 64);
            }
        }
        int var6 = class90.field2150;
        if (arg0 >= -86) {
            return;
        }
        int var7 = class46.field1065;
        int var8 = class25.field401;
        if (class72.field1684 == 0) {
            short var9 = 302;
            short var10 = 291;
            if (var7 == 1 && var6 >= var9 - 75 && var9 + 75 >= var6 && var8 >= var10 - 20 && var10 + 20 >= var8) {
                class1.field11 = 0;
                class72.field1684 = 3;
            }
            short var11 = 462;
            if (var7 == 1 && var6 >= var11 - 75 && var11 + 75 >= var6 && var10 - 20 <= var8 && var10 + 20 >= var8) {
                class72.field1684 = 2;
                class134.field3062 = class77.field1827;
                class134.field3066 = class40.field921;
                class134.field3070 = class40.field874;
                class1.field11 = 0;
                return;
            }
        } else if (class72.field1684 == 2) {
            short var14 = 231;
            short var15 = 302;
            int var20 = var14 + 30;
            if (var7 == 1 && var8 >= var20 - 15 && var20 > var8) {
                class1.field11 = 0;
            }
            short var16 = 321;
            var20 += 15;
            if (var7 == 1 && var8 >= var20 - 15 && var20 > var8) {
                class1.field11 = 1;
            }
            var20 += 15;
            if (var7 == 1 && var15 - 75 <= var6 && var15 + 75 >= var6 && var8 >= var16 - 20 && var16 + 20 >= var8) {
                class134.field3057 = class134.field3057.method1114(-127).method1087(false);
                if (class134.field3057.method1080(-1) == 0) {
                    class20.method111(class40.field903, class40.field890, -124, field2634);
                    return;
                }
                if (class134.field3056.method1080(-1) == 0) {
                    class20.method111(class40.field879, class40.field927, -116, class54.field1244);
                    return;
                }
                class20.method111(class40.field883, class40.field877, -126, class69.field1586);
                class88.method702(20, false);
                return;
            }
            short var17 = 462;
            if (var7 == 1 && var6 >= var17 - 75 && var17 + 75 >= var6 && var8 >= var16 - 20 && var8 <= var16 + 20) {
                class134.field3057 = class134.field3064;
                class134.field3056 = class134.field3064;
                class72.field1684 = 0;
            }
            while (true) {
                while (class54.method361(68)) {
                    boolean var18 = false;
                    for (int var19 = 0; class6.field132.method1080(-1) > var19; var19++) {
                        if (class94.field2236 == class6.field132.method1089(91, var19)) {
                            var18 = true;
                            break;
                        }
                    }
                    if (class1.field11 == 0) {
                        if (class33.field711 == 85 && class134.field3057.method1080(-1) > 0) {
                            class134.field3057 = class134.field3057.method1105(class134.field3057.method1080(-1) - 1, -40, 0);
                        }
                        if (class33.field711 == 84 || class33.field711 == 80) {
                            class1.field11 = 1;
                        }
                        if (var18 && class134.field3057.method1080(-1) < 12) {
                            class134.field3057 = class134.field3057.method1096((byte) -15, class94.field2236);
                        }
                    } else if (class1.field11 == 1) {
                        if (class33.field711 == 85 && class134.field3056.method1080(-1) > 0) {
                            class134.field3056 = class134.field3056.method1105(class134.field3056.method1080(-1) - 1, 118, 0);
                        }
                        if (class33.field711 == 84 || class33.field711 == 80) {
                            class1.field11 = 0;
                        }
                        if (class26.field532 == 2 && class33.field711 == 84) {
                            class134.field3057 = class134.field3057.method1114(-127).method1087(false);
                            if (class134.field3057.method1080(-1) == 0) {
                                class20.method111(class40.field903, class40.field890, -119, field2634);
                                return;
                            }
                            if (class134.field3056.method1080(-1) == 0) {
                                class20.method111(class40.field879, class40.field927, -125, class54.field1244);
                                return;
                            }
                            class20.method111(class40.field883, class40.field877, -125, class69.field1586);
                            class88.method702(20, false);
                            return;
                        }
                        if (var18 && class134.field3056.method1080(-1) < 20) {
                            class134.field3056 = class134.field3056.method1096((byte) -96, class94.field2236);
                        }
                    }
                }
                return;
            }
        } else if (class72.field1684 == 3) {
            short var12 = 321;
            short var13 = 382;
            if (var7 == 1 && var13 - 75 <= var6 && var13 + 75 >= var6 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                class72.field1684 = 0;
                return;
            }
        }
    }
}
