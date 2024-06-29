import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class102 extends class157 {

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    private int field1958 = 4096;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "I")
    private int field1962 = 4096;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "I")
    private int field1961 = 4096;

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "I")
    public static int field1959 = 0;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "[I")
    public static int[] field1956 = new int[100];

    @OriginalMember(owner = "client!mk", name = "Z", descriptor = "Lsg;")
    public static class162 field1965 = new class162();

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!mk", name = "Y", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!mk", name = "X", descriptor = "Lsj;")
    public static class49 field1963;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method1(98, (byte) -34, (class106) null);
        }
        ++field1953;
        int[][] var3 = super.field2872.method533(arg1, arg0 + 2);
        if (super.field2872.field1434) {
            int[][] var4 = this.method1093(arg1, 0, 64);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class226.field4124; ++var11) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var9[var11] = this.field1961 * var12 >> 12;
                    var8[var11] = this.field1958 * var13 >> 12;
                    var10[var11] = this.field1962 * var14 >> 12;
                } else {
                    var9[var11] = this.field1961;
                    var8[var11] = this.field1958;
                    var10[var11] = this.field1962;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 > -29) {
            method701(1);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field1962 = arg2.method736(125);
                }
            } else {
                this.field1958 = arg2.method736(126);
            }
        } else {
            this.field1961 = arg2.method736(122);
        }
        ++field1964;
    }

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "(I)V")
    public static void method701(int arg0) {
        if (arg0 != -14844) {
            method701(123);
        }
        field1963 = null;
        field1965 = null;
        field1956 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)V")
    public static final void method702(int arg0, byte arg1, int arg2) {
        ++field1955;
        if (arg1 > -67) {
            method701(-122);
        }
        class197 var3 = class37.method277(arg2, 50);
        int var4 = var3.field3532;
        int var5 = var3.field3526;
        int var6 = var3.field3527;
        int var7 = class197.field3535[-var5 + var6];
        if (~arg0 > -1 || ~arg0 < ~var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class259.method1793(var8 & arg0 << var5 | ~var8 & class284.field4997[var4], -7265, var4);
    }

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "(I)[Lsb;")
    public static final class224[] method703(int arg0) {
        ++field1960;
        class224[] var1 = new class224[class191.field3465];
        if (arg0 >= -97) {
            field1963 = null;
        }
        for (int var2 = 0; class191.field3465 > var2; ++var2) {
            var1[var2] = new class194(class241.field4360, class50.field996, class182.field3289[var2], class271.field4815[var2], class110.field2226[var2], class185.field3332[var2], class202.field3638[var2], class117.field2341);
        }
        class63.method468(116);
        return var1;
    }
}
