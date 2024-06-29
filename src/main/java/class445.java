import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class445 {

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "Z")
    public boolean field6404 = true;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field6405 = 0;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "[I")
    public static int[] field6402 = new int[3];

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "[I")
    public static int[] field6408 = new int[14];

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "[I")
    public static int[] field6411 = new int[500];

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "C")
    private char field6410;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public int field6413;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Ljava/lang/String;")
    public String field6403;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([ILom;Lom;B)V")
    public static final void method2674(int[] arg0, class344 arg1, class344 arg2, byte arg3) {
        class217.field3305 = arg2;
        class292.field4390 = arg1;
        if (arg0 != null) {
            class636.field9175 = arg0;
        }
        field6415++;
        if (arg3 <= 3) {
            method2678(11, -109, 72, 98, 16, -97, 75, -24, 76);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)V")
    public static final void method2675(int arg0, boolean arg1) {
        field6409++;
        while (class126.field2299.method3655(1092933384, class478.field6872) >= 15) {
            int var2 = class126.field2299.method3648(-110, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class436 var4 = (class436) class208.field3179.method2596((long) var2, 117);
            if (var4 == null) {
                class22 var5 = new class22();
                var5.field8728 = var2;
                var4 = new class436(var5);
                class208.field3179.method2598(var4, (long) var2, (byte) 8);
                class459.field6542[class39.field1062++] = var4;
                var3 = true;
            }
            class22 var6 = var4.field6298;
            class367.field5444[class363.field5389++] = var2;
            var6.field8683 = class336.field5031;
            if (var6.field880 != null && var6.field880.method2149(false)) {
                class398.method2450(var6, (byte) -107);
            }
            int var7;
            if (arg1) {
                var7 = class126.field2299.method3648(-122, 8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class126.field2299.method3648(105, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            int var8 = class126.field2299.method3648(119, 1);
            if (var8 == 1) {
                class623.field9010[class398.field5793++] = var2;
            }
            int var9 = class126.field2299.method3648(-73, 1);
            int var10 = (class126.field2299.method3648(68, 3) + 4 & 0xAF000007) << 11;
            var6.method461((byte) 112, class317.field4681.method806(class126.field2299.method3648(-88, 14), 1));
            int var11 = class126.field2299.method3648(-103, 2);
            int var12;
            if (arg1) {
                var12 = class126.field2299.method3648(-60, 8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = class126.field2299.method3648(-68, 5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            var6.method3459(var6.field880.field4978, 113);
            var6.field8675 = var6.field880.field4935 << 3;
            if (var3) {
                var6.method3454(var10, 0, true);
            }
            var6.method445(0, class532.field7456.field8785[0] + var7, var11, var9 == 1, var6.method3446(0), class532.field7456.field8787[0] + var12);
            if (var6.field880.method2149(false)) {
                class461.method2759(var6.field9814, (byte) -44, null, var6.field8787[0], 0, var6, null, var6.field8785[0]);
            }
        }
        class126.field2299.method3647(-123);
        if (arg0 >= -125) {
            method2675(-114, false);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
    public static void method2676(byte arg0) {
        if (arg0 > 2) {
            field6411 = null;
            field6402 = null;
            field6408 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
    public final boolean method2677(int arg0) {
        if (arg0 <= 69) {
            this.method2679(null, -4, 33);
        }
        field6412++;
        return this.field6410 == 's';
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6414++;
        if (arg3 >= 1 && arg6 >= 1 && (class675.field9604 - 2) >= arg3 && arg6 <= class218.field3316 - 2) {
            int var9 = arg8;
            if (arg8 < 3 && class89.method868(5125, arg3, arg6)) {
                var9 = arg8 + 1;
            }
            if (!class527.field7429.method2824(-1, class90.field1654) && !class575.method3300(class432.field6242, var9, arg6, (byte) -16, arg3)) {
                return;
            }
            if (class257.field3792 == null) {
                return;
            }
            class691.field9754.method3781(arg6, arg0, class623.field9017, arg8, -5134, class223.field3352[arg8], arg3);
            if (arg5 >= 0) {
                boolean var10 = class527.field7429.field2665;
                class527.field7429.field2665 = true;
                class691.field9754.method3783(arg8, class223.field3352[arg8], class623.field9017, arg3, arg6, -18839, arg5, arg4, arg7, arg2, var9);
                class527.field7429.field2665 = var10;
            }
        }
        if (arg1 != -2) {
            method2675(-76, false);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lqh;II)V")
    private final void method2679(class61 arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            this.field6410 = class370.method2344(-7588, arg0.method710((byte) 43));
        } else if (arg1 == 2) {
            this.field6413 = arg0.method730(arg2 - 84);
        } else if (arg1 == 4) {
            this.field6404 = false;
        } else if (arg1 == 5) {
            this.field6403 = arg0.method747(14598);
        }
        field6406++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lqh;B)V")
    public final void method2680(class61 arg0, byte arg1) {
        int var3 = -23 % ((arg1 + 65) / 49);
        field6407++;
        while (true) {
            int var4 = arg0.method732(-559537960);
            if (var4 == 0) {
                return;
            }
            this.method2679(arg0, var4, -2);
        }
    }
}
