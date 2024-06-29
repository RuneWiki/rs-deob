import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 {

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lvf;")
    private class152 field3121 = null;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    private int field3120 = 65000;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lvf;")
    private class152 field3132 = null;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    private int field3119;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3116 = 0;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lec;")
    public static class32 field3112 = class73.method594("::", true);

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lec;")
    public static class32 field3124 = class73.method594("mapfunction", true);

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3122 = new CRC32();

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Lec;")
    public static class32 field3130 = class73.method594("<col=00ff00>", true);

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lec;")
    public static class32 field3129 = class73.method594(" )2> <col=ffffff>", true);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lga;")
    public static class44 field3117;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[[[B")
    public static byte[][][] field3125;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "[[[B")
    public static byte[][][] field3131;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZZ[B)Z")
    private final boolean method1021(int arg0, int arg1, boolean arg2, boolean arg3, byte[] arg4) {
        field3115++;
        class152 var6 = this.field3121;
        synchronized (this.field3121) {
            try {
                int var8;
                if (arg3) {
                    if ((long) (arg0 * 6 + 6) > this.field3132.method1176(31274)) {
                        return false;
                    }
                    this.field3132.method1186((byte) 94, (long) (arg0 * 6));
                    this.field3132.method1182(6, 7975, class62.field1439, 0);
                    var8 = ((class62.field1439[3] & 0xFF) << 16) - (-((class62.field1439[4] & 0xFF) << 8) - (class62.field1439[5] & 0xFF));
                    if (var8 <= 0 || this.field3121.method1176(31274) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3121.method1176(31274) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                if (arg2) {
                    field3112 = null;
                }
                class62.field1439[3] = (byte) (var8 >> 16);
                class62.field1439[4] = (byte) (var8 >> 8);
                class62.field1439[0] = (byte) (arg1 >> 16);
                class62.field1439[5] = (byte) var8;
                class62.field1439[2] = (byte) arg1;
                int var10 = 0;
                class62.field1439[1] = (byte) (arg1 >> 8);
                int var11 = 0;
                this.field3132.method1186((byte) -128, (long) (arg0 * 6));
                this.field3132.method1177(class62.field1439, (byte) 90, 6, 0);
                while (arg1 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label108: {
                            this.field3121.method1186((byte) 120, (long) (var8 * 520));
                            try {
                                this.field3121.method1182(8, 7975, class62.field1439, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class62.field1439[4] & 0xFF) << 16) + ((class62.field1439[5] << 8 & 0xFF00) + (class62.field1439[6] & 0xFF));
                            int var13 = ((class62.field1439[0] & 0xFF) << 8) + (class62.field1439[1] & 0xFF);
                            int var14 = ((class62.field1439[2] & 0xFF) << 8) + (class62.field1439[3] & 0xFF);
                            int var15 = class62.field1439[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field3119 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field3121.method1176(31274) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg3 = false;
                        var12 = (int) ((this.field3121.method1176(31274) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class62.field1439[2] = (byte) (var11 >> 8);
                    class62.field1439[3] = (byte) var11;
                    class62.field1439[1] = (byte) arg0;
                    int var18 = arg1 - var10;
                    class62.field1439[7] = (byte) this.field3119;
                    var11++;
                    class62.field1439[0] = (byte) (arg0 >> 8);
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class62.field1439[6] = (byte) var12;
                    class62.field1439[5] = (byte) (var12 >> 8);
                    class62.field1439[4] = (byte) (var12 >> 16);
                    this.field3121.method1186((byte) -89, (long) (var8 * 520));
                    this.field3121.method1177(class62.field1439, (byte) 90, 8, 0);
                    this.field3121.method1177(arg4, (byte) 90, var18, var10);
                    var8 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Ljc;")
    public static final class65 method1022(byte arg0, int arg1) {
        field3114++;
        if (arg0 != 98) {
            return null;
        }
        class65 var2 = (class65) class37.field887.method486(-28825, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class13.field226.method206(3, arg1, -102);
        class65 var4 = new class65();
        if (var3 != null) {
            var4.method498((byte) 84, new class66(var3));
        }
        class37.field887.method485((long) arg1, (byte) -128, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZBLue;)V")
    public static final void method1023(boolean arg0, byte arg1, class144 arg2) {
        field3128++;
        int var3 = (int) arg2.field3326;
        int var4 = arg2.field3282;
        arg2.method1093(0);
        if (arg0) {
            class117.method928((byte) 71, var4);
        }
        class107.method865(4590, var4);
        class36 var5 = class128.method993(var3, 62);
        if (var5 != null) {
            class132.method1010(var5, (byte) -123);
        }
        if (arg1 > -2) {
            field3131 = null;
        }
        class26.field476 = false;
        class119.field2851 = 0;
        class62.method477(-73, class36.field864, class121.field2866, class45.field1072, class110.field2587);
        if (class13.field220 != -1) {
            class154.method1194(class13.field220, 1, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1024(int arg0) {
        field3117 = null;
        field3124 = null;
        field3130 = null;
        field3129 = null;
        field3112 = null;
        field3131 = null;
        if (arg0 == 6) {
            field3122 = null;
            field3125 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILka;I)V")
    public static final void method1025(byte arg0, int arg1, class70 arg2, int arg3) {
        if (arg2.field2714 == arg3 && arg3 != -1) {
            int var4 = class97.method762((byte) 105, arg3).field3397;
            if (var4 == 1) {
                arg2.field2739 = 0;
                arg2.field2716 = 0;
                arg2.field2727 = 0;
                arg2.field2717 = arg1;
            }
            if (var4 == 2) {
                arg2.field2716 = 0;
            }
        } else if (arg3 == -1 || arg2.field2714 == -1 || class97.method762((byte) 123, arg3).field3386 >= class97.method762((byte) 119, arg2.field2714).field3386) {
            arg2.field2750 = arg2.field2698;
            arg2.field2717 = arg1;
            arg2.field2727 = 0;
            arg2.field2716 = 0;
            arg2.field2739 = 0;
            arg2.field2714 = arg3;
        }
        field3111++;
        int var5 = 78 % ((82 - arg0) / 37);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[B")
    public final byte[] method1026(int arg0, int arg1) {
        field3118++;
        class152 var3 = this.field3121;
        synchronized (this.field3121) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field3132.method1176(31274)) {
                    return null;
                }
                this.field3132.method1186((byte) 94, (long) (arg1 * 6));
                this.field3132.method1182(6, 7975, class62.field1439, arg0);
                int var5 = ((class62.field1439[0] & 0xFF) << 16) + ((class62.field1439[1] & 0xFF) << 8) + (class62.field1439[2] & 0xFF);
                int var6 = ((class62.field1439[4] & 0xFF) << 8) + ((class62.field1439[3] & 0xFF) << 16) + (class62.field1439[5] & 0xFF);
                if (var5 < 0 || var5 > this.field3120) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field3121.method1176(31274) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label70: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3121.method1186((byte) 100, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3121.method1182(var13 + 8, 7975, class62.field1439, 0);
                        int var14 = ((class62.field1439[2] & 0xFF) << 8) + (class62.field1439[3] & 0xFF);
                        int var15 = ((class62.field1439[0] & 0xFF) << 8) + (class62.field1439[1] & 0xFF);
                        int var16 = (class62.field1439[6] & 0xFF) + (((class62.field1439[4] & 0xFF) << 16) + ((class62.field1439[5] & 0xFF) << 8));
                        int var17 = class62.field1439[7] & 0xFF;
                        if (arg1 == var15 && var11 == var14 && this.field3119 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field3121.method1176(31274) / 520L) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label70;
                                    }
                                    var9[var10++] = class62.field1439[var20 + 8];
                                    var20++;
                                }
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

    @OriginalMember(owner = "client!tb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3126++;
        return "Cache:" + this.field3119;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljd;IIIIIII)V")
    public static final void method1027(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3110++;
        if (arg3 != -32565) {
            return;
        }
        if (arg6 < 0 || arg6 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var10 = arg0.method533(255);
                if (var10 == 0) {
                    return;
                }
                if (var10 == 1) {
                    arg0.method533(arg3 ^ 0xFFFF8034);
                    return;
                }
                if (var10 <= 49) {
                    arg0.method533(arg3 ^ 0xFFFF8034);
                }
            }
        }
        class3.field50[arg1][arg6][arg5] = 0;
        while (true) {
            int var8 = arg0.method533(255);
            if (var8 == 0) {
                if (arg1 == 0) {
                    class70.field1631[0][arg6][arg5] = -class14.method80(false, arg5 + arg2 + 556238, arg6 + 932731 - -arg7) * 8;
                    return;
                } else {
                    class70.field1631[arg1][arg6][arg5] = class70.field1631[arg1 - 1][arg6][arg5] - 240;
                    return;
                }
            }
            if (var8 == 1) {
                int var9 = arg0.method533(255);
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg1 == 0) {
                    class70.field1631[0][arg6][arg5] = -var9 * 8;
                    return;
                }
                class70.field1631[arg1][arg6][arg5] = class70.field1631[arg1 - 1][arg6][arg5] - var9 * 8;
                return;
            }
            if (var8 <= 49) {
                class111.field2614[arg1][arg6][arg5] = arg0.method545((byte) 116);
                field3131[arg1][arg6][arg5] = (byte) ((var8 - 2) / 4);
                field3125[arg1][arg6][arg5] = (byte) class41.method326(var8 + arg4 - 2, 3);
            } else if (var8 <= 81) {
                class3.field50[arg1][arg6][arg5] = (byte) (var8 - 49);
            } else {
                class117.field2816[arg1][arg6][arg5] = (byte) (var8 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII[B)Z")
    public final boolean method1028(byte arg0, int arg1, int arg2, byte[] arg3) {
        field3127++;
        class152 var5 = this.field3121;
        synchronized (this.field3121) {
            if (arg2 < 0 || this.field3120 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1021(arg1, arg2, false, true, arg3);
            if (arg0 != -80) {
                this.method1028((byte) 121, -90, 10, null);
            }
            if (!var6) {
                var6 = this.method1021(arg1, arg2, false, false, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(ILvf;Lvf;I)V")
    public class134(int arg0, class152 arg1, class152 arg2, int arg3) {
        this.field3132 = arg2;
        this.field3119 = arg0;
        this.field3120 = arg3;
        this.field3121 = arg1;
    }
}
