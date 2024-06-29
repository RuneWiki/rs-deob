import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class260 extends class56 {

    @OriginalMember(owner = "client!oba", name = "J", descriptor = "I")
    private int field3745 = 32768;

    @OriginalMember(owner = "client!oba", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field3742 = new String[100];

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!oba", name = "F", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!oba", name = "K", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!oba", name = "L", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!oba", name = "M", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!oba", name = "N", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!oba", name = "O", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!oba", name = "P", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "(I)V")
    public static void method1702(int arg0) {
        field3742 = null;
        if (arg0 != -7286) {
            field3746 = 127;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            field3742 = null;
        }
        ++field3747;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field674 = ~arg1.method3750((byte) 35) == -2;
            }
        } else {
            this.field3745 = arg1.method3757((byte) -65) << 4;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)[[I")
    public final int[][] method5(int arg0, int arg1) {
        ++field3741;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field668.method3009(arg1 + -1, arg0);
            if (super.field668.field7292) {
                int[] var4 = this.method367(4463, 1, arg0);
                int[] var5 = this.method367(4463, 2, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class328.field4576; ++var9) {
                    int var10 = (1046466 & var4[var9] * 255) >> 12;
                    int var11 = var5[var9] * this.field3745 >> 12;
                    int var12 = class97.field1172[var10] * var11 >> 12;
                    int var13 = class231.field3111[var10] * var11 >> 12;
                    int var14 = class445.field6318 & (var12 >> 12) + var9;
                    int var15 = class636.field8759 & (var13 >> 12) + arg0;
                    int[][] var16 = this.method369(var15, 127, 0);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
    public final void method364(int arg0) {
        if (arg0 == 7) {
            class135.method965(false);
            ++field3748;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1703(int arg0, String arg1, int arg2) {
        ++field3744;
        if (arg2 >= -75) {
            field3742 = null;
        }
        int var3 = class578.field8168;
        int[] var4 = class240.field3201;
        boolean var5 = false;
        for (int var6 = 0; var3 > var6; ++var6) {
            class280 var7 = class309.field4311[var4[var6]];
            if (var7 != null && class660.field9039 != var7 && var7.field3965 != null && var7.field3965.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (~arg0 == -2) {
                    ++class472.field6697;
                    class519 var8 = class357.method2293(class427.field5994, class471.field6692, (byte) -52);
                    var8.field7384.method3701(var4[var6], (byte) -50);
                    var8.field7384.method3702((byte) -5, 0);
                    class151.method1027(var8, -82);
                } else if (arg0 == 4) {
                    ++class642.field8805;
                    class519 var9 = class357.method2293(class427.field5994, class131.field1733, (byte) -115);
                    var9.field7384.method3694(0, -1528071456);
                    var9.field7384.method3701(var4[var6], (byte) -78);
                    class151.method1027(var9, -75);
                } else if (~arg0 == -6) {
                    ++class55.field644;
                    class519 var10 = class357.method2293(class427.field5994, class571.field8099, (byte) -39);
                    var10.field7384.method3718((byte) 85, var4[var6]);
                    var10.field7384.method3694(0, -1528071456);
                    class151.method1027(var10, -49);
                } else if (arg0 != 6) {
                    if (arg0 == 7) {
                        ++class548.field7643;
                        class519 var11 = class357.method2293(class427.field5994, class286.field4057, (byte) 64);
                        var11.field7384.method3701(var4[var6], (byte) -128);
                        var11.field7384.method3694(0, -1528071456);
                        class151.method1027(var11, -31);
                    }
                } else {
                    ++class655.field8987;
                    class519 var12 = class357.method2293(class427.field5994, class408.field5784, (byte) -95);
                    var12.field7384.method3701(var4[var6], (byte) -120);
                    var12.field7384.method3751((byte) -108, 0);
                    class151.method1027(var12, -80);
                }
                break;
            }
        }
        if (!var5) {
            class642.method3549(true, 4, class71.field917.method588((byte) 105, class549.field7669) + arg1);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1704(String arg0, boolean arg1) {
        ++field3750;
        class519 var2 = class648.method3576(-115);
        var2.field7384.method3694(class95.field1128.field6501, -1528071456);
        var2.field7384.method3745(-122, 0);
        int var3 = var2.field7384.field9146;
        var2.field7384.method3745(-116, 633);
        int[] var4 = class143.method1001(9108, var2);
        int var5 = var2.field7384.field9146;
        if (arg1) {
            field3746 = -121;
        }
        var2.field7384.method3747((byte) 27, arg0);
        var2.field7384.method3694(class549.field7669, -1528071456);
        var2.field7384.field9146 += 7;
        var2.field7384.method3695(var2.field7384.field9146, var4, 116, var5);
        var2.field7384.method3741(-var3 + var2.field7384.field9146, (byte) -87);
        class151.method1027(var2, -27);
        class689.field9420 = 0;
        class429.field6123 = 0;
        class480.field6795 = -3;
        class69.field856 = 1;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field3749;
        if (!arg1) {
            method1705(-50);
        }
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            int[] var4 = this.method367(4463, 1, arg0);
            int[] var5 = this.method367(4463, 2, arg0);
            for (int var6 = 0; ~var6 > ~class328.field4576; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field3745 >> 12;
                int var9 = class97.field1172[var7] * var8 >> 12;
                int var10 = class231.field3111[var7] * var8 >> 12;
                int var11 = class445.field6318 & (var9 >> 12) + var6;
                int var12 = class636.field8759 & (var10 >> 12) + arg0;
                int[] var13 = this.method367(4463, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "(I)V")
    public static final void method1705(int arg0) {
        class238.field3180.method4024(0);
        ++field3743;
        class347.field4909.method4024(0);
        if (arg0 <= 7) {
            method1705(-67);
        }
        class297.field4177.method4024(0);
        class167.field2290.method4024(0);
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
    public class260() {
        super(3, false);
    }
}
