import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class436 {

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Las;")
    private class85 field6229;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lef;")
    private class284 field6218;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lbo;")
    private class435 field6227;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field6220 = 0;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
    public static int[] field6230 = new int[14];

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field6234 = 500;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Llf;")
    private class130 field6231;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[Lhs;")
    private class178[] field6224;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I", line = 5)
    public static final int method2717(boolean arg0) {
        field6236++;
        if (class213.field3016 != null) {
            return 3;
        } else if (arg0) {
            return 90;
        } else if (class199.field2845) {
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 22)
    public static void method2718(byte arg0) {
        int var1 = 30 % ((arg0 + 83) / 41);
        field6230 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILwe;Lwe;B)Lhs;", line = 35)
    public final class178 method2719(int arg0, class233 arg1, class233 arg2, byte arg3) {
        field6221++;
        int var5 = 71 / ((arg3 + 2) / 61);
        return this.method2726(arg2, 76, arg0, true, arg1);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V", line = 49)
    public static final void method2720(boolean arg0) {
        field6228++;
        int var1 = 0;
        if (class120.field1626) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        class69.method426(-693, var1);
        if (!arg0) {
            field6234 = 38;
        }
        class214.method1496(13769, var1);
        class64.method412(var1, -9571);
        class31.method170(-81, var1);
        class9.method52(-30542, var1);
        class62.method396((byte) -41, var1);
        class189.method1358(var1, 0);
        class185.method1330((byte) 66, var1);
        class316.method2107(0, var1);
        if (class423.field6041 == 10) {
            class390.method2463(28, true);
        } else if (class423.field6041 == 30) {
            class390.method2463(25, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V", line = 88)
    public static final void method2721(int arg0, int arg1, int arg2) {
        if (arg1 != 5) {
            method2721(118, -17, 127);
        }
        field6223++;
        class276 var3 = class264.method1816((byte) -88, arg2, 16);
        var3.method1876((byte) -126);
        var3.field3986 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V", line = 103)
    public static final void method2722(int arg0, int arg1) {
        if (arg0 != -16150) {
            return;
        }
        field6219++;
        class15 var2 = class19.field256;
        synchronized (class19.field256) {
            class19.field256.method91(4, arg1);
        }
        class15 var3 = class245.field3657;
        synchronized (class245.field3657) {
            class245.field3657.method91(4, arg1);
        }
        class15 var4 = class142.field2146;
        synchronized (class142.field2146) {
            class142.field2146.method91(4, arg1);
        }
        class15 var5 = class397.field5583;
        synchronized (class397.field5583) {
            class397.field5583.method91(4, arg1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V", line = 130)
    public static final void method2723(byte arg0) {
        field6235++;
        class15 var1 = class297.field4320;
        synchronized (class297.field4320) {
            class297.field4320.method102((byte) -110);
        }
        class15 var2 = class245.field3656;
        synchronized (class245.field3656) {
            if (arg0 > -108) {
                method2718((byte) -50);
            }
            class245.field3656.method102((byte) -79);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(CZ)Z", line = 149)
    public static final boolean method2724(char arg0, boolean arg1) {
        field6222++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class186.method1334(97, arg0)) {
            return true;
        } else {
            char[] var2 = class302.field4405;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            if (arg1) {
                method2717(true);
            }
            char[] var4 = class85.field1098;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Las;Lef;)V", line = 195)
    public class436(class85 arg0, class284 arg1) {
        this.field6229 = arg0;
        this.field6218 = arg1;
        if (!this.field6229.method498((byte) -17)) {
            this.field6227 = this.field6229.method504(255, (byte) 101, true, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V", line = 207)
    public final void method2725(byte arg0) {
        field6225++;
        if (this.field6224 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field6224.length; var2++) {
            if (this.field6224[var2] != null) {
                this.field6224[var2].method1277(true);
            }
        }
        int var3 = 80 / ((-arg0 - 38) / 33);
        for (int var4 = 0; var4 < this.field6224.length; var4++) {
            if (this.field6224[var4] != null) {
                this.field6224[var4].method1272((byte) -13);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lwe;IIZLwe;)Lhs;", line = 248)
    private final class178 method2726(class233 arg0, int arg1, int arg2, boolean arg3, class233 arg4) {
        field6226++;
        if (this.field6231 == null) {
            throw new RuntimeException();
        }
        this.field6231.field1880 = arg2 * 8 + 5;
        if (this.field6231.field1851.length <= this.field6231.field1880) {
            throw new RuntimeException();
        } else if (this.field6224[arg2] == null) {
            int var6 = this.field6231.method815(true);
            int var7 = this.field6231.method815(true);
            if (arg1 < 28) {
                this.method2727(-20);
            }
            class178 var8 = new class178(arg2, arg0, arg4, this.field6229, this.field6218, var6, var7, arg3);
            this.field6224[arg2] = var8;
            return var8;
        } else {
            return this.field6224[arg2];
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z", line = 288)
    public final boolean method2727(int arg0) {
        if (arg0 < 126) {
            this.field6229 = null;
        }
        field6233++;
        if (this.field6231 != null) {
            return true;
        }
        if (this.field6227 == null) {
            if (this.field6229.method498((byte) -17)) {
                return false;
            }
            this.field6227 = this.field6229.method504(255, (byte) 101, true, 255, (byte) 0);
        }
        if (this.field6227.field6348) {
            return false;
        } else {
            this.field6231 = new class130(this.field6227.method448(17484));
            this.field6224 = new class178[(this.field6231.field1851.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBLbr;)V", line = 318)
    public static final void method2728(int arg0, int arg1, byte arg2, class223 arg3) {
        if (!class269.field3935) {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class198.method1408(-16995, var4, arg3);
                if (var8 != null) {
                    class252.method1755((long) (var4 + 1), arg3.field3238, 1008, class34.method186(arg3, var4, (byte) -128), (byte) 47, var8, arg3.field3344, arg3.field3227);
                    class57.field764++;
                }
            }
            String var5 = class170.method1218(arg3, 21);
            if (var5 != null) {
                class189.field2715++;
                class252.method1755(0L, arg3.field3238, 18, arg3.field3185, (byte) 108, var5, arg3.field3344, arg3.field3227);
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class198.method1408(-16995, var6, arg3);
                if (var7 != null) {
                    class252.method1755((long) (var6 + 1), arg3.field3238, 44, class34.method186(arg3, var6, (byte) -122), (byte) -70, var7, arg3.field3344, arg3.field3227);
                    class57.field764++;
                }
            }
            if (client.method1168(arg3).method483((byte) 82)) {
                if (arg3.field3294 == null) {
                    class252.method1755(0L, "", 11, -1, (byte) 55, class19.field252.method2284((byte) -20, class309.field4497), arg3.field3344, arg3.field3227);
                } else {
                    class252.method1755(0L, "", 11, -1, (byte) -74, arg3.field3294, arg3.field3344, arg3.field3227);
                }
                class218.field3136++;
            }
        } else if (client.method1168(arg3).method482(112) && (class432.field6182 & 0x20) != 0) {
            class316.field4633++;
            class252.method1755(0L, class106.field1363 + " -> " + arg3.field3238, 23, class442.field6319, (byte) 65, class285.field4153, arg3.field3344, arg3.field3227);
        }
        field6232++;
        if (arg2 < 126) {
            field6230 = null;
        }
    }
}
