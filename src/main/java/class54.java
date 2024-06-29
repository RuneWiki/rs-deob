import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class54 extends class115 {

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field606 = 0;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "[Ldl;")
    public static class39[] field613 = new class39[4];

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "Ljava/lang/String;")
    public static String field614 = "Loaded update list";

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "Z")
    public static boolean field618 = false;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "Lra;")
    public static class57 field611;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "[Lna;")
    private class30[] field604;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method312(byte arg0, String arg1) {
        ++field617;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg0 != 125) {
            method317((byte) -51);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
    public static final void method313(int arg0) {
        if (class406.field5896 != null) {
            class50 var1 = class406.field5896;
            synchronized (class406.field5896) {
                class406.field5896 = null;
            }
        }
        ++field609;
        if (arg0 >= -111) {
            field607 = 79;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field603;
        int[] var3 = super.field1340.method14(82, arg0);
        if (arg1 != 0) {
            field611 = null;
        }
        if (super.field1340.field35) {
            this.method318(0, super.field1340.method15(true));
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
    public static final void method314(int arg0, int arg1) {
        if (arg1 != 0) {
            field607 = -116;
        }
        ++field612;
        class331 var2 = class424.field6079;
        synchronized (class424.field6079) {
            class424.field6079.method2043(-76);
            class424.field6079 = new class331(arg0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 <= 83) {
            this.method318(88, (int[][]) null);
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field1347 = arg1.method1342((byte) -128) == 1;
            }
        } else {
            this.field604 = new class30[arg1.method1342((byte) -127)];
            for (int var4 = 0; this.field604.length > var4; ++var4) {
                int var5 = arg1.method1342((byte) -127);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field604[var4] = class146.method869(arg1, true);
                            }
                        } else {
                            this.field604[var4] = class331.method2050(arg1, 1);
                        }
                    } else {
                        this.field604[var4] = class240.method1531(arg1, (byte) 109);
                    }
                } else {
                    this.field604[var4] = class430.method2678(94, arg1);
                }
            }
        }
        ++field616;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[[I")
    public final int[][] method144(int arg0, int arg1) {
        ++field610;
        int[][] var3 = super.field1342.method2530(arg0, (byte) 91);
        int var4 = -59 / ((arg1 - -80) / 45);
        if (super.field1342.field5819) {
            int var5 = class218.field2979;
            int var6 = class392.field5738;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field1342.method2533(0);
            this.method318(0, var7);
            for (int var9 = 0; ~var9 > ~class392.field5738; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~class218.field2979 < ~var15; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class40.method253(4080, var16 << 4);
                    var13[var15] = class40.method253(4080, var16 >> 4);
                    var12[var15] = class40.method253(var16, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)[Ld;")
    public static final class83[] method315(int arg0) {
        ++field608;
        if (arg0 != 4305) {
            return null;
        } else {
            if (class337.field4994 == null) {
                class83[] var1 = class144.method850(arg0 ^ -10598, class323.field4554);
                class83[] var2 = new class83[var1.length];
                int var3 = 0;
                label66: for (int var4 = 0; ~var1.length < ~var4; ++var4) {
                    class83 var8 = var1[var4];
                    if ((~var8.field931 >= -1 || var8.field931 >= 24) && var8.field938 >= 800 && ~var8.field933 <= -601 && (~class343.field5053 <= -97 || ~class341.field5018 != -1 || ~var8.field938 >= -1025 && ~var8.field933 >= -769)) {
                        for (int var9 = 0; ~var3 < ~var9; ++var9) {
                            class83 var10 = var2[var9];
                            if (~var8.field938 == ~var10.field938 && ~var8.field933 == ~var10.field933) {
                                if (~var8.field931 < ~var10.field931) {
                                    var2[var9] = var8;
                                }
                                continue label66;
                            }
                        }
                        var2[var3] = var8;
                        ++var3;
                    }
                }
                class337.field4994 = new class83[var3];
                class408.method2570(var2, 0, class337.field4994, 0, var3);
                int[] var5 = new int[class337.field4994.length];
                for (int var6 = 0; var6 < class337.field4994.length; ++var6) {
                    class83 var7 = class337.field4994[var6];
                    var5[var6] = var7.field938 * var7.field933;
                }
                class92.method494((byte) -105, var5, class337.field4994);
            }
            return class337.field4994;
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)V")
    public static void method316(byte arg0) {
        if (arg0 != -104) {
            method315(13);
        }
        field614 = null;
        field611 = null;
        field613 = null;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(B)V")
    public static final void method317(byte arg0) {
        for (int var1 = 0; class35.field353 > var1; ++var1) {
            class283 var2 = class350.method2228(var1, arg0 ^ -10);
            if (var2 != null && var2.field3970 == 0) {
                class282.field3967[var1] = 0;
                class283.field3972[var1] = 0;
            }
        }
        if (arg0 != 8) {
            field618 = false;
        }
        ++field605;
        class443.field6474 = new class189(16);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[[I)V")
    private final void method318(int arg0, int[][] arg1) {
        ++field615;
        int var3 = class218.field2979;
        int var4 = class392.field5738;
        class2.method13((byte) 95, arg1);
        class376.method2366(0, class315.field4488, arg0, class92.field1013, 0);
        if (this.field604 != null) {
            for (int var5 = 0; ~var5 > ~this.field604.length; ++var5) {
                class30 var6 = this.field604[var5];
                int var7 = var6.field276;
                int var8 = var6.field277;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method170(var3, var4, (byte) 108);
                    }
                } else if (var8 < 0) {
                    var6.method174(var3, 27492, var4);
                } else {
                    var6.method172(var4, var3, (byte) 78);
                }
            }
        }
    }
}
