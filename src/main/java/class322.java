import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class322 {

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    private int field4157 = 0;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    private int field4164 = 0;

    @OriginalMember(owner = "client!eca", name = "s", descriptor = "I")
    public int field4173 = -1;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
    private int field4170 = 128;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "B")
    public byte field4162 = 0;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    private int field4158 = -1;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "Z")
    public boolean field4166 = false;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
    private int field4169 = 128;

    @OriginalMember(owner = "client!eca", name = "r", descriptor = "I")
    private int field4172 = 0;

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "[I")
    public static int[] field4163 = new int[4096];

    @OriginalMember(owner = "client!eca", name = "x", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public int field4160;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
    private int field4171;

    @OriginalMember(owner = "client!eca", name = "t", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!eca", name = "u", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!eca", name = "v", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!eca", name = "w", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "Ltaa;")
    public class135 field4159;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "[S")
    private short[] field4155;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "[S")
    private short[] field4156;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "[S")
    private short[] field4161;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "[S")
    private short[] field4168;

    @OriginalMember(owner = "client!eca", name = "y", descriptor = "[[Ltc;")
    public static class477[][] field4179;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4163[var0] = class332.method1918((byte) 117, var0);
        }
        field4178 = 0;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLfd;I)V", line = 4)
    private final void method1859(byte arg0, class418 arg1, int arg2) {
        if (arg0 <= 58) {
            return;
        }
        if (arg2 == 1) {
            this.field4171 = arg1.method2393(-30727);
        } else if (arg2 == 2) {
            this.field4173 = arg1.method2393(-30727);
        } else if (arg2 == 4) {
            this.field4170 = arg1.method2393(-30727);
        } else if (arg2 == 5) {
            this.field4169 = arg1.method2393(-30727);
        } else if (arg2 == 6) {
            this.field4164 = arg1.method2393(-30727);
        } else if (arg2 == 7) {
            this.field4172 = arg1.method2396(80);
        } else if (arg2 == 8) {
            this.field4157 = arg1.method2396(-116);
        } else if (arg2 == 9) {
            this.field4158 = 8224;
            this.field4162 = 3;
        } else if (arg2 == 10) {
            this.field4166 = true;
        } else if (arg2 == 11) {
            this.field4162 = 1;
        } else if (arg2 == 12) {
            this.field4162 = 4;
        } else if (arg2 == 13) {
            this.field4162 = 5;
        } else if (arg2 == 14) {
            this.field4162 = 2;
            this.field4158 = arg1.method2396(-107) * 256;
        } else if (arg2 == 15) {
            this.field4162 = 3;
            this.field4158 = arg1.method2393(-30727);
        } else if (arg2 == 16) {
            this.field4162 = 3;
            this.field4158 = arg1.method2355(105);
        } else if (arg2 == 40) {
            int var4 = arg1.method2396(104);
            this.field4156 = new short[var4];
            this.field4161 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4156[var5] = (short) arg1.method2393(-30727);
                this.field4161[var5] = (short) arg1.method2393(-30727);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method2396(62);
            this.field4168 = new short[var6];
            this.field4155 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4155[var7] = (short) arg1.method2393(-30727);
                this.field4168[var7] = (short) arg1.method2393(-30727);
            }
        }
        field4167++;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIIILd;Lie;Ld;ZIBILoa;)Lba;", line = 131)
    private final class107 method1860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, class567 arg7, class88 arg8, boolean arg9, int arg10, byte arg11, int arg12, class43 arg13) {
        field4175++;
        int var15 = arg3;
        class348 var16 = this.field4173 == -1 || arg2 == -1 ? null : arg7.method3031(-55, this.field4173);
        boolean var17 = arg9 & this.field4162 != 0;
        if (var16 != null) {
            var15 = arg3 | var16.method2005(arg1, (byte) 18, false, arg2);
        }
        if (var17) {
            var15 |= this.field4162 == 3 ? 7 : 2;
        }
        if (this.field4169 != 128) {
            var15 |= 0x2;
        }
        if (this.field4170 != arg12 || this.field4164 != 0) {
            var15 |= 0x5;
        }
        class668 var18 = this.field4159.field1786;
        class107 var19;
        synchronized (this.field4159.field1786) {
            var19 = (class107) this.field4159.field1786.method3655(-108, (long) (this.field4160 |= arg13.field604 << 29));
        }
        if (var19 == null || arg13.method377(var19.method796(), var15) != 0) {
            if (var19 != null) {
                var15 = arg13.method370(var15, var19.method796());
            }
            int var20 = var15;
            if (this.field4156 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4155 != null) {
                var20 |= 0x8000;
            }
            class645 var21 = class463.method2591(true, this.field4171, 0, this.field4159.field1773);
            if (var21 == null) {
                return null;
            }
            if (var21.field8947 < 13) {
                var21.method3539(2, true);
            }
            var19 = arg13.method410(var21, var20, this.field4159.field1787, this.field4172 + 64, this.field4157 + 850);
            if (this.field4156 != null) {
                for (int var22 = 0; var22 < this.field4156.length; var22++) {
                    var19.method829(this.field4156[var22], this.field4161[var22]);
                }
            }
            if (this.field4155 != null) {
                for (int var23 = 0; var23 < this.field4155.length; var23++) {
                    var19.method790(this.field4155[var23], this.field4168[var23]);
                }
            }
            var19.method825(var15);
            class668 var24 = this.field4159.field1786;
            synchronized (this.field4159.field1786) {
                this.field4159.field1786.method3650((long) (this.field4160 |= arg13.field604 << 29), -123, var19);
            }
        }
        class107 var25 = var16 == null ? var19.method479(arg11, var15, true) : var16.method2006(arg11, arg2, var15, 0, 0, var19, arg5, arg1);
        if (this.field4170 != 128 || this.field4169 != 128) {
            var25.method789(this.field4170, this.field4169, this.field4170);
        }
        if (this.field4164 != 0) {
            if (this.field4164 == 90) {
                var25.method822(4096);
            }
            if (this.field4164 == 180) {
                var25.method822(8192);
            }
            if (this.field4164 == 270) {
                var25.method822(12288);
            }
        }
        if (var17) {
            var25.method833(this.field4162, this.field4158, arg6, arg8, arg4, arg10, arg0);
        }
        var25.method825(arg3);
        return var25;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILoa;IIILie;)Lba;", line = 252)
    public final class107 method1861(int arg0, int arg1, class43 arg2, int arg3, int arg4, int arg5, class567 arg6) {
        if (arg3 == 0) {
            field4177++;
            return this.method1860(0, arg4, arg5, arg1, 0, arg0, null, arg6, null, false, 0, (byte) 5, arg3 ^ 0x80, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lie;Loa;IBLd;IZIIILd;II)Lba;", line = 271)
    public final class107 method1862(class567 arg0, class43 arg1, int arg2, byte arg3, class88 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class88 arg10, int arg11, int arg12) {
        field4174++;
        return arg3 >= -4 ? null : this.method1860(arg12, arg11, arg7, arg8, arg2, arg5, arg10, arg0, arg4, arg6, arg9, (byte) 2, 128, arg1);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I", line = 282)
    public static final int method1863(String arg0, String arg1, int arg2, int arg3) {
        field4180++;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > var7 - var9) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class100.method759(112, var22);
            var9 = class100.method759(117, var24);
            char var26 = class348.method2002(arg2, var22, (byte) 29);
            char var27 = class348.method2002(arg2, var24, (byte) 29);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class14.method85(-10066, var28, arg2) - class14.method85(-10066, var29, arg2);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class14.method85(-10066, var20, arg2) - class14.method85(arg3 ^ 0xFFFFD8A4, var21, arg2);
                }
            }
        }
        if (arg3 != 10) {
            field4163 = null;
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class14.method85(-10066, var14, arg2) - class14.method85(-10066, var15, arg2);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V", line = 403)
    public static void method1864(int arg0) {
        if (arg0 > -29) {
            method1864(-116);
        }
        field4179 = null;
        field4163 = null;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLfd;)V", line = 414)
    public final void method1865(byte arg0, class418 arg1) {
        while (true) {
            int var3 = arg1.method2396(23);
            if (var3 == 0) {
                if (arg0 != -31) {
                    return;
                }
                field4176++;
                return;
            }
            this.method1859((byte) 121, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILie;IBILoa;)Lba;", line = 437)
    public final class107 method1866(int arg0, int arg1, class567 arg2, int arg3, byte arg4, int arg5, class43 arg6) {
        field4165++;
        if (arg4 > -95) {
            this.method1866(-34, -69, null, 112, (byte) -39, -21, null);
        }
        return this.method1860(0, arg3, arg1, arg0, 0, arg5, null, arg2, null, false, 0, (byte) 2, 128, arg6);
    }
}
