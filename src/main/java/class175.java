import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class175 {

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    private int field2743 = 32;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "J")
    private long field2745 = class276.method1861((byte) 122);

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    private int field2759 = 0;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "J")
    private long field2762 = 0L;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "[Lfa;")
    private class251[] field2758 = new class251[8];

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "J")
    private long field2760 = 0L;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "Z")
    private boolean field2764 = true;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    private int field2766 = 0;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    private int field2765 = 0;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "[Lfa;")
    private class251[] field2767 = new class251[8];

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    private int field2769 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2735 = "purple:";

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field2737 = 1;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Z")
    public static boolean field2739 = false;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Z")
    public static boolean field2753 = false;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    private int field2763;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lfa;")
    private class251 field2738;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[I")
    public int[] field2747;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "[Lq;")
    public static class126[] field2756;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
    public int method839() throws Exception {
        field2755++;
        return this.field2768;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
    public void method836() throws Exception {
        field2744++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lqg;")
    public static final class104 method1190(int arg0, int arg1) {
        field2741++;
        class104 var2 = (class104) class40.field747.method480((long) arg0, 122);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class256.field4066.method1357(0, arg0, -1);
        class104 var4 = new class104(var3);
        if (arg1 >= -70) {
            method1193(-50);
        }
        var4.method1805(class247.field3947, (int[]) null);
        class40.field747.method474((long) arg0, (byte) 126, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final void method1191(int arg0) {
        field2751++;
        if (arg0 != 2) {
            method1190(87, 120);
        }
        this.field2764 = true;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public final synchronized void method1192(int arg0) {
        field2757++;
        if (this.field2747 == null) {
            return;
        }
        long var2 = class276.method1861((byte) 122);
        try {
            if (this.field2762 != 0L) {
                if (this.field2762 > var2) {
                    return;
                }
                this.method838(this.field2768);
                this.field2764 = true;
                this.field2762 = 0L;
            }
            int var4 = this.method839();
            if (this.field2759 - var4 > this.field2769) {
                this.field2769 = this.field2759 - var4;
            }
            if (arg0 != -19615) {
                this.method1196(-19);
            }
            int var5 = this.field2763 + this.field2761;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field2768 < var5 + 256) {
                this.field2768 += 1024;
                if (this.field2768 > 16384) {
                    this.field2768 = 16384;
                }
                this.method841();
                this.method838(this.field2768);
                var4 = 0;
                if (this.field2768 < var5 + 256) {
                    var5 = this.field2768 - 256;
                    this.field2763 = var5 - this.field2761;
                }
                this.field2764 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method1198(this.field2747, 256);
                this.method836();
            }
            if (var2 > this.field2760) {
                if (this.field2764) {
                    this.field2764 = false;
                } else if (this.field2769 == 0 && this.field2765 == 0) {
                    this.method841();
                    this.field2762 = var2 + 2000L;
                    return;
                } else {
                    this.field2763 = Math.min(this.field2765, this.field2769);
                    this.field2765 = this.field2769;
                }
                this.field2760 = var2 + 2000L;
                this.field2769 = 0;
            }
            this.field2759 = var4;
        } catch (Exception var7) {
            this.method841();
            this.field2762 = var2 + 2000L;
        }
        try {
            if (this.field2745 + 500000L < var2) {
                var2 = this.field2745;
            }
            while (var2 > (this.field2745 + 5000L)) {
                this.method1199(256, 0);
                this.field2745 += (long) (256000 / class99.field1621);
            }
        } catch (Exception var6) {
            this.field2745 = var2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
    public void method841() {
        field2749++;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static void method1193(int arg0) {
        field2756 = null;
        field2735 = null;
        if (arg0 != 5000) {
            field2739 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lfa;I)V")
    public final synchronized void method1194(class251 arg0, int arg1) {
        if (arg1 == 0) {
            field2752++;
            this.field2738 = arg0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()V")
    public void method840() throws Exception {
        field2736++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public final synchronized void method1195(byte arg0) {
        this.field2764 = true;
        if (arg0 != -41) {
            field2756 = null;
        }
        field2750++;
        try {
            this.method840();
        } catch (Exception var2) {
            this.method841();
            this.field2762 = class276.method1861((byte) 122) + 2000L;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public final synchronized void method1196(int arg0) {
        field2740++;
        if (class281.field4453 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class281.field4453.field2877[var3] == this) {
                    class281.field4453.field2877[var3] = null;
                }
                if (class281.field4453.field2877[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class281.field4453.field2879 = true;
                while (class281.field4453.field2871) {
                    class43.method358(50L, false);
                }
                class281.field4453 = null;
            }
        }
        this.method841();
        this.field2747 = null;
        if (arg0 != 1) {
            this.method1192(-77);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILfa;)V")
    private final void method1197(int arg0, int arg1, class251 arg2) {
        int var4 = arg1 >> 5;
        field2742++;
        class251 var5 = this.field2767[var4];
        if (var5 == null) {
            this.field2758[var4] = arg2;
        } else {
            var5.field3984 = arg2;
        }
        this.field2767[var4] = arg2;
        if (arg0 > -121) {
            field2737 = 85;
        }
        arg2.field3985 = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([II)V")
    private final void method1198(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class133.field2128) {
            var3 = arg1 << 1;
        }
        class140.method968(arg0, 0, var3);
        this.field2766 -= arg1;
        if (this.field2738 != null && this.field2766 <= 0) {
            this.field2766 += class99.field1621 >> 4;
            class144.method989(this.field2738, 0);
            this.method1197(-122, this.field2738.method183(), this.field2738);
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
                        class251 var10 = null;
                        class251 var11 = this.field2758[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class267 var12 = var11.field3987;
                                if (var12 == null || var12.field4220 <= var8) {
                                    var11.field3986 = true;
                                    int var13 = var11.method178();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4220 += var13;
                                    }
                                    if (var4 >= this.field2743) {
                                        break label107;
                                    }
                                    class251 var14 = var11.method153();
                                    if (var14 != null) {
                                        int var15 = var11.field3985;
                                        while (var14 != null) {
                                            this.method1197(-128, var15 * var14.method183() >> 8, var14);
                                            var14 = var11.method154();
                                        }
                                    }
                                    class251 var16 = var11.field3984;
                                    var11.field3984 = null;
                                    if (var10 == null) {
                                        this.field2758[var7] = var16;
                                    } else {
                                        var10.field3984 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2767[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3984;
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
                class251 var18 = this.field2758[var17];
                this.field2758[var17] = this.field2767[var17] = null;
                while (var18 != null) {
                    class251 var19 = var18.field3984;
                    var18.field3984 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2766 < 0) {
            this.field2766 = 0;
        }
        if (this.field2738 != null) {
            this.field2738.method150(arg0, 0, arg1);
        }
        this.field2745 = class276.method1861((byte) 122);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method837(Component arg0) throws Exception {
        field2746++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)V")
    private final void method1199(int arg0, int arg1) {
        field2748++;
        this.field2766 -= arg0;
        if (arg1 > this.field2766) {
            this.field2766 = 0;
        }
        if (this.field2738 != null) {
            this.field2738.method168(arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public void method838(int arg0) throws Exception {
        field2754++;
    }
}
