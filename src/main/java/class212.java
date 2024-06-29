import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class212 extends class13 {

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "Z")
    private boolean field2957 = true;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "Z")
    private boolean field2961 = true;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "Lkn;")
    public static class442 field2956 = new class442("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "[I")
    public static int[] field2963 = new int[4096];

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "Lbj;")
    public static class131 field2966 = new class131(2);

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "[J")
    public static long[] field2971 = new long[32];

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "Lnq;")
    public static class268 field2969;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "Lnq;")
    public static class268 field2970;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "Lum;")
    public static class307 field2958;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "[[I")
    public static int[][] field2967;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIB)B")
    public static final byte method1395(int arg0, int arg1, byte arg2) {
        int var3 = 58 % ((-20 - arg2) / 63);
        ++field2962;
        if (arg0 != 9) {
            return 0;
        } else {
            return (byte) (~(arg1 & 1) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class212() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field2959;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            method1396((class345) null, 24, 127, (class133) null, (byte) 11, -69, 58, -34);
        }
        if (super.field263.field1845) {
            int[] var4 = this.method223(0, -11541, !this.field2961 ? arg1 : class123.field1710 - arg1);
            if (this.field2957) {
                for (int var5 = 0; ~class269.field3751 < ~var5; ++var5) {
                    var3[var5] = var4[class343.field4677 - var5];
                }
            } else {
                class36.method348(var4, 0, var3, 0, class269.field3751);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        ++field2965;
        int[][] var3 = super.field256.method1930(arg1, (byte) 85);
        if (arg0 != -27832) {
            this.field2961 = true;
        }
        if (super.field256.field4154) {
            int[][] var4 = this.method227(false, this.field2961 ? -arg1 + class123.field1710 : arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2957) {
                for (int var11 = 0; ~class269.field3751 < ~var11; ++var11) {
                    var8[var11] = var5[-var11 + class343.field4677];
                    var9[var11] = var6[class343.field4677 - var11];
                    var10[var11] = var7[-var11 + class343.field4677];
                }
            } else {
                for (int var12 = 0; ~class269.field3751 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Luo;IILnj;BIII)Lsg;")
    public static final class226 method1396(class345 arg0, int arg1, int arg2, class133 arg3, byte arg4, int arg5, int arg6, int arg7) {
        class394.field5647.field6180 = arg6;
        ++field2964;
        class394.field5647.field6175 = arg5;
        class394.field5647.field6173 = arg1;
        if (arg4 < 38) {
            field2963 = null;
        }
        class394.field5647.field6177 = arg2;
        class394.field5647.field6174 = arg3 != null;
        class394.field5647.field6172 = arg0.field4704;
        class394.field5647.field6178 = arg7;
        return (class226) class63.field867.method2607((byte) -85, class394.field5647);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
    public static void method1397(boolean arg0) {
        field2969 = null;
        field2966 = null;
        field2963 = null;
        field2956 = null;
        field2967 = null;
        field2958 = null;
        field2971 = null;
        field2970 = null;
        if (arg0) {
            field2970 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field2960;
        if (arg1 >= 50) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field259 = ~arg0.method172((byte) 52) == -2;
                    }
                } else {
                    this.field2961 = ~arg0.method172((byte) 52) == -2;
                }
            } else {
                this.field2957 = arg0.method172((byte) 52) == 1;
            }
        }
    }
}
