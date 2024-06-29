import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class57 extends class101 {

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    private int field1005 = 128;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    private int field1001 = 0;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    private int field1009 = 0;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public int field1017 = -1;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    private int field1021 = 128;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    private int field1026 = 0;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "[Z")
    public static boolean[] field1000 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "[Lgh;")
    public static class67[] field1024 = new class67[2048];

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "[I")
    public static int[] field1025 = new int[50];

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Ltg;")
    public static class184 field1018 = class135.method812("null", 3);

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "Ltg;")
    public static class184 field1012 = class135.method812("und Ihr Passwort ein)3", 3);

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "[S")
    private short[] field1003;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "[S")
    private short[] field1004;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "[S")
    private short[] field1006;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "[S")
    private short[] field1023;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
    public static void method303(boolean arg0) {
        field1024 = null;
        field1000 = null;
        field1025 = null;
        field1012 = null;
        if (!arg0) {
            method306(-95);
        }
        field1018 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Loh;")
    public final class140 method304(int arg0, int arg1) {
        field1011++;
        class140 var3 = (class140) class195.field3783.method773((long) this.field1019, 1);
        if (var3 == null) {
            class181 var4 = class181.method1124(class158.field2827, this.field1008, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1023 != null) {
                for (int var5 = 0; var5 < this.field1023.length; var5++) {
                    var4.method1109(this.field1023[var5], this.field1004[var5]);
                }
            }
            if (this.field1003 != null) {
                for (int var6 = 0; var6 < this.field1003.length; var6++) {
                    var4.method1113(this.field1003[var6], this.field1006[var6]);
                }
            }
            var3 = var4.method1102(this.field1001 + 64, this.field1009 + 850, -30, -50, -30, true, true);
            class195.field3783.method776(var3, (long) this.field1019, (byte) -117);
        }
        class140 var7;
        if (this.field1017 == -1 || arg0 == -1) {
            var7 = var3.method549(true);
        } else {
            var7 = class83.method465(this.field1017, -1).method1194(arg0, var3, (byte) -91);
        }
        if (arg1 != 217) {
            return null;
        }
        if (this.field1005 != 128 || this.field1021 != 128) {
            var7.method868(this.field1005, this.field1021, this.field1005);
        }
        if (this.field1026 != 0) {
            if (this.field1026 == 90) {
                var7.method864();
            }
            if (this.field1026 == 180) {
                var7.method864();
                var7.method864();
            }
            if (this.field1026 == 270) {
                var7.method864();
                var7.method864();
                var7.method864();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILrh;)V")
    public static final void method305(int arg0, class167 arg1) {
        if (class209.field4009 == arg1.field3075) {
            class99.field1849[arg1.field3122] = true;
        }
        if (arg0 > -111) {
            field1022 = 84;
        }
        field1010++;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
    public static final int method306(int arg0) {
        if (arg0 >= -6) {
            field1018 = null;
        }
        field1007++;
        return class131.field2382++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZLka;)V")
    private final void method307(int arg0, boolean arg1, class97 arg2) {
        field1002++;
        if (arg0 == 1) {
            this.field1008 = arg2.method611(!arg1);
        } else if (arg0 == 2) {
            this.field1017 = arg2.method611(false);
        } else if (arg0 == 4) {
            this.field1005 = arg2.method611(false);
        } else if (arg0 == 5) {
            this.field1021 = arg2.method611(!arg1);
        } else if (arg0 == 6) {
            this.field1026 = arg2.method611(false);
        } else if (arg0 == 7) {
            this.field1001 = arg2.method588((byte) -53);
        } else if (arg0 == 8) {
            this.field1009 = arg2.method588((byte) -128);
        } else if (arg0 == 40) {
            int var4 = arg2.method588((byte) -122);
            this.field1023 = new short[var4];
            this.field1004 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1023[var5] = (short) arg2.method611(false);
                this.field1004[var5] = (short) arg2.method611(false);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method588((byte) -99);
            this.field1003 = new short[var6];
            this.field1006 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1003[var7] = (short) arg2.method611(!arg1);
                this.field1006[var7] = (short) arg2.method611(false);
            }
        }
        if (!arg1) {
            this.method307(-83, false, null);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lka;Z)V")
    public final void method308(class97 arg0, boolean arg1) {
        field1015++;
        while (true) {
            int var3 = arg0.method588((byte) -34);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    field1025 = null;
                    return;
                }
            }
            this.method307(var3, true, arg0);
        }
    }
}
