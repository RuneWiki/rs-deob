import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class130 extends class17 {

    @OriginalMember(owner = "client!w", name = "K", descriptor = "[Lde;")
    public class24[] field3144 = new class24[5];

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public int field3138 = 0;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "[I")
    public int[] field3136 = new int[5];

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    public static int field3135 = 0;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "[I")
    public static int[] field3156 = new int[32];

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "Lke;")
    public static class65 field3158;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "Lhe;")
    public static class47 field3157;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "Lke;")
    public static class65 field3160;

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "[I")
    public static int[] field3161;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "[Z")
    public static boolean[] field3162;

    @OriginalMember(owner = "client!w", name = "db", descriptor = "[I")
    public static int[] field3163;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "[I")
    public static int[] field3165;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Lw;")
    public class130 field3139;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Leb;")
    public class26 field3143;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Lfa;")
    public class31 field3142;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Lfc;")
    public class33 field3147;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "Lkc;")
    public class62 field3149;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "Lob;")
    public class85 field3148;

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "Lpa;")
    public static class90 field3159;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "Lbc;")
    public class9 field3145;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Z")
    public boolean field3137;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "Z")
    public boolean field3150;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "Z")
    public boolean field3152;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3156[var1] = var0 - 1;
            var0 += var0;
        }
        field3158 = class1.method17(":chalreq:", -125);
        field3157 = new class47();
        field3160 = class1.method17("Ung-Ultiges Anmelde)2Paket)3", -123);
        field3161 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field3162 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };
        field3163 = new int[25];
        field3164 = 256;
        field3165 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 18)
    public static void method1018(int arg0) {
        field3165 = null;
        field3157 = null;
        field3162 = null;
        field3163 = null;
        field3159 = null;
        field3158 = null;
        field3161 = null;
        if (arg0 != -6605) {
            field3165 = null;
        }
        field3160 = null;
        field3156 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(III)V", line = 45)
    public class130(int arg0, int arg1, int arg2) {
        this.field3151 = arg1;
        this.field3154 = this.field3131 = arg0;
        this.field3141 = arg2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BZI)I", line = 59)
    public static final int method1019(byte[] arg0, boolean arg1, int arg2) {
        field3134++;
        return arg1 ? -17 : class110.method902(0, arg2, arg0, -83);
    }
}
