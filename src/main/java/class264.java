import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class264 {

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lbj;")
    private class159 field3618 = new class159(256);

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Lbj;")
    private class159 field3621 = new class159(256);

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Lvh;")
    private class240 field3615;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lvh;")
    private class240 field3616;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB[I)Lnv;", line = 4)
    public final class286 method1523(int arg0, byte arg1, int[] arg2) {
        field3620++;
        if (this.field3616.method1410(0) == 1) {
            return this.method1529(0, arg0, arg2, -9);
        }
        int var4 = -116 / ((arg1 - 74) / 40);
        if (this.field3616.method1397((byte) -121, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method1529(arg0, 0, arg2, -44);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[IIB)Lnv;", line = 31)
    private final class286 method1524(int arg0, int[] arg1, int arg2, byte arg3) {
        field3613++;
        int var5 = arg0 ^ ((arg2 & 0x80000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class286 var9 = (class286) this.field3621.method979((byte) 28, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class355 var10 = (class355) this.field3618.method979((byte) 28, var7);
            if (var10 == null) {
                var10 = class355.method1970(this.field3615, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field3618.method990(var7, (byte) 13, var10);
            }
            class286 var11 = var10.method1965(arg1);
            if (var11 == null) {
                return null;
            }
            var10.method2946(-108);
            this.field3621.method990(var7, (byte) 47, var11);
            if (arg3 >= -125) {
                this.method1529(0, 94, null, 11);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 81)
    public static final void method1525(int arg0) {
        if (arg0 == 29939) {
            field3612++;
            class82.field1152.method67(-113);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[II)Lnv;", line = 97)
    public final class286 method1526(boolean arg0, int[] arg1, int arg2) {
        field3617++;
        if (this.field3615.method1410(0) == 1) {
            return this.method1524(arg2, arg1, 0, (byte) -127);
        } else if (this.field3615.method1397((byte) 18, arg2) == 1) {
            return this.method1524(0, arg1, arg2, (byte) -128);
        } else {
            if (arg0) {
                this.method1523(118, (byte) -100, null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)I", line = 119)
    public static final int method1527(boolean arg0) {
        field3622++;
        class162 var1 = class418.field6109;
        boolean var2 = false;
        if (class278.field3761 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class162.method1004(0, null, 0, var3, 0, null);
            var2 = true;
        }
        long var4 = class333.method1850(-3562);
        if (!arg0) {
            method1525(-80);
        }
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method492(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class333.method1850(-3562) - var4);
        var1.method1006(0, -16777216, 0, 100, 1, 100);
        if (var2) {
            var1.method1001((byte) -126);
        }
        return var7;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lvh;Lvh;)V", line = 292)
    public class264(class240 arg0, class240 arg1) {
        this.field3615 = arg1;
        this.field3616 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[Lss;I)V", line = 166)
    public static final void method1528(int arg0, class295[] arg1, int arg2) {
        if (arg2 != -1) {
            return;
        }
        field3614++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class295 var4 = arg1[var3];
            if (var4 != null && var4.field3988 == arg0 && !client.method1202(var4)) {
                if (var4.field3984 == 0) {
                    method1528(var4.field4073, arg1, -1);
                    if (var4.field4050 != null) {
                        method1528(var4.field4073, var4.field4050, -1);
                    }
                    class14 var5 = (class14) class269.field3690.method979((byte) 28, (long) var4.field4073);
                    if (var5 != null) {
                        class143.method924(var5.field167, (byte) -92);
                    }
                }
                if (var4.field3984 == 6 && var4.field4060 != -1) {
                    class467 var6 = class275.field3740.method1484(0, var4.field4060);
                    if (var6 != null) {
                        var4.field4018 += class424.field6196;
                        while (var6.field6829[var4.field4078] < var4.field4018) {
                            var4.field4018 -= var6.field6829[var4.field4078];
                            var4.field4078++;
                            if (var6.field6806.length <= var4.field4078) {
                                var4.field4078 -= var6.field6821;
                                if (var4.field4078 < 0 || var4.field4078 >= var6.field6806.length) {
                                    var4.field4078 = 0;
                                }
                            }
                            var4.field4070 = var4.field4078 + 1;
                            if (var4.field4070 >= var6.field6806.length) {
                                var4.field4070 -= var6.field6821;
                                if (var4.field4070 < 0 || var6.field6806.length <= var4.field4070) {
                                    var4.field4070 = -1;
                                }
                            }
                            class150.method952((byte) -66, var4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[II)Lnv;", line = 254)
    private final class286 method1529(int arg0, int arg1, int[] arg2, int arg3) {
        field3619++;
        int var5 = arg1 ^ (arg0 << 4 & 0xFFFE | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class286 var9 = (class286) this.field3621.method979((byte) 28, var7);
        if (arg3 > -1) {
            this.field3618 = null;
        }
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class363 var10 = class363.method2044(this.field3616, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class286 var11 = var10.method2047();
            this.field3621.method990(var7, (byte) 99, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field3842.length;
            }
            return var11;
        } else {
            return null;
        }
    }
}
