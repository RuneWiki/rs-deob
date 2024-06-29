import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class225 extends class226 implements class171 {

    @OriginalMember(owner = "client!j", name = "J", descriptor = "Llc;")
    public class444 field2851;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "Z")
    private boolean field2862;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field2856 = 0;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "Lhq;")
    public static class365 field2845 = new class365(64);

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field2861 = 0;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "Lcq;")
    public static class72 field2860 = new class72("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "[I")
    public static int[] field2838;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "[[[I")
    public static int[][][] field2848;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method412(int arg0) {
        ++field2842;
        return arg0 != 18942 ? false : this.field2851.method2755(-1);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Z", line = 16)
    public final boolean method129(int arg0) {
        ++field2837;
        return arg0 != 3652 ? false : false;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 27)
    public static final void method1385(int arg0) {
        class365 var1 = class321.field4308;
        synchronized (class321.field4308) {
            class321.field4308.method2298(0);
        }
        ++field2854;
        if (arg0 != 24814) {
            field2838 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Luo;B)Lkj;", line = 41)
    public final class175 method130(class118 arg0, byte arg1) {
        ++field2857;
        class386 var3 = this.field2851.method2746(1024, arg0, super.field2866, super.field2865, true, false, false);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 42 / ((arg1 - 11) / 37);
            class450 var5 = arg0.method742();
            var5.method929(super.field2865, super.field2872, super.field2866);
            class175 var6 = null;
            if (this.field2862) {
                var6 = class68.method392((byte) 87, 1);
            }
            if (this.field2851.field6131 != null) {
                class291 var7 = this.field2851.field6131.method404();
                arg0.method729(var3, var7, var5, var6 != null ? var6.field2030[0] : null, 0);
            } else {
                var3.method1441(var5, var6 == null ? null : var6.field2030[0], 0);
            }
            this.field2851.method2754((byte) -32, arg0, var3, super.field2866 >> 7, super.field2865 >> 7, true, super.field2866 >> 7, super.field2865 >> 7);
            return var6;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Luo;B)V", line = 77)
    public final void method411(class118 arg0, byte arg1) {
        if (arg1 != 88) {
            this.field2862 = true;
        }
        ++field2853;
        this.field2851.method2747(arg0, 13694);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)I", line = 90)
    public final int method420(byte arg0) {
        ++field2859;
        int var2 = -121 % ((arg0 - -21) / 44);
        return this.field2851.field6163;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Luo;B)V", line = 100)
    public final void method422(class118 arg0, byte arg1) {
        if (arg1 != -7) {
            this.method137((class118) null, 93, -58, 75, true, (byte) 88, (class22) null);
        }
        ++field2850;
        this.field2851.method2750(arg1 + -108, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Luo;IIZ)Z", line = 112)
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        ++field2849;
        class386 var5 = this.field2851.method2746(65536, arg0, super.field2866, super.field2865, false, !arg3, false);
        if (!arg3) {
            field2860 = null;
        }
        if (var5 == null) {
            return false;
        } else {
            class450 var6 = arg0.method742();
            var6.method929(super.field2865, super.field2872, super.field2866);
            return var5.method1474(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)I", line = 135)
    public final int method417(byte arg0) {
        if (arg0 != -116) {
            return 15;
        } else {
            ++field2852;
            return this.field2851.field6136;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)I", line = 147)
    public final int method409(int arg0) {
        if (arg0 != -50) {
            this.field2851 = null;
        }
        ++field2839;
        return this.field2851.field6132;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLuo;)V", line = 159)
    public final void method138(byte arg0, class118 arg1) {
        ++field2843;
        if (arg0 < 78) {
            field2861 = -9;
        }
        class386 var3 = this.field2851.method2746(131072, arg1, super.field2866, super.field2865, true, false, true);
        if (var3 != null) {
            this.field2851.method2754((byte) -32, arg1, var3, super.field2866 >> 7, super.field2865 >> 7, false, super.field2866 >> 7, super.field2865 >> 7);
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V", line = 179)
    public static final void method1386(byte arg0) {
        if (arg0 == 6) {
            ++field2840;
            class365 var1 = class242.field3196;
            synchronized (class242.field3196) {
                class242.field3196.method2298(0);
            }
            class365 var2 = class231.field3036;
            synchronized (class231.field3036) {
                class231.field3036.method2298(arg0 ^ 6);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 197)
    public final void method423(int arg0) {
        if (arg0 == 22486) {
            ++field2841;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Lvq;", line = 207)
    public static final class307 method1387(int arg0, byte arg1) {
        ++field2846;
        class365 var2 = class168.field1960;
        class307 var3;
        synchronized (class168.field1960) {
            var3 = (class307) class168.field1960.method2295((long) arg0, (byte) 74);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class244.field3242.method1794(5860, class215.method1315((byte) -121, arg0), class234.method1510(arg0, 95));
            class307 var5 = new class307();
            var5.field4110 = arg0;
            if (var4 != null) {
                var5.method1948(-110, new class242(var4));
            }
            int var6 = -99 / ((arg1 - -63) / 56);
            var5.method1945((byte) 77);
            class365 var7 = class168.field1960;
            synchronized (class168.field1960) {
                class168.field1960.method2294(var5, (byte) 78, (long) arg0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(B)V", line = 238)
    public static void method1388(byte arg0) {
        field2860 = null;
        field2848 = null;
        field2838 = null;
        if (arg0 < 31) {
            method1387(-75, (byte) -38);
        }
        field2845 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Luo;ILwo;Lwo;)V", line = 251)
    public static final void method1389(class118 arg0, int arg1, class285 arg2, class285 arg3) {
        class207.field2509 = class181.method1132(class231.field3042, 0, (byte) 45, arg3);
        ++field2847;
        class363.field4933 = arg0.method747(class207.field2509, class132.method853(arg2, class231.field3042, 0), true);
        class236.field3101 = class181.method1132(class12.field153, 0, (byte) 45, arg3);
        class55.field636 = arg0.method747(class236.field3101, class132.method853(arg2, class12.field153, 0), true);
        class213.field2611 = class181.method1132(class191.field2238, 0, (byte) 45, arg3);
        if (arg1 < 10) {
            field2845 = null;
        }
        class210.field2544 = arg0.method747(class213.field2611, class132.method853(arg2, class191.field2238, 0), true);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Luo;Lnd;IIIIIIIZI)V", line = 269)
    public class225(class118 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class70.method424((byte) 35, arg3, arg2));
        this.field2851 = new class444(arg0, arg1, arg2, arg3, arg4, arg5, super.field2865, super.field2866, arg9, arg10);
        this.field2862 = ~arg1.field6235 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Luo;IIIZBLpc;)V", line = 281)
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        ++field2844;
        if (arg5 >= -115) {
            field2845 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V", line = 297)
    public final void method140(int arg0) {
        if (arg0 >= -24) {
            this.field2851 = null;
        }
        ++field2855;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Luo;II)Lge;", line = 308)
    public final class386 method419(class118 arg0, int arg1, int arg2) {
        ++field2858;
        if (arg1 != -20264) {
            this.method417((byte) -98);
        }
        return this.field2851.method2746(arg2, arg0, 0, 0, false, false, false);
    }
}
