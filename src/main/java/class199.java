import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class199 {

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    private int field3590 = 32;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "J")
    private long field3577 = class118.method835(-1272);

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "Z")
    private boolean field3595 = true;

    @OriginalMember(owner = "client!kn", name = "E", descriptor = "J")
    private long field3599 = 0L;

    @OriginalMember(owner = "client!kn", name = "G", descriptor = "J")
    private long field3601 = 0L;

    @OriginalMember(owner = "client!kn", name = "C", descriptor = "[Lec;")
    private class40[] field3597 = new class40[8];

    @OriginalMember(owner = "client!kn", name = "F", descriptor = "I")
    private int field3600 = 0;

    @OriginalMember(owner = "client!kn", name = "H", descriptor = "I")
    private int field3602 = 0;

    @OriginalMember(owner = "client!kn", name = "B", descriptor = "I")
    private int field3596 = 0;

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "[Lec;")
    private class40[] field3605 = new class40[8];

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "I")
    private int field3604 = 0;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field3578 = 0;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "[Ljf;")
    public static class230[] field3586 = new class230[4];

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lsf;")
    public static class108 field3571 = class140.method973(255, "leuchten2:");

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "Lsf;")
    public static class108 field3569 = class140.method973(255, "violet:");

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
    public static int field3593 = 0;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "[I")
    public static int[] field3583 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!kn", name = "D", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
    public int field3603;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "I")
    private int field3606;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Lec;")
    private class40 field3573;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "[I")
    public int[] field3592;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILec;)V", line = 6)
    public final synchronized void method1402(int arg0, class40 arg1) {
        field3587++;
        if (arg0 >= -4) {
            this.field3603 = -111;
        }
        this.field3573 = arg1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 20)
    public final synchronized void method1403(byte arg0) {
        field3594++;
        this.field3595 = true;
        try {
            if (arg0 >= -39) {
                this.method1402(64, (class40) null);
            }
            this.method1136();
        } catch (Exception var3) {
            this.method1133();
            this.field3601 = class118.method835(-1272) + 2000L;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()V", line = 44)
    public void method1136() throws Exception {
        field3574++;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "()V", line = 53)
    public void method1133() {
        field3591++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lec;IZ)V", line = 62)
    private final void method1404(class40 arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        int var4 = arg1 >> 5;
        field3581++;
        class40 var5 = this.field3597[var4];
        if (var5 == null) {
            this.field3605[var4] = arg0;
        } else {
            var5.field553 = arg0;
        }
        this.field3597[var4] = arg0;
        arg0.field551 = arg1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 83)
    public void method1138(Component arg0) throws Exception {
        field3582++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 97)
    public final synchronized void method1405(int arg0) {
        field3579++;
        if (class92.field1448 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class92.field1448.field1834[var3] == this) {
                    class92.field1448.field1834[var3] = null;
                }
                if (class92.field1448.field1834[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class92.field1448.field1842 = true;
                while (class92.field1448.field1840) {
                    class83.method556(50L, 126);
                }
                class92.field1448 = null;
            }
        }
        this.method1133();
        this.field3592 = null;
        if (arg0 != -15908) {
            this.field3601 = 39L;
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V", line = 153)
    public final void method1406(byte arg0) {
        field3589++;
        this.field3595 = true;
        if (arg0 != 66) {
            this.method1133();
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "()I", line = 164)
    public int method1132() throws Exception {
        field3576++;
        return this.field3603;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V", line = 172)
    private final void method1407(int arg0, int arg1) {
        field3584++;
        if (arg1 > -37) {
            method1410(-112, -82, 80, -56);
        }
        this.field3596 -= arg0;
        if (this.field3596 < 0) {
            this.field3596 = 0;
        }
        if (this.field3573 != null) {
            this.field3573.method272(arg0);
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 190)
    public final synchronized void method1408(int arg0) {
        field3575++;
        if (this.field3592 == null) {
            return;
        }
        long var2 = class118.method835(-1272);
        try {
            if (arg0 <= 41) {
                return;
            }
            if (this.field3601 != 0L) {
                if (var2 < this.field3601) {
                    return;
                }
                this.method1135(this.field3603);
                this.field3601 = 0L;
                this.field3595 = true;
            }
            int var4 = this.method1132();
            if (this.field3602 < this.field3600 - var4) {
                this.field3602 = this.field3600 - var4;
            }
            int var5 = this.field3606 + this.field3598;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3603) {
                this.field3603 += 1024;
                var4 = 0;
                if (this.field3603 > 16384) {
                    this.field3603 = 16384;
                }
                this.method1133();
                this.method1135(this.field3603);
                if (this.field3603 < (var5 + 256)) {
                    var5 = this.field3603 - 256;
                    this.field3606 = var5 - this.field3598;
                }
                this.field3595 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method1409(this.field3592, 256);
                this.method1134();
            }
            if (this.field3599 < var2) {
                if (this.field3595) {
                    this.field3595 = false;
                } else if (this.field3602 == 0 && this.field3604 == 0) {
                    this.method1133();
                    this.field3601 = var2 + 2000L;
                    return;
                } else {
                    this.field3606 = Math.min(this.field3604, this.field3602);
                    this.field3604 = this.field3602;
                }
                this.field3602 = 0;
                this.field3599 = var2 + 2000L;
            }
            this.field3600 = var4;
        } catch (Exception var9) {
            this.method1133();
            this.field3601 = var2 + 2000L;
        }
        try {
            if (this.field3577 + 500000L < var2) {
                var2 = this.field3577;
            }
            while (var2 > (this.field3577 + 5000L)) {
                this.method1407(256, -94);
                this.field3577 += (long) (256000 / class210.field3755);
            }
        } catch (Exception var8) {
            this.field3577 = var2;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([II)V", line = 304)
    private final void method1409(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class10.field126) {
            var3 = arg1 << 1;
        }
        class23.method157(arg0, 0, var3);
        this.field3596 -= arg1;
        if (this.field3573 != null && this.field3596 <= 0) {
            this.field3596 += class210.field3755 >> 4;
            class182.method1315(this.field3573, 0);
            this.method1404(this.field3573, this.field3573.method274(), false);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class40 var10 = null;
                        class40 var11 = this.field3605[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class32 var12 = var11.field550;
                                if (var12 == null || var12.field454 <= var8) {
                                    var11.field552 = true;
                                    int var13 = var11.method275();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field454 += var13;
                                    }
                                    if (var4 >= this.field3590) {
                                        break label105;
                                    }
                                    class40 var14 = var11.method270();
                                    if (var14 != null) {
                                        int var15 = var11.field551;
                                        while (var14 != null) {
                                            this.method1404(var14, var15 * var14.method274() >> 8, false);
                                            var14 = var11.method276();
                                        }
                                    }
                                    class40 var16 = var11.field553;
                                    var11.field553 = null;
                                    if (var10 == null) {
                                        this.field3605[var7] = var16;
                                    } else {
                                        var10.field553 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3597[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field553;
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
                class40 var18 = this.field3605[var17];
                this.field3605[var17] = this.field3597[var17] = null;
                while (var18 != null) {
                    class40 var19 = var18.field553;
                    var18.field553 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3596 < 0) {
            this.field3596 = 0;
        }
        if (this.field3573 != null) {
            this.field3573.method271(arg0, 0, arg1);
        }
        this.field3577 = class118.method835(-1272);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)V", line = 468)
    public static final void method1410(int arg0, int arg1, int arg2, int arg3) {
        class74 var4 = class99.field1759[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class36 var5 = var4.field1140;
        if (var5 != null) {
            var5.field497 = var5.field497 * arg3 / 16;
            var5.field507 = var5.field507 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 482)
    public void method1135(int arg0) throws Exception {
        field3570++;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "()V", line = 499)
    public void method1134() throws Exception {
        field3572++;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)V", line = 507)
    public static void method1411(byte arg0) {
        field3571 = null;
        field3569 = null;
        field3583 = null;
        field3586 = null;
        if (arg0 != -38) {
            method1410(3, 12, -47, 11);
        }
    }
}
