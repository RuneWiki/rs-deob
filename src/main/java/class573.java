import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class573 {

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "Lh;")
    private class571 field7899 = new class571(64);

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "Lh;")
    public class571 field7910 = new class571(50);

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "Lh;")
    public class571 field7911 = new class571(5);

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "Lhu;")
    public class111 field7897;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "Lan;")
    public class21 field7901;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "Lan;")
    private class21 field7902;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "Z")
    public boolean field7906;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "Z")
    public static boolean field7904 = false;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public int field7912;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public final void method3262(int arg0) {
        class571 var2 = this.field7899;
        synchronized (this.field7899) {
            this.field7899.method3246(false);
        }
        field7896++;
        class571 var3 = this.field7910;
        synchronized (this.field7910) {
            if (arg0 != -64) {
                this.field7912 = 50;
            }
            this.field7910.method3246(false);
        }
        class571 var4 = this.field7911;
        synchronized (this.field7911) {
            this.field7911.method3246(false);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)Lhg;")
    public final class593 method3263(int arg0, byte arg1) {
        field7909++;
        class571 var3 = this.field7899;
        class593 var4;
        synchronized (this.field7899) {
            var4 = (class593) this.field7899.method3252((long) arg0, (byte) -124);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field7902;
        byte[] var6;
        synchronized (this.field7902) {
            var6 = this.field7902.method240(class580.method3320(arg0, 1336636295), class316.method1967(arg0, -20616), (byte) -124);
        }
        class593 var7 = new class593();
        if (arg1 != -103) {
            this.method3267(-105, 78);
        }
        var7.field8593 = arg0;
        var7.field8525 = this;
        if (var6 != null) {
            var7.method3507(-10658, new class11(var6));
        }
        var7.method3510(-116);
        class571 var8 = this.field7899;
        synchronized (this.field7899) {
            this.field7899.method3243(var7, (long) arg0, 106);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZI)V")
    public final void method3264(boolean arg0, int arg1) {
        if (arg1 < 80) {
            return;
        }
        field7905++;
        if (this.field7906 != arg0) {
            this.field7906 = arg0;
            this.method3262(-64);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "([IBLld;IIIIIIII[IIZI)I")
    public static final int method3265(int[] arg0, byte arg1, class145 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11, int arg12, boolean arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class418.field5895[var15][var35] = 0;
                class546.field7558[var15][var35] = 99999999;
            }
        }
        field7900++;
        boolean var16;
        if (arg8 == 1) {
            var16 = class180.method1135(arg3, arg10, arg14, arg6, arg12, arg2, arg7, arg5, true, arg9, arg4);
        } else if (arg8 == 2) {
            var16 = class98.method699(arg3, (byte) 116, arg6, arg4, arg10, arg2, arg5, arg7, arg12, arg9, arg14);
        } else {
            var16 = class579.method3316(-1, arg7, arg4, arg8, arg6, arg3, arg14, arg9, arg5, arg10, arg2, arg12);
        }
        int var17 = arg5 - 64;
        if (arg1 > -39) {
            return -29;
        }
        int var18 = arg7 - 64;
        int var19 = class640.field9315;
        int var20 = class29.field485;
        if (!var16) {
            if (!arg13) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg12 - var23; var24 <= arg12 + var23; var24++) {
                for (int var25 = arg4 - var23; var25 <= (arg4 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class546.field7558[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg12) {
                            var28 = arg12 - var24;
                        } else if (var24 > arg12 + arg3 - 1) {
                            var28 = var24 - (arg12 + arg3 - 1);
                        }
                        int var29 = 0;
                        if (var25 < arg4) {
                            var29 = arg4 - var25;
                        } else if (arg14 + arg4 - 1 < var25) {
                            var29 = var25 + 1 - arg14 - arg4;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class546.field7558[var26][var27] < var22) {
                            var19 = var24;
                            var21 = var30;
                            var20 = var25;
                            var22 = class546.field7558[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg5 == var19 && arg7 == var20) {
            return 0;
        }
        byte var31 = 0;
        class335.field4466[var31] = var19;
        int var37 = var31 + 1;
        class3.field37[var31] = var20;
        int var32;
        int var33 = var32 = class418.field5895[var19 - var17][var20 - var18];
        while (arg5 != var19 || arg7 != var20) {
            if (var32 != var33) {
                class335.field4466[var37] = var19;
                var32 = var33;
                class3.field37[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class418.field5895[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg0[var34] = class335.field4466[var37];
            arg11[var34++] = class3.field37[var37];
            if (arg0.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
    public final void method3266(int arg0) {
        class571 var2 = this.field7910;
        synchronized (this.field7910) {
            if (arg0 != 64) {
                method3265(null, (byte) -17, null, 14, -65, -111, 97, -8, 57, 11, 127, null, 84, false, -98);
            }
            this.field7910.method3246(false);
        }
        field7903++;
        class571 var3 = this.field7911;
        synchronized (this.field7911) {
            this.field7911.method3246(false);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)V")
    public final void method3267(int arg0, int arg1) {
        class571 var3 = this.field7899;
        synchronized (this.field7899) {
            if (arg0 > -29) {
                this.field7899 = null;
            }
            this.field7899.method3253(arg1, -119);
        }
        field7898++;
        class571 var4 = this.field7910;
        synchronized (this.field7910) {
            this.field7910.method3253(arg1, -124);
        }
        class571 var5 = this.field7911;
        synchronized (this.field7911) {
            this.field7911.method3253(arg1, -119);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BI)V")
    public final void method3268(byte arg0, int arg1) {
        field7908++;
        this.field7912 = arg1;
        class571 var3 = this.field7910;
        synchronized (this.field7910) {
            this.field7910.method3246(false);
        }
        class571 var4 = this.field7911;
        synchronized (this.field7911) {
            if (arg0 > -94) {
                this.method3266(-73);
            }
            this.field7911.method3246(false);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
    public final void method3269(boolean arg0) {
        field7907++;
        class571 var2 = this.field7899;
        synchronized (this.field7899) {
            this.field7899.method3248(0);
        }
        class571 var3 = this.field7910;
        synchronized (this.field7910) {
            if (!arg0) {
                this.field7902 = null;
            }
            this.field7910.method3248(0);
        }
        class571 var4 = this.field7911;
        synchronized (this.field7911) {
            this.field7911.method3248(0);
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lhu;IZLan;Lan;)V")
    public class573(class111 arg0, int arg1, boolean arg2, class21 arg3, class21 arg4) {
        this.field7897 = arg0;
        this.field7901 = arg4;
        this.field7902 = arg3;
        this.field7906 = arg2;
        if (this.field7902 != null) {
            int var6 = this.field7902.method239(-53) - 1;
            this.field7902.method231(var6, -125);
        }
    }
}
