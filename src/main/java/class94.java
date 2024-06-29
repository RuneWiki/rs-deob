import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class94 extends class111 implements class57 {

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "Ltj;")
    public class170 field1100;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "Z")
    private boolean field1114;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "Leea;")
    public static class114 field1106 = new class114();

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "Lew;")
    private class425 field1101;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "Lsn;")
    public static class547 field1116;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Loa;I)Lew;", line = 3)
    public final class425 method100(class605 arg0, int arg1) {
        ++field1119;
        if (arg1 != 28286) {
            this.method98(-59, (class605) null);
        }
        return this.field1101;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(B)V", line = 15)
    public static void method594(byte arg0) {
        int var1 = -15 % ((arg0 - 50) / 44);
        field1106 = null;
        field1116 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILoa;)V", line = 25)
    public final void method98(int arg0, class605 arg1) {
        this.field1100.method972(arg1, -22979);
        ++field1102;
        if (arg0 != 16343) {
            this.method89(70);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Leca;Lkr;IZI)V", line = 36)
    public static final void method595(class655 arg0, class645 arg1, int arg2, boolean arg3, int arg4) {
        ++field1120;
        if ((128 & arg4) != 0) {
            int var5 = arg1.method1197(true);
            if (~var5 == -65536) {
                var5 = -1;
            }
            int var6 = arg1.method1190(!arg3);
            class35.method196(-1961, var6, var5, arg0);
        }
        byte var7 = -1;
        if ((arg4 & 64) != 0) {
            arg0.field9445 = arg1.method1195((byte) -126);
            if (~arg0.field2517 == -1) {
                arg0.method1155(arg0.field9445, (byte) 79);
                arg0.field9445 = -1;
            }
        }
        if ((arg4 & 131072) != 0) {
            int var8 = class287.field3982;
            int var9 = arg1.method1176((byte) -2);
            int var10 = arg1.method1177(255);
            arg0.method1156(var8, false, var9, var10);
        }
        if (~(arg4 & 16) != -1) {
            int var11 = arg1.method1239((byte) 119);
            int var12 = arg1.method1178(-230315992);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var13 = arg1.method1190(false);
            arg0.method1150(false, var13, var11, var12, (byte) -68);
        }
        if (~(4 & arg4) != -1) {
            class297.field4401[arg2] = arg1.method1227((byte) 98);
        }
        if (~(arg4 & 32768) != -1) {
            arg0.field2466 = arg1.method1227((byte) 98);
            arg0.field2429 = arg1.method1227((byte) 98);
            arg0.field2463 = arg1.method1227((byte) 98);
            arg0.field2461 = arg1.method1213((byte) 117);
            arg0.field2459 = arg1.method1239((byte) 110) + class287.field3982;
            arg0.field2498 = arg1.method1239((byte) 118) - -class287.field3982;
            arg0.field2441 = arg1.method1226(128);
            if (!arg0.field9472) {
                arg0.field2429 += arg0.field2524[0];
                arg0.field2461 += arg0.field2524[0];
                arg0.field2517 = 1;
                arg0.field2466 += arg0.field2515[0];
                arg0.field2463 += arg0.field2515[0];
            } else {
                arg0.field2461 += arg0.field9468;
                arg0.field2466 += arg0.field9437;
                arg0.field2429 += arg0.field9468;
                arg0.field2517 = 0;
                arg0.field2463 += arg0.field9437;
            }
            arg0.field2519 = 0;
        }
        if (~(512 & arg4) != -1) {
            int var14 = arg1.method1197(true);
            if (~var14 == -65536) {
                var14 = -1;
            }
            int var15 = arg1.method1234((byte) 76);
            int var16 = arg1.method1209(-24738);
            arg0.method1150(true, var16, var14, var15, (byte) -68);
        }
        if (~(16384 & arg4) != -1) {
            arg0.field2445 = arg1.method1218(false);
            if (arg0.field2445.charAt(0) != '~') {
                if (class439.field6548 == arg0) {
                    class117.method726(arg0.field9469, -1, 0, arg0.field2445, arg0.method3744(91, true), 2, arg0.method3743((byte) 101, false));
                }
            } else {
                arg0.field2445 = arg0.field2445.substring(1);
                class117.method726(arg0.field9469, -1, 0, arg0.field2445, arg0.method3744(-27, true), 2, arg0.method3743((byte) 101, false));
            }
            arg0.field2423 = 0;
            arg0.field2474 = 150;
            arg0.field2447 = 0;
        }
        if (~(2 & arg4) != -1) {
            int var17 = arg1.method1177(255);
            byte[] var18 = new byte[var17];
            class194 var19 = new class194(var18);
            arg1.method1219(var17, -128, 0, var18);
            class444.field6644[arg2] = var19;
            arg0.method3739(23402856, var19);
        }
        if ((65536 & arg4) != 0) {
            arg0.field2464 = arg1.method1186(27029);
            arg0.field2467 = arg1.method1186(27029);
            arg0.field2430 = arg1.method1215(-2);
            arg0.field2503 = (byte) arg1.method1190(false);
            arg0.field2449 = class287.field3982 + arg1.method1239((byte) 117);
            arg0.field2417 = class287.field3982 + arg1.method1220(126);
        }
        if ((256 & arg4) != 0) {
            var7 = arg1.method1213((byte) 37);
        }
        if ((arg4 & 1) != 0) {
            int var20 = arg1.method1220(126);
            if (var20 == 65535) {
                var20 = -1;
            }
            arg0.field2469 = var20;
        }
        if (arg3) {
            if ((4096 & arg4) != 0) {
                arg0.field9476 = arg1.method1177(255) == 1;
            }
            if (~(arg4 & 8192) != -1) {
                int var21 = arg1.method1209(-24738);
                int[] var22 = new int[var21];
                int[] var23 = new int[var21];
                int[] var24 = new int[var21];
                for (int var25 = 0; ~var25 > ~var21; ++var25) {
                    int var26 = arg1.method1239((byte) -21);
                    if (~var26 == -65536) {
                        var26 = -1;
                    }
                    var22[var25] = var26;
                    var23[var25] = arg1.method1190(!arg3);
                    var24[var25] = arg1.method1195((byte) -125);
                }
                class633.method3617((byte) -123, arg0, var24, var22, var23);
            }
            if ((1024 & arg4) != 0) {
                int var27 = arg1.method1220(112);
                arg0.field2484 = arg1.method1209(-24738);
                arg0.field2480 = arg1.method1226(128);
                arg0.field2500 = 32767 & var27;
                arg0.field2431 = (var27 & 32768) != 0;
                arg0.field2438 = class287.field3982 + arg0.field2500 - -arg0.field2484;
            }
            if ((arg4 & 8) != 0) {
                int var28 = arg1.method1176((byte) -83);
                int var29 = arg1.method1177(255);
                arg0.method1156(class287.field3982, false, var28, var29);
                arg0.field2457 = class287.field3982 + 300;
                arg0.field2493 = arg1.method1209(-24738);
            }
            if (arg0.field9472) {
                if (var7 != 127) {
                    byte var30;
                    if (var7 == -1) {
                        var30 = class297.field4401[arg2];
                    } else {
                        var30 = var7;
                    }
                    arg0.method3745(arg0.field9437, arg0.field9468, -1, var30);
                } else {
                    arg0.method3736(arg0.field9437, 0, arg0.field9468);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "()V", line = 297)
    public static final void method596() {
        for (int var0 = 0; var0 < class392.field6001; ++var0) {
            class144 var1 = class392.field6000[var0];
            class290.method1877(var1);
            class392.field6000[var0] = null;
        }
        class392.field6001 = 0;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lkea;I)V", line = 310)
    public static final void method597(class203 arg0, int arg1) {
        if (arg1 != 0) {
            method597((class203) null, -118);
        }
        class620.field8988 = arg0;
        ++field1117;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I", line = 321)
    public final int method95(int arg0) {
        int var2 = 26 % ((14 - arg0) / 33);
        ++field1118;
        return this.field1100.field2098;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Loa;Lqd;IIIIIZII)V", line = 332)
    public class94(class605 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field5824, arg1.field5835, arg1.field5870);
        this.field1100 = new class170(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field1114 = ~arg1.field5806 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZLoa;)Lba;", line = 344)
    public final class327 method94(int arg0, boolean arg1, class605 arg2) {
        ++field1109;
        if (arg1) {
            method596();
        }
        return this.field1100.method981(0, false, 0, 125, arg0, arg2, false);
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I", line = 355)
    public final int method92(int arg0) {
        ++field1105;
        if (arg0 != 9812) {
            this.method86(84, -41, 45, (class429) null, (class605) null, true, 20);
        }
        return this.field1100.field2087;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V", line = 366)
    public final void method96(byte arg0) {
        if (arg0 == -76) {
            ++field1110;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Loa;I)V", line = 377)
    public final void method90(class605 arg0, int arg1) {
        if (arg1 == -5) {
            ++field1108;
            class327 var3 = this.field1100.method981(super.field1368, true, super.field1365, 122, 262144, arg0, true);
            if (var3 != null) {
                int var4 = super.field1368 >> 9;
                int var5 = super.field1365 >> 9;
                class364 var6 = arg0.method342();
                var6.method2014(super.field1368, super.field1362, super.field1365);
                this.field1100.method976(var6, (byte) 82, var3, var4, false, var5, var4, arg0, var5);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIILva;Loa;ZI)V", line = 403)
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        if (arg0 == 7) {
            ++field1103;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)Z", line = 415)
    public final boolean method84(int arg0) {
        if (arg0 != 1630) {
            field1116 = null;
        }
        ++field1121;
        return false;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILoa;I)Z", line = 431)
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        ++field1111;
        if (arg0 != -10503) {
            this.field1101 = null;
        }
        class327 var5 = this.field1100.method981(super.field1368, false, super.field1365, 103, 131072, arg2, false);
        if (var5 == null) {
            return false;
        } else {
            class364 var6 = arg2.method342();
            var6.method2014(super.field1368, super.field1362, super.field1365);
            return var5.method1381(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLoa;)V", line = 452)
    public final void method102(byte arg0, class605 arg1) {
        this.field1100.method975(262144, arg1);
        if (arg0 > -54) {
            field1116 = null;
        }
        ++field1104;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Loa;B)Laca;", line = 463)
    public final class630 method88(class605 arg0, byte arg1) {
        ++field1107;
        if (arg1 > -127) {
            return null;
        } else {
            class327 var3 = this.field1100.method981(super.field1368, true, super.field1365, 125, 2048, arg0, false);
            if (var3 == null) {
                return null;
            } else {
                class364 var4 = arg0.method342();
                var4.method2014(super.field1368, super.field1362, super.field1365);
                class630 var5 = null;
                if (this.field1114) {
                    var5 = class471.method2882(-128, 1);
                }
                int var6 = super.field1368 >> 9;
                int var7 = super.field1365 >> 9;
                this.field1100.method976(var4, (byte) 68, var3, var6, true, var7, var6, arg0, var7);
                if (this.field1100.field2075 == null) {
                    var3.method1380(var4, var5 != null ? var5.field9084[0] : null, 0);
                } else {
                    class33 var8 = this.field1100.field2075.method1334();
                    arg0.method307(var3, var8, var4, var5 != null ? var5.field9084[0] : null, 0);
                }
                if (this.field1101 == null) {
                    this.field1101 = class645.method3676(super.field1365, super.field1362, (byte) -71, super.field1368, var3);
                } else {
                    class27.method158(super.field1365, this.field1101, (byte) 94, var3, super.field1368, super.field1362);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Z", line = 510)
    public final boolean method93(int arg0) {
        if (arg0 != -23445) {
            return true;
        } else {
            ++field1112;
            return this.field1100.method979(1597);
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)I", line = 522)
    public final int method89(int arg0) {
        int var2 = 88 % ((arg0 - 11) / 51);
        ++field1115;
        return this.field1100.field2079;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V", line = 534)
    public final void method87(int arg0) {
        ++field1113;
        if (arg0 != 7511) {
            this.field1114 = true;
        }
    }
}
