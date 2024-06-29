import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class203 {

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lme;")
    private class136 field3667 = null;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lme;")
    private class136 field3678 = null;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    private int field3673 = 65000;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    private int field3676;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lkh;")
    private static class117 field3663 = class224.method1450((byte) -124, "Click to switch");

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lkh;")
    public static class117 field3670 = class224.method1450((byte) 127, "p12_full");

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lkh;")
    public static class117 field3662 = class224.method1450((byte) 114, "<col=40ff00>");

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Lkh;")
    public static class117 field3681 = field3663;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "[I")
    public static int[] field3679 = new int[2048];

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Ld;")
    public static class34 field3665;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "[S")
    public static short[] field3677;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[[[B")
    public static byte[][][] field3671;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BIII)Z")
    public final boolean method1348(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 16711680) {
            this.toString();
        }
        field3669++;
        class136 var5 = this.field3678;
        synchronized (this.field3678) {
            if (arg3 < 0 || arg3 > this.field3673) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1349(arg3, true, arg1, arg0, (byte) 105);
            if (!var6) {
                var6 = this.method1349(arg3, false, arg1, arg0, (byte) 83);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZI[BB)Z")
    private final boolean method1349(int arg0, boolean arg1, int arg2, byte[] arg3, byte arg4) {
        field3664++;
        class136 var6 = this.field3678;
        synchronized (this.field3678) {
            try {
                int var7;
                if (arg1) {
                    if (this.field3667.method913((byte) 86) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field3667.method905((long) (arg2 * 6), (byte) -92);
                    this.field3667.method910(6, (byte) 1, 0, class127.field2350);
                    var7 = ((class127.field2350[3] & 0xFF) << 16) - (-(class127.field2350[4] << 8 & 0xFF00) - (class127.field2350[5] & 0xFF));
                    if (var7 <= 0 || this.field3678.method913((byte) 116) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3678.method913((byte) 112) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class127.field2350[5] = (byte) var7;
                class127.field2350[2] = (byte) arg0;
                class127.field2350[4] = (byte) (var7 >> 8);
                class127.field2350[3] = (byte) (var7 >> 16);
                class127.field2350[1] = (byte) (arg0 >> 8);
                int var10 = 0;
                class127.field2350[0] = (byte) (arg0 >> 16);
                int var11 = 0;
                this.field3667.method905((long) (arg2 * 6), (byte) -92);
                this.field3667.method912(class127.field2350, -113, 6, 0);
                if (arg4 < 43) {
                    field3679 = null;
                }
                while (arg0 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label107: {
                            this.field3678.method905((long) (var7 * 520), (byte) -92);
                            try {
                                this.field3678.method910(8, (byte) 1, 0, class127.field2350);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class127.field2350[6] & 0xFF) + ((class127.field2350[5] & 0xFF) << 8) + ((class127.field2350[4] & 0xFF) << 16);
                            int var13 = class127.field2350[7] & 0xFF;
                            int var14 = ((class127.field2350[2] & 0xFF) << 8) + (class127.field2350[3] & 0xFF);
                            int var15 = ((class127.field2350[0] & 0xFF) << 8) + (class127.field2350[1] & 0xFF);
                            if (arg2 == var15 && var11 == var14 && this.field3676 == var13) {
                                if (var12 >= 0 && this.field3678.method913((byte) 64) / 520L >= (long) var12) {
                                    break label107;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3678.method913((byte) 43) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class127.field2350[7] = (byte) this.field3676;
                    class127.field2350[1] = (byte) arg2;
                    class127.field2350[0] = (byte) (arg2 >> 8);
                    class127.field2350[2] = (byte) (var11 >> 8);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class127.field2350[3] = (byte) var11;
                    class127.field2350[4] = (byte) (var12 >> 16);
                    class127.field2350[6] = (byte) var12;
                    var11++;
                    class127.field2350[5] = (byte) (var12 >> 8);
                    this.field3678.method905((long) (var7 * 520), (byte) -92);
                    this.field3678.method912(class127.field2350, -106, 8, 0);
                    this.field3678.method912(arg3, -106, var18, var10);
                    var7 = var12;
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method1350(byte arg0) {
        field3671 = null;
        field3681 = null;
        field3662 = null;
        field3679 = null;
        if (arg0 > -33) {
            method1350((byte) 44);
        }
        field3677 = null;
        field3670 = null;
        field3663 = null;
        field3665 = null;
    }

    @OriginalMember(owner = "client!sf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3672++;
        return "Cache:" + this.field3676;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Lkh;")
    public static final class117 method1351(int arg0, int arg1) {
        class117 var2 = class42.method358(arg1, (byte) 34);
        for (int var3 = var2.method819((byte) -109) - 3; var3 > 0; var3 -= 3) {
            var2 = class36.method316((byte) -34, new class117[] { var2.method781(true, 0, var3), class227.field4086, var2.method802(var3, 1176819746) });
        }
        if (arg0 != 74250408) {
            method1350((byte) -37);
        }
        field3666++;
        if (var2.method819((byte) -109) > 9) {
            return class36.method316((byte) -34, new class117[] { class247.field4540, var2.method781(true, 0, var2.method819((byte) -85) - 8), class225.field4051, class39.field896, var2, class213.field3873 });
        } else if (var2.method819((byte) -86) > 6) {
            return class36.method316((byte) -34, new class117[] { class214.field3882, var2.method781(true, 0, var2.method819((byte) -117) - 4), class211.field3836, class39.field896, var2, class213.field3873 });
        } else {
            return class36.method316((byte) -34, new class117[] { class28.field689, var2, class201.field3652 });
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[B")
    public final byte[] method1352(int arg0, int arg1) {
        field3674++;
        class136 var3 = this.field3678;
        synchronized (this.field3678) {
            try {
                if (this.field3667.method913((byte) 35) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field3667.method905((long) (arg0 * arg1), (byte) -92);
                this.field3667.method910(6, (byte) 1, 0, class127.field2350);
                int var5 = ((class127.field2350[3] & 0xFF) << 16) + ((class127.field2350[4] & 0xFF) << 8) + (class127.field2350[5] & 0xFF);
                int var6 = ((class127.field2350[0] & 0xFF) << 16) + (class127.field2350[2] & 0xFF) + ((class127.field2350[1] & 0xFF) << 8);
                if (var6 < 0 || this.field3673 < var6) {
                    return null;
                } else if (var5 > 0 && this.field3678.method913((byte) 45) / 520L >= (long) var5) {
                    int var9 = 0;
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    while (var11 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field3678.method905((long) (var5 * 520), (byte) -92);
                        int var13 = var6 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3678.method910(var13 + 8, (byte) 1, 0, class127.field2350);
                        int var14 = ((class127.field2350[0] & 0xFF) << 8) + (class127.field2350[1] & 0xFF);
                        int var15 = ((class127.field2350[2] & 0xFF) << 8) + (class127.field2350[3] & 0xFF);
                        int var16 = class127.field2350[7] & 0xFF;
                        int var17 = ((class127.field2350[4] & 0xFF) << 16) + ((class127.field2350[5] & 0xFF) << 8) + (class127.field2350[6] & 0xFF);
                        if (arg1 == var14 && var9 == var15 && this.field3676 == var16) {
                            if (var17 >= 0 && this.field3678.method913((byte) 101) / 520L >= (long) var17) {
                                var5 = var17;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var11++] = class127.field2350[var20 + 8];
                                }
                                var9++;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(ILme;Lme;I)V")
    public class203(int arg0, class136 arg1, class136 arg2, int arg3) {
        this.field3673 = arg3;
        this.field3678 = arg1;
        this.field3676 = arg0;
        this.field3667 = arg2;
    }
}
