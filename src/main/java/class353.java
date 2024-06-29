import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class353 extends class132 {

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
    private int field4776;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "Lcba;")
    public static class471 field4772 = new class471(86, 8);

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
    public static int field4779 = 0;

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "[I")
    public static int[] field4777 = new int[13];

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "Lvaa;")
    public static class399 field4778 = new class399();

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
    public static int field4780 = 0;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "[Lue;")
    public class196[] field4774;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "[[B")
    private byte[][] field4770;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)Z")
    public final boolean method2115(int arg0, boolean arg1) {
        field4768++;
        return arg1 ? this.field4774[arg0].field2777 : false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)Z")
    public final boolean method2116(byte arg0, int arg1) {
        field4771++;
        int var3 = 103 / ((8 - arg0) / 48);
        return this.field4774[arg1].field2786;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IB)Z")
    public final boolean method2117(int arg0, byte arg1) {
        field4775++;
        if (arg1 != 69) {
            field4780 = 92;
        }
        return this.field4774[arg0].field2781;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method2118(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class272.field3786 = arg0;
        class41.field808 = 0x1 << class272.field3786;
        class194.field2745 = class41.field808 >> 1;
        class29.field484 = (int) Math.sqrt((double) (class194.field2745 * class194.field2745 + class194.field2745 * class194.field2745));
        class293.field4031 = class41.field808 >> 2;
        class589.field8418 = class41.field808;
        class332.field4447 = arg2;
        class34.field624 = arg3;
        class325.field4377 = arg4;
        class317.field4302 = new class622[arg1][class332.field4447][class34.field624];
        class608.field8767 = new class174[arg1];
        if (arg5) {
            class473.field6662 = new int[class332.field4447][class34.field624];
            class590.field8423 = new byte[class332.field4447][class34.field624];
            class246.field3418 = new short[class332.field4447][class34.field624];
            class118.field1941 = new class622[1][class332.field4447][class34.field624];
            client.field3472 = new class174[1];
        } else {
            class473.field6662 = null;
            class590.field8423 = null;
            class246.field3418 = null;
            class118.field1941 = null;
            client.field3472 = null;
        }
        if (arg6) {
            class217.field3091 = new long[arg1][arg2][arg3];
            class363.field4863 = new class579[65535];
            class335.field4463 = new boolean[65535];
            class517.field7258 = 0;
        } else {
            class217.field3091 = null;
            class363.field4863 = null;
            class335.field4463 = null;
            class517.field7258 = 0;
        }
        class133.method903(false);
        class120.field1964 = new class626[1000];
        class134.field2127 = 0;
        class53.field996 = new class626[1000];
        class144.field2227 = 0;
        class277.field3830 = new int[arg1][class332.field4447 + 1][class34.field624 + 1];
        class45.field858 = new class425[5000];
        class510.field7140 = 0;
        class69.field1172 = new boolean[class325.field4377 + class325.field4377 + 1][class325.field4377 + class325.field4377 + 1];
        class270.field3764 = new boolean[class325.field4377 + class325.field4377 + 2][class325.field4377 + class325.field4377 + 2];
        class233.field3288 = null;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z")
    public final boolean method2119(int arg0) {
        field4769++;
        if (this.field4774 != null) {
            return true;
        }
        if (this.field4770 == null) {
            if (!class197.field2796.method244(this.field4776, 0)) {
                return false;
            }
            int[] var2 = class197.field2796.method219((byte) 77, this.field4776);
            this.field4770 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field4770[var3] = class197.field2796.method240(this.field4776, var2[var3], (byte) -124);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field4770.length; var5++) {
            byte[] var14 = this.field4770[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class528.field7405.method221(var15, (byte) 86);
        }
        if (!var4) {
            return false;
        }
        class46 var6 = new class46();
        int var7 = class197.field2796.method231(this.field4776, -125);
        this.field4774 = new class196[var7];
        int[] var8 = class197.field2796.method219((byte) 94, this.field4776);
        if (arg0 < 119) {
            return true;
        }
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field4770[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class3 var12 = null;
            for (class3 var13 = (class3) var6.method456((byte) -124); var13 != null; var13 = (class3) var6.method460((byte) -111)) {
                if (var13.field42 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class3(var11, class528.field7405.method242(var11, (byte) -112));
                var6.method463(var12, -110);
            }
            this.field4774[var8[var9]] = new class196(var10, var12);
        }
        this.field4770 = null;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[BIIBI)V")
    public static final void method2120(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4773++;
        if (arg5 <= arg3) {
            return;
        }
        int var6 = arg5 - arg3 >> 2;
        int var7 = arg0 + arg3;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg5 - arg3 & 0x3;
                if (arg4 >= -25) {
                    method2121(-97);
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg1[var7++] = 1;
                }
            }
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
            arg1[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(I)V")
    public class353(int arg0) {
        this.field4776 = arg0;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
    public static void method2121(int arg0) {
        if (arg0 != 1) {
            method2121(-127);
        }
        field4772 = null;
        field4778 = null;
        field4777 = null;
    }
}
