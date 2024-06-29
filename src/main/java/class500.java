import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class500 {

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Ljava/lang/String;")
    private String field7080 = "null";

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7068 = 104;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Leh;")
    public static class246 field7084 = new class246(29, 6);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lnh;")
    public static class536 field7085;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "C")
    public char field7067;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "C")
    public char field7079;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "F")
    public static float field7069;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    private int field7078;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lqi;")
    public class406 field7070;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lqi;")
    private class406 field7074;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Loi;")
    public static class53 field7083;

    static {
        new class530("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field7085 = new class536("LOCAL", 4);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 4)
    public final boolean method2897(byte arg0, String arg1) {
        if (arg0 < 85) {
            return true;
        }
        field7071++;
        if (this.field7070 == null) {
            return false;
        }
        if (this.field7074 == null) {
            this.method2902(-119);
        }
        for (class330 var3 = (class330) this.field7074.method2405(class482.method2779(466841861, arg1), -71); var3 != null; var3 = (class330) this.field7074.method2415(-1)) {
            if (var3.field4813.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILwm;I)V", line = 32)
    private final void method2898(int arg0, class403 arg1, int arg2) {
        if (arg2 != 6) {
            field7068 = 75;
        }
        field7072++;
        if (arg0 == 1) {
            this.field7079 = class120.method805(arg1.method2359(40), (byte) -116);
        } else if (arg0 == 2) {
            this.field7067 = class120.method805(arg1.method2359(-92), (byte) -42);
        } else if (arg0 == 3) {
            this.field7080 = arg1.method2356(-25178);
        } else if (arg0 == 4) {
            this.field7078 = arg1.method2319((byte) 81);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method2338(0);
            this.field7070 = new class406(class280.method1749(-31679, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2319((byte) 99);
                class498 var7;
                if (arg0 == 5) {
                    var7 = new class74(arg1.method2356(-25178));
                } else {
                    var7 = new class254(arg1.method2319((byte) 101));
                }
                this.field7070.method2413((long) var6, var7, -1);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 85)
    public static void method2899(int arg0) {
        field7084 = null;
        if (arg0 != -8827) {
            field7069 = -1.1965501F;
        }
        field7085 = null;
        field7083 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Ljava/lang/String;", line = 98)
    public final String method2900(int arg0, int arg1) {
        field7082++;
        if (this.field7070 == null) {
            return this.field7080;
        }
        class74 var3 = (class74) this.field7070.method2405((long) arg1, -100);
        if (var3 == null) {
            return this.field7080;
        } else {
            if (arg0 != 15361) {
                field7085 = null;
            }
            return var3.field898;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Z", line = 117)
    public final boolean method2901(int arg0, int arg1) {
        if (arg1 != -6) {
            this.method2903(48, false);
        }
        field7075++;
        if (this.field7070 == null) {
            return false;
        }
        if (this.field7074 == null) {
            this.method2906((byte) 70);
        }
        class254 var3 = (class254) this.field7074.method2405((long) arg0, -34);
        return var3 != null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 149)
    private final void method2902(int arg0) {
        this.field7074 = new class406(this.field7070.method2412(0));
        if (arg0 > -104) {
            this.method2903(-28, true);
        }
        field7077++;
        for (class74 var2 = (class74) this.field7070.method2414((byte) -127); var2 != null; var2 = (class74) this.field7070.method2410((byte) 105)) {
            class330 var3 = new class330(var2.field898, (int) var2.field7060);
            this.field7074.method2413(class482.method2779(466841861, var2.field898), var3, -1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)I", line = 173)
    public final int method2903(int arg0, boolean arg1) {
        field7081++;
        if (this.field7070 == null) {
            return this.field7078;
        }
        class254 var3 = (class254) this.field7070.method2405((long) arg0, -94);
        if (arg1) {
            this.method2900(33, -43);
        }
        return var3 == null ? this.field7078 : var3.field3757;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwm;B)V", line = 192)
    public final void method2904(class403 arg0, byte arg1) {
        field7073++;
        while (true) {
            int var3 = arg0.method2357((byte) 105);
            if (var3 == 0) {
                if (arg1 >= -26) {
                    this.method2898(73, null, -2);
                    return;
                } else {
                    return;
                }
            }
            this.method2898(var3, arg0, 6);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 227)
    public static final void method2905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field7076++;
        if (class330.field4818 == null) {
            return;
        }
        class228 var14 = null;
        if (arg1 < 0) {
            int var15 = -arg1 - 1;
            if (class343.field4982 == var15) {
                var14 = class246.field3587;
            } else {
                var14 = class378.field5355[var15];
            }
        } else {
            int var16 = arg1 - 1;
            class378 var17 = (class378) class125.field1687.method2405((long) var16, -36);
            if (var17 != null) {
                var14 = var17.field5353;
            }
        }
        if (var14 == null) {
            return;
        }
        class270 var18 = class377.field5338.method1901(arg5 - 219369551, arg12);
        int var19;
        int var20;
        if (arg7 == 1 || arg7 == 3) {
            var19 = var18.field3937;
            var20 = var18.field4012;
        } else {
            var19 = var18.field4012;
            var20 = var18.field3937;
        }
        int var21 = (var20 >> 1) + arg11;
        int var22 = (var20 + 1 >> 1) + arg11;
        int var23 = (var19 >> 1) + arg0;
        int var24 = (var19 + 1 >> 1) + arg0;
        class38 var25 = class330.field4818[arg8];
        int var26 = var25.method10(var21, var23) + var25.method10(var22, var23) - (-var25.method10(var21, var24) + -var25.method10(var22, var24)) >> 2;
        class224 var27 = new class224();
        var27.field3229 = arg7;
        if (arg13 < arg4) {
            int var28 = arg4;
            arg4 = arg13;
            arg13 = var28;
        }
        var27.field3217 = arg11;
        var27.field3220 = var14.field1904;
        var27.field3227 = arg9;
        var27.field3218 = arg12;
        if (arg5 != 219369601) {
            return;
        }
        var27.field3228 = arg0;
        var27.field3226 = class390.field5481 + arg2;
        var27.field3225 = class390.field5481 + arg3;
        var27.field3221 = arg4 + arg11;
        if (arg6 > arg10) {
            int var29 = arg6;
            arg6 = arg10;
            arg10 = var29;
        }
        var27.field3216 = arg11 + arg13;
        var27.field3219 = arg0 + arg10;
        var27.field3215 = arg0 + arg6;
        var27.field3224 = (var27.field3217 << 7) + (var20 << 6);
        var27.field3223 = var26;
        var27.field3230 = (var27.field3228 << 7) + (var19 << 6);
        class117.field1631.method2657(arg5 - 219361109, var27);
        var14.field3371 = var27;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 336)
    private final void method2906(byte arg0) {
        if (arg0 != 70) {
            return;
        }
        this.field7074 = new class406(this.field7070.method2412(0));
        field7066++;
        for (class254 var2 = (class254) this.field7070.method2414((byte) -127); var2 != null; var2 = (class254) this.field7070.method2410((byte) 86)) {
            class254 var3 = new class254((int) var2.field7060);
            this.field7074.method2413((long) var2.field3757, var3, -1);
        }
    }
}
