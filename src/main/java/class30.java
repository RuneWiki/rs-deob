import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class30 {

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "Lvb;")
    public class60 field481 = new class60();

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public static int field476 = 128;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "Lgd;")
    public static class325 field471 = new class325(64);

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "Z")
    public static boolean field480 = false;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "Lpk;")
    public static class120 field468;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "Lvb;")
    private class60 field482;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "Lbn;")
    public static class72 field478;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)Z", line = 9)
    public final boolean method265(byte arg0) {
        field479++;
        if (arg0 != 23) {
            field471 = (class325) null;
        }
        return this.field481.field891 == this.field481;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 28)
    public final void method266(int arg0) {
        field472++;
        while (true) {
            class60 var2 = this.field481.field891;
            if (this.field481 == var2) {
                this.field482 = null;
                if (arg0 != -20840) {
                    field471 = (class325) null;
                }
                return;
            }
            var2.method489(false);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)I", line = 54)
    public static final int method267(int arg0, int arg1, int arg2, int arg3) {
        field467++;
        int var4 = arg2 / arg1;
        int var5 = arg2 & arg1 - 1;
        int var6 = arg3 / arg1;
        int var7 = class314.method2215(var6, 1, var4);
        int var8 = arg1 - 1 & arg3;
        if (arg0 > -48) {
            field478 = (class72) null;
        }
        int var9 = class314.method2215(var6, 1, var4 + 1);
        int var10 = class314.method2215(var6 + 1, 1, var4);
        int var11 = class314.method2215(var6 + 1, 1, var4 + 1);
        int var12 = class285.method1992(var9, var5, arg1, 65536, var7);
        int var13 = class285.method1992(var11, var5, arg1, 65536, var10);
        return class285.method1992(var13, var8, arg1, 65536, var12);
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Lvb;", line = 89)
    public final class60 method268(int arg0) {
        field475++;
        class60 var2 = this.field481.field891;
        if (this.field481 == var2) {
            this.field482 = null;
            return null;
        }
        this.field482 = var2.field891;
        if (arg0 != -1) {
            field477 = -68;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)Lvb;", line = 109)
    public final class60 method269(byte arg0) {
        field463++;
        if (arg0 <= 17) {
            this.field482 = (class60) null;
        }
        class60 var2 = this.field481.field880;
        if (this.field481 == var2) {
            this.field482 = null;
            return null;
        } else {
            this.field482 = var2.field880;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V", line = 131)
    public static void method270(int arg0) {
        field471 = null;
        field478 = null;
        int var1 = -100 % ((arg0 - 19) / 53);
        field468 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILaj;)Ljava/lang/String;", line = 146)
    public static final String method271(int arg0, int arg1, class1 arg2) {
        field462++;
        try {
            int var3 = arg2.method63(127);
            int var4 = 77 % ((arg0 + 17) / 38);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var5 = new byte[var3];
            arg2.field48 += class170.field2744.method207(arg2.field48, var5, arg2.field34, var3, 0, (byte) -59);
            return class225.method1647(var5, 0, 0, var3);
        } catch (Exception var8) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIBI)V", line = 182)
    public static final void method272(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field473++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg0 * arg0;
        int var9 = var8 << 1;
        int var10 = arg5 * arg5;
        int var11 = var10 << 1;
        int var12 = 15 / ((arg4 - 4) / 39);
        int var13 = arg0 << 1;
        int var14 = var10 << 2;
        int var15 = var8 - ((var13 - 1) * var11);
        int var16 = var8 << 2;
        int var17 = ((arg0 << 1) - 3) * var11;
        int var18 = ((var6 << 1) + 3) * var9;
        int var19 = (var6 + 1) * var16;
        int var20 = (1 - var13) * var10 + var9;
        if (class104.field1719 <= arg1 && class333.field5188 >= arg1) {
            int var21 = class10.method151(class180.field2862, arg3 + arg5, 114, class310.field4897);
            int var22 = class10.method151(class180.field2862, arg3 - arg5, 122, class310.field4897);
            class323.method2273(var22, arg2, class221.field3443[arg1], var21, 110);
        }
        int var23 = (arg0 - 1) * var14;
        while (var7 > 0) {
            if (var20 < 0) {
                while (var20 < 0) {
                    var6++;
                    var20 += var18;
                    var15 += var19;
                    var19 += var16;
                    var18 += var16;
                }
            }
            var7--;
            int var24 = arg1 - var7;
            if (var15 < 0) {
                var15 += var19;
                var6++;
                var20 += var18;
                var18 += var16;
                var19 += var16;
            }
            var20 += -var23;
            int var25 = arg1 + var7;
            var15 += -var17;
            var23 -= var14;
            if (var25 >= class104.field1719 && class333.field5188 >= var24) {
                int var26 = class10.method151(class180.field2862, arg3 + var6, 122, class310.field4897);
                int var27 = class10.method151(class180.field2862, arg3 - var6, 117, class310.field4897);
                if (var24 >= class104.field1719) {
                    class323.method2273(var27, arg2, class221.field3443[var24], var26, 105);
                }
                if (var25 <= class333.field5188) {
                    class323.method2273(var27, arg2, class221.field3443[var25], var26, 74);
                }
            }
            var17 -= var14;
        }
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)Lvb;", line = 284)
    public final class60 method273(int arg0) {
        class60 var2 = this.field482;
        field470++;
        if (this.field481 == var2) {
            this.field482 = null;
            return null;
        }
        if (arg0 != -28007) {
            field461 = -92;
        }
        this.field482 = var2.field880;
        return var2;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILvb;)V", line = 315)
    public final void method274(int arg0, class60 arg1) {
        if (arg1.field880 != null) {
            arg1.method489(false);
        }
        arg1.field880 = this.field481;
        arg1.field891 = this.field481.field891;
        field464++;
        arg1.field880.field891 = arg1;
        arg1.field891.field880 = arg1;
        if (arg0 != 1) {
            this.method269((byte) -99);
        }
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)Lvb;", line = 333)
    public final class60 method275(int arg0) {
        field474++;
        class60 var2 = this.field481.field891;
        if (this.field481 == var2) {
            return null;
        }
        var2.method489(false);
        if (arg0 != -1) {
            field461 = 89;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V", line = 357)
    public static final void method276(byte arg0) {
        class151.field2485.method2282((byte) -121);
        class337.field5212.method2282((byte) -119);
        if (arg0 > -120) {
            method271(-33, 86, (class1) null);
        }
        class113.field1822.method2282((byte) -120);
        field465++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lvb;B)V", line = 375)
    public final void method277(class60 arg0, byte arg1) {
        if (arg0.field880 != null) {
            arg0.method489(false);
        }
        arg0.field891 = this.field481;
        field469++;
        arg0.field880 = this.field481.field880;
        if (arg1 != -119) {
            this.method275(-126);
        }
        arg0.field880.field891 = arg0;
        arg0.field891.field880 = arg0;
    }

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)Lvb;", line = 394)
    public final class60 method278(int arg0) {
        field466++;
        if (arg0 != 1) {
            field461 = -125;
        }
        class60 var2 = this.field482;
        if (this.field481 == var2) {
            this.field482 = null;
            return null;
        } else {
            this.field482 = var2.field891;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V", line = 416)
    public class30() {
        this.field481.field891 = this.field481;
        this.field481.field880 = this.field481;
    }
}
