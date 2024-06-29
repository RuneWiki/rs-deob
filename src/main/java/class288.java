import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class288 {

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "Lka;")
    private class473 field3906 = new class473(128);

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "Lka;")
    public class473 field3908 = new class473(64);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "Ldk;")
    private class421 field3891;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "Ldk;")
    public class421 field3900;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Lhi;")
    public static class45 field3897 = new class45(68, 2);

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "[[I")
    public static int[][] field3904 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "Lhi;")
    public static class45 field3902 = new class45(72, 3);

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public static int field3905;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iv", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field3909;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "[I")
    public static int[] field3907;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public final void method1650(boolean arg0) {
        class473 var2 = this.field3906;
        synchronized (this.field3906) {
            this.field3906.method2774((byte) 5);
        }
        field3899++;
        class473 var3 = this.field3908;
        synchronized (this.field3908) {
            this.field3908.method2774((byte) -76);
            if (!arg0) {
                this.method1650(false);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLcd;)V")
    public static final void method1651(byte arg0, class65 arg1) {
        field3898++;
        if (class103.field1632 == null) {
            return;
        }
        class303 var2 = null;
        if (arg1.field943 == 0) {
            var2 = (class303) class191.method1267(arg1.field935, arg1.field931, arg1.field929);
        }
        if (arg1.field943 == 1) {
            var2 = (class303) class506.method3004(arg1.field935, arg1.field931, arg1.field929);
        }
        if (arg1.field943 == 2) {
            var2 = (class303) class377.method2254(arg1.field935, arg1.field931, arg1.field929, field3909 == null ? (field3909 = method1661("bn")) : field3909);
        }
        if (arg1.field943 == 3) {
            var2 = (class303) class126.method913(arg1.field935, arg1.field931, arg1.field929);
        }
        if (arg0 != 37) {
            method1653(56, (byte) -54);
        }
        if (var2 == null) {
            arg1.field932 = 0;
            arg1.field933 = -1;
            arg1.field928 = 0;
        } else {
            arg1.field933 = var2.method170((byte) -60);
            arg1.field932 = var2.method159(125);
            arg1.field928 = var2.method157((byte) -22);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3896++;
        if (class519.field7633 <= arg6 && arg6 <= class375.field5387 && class519.field7633 <= arg9 && arg9 <= class375.field5387 && class519.field7633 <= arg4 && class375.field5387 >= arg4 && class519.field7633 <= arg7 && class375.field5387 >= arg7 && arg1 >= class23.field320 && arg1 <= class233.field3241 && arg0 >= class23.field320 && arg0 <= class233.field3241 && class23.field320 <= arg3 && arg3 <= class233.field3241 && class23.field320 <= arg8 && class233.field3241 >= arg8) {
            class287.method1647(arg5, arg3, arg6, arg0, arg7, false, arg9, arg4, arg1, arg8);
        } else {
            class29.method212(arg5, arg6, arg1, arg9, arg8, arg7, arg0, (byte) 106, arg3, arg4);
        }
        if (arg2 != 64) {
            method1652(-49, -17, -74, 10, -45, -45, 103, 61, 39, 52);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Z")
    public static final boolean method1653(int arg0, byte arg1) {
        field3905++;
        if (arg0 == 15 || arg0 == 17 || arg0 == 46 || arg0 == 5 || arg0 == 1007) {
            return true;
        } else if (arg1 == -61) {
            return arg0 == 2 || arg0 == 1009;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZI)V")
    public final void method1654(int arg0, boolean arg1, int arg2) {
        this.field3906 = new class473(arg2);
        if (!arg1) {
            this.method1658(44);
        }
        field3895++;
        this.field3908 = new class473(arg0);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(IB)Lfk;")
    public final class92 method1655(int arg0, byte arg1) {
        field3903++;
        class473 var3 = this.field3906;
        class92 var4;
        synchronized (this.field3906) {
            var4 = (class92) this.field3906.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field3891;
        byte[] var6;
        synchronized (this.field3891) {
            var6 = this.field3891.method2512(36, (byte) -93, arg0);
        }
        class92 var7 = new class92();
        var7.field1501 = arg0;
        var7.field1503 = this;
        if (var6 != null) {
            var7.method756((byte) 89, new class319(var6));
        }
        var7.method751(-54);
        class473 var8 = this.field3906;
        synchronized (this.field3906) {
            this.field3906.method2777(-1025, var7, (long) arg0);
        }
        return arg1 > -112 ? null : var7;
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(IB)V")
    public final void method1656(int arg0, byte arg1) {
        class473 var3 = this.field3906;
        synchronized (this.field3906) {
            this.field3906.method2779(14896, arg0);
        }
        field3901++;
        class473 var4 = this.field3908;
        synchronized (this.field3908) {
            this.field3908.method2779(14896, arg0);
            if (arg1 != 112) {
                method1660(32, -50, 98, -35, -26, 89, -74);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static final void method1657(int arg0) {
        if (arg0 != -3671) {
            field3897 = null;
        }
        class49.field691.method1583(arg0 ^ 0xFFFFF1D8);
        field3894++;
        class248.field3367.method3149(arg0 + 68951);
        class50.field725.method3149(65280);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
    public final void method1658(int arg0) {
        field3892++;
        if (arg0 != -11711) {
            this.method1654(-33, true, -74);
        }
        class473 var2 = this.field3906;
        synchronized (this.field3906) {
            this.field3906.method2764(-769);
        }
        class473 var3 = this.field3908;
        synchronized (this.field3908) {
            this.field3908.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
    public static void method1659(byte arg0) {
        field3904 = null;
        field3907 = null;
        field3897 = null;
        field3902 = null;
        int var1 = 110 % ((arg0 - 52) / 53);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class259 var7 = (class259) class415.field6024.method2600((byte) -126); var7 != null; var7 = (class259) class415.field6024.method2601(110)) {
            if (class28.field417 >= var7.field3518) {
                var7.method2861((byte) 47);
            } else {
                class234.method1429((byte) -84, arg3, var7.field3522, arg4, arg5 >> 1, (var7.field3514 << 7) + 64, (var7.field3510 << 7) + 64, arg6 >> 1, var7.field3519 * 2);
                class108.field1751.method1772(var7.field3520 | 0xFF000000, var7.field3511, -89, 0, class385.field5520[1] + arg0, arg1 - -class385.field5520[0]);
            }
        }
        if (arg2 == -64) {
            field3893++;
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lad;ILdk;Ldk;)V")
    public class288(class12 arg0, int arg1, class421 arg2, class421 arg3) {
        this.field3891 = arg2;
        this.field3900 = arg3;
        this.field3891.method2509(0, 36);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1661(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
