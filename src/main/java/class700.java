import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class700 extends class578 {

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Z")
    public static boolean field9719 = false;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "B")
    public byte field9720;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public int field9725;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Lee;")
    public class677 field9727;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ic", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field9728;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3947(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z", line = 3)
    public static final boolean method3943(int arg0, Class arg1, String arg2) {
        ++field9722;
        if (arg0 != 492219900) {
            return false;
        } else {
            Class var3 = (Class) class18.field241.get(arg2);
            if (var3 != null) {
                return var3.getClassLoader() == arg1.getClassLoader();
            } else {
                File var4 = null;
                if (var4 == null) {
                    var4 = (File) class271.field3787.get(arg2);
                }
                if (var4 != null) {
                    try {
                        var4 = new File(var4.getCanonicalPath());
                        Class var5 = Class.forName("java.lang.Runtime");
                        Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                        Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                        Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                        var7.invoke(var8, Boolean.TRUE);
                        var8.invoke(Runtime.getRuntime(), arg1, var4.getPath());
                        var7.invoke(var8, Boolean.FALSE);
                        class18.field241.put(arg2, arg1);
                        return true;
                    } catch (NoSuchMethodException var9) {
                        System.load(var4.getPath());
                        class18.field241.put(arg2, field9728 != null ? field9728 : (field9728 = method3947("km")));
                        return true;
                    } catch (Throwable var10) {
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I", line = 74)
    public final int method3170(int arg0) {
        ++field9721;
        if (arg0 != 0) {
            return 2;
        } else {
            return this.field9727 == null ? 0 : this.field9727.field9419 * 100 / (this.field9727.field9399.length - this.field9720);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ld;Lha;B)V", line = 91)
    public static final void method3944(class152 arg0, class59 arg1, byte arg2) {
        ++field9726;
        if (class744.field10336 != null) {
            if (class178.field2687 < 10) {
                if (!class744.field10333.method2227(class744.field10336.field8500, true)) {
                    class178.field2687 = class135.field2156.method2212(-7, class744.field10336.field8500) / 10;
                    return;
                }
                class69.method571((byte) 37);
                class178.field2687 = 10;
            }
            if (class178.field2687 == 10) {
                class744.field10370 = class744.field10336.field8492 >> 6 << 6;
                class744.field10371 = class744.field10336.field8482 >> 6 << 6;
                class744.field10367 = (class744.field10336.field8483 >> 6 << 6) + -class744.field10370 + 64;
                class744.field10359 = (class744.field10336.field8496 >> 6 << 6) - class744.field10371 - -64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class744.field10336.method3505(var3, class503.field6752 - -(class472.field6475.field3505 >> 9), (class472.field6475.field3502 >> 9) + class334.field4757, class472.field6475.field3508, 0)) {
                    var5 = var3[2] + -class744.field10371;
                    var4 = var3[1] + -class744.field10370;
                }
                if (!class580.field7614 && var4 >= 0 && ~class744.field10367 < ~var4 && var5 >= 0 && ~class744.field10359 < ~var5) {
                    int var6 = var5 + -5 + (int) (Math.random() * 10.0D);
                    int var7 = var4 + -5 + (int) (10.0D * Math.random());
                    class194.field2929 = var7;
                    class432.field5949 = var6;
                } else if (class473.field6488 != -1 && ~class672.field9327 != 0) {
                    class744.field10336.method3508(class473.field6488, var3, class672.field9327, -79);
                    if (var3 != null) {
                        class194.field2929 = var3[1] + -class744.field10370;
                        class432.field5949 = var3[2] + -class744.field10371;
                    }
                    class672.field9327 = -1;
                    class473.field6488 = -1;
                    class580.field7614 = false;
                } else {
                    class744.field10336.method3508(class744.field10336.field8486 >> 14 & 16383, var3, 16383 & class744.field10336.field8486, -28);
                    class194.field2929 = var3[1] - class744.field10370;
                    class432.field5949 = var3[2] + -class744.field10371;
                }
                if (~class744.field10336.field8495 == -38) {
                    class744.field10349 = 3.0F;
                    class744.field10350 = 3.0F;
                } else if (~class744.field10336.field8495 != -51) {
                    if (~class744.field10336.field8495 == -76) {
                        class744.field10349 = 6.0F;
                        class744.field10350 = 6.0F;
                    } else if (class744.field10336.field8495 != 100) {
                        if (~class744.field10336.field8495 != -201) {
                            class744.field10349 = 8.0F;
                            class744.field10350 = 8.0F;
                        } else {
                            class744.field10349 = 16.0F;
                            class744.field10350 = 16.0F;
                        }
                    } else {
                        class744.field10349 = 8.0F;
                        class744.field10350 = 8.0F;
                    }
                } else {
                    class744.field10349 = 4.0F;
                    class744.field10350 = 4.0F;
                }
                class744.field10348 = (int) class744.field10349 >> 1;
                class744.field10344 = class94.method699(0, class744.field10348);
                class229.method1457((byte) -7);
                class744.method4159();
                class668.field9127 = new class2();
                class744.field10342 += (int) (Math.random() * 5.0D) - 2;
                if (~class744.field10342 > 7) {
                    class744.field10342 = -8;
                }
                if (class744.field10342 > 8) {
                    class744.field10342 = 8;
                }
                class744.field10347 += -2 + (int) (Math.random() * 5.0D);
                if (~class744.field10347 > 15) {
                    class744.field10347 = -16;
                }
                if (~class744.field10347 < -17) {
                    class744.field10347 = 16;
                }
                class744.method4171(arg0, class744.field10342 >> 2 << 10, class744.field10347 >> 1);
                class744.field10338.method3193(1024, (byte) -115, 256);
                class744.field10337.method1620(1, 256, 256);
                class744.field10339.method2012(4096, true);
                class224.field3172.method2590(256, -886);
                class178.field2687 = 20;
            } else {
                if (arg2 > -76) {
                    method3944((class152) null, (class59) null, (byte) -113);
                }
                if (class178.field2687 == 20) {
                    class460.method2612(-16777216, true);
                    class744.method4172(arg1, class744.field10342, class744.field10347);
                    class178.field2687 = 60;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                } else if (~class178.field2687 == -61) {
                    if (class744.field10333.method2209(class744.field10336.field8500 + "_staticelements", false)) {
                        if (!class744.field10333.method2227(class744.field10336.field8500 + "_staticelements", true)) {
                            return;
                        }
                        class744.field10346 = class102.method763(class142.field2266, class744.field10333, 255, class744.field10336.field8500 + "_staticelements");
                    } else {
                        class744.field10346 = new class362(0);
                    }
                    class744.method4175();
                    class178.field2687 = 70;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                } else if (~class178.field2687 == -71) {
                    class607.field7987 = new class340(arg1, 11, true, class295.field4217);
                    class178.field2687 = 73;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                } else if (~class178.field2687 == -74) {
                    class141.field2264 = new class340(arg1, 12, true, class295.field4217);
                    class178.field2687 = 76;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                } else if (class178.field2687 == 76) {
                    class565.field7435 = new class340(arg1, 14, true, class295.field4217);
                    class178.field2687 = 79;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                } else if (class178.field2687 == 79) {
                    class668.field9129 = new class340(arg1, 17, true, class295.field4217);
                    class178.field2687 = 82;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                } else if (class178.field2687 == 82) {
                    class410.field5685 = new class340(arg1, 19, true, class295.field4217);
                    class178.field2687 = 85;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                } else if (class178.field2687 == 85) {
                    class363.field5115 = new class340(arg1, 22, true, class295.field4217);
                    class178.field2687 = 88;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                } else if (class178.field2687 == 88) {
                    class288.field4082 = new class340(arg1, 26, true, class295.field4217);
                    class178.field2687 = 91;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                } else {
                    class127.field2094 = new class340(arg1, 30, true, class295.field4217);
                    class178.field2687 = 100;
                    class460.method2612(-16777216, true);
                    class308.method1901(0);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Log;", line = 324)
    public static final class649 method3945(int arg0, int arg1, int arg2) {
        class701 var3 = class660.field8718[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9739;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)[B", line = 331)
    public final byte[] method3171(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field9724;
            if (!super.field7580 && this.field9727.field9419 >= this.field9727.field9399.length + -this.field9720) {
                return this.field9727.field9399;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILwd;)Z", line = 351)
    public static final boolean method3946(int arg0, int arg1, class276 arg2) {
        ++field9723;
        int var3 = arg2.method1664(2059, arg0);
        if (var3 == 0) {
            if (arg2.method1664(2059, 1) != 0) {
                method3946(2, arg1, arg2);
            }
            int var4 = arg2.method1664(arg0 ^ 2057, 6);
            int var5 = arg2.method1664(arg0 + 2057, 6);
            boolean var6 = arg2.method1664(2059, 1) == 1;
            if (var6) {
                class189.field2853[class408.field5673++] = arg1;
            }
            if (class248.field3438[arg1] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class753 var7 = class32.field496[arg1];
                class383 var8 = class248.field3438[arg1] = new class383();
                var8.field10297 = arg1;
                if (class388.field5407[arg1] != null) {
                    var8.method2260(true, class388.field5407[arg1]);
                }
                var8.method4143((byte) -17, var7.field10499, true);
                var8.field10287 = var7.field10497;
                int var9 = var7.field10494;
                int var10 = var9 >> 28;
                int var11 = 255 & var9 >> 14;
                int var12 = var9 & 255;
                int var13 = (var11 << 6) - -var4 + -class503.field6752;
                int var14 = (var12 << 6) + var5 + -class334.field4757;
                var8.field5349 = var7.field10495;
                var8.field10312[0] = class261.field3636[arg1];
                var8.field3508 = var8.field3515 = (byte) var10;
                if (class498.method2810(-10387, var13, var14)) {
                    ++var8.field3515;
                }
                var8.method2262(var14, var13, (byte) -111);
                var8.field5360 = false;
                class32.field496[arg1] = null;
                return true;
            }
        } else if (~var3 == -2) {
            int var15 = arg2.method1664(2059, 2);
            int var16 = class32.field496[arg1].field10494;
            class32.field496[arg1].field10494 = (805306368 & (var16 >> 28) + var15 << 28) + (268435455 & var16);
            return false;
        } else if (var3 == 2) {
            int var17 = arg2.method1664(2059, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class32.field496[arg1].field10494;
            int var21 = (var20 >> 28) - -var18 & 3;
            int var22 = (var20 & 4187615) >> 14;
            int var23 = 255 & var20;
            if (var19 == 0) {
                --var22;
                --var23;
            }
            if (~var19 == -2) {
                --var23;
            }
            if (var19 == 2) {
                ++var22;
                --var23;
            }
            if (var19 == 3) {
                --var22;
            }
            if (~var19 == -5) {
                ++var22;
            }
            if (var19 == 5) {
                ++var23;
                --var22;
            }
            if (var19 == 6) {
                ++var23;
            }
            if (~var19 == -8) {
                ++var22;
                ++var23;
            }
            class32.field496[arg1].field10494 = (var22 << 14) + ((var21 << 28) - -var23);
            return false;
        } else {
            int var24 = arg2.method1664(2059, 18);
            int var25 = var24 >> 16;
            int var26 = 255 & var24 >> 8;
            int var27 = 255 & var24;
            int var28 = class32.field496[arg1].field10494;
            int var29 = 3 & (var28 >> 28) - -var25;
            int var30 = 255 & (var28 >> 14) + var26;
            int var31 = 255 & var27 + var28;
            class32.field496[arg1].field10494 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }
}
