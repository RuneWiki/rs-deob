import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class713 {

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Lgg;")
    private class114 field10020 = new class114(64);

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "Lgg;")
    public class114 field10039 = new class114(50);

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "Lrs;")
    public class701 field10040 = new class701(250);

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "Lgs;")
    private class414 field10041 = new class414();

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "Lkha;")
    public class687 field10027;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Z")
    private boolean field10025;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public int field10031;

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "Lco;")
    private class634 field10044;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Lkha;")
    private class687 field10016;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public int field10026;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field10043;

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field10042;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field10018;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field10021;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field10023;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field10024;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field10030;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public static int field10032;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field10034;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public static int field10037;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
    public int field10045;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V", line = 3)
    public final void method3939(byte arg0, int arg1) {
        field10023++;
        this.field10045 = arg1;
        class114 var3 = this.field10039;
        synchronized (this.field10039) {
            if (arg0 != -36) {
                method3952(67, null);
            }
            this.field10039.method776((byte) 52);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 17)
    public final void method3940(int arg0) {
        field10028++;
        if (arg0 == 0) {
            class701 var2 = this.field10040;
            synchronized (this.field10040) {
                this.field10040.method3889(true);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 30)
    public static final void method3941(byte arg0, String arg1, int arg2) {
        field10037++;
        int var3 = class627.field8745;
        int[] var4 = class274.field3465;
        if (arg0 <= 114) {
            field10024 = -51;
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class546 var7 = class447.field6287[var4[var6]];
            if (var7 != null && class339.field4374 != var7 && var7.field7690 != null && var7.field7690.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg2 == 1) {
                    class201.field2565++;
                    class650 var12 = class314.method1837(class336.field4325, true, class625.field8727);
                    var12.field8928.method1124((byte) 106, var4[var6]);
                    var12.field8928.method1132(123, 0);
                    class108.method745(var12, -85);
                } else if (arg2 == 4) {
                    class57.field816++;
                    class650 var8 = class314.method1837(class118.field1444, true, class625.field8727);
                    var8.field8928.method1134(111955568, 0);
                    var8.field8928.method1157(var4[var6], (byte) 123);
                    class108.method745(var8, -7);
                } else if (arg2 == 5) {
                    class234.field3025++;
                    class650 var9 = class314.method1837(class138.field1655, true, class625.field8727);
                    var9.field8928.method1121((byte) -110, 0);
                    var9.field8928.method1124((byte) 106, var4[var6]);
                    class108.method745(var9, -24);
                } else if (arg2 == 6) {
                    class449.field6311++;
                    class650 var11 = class314.method1837(class83.field1077, true, class625.field8727);
                    var11.field8928.method1157(var4[var6], (byte) 120);
                    var11.field8928.method1141(0, -112);
                    class108.method745(var11, -74);
                } else if (arg2 == 7) {
                    class224.field2958++;
                    class650 var10 = class314.method1837(class154.field1885, true, class625.field8727);
                    var10.field8928.method1157(var4[var6], (byte) 113);
                    var10.field8928.method1134(111955568, 0);
                    class108.method745(var10, -85);
                }
                break;
            }
        }
        if (!var5) {
            class395.method2352(class586.field8146.method3261(class416.field5920, (byte) 82) + arg1, 4, -128);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BILrj;)V", line = 119)
    public static final void method3942(byte arg0, int arg1, class747 arg2) {
        int var3 = -57 / ((33 - arg0) / 34);
        field10035++;
        if (class111.field1370 >= 50 || arg2 == null || arg2.field10451 == null || arg2.field10451.length <= arg1 || arg2.field10451[arg1] == null) {
            return;
        }
        int var4 = arg2.field10451[arg1][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xEC) >> 5;
        if (arg2.field10451[arg1].length > 1) {
            int var7 = (int) (Math.random() * (double) arg2.field10451[arg1].length);
            if (var7 > 0) {
                var5 = arg2.field10451[arg1][var7];
            }
        }
        int var8 = 256;
        if (arg2.field10435 != null && arg2.field10457 != null) {
            var8 = class43.method361(arg2.field10457[arg1], -19585, arg2.field10435[arg1]);
        }
        if (arg2.field10434) {
            class487.method2846(0, 255, (byte) -77, var5, var8, false, var6);
        } else {
            class140.method869(255, var5, var8, var6, (byte) 42, 0);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)V", line = 163)
    public final void method3943(boolean arg0, int arg1) {
        field10032++;
        if (arg0 == this.field10025) {
            return;
        }
        if (arg1 != 0) {
            this.field10025 = true;
        }
        this.field10025 = arg0;
        this.method3950(false);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lnq;", line = 179)
    public final class167 method3944(int arg0, int arg1) {
        field10022++;
        class114 var3 = this.field10020;
        class167 var4;
        synchronized (this.field10020) {
            var4 = (class167) this.field10020.method778((long) arg1, arg0 - 142);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field10016;
        byte[] var6;
        synchronized (this.field10016) {
            var6 = this.field10016.method3810(class715.method3967(arg1, (byte) 122), arg0 ^ 0xFFFFA5C0, class470.method2772((byte) -127, arg1));
        }
        class167 var7 = new class167();
        var7.field2159 = this;
        var7.field2185 = arg1;
        var7.field2197 = new String[] { null, null, class586.field8132.method3261(this.field10031, (byte) 82), null, null };
        var7.field2187 = new String[] { null, null, null, null, class586.field8133.method3261(this.field10031, (byte) 82) };
        if (var6 != null) {
            var7.method1041(107, new class179(var6));
        }
        if (arg0 != 256) {
            this.field10020 = null;
        }
        var7.method1049(arg0 + 1368693730);
        if (var7.field2190 != -1) {
            var7.method1039((byte) 127, this.method3944(256, var7.field2211), this.method3944(256, var7.field2190));
        }
        if (var7.field2188 != -1) {
            var7.method1045((byte) 121, this.method3944(256, var7.field2188), this.method3944(256, var7.field2177));
        }
        if (!this.field10025 && var7.field2175) {
            var7.field2149 = class586.field8130.method3261(this.field10031, (byte) 82);
            var7.field2187 = this.field10042;
            var7.field2168 = false;
            var7.field2141 = null;
            var7.field2136 = 0;
            var7.field2197 = this.field10043;
            if (var7.field2165 != null) {
                boolean var8 = false;
                for (class627 var9 = var7.field2165.method3245(false); var9 != null; var9 = var7.field2165.method3252(12938)) {
                    class49 var10 = this.field10044.method3449(2529, (int) var9.field8746);
                    if (var10.field717) {
                        var9.method3426((byte) -9);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field2165 = null;
                }
            }
        }
        class114 var11 = this.field10020;
        synchronized (this.field10020) {
            this.field10020.method774((long) arg1, arg0 ^ 0x152, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 258)
    public final void method3945(int arg0) {
        field10033++;
        class114 var2 = this.field10039;
        synchronized (this.field10039) {
            this.field10039.method776((byte) -82);
            if (arg0 != 36) {
                this.field10043 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V", line = 275)
    public final void method3946(int arg0) {
        field10029++;
        class114 var2 = this.field10020;
        synchronized (this.field10020) {
            this.field10020.method781((byte) 47);
        }
        if (arg0 != -4375) {
            this.field10041 = null;
        }
        class114 var3 = this.field10039;
        synchronized (this.field10039) {
            this.field10039.method781((byte) 47);
        }
        class701 var4 = this.field10040;
        synchronized (this.field10040) {
            this.field10040.method3881((byte) 114);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 298)
    public static final void method3947(byte arg0) {
        int var1 = -91 % ((-arg0 - 41) / 38);
        if (class550.field7739 == null || class132.field1574 == null) {
            class550.field7739 = new int[256];
            class132.field1574 = new int[256];
            for (int var2 = 0; var2 < 256; var2++) {
                double var3 = (double) var2 / 255.0D * 6.283185307179586D;
                class550.field7739[var2] = (int) (Math.sin(var3) * 4096.0D);
                class132.field1574[var2] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        field10017++;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIIIILvea;ILha;)Lac;", line = 328)
    public final class712 method3948(byte arg0, int arg1, int arg2, int arg3, int arg4, class326 arg5, int arg6, class454 arg7) {
        this.field10041.field5836 = arg7.field6368;
        this.field10041.field5839 = arg2;
        this.field10041.field5850 = arg4;
        this.field10041.field5840 = arg5 != null;
        field10021++;
        this.field10041.field5852 = arg3;
        if (arg0 == -83) {
            this.field10041.field5838 = arg6;
            this.field10041.field5843 = arg1;
            return (class712) this.field10040.method3890((byte) -126, this.field10041);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "()V", line = 347)
    public static final void method3949() {
        class469.field6740 = class469.field6743;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V", line = 357)
    public final void method3950(boolean arg0) {
        field10036++;
        class114 var2 = this.field10020;
        synchronized (this.field10020) {
            if (arg0) {
                this.field10027 = null;
            }
            this.field10020.method776((byte) -71);
        }
        class114 var3 = this.field10039;
        synchronized (this.field10039) {
            this.field10039.method776((byte) -68);
        }
        class701 var4 = this.field10040;
        synchronized (this.field10040) {
            this.field10040.method3889(true);
        }
    }

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)V", line = 377)
    public static final void method3951(int arg0) {
        class518.field7289.method130(class154.field1868, class223.field2944.field585.method3565((byte) -123) == 1 ? class402.field5571 + 256 << 2 : -1, 0);
        field10030++;
        if (arg0 != -2) {
            field10038 = 111;
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Ldh;IZLco;Lkha;Lkha;)V", line = 510)
    public class713(class286 arg0, int arg1, boolean arg2, class634 arg3, class687 arg4, class687 arg5) {
        this.field10027 = arg5;
        this.field10025 = arg2;
        this.field10031 = arg1;
        this.field10044 = arg3;
        this.field10016 = arg4;
        if (this.field10016 == null) {
            this.field10026 = 0;
        } else {
            int var7 = this.field10016.method3816(-125) - 1;
            this.field10026 = this.field10016.method3812(0, var7) + var7 * 256;
        }
        this.field10043 = new String[] { null, null, class586.field8132.method3261(this.field10031, (byte) 82), null, null };
        this.field10042 = new String[] { null, null, null, null, class586.field8133.method3261(this.field10031, (byte) 82) };
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILha;)V", line = 392)
    public static final void method3952(int arg0, class454 arg1) {
        if (arg0 != 18172) {
            method3947((byte) -123);
        }
        if (class95.field1206) {
            class179.method1139((byte) 39, arg1);
        } else {
            class327.method1939(arg0 - 18173, arg1);
        }
        field10019++;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V", line = 407)
    public final void method3953(int arg0, boolean arg1) {
        class114 var3 = this.field10020;
        synchronized (this.field10020) {
            this.field10020.method775(1, arg0);
        }
        field10034++;
        class114 var4 = this.field10039;
        synchronized (this.field10039) {
            if (arg1) {
                return;
            }
            this.field10039.method775(1, arg0);
        }
        class701 var5 = this.field10040;
        synchronized (this.field10040) {
            this.field10040.method3882(arg0, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILvea;Lda;IIIIZLha;Lha;Z)Lac;", line = 433)
    public final class712 method3954(int arg0, int arg1, class326 arg2, class423 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class454 arg9, class454 arg10, boolean arg11) {
        field10018++;
        class712 var13 = this.method3948((byte) -83, arg0, arg4, arg1, arg6, arg2, arg7, arg10);
        if (var13 != null) {
            return var13;
        }
        class167 var14 = this.method3944(256, arg1);
        if (arg5 != -1) {
            method3952(-16, null);
        }
        if (arg0 > 1 && var14.field2202 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg0 >= var14.field2205[var16] && var14.field2205[var16] != 0) {
                    var15 = var14.field2202[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3944(arg5 + 257, var15);
            }
        }
        int[] var17 = var14.method1040(arg6, arg7, arg3, arg4, arg10, arg2, 0, arg0, arg11, arg9);
        if (var17 == null) {
            return null;
        }
        class712 var18;
        if (arg8) {
            var18 = arg9.method2666(32, 36, (byte) -48, var17, 0, 36);
        } else {
            var18 = arg10.method2666(32, 36, (byte) -48, var17, 0, 36);
        }
        if (!arg8) {
            class414 var19 = new class414();
            var19.field5840 = arg2 != null;
            var19.field5838 = arg7;
            var19.field5850 = arg6;
            var19.field5852 = arg1;
            var19.field5836 = arg10.field6368;
            var19.field5843 = arg0;
            var19.field5839 = arg4;
            this.field10040.method3892(var18, var19, (byte) -54);
        }
        return var18;
    }
}
