import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class656 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    private int field9152 = -1;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field9154 = -1;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    private int field9163 = -1;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public int field9158 = -1;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public int field9167 = 0;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public int field9165 = 16777215;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public int field9171 = 70;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    private int field9155 = -1;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    private int field9172 = -1;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public int field9174 = 0;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public int field9159 = 0;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public int field9176 = -1;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "Ljava/lang/String;")
    private String field9175 = "";

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[F")
    public static float[] field9151 = new float[16];

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Lhv;")
    public class519 field9157;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Lvg;")
    public static class54 field9166;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILji;)V")
    private final void method3710(int arg0, int arg1, class611 arg2) {
        field9168++;
        if (arg1 == 1) {
            this.field9176 = arg2.method3402((byte) 127);
        } else if (arg1 == 2) {
            this.field9165 = arg2.method3385(-128);
        } else if (arg1 == 3) {
            this.field9152 = arg2.method3402((byte) 127);
        } else if (arg1 == 4) {
            this.field9155 = arg2.method3402((byte) 127);
        } else if (arg1 == 5) {
            this.field9172 = arg2.method3402((byte) 127);
        } else if (arg1 == 6) {
            this.field9163 = arg2.method3402((byte) 127);
        } else if (arg1 == 7) {
            this.field9174 = arg2.method3413(false);
        } else if (arg1 == 8) {
            this.field9175 = arg2.method3422(-1);
        } else if (arg1 == 9) {
            this.field9171 = arg2.method3402((byte) 127);
        } else if (arg1 == 10) {
            this.field9167 = arg2.method3413(false);
        } else if (arg1 == 11) {
            this.field9158 = 0;
        } else if (arg1 == 12) {
            this.field9154 = arg2.method3428((byte) -120);
        } else if (arg1 == 13) {
            this.field9159 = arg2.method3413(false);
        } else if (arg1 == 14) {
            this.field9158 = arg2.method3402((byte) 127);
        }
        if (arg0 > -7) {
            method3713(2, false, 22, 53, -22, 114, -118, -30);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public static void method3711(boolean arg0) {
        field9151 = null;
        field9166 = null;
        if (arg0) {
            field9151 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILha;Lkba;II)V")
    public static final void method3712(int arg0, class60 arg1, class108 arg2, int arg3, int arg4) {
        field9161++;
        class600.field8354.method728((byte) 47);
        if (class482.field6652) {
            return;
        }
        for (class513 var5 = (class513) arg2.method724(32); var5 != null; var5 = (class513) arg2.method723(arg3 + 93)) {
            class292 var6 = class642.field8929.method1647(arg3 ^ 0xFFFFFF9A, var5.field6940);
            if (class653.method3685(87, var6)) {
                boolean var7 = class450.method2522(var6, arg0, var5, arg4, 15924, arg1);
                if (var7) {
                    class678.method3850(arg1, (byte) 70, var5, var6);
                }
            }
        }
        if (arg3 != -1) {
            field9151 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method3713(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if ((arg1 ? class11.field68.field5519.method750((byte) 127) : class11.field68.field5537.method750((byte) 122)) != 0 && arg3 != 0 && class635.field8835 < 50 && arg6 != -1) {
            class643.field8975[class635.field8835++] = new class573((byte) (arg1 ? 3 : 2), arg6, arg3, arg2, arg4, arg5, arg0, null);
        }
        field9177++;
        if (arg7 >= -58) {
            method3713(-106, false, -53, 52, 126, 31, -86, -57);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLem;)Ljava/lang/String;")
    public static final String method3714(byte arg0, class227 arg1) {
        if (arg0 != -124) {
            method3713(-38, false, 87, -74, -69, -59, 2, -40);
        }
        field9169++;
        if (arg1.field2943 == null || arg1.field2943.length() == 0) {
            return arg1.field2950 == null || arg1.field2950.length() <= 0 ? arg1.field2952 : arg1.field2952 + class755.field10512.method4201(class723.field10095, (byte) 25) + arg1.field2950;
        } else if (arg1.field2950 == null || arg1.field2950.length() <= 0) {
            return arg1.field2952 + class755.field10512.method4201(class723.field10095, (byte) 25) + arg1.field2943;
        } else {
            return arg1.field2952 + class755.field10512.method4201(class723.field10095, (byte) 25) + arg1.field2950 + class755.field10512.method4201(class723.field10095, (byte) 25) + arg1.field2943;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLha;)Lufa;")
    public final class680 method3715(boolean arg0, class60 arg1) {
        field9160++;
        if (this.field9152 < 0) {
            return null;
        }
        if (arg0) {
            this.field9176 = 120;
        }
        class680 var3 = (class680) this.field9157.field6984.method1571(-125, (long) this.field9152);
        if (var3 == null) {
            this.method3716(-109, arg1);
            var3 = (class680) this.field9157.field6984.method1571(-125, (long) this.field9152);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILha;)V")
    private final void method3716(int arg0, class60 arg1) {
        int var3 = 25 / ((arg0 - 3) / 34);
        field9162++;
        class522 var4 = this.field9157.field6988;
        if (this.field9152 >= 0 && this.field9157.field6984.method1571(-120, (long) this.field9152) == null && var4.method2882(-32, this.field9152)) {
            class204 var5 = class204.method1127(var4, this.field9152);
            this.field9157.field6984.method1574((long) this.field9152, arg1.method366(var5, true), (byte) -80);
        }
        if (this.field9172 >= 0 && this.field9157.field6984.method1571(-119, (long) this.field9172) == null && var4.method2882(-83, this.field9172)) {
            class204 var6 = class204.method1127(var4, this.field9172);
            this.field9157.field6984.method1574((long) this.field9172, arg1.method366(var6, true), (byte) -80);
        }
        if (this.field9155 >= 0 && this.field9157.field6984.method1571(-126, (long) this.field9155) == null && var4.method2882(-91, this.field9155)) {
            class204 var7 = class204.method1127(var4, this.field9155);
            this.field9157.field6984.method1574((long) this.field9155, arg1.method366(var7, true), (byte) -80);
        }
        if (this.field9163 >= 0 && this.field9157.field6984.method1571(-123, (long) this.field9163) == null && var4.method2882(-79, this.field9163)) {
            class204 var8 = class204.method1127(var4, this.field9163);
            this.field9157.field6984.method1574((long) this.field9163, arg1.method366(var8, true), (byte) -80);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method3717(int arg0, int arg1) {
        field9164++;
        String var3 = this.field9175;
        if (arg0 != 22414) {
            this.field9172 = 8;
        }
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class178.method1014(arg1, false, false) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lha;I)Lufa;")
    public final class680 method3718(class60 arg0, int arg1) {
        field9153++;
        if (this.field9155 < 0) {
            return null;
        }
        int var3 = 85 / ((-arg1 - 57) / 49);
        class680 var4 = (class680) this.field9157.field6984.method1571(-127, (long) this.field9155);
        if (var4 == null) {
            this.method3716(-83, arg0);
            var4 = (class680) this.field9157.field6984.method1571(-128, (long) this.field9155);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(ILha;)Lufa;")
    public final class680 method3719(int arg0, class60 arg1) {
        field9173++;
        if (arg0 < ~this.field9163) {
            return null;
        }
        class680 var3 = (class680) this.field9157.field6984.method1571(-121, (long) this.field9163);
        if (var3 == null) {
            this.method3716(arg0 + 61, arg1);
            var3 = (class680) this.field9157.field6984.method1571(-125, (long) this.field9163);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lji;I)V")
    public final void method3720(class611 arg0, int arg1) {
        field9170++;
        while (true) {
            int var3 = arg0.method3428((byte) 9);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    field9151 = null;
                    return;
                }
            }
            this.method3710(-120, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(ILha;)Lufa;")
    public final class680 method3721(int arg0, class60 arg1) {
        field9156++;
        if (this.field9172 < 0) {
            return null;
        }
        class680 var3 = (class680) this.field9157.field6984.method1571(-122, (long) this.field9172);
        if (arg0 < 11) {
            return null;
        }
        if (var3 == null) {
            this.method3716(45, arg1);
            var3 = (class680) this.field9157.field6984.method1571(-128, (long) this.field9172);
        }
        return var3;
    }
}
