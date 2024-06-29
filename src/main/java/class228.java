import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class228 extends class177 {

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    private int field4153 = 0;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "Z")
    public boolean field4174 = false;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    private int field4175 = -32768;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    private int field4155 = 0;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public int field4170;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    private int field4172;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public int field4151;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public int field4171;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "Lek;")
    private class159 field4158;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field4146 = -1;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "[Lhj;")
    public static class69[] field4160 = new class69[100];

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "Lhj;")
    private static class69 field4163 = class181.method1318("Use", (byte) -119);

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "Z")
    public static boolean field4166 = false;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "J")
    public static long field4161 = 0L;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Lhj;")
    public static class69 field4156 = class181.method1318("Eingabeprozedur geladen)3", (byte) -112);

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "Lhj;")
    public static class69 field4162 = class181.method1318("blaugr-Un:", (byte) -116);

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field4169 = 0;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "Lhj;")
    public static class69 field4165 = field4163;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)I")
    public static final int method1626(int arg0, int arg1, int arg2) {
        field4157++;
        if (arg0 != -2) {
            return -90;
        }
        class65 var3 = (class65) class4.field25.method769(true, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field1257.length) {
            return var3.field1257[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
    public final int method211() {
        field4159++;
        return this.field4175;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Lsf;")
    private final class92 method1627(int arg0) {
        if (arg0 != -15528) {
            return null;
        }
        field4168++;
        class39 var2 = class213.method1533(128, this.field4172);
        class92 var3;
        if (this.field4174) {
            var3 = var2.method214(-1, (byte) 90);
        } else {
            var3 = var2.method214(this.field4155, (byte) -73);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BJ)V")
    public static final void method1628(byte arg0, long arg1) {
        field4154++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class273.field4828 < 100 || class43.field613 == 1) || class273.field4828 >= 200) {
            class122.method881(0, class209.field3816, class98.field1819, false);
            return;
        }
        int var3 = -78 / ((75 - arg0) / 48);
        class69 var4 = class101.method749(arg1, 25801).method452(122);
        for (int var5 = 0; var5 < class273.field4828; var5++) {
            if (class141.field2642[var5] == arg1) {
                class122.method881(0, class209.field3816, class9.method42(52, new class69[] { var4, class28.field396 }), false);
                return;
            }
        }
        for (int var6 = 0; var6 < class149.field2778; var6++) {
            if (class159.field2959[var6] == arg1) {
                class122.method881(0, class209.field3816, class9.method42(87, new class69[] { class243.field4465, var4, class186.field3392 }), false);
                return;
            }
        }
        if (var4.method444((byte) -24, class156.field2904.field2045)) {
            class122.method881(0, class209.field3816, class61.field1116, false);
            return;
        }
        class103.field1915[class273.field4828] = var4;
        class112.field2122++;
        class141.field2642[class273.field4828] = arg1;
        class112.field2163[class273.field4828] = 0;
        class62.field1202[class273.field4828] = class209.field3816;
        class22.field307[class273.field4828] = 0;
        class93.field1737[class273.field4828] = false;
        class208.field3795 = class81.field1564;
        class273.field4828++;
        class48.field692.method301(202, -104);
        class48.field692.method918(arg1, 18820);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4167++;
        class92 var11 = this.method1627(-15528);
        if (var11 != null) {
            var11.method212(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4175 = var11.method211();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
    public final void method1629(int arg0, int arg1) {
        field4149++;
        if (arg1 > -20 || this.field4174) {
            return;
        }
        this.field4153 += arg0;
        while (this.field4158.field2941[this.field4155] < this.field4153) {
            this.field4153 -= this.field4158.field2941[this.field4155];
            this.field4155++;
            if (this.field4158.field2962.length <= this.field4155) {
                this.field4174 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static void method1630(byte arg0) {
        field4160 = null;
        field4165 = null;
        field4162 = null;
        field4156 = null;
        field4163 = null;
        if (arg0 >= -40) {
            method1628((byte) 1, -69L);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lnc;B)V")
    public static final void method1631(class83 arg0, byte arg1) {
        field4173++;
        if (class224.field4081) {
            return;
        }
        class15.method86();
        class75.field1472 = class144.method1099(class118.field2240, 85, arg0);
        int var2 = class20.field287;
        int var3 = var2 * 956 / 503;
        class75.field1472.method339((class66.field1278 - var3) / 2, 0, var3, var2);
        class247.field4521 = class253.method1760(class52.field916, arg0, 0);
        class247.field4521.method270(class66.field1278 / 2 - (class247.field4521.field691 / 2), 18);
        class224.field4081 = true;
        int var4 = -6 % ((arg1 - 63) / 54);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIII)V")
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4170 = arg4;
        this.field4150 = arg3;
        this.field4172 = arg0;
        this.field4151 = arg5 + arg6;
        this.field4148 = arg1;
        this.field4171 = arg2;
        int var8 = class213.method1533(128, this.field4172).field561;
        if (var8 == -1) {
            this.field4174 = true;
        } else {
            this.field4174 = false;
            this.field4158 = class211.method1521(-43, var8);
        }
    }
}
