import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cf")
public class class27 {

    @OriginalMember(owner = "cf", name = "h", descriptor = "I")
    public int field567 = 0;

    @OriginalMember(owner = "cf", name = "b", descriptor = "[B")
    public byte[] field561 = new byte[18002];

    @OriginalMember(owner = "cf", name = "c", descriptor = "[I")
    public int[] field562 = new int[257];

    @OriginalMember(owner = "cf", name = "o", descriptor = "[I")
    public int[] field574 = new int[16];

    @OriginalMember(owner = "cf", name = "f", descriptor = "I")
    public int field565 = 0;

    @OriginalMember(owner = "cf", name = "w", descriptor = "[I")
    public int[] field582 = new int[6];

    @OriginalMember(owner = "cf", name = "t", descriptor = "[B")
    public byte[] field579 = new byte[4096];

    @OriginalMember(owner = "cf", name = "F", descriptor = "[I")
    public int[] field590 = new int[256];

    @OriginalMember(owner = "cf", name = "E", descriptor = "[[B")
    public byte[][] field589 = new byte[6][258];

    @OriginalMember(owner = "cf", name = "d", descriptor = "[Z")
    public boolean[] field563 = new boolean[16];

    @OriginalMember(owner = "cf", name = "G", descriptor = "[[I")
    public int[][] field591 = new int[6][258];

    @OriginalMember(owner = "cf", name = "s", descriptor = "[[I")
    public int[][] field578 = new int[6][258];

    @OriginalMember(owner = "cf", name = "v", descriptor = "[[I")
    public int[][] field581 = new int[6][258];

    @OriginalMember(owner = "cf", name = "O", descriptor = "[B")
    public byte[] field599 = new byte[18002];

    @OriginalMember(owner = "cf", name = "P", descriptor = "[B")
    public byte[] field600 = new byte[256];

    @OriginalMember(owner = "cf", name = "D", descriptor = "[Z")
    public boolean[] field588 = new boolean[256];

    @OriginalMember(owner = "cf", name = "i", descriptor = "Llf;")
    public static class109 field568 = class35.method275("W-=hlen Sie eine Option", 2);

    @OriginalMember(owner = "cf", name = "B", descriptor = "[I")
    public static int[] field587 = new int[100];

    @OriginalMember(owner = "cf", name = "L", descriptor = "Z")
    public static boolean field596 = false;

    @OriginalMember(owner = "cf", name = "y", descriptor = "Llf;")
    public static class109 field584 = class35.method275("<col=ff3000>", 2);

    @OriginalMember(owner = "cf", name = "Q", descriptor = "Llf;")
    private static class109 field601 = class35.method275("Walk here", 2);

    @OriginalMember(owner = "cf", name = "K", descriptor = "Llf;")
    public static class109 field595 = field601;

    @OriginalMember(owner = "cf", name = "l", descriptor = "B")
    public byte field571;

    @OriginalMember(owner = "cf", name = "a", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "cf", name = "e", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "cf", name = "g", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "cf", name = "j", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "cf", name = "k", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "cf", name = "m", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "cf", name = "n", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "cf", name = "p", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "cf", name = "q", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "cf", name = "r", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "cf", name = "z", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "cf", name = "A", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "cf", name = "H", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "cf", name = "I", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "cf", name = "J", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "cf", name = "N", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "cf", name = "R", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "cf", name = "x", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field583;

    @OriginalMember(owner = "cf", name = "u", descriptor = "[B")
    public byte[] field580;

    @OriginalMember(owner = "cf", name = "M", descriptor = "[B")
    public byte[] field597;

    @OriginalMember(owner = "cf", name = "a", descriptor = "(Z)V")
    public static void method222(boolean arg0) {
        field587 = null;
        field583 = null;
        if (!arg0) {
            field584 = null;
        }
        field568 = null;
        field584 = null;
        field595 = null;
        field601 = null;
    }

    @OriginalMember(owner = "cf", name = "a", descriptor = "(IBI)I")
    public static final int method223(int arg0, byte arg1, int arg2) {
        field593++;
        if (arg1 >= -127) {
            field601 = null;
        }
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "cf", name = "a", descriptor = "(IZI)Z")
    public static final boolean method224(int arg0, boolean arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        field575++;
        class78 var3 = class140.method1000(arg2, 0);
        if (!arg1) {
            field568 = null;
        }
        return var3.method497(-42, arg0);
    }

    @OriginalMember(owner = "cf", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
    public static final byte[] method225(boolean arg0, Object arg1, byte arg2) {
        field577++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class81.method516((byte) 44, var3) : var3;
        } else if (arg1 instanceof class146) {
            class146 var4 = (class146) arg1;
            return var4.method1026((byte) 118);
        } else {
            if (arg2 != 87) {
                method225(true, null, (byte) -115);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "cf", name = "a", descriptor = "(Lke;Lja;II)V")
    public static final void method226(class99 arg0, class86 arg1, int arg2, int arg3) {
        field573++;
        class192 var4 = new class192();
        var4.field3673 = arg1.method598((byte) 96);
        var4.field3671 = arg1.method582(15);
        var4.field3666 = new class32[var4.field3673];
        var4.field3672 = new byte[var4.field3673][][];
        var4.field3678 = new int[var4.field3673];
        var4.field3667 = new int[var4.field3673];
        var4.field3664 = new class32[var4.field3673];
        var4.field3677 = new int[var4.field3673];
        for (int var5 = arg2; var5 < var4.field3673; var5++) {
            try {
                int var6 = arg1.method598((byte) 70);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg1.method562((byte) 87).method807((byte) 62));
                    String var18 = new String(arg1.method562((byte) 87).method807((byte) 62));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method582(15);
                    }
                    var4.field3677[var5] = var6;
                    var4.field3678[var5] = var19;
                    var4.field3664[var5] = arg0.method697(client.method255((byte) -63, var17), var18, true);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg1.method562((byte) 87).method807((byte) 62));
                    String var8 = new String(arg1.method562((byte) 87).method807((byte) 62));
                    int var9 = arg1.method598((byte) 82);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg1.method562((byte) 87).method807((byte) 62));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method582(15);
                            var12[var13] = new byte[var14];
                            arg1.method583(var12[var13], 0, var14, 1174839336);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field3677[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = client.method255((byte) -63, var10[var16]);
                    }
                    var4.field3666[var5] = arg0.method702(var8, var15, client.method255((byte) -63, var7), (byte) 121);
                    var4.field3672[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3667[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3667[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3667[var5] = -3;
            } catch (Exception var23) {
                var4.field3667[var5] = -4;
            } catch (Throwable var24) {
                var4.field3667[var5] = -5;
            }
        }
        class206.field4048.method1231(var4, 0);
    }
}
