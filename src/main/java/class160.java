import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class160 extends class77 {

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "Ldc;")
    public static class37 field3018 = class185.method1233((byte) 86, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "Lsg;")
    public static class203 field3015 = new class203();

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "Ldc;")
    public static class37 field3029 = class185.method1233((byte) 86, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "Ldc;")
    public static class37 field3032 = class185.method1233((byte) 86, "(Udns");

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    public static int field3031 = 0;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field3033 = 0;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "Ldc;")
    public class37 field3027;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "[I")
    public int[] field3014;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "[I")
    public int[] field3021;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "[I")
    public int[] field3023;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "[I")
    public int[] field3026;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)V")
    public static void method1072(int arg0) {
        field3029 = null;
        field3015 = null;
        field3018 = null;
        field3032 = null;
        if (arg0 != 0) {
            field3015 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)I")
    public final int method1073(byte arg0, int arg1) {
        field3020++;
        if (this.field3026 == null) {
            return -1;
        }
        if (arg0 >= -1) {
            this.method1078(75, null);
        }
        for (int var3 = 0; var3 < this.field3026.length; var3++) {
            if (this.field3014[var3] == arg1) {
                return this.field3026[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lwa;B)V")
    public static final void method1074(class238 arg0, byte arg1) {
        if (arg1 <= 103) {
            method1080(-67, -105, -5);
        }
        field3017++;
        class158.field3002 = arg0;
        class224.field4150 = class158.field3002.method1559(26143, 4);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILce;)V")
    private final void method1075(int arg0, int arg1, class28 arg2) {
        if (arg1 <= 8) {
            return;
        }
        if (arg0 == 1) {
            this.field3027 = arg2.method180(2);
        } else if (arg0 == 2) {
            int var7 = arg2.method215(-1797813752);
            this.field3021 = new int[var7];
            this.field3023 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3021[var8] = arg2.method230((byte) -125);
                int var9 = arg2.method215(-1797813752);
                if (var9 == 0) {
                    this.field3023[var8] = -1;
                } else {
                    this.field3023[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method215(-1797813752);
            this.field3026 = new int[var4];
            this.field3014 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3026[var5] = arg2.method230((byte) -104);
                int var6 = arg2.method215(-1797813752);
                if (var6 == 0) {
                    this.field3014[var5] = -1;
                } else {
                    this.field3014[var5] = var6;
                }
            }
        }
        field3019++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)I")
    public static final int method1076(int arg0, int arg1, int arg2) {
        field3022++;
        long var3 = (long) ((arg1 << 16) + arg0);
        if (arg2 != 1) {
            method1080(96, -65, -99);
        }
        return class5.field46 != null && class5.field46.field1066 == var3 ? class61.field1122.field526 * 99 / (class61.field1122.field502.length - class5.field46.field4229) + 1 : 0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)I")
    public final int method1077(int arg0, byte arg1) {
        field3025++;
        if (this.field3021 == null) {
            return -1;
        }
        int var3 = 119 % ((-arg1 - 82) / 43);
        for (int var4 = 0; var4 < this.field3021.length; var4++) {
            if (this.field3023[var4] == arg0) {
                return this.field3021[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILce;)V")
    public final void method1078(int arg0, class28 arg1) {
        while (true) {
            int var3 = arg1.method215(-1797813752);
            if (var3 == 0) {
                if (arg0 != 3342) {
                    return;
                }
                field3024++;
                return;
            }
            this.method1075(var3, arg0 ^ 0xD79, arg1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLmf;)Z")
    public static final boolean method1079(boolean arg0, class136 arg1) {
        field3028++;
        if (!arg0) {
            return true;
        } else if (arg1.field2624 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg1.field2624.length; var2++) {
                int var3 = class13.method84(-26, var2, arg1);
                int var4 = arg1.field2520[var2];
                if (arg1.field2624[var2] == 2) {
                    if (var3 >= var4) {
                        return false;
                    }
                } else if (arg1.field2624[var2] == 3) {
                    if (var4 >= var3) {
                        return false;
                    }
                } else if (arg1.field2624[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)V")
    public static final void method1080(int arg0, int arg1, int arg2) {
        field3016++;
        long var3 = (long) ((arg2 << 16) + arg1);
        if (arg0 != -5) {
            field3015 = null;
        }
        class231 var5 = (class231) class68.field1230.method1047((byte) -94, var3);
        if (var5 != null) {
            class245.field4483.method468(0, var5);
        }
    }
}
