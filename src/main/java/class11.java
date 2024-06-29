import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 extends class7 {

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    private int field224 = 0;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    private int field215 = 0;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    private int field216 = 1;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "Lob;")
    private static class141 field221 = class175.method1195(40, "Choose Option");

    @OriginalMember(owner = "client!b", name = "U", descriptor = "Lob;")
    public static class141 field218 = field221;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    public static int field228 = 0;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "[I")
    public static int[] field229 = new int[2000];

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "Lkc;")
    public static class102 field219;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "Lkc;")
    public static class102 field222;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILai;I)V")
    public static final void method72(int arg0, int arg1, int arg2, class10 arg3, int arg4) {
        ++field225;
        if (class188.field3637 < 400) {
            if (arg3.field197 != null) {
                arg3 = arg3.method61((byte) 118);
            }
            if (arg3 != null) {
                if (arg3.field176) {
                    class141 var5 = arg3.field182;
                    if (arg3.field196 != 0) {
                        var5 = class220.method1422(new class141[] { var5, class166.method1146(class114.field2176.field767, arg3.field196, false), class204.field3910, class18.field317, class78.method543((byte) 93, arg3.field196), class98.field1943 }, arg1 ^ 3);
                    }
                    if (~class29.field568 == arg1) {
                        class65.method430(class220.method1422(new class141[] { class179.field3522, class4.field54, var5 }, -3), class59.field1150, arg1 ^ -2, (short) 14, (long) arg2, arg0, arg4);
                        ++class117.field2287;
                    } else {
                        if (class61.field1194) {
                            if (~(class111.field2155 & 2) == -3) {
                                ++class95.field1892;
                                class65.method430(class220.method1422(new class141[] { class185.field3607, class4.field54, var5 }, -3), class4.field45, 0, (short) 32, (long) arg2, arg0, arg4);
                                return;
                            }
                        } else {
                            ++class165.field3207;
                            class141[] var6 = arg3.field167;
                            if (class72.field1446) {
                                var6 = class195.method1316(true, var6);
                            }
                            if (var6 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (var6[var7] != null && (~class160.field3117 != -1 || !var6[var7].method933((byte) -104, class29.field564))) {
                                        ++class109.field2100;
                                        byte var8 = 0;
                                        if (var7 == 0) {
                                            var8 = 37;
                                        }
                                        if (var7 == 1) {
                                            var8 = 9;
                                        }
                                        if (~var7 == -3) {
                                            var8 = 24;
                                        }
                                        if (var7 == 3) {
                                            var8 = 11;
                                        }
                                        if (~var7 == -5) {
                                            var8 = 18;
                                        }
                                        class65.method430(class220.method1422(new class141[] { class19.field332, var5 }, -3), var6[var7], 0, var8, (long) arg2, arg0, arg4);
                                    }
                                }
                            }
                            if (class160.field3117 == 0 && var6 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (var6[var9] != null && var6[var9].method933((byte) -123, class29.field564)) {
                                        short var10 = 0;
                                        if (arg3.field196 > class114.field2176.field767) {
                                            var10 = 2000;
                                        }
                                        ++class135.field2574;
                                        short var11 = 0;
                                        if (var9 == 0) {
                                            var11 = 37;
                                        }
                                        if (~var9 == -2) {
                                            var11 = 9;
                                        }
                                        if (~var9 == -3) {
                                            var11 = 24;
                                        }
                                        if (~var9 == -4) {
                                            var11 = 11;
                                        }
                                        if (var9 == 4) {
                                            var11 = 18;
                                        }
                                        if (var11 != 0) {
                                            var11 += var10;
                                        }
                                        class65.method430(class220.method1422(new class141[] { class19.field332, var5 }, -3), var6[var9], 0, var11, (long) arg2, arg0, arg4);
                                    }
                                }
                            }
                            class65.method430(class220.method1422(new class141[] { class19.field332, var5 }, arg1 ^ 3), class96.field1896, arg1 + 2, (short) 1002, (long) arg2, arg0, arg4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        class54.method359(arg0);
        ++field226;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static void method73(byte arg0) {
        field218 = null;
        field221 = null;
        field222 = null;
        field229 = null;
        field219 = null;
        int var1 = -57 / ((arg0 - -67) / 43);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3) {
        class153 var4 = class131.field2506[arg0][arg1][arg2];
        if (var4 != null) {
            class58 var5 = var4.field2923;
            if (var5 != null) {
                var5.field1130 = var5.field1130 * arg3 / 16;
                var5.field1129 = var5.field1129 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = -15 % ((arg1 - 66) / 57);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -4) {
                    this.field216 = arg2.method991(255);
                }
            } else {
                this.field215 = arg2.method991(255);
            }
        } else {
            this.field224 = arg2.method991(255);
        }
        ++field220;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field223;
        if (arg0 <= 13) {
            field219 = null;
        }
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int var4 = class177.field3503[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~var6 > ~class117.field2272; ++var6) {
                int var7 = class15.field272[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (~this.field224 == -1) {
                    var9 = (-var4 + var7) * this.field216;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field216 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (~this.field215 == -1) {
                    var12 = class172.field3413[(4083 & var12) >> 4] + 4096 >> 1;
                } else if (~this.field215 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BB)V")
    public static final void method75(byte[] arg0, byte arg1) {
        ++field217;
        class146 var2 = new class146(arg0);
        var2.field2865 = arg0.length + -2;
        class197.field3766 = var2.method1007(84);
        class30.field578 = new int[class197.field3766];
        class201.field3801 = new int[class197.field3766];
        class114.field2186 = new int[class197.field3766];
        class224.field4225 = new byte[class197.field3766][];
        class30.field581 = new int[class197.field3766];
        var2.field2865 = arg0.length + -7 + -(class197.field3766 * 8);
        class103.field1989 = var2.method1007(119);
        class196.field3743 = var2.method1007(85);
        int var3 = 1 + (255 & var2.method991(255));
        for (int var4 = 0; ~class197.field3766 < ~var4; ++var4) {
            class30.field581[var4] = var2.method1007(42);
        }
        if (arg1 > -67) {
            field229 = null;
        }
        for (int var5 = 0; class197.field3766 > var5; ++var5) {
            class30.field578[var5] = var2.method1007(88);
        }
        for (int var6 = 0; class197.field3766 > var6; ++var6) {
            class201.field3801[var6] = var2.method1007(106);
        }
        for (int var7 = 0; ~var7 > ~class197.field3766; ++var7) {
            class114.field2186[var7] = var2.method1007(63);
        }
        var2.field2865 = arg0.length - 7 - class197.field3766 * 8 - (var3 * 3 + -3);
        class16.field291 = new int[var3];
        for (int var8 = 1; var3 > var8; ++var8) {
            class16.field291[var8] = var2.method1012(-124);
            if (class16.field291[var8] == 0) {
                class16.field291[var8] = 1;
            }
        }
        var2.field2865 = 0;
        for (int var9 = 0; ~class197.field3766 < ~var9; ++var9) {
            int var10 = class201.field3801[var9];
            int var11 = class114.field2186[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class224.field4225[var9] = var13;
            int var14 = var2.method991(255);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; ++var17) {
                    var13[var17] = var2.method1000(1064893128);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; ++var15) {
                    for (int var16 = 0; var11 > var16; ++var16) {
                        var13[var10 * var16 + var15] = var2.method1000(1064893128);
                    }
                }
            }
        }
    }
}
