import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class192 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    private int field2762 = 32;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
    private boolean field2757 = false;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "J")
    private long field2765 = class199.method1372(30938);

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "[Lrb;")
    private class425[] field2783 = new class425[8];

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "J")
    private long field2781 = 0L;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "J")
    private long field2785 = 0L;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "Z")
    private boolean field2786 = true;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    private int field2787 = 0;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    private int field2789 = 0;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    private int field2791 = 0;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    private int field2790 = 0;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "[Lrb;")
    private class425[] field2792 = new class425[8];

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[S")
    public static short[] field2759 = new short[256];

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Z")
    public static volatile boolean field2776 = false;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[I")
    public static int[] field2767 = new int[25];

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    private int field2788;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lrb;")
    private class425 field2761;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "[I")
    public int[] field2778;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()I")
    public int method1186() throws Exception {
        field2763++;
        return this.field2782;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1330(int arg0) {
        if (arg0 != 8) {
            method1330(-115);
        }
        field2759 = null;
        field2767 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILrb;)V")
    private final void method1331(int arg0, int arg1, class425 arg2) {
        if (arg0 <= 112) {
            field2768 = -84;
        }
        field2769++;
        int var4 = arg1 >> 5;
        class425 var5 = this.field2792[var4];
        if (var5 == null) {
            this.field2783[var4] = arg2;
        } else {
            var5.field5915 = arg2;
        }
        this.field2792[var4] = arg2;
        arg2.field5914 = arg1;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "()V")
    public void method1191() {
        field2774++;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static final void method1332(int arg0) {
        if (arg0 <= 111) {
            return;
        }
        for (class43 var1 = (class43) class196.field2838.method2479(-97); var1 != null; var1 = (class43) class196.field2838.method2479(-70)) {
            class278.method1754(var1, (byte) 127);
        }
        field2764++;
        client.method1636();
        client.method1652();
        client.method1631();
        client.method1633();
        client.method1645();
        client.method1650();
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public final void method1333(int arg0) {
        field2766++;
        if (arg0 != -19721) {
            this.method1331(80, 53, (class425) null);
        }
        this.field2786 = true;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    private final void method1334(int arg0, int arg1) {
        int var3 = 60 % ((-arg1 - 11) / 62);
        this.field2791 -= arg0;
        field2758++;
        if (this.field2791 < 0) {
            this.field2791 = 0;
        }
        if (this.field2761 != null) {
            this.field2761.method97(arg0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public final synchronized void method1335(int arg0) {
        field2760++;
        if (this.field2757) {
            return;
        }
        long var2 = class199.method1372(30938);
        try {
            if (this.field2765 + 500000L < var2) {
                this.field2765 = var2 - 500000L;
            }
            while (var2 > (this.field2765 + 5000L)) {
                this.method1334(256, 62);
                this.field2765 += (long) (256000 / class231.field3248);
            }
        } catch (Exception var7) {
            this.field2765 = var2;
        }
        if (this.field2778 == null) {
            return;
        }
        try {
            if (this.field2781 != 0L) {
                if (this.field2781 > var2) {
                    return;
                }
                this.method1189(this.field2782);
                this.field2786 = true;
                this.field2781 = 0L;
            }
            int var4 = this.method1186();
            if (this.field2787 - var4 > this.field2789) {
                this.field2789 = this.field2787 - var4;
            }
            int var5 = this.field2788 + this.field2784;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (arg0 < 108) {
                this.method1334(-101, 113);
            }
            if (this.field2782 < var5 + 256) {
                this.field2782 += 1024;
                if (this.field2782 > 16384) {
                    this.field2782 = 16384;
                }
                this.method1191();
                var4 = 0;
                this.method1189(this.field2782);
                if (var5 + 256 > this.field2782) {
                    var5 = this.field2782 - 256;
                    this.field2788 = var5 - this.field2784;
                }
                this.field2786 = true;
            }
            while (var5 > var4) {
                this.method1337(this.field2778, 256);
                var4 += 256;
                this.method1190();
            }
            if (var2 > this.field2785) {
                if (this.field2786) {
                    this.field2786 = false;
                } else if (this.field2789 == 0 && this.field2790 == 0) {
                    this.method1191();
                    this.field2781 = var2 + 2000L;
                    return;
                } else {
                    this.field2788 = Math.min(this.field2790, this.field2789);
                    this.field2790 = this.field2789;
                }
                this.field2789 = 0;
                this.field2785 = var2 + 2000L;
            }
            this.field2787 = var4;
        } catch (Exception var6) {
            this.method1191();
            this.field2781 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public final synchronized void method1336(byte arg0) {
        field2777++;
        this.field2786 = true;
        if (arg0 != -46) {
            return;
        }
        try {
            this.method1188();
        } catch (Exception var2) {
            this.method1191();
            this.field2781 = class199.method1372(30938) + 2000L;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([II)V")
    private final void method1337(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class105.field1478) {
            var3 = arg1 << 1;
        }
        class79.method640(arg0, 0, var3);
        this.field2791 -= arg1;
        if (this.field2761 != null && this.field2791 <= 0) {
            this.field2791 += class231.field3248 >> 4;
            class326.method1993(-2, this.field2761);
            this.method1331(123, this.field2761.method1082(), this.field2761);
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
                        class425 var10 = null;
                        class425 var11 = this.field2783[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class173 var12 = var11.field5917;
                                if (var12 == null || var12.field2478 <= var8) {
                                    var11.field5916 = true;
                                    int var13 = var11.method103();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2478 += var13;
                                    }
                                    if (var4 >= this.field2762) {
                                        break label107;
                                    }
                                    class425 var14 = var11.method100();
                                    if (var14 != null) {
                                        int var15 = var11.field5914;
                                        while (var14 != null) {
                                            this.method1331(119, var15 * var14.method1082() >> 8, var14);
                                            var14 = var11.method105();
                                        }
                                    }
                                    class425 var16 = var11.field5915;
                                    var11.field5915 = null;
                                    if (var10 == null) {
                                        this.field2783[var7] = var16;
                                    } else {
                                        var10.field5915 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2792[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5915;
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
                class425 var18 = this.field2783[var17];
                this.field2783[var17] = this.field2792[var17] = null;
                while (var18 != null) {
                    class425 var19 = var18.field5915;
                    var18.field5915 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2791 < 0) {
            this.field2791 = 0;
        }
        if (this.field2761 != null) {
            this.field2761.method106(arg0, 0, arg1);
        }
        this.field2765 = class199.method1372(30938);
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "()V")
    public void method1190() throws Exception {
        field2779++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1187(Component arg0) throws Exception {
        field2773++;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
    public final synchronized void method1338(int arg0) {
        if (class274.field3750 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class274.field3750.field2081[var3] == this) {
                    class274.field3750.field2081[var3] = null;
                }
                if (class274.field3750.field2081[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class274.field3750.field2074 = true;
                while (class274.field3750.field2072) {
                    class328.method1999(0, 50L);
                }
                class274.field3750 = null;
            }
        }
        field2772++;
        this.method1191();
        if (arg0 != 0) {
            this.method1335(-121);
        }
        this.field2778 = null;
        this.field2757 = true;
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V")
    public void method1189(int arg0) throws Exception {
        field2770++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILrb;)V")
    public final synchronized void method1339(int arg0, class425 arg1) {
        if (arg0 != -24056) {
            this.method1333(9);
        }
        this.field2761 = arg1;
        field2775++;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "()V")
    public void method1188() throws Exception {
        field2780++;
    }
}
