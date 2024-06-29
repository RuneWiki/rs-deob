import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class191 extends class170 {

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    private int field3364 = 1;

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
    private int field3370 = 1;

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "I")
    private int field3371 = 204;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "Lqk;")
    public static class207 field3366 = class24.method212(255, "Votre liste noire est pleine (X100 noms maximum(Y)3");

    @OriginalMember(owner = "client!gg", name = "ib", descriptor = "Lbf;")
    public static class199 field3373 = new class199(30);

    @OriginalMember(owner = "client!gg", name = "mb", descriptor = "Lqk;")
    public static class207 field3377 = class24.method212(255, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!gg", name = "kb", descriptor = "I")
    public static int field3375 = 0;

    @OriginalMember(owner = "client!gg", name = "ob", descriptor = "I")
    public static int field3379 = 0;

    @OriginalMember(owner = "client!gg", name = "lb", descriptor = "Lqk;")
    public static class207 field3376 = class24.method212(255, "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!gg", name = "hb", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!gg", name = "jb", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!gg", name = "nb", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    public static final void method1327(boolean arg0, int arg1) {
        ++field3372;
        if (arg0 == !class22.field416) {
            class22.field416 = arg0;
            if (arg1 == 128) {
                class55.method414(3966);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method1328(int arg0, int arg1) {
        ++field3361;
        class40 var2 = (class40) class177.field3194.method1867((long) arg0, true);
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field810.length; ++var3) {
                var2.field810[var3] = -1;
                var2.field804[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lob;I)V")
    public static final void method1329(class130 arg0, int arg1) {
        ++field3369;
        for (int var2 = 0; class170.field3017.length > var2; ++var2) {
            class170.field3017[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; ~var4 > -5001; ++var4) {
            int var16 = (int) ((double) var3 * 128.0D * Math.random());
            class170.field3017[var16] = (int) (Math.random() * 284.0D);
        }
        int var5 = 0;
        if (arg1 == -32222) {
            while (var5 < 20) {
                for (int var12 = 1; ~(var3 + -1) < ~var12; ++var12) {
                    for (int var14 = 1; ~var14 > -128; ++var14) {
                        int var15 = (var12 << 7) + var14;
                        class190.field3344[var15] = (class170.field3017[var15 + -1] - -class170.field3017[var15 + 1] + class170.field3017[var15 + 128] - -class170.field3017[var15 + -128]) / 4;
                    }
                }
                int[] var13 = class170.field3017;
                class170.field3017 = class190.field3344;
                class190.field3344 = var13;
                ++var5;
            }
            if (arg0 != null) {
                int var6 = 0;
                for (int var7 = 0; ~arg0.field658 < ~var7; ++var7) {
                    for (int var8 = 0; arg0.field661 > var8; ++var8) {
                        if (arg0.field2264[var6++] != 0) {
                            int var9 = 16 - -arg0.field662 + var7;
                            int var10 = 16 - -arg0.field667 + var8;
                            int var11 = var10 - -(var9 << 7);
                            class170.field3017[var11] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)V")
    public static final void method1330(int arg0) {
        int var1 = class176.method1261((byte) 86);
        ++field3363;
        if (var1 == 0) {
            class16.field256 = null;
            class260.method1806((byte) -79, 0);
        } else if (~var1 == -2) {
            class3.method16(104, (byte) 0);
            class260.method1806((byte) -79, 512);
            class282.method1917(true);
        } else {
            class3.method16(104, (byte) (class89.field1609 + -4 & 255));
            class260.method1806((byte) -79, 2);
        }
        if (arg0 > -65) {
            method1332(54);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIILdc;Ldc;IIIIJ)V")
    public static final void method1331(int arg0, int arg1, int arg2, int arg3, class235 arg4, class235 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 != null) {
            class28 var12 = new class28();
            var12.field560 = arg10;
            var12.field562 = arg1 * 128 + 64;
            var12.field566 = arg2 * 128 + 64;
            var12.field567 = arg3;
            var12.field564 = arg4;
            var12.field577 = arg5;
            var12.field570 = arg6;
            var12.field575 = arg7;
            var12.field561 = arg8;
            var12.field568 = arg9;
            for (int var13 = arg0; var13 >= 0; --var13) {
                if (class82.field1498[var13][arg1][arg2] == null) {
                    class82.field1498[var13][arg1][arg2] = new class174(var13, arg1, arg2);
                }
            }
            class82.field1498[arg0][arg1][arg2].field3142 = var12;
        }
    }

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V")
    public static void method1332(int arg0) {
        field3366 = null;
        field3377 = null;
        if (arg0 > -125) {
            method1333((class220) null, true, -27);
        }
        field3376 = null;
        field3373 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lmd;ZI)V")
    public static final void method1333(class220 arg0, boolean arg1, int arg2) {
        ++field3367;
        int var3 = arg0.field3925 == 0 ? arg0.field4037 : arg0.field3925;
        if (arg2 != -230095088) {
            method1335((byte) -78, 85);
        }
        int var4 = arg0.field3991 != 0 ? arg0.field3991 : arg0.field3948;
        class141.method980(arg1, var3, var4, class227.field4162[arg0.field3933 >> 16], arg0.field3933, (byte) -124);
        if (arg0.field3959 != null) {
            class141.method980(arg1, var3, var4, arg0.field3959, arg0.field3933, (byte) 125);
        }
        class47 var5 = (class47) class171.field3028.method1867((long) arg0.field3933, true);
        if (var5 != null) {
            class86.method634(var3, var4, arg1, var5.field934, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)V")
    public static final void method1334(int arg0, int arg1, int arg2, int arg3) {
        ++field3368;
        if (arg2 <= 85) {
            field3366 = null;
        }
        class90 var4 = class221.method1575(11, arg3, 1651481952);
        var4.method648((byte) -108);
        var4.field1621 = arg0;
        var4.field1613 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 == 5877) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field3371 = arg0.method1050(1272006568);
                    }
                } else {
                    this.field3370 = arg0.method1045((byte) 97);
                }
            } else {
                this.field3364 = arg0.method1045((byte) -31);
            }
            ++field3374;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(BI)Lqk;")
    public static final class207 method1335(byte arg0, int arg1) {
        ++field3365;
        if (arg0 < 97) {
            method1333((class220) null, true, -13);
        }
        class207 var2 = new class207();
        var2.field3663 = 0;
        var2.field3652 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field3362;
        if (arg0 != -30) {
            return null;
        } else {
            int[] var3 = super.field3001.method1538(arg0 ^ -82, arg1);
            if (super.field3001.field3835) {
                for (int var4 = 0; var4 < class88.field1595; ++var4) {
                    int var5 = class68.field1211[var4];
                    int var6 = class282.field4964[arg1];
                    int var7 = this.field3364 * var5 >> 12;
                    int var8 = var5 % (4096 / this.field3364) * this.field3364;
                    int var9 = var6 % (4096 / this.field3370) * this.field3370;
                    int var10 = this.field3370 * var6 >> 12;
                    if (~this.field3371 < ~var9) {
                        for (var7 -= var10; var7 < 0; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~var8 > ~this.field3371) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field3371 > var8) {
                        int var11;
                        for (var11 = var7 - var10; var11 < 0; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }
}
