import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class208 extends class50 {

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "Leb;")
    public class395 field2930 = new class395();

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "Ln;")
    public class27 field2942 = new class27();

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lnr;")
    private class450 field2939;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "[S")
    public static short[] field2928 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "[B")
    public static byte[] field2932 = new byte[32896];

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "Leb;")
    public static class395 field2940;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[IILwh;II)V")
    private final void method1434(byte arg0, int[] arg1, int arg2, class322 arg3, int arg4, int arg5) {
        field2929++;
        if (arg0 < 78) {
            return;
        }
        if ((this.field2939.field6575[arg3.field4738] & 0x4) != 0 && arg3.field4740 < 0) {
            int var7 = this.field2939.field6580[arg3.field4738] / class298.field4331;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field4749) / var7;
                if (var8 > arg5) {
                    arg3.field4749 += arg5 * var7;
                    break;
                }
                arg3.field4730.method277(arg1, arg4, var8);
                arg5 -= var8;
                arg4 += var8;
                arg3.field4749 += var7 * var8 - 1048576;
                int var9 = class298.field4331 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class190 var11 = arg3.field4730;
                if (this.field2939.field6607[arg3.field4738] == 0) {
                    arg3.field4730 = class190.method1312(arg3.field4756, var11.method1320(), var11.method1324(), var11.method1327());
                } else {
                    arg3.field4730 = class190.method1312(arg3.field4756, var11.method1320(), 0, var11.method1327());
                    this.field2939.method2793(arg3.field4757.field481[arg3.field4729] < 0, arg3, (byte) 27);
                    arg3.field4730.method1321(var9, var11.method1324());
                }
                if (arg3.field4757.field481[arg3.field4729] < 0) {
                    arg3.field4730.method1333(-1);
                }
                var11.method1331(var9);
                var11.method277(arg1, arg4, arg2 - arg4);
                if (var11.method1300()) {
                    this.field2942.method276(var11);
                }
            }
        }
        arg3.field4730.method277(arg1, arg4, arg5);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()Lar;")
    public final class50 method283() {
        field2936++;
        class322 var1 = (class322) this.field2930.method2478(1603);
        if (var1 == null) {
            return null;
        } else if (var1.field4730 == null) {
            return this.method281();
        } else {
            return var1.field4730;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lwh;BI)V")
    private final void method1435(class322 arg0, byte arg1, int arg2) {
        if ((this.field2939.field6575[arg0.field4738] & 0x4) != 0 && arg0.field4740 < 0) {
            int var4 = this.field2939.field6580[arg0.field4738] / class298.field4331;
            int var5 = (1048575 - (arg0.field4749 - var4)) / var4;
            arg0.field4749 = arg2 * var4 + arg0.field4749 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2939.field6607[arg0.field4738] == 0) {
                    arg0.field4730 = class190.method1312(arg0.field4756, arg0.field4730.method1320(), arg0.field4730.method1324(), arg0.field4730.method1327());
                } else {
                    arg0.field4730 = class190.method1312(arg0.field4756, arg0.field4730.method1320(), 0, arg0.field4730.method1327());
                    this.field2939.method2793(arg0.field4757.field481[arg0.field4729] < 0, arg0, (byte) 27);
                }
                if (arg0.field4757.field481[arg0.field4729] < 0) {
                    arg0.field4730.method1333(-1);
                }
                arg2 = arg0.field4749 / var4;
            }
        }
        if (arg1 != -7) {
            field2932 = null;
        }
        field2938++;
        arg0.field4730.method286(arg2);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method1436(byte arg0) {
        field2928 = null;
        field2940 = null;
        field2932 = null;
        if (arg0 != 26) {
            method1436((byte) -50);
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "()I")
    public final int method284() {
        field2931++;
        return 0;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public final void method286(int arg0) {
        field2934++;
        this.field2942.method286(arg0);
        for (class322 var2 = (class322) this.field2930.method2478(1603); var2 != null; var2 = (class322) this.field2930.method2486((byte) -82)) {
            if (!this.field2939.method2796((byte) -81, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field4753 >= var3) {
                        this.method1435(var2, (byte) -7, var3);
                        var2.field4753 -= var3;
                        break;
                    }
                    this.method1435(var2, (byte) -7, var2.field4753);
                    var3 -= var2.field4753;
                } while (!this.field2939.method2782(0, var2, false, var3, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(J[IZI)Ljava/lang/String;")
    public static final String method1437(long arg0, int[] arg1, boolean arg2, int arg3) {
        field2935++;
        if (arg2) {
            field2940 = null;
        }
        if (class408.field5876 != null) {
            String var5 = class408.field5876.method1635(arg1, arg3, arg0, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "([III)V")
    public final void method277(int[] arg0, int arg1, int arg2) {
        field2937++;
        this.field2942.method277(arg0, arg1, arg2);
        for (class322 var4 = (class322) this.field2930.method2478(1603); var4 != null; var4 = (class322) this.field2930.method2486((byte) -82)) {
            if (!this.field2939.method2796((byte) -92, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field4753) {
                        this.method1434((byte) 105, arg0, var5 + var6, var4, var5, var6);
                        var4.field4753 -= var6;
                        break;
                    }
                    this.method1434((byte) 119, arg0, var5 + var6, var4, var5, var4.field4753);
                    var5 += var4.field4753;
                    var6 -= var4.field4753;
                } while (!this.field2939.method2782(var5, var4, false, var6, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "()Lar;")
    public final class50 method281() {
        field2941++;
        class322 var1;
        do {
            var1 = (class322) this.field2930.method2486((byte) -82);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4730 == null);
        return var1.field4730;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lnr;)V")
    public class208(class450 arg0) {
        this.field2939 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2932[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field2940 = new class395();
    }
}
