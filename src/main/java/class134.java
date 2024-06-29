import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 extends class4 {

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Llb;")
    public class78 field3076 = new class78();

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "Lkc;")
    public class72 field3082 = new class72();

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "Lbc;")
    private class11 field3063;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lod;")
    public static class101 field3060 = class46.method335(-70, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "Lod;")
    public static class101 field3073 = class46.method335(-61, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "[I")
    public static int[] field3078 = new int[32];

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "Lod;")
    private static class101 field3071 = class46.method335(76, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lod;")
    public static class101 field3059 = field3071;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lod;")
    private static class101 field3058 = class46.method335(92, "Login limit exceeded)3");

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "Lod;")
    public static class101 field3070 = field3058;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "Lc;")
    public static class15 field3081;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3062;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "[I")
    public static int[] field3056;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([III)V")
    public final void method17(int[] arg0, int arg1, int arg2) {
        field3054++;
        this.field3082.method17(arg0, arg1, arg2);
        for (class135 var4 = (class135) this.field3076.method523(false); var4 != null; var4 = (class135) this.field3076.method527(true)) {
            if (!this.field3063.method52((byte) -120, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3109) {
                        this.method1031(var5 + var6, var6, -1, var5, var4, arg0);
                        var4.field3109 -= var6;
                        break;
                    }
                    this.method1031(var5 + var6, var4.field3109, -1, var5, var4, arg0);
                    var6 -= var4.field3109;
                    var5 += var4.field3109;
                } while (!this.field3063.method72(4997, var5, var6, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIILtc;[I)V")
    private final void method1031(int arg0, int arg1, int arg2, int arg3, class135 arg4, int[] arg5) {
        if ((this.field3063.field163[arg4.field3118] & 0x4) != 0 && arg4.field3111 < 0) {
            int var7 = this.field3063.field215[arg4.field3118] / class140.field3224;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field3107) / var7;
                if (var8 > arg1) {
                    arg4.field3107 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                int var9 = 262144 / var7;
                arg4.field3108.method17(arg5, arg3, var8);
                arg3 += var8;
                class68 var10 = arg4.field3108;
                int var11 = class140.field3224 / 100;
                if (var11 > var9) {
                    var11 = var9;
                }
                arg4.field3107 += var7 * var8 - 1048576;
                if (this.field3063.field219[arg4.field3118] == 0) {
                    arg4.field3108 = class68.method460(arg4.field3106, var10.method489(), var10.method481(), var10.method459());
                } else {
                    arg4.field3108 = class68.method460(arg4.field3106, var10.method489(), 0, var10.method459());
                    this.field3063.method87(8, arg4.field3119.field2895[arg4.field3093] < 0, arg4);
                    arg4.field3108.method482(var11, var10.method481());
                }
                if (arg4.field3119.field2895[arg4.field3093] < 0) {
                    arg4.field3108.method455(-1);
                }
                var10.method462(var11);
                var10.method17(arg5, arg3, arg0 - arg3);
                if (var10.method458()) {
                    this.field3082.method504(var10);
                }
            }
        }
        if (arg2 == -1) {
            field3065++;
            arg4.field3108.method17(arg5, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBII)I")
    public static final int method1032(int arg0, byte arg1, int arg2, int arg3) {
        field3055++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg1 != 60) {
                method1036(false);
            }
            return var4 == 2 ? 7 - arg2 : -arg3 + 7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lqd;")
    public static final class115 method1033(int arg0, int arg1) {
        field3061++;
        class115 var2 = (class115) class118.field2607.method140(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class12.field254.method114((byte) 89, arg1, arg0);
        class115 var4 = new class115();
        var4.field2521 = arg0;
        if (var3 != null) {
            var4.method876((byte) -92, new class138(var3));
        }
        var4.method880(false);
        class118.field2607.method141(var4, (long) arg0, (byte) 93);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ltc;II)V")
    private final void method1034(class135 arg0, int arg1, int arg2) {
        field3064++;
        if ((this.field3063.field163[arg0.field3118] & 0x4) != 0 && arg0.field3111 < 0) {
            int var4 = this.field3063.field215[arg0.field3118] / class140.field3224;
            int var5 = (var4 + 1048575 - arg0.field3107) / var4;
            arg0.field3107 = arg1 * var4 + arg0.field3107 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3063.field219[arg0.field3118] == 0) {
                    arg0.field3108 = class68.method460(arg0.field3106, arg0.field3108.method489(), arg0.field3108.method481(), arg0.field3108.method459());
                } else {
                    arg0.field3108 = class68.method460(arg0.field3106, arg0.field3108.method489(), 0, arg0.field3108.method459());
                    this.field3063.method87(8, arg0.field3119.field2895[arg0.field3093] < 0, arg0);
                }
                if (arg0.field3119.field2895[arg0.field3093] < 0) {
                    arg0.field3108.method455(-1);
                }
                arg1 = arg0.field3107 / var4;
            }
        }
        arg0.field3108.method21(arg1);
        if (arg2 >= -42) {
            method1037((byte) -89);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[Lee;[II[II)V")
    public static final void method1035(int arg0, class34[] arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        int var6 = -94 % ((arg5 + 45) / 47);
        if (arg3 > arg0) {
            int var7 = arg0 - 1;
            int var8 = arg3 + 1;
            int var9 = (arg0 + arg3) / 2;
            class34 var10 = arg1[var9];
            arg1[var9] = arg1[arg0];
            arg1[arg0] = var10;
            while (var8 > var7) {
                boolean var11 = true;
                do {
                    var8--;
                    for (int var12 = 0; var12 < 4; var12++) {
                        int var13;
                        int var14;
                        if (arg2[var12] == 2) {
                            var13 = arg1[var8].field865;
                            var14 = var10.field865;
                        } else if (arg2[var12] == 1) {
                            var13 = arg1[var8].field880;
                            var14 = var10.field880;
                            if (var13 == -1 && arg4[var12] == 1) {
                                var13 = 2001;
                            }
                            if (var14 == -1 && arg4[var12] == 1) {
                                var14 = 2001;
                            }
                        } else if (arg2[var12] == 3) {
                            var13 = arg1[var8].field875 ? 1 : 0;
                            var14 = var10.field875 ? 1 : 0;
                        } else {
                            var13 = arg1[var8].field879;
                            var14 = var10.field879;
                        }
                        if (var13 != var14) {
                            if ((arg4[var12] != 1 || var13 <= var14) && (arg4[var12] != 0 || var14 <= var13)) {
                                var11 = false;
                            }
                            break;
                        }
                        if (var12 == 3) {
                            var11 = false;
                        }
                    }
                } while (var11);
                boolean var15 = true;
                do {
                    var7++;
                    for (int var16 = 0; var16 < 4; var16++) {
                        int var17;
                        int var18;
                        if (arg2[var16] == 2) {
                            var18 = var10.field865;
                            var17 = arg1[var7].field865;
                        } else if (arg2[var16] == 1) {
                            var17 = arg1[var7].field880;
                            if (var17 == -1 && arg4[var16] == 1) {
                                var17 = 2001;
                            }
                            var18 = var10.field880;
                            if (var18 == -1 && arg4[var16] == 1) {
                                var18 = 2001;
                            }
                        } else if (arg2[var16] == 3) {
                            var18 = var10.field875 ? 1 : 0;
                            var17 = arg1[var7].field875 ? 1 : 0;
                        } else {
                            var17 = arg1[var7].field879;
                            var18 = var10.field879;
                        }
                        if (var17 != var18) {
                            if ((arg4[var16] != 1 || var17 >= var18) && (arg4[var16] != 0 || var18 >= var17)) {
                                var15 = false;
                            }
                            break;
                        }
                        if (var16 == 3) {
                            var15 = false;
                        }
                    }
                } while (var15);
                if (var8 > var7) {
                    class34 var19 = arg1[var7];
                    arg1[var7] = arg1[var8];
                    arg1[var8] = var19;
                }
            }
            method1035(arg0, arg1, arg2, var8, arg4, -127);
            method1035(var8 + 1, arg1, arg2, arg3, arg4, -128);
        }
        field3079++;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()Lac;")
    public final class4 method18() {
        field3067++;
        class135 var1 = (class135) this.field3076.method523(false);
        if (var1 == null) {
            return null;
        } else if (var1.field3108 == null) {
            return this.method15();
        } else {
            return var1.field3108;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method1036(boolean arg0) {
        field3078 = null;
        field3059 = null;
        field3060 = null;
        field3056 = null;
        field3071 = null;
        field3062 = null;
        field3081 = null;
        field3058 = null;
        field3070 = null;
        if (!arg0) {
            method1032(-3, (byte) -122, 122, 42);
        }
        field3073 = null;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "()I")
    public final int method20() {
        field3068++;
        return 0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()Lac;")
    public final class4 method15() {
        field3069++;
        class135 var1;
        do {
            var1 = (class135) this.field3076.method527(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3108 == null);
        return var1.field3108;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public final void method21(int arg0) {
        field3080++;
        this.field3082.method21(arg0);
        for (class135 var2 = (class135) this.field3076.method523(false); var2 != null; var2 = (class135) this.field3076.method527(true)) {
            if (!this.field3063.method52((byte) -122, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3109 >= var3) {
                        this.method1034(var2, var3, -103);
                        var2.field3109 -= var3;
                        break;
                    }
                    this.method1034(var2, var2.field3109, -43);
                    var3 -= var2.field3109;
                } while (!this.field3063.method72(4997, 0, var3, null, var2));
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static final void method1037(byte arg0) {
        field3072++;
        class81.field1736 = true;
        class10.field152 = true;
        int var1 = -22 / ((arg0 - 22) / 63);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lbc;)V")
    public class134(class11 arg0) {
        this.field3063 = arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILc;I)Z")
    public static final boolean method1038(int arg0, int arg1, class15 arg2, int arg3) {
        field3077++;
        byte[] var4 = arg2.method114((byte) -64, arg0, arg1);
        if (arg3 != 2001) {
            return true;
        } else if (var4 == null) {
            return false;
        } else {
            class50.method372(var4, true);
            return true;
        }
    }
}
