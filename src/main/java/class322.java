import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class322 {

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    private int field4739 = 32;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "Z")
    private boolean field4745 = false;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "J")
    private long field4743 = class490.method2840(true);

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "J")
    private long field4751 = 0L;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "[Lpda;")
    private class582[] field4753 = new class582[8];

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "Z")
    private boolean field4749 = true;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    private int field4756 = 0;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    private int field4755 = 0;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "[Lpda;")
    private class582[] field4754 = new class582[8];

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "J")
    private long field4758 = 0L;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    private int field4759 = 0;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    private int field4757 = 0;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    private int field4748;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public int field4750;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "Lbd;")
    public static class56 field4740;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "Lpda;")
    private class582 field4746;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "[I")
    public int[] field4737;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "()V")
    public void method1398() throws Exception {
        field4731++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILpda;B)V")
    private final void method2010(int arg0, class582 arg1, byte arg2) {
        field4738++;
        int var4 = arg0 >> 5;
        class582 var5 = this.field4754[var4];
        if (var5 == null) {
            this.field4753[var4] = arg1;
        } else {
            var5.field8190 = arg1;
        }
        this.field4754[var4] = arg1;
        if (arg2 >= -49) {
            method2017(94, -46, -105);
        }
        arg1.field8191 = arg0;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "()I")
    public int method1396() throws Exception {
        field4735++;
        return this.field4752;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)V")
    public static final void method2011(int arg0, int arg1, int arg2) {
        field4741++;
        int var3 = 9 / ((arg2 - 42) / 37);
        if (class673.field9519 == class586.field8208) {
            if (!class229.method1580(arg1, 1, -2, arg0, false, 1, 0, (byte) 51, 0)) {
                class229.method1580(arg1, 1, -3, arg0, false, 1, 0, (byte) 51, 0);
            }
        } else if (!class229.method1580(arg1, 1, -3, arg0, false, 1, 0, (byte) 51, 0)) {
            class229.method1580(arg1, 1, -2, arg0, false, 1, 0, (byte) 51, 0);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public final synchronized void method2012(byte arg0) {
        if (class109.field1676 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class109.field1676.field7562[var3] == this) {
                    class109.field1676.field7562[var3] = null;
                }
                if (class109.field1676.field7562[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class109.field1676.field7564 = true;
                while (class109.field1676.field7561) {
                    class561.method3202(50L, (byte) -84);
                }
                class109.field1676 = null;
            }
        }
        field4736++;
        if (arg0 >= -91) {
            this.method2010(86, null, (byte) -72);
        }
        this.method1397();
        this.field4745 = true;
        this.field4737 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public final synchronized void method2013(int arg0) {
        this.field4749 = true;
        field4742++;
        try {
            int var2 = 117 / ((arg0 - 74) / 49);
            this.method1398();
        } catch (Exception var3) {
            this.method1397();
            this.field4758 = class490.method2840(true) + 2000L;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILpda;)V")
    public final synchronized void method2014(int arg0, class582 arg1) {
        int var3 = -6 / ((arg0 + 20) / 58);
        this.field4746 = arg1;
        field4727++;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "()V")
    public void method1395() throws Exception {
        field4732++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2015(int arg0, boolean arg1) {
        field4729++;
        for (class279 var2 = (class279) class663.field9367.method472((byte) -84); var2 != null; var2 = (class279) class663.field9367.method482(123)) {
            if (class656.method3612(var2.field4213, (byte) -81) && ((long) arg0) == var2.field4208) {
                return true;
            }
        }
        if (arg1) {
            field4740 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "()V")
    public void method1397() {
        field4734++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1399(Component arg0) throws Exception {
        field4730++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)V")
    private final void method2016(int arg0, byte arg1) {
        if (arg1 != -36) {
            this.field4757 = 64;
        }
        this.field4756 -= arg0;
        field4728++;
        if (this.field4756 < 0) {
            this.field4756 = 0;
        }
        if (this.field4746 != null) {
            this.field4746.method386(arg0);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method2017(int arg0, int arg1, int arg2) {
        field4733++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg1 != 12858) {
                field4740 = null;
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static void method2018(int arg0) {
        if (arg0 != -15651) {
            field4740 = null;
        }
        field4740 = null;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
    public void method1400(int arg0) throws Exception {
        field4747++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([II)V")
    private final void method2019(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class22.field297) {
            var3 = arg1 << 1;
        }
        class476.method2789(arg0, 0, var3);
        this.field4756 -= arg1;
        if (this.field4746 != null && this.field4756 <= 0) {
            this.field4756 += class465.field6683 >> 4;
            class373.method2254(0, this.field4746);
            this.method2010(this.field4746.method3160(), this.field4746, (byte) -58);
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
                        class582 var10 = null;
                        class582 var11 = this.field4753[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class288 var12 = var11.field8193;
                                if (var12 == null || var12.field4281 <= var8) {
                                    var11.field8192 = true;
                                    int var13 = var11.method406();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4281 += var13;
                                    }
                                    if (var4 >= this.field4739) {
                                        break label107;
                                    }
                                    class582 var14 = var11.method397();
                                    if (var14 != null) {
                                        int var15 = var11.field8191;
                                        while (var14 != null) {
                                            this.method2010(var15 * var14.method3160() >> 8, var14, (byte) -77);
                                            var14 = var11.method403();
                                        }
                                    }
                                    class582 var16 = var11.field8190;
                                    var11.field8190 = null;
                                    if (var10 == null) {
                                        this.field4753[var7] = var16;
                                    } else {
                                        var10.field8190 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4754[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field8190;
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
                class582 var18 = this.field4753[var17];
                this.field4753[var17] = this.field4754[var17] = null;
                while (var18 != null) {
                    class582 var19 = var18.field8190;
                    var18.field8190 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4756 < 0) {
            this.field4756 = 0;
        }
        if (this.field4746 != null) {
            this.field4746.method373(arg0, 0, arg1);
        }
        this.field4743 = class490.method2840(true);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
    public final synchronized void method2020(byte arg0) {
        field4744++;
        if (this.field4745) {
            return;
        }
        long var2 = class490.method2840(true);
        try {
            if (this.field4743 + 500000L < var2) {
                this.field4743 = var2 - 500000L;
            }
            while ((this.field4743 + 5000L) < var2) {
                this.method2016(256, (byte) -36);
                this.field4743 += (256000 / class465.field6683);
            }
        } catch (Exception var8) {
            this.field4743 = var2;
        }
        if (this.field4737 == null) {
            return;
        }
        try {
            if (this.field4758 != 0L) {
                if (this.field4758 > var2) {
                    return;
                }
                this.method1400(this.field4752);
                this.field4758 = 0L;
                this.field4749 = true;
            }
            int var4 = this.method1396();
            int var5 = -48 / ((6 - arg0) / 56);
            if (this.field4759 - var4 > this.field4757) {
                this.field4757 = this.field4759 - var4;
            }
            int var6 = this.field4750 + this.field4748;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (this.field4752 < var6 + 256) {
                this.field4752 += 1024;
                if (this.field4752 > 16384) {
                    this.field4752 = 16384;
                }
                this.method1397();
                var4 = 0;
                this.method1400(this.field4752);
                if ((var6 + 256) > this.field4752) {
                    var6 = this.field4752 - 256;
                    this.field4748 = var6 - this.field4750;
                }
                this.field4749 = true;
            }
            while (var6 > var4) {
                this.method2019(this.field4737, 256);
                var4 += 256;
                this.method1395();
            }
            if (this.field4751 < var2) {
                if (this.field4749) {
                    this.field4749 = false;
                } else if (this.field4757 == 0 && this.field4755 == 0) {
                    this.method1397();
                    this.field4758 = var2 + 2000L;
                    return;
                } else {
                    this.field4748 = Math.min(this.field4755, this.field4757);
                    this.field4755 = this.field4757;
                }
                this.field4757 = 0;
                this.field4751 = var2 + 2000L;
            }
            this.field4759 = var4;
        } catch (Exception var7) {
            this.method1397();
            this.field4758 = var2 + 2000L;
        }
    }
}
