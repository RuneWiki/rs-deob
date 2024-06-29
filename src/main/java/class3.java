import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field21 = -1;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lrd;")
    public static class114 field28 = class84.method656("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", (byte) 121);

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lrd;")
    private static class114 field22 = class84.method656("green:", (byte) 123);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[[[I")
    public static int[][][] field18 = new int[4][13][13];

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lrd;")
    public static class114 field29 = field22;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lrd;")
    public static class114 field37 = class84.method656(":duelreq:", (byte) 124);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lrd;")
    public static class114 field27 = class84.method656("@yel@", (byte) 114);

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lrd;")
    private static class114 field39 = class84.method656("Invalid username or password)3", (byte) 120);

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lrd;")
    public static class114 field32 = field39;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lrd;")
    private static class114 field38 = class84.method656("Your account has been disabled)3", (byte) 119);

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lrd;")
    public static class114 field35 = field38;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Loa;")
    public static class93 field34;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method9(int arg0) {
        field32 = null;
        field37 = null;
        field34 = null;
        field18 = null;
        field22 = null;
        field29 = null;
        field38 = null;
        field27 = null;
        field35 = null;
        field28 = null;
        if (arg0 != 29338) {
            method12(true);
        }
        field39 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILrd;IBILrd;I)V")
    public static final void method10(int arg0, class114 arg1, int arg2, byte arg3, int arg4, class114 arg5, int arg6) {
        field31++;
        if (class60.field1263 < 500) {
            if (arg1.method854(-29348) > 0) {
                class123.field2878[class60.field1263] = class101.method786((byte) 127, new class114[] { arg5, class64.field1374, arg1 });
            } else {
                class123.field2878[class60.field1263] = arg5;
            }
            class117.field2734[class60.field1263] = arg4;
            class103.field2415[class60.field1263] = arg6;
            class72.field1594[class60.field1263] = arg0;
            class118.field2767[class60.field1263] = arg2;
            class60.field1263++;
        }
        if (arg3 < 118) {
            field18 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lpb;I)V")
    public static final void method11(class100 arg0, int arg1) {
        field20++;
        class56.field1173 = arg0;
        if (arg1 >= -125) {
            field35 = null;
        }
        class122.field2860 = class56.field1173.method768(16, false);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static final void method12(boolean arg0) {
        class58.field1207.method528(-1926);
        if (arg0) {
            field34 = null;
        }
        field33++;
        class89.field1977.method722(0, 0);
        class42.field866 = class134.method1103(class42.field866);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static final void method13(byte arg0) {
        class11.field204.method8(15);
        field30++;
        for (int var1 = 0; var1 < 32; var1++) {
            class32.field659[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 != -16) {
            return;
        }
        while (var2 < 32) {
            class24.field467[var2] = 0L;
            var2++;
        }
        class79.field1800 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class3() {
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lab;)V")
    public class3(class3 arg0) {
        this.field25 = arg0.field25;
        this.field36 = arg0.field36;
        this.field24 = arg0.field24;
        this.field26 = arg0.field26;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static final void method14(int arg0) {
        field19++;
        if (class14.field312 != 0 || (class13.field285 != null || arg0 != 0)) {
            return;
        }
        int var1 = client.field417;
        if (class125.field2975 && class142.field3392 >= 516 && class118.field2758 >= 160 && class142.field3392 <= 765 && class118.field2758 <= 205) {
            var1 = 0;
        }
        if (!class116.field2714) {
            if (var1 == 1 && class60.field1263 > 0) {
                int var12 = class117.field2734[class60.field1263 - 1];
                if (var12 == 37 || var12 == 10 || var12 == 1 || var12 == 48 || var12 == 36 || var12 == 28 || var12 == 50 || var12 == 6 || var12 == 31 || var12 == 57 || var12 == 23 || var12 == 1006) {
                    int var13 = class72.field1594[class60.field1263 - 1];
                    int var14 = class118.field2767[class60.field1263 - 1];
                    class90 var15 = class14.method115(65535, var14);
                    if (class104.method798((byte) 28, class39.method278(var15, 1572721824)) || class1.method4(class39.method278(var15, 1572721824), 1073340130)) {
                        class14.field312 = 2;
                        class86.field1942 = 0;
                        class107.field2479 = false;
                        if (var14 >> 16 == class117.field2747) {
                            class14.field312 = 1;
                        }
                        if (var14 >> 16 == class123.field2899) {
                            class14.field312 = 3;
                        }
                        class74.field1702 = var14;
                        class50.field1051 = class118.field2758;
                        class14.field307 = class142.field3392;
                        class1.field13 = var13;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class5.field73 == 1 || class5.method50(class60.field1263 - 1, true)) && class60.field1263 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class60.field1263 > 0) {
                class24.method170(class60.field1263 - 1, -3);
            }
            if (var1 != 2 || class60.field1263 <= 0) {
                return;
            }
            class109.method829(arg0 - 106);
            return;
        }
        if (var1 != 1) {
            int var2 = class100.field2289;
            int var3 = class75.field1741;
            if (class14.field304 == 0) {
                var3 -= 4;
                var2 -= 4;
            }
            if (class14.field304 == 1) {
                var3 -= 205;
                var2 -= 553;
            }
            if (class14.field304 == 2) {
                var3 -= 357;
                var2 -= 17;
            }
            if (var2 < class131.field3165 - 10 || class131.field3165 + class132.field3190 + 10 < var2 || var3 < class86.field1930 - 10 || var3 > class86.field1930 + class143.field3414 + 10) {
                if (class14.field304 == 2) {
                    class140.field3335 = true;
                }
                class116.field2714 = false;
                if (class14.field304 == 1) {
                    class24.field460 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class86.field1930;
        int var5 = class131.field3165;
        int var6 = class132.field3190;
        int var7 = class142.field3392;
        int var8 = class118.field2758;
        if (class14.field304 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (class14.field304 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        int var9 = -1;
        if (class14.field304 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var10 = 0; var10 < class60.field1263; var10++) {
            int var11 = (class60.field1263 - var10 - 1) * 15 + var4 + 31;
            if (var7 > var5 && var7 < var5 + var6 && var8 > var11 - 13 && var11 + 3 > var8) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class24.method170(var9, -3);
        }
        if (class14.field304 == 1) {
            class24.field460 = true;
        }
        class116.field2714 = false;
        if (class14.field304 == 2) {
            class140.field3335 = true;
            return;
        }
    }
}
