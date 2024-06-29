import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class296 extends class89 {

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    private int field4720 = 0;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "Lpd;")
    private class3 field4734 = new class3(16);

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    private int field4748 = 0;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "Lwn;")
    private class30 field4754 = new class30();

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "J")
    private long field4757 = 0L;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "Lpm;")
    private class111 field4730;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    private int field4731;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "Z")
    private boolean field4751;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Lwn;")
    private class30 field4749;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    private int field4740;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "Z")
    private boolean field4756;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lpm;")
    private class111 field4718;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    private int field4747;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "Lea;")
    private class217 field4741;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "Lr;")
    private class286 field4735;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "Lch;")
    private class149 field4744;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
    public static int[] field4725 = new int[200];

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "[I")
    public static int[] field4739 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4736 = "Loaded defaults";

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lse;")
    private class13 field4723;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "Z")
    private boolean field4752;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[B")
    private byte[] field4717;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)I", line = 7)
    public final int method2089(boolean arg0) {
        field4743++;
        if (this.field4723 == null) {
            return 0;
        } else {
            if (!arg0) {
                this.method707(94, 115);
            }
            return this.field4723.field296;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[Leg;Lpk;)V", line = 25)
    public static final void method2090(int arg0, class317[] arg1, class120 arg2) {
        class71.field1092 = arg1;
        class285.field4446 = arg2;
        class122.field1988 = new boolean[class71.field1092.length];
        field4724++;
        class243.field3641.method83(arg0 ^ 0xFFFFFFB4);
        int var3 = class285.field4446.method958(111, "details");
        int[] var4 = class285.field4446.method940(var3, (byte) -60);
        for (int var5 = arg0; var5 < var4.length; var5++) {
            class243.field3641.method75(class61.method493((byte) -42, new class1(class285.field4446.method967(var3, var4[var5], arg0 + 65280)), var4[var5]), -1, (long) var4[var5]);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 49)
    public final void method2091(int arg0) {
        field4721++;
        if (this.field4749 != null) {
            if (this.method708((byte) 115) == null) {
                return;
            }
            if (this.field4751) {
                boolean var2 = true;
                for (class60 var3 = this.field4749.method268(arg0 ^ 0xFFFFFF00); var3 != null; var3 = this.field4749.method278(arg0 ^ 0xFE)) {
                    int var4 = (int) var3.field879;
                    if (this.field4717[var4] == 0) {
                        this.method2099(1, var4, 104);
                    }
                    if (this.field4717[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method489(false);
                    }
                }
                while (this.field4723.field285.length > this.field4748) {
                    if (this.field4723.field285[this.field4748] == 0) {
                        this.field4748++;
                    } else {
                        if (this.field4741.field3373 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4717[this.field4748] == 0) {
                            this.method2099(1, this.field4748, 98);
                        }
                        if (this.field4717[this.field4748] == 0) {
                            var2 = false;
                            class60 var5 = new class60();
                            var5.field879 = (long) this.field4748;
                            this.field4749.method277(var5, (byte) -119);
                        }
                        this.field4748++;
                    }
                }
                if (var2) {
                    this.field4751 = false;
                    this.field4748 = 0;
                }
            } else if (this.field4752) {
                boolean var6 = true;
                for (class60 var7 = this.field4749.method268(arg0 ^ 0xFFFFFF00); var7 != null; var7 = this.field4749.method278(1)) {
                    int var8 = (int) var7.field879;
                    if (this.field4717[var8] != 1) {
                        this.method2099(2, var8, 111);
                    }
                    if (this.field4717[var8] == 1) {
                        var7.method489(false);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4723.field285.length > this.field4748) {
                    if (this.field4723.field285[this.field4748] == 0) {
                        this.field4748++;
                    } else {
                        if (this.field4735.method1998((byte) -122)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4717[this.field4748] != 1) {
                            this.method2099(2, this.field4748, arg0 ^ 0x81);
                        }
                        if (this.field4717[this.field4748] != 1) {
                            class60 var9 = new class60();
                            var9.field879 = (long) this.field4748;
                            this.field4749.method277(var9, (byte) -119);
                            var6 = false;
                        }
                        this.field4748++;
                    }
                }
                if (var6) {
                    this.field4752 = false;
                    this.field4748 = 0;
                }
            } else {
                this.field4749 = null;
            }
        }
        if (this.field4756 && class212.method1543(22326) >= this.field4757) {
            for (class149 var10 = (class149) this.field4734.method71((byte) -93); var10 != null; var10 = (class149) this.field4734.method84(1)) {
                if (!var10.field2433) {
                    if (var10.field2430) {
                        if (!var10.field2439) {
                            throw new RuntimeException();
                        }
                        var10.method489(false);
                    } else {
                        var10.field2430 = true;
                    }
                }
            }
            this.field4757 = class212.method1543(22326) + 1000L;
        }
        if (arg0 != 255) {
            this.field4740 = 75;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I", line = 230)
    public final int method707(int arg0, int arg1) {
        field4722++;
        class149 var3 = (class149) this.field4734.method79((long) arg1, (byte) 0);
        if (arg0 == 24545) {
            return var3 == null ? 0 : var3.method615((byte) -103);
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)[B", line = 248)
    public final byte[] method706(byte arg0, int arg1) {
        if (arg0 > -45) {
            this.field4747 = 31;
        }
        class149 var3 = this.method2099(0, arg1, 127);
        field4738++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method612(97);
            var3.method489(false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V", line = 269)
    public static void method2092(byte arg0) {
        field4739 = null;
        field4725 = null;
        int var1 = 110 / ((33 - arg0) / 58);
        field4736 = null;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V", line = 286)
    public final void method2093(int arg0) {
        field4727++;
        if (this.field4749 == null || this.method708((byte) 127) == null) {
            return;
        }
        for (class60 var2 = this.field4754.method268(-1); var2 != null; var2 = this.field4754.method278(1)) {
            int var3 = (int) var2.field879;
            if (var3 < 0 || this.field4723.field293 <= var3 || this.field4723.field285[var3] == 0) {
                var2.method489(false);
            } else {
                if (this.field4717[var3] == 0) {
                    this.method2099(1, var3, 127);
                }
                if (this.field4717[var3] == -1) {
                    this.method2099(2, var3, arg0 + 114);
                }
                if (this.field4717[var3] == 1) {
                    var2.method489(false);
                }
            }
        }
        if (arg0 != 0) {
            this.method2100(true);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 330)
    public final void method2094(byte arg0) {
        field4719++;
        if (this.field4730 == null) {
            return;
        }
        if (arg0 >= -55) {
            method2092((byte) -17);
        }
        this.field4752 = true;
        if (this.field4749 == null) {
            this.field4749 = new class30();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLpk;)V", line = 349)
    public static final void method2095(byte arg0, class120 arg1) {
        field4726++;
        class338.field5220 = class221.method1608(arg1, 0, class217.field3367, -1);
        class66.field982 = class281.method1979(10, class218.field3413, arg1, 0);
        if (arg0 != 2) {
            field4725 = (int[]) null;
        }
        class64.field934 = class281.method1979(10, class274.field4292, arg1, 0);
        class145.field2352 = class281.method1979(10, class213.field3329, arg1, 0);
        class28.field445 = class281.method1979(arg0 ^ 0x8, class111.field1812, arg1, 0);
        class109.field1770 = class281.method1979(arg0 + 8, class299.field4786, arg1, 0);
        class158.field2578 = class281.method1979(10, class36.field533, arg1, 0);
        class116.field1889 = class142.method1093(arg0 - 2, 0, arg1, class150.field2446);
        class135.field2166 = class80.method629(0, arg1, (byte) -115, class86.field1376);
        class339.field5229 = class80.method629(0, arg1, (byte) -115, class151.field2472);
        class322.field5047 = class82.method649(arg1, 0, 0, class133.field2114);
        class92.field1505 = class82.method649(arg1, 0, 0, class185.field2931);
        class156.field2560.method1471(class92.field1505, (int[]) null);
        class107.field1756.method1471(class92.field1505, (int[]) null);
        class146.field2392.method1471(class92.field1505, (int[]) null);
        if (class162.field2623) {
            class295.field4714 = class152.method1145(class176.field2814, (byte) 34, arg1, 0);
            for (int var2 = 0; var2 < class295.field4714.length; var2++) {
                class295.field4714[var2].method1356();
            }
        }
        class317 var3 = class82.method641(0, true, class229.field3523, arg1);
        var3.method2241();
        if (class162.field2623) {
            class208.field3289 = new class196(var3);
        } else {
            class208.field3289 = var3;
        }
        class317[] var4 = class221.method1608(arg1, 0, class160.field2599, arg0 ^ 0xFFFFFFFD);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method2241();
        }
        if (class162.field2623) {
            class259.field3845 = new class88[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class259.field3845[var6] = new class196(var4[var6]);
            }
        } else {
            class259.field3845 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class338.field5220.length; var11++) {
            class338.field5220[var11].method2236(var7 + var10, var9 + var10, var8 + var10);
        }
        if (class162.field2623) {
            class60.field882 = new class88[class338.field5220.length];
            for (int var12 = 0; var12 < class338.field5220.length; var12++) {
                class60.field882[var12] = new class196(class338.field5220[var12]);
            }
        } else {
            class60.field882 = class338.field5220;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lse;", line = 451)
    public final class13 method708(byte arg0) {
        field4732++;
        if (this.field4723 != null) {
            return this.field4723;
        }
        if (this.field4744 == null) {
            if (this.field4735.method2004(true)) {
                return null;
            }
            this.field4744 = this.field4735.method2000(255, false, this.field4731, true, (byte) 0);
        }
        if (this.field4744.field2433) {
            return null;
        }
        byte[] var2 = this.field4744.method612(122);
        if (this.field4744 instanceof class78) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4723 = new class13(var2, this.field4747);
                if (this.field4723.field291 != this.field4740) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field4723 = null;
                if (this.field4735.method2004(true)) {
                    this.field4744 = null;
                } else {
                    this.field4744 = this.field4735.method2000(255, false, this.field4731, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4723 = new class13(var2, this.field4747);
            } catch (RuntimeException var6) {
                this.field4735.method2010(-108);
                this.field4723 = null;
                if (this.field4735.method2004(true)) {
                    this.field4744 = null;
                } else {
                    this.field4744 = this.field4735.method2000(255, false, this.field4731, true, (byte) 0);
                }
                return null;
            }
            if (this.field4718 != null) {
                this.field4741.method1574(this.field4718, var2, this.field4731, (byte) -118);
            }
        }
        if (this.field4730 != null) {
            this.field4720 = 0;
            this.field4717 = new byte[this.field4723.field293];
        }
        if (arg0 < 82) {
            return (class13) null;
        } else {
            this.field4744 = null;
            return this.field4723;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)I", line = 550)
    public final int method2096(int arg0) {
        if (arg0 != 0) {
            this.method2091(-57);
        }
        field4733++;
        if (this.method708((byte) 106) == null) {
            return this.field4744 == null ? 0 : this.field4744.method615((byte) -28);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(ILpm;Lpm;Lr;Lea;IIZ)V", line = 994)
    public class296(int arg0, class111 arg1, class111 arg2, class286 arg3, class217 arg4, int arg5, int arg6, boolean arg7) {
        this.field4730 = arg1;
        this.field4731 = arg0;
        if (this.field4730 == null) {
            this.field4751 = false;
        } else {
            this.field4751 = true;
            this.field4749 = new class30();
        }
        this.field4740 = arg6;
        this.field4756 = arg7;
        this.field4718 = arg2;
        this.field4747 = arg5;
        this.field4741 = arg4;
        this.field4735 = arg3;
        if (this.field4718 != null) {
            this.field4744 = this.field4741.method1573(this.field4731, 2, this.field4718);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(CI)C", line = 585)
    public static final char method2097(char arg0, int arg1) {
        field4746++;
        if (arg0 == 'µ' || arg0 == 'ƒ') {
            return arg0;
        } else {
            if (arg1 != 402) {
                method2090(85, (class317[]) null, (class120) null);
            }
            return Character.toTitleCase(arg0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V", line = 607)
    public final void method709(int arg0, int arg1) {
        field4729++;
        if (this.field4730 == null) {
            return;
        }
        for (class60 var3 = this.field4754.method268(-1); var3 != null; var3 = this.field4754.method278(1)) {
            if (((long) arg1) == var3.field879) {
                return;
            }
        }
        class60 var4 = new class60();
        var4.field879 = (long) arg1;
        if (arg0 != 0) {
            this.method2091(100);
        }
        this.field4754.method277(var4, (byte) -119);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V", line = 639)
    public static final void method2098(int arg0, int arg1, int arg2) {
        int var3 = 83 % ((arg2 + 53) / 35);
        class171.field2747 = (float) arg0;
        if (class73.field1112 == 2) {
            class64.field943 = arg0;
            class43.field683 = arg1;
        }
        field4737++;
        class86.field1388 = (float) arg1;
        class58.method484(false);
        class6.field134 = true;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)Lch;", line = 663)
    private final class149 method2099(int arg0, int arg1, int arg2) {
        class149 var4 = (class149) this.field4734.method79((long) arg1, (byte) 0);
        field4750++;
        if (var4 != null && arg0 == 0 && !var4.field2439 && var4.field2433) {
            var4.method489(false);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field4730 == null || this.field4717[arg1] == -1) {
                    if (this.field4735.method2004(true)) {
                        return null;
                    }
                    var4 = this.field4735.method2000(this.field4731, false, arg1, true, (byte) 2);
                } else {
                    var4 = this.field4741.method1573(arg1, 2, this.field4730);
                }
            } else if (arg0 == 1) {
                if (this.field4730 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4741.method1568(this.field4730, arg1, false);
            } else if (arg0 == 2) {
                if (this.field4730 == null) {
                    throw new RuntimeException();
                }
                if (this.field4717[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4735.method1998((byte) -122)) {
                    return null;
                }
                var4 = this.field4735.method2000(this.field4731, false, arg1, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field4734.method75(var4, -1, (long) arg1);
        }
        if (var4.field2433) {
            return null;
        }
        if (arg2 < 89) {
            this.field4754 = (class30) null;
        }
        byte[] var5 = var4.method612(79);
        if (!var4 instanceof class78) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class118.field1908.reset();
                class118.field1908.update(var5, 0, var5.length - 2);
                int var10 = (int) class118.field1908.getValue();
                if (this.field4723.field287[arg1] != var10) {
                    throw new RuntimeException();
                }
                this.field4735.field4483 = 0;
                this.field4735.field4484 = 0;
            } catch (RuntimeException var14) {
                this.field4735.method2010(-22);
                var4.method489(false);
                if (var4.field2439 && !this.field4735.method2004(true)) {
                    class226 var12 = this.field4735.method2000(this.field4731, false, arg1, true, (byte) 2);
                    this.field4734.method75(var12, -1, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4723.field299[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field4723.field299[arg1];
            if (this.field4730 != null) {
                this.field4741.method1574(this.field4730, var5, arg1, (byte) -115);
                if (this.field4717[arg1] != 1) {
                    this.field4720++;
                    this.field4717[arg1] = 1;
                }
            }
            if (!var4.field2439) {
                var4.method489(false);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class118.field1908.reset();
            class118.field1908.update(var5, 0, var5.length - 2);
            int var6 = (int) class118.field1908.getValue();
            if (this.field4723.field287[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4723.field299[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4717[arg1] != 1) {
                if (this.field4717[arg1] == 0) {
                }
                this.field4720++;
                this.field4717[arg1] = 1;
            }
            if (!var4.field2439) {
                var4.method489(false);
            }
            return var4;
        } catch (Exception var13) {
            this.field4717[arg1] = -1;
            var4.method489(false);
            if (var4.field2439 && !this.field4735.method2004(true)) {
                class226 var9 = this.field4735.method2000(this.field4731, false, arg1, true, (byte) 2);
                this.field4734.method75(var9, -1, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)I", line = 877)
    public final int method2100(boolean arg0) {
        field4753++;
        return arg0 ? this.field4720 : 94;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIII)V", line = 890)
    public static final void method2101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4728++;
        int var8 = class10.method151(class333.field5188, arg7, 112, class104.field1719);
        if (arg4 >= -66) {
            field4736 = (String) null;
        }
        int var9 = class10.method151(class333.field5188, arg0, 114, class104.field1719);
        int var10 = class10.method151(class180.field2862, arg5, 126, class310.field4897);
        int var11 = class10.method151(class180.field2862, arg2, 110, class310.field4897);
        int var12 = class10.method151(class333.field5188, arg6 + arg7, 115, class104.field1719);
        int var13 = class10.method151(class333.field5188, arg0 - arg6, 121, class104.field1719);
        for (int var14 = var8; var14 < var12; var14++) {
            class323.method2273(var10, arg1, class221.field3443[var14], var11, 101);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class323.method2273(var10, arg1, class221.field3443[var15], var11, 68);
        }
        int var16 = class10.method151(class180.field2862, arg5 + arg6, 121, class310.field4897);
        int var17 = class10.method151(class180.field2862, arg2 - arg6, 126, class310.field4897);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class221.field3443[var18];
            class323.method2273(var10, arg1, var19, var16, 114);
            class323.method2273(var16, arg3, var19, var17, 71);
            class323.method2273(var17, arg1, var19, var11, 77);
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)I", line = 944)
    public final int method2102(byte arg0) {
        field4745++;
        if (this.field4723 == null) {
            return 0;
        } else if (this.field4751) {
            int var2 = -87 / ((18 - arg0) / 43);
            class60 var3 = this.field4749.method268(-1);
            return var3 == null ? 0 : (int) var3.field879;
        } else {
            return this.field4723.field296;
        }
    }
}
