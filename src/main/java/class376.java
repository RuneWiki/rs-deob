import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class376 extends class243 {

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    private int field5225 = -1;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "J")
    public static long field5228 = 0L;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "D")
    public static double field5222;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    private int field5229;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "I")
    private int field5230;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "[I")
    private int[] field5232;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lf;I)I")
    public static final int method2208(class756 arg0, int arg1) {
        if (arg1 != 21) {
            return -125;
        } else {
            ++field5220;
            String var2 = class245.method1473(arg0, (byte) 103);
            return class616.field8643.method2218((byte) 108, class587.field8211, var2);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)I")
    public final int method1455(int arg0) {
        int var2 = -64 / ((arg0 - -20) / 33);
        ++field5231;
        return this.field5225;
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V")
    public static final void method2209(byte arg0) {
        if (class287.field3823.field10290 && ~class652.field9079.field7967 != 0) {
            class109.method739(-8804, class652.field9079.field7967, class652.field9079.field7975);
        }
        int var1 = -56 % ((5 - arg0) / 56);
        ++field5226;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILji;B)V")
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (~arg0 == -1) {
            this.field5225 = arg1.method3402((byte) 127);
        }
        if (arg2 >= -92) {
            this.field5232 = null;
        }
        ++field5223;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public final void method1456(int arg0) {
        ++field5227;
        super.method1456((short) arg0);
        this.field5232 = null;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V")
    public final void method1460(int arg0, int arg1, int arg2) {
        ++field5234;
        super.method1460(arg0, arg1, arg2);
        if (~this.field5225 <= -1 && class729.field10175 != null) {
            int var4 = class729.field10175.method925(this.field5225, -28755).field4524 ? 64 : 128;
            this.field5232 = class729.field10175.method923(this.field5225, (byte) -121, var4, 1.0F, false, var4);
            this.field5230 = var4;
            this.field5229 = var4;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILf;ZI)V")
    public static final void method2210(int arg0, class756 arg1, boolean arg2, int arg3) {
        ++field5221;
        if (class83.field1156) {
            int var4 = 0;
            for (class227 var5 = (class227) arg1.field10553.method2348(-1); var5 != null; var5 = (class227) arg1.field10553.method2343(0)) {
                int var10 = class202.method1117((byte) 85, var5);
                if (var10 > var4) {
                    var4 = var10;
                }
            }
            var4 += 8;
            int var6 = arg1.field10556 * 16 + 21;
            class638.field8859 = (class527.field7072 ? 26 : 22) + arg1.field10556 * 16;
            int var7 = class729.field10174 + class33.field341;
            if (var4 + var7 > class546.field7710) {
                var7 = class729.field10174 - var4;
            }
            if (arg2) {
                if (~var7 > -1) {
                    var7 = 0;
                }
                int var8 = !class527.field7072 ? 31 : 33;
                int var9 = -var8 + arg0 + 13;
                if (class512.field6932 < var6 + var9) {
                    var9 = class512.field6932 - var6;
                }
                class596.field8309 = var7;
                if (var9 < 0) {
                    var9 = 0;
                }
                class746.field10362 = var9;
                class659.field9197 = arg1;
                class438.field6139 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
    public class376() {
        super(0, false);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field5233;
        if (arg0 >= -76) {
            this.field5232 = null;
        }
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int var4 = (~class676.field9444 == ~this.field5229 ? arg1 : this.field5229 * arg1 / class676.field9444) * this.field5230;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class687.field9628 != this.field5230) {
                for (int var8 = 0; class687.field9628 > var8; ++var8) {
                    int var9 = this.field5230 * var8 / class687.field9628;
                    int var10 = this.field5232[var4 + var9];
                    var7[var8] = class321.method1919(var10, 255) << 4;
                    var6[var8] = class321.method1919(4080, var10 >> 4);
                    var5[var8] = class321.method1919(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; class687.field9628 > var11; ++var11) {
                    int var12 = this.field5232[var4++];
                    var7[var11] = class321.method1919(255, var12) << 4;
                    var6[var11] = class321.method1919(4080, var12 >> 4);
                    var5[var11] = class321.method1919(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }
}
