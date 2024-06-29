import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class207 extends class271 {

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "Lpj;")
    public class284 field3104 = new class284();

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "Lpi;")
    public class132 field3112 = new class132();

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "Lui;")
    private class212 field3098;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field3093 = 0;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "Lnc;")
    public static class89 field3105 = new class89(64);

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "Lpk;")
    public static class237 field3103;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "Z")
    public static boolean field3097;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([IIIBLqk;I)V")
    private final void method1365(int[] arg0, int arg1, int arg2, byte arg3, class1 arg4, int arg5) {
        field3101++;
        if ((this.field3098.field3203[arg4.field8] & 0x4) != 0 && arg4.field18 < 0) {
            int var7 = this.field3098.field3213[arg4.field8] / class174.field2547;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field11) / var7;
                if (var8 > arg1) {
                    arg4.field11 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                arg4.field30.method262(arg0, arg5, var8);
                arg4.field11 += var7 * var8 - 1048576;
                arg5 += var8;
                int var9 = class174.field2547 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class35 var11 = arg4.field30;
                if (this.field3098.field3233[arg4.field8] == 0) {
                    arg4.field30 = class35.method245(arg4.field1, var11.method244(), var11.method237(), var11.method235());
                } else {
                    arg4.field30 = class35.method245(arg4.field1, var11.method244(), 0, var11.method235());
                    this.field3098.method1409(-29040, arg4.field7.field2213[arg4.field5] < 0, arg4);
                    arg4.field30.method270(var9, var11.method237());
                }
                if (arg4.field7.field2213[arg4.field5] < 0) {
                    arg4.field30.method239(-1);
                }
                var11.method268(var9);
                var11.method262(arg0, arg5, arg2 - arg5);
                if (var11.method260()) {
                    this.field3112.method913(var11);
                }
            }
        }
        if (arg3 < -98) {
            arg4.field30.method262(arg0, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZZ)V")
    public static final void method1366(boolean arg0, boolean arg1) {
        if (!arg1) {
            field3103 = null;
        }
        for (class269 var2 = (class269) class249.field3864.method1894((byte) -90); var2 != null; var2 = (class269) class249.field3864.method1886(-112)) {
            if (var2.field4198 != null) {
                class108.field1581.method908(var2.field4198);
                var2.field4198 = null;
            }
            if (var2.field4177 != null) {
                class108.field1581.method908(var2.field4177);
                var2.field4177 = null;
            }
            var2.method1193(113);
        }
        if (arg0) {
            for (class269 var3 = (class269) class256.field3947.method1894((byte) -90); var3 != null; var3 = (class269) class256.field3947.method1886(-92)) {
                if (var3.field4198 != null) {
                    class108.field1581.method908(var3.field4198);
                    var3.field4198 = null;
                }
                var3.method1193(113);
            }
            for (class269 var4 = (class269) class251.field3887.method315((byte) 125); var4 != null; var4 = (class269) class251.field3887.method310(-108)) {
                if (var4.field4198 != null) {
                    class108.field1581.method908(var4.field4198);
                    var4.field4198 = null;
                }
                var4.method1193(123);
            }
        }
        field3099++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([III)V")
    public final void method262(int[] arg0, int arg1, int arg2) {
        this.field3112.method262(arg0, arg1, arg2);
        field3109++;
        for (class1 var4 = (class1) this.field3104.method1894((byte) -90); var4 != null; var4 = (class1) this.field3104.method1886(-44)) {
            if (!this.field3098.method1401(var4, -123)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field33) {
                        this.method1365(arg0, var6, var5 + var6, (byte) -105, var4, var5);
                        var4.field33 -= var6;
                        break;
                    }
                    this.method1365(arg0, var4.field33, var5 + var6, (byte) -126, var4, var5);
                    var6 -= var4.field33;
                    var5 += var4.field33;
                } while (!this.field3098.method1419(var4, arg0, var6, var5, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static final void method1367(boolean arg0) {
        field3107++;
        if (arg0) {
            return;
        }
        for (class184 var1 = (class184) class269.field4183.method1894((byte) -90); var1 != null; var1 = (class184) class269.field4183.method1886(-2)) {
            if (var1.field2670 > 0) {
                var1.field2670--;
            }
            if (var1.field2670 != 0) {
                if (var1.field2666 > 0) {
                    var1.field2666--;
                }
                if (var1.field2666 == 0 && var1.field2674 >= 1 && var1.field2669 >= 1 && var1.field2674 <= 102 && var1.field2669 <= 102 && (var1.field2680 < 0 || class142.method963(var1.field2680, 99, var1.field2682))) {
                    class280.method1861(-2278, var1.field2669, var1.field2673, var1.field2681, var1.field2682, var1.field2671, var1.field2680, var1.field2674);
                    var1.field2666 = -1;
                    if (var1.field2680 == var1.field2675 && var1.field2675 == -1) {
                        var1.method1193(120);
                    } else if (var1.field2680 == var1.field2675 && var1.field2678 == var1.field2673 && var1.field2682 == var1.field2668) {
                        var1.method1193(117);
                    }
                }
            } else if (var1.field2675 < 0 || class142.method963(var1.field2675, 76, var1.field2668)) {
                class280.method1861(-2278, var1.field2669, var1.field2678, var1.field2681, var1.field2668, var1.field2671, var1.field2675, var1.field2674);
                var1.method1193(109);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3094++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        int var11 = arg4 - arg1;
        int var12 = arg4 * arg4;
        int var13 = arg5 - arg1;
        int var14 = var11 * var11;
        int var15 = arg5 * arg5;
        int var16 = var15 << 1;
        int var17 = var12 << 1;
        if (arg6 != -22491) {
            return;
        }
        int var18 = arg5 << 1;
        int var19 = var13 * var13;
        int var20 = var19 << 1;
        int var21 = var14 << 1;
        int var22 = (1 - var18) * var12 + var16;
        int var23 = var13 << 1;
        int var24 = var15 - ((var18 - 1) * var17);
        int var25 = (1 - var23) * var14 + var20;
        int var26 = var15 << 2;
        int var27 = var19 - (var23 - 1) * var21;
        int var28 = var14 << 2;
        int var29 = var12 << 2;
        int var30 = var19 << 2;
        int var31 = var16 * 3;
        int var32 = (var18 - 3) * var17;
        int var33 = var20 * 3;
        int var34 = var26;
        int var35 = (var23 - 3) * var21;
        int var36 = var30;
        int var37 = (arg5 - 1) * var29;
        if (arg7 >= class175.field2557 && class91.field1381 >= arg7) {
            int[] var38 = class241.field3751[arg7];
            int var39 = class251.method1710(arg3 - arg4, (byte) 27, class196.field2961, class84.field1287);
            int var40 = class251.method1710(arg3 + arg4, (byte) 27, class196.field2961, class84.field1287);
            int var41 = class251.method1710(arg3 - var11, (byte) 27, class196.field2961, class84.field1287);
            int var42 = class251.method1710(arg3 + var11, (byte) 27, class196.field2961, class84.field1287);
            class222.method1519((byte) -112, var39, var38, var41, arg0);
            class222.method1519((byte) -125, var41, var38, var42, arg2);
            class222.method1519((byte) -125, var42, var38, var40, arg0);
        }
        int var43 = (var13 - 1) * var28;
        while (var10 > 0) {
            boolean var44 = var13 >= var10;
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var22 += var31;
                    var31 += var26;
                    var24 += var34;
                    var34 += var26;
                }
            }
            var10--;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var27 += var36;
                        var9++;
                        var36 += var30;
                        var25 += var33;
                        var33 += var30;
                    }
                }
                if (var27 < 0) {
                    var25 += var33;
                    var33 += var30;
                    var27 += var36;
                    var9++;
                    var36 += var30;
                }
                var27 += -var35;
                var25 += -var43;
                var43 -= var28;
                var35 -= var28;
            }
            if (var24 < 0) {
                var8++;
                var22 += var31;
                var31 += var26;
                var24 += var34;
                var34 += var26;
            }
            var22 += -var37;
            var37 -= var29;
            int var45 = arg7 + var10;
            int var46 = arg7 - var10;
            if (var45 >= class175.field2557 && var46 <= class91.field1381) {
                int var47 = class251.method1710(arg3 + var8, (byte) 27, class196.field2961, class84.field1287);
                int var48 = class251.method1710(arg3 - var8, (byte) 27, class196.field2961, class84.field1287);
                if (var44) {
                    int var49 = class251.method1710(arg3 + var9, (byte) 27, class196.field2961, class84.field1287);
                    int var50 = class251.method1710(arg3 - var9, (byte) 27, class196.field2961, class84.field1287);
                    if (var46 >= class175.field2557) {
                        int[] var51 = class241.field3751[var46];
                        class222.method1519((byte) -108, var48, var51, var50, arg0);
                        class222.method1519((byte) -115, var50, var51, var49, arg2);
                        class222.method1519((byte) -111, var49, var51, var47, arg0);
                    }
                    if (var45 <= class91.field1381) {
                        int[] var52 = class241.field3751[var45];
                        class222.method1519((byte) -123, var48, var52, var50, arg0);
                        class222.method1519((byte) -122, var50, var52, var49, arg2);
                        class222.method1519((byte) -113, var49, var52, var47, arg0);
                    }
                } else {
                    if (class175.field2557 <= var46) {
                        class222.method1519((byte) -111, var48, class241.field3751[var46], var47, arg0);
                    }
                    if (class91.field1381 >= var45) {
                        class222.method1519((byte) -120, var48, class241.field3751[var45], var47, arg0);
                    }
                }
            }
            var24 += -var32;
            var32 -= var29;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)I")
    public static final int method1369(byte arg0) {
        if (arg0 > -87) {
            method1369((byte) 103);
        }
        field3100++;
        return class169.field2485;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
    public static void method1370(int arg0) {
        field3103 = null;
        if (arg0 <= -80) {
            field3105 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()Lgj;")
    public final class271 method250() {
        field3106++;
        class1 var1;
        do {
            var1 = (class1) this.field3104.method1886(-84);
            if (var1 == null) {
                return null;
            }
        } while (var1.field30 == null);
        return var1.field30;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
    public final int method275() {
        field3102++;
        return 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILqk;)V")
    private final void method1371(int arg0, int arg1, class1 arg2) {
        field3110++;
        if ((this.field3098.field3203[arg2.field8] & 0x4) != 0 && arg2.field18 < 0) {
            int var4 = this.field3098.field3213[arg2.field8] / class174.field2547;
            int var5 = (var4 + 1048575 - arg2.field11) / var4;
            arg2.field11 = arg2.field11 + (arg0 * var4) & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field3098.field3233[arg2.field8] == 0) {
                    arg2.field30 = class35.method245(arg2.field1, arg2.field30.method244(), arg2.field30.method237(), arg2.field30.method235());
                } else {
                    arg2.field30 = class35.method245(arg2.field1, arg2.field30.method244(), 0, arg2.field30.method235());
                    this.field3098.method1409(-29040, arg2.field7.field2213[arg2.field5] < 0, arg2);
                }
                if (arg2.field7.field2213[arg2.field5] < 0) {
                    arg2.field30.method239(-1);
                }
                arg0 = arg2.field11 / var4;
            }
        }
        if (arg1 == 30526) {
            arg2.field30.method280(arg0);
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
    public final void method280(int arg0) {
        this.field3112.method280(arg0);
        field3096++;
        for (class1 var2 = (class1) this.field3104.method1894((byte) -90); var2 != null; var2 = (class1) this.field3104.method1886(-60)) {
            if (!this.field3098.method1401(var2, -126)) {
                int var3 = arg0;
                do {
                    if (var2.field33 >= var3) {
                        this.method1371(var3, 30526, var2);
                        var2.field33 -= var3;
                        break;
                    }
                    this.method1371(var2.field33, 30526, var2);
                    var3 -= var2.field33;
                } while (!this.field3098.method1419(var2, (int[]) null, var3, 0, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()Lgj;")
    public final class271 method259() {
        field3111++;
        class1 var1 = (class1) this.field3104.method1894((byte) -90);
        if (var1 == null) {
            return null;
        } else if (var1.field30 == null) {
            return this.method250();
        } else {
            return var1.field30;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lui;)V")
    public class207(class212 arg0) {
        this.field3098 = arg0;
    }
}
