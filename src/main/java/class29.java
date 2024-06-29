import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class29 extends class136 {

    @OriginalMember(owner = "client!ch", name = "wb", descriptor = "Lrf;")
    public static class163 field538 = class53.method392(-92, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!ch", name = "sb", descriptor = "Lad;")
    public static class5 field534 = new class5();

    @OriginalMember(owner = "client!ch", name = "zb", descriptor = "Lrf;")
    public static class163 field541 = class53.method392(93, "Fps:");

    @OriginalMember(owner = "client!ch", name = "Db", descriptor = "Lrf;")
    private static class163 field545 = class53.method392(-55, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ch", name = "yb", descriptor = "Lrf;")
    public static class163 field540 = class53.method392(-70, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!ch", name = "Cb", descriptor = "[I")
    public static int[] field544 = new int[1000];

    @OriginalMember(owner = "client!ch", name = "xb", descriptor = "Lrf;")
    public static class163 field539 = field545;

    @OriginalMember(owner = "client!ch", name = "tb", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ch", name = "ub", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!ch", name = "vb", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!ch", name = "Ab", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!ch", name = "Bb", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(B)V")
    public static void method171(byte arg0) {
        field539 = null;
        field541 = null;
        field534 = null;
        field540 = null;
        field544 = null;
        if (arg0 >= -41) {
            field541 = null;
        }
        field545 = null;
        field538 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILfa;)Lp;")
    public static final class139 method172(int arg0, class52 arg1) {
        ++field536;
        int var2 = arg1.method344(255);
        if (arg0 != -28262) {
            method173(-69);
        }
        int var3 = arg1.method344(255);
        Class var4 = class152.method977(arg0 + 28266, var3);
        try {
            class139 var5 = (class139) var4.newInstance();
            if (var5 != null) {
                var5.field2871 = var2;
                var5.field2861 = arg1.method344(arg0 + 28517);
                int var6 = arg1.method344(255);
                for (int var7 = 0; ~var6 < ~var7; ++var7) {
                    int var8 = arg1.method344(255);
                    var5.method64(var8, arg0 + 28283, arg1);
                }
            }
            var5.method127(0);
            return var5;
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field537;
        if (arg0 <= 53) {
            return null;
        } else {
            int[][] var3 = super.field2866.method259(arg1, -2);
            if (super.field2866.field885 && this.method895((byte) -18)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int var6 = arg1 % super.field2804 * super.field2804;
                int[] var7 = var3[2];
                for (int var8 = 0; ~class23.field402 < ~var8; ++var8) {
                    int var9 = super.field2809[var6 - -(var8 % super.field2794)];
                    var7[var8] = class133.method887(var9, 255) << 4;
                    var5[var8] = class133.method887(var9, 65280) >> 4;
                    var4[var8] = class133.method887(4080, var9 >> 12);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
    public static final void method173(int arg0) {
        int var1 = 0;
        if (arg0 != 513859944) {
            field542 = -112;
        }
        while (var1 < class181.field3638) {
            int var2 = class52.field1088[var1];
            class38 var3 = class121.field2553[var2];
            int var4 = class105.field2195.method344(255);
            if (~(16 & var4) != -1) {
                var4 += class105.field2195.method344(255) << 8;
            }
            class86.method608((byte) 31, var3, var2, var4);
            ++var1;
        }
        ++field535;
    }
}
