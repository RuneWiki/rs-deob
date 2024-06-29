import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class296 extends class136 {

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field4387 = "wave2:";

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "Z")
    public static boolean field4389 = true;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "[Lom;")
    public static class125[] field4386 = new class125[14];

    @OriginalMember(owner = "client!gb", name = "kb", descriptor = "[I")
    public static int[] field4395 = new int[256];

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field4391;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIBIIIII)V", line = 4)
    public static final void method2015(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg9 && arg0 == arg5 && arg3 == arg6 && arg1 == arg8) {
            class329.method2300(arg1, arg7, arg5, arg2, false, arg6);
        } else {
            int var10 = arg2;
            int var11 = arg5;
            int var12 = arg0 * 3;
            int var13 = arg2 * 3;
            int var14 = arg5 * 3;
            int var15 = arg3 * 3;
            int var16 = arg9 * 3;
            int var17 = arg8 * 3;
            int var18 = arg6 + var16 - arg2 - var15;
            int var19 = arg1 + var12 - var17 - arg5;
            int var20 = var13 + (var15 - var16) - var16;
            int var21 = var16 - var13;
            int var22 = var17 + var14 - var12 - var12;
            int var23 = var12 - var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var20 * var25;
                int var30 = var22 * var25;
                int var31 = var23 * var24;
                int var32 = (var27 + var31 + var30 >> 12) + arg5;
                int var33 = var21 * var24;
                int var34 = (var29 + var33 + var28 >> 12) + arg2;
                class329.method2300(var32, arg7, var11, var10, false, var34);
                var11 = var32;
                var10 = var34;
            }
        }
        if (arg4 > -109) {
            method2018((byte) 96);
        }
        field4393++;
    }

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)Lwh;", line = 92)
    public static final class137 method2016(int arg0) {
        if (arg0 != 32580) {
            field4391 = (String) null;
        }
        field4385++;
        try {
            return (class137) Class.forName("ud").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class284();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;", line = 120)
    public static final String method2017(int arg0, String[] arg1, int arg2, int arg3) {
        field4390++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            int var7 = -8 / ((arg2 - 49) / 63);
            for (int var8 = arg0; var8 < var5; var8++) {
                String var9 = arg1[var8];
                if (var9 == null) {
                    var6 += 4;
                } else {
                    var6 += var9.length();
                }
            }
            StringBuffer var10 = new StringBuffer(var6);
            for (int var11 = arg0; var11 < var5; var11++) {
                String var12 = arg1[var11];
                if (var12 == null) {
                    var10.append("null");
                } else {
                    var10.append(var12);
                }
            }
            return var10.toString();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[[I", line = 184)
    public final int[][] method53(int arg0, int arg1) {
        field4392++;
        int var3 = -52 / ((arg0 + 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352 && this.method988(0)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg1 % this.field1877 * this.field1877;
            for (int var9 = 0; var9 < class326.field4933; var9++) {
                int var10 = this.field1883[var8 + (var9 % this.field1882)];
                var7[var9] = class47.method303(255, var10) << 4;
                var6[var9] = class47.method303(var10, 65280) >> 4;
                var5[var9] = class47.method303(4080, var10 >> 12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)V", line = 237)
    public static void method2018(byte arg0) {
        field4387 = null;
        if (arg0 >= -73) {
            field4395 = (int[]) null;
        }
        field4391 = null;
        field4395 = null;
        field4386 = null;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(II)V", line = 251)
    public static final void method2019(int arg0, int arg1) {
        field4396++;
        if (arg1 > 71) {
            class143 var2 = class163.method1176((byte) -72, arg0, 3);
            var2.method1038(0);
        }
    }
}
