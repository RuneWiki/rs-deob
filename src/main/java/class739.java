import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class class739 extends class430 {

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Z")
    public boolean field10320;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "[Lih;")
    public class739[] field10331;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field10313;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field10315;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public int field10318;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field10322;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field10326;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field10327;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field10329;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Lbu;")
    public class148 field10317;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Lkq;")
    public class343 field10328;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)[I", line = 3)
    public int[] method445(boolean arg0, int arg1) {
        field10329++;
        if (arg0) {
            this.method2798(-8, -6, (byte) -81);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZ)[[I", line = 19)
    public final int[][] method4124(int arg0, int arg1, boolean arg2) {
        field10314++;
        if (!arg2) {
            this.field10320 = false;
        }
        if (this.field10331[arg1].field10320) {
            int[] var4 = this.field10331[arg1].method445(false, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field10331[arg1].method113(arg0, 8213);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIB)V", line = 52)
    public void method2798(int arg0, int arg1, byte arg2) {
        field10316++;
        int var4 = this.field10318 == 255 ? arg0 : this.field10318;
        if (this.field10320) {
            this.field10317 = new class148(var4, arg0, arg1);
        } else {
            this.field10328 = new class343(var4, arg0, arg1);
        }
        if (arg2 > -20) {
            method4129(100, 120, 116, -66);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)I", line = 82)
    public int method2797(int arg0) {
        field10322++;
        return arg0 >= -64 ? 32 : -1;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 94)
    public void method628(int arg0) {
        field10315++;
        if (arg0 < 53) {
            this.field10318 = -16;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)I", line = 107)
    public int method587(byte arg0) {
        int var2 = 121 % ((arg0 + 33) / 52);
        field10327++;
        return -1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lsl;IB)V", line = 119)
    public void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            this.field10331 = null;
        }
        field10325++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lqk;IIB)V", line = 129)
    public static final void method4125(class146 arg0, int arg1, int arg2, byte arg3) {
        if (class549.field7997) {
            class167 var4 = class76.field1107 == -1 ? null : class332.field4513.method1901(-4115, class76.field1107);
            if (client.method2732(arg0).method2857(0) && (class538.field7820 & 0x20) != 0 && (var4 == null || arg0.method1033(true, class76.field1107, var4.field2364) != var4.field2364)) {
                class145.method1016(class297.field4060, true, arg0.field2079, false, class377.field5459 + " -> " + arg0.field2024, -120, arg0.field2010, (long) (arg0.field2010 << 0 | arg0.field2079), class243.field3582, 0L, 25, arg0.field2131, false);
                class418.field5976++;
            }
        }
        field10323++;
        int var5 = 9;
        int var6 = 4 % ((arg3 + 16) / 61);
        while (var5 >= 5) {
            String var10 = class343.method2102(arg0, 96, var5);
            if (var10 != null) {
                class145.method1016(var10, true, arg0.field2079, false, arg0.field2024, -117, arg0.field2010, (long) (arg0.field2079 | arg0.field2010 << 0), class585.method3446(var5, arg0, (byte) 123), (long) (var5 + 1), 1002, arg0.field2131, false);
                class317.field4334++;
            }
            var5--;
        }
        String var7 = class242.method1663(arg0, 43);
        if (var7 != null) {
            class243.field3578++;
            class145.method1016(var7, true, arg0.field2079, false, arg0.field2024, -127, arg0.field2010, (long) (arg0.field2010 << 0 | arg0.field2079), arg0.field2088, 0L, 16, arg0.field2131, false);
        }
        for (int var8 = 4; var8 >= 0; var8--) {
            String var9 = class343.method2102(arg0, 89, var8);
            if (var9 != null) {
                class317.field4334++;
                class145.method1016(var9, true, arg0.field2079, false, arg0.field2024, -124, arg0.field2010, (long) (arg0.field2079 | arg0.field2010 << 0), class585.method3446(var8, arg0, (byte) 114), (long) (var8 + 1), 45, arg0.field2131, false);
            }
        }
        if (!client.method2732(arg0).method2855(0)) {
            return;
        }
        class378.field5495++;
        if (arg0.field2021 == null) {
            class145.method1016(class608.field8629.method3543(-24350, class45.field748), true, arg0.field2079, false, "", -120, arg0.field2010, (long) (arg0.field2010 << 0 | arg0.field2079), -1, 0L, 4, arg0.field2131, false);
        } else {
            class145.method1016(arg0.field2021, true, arg0.field2079, false, "", -128, arg0.field2010, (long) (arg0.field2079 | arg0.field2010 << 0), -1, 0L, 4, arg0.field2131, false);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V", line = 206)
    public static final void method4126(int arg0, int arg1, int arg2) {
        if (arg2 != -1037) {
            method4126(-95, -46, -114);
        }
        field10324++;
        if (class528.field7683 == class48.field790) {
            if (!class541.method3255(1, 0, -2, 1, arg1, arg0, 0, (byte) -49, false)) {
                class541.method3255(1, 0, -3, 1, arg1, arg0, 0, (byte) -49, false);
            }
        } else if (!class541.method3255(1, 0, -3, 1, arg1, arg0, 0, (byte) -49, false)) {
            class541.method3255(1, 0, -2, 1, arg1, arg0, 0, (byte) -49, false);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)[I", line = 235)
    public final int[] method4127(int arg0, int arg1, int arg2) {
        field10321++;
        if (arg1 <= 39) {
            method4126(21, 118, -28);
        }
        return this.field10331[arg2].field10320 ? this.field10331[arg2].method445(false, arg0) : this.field10331[arg2].method113(arg0, 8213)[0];
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I", line = 258)
    public int[][] method113(int arg0, int arg1) {
        field10313++;
        if (arg1 == 8213) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V", line = 270)
    public void method586(boolean arg0) {
        field10330++;
        if (arg0) {
            this.method587((byte) -113);
        }
        if (this.field10320) {
            this.field10317.method1038(0);
            this.field10317 = null;
        } else {
            this.field10328.method2104(false);
            this.field10328 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V", line = 298)
    public static final void method4128(boolean arg0) {
        if (class517.field7451 >= 0) {
            long var1 = class465.method2818(255);
            class517.field7451 = (int) ((long) class517.field7451 - (var1 - class365.field5329));
            if (class517.field7451 > 0) {
                int var3 = (class517.field7451 << 8) / class381.field5520;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class159.field2278 = ((class512.field7419 & 0xFF00FF) * var3 + (class25.field219.field1683 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class512.field7419 & 0xFF00) * var3 + (class25.field219.field1683 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class140.field1912 = (class25.field219.field1693 - client.field6415) * var6 + client.field6415;
                class285.field3969 = (class25.field219.field1687 - class680.field9656) * var6 + class680.field9656;
                class718.field10131 = (class25.field219.field1678 - class22.field210) * var6 + class22.field210;
                class369.field5393 = (class25.field219.field1695 - class254.field3669) * var6 + class254.field3669;
                class137.field1881 = (class25.field219.field1689 - class466.field6644) * var6 + class466.field6644;
                class6.field58 = class605.field8585 * var3 + (class25.field219.field1682 * var4) >> 8;
                class311.field4224 = ((class349.field5160 & 0xFF00) * var3 + ((class25.field219.field1679 & 0xFF00) * var4) & 0xFF0000) + ((class349.field5160 & 0xFF00FF) * var3 + (class25.field219.field1679 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class111.field1571 = (class25.field219.field1681 - class714.field10075) * var6 + class714.field10075;
                if (class181.field2495 != class25.field219.field1684) {
                    class36.field322 = class751.field10467.method1251(class181.field2495, class25.field219.field1684, var6, class36.field322);
                }
            } else {
                class137.field1881 = class25.field219.field1689;
                class36.field322 = class25.field219.field1684;
                class111.field1571 = class25.field219.field1681;
                class6.field58 = class25.field219.field1682;
                class718.field10131 = class25.field219.field1678;
                class311.field4224 = class25.field219.field1679;
                class159.field2278 = class25.field219.field1683;
                class285.field3969 = class25.field219.field1687;
                class369.field5393 = class25.field219.field1695;
                class140.field1912 = class25.field219.field1693;
                class517.field7451 = -1;
            }
            class365.field5329 = var1;
        }
        if (!arg0) {
            field10319++;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V", line = 354)
    public static final void method4129(int arg0, int arg1, int arg2, int arg3) {
        field10326++;
        class503 var4 = class512.method3112(11, arg1, 0);
        var4.method3075((byte) -123);
        if (arg2 == 11) {
            var4.field7312 = arg3;
            var4.field7310 = arg0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IZ)V", line = 373)
    public class739(int arg0, boolean arg1) {
        this.field10320 = arg1;
        this.field10331 = new class739[arg0];
    }
}
