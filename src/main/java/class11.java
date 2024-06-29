import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class11 extends class53 {

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    private int field137 = 2000;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    private int field136 = 0;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    private int field142 = 0;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    private int field151 = 16;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    private int field145 = 4096;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    public static int field144 = 0;

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "Lwa;")
    public static class75 field154 = class66.method560("sch-Utteln:", false);

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "Lwa;")
    private static class75 field153 = class66.method560(" has logged out)3", false);

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "Lwa;")
    public static class75 field152 = field153;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "[I")
    public static int[] field140;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "[S")
    public static short[] field146;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V", line = 4)
    public static void method53(byte arg0) {
        if (arg0 != 54) {
            field155 = -56;
        }
        field153 = null;
        field152 = null;
        field140 = null;
        field154 = null;
        field146 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 527)
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILja;Z)V", line = 29)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (!arg2) {
            this.field151 = -116;
        }
        if (arg0 == 0) {
            this.field136 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field137 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field151 = arg1.method501(0);
        } else if (arg0 == 3) {
            this.field142 = arg1.method485((byte) -2);
        } else if (arg0 == 4) {
            this.field145 = arg1.method485((byte) -2);
        }
        field138++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([SB)[S", line = 90)
    public static final short[] method55(short[] arg0, byte arg1) {
        field150++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == 44) {
            short[] var2 = new short[arg0.length];
            class231.method1692(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return (short[]) null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V", line = 109)
    public final void method56(byte arg0) {
        field149++;
        class203.method1511(256);
        if (arg0 != -79) {
            this.field136 = -26;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIIIII)V", line = 129)
    public static final void method57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < 13) {
            field154 = (class75) null;
        }
        field147++;
        if (class153.field2635 <= arg3 && class288.field4956 >= arg6 && class90.field1495 <= arg1 && class294.field5041 >= arg2) {
            if (arg0 == 1) {
                class120.method913(arg2, -111, arg6, arg4, arg1, arg3);
            } else {
                class226.method1660(arg4, arg3, true, arg6, arg2, arg0, arg1);
            }
        } else if (arg0 == 1) {
            class117.method893(arg2, arg1, arg3, arg4, 0, arg6);
        } else {
            class106.method829(arg3, arg2, true, arg0, arg6, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V", line = 163)
    public static final void method58(int arg0) {
        field135++;
        int var1 = class238.field4004 + class279.field4831.field3218;
        int var2 = class153.field2638 + class279.field4831.field3259;
        if (class190.field3163 - var2 < -500 || class190.field3163 - var2 > 500 || (class180.field3026 - var1) < -500 || class180.field3026 - var1 > 500) {
            class190.field3163 = var2;
            class180.field3026 = var1;
        }
        if (class190.field3163 != var2) {
            class190.field3163 += (var2 - class190.field3163) / 16;
        }
        if (class163.field2767[96]) {
            class102.field1731 += (-class102.field1731 - 24) / 2;
        } else if (class163.field2767[97]) {
            class102.field1731 += (24 - class102.field1731) / 2;
        } else {
            class102.field1731 /= 2;
        }
        class290.field4981 += class102.field1731 / 2;
        if (class163.field2767[98]) {
            class63.field1100 += (12 - class63.field1100) / 2;
        } else if (class163.field2767[99]) {
            class63.field1100 += (-class63.field1100 - 12) / 2;
        } else {
            class63.field1100 /= 2;
        }
        class95.field1547 += class63.field1100 / 2;
        if (class180.field3026 != var1) {
            class180.field3026 += (var1 - class180.field3026) / 16;
        }
        if (arg0 != -16567) {
            method55((short[]) null, (byte) -118);
        }
        class17.method103((byte) -127);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[I", line = 235)
    public final int[] method59(int arg0, int arg1) {
        field143++;
        int[] var3 = this.field878.method1603(arg1, (byte) 118);
        if (this.field878.field3749) {
            int var4 = this.field145 >> 1;
            int[][] var5 = this.field878.method1602((byte) -36);
            Random var6 = new Random((long) this.field136);
            for (int var7 = 0; var7 < this.field137; var7++) {
                int var8 = this.field145 <= 0 ? this.field142 : this.field142 + class29.method197(var6, true, this.field145) - var4;
                int var9 = (var8 & 0xFF7) >> 4;
                int var10 = class29.method197(var6, true, class269.field4644);
                int var11 = class29.method197(var6, true, class303.field5189);
                int var12 = (class232.field3916[var9] * this.field151 >> 12) + var10;
                int var13 = (class108.field1798[var9] * this.field151 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                        var11 = var17;
                    }
                    if (var10 > var12) {
                        int var19 = var11;
                        int var20 = var10;
                        var11 = var13;
                        var13 = var19;
                        var10 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 1024 - (class29.method197(var6, true, 4096) >> 2);
                    int var26 = 2048 / var22;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var24 += var23;
                        int var29 = (var28 - var10) * var26 + var25 + 1024;
                        int var30 = var28 & class157.field2697;
                        int var31 = class3.field31 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        if (arg0 != -15196) {
            field152 = (class75) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lja;B)V", line = 377)
    public static final void method60(class60 arg0, byte arg1) {
        field141++;
        if (arg1 != 123) {
            method55((short[]) null, (byte) 95);
        }
        while (true) {
            while (arg0.field997.length > arg0.field1012) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg0.method501(0) == 1) {
                    var4 = true;
                    var3 = arg0.method501(0);
                    var2 = arg0.method501(arg1 ^ 0x7B);
                }
                int var5 = arg0.method501(arg1 ^ 0x7B);
                int var6 = arg0.method501(0);
                int var7 = -(var6 * 64) - (-class130.field2252 - (class215.field3668 - 1));
                int var8 = var5 * 64 - class82.field1374;
                if (var8 >= 0 && (var7 - 63) >= 0 && class39.field589 > var8 + 63 && var7 < class215.field3668) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || var3 * 8 <= var11 && var3 * 8 + 8 > var11 && (var2 * 8) <= var12 && var2 * 8 + 8 > var12) {
                                int var13 = arg0.method501(0);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method501(arg1 ^ 0x7B);
                                        if (class283.field4875[var9][var10] == null) {
                                            class283.field4875[var9][var10] = new byte[4096];
                                        }
                                        class283.field4875[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method485((byte) -2);
                                        if (class54.field887[var9][var10] == null) {
                                            class54.field887[var9][var10] = new short[4096];
                                        }
                                        class54.field887[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg0.method501(arg1 - 123) & 0xFF << 16) + (arg0.method501(0) & 0xFF << 8) + (arg0.method501(0) & 0xFF);
                                        if (class281.field4851[var9][var10] == null) {
                                            class281.field4851[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class108 var17 = class3.method14((byte) 83, var16);
                                        if (var17.field1812 != null) {
                                            var17 = var17.method849(true);
                                            if (var17 == null || var17.field1855 == -1) {
                                                continue;
                                            }
                                        }
                                        class281.field4851[var9][var10][(63 - var12 << 6) + var11] = var17.field1823 + 1;
                                        class153 var18 = new class153();
                                        var18.field2629 = var8;
                                        var18.field2628 = var17.field1855;
                                        var18.field2624 = var7;
                                        class194.field3211.method1251(var18, -119);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var4 ? 64 : 4096); var19++) {
                        int var20 = arg0.method501(0);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field1012++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field1012 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field1012 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
