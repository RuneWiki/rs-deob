import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class132 extends class535 {

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "Z")
    private boolean field2058 = true;

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "Z")
    private boolean field2067 = true;

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "[I")
    public static int[] field2063;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!pq", name = "R", descriptor = "Z")
    public static boolean field2068;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "S")
    public static short field2060;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!pq", name = "O", descriptor = "Ljava/awt/Font;")
    public static Font field2065;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method966(String arg0, int arg1) {
        ++field2066;
        return arg1 != 10240 ? -20 : arg0.length() - -1;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILci;)Ltg;")
    public static final class158 method967(int arg0, int arg1, int arg2, class320 arg3) {
        ++field2061;
        class519 var4 = new class519(arg3.method2037(arg2, (byte) -72, arg0));
        class158 var5 = new class158(arg2, var4.method3082((byte) 64), var4.method3082((byte) 74), var4.method3053(-129), var4.method3053(-129), ~var4.method3072((byte) -123) == -2, var4.method3072((byte) -119), var4.method3072((byte) -120));
        int var6 = var4.method3072((byte) -127);
        for (int var7 = 0; ~var6 < ~var7; ++var7) {
            var5.field2406.method866((byte) 10, new class440(var4.method3072((byte) -124), var4.method3018(566990904), var4.method3018(566990904), var4.method3018(566990904), var4.method3018(arg1 + 566990904), var4.method3018(arg1 + 566990904), var4.method3018(arg1 + 566990904), var4.method3018(566990904), var4.method3018(arg1 ^ 566990904)));
        }
        var5.method1108(arg1);
        return var5;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
    public class132() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
    public static void method968(int arg0) {
        field2063 = null;
        if (arg0 != -1) {
            method966((String) null, -123);
        }
        field2065 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field2059;
        if (arg2 != -6232) {
            method969((byte) 65, 29, true);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field7878 = ~arg1.method3072((byte) -127) == -2;
                }
            } else {
                this.field2058 = arg1.method3072((byte) -124) == 1;
            }
        } else {
            this.field2067 = arg1.method3072((byte) -119) == 1;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        ++field2057;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[][] var4 = this.method3157((byte) 67, !this.field2058 ? arg1 : -arg1 + class293.field4364, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field2067) {
                for (int var11 = 0; class174.field2597 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class174.field2597 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class529.field7783];
                    var9[var12] = var6[-var12 + class529.field7783];
                    var10[var12] = var7[class529.field7783 - var12];
                }
            }
        }
        return arg0 > -116 ? null : var3;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BIZ)V")
    public static final void method969(byte arg0, int arg1, boolean arg2) {
        class84.field1337 = arg1;
        class497.field7189 = 3;
        if (arg0 <= 113) {
            field2063 = null;
        }
        ++field2056;
        class33.method307(class397.field5648.field4009, class397.field5648.field4020, false);
        if (arg2) {
            class134.method977("", 1, "");
        } else {
            class415.method2484(true);
            class134.method977(class451.field6587, 1, class315.field4692);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        ++field2062;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int[] var4 = this.method3158(-104, 0, !this.field2058 ? arg0 : -arg0 + class293.field4364);
            if (this.field2067) {
                for (int var5 = 0; var5 < class174.field2597; ++var5) {
                    var3[var5] = var4[class529.field7783 - var5];
                }
            } else {
                class282.method1824(var4, 0, var3, 0, class174.field2597);
            }
        }
        if (arg1 != 1) {
            this.method65(-90, 5);
        }
        return var3;
    }

    static {
        new class44("Use", "Benutzen", "Utiliser", "Usar");
        field2063 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
        field2064 = 0;
        field2068 = true;
        field2060 = 1;
    }
}
