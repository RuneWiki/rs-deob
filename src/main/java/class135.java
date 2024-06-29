import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class135 extends class259 {

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    private int field2641 = 8192;

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
    private int field2642 = 12288;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    private int field2636 = 0;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    private int field2631 = 0;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "I")
    private int field2647 = 2048;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    private int field2629 = 4096;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "I")
    private int field2650 = 2048;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "[[B")
    public static byte[][] field2635 = new byte[250][];

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "Loh;")
    public static class14 field2643 = null;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "Lsg;")
    public static class30 field2648 = class167.method1221((byte) 33, "scrollen:");

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "Lsg;")
    public static class30 field2649 = class167.method1221((byte) 33, ")1 ");

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "[Lbj;")
    public static class44[] field2638;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)V")
    public static final void method1014(long arg0, int arg1) {
        ++field2645;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != 2048) {
            field2643 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 <= 11) {
            field2649 = null;
        }
        ++field2630;
        class168.method1242((byte) -46);
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(III)Z")
    private final boolean method1015(int arg0, int arg1, int arg2) {
        ++field2634;
        if (arg1 <= 29) {
            this.field2642 = 97;
        }
        int var4 = (arg0 + arg2) * this.field2642 >> 12;
        int var5 = class201.field3592[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2642;
        int var7 = (var6 << 12) / this.field2641;
        int var8 = this.field2629 * var7 >> 12;
        return arg0 - arg2 < var8 && -var8 < -arg2 + arg0;
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "(I)Lui;")
    public static final class220 method1016(int arg0) {
        ++field2644;
        if (arg0 >= -27) {
            return null;
        } else {
            try {
                return (class220) Class.forName("fc").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
    public static final void method1017(boolean arg0) {
        ++field2646;
        if (arg0) {
            method1017(false);
        }
        int var1 = class59.field1289.method1270(-74, 8);
        if (class28.field528 > var1) {
            for (int var2 = var1; var2 < class28.field528; ++var2) {
                class268.field4731[class109.field2197++] = class183.field3378[var2];
            }
        }
        if (~var1 < ~class28.field528) {
            throw new RuntimeException("gppov1");
        } else {
            class28.field528 = 0;
            for (int var3 = 0; ~var3 > ~var1; ++var3) {
                int var4 = class183.field3378[var3];
                class120 var5 = class75.field1670[var4];
                int var6 = class59.field1289.method1270(-85, 1);
                if (var6 == 0) {
                    class183.field3378[class28.field528++] = var4;
                    var5.field1391 = class133.field2617;
                } else {
                    int var7 = class59.field1289.method1270(-84, 2);
                    if (var7 == 0) {
                        class183.field3378[class28.field528++] = var4;
                        var5.field1391 = class133.field2617;
                        class116.field2293[class168.field3158++] = var4;
                    } else if (var7 == 1) {
                        class183.field3378[class28.field528++] = var4;
                        var5.field1391 = class133.field2617;
                        int var8 = class59.field1289.method1270(-110, 3);
                        var5.method573(var8, false, 71);
                        int var9 = class59.field1289.method1270(-51, 1);
                        if (~var9 == -2) {
                            class116.field2293[class168.field3158++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class183.field3378[class28.field528++] = var4;
                        var5.field1391 = class133.field2617;
                        int var10 = class59.field1289.method1270(-53, 3);
                        var5.method573(var10, true, 96);
                        int var11 = class59.field1289.method1270(-54, 3);
                        var5.method573(var11, true, 42);
                        int var12 = class59.field1289.method1270(-74, 1);
                        if (var12 == 1) {
                            class116.field2293[class168.field3158++] = var4;
                        }
                    } else if (var7 == 3) {
                        class268.field4731[class109.field2197++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class135() {
        super(0, true);
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(III)Z")
    private final boolean method1018(int arg0, int arg1, int arg2) {
        ++field2640;
        int var4 = (-arg2 + arg0) * this.field2642 >> 12;
        int var5 = class201.field3592[(1045870 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field2642;
        if (arg1 != -27040) {
            return true;
        } else {
            int var7 = (var6 << 12) / this.field2641;
            int var8 = this.field2629 * var7 >> 12;
            return ~var8 < ~(arg0 + arg2) && ~(arg0 + arg2) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
    public static final void method1019(int arg0, int arg1) {
        int var2 = 41 % ((arg0 - -61) / 60);
        class251.field4438.method1642(arg1, 115);
        class233.field4147.method1642(arg1, 126);
        ++field2632;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field4581.method1841(18, arg0);
            ++field2639;
            if (super.field4581.field4729) {
                int var4 = class154.field2910[arg0] + -2048;
                for (int var5 = 0; var5 < class223.field3999; ++var5) {
                    int var6 = class29.field558[var5] + -2048;
                    int var7 = var6 - -this.field2647;
                    int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                    int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                    int var10 = this.field2631 + var4;
                    int var11 = this.field2636 + var6;
                    int var12 = ~var10 <= 2047 ? var10 : var10 + 4096;
                    int var13 = var4 - -this.field2650;
                    int var14 = ~var12 < -2049 ? var12 - 4096 : var12;
                    int var15 = var11 < -2048 ? var11 + 4096 : var11;
                    int var16 = var13 < -2048 ? var13 + 4096 : var13;
                    int var17 = var15 <= 2048 ? var15 : var15 + -4096;
                    int var18 = ~var16 < -2049 ? var16 + -4096 : var16;
                    var3[var5] = !this.method1018(var14, -27040, var9) && !this.method1015(var18, 105, var17) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field2633;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field2641 = arg2.method65((byte) 118);
                                }
                            } else {
                                this.field2629 = arg2.method65((byte) 114);
                            }
                        } else {
                            this.field2642 = arg2.method65((byte) 118);
                        }
                    } else {
                        this.field2650 = arg2.method65((byte) 112);
                    }
                } else {
                    this.field2636 = arg2.method65((byte) 126);
                }
            } else {
                this.field2631 = arg2.method65((byte) 109);
            }
        } else {
            this.field2647 = arg2.method65((byte) 109);
        }
        if (arg1 != -1586849108) {
            this.method11(1);
        }
    }

    @OriginalMember(owner = "client!df", name = "j", descriptor = "(I)V")
    public static void method1020(int arg0) {
        field2649 = null;
        field2635 = null;
        field2638 = null;
        field2648 = null;
        int var1 = -2 % ((arg0 - -28) / 61);
    }
}
