import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class72 {

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    private int field1723 = 65000;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lv;")
    private class197 field1721 = null;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Lv;")
    private class197 field1732 = null;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[I")
    public static int[] field1709 = new int[500];

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "Ldd;")
    private static class35 field1725 = class180.method1196((byte) 127, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Ldd;")
    private static class35 field1724 = class180.method1196((byte) 127, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Ldd;")
    public static class35 field1712 = field1724;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Ldd;")
    public static class35 field1713 = field1725;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "Ldd;")
    private static class35 field1730 = class180.method1196((byte) -52, "red:");

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Ldd;")
    private static class35 field1731 = class180.method1196((byte) 126, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Ldd;")
    private static class35 field1733 = class180.method1196((byte) 126, "Your account has been disabled)3");

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Ldd;")
    public static class35 field1708 = field1731;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Ldd;")
    public static class35 field1726 = field1730;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Ldd;")
    public static class35 field1716 = field1730;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Ldd;")
    public static class35 field1722 = field1733;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
    public static int[] field1729;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method572(byte arg0) {
        field1716 = null;
        field1713 = null;
        field1726 = null;
        field1712 = null;
        field1730 = null;
        int var1 = 96 / ((-arg0 - 11) / 51);
        field1731 = null;
        field1709 = null;
        field1733 = null;
        field1724 = null;
        field1725 = null;
        field1708 = null;
        field1722 = null;
        field1729 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI[BI)Z")
    private final boolean method573(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field1720++;
        class197 var6 = this.field1721;
        synchronized (this.field1721) {
            try {
                int var8;
                if (arg1) {
                    if (this.field1732.method1294(true) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field1732.method1293((byte) 108, (long) (arg0 * 6));
                    this.field1732.method1296(6, 0, class4.field67, 0);
                    var8 = ((class4.field67[3] & 0xFF) << 16) + (((class4.field67[4] & 0xFF) << 8) + (class4.field67[5] & 0xFF));
                    if (var8 <= 0 || (long) var8 > this.field1721.method1294(true) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1721.method1294(true) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class4.field67[2] = (byte) arg4;
                class4.field67[5] = (byte) var8;
                class4.field67[3] = (byte) (var8 >> 16);
                class4.field67[4] = (byte) (var8 >> 8);
                class4.field67[0] = (byte) (arg4 >> 16);
                int var10 = 0;
                class4.field67[1] = (byte) (arg4 >> 8);
                if (arg2 != 520) {
                    field1724 = null;
                }
                this.field1732.method1293((byte) 54, (long) (arg0 * 6));
                this.field1732.method1292(0, -1721, 6, class4.field67);
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field1721.method1293((byte) 39, (long) (var8 * 520));
                            try {
                                this.field1721.method1296(8, 0, class4.field67, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class4.field67[5] & 0xFF) << 8) + (((class4.field67[4] & 0xFF) << 16) + (class4.field67[6] & 0xFF));
                            int var13 = ((class4.field67[0] & 0xFF) << 8) + (class4.field67[1] & 0xFF);
                            int var14 = ((class4.field67[2] & 0xFF) << 8) + (class4.field67[3] & 0xFF);
                            int var15 = class4.field67[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field1715 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field1721.method1294(true) / 520L) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg1 = false;
                        var12 = (int) ((this.field1721.method1294(true) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class4.field67[1] = (byte) arg0;
                    class4.field67[3] = (byte) var11;
                    class4.field67[0] = (byte) (arg0 >> 8);
                    class4.field67[2] = (byte) (var11 >> 8);
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class4.field67[4] = (byte) (var12 >> 16);
                    class4.field67[7] = (byte) this.field1715;
                    class4.field67[5] = (byte) (var12 >> 8);
                    int var18 = arg4 - var10;
                    var11++;
                    class4.field67[6] = (byte) var12;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1721.method1293((byte) 59, (long) (var8 * 520));
                    this.field1721.method1292(0, -1721, 8, class4.field67);
                    var8 = var12;
                    this.field1721.method1292(var10, -1721, var18, arg3);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
    public static final void method574(int arg0, int arg1, int arg2) {
        class80.field1865 = true;
        class184.field3783 = arg0;
        class74.field1781 = arg1;
        class111.field2456 = arg2;
        class188.field3817 = -1;
        class68.field1595 = -1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BIIZ)Z")
    public final boolean method575(byte[] arg0, int arg1, int arg2, boolean arg3) {
        field1717++;
        class197 var5 = this.field1721;
        synchronized (this.field1721) {
            if (arg1 < 0 || arg1 > this.field1723) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method573(arg2, arg3, 520, arg0, arg1);
            if (!var6) {
                var6 = this.method573(arg2, false, 520, arg0, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static final void method576(byte arg0) {
        class55.field1283 = 0;
        int var1 = (class71.field1704.field1664 >> 7) + class172.field3444;
        int var2 = (class71.field1704.field1676 >> 7) + class67.field1552;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class55.field1283 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class55.field1283 = 1;
        }
        int var3 = 16 % ((arg0 - 52) / 41);
        if (class55.field1283 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class55.field1283 = 0;
        }
        field1728++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1727++;
        return "Cache:" + this.field1715;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)[B")
    public final byte[] method578(int arg0, byte arg1) {
        field1711++;
        class197 var3 = this.field1721;
        synchronized (this.field1721) {
            try {
                if (this.field1732.method1294(true) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field1732.method1293((byte) 46, (long) (arg0 * 6));
                this.field1732.method1296(6, 0, class4.field67, 0);
                int var5 = ((class4.field67[0] & 0xFF) << 16) + (((class4.field67[1] & 0xFF) << 8) + (class4.field67[2] & 0xFF));
                int var6 = (class4.field67[5] & 0xFF) + (((class4.field67[3] & 0xFF) << 16) + ((class4.field67[4] & 0xFF) << 8));
                if (var5 < 0 || this.field1723 < var5) {
                    return null;
                } else if (var6 > 0 && this.field1721.method1294(true) / 520L >= (long) var6) {
                    int var9 = 0;
                    if (arg1 > -85) {
                        return null;
                    }
                    byte[] var11 = new byte[var5];
                    int var12 = 0;
                    label76: while (var12 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1721.method1293((byte) 25, (long) (var6 * 520));
                        int var14 = var5 - var12;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1721.method1296(var14 + 8, 0, class4.field67, 0);
                        int var15 = ((class4.field67[0] & 0xFF) << 8) + (class4.field67[1] & 0xFF);
                        int var16 = ((class4.field67[2] & 0xFF) << 8) + (class4.field67[3] & 0xFF);
                        int var17 = (class4.field67[6] & 0xFF) + ((class4.field67[4] & 0xFF) << 16) + ((class4.field67[5] & 0xFF) << 8);
                        int var18 = class4.field67[7] & 0xFF;
                        if (arg0 == var15 && var9 == var16 && this.field1715 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field1721.method1294(true) / 520L) {
                                var6 = var17;
                                var9++;
                                int var21 = 0;
                                while (true) {
                                    if (var14 <= var21) {
                                        continue label76;
                                    }
                                    var11[var12++] = class4.field67[var21 + 8];
                                    var21++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var11;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lmd;")
    public static final class120 method579(int arg0, int arg1) {
        field1710++;
        class120 var2 = (class120) class57.field1419.method817(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class134.field2871.method39(arg1, -1, 0);
        if (var3 == null) {
            return null;
        } else if (arg0 == -4) {
            class120 var4 = new class120();
            int var5 = 0;
            class26 var6 = new class26(var3);
            var6.field527 = var6.field529.length - 12;
            int var7 = var6.method240(8);
            var4.field2632 = var6.method256((byte) -78);
            var4.field2640 = var6.method256((byte) -78);
            var4.field2634 = var6.method256((byte) -78);
            var4.field2629 = var6.method256((byte) -78);
            var6.field527 = 0;
            var4.field2635 = var6.method233(-371927456);
            var4.field2630 = new int[var7];
            var4.field2645 = new int[var7];
            var4.field2644 = new class35[var7];
            while (var6.field527 < var6.field529.length - 12) {
                int var8 = var6.method256((byte) -78);
                if (var8 == 3) {
                    var4.field2644[var5] = var6.method236(0);
                } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                    var4.field2630[var5] = var6.method221(-86);
                } else {
                    var4.field2630[var5] = var6.method240(8);
                }
                var4.field2645[var5++] = var8;
            }
            class57.field1419.method816(var4, (long) arg1, 16);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(ILv;Lv;I)V")
    public class72(int arg0, class197 arg1, class197 arg2, int arg3) {
        this.field1732 = arg2;
        this.field1721 = arg1;
        this.field1723 = arg3;
        this.field1715 = arg0;
    }
}
