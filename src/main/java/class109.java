import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Loe;")
    private class102 field2666 = null;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    private int field2671 = 65000;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Loe;")
    private class102 field2686 = null;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    private int field2681;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2667 = -1;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lkd;")
    private static class73 field2675 = class126.method1070((byte) -66, "Sorry invited players only)3");

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lkd;")
    public static class73 field2664 = class126.method1070((byte) -66, "Nehmen");

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[I")
    public static int[] field2680 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lkd;")
    private static class73 field2684 = class126.method1070((byte) -66, "Free world");

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lkd;")
    private static class73 field2678 = class126.method1070((byte) -66, "On");

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "[I")
    public static int[] field2685 = new int[5];

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lkd;")
    public static class73 field2674 = field2675;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "Lkd;")
    public static class73 field2683 = field2684;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Lkd;")
    public static class73 field2689 = field2678;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Lkd;")
    public static class73 field2690 = class126.method1070((byte) -66, "swe");

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "Lgd;")
    public static class46 field2688;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lgf;")
    public static class48 field2672;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z")
    public static final boolean method870(int arg0, int arg1) {
        field2663++;
        if (arg0 < 74) {
            field2689 = null;
        }
        if (!class80.method690(arg1, -1)) {
            return false;
        }
        boolean var2 = false;
        class1[] var3 = class120.field3066[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class1 var5 = var3[var4];
            if (var5 != null && var5.field81 == 6) {
                if (var5.field51 != -1 || var5.field130 != -1) {
                    boolean var6 = class115.method979(true, var5);
                    int var7;
                    if (var6) {
                        var7 = var5.field130;
                    } else {
                        var7 = var5.field51;
                    }
                    if (var7 != -1) {
                        class36 var8 = class94.method782(-24669, var7);
                        var5.field72 += class125.field3166;
                        label57: while (true) {
                            do {
                                do {
                                    if (var5.field72 <= var8.field968[var5.field91]) {
                                        break label57;
                                    }
                                    var5.field72 -= var8.field968[var5.field91];
                                    var5.field91++;
                                    var2 = true;
                                } while (var8.field976.length > var5.field91);
                                var5.field91 -= var8.field992;
                            } while (var5.field91 >= 0 && var8.field976.length > var5.field91);
                            var5.field91 = 0;
                        }
                    }
                }
                if (var5.field26 != 0 && !var5.field98) {
                    var2 = true;
                    int var9 = var5.field26 >> 16;
                    int var10 = var5.field26 << 16 >> 16;
                    int var11 = class125.field3166 * var9;
                    var5.field19 = var5.field19 + var11 & 0x7FF;
                    int var12 = class125.field3166 * var10;
                    var5.field78 = var5.field78 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[BI)Z")
    public final boolean method871(int arg0, int arg1, byte[] arg2, int arg3) {
        field2687++;
        class102 var5 = this.field2686;
        synchronized (this.field2686) {
            if (arg3 < ~arg0 || arg0 > this.field2671) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method874(arg1, (byte) -48, arg2, arg0, true);
            if (!var6) {
                var6 = this.method874(arg1, (byte) -48, arg2, arg0, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Z")
    public static final boolean method872(byte arg0, int arg1) {
        if (arg0 != 12) {
            field2664 = null;
        }
        field2676++;
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z")
    public static final boolean method873(int arg0, boolean arg1) {
        field2665++;
        if (arg1) {
            method876(-99, 85, -21);
        }
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2691++;
        return "Cache:" + this.field2681;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB[BIZ)Z")
    private final boolean method874(int arg0, byte arg1, byte[] arg2, int arg3, boolean arg4) {
        field2679++;
        class102 var6 = this.field2686;
        synchronized (this.field2686) {
            try {
                if (arg1 != -48) {
                    method875(79);
                }
                int var7;
                if (arg4) {
                    if ((long) (arg0 * 6 + 6) > this.field2666.method818(arg1 ^ 0xFFFFFFE6)) {
                        return false;
                    }
                    this.field2666.method821((long) (arg0 * 6), false);
                    this.field2666.method817(0, 6, (byte) 110, class81.field2037);
                    var7 = ((class81.field2037[4] & 0xFF) << 8) + ((class81.field2037[3] & 0xFF) << 16) + (class81.field2037[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field2686.method818(59) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2686.method818(117) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class81.field2037[2] = (byte) arg3;
                class81.field2037[1] = (byte) (arg3 >> 8);
                class81.field2037[5] = (byte) var7;
                class81.field2037[3] = (byte) (var7 >> 16);
                class81.field2037[0] = (byte) (arg3 >> 16);
                class81.field2037[4] = (byte) (var7 >> 8);
                int var10 = 0;
                int var11 = 0;
                this.field2666.method821((long) (arg0 * 6), false);
                this.field2666.method823((byte) 117, 6, class81.field2037, 0);
                while (var11 < arg3) {
                    int var12 = 0;
                    if (arg4) {
                        label109: {
                            this.field2686.method821((long) (var7 * 520), false);
                            try {
                                this.field2686.method817(0, 8, (byte) 127, class81.field2037);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class81.field2037[4] & 0xFF) << 16) - (-((class81.field2037[5] & 0xFF) << 8) - (class81.field2037[6] & 0xFF));
                            int var13 = ((class81.field2037[0] & 0xFF) << 8) + (class81.field2037[1] & 0xFF);
                            int var14 = ((class81.field2037[2] & 0xFF) << 8) + (class81.field2037[3] & 0xFF);
                            int var15 = class81.field2037[7] & 0xFF;
                            if (arg0 == var13 && var10 == var14 && this.field2681 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field2686.method818(103) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field2686.method818(40) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg4 = false;
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    if (arg3 - var11 <= 512) {
                        var12 = 0;
                    }
                    class81.field2037[2] = (byte) (var10 >> 8);
                    class81.field2037[0] = (byte) (arg0 >> 8);
                    class81.field2037[5] = (byte) (var12 >> 8);
                    int var18 = arg3 - var11;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class81.field2037[7] = (byte) this.field2681;
                    class81.field2037[4] = (byte) (var12 >> 16);
                    class81.field2037[3] = (byte) var10;
                    class81.field2037[1] = (byte) arg0;
                    var10++;
                    class81.field2037[6] = (byte) var12;
                    this.field2686.method821((long) (var7 * 520), false);
                    var7 = var12;
                    this.field2686.method823((byte) -39, 8, class81.field2037, 0);
                    this.field2686.method823((byte) 93, var18, arg2, var11);
                    var11 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method875(int arg0) {
        field2683 = null;
        field2675 = null;
        field2685 = null;
        field2680 = null;
        field2674 = null;
        field2684 = null;
        field2690 = null;
        field2664 = null;
        field2678 = null;
        field2672 = null;
        field2688 = null;
        if (arg0 != 9099) {
            method872((byte) 47, -90);
        }
        field2689 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
    public static final int method876(int arg0, int arg1, int arg2) {
        field2669++;
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        int var6 = -124 % ((arg1 + 15) / 44);
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[B")
    public final byte[] method877(int arg0, int arg1) {
        field2670++;
        class102 var3 = this.field2686;
        synchronized (this.field2686) {
            try {
                if (this.field2666.method818(80) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field2666.method821((long) (arg1 * 6), false);
                this.field2666.method817(0, 6, (byte) 108, class81.field2037);
                int var5 = ((class81.field2037[1] & 0xFF) << 8) + ((class81.field2037[0] << 16 & 0xFF0000) + (class81.field2037[2] & 0xFF));
                int var6 = ((class81.field2037[arg0] & 0xFF) << 16) + ((class81.field2037[4] & 0xFF) << 8) + (class81.field2037[5] & 0xFF);
                if (var5 < 0 || var5 > this.field2671) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field2686.method818(59) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2686.method821((long) (var6 * 520), false);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2686.method817(0, var13 + 8, (byte) -18, class81.field2037);
                        int var14 = ((class81.field2037[2] & 0xFF) << 8) + (class81.field2037[3] & 0xFF);
                        int var15 = (class81.field2037[6] & 0xFF) + ((class81.field2037[4] & 0xFF) << 16) + ((class81.field2037[5] & 0xFF) << 8);
                        int var16 = ((class81.field2037[0] & 0xFF) << 8) + (class81.field2037[1] & 0xFF);
                        int var17 = class81.field2037[7] & 0xFF;
                        if (arg1 == var16 && var11 == var14 && this.field2681 == var17) {
                            if (var15 >= 0 && (long) var15 <= this.field2686.method818(73) / 520L) {
                                var6 = var15;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class81.field2037[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BI)Z")
    public static final boolean method878(byte arg0, int arg1) {
        field2682++;
        if (arg0 != -96) {
            field2667 = -113;
        }
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(ILoe;Loe;I)V")
    public class109(int arg0, class102 arg1, class102 arg2, int arg3) {
        this.field2666 = arg2;
        this.field2671 = arg3;
        this.field2686 = arg1;
        this.field2681 = arg0;
    }
}
