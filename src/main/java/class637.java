import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class637 {

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
    private int field8830 = 32;

    @OriginalMember(owner = "client!jca", name = "s", descriptor = "Z")
    private boolean field8834 = false;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "J")
    private long field8819 = class577.method3295((byte) 15);

    @OriginalMember(owner = "client!jca", name = "u", descriptor = "J")
    private long field8836 = 0L;

    @OriginalMember(owner = "client!jca", name = "w", descriptor = "Z")
    private boolean field8838 = true;

    @OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
    private int field8840 = 0;

    @OriginalMember(owner = "client!jca", name = "B", descriptor = "I")
    private int field8843 = 0;

    @OriginalMember(owner = "client!jca", name = "A", descriptor = "I")
    private int field8842 = 0;

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
    private int field8841 = 0;

    @OriginalMember(owner = "client!jca", name = "C", descriptor = "[Ljc;")
    private class404[] field8844 = new class404[8];

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "J")
    private long field8846 = 0L;

    @OriginalMember(owner = "client!jca", name = "x", descriptor = "[Ljc;")
    private class404[] field8839 = new class404[8];

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!jca", name = "q", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!jca", name = "r", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!jca", name = "t", descriptor = "I")
    public int field8835;

    @OriginalMember(owner = "client!jca", name = "v", descriptor = "I")
    private int field8837;

    @OriginalMember(owner = "client!jca", name = "D", descriptor = "I")
    public int field8845;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "Ljc;")
    private class404 field8824;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "[I")
    public int[] field8821;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljc;I)V")
    public final synchronized void method3554(class404 arg0, int arg1) {
        this.field8824 = arg0;
        if (arg1 != 4) {
            this.field8843 = -65;
        }
        field8828++;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public final synchronized void method3555(int arg0) {
        this.field8838 = true;
        field8817++;
        try {
            this.method833();
            if (arg0 != 383) {
                this.field8839 = null;
            }
        } catch (Exception var2) {
            this.method830();
            this.field8836 = class577.method3295((byte) 15) + 2000L;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "()V")
    public void method835() throws Exception {
        field8816++;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
    public final synchronized void method3556(int arg0) {
        field8829++;
        if (class197.field2756 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class197.field2756.field25[var3] == this) {
                    class197.field2756.field25[var3] = null;
                }
                if (class197.field2756.field25[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class197.field2756.field27 = true;
                while (class197.field2756.field24) {
                    class519.method2960(-52, 50L);
                }
                class197.field2756 = null;
            }
        }
        this.method830();
        if (arg0 >= -59) {
            this.method3555(-29);
        }
        this.field8834 = true;
        this.field8821 = null;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "()V")
    public void method833() throws Exception {
        field8825++;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
    public final synchronized void method3557(byte arg0) {
        field8831++;
        if (this.field8834) {
            return;
        }
        if (arg0 != -101) {
            this.method3555(96);
        }
        long var2 = class577.method3295((byte) 15);
        try {
            if (var2 > (this.field8819 + 500000L)) {
                this.field8819 = var2 - 500000L;
            }
            while (this.field8819 + 5000L < var2) {
                this.method3558(68, 256);
                this.field8819 += (256000 / class357.field4736);
            }
        } catch (Exception var7) {
            this.field8819 = var2;
        }
        if (this.field8821 == null) {
            return;
        }
        try {
            if (this.field8836 != 0L) {
                if (this.field8836 > var2) {
                    return;
                }
                this.method836(this.field8835);
                this.field8838 = true;
                this.field8836 = 0L;
            }
            int var4 = this.method831();
            if (this.field8843 < (this.field8841 - var4)) {
                this.field8843 = this.field8841 - var4;
            }
            int var5 = this.field8845 + this.field8837;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field8835) {
                this.field8835 += 1024;
                if (this.field8835 > 16384) {
                    this.field8835 = 16384;
                }
                this.method830();
                this.method836(this.field8835);
                var4 = 0;
                if (var5 + 256 > this.field8835) {
                    var5 = this.field8835 - 256;
                    this.field8837 = var5 - this.field8845;
                }
                this.field8838 = true;
            }
            while (var4 < var5) {
                this.method3560(this.field8821, 256);
                this.method835();
                var4 += 256;
            }
            if (this.field8846 < var2) {
                if (this.field8838) {
                    this.field8838 = false;
                } else if (this.field8843 == 0 && this.field8840 == 0) {
                    this.method830();
                    this.field8836 = var2 + 2000L;
                    return;
                } else {
                    this.field8837 = Math.min(this.field8840, this.field8843);
                    this.field8840 = this.field8843;
                }
                this.field8843 = 0;
                this.field8846 = var2 + 2000L;
            }
            this.field8841 = var4;
        } catch (Exception var6) {
            this.method830();
            this.field8836 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "()V")
    public void method830() {
        field8832++;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
    private final void method3558(int arg0, int arg1) {
        this.field8842 -= arg1;
        if (arg0 < 42) {
            return;
        }
        field8826++;
        if (this.field8842 < 0) {
            this.field8842 = 0;
        }
        if (this.field8824 != null) {
            this.field8824.method1460(arg1);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZLjc;)V")
    private final void method3559(int arg0, boolean arg1, class404 arg2) {
        if (arg1) {
            this.method3554(null, -24);
        }
        field8827++;
        int var4 = arg0 >> 5;
        class404 var5 = this.field8839[var4];
        if (var5 == null) {
            this.field8844[var4] = arg2;
        } else {
            var5.field5673 = arg2;
        }
        this.field8839[var4] = arg2;
        arg2.field5674 = arg0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method834(Component arg0) throws Exception {
        field8823++;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "([II)V")
    private final void method3560(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class506.field6945) {
            var3 = arg1 << 1;
        }
        class359.method2056(arg0, 0, var3);
        this.field8842 -= arg1;
        if (this.field8824 != null && this.field8842 <= 0) {
            this.field8842 += class357.field4736 >> 4;
            class268.method1629(-126, this.field8824);
            this.method3559(this.field8824.method2357(), false, this.field8824);
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
                        class404 var10 = null;
                        class404 var11 = this.field8844[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class395 var12 = var11.field5672;
                                if (var12 == null || var12.field5575 <= var8) {
                                    var11.field5675 = true;
                                    int var13 = var11.method1465();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field5575 += var13;
                                    }
                                    if (var4 >= this.field8830) {
                                        break label107;
                                    }
                                    class404 var14 = var11.method1457();
                                    if (var14 != null) {
                                        int var15 = var11.field5674;
                                        while (var14 != null) {
                                            this.method3559(var15 * var14.method2357() >> 8, false, var14);
                                            var14 = var11.method1466();
                                        }
                                    }
                                    class404 var16 = var11.field5673;
                                    var11.field5673 = null;
                                    if (var10 == null) {
                                        this.field8844[var7] = var16;
                                    } else {
                                        var10.field5673 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field8839[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5673;
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
                class404 var18 = this.field8844[var17];
                this.field8844[var17] = this.field8839[var17] = null;
                while (var18 != null) {
                    class404 var19 = var18.field5673;
                    var18.field5673 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field8842 < 0) {
            this.field8842 = 0;
        }
        if (this.field8824 != null) {
            this.field8824.method1469(arg0, 0, arg1);
        }
        this.field8819 = class577.method3295((byte) 15);
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)V")
    public static final void method3561(int arg0) {
        field8822++;
        for (int var1 = 0; var1 < 5; var1++) {
            class524.field7115[var1] = false;
        }
        class552.field7454 = arg0;
        class412.field5849 = -1;
        class124.field1786 = class186.field2697;
        class560.field7547 = -1;
        class199.field2832 = -1;
        class366.field4864 = 0;
        class622.field8636 = class11.field114;
        class444.field6145 = class441.field6102;
        class91.field1311 = class666.field9335;
        class567.field7998 = class41.field475;
        class59.field665 = class685.field9771;
        class133.field1902 = 0;
        class203.field2863 = 5;
    }

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "()I")
    public int method831() throws Exception {
        field8820++;
        return this.field8835;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3562(int arg0, int arg1, byte arg2) {
        field8818++;
        if (arg2 == -128) {
            return class665.method3760(arg0, arg1, 3553) || class538.method3045(arg0, arg1, (byte) -113);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)V")
    public void method836(int arg0) throws Exception {
        field8833++;
    }
}
