import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class181 extends class37 {

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Ldd;")
    public static class35 field3690 = class180.method1196((byte) -8, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "[I")
    public static int[] field3691 = new int[200];

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Lfd;")
    public static class55 field3694 = null;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Z")
    public static boolean field3697 = false;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Z")
    public static boolean field3692 = false;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "Ldd;")
    public static class35 field3701 = class180.method1196((byte) -89, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZII)V")
    private final void method1198(boolean arg0, int arg1, int arg2) {
        ++field3696;
        if (arg0) {
            field3694 = null;
        }
        int var4 = class118.field2622[arg2];
        int var5 = class22.field450[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class197.field3931 = arg2;
            class35.field717 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class197.field3931 = arg1;
            class35.field717 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class197.field3931 = -arg1 + class72.field1719;
            class35.field717 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class35.field717 = -arg1 + class35.field782;
            class197.field3931 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class35.field717 = -arg1 + class35.field782;
            class197.field3931 = -arg2 + class72.field1719;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class197.field3931 = -arg1 + class72.field1719;
            class35.field717 = -arg2 + class35.field782;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class35.field717 = class35.field782 - arg2;
            class197.field3931 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class35.field717 = arg1;
            class197.field3931 = -arg2 + class72.field1719;
        }
        class35.field717 &= class105.field2348;
        class197.field3931 &= class71.field1691;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (arg0 != 75) {
            return null;
        } else {
            ++field3698;
            if (super.field816.field3661) {
                for (int var4 = 0; class72.field1719 > var4; ++var4) {
                    this.method1198(false, arg1, var4);
                    int[] var5 = this.method369(0, class35.field717, (byte) 123);
                    var3[var4] = var5[class197.field3931];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)V")
    public static final void method1199(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class4.field66; ++var3) {
            for (int var4 = 0; var4 < class113.field2536; ++var4) {
                for (int var5 = 0; var5 < class102.field2272; ++var5) {
                    class54 var6 = class191.field3853[var3][var4][var5];
                    if (var6 != null) {
                        class22 var7 = var6.field1210;
                        if (var7 != null && var7.field448 instanceof class16) {
                            class16 var8 = (class16) var7.field448;
                            class204.method1351(var8, var3, var4, var5, 1, 1);
                            if (var7.field446 instanceof class16) {
                                class16 var9 = (class16) var7.field446;
                                class204.method1351(var9, var3, var4, var5, 1, 1);
                                class16.method126(var8, var9, 0, 0, 0, false);
                                var7.field446 = var9.method142(var9.field290, var9.field302, arg0, arg1, arg2, false, false);
                            }
                            var7.field448 = var8.method142(var8.field290, var8.field302, arg0, arg1, arg2, false, false);
                        }
                        for (int var10 = 0; var10 < var6.field1218; ++var10) {
                            class131 var13 = var6.field1225[var10];
                            if (var13 != null && var13.field2814 instanceof class16) {
                                class16 var14 = (class16) var13.field2814;
                                class204.method1351(var14, var3, var4, var5, var13.field2827 - var13.field2816 + 1, var13.field2828 - var13.field2812 + 1);
                                var13.field2814 = var14.method142(var14.field290, var14.field302, arg0, arg1, arg2, false, false);
                            }
                        }
                        class127 var11 = var6.field1230;
                        if (var11 != null && var11.field2751 instanceof class16) {
                            class16 var12 = (class16) var11.field2751;
                            class101.method755(var12, var3, var4, var5);
                            var11.field2751 = var12.method142(var12.field290, var12.field302, arg0, arg1, arg2, false, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
    public static void method1200(boolean arg0) {
        field3694 = null;
        if (!arg0) {
            field3691 = null;
            field3701 = null;
            field3690 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(III)V")
    public static final void method1201(int arg0, int arg1, int arg2) {
        ++field3699;
        class187 var3 = class145.field3074[class175.field3585][arg1][arg0];
        if (var3 == null) {
            class55.method489(class175.field3585, arg1, arg0);
        } else {
            int var4 = -99999999;
            if (arg2 != 2048) {
                method1200(true);
            }
            class176 var5 = (class176) var3.method1232(25831);
            class176 var6 = null;
            while (var5 != null) {
                class46 var12 = class207.method1370((byte) -73, var5.field3586);
                int var13 = var12.field1027;
                if (~var12.field983 == -2) {
                    var13 = (var5.field3589 + 1) * var13;
                }
                if (~var4 > ~var13) {
                    var4 = var13;
                    var6 = var5;
                }
                var5 = (class176) var3.method1238(22622);
            }
            if (var6 == null) {
                class55.method489(class175.field3585, arg1, arg0);
            } else {
                var3.method1239((byte) 124, var6);
                class176 var7 = null;
                class176 var8 = (class176) var3.method1232(25831);
                long var9 = (long) ((arg0 << 7) + arg1 - -1610612736);
                class176 var11 = null;
                while (var8 != null) {
                    if (~var6.field3586 != ~var8.field3586) {
                        if (var11 == null) {
                            var11 = var8;
                        }
                        if (var8.field3586 != var11.field3586 && var7 == null) {
                            var7 = var8;
                        }
                    }
                    var8 = (class176) var3.method1238(22622);
                }
                class187.method1237(class175.field3585, arg1, arg0, class73.method583(class175.field3585, arg0 * 128 - -64, arg1 * 128 + 64, (byte) 1), var6, var9, var11, var7);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (~arg0 == -1) {
            super.field825 = ~arg2.method221(-109) == -2;
        }
        if (arg1 != 1) {
            field3703 = -30;
        }
        ++field3704;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)V")
    public static final void method1202(int arg0) {
        if (arg0 >= 0) {
            method1202(62);
        }
        ++field3693;
        if (class30.field603 != null) {
            class30.field603.method920((byte) -97);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    public class181() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public static final void method1203(int arg0) {
        ++field3700;
        if (arg0 >= 5) {
            for (class21 var1 = (class21) class136.field2910.method1232(25831); var1 != null; var1 = (class21) class136.field2910.method1238(22622)) {
                if (var1.field413 != -1) {
                    var1.method799(-24265);
                } else {
                    var1.field424 = 0;
                    class32.method308(var1, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field3702;
        int[][] var3 = super.field832.method653(-30711, arg0);
        int[] var4 = var3[0];
        if (arg1 <= 5) {
            field3692 = false;
        }
        int[] var5 = var3[1];
        int[] var6 = var3[2];
        if (super.field832.field1978) {
            for (int var7 = 0; class72.field1719 > var7; ++var7) {
                this.method1198(false, arg0, var7);
                int[][] var8 = this.method370(class35.field717, 0, 3);
                var4[var7] = var8[0][class197.field3931];
                var5[var7] = var8[1][class197.field3931];
                var6[var7] = var8[2][class197.field3931];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
    public static final void method1204(int arg0) {
        class88.field1969 = arg0;
        for (int var1 = 0; var1 < class113.field2536; ++var1) {
            for (int var2 = 0; var2 < class102.field2272; ++var2) {
                if (class191.field3853[arg0][var1][var2] == null) {
                    class191.field3853[arg0][var1][var2] = new class54(arg0, var1, var2);
                }
            }
        }
    }
}
