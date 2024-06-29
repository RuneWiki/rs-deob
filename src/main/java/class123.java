import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class123 extends class124 {

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "[I")
    private int[] field2036 = new int[3];

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "I")
    private int field2039 = 3216;

    @OriginalMember(owner = "client!tk", name = "cb", descriptor = "I")
    private int field2045 = 4096;

    @OriginalMember(owner = "client!tk", name = "ab", descriptor = "I")
    private int field2043 = 3216;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "Le;")
    public static class191 field2034 = class54.method368("hint_headicons", 2047);

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "Le;")
    public static class191 field2038 = class54.method368("Lade)3)3)3", 2047);

    @OriginalMember(owner = "client!tk", name = "X", descriptor = "Le;")
    public static class191 field2040 = class54.method368(" ", 2047);

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "Le;")
    public static class191 field2033 = class54.method368("", 2047);

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!tk", name = "Y", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!tk", name = "Z", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!tk", name = "bb", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!tk", name = "db", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 != -1) {
            this.method451(-73);
        }
        ++field2042;
        this.method838(true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    private final void method838(boolean arg0) {
        if (arg0) {
            double var2 = Math.cos((double) ((float) this.field2043 / 4096.0F));
            this.field2036[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field2039 / 4096.0F)));
            ++field2037;
            this.field2036[1] = (int) (4096.0D * Math.cos((double) ((float) this.field2039 / 4096.0F)) * var2);
            this.field2036[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2043 / 4096.0F)));
            int var4 = this.field2036[2] * this.field2036[2] >> 12;
            int var5 = this.field2036[0] * this.field2036[0] >> 12;
            int var6 = this.field2036[1] * this.field2036[1] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field2036[2] = (this.field2036[2] << 12) / var7;
                this.field2036[0] = (this.field2036[0] << 12) / var7;
                this.field2036[1] = (this.field2036[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class123() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 < 68) {
            return null;
        } else {
            ++field2046;
            int[] var3 = super.field2064.method378(arg1, 0);
            if (super.field2064.field1035) {
                int var4 = class249.field4430 * this.field2045 >> 12;
                int[] var5 = this.method844(0, 48, arg1 + -1 & class181.field3119);
                int[] var6 = this.method844(0, 57, arg1);
                int[] var7 = this.method844(0, 81, class181.field3119 & arg1 + 1);
                for (int var8 = 0; class64.field1132 > var8; ++var8) {
                    int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                    int var10 = var9 >> 4;
                    if (var10 < 0) {
                        var10 = -var10;
                    }
                    if (~var10 < -256) {
                        var10 = 255;
                    }
                    int var11 = (var6[class8.field82 & var8 + -1] + -var6[var8 + 1 & class8.field82]) * var4 >> 12;
                    int var12 = var11 >> 4;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class254.field4500[((var10 + 1) * var10 >> 1) + var12] & 255;
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var11 * var13 >> 8;
                    int var16 = this.field2036[2] * var14 >> 12;
                    int var17 = var9 * var13 >> 8;
                    int var18 = this.field2036[1] * var17 >> 12;
                    int var19 = this.field2036[0] * var15 >> 12;
                    var3[var8] = var16 + var19 + var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLng;)V")
    public static final void method839(byte arg0, class121 arg1) {
        if (arg0 >= -104) {
            field2034 = null;
        }
        class164.field2781 = arg1;
        ++field2035;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V")
    public static void method840(boolean arg0) {
        field2034 = null;
        field2038 = null;
        field2040 = null;
        field2033 = null;
        if (!arg0) {
            field2033 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field2032;
        if (arg2) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field2043 = arg1.method1593(true);
                    }
                } else {
                    this.field2039 = arg1.method1593(arg2);
                }
            } else {
                this.field2045 = arg1.method1593(true);
            }
        }
    }
}
