import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class389 {

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "[I")
    private int[] field5691;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Z")
    public static boolean field5689 = true;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field5690 = 0;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field5693 = 999999;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "Z")
    public static boolean field5688 = false;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field5686 = 0;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field5692 = 127;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "[I")
    public static int[] field5697 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "[[Z")
    public static boolean[][] field5698 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13] };

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 4)
    public static void method2514(int arg0) {
        if (arg0 == 99) {
            field5698 = null;
            field5697 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lde;Lfb;IZ)V", line = 40)
    public static final void method2515(class364 arg0, class341 arg1, int arg2, boolean arg3) {
        field5687++;
        class388 var4 = new class388();
        var4.field5683 = arg1.method2233((byte) 104);
        var4.field5672 = arg1.method2232(-20);
        if (!arg3) {
            field5689 = false;
        }
        var4.field5676 = new byte[var4.field5683][][];
        var4.field5684 = new int[var4.field5683];
        var4.field5679 = new int[var4.field5683];
        var4.field5682 = new class225[var4.field5683];
        var4.field5671 = new class225[var4.field5683];
        var4.field5680 = new int[var4.field5683];
        for (int var5 = 0; var5 < var4.field5683; var5++) {
            try {
                int var6 = arg1.method2233((byte) 104);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg1.method2261((byte) 66);
                    String var18 = arg1.method2261((byte) 117);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method2232(-16);
                    }
                    var4.field5684[var5] = var6;
                    var4.field5680[var5] = var19;
                    var4.field5671[var5] = arg0.method2392(9236, var18, class232.method1506((byte) -71, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg1.method2261((byte) 114);
                    String var8 = arg1.method2261((byte) 123);
                    int var9 = arg1.method2233((byte) 104);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg1.method2261((byte) 116);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method2232(-20);
                            var12[var13] = new byte[var14];
                            arg1.method2210(!arg3, var14, var12[var13], 0);
                        }
                    }
                    var4.field5684[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class232.method1506((byte) -71, var10[var16]);
                    }
                    var4.field5682[var5] = arg0.method2408(var8, class232.method1506((byte) -71, var7), var15, false);
                    var4.field5676[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field5679[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5679[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5679[var5] = -3;
            } catch (Exception var23) {
                var4.field5679[var5] = -4;
            } catch (Throwable var24) {
                var4.field5679[var5] = -5;
            }
        }
        class176.field2376.method1560(-104, var4);
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "([I)V", line = 159)
    public class389(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field5691 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field5691[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field5691[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field5691[var5 + var5] = arg0[var4];
            this.field5691[var5 - (-var5 - 1)] = var4++;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)I", line = 195)
    public final int method2516(int arg0, int arg1) {
        field5695++;
        int var3 = (this.field5691.length >> 1) - 1;
        int var4 = 39 / ((arg1 - 43) / 52);
        int var5 = var3 & arg0;
        while (true) {
            int var6 = this.field5691[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field5691[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var3 & var5 + 1;
        }
    }
}
