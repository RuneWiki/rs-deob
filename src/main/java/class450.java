import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class450 extends class96 {

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    private int field6261 = 0;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    private int field6262 = 20;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    private int field6270 = 0;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    private int field6272 = 1365;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field6264 = 0;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Z")
    public static boolean field6267 = false;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "[[I")
    public static int[][] field6268 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Loi;")
    public static class169 field6263 = new class169("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field6269;
        if (arg1 == -1) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (arg0 == 3) {
                            this.field6261 = arg2.method568((byte) 110);
                        }
                    } else {
                        this.field6270 = arg2.method568((byte) 110);
                    }
                } else {
                    this.field6262 = arg2.method568((byte) 110);
                }
            } else {
                this.field6272 = arg2.method568((byte) 110);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public static void method2666(boolean arg0) {
        field6263 = null;
        field6268 = null;
        if (arg0) {
            field6264 = 10;
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V")
    public static final void method2667(byte arg0) {
        if (class286.field3643 != null) {
            class286.field3643.method1003(1);
            class286.field3643 = null;
        }
        ++field6266;
        class312.method1859(arg0 ^ -115);
        class459.method2711();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class171.field2215[var1].method1374(-5);
        }
        class398.method2369(30935, false);
        System.gc();
        class164.method1088(2, (byte) -101);
        class513.field7546 = -1;
        class265.field3366 = false;
        class321.method1917(true, arg0 ^ -128);
        class415.field5529 = 0;
        if (arg0 == -120) {
            class336.field4299 = 0;
            class53.field719 = 0;
            class35.field545 = 0;
            class377.field4896 = 0;
            for (int var2 = 0; ~var2 > ~class509.field7472.length; ++var2) {
                class509.field7472[var2] = null;
            }
            class481.method2882(arg0 + -1929);
            for (int var3 = 0; var3 < 2048; ++var3) {
                class76.field952[var3] = null;
            }
            class16.field264 = 0;
            for (int var4 = 0; ~var4 > -32769; ++var4) {
                class527.field7791[var4] = null;
            }
            class376.field4885.method2088((byte) 116);
            class478.method2867(arg0 ^ 27508);
            class504.field7414 = 0;
            class198.field2555.method1208(-16337);
            class326.method1939((byte) -96);
            class329.method1956((byte) 7);
            class181.method1189(true, (byte) -112);
            try {
                class425.method2515(class172.field2221.field6139, "loggedout", -27401);
            } catch (Throwable var5) {
            }
            class282.field3609 = null;
            class423.field5828 = 0L;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)V")
    public static final void method2668(int arg0, int arg1) {
        if (arg1 != 1) {
            field6264 = -17;
        }
        class203.field2665 = -1;
        class267.field3389 = arg0;
        class294.field3816 = -1;
        ++field6265;
        class60.method342((byte) 90);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field6271;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            method2667((byte) 90);
        }
        if (super.field1331.field863) {
            for (int var4 = 0; ~var4 > ~class269.field3403; ++var4) {
                int var5 = (class510.field7476[var4] << 12) / this.field6272 + this.field6270;
                int var6 = (class74.field933[arg0] << 12) / this.field6272 + this.field6261;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && var13 < this.field6262) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var7 + var11;
                    var12 = var10 * var10 >> 12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field6262 + -1 <= var13 ? 0 : (var13 << 12) / this.field6262;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class450() {
        super(0, true);
    }
}
