import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class100 extends class116 {

    @OriginalMember(owner = "client!qd", name = "sb", descriptor = "Z")
    private boolean field2526 = false;

    @OriginalMember(owner = "client!qd", name = "ob", descriptor = "Z")
    private volatile boolean field2522 = false;

    @OriginalMember(owner = "client!qd", name = "Cb", descriptor = "I")
    private int field2536 = -1;

    @OriginalMember(owner = "client!qd", name = "vb", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!qd", name = "xb", descriptor = "Lr;")
    private class102 field2531;

    @OriginalMember(owner = "client!qd", name = "zb", descriptor = "Lr;")
    private class102 field2533;

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "[I")
    public static int[] field2515 = new int[32768];

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "Lhb;")
    public static class44 field2520 = class102.method810("Ignorieren", -28606);

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "Lhb;")
    public static class44 field2517 = class102.method810("Bitte starten Sie eine Mitgliedschaft", -28606);

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
    public static int field2518 = 0;

    @OriginalMember(owner = "client!qd", name = "Fb", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!qd", name = "Kb", descriptor = "I")
    public static int field2544 = 0;

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
    public static int field2519 = 0;

    @OriginalMember(owner = "client!qd", name = "Ab", descriptor = "Lhb;")
    public static class44 field2534 = class102.method810("@yel@", -28606);

    @OriginalMember(owner = "client!qd", name = "Ob", descriptor = "[Z")
    public static boolean[] field2548 = new boolean[5];

    @OriginalMember(owner = "client!qd", name = "Lb", descriptor = "Lhb;")
    private static class44 field2545 = class102.method810("Enter name:", -28606);

    @OriginalMember(owner = "client!qd", name = "Db", descriptor = "Lhb;")
    public static class44 field2537 = class102.method810(" weitere Optionen", -28606);

    @OriginalMember(owner = "client!qd", name = "Pb", descriptor = "Lhb;")
    public static class44 field2549 = field2545;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!qd", name = "pb", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!qd", name = "qb", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!qd", name = "rb", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!qd", name = "tb", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!qd", name = "ub", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!qd", name = "wb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!qd", name = "Bb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!qd", name = "Eb", descriptor = "I")
    private int field2538;

    @OriginalMember(owner = "client!qd", name = "Gb", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!qd", name = "Hb", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!qd", name = "Ib", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!qd", name = "Jb", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!qd", name = "Mb", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!qd", name = "Nb", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!qd", name = "Qb", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!qd", name = "Rb", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!qd", name = "yb", descriptor = "Z")
    public static boolean field2532;

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "[Z")
    private volatile boolean[] field2521;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ[BLr;I)V", line = 6)
    public final void method784(int arg0, boolean arg1, byte[] arg2, class102 arg3, int arg4) {
        if (arg0 == 255) {
            ++field2547;
            if (this.field2531 == arg3) {
                if (this.field2522) {
                    throw new RuntimeException();
                } else if (arg2 == null) {
                    class110.method843(arg0 ^ 1444921839, this.field2529, this, this.field2538, 255, (byte) 0, true);
                } else {
                    class116.field2810.reset();
                    class116.field2810.update(arg2, 0, arg2.length);
                    int var6 = (int) class116.field2810.getValue();
                    if (~this.field2538 != ~var6) {
                        class110.method843(arg0 ^ 1444921839, this.field2529, this, this.field2538, 255, (byte) 0, true);
                    } else {
                        this.method882(92, arg2);
                        this.method794(0);
                    }
                }
            } else {
                if (!arg1 && this.field2536 == arg4) {
                    this.field2522 = true;
                }
                if (arg2 != null && arg2.length > 2) {
                    class116.field2810.reset();
                    class116.field2810.update(arg2, 0, arg2.length + -2);
                    int var7 = (int) class116.field2810.getValue();
                    int var8 = (arg2[arg2.length + -2] << 8 & 65280) - -(arg2[arg2.length - 1] & 255);
                    if (super.field2794[arg4] == var7 && ~super.field2822[arg4] == ~var8) {
                        this.field2521[arg4] = true;
                        if (arg1) {
                            super.field2823[arg4] = arg2;
                        }
                    } else {
                        this.field2521[arg4] = false;
                        if (this.field2526 || arg1) {
                            class110.method843(1444921616, arg4, this, super.field2794[arg4], this.field2529, (byte) 2, arg1);
                        }
                    }
                } else {
                    this.field2521[arg4] = false;
                    if (this.field2526 || arg1) {
                        class110.method843(1444921616, arg4, this, super.field2794[arg4], this.field2529, (byte) 2, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)I", line = 102)
    public final int method785(int arg0) {
        ++field2541;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~super.field2823.length; ++var4) {
            if (~super.field2825[var4] < -1) {
                var2 += 100;
                var3 += this.method790(false, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else if (arg0 < 48) {
            return -39;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(II)V", line = 139)
    public final void method786(int arg0, int arg1) {
        ++field2551;
        if (arg0 != 255) {
            this.method795((byte) 107, -83);
        }
        this.field2538 = arg1;
        if (this.field2531 != null) {
            class98.method777(this.field2531, this, arg0 ^ -136, this.field2529);
        } else {
            class110.method843(arg0 + 1444921361, this.field2529, this, this.field2538, 255, (byte) 0, true);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(IB)V", line = 155)
    public final void method787(int arg0, byte arg1) {
        class97.method766(arg1 ^ -22664, this.field2529, arg0);
        ++field2540;
        if (arg1 != 49) {
            this.field2522 = true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 166)
    public static void method788(int arg0) {
        field2545 = null;
        field2515 = null;
        field2517 = null;
        if (arg0 != 100) {
            field2544 = 76;
        }
        field2534 = null;
        field2520 = null;
        field2537 = null;
        field2548 = null;
        field2549 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lhb;BLtd;Lhb;)[Lne;", line = 188)
    public static final class83[] method789(class44 arg0, byte arg1, class116 arg2, class44 arg3) {
        ++field2514;
        if (arg1 != 2) {
            return null;
        } else {
            int var4 = arg2.method897(arg1 + -37, arg0);
            int var5 = arg2.method890((byte) 87, arg3, var4);
            return class125.method945(-50, arg2, var4, var5);
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(ZI)I", line = 206)
    private final int method790(boolean arg0, int arg1) {
        ++field2516;
        if (super.field2823[arg1] != null) {
            return 100;
        } else if (arg0) {
            return -104;
        } else {
            return this.field2521[arg1] ? 100 : class107.method838(arg1, this.field2529, true);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)Z", line = 225)
    public static final boolean method791(int arg0, boolean arg1) {
        ++field2546;
        if (~arg0 > -1) {
            return false;
        } else {
            if (arg1) {
                field2544 = 69;
            }
            int var2 = class62.field1568[arg0];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            return ~var2 == -7;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lr;Lr;IZZZ)V", line = 405)
    public class100(class102 arg0, class102 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2529 = arg2;
        this.field2531 = arg1;
        this.field2526 = arg5;
        this.field2533 = arg0;
        class48.method456(this, 5027, this.field2529);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(JI)V", line = 270)
    public static final void method792(long arg0, int arg1) {
        ++field2543;
        if (arg0 != 0L) {
            if ((class49.field1208 < 100 || class101.field2574 == 1) && class49.field1208 < 200) {
                class44 var3 = class43.method361(arg0, true).method395(21611);
                for (int var4 = 0; ~class49.field1208 < ~var4; ++var4) {
                    if (class62.field1587[var4] == arg0) {
                        class49.method460(class117.method903(new class44[] { var3, class35.field846 }, false), class51.field1274, (byte) 93, 0);
                        return;
                    }
                }
                for (int var5 = 0; ~class43.field983 < ~var5; ++var5) {
                    if (~class51.field1235[var5] == ~arg0) {
                        class49.method460(class117.method903(new class44[] { class94.field2396, var3, class19.field422 }, false), class51.field1274, (byte) 89, 0);
                        return;
                    }
                }
                if (!var3.method382((byte) -85, class72.field1820.field2651)) {
                    class52.field1300[class49.field1208] = var3;
                    ++class23.field500;
                    class62.field1587[class49.field1208] = arg0;
                    class25.field600[class49.field1208] = 0;
                    ++class49.field1208;
                    class88.field2251 = true;
                    if (arg1 != 21420) {
                        field2515 = null;
                    }
                    class92.field2333.method702(true, 45);
                    class92.field2333.method1018(arg0, -5952);
                }
            } else {
                class49.method460(class107.field2717, class51.field1274, (byte) 110, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)I", line = 339)
    public final int method793(boolean arg0) {
        ++field2527;
        if (this.field2522) {
            return 100;
        } else if (super.field2823 != null) {
            return 99;
        } else {
            if (!arg0) {
                this.method784(-56, false, (byte[]) null, (class102) null, 10);
            }
            int var2 = class107.method838(this.field2529, 255, true);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V", line = 362)
    private final void method794(int arg0) {
        this.field2521 = new boolean[super.field2823.length];
        ++field2550;
        for (int var2 = 0; this.field2521.length > var2; ++var2) {
            this.field2521[var2] = false;
        }
        if (this.field2533 == null) {
            this.field2522 = true;
        } else {
            this.field2536 = -1;
            for (int var3 = arg0; var3 < this.field2521.length; ++var3) {
                if (~super.field2825[var3] < -1) {
                    class23.method167((byte) 125, this, var3, this.field2533);
                    this.field2536 = var3;
                }
            }
            if (this.field2536 == -1) {
                this.field2522 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V", line = 428)
    public final void method795(byte arg0, int arg1) {
        if (this.field2533 != null && this.field2521 != null && this.field2521[arg1]) {
            class98.method777(this.field2533, this, -111, arg1);
        } else {
            class110.method843(1444921616, arg1, this, super.field2794[arg1], this.field2529, (byte) 2, true);
        }
        ++field2524;
        if (arg0 > -86) {
            field2519 = -31;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZZI[B)V", line = 454)
    public final void method796(boolean arg0, boolean arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1) {
            field2545 = null;
        }
        ++field2513;
        if (!arg2) {
            arg4[arg4.length + -2] = (byte) (super.field2822[arg3] >> 8);
            arg4[arg4.length - 1] = (byte) super.field2822[arg3];
            if (this.field2533 != null) {
                class49.method463(this.field2533, arg3, arg4, 2);
                this.field2521[arg3] = true;
            }
            if (arg0) {
                super.field2823[arg3] = arg4;
                return;
            }
        } else {
            if (this.field2522) {
                throw new RuntimeException();
            }
            if (this.field2531 != null) {
                class49.method463(this.field2531, this.field2529, arg4, 2);
            }
            this.method882(-103, arg4);
            this.method794(0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)I", line = 528)
    public static final int method797(int arg0) {
        if (arg0 <= 124) {
            return 92;
        } else {
            ++field2523;
            return class77.field1947++;
        }
    }
}
