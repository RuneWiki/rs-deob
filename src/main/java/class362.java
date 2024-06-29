import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class362 {

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
    public boolean field5606 = true;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public int field5607 = -1;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    private int field5604 = 0;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public int field5616 = 128;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "Ljb;")
    public static class499 field5615 = null;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Lsi;")
    public static class512 field5611 = new class512(5, 18);

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "Lgl;")
    public static class432 field5617 = new class432("", 11);

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "S")
    public static short field5618 = 205;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public int field5602;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public int field5603;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public int field5612;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public int field5614;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ltl;IB)V", line = 9)
    private final void method2286(class91 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field5604 = arg0.method641(32455);
            this.method2290(this.field5604, (byte) -83);
        } else if (arg1 == 2) {
            this.field5607 = arg0.method631(10494);
            if (this.field5607 == 65535) {
                this.field5607 = -1;
            }
        } else if (arg1 == 3) {
            this.field5616 = arg0.method631(10494) << 0;
        } else if (arg1 == 4) {
            this.field5606 = false;
        }
        field5609++;
        if (arg2 != -106) {
            field5618 = -22;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ltl;I)V", line = 50)
    public final void method2287(class91 arg0, int arg1) {
        if (arg1 != -1) {
            this.method2290(-97, (byte) -95);
        }
        field5613++;
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                return;
            }
            this.method2286(arg0, var3, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 70)
    public static final void method2288(int arg0) {
        field5608++;
        if (class329.field5062 == -1) {
            return;
        }
        int var1 = class346.field5419.method812(false);
        int var2 = class346.field5419.method811(false);
        class414 var3 = (class414) class94.field1369.method1970(64);
        if (var3 != null) {
            var1 = var3.method717(arg0 + 18591);
            var2 = var3.method712(35);
        }
        class153.method999(var1, 0, 0, class329.field5062, var2, class486.field7136, class7.field112, arg0, 0, 0);
        if (class217.field3009 != null) {
            class473.method2839(var1, var2, true);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 107)
    public static void method2289(int arg0) {
        field5611 = null;
        int var1 = -15 / ((-arg0 - 81) / 40);
        field5615 = null;
        field5617 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V", line = 118)
    private final void method2290(int arg0, byte arg1) {
        field5605++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF69) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (arg1 >= -78) {
            this.method2290(-98, (byte) 118);
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field5603 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field5612 = (int) (var17 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field5602 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5602 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5603 < 0) {
            this.field5603 = 0;
        } else if (this.field5603 > 255) {
            this.field5603 = 255;
        }
        if (this.field5612 < 0) {
            this.field5612 = 0;
        } else if (this.field5612 > 255) {
            this.field5612 = 255;
        }
        if (this.field5602 < 1) {
            this.field5602 = 1;
        }
        this.field5614 = (int) ((double) this.field5602 * var19);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lco;IIIII)V", line = 212)
    public static final void method2291(class442 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6569 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class467.field6805[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class138 var13 = class515.field7632[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field6569; var14++) {
                            if (arg0.field6567[var14] == var13.field2020) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field6567[arg0.field6569++] = var13.field2020;
                        if (arg0.field6569 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field6569; var15 < 4; var15++) {
            arg0.field6567[var15] = null;
        }
    }
}
