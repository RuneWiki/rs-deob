import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class646 extends class430 {

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
    private int field9304;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    private int field9296;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
    public int field9309;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
    public int field9306;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public int field9292;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
    public int field9308;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    private int field9293;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    private int field9299;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    private int field9303;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field9295 = 0;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "[I")
    public static int[] field9310 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3726(String arg0, int arg1) {
        field9297++;
        if (class445.field6360 == null) {
            class674.method3832(-19663);
        }
        class99.field1419.setTime(new Date(class465.method2818(255)));
        int var2 = class99.field1419.get(11);
        int var3 = class99.field1419.get(12);
        int var4 = class99.field1419.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class330.method2035('\n', arg0, (byte) -23);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class379.field5507; var8 > 0; var8--) {
                class445.field6360[var8] = class445.field6360[var8 - 1];
            }
            class445.field6360[0] = var5 + ": " + var6[var7];
            if (class670.field9546 != null) {
                try {
                    class670.field9546.write(class466.method2819(class445.field6360[0] + "\n", -129));
                } catch (IOException var9) {
                }
            }
            if (class445.field6360.length - 1 > class379.field5507) {
                class379.field5507++;
                if (class319.field4347 > 0) {
                    class319.field4347++;
                }
            }
        }
        if (arg1 >= -90) {
            method3730(-62, -43, -118, -74, 18, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Z")
    public final boolean method3727(int arg0, int arg1, int arg2) {
        field9305++;
        if (arg2 != -20580) {
            this.field9293 = -76;
        }
        return arg0 >= this.field9293 && this.field9303 >= arg0 && this.field9299 <= arg1 && arg1 <= this.field9296;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([IIIB)V")
    public final void method3728(int[] arg0, int arg1, int arg2, byte arg3) {
        arg0[0] = 0;
        arg0[1] = this.field9309 + arg2 - this.field9293;
        field9298++;
        if (arg3 != 61) {
            this.field9303 = -92;
        }
        arg0[2] = this.field9306 + arg1 - this.field9299;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III[I)V")
    public final void method3729(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = arg2 + this.field9299 - this.field9306;
        arg3[1] = arg1 - (this.field9309 - this.field9293);
        field9300++;
        int var5 = -49 % ((73 - arg0) / 34);
        arg3[0] = this.field9304;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIB)V")
    public static final void method3730(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field9301++;
        int var6 = 0;
        if (arg5 >= -17) {
            return;
        }
        int var7 = arg2;
        int var8 = arg1 * arg1;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class518.method3153(arg1 + arg3, -arg1 + arg3, class193.field2839[arg4], -7, arg0);
        int var20 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg3 + var6;
            int var24 = arg3 - var6;
            class518.method3153(var23, var24, class193.field2839[var21], -7, arg0);
            class518.method3153(var23, var24, class193.field2839[var22], -7, arg0);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBI)Z")
    public final boolean method3731(int arg0, byte arg1, int arg2) {
        int var4 = 34 % ((32 - arg1) / 55);
        field9294++;
        return arg2 >= this.field9309 && this.field9308 >= arg2 && arg0 >= this.field9306 && this.field9292 >= arg0;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIB)Z")
    public final boolean method3732(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -56) {
            method3733(-9);
        }
        field9307++;
        return this.field9304 == arg2 && arg0 >= this.field9293 && arg0 <= this.field9303 && arg1 >= this.field9299 && arg1 <= this.field9296;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9304 = arg0;
        this.field9296 = arg4;
        this.field9309 = arg5;
        this.field9306 = arg6;
        this.field9292 = arg8;
        this.field9308 = arg7;
        this.field9293 = arg1;
        this.field9299 = arg2;
        this.field9303 = arg3;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public static void method3733(int arg0) {
        field9310 = null;
        if (arg0 != 1815786753) {
            field9295 = -36;
        }
    }
}
