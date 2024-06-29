import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class210 extends class136 {

    @OriginalMember(owner = "client!og", name = "V", descriptor = "Lwe;")
    public class15 field3695 = new class15();

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "Lid;")
    public class145 field3699 = new class145();

    @OriginalMember(owner = "client!og", name = "X", descriptor = "Lm;")
    private class113 field3697;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field3672 = 5063219;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "Ljd;")
    private static class85 field3674 = class221.method1499("Thu", (byte) -102);

    @OriginalMember(owner = "client!og", name = "z", descriptor = "Ljd;")
    private static class85 field3673 = class221.method1499("Fri", (byte) -76);

    @OriginalMember(owner = "client!og", name = "C", descriptor = "Ljd;")
    public static class85 field3676 = class221.method1499("Schrifts-=tze geladen)3", (byte) -100);

    @OriginalMember(owner = "client!og", name = "I", descriptor = "Ljd;")
    public static class85 field3682 = class221.method1499("<col=ff3000>", (byte) 110);

    @OriginalMember(owner = "client!og", name = "E", descriptor = "Z")
    public static boolean field3678 = true;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Ljd;")
    private static class85 field3689 = class221.method1499("Mon", (byte) 105);

    @OriginalMember(owner = "client!og", name = "x", descriptor = "Ljd;")
    private static class85 field3671 = class221.method1499("Sat", (byte) 99);

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field3694 = -1;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "Ljd;")
    private static class85 field3693 = class221.method1499("Sun", (byte) 121);

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "Ljd;")
    private static class85 field3690 = class221.method1499("Loaded update list", (byte) -120);

    @OriginalMember(owner = "client!og", name = "D", descriptor = "Ljd;")
    private static class85 field3677 = class221.method1499("Wed", (byte) -43);

    @OriginalMember(owner = "client!og", name = "O", descriptor = "Ljd;")
    private static class85 field3688 = class221.method1499("Tue", (byte) -97);

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field3679 = 0;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "[Ljd;")
    public static class85[] field3685 = new class85[] { field3693, field3689, field3688, field3677, field3674, field3673, field3671 };

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field3686 = 0;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "Ljd;")
    public static class85 field3675 = field3690;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "[[Z")
    public static boolean[][] field3683;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    public final void method795(int arg0) {
        field3681++;
        this.field3699.method795(arg0);
        for (class135 var2 = (class135) this.field3695.method110(64); var2 != null; var2 = (class135) this.field3695.method117((byte) 99)) {
            if (!this.field3697.method802(108, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2354 >= var3) {
                        this.method1444(var2, (byte) -68, var3);
                        var2.field2354 -= var3;
                        break;
                    }
                    this.method1444(var2, (byte) -68, var2.field2354);
                    var3 -= var2.field2354;
                } while (!this.field3697.method786(var3, 0, (int[]) null, -3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "([III)V")
    public final void method775(int[] arg0, int arg1, int arg2) {
        field3691++;
        this.field3699.method775(arg0, arg1, arg2);
        for (class135 var4 = (class135) this.field3695.method110(64); var4 != null; var4 = (class135) this.field3695.method117((byte) 82)) {
            if (!this.field3697.method802(-103, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2354) {
                        this.method1443((byte) 63, var5, var4, var5 + var6, var6, arg0);
                        var4.field2354 -= var6;
                        break;
                    }
                    this.method1443((byte) 84, var5, var4, var5 + var6, var4.field2354, arg0);
                    var6 -= var4.field2354;
                    var5 += var4.field2354;
                } while (!this.field3697.method786(var6, var5, arg0, -114, var4));
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()Ldg;")
    public final class136 method780() {
        field3684++;
        class135 var1;
        do {
            var1 = (class135) this.field3695.method117((byte) 119);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2357 == null);
        return var1.field2357;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()Ldg;")
    public final class136 method791() {
        field3698++;
        class135 var1 = (class135) this.field3695.method110(64);
        if (var1 == null) {
            return null;
        } else if (var1.field2357 == null) {
            return this.method780();
        } else {
            return var1.field2357;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "()I")
    public final int method764() {
        field3680++;
        return 0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BILpi;II[I)V")
    private final void method1443(byte arg0, int arg1, class135 arg2, int arg3, int arg4, int[] arg5) {
        field3687++;
        if ((this.field3697.field2010[arg2.field2352] & 0x4) != 0 && arg2.field2349 < 0) {
            int var7 = this.field3697.field2020[arg2.field2352] / class159.field2706;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2373) / var7;
                if (arg4 < var8) {
                    arg2.field2373 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg2.field2357.method775(arg5, arg1, var8);
                arg1 += var8;
                int var9 = class159.field2706 / 100;
                arg2.field2373 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                class238 var11 = arg2.field2357;
                if (var9 > var10) {
                    var9 = var10;
                }
                if (this.field3697.field1986[arg2.field2352] == 0) {
                    arg2.field2357 = class238.method1619(arg2.field2345, var11.method1605(), var11.method1591(), var11.method1613());
                } else {
                    arg2.field2357 = class238.method1619(arg2.field2345, var11.method1605(), 0, var11.method1613());
                    this.field3697.method769(arg2.field2369.field566[arg2.field2361] < 0, -95, arg2);
                    arg2.field2357.method1600(var9, var11.method1591());
                }
                if (arg2.field2369.field566[arg2.field2361] < 0) {
                    arg2.field2357.method1602(-1);
                }
                var11.method1604(var9);
                var11.method775(arg5, arg1, arg3 - arg1);
                if (var11.method1590()) {
                    this.field3699.method951(var11);
                }
            }
        }
        if (arg0 > 50) {
            arg2.field2357.method775(arg5, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lpi;BI)V")
    private final void method1444(class135 arg0, byte arg1, int arg2) {
        field3692++;
        if ((this.field3697.field2010[arg0.field2352] & 0x4) != 0 && arg0.field2349 < 0) {
            int var4 = this.field3697.field2020[arg0.field2352] / class159.field2706;
            int var5 = (var4 + 1048575 - arg0.field2373) / var4;
            arg0.field2373 = arg2 * var4 + arg0.field2373 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field3697.field1986[arg0.field2352] == 0) {
                    arg0.field2357 = class238.method1619(arg0.field2345, arg0.field2357.method1605(), arg0.field2357.method1591(), arg0.field2357.method1613());
                } else {
                    arg0.field2357 = class238.method1619(arg0.field2345, arg0.field2357.method1605(), 0, arg0.field2357.method1613());
                    this.field3697.method769(arg0.field2369.field566[arg0.field2361] < 0, -64, arg0);
                }
                if (arg0.field2369.field566[arg0.field2361] < 0) {
                    arg0.field2357.method1602(-1);
                }
                arg2 = arg0.field2373 / var4;
            }
        }
        arg0.field2357.method795(arg2);
        if (arg1 != -68) {
            field3683 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static final void method1445(byte arg0) {
        field3696++;
        class52.field903.method1270((byte) 107);
        class48.field848.method1270((byte) 107);
        class185.field3185.method1270((byte) 107);
        if (arg0 >= -51) {
            method1446(34);
        }
        class171.field2944.method1270((byte) 107);
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    public static final void method1446(int arg0) {
        class160.method1049();
        for (int var1 = 0; var1 < 4; var1++) {
            class34.field529[var1].method1813(2949);
        }
        int var2 = 117 / ((-arg0 - 16) / 41);
        System.gc();
        field3670++;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lm;)V")
    public class210(class113 arg0) {
        this.field3697 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public static void method1447(int arg0) {
        field3674 = null;
        field3689 = null;
        field3673 = null;
        field3677 = null;
        field3676 = null;
        field3671 = null;
        field3675 = null;
        if (arg0 != 0) {
            method1445((byte) 83);
        }
        field3685 = null;
        field3683 = null;
        field3690 = null;
        field3693 = null;
        field3682 = null;
        field3688 = null;
    }
}
