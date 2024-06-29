import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class82 extends class215 {

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    private int field1017 = 0;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    private int field1018 = 20;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    private int field1022 = 1365;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    private int field1024 = 0;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1014 = "Loaded title screen";

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "Z")
    public static boolean field1021 = true;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "Lwb;")
    public static class123 field1009;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "Leh;")
    public static class137 field1010;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Leh;")
    public static class137 field1020;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)I")
    public static final int method451(int arg0) {
        ++field1019;
        if ((double) class281.field4457 == 3.0D) {
            return 37;
        } else if ((double) class281.field4457 == 4.0D) {
            return 50;
        } else if ((double) class281.field4457 == 6.0D) {
            return 75;
        } else if ((double) class281.field4457 == 8.0D) {
            return 100;
        } else {
            return arg0 != -22343 ? 113 : 200;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 0;
        ++field1013;
        int var10 = -arg3 + arg6;
        int var11 = arg2;
        int var12 = arg2 - arg3;
        int var13 = arg6 * arg6;
        int var14 = arg2 * arg2;
        int var15 = var12 * var12;
        if (arg4 < 121) {
            method456((class96) null, -94);
        }
        int var16 = var10 * var10;
        int var17 = var13 << 1;
        int var18 = var15 << 1;
        int var19 = var14 << 1;
        int var20 = var16 << 1;
        int var21 = var12 << 1;
        int var22 = arg2 << 1;
        int var23 = (-var21 + 1) * var16 - -var18;
        int var24 = var15 - (var21 + -1) * var20;
        int var25 = var13 << 2;
        int var26 = -((var22 - 1) * var17) + var14;
        int var27 = (-var22 + 1) * var13 + var19;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = var19 * 3;
        int var32 = (var21 + -3) * var20;
        int var33 = (var22 + -3) * var17;
        int var34 = var18 * 3;
        int var35 = (arg2 - 1) * var25;
        int var36 = var28;
        int var37 = (var12 + -1) * var29;
        int[] var38 = class14.field186[arg5];
        class78.method433(-var10 + arg1, arg1 - arg6, var38, arg7, (byte) 123);
        int var39 = var30;
        class78.method433(arg1 - -var10, arg1 - var10, var38, arg0, (byte) 123);
        class78.method433(arg1 + arg6, arg1 - -var10, var38, arg7, (byte) 123);
        while (var11 > 0) {
            if (var27 < 0) {
                while (var27 < 0) {
                    var26 += var36;
                    var36 += var28;
                    ++var8;
                    var27 += var31;
                    var31 += var28;
                }
            }
            if (var26 < 0) {
                ++var8;
                var27 += var31;
                var26 += var36;
                var31 += var28;
                var36 += var28;
            }
            boolean var40 = ~var11 >= ~var12;
            if (var40) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var23 += var34;
                        var34 += var30;
                        var24 += var39;
                        ++var9;
                        var39 += var30;
                    }
                }
                if (var24 < 0) {
                    var24 += var39;
                    var23 += var34;
                    var34 += var30;
                    var39 += var30;
                    ++var9;
                }
                var24 += -var32;
                var23 += -var37;
                var32 -= var29;
                var37 -= var29;
            }
            --var11;
            var26 += -var33;
            var33 -= var25;
            var27 += -var35;
            var35 -= var25;
            int var41 = arg5 + var11;
            int var42 = arg1 + var8;
            int var43 = -var8 + arg1;
            int var44 = -var11 + arg5;
            if (var40) {
                int var45 = arg1 + var9;
                int var46 = -var9 + arg1;
                class78.method433(var46, var43, class14.field186[var44], arg7, (byte) 123);
                class78.method433(var45, var46, class14.field186[var44], arg0, (byte) 123);
                class78.method433(var42, var45, class14.field186[var44], arg7, (byte) 123);
                class78.method433(var46, var43, class14.field186[var41], arg7, (byte) 123);
                class78.method433(var45, var46, class14.field186[var41], arg0, (byte) 123);
                class78.method433(var42, var45, class14.field186[var41], arg7, (byte) 123);
            } else {
                class78.method433(var42, var43, class14.field186[var44], arg7, (byte) 123);
                class78.method433(var42, var43, class14.field186[var41], arg7, (byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field1024 = arg2.method549(255);
                    }
                } else {
                    this.field1017 = arg2.method549(255);
                }
            } else {
                this.field1018 = arg2.method549(255);
            }
        } else {
            this.field1022 = arg2.method549(255);
        }
        ++field1012;
        if (arg0 != 1521146348) {
            this.field1022 = 111;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)Z")
    public static final boolean method453(int arg0, int arg1) {
        ++field1015;
        if (arg0 <= 103) {
            field1023 = -87;
        }
        if (~arg1 > -1) {
            return false;
        } else {
            int var2 = class155.field2423[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1004;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field1008;
        int[] var3 = super.field3445.method1755(arg0, (byte) 117);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field3445.field4163) {
                for (int var4 = 0; var4 < class244.field4015; ++var4) {
                    int var5 = (class76.field956[arg0] << 12) / this.field1022 + this.field1024;
                    int var6 = (class166.field2657[var4] << 12) / this.field1022 + this.field1017;
                    int var7 = var6;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var5;
                    int var11 = var6 * var6 >> 12;
                    int var12 = var5 * var5 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && var13 < this.field1018) {
                        var10 = (var8 * var10 >> 12) * 2 + var9;
                        ++var13;
                        var8 = -var12 + var11 - -var7;
                        var12 = var10 * var10 >> 12;
                        var11 = var8 * var8 >> 12;
                    }
                    var3[var4] = var13 < this.field1018 + -1 ? (var13 << 12) / this.field1018 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIIILjava/lang/String;)V")
    public static final void method454(byte arg0, int arg1, int arg2, int arg3, String arg4) {
        ++field1011;
        if (arg0 != -100) {
            field1009 = null;
        }
        class123 var5 = class247.method1714(arg2, arg3, arg0 + 100);
        if (var5 != null) {
            if (var5.field1855 != null) {
                class156 var6 = new class156();
                var6.field2512 = var5.field1855;
                var6.field2516 = var5;
                var6.field2504 = arg4;
                var6.field2509 = arg1;
                class296.method1985(var6, arg0 + 200100);
            }
            boolean var7 = true;
            if (~var5.field1848 < -1) {
                var7 = class60.method353(var5, -22460);
            }
            if (var7) {
                if (client.method735(var5).method1166(arg1 + -1, true)) {
                    if (~arg1 == -2) {
                        ++class246.field4049;
                        class4.field57.method1932(false, 94);
                        class4.field57.method574(arg3, -1);
                        class4.field57.method572(true, arg2);
                    }
                    if (~arg1 == -3) {
                        class4.field57.method1932(false, 236);
                        class4.field57.method574(arg3, arg0 + 99);
                        class4.field57.method572(true, arg2);
                        ++class292.field4642;
                    }
                    if (~arg1 == -4) {
                        class4.field57.method1932(false, 171);
                        ++class204.field3222;
                        class4.field57.method574(arg3, -1);
                        class4.field57.method572(true, arg2);
                    }
                    if (arg1 == 4) {
                        ++class242.field3981;
                        class4.field57.method1932(false, 101);
                        class4.field57.method574(arg3, arg0 ^ 99);
                        class4.field57.method572(true, arg2);
                    }
                    if (arg1 == 5) {
                        ++class297.field4693;
                        class4.field57.method1932(false, 229);
                        class4.field57.method574(arg3, -1);
                        class4.field57.method572(true, arg2);
                    }
                    if (~arg1 == -7) {
                        class4.field57.method1932(false, 7);
                        ++class60.field770;
                        class4.field57.method574(arg3, -1);
                        class4.field57.method572(true, arg2);
                    }
                    if (arg1 == 7) {
                        class4.field57.method1932(false, 235);
                        class4.field57.method574(arg3, -1);
                        ++class179.field2846;
                        class4.field57.method572(true, arg2);
                    }
                    if (arg1 == 8) {
                        class4.field57.method1932(false, 145);
                        ++class236.field3895;
                        class4.field57.method574(arg3, -1);
                        class4.field57.method572(true, arg2);
                    }
                    if (~arg1 == -10) {
                        class4.field57.method1932(false, 65);
                        ++class280.field4445;
                        class4.field57.method574(arg3, -1);
                        class4.field57.method572(true, arg2);
                    }
                    if (~arg1 == -11) {
                        class4.field57.method1932(false, 80);
                        class4.field57.method574(arg3, -1);
                        class4.field57.method572(true, arg2);
                        ++class15.field192;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V")
    public static void method455(byte arg0) {
        field1010 = null;
        field1020 = null;
        int var1 = -44 / ((arg0 - -62) / 51);
        field1009 = null;
        field1014 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lpd;I)V")
    public static final void method456(class96 arg0, int arg1) {
        ++field1016;
        byte[] var2 = new byte[24];
        if (class21.field282 != null) {
            try {
                class21.field282.method1281(0L, (byte) -74);
                int var3 = 0;
                class21.field282.method1286(var2, arg1 ^ -11614);
                while (var3 < 24 && var2[var3] == 0) {
                    ++var3;
                }
                if (~var3 <= -25) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; ~var4 > -25; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method547((byte) -79, 24, var2, arg1);
    }
}
