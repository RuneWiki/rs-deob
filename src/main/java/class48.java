import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class48 {

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lge;")
    private class69 field1031 = new class69(256);

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lge;")
    private class69 field1042 = new class69(256);

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Lfa;")
    private class239 field1034;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lfa;")
    private class239 field1032;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Lp;")
    public static class272 field1037 = new class272();

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Lpj;")
    public static class237 field1039 = class33.method353("scrollen:", 66);

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "[I")
    public static int[] field1040 = new int[5];

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Lfa;")
    public static class239 field1038;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI[II)Lkc;")
    private final class266 method439(byte arg0, int arg1, int[] arg2, int arg3) {
        field1041++;
        int var5 = arg1 ^ ((arg3 & 0xE0000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        if (arg0 != 39) {
            return null;
        }
        long var7 = (long) var6;
        class266 var9 = (class266) this.field1042.method568(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class60 var10 = class60.method515(this.field1032, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class266 var11 = var10.method517();
            this.field1042.method562(var11, var7, (byte) 56);
            if (arg2 != null) {
                arg2[0] -= var11.field4533.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB[II)Lkc;")
    private final class266 method440(int arg0, byte arg1, int[] arg2, int arg3) {
        field1025++;
        int var5 = (arg0 >>> 12 | (arg0 & 0xF0000FFF) << 4) ^ arg3;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class266 var9 = (class266) this.field1042.method568(var7, -1);
        if (var9 != null) {
            return var9;
        }
        if (arg1 != -91) {
            this.method440(64, (byte) 40, (int[]) null, 81);
        }
        if (arg2 != null && arg2[0] <= 0) {
            return null;
        }
        class267 var10 = (class267) this.field1031.method568(var7, arg1 ^ 0x5A);
        if (var10 == null) {
            var10 = class267.method1779(this.field1034, arg0, arg3);
            if (var10 == null) {
                return null;
            }
            this.field1031.method562(var10, var7, (byte) 56);
        }
        class266 var11 = var10.method1773(arg2);
        if (var11 == null) {
            return null;
        } else {
            var10.method629(0);
            this.field1042.method562(var11, var7, (byte) 56);
            return var11;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI[I)Lkc;")
    public final class266 method441(byte arg0, int arg1, int[] arg2) {
        if (arg0 != -89) {
            this.method441((byte) -123, -118, (int[]) null);
        }
        field1029++;
        if (this.field1034.method1640(-1) == 1) {
            return this.method440(0, (byte) -91, arg2, arg1);
        } else if (this.field1034.method1638(arg1, (byte) -73) == 1) {
            return this.method440(arg1, (byte) -91, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static final void method442(int arg0) {
        if (arg0 != -36) {
            field1040 = null;
        }
        class190.field3304.method934((byte) 62);
        field1027++;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static final void method443(int arg0) {
        field1028++;
        class206.field3510.method942(0);
        class112.field1955.method942(0);
        if (arg0 != 7) {
            method442(120);
        }
        class174.field3043.method942(0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Lde;")
    public static final class107 method444(int arg0, int arg1) {
        field1030++;
        int var2 = 83 / ((-arg0 - 5) / 63);
        if (arg1 == 0) {
            return new class111();
        } else if (arg1 == 1) {
            return new class26();
        } else if (arg1 == 2) {
            return new class205();
        } else if (arg1 == 3) {
            return new class134();
        } else if (arg1 == 4) {
            return new class130();
        } else if (arg1 == 5) {
            return new class208();
        } else if (arg1 == 6) {
            return new class216();
        } else if (arg1 == 7) {
            return new class245();
        } else if (arg1 == 8) {
            return new class87();
        } else if (arg1 == 9) {
            return new class209();
        } else if (arg1 == 10) {
            return new class56();
        } else if (arg1 == 11) {
            return new class169();
        } else if (arg1 == 12) {
            return new class102();
        } else if (arg1 == 13) {
            return new class14();
        } else if (arg1 == 14) {
            return new class148();
        } else if (arg1 == 15) {
            return new class119();
        } else if (arg1 == 16) {
            return new class125();
        } else if (arg1 == 17) {
            return new class199();
        } else if (arg1 == 18) {
            return new class184();
        } else if (arg1 == 19) {
            return new class164();
        } else if (arg1 == 20) {
            return new class262();
        } else if (arg1 == 21) {
            return new class99();
        } else if (arg1 == 22) {
            return new class158();
        } else if (arg1 == 23) {
            return new class240();
        } else if (arg1 == 24) {
            return new class112();
        } else if (arg1 == 25) {
            return new class127();
        } else if (arg1 == 26) {
            return new class21();
        } else if (arg1 == 27) {
            return new class74();
        } else if (arg1 == 28) {
            return new class177();
        } else if (arg1 == 29) {
            return new class118();
        } else if (arg1 == 30) {
            return new class234();
        } else if (arg1 == 31) {
            return new class76();
        } else if (arg1 == 32) {
            return new class13();
        } else if (arg1 == 33) {
            return new class147();
        } else if (arg1 == 34) {
            return new class182();
        } else if (arg1 == 35) {
            return new class142();
        } else if (arg1 == 36) {
            return new class188();
        } else if (arg1 == 37) {
            return new class113();
        } else if (arg1 == 38) {
            return new class163();
        } else if (arg1 == 39) {
            return new class123();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V")
    public static final void method445(int arg0, int arg1) {
        field1035++;
        class131.field2298.method939(arg1, 1);
        if (arg0 != -38) {
            method447(-107);
        }
        class68.field1332.method939(arg1, 1);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([IBI)Lkc;")
    public final class266 method446(int[] arg0, byte arg1, int arg2) {
        field1036++;
        if (this.field1032.method1640(-1) == 1) {
            return this.method439((byte) 39, arg2, arg0, 0);
        } else if (this.field1032.method1638(arg2, (byte) -73) == 1) {
            return this.method439((byte) 39, 0, arg0, arg2);
        } else {
            int var4 = 120 % ((arg1 - 80) / 36);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public static void method447(int arg0) {
        field1038 = null;
        if (arg0 == -4070) {
            field1039 = null;
            field1040 = null;
            field1037 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lfa;Lfa;)V")
    public class48(class239 arg0, class239 arg1) {
        this.field1034 = arg1;
        this.field1032 = arg0;
    }
}
