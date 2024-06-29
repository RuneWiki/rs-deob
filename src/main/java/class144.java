import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class144 extends class23 {

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "Lse;")
    public class130 field3293 = new class130();

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "Lie;")
    public class61 field3298 = new class61();

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Lbf;")
    private class14 field3283;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "Lhe;")
    public static class54 field3289 = class6.method58("Startseite auf (WSpielkonto wiederherstellen(W)3", false);

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "Lhe;")
    public static class54 field3292 = class6.method58("bevor Sie den Vorgang wiederholen)3", false);

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "Lef;")
    public static class35 field3287;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([III)V")
    public final void method109(int[] arg0, int arg1, int arg2) {
        this.field3298.method109(arg0, arg1, arg2);
        field3281++;
        for (class72 var4 = (class72) this.field3293.method979(-126); var4 != null; var4 = (class72) this.field3293.method983(18485)) {
            if (!this.field3283.method124(var4, 0)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1775) {
                        this.method1111(var6, var5 + var6, arg0, 0, var4, var5);
                        var4.field1775 -= var5;
                        break;
                    }
                    this.method1111(var6, var5 + var6, arg0, 0, var4, var4.field1775);
                    var5 -= var4.field1775;
                    var6 += var4.field1775;
                } while (!this.field3283.method115(var6, var4, arg0, (byte) 76, var5));
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(ILnc;)Lhe;")
    public static final class54 method1107(int arg0, class93 arg1) {
        if (arg0 >= -56) {
            method1110(2, null);
        }
        field3288++;
        if (class135.method1009(14423, class105.method810(arg1, -22389)) == 0) {
            return null;
        } else if (arg1.field2275 == null || arg1.field2275.method394(127).method404(-108) == 0) {
            return class31.field804 ? class6.field183 : null;
        } else {
            return arg1.field2275;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()Lda;")
    public final class23 method104() {
        field3284++;
        class72 var1 = (class72) this.field3293.method979(-128);
        if (var1 == null) {
            return null;
        } else if (var1.field1786 == null) {
            return this.method135();
        } else {
            return var1.field1786;
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field3292 = null;
        field3289 = null;
        int var1 = -3 / ((7 - arg0) / 53);
        field3287 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        field3294++;
        this.field3298.method111(arg0);
        for (class72 var2 = (class72) this.field3293.method979(-123); var2 != null; var2 = (class72) this.field3293.method983(18485)) {
            if (!this.field3283.method124(var2, 0)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1775) {
                        this.method1109(var3, (byte) 116, var2);
                        var2.field1775 -= var3;
                        break;
                    }
                    this.method1109(var2.field1775, (byte) 116, var2);
                    var3 -= var2.field1775;
                } while (!this.field3283.method115(0, var2, null, (byte) 59, var3));
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBLkc;)V")
    private final void method1109(int arg0, byte arg1, class72 arg2) {
        field3286++;
        if (arg1 != 116) {
            this.method104();
        }
        if ((this.field3283.field393[arg2.field1773] & 0x4) != 0 && arg2.field1774 < 0) {
            int var4 = this.field3283.field424[arg2.field1773] / class134.field3037;
            int var5 = (var4 + 1048575 - arg2.field1801) / var4;
            arg2.field1801 = arg0 * var4 + arg2.field1801 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3283.field419[arg2.field1773] == 0) {
                    arg2.field1786 = class119.method902(arg2.field1789, arg2.field1786.method925(), arg2.field1786.method891(), arg2.field1786.method914());
                } else {
                    arg2.field1786 = class119.method902(arg2.field1789, arg2.field1786.method925(), 0, arg2.field1786.method914());
                    this.field3283.method130(arg2.field1793.field3225[arg2.field1797] < 0, (byte) -103, arg2);
                }
                if (arg2.field1793.field3225[arg2.field1797] < 0) {
                    arg2.field1786.method905(-1);
                }
                arg0 = arg2.field1801 / var4;
            }
        }
        arg2.field1786.method111(arg0);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "()Lda;")
    public final class23 method135() {
        field3296++;
        class72 var1;
        do {
            var1 = (class72) this.field3293.method983(18485);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1786 == null);
        return var1.field1786;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[B)Lod;")
    public static final class101 method1110(int arg0, byte[] arg1) {
        field3282++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -21408) {
            field3287 = null;
        }
        class101 var2 = new class101(arg1, class68.field1686, class70.field1732, class62.field1503, class56.field1412, class134.field3050, class141.field3221);
        class80.method610(true);
        return var2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()I")
    public final int method134() {
        field3291++;
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II[IILkc;I)V")
    private final void method1111(int arg0, int arg1, int[] arg2, int arg3, class72 arg4, int arg5) {
        if ((this.field3283.field393[arg4.field1773] & 0x4) != 0 && arg4.field1774 < 0) {
            int var7 = this.field3283.field424[arg4.field1773] / class134.field3037;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field1801) / var7;
                if (var8 > arg5) {
                    arg4.field1801 += arg5 * var7;
                    break;
                }
                arg4.field1786.method109(arg2, arg0, var8);
                arg5 -= var8;
                arg4.field1801 += var7 * var8 - 1048576;
                arg0 += var8;
                int var9 = class134.field3037 / 100;
                int var10 = 262144 / var7;
                class119 var11 = arg4.field1786;
                if (var10 < var9) {
                    var9 = var10;
                }
                if (this.field3283.field419[arg4.field1773] == 0) {
                    arg4.field1786 = class119.method902(arg4.field1789, var11.method925(), var11.method891(), var11.method914());
                } else {
                    arg4.field1786 = class119.method902(arg4.field1789, var11.method925(), 0, var11.method914());
                    this.field3283.method130(arg4.field1793.field3225[arg4.field1797] < 0, (byte) 47, arg4);
                    arg4.field1786.method915(var9, var11.method891());
                }
                if (arg4.field1793.field3225[arg4.field1797] < 0) {
                    arg4.field1786.method905(-1);
                }
                var11.method927(var9);
                var11.method109(arg2, arg0, arg1 - arg0);
                if (var11.method921()) {
                    this.field3298.method484(var11);
                }
            }
        }
        if (arg3 == 0) {
            arg4.field1786.method109(arg2, arg0, arg5);
            field3290++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)Llc;")
    public static final class79 method1112(boolean arg0) {
        field3295++;
        try {
            if (!arg0) {
                method1108(93);
            }
            return (class79) Class.forName("p").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lbf;)V")
    public class144(class14 arg0) {
        this.field3283 = arg0;
    }
}
