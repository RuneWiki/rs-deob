import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class11 {

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "B")
    public byte field188 = 0;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public int field192 = -1;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    private int field190 = 128;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    private int field196 = 0;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    private int field194 = -1;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    private int field202 = 128;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    private int field195 = 0;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "Z")
    public boolean field201 = false;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    private int field199 = 0;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field191 = new String[200];

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "F")
    public static float field203;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Lqp;")
    public class475 field185;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Lpw;")
    public static class507 field184;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "[S")
    private short[] field189;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "[S")
    private short[] field193;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "[S")
    private short[] field200;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "[S")
    private short[] field205;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILeg;IBILqa;Lo;IIZIILo;I)Lka;", line = 13)
    private final class334 method104(int arg0, class70 arg1, int arg2, byte arg3, int arg4, class165 arg5, class23 arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, class23 arg12, int arg13) {
        field187++;
        int var15 = arg7;
        class91 var16 = this.field192 == -1 || arg11 == -1 ? null : arg1.method489(arg0 - 4013, this.field192);
        boolean var17 = arg9 & this.field188 != 0;
        if (arg0 != 4096) {
            this.method109(-44, 5, 23, -124, null, -98, null);
        }
        if (var16 != null) {
            var15 = arg7 | var16.method618(arg2, false, arg11, (byte) 76);
        }
        if (var17) {
            var15 |= this.field188 == 3 ? 7 : 2;
        }
        if (this.field190 != 128) {
            var15 |= 0x2;
        }
        if (this.field202 != 128 || this.field195 != 0) {
            var15 |= 0x5;
        }
        class330 var18 = this.field185.field7061;
        class334 var19;
        synchronized (this.field185.field7061) {
            var19 = (class334) this.field185.field7061.method2133((long) (this.field182 |= arg5.field2233 << 29), (byte) 62);
        }
        if (var19 == null || arg5.method775(var19.method46(), var15) != 0) {
            if (var19 != null) {
                var15 = arg5.method781(var15, var19.method46());
            }
            int var20 = var15;
            if (this.field193 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field200 != null) {
                var20 |= 0x8000;
            }
            class387 var21 = class261.method1690(0, this.field185.field7055, this.field204, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field5887 < 13) {
                var21.method2419(0, (byte) -123);
            }
            var19 = arg5.method833(var21, var20, this.field185.field7062, this.field196 + 64, this.field199 - -850);
            if (this.field193 != null) {
                for (int var22 = 0; var22 < this.field193.length; var22++) {
                    var19.method29(this.field193[var22], this.field205[var22]);
                }
            }
            if (this.field200 != null) {
                for (int var23 = 0; var23 < this.field200.length; var23++) {
                    var19.method57(this.field200[var23], this.field189[var23]);
                }
            }
            var19.method62(var15);
            class330 var24 = this.field185.field7061;
            synchronized (this.field185.field7061) {
                this.field185.field7061.method2131(var19, (long) (this.field182 |= arg5.field2233 << 29), false);
            }
        }
        class334 var25 = var16 == null ? var19.method47(arg3, var15, true) : var16.method617(arg10, arg2, arg3, arg11, -6593, var19, 0, var15);
        if (this.field202 != 128 || this.field190 != 128) {
            var25.method90(this.field202, this.field190, this.field202);
        }
        if (this.field195 != 0) {
            if (this.field195 == 90) {
                var25.method44(4096);
            }
            if (this.field195 == 180) {
                var25.method44(8192);
            }
            if (this.field195 == 270) {
                var25.method44(12288);
            }
        }
        if (var17) {
            var25.method80(this.field188, this.field194, arg6, arg12, arg4, arg13, arg8);
        }
        var25.method62(arg7);
        return var25;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZZ)V", line = 131)
    public static final void method105(boolean arg0, boolean arg1) {
        if (arg0) {
            method105(true, false);
        }
        field197++;
        while (class409.field6214.method945(class497.field7326, -7365) >= 15) {
            int var2 = class409.field6214.method949(39, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class24 var4 = (class24) class406.field6158.method1747((long) var2, false);
            if (var4 == null) {
                class17 var5 = new class17();
                var5.field3882 = var2;
                var4 = new class24(var5);
                class406.field6158.method1751((long) var2, -82, var4);
                var3 = true;
                class480.field7090[class515.field7566++] = var4;
            }
            class17 var6 = var4.field348;
            class224.field3114[class333.field5187++] = var2;
            var6.field3859 = class393.field6017;
            if (var6.field274 != null && var6.field274.method1665((byte) 107)) {
                class308.method1930(var6, true);
            }
            int var7;
            if (arg1) {
                var7 = class409.field6214.method949(104, 8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class409.field6214.method949(37, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            int var8 = (class409.field6214.method949(88, 3) + 4 & 0x7D200007) << 11;
            int var9;
            if (arg1) {
                var9 = class409.field6214.method949(53, 8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = class409.field6214.method949(87, 5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10 = class409.field6214.method949(49, 1);
            if (var10 == 1) {
                class421.field6420[class282.field4151++] = var2;
            }
            int var11 = class409.field6214.method949(31, 2);
            int var12 = class409.field6214.method949(111, 1);
            var6.method167(8046, class137.field1834.method1626((byte) -15, class409.field6214.method949(12, 14)));
            var6.method1771(var6.field274.field3586, 0);
            var6.field3878 = var6.field274.field3568 << 3;
            if (var3) {
                var6.method1768(var8, true, 6946);
            }
            var6.method168((byte) 85, var6.method637((byte) 99), class56.field800.field3917[0] + var7, class56.field800.field3915[0] + var9, var11, var12 == 1);
            if (var6.field274.method1665((byte) 116)) {
                class165.method1124(0, var6.field3915[0], -2, var6, var6.field1866, null, var6.field3917[0], null);
            }
        }
        class409.field6214.method952(14);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 234)
    public static void method106(byte arg0) {
        field184 = null;
        field191 = null;
        if (arg0 < 85) {
            field184 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZILo;ILeg;Lqa;IILo;III)Lka;", line = 248)
    public final class334 method107(int arg0, boolean arg1, int arg2, class23 arg3, int arg4, class70 arg5, class165 arg6, int arg7, int arg8, class23 arg9, int arg10, int arg11, int arg12) {
        if (arg10 != -26047) {
            method105(false, true);
        }
        field198++;
        return this.method104(4096, arg5, arg4, (byte) 2, arg2, arg6, arg9, arg12, arg11, arg1, arg8, arg7, arg3, arg0);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lnj;B)V", line = 261)
    public final void method108(class164 arg0, byte arg1) {
        field183++;
        if (arg1 != -55) {
            return;
        }
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                return;
            }
            this.method111((byte) 114, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIILqa;ILeg;)Lka;", line = 290)
    public final class334 method109(int arg0, int arg1, int arg2, int arg3, class165 arg4, int arg5, class70 arg6) {
        field181++;
        if (arg1 != 5) {
            this.field195 = 122;
        }
        return this.method104(4096, arg6, arg3, (byte) 5, 0, arg4, null, arg2, 0, false, arg5, arg0, null, 0);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lqa;IIIILeg;B)Lka;", line = 312)
    public final class334 method110(class165 arg0, int arg1, int arg2, int arg3, int arg4, class70 arg5, byte arg6) {
        if (arg6 < 30) {
            return null;
        } else {
            field186++;
            return this.method104(4096, arg5, arg4, (byte) 2, 0, arg0, null, arg3, 0, false, arg2, arg1, null, 0);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLnj;I)V", line = 335)
    private final void method111(byte arg0, class164 arg1, int arg2) {
        field206++;
        if (arg2 == 1) {
            this.field204 = arg1.method1074(-635989152);
        } else if (arg2 == 2) {
            this.field192 = arg1.method1074(-635989152);
        } else if (arg2 == 4) {
            this.field202 = arg1.method1074(-635989152);
        } else if (arg2 == 5) {
            this.field190 = arg1.method1074(-635989152);
        } else if (arg2 == 6) {
            this.field195 = arg1.method1074(-635989152);
        } else if (arg2 == 7) {
            this.field196 = arg1.method1087(false);
        } else if (arg2 == 8) {
            this.field199 = arg1.method1087(false);
        } else if (arg2 == 9) {
            this.field194 = 8224;
            this.field188 = 3;
        } else if (arg2 == 10) {
            this.field201 = true;
        } else if (arg2 == 11) {
            this.field188 = 1;
        } else if (arg2 == 12) {
            this.field188 = 4;
        } else if (arg2 == 13) {
            this.field188 = 5;
        } else if (arg2 == 14) {
            this.field188 = 2;
            this.field194 = arg1.method1087(false) * 256;
        } else if (arg2 == 15) {
            this.field188 = 3;
            this.field194 = arg1.method1074(-635989152);
        } else if (arg2 == 16) {
            this.field188 = 3;
            this.field194 = arg1.method1099(90);
        } else if (arg2 == 40) {
            int var4 = arg1.method1087(false);
            this.field193 = new short[var4];
            this.field205 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field193[var5] = (short) arg1.method1074(-635989152);
                this.field205[var5] = (short) arg1.method1074(-635989152);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1087(false);
            this.field200 = new short[var6];
            this.field189 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field200[var7] = (short) arg1.method1074(-635989152);
                this.field189[var7] = (short) arg1.method1074(-635989152);
            }
        }
        if (arg0 < 21) {
            field203 = -1.8658981F;
        }
    }
}
