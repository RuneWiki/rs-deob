import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class281 {

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Lfk;")
    private class144 field4835 = new class144(256);

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Lfk;")
    private class144 field4836 = new class144(256);

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Lgb;")
    private class213 field4826;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lgb;")
    private class213 field4825;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lmi;")
    public static class12 field4821 = new class12();

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Loh;")
    public static class258 field4834 = class153.method1046(":trade:", 106);

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Z")
    public static boolean field4830 = false;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Loh;")
    public static class258 field4832 = class153.method1046("Verbindung abgebrochen)3", 103);

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lmb;")
    public static class172 field4831 = new class172(5);

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "Loh;")
    public static class258 field4837 = class153.method1046(" zuerst von Ihrer Ignorieren)2Liste(Q", 86);

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lhg;")
    public static class216 field4829;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "[Lkl;")
    public static class65[] field4839;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB[I)Lbd;", line = 13)
    public final class198 method1971(int arg0, byte arg1, int[] arg2) {
        if (arg1 >= -120) {
            return (class198) null;
        }
        field4828++;
        if (this.field4826.method1444(true) == 1) {
            return this.method1972(true, arg0, arg2, 0);
        } else if (this.field4826.method1435((byte) -21, arg0) == 1) {
            return this.method1972(true, 0, arg2, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI[II)Lbd;", line = 35)
    private final class198 method1972(boolean arg0, int arg1, int[] arg2, int arg3) {
        field4833++;
        if (!arg0) {
            return (class198) null;
        }
        int var5 = (arg3 << 4 & 0xFFF1 | arg3 >>> 12) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class198 var9 = (class198) this.field4836.method986(var7, 0);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class309 var10 = class309.method2152(this.field4826, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class198 var11 = var10.method2149();
            this.field4836.method984((byte) 95, var11, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field3475.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 78)
    public static final void method1973(int arg0) {
        for (class182 var1 = (class182) class277.field4769.method83(-128); var1 != null; var1 = (class182) class277.field4769.method87((byte) -80)) {
            class209 var2 = var1.field3258;
            if (class272.field4704 != var2.field3595 || var2.field3599) {
                var1.method1054((byte) 121);
            } else if (var2.field3601 <= class202.field3498) {
                var2.method1378(class251.field4329, (byte) 121);
                if (var2.field3599) {
                    var1.method1054((byte) 102);
                } else {
                    class317.method2181(var2.field3595, var2.field3600, var2.field3593, var2.field3604, 60, var2, 0, -1L, false);
                }
            }
        }
        field4824++;
        if (arg0 != 60) {
            field4831 = (class172) null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([IIIB)Lbd;", line = 114)
    private final class198 method1974(int[] arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg2 ^ (arg1 >>> 12 | (arg1 & 0xC0000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        field4823++;
        class198 var9 = (class198) this.field4836.method986(var7, 0);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class288 var10 = (class288) this.field4835.method986(var7, 0);
            if (var10 == null) {
                var10 = class288.method2027(this.field4825, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field4835.method984((byte) -93, var10, var7);
            }
            class198 var11 = var10.method2034(arg0);
            int var12 = -60 / ((arg3 - 40) / 35);
            if (var11 == null) {
                return null;
            } else {
                var10.method1054((byte) 118);
                this.field4836.method984((byte) 87, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II[I)Lbd;", line = 167)
    public final class198 method1975(int arg0, int arg1, int[] arg2) {
        field4827++;
        if (this.field4825.method1444(true) == 1) {
            return this.method1974(arg2, 0, arg0, (byte) 116);
        } else if (this.field4825.method1435((byte) -21, arg0) == 1) {
            return this.method1974(arg2, arg0, 0, (byte) 78);
        } else {
            if (arg1 != 0) {
                method1973(12);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lgb;Lgb;)V", line = 228)
    public class281(class213 arg0, class213 arg1) {
        this.field4826 = arg0;
        this.field4825 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 207)
    public static void method1976(int arg0) {
        field4834 = null;
        if (arg0 > -42) {
            method1973(-73);
        }
        field4837 = null;
        field4839 = null;
        field4821 = null;
        field4832 = null;
        field4831 = null;
        field4829 = null;
    }
}
