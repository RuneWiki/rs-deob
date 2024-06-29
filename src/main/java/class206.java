import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class206 {

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "Lh;")
    private class571 field2902 = new class571(128);

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "Lan;")
    private class21 field2897;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field2894 = 0;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "Lml;")
    public static class325 field2903 = new class325(11, 19);

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "S")
    public static short field2904 = 1;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "Lra;")
    public static class91 field2905;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
    public final void method1251(byte arg0) {
        field2893++;
        class571 var2 = this.field2902;
        synchronized (this.field2902) {
            this.field2902.method3246(false);
        }
        if (arg0 > -118) {
            method1255(35, 124L);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V")
    public final void method1252(int arg0, int arg1) {
        field2895++;
        if (arg1 != 0) {
            method1257(-34);
        }
        class571 var3 = this.field2902;
        synchronized (this.field2902) {
            this.field2902.method3253(arg0, arg1 ^ 0xFFFFFF85);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)Lgo;")
    public final class537 method1253(byte arg0, int arg1) {
        field2898++;
        class571 var3 = this.field2902;
        class537 var4;
        synchronized (this.field2902) {
            var4 = (class537) this.field2902.method3252((long) arg1, (byte) 95);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field2897;
        byte[] var6;
        synchronized (this.field2897) {
            var6 = this.field2897.method240(1, arg1, (byte) -124);
        }
        class537 var7 = new class537();
        if (var6 != null) {
            var7.method3086(new class11(var6), true);
        }
        class571 var8 = this.field2902;
        synchronized (this.field2902) {
            if (arg0 != -89) {
                field2903 = null;
            }
            this.field2902.method3243(var7, (long) arg1, arg0 - 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lvs;IIII)V")
    public static final void method1254(class508 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class299.method1901(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class332.field4447) {
            class299.method1901(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class299.method1901(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class34.field624) {
            class299.method1901(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class34.field624) {
            class299.method1901(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class332.field4447 && arg4 <= class34.field624) {
            class299.method1901(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class299.method1901(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class332.field4447 && arg4 > 0) {
            class299.method1901(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IJ)V")
    public static final void method1255(int arg0, long arg1) {
        field2900++;
        int var3 = class592.field8507;
        int var4 = class312.field4212;
        if (class487.field6841 != var3) {
            int var5 = var3 - class487.field6841;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class487.field6841 += var6;
        }
        if (!class491.field6875.field3369) {
            class1.field13 += (float) arg1 * class309.field4169 / 40.0F * 8.0F;
            class18.field224 += (float) arg1 * class301.field4121 / 40.0F * 8.0F;
        }
        if (class414.field5848 != var4) {
            int var7 = var4 - class414.field5848;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class414.field5848 += var8;
        }
        if (arg0 < 115) {
            method1255(-75, -75L);
        }
        class489.method2839(16384);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
    public final void method1256(boolean arg0) {
        field2899++;
        class571 var2 = this.field2902;
        synchronized (this.field2902) {
            this.field2902.method3248(0);
            if (arg0) {
                field2905 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
    public static void method1257(int arg0) {
        field2905 = null;
        if (arg0 <= 97) {
            field2905 = null;
        }
        field2903 = null;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1258(String arg0, int arg1, int arg2) {
        field2896++;
        class314 var3 = class483.method2819(2, arg1, 21303);
        var3.method1959(arg2 ^ 0x2404);
        var3.field4228 = arg0;
        if (arg2 != 26965) {
            field2905 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class206(class111 arg0, int arg1, class21 arg2) {
        this.field2897 = arg2;
        this.field2897.method231(1, -119);
    }
}
