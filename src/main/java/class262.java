import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class262 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lie;")
    private class221 field4565 = null;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    private int field4574 = 65000;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lie;")
    private class221 field4578 = null;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    private int field4571;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[[[I")
    public static int[][][] field4575 = new int[2][][];

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lhh;")
    public static class163 field4573 = class137.method1065("Lade Schrifts-=tze )2 ", 17);

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field4583 = 0;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lad;")
    public static class43 field4569 = new class43(128);

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field4587 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "[Lvf;")
    public static class71[] field4576;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZZI)V")
    public static final void method1770(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field4573 = null;
        }
        field4564++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class12.field187 = arg1;
        class181.field3330 = arg0;
        class255.field4454 = arg3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BIII)Z")
    public final boolean method1771(byte[] arg0, int arg1, int arg2, int arg3) {
        field4570++;
        class221 var5 = this.field4565;
        synchronized (this.field4565) {
            if (~arg2 > arg3 || this.field4574 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1773(arg0, arg3 + 12123, true, arg2, arg1);
            if (!var6) {
                var6 = this.method1773(arg0, arg3 + 12123, false, arg2, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[B")
    public final byte[] method1772(int arg0, int arg1) {
        field4582++;
        class221 var3 = this.field4565;
        synchronized (this.field4565) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field4578.method1565((byte) -75)) {
                    return null;
                }
                this.field4578.method1569((long) (arg1 * 6), (byte) 79);
                this.field4578.method1563(class157.field2911, true, 6, 0);
                int var5 = ((class157.field2911[1] & 0xFF) << 8) + (class157.field2911[0] << 16 & arg0) + (class157.field2911[2] & 0xFF);
                int var6 = ((class157.field2911[4] & 0xFF) << 8) + ((class157.field2911[3] & 0xFF) << 16) + (class157.field2911[5] & 0xFF);
                if (var5 < 0 || this.field4574 < var5) {
                    return null;
                } else if (var6 > 0 && (this.field4565.method1565((byte) -75) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4565.method1569((long) (var6 * 520), (byte) 79);
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4565.method1563(class157.field2911, true, var13 + 8, 0);
                        int var14 = (class157.field2911[6] & 0xFF) + ((class157.field2911[4] & 0xFF) << 16) + ((class157.field2911[5] & 0xFF) << 8);
                        int var15 = (class157.field2911[0] & 0xFF << 8) + (class157.field2911[1] & 0xFF);
                        int var16 = ((class157.field2911[2] & 0xFF) << 8) + (class157.field2911[3] & 0xFF);
                        int var17 = class157.field2911[7] & 0xFF;
                        if (arg1 == var15 && var10 == var16 && this.field4571 == var17) {
                            if (var14 >= 0 && this.field4565.method1565((byte) -75) / 520L >= (long) var14) {
                                var6 = var14;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var11++] = class157.field2911[var20 + 8];
                                }
                                var10++;
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

    @OriginalMember(owner = "client!vg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4579++;
        return "Cache:" + this.field4571;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BIZII)Z")
    private final boolean method1773(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4567++;
        class221 var6 = this.field4565;
        synchronized (this.field4565) {
            try {
                int var8;
                if (arg2) {
                    if (this.field4578.method1565((byte) -75) < ((long) (arg4 * 6 + 6))) {
                        return false;
                    }
                    this.field4578.method1569((long) (arg4 * 6), (byte) 79);
                    this.field4578.method1563(class157.field2911, true, 6, 0);
                    var8 = (class157.field2911[3] & 0xFF << 16) - (-(class157.field2911[4] & 0xFF << 8) - (class157.field2911[5] & 0xFF));
                    if (var8 <= 0 || ((long) var8) > (this.field4565.method1565((byte) -75) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4565.method1565((byte) -75) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class157.field2911[3] = (byte) (var8 >> 16);
                class157.field2911[4] = (byte) (var8 >> 8);
                if (arg1 != 12122) {
                    this.method1772(32, 73);
                }
                class157.field2911[2] = (byte) arg3;
                class157.field2911[5] = (byte) var8;
                class157.field2911[0] = (byte) (arg3 >> 16);
                class157.field2911[1] = (byte) (arg3 >> 8);
                this.field4578.method1569((long) (arg4 * 6), (byte) 79);
                this.field4578.method1568(class157.field2911, 0, arg1 - 12226, 6);
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label108: {
                            this.field4565.method1569((long) (var8 * 520), (byte) 79);
                            try {
                                this.field4565.method1563(class157.field2911, true, 8, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class157.field2911[0] & 0xFF << 8) + (class157.field2911[1] & 0xFF);
                            var12 = (class157.field2911[6] & 0xFF) + (class157.field2911[5] & 0xFF << 8) + (class157.field2911[4] & 0xFF << 16);
                            int var14 = (class157.field2911[2] & 0xFF << 8) + (class157.field2911[3] & 0xFF);
                            int var15 = class157.field2911[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field4571 == var15) {
                                if (var12 >= 0 && (this.field4565.method1565((byte) -75) / 520L) >= ((long) var12)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field4565.method1565((byte) -75) + 519L) / 520L);
                        arg2 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class157.field2911[7] = (byte) this.field4571;
                    class157.field2911[0] = (byte) (arg4 >> 8);
                    class157.field2911[3] = (byte) var11;
                    class157.field2911[2] = (byte) (var11 >> 8);
                    if ((arg3 - var10) <= 512) {
                        var12 = 0;
                    }
                    class157.field2911[6] = (byte) var12;
                    class157.field2911[5] = (byte) (var12 >> 8);
                    class157.field2911[1] = (byte) arg4;
                    var11++;
                    int var18 = arg3 - var10;
                    class157.field2911[4] = (byte) (var12 >> 16);
                    this.field4565.method1569((long) (var8 * 520), (byte) 79);
                    this.field4565.method1568(class157.field2911, 0, -119, 8);
                    var8 = var12;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4565.method1568(arg0, var10, -111, var18);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final void method1774(int arg0) {
        field4568++;
        class33.field502.method82(8);
        int var1 = class33.field502.method74((byte) 71, 8);
        if (class199.field3573 > var1) {
            for (int var2 = var1; var2 < class199.field3573; var2++) {
                class257.field4494[class95.field1789++] = class155.field2887[var2];
            }
        }
        if (var1 > class199.field3573) {
            throw new RuntimeException("gnpov1");
        }
        class199.field3573 = 0;
        int var3 = 0;
        int var4 = 96 / ((arg0 - 30) / 53);
        while (var1 > var3) {
            int var5 = class155.field2887[var3];
            class2 var6 = class111.field2098[var5];
            int var7 = class33.field502.method74((byte) -92, 1);
            if (var7 == 0) {
                class155.field2887[class199.field3573++] = var5;
                var6.field3628 = class227.field4092;
            } else {
                int var8 = class33.field502.method74((byte) 48, 2);
                if (var8 == 0) {
                    class155.field2887[class199.field3573++] = var5;
                    var6.field3628 = class227.field4092;
                    class124.field2392[class222.field4040++] = var5;
                } else if (var8 == 1) {
                    class155.field2887[class199.field3573++] = var5;
                    var6.field3628 = class227.field4092;
                    int var9 = class33.field502.method74((byte) 42, 3);
                    var6.method1446(false, false, var9);
                    int var10 = class33.field502.method74((byte) -124, 1);
                    if (var10 == 1) {
                        class124.field2392[class222.field4040++] = var5;
                    }
                } else if (var8 == 2) {
                    class155.field2887[class199.field3573++] = var5;
                    var6.field3628 = class227.field4092;
                    int var11 = class33.field502.method74((byte) 113, 3);
                    var6.method1446(false, true, var11);
                    int var12 = class33.field502.method74((byte) 112, 3);
                    var6.method1446(false, true, var12);
                    int var13 = class33.field502.method74((byte) 81, 1);
                    if (var13 == 1) {
                        class124.field2392[class222.field4040++] = var5;
                    }
                } else if (var8 == 3) {
                    class257.field4494[class95.field1789++] = var5;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
    public static final void method1775(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4586++;
        if (class160.field2947 < 100) {
            class18.method125((byte) -92);
        }
        class206.method1466(arg4, arg2, arg1 + arg4, arg2 - -arg3);
        if (class160.field2947 < 100) {
            int var5 = arg1 / 2 + arg4;
            byte var6 = 20;
            int var7 = arg3 / 2 + arg2 - var6 - 18;
            class206.method1483(arg4, arg2, arg1, arg3, 0);
            class206.method1471(var5 - 152, var7, 304, 34, 9179409);
            class206.method1471(var5 - 151, var7 - -1, 302, 32, 0);
            class206.method1483(var5 - 150, var7 + 2, class160.field2947 * 3, 30, 9179409);
            class206.method1483(class160.field2947 * 3 + var5 - 150, var7 + 2, 300 - class160.field2947 * 3, 30, 0);
            class216.field3932.method584(class188.field3446, var5, var6 + var7, 16777215, -1);
            return;
        }
        class33.field511 = class201.field3611 - ((int) ((float) arg3 / class21.field335));
        class134.field2591 = (int) ((float) (arg3 * 2) / class21.field335);
        class135.field2607 = (int) ((float) (arg1 * 2) / class21.field335);
        class90.field1653 = class169.field3086 - (int) ((float) arg1 / class21.field335);
        int var8 = class201.field3611 - ((int) ((float) arg3 / class21.field335));
        int var9 = (int) ((float) arg1 / class21.field335) + class169.field3086;
        int var10 = class169.field3086 - (int) ((float) arg1 / class21.field335);
        int var11 = (int) ((float) arg3 / class21.field335) + class201.field3611;
        class114.method904(var8, arg2, var11, arg2 + arg3, arg4, var9, arg1 + arg4, (byte) -61, var10);
        class159.method1168((byte) -26, var9, arg1 + arg4, var10, var11, arg2 + arg3, arg4, var8, arg2);
        class136.method1060(arg2, var8, var10, (byte) -26, arg1 + arg4, var9, arg2 + arg3, arg4, var11);
        if (arg0 != -8) {
            field4587 = 4;
        }
        if (class229.field4125 > 0) {
            class229.field4125--;
        }
        if (!class174.field3172) {
            return;
        }
        int var12 = arg4 + arg1 - 5;
        int var13 = arg2 + arg3 - 8;
        class12.field192.method578(class145.method1101(0, new class163[] { class5.field92, class136.method1061(class52.field879, (byte) 111) }), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class12.field192.method578(class145.method1101(0, new class163[] { class100.field1935, class136.method1061(var16, (byte) 101), class37.field632 }), var12, var17, var15, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
    public static final byte[] method1776(Object arg0, byte arg1, boolean arg2) {
        field4584++;
        if (arg1 != 44) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class103.method820(var3, (byte) -124) : var3;
        } else if (arg0 instanceof class72) {
            class72 var4 = (class72) arg0;
            return var4.method529((byte) -65);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static void method1777(int arg0) {
        field4575 = null;
        field4573 = null;
        field4576 = null;
        if (arg0 == 0) {
            field4569 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Lhk;")
    public static final class105 method1778(boolean arg0) {
        field4577++;
        int var1 = class257.field4505[0] * class256.field4478[0];
        byte[] var2 = class223.field4070[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class111.field2097[class7.method50(255, var2[var4])];
        }
        class105 var5 = new class105(class107.field2043, class2.field36, class65.field1107[0], class180.field3267[0], class256.field4478[0], class257.field4505[0], var3);
        if (!arg0) {
            method1774(-64);
        }
        class67.method463(86);
        return var5;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(ILie;Lie;I)V")
    public class262(int arg0, class221 arg1, class221 arg2, int arg3) {
        this.field4574 = arg3;
        this.field4578 = arg2;
        this.field4571 = arg0;
        this.field4565 = arg1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static final void method1779(byte arg0) {
        field4572++;
        int var1 = class238.field4237.method1015(-14406);
        if (var1 == 0) {
            return;
        }
        class73.field1362++;
        class191.field3499.method75(92, 54);
        class191.field3499.method655(0, 0);
        if (arg0 >= -18) {
            field4575 = null;
        }
        int var2 = 0;
        int var3 = class191.field3499.field1541;
        class129 var4 = (class129) class238.field4237.method1019((byte) -5);
        class191.field3499.method631(var4.field2503, -1);
        int var5 = var4.field2503;
        class129 var6;
        while ((var6 = (class129) class238.field4237.method1019((byte) -5)) != null) {
            if (var2 < 255 && (var5 + 1) == var6.field2503) {
                var2++;
            } else {
                class191.field3499.method655(0, var2);
                var2 = 0;
                class191.field3499.method631(var6.field2503, -1);
            }
            var5 = var6.field2503;
        }
        class191.field3499.method655(0, var2);
        class191.field3499.method659(class191.field3499.field1541 - var3, 118);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIZ)I")
    public static final int method1780(boolean arg0, int arg1, boolean arg2) {
        field4585++;
        int var3 = 62 % ((arg1 + 66) / 36);
        int var4 = 0;
        if (arg2) {
            var4 += class90.field1662 + class116.field2200;
        }
        if (arg0) {
            var4 += class20.field318 + class77.field1447;
        }
        return var4;
    }
}
