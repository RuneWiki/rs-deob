import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class155 extends class144 {

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field2494 = 0;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lmh;")
    private static class62 field2493 = class201.method1405(true, "Select");

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lmh;")
    public static class62 field2498 = class201.method1405(true, "_");

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field2501 = 0;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field2504 = 0;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "Lmh;")
    public static class62 field2503 = field2493;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lhi;Lhi;I)V", line = 8)
    public static final void method1144(class26 arg0, class26 arg1, int arg2) {
        class163.field2638 = arg1;
        class151.field2374 = arg0;
        field2502++;
        if (arg2 != 1) {
            field2498 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIB)I", line = 23)
    public static final int method1145(int arg0, int arg1, int arg2, byte arg3) {
        field2505++;
        int var4 = arg1 & arg2 - 1;
        if (arg3 > -44) {
            return 95;
        }
        int var5 = arg0 / arg2;
        int var6 = arg1 / arg2;
        int var7 = arg2 - 1 & arg0;
        int var8 = class39.method270(var5, var6, (byte) 127);
        int var9 = class39.method270(var5, var6 + 1, (byte) 124);
        int var10 = class39.method270(var5 + 1, var6, (byte) 106);
        int var11 = class39.method270(var5 + 1, var6 - -1, (byte) 78);
        int var12 = class249.method1732(var9, 134070497, arg2, var8, var4);
        int var13 = class249.method1732(var11, 134070497, arg2, var10, var4);
        return class249.method1732(var13, 134070497, arg2, var12, var7);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILmh;)V", line = 53)
    public static final void method1146(int arg0, class62 arg1) {
        field2495++;
        if (class225.field3923 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method451(100);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class225.field3923.length && class225.field3923[var2].field3499 != var3) {
            var2++;
        }
        if (arg0 < 54) {
            method1148(90, (byte) 126);
        }
        if (class225.field3923.length > var2 && class225.field3923[var2] != null) {
            class131.field2134++;
            class170.field2772.method1693(68, false);
            class170.field2772.method694(class225.field3923[var2].field3499, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILhi;Z)Lwj;", line = 91)
    public static final class135 method1147(int arg0, class26 arg1, boolean arg2) {
        if (arg2) {
            return (class135) null;
        } else {
            field2500++;
            return class248.method1728(arg1, arg0, (byte) 22) ? class12.method50(0) : null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V", line = 111)
    public static final void method1148(int arg0, byte arg1) {
        field2496++;
        class263 var2 = class81.field1345;
        synchronized (class81.field1345) {
            class244.field4150 = arg0;
            if (arg1 < 70) {
                method1145(-55, -27, 46, (byte) 88);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ltd;I)V", line = 142)
    public static final void method1149(class222 arg0, int arg1) {
        field2492++;
        arg0.field3876 = arg0.field3879;
        if (arg0.field3808 == 0) {
            arg0.field3858 = 0;
            return;
        }
        if (arg0.field3836 != -1 && arg0.field3843 == 0) {
            class96 var2 = class151.method1085(arg0.field3836, (byte) 111);
            if (arg0.field3824 > 0 && var2.field1582 == 0) {
                arg0.field3858++;
                return;
            }
            if (arg0.field3824 <= 0 && var2.field1560 == 0) {
                arg0.field3858++;
                return;
            }
        }
        int var3 = arg0.field3821;
        int var4 = arg0.field3814;
        int var5 = arg0.field3828[arg0.field3808 - 1] * 128 + arg0.method1101(true) * 64;
        int var6 = arg0.field3846[arg0.field3808 - 1] * 128 + (arg0.method1101(true) * 64);
        if (var5 - var3 > 256 || (var5 - var3) < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg0.field3814 = var6;
            arg0.field3821 = var5;
            return;
        }
        if (var5 > var3) {
            if (var4 < var6) {
                arg0.field3862 = 1280;
            } else if (var6 >= var4) {
                arg0.field3862 = 1536;
            } else {
                arg0.field3862 = 1792;
            }
        } else if (var5 < var3) {
            if (var4 < var6) {
                arg0.field3862 = 768;
            } else if (var6 < var4) {
                arg0.field3862 = 256;
            } else {
                arg0.field3862 = 512;
            }
        } else if (var6 > var4) {
            arg0.field3862 = 1024;
        } else if (var6 < var4) {
            arg0.field3862 = 0;
        }
        int var7 = arg0.field3817;
        int var8 = arg0.field3862 - arg0.field3856 & 0x7FF;
        int var9 = 66 % ((arg1 + 29) / 43);
        boolean var10 = true;
        int var11 = 4;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field3831;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field3811;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field3868;
        }
        if (var7 == -1) {
            var7 = arg0.field3831;
        }
        arg0.field3876 = var7;
        if (arg0 instanceof class204) {
            var10 = ((class204) arg0).field3435.field4723;
        }
        if (var10) {
            if (arg0.field3862 != arg0.field3856 && arg0.field3848 == -1 && arg0.field3816 != 0) {
                var11 = 2;
            }
            if (arg0.field3808 > 2) {
                var11 = 6;
            }
            if (arg0.field3808 > 3) {
                var11 = 8;
            }
            if (arg0.field3858 > 0 && arg0.field3808 > 1) {
                arg0.field3858--;
                var11 = 8;
            }
        } else {
            if (arg0.field3808 > 1) {
                var11 = 6;
            }
            if (arg0.field3808 > 2) {
                var11 = 8;
            }
            if (arg0.field3858 > 0 && arg0.field3808 > 1) {
                var11 = 8;
                arg0.field3858--;
            }
        }
        if (arg0.field3833[arg0.field3808 - 1]) {
            var11 <<= 0x1;
        }
        if (var6 > var4) {
            arg0.field3814 += var11;
            if (var6 < arg0.field3814) {
                arg0.field3814 = var6;
            }
        } else if (var6 < var4) {
            arg0.field3814 -= var11;
            if (arg0.field3814 < var6) {
                arg0.field3814 = var6;
            }
        }
        if (var3 < var5) {
            arg0.field3821 += var11;
            if (var5 < arg0.field3821) {
                arg0.field3821 = var5;
            }
        } else if (var5 < var3) {
            arg0.field3821 -= var11;
            if (arg0.field3821 < var5) {
                arg0.field3821 = var5;
            }
        }
        if (var11 >= 8 && arg0.field3876 == arg0.field3831 && arg0.field3875 != -1) {
            arg0.field3876 = arg0.field3875;
        }
        if (arg0.field3821 == var5 && arg0.field3814 == var6) {
            arg0.field3808--;
            if (arg0.field3824 > 0) {
                arg0.field3824--;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 356)
    public static void method1150(int arg0) {
        field2503 = null;
        field2493 = null;
        int var1 = 39 / ((arg0 - 53) / 38);
        field2498 = null;
    }
}
