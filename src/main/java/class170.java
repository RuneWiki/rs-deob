import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class170 {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
    public static boolean field2073 = false;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
    public static boolean field2070 = false;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lrg;")
    public static class548 field2069 = new class548(45, 3);

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[I")
    public static int[] field2077 = new int[1];

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILqa;)V")
    public abstract void method326(int arg0, class206 arg1);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(ILqa;)Lso;")
    public abstract class398 method328(int arg0, class206 arg1);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static void method950(int arg0) {
        field2077 = null;
        if (arg0 != 2) {
            field2077 = null;
        }
        field2069 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BIIIII)Z")
    public static final boolean method951(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2075++;
        boolean var6 = true;
        if (arg4 != 4867) {
            field2070 = true;
        }
        class374 var7 = new class374(arg0);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method2141(25315);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2122(false);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method2129(-93) >> 2;
                    int var17 = var15 + arg3;
                    int var18 = arg5 + var14;
                    if (var17 > 0 && var18 > 0 && (arg1 - 1) > var17 && var18 < (arg2 - 1)) {
                        class437 var19 = class16.field126.method1759(false, var8);
                        if (var16 != 22 || class565.field8299.field2187 || var19.field5972 != 0 || var19.field6000 == 1 || var19.field6014) {
                            if (!var19.method2533(124)) {
                                class101.field1250++;
                                var6 = false;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method2122(false);
                if (var12 == 0) {
                    break;
                }
                var7.method2129(-71);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLoe;ILqa;III)V")
    public abstract void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V")
    public static final void method952(int arg0, String[] arg1, int arg2, short[] arg3, int arg4) {
        field2076++;
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method952(arg0, arg1, var6 - 1, arg3, 1);
            method952(var6 + 1, arg1, arg2, arg3, arg4);
        }
        if (arg4 != 1) {
            field2073 = true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public abstract void method314(byte arg0);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILqa;II)Z")
    public abstract boolean method318(int arg0, class206 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Z")
    public abstract boolean method317(int arg0);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(ILqa;)Loj;")
    public abstract class318 method320(int arg0, class206 arg1);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lmd;B)V")
    public static final void method953(class463 arg0, byte arg1) {
        field2074++;
        boolean var2 = false;
        if (class335.field4358 == arg0.field6405 || arg0.field6465 == -1 || arg0.field6449 != 0) {
            var2 = true;
        } else {
            class502 var3 = class393.field5190.method770(arg0.field6465, -59);
            if (var3.field6954 || var3.field6952[arg0.field6390] < arg0.field6477 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field6405 - arg0.field6408;
            int var5 = class335.field4358 - arg0.field6408;
            int var6 = arg0.field6391 * 128 + (arg0.method2694(28146) * 64);
            int var7 = arg0.field6413 * 128 + arg0.method2694(arg1 ^ 0xFFFF927C) * 64;
            int var8 = arg0.field6475 * 128 + arg0.method2694(arg1 + 28260) * 64;
            int var9 = arg0.field6385 * 128 + arg0.method2694(28146) * 64;
            arg0.field8652 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
            arg0.field8661 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg0.field6487 = 0;
        if (arg0.field6401 == 0) {
            arg0.method2706(false, arg1 ^ 0xFFFFFFDF, 8192);
        }
        if (arg0.field6401 == 1) {
            arg0.method2706(false, -77, 12288);
        }
        if (arg1 != -114) {
            method951(null, -22, -58, -94, -65, -8);
        }
        if (arg0.field6401 == 2) {
            arg0.method2706(false, 82, 0);
        }
        if (arg0.field6401 == 3) {
            arg0.method2706(false, 86, 4096);
        }
    }
}
