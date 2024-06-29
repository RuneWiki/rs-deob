import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class456 extends class454 {

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "Lig;")
    public static class206 field6830 = new class206(92, -2);

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "Ldb;")
    public static class272 field6831 = new class272(10, 2, 2, 0);

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "Lig;")
    public static class206 field6833 = new class206(42, 6);

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "Lkea;")
    public static class203 field6834;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "[B")
    private byte[] field6826;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)[B", line = 3)
    public final byte[] method2815(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            method2817(-114);
        }
        field6827++;
        this.field6826 = new byte[arg0 * arg3 * arg1 * 2];
        this.method2905(arg0, arg1, (byte) -78, arg3);
        return this.field6826;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)I", line = 20)
    public static final int method2816(int arg0, String arg1) {
        field6824++;
        return arg0 >= -71 ? 87 : arg1.length() + 1;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V", line = 32)
    public static final void method2817(int arg0) {
        int var1 = 12 % ((arg0 - 8) / 33);
        class356.field5061 = null;
        field6829++;
        class495.field7237 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(DI)V", line = 45)
    public static final void method2818(double arg0, int arg1) {
        field6828++;
        if (class42.field459 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class566.field8079[var3] = var4 <= 255 ? var4 : 255;
            }
            class42.field459 = arg0;
        }
        if (arg1 != -10042) {
            method2818(0.6060889246982311D, -51);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 71)
    public class456() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ltq;ZILrt;)V", line = 77)
    public static final void method2819(class545 arg0, boolean arg1, int arg2, class194 arg3) {
        field6825++;
        class273 var4 = new class273();
        var4.field3817 = arg3.method1177(255);
        var4.field3825 = arg3.method1178(-230315992);
        var4.field3822 = new int[var4.field3817];
        if (arg1) {
            field6834 = null;
        }
        var4.field3819 = new int[var4.field3817];
        var4.field3823 = new class175[var4.field3817];
        var4.field3818 = new class175[var4.field3817];
        var4.field3815 = new int[var4.field3817];
        var4.field3826 = new byte[var4.field3817][][];
        for (int var5 = 0; var5 < var4.field3817; var5++) {
            try {
                int var6 = arg3.method1177(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method1218(arg1);
                    String var8 = arg3.method1218(false);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method1178(-230315992);
                    }
                    var4.field3815[var5] = var6;
                    var4.field3819[var5] = var9;
                    var4.field3818[var5] = arg0.method3170(var8, false, class181.method1038(var7, arg1));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method1218(false);
                    String var11 = arg3.method1218(false);
                    int var12 = arg3.method1177(255);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method1218(arg1);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method1178(-230315992);
                            var15[var16] = new byte[var17];
                            arg3.method1200(var15[var16], (byte) 120, 0, var17);
                        }
                    }
                    var4.field3815[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class181.method1038(var13[var19], false);
                    }
                    var4.field3823[var5] = arg0.method3166(var11, class181.method1038(var10, false), 0, var18);
                    var4.field3826[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3822[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3822[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3822[var5] = -3;
            } catch (Exception var23) {
                var4.field3822[var5] = -4;
            } catch (Throwable var24) {
                var4.field3822[var5] = -5;
            }
        }
        class599.field8749.method706(var4, true);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 189)
    public static void method2820(byte arg0) {
        field6833 = null;
        field6834 = null;
        int var1 = -90 % ((arg0 - 43) / 32);
        field6831 = null;
        field6830 = null;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(BII)V", line = 211)
    public final void method2101(byte arg0, int arg1, int arg2) {
        field6823++;
        int var4 = arg1 * 2;
        byte var5 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        if (arg2 != 2074826817) {
            field6832 = -114;
        }
        this.field6826[var4++] = var5;
        this.field6826[var4] = var5;
    }
}
