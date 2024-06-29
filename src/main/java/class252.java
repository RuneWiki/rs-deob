import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class252 extends class175 {

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Lij;")
    public static class50 field4368 = class78.method578(125, "Welt");

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field4375 = 0;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lod;")
    public static class127 field4379 = new class127(64);

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public static int field4381 = 0;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "D")
    public static double field4369;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "[I")
    public static int[] field4371;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "[Leg;")
    private class64[] field4377;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([[II)V")
    private final void method1703(int[][] arg0, int arg1) {
        ++field4365;
        if (arg1 <= -53) {
            int var3 = class211.field3514;
            int var4 = class220.field3690;
            class133.method935(arg0, 18972);
            class131.method925(class108.field1928, 0, 17444, class161.field2765, 0);
            if (this.field4377 != null) {
                for (int var5 = 0; ~var5 > ~this.field4377.length; ++var5) {
                    class64 var6 = this.field4377[var5];
                    int var7 = var6.field1224;
                    int var8 = var6.field1219;
                    if (~var7 > -1) {
                        if (var8 >= 0) {
                            var6.method277(var4, var3, 104);
                        }
                    } else if (var8 < 0) {
                        var6.method276(var4, (byte) -115, var3);
                    } else {
                        var6.method275(var3, 126, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field4367;
        if (arg1 == 0) {
            this.field4377 = new class64[arg2.method1487(255)];
            for (int var4 = 0; ~this.field4377.length < ~var4; ++var4) {
                int var5 = arg2.method1487(255);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field4377[var4] = class140.method976(arg2, false);
                            }
                        } else {
                            this.field4377[var4] = class144.method1006((byte) 126, arg2);
                        }
                    } else {
                        this.field4377[var4] = class231.method1578(arg2, (byte) -86);
                    }
                } else {
                    this.field4377[var4] = class157.method1097(arg2, -90);
                }
            }
        } else if (~arg1 == -2) {
            super.field2925 = arg2.method1487(255) == 1;
        }
        if (!arg0) {
            field4368 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1704(byte arg0, Component arg1) {
        ++field4366;
        arg1.removeMouseListener(class112.field1978);
        arg1.removeMouseMotionListener(class112.field1978);
        if (arg0 != -112) {
            method1708(-118);
        }
        arg1.removeFocusListener(class112.field1978);
        class36.field708 = 0;
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)Z")
    public static final boolean method1705(int arg0) {
        ++field4364;
        try {
            if (class139.field2411 == arg0) {
                if (class129.field2271 == null) {
                    class129.field2271 = class253.method1715(class46.field841, class56.field995, class52.field951);
                    if (class129.field2271 == null) {
                        return false;
                    }
                }
                if (class237.field3979 == null) {
                    class237.field3979 = new class118(class35.field682, class174.field2906);
                }
                if (class161.field2761.method642(class210.field3499, class129.field2271, 22050, class237.field3979, (byte) 109)) {
                    class161.field2761.method657(0);
                    class161.field2761.method639((byte) 76, class127.field2229);
                    class161.field2761.method644(class129.field2271, (byte) 109, class245.field4254);
                    class46.field841 = null;
                    class139.field2411 = 0;
                    class129.field2271 = null;
                    class237.field3979 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class161.field2761.method664(0);
            class237.field3979 = null;
            class46.field841 = null;
            class129.field2271 = null;
            class139.field2411 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        if (arg1 != -27746) {
            return null;
        } else {
            int[] var3 = super.field2941.method1427(arg1 + 6465, arg0);
            if (super.field2941.field3565) {
                this.method1703(super.field2941.method1428(arg1 + 27874), -122);
            }
            ++field4372;
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V")
    public static final void method1706(byte arg0, int arg1) {
        ++field4373;
        if (arg0 <= 101) {
            method1705(119);
        }
        class14.field325.method684(new class199(arg1), (byte) 109);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([Lij;II[SI)V")
    public static final void method1707(class50[] arg0, int arg1, int arg2, short[] arg3, int arg4) {
        if (arg1 < -18) {
            ++field4363;
            if (~arg2 < ~arg4) {
                int var5 = (arg2 + arg4) / 2;
                class50 var6 = arg0[var5];
                int var7 = arg4;
                arg0[var5] = arg0[arg2];
                arg0[arg2] = var6;
                short var8 = arg3[var5];
                arg3[var5] = arg3[arg2];
                arg3[arg2] = var8;
                for (int var9 = arg4; ~var9 > ~arg2; ++var9) {
                    if (var6 == null || arg0[var9] != null && ~arg0[var9].method394(var6, (byte) 37) > ~(var9 & 1)) {
                        class50 var10 = arg0[var9];
                        arg0[var9] = arg0[var7];
                        arg0[var7] = var10;
                        short var11 = arg3[var9];
                        arg3[var9] = arg3[var7];
                        arg3[var7++] = var11;
                    }
                }
                arg0[arg2] = arg0[var7];
                arg0[var7] = var6;
                arg3[arg2] = arg3[var7];
                arg3[var7] = var8;
                method1707(arg0, -111, var7 + -1, arg3, arg4);
                method1707(arg0, -42, arg2, arg3, var7 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
    public static void method1708(int arg0) {
        if (arg0 != -1) {
            field4369 = -0.9599144435358903D;
        }
        field4368 = null;
        field4379 = null;
        field4371 = null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class252() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        if (arg1 != -20740) {
            return null;
        } else {
            ++field4376;
            int[][] var3 = super.field2920.method117(arg0, (byte) -53);
            if (super.field2920.field356) {
                int var4 = class220.field3690;
                int var5 = class211.field3514;
                int[][] var6 = new int[var4][var5];
                int[][][] var7 = super.field2920.method119(false);
                this.method1703(var6, arg1 + 20672);
                for (int var8 = 0; ~class220.field3690 < ~var8; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[1];
                    int[] var12 = var10[2];
                    int[] var13 = var10[0];
                    for (int var14 = 0; class211.field3514 > var14; ++var14) {
                        int var15 = var9[var14];
                        var12[var14] = class51.method413(var15 << 4, 4080);
                        var11[var14] = class51.method413(4080, var15 >> 4);
                        var13[var14] = class51.method413(var15, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/awt/Component;BII)Ldb;")
    public static final class58 method1709(Component arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 93) {
            method1709((Component) null, (byte) -30, 63, 112);
        }
        ++field4370;
        try {
            Class var4 = Class.forName("hi");
            class58 var5 = (class58) var4.newInstance();
            var5.method458(arg0, arg2, (byte) 46, arg3);
            return var5;
        } catch (Throwable var7) {
            class241 var6 = new class241();
            var6.method458(arg0, arg2, (byte) 46, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method1710(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field4362;
        boolean var4 = true;
        class217 var5 = new class217(arg2);
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method1449(0);
            if (~var7 == -1) {
                if (arg1 != -3982) {
                    return true;
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class243 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1436(arg1 ^ 4064);
                                        if (~var17 == -1) {
                                            continue label74;
                                        }
                                        var5.method1487(255);
                                    }
                                    int var10 = var5.method1436(-81);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 + -1;
                                    int var11 = 63 & var8;
                                    int var12 = (4093 & var8) >> 6;
                                    var13 = var5.method1487(255) >> 2;
                                    var14 = arg3 + var12;
                                    var15 = arg0 + var11;
                                } while (var14 <= 0);
                            } while (~var15 >= -1);
                        } while (~var14 <= -104);
                    } while (var15 >= 103);
                    var16 = class53.method426((byte) -90, var6);
                } while (~var13 == -23 && !class172.field2878 && ~var16.field4190 == -1 && var16.field4174 != 1 && !var16.field4199);
                if (!var16.method1661((byte) -92)) {
                    ++class154.field2692;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lda;I)Z")
    public static final boolean method1711(class22 arg0, int arg1) {
        ++field4378;
        if (arg1 != 22389) {
            field4369 = -2.7006146336485206D;
        }
        return arg0.method188((byte) 125, class91.field1721);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
    public static final void method1712(boolean arg0) {
        if (!arg0) {
            field4369 = 0.6504370205408139D;
        }
        for (int var1 = 0; ~class170.field2855 < ~var1; ++var1) {
            int var2 = class249.field4322[var1];
            class187 var3 = class71.field1370[var2];
            int var4 = class119.field2109.method1487(255);
            if (~(var4 & 4) != -1) {
                var4 += class119.field2109.method1487(255) << 8;
            }
            class62.method484(var4, var3, 18, var2);
        }
        ++field4374;
    }
}
