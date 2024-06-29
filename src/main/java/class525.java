import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class class525 extends class410 {

    @OriginalMember(owner = "client!td", name = "B", descriptor = "S")
    public short field7417;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "Z")
    public static boolean field7422 = false;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Ljava/lang/String;")
    public static String field7419;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "Ljava/lang/String;")
    public static String field7420;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Z")
    public static boolean field7424;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Lge;")
    public static class17 field7423;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field7419 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field7420 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field7424 = false;
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)Z", line = 3)
    public final boolean method936(int arg0) {
        if (arg0 >= -85) {
            field7420 = null;
        }
        ++field7415;
        return class376.field5266[(super.field5790 >> class455.field6383) + -class337.field4349 + class267.field3381][(super.field5784 >> class455.field6383) + class267.field3381 + -class561.field7852];
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;ZI)V", line = 14)
    public static final void method3012(int arg0, String arg1, boolean arg2, int arg3) {
        class314.method1833(100);
        ++field7418;
        if (arg0 == 0) {
            class458.field6407 = class522.method3004(class524.field7407, (byte) 96, class447.field6293, class223.field2944.field631.method1463((byte) -123) * 2, class68.field939, 0);
            if (arg1 != null) {
                class458.field6407.method166(0);
                class56 var13 = class84.method595(-24181, class275.field3484, class378.field5293, 0);
                class423 var14 = class458.field6407.method156(var13, class196.method1225(class645.field8897, class275.field3484, 0), true);
                class452.method2653(256);
                class760.method4231(true, var13, class458.field6407, var14, true, arg1);
            }
        } else {
            class454 var4 = null;
            if (arg1 != null) {
                var4 = class522.method3004(class524.field7407, (byte) 59, class447.field6293, 0, class68.field939, 0);
                var4.method166(0);
                class56 var5 = class84.method595(-24181, class275.field3484, class378.field5293, 0);
                class423 var6 = var4.method156(var5, class196.method1225(class645.field8897, class275.field3484, 0), true);
                class452.method2653(256);
                class760.method4231(true, var5, var4, var6, true, arg1);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class458.field6407 = class522.method3004(class524.field7407, (byte) 22, class447.field6293, 2 * class223.field2944.field631.method1463((byte) -121), class68.field939, arg0);
                    if (arg1 != null) {
                        var4.method166(0);
                        class56 var7 = class84.method595(-24181, class275.field3484, class378.field5293, 0);
                        class423 var8 = var4.method156(var7, class196.method1225(class645.field8897, class275.field3484, 0), true);
                        class452.method2653(256);
                        class760.method4231(true, var7, var4, var8, true, arg1);
                    }
                    if (class458.field6407.method123()) {
                        boolean var9 = true;
                        try {
                            var9 = ~class241.field3102.field8654 < -257;
                        } catch (Throwable var28) {
                        }
                        class702 var10;
                        if (var9) {
                            var10 = class458.field6407.method161(146800640);
                        } else {
                            var10 = class458.field6407.method161(104857600);
                        }
                        class458.field6407.method133(var10);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var11 = class223.field2944.field633.method4191((byte) -126);
                    if (var11 == 2) {
                        class9.field96 = true;
                    }
                    class223.field2944.method346(class223.field2944.field633, 0, false);
                    method3012(var11, arg1, arg2, 18097);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var4 != null) {
                            try {
                                var4.method2658(-7);
                            } catch (Throwable var26) {
                            }
                        }
                    }
                }
                if (var4 != null) {
                    try {
                        var4.method2658(-7);
                    } catch (Throwable var25) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var4 != null) {
                try {
                    var4.method2658(-7);
                } catch (Throwable var27) {
                }
            }
        }
        class223.field2944.field633.method4195(-1, !arg2);
        class223.field2944.method346(class223.field2944.field633, arg0, false);
        class283.method1703(-6);
        if (arg3 == 18097) {
            class458.field6407.method164(10000);
            class458.field6407.method64(32);
            class261.field3318 = class458.field6407.method125();
            class290.field3732 = class458.field6407.method125();
            class519.method2983(true);
            class458.field6407.method65(~class223.field2944.field592.method1469((byte) -125) == -2);
            if (class458.field6407.method171()) {
                class219.method1364(class223.field2944.field594.method436((byte) -123) == 1, -1150);
            }
            class197.method1239(class458.field6407, class613.field8591 >> 3, (byte) -78, class1.field3 >> 3);
            class37.method328((byte) -45);
            class78.field1035 = false;
            class315.field4051 = true;
            class147.field1779 = null;
            class619.method3397((byte) 114);
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(B)V", line = 140)
    public static void method3013(byte arg0) {
        field7420 = null;
        if (arg0 < 85) {
            method3013((byte) -45);
        }
        field7419 = null;
        field7423 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[Lpk;)I", line = 154)
    public final int method933(int arg0, class621[] arg1) {
        ++field7416;
        int var3 = super.field5790 >> class455.field6383;
        int var4 = super.field5784 >> class455.field6383;
        int var5 = 0;
        if (~class337.field4349 != ~var3) {
            if (class337.field4349 < var3) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (class561.field7852 != var4) {
            if (~class561.field7852 < ~var4) {
                var5 += 6;
            }
        } else {
            var5 += 3;
        }
        int var6 = class327.field4182[var5];
        if ((this.field7417 & var6) != 0) {
            return this.method2425(var3, var4, true, arg1);
        } else if (~this.field7417 == -2 && ~var3 < -1) {
            return this.method2425(var3 + -1, var4, true, arg1);
        } else if (~this.field7417 == -5 && ~class90.field1142 <= ~var3) {
            return this.method2425(var3 + 1, var4, true, arg1);
        } else if (this.field7417 == 8 && var4 > 0) {
            return this.method2425(var3, var4 + -1, true, arg1);
        } else if (~this.field7417 == -3 && var4 <= class665.field9107) {
            return this.method2425(var3, var4 - -1, true, arg1);
        } else if (this.field7417 == arg0 && var3 > 0 && var4 <= class665.field9107) {
            return this.method2425(var3 + -1, var4 + 1, true, arg1);
        } else if (~this.field7417 == -33 && class90.field1142 >= var3 && ~var4 >= ~class665.field9107) {
            return this.method2425(var3 + 1, var4 + 1, true, arg1);
        } else if (this.field7417 == 128 && var3 > 0 && ~var4 < -1) {
            return this.method2425(var3 + -1, var4 - 1, true, arg1);
        } else if (this.field7417 == 64 && ~var3 >= ~class90.field1142 && ~var4 < -1) {
            return this.method2425(var3 + 1, var4 + -1, true, arg1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(ILha;)Z", line = 232)
    public final boolean method935(int arg0, class454 arg1) {
        if (arg0 <= 64) {
            field7419 = null;
        }
        ++field7421;
        return class567.method3195(119, super.field5792, super.field5790 >> class455.field6383, this, super.field5784 >> class455.field6383);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIII)V", line = 242)
    public class525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7417 = (short) arg5;
        super.field5792 = (byte) arg4;
        super.field5790 = arg0;
        super.field5779 = (byte) arg3;
        super.field5784 = arg2;
        super.field5791 = arg1;
    }
}
