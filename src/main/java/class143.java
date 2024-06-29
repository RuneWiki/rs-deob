import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class143 {

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    private int field2580 = 65000;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lpc;")
    private class144 field2577 = null;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lpc;")
    private class144 field2584 = null;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    private int field2581;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "[J")
    public static long[] field2579 = new long[100];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Ltg;")
    public static class184 field2575 = class135.method812("", 3);

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2572 = new CRC32();

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Ltg;")
    public static class184 field2586 = class135.method812("Einloggen", 3);

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2587 = 1;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Ltg;")
    public static class184 field2588 = class135.method812("Konfig geladen)3", 3);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B")
    public final byte[] method876(int arg0, int arg1) {
        field2583++;
        class144 var3 = this.field2584;
        synchronized (this.field2584) {
            try {
                if (this.field2577.method891(false) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field2577.method883((byte) -11, (long) (arg1 * 6));
                this.field2577.method887(false, 6, class184.field3545, 0);
                int var5 = ((class184.field3545[3] & 0xFF) << 16) + ((class184.field3545[4] & 0xFF) << 8) + (class184.field3545[5] & 0xFF);
                int var6 = ((class184.field3545[0] & 0xFF) << 16) + ((class184.field3545[1] & 0xFF) << 8) + (class184.field3545[2] & 0xFF);
                if (var6 < 0 || this.field2580 < var6) {
                    return null;
                } else if (var5 > 0 && this.field2584.method891(false) / 520L >= (long) var5) {
                    int var9 = -32 / ((arg0 - 32) / 54);
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    label70: while (var6 > var11) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field2584.method883((byte) -11, (long) (var5 * 520));
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2584.method887(false, var14 + 8, class184.field3545, 0);
                        int var15 = ((class184.field3545[5] & 0xFF) << 8) + ((class184.field3545[4] & 0xFF) << 16) + (class184.field3545[6] & 0xFF);
                        int var16 = ((class184.field3545[2] & 0xFF) << 8) + (class184.field3545[3] & 0xFF);
                        int var17 = ((class184.field3545[0] & 0xFF) << 8) + (class184.field3545[1] & 0xFF);
                        int var18 = class184.field3545[7] & 0xFF;
                        if (arg1 == var17 && var12 == var16 && this.field2581 == var18) {
                            if (var15 >= 0 && this.field2584.method891(false) / 520L >= (long) var15) {
                                var12++;
                                var5 = var15;
                                int var21 = 0;
                                while (true) {
                                    if (var21 >= var14) {
                                        continue label70;
                                    }
                                    var10[var11++] = class184.field3545[var21 + 8];
                                    var21++;
                                }
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

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIZ[B)Z")
    private final boolean method877(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field2576++;
        class144 var6 = this.field2584;
        synchronized (this.field2584) {
            if (arg2 != 4) {
                method878(6);
            }
            try {
                int var8;
                if (arg3) {
                    if ((long) (arg1 * 6 + 6) > this.field2577.method891(false)) {
                        return false;
                    }
                    this.field2577.method883((byte) -11, (long) (arg1 * 6));
                    this.field2577.method887(false, 6, class184.field3545, 0);
                    var8 = (class184.field3545[5] & 0xFF) + ((class184.field3545[4] & 0xFF) << 8) + ((class184.field3545[3] & 0xFF) << 16);
                    if (var8 <= 0 || (long) var8 > this.field2584.method891(false) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2584.method891(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class184.field3545[5] = (byte) var8;
                class184.field3545[2] = (byte) arg0;
                class184.field3545[3] = (byte) (var8 >> 16);
                class184.field3545[0] = (byte) (arg0 >> 16);
                class184.field3545[4] = (byte) (var8 >> 8);
                class184.field3545[1] = (byte) (arg0 >> 8);
                this.field2577.method883((byte) -11, (long) (arg1 * 6));
                this.field2577.method889(0, (byte) 78, 6, class184.field3545);
                int var10 = 0;
                int var18;
                for (int var11 = 0; var11 < arg0; var11 += var18) {
                    int var12 = 0;
                    if (arg3) {
                        label108: {
                            this.field2584.method883((byte) -11, (long) (var8 * 520));
                            try {
                                this.field2584.method887(false, 8, class184.field3545, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class184.field3545[4] & 0xFF) << 16) + ((class184.field3545[5] & 0xFF) << 8) + (class184.field3545[6] & 0xFF);
                            int var13 = ((class184.field3545[0] & 0xFF) << 8) + (class184.field3545[1] & 0xFF);
                            int var14 = ((class184.field3545[2] & 0xFF) << 8) + (class184.field3545[3] & 0xFF);
                            int var15 = class184.field3545[7] & 0xFF;
                            if (arg1 == var13 && var10 == var14 && this.field2581 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field2584.method891(false) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field2584.method891(false) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg0 - var11 <= 512) {
                        var12 = 0;
                    }
                    class184.field3545[6] = (byte) var12;
                    class184.field3545[3] = (byte) var10;
                    class184.field3545[5] = (byte) (var12 >> 8);
                    class184.field3545[2] = (byte) (var10 >> 8);
                    class184.field3545[4] = (byte) (var12 >> 16);
                    class184.field3545[0] = (byte) (arg1 >> 8);
                    class184.field3545[7] = (byte) this.field2581;
                    class184.field3545[1] = (byte) arg1;
                    this.field2584.method883((byte) -11, (long) (var8 * 520));
                    var8 = var12;
                    this.field2584.method889(0, (byte) 104, 8, class184.field3545);
                    var10++;
                    var18 = arg0 - var11;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field2584.method889(var11, (byte) -96, var18, arg4);
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method878(int arg0) {
        field2586 = null;
        field2588 = null;
        field2572 = null;
        field2579 = null;
        int var1 = -1 % ((arg0 - 58) / 52);
        field2575 = null;
    }

    @OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2573++;
        return "Cache:" + this.field2581;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[BII)Z")
    public final boolean method879(int arg0, byte[] arg1, int arg2, int arg3) {
        field2582++;
        class144 var5 = this.field2584;
        synchronized (this.field2584) {
            if (arg3 < ~arg2 || this.field2580 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method877(arg2, arg0, arg3 ^ 0xFFFFFFFB, true, arg1);
            if (!var6) {
                var6 = this.method877(arg2, arg0, 4, false, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static final void method880(int arg0) {
        field2571++;
        int var1 = class97.field1801 * 128 + 64;
        int var2 = class116.field2108 * 128 + 64;
        int var3 = class115.method706(var1, class47.field892, 127, var2) - class79.field1435;
        if (class78.field1418 < var2) {
            class78.field1418 += (var2 - class78.field1418) * class208.field3995 / 1000 + class44.field847;
            if (var2 < class78.field1418) {
                class78.field1418 = var2;
            }
        }
        if (var3 > field2585) {
            field2585 += (var3 - field2585) * class208.field3995 / 1000 + class44.field847;
            if (field2585 > var3) {
                field2585 = var3;
            }
        }
        if (field2585 > var3) {
            field2585 -= (field2585 - var3) * class208.field3995 / 1000 + class44.field847;
            if (field2585 < var3) {
                field2585 = var3;
            }
        }
        if (var1 > class59.field1096) {
            class59.field1096 += (var1 - class59.field1096) * class208.field3995 / 1000 + class44.field847;
            if (class59.field1096 > var1) {
                class59.field1096 = var1;
            }
        }
        if (var1 < class59.field1096) {
            class59.field1096 -= (class59.field1096 - var1) * class208.field3995 / 1000 + class44.field847;
            if (var1 > class59.field1096) {
                class59.field1096 = var1;
            }
        }
        int var4 = class24.field442 * 128 + 64;
        if (var2 < class78.field1418) {
            class78.field1418 -= (class78.field1418 - var2) * class208.field3995 / 1000 + class44.field847;
            if (var2 > class78.field1418) {
                class78.field1418 = var2;
            }
        }
        int var5 = class65.field1240 * 128 + 64;
        int var6 = class115.method706(var4, class47.field892, 127, var5) - class138.field2499;
        int var7 = var6 - field2585;
        int var8 = var5 - class78.field1418;
        int var9 = var4 - class59.field1096;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class34.field590;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class119.field2147) {
            class119.field2147 += class82.field1471 + (var11 - class119.field2147) * class123.field2241 / 1000;
            if (var11 < class119.field2147) {
                class119.field2147 = var11;
            }
        }
        if (var11 < class119.field2147) {
            class119.field2147 -= (class119.field2147 - var11) * class123.field2241 / 1000 + class82.field1471;
            if (var11 > class119.field2147) {
                class119.field2147 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class34.field590 += class123.field2241 * var13 / 1000 + class82.field1471;
            class34.field590 &= 0x7FF;
        }
        if (var13 < 0) {
            class34.field590 -= -var13 * class123.field2241 / 1000 + class82.field1471;
            class34.field590 &= 0x7FF;
        }
        int var14 = var12 - class34.field590;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (arg0 != 23995) {
            method880(127);
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class34.field590 = var12;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ILpc;Lpc;I)V")
    public class143(int arg0, class144 arg1, class144 arg2, int arg3) {
        this.field2577 = arg2;
        this.field2580 = arg3;
        this.field2581 = arg0;
        this.field2584 = arg1;
    }
}
