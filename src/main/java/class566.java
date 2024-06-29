import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class566 extends class573 {

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    private int field8259 = 32768;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Lsb;")
    public static class266 field8257 = new class266(29, 7);

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "Lab;")
    public static class623 field8263 = new class623(0, 0);

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field8258;
        if (arg1 != 1) {
            return null;
        } else {
            int[] var3 = super.field8321.method3164(arg0, -110);
            if (super.field8321.field7825) {
                int[] var4 = this.method3292(1, arg1 ^ 1, arg0);
                int[] var5 = this.method3292(2, arg1 + -1, arg0);
                for (int var6 = 0; ~class540.field7555 < ~var6; ++var6) {
                    int var7 = (4094 & var4[var6]) >> 4;
                    int var8 = var5[var6] * this.field8259 >> 12;
                    int var9 = class335.field5011[var7] * var8 >> 12;
                    int var10 = class370.field5489[var7] * var8 >> 12;
                    int var11 = var6 - -(var9 >> 12) & class591.field8492;
                    int var12 = (var10 >> 12) + arg0 & class189.field3019;
                    int[] var13 = this.method3292(0, 0, var12);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        if (arg0 >= -116) {
            return null;
        } else {
            ++field8262;
            int[][] var3 = super.field8320.method1504(arg1, -2);
            if (super.field8320.field3295) {
                int[] var4 = this.method3292(1, 0, arg1);
                int[] var5 = this.method3292(2, 0, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; class540.field7555 > var9; ++var9) {
                    int var10 = var4[var9] * 255 >> 12 & 255;
                    int var11 = var5[var9] * this.field8259 >> 12;
                    int var12 = class335.field5011[var10] * var11 >> 12;
                    int var13 = class370.field5489[var10] * var11 >> 12;
                    int var14 = var9 - -(var12 >> 12) & class591.field8492;
                    int var15 = arg1 - -(var13 >> 12) & class189.field3019;
                    int[][] var16 = this.method3293(0, -55, var15);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V")
    public static final void method3274(int arg0) {
        class294.field4412 = arg0;
        for (int var1 = 0; var1 < class520.field7369; ++var1) {
            for (int var2 = 0; var2 < class107.field1852; ++var2) {
                if (class257.field3792[arg0][var1][var2] == null) {
                    class257.field3792[arg0][var1][var2] = new class370(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field8256;
        if (arg2 != 3) {
            this.field8259 = 3;
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field8334 = ~arg0.method732(-559537960) == -2;
            }
        } else {
            this.field8259 = arg0.method723((byte) -25) << 4;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class566() {
        super(3, false);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        class136.method1117((byte) 63);
        if (arg0 == 4095) {
            ++field8261;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static void method3275(boolean arg0) {
        field8257 = null;
        field8263 = null;
        if (arg0) {
            method3275(true);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;ZILn;Z)V")
    public static final void method3276(String arg0, boolean arg1, int arg2, class17 arg3, boolean arg4) {
        if (arg2 != 11574) {
            method3276((String) null, false, -49, (class17) null, true);
        }
        ++field8260;
        if (!arg4) {
            class410.method2501((byte) 50, arg3, arg0, 3);
        } else {
            if (class17.field780.startsWith("win") && arg3.field795) {
                String var5 = null;
                if (class416.field6017 != null) {
                    var5 = class416.field6017.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class456 var6 = class410.method2501((byte) 50, arg3, arg0, 0);
                    class448.field6445 = arg0;
                    class138.field2453 = arg3;
                    class389.field5684 = var6;
                    return;
                }
            }
            if (class17.field780.startsWith("mac")) {
                String var7 = null;
                if (class416.field6017 != null) {
                    var7 = class416.field6017.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg1) {
                    class410.method2501((byte) 50, arg3, arg0, 1);
                    return;
                }
            }
            class410.method2501((byte) 50, arg3, arg0, 2);
        }
    }
}
