import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class41 {

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    private int field593 = 32;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "Z")
    private boolean field610 = false;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "J")
    private long field614 = class742.method4128(1);

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "J")
    private long field616 = 0L;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "J")
    private long field622 = 0L;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "[Lep;")
    private class418[] field618 = new class418[8];

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    private int field624 = 0;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    private int field620 = 0;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "[Lep;")
    private class418[] field621 = new class418[8];

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "Z")
    private boolean field625 = true;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    private int field626 = 0;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    private int field627 = 0;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "Lqaa;")
    public static class27 field608 = new class27(36, 4);

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "Lep;")
    private class418 field605;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "[I")
    public static int[] field598;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "[I")
    public int[] field609;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "()V", line = 3)
    public void method364() {
        field615++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZ)V", line = 12)
    public static final void method365(int arg0, int arg1, boolean arg2) {
        field602++;
        if (arg2) {
            return;
        }
        class154 var3 = class359.field5033[arg1][arg0];
        if (var3 != null) {
            class537.field7566 = var3.field2317;
            class57.field1063 = var3.field2323;
            class254.field3691 = var3.field2312;
        }
        class430.method2613(72);
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "()I", line = 33)
    public int method366() throws Exception {
        field606++;
        return this.field623;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 41)
    public void method367(Component arg0) throws Exception {
        field601++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V", line = 48)
    public static final void method368(int arg0) {
        field597++;
        if (class42.field643 <= arg0) {
            class718.field10065 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class748.field10459.length; var2++) {
            if (class748.field10459[var2].indexOf("--> ") != -1) {
                var1++;
                if (class42.field643 == var1) {
                    class718.field10065 = class748.field10459[var2].substring(class748.field10459[var2].indexOf(">") + 2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 80)
    public static void method369(int arg0) {
        field608 = null;
        field598 = null;
        if (arg0 != 4584) {
            field598 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "()V", line = 93)
    public void method370() throws Exception {
        field612++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V", line = 103)
    private final void method371(int arg0, int arg1) {
        this.field627 -= arg0;
        field607++;
        if (arg1 < 16) {
            return;
        }
        if (this.field627 < 0) {
            this.field627 = 0;
        }
        if (this.field605 != null) {
            this.field605.method1663(arg0);
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V", line = 121)
    public void method372(int arg0) throws Exception {
        field596++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 129)
    public final synchronized void method373(byte arg0) {
        if (arg0 <= 57) {
            field598 = null;
        }
        field604++;
        if (class638.field9102 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class638.field9102.field2491[var3] == this) {
                    class638.field9102.field2491[var3] = null;
                }
                if (class638.field9102.field2491[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class638.field9102.field2490 = true;
                while (class638.field9102.field2487) {
                    class246.method1639(50L, (byte) -74);
                }
                class638.field9102 = null;
            }
        }
        this.method364();
        this.field610 = true;
        this.field609 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILep;B)V", line = 175)
    private final void method374(int arg0, class418 arg1, byte arg2) {
        if (arg2 >= -98) {
            this.field623 = 57;
        }
        field611++;
        int var4 = arg0 >> 5;
        class418 var5 = this.field618[var4];
        if (var5 == null) {
            this.field621[var4] = arg1;
        } else {
            var5.field5866 = arg1;
        }
        this.field618[var4] = arg1;
        arg1.field5864 = arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLep;)V", line = 199)
    public final synchronized void method375(boolean arg0, class418 arg1) {
        field603++;
        if (!arg0) {
            this.field605 = arg1;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V", line = 214)
    public final synchronized void method376(byte arg0) {
        field613++;
        if (this.field610) {
            return;
        }
        long var2 = class742.method4128(1);
        try {
            if ((this.field614 + 6000L) < var2) {
                this.field614 = var2 - 6000L;
            }
            while ((this.field614 + 5000L) < var2) {
                this.method371(256, 44);
                this.field614 += (256000 / class215.field3077);
                var2 = class742.method4128(1);
            }
        } catch (Exception var8) {
            this.field614 = var2;
        }
        if (this.field609 == null) {
            return;
        }
        try {
            if (this.field622 != 0L) {
                if (this.field622 > var2) {
                    return;
                }
                this.method372(this.field623);
                this.field625 = true;
                this.field622 = 0L;
            }
            int var4 = this.method366();
            if (this.field626 - var4 > this.field620) {
                this.field620 = this.field626 - var4;
            }
            int var5 = this.field619 + this.field617;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field623) {
                this.field623 += 1024;
                if (this.field623 > 16384) {
                    this.field623 = 16384;
                }
                this.method364();
                var4 = 0;
                this.method372(this.field623);
                this.field625 = true;
                if (this.field623 < var5 + 256) {
                    var5 = this.field623 - 256;
                    this.field617 = var5 - this.field619;
                }
            }
            int var6 = -4 / ((arg0 + 5) / 42);
            while (var5 > var4) {
                this.method377(this.field609, 256);
                var4 += 256;
                this.method370();
            }
            if (var2 > this.field616) {
                if (this.field625) {
                    this.field625 = false;
                } else if (this.field620 == 0 && this.field624 == 0) {
                    this.method364();
                    this.field622 = var2 + 2000L;
                    return;
                } else {
                    this.field617 = Math.min(this.field624, this.field620);
                    this.field624 = this.field620;
                }
                this.field616 = var2 + 2000L;
                this.field620 = 0;
            }
            this.field626 = var4;
        } catch (Exception var7) {
            this.method364();
            this.field622 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([II)V", line = 338)
    private final void method377(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class390.field5446) {
            var3 = arg1 << 1;
        }
        class622.method3598(arg0, 0, var3);
        this.field627 -= arg1;
        if (this.field605 != null && this.field627 <= 0) {
            this.field627 += class215.field3077 >> 4;
            class405.method2490(113, this.field605);
            this.method374(this.field605.method1908(), this.field605, (byte) -104);
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
                        class418 var10 = null;
                        class418 var11 = this.field621[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class450 var12 = var11.field5865;
                                if (var12 == null || var12.field6226 <= var8) {
                                    var11.field5863 = true;
                                    int var13 = var11.method1673();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field6226 += var13;
                                    }
                                    if (var4 >= this.field593) {
                                        break label107;
                                    }
                                    class418 var14 = var11.method1696();
                                    if (var14 != null) {
                                        int var15 = var11.field5864;
                                        while (var14 != null) {
                                            this.method374(var15 * var14.method1908() >> 8, var14, (byte) -115);
                                            var14 = var11.method1693();
                                        }
                                    }
                                    class418 var16 = var11.field5866;
                                    var11.field5866 = null;
                                    if (var10 == null) {
                                        this.field621[var7] = var16;
                                    } else {
                                        var10.field5866 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field618[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5866;
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
                class418 var18 = this.field621[var17];
                this.field621[var17] = this.field618[var17] = null;
                while (var18 != null) {
                    class418 var19 = var18.field5866;
                    var18.field5866 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field627 < 0) {
            this.field627 = 0;
        }
        if (this.field605 != null) {
            this.field605.method1687(arg0, 0, arg1);
        }
        this.field614 = class742.method4128(1);
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V", line = 496)
    public final synchronized void method378(int arg0) {
        if (arg0 > -5) {
            this.field609 = null;
        }
        this.field625 = true;
        field599++;
        try {
            this.method380();
        } catch (Exception var2) {
            this.method364();
            this.field622 = class742.method4128(1) + 2000L;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II[BIILoea;ZI)Lm;", line = 520)
    public static final class189 method379(int arg0, int arg1, byte[] arg2, int arg3, int arg4, class594 arg5, boolean arg6, int arg7) {
        field595++;
        if (arg7 != 3553) {
            method379(-52, 126, null, -21, -64, null, false, 106);
        }
        if (!arg5.field8644 && (!class278.method1826((byte) 115, arg3) || !class278.method1826((byte) 118, arg4))) {
            return arg5.field8587 ? new class189(arg5, 34037, arg1, arg3, arg4, arg6, arg2, arg0) : new class189(arg5, arg1, arg3, arg4, class613.method3530(false, arg3), class613.method3530(false, arg4), arg2, arg0);
        } else {
            return new class189(arg5, 3553, arg1, arg3, arg4, arg6, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "()V", line = 542)
    public void method380() throws Exception {
        field594++;
    }
}
