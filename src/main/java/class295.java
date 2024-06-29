import java.io.IOException;
import java.net.Socket;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class295 extends class138 {

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "Lck;")
    private class119 field4891 = class206.field3267;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "Lnativeadvert/browsercontrol;")
    public static browsercontrol field4900 = null;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "Lck;")
    public static class119 field4892 = class298.method1987((byte) 52, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "[S")
    public static short[] field4896 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field4907 = 0;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "Z")
    public static boolean field4914 = true;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "S")
    public static short field4913 = 256;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "Z")
    public static boolean field4909 = true;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    private int field4894;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public int field4898;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    public int field4908;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "Lvh;")
    private class212 field4912;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "Lwi;")
    public static class23 field4901;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 6)
    public static final void method1962(Object[] arg0, long[] arg1, int arg2) {
        class269.method1785(arg1, arg2, arg0, arg1.length - 1, arg2 + 1374812652);
        field4895++;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V", line = 15)
    public static final void method1963(int arg0) {
        field4899++;
        if (class154.field2448 == arg0) {
            return;
        }
        try {
            if (class154.field2448 == 1) {
                if (class3.field82.field4496 == 2) {
                    throw new IOException();
                }
                if (class3.field82.field4496 != 1) {
                    return;
                }
                class44.field660 = new class253((Socket) class3.field82.field4499, class220.field3533);
                class3.field82 = null;
                class44.field660.method1630(0, class6.field149.field44, (byte) -70, class6.field149.field101);
                class22.field333.field44 = 0;
                class154.field2448 = 2;
            }
            if (class154.field2448 == 2) {
                if (class49.field767 != null) {
                    class49.field767.method307(arg0 ^ 0x4000);
                }
                if (class195.field3110 != null) {
                    class195.field3110.method307(arg0 ^ 0x4000);
                }
                int var1 = class44.field660.method1632((byte) -118);
                if (class49.field767 != null) {
                    class49.field767.method307(arg0 + 16384);
                }
                if (class195.field3110 != null) {
                    class195.field3110.method307(16384);
                }
                if (var1 < 0) {
                    return;
                }
                if (class211.field3366 == 1) {
                    if (var1 == 0) {
                        class281.field4642 = 3;
                    } else {
                        class281.field4642 = var1;
                    }
                }
                if (class211.field3366 == 2) {
                    if (var1 == 0) {
                        class42.field644 = 3;
                    } else if (var1 == 21) {
                        class154.field2448 = 3;
                        return;
                    } else {
                        class42.field644 = var1;
                    }
                }
                class154.field2448 = 0;
                if (class211.field3366 == 3) {
                    if (var1 == 0) {
                        class202.field3199 = 3;
                    } else {
                        class202.field3199 = var1;
                    }
                }
                class211.field3366 = 0;
                if (class44.field660 != null) {
                    class44.field660.method1629(-65);
                }
                class44.field660 = null;
            }
            if (class154.field2448 == 3) {
                int var2 = class44.field660.method1633(88);
                if (var2 > 0) {
                    class35.field480 = new class119[class44.field660.method1632((byte) -126)];
                    class154.field2448 = 4;
                }
            }
            if (class154.field2448 == 4) {
                int var3 = class44.field660.method1633(102);
                if (class35.field480.length * 8 <= var3) {
                    class22.field333.field44 = 0;
                    class44.field660.method1627(0, (byte) 74, class35.field480.length * 8, class22.field333.field101);
                    for (int var4 = 0; var4 < class35.field480.length; var4++) {
                        class35.field480[var4] = class147.method963((byte) 0, class22.field333.method43(-118));
                    }
                    class154.field2448 = 0;
                    class42.field644 = 21;
                    class211.field3366 = 0;
                    if (class44.field660 != null) {
                        class44.field660.method1629(-82);
                    }
                    class44.field660 = null;
                }
            }
        } catch (IOException var6) {
            class281.field4642 = 3;
            class42.field644 = 3;
            class211.field3366 = 0;
            class154.field2448 = 0;
            class202.field3199 = 3;
            if (class44.field660 != null) {
                class44.field660.method1629(-122);
            }
            class44.field660 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lck;", line = 169)
    public final class119 method1964(int arg0, int arg1) {
        field4904++;
        if (this.field4912 == null) {
            return this.field4891;
        } else {
            class99 var3 = (class99) this.field4912.method1329((byte) 90, (long) arg1);
            int var4 = -105 % ((arg0 + 56) / 32);
            return var3 == null ? this.field4891 : var3.field1510;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLfj;)V", line = 193)
    public final void method1965(byte arg0, class3 arg1) {
        while (true) {
            int var3 = arg1.method64((byte) 16);
            if (var3 == 0) {
                if (arg0 > -95) {
                    field4914 = true;
                }
                field4905++;
                return;
            }
            this.method1970(-71, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V", line = 225)
    public static void method1966(int arg0) {
        field4901 = null;
        if (arg0 == 6359) {
            field4892 = null;
            field4896 = null;
            field4900 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIBI)V", line = 239)
    public static final void method1967(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4906++;
        if (arg0 == arg1) {
            class134.method887(arg1, arg3, arg5, (byte) -101, arg2);
            return;
        }
        if (arg4 >= -104) {
            method1967(-17, -126, 10, 91, (byte) -22, 40);
        }
        if (class79.field1226 <= arg5 - arg1 && class59.field957 >= (arg5 + arg1) && arg3 - arg0 >= class108.field1650 && class236.field3800 >= arg0 + arg3) {
            class260.method1672(arg2, arg3, arg5, arg0, arg1, 19661070);
        } else {
            class7.method89(arg5, 85, arg3, arg1, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIFZZ)[[I", line = 265)
    public static final int[][] method1968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, boolean arg7, boolean arg8) {
        field4893++;
        class103 var9 = new class103();
        if (!arg7) {
            return (int[][]) ((int[][]) null);
        }
        var9.field1579 = arg2;
        int[][] var10 = new int[arg5][arg1];
        var9.field1564 = arg3;
        var9.field1562 = (int) (arg6 * 4096.0F);
        var9.field1575 = arg0;
        var9.field1580 = arg8;
        var9.method14(2048879374);
        class273.method1806(arg1, (byte) 120, arg5);
        for (int var11 = 0; var11 < arg5; var11++) {
            var9.method676(-9, var10[var11], var11);
        }
        return var10;
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)[Lmd;", line = 294)
    public static final class88[] method1969(int arg0) {
        field4911++;
        class88[] var1 = new class88[class285.field4706];
        for (int var2 = arg0; var2 < class285.field4706; var2++) {
            byte[] var3 = class247.field3989[var2];
            int var4 = class64.field1006[var2] * class232.field3741[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class161.field2553[class19.method151(var3[var6], 255)];
            }
            var1[var2] = new class160(class227.field3641, class207.field3304, class155.field2475[var2], class7.field152[var2], class232.field3741[var2], class64.field1006[var2], var5);
        }
        class162.method1035(-20432);
        return var1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILfj;I)V", line = 346)
    private final void method1970(int arg0, class3 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4898 = arg1.method64((byte) 6);
        } else if (arg2 == 2) {
            this.field4908 = arg1.method64((byte) 87);
        } else if (arg2 == 3) {
            this.field4891 = arg1.method41((byte) -127);
        } else if (arg2 == 4) {
            this.field4894 = arg1.method71(-668527048);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method63((byte) 1);
            this.field4912 = new class212(class140.method925(var4, (byte) 116));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method71(-668527048);
                class79 var7;
                if (arg2 == 5) {
                    var7 = new class99(arg1.method41((byte) -123));
                } else {
                    var7 = new class204(arg1.method71(-668527048));
                }
                this.field4912.method1326((long) var6, (byte) -123, var7);
            }
        }
        field4897++;
        int var8 = 57 % ((40 - arg0) / 34);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)I", line = 412)
    public final int method1971(int arg0, int arg1) {
        field4902++;
        if (this.field4912 == null) {
            return this.field4894;
        }
        class204 var3 = (class204) this.field4912.method1329((byte) 90, (long) arg1);
        if (arg0 != 0) {
            field4907 = 10;
        }
        return var3 == null ? this.field4894 : var3.field3230;
    }
}
