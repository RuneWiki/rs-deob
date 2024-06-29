import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class376 extends class270 {

    @OriginalMember(owner = "client!an", name = "K", descriptor = "I")
    private int field5323 = 1024;

    @OriginalMember(owner = "client!an", name = "M", descriptor = "I")
    private int field5325 = 2048;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "I")
    private int field5320 = 3072;

    @OriginalMember(owner = "client!an", name = "J", descriptor = "Lfg;")
    public static class18 field5322 = new class18(64);

    @OriginalMember(owner = "client!an", name = "R", descriptor = "I")
    public static int field5330 = -1;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field5329 = "glow2:";

    @OriginalMember(owner = "client!an", name = "P", descriptor = "F")
    public static float field5328;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!an", name = "L", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!an", name = "N", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!an", name = "O", descriptor = "[I")
    public static int[] field5327;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        if (!arg0) {
            this.field5325 = 46;
        }
        ++field5321;
        this.field5325 = -this.field5323 + this.field5320;
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(B)V")
    public static void method2386(byte arg0) {
        int var1 = 4 / ((26 - arg0) / 40);
        field5327 = null;
        field5322 = null;
        field5329 = null;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
    public class376() {
        super(1, false);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field5324;
        int[] var3 = super.field4053.method396(arg1, -24);
        if (arg0 <= 26) {
            return null;
        } else {
            if (super.field4053.field815) {
                int[] var4 = this.method1927(0, 0, arg1);
                for (int var5 = 0; var5 < class161.field2445; ++var5) {
                    var3[var5] = (var4[var5] * this.field5325 >> 12) + this.field5323;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.method81((byte) 104, -99);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field4055 = ~arg1.method271((byte) 108) == -2;
                }
            } else {
                this.field5320 = arg1.method320((byte) -87);
            }
        } else {
            this.field5323 = arg1.method320((byte) -87);
        }
        ++field5326;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method123(boolean arg0, int arg1) {
        ++field5319;
        int[][] var3 = super.field4046.method244(arg1, 122);
        if (!arg0) {
            this.method123(false, 30);
        }
        if (super.field4046.field488) {
            int[][] var4 = this.method1930(arg1, 0, (byte) -75);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class161.field2445 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field5325 >> 12) + this.field5323;
                var9[var11] = (var6[var11] * this.field5325 >> 12) + this.field5323;
                var10[var11] = (var7[var11] * this.field5325 >> 12) + this.field5323;
            }
        }
        return var3;
    }
}
