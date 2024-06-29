import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 extends class112 {

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!ge", name = "yb", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "client!ge", name = "rb", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!ge", name = "zb", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client!ge", name = "xb", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!ge", name = "sb", descriptor = "Lqe;")
    private class116 field1075;

    @OriginalMember(owner = "client!ge", name = "tb", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "Ltd;")
    private static class136 field1066 = class145.method1172("Loading )2 please wait)3", 45);

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "Z")
    public static boolean field1063 = false;

    @OriginalMember(owner = "client!ge", name = "qb", descriptor = "Ltd;")
    public static class136 field1073 = field1066;

    @OriginalMember(owner = "client!ge", name = "vb", descriptor = "Z")
    public static boolean field1078 = false;

    @OriginalMember(owner = "client!ge", name = "Ab", descriptor = "Ltd;")
    public static class136 field1083 = class145.method1172("Lade Eingabe)2Steuerungsprogramm)3)3)3", 45);

    @OriginalMember(owner = "client!ge", name = "Bb", descriptor = "Lue;")
    public static class143 field1084 = new class143(50);

    @OriginalMember(owner = "client!ge", name = "Cb", descriptor = "Ltd;")
    public static class136 field1085 = class145.method1172("Anmelde)2Limit -Uberschritten)3", 45);

    @OriginalMember(owner = "client!ge", name = "Eb", descriptor = "Lue;")
    public static class143 field1087 = new class143(64);

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!ge", name = "mb", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!ge", name = "nb", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ge", name = "ob", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ge", name = "pb", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ge", name = "wb", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ge", name = "ub", descriptor = "Lpd;")
    public static class108 field1077;

    @OriginalMember(owner = "client!ge", name = "Db", descriptor = "Z")
    public static boolean field1086;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
    public static final int method404(int arg0, int arg1) {
        field1062++;
        if (arg0 != 2) {
            return -66;
        }
        class62 var2 = class131.method1067(false, arg1);
        int var3 = var2.field1330;
        int var4 = var2.field1325;
        int var5 = var2.field1332;
        int var6 = class76.field1712[var5 - var4];
        return var6 & class18.field371[var3] >> var4;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V")
    public static void method405(boolean arg0) {
        field1085 = null;
        field1087 = null;
        field1084 = null;
        field1066 = null;
        field1083 = null;
        if (arg0) {
            field1083 = null;
        }
        field1077 = null;
        field1073 = null;
    }

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
    public static final void method406(int arg0) {
        class4.field70.method875((byte) 37);
        field1069++;
        int var1 = class4.field70.method877(false, 1);
        if (arg0 <= 125 || var1 == 0) {
            return;
        }
        int var2 = class4.field70.method877(false, 2);
        if (var2 == 0) {
            class108.field2532[class26.field591++] = 2047;
        } else if (var2 == 1) {
            int var3 = class4.field70.method877(false, 3);
            class24.field555.method1214((byte) -125, false, var3);
            int var4 = class4.field70.method877(false, 1);
            if (var4 == 1) {
                class108.field2532[class26.field591++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class4.field70.method877(false, 3);
            class24.field555.method1214((byte) -16, true, var5);
            int var6 = class4.field70.method877(false, 3);
            class24.field555.method1214((byte) -31, true, var6);
            int var7 = class4.field70.method877(false, 1);
            if (var7 == 1) {
                class108.field2532[class26.field591++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class4.field70.method877(false, 1);
            class62.field1331 = class4.field70.method877(false, 2);
            int var9 = class4.field70.method877(false, 7);
            int var10 = class4.field70.method877(false, 1);
            if (var10 == 1) {
                class108.field2532[class26.field591++] = 2047;
            }
            int var11 = class4.field70.method877(false, 7);
            class24.field555.method1209(var9, 128, var8 == 1, var11);
        }
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)Lda;")
    public final class23 method93(int arg0) {
        int var2 = 76 / ((arg0 - 18) / 63);
        if (this.field1075 != null) {
            int var3 = class44.field1013 - this.field1076;
            if (var3 > 100 && this.field1075.field2646 > 0) {
                var3 = 100;
            }
            label38: {
                do {
                    do {
                        if (var3 <= this.field1075.field2650[this.field1065]) {
                            break label38;
                        }
                        var3 -= this.field1075.field2650[this.field1065];
                        this.field1065++;
                    } while (this.field1065 < this.field1075.field2676.length);
                    this.field1065 -= this.field1075.field2646;
                } while (this.field1065 >= 0 && this.field1075.field2676.length > this.field1065);
                this.field1075 = null;
            }
            this.field1076 = class44.field1013 - var3;
        }
        class128 var4 = class142.method1154(this.field1080, 88);
        if (var4.field3065 != null) {
            var4 = var4.method1044(-12536);
        }
        field1072++;
        return var4 == null ? null : var4.method1054(this.field1074, this.field1082, 1, this.field1064, this.field1075, this.field1065, this.field1067, this.field1068, this.field1081);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIIIIIIZLqa;)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class112 arg9) {
        this.field1068 = arg3;
        this.field1081 = arg5;
        this.field1074 = arg1;
        this.field1082 = arg2;
        this.field1067 = arg6;
        this.field1080 = arg0;
        this.field1064 = arg4;
        if (arg7 != -1) {
            this.field1075 = class29.method252(true, arg7);
            this.field1076 = class44.field1013 - 1;
            this.field1065 = 0;
            if (this.field1075.field2675 == 0 && arg9 != null && arg9 instanceof class47) {
                class47 var11 = (class47) arg9;
                if (this.field1075 == var11.field1075) {
                    this.field1065 = var11.field1065;
                    this.field1076 = var11.field1076;
                    return;
                }
            }
            if (arg8 && this.field1075.field2646 != -1) {
                this.field1065 = (int) ((double) this.field1075.field2676.length * Math.random());
                this.field1076 -= (int) ((double) this.field1075.field2650[this.field1065] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
    public static final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 100) {
            return;
        }
        for (int var5 = 0; var5 < class70.field1477; var5++) {
            if (class125.field2907[var5] + class100.field2408[var5] > arg4 && arg4 + arg0 > class100.field2408[var5] && class154.field3535[var5] + class133.field3137[var5] > arg1 && arg1 + arg3 > class154.field3535[var5]) {
                class38.field879[var5] = true;
            }
        }
        field1071++;
    }
}
