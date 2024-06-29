import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class224 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    private int field3577 = 32;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Z")
    private boolean field3580 = false;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "J")
    private long field3579 = class197.method1454((byte) -104);

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "J")
    private long field3599 = 0L;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "[Lcf;")
    private class95[] field3603 = new class95[8];

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    private int field3602 = 0;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Z")
    private boolean field3598 = true;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    private int field3600 = 0;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    private int field3606 = 0;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "J")
    private long field3605 = 0L;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "[Lcf;")
    private class95[] field3609 = new class95[8];

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    private int field3607 = 0;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Llc;")
    public static class86 field3583;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Lcf;")
    private class95 field3593;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "[I")
    public int[] field3588;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public final synchronized void method1599(int arg0) {
        field3592++;
        if (this.field3580) {
            return;
        }
        long var2 = class197.method1454((byte) -104);
        try {
            if ((this.field3579 + 500000L) < var2) {
                this.field3579 = var2 - 500000L;
            }
            while ((this.field3579 + 5000L) < var2) {
                this.method1609(20819, 256);
                this.field3579 += (long) (256000 / class28.field329);
            }
        } catch (Exception var7) {
            this.field3579 = var2;
        }
        if (this.field3588 == null) {
            return;
        }
        try {
            if (this.field3599 != 0L) {
                if (this.field3599 > var2) {
                    return;
                }
                this.method289(this.field3601);
                this.field3598 = true;
                this.field3599 = 0L;
            }
            int var4 = this.method287();
            if ((this.field3606 - var4) > this.field3600) {
                this.field3600 = this.field3606 - var4;
            }
            if (arg0 < -15) {
                int var5 = this.field3610 + this.field3604;
                if ((var5 + 256) > 16384) {
                    var5 = 16128;
                }
                if (var5 + 256 > this.field3601) {
                    var4 = 0;
                    this.field3601 += 1024;
                    if (this.field3601 > 16384) {
                        this.field3601 = 16384;
                    }
                    this.method286();
                    this.method289(this.field3601);
                    if (this.field3601 < (var5 + 256)) {
                        var5 = this.field3601 - 256;
                        this.field3610 = var5 - this.field3604;
                    }
                    this.field3598 = true;
                }
                while (var5 > var4) {
                    var4 += 256;
                    this.method1605(this.field3588, 256);
                    this.method291();
                }
                if (this.field3605 < var2) {
                    if (this.field3598) {
                        this.field3598 = false;
                    } else if (this.field3600 == 0 && this.field3602 == 0) {
                        this.method286();
                        this.field3599 = var2 + 2000L;
                        return;
                    } else {
                        this.field3610 = Math.min(this.field3602, this.field3600);
                        this.field3602 = this.field3600;
                    }
                    this.field3605 = var2 + 2000L;
                    this.field3600 = 0;
                }
                this.field3606 = var4;
            }
        } catch (Exception var6) {
            this.method286();
            this.field3599 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public final void method1600(byte arg0) {
        if (arg0 <= 94) {
            this.method1605((int[]) null, -65);
        }
        this.field3598 = true;
        field3590++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILqi;)Lqi;")
    public static final class131 method1601(int arg0, class131 arg1) {
        field3589++;
        if (arg0 != 2) {
            method1606(58);
        }
        class131 var2 = client.method1167(arg1);
        if (var2 == null) {
            var2 = arg1.field2114;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
    public final synchronized void method1602(byte arg0) {
        this.field3598 = true;
        try {
            this.method290();
        } catch (Exception var2) {
            this.method286();
            this.field3599 = class197.method1454((byte) -104) + 2000L;
        }
        if (arg0 >= -57) {
            this.field3603 = null;
        }
        field3608++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lq;B)V")
    public static final void method1603(class128 arg0, byte arg1) {
        field3597++;
        int var2 = arg0.field1913 - class264.field4290;
        int var3 = arg0.field1901 * 128 + (arg0.method205(-65) * 64);
        int var4 = arg0.field1952 * 128 + (arg0.method205(arg1 ^ 0xFFFFFFEF) * 64);
        if (arg0.field1890 == 0) {
            arg0.field1928 = 1024;
        }
        if (arg0.field1890 == 1) {
            arg0.field1928 = 1536;
        }
        arg0.field1954 = 0;
        if (arg0.field1890 == 2) {
            arg0.field1928 = 0;
        }
        if (arg0.field1890 == 3) {
            arg0.field1928 = 512;
        }
        arg0.field1979 += (var3 - arg0.field1979) / var2;
        if (arg1 != 87) {
            field3583 = null;
        }
        arg0.field1910 += (var4 - arg0.field1910) / var2;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
    public void method291() throws Exception {
        field3591++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLcf;)V")
    public final synchronized void method1604(byte arg0, class95 arg1) {
        this.field3593 = arg1;
        if (arg0 < -8) {
            field3587++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([II)V")
    private final void method1605(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class216.field3439) {
            var3 = arg1 << 1;
        }
        class158.method1179(arg0, 0, var3);
        this.field3607 -= arg1;
        if (this.field3593 != null && this.field3607 <= 0) {
            this.field3607 += class28.field329 >> 4;
            class49.method385(71, this.field3593);
            this.method1610(this.field3593, -110, this.field3593.method706());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class95 var10 = null;
                        class95 var11 = this.field3609[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class65 var12 = var11.field1408;
                                if (var12 == null || var12.field964 <= var8) {
                                    var11.field1410 = true;
                                    int var13 = var11.method253();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field964 += var13;
                                    }
                                    if (var4 >= this.field3577) {
                                        break label107;
                                    }
                                    class95 var14 = var11.method250();
                                    if (var14 != null) {
                                        int var15 = var11.field1407;
                                        while (var14 != null) {
                                            this.method1610(var14, -126, var15 * var14.method706() >> 8);
                                            var14 = var11.method249();
                                        }
                                    }
                                    class95 var16 = var11.field1409;
                                    var11.field1409 = null;
                                    if (var10 == null) {
                                        this.field3609[var7] = var16;
                                    } else {
                                        var10.field1409 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3603[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1409;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class95 var18 = this.field3609[var17];
                this.field3609[var17] = this.field3603[var17] = null;
                while (var18 != null) {
                    class95 var19 = var18.field1409;
                    var18.field1409 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3607 < 0) {
            this.field3607 = 0;
        }
        if (this.field3593 != null) {
            this.field3593.method248(arg0, 0, arg1);
        }
        this.field3579 = class197.method1454((byte) -104);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static void method1606(int arg0) {
        if (arg0 == 64) {
            field3583 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
    public final synchronized void method1607(byte arg0) {
        field3586++;
        if (class55.field801 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class55.field801.field1803[var3] == this) {
                    class55.field801.field1803[var3] = null;
                }
                if (class55.field801.field1803[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class55.field801.field1805 = true;
                while (class55.field801.field1796) {
                    class43.method324(50L, 41);
                }
                class55.field801 = null;
            }
        }
        if (arg0 != 106) {
            method1606(-7);
        }
        this.method286();
        this.field3580 = true;
        this.field3588 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()I")
    public int method287() throws Exception {
        field3578++;
        return this.field3601;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "()V")
    public void method290() throws Exception {
        field3585++;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "()V")
    public void method286() {
        field3594++;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public void method289(int arg0) throws Exception {
        field3584++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method288(Component arg0) throws Exception {
        field3581++;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "()V")
    public static final void method1608() {
        if (class205.field3288 != null) {
            for (int var0 = 0; var0 < class205.field3288.length; var0++) {
                for (int var1 = 0; var1 < class106.field1537; var1++) {
                    for (int var2 = 0; var2 < class232.field3724; var2++) {
                        class205.field3288[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class215.field3420 != null) {
            for (int var3 = 0; var3 < class215.field3420.length; var3++) {
                for (int var4 = 0; var4 < class106.field1537; var4++) {
                    for (int var5 = 0; var5 < class232.field3724; var5++) {
                        class215.field3420[var3][var4][var5] = null;
                    }
                }
            }
        }
        class191.field3083 = 0;
        if (class250.field4153 != null) {
            for (int var6 = 0; var6 < class191.field3083; var6++) {
                class250.field4153[var6] = null;
            }
        }
        if (class94.field1399 != null) {
            for (int var7 = 0; var7 < class29.field342; var7++) {
                class94.field1399[var7] = null;
            }
            class29.field342 = 0;
        }
        if (class297.field4705 != null) {
            for (int var8 = 0; var8 < class297.field4705.length; var8++) {
                class297.field4705[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    private final void method1609(int arg0, int arg1) {
        field3595++;
        this.field3607 -= arg1;
        if (this.field3607 < 0) {
            this.field3607 = 0;
        }
        if (arg0 != 20819) {
            this.method1605((int[]) null, -89);
        }
        if (this.field3593 != null) {
            this.field3593.method245(arg1);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lcf;II)V")
    private final void method1610(class95 arg0, int arg1, int arg2) {
        field3582++;
        int var4 = arg2 >> 5;
        class95 var5 = this.field3603[var4];
        if (var5 == null) {
            this.field3609[var4] = arg0;
        } else {
            var5.field1409 = arg0;
        }
        this.field3603[var4] = arg0;
        arg0.field1407 = arg2;
        if (arg1 > -72) {
            this.field3577 = 32;
        }
    }
}
