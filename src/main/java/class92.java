import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class92 extends class286 {

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    private int field1552 = 0;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    private int field1556 = 0;

    @OriginalMember(owner = "client!sl", name = "kb", descriptor = "I")
    private int field1570 = 0;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "Lbe;")
    public static class283 field1551 = class153.method941(-60, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!sl", name = "hb", descriptor = "Lbe;")
    private static class283 field1567 = class153.method941(9, "FULL");

    @OriginalMember(owner = "client!sl", name = "fb", descriptor = "Lbe;")
    public static class283 field1565 = class153.method941(125, "not yet implemented");

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "Lbe;")
    public static class283 field1562 = field1567;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "Lbe;")
    public static class283 field1550 = class153.method941(127, "welle:");

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
    public static volatile int field1558 = 0;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static volatile int field1547 = 0;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client!sl", name = "eb", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!sl", name = "gb", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!sl", name = "ib", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!sl", name = "jb", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!sl", name = "mb", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!sl", name = "ob", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client!sl", name = "pb", descriptor = "I")
    private int field1575;

    @OriginalMember(owner = "client!sl", name = "db", descriptor = "Lek;")
    public static class172 field1563;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "Ldj;")
    public static class310 field1548;

    @OriginalMember(owner = "client!sl", name = "nb", descriptor = "[I")
    public static int[] field1573;

    @OriginalMember(owner = "client!sl", name = "lb", descriptor = "[S")
    public static short[] field1571;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIII)V", line = 5)
    private final void method585(int arg0, int arg1, int arg2, int arg3) {
        field1549++;
        int var5 = arg1 > arg3 ? arg1 : arg3;
        int var6 = var5 >= arg2 ? var5 : arg2;
        int var7 = arg3 <= arg1 ? arg3 : arg1;
        int var8 = var7 <= arg2 ? var7 : arg2;
        this.field1575 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (this.field1575 > 0 && this.field1575 < 4096) {
            this.field1569 = (var9 << 12) / (this.field1575 <= 2048 ? this.field1575 * 2 : 8192 - (this.field1575 * 2));
        } else {
            this.field1569 = 0;
        }
        if (arg0 != 2048) {
            method587(false, 23);
        }
        if (var9 <= 0) {
            this.field1560 = 0;
            return;
        }
        int var10 = (var6 - arg1 << 12) / var9;
        int var11 = (var6 - arg3 << 12) / var9;
        int var12 = (var6 - arg2 << 12) / var9;
        if (arg1 == var6) {
            this.field1560 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
        } else if (arg3 == var6) {
            this.field1560 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
        } else {
            this.field1560 = arg1 == var8 ? var11 + 12288 : 20480 - var10;
        }
        this.field1560 /= 6;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lfe;ZI)V", line = 59)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        if (arg2 == 0) {
            this.field1556 = arg0.method1507(92);
        } else if (arg2 == 1) {
            this.field1570 = (arg0.method1497(arg1) << 12) / 100;
        } else if (arg2 == 2) {
            this.field1552 = (arg0.method1497(arg1) << 12) / 100;
        }
        field1568++;
    }

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "(I)V", line = 104)
    public static void method586(int arg0) {
        field1562 = null;
        field1573 = null;
        field1565 = null;
        field1563 = null;
        field1550 = null;
        if (arg0 != 0) {
            method590(23, (byte) -107, 41, 103);
        }
        field1548 = null;
        field1571 = null;
        field1551 = null;
        field1567 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V", line = 125)
    public static final void method587(boolean arg0, int arg1) {
        field1555++;
        if (arg1 == -1 || !class229.field3911[arg1]) {
            return;
        }
        class259.field4410.method1114(arg1, (byte) -73);
        if (class122.field2036[arg1] == null) {
            return;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < class122.field2036[arg1].length; var3++) {
            if (class122.field2036[arg1][var3] != null) {
                if (class122.field2036[arg1][var3].field1143 == 2) {
                    var2 = false;
                } else {
                    class122.field2036[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class122.field2036[arg1] = null;
        }
        class229.field3911[arg1] = false;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)Z", line = 179)
    public static final boolean method588(int arg0, int arg1) {
        field1566++;
        if (class229.field3911[arg0]) {
            return true;
        } else if (class259.field4410.method1090(arg0, (byte) 69)) {
            int var2 = class259.field4410.method1108(arg0, -110);
            if (arg1 > -4) {
                return false;
            } else if (var2 == 0) {
                class229.field3911[arg0] = true;
                return true;
            } else {
                if (class122.field2036[arg0] == null) {
                    class122.field2036[arg0] = new class69[var2];
                }
                for (int var3 = 0; var3 < var2; var3++) {
                    if (class122.field2036[arg0][var3] == null) {
                        byte[] var4 = class259.field4410.method1107(arg0, var3, 125);
                        if (var4 != null) {
                            class122.field2036[arg0][var3] = new class69();
                            class122.field2036[arg0][var3].field1079 = (arg0 << 16) + var3;
                            if (var4[0] == -1) {
                                class122.field2036[arg0][var3].method440(new class229(var4), -119);
                            } else {
                                class122.field2036[arg0][var3].method446(new class229(var4), true);
                            }
                        }
                    }
                }
                class229.field3911[arg0] = true;
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 587)
    public class92() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)[[I", line = 247)
    public final int[][] method16(int arg0, byte arg1) {
        field1557++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (arg1 != -19) {
            this.field1552 = -86;
        }
        if (this.field4878.field2524) {
            int[][] var4 = this.method1964(arg0, 0, false);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class27.field410; var11++) {
                this.method585(2048, var5[var11], var8[var11], var6[var11]);
                for (this.field1560 += this.field1556; this.field1560 < 0; this.field1560 += 4096) {
                }
                this.field1569 += this.field1570;
                if (this.field1569 < 0) {
                    this.field1569 = 0;
                }
                if (this.field1569 > 4096) {
                    this.field1569 = 4096;
                }
                while (this.field1560 > 4096) {
                    this.field1560 -= 4096;
                }
                this.field1575 += this.field1552;
                if (this.field1575 < 0) {
                    this.field1575 = 0;
                }
                if (this.field1575 > 4096) {
                    this.field1575 = 4096;
                }
                this.method589(this.field1575, arg1 + 133, this.field1569, this.field1560);
                var9[var11] = this.field1559;
                var7[var11] = this.field1561;
                var10[var11] = this.field1574;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(IIII)V", line = 326)
    private final void method589(int arg0, int arg1, int arg2, int arg3) {
        field1564++;
        if (arg1 <= 103) {
            return;
        }
        int var5 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : arg0 + arg2 - (arg0 * arg2 >> 12);
        if (var5 <= 0) {
            this.field1559 = this.field1561 = this.field1574 = arg0;
            return;
        }
        int var6 = arg3 * 6;
        int var7 = arg0 + arg0 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var10 = var6 >> 12;
        int var11 = var6 - (var10 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var11 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var10 == 0) {
            this.field1561 = var14;
            this.field1574 = var7;
            this.field1559 = var5;
        } else if (var10 == 1) {
            this.field1559 = var15;
            this.field1561 = var5;
            this.field1574 = var7;
        } else if (var10 == 2) {
            this.field1559 = var7;
            this.field1574 = var14;
            this.field1561 = var5;
        } else if (var10 == 3) {
            this.field1559 = var7;
            this.field1561 = var15;
            this.field1574 = var5;
        } else if (var10 == 4) {
            this.field1561 = var7;
            this.field1574 = var5;
            this.field1559 = var14;
        } else if (var10 == 5) {
            this.field1574 = var15;
            this.field1561 = var7;
            this.field1559 = var5;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBII)I", line = 433)
    public static final int method590(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 107) {
            field1562 = (class283) null;
        }
        int var4 = arg0 & 0x3;
        field1553++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III[Lpk;IIII[BZI)V", line = 464)
    public static final void method591(int arg0, int arg1, int arg2, class104[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, boolean arg9, int arg10) {
        class229 var11 = new class229(arg8);
        int var12 = -1;
        if (arg6 > -104) {
            method587(true, 44);
        }
        field1554++;
        while (true) {
            int var13 = var11.method1524((byte) 28);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method1557(255);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method1535((byte) 81);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg0 == var18 && arg1 <= var17 && var17 < arg1 + 8 && arg10 <= var16 && (arg10 + 8) > var16) {
                    class281 var22 = class254.method1722(0, var12);
                    int var23 = arg7 + class22.method165(var16 & 0x7, var22.field4754, 1, var22.field4727, var17 & 0x7, var20, arg4);
                    int var24 = class155.method951(var22.field4754, var20, var22.field4727, -29, arg4, var17 & 0x7, var16 & 0x7) + arg5;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class104 var25 = null;
                        if (!arg9) {
                            int var26 = arg2;
                            if ((class252.field4282[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg3[var26];
                            }
                        }
                        class306.method2087(arg9, arg4 + var20 & 0x3, var12, !arg9, arg2, 1, arg2, var24, var25, var21, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)Lsk;", line = 557)
    public static final class118 method592(byte arg0, int arg1) {
        field1572++;
        int var2 = 75 % ((-arg0 - 69) / 41);
        class118 var3 = (class118) class236.field3951.method77((long) arg1, 12);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class96.field1602.method1107(11, arg1, 124);
        class118 var5 = new class118();
        if (var4 != null) {
            var5.method759(new class229(var4), -1);
        }
        class236.field3951.method85(var5, (long) arg1, (byte) -61);
        return var5;
    }
}
