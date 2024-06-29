import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class47 extends class205 {

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    private int field741 = -32768;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    private int field756 = 0;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    private int field758 = 0;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    private int field775 = -1;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "Z")
    private boolean field779 = false;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    private int field740;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
    private int field777;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "Lql;")
    private class223 field750;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "[I")
    public static int[] field739 = new int[1000];

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "[Ldb;")
    public static class17[] field766 = new class17[50];

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "D")
    public double field742;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "D")
    private double field752;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "D")
    private double field753;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "D")
    private double field757;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "D")
    public double field768;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "D")
    public double field770;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "D")
    private double field772;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "D")
    private double field778;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "Lgj;")
    private class240 field769;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static final void method380(byte arg0) {
        class26.field399.method1783(0);
        field754++;
        if (arg0 != 66) {
            method380((byte) 86);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
    public final void method381(int arg0, int arg1) {
        if (this.field743 == arg0) {
            this.field742 += (double) arg1 * this.field778;
        } else {
            this.field742 += this.field772 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field778;
            this.field778 += (double) arg1 * this.field772;
        }
        this.field768 += (double) arg1 * this.field753;
        field765++;
        this.field779 = true;
        this.field770 += (double) arg1 * this.field752;
        this.field745 = (int) (Math.atan2(this.field752, this.field753) * 325.949D) + 1024 & 0x7FF;
        this.field774 = (int) (Math.atan2(this.field778, this.field757) * 325.949D) & 0x7FF;
        if (this.field750 == null) {
            return;
        }
        this.field758 += arg1;
        while (true) {
            do {
                do {
                    if (this.field758 <= this.field750.field3488[this.field756]) {
                        return;
                    }
                    this.field758 -= this.field750.field3488[this.field756];
                    this.field756++;
                    if (this.field756 >= this.field750.field3484.length) {
                        this.field756 -= this.field750.field3487;
                        if (this.field756 < 0 || this.field750.field3484.length <= this.field756) {
                            this.field756 = 0;
                        }
                    }
                    this.field775 = this.field756 + 1;
                } while (this.field750.field3484.length > this.field775);
                this.field775 -= this.field750.field3487;
            } while (this.field775 >= 0 && this.field775 < this.field750.field3484.length);
            this.field775 = -1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)Lli;")
    public static final class297 method382(boolean arg0, int arg1) {
        if (arg0) {
            method382(false, 66);
        }
        field748++;
        return (class297) class77.field1304.method1414(!arg0, (long) arg1);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(ZI)Lhc;")
    public static final class235 method383(boolean arg0, int arg1) {
        field761++;
        class235 var2 = (class235) class297.field4680.method1701(!arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class4.field57.method1163(26, arg1, 48);
        class235 var4 = new class235();
        if (var3 != null) {
            var4.method1579(new class37(var3), (byte) 48);
        }
        class297.field4680.method1704((long) arg1, var4, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)Lrg;")
    private final class233 method384(byte arg0) {
        field763++;
        class259 var2 = class23.method189(this.field755, (byte) -117);
        if (arg0 != -67) {
            return null;
        }
        class233 var3 = var2.method1717(this.field758, this.field775, this.field756, arg0 ^ 0x74E9);
        if (var3 == null) {
            return null;
        } else {
            var3.method1553(this.field774);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILja;Ljava/awt/Component;I)Lti;")
    public static final class5 method385(int arg0, int arg1, class59 arg2, Component arg3, int arg4) {
        field783++;
        if (class234.field3622 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 >= -120) {
                field766 = null;
            }
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class5 var5 = (class5) Class.forName("l").getDeclaredConstructor().newInstance();
                var5.field67 = new int[(class230.field3589 ? 2 : 1) * 256];
                var5.field92 = arg4;
                var5.method72(arg3);
                var5.field83 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field83 > 16384) {
                    var5.field83 = 16384;
                }
                var5.method67(var5.field83);
                if (class292.field4598 > 0 && class287.field4526 == null) {
                    class287.field4526 = new class72();
                    class287.field4526.field1141 = arg2;
                    arg2.method467(class292.field4598, class287.field4526, true);
                }
                if (class287.field4526 != null) {
                    if (class287.field4526.field1149[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class287.field4526.field1149[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class95 var6 = new class95(arg2, arg0);
                    var6.field92 = arg4;
                    var6.field67 = new int[(class230.field3589 ? 2 : 1) * 256];
                    var6.method72(arg3);
                    var6.field83 = 16384;
                    var6.method67(var6.field83);
                    if (class292.field4598 > 0 && class287.field4526 == null) {
                        class287.field4526 = new class72();
                        class287.field4526.field1141 = arg2;
                        arg2.method467(class292.field4598, class287.field4526, true);
                    }
                    if (class287.field4526 != null) {
                        if (class287.field4526.field1149[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class287.field4526.field1149[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class5();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class240 arg10) {
        field747++;
        class233 var13 = this.method384((byte) -67);
        if (var13 != null) {
            var13.method225(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field769);
            this.field741 = var13.method223();
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public static void method386(int arg0) {
        field739 = null;
        field766 = null;
        if (arg0 != -3724) {
            method383(true, 34);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V")
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field764++;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)V")
    public static final void method387(int arg0, int arg1) {
        if (arg0 >= -42) {
            field739 = null;
        }
        field771++;
        class295 var2 = class250.method1673(15, 7, arg1);
        var2.method1979(-8205);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILcd;I)V")
    public static final void method388(byte arg0, int arg1, class28 arg2, int arg3) {
        field746++;
        if (arg0 != 69) {
            field766 = null;
        }
        if ((arg3 & 0x40) != 0) {
            int var4 = class239.field3692.method297((byte) -120);
            byte[] var5 = new byte[var4];
            class37 var6 = new class37(var5);
            class239.field3692.method329(0, var5, var4, -15149);
            class81.field1347[arg1] = var6;
            arg2.method220(var6, (byte) -94);
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field4131 = class239.field3692.method331(16312);
            if (arg2.field4131.charAt(0) == '~') {
                arg2.field4131 = arg2.field4131.substring(1);
                class73.method567(arg2.method222(0), 2, arg2.field4131, arg0 ^ 0x4D);
            } else if (class261.field4058 == arg2) {
                class73.method567(arg2.method222(0), 2, arg2.field4131, arg0 + 12);
            }
            arg2.field4197 = 150;
            arg2.field4150 = 0;
            arg2.field4149 = 0;
        }
        if ((arg3 & 0x4) != 0) {
            int var7 = class239.field3692.method285((byte) 35);
            int var8 = class239.field3692.method335(false);
            arg2.method1798(class267.field4256, var8, var7, 0);
            arg2.field4171 = class267.field4256 + 300;
            arg2.field4146 = class239.field3692.method297((byte) -120);
        }
        if ((arg3 & 0x400) != 0) {
            int var9 = class239.field3692.method293(100);
            int var10 = class239.field3692.method307(-61);
            boolean var11 = true;
            if (var9 == 65535) {
                var9 = -1;
            }
            if (var9 != -1 && arg2.field4135 != -1 && class28.method224(class23.method189(var9, (byte) -114).field3963, 97).field3481 < class28.method224(class23.method189(arg2.field4135, (byte) 34).field3963, 63).field3481) {
                var11 = false;
            }
            if (var11) {
                arg2.field4137 = var10 >> 16;
                arg2.field4188 = 0;
                arg2.field4135 = var9;
                arg2.field4174 = (var10 & 0xFFFF) + class267.field4256;
                if (arg2.field4174 > class267.field4256) {
                    arg2.field4188 = -1;
                }
                arg2.field4206 = 0;
                arg2.field4136 = 1;
                if (arg2.field4135 != -1 && class267.field4256 == arg2.field4174) {
                    int var12 = class23.method189(arg2.field4135, (byte) -123).field3963;
                    if (var12 != -1) {
                        class223 var13 = class28.method224(var12, 54);
                        if (var13 != null && var13.field3484 != null) {
                            class56.method452((byte) 127, 0, arg2.field4176, var13, class261.field4058 == arg2, arg2.field4123);
                        }
                    }
                }
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field4140 = class239.field3692.method313(118);
            if (arg2.field4140 == 65535) {
                arg2.field4140 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var14 = class239.field3692.method309(255);
            int var15 = class239.field3692.method333((byte) -59);
            if (var14 == 65535) {
                var14 = -1;
            }
            class87.method699(var14, arg2, (byte) 48, var15);
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field4158 = class239.field3692.method309(255);
            arg2.field4128 = class239.field3692.method293(113);
        }
        if ((arg3 & 0x200) != 0) {
            int var16 = class239.field3692.method285((byte) 35);
            int var17 = class239.field3692.method325(arg0 + 186);
            arg2.method1798(class267.field4256, var17, var16, 0);
        }
        if ((arg3 & 0x10) != 0) {
            int var18 = class239.field3692.method293(-85);
            int var19 = class239.field3692.method335(false);
            int var20 = class239.field3692.method325(255);
            boolean var21 = (var18 & 0x8000) != 0;
            int var22 = class239.field3692.field588;
            if (arg2.field446 != null && arg2.field440 != null) {
                long var23 = class247.method1668(arg2.field446, true);
                boolean var25 = false;
                if (var19 <= 1) {
                    if (var21 || (!class65.field1041 || class31.field503) && !class166.field2513) {
                        for (int var26 = 0; var26 < class132.field2037; var26++) {
                            if (class295.field4629[var26] == var23) {
                                var25 = true;
                                break;
                            }
                        }
                    } else {
                        var25 = true;
                    }
                }
                if (!var25 && class273.field4305 == 0) {
                    client.field2399.field588 = 0;
                    class239.field3692.method290(client.field2399.field583, var20, 0, (byte) -113);
                    client.field2399.field588 = 0;
                    int var27 = -1;
                    String var29;
                    if (var21) {
                        class18 var28 = class75.method597(0, client.field2399);
                        var27 = var28.field288;
                        var29 = var28.field286.method1614(80, client.field2399);
                        var18 &= 0x7FFF;
                    } else {
                        var29 = class2.method25(class277.method1861(-64, class205.method1371(-74, client.field2399)));
                    }
                    arg2.field4131 = var29.trim();
                    arg2.field4149 = var18 & 0xFF;
                    arg2.field4197 = 150;
                    arg2.field4150 = var18 >> 8;
                    if (var19 == 2) {
                        class123.method873(var21 ? 17 : 1, var27, "<img=1>" + arg2.method222(0), var29, arg0 - 162, (String) null);
                    } else if (var19 == 1) {
                        class123.method873(var21 ? 17 : 1, var27, "<img=0>" + arg2.method222(arg0 ^ 0x45), var29, -102, (String) null);
                    } else {
                        class123.method873(var21 ? 17 : 2, var27, arg2.method222(0), var29, -114, (String) null);
                    }
                }
            }
            class239.field3692.field588 = var20 + var22;
        }
        if ((arg3 & 0x800) != 0) {
            int var30 = class239.field3692.method297((byte) -120);
            int[] var31 = new int[var30];
            int[] var32 = new int[var30];
            int[] var33 = new int[var30];
            for (int var34 = 0; var34 < var30; var34++) {
                int var35 = class239.field3692.method313(117);
                if (var35 == 65535) {
                    var35 = -1;
                }
                var31[var34] = var35;
                var32[var34] = class239.field3692.method335(false);
                var33[var34] = class239.field3692.method293(124);
            }
            class103.method786(var33, arg2, var32, 0, var31);
        }
        if ((arg3 & 0x100) == 0) {
            return;
        }
        arg2.field4126 = class239.field3692.method297((byte) -120);
        arg2.field4142 = class239.field3692.method297((byte) -120);
        arg2.field4125 = class239.field3692.method333((byte) -59);
        arg2.field4141 = class239.field3692.method297((byte) -120);
        arg2.field4201 = class239.field3692.method293(arg0 ^ 0xFFFFFFA2) + class267.field4256;
        arg2.field4219 = class239.field3692.method313(arg0 ^ 0x39) + class267.field4256;
        arg2.field4218 = class239.field3692.method333((byte) -59);
        arg2.field4151 = 0;
        arg2.field4208 = 1;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BII)V")
    public static final void method389(byte arg0, int arg1, int arg2) {
        field759++;
        class292.field4607.method1251(29, (byte) -19);
        class151.field2339++;
        class292.field4607.method330(arg1, arg0 ^ 0xC42BF45D);
        class292.field4607.method294((byte) 101, arg2);
        if (arg0 != -107) {
            method388((byte) 43, 59, (class28) null, 9);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIB)V")
    public final void method390(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field779) {
            double var6 = (double) (arg3 - this.field777);
            double var8 = (double) (arg0 - this.field740);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field768 = (double) this.field744 * var8 / var10 + (double) this.field740;
            this.field742 = (double) this.field782;
            this.field770 = (double) this.field744 * var6 / var10 + (double) this.field777;
        }
        field760++;
        double var12 = (double) (this.field762 + 1 - arg1);
        this.field753 = ((double) arg0 - this.field768) / var12;
        this.field752 = ((double) arg3 - this.field770) / var12;
        this.field757 = Math.sqrt(this.field753 * this.field753 + this.field752 * this.field752);
        if (this.field743 == -1) {
            this.field778 = ((double) arg2 - this.field742) / var12;
        } else {
            if (!this.field779) {
                this.field778 = -this.field757 * Math.tan((double) this.field743 * 0.02454369D);
            }
            this.field772 = ((double) arg2 - this.field742 - (this.field778 * var12)) * 2.0D / (var12 * var12);
        }
        if (arg4 <= 52) {
            method391(-38, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()I")
    public final int method223() {
        field781++;
        return this.field741;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)Z")
    public static final boolean method391(int arg0, byte arg1) {
        if (arg1 == 97) {
            field776++;
            return (arg0 & -arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field743 = arg7;
        this.field749 = arg1;
        this.field755 = arg0;
        this.field740 = arg3;
        this.field751 = arg10;
        this.field744 = arg8;
        this.field779 = false;
        this.field777 = arg2;
        this.field782 = arg4;
        this.field762 = arg6;
        this.field767 = arg5;
        this.field773 = arg9;
        int var12 = class23.method189(this.field755, (byte) 11).field3963;
        if (var12 == -1) {
            this.field750 = null;
        } else {
            this.field750 = class28.method224(var12, 124);
        }
    }
}
