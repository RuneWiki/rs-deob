import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class301 extends class297 {

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Lma;")
    private static class5 field5075 = class12.method119("slide:", (byte) 125);

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lma;")
    public static class5 field5070 = class12.method119("<img=1>", (byte) 97);

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static int field5073 = 100;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lma;")
    public static class5 field5074 = class12.method119(" GMT", (byte) 125);

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "Lma;")
    public static class5 field5085 = field5075;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lma;")
    public static class5 field5067 = class12.method119("Lade Wordpack )2 ", (byte) 76);

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Lma;")
    public static class5 field5086 = class12.method119("null", (byte) 103);

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "Lma;")
    public static class5 field5079 = class12.method119("", (byte) 60);

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "[[Z")
    public static boolean[][] field5081 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "Lma;")
    public static class5 field5080 = field5075;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "Lma;")
    private static class5 field5090 = class12.method119("Members only world", (byte) 125);

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "Lma;")
    public static class5 field5091 = field5090;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "B")
    public byte field5068;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public int field5071;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "Leb;")
    public static class253 field5077;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "Lma;")
    public class5 field5078;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "Lma;")
    public class5 field5087;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BII)I", line = 5)
    public static final int method2041(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 10420) {
            field5085 = (class5) null;
        }
        field5076++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = class230.field3817[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lnc;I)V", line = 31)
    public static final void method2042(class12 arg0, int arg1) {
        if (arg1 != -31489) {
            method2041(-31, (byte[]) null, 92, 95);
        }
        if (class50.field784 == arg0.field231 || arg0.field238 == -1 || arg0.field214 != 0 || (arg0.field232 + 1) > class171.method1136(arg0.field238, arg1 + 24767).field502[arg0.field221]) {
            int var2 = arg0.field231 - arg0.field198;
            int var3 = arg0.field226 * 64 + arg0.field179 * 128;
            int var4 = class50.field784 - arg0.field198;
            int var5 = arg0.field226 * 64 + arg0.field209 * 128;
            int var6 = arg0.field188 * 128 + (arg0.field226 * 64);
            arg0.field211 = ((var2 - var4) * var5 + var4 * var6) / var2;
            int var7 = arg0.field226 * 64 + arg0.field191 * 128;
            arg0.field178 = ((var2 - var4) * var3 + (var4 * var7)) / var2;
        }
        arg0.field181 = 0;
        if (arg0.field203 == 0) {
            arg0.field215 = 1024;
        }
        field5089++;
        if (arg0.field203 == 1) {
            arg0.field215 = 1536;
        }
        if (arg0.field203 == 2) {
            arg0.field215 = 0;
        }
        if (arg0.field203 == 3) {
            arg0.field215 = 512;
        }
        arg0.field174 = arg0.field215;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I", line = 80)
    public static final int method2043(int arg0, int arg1) {
        if (arg1 != -13028) {
            field5090 = (class5) null;
        }
        field5072++;
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZILvj;)V", line = 99)
    public static final void method2044(boolean arg0, int arg1, class174 arg2) {
        field5082++;
        int var3 = (int) arg2.field5004;
        int var4 = arg2.field2660;
        arg2.method1997(-27381);
        if (arg0) {
            class106.method669(-74, var4);
        }
        class9.method99(29315, var4);
        class253 var5 = class172.method1140(var3, 44);
        if (arg1 != 29786) {
            field5069 = -99;
        }
        if (var5 != null) {
            class29.method205(var5, (byte) 124);
        }
        class282.field4794 = 0;
        class251.field4162 = false;
        class84.method566(arg1 ^ 0x7448, class86.field1305, class261.field4462, class18.field307, class209.field3323);
        if (class255.field4354 != -1) {
            class8.method92(0, class255.field4354, 1);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZB)I", line = 132)
    public static final int method2045(boolean arg0, boolean arg1, byte arg2) {
        int var3 = 107 % ((arg2 + 25) / 63);
        field5088++;
        int var4 = 0;
        if (arg1) {
            var4 += class267.field4587 + class116.field1734;
        }
        if (arg0) {
            var4 += class206.field3281 + class136.field2015;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V", line = 159)
    public static final void method2046(int arg0, int arg1, int arg2) {
        class114.field1702[arg2] = arg0;
        if (arg1 != 128) {
            field5067 = (class5) null;
        }
        class283 var3 = (class283) class161.field2453.method1372(false, (long) arg2);
        field5084++;
        if (var3 == null) {
            class283 var4 = new class283(4611686018427387905L);
            class161.field2453.method1376((long) arg2, -1, var4);
        } else if (var3.field4801 != 4611686018427387905L) {
            var3.field4801 = class212.method1404((byte) -108) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V", line = 226)
    public static void method2047(boolean arg0) {
        field5077 = null;
        field5074 = null;
        field5067 = null;
        field5085 = null;
        field5081 = (boolean[][]) null;
        if (!arg0) {
            field5067 = (class5) null;
        }
        field5091 = null;
        field5086 = null;
        field5075 = null;
        field5090 = null;
        field5070 = null;
        field5079 = null;
        field5080 = null;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)V", line = 260)
    public static final void method2048(boolean arg0) {
        if (arg0) {
            return;
        }
        for (class186 var1 = (class186) class127.field1905.method1475(14); var1 != null; var1 = (class186) class127.field1905.method1486(38)) {
            if (var1.field2919 == -1) {
                var1.field2916 = 0;
                class99.method634(var1, -1550739730);
            } else {
                var1.method1997(-27381);
            }
        }
        field5083++;
    }
}
