import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class58 {

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Ltl;")
    private class400 field804 = new class400(16);

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "Lui;")
    private class451 field805;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "Lct;")
    public static class285 field801 = new class285(15, 2);

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Lo;")
    public static class332 field810 = new class332(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "Las;")
    public static class15 field809;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "Lui;")
    public static class451 field811;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 13)
    public final void method448(byte arg0) {
        if (arg0 >= -54) {
            this.field804 = null;
        }
        class400 var2 = this.field804;
        synchronized (this.field804) {
            this.field804.method2401((byte) -49);
        }
        field803++;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V", line = 26)
    public final void method449(int arg0, int arg1) {
        field802++;
        class400 var3 = this.field804;
        synchronized (this.field804) {
            if (arg0 != -23329) {
                this.method453((byte) -91, 55);
            }
            this.field804.method2389(false, arg1);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field806++;
        int var6 = arg0 - arg3;
        int var7 = arg2 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class280.method1804(1, arg5, arg4, arg0, arg3);
            }
        } else if (var6 == 0) {
            class176.method1211(arg2, arg3, arg4, arg5, (byte) 119);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                arg5 = arg3;
                int var10 = arg2;
                arg3 = var9;
                arg2 = arg0;
                arg0 = var10;
            }
            if (arg2 < arg5) {
                int var11 = arg5;
                arg5 = arg2;
                int var12 = arg3;
                arg3 = arg0;
                arg2 = var11;
                arg0 = var12;
            }
            int var13 = arg3;
            int var14 = arg2 - arg5;
            int var15 = arg0 - arg3;
            if (arg1 < -18) {
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg0 <= arg3 ? -1 : 1;
                if (var8) {
                    for (int var19 = arg5; var19 <= arg2; var19++) {
                        class49.field723[var19][var13] = arg4;
                        var16 += var15;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var18 = arg5; var18 <= arg2; var18++) {
                        var16 += var15;
                        class49.field723[var13][var18] = arg4;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V", line = 160)
    public final void method451(byte arg0) {
        field800++;
        class400 var2 = this.field804;
        synchronized (this.field804) {
            this.field804.method2388(19);
            int var3 = 3 / ((arg0 + 24) / 41);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 174)
    public static void method452(int arg0) {
        field809 = null;
        if (arg0 == 759623041) {
            field811 = null;
            field810 = null;
            field801 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)Lwc;", line = 188)
    public final class345 method453(byte arg0, int arg1) {
        field808++;
        class400 var3 = this.field804;
        class345 var4;
        synchronized (this.field804) {
            var4 = (class345) this.field804.method2393(-123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field805.method2691(arg1, 30, 0);
        class345 var6 = new class345();
        if (var5 != null) {
            var6.method2124(128, new class446(var5));
        }
        int var7 = -76 / ((-arg0 - 37) / 51);
        class400 var8 = this.field804;
        synchronized (this.field804) {
            this.field804.method2395(0, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V", line = 218)
    public static final void method454(byte arg0) {
        class336.field5036.method586(class287.field4376, class402.field5873, class92.field1281);
        if (arg0 >= 108) {
            field807++;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 231)
    public class58(class430 arg0, int arg1, class451 arg2) {
        this.field805 = arg2;
        this.field805.method2662(30, (byte) -7);
    }
}
