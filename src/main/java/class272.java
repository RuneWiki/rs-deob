import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class272 extends class240 {

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[Lfk;")
    public class45[] field4217 = new class45[5];

    @OriginalMember(owner = "client!w", name = "H", descriptor = "[I")
    public int[] field4228 = new int[5];

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public int field4229 = 0;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public int field4223;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4209 = "skill: ";

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Ljava/util/Random;")
    public static Random field4208 = new Random();

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field4215;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lag;")
    public class114 field4219;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Lmc;")
    public class183 field4221;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "Lme;")
    public class189 field4236;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Lcm;")
    public class194 field4222;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Lw;")
    public class272 field4224;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Ljc;")
    public class298 field4235;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lie;")
    public class87 field4213;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    public boolean field4216;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "Z")
    public boolean field4232;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
    public boolean field4234;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)[Leg;", line = 8)
    public static final class302[] method1961(int arg0) {
        field4227++;
        if (class232.field3675 == null) {
            int var1 = 0;
            class302[] var2 = class219.method1587(class83.field1235, 107);
            class302[] var3 = new class302[var2.length];
            label57: for (int var4 = 0; var4 < var2.length; var4++) {
                class302 var5 = var2[var4];
                if ((var5.field4749 <= 0 || var5.field4749 >= 24) && var5.field4754 >= 800 && var5.field4751 >= 600) {
                    for (int var6 = 0; var6 < var1; var6++) {
                        class302 var7 = var3[var6];
                        if (var5.field4754 == var7.field4754 && var5.field4751 == var7.field4751) {
                            if (var7.field4749 < var5.field4749) {
                                var3[var6] = var5;
                            }
                            continue label57;
                        }
                    }
                    var3[var1] = var5;
                    var1++;
                }
            }
            class232.field3675 = new class302[var1];
            class271.method1960(var3, 0, class232.field3675, 0, var1);
            int[] var8 = new int[class232.field3675.length];
            for (int var9 = 0; var9 < class232.field3675.length; var9++) {
                class302 var10 = class232.field3675[var9];
                var8[var9] = var10.field4754 * var10.field4751;
            }
            method1963(var8, class232.field3675, 20182);
        }
        return arg0 == 0 ? class232.field3675 : (class302[]) null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BIILhk;Lvi;Lnl;II)V", line = 86)
    public static final void method1962(byte arg0, int arg1, int arg2, class305 arg3, class6 arg4, class30 arg5, int arg6, int arg7) {
        field4212++;
        class254 var8 = new class254();
        var8.field3919 = arg6;
        var8.field3929 = arg1 * 128;
        var8.field3921 = arg7 * 128;
        if (arg4 != null) {
            var8.field3926 = arg4.field68;
            var8.field3927 = arg4.field79;
            var8.field3928 = arg4.field66;
            var8.field3937 = arg4;
            var8.field3933 = arg4.field62;
            var8.field3930 = arg4.field42 * 128;
            int var9 = arg4.field90;
            int var10 = arg4.field63;
            if (arg2 == 1 || arg2 == 3) {
                var9 = arg4.field63;
                var10 = arg4.field90;
            }
            var8.field3936 = (arg1 + var9) * 128;
            var8.field3939 = (arg7 + var10) * 128;
            if (arg4.field56 != null) {
                var8.field3922 = true;
                var8.method1806(0);
            }
            if (var8.field3926 != null) {
                var8.field3932 = (int) ((double) (var8.field3928 - var8.field3933) * Math.random()) + var8.field3933;
            }
            class67.field1071.method1493(-94, var8);
        } else if (arg3 != null) {
            var8.field3920 = arg3;
            class208 var11 = arg3.field4778;
            if (var11.field3313 != null) {
                var8.field3922 = true;
                var11 = var11.method1518(-4841);
            }
            if (var11 != null) {
                var8.field3936 = (arg1 + var11.field3292) * 128;
                var8.field3939 = (arg7 + var11.field3292) * 128;
                var8.field3927 = class151.method1157((byte) -121, arg3);
                var8.field3930 = var11.field3315 * 128;
            }
            class139.field2216.method1493(-90, var8);
        } else if (arg5 != null) {
            var8.field3931 = arg5;
            var8.field3939 = (arg7 + arg5.method200(-1)) * 128;
            var8.field3936 = (arg1 + arg5.method200(-1)) * 128;
            var8.field3927 = class11.method92((byte) -101, arg5);
            var8.field3930 = arg5.field483 * 128;
            class94.field1553.method845(var8, (byte) 87, class36.method281(50, arg5.field494));
        }
        if (arg0 > -89) {
            field4208 = (Random) null;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(III)V", line = 175)
    public class272(int arg0, int arg1, int arg2) {
        this.field4237 = arg1;
        this.field4230 = arg2;
        this.field4225 = this.field4223 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 197)
    private static final void method1963(int[] arg0, Object[] arg1, int arg2) {
        if (arg2 != 20182) {
            method1961(-9);
        }
        field4210++;
        class200.method1454(arg1, arg0.length - 1, 68, arg0, 0);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 223)
    public static void method1964(int arg0) {
        if (arg0 == 30618) {
            field4209 = null;
            field4208 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 258)
    public static final void method1965(boolean arg0) {
        class162.field2541 = -1;
        field4238++;
        class277.field4293 = 1;
        class307.field4839 = -3;
        class320.field5002 = 0;
        class248.field3834 = arg0;
        class328.field5072 = 0;
        class4.field30 = 0;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)Lda;", line = 276)
    public static final class120 method1966(int arg0) {
        class217.field3487 = arg0;
        field4218++;
        return class250.method1772((byte) -112);
    }
}
