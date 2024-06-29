import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Luf;")
    private class145 field6 = new class145(256);

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Luf;")
    private class145 field17 = new class145(256);

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lfd;")
    private class40 field3;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lfd;")
    private class40 field7;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    public static int[] field5 = new int[32];

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field13 = 0;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lje;")
    private static class67 field12 = class85.method592(255, "Welcome to RuneScape");

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field8 = 2;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lje;")
    public static class67 field18 = field12;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Lje;")
    private static class67 field22;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lje;")
    public static class67 field23;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Lna;")
    public static class91 field19;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I")
    public static final int method5(int arg0, int arg1, int arg2) {
        field16++;
        long var3 = (long) ((arg0 << 16) + arg2);
        if (class144.field3327 != null && class144.field3327.field300 == var3) {
            if (arg1 != 32) {
                field12 = null;
            }
            return field19.field2043 * 99 / (field19.field1991.length - class144.field3327.field2706) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[I)Ls;")
    public final class125 method6(int arg0, int arg1, int[] arg2) {
        field2++;
        if (this.field7.method250((byte) -103) == 1) {
            return this.method10((byte) 71, 0, arg2, arg1);
        } else if (this.field7.method263(arg1, (byte) 126) == 1) {
            return this.method10((byte) 18, arg1, arg2, 0);
        } else {
            if (arg0 != -2007571668) {
                method5(20, -125, 88);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method7(int arg0) {
        field19 = null;
        field12 = null;
        if (arg0 != -2) {
            field19 = null;
        }
        field5 = null;
        field23 = null;
        field18 = null;
        field22 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II[I)Ls;")
    public final class125 method8(int arg0, int arg1, int[] arg2) {
        field10++;
        if (arg1 != 0) {
            method5(3, -8, 101);
        }
        if (this.field3.method250((byte) -124) == 1) {
            return this.method9(arg0, arg2, 0, -127);
        } else if (this.field3.method263(arg0, (byte) 115) == 1) {
            return this.method9(0, arg2, arg0, arg1 - 84);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[III)Ls;")
    private final class125 method9(int arg0, int[] arg1, int arg2, int arg3) {
        field4++;
        if (arg3 >= -1) {
            return null;
        }
        int var5 = arg0 ^ ((arg2 & 0x70000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class125 var9 = (class125) this.field17.method1119(28254, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class124 var10 = class124.method967(this.field3, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class125 var11 = var10.method968();
            this.field17.method1115(var7, var11, 1);
            if (arg1 != null) {
                arg1[0] -= var11.field2757.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI[II)Ls;")
    private final class125 method10(byte arg0, int arg1, int[] arg2, int arg3) {
        int var5 = (arg1 >>> 12 | (arg1 & 0xFFF) << 4) ^ arg3;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class125 var9 = (class125) this.field17.method1119(28254, var7);
        int var10 = -32 % ((-arg0 - 53) / 53);
        field15++;
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class110 var11 = (class110) this.field6.method1119(28254, var7);
            if (var11 == null) {
                var11 = class110.method869(this.field7, arg1, arg3);
                if (var11 == null) {
                    return null;
                }
                this.field6.method1115(var7, var11, 1);
            }
            class125 var12 = var11.method866(arg2);
            if (var12 == null) {
                return null;
            } else {
                var11.method115(26851);
                this.field17.method1115(var7, var12, 1);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILua;)V")
    public static final void method11(byte arg0, int arg1, class140 arg2) {
        if (arg0 <= 18) {
            return;
        }
        field11++;
        if (class25.field456 == null) {
            class92.method679(255, 0, (byte) 0, 255, null, -1772316688, true);
            class97.field2176[arg1] = arg2;
        } else {
            class25.field456.field2043 = arg1 * 8 + 5;
            int var3 = class25.field456.method631(-106);
            int var4 = class25.field456.method631(-53);
            arg2.method1064(var3, var4, false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lfd;Lfd;)V")
    public class2(class40 arg0, class40 arg1) {
        this.field3 = arg0;
        this.field7 = arg1;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5[var1] = var0 - 1;
            var0 += var0;
        }
        field21 = 99;
        field22 = class85.method592(255, "Please wait )2 attempting to reestablish");
        field23 = field22;
    }
}
