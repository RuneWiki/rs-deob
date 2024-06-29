import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class202 extends class101 {

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public int field3891 = 0;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "Ltg;")
    public class184 field3901 = class98.field1835;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Ltg;")
    public static class184 field3899 = class135.method812(":assist:", 3);

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "[Ltg;")
    public static class184[] field3895 = new class184[200];

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "Ltg;")
    public static class184 field3909 = class135.method812("Bitte laden Sie die Seite neu)3", 3);

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "Ltg;")
    private static class184 field3904 = class135.method812("You can(Wt add yourself to your own ignore list)3", 3);

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "Ltg;")
    public static class184 field3905 = field3904;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public int field3911;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "Lka;")
    public static class97 field3897;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "[I")
    public int[] field3908;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "[I")
    public int[] field3910;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "[Lsc;")
    public static class171[] field3896;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "[Ltg;")
    public class184[] field3906;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "[[B")
    public static byte[][] field3902;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static void method1288(int arg0) {
        field3897 = null;
        if (arg0 != -522) {
            method1292(21);
        }
        field3904 = null;
        field3896 = null;
        field3899 = null;
        field3895 = null;
        field3909 = null;
        field3902 = null;
        field3905 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III[B[Lgf;IIIII)V")
    public static final void method1289(int arg0, int arg1, int arg2, byte[] arg3, class65[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg1 + var15 > 0 && arg1 + var15 < 103) {
                    arg4[arg5].field1234[arg2 + var10][arg1 + var15] = class10.method61(arg4[arg5].field1234[arg2 + var10][arg1 + var15], -16777217);
                }
            }
        }
        class97 var11 = new class97(arg3);
        field3912++;
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg8 == var12 && var13 >= arg0 && arg0 + 8 > var13 && arg9 <= var14 && var14 < arg9 + 8) {
                        class85.method504(arg6, 0, 0, arg2 + class36.method219(32572, arg6, var13 & 0x7, var14 & 0x7), (byte) -38, arg1 + class134.method810(arg6, 90, var13 & 0x7, var14 & 0x7), var11, arg5);
                    } else {
                        class85.method504(0, 0, 0, -1, (byte) -38, -1, var11, 0);
                    }
                }
            }
        }
        if (arg7 == 13612) {
            ;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZILrh;)V")
    public static final void method1290(int arg0, boolean arg1, int arg2, class167 arg3) {
        field3903++;
        if (class34.field591 != null || class170.field3244 || (arg3 == null || class132.method798(arg3, (byte) 64) == null)) {
            return;
        }
        class34.field591 = arg3;
        class6.field115 = class132.method798(arg3, (byte) 20);
        class74.field1384 = arg1;
        class10.field182 = arg0;
        class150.field2693 = 0;
        class173.field3282 = arg2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLtg;)I")
    private static final int method1291(byte arg0, class184 arg1) {
        field3907++;
        if (class141.field2565 == 1) {
            return 7;
        } else if (arg1.method1135((byte) 116, class46.field869)) {
            return 1;
        } else if (arg1.method1135((byte) 116, class125.field2252)) {
            return 1;
        } else if (arg1.method1135((byte) 116, class159.field2885)) {
            return 2;
        } else if (arg1.method1135((byte) 116, class84.field1505)) {
            return 2;
        } else if (arg1.method1135((byte) 116, class161.field2904)) {
            return 3;
        } else if (arg1.method1135((byte) 116, class189.field3654)) {
            return 4;
        } else if (arg1.method1135((byte) 116, class50.field924)) {
            return 4;
        } else if (arg1.method1135((byte) 116, class117.field2125)) {
            return 5;
        } else if (arg1.method1135((byte) 116, class154.field2759)) {
            return 6;
        } else if (arg0 == -3) {
            return 0;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static final void method1292(int arg0) {
        field3892++;
        if (arg0 != 0) {
            method1294((byte) -1);
        }
        try {
            if (class43.field823 == null) {
                class43.field823 = new class81(class98.field1841, class144.method884(arg0, new class184[] { class108.field1959, class170.field3237, class182.field3488 }).method1161(false));
            } else {
                byte[] var1 = class43.field823.method455((byte) 120);
                if (var1 != null) {
                    class97 var2 = new class97(var1);
                    class94.field1714 = var2.method611(false);
                    class186.field3601 = new class205[class94.field1714];
                    for (int var3 = 0; var3 < class94.field1714; var3++) {
                        class205 var4 = class186.field3601[var3] = new class205();
                        int var5 = var2.method611(false);
                        var4.field3947 = (var5 & 0x8000) != 0;
                        var4.field3941 = var5 & 0x7FFF;
                        var4.field3944 = var2.method596(-1);
                        var4.field3946 = var2.method584((byte) -118);
                        var4.field3942 = var3;
                        var4.field3937 = method1291((byte) -3, var4.field3944);
                    }
                    class127.method768(class186.field3601.length - 1, class186.field3601, 0, 0, class162.field2912, class84.field1509);
                    class49.field903 = true;
                    class43.field823 = null;
                    return;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class43.field823 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lka;B)V")
    public final void method1293(class97 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method588((byte) -42);
            if (var3 == 0) {
                if (arg1 < 35) {
                    return;
                }
                field3898++;
                return;
            }
            this.method1295(arg0, 121, var3);
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)V")
    public static final void method1294(byte arg0) {
        if (arg0 != 12) {
            field3899 = null;
        }
        field3913++;
        for (class186 var1 = (class186) class79.field1429.method404(false); var1 != null; var1 = (class186) class79.field1429.method414(arg0 - 133)) {
            if (var1.field3595 == -1) {
                var1.field3598 = 0;
                class150.method918(true, var1);
            } else {
                var1.method797((byte) -125);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lka;II)V")
    private final void method1295(class97 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field3911 = arg0.method588((byte) -99);
        } else if (arg2 == 2) {
            this.field3894 = arg0.method588((byte) -74);
        } else if (arg2 == 3) {
            this.field3901 = arg0.method596(-1);
        } else if (arg2 == 4) {
            this.field3900 = arg0.method599(-16003);
        } else if (arg2 == 5) {
            this.field3891 = arg0.method611(false);
            this.field3906 = new class184[this.field3891];
            this.field3908 = new int[this.field3891];
            for (int var4 = 0; var4 < this.field3891; var4++) {
                this.field3908[var4] = arg0.method599(-16003);
                this.field3906[var4] = arg0.method596(-1);
            }
        } else if (arg2 == 6) {
            this.field3891 = arg0.method611(false);
            this.field3910 = new int[this.field3891];
            this.field3908 = new int[this.field3891];
            for (int var5 = 0; var5 < this.field3891; var5++) {
                this.field3908[var5] = arg0.method599(-16003);
                this.field3910[var5] = arg0.method599(-16003);
            }
        }
        if (arg1 < 108) {
            this.field3906 = null;
        }
        field3893++;
    }
}
