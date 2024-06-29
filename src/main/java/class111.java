import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class111 extends class23 {

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    private int field1945 = 4096;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    private int field1958 = 3216;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    private int field1947 = 3216;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "[I")
    private int[] field1963 = new int[3];

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field1954 = 1;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "Llc;")
    public static class143 field1955 = class66.method374("jaune:", -1);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "Llc;")
    private static class143 field1946 = class66.method374("purple:", -1);

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Llc;")
    public static class143 field1951 = field1946;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Llc;")
    public static class143 field1950 = field1946;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "Llc;")
    public static class143 field1960 = class66.method374("<img=1>", -1);

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "[I")
    public static int[] field1959;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "[I")
    public static int[] field1961;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method668(boolean arg0) {
        field1959 = null;
        field1961 = null;
        field1960 = null;
        field1951 = null;
        field1950 = null;
        field1955 = null;
        field1946 = null;
        if (arg0) {
            field1960 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int var4 = class170.field3033 * this.field1945 >> 12;
            int[] var5 = this.method155(class79.field1426 & arg1 + -1, (byte) 121, 0);
            int[] var6 = this.method155(arg1, (byte) 112, 0);
            int[] var7 = this.method155(class79.field1426 & arg1 - -1, (byte) 82, 0);
            for (int var8 = 0; class72.field1359 > var8; ++var8) {
                int var9 = (var6[class172.field3077 & var8 - 1] + -var6[var8 + 1 & class172.field3077]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = 255 & class34.field589[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field1963[0] * var15 >> 12;
                int var17 = this.field1963[1] * var14 >> 12;
                int var18 = var13 * 4096 >> 8;
                int var19 = this.field1963[2] * var18 >> 12;
                var3[var8] = var16 + var19 + var17;
            }
        }
        if (arg0 > -13) {
            this.method670((byte) 118);
        }
        ++field1949;
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        ++field1948;
        int var2 = -59 % ((22 - arg0) / 60);
        this.method670((byte) 124);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class111() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field1952;
        if (arg2) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field1947 = arg0.method1275(128);
                    }
                } else {
                    this.field1958 = arg0.method1275(128);
                }
            } else {
                this.field1945 = arg0.method1275(128);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V")
    public static final void method669(byte arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class34.field592[var1] = false;
        }
        class254.field4552 = -1;
        if (arg0 < 20) {
            method668(true);
        }
        ++field1953;
        class70.field1333 = -1;
        class21.field349 = 1;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(B)V")
    private final void method670(byte arg0) {
        ++field1956;
        double var2 = Math.cos((double) ((float) this.field1947 / 4096.0F));
        this.field1963[0] = (int) (4096.0D * Math.sin((double) ((float) this.field1958 / 4096.0F)) * var2);
        if (arg0 > 98) {
            this.field1963[1] = (int) (var2 * Math.cos((double) ((float) this.field1958 / 4096.0F)) * 4096.0D);
            this.field1963[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1947 / 4096.0F)));
            int var4 = this.field1963[2] * this.field1963[2] >> 12;
            int var5 = this.field1963[1] * this.field1963[1] >> 12;
            int var6 = this.field1963[0] * this.field1963[0] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var5 - -var4 + var6 >> 12)));
            if (var7 != 0) {
                this.field1963[2] = (this.field1963[2] << 12) / var7;
                this.field1963[1] = (this.field1963[1] << 12) / var7;
                this.field1963[0] = (this.field1963[0] << 12) / var7;
            }
        }
    }
}
