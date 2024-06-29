import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class360 {

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lvfa;")
    private class670 field5109 = new class670();

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "[I")
    public static int[] field5114 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lfp;")
    public static class323 field5103;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lfp;")
    public static class323 field5104;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Lvfa;")
    private class670 field5113;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Lvfa;")
    public final class670 method2301(int arg0) {
        field5107++;
        if (arg0 != -31182) {
            this.method2302((byte) 73);
        }
        class670 var2 = this.field5109.field9093;
        if (this.field5109 == var2) {
            this.field5113 = null;
            return null;
        } else {
            this.field5113 = var2.field9093;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)I")
    public final int method2302(byte arg0) {
        if (arg0 != 58) {
            return -99;
        }
        field5108++;
        int var2 = 0;
        for (class670 var3 = this.field5109.field9093; var3 != this.field5109; var3 = var3.field9093) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)Lvfa;")
    public final class670 method2303(byte arg0) {
        field5106++;
        class670 var2 = this.field5109.field9093;
        if (this.field5109 == var2) {
            return null;
        } else {
            var2.method3646((byte) -119);
            return arg0 == -37 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public final void method2304(int arg0) {
        if (arg0 >= -51) {
            return;
        }
        while (true) {
            class670 var2 = this.field5109.field9093;
            if (this.field5109 == var2) {
                field5112++;
                this.field5113 = null;
                return;
            }
            var2.method3646((byte) -117);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method2305(String arg0, boolean arg1, int arg2) {
        field5102++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class5.field50.field8331 : class5.field50.field8328) + var6;
        if (arg2 >= -34) {
            method2309(null, -107, null, (byte) -71, 44);
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class366 var11 = class5.field50.method3340(var8, false);
            if (var11.field5188 && var11.method2331(16584).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class698.field9631 = null;
                    class565.field8026 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class538.field7552 = 0;
        class698.field9631 = var4;
        class565.field8026 = var5;
        String[] var9 = new String[class565.field8026];
        for (int var10 = 0; var10 < class565.field8026; var10++) {
            var9[var10] = class5.field50.method3340(var4[var10], false).method2331(16584);
        }
        class591.method3341(var9, class698.field9631, (byte) 91);
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Z")
    public final boolean method2306(int arg0) {
        field5116++;
        if (arg0 != 15) {
            field5114 = null;
        }
        return this.field5109.field9093 == this.field5109;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILvfa;)V")
    public final void method2307(int arg0, class670 arg1) {
        if (arg0 != 0) {
            field5114 = null;
        }
        if (arg1.field9094 != null) {
            arg1.method3646((byte) -112);
        }
        field5101++;
        arg1.field9094 = this.field5109.field9094;
        arg1.field9093 = this.field5109;
        arg1.field9094.field9093 = arg1;
        arg1.field9093.field9094 = arg1;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)Lvfa;")
    public final class670 method2308(int arg0) {
        field5105++;
        class670 var2 = this.field5109.field9094;
        if (this.field5109 == var2) {
            this.field5113 = null;
            return null;
        }
        this.field5113 = var2.field9094;
        if (arg0 != 128) {
            this.method2304(-1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lkd;ILag;BI)V")
    public static final void method2309(class280 arg0, int arg1, class682 arg2, byte arg3, int arg4) {
        field5111++;
        byte var5 = -1;
        if ((arg1 & 0x10) != 0) {
            int[] var6 = new int[4];
            for (int var7 = 0; var7 < 4; var7++) {
                var6[var7] = arg2.method3757((byte) -65);
                if (var6[var7] == 65535) {
                    var6[var7] = -1;
                }
            }
            int var8 = arg2.method3736(true);
            class573.method3286(-1, var6, var8, arg0);
        }
        if ((arg1 & 0x100) != 0) {
            int var9 = arg2.method3734(123);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = arg2.method3700(27326);
            int var11 = arg2.method3688(7925);
            int var12 = var11 & 0x7;
            int var13 = (var11 & 0x78) >> 3;
            if (var13 == 15) {
                var13 = -1;
            }
            arg0.method3245(var9, var13, true, (byte) 114, var10, var12);
        }
        if ((arg1 & 0x10000) != 0) {
            arg0.field7962 = arg2.method3719(1854307120);
            arg0.field7914 = arg2.method3698(0);
            arg0.field7997 = arg2.method3719(1854307120);
            arg0.field7971 = (byte) arg2.method3710(-6067);
            arg0.field7999 = class740.field10285 + arg2.method3757((byte) -65);
            arg0.field7983 = class740.field10285 + arg2.method3717(25651);
        }
        if ((arg1 & 0x4) != 0) {
            int var14 = arg2.method3744(true);
            if (var14 == 65535) {
                var14 = -1;
            }
            arg0.field8001 = var14;
        }
        if ((arg1 & 0x400) != 0) {
            arg0.field3985 = arg2.method3736(true) == 1;
        }
        if ((arg1 & 0x80) != 0) {
            arg0.field3966 = arg2.method3734(125);
            if (arg0.field8014 == 0) {
                arg0.method3242(8192, arg0.field3966);
                arg0.field3966 = -1;
            }
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field7972 = arg2.method3713((byte) -14);
            arg0.field7980 = arg2.method3719(1854307120);
            arg0.field7947 = arg2.method3712(-125);
            arg0.field7967 = arg2.method3713((byte) -14);
            arg0.field7954 = arg2.method3757((byte) -65) + class740.field10285;
            arg0.field7969 = arg2.method3744(true) + class740.field10285;
            arg0.field7933 = arg2.method3750((byte) 35);
            if (arg0.field3958) {
                arg0.field7972 += arg0.field3989;
                arg0.field7947 += arg0.field3989;
                arg0.field8014 = 0;
                arg0.field7967 += arg0.field3967;
                arg0.field7980 += arg0.field3967;
            } else {
                arg0.field7972 += arg0.field8009[0];
                arg0.field7980 += arg0.field8015[0];
                arg0.field7967 += arg0.field8015[0];
                arg0.field8014 = 1;
                arg0.field7947 += arg0.field8009[0];
            }
            arg0.field8007 = 0;
        }
        if ((arg1 & 0x8) != 0) {
            int var15 = arg2.method3736(true);
            byte[] var16 = new byte[var15];
            class675 var17 = new class675(var16);
            arg2.method3723(var16, 4, var15, 0);
            class522.field7398[arg4] = var17;
            arg0.method1833(var17, 119);
        }
        if ((arg1 & 0x1) != 0) {
            class471.field6687[arg4] = arg2.method3698(0);
        }
        if ((arg1 & 0x40000) != 0) {
            int var18 = arg2.method3710(-6067);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            for (int var21 = 0; var21 < var18; var21++) {
                int var22 = arg2.method3744(true);
                if ((var22 & 0xC000) == 49152) {
                    int var23 = arg2.method3757((byte) -65);
                    var19[var21] = class325.method2116(var22 << 16, var23);
                } else {
                    var19[var21] = var22;
                }
                var20[var21] = arg2.method3744(true);
            }
            arg0.method3250(0, var19, var20);
        }
        if ((arg1 & 0x20) != 0) {
            int var24 = arg2.method3693(-71);
            int var25 = arg2.method3710(-6067);
            arg0.method3251(0, class740.field10285, var24, var25);
            arg0.field7994 = class740.field10285 + 300;
            arg0.field7987 = arg2.method3710(-6067);
        }
        if ((arg1 & 0x1000) != 0) {
            int var26 = arg2.method3757((byte) -65);
            arg0.field7975 = arg2.method3750((byte) 35);
            arg0.field8004 = arg2.method3736(true);
            arg0.field7978 = var26 & 0x7FFF;
            arg0.field7926 = (var26 & 0x8000) != 0;
            arg0.field7998 = class740.field10285 + arg0.field7978 + arg0.field7975;
        }
        if ((arg1 & 0x40) != 0) {
            int var27 = arg2.method3734(126);
            int var28 = arg2.method3691((byte) -85);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var29 = arg2.method3736(true);
            int var30 = var29 & 0x7;
            int var31 = (var29 & 0x7C) >> 3;
            if (var31 == 15) {
                var31 = -1;
            }
            arg0.method3245(var27, var31, false, (byte) 114, var28, var30);
        }
        if ((arg1 & 0x20000) != 0) {
            int var32 = class740.field10285;
            int var33 = arg2.method3693(7);
            int var34 = arg2.method3710(-6067);
            arg0.method3251(0, var32, var33, var34);
        }
        if ((arg1 & 0x8000) != 0) {
            var5 = arg2.method3698(0);
        }
        if ((arg1 & 0x2000) != 0) {
            arg0.field7937 = arg2.method3697(-1);
            if (arg0.field7937.charAt(0) == '~') {
                arg0.field7937 = arg0.field7937.substring(1);
                class336.method2182(-97, arg0.field7937, arg0.method1829(true, false), 0, arg0.field3973, arg0.method1842(-47, true), 2);
            } else if (class660.field9039 == arg0) {
                class336.method2182(-82, arg0.field7937, arg0.method1829(true, false), 0, arg0.field3973, arg0.method1842(-69, true), 2);
            }
            arg0.field7935 = 0;
            arg0.field7918 = 0;
            arg0.field7924 = 150;
        }
        if ((arg1 & 0x800) != 0) {
            int var35 = arg2.method3688(7925);
            int[] var36 = new int[var35];
            int[] var37 = new int[var35];
            int[] var38 = new int[var35];
            for (int var39 = 0; var39 < var35; var39++) {
                int var40 = arg2.method3744(true);
                if (var40 == 65535) {
                    var40 = -1;
                }
                var36[var39] = var40;
                var37[var39] = arg2.method3710(-6067);
                var38[var39] = arg2.method3734(123);
            }
            class734.method4106(74, var36, var38, arg0, var37);
        }
        if (arg0.field3958) {
            if (var5 == 127) {
                arg0.method1832(arg0.field3967, (byte) -17, arg0.field3989);
            } else {
                byte var41;
                if (var5 == -1) {
                    var41 = class471.field6687[arg4];
                } else {
                    var41 = var5;
                }
                class245.method1565(var41, arg0, -1);
                arg0.method1830(false, arg0.field3989, arg0.field3967, var41);
            }
        }
        int var42 = -5 % ((-arg3 - 28) / 37);
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)Lvfa;")
    public final class670 method2310(int arg0) {
        field5110++;
        class670 var2 = this.field5113;
        if (this.field5109 == var2) {
            this.field5113 = null;
            return null;
        }
        if (arg0 <= 21) {
            method2309(null, -102, null, (byte) -64, 41);
        }
        this.field5113 = var2.field9093;
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static void method2311(int arg0) {
        field5104 = null;
        field5114 = null;
        field5103 = null;
        if (arg0 != 0) {
            field5103 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class360() {
        this.field5109.field9094 = this.field5109;
        this.field5109.field9093 = this.field5109;
    }
}
