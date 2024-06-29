import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class192 extends class62 {

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    private int field2840 = 1;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "[B")
    private byte[] field2841 = new byte[512];

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    private int field2839 = 2048;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    private int field2838 = 0;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "[S")
    private short[] field2847 = new short[512];

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    private int field2848 = 5;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    private int field2844 = 5;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    private int field2846 = 2;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "Lada;")
    public static class144 field2849 = new class144(106, -1);

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "Lada;")
    public static class144 field2851 = new class144(69, 9);

    @OriginalMember(owner = "client!em", name = "T", descriptor = "Z")
    public static boolean field2854 = false;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "Lpw;")
    public static class606 field2855 = new class606();

    @OriginalMember(owner = "client!em", name = "V", descriptor = "Lh;")
    public static class572 field2856 = new class572(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!em", name = "X", descriptor = "Lbu;")
    public static class19 field2858 = new class19();

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "Lgp;")
    public static class44 field2857;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "(I)V")
    private final void method1306(int arg0) {
        ++field2845;
        Random var2 = new Random((long) this.field2838);
        this.field2847 = new short[512];
        if (arg0 < this.field2839) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field2847[var3] = (short) class240.method1534(false, this.field2839, var2);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1307(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 > 70) {
            if (class56.field668.field6840 != 0 && ~arg2 != -1 && ~class359.field4885 > -51 && ~arg0 != 0) {
                class378.field5206[class359.field4885++] = new class300((byte) 1, arg0, arg2, arg3, arg1, arg5);
            }
            ++field2852;
        }
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V")
    public final void method395(int arg0) {
        ++field2842;
        this.field2841 = class266.method1684(this.field2838, 36068);
        if (arg0 < -37) {
            this.method1306(0);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method1308(8, 120, 73, 104, -32, 1.1648642F, true, -68, 19);
        }
        ++field2843;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field2844 = arg0.method1032((byte) -33);
                                }
                            } else {
                                this.field2848 = arg0.method1032((byte) -33);
                            }
                        } else {
                            this.field2840 = arg0.method1032((byte) -33);
                        }
                    } else {
                        this.field2846 = arg0.method1032((byte) -33);
                    }
                } else {
                    this.field2839 = arg0.method1045(true);
                }
            } else {
                this.field2838 = arg0.method1032((byte) -33);
            }
        } else {
            this.field2848 = this.field2844 = arg0.method1032((byte) -33);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIFZII)[[I")
    public static final int[][] method1308(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, boolean arg6, int arg7, int arg8) {
        ++field2850;
        int[][] var9 = new int[arg8][arg0];
        class596 var10 = new class596();
        var10.field8814 = arg6;
        var10.field8809 = arg3;
        var10.field8807 = (int) (arg5 * 4096.0F);
        var10.field8815 = arg4;
        var10.field8818 = arg1;
        var10.method395(-124);
        class82.method620(arg8, 1647477356, arg0);
        for (int var11 = 0; ~arg8 < ~var11; ++var11) {
            var10.method3527(766389473, var9[var11], var11);
        }
        if (arg2 != -7) {
            method1308(104, -84, -62, -67, -122, 0.08083978F, true, 108, -103);
        }
        return var9;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
    public class192() {
        super(0, true);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public static void method1309(byte arg0) {
        field2857 = null;
        int var1 = -34 / ((arg0 - -58) / 56);
        field2856 = null;
        field2849 = null;
        field2851 = null;
        field2855 = null;
        field2858 = null;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field2853;
        if (arg1 != 656024161) {
            this.method11((class148) null, 23, 121);
        }
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            int var4 = 2048 - -(class309.field4265[arg0] * this.field2844);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class438.field5847; ++var7) {
                class111.field1582 = Integer.MAX_VALUE;
                class521.field7436 = Integer.MAX_VALUE;
                class43.field505 = Integer.MAX_VALUE;
                class424.field5736 = Integer.MAX_VALUE;
                int var8 = class200.field2965[var7] * this.field2848 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field2841[(~var11 > ~this.field2844 ? var11 : var11 - this.field2844) & 255];
                    for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field2841[255 & var13 + (~this.field2848 < ~var14 ? var14 : -this.field2848 + var14)] & 255) * 2;
                        int var10000 = var8 - (var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field2847[var15];
                        int var17 = -(var11 << 12) + -this.field2847[var27] + var4;
                        int var18 = this.field2840;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = var16 < 0 ? -var16 : var16;
                                var19 = ~var25 > ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class424.field5736 > var19) {
                            class111.field1582 = class521.field7436;
                            class521.field7436 = class43.field505;
                            class43.field505 = class424.field5736;
                            class424.field5736 = var19;
                        } else if (var19 < class43.field505) {
                            class111.field1582 = class521.field7436;
                            class521.field7436 = class43.field505;
                            class43.field505 = var19;
                        } else if (~var19 <= ~class521.field7436) {
                            if (~class111.field1582 < ~var19) {
                                class111.field1582 = var19;
                            }
                        } else {
                            class111.field1582 = class521.field7436;
                            class521.field7436 = var19;
                        }
                    }
                }
                int var12 = this.field2846;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = class43.field505 - class424.field5736;
                                }
                            } else {
                                var3[var7] = class111.field1582;
                            }
                        } else {
                            var3[var7] = class521.field7436;
                        }
                    } else {
                        var3[var7] = class43.field505;
                    }
                } else {
                    var3[var7] = class424.field5736;
                }
            }
        }
        return var3;
    }
}
