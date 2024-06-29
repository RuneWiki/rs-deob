import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class202 {

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    private int field3511 = 32;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "J")
    private long field3501 = class231.method1513(50);

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    private int field3525 = 0;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    private int field3526 = 0;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "J")
    private long field3527 = 0L;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "Z")
    private boolean field3529 = true;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    private int field3533 = 0;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    private int field3531 = 0;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "J")
    private long field3530 = 0L;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[Lel;")
    private class203[] field3536 = new class203[8];

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "[Lel;")
    private class203[] field3534 = new class203[8];

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Loa;")
    public static class99 field3496 = class221.method1463(2844, "settings=");

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "Lwk;")
    public static class273 field3516 = new class273(50);

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "Loa;")
    public static class99 field3521 = class221.method1463(2844, "Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "Z")
    public static boolean field3524 = false;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    private int field3532;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lel;")
    private class203 field3509;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "[I")
    public int[] field3518;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([II)V")
    private final void method1356(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class85.field1468) {
            var3 = arg1 << 1;
        }
        class241.method1572(arg0, 0, var3);
        this.field3531 -= arg1;
        if (this.field3509 != null && this.field3531 <= 0) {
            this.field3531 += class225.field3905 >> 4;
            class160.method1086(this.field3509, (byte) -103);
            this.method1359(this.field3509, 19, this.field3509.method1369());
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
                        class203 var10 = null;
                        class203 var11 = this.field3536[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class114 var12 = var11.field3539;
                                if (var12 == null || var12.field2034 <= var8) {
                                    var11.field3540 = true;
                                    int var13 = var11.method144();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2034 += var13;
                                    }
                                    if (var4 >= this.field3511) {
                                        break label107;
                                    }
                                    class203 var14 = var11.method154();
                                    if (var14 != null) {
                                        int var15 = var11.field3537;
                                        while (var14 != null) {
                                            this.method1359(var14, 127, var15 * var14.method1369() >> 8);
                                            var14 = var11.method140();
                                        }
                                    }
                                    class203 var16 = var11.field3538;
                                    var11.field3538 = null;
                                    if (var10 == null) {
                                        this.field3536[var7] = var16;
                                    } else {
                                        var10.field3538 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3534[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3538;
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
                class203 var18 = this.field3536[var17];
                this.field3536[var17] = this.field3534[var17] = null;
                while (var18 != null) {
                    class203 var19 = var18.field3538;
                    var18.field3538 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3531 < 0) {
            this.field3531 = 0;
        }
        if (this.field3509 != null) {
            this.field3509.method159(arg0, 0, arg1);
        }
        this.field3501 = class231.method1513(-117);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    private final void method1357(int arg0, int arg1) {
        field3506++;
        this.field3531 -= arg0;
        if (this.field3531 < arg1) {
            this.field3531 = 0;
        }
        if (this.field3509 != null) {
            this.field3509.method177(arg0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Loa;ILik;)I")
    public static final int method1358(class99 arg0, int arg1, class261 arg2) {
        int var3 = arg2.field4587;
        arg2.method1708(arg0.field1682, arg1 + 27);
        field3512++;
        arg2.field4587 += class252.field4360.method1472((byte) -54, arg2.field4619, arg0.field1697, arg1, arg2.field4587, arg0.field1682);
        return arg2.field4587 - var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lel;II)V")
    private final void method1359(class203 arg0, int arg1, int arg2) {
        field3503++;
        int var4 = arg2 >> 5;
        class203 var5 = this.field3534[var4];
        if (var5 == null) {
            this.field3536[var4] = arg0;
        } else {
            var5.field3538 = arg0;
        }
        this.field3534[var4] = arg0;
        arg0.field3537 = arg2;
        int var6 = 55 % ((78 - arg1) / 48);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
    public void method1177() {
        field3507++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public final synchronized void method1360(int arg0) {
        field3502++;
        if (arg0 != 9754) {
            this.method1367(-52);
        }
        this.field3529 = true;
        try {
            this.method1181();
        } catch (Exception var2) {
            this.method1177();
            this.field3527 = class231.method1513(-64) + 2000L;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)I")
    public static final int method1361(int arg0, int arg1) {
        if (arg0 != 0) {
            method1364((class182) null, -38, (class182) null);
        }
        field3504++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
    public static final int method1362(int arg0, int arg1, int arg2) {
        int var3 = 103 % ((-arg0 - 67) / 33);
        field3505++;
        class9 var4 = (class9) class277.field4868.method1550(true, (long) arg1);
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var4.field69.length) {
            return var4.field69[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public final synchronized void method1363(byte arg0) {
        if (class143.field2517 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class143.field2517.field3659[var3] == this) {
                    class143.field2517.field3659[var3] = null;
                }
                if (class143.field2517.field3659[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class143.field2517.field3658 = true;
                while (class143.field2517.field3662) {
                    class100.method711(0, 50L);
                }
                class143.field2517 = null;
            }
        }
        int var4 = -55 / ((arg0 + 59) / 61);
        field3517++;
        this.method1177();
        this.field3518 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ltg;ILtg;)I")
    public static final int method1364(class182 arg0, int arg1, class182 arg2) {
        field3497++;
        int var3 = 0;
        if (arg2.method1229(class168.field2996, -1)) {
            var3++;
        }
        if (arg1 != 50) {
            return 102;
        }
        if (arg2.method1229(class215.field3733, arg1 ^ 0xFFFFFFCD)) {
            var3++;
        }
        if (arg2.method1229(class280.field4914, -1)) {
            var3++;
        }
        if (arg0.method1229(class168.field2996, -1)) {
            var3++;
        }
        if (arg0.method1229(class215.field3733, -1)) {
            var3++;
        }
        if (arg0.method1229(class280.field4914, -1)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public void method1176(int arg0) throws Exception {
        field3520++;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()I")
    public int method1180() throws Exception {
        field3500++;
        return this.field3528;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static void method1365(byte arg0) {
        field3521 = null;
        field3516 = null;
        field3496 = null;
        if (arg0 >= -74) {
            method1358((class99) null, -66, (class261) null);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lel;I)V")
    public final synchronized void method1366(class203 arg0, int arg1) {
        field3510++;
        if (arg1 == 31115) {
            this.field3509 = arg0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()V")
    public void method1179() throws Exception {
        field3513++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1182(Component arg0) throws Exception {
        field3499++;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    public final void method1367(int arg0) {
        field3514++;
        if (arg0 != 0) {
            this.field3535 = -35;
        }
        this.field3529 = true;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public final synchronized void method1368(boolean arg0) {
        field3508++;
        if (this.field3518 == null) {
            return;
        }
        long var2 = class231.method1513(-59);
        try {
            if (this.field3527 != 0L) {
                if (var2 < this.field3527) {
                    return;
                }
                this.method1176(this.field3528);
                this.field3529 = true;
                this.field3527 = 0L;
            }
            int var4 = this.method1180();
            if ((this.field3533 - var4) > this.field3526) {
                this.field3526 = this.field3533 - var4;
            }
            int var5 = this.field3535 + this.field3532;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field3528 < var5 + 256) {
                this.field3528 += 1024;
                var4 = 0;
                if (this.field3528 > 16384) {
                    this.field3528 = 16384;
                }
                this.method1177();
                this.method1176(this.field3528);
                this.field3529 = true;
                if (var5 + 256 > this.field3528) {
                    var5 = this.field3528 - 256;
                    this.field3532 = var5 - this.field3535;
                }
            }
            while (var5 > var4) {
                this.method1356(this.field3518, 256);
                var4 += 256;
                this.method1179();
            }
            if (var2 > this.field3530) {
                if (this.field3529) {
                    this.field3529 = false;
                } else if (this.field3526 == 0 && this.field3525 == 0) {
                    this.method1177();
                    this.field3527 = var2 + 2000L;
                    return;
                } else {
                    this.field3532 = Math.min(this.field3525, this.field3526);
                    this.field3525 = this.field3526;
                }
                this.field3530 = var2 + 2000L;
                this.field3526 = 0;
            }
            this.field3533 = var4;
        } catch (Exception var7) {
            this.method1177();
            this.field3527 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field3501 + 500000L)) {
                var2 = this.field3501;
            }
            if (!arg0) {
                this.method1356((int[]) null, -55);
            }
            while (var2 > (this.field3501 + 5000L)) {
                this.method1357(256, 0);
                this.field3501 += (long) (256000 / class225.field3905);
            }
        } catch (Exception var6) {
            this.field3501 = var2;
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()V")
    public void method1181() throws Exception {
        field3498++;
    }
}
