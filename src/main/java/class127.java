import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class127 extends class216 {

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "Z")
    public volatile boolean field2311 = true;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "Lbd;")
    public static class162 field2304 = class17.method142(0, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field2305 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "Z")
    public static boolean field2307 = false;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field2313 = 0;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "Lbd;")
    public static class162 field2309 = class17.method142(0, ": ");

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Lda;")
    public static class143 field2308;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "Z")
    public boolean field2302;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "Z")
    public boolean field2315;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "[I")
    public static int[] field2312;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)I", line = 14)
    public static final int method1023(byte arg0) {
        field2301++;
        int var1 = 102 / ((-arg0 - 48) / 43);
        if ((double) class267.field4447 == 3.0D) {
            return 37;
        } else if ((double) class267.field4447 == 4.0D) {
            return 50;
        } else if ((double) class267.field4447 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[Ljava/lang/Object;I[I)V", line = 39)
    public static final void method1024(int arg0, int arg1, Object[] arg2, int arg3, int[] arg4) {
        if (arg0 != -32485) {
            method1024(127, 12, (Object[]) null, 90, (int[]) null);
        }
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg4[var5];
            int var7 = arg3;
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var6;
            Object var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            for (int var9 = arg3; var9 < arg1; var9++) {
                if (arg4[var9] < (var9 & 0x1) + var6) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7] = var10;
                    Object var11 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7++] = var11;
                }
            }
            arg4[arg1] = arg4[var7];
            arg4[var7] = var6;
            arg2[arg1] = arg2[var7];
            arg2[var7] = var8;
            method1024(arg0, var7 - 1, arg2, arg3, arg4);
            method1024(-32485, arg1, arg2, var7 + 1, arg4);
        }
        field2300++;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)V", line = 109)
    public static void method1025(byte arg0) {
        field2308 = null;
        field2312 = null;
        field2309 = null;
        if (arg0 != 9) {
            method1027(-62, (class78) null, 102, -41, (byte) 30);
        }
        field2304 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIILob;II)V", line = 129)
    public static final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4, class78 arg5, int arg6, int arg7) {
        if (arg1 != 14284) {
            field2312 = (int[]) null;
        }
        field2310++;
        if (class126.field2299) {
            class297.field4979 = 32;
        } else {
            class297.field4979 = 0;
        }
        class126.field2299 = false;
        if (class92.field1628 != 0) {
            if (arg4 >= arg6 && (arg6 + 16) > arg4 && arg0 >= arg3 && arg0 < arg3 + 16) {
                arg5.field1258 -= 4;
                class55.method386(0, arg5);
            } else if (arg4 >= arg6 && arg4 < (arg6 + 16) && arg2 + arg3 - 16 <= arg0 && arg0 < arg2 + arg3) {
                arg5.field1258 += 4;
                class55.method386(0, arg5);
            } else if (arg4 >= arg6 - class297.field4979 && class297.field4979 + arg6 + 16 > arg4 && arg3 + 16 <= arg0 && arg0 < (arg3 + arg2 - 16)) {
                int var8 = (arg2 - 32) * arg2 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - (var8 / 2) - arg3 - 16;
                int var10 = arg2 - var8 - 32;
                arg5.field1258 = (arg7 - arg2) * var9 / var10;
                class55.method386(0, arg5);
                class126.field2299 = true;
            }
        }
        if (class157.field2766 == 0) {
            return;
        }
        int var11 = arg5.field1340;
        if (arg4 >= (arg6 - var11) && arg0 >= arg3 && arg6 + 16 > arg4 && arg0 <= (arg2 + arg3)) {
            arg5.field1258 += class157.field2766 * 45;
            class55.method386(0, arg5);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILob;IIB)V", line = 200)
    public static final void method1027(int arg0, class78 arg1, int arg2, int arg3, byte arg4) {
        field2306++;
        if (class117.field2159) {
            class16.method133(arg3, arg2, arg1.field1340 + arg3, arg1.field1367 + arg2);
        }
        if (class268.field4482 < 3) {
            if (class117.field2159) {
                ((class140) class218.field3629).method1088(arg3, arg2, arg1.field1340, arg1.field1367, class218.field3629.field1131 / 2, class218.field3629.field1135 / 2, class265.field4414, 256, (class140) arg1.method596(false, 0));
            } else {
                ((class79) class218.field3629).method600(arg3, arg2, arg1.field1340, arg1.field1367, class218.field3629.field1131 / 2, class218.field3629.field1135 / 2, class265.field4414, 256, arg1.field1329, arg1.field1360);
            }
        } else if (class117.field2159) {
            class71 var5 = arg1.method596(false, 0);
            if (var5 != null) {
                var5.method285(arg3, arg2);
            }
        } else {
            class316.method2164(arg3, arg2, 0, arg1.field1329, arg1.field1360);
        }
        if (arg4 <= 122) {
            field2305 = -76;
        }
        class252.field4211[arg0] = true;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Z)I")
    public abstract int method650(boolean arg0);

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(Z)[B")
    public abstract byte[] method652(boolean arg0);
}
