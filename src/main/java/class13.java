import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class13 extends class142 {

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "Z")
    private boolean field211 = true;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "Z")
    private boolean field221 = true;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Z")
    public static boolean field209 = false;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "[I")
    public static int[] field215 = new int[2000];

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lai;")
    public static class10 field216 = class44.method278("Benutzen", 92);

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "Lai;")
    public static class10 field218 = class44.method278("Freie Welt", 100);

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public static int field220 = -1;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "[I")
    public static int[] field210;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "[I")
    public static int[] field212;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        if (arg0) {
            field210 = null;
        }
        ++field207;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int[] var4 = this.method963((byte) -121, 0, !this.field221 ? arg1 : -arg1 + class205.field3986);
            if (!this.field211) {
                class12.method83(var4, 0, var3, 0, class133.field2499);
            } else {
                for (int var5 = 0; ~class133.field2499 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class56.field997];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class13() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field2684 = ~arg0.method767(true) == -2;
                }
            } else {
                this.field221 = ~arg0.method767(true) == -2;
            }
        } else {
            this.field211 = arg0.method767(true) == 1;
        }
        ++field213;
        if (arg2 >= -34) {
            field208 = 7;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)I")
    public static final int method85(int arg0, int arg1) {
        ++field217;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 < 5) {
            field218 = null;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field214;
        if (arg1) {
            field218 = null;
        }
        int[][] var3 = super.field2666.method956(arg0, -99);
        if (super.field2666.field2664) {
            int[][] var4 = this.method961(2, 0, this.field221 ? class205.field3986 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field211) {
                for (int var11 = 0; class133.field2499 > var11; ++var11) {
                    var6[var11] = var5[-var11 + class56.field997];
                    var9[var11] = var7[-var11 + class56.field997];
                    var10[var11] = var8[-var11 + class56.field997];
                }
            } else {
                for (int var12 = 0; var12 < class133.field2499; ++var12) {
                    var6[var12] = var5[var12];
                    var9[var12] = var7[var12];
                    var10[var12] = var8[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
    public static void method87(byte arg0) {
        field218 = null;
        field210 = null;
        field212 = null;
        field216 = null;
        field215 = null;
        int var1 = 124 % ((arg0 - 10) / 44);
    }
}
