import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class223 extends class638 implements class324 {

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "Z")
    private boolean field3290 = false;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "Llm;")
    public class205 field3292;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "Z")
    private boolean field3288;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "Z")
    public static boolean field3285 = true;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ki", name = "gb", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "Lla;")
    public static class423 field3286;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "Lro;")
    private class522 field3280;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "(I)V", line = 4)
    public static void method1552(int arg0) {
        if (arg0 == -29561) {
            field3286 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;Z)V", line = 14)
    public final void method597(class543 arg0, boolean arg1) {
        ++field3296;
        if (arg1) {
            this.field3280 = null;
        }
        this.field3292.method1461(52, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V", line = 26)
    public final void method713(int arg0) {
        if (arg0 == -16221) {
            ++field3304;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(BLha;)V", line = 37)
    public final void method610(byte arg0, class543 arg1) {
        if (arg0 > 51) {
            ++field3302;
            class282 var3 = this.field3292.method1471(-2615, 262144, true, true, arg1);
            if (var3 != null) {
                class121 var4 = arg1.method342();
                var4.method845(super.field3923, super.field3922, super.field3916);
                this.field3292.method1466(super.field9035, super.field9036, var3, false, arg1, -1, super.field9042, super.field9038, var4);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)Z", line = 65)
    public final boolean method715(int arg0) {
        ++field3287;
        if (arg0 != -12888) {
            method1552(53);
        }
        return false;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V", line = 76)
    public final void method598(byte arg0) {
        if (arg0 <= -9) {
            ++field3294;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I", line = 86)
    public final int method601(byte arg0) {
        if (arg0 < 86) {
            this.method606(125);
        }
        ++field3298;
        return this.field3292.field3063;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)I", line = 97)
    public final int method599(byte arg0) {
        if (arg0 >= -4) {
            this.method606(123);
        }
        ++field3303;
        return this.field3292.method1464(0);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(BLha;)Lro;", line = 110)
    public final class522 method602(byte arg0, class543 arg1) {
        if (arg0 >= -114) {
            return null;
        } else {
            ++field3282;
            return this.field3280;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;I)V", line = 121)
    public final void method608(class543 arg0, int arg1) {
        ++field3289;
        this.field3292.method1468(arg0, -113);
        int var3 = 52 % ((arg1 - 68) / 32);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljc;B)V", line = 133)
    public static final void method1553(class168 arg0, byte arg1) {
        ++field3293;
        arg0.method1203(-26008);
        int var2 = class652.field9348;
        class639 var3 = class108.field1536 = class536.field7796[var2] = new class639();
        var3.field4592 = var2;
        int var4 = arg0.method1206(30, (byte) -90);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 16383;
        var3.field4646[0] = -class41.field693 + var6;
        int var7 = 16383 & var4;
        var3.field3923 = (var3.field4646[0] << 9) + (var3.method2053(true) << 8);
        var3.field4645[0] = -class71.field1085 + var7;
        if (arg1 != 55) {
            field3285 = false;
        }
        var3.field3916 = (var3.field4645[0] << 9) + (var3.method2053(true) << 8);
        class687.field9758 = var3.field3920 = var3.field3924 = var5;
        if (class547.method3292((byte) -113, var3.field4645[0], var3.field4646[0])) {
            ++var3.field3924;
        }
        if (class481.field6874[var2] != null) {
            var3.method3680(class481.field6874[var2], (byte) -67);
        }
        class468.field6665 = 0;
        class38.field500[class468.field6665++] = var2;
        class64.field1011[var2] = 0;
        class247.field3606 = 0;
        for (int var8 = 1; var8 < 2048; ++var8) {
            if (var2 != var8) {
                int var9 = arg0.method1206(18, (byte) -90);
                int var10 = var9 >> 16;
                int var11 = (65303 & var9) >> 8;
                int var12 = 255 & var9;
                class374 var13 = class139.field1905[var8] = new class374();
                var13.field5413 = 0;
                var13.field5417 = (var10 << 28) - -(var11 << 14) + var12;
                var13.field5414 = -1;
                var13.field5418 = false;
                class669.field9537[class247.field3606++] = var8;
                class64.field1011[var8] = 0;
            }
        }
        arg0.method1208((byte) 91);
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)Z", line = 208)
    public final boolean method607(byte arg0) {
        ++field3297;
        int var2 = -9 % ((27 - arg0) / 62);
        return false;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lha;Lrq;IIIIIZIIIIIII)V", line = 223)
    public class223(class543 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field6926 == -2, class326.method2015(arg12, 4620, arg13));
        this.field3292 = new class205(arg0, arg1, arg12, arg13, super.field3920, arg3, this, arg7, arg14);
        this.field3288 = arg1.field6903 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)I", line = 240)
    public final int method595(int arg0) {
        if (arg0 != 32767) {
            this.method715(36);
        }
        ++field3283;
        return this.field3292.method1467(-1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLha;)Lqs;", line = 253)
    public final class603 method613(byte arg0, class543 arg1) {
        ++field3299;
        class282 var3 = this.field3292.method1471(-2615, 2048, true, false, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 76) {
                this.field3290 = true;
            }
            class121 var4 = arg1.method342();
            var4.method845(super.field3923, super.field3922, super.field3916);
            class603 var5 = class6.method26(this.field3288, -120, 1);
            this.field3292.method1466(super.field9035, super.field9036, var3, true, arg1, -1, super.field9042, super.field9038, var4);
            if (!class100.field1447) {
                var3.method533(var4, var5.field8543[0], 0);
            } else {
                var3.method503(var4, var5.field8543[0], class680.field9660, 0);
            }
            if (this.field3292.field3096 != null) {
                class458 var6 = this.field3292.field3096.method127();
                if (class100.field1447) {
                    arg1.method216(var6, class680.field9660);
                } else {
                    arg1.method214(var6);
                }
            }
            this.field3290 = var3.method497() || this.field3292.field3096 != null;
            if (this.field3280 == null) {
                this.field3280 = class222.method1551(var3, super.field3923, super.field3922, super.field3916, 34);
            } else {
                class745.method4158(super.field3922, super.field3916, var3, super.field3923, 42, this.field3280);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)I", line = 299)
    public final int method606(int arg0) {
        if (arg0 > -32) {
            this.method711(-79, (class280) null, (class543) null, (byte) -67, 83, true, 58);
        }
        ++field3281;
        return this.field3292.field3091;
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(B)Z", line = 314)
    public final boolean method614(byte arg0) {
        ++field3291;
        int var2 = 5 % ((arg0 - -38) / 63);
        return this.field3290;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjw;Lha;BIZI)V", line = 325)
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        ++field3284;
        if (arg3 < 28) {
            this.field3280 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z", line = 336)
    public final boolean method611(int arg0) {
        ++field3295;
        return arg0 != 15795 ? true : this.field3292.method1470(arg0 + -15807);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIILha;)Z", line = 347)
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        ++field3301;
        class282 var5 = this.field3292.method1471(-2615, 131072, false, false, arg3);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 != 1) {
                this.field3292 = null;
            }
            class121 var6 = arg3.method342();
            var6.method845(super.field3923, super.field3922, super.field3916);
            return !class100.field1447 ? var5.method496(arg1, arg0, var6, false, 0) : var5.method538(arg1, arg0, var6, false, 0, class680.field9660);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I", line = 366)
    public final int method604(byte arg0) {
        if (arg0 != 94) {
            return 89;
        } else {
            ++field3300;
            return this.field3292.field3068;
        }
    }
}
