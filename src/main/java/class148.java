import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class148 extends class93 {

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    private int field2932 = 585;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field2930 = 0;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "[I")
    public static int[] field2936 = new int[200];

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Ljd;")
    public static class92 field2934 = class202.method1325((byte) 90, "Wordpack geladen)3");

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "[[I")
    public static int[][] field2937 = new int[104][104];

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    public static int field2939 = 0;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "[[I")
    public static int[][] field2940 = new int[5][5000];

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "Ljd;")
    private static class92 field2941 = class202.method1325((byte) 90, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "Ljd;")
    public static class92 field2933 = field2941;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "[Lda;")
    public static class32[] field2942;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)La;")
    public static final class1 method961(int arg0, int arg1, byte arg2) {
        ++field2935;
        class1 var3 = class175.method1155(arg1, (byte) -78);
        if (~arg0 == 0) {
            return var3;
        } else {
            if (arg2 >= -75) {
                method961(-2, 107, (byte) 31);
            }
            return var3 != null && var3.field55 != null && var3.field55.length > arg0 ? var3.field55[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field2932 = arg1.method442(-21351);
        }
        if (arg2 != 0) {
            field2934 = null;
        }
        ++field2931;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lh;ILrh;Z)V")
    public static final void method962(class70 arg0, int arg1, class169 arg2, boolean arg3) {
        ++field2943;
        class152 var4 = new class152();
        var4.field3021 = arg0.method443(255);
        var4.field3018 = arg0.method453(64);
        var4.field3020 = new int[var4.field3021];
        var4.field3025 = new int[var4.field3021];
        var4.field3008 = new byte[var4.field3021][][];
        var4.field3013 = new class183[var4.field3021];
        var4.field3012 = new class183[var4.field3021];
        var4.field3009 = new int[var4.field3021];
        int var5 = 0;
        if (!arg3) {
            method963((byte) 22);
        }
        while (~var5 > ~var4.field3021) {
            try {
                int var6 = arg0.method443(255);
                if (var6 != 0 && ~var6 != -2 && var6 != 2) {
                    if (~var6 == -4 || var6 == 4) {
                        String var7 = new String(arg0.method437((byte) 73).method623((byte) 99));
                        String var8 = new String(arg0.method437((byte) 66).method623((byte) 99));
                        int var9 = arg0.method443(255);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; ~var11 > ~var9; ++var11) {
                            var10[var11] = new String(arg0.method437((byte) 82).method623((byte) 99));
                        }
                        byte[][] var12 = new byte[var9][];
                        if (~var6 == -4) {
                            for (int var13 = 0; var9 > var13; ++var13) {
                                int var14 = arg0.method453(22);
                                var12[var13] = new byte[var14];
                                arg0.method416(-2, var14, 0, var12[var13]);
                            }
                        }
                        var4.field3020[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var9 > var16; ++var16) {
                            var15[var16] = class7.method45((byte) -93, var10[var16]);
                        }
                        var4.field3012[var5] = arg2.method1124(-114, class7.method45((byte) -64, var7), var8, var15);
                        var4.field3008[var5] = var12;
                    }
                } else {
                    String var17 = new String(arg0.method437((byte) 81).method623((byte) 99));
                    String var18 = new String(arg0.method437((byte) 107).method623((byte) 99));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method453(59);
                    }
                    var4.field3020[var5] = var6;
                    var4.field3025[var5] = var19;
                    var4.field3013[var5] = arg2.method1122(class7.method45((byte) -48, var17), var18, (byte) 92);
                }
            } catch (ClassNotFoundException var20) {
                var4.field3009[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3009[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3009[var5] = -3;
            } catch (Exception var23) {
                var4.field3009[var5] = -4;
            } catch (Throwable var24) {
                var4.field3009[var5] = -5;
            }
            ++var5;
        }
        class16.field446.method101(var4, (byte) 125);
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(B)V")
    public static void method963(byte arg0) {
        field2942 = null;
        field2933 = null;
        field2941 = null;
        field2934 = null;
        field2940 = null;
        if (arg0 <= 116) {
            field2940 = null;
        }
        field2936 = null;
        field2937 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int[] var3 = super.field1887.method916(arg0, -100);
        int var4 = -121 % ((arg1 - 67) / 42);
        ++field2938;
        if (super.field1887.field2757) {
            int var5 = class166.field3271[arg0];
            for (int var6 = 0; var6 < class150.field2985; ++var6) {
                int var7 = class75.field1574[var6];
                if (~this.field2932 > ~var7 && ~(4096 - this.field2932) < ~var7 && -this.field2932 + 2048 < var5 && ~(2048 - -this.field2932) < ~var5) {
                    int var8 = 2048 - var7;
                    int var9 = var8 >= 0 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field2932 + 2048);
                    var3[var6] = 4096 - var11;
                } else if (2048 - this.field2932 < var7 && this.field2932 + 2048 > var7) {
                    int var12 = var5 - 2048;
                    int var13 = var12 < 0 ? -var12 : var12;
                    int var14 = var13 - this.field2932;
                    int var15 = var14 << 12;
                    var3[var6] = var15 / (-this.field2932 + 2048);
                } else if (this.field2932 <= var5 && var5 <= -this.field2932 + 4096) {
                    if (~var7 <= ~this.field2932 && var7 <= -this.field2932 + 4096) {
                        var3[var6] = 0;
                    } else {
                        int var16 = 2048 - var5;
                        int var17 = var16 < 0 ? -var16 : var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (2048 - this.field2932);
                        var3[var6] = 4096 - var19;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = ~var20 <= -1 ? var20 : -var20;
                    int var22 = var21 - this.field2932;
                    int var23 = var22 << 12;
                    var3[var6] = var23 / (-this.field2932 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class148() {
        super(0, true);
    }
}
