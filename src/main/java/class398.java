import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class398 {

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    private int field5607 = 32;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "Z")
    private boolean field5621 = false;

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "J")
    private long field5618 = class479.method2864((byte) -112);

    @OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
    private int field5625 = 0;

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "J")
    private long field5627 = 0L;

    @OriginalMember(owner = "client!jba", name = "A", descriptor = "I")
    private int field5628 = 0;

    @OriginalMember(owner = "client!jba", name = "D", descriptor = "J")
    private long field5631 = 0L;

    @OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
    private int field5626 = 0;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "[Lpda;")
    private class629[] field5623 = new class629[8];

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "[Lpda;")
    private class629[] field5624 = new class629[8];

    @OriginalMember(owner = "client!jba", name = "B", descriptor = "I")
    private int field5629 = 0;

    @OriginalMember(owner = "client!jba", name = "C", descriptor = "Z")
    private boolean field5630 = true;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "Lqfa;")
    public static class98 field5614 = new class98(23, 0);

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
    public static int field5617 = 0;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!jba", name = "E", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!jba", name = "F", descriptor = "I")
    private int field5633;

    @OriginalMember(owner = "client!jba", name = "G", descriptor = "I")
    public int field5634;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "Lpda;")
    private class629 field5613;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "[I")
    public int[] field5603;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 6)
    public void method2021(Component arg0) throws Exception {
        field5620++;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "([II)V", line = 17)
    private final void method2483(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class673.field9127) {
            var3 = arg1 << 1;
        }
        class255.method1694(arg0, 0, var3);
        this.field5628 -= arg1;
        if (this.field5613 != null && this.field5628 <= 0) {
            this.field5628 += class68.field831 >> 4;
            class471.method2813((byte) 42, this.field5613);
            this.method2488(this.field5613.method2407(), false, this.field5613);
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
                        class629 var10 = null;
                        class629 var11 = this.field5623[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class632 var12 = var11.field8718;
                                if (var12 == null || var12.field8725 <= var8) {
                                    var11.field8719 = true;
                                    int var13 = var11.method1382();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8725 += var13;
                                    }
                                    if (var4 >= this.field5607) {
                                        break label107;
                                    }
                                    class629 var14 = var11.method1361();
                                    if (var14 != null) {
                                        int var15 = var11.field8717;
                                        while (var14 != null) {
                                            this.method2488(var15 * var14.method2407() >> 8, false, var14);
                                            var14 = var11.method1400();
                                        }
                                    }
                                    class629 var16 = var11.field8716;
                                    var11.field8716 = null;
                                    if (var10 == null) {
                                        this.field5623[var7] = var16;
                                    } else {
                                        var10.field8716 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5624[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field8716;
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
                class629 var18 = this.field5623[var17];
                this.field5623[var17] = this.field5624[var17] = null;
                while (var18 != null) {
                    class629 var19 = var18.field8716;
                    var18.field8716 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5628 < 0) {
            this.field5628 = 0;
        }
        if (this.field5613 != null) {
            this.field5613.method1378(arg0, 0, arg1);
        }
        this.field5618 = class479.method2864((byte) -123);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 176)
    public final synchronized void method2484(int arg0) {
        field5608++;
        if (this.field5621) {
            return;
        }
        long var2 = class479.method2864((byte) -79);
        try {
            if ((this.field5618 + 6000L) < var2) {
                this.field5618 = var2 - 6000L;
            }
            while ((this.field5618 + 5000L) < var2) {
                this.method2492(256, 1);
                this.field5618 += (256000 / class68.field831);
                var2 = class479.method2864((byte) -112);
            }
        } catch (Exception var7) {
            this.field5618 = var2;
        }
        if (this.field5603 == null) {
            return;
        }
        try {
            if (this.field5627 != 0L) {
                if (var2 < this.field5627) {
                    return;
                }
                this.method2020(this.field5634);
                this.field5627 = 0L;
                this.field5630 = true;
            }
            int var4 = this.method2017();
            if (arg0 != -8910) {
                this.field5628 = 80;
            }
            if ((this.field5629 - var4) > this.field5626) {
                this.field5626 = this.field5629 - var4;
            }
            int var5 = this.field5633 + this.field5632;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field5634 < (var5 + 256)) {
                this.field5634 += 1024;
                if (this.field5634 > 16384) {
                    this.field5634 = 16384;
                }
                this.method2019();
                var4 = 0;
                this.method2020(this.field5634);
                if (this.field5634 < (var5 + 256)) {
                    var5 = this.field5634 - 256;
                    this.field5633 = var5 - this.field5632;
                }
                this.field5630 = true;
            }
            while (var4 < var5) {
                this.method2483(this.field5603, 256);
                this.method2023();
                var4 += 256;
            }
            if (this.field5631 < var2) {
                if (this.field5630) {
                    this.field5630 = false;
                } else if (this.field5626 == 0 && this.field5625 == 0) {
                    this.method2019();
                    this.field5627 = var2 + 2000L;
                    return;
                } else {
                    this.field5633 = Math.min(this.field5625, this.field5626);
                    this.field5625 = this.field5626;
                }
                this.field5626 = 0;
                this.field5631 = var2 + 2000L;
            }
            this.field5629 = var4;
        } catch (Exception var6) {
            this.method2019();
            this.field5627 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)Z", line = 292)
    public static final boolean method2485(int arg0, int arg1, int arg2) {
        field5615++;
        if (arg2 != 0) {
            method2490((byte) -121);
        }
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V", line = 304)
    public final synchronized void method2486(int arg0) {
        this.field5630 = true;
        field5619++;
        try {
            this.method2022();
            if (arg0 != 12107) {
                this.method2484(104);
            }
        } catch (Exception var2) {
            this.method2019();
            this.field5627 = class479.method2864((byte) -50) + 2000L;
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)V", line = 330)
    public void method2020(int arg0) throws Exception {
        field5605++;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZ)Lve;", line = 337)
    public static final class503 method2487(int arg0, boolean arg1) {
        field5612++;
        class503 var2 = (class503) class298.field4204.method4022((long) arg0, (byte) 99);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class225.field3038.method2100(arg0, (byte) 112, 1);
        class503 var4 = new class503();
        var4.field7214 = arg0;
        if (var3 != null) {
            var4.method2984((byte) -56, new class675(var3));
        }
        var4.method2985((byte) 124);
        if (arg1) {
            method2490((byte) 7);
        }
        if (var4.field7211 == 2 && class611.field8577.method1180((byte) 26, (long) arg0) == null) {
            class611.field8577.method1179((long) arg0, new class756(class331.field4599), (byte) -26);
            class423.field5964[class331.field4599++] = var4;
        }
        class298.field4204.method4018((byte) 127, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "()V", line = 378)
    public void method2022() throws Exception {
        field5604++;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZLpda;)V", line = 385)
    private final void method2488(int arg0, boolean arg1, class629 arg2) {
        field5622++;
        int var4 = arg0 >> 5;
        class629 var5 = this.field5624[var4];
        if (var5 == null) {
            this.field5623[var4] = arg2;
        } else {
            var5.field8716 = arg2;
        }
        if (!arg1) {
            this.field5624[var4] = arg2;
            arg2.field8717 = arg0;
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "()I", line = 406)
    public int method2017() throws Exception {
        field5616++;
        return this.field5634;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V", line = 416)
    public final synchronized void method2489(byte arg0) {
        field5606++;
        if (class534.field7515 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class534.field7515.field7372[var3] == this) {
                    class534.field7515.field7372[var3] = null;
                }
                if (class534.field7515.field7372[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class534.field7515.field7374 = true;
                while (class534.field7515.field7369) {
                    class756.method4205(50L, 0);
                }
                class534.field7515 = null;
            }
        }
        this.method2019();
        this.field5603 = null;
        if (arg0 < -96) {
            this.field5621 = true;
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "()V", line = 464)
    public void method2019() {
        field5610++;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V", line = 476)
    public static void method2490(byte arg0) {
        if (arg0 >= -45) {
            field5617 = 67;
        }
        field5614 = null;
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "()V", line = 486)
    public void method2023() throws Exception {
        field5602++;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZLpda;)V", line = 497)
    public final synchronized void method2491(boolean arg0, class629 arg1) {
        this.field5613 = arg1;
        if (!arg0) {
            this.method2486(-34);
        }
        field5611++;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V", line = 514)
    private final void method2492(int arg0, int arg1) {
        field5609++;
        this.field5628 -= arg0;
        if (this.field5628 < 0) {
            this.field5628 = 0;
        }
        if (this.field5613 != null) {
            this.field5613.method1401(arg0);
        }
        if (arg1 != 1) {
            this.field5631 = 126L;
        }
    }
}
