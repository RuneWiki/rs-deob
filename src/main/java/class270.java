import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class270 {

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field4013 = -1;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Z")
    public boolean field4014 = false;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    private int field4017 = 128;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    private int field4015 = 0;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    private int field4020 = -1;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "B")
    public byte field4022 = 0;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    private int field4025 = 128;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    private int field4021 = 0;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    private int field4029 = 0;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Luv;")
    public static class2 field4018 = new class2(29, 6);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    private int field4027;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lss;")
    public class325 field4010;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[S")
    private short[] field4009;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "[S")
    private short[] field4023;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "[S")
    private short[] field4030;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "[S")
    private short[] field4031;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lm;IIIIIILta;Lya;IIZLta;)Lt;")
    public final class398 method1680(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class337 arg7, class11 arg8, int arg9, int arg10, boolean arg11, class337 arg12) {
        field4019++;
        int var14 = -124 / ((23 - arg2) / 40);
        return this.method1683(arg1, arg8, -128, arg12, arg0, arg10, arg5, arg11, (byte) 2, arg3, arg9, arg4, arg6, arg7);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static final void method1681(int arg0) {
        field4028++;
        int var1 = (int) ((double) class50.field640 * 34.46D);
        int var2 = var1 << arg0;
        if (class407.field6147.method87()) {
            var2 += 128;
        }
        class407.field6147.method155(50, var2);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBILya;Lm;)Lt;")
    public final class398 method1682(int arg0, int arg1, int arg2, byte arg3, int arg4, class11 arg5, class80 arg6) {
        int var8 = 125 % ((-arg3 - 32) / 60);
        field4007++;
        return this.method1683(arg0, arg5, -128, null, arg6, 0, 0, false, (byte) 2, arg4, arg1, 0, arg2, null);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILya;ILta;Lm;IIZBIIIILta;)Lt;")
    private final class398 method1683(int arg0, class11 arg1, int arg2, class337 arg3, class80 arg4, int arg5, int arg6, boolean arg7, byte arg8, int arg9, int arg10, int arg11, int arg12, class337 arg13) {
        field4024++;
        int var15 = arg10;
        class520 var16 = this.field4013 == -1 || arg9 == -1 ? null : arg4.method575(this.field4013, -101);
        boolean var17 = arg7 & this.field4022 != 0;
        if (var16 != null) {
            var15 = arg10 | var16.method3075(arg9, 7698, arg12, false);
        }
        if (var17) {
            var15 |= this.field4022 == 3 ? 7 : 2;
        }
        if (this.field4025 != 128) {
            var15 |= 0x2;
        }
        if (arg2 >= -127) {
            this.field4022 = -88;
        }
        if (this.field4017 != 128 || this.field4021 != 0) {
            var15 |= 0x5;
        }
        class382 var18 = this.field4010.field5073;
        class398 var19;
        synchronized (this.field4010.field5073) {
            var19 = (class398) this.field4010.field5073.method2288((long) (this.field4008 |= arg1.field104 << 29), 0);
        }
        if (var19 == null || arg1.method160(var19.method626(), var15) != 0) {
            if (var19 != null) {
                var15 = arg1.method120(var15, var19.method626());
            }
            int var20 = var15;
            if (this.field4009 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4023 != null) {
                var20 |= 0x8000;
            }
            class118 var21 = class132.method975(this.field4010.field5065, this.field4027, 0, -69);
            if (var21 == null) {
                return null;
            }
            if (var21.field1781 < 13) {
                var21.method881(-2, 0);
            }
            var19 = arg1.method150(var21, var20, this.field4010.field5074, this.field4029 + 64, this.field4015 + 850);
            if (this.field4009 != null) {
                for (int var22 = 0; var22 < this.field4009.length; var22++) {
                    var19.method654(this.field4009[var22], this.field4030[var22]);
                }
            }
            if (this.field4023 != null) {
                for (int var23 = 0; var23 < this.field4023.length; var23++) {
                    var19.method649(this.field4023[var23], this.field4031[var23]);
                }
            }
            var19.method602(var15);
            class382 var24 = this.field4010.field5073;
            synchronized (this.field4010.field5073) {
                this.field4010.field5073.method2290((long) (this.field4008 |= arg1.field104 << 29), var19, 122);
            }
        }
        class398 var25 = var16 == null ? var19.method610(arg8, var15, true) : var16.method3079(var15, 0, arg8, -13, arg9, arg0, var19, arg12);
        if (this.field4017 != 128 || this.field4025 != 128) {
            var25.method620(this.field4017, this.field4025, this.field4017);
        }
        if (this.field4021 != 0) {
            if (this.field4021 == 90) {
                var25.method650(4096);
            }
            if (this.field4021 == 180) {
                var25.method650(8192);
            }
            if (this.field4021 == 270) {
                var25.method650(12288);
            }
        }
        if (var17) {
            var25.method630(this.field4022, this.field4020, arg3, arg13, arg5, arg11, arg6);
        }
        var25.method602(arg10);
        return var25;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILgk;)V")
    private final void method1684(int arg0, int arg1, class468 arg2) {
        int var4 = 44 / ((arg1 - 6) / 58);
        field4012++;
        if (arg0 == 1) {
            this.field4027 = arg2.method2727((byte) 43);
        } else if (arg0 == 2) {
            this.field4013 = arg2.method2727((byte) 43);
        } else if (arg0 == 4) {
            this.field4017 = arg2.method2727((byte) 43);
        } else if (arg0 == 5) {
            this.field4025 = arg2.method2727((byte) 43);
        } else if (arg0 == 6) {
            this.field4021 = arg2.method2727((byte) 43);
        } else if (arg0 == 7) {
            this.field4029 = arg2.method2765(56);
        } else if (arg0 == 8) {
            this.field4015 = arg2.method2765(96);
        } else if (arg0 == 9) {
            this.field4020 = 8224;
            this.field4022 = 3;
        } else if (arg0 == 10) {
            this.field4014 = true;
        } else if (arg0 == 11) {
            this.field4022 = 1;
        } else if (arg0 == 12) {
            this.field4022 = 4;
        } else if (arg0 == 13) {
            this.field4022 = 5;
        } else if (arg0 == 14) {
            this.field4022 = 2;
            this.field4020 = arg2.method2765(118) * 256;
        } else if (arg0 == 15) {
            this.field4022 = 3;
            this.field4020 = arg2.method2727((byte) 43);
        } else if (arg0 == 16) {
            this.field4022 = 3;
            this.field4020 = arg2.method2722(false);
        } else if (arg0 == 40) {
            int var7 = arg2.method2765(110);
            this.field4009 = new short[var7];
            this.field4030 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4009[var8] = (short) arg2.method2727((byte) 43);
                this.field4030[var8] = (short) arg2.method2727((byte) 43);
            }
        } else if (arg0 == 41) {
            int var5 = arg2.method2765(72);
            this.field4031 = new short[var5];
            this.field4023 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4023[var6] = (short) arg2.method2727((byte) 43);
                this.field4031[var6] = (short) arg2.method2727((byte) 43);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public static void method1685(int arg0) {
        field4018 = null;
        int var1 = -75 % ((55 - arg0) / 55);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public static final void method1686(int arg0) {
        if (arg0 > -111) {
            method1686(115);
        }
        class356.method2141(13086);
        field4016++;
        class107.method807(2, 22050, (byte) -81, class454.field6661.field986);
        class4.field37 = class364.method2171(class357.field5469, 0, (byte) -89, class25.field375, 22050);
        class4.field37.method1631(class80.field1106, -128);
        class72.field973 = class364.method2171(class357.field5469, 1, (byte) -120, class25.field375, 2048);
        class72.field973.method1631(class176.field2598, -124);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILm;IIIZLya;)Lt;")
    public final class398 method1687(int arg0, class80 arg1, int arg2, int arg3, int arg4, boolean arg5, class11 arg6) {
        if (arg5) {
            field4006++;
            return this.method1683(arg4, arg6, -128, null, arg1, 0, 0, false, (byte) 5, arg3, arg2, 0, arg0, null);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLgk;)V")
    public final void method1688(byte arg0, class468 arg1) {
        if (arg0 != -101) {
            return;
        }
        field4026++;
        while (true) {
            int var3 = arg1.method2765(120);
            if (var3 == 0) {
                return;
            }
            this.method1684(var3, 122, arg1);
        }
    }
}
