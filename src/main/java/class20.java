import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class20 {

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Lsf;")
    public static class108 field298 = class140.method973(255, "(Udns");

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lik;")
    public static class262 field296;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 12)
    public static final void method134(int arg0) {
        if (arg0 != -1) {
            method134(93);
        }
        field295++;
        if (class78.field1181 != null) {
            class290.method2076(class78.field1181, 128);
            class78.field1181 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILik;Lik;)V", line = 33)
    public static final void method135(int arg0, class262 arg1, class262 arg2) {
        if (arg0 >= -56) {
            field298 = (class108) null;
        }
        class209.field3729 = arg2;
        class17.field214 = arg1;
        field294++;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 45)
    public static final void method136(int arg0) {
        field299++;
        if (arg0 != 1) {
            field296 = (class262) null;
        }
        if (class140.field2463) {
            class105.field1814 = null;
            class296.field5168 = null;
            class140.field2463 = false;
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 61)
    public static void method137(int arg0) {
        if (arg0 != -1071) {
            method136(-105);
        }
        field298 = null;
        field296 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIIIII)V", line = 75)
    public static final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field293++;
        for (int var9 = 0; var9 < class42.field559.field5053; var9++) {
            int var10 = class42.field559.field5058[var9] - class144.field2546;
            int var11 = class152.field2757 + class83.field1288 - class42.field559.field5063[var9] - 1;
            int var12 = (arg7 - arg2) * (var10 - arg5) / (arg1 - arg5) + arg2;
            int var13 = class42.field559.method2061(var9, -1608225261);
            int var14 = (arg3 - arg4) * (var11 - arg6) / (arg8 - arg6) + arg4;
            int var15 = 16777215;
            class193 var16 = null;
            if (var13 == 0) {
                if ((double) class147.field2643 == 3.0D) {
                    var16 = class236.field4145;
                }
                if ((double) class147.field2643 == 4.0D) {
                    var16 = class162.field2902;
                }
                if ((double) class147.field2643 == 6.0D) {
                    var16 = class64.field1030;
                }
                if ((double) class147.field2643 == 8.0D) {
                    var16 = class99.field1749;
                }
            }
            if (var13 == 1) {
                if ((double) class147.field2643 == 3.0D) {
                    var16 = class64.field1030;
                }
                if ((double) class147.field2643 == 4.0D) {
                    var16 = class99.field1749;
                }
                if ((double) class147.field2643 == 6.0D) {
                    var16 = class306.field5332;
                }
                if ((double) class147.field2643 == 8.0D) {
                    var16 = class9.field114;
                }
            }
            if (var13 == 2) {
                var15 = 16755200;
                if ((double) class147.field2643 == 3.0D) {
                    var16 = class306.field5332;
                }
                if ((double) class147.field2643 == 4.0D) {
                    var16 = class9.field114;
                }
                if ((double) class147.field2643 == 6.0D) {
                    var16 = class174.field3186;
                }
                if ((double) class147.field2643 == 8.0D) {
                    var16 = class122.field2089;
                }
            }
            if (class42.field559.field5055[var9] != -1) {
                var15 = class42.field559.field5055[var9];
            }
            if (var16 != null) {
                class108[] var17 = new class108[class42.field559.field5064[var9].method786(60, -70) + 1];
                class223.field3953.method536(class42.field559.field5064[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var14 - var16.method1368() * (var18 - 1) / 2;
                int var20 = var19 + var16.method1365() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class108 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method750(false, 0, var17[var21].method776(0) - 4);
                    var16.method1369(var22, var12, var20, var15, true);
                    var20 += var16.method1368();
                }
            }
        }
        if (arg0 > -3) {
            field296 = (class262) null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lik;IZI)[Lvd;", line = 190)
    public static final class135[] method140(class262 arg0, int arg1, boolean arg2, int arg3) {
        field297++;
        if (class167.method1166(arg0, arg3, (byte) -56, arg1)) {
            if (!arg2) {
                method140((class262) null, 59, false, 99);
            }
            return class147.method1023((byte) 122);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public abstract void method138(byte arg0);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)I")
    public abstract int method141(int arg0, int arg1, int arg2);
}
