import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class55 extends class74 {

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field846 = 0;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "Ljava/lang/String;")
    public static String field847 = "Loaded title screen";

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "[I")
    public static int[] field849 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field857 = 0;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field848 = "Loading - please wait.";

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "Ljava/lang/String;")
    public static String field855 = "M";

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "Lfl;")
    public static class248 field854;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "Lqf;")
    public static class251 field856;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "[S")
    public static short[] field852;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field851 = (arg1.method333((byte) -59) << 12) / 255;
        }
        if (arg0 != -79) {
            this.method80((byte) 37, (class37) null, -52);
        }
        ++field850;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(Z)V")
    public static void method447(boolean arg0) {
        field854 = null;
        field848 = null;
        field847 = null;
        field852 = null;
        field855 = null;
        field856 = null;
        field849 = null;
        if (!arg0) {
            field849 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field859;
        if (arg0 != 4) {
            return null;
        } else {
            int[] var3 = super.field1254.method1328((byte) -108, arg1);
            if (super.field1254.field3118) {
                class236.method1587(var3, 0, class178.field2662, this.field851);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class55() {
        this(4096);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(I)V")
    public class55(int arg0) {
        super(0, true);
        this.field851 = 4096;
        this.field851 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(Z)V")
    public static final void method449(boolean arg0) {
        if (!arg0) {
            method447(true);
        }
        class5.field88.method1783(0);
        ++field853;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
    public static final void method450(int arg0) {
        ++field845;
        if (~class79.method624((byte) 45) == -3) {
            byte var1 = (byte) (class17.field278 + -4 & 255);
            int var2 = class17.field278 % 104;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var16 = 0; var16 < 104; ++var16) {
                    class140.field2150[var3][var2][var16] = var1;
                }
            }
            if (arg0 != 103) {
                method450(98);
            }
            if (class274.field4318 != 3) {
                for (int var4 = 0; var4 < 2; ++var4) {
                    class23.field335[var4] = -1000000;
                    class126.field1986[var4] = 1000000;
                    class163.field2487[var4] = 0;
                    class121.field1862[var4] = 1000000;
                    class259.field3958[var4] = 0;
                }
                if (~class6.field111 == -2) {
                    if ((4 & class191.field3041[class274.field4318][class261.field4058.field4176 >> 7][class261.field4058.field4123 >> 7]) != 0) {
                        class260.method1726(0, class255.field3907, class261.field4058.field4123 >> 7, false, (byte) 119, class261.field4058.field4176 >> 7);
                    }
                    if (class25.field373 < 310) {
                        int var5 = class266.field4245 >> 7;
                        int var6 = class69.field1100 >> 7;
                        int var7 = class261.field4058.field4176 >> 7;
                        int var8 = class261.field4058.field4123 >> 7;
                        int var9;
                        if (~var7 >= ~var5) {
                            var9 = -var7 + var5;
                        } else {
                            var9 = -var5 + var7;
                        }
                        int var10;
                        if (var6 < var8) {
                            var10 = -var6 + var8;
                        } else {
                            var10 = var6 - var8;
                        }
                        if ((var9 != 0 || var10 != 0) && ~var9 < 103 && ~var9 > -105 && ~var10 < 103 && ~var10 > -105) {
                            if (var10 >= var9) {
                                int var11 = var9 * 65536 / var10;
                                int var12 = 32768;
                                while (var6 != var8) {
                                    if (~var6 > ~var8) {
                                        ++var6;
                                    } else if (var6 > var8) {
                                        --var6;
                                    }
                                    if ((4 & class191.field3041[class274.field4318][var5][var6]) != 0) {
                                        class260.method1726(1, class255.field3907, var6, false, (byte) 119, var5);
                                        return;
                                    }
                                    var12 += var11;
                                    if (~var12 <= -65537) {
                                        if (var7 > var5) {
                                            ++var5;
                                        } else if (~var7 > ~var5) {
                                            --var5;
                                        }
                                        var12 -= 65536;
                                        if ((class191.field3041[class274.field4318][var5][var6] & 4) != 0) {
                                            class260.method1726(1, class255.field3907, var6, false, (byte) 119, var5);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var13 = var10 * 65536 / var9;
                            int var14 = 32768;
                            while (~var5 != ~var7) {
                                if (var7 > var5) {
                                    ++var5;
                                } else if (~var7 > ~var5) {
                                    --var5;
                                }
                                if (~(4 & class191.field3041[class274.field4318][var5][var6]) != -1) {
                                    class260.method1726(1, class255.field3907, var6, false, (byte) 119, var5);
                                    return;
                                }
                                var14 += var13;
                                if (var14 >= 65536) {
                                    if (var8 <= var6) {
                                        if (~var6 < ~var8) {
                                            --var6;
                                        }
                                    } else {
                                        ++var6;
                                    }
                                    var14 -= 65536;
                                    if (~(class191.field3041[class274.field4318][var5][var6] & 4) != -1) {
                                        class260.method1726(1, class255.field3907, var6, false, (byte) 119, var5);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class223.method1490((Throwable) null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class118.field1828 + "," + class129.field2008, (byte) -74);
                        return;
                    }
                } else {
                    int var15 = class224.method1502((byte) -126, class274.field4318, class69.field1100, class266.field4245);
                    if (-class295.field4631 + var15 >= 800 || (class191.field3041[class274.field4318][class266.field4245 >> 7][class69.field1100 >> 7] & 4) == 0) {
                        return;
                    }
                    class260.method1726(1, class255.field3907, class69.field1100 >> 7, false, (byte) 119, class266.field4245 >> 7);
                }
            }
        }
    }
}
