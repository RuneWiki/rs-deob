import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class492 extends class456 {

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "[I")
    private int[] field6920 = new int[3];

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
    private int field6924 = 4096;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
    private int field6918 = 3216;

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "I")
    private int field6916 = 3216;

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "[I")
    public static int[] field6923 = new int[2048];

    @OriginalMember(owner = "client!aq", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field6928 = new String[100];

    @OriginalMember(owner = "client!aq", name = "ab", descriptor = "I")
    public static int field6932 = 0;

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!aq", name = "U", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!aq", name = "V", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!aq", name = "Y", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!aq", name = "Z", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "Lwn;")
    public static class164 field6915;

    @OriginalMember(owner = "client!aq", name = "X", descriptor = "Ljb;")
    public static class350 field6929;

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "Lcp;")
    public static class481 field6913;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([SI)[S", line = 3)
    public static final short[] method2880(short[] arg0, int arg1) {
        if (arg1 != 10871) {
            method2882(false);
        }
        ++field6914;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class149.method1012(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([BI)Z", line = 23)
    public static final boolean method2881(byte[] arg0, int arg1) {
        ++field6925;
        class446 var2 = new class446(arg0);
        int var3 = var2.method2628(49152);
        if (var3 != 1) {
            return false;
        } else {
            boolean var4 = ~var2.method2628(49152) == -2;
            if (var4) {
                class111.method812(-2, var2);
            }
            class475.method2765(var2, (byte) -114);
            return arg1 <= 85 ? true : true;
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)[I", line = 56)
    public final int[] method33(int arg0, int arg1) {
        if (arg0 != -1) {
            field6923 = null;
        }
        ++field6917;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int var4 = class126.field1715 * this.field6924 >> 12;
            int[] var5 = this.method2707(arg1 + -1 & class493.field6947, -31797, 0);
            int[] var6 = this.method2707(arg1, arg0 + -31796, 0);
            int[] var7 = this.method2707(arg1 + 1 & class493.field6947, -31797, 0);
            for (int var8 = 0; ~class156.field2169 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class428.field6112 & var8 + -1] - var6[var8 + 1 & class428.field6112]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class157.field2186[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field6920[1] * var16 >> 12;
                int var18 = this.field6920[2] * var14 >> 12;
                int var19 = this.field6920[0] * var15 >> 12;
                var3[var8] = var19 - -var17 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)V", line = 128)
    public static void method2882(boolean arg0) {
        if (arg0) {
            method2884(21, (class451) null, (class451) null);
        }
        field6913 = null;
        field6915 = null;
        field6923 = null;
        field6929 = null;
        field6928 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBLre;)V", line = 144)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field6916 = arg2.method2631(2530);
                }
            } else {
                this.field6918 = arg2.method2631(2530);
            }
        } else {
            this.field6924 = arg2.method2631(2530);
        }
        if (arg1 != 55) {
            this.field6916 = -45;
        }
        ++field6926;
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 274)
    public class492() {
        super(1, true);
    }

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "(I)V", line = 196)
    private final void method2883(int arg0) {
        ++field6927;
        double var2 = Math.cos((double) ((float) this.field6916 / 4096.0F));
        this.field6920[0] = (int) (4096.0D * Math.sin((double) ((float) this.field6918 / 4096.0F)) * var2);
        this.field6920[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field6918 / 4096.0F)));
        this.field6920[2] = (int) (Math.sin((double) ((float) this.field6916 / 4096.0F)) * 4096.0D);
        int var4 = this.field6920[0] * this.field6920[0] >> 12;
        int var5 = this.field6920[1] * this.field6920[1] >> 12;
        int var6 = this.field6920[2] * this.field6920[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (arg0 != var7) {
            this.field6920[2] = (this.field6920[2] << 12) / var7;
            this.field6920[1] = (this.field6920[1] << 12) / var7;
            this.field6920[0] = (this.field6920[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILui;Lui;)I", line = 240)
    public static final int method2884(int arg0, class451 arg1, class451 arg2) {
        ++field6921;
        int var3 = 0;
        int var4 = -32 % ((-76 - arg0) / 39);
        if (arg1.method2672(class87.field1235, 23775)) {
            ++var3;
        }
        if (arg1.method2672(class297.field4451, 23775)) {
            ++var3;
        }
        if (arg1.method2672(class410.field5932, 23775)) {
            ++var3;
        }
        if (arg2.method2672(class87.field1235, 23775)) {
            ++var3;
        }
        if (arg2.method2672(class297.field4451, 23775)) {
            ++var3;
        }
        if (arg2.method2672(class410.field5932, 23775)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V", line = 280)
    public final void method653(boolean arg0) {
        ++field6931;
        if (!arg0) {
            field6923 = null;
        }
        this.method2883(0);
    }
}
