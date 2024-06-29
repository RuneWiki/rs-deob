import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class62 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Lnj;")
    private class204 field1187 = null;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lnj;")
    private class204 field1184 = null;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    private int field1189 = 65000;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
    public static int[] field1191 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Z")
    public static boolean field1196 = false;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lbm;")
    public static class307 field1188;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[Loj;")
    public static class283[] field1197;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "[[[Lth;")
    public static class55[][][] field1186;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BIILve;I)V", line = 7)
    public static final void method477(byte arg0, int arg1, int arg2, class278 arg3, int arg4) {
        field1190++;
        if (class66.field1265 == arg3 || class48.field999 >= 400) {
            return;
        }
        String var11;
        if (arg3.field4284 == 0) {
            boolean var5 = true;
            if (class66.field1265.field4287 != -1 && arg3.field4287 != -1) {
                int var6 = arg3.field4261 < class66.field1265.field4261 ? class66.field1265.field4261 : arg3.field4261;
                int var7 = class66.field1265.field4287 >= arg3.field4287 ? arg3.field4287 : class66.field1265.field4287;
                int var8 = class66.field1265.field4261 - arg3.field4261;
                if (var8 < 0) {
                    var8 = -var8;
                }
                int var9 = (var6 * 10 / 100) + var7 + 5;
                if (var8 > var9) {
                    var5 = false;
                }
            }
            String var10 = class324.field4954 == 1 ? class169.field2729 : class93.field1679;
            if (arg3.field4261 >= arg3.field4274) {
                var11 = arg3.method1871(-74) + (var5 ? class329.method2282(88, class66.field1265.field4261, arg3.field4261) : "<col=ffffff>") + " (" + var10 + arg3.field4261 + ")";
            } else {
                var11 = arg3.method1871(-59) + (var5 ? class329.method2282(113, class66.field1265.field4261, arg3.field4261) : "<col=ffffff>") + " (" + var10 + arg3.field4261 + "+" + (arg3.field4274 - arg3.field4261) + ")";
            }
        } else {
            var11 = arg3.method1871(-124) + " (" + class227.field3585 + arg3.field4284 + ")";
        }
        if (class21.field447 == 1) {
            class6.method62(arg4, (short) 25, class114.field1989, (long) arg2, -1, class94.field1693, arg1, class170.field2749 + " -> <col=ffffff>" + var11);
            class11.field227++;
        } else if (!class86.field1617) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class256.field3995[var12] != null) {
                    short var13 = 0;
                    class173.field2776++;
                    if (class324.field4954 == 0 && class256.field3995[var12].equalsIgnoreCase(class64.field1232)) {
                        if (arg3.field4261 > class66.field1265.field4261) {
                            var13 = 2000;
                        }
                        if (class66.field1265.field4276 != 0 && arg3.field4276 != 0) {
                            if (class66.field1265.field4276 == arg3.field4276) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class202.field3295[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class185.field3005[var12];
                    short var16 = (short) (var13 + var15);
                    class6.method62(arg4, var16, class78.field1549[var12], (long) arg2, -1, class256.field3995[var12], arg1, "<col=ffffff>" + var11);
                }
            }
        } else if ((class81.field1581 & 0x8) != 0) {
            class6.method62(arg4, (short) 5, class183.field2934, (long) arg2, -1, class281.field4323, arg1, class223.field3523 + " -> <col=ffffff>" + var11);
            class68.field1458++;
        }
        for (int var17 = 0; var17 < class48.field999; var17++) {
            if (class120.field2088[var17] == 48) {
                class296.field4515[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
        if (arg0 > -114) {
            field1186 = (class55[][][]) ((class55[][][]) null);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 138)
    public static void method478(int arg0) {
        field1191 = null;
        field1188 = null;
        field1186 = (class55[][][]) null;
        if (arg0 != 5) {
            field1199 = -64;
        }
        field1197 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 153)
    public static final void method479(int arg0, int arg1) {
        class41.field787.method1883(2047773287, arg1);
        if (arg0 != 5) {
            method482(false, false);
        }
        field1195++;
    }

    @OriginalMember(owner = "client!tl", name = "toString", descriptor = "()Ljava/lang/String;", line = 165)
    public final String toString() {
        field1193++;
        return "Cache:" + this.field1201;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)[B", line = 174)
    public final byte[] method480(int arg0, int arg1) {
        field1194++;
        class204 var3 = this.field1187;
        synchronized (this.field1187) {
            try {
                if (arg0 != 16764670) {
                    field1191 = (int[]) null;
                }
                Object var10000;
                if (this.field1184.method1365(-64) < (long) (arg1 * 6 + 6)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field1184.method1371((byte) 50, (long) (arg1 * 6));
                this.field1184.method1370(class219.field3479, arg0 ^ 0xFFAA17, 6, 0);
                int var4 = (class219.field3479[3] & 0xFF << 16) + (class219.field3479[4] & 0xFF << 8) + (class219.field3479[5] & 0xFF);
                int var5 = ((class219.field3479[0] & 0xFF) << 16) + (class219.field3479[1] & 0xFF << 8) + (class219.field3479[2] & 0xFF);
                if (var5 < 0 || var5 > this.field1189) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 > 0 && (this.field1187.method1365(81) / 520L) >= ((long) var4)) {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    label99: while (var7 < var5) {
                        if (var4 != 0) {
                            this.field1187.method1371((byte) -101, (long) (var4 * 520));
                            int var9 = var5 - var7;
                            if (var9 > 512) {
                                var9 = 512;
                            }
                            this.field1187.method1370(class219.field3479, arg0 - 16738837, var9 + 8, 0);
                            int var10 = ((class219.field3479[0] & 0xFF) << 8) + (class219.field3479[1] & 0xFF);
                            int var11 = ((class219.field3479[4] & 0xFF) << 16) + (class219.field3479[5] & 0xFF << 8) + (class219.field3479[6] & 0xFF);
                            int var12 = class219.field3479[7] & 0xFF;
                            int var13 = (class219.field3479[2] & 0xFF << 8) + (class219.field3479[3] & 0xFF);
                            if (arg1 == var10 && var8 == var13 && this.field1201 == var12) {
                                if (var11 >= 0 && (this.field1187.method1365(46) / 520L) >= ((long) var11)) {
                                    var8++;
                                    var4 = var11;
                                    int var14 = 0;
                                    while (true) {
                                        if (var9 <= var14) {
                                            continue label99;
                                        }
                                        var6[var7++] = class219.field3479[var14 + 8];
                                        var14++;
                                    }
                                }
                                var10000 = null;
                                return (byte[]) var10000;
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    byte[] var19 = var6;
                    return var19;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(ILnj;Lnj;I)V", line = 522)
    public class62(int arg0, class204 arg1, class204 arg2, int arg3) {
        this.field1189 = arg3;
        this.field1201 = arg0;
        this.field1187 = arg1;
        this.field1184 = arg2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III[B)Z", line = 261)
    public final boolean method481(int arg0, int arg1, int arg2, byte[] arg3) {
        field1198++;
        class204 var5 = this.field1187;
        synchronized (this.field1187) {
            if (arg0 < 0 || this.field1189 < arg0) {
                throw new IllegalArgumentException();
            }
            if (arg2 >= -62) {
                field1197 = (class283[]) null;
            }
            boolean var6 = this.method483(true, arg0, arg1, arg3, 7);
            if (!var6) {
                var6 = this.method483(false, arg0, arg1, arg3, 7);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZZ)V", line = 297)
    public static final void method482(boolean arg0, boolean arg1) {
        field1200++;
        byte[][] var2;
        byte var3;
        if (class249.field3893 && arg0) {
            var2 = class218.field3458;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class72.field1502;
        }
        if (arg1) {
            method482(false, true);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class268.method1782(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class99.field1748[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3C31129) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0xFFCEFE) >> 14;
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var9 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class95.field1708.length; var13++) {
                                if (class95.field1708[var13] == var12 && var2[var13] != null) {
                                    class68.method523(class326.field4990, (var9 & 0x7) * 8, var5 * 8, var2[var13], var10, (var11 & 0x7) * 8, var6 * 8, arg0, var8, (byte) -102, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZII[BI)Z", line = 383)
    private final boolean method483(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field1185++;
        class204 var6 = this.field1187;
        synchronized (this.field1187) {
            try {
                int var7;
                boolean var10000;
                if (arg0) {
                    if (this.field1184.method1365(124) < (long) (arg2 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1184.method1371((byte) 123, (long) (arg2 * 6));
                    this.field1184.method1370(class219.field3479, 25833, 6, 0);
                    var7 = ((class219.field3479[4] & 0xFF) << 8) + (class219.field3479[3] & 0xFF << 16) + (class219.field3479[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field1187.method1365(117) / 520L)) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1187.method1365(106) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class219.field3479[5] = (byte) var7;
                class219.field3479[3] = (byte) (var7 >> 16);
                class219.field3479[0] = (byte) (arg1 >> 16);
                class219.field3479[1] = (byte) (arg1 >> 8);
                int var8 = 0;
                if (arg4 != 7) {
                    field1196 = true;
                }
                class219.field3479[2] = (byte) arg1;
                class219.field3479[4] = (byte) (var7 >> 8);
                this.field1184.method1371((byte) -103, (long) (arg2 * 6));
                this.field1184.method1372(0, arg4 ^ 0xFFFFFFF8, class219.field3479, 6);
                int var9 = 0;
                while (true) {
                    if (arg1 > var8) {
                        label133: {
                            int var10 = 0;
                            if (arg0) {
                                label152: {
                                    this.field1187.method1371((byte) 23, (long) (var7 * 520));
                                    try {
                                        this.field1187.method1370(class219.field3479, 25833, 8, 0);
                                    } catch (EOFException var18) {
                                        break label133;
                                    }
                                    var10 = (class219.field3479[6] & 0xFF) + (class219.field3479[4] & 0xFF << 16) + (class219.field3479[5] & 0xFF << 8);
                                    int var12 = class219.field3479[7] & 0xFF;
                                    int var13 = (class219.field3479[0] & 0xFF << 8) + (class219.field3479[1] & 0xFF);
                                    int var14 = ((class219.field3479[2] & 0xFF) << 8) + (class219.field3479[3] & 0xFF);
                                    if (arg2 == var13 && var9 == var14 && this.field1201 == var12) {
                                        if (var10 >= 0 && (long) var10 <= this.field1187.method1365(-126) / 520L) {
                                            break label152;
                                        }
                                        var10000 = false;
                                        return var10000;
                                    }
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                arg0 = false;
                                var10 = (int) ((this.field1187.method1365(39) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class219.field3479[2] = (byte) (var9 >> 8);
                            if ((arg1 - var8) <= 512) {
                                var10 = 0;
                            }
                            class219.field3479[5] = (byte) (var10 >> 8);
                            class219.field3479[1] = (byte) arg2;
                            class219.field3479[7] = (byte) this.field1201;
                            class219.field3479[0] = (byte) (arg2 >> 8);
                            int var15 = arg1 - var8;
                            class219.field3479[3] = (byte) var9;
                            class219.field3479[6] = (byte) var10;
                            var9++;
                            class219.field3479[4] = (byte) (var10 >> 16);
                            this.field1187.method1371((byte) -104, (long) (var7 * 520));
                            this.field1187.method1372(0, arg4 - 8, class219.field3479, 8);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            var7 = var10;
                            this.field1187.method1372(var8, -1, arg3, var15);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }
}
