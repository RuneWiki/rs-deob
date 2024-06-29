import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class14 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    private int field166 = 128;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    private int field177 = 128;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    private int field174 = 0;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Z")
    public boolean field185 = false;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    private int field183 = 0;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    private int field189 = 0;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public int field170 = -1;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field167 = 0;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "J")
    public static long field168 = 0L;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Le;")
    public static class191 field171 = null;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Le;")
    public static class191 field188 = class54.method368("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 2047);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "[S")
    private short[] field172;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[S")
    private short[] field173;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "[S")
    private short[] field184;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "[S")
    private short[] field191;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "[[[B")
    public static byte[][][] field175;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static final void method92(byte arg0) {
        field180++;
        if (arg0 > -70) {
            field188 = null;
        }
        if (class247.field4378.toLowerCase().indexOf("microsoft") != -1) {
            class267.field4717[191] = 73;
            class267.field4717[222] = 59;
            class267.field4717[186] = 57;
            class267.field4717[190] = 72;
            class267.field4717[189] = 26;
            class267.field4717[223] = 28;
            class267.field4717[219] = 42;
            class267.field4717[220] = 74;
            class267.field4717[192] = 58;
            class267.field4717[221] = 43;
            class267.field4717[188] = 71;
            class267.field4717[187] = 27;
            return;
        }
        if (class247.field4386 == null) {
            class267.field4717[222] = 59;
            class267.field4717[192] = 58;
        } else {
            class267.field4717[222] = 58;
            class267.field4717[192] = 28;
            class267.field4717[520] = 59;
        }
        class267.field4717[91] = 42;
        class267.field4717[46] = 72;
        class267.field4717[93] = 43;
        class267.field4717[92] = 74;
        class267.field4717[44] = 71;
        class267.field4717[47] = 73;
        class267.field4717[45] = 26;
        class267.field4717[59] = 57;
        class267.field4717[61] = 27;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method93(int arg0) {
        field175 = null;
        field188 = null;
        if (arg0 != -19551) {
            field175 = null;
        }
        field171 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILji;)V")
    public final void method94(int arg0, class225 arg1) {
        if (arg0 != 2228) {
            method93(-103);
        }
        field190++;
        while (true) {
            int var3 = arg1.method1580(arg0 - 2337);
            if (var3 == 0) {
                return;
            }
            this.method95(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLji;I)V")
    private final void method95(boolean arg0, class225 arg1, int arg2) {
        if (!arg0) {
            field171 = null;
        }
        if (arg2 == 1) {
            this.field182 = arg1.method1593(arg0);
        } else if (arg2 == 2) {
            this.field170 = arg1.method1593(true);
        } else if (arg2 == 4) {
            this.field166 = arg1.method1593(true);
        } else if (arg2 == 5) {
            this.field177 = arg1.method1593(true);
        } else if (arg2 == 6) {
            this.field189 = arg1.method1593(true);
        } else if (arg2 == 7) {
            this.field174 = arg1.method1580(-57);
        } else if (arg2 == 8) {
            this.field183 = arg1.method1580(-25);
        } else if (arg2 == 9) {
            this.field185 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1580(-37);
            this.field184 = new short[var6];
            this.field191 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field191[var7] = (short) arg1.method1593(arg0);
                this.field184[var7] = (short) arg1.method1593(true);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1580(-59);
            this.field172 = new short[var4];
            this.field173 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field173[var5] = (short) arg1.method1593(arg0);
                this.field172[var5] = (short) arg1.method1593(arg0);
            }
        }
        field181++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)Lee;")
    public final class251 method96(boolean arg0, int arg1) {
        field186++;
        class251 var3 = (class251) class248.field4397.method991((long) this.field176, -25858);
        if (var3 == null) {
            class187 var4 = class187.method1270(class33.field568, this.field182, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field191 != null) {
                for (int var5 = 0; var5 < this.field191.length; var5++) {
                    var4.method1283(this.field191[var5], this.field184[var5]);
                }
            }
            if (this.field173 != null) {
                for (int var6 = 0; var6 < this.field173.length; var6++) {
                    var4.method1290(this.field173[var6], this.field172[var6]);
                }
            }
            var3 = var4.method1280(this.field174 + 64, this.field183 + 850, -30, -50, -30);
            class248.field4397.method987(var3, (long) this.field176, -2438);
        }
        class251 var7;
        if (this.field170 == -1 || arg1 == -1) {
            var7 = var3.method945(true, true);
        } else {
            var7 = class67.method445((byte) -61, this.field170).method1736(arg1, 11403, var3);
        }
        if (this.field166 != 128 || this.field177 != 128) {
            var7.method953(this.field166, this.field177, this.field166);
        }
        if (this.field189 != 0) {
            if (this.field189 == 90) {
                var7.method970();
            }
            if (this.field189 == 180) {
                var7.method954();
            }
            if (this.field189 == 270) {
                var7.method976();
            }
        }
        if (!arg0) {
            this.field170 = -121;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Lfk;")
    public static final class241 method97(int arg0, int arg1, int arg2) {
        field179++;
        if (arg2 >= -47) {
            method97(110, 70, 76);
        }
        class241 var3 = (class241) class118.field1940.method612((long) arg0 << 32 | (long) arg1, true);
        if (var3 == null) {
            var3 = new class241(arg0, arg1);
            class118.field1940.method605(var3.field1713, -3, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZI)V")
    public static final void method98(int arg0, boolean arg1, int arg2) {
        field169++;
        class164.field2778[arg2] = arg0;
        class240 var3 = (class240) class156.field2666.method612((long) arg2, true);
        if (arg1) {
            method92((byte) 55);
        }
        if (var3 == null) {
            class240 var4 = new class240(class27.method198((byte) -125) + 500L);
            class156.field2666.method605((long) arg2, -3, var4);
        } else {
            var3.field4272 = class27.method198((byte) -121) + 500L;
        }
    }
}
