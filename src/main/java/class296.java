import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class296 {

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "[B")
    public byte[] field5018 = new byte[4096];

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[I")
    public int[] field5016 = new int[6];

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "[B")
    public byte[] field5011 = new byte[18002];

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "[Z")
    public boolean[] field5015 = new boolean[256];

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[B")
    public byte[] field5024 = new byte[18002];

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "[I")
    public int[] field5019 = new int[256];

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "[I")
    public int[] field5031 = new int[16];

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "[[I")
    public int[][] field5033 = new int[6][258];

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "[[I")
    public int[][] field5028 = new int[6][258];

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
    public int[] field5025 = new int[257];

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[[B")
    public byte[][] field5013 = new byte[6][258];

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "[Z")
    public boolean[] field5041 = new boolean[16];

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "[B")
    public byte[] field5048 = new byte[256];

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
    public int field5049 = 0;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "[[I")
    public int[][] field5047 = new int[6][258];

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public int field5036 = 0;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "[Lhb;")
    public static class32[] field5040 = new class32[28];

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field5037 = 0;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Lhd;")
    public static class117 field5035 = new class117(64);

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "B")
    public byte field5022;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "F")
    public static float field5010;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field5012;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public int field5017;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field5020;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field5021;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field5026;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public int field5029;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public int field5038;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public int field5039;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public int field5043;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[B")
    public byte[] field5023;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "[B")
    public byte[] field5034;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "[[S")
    public static short[][] field5044;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIZ)V", line = 19)
    public static final void method2104(int arg0, int arg1, boolean arg2) {
        class138.field2299 = class191.field3152 + class33.field639 - arg0 - 1;
        field5014++;
        class306.field5228 = arg1 - class277.field4764;
        int var3 = class306.field5228 - ((int) ((float) class185.field3081.field4393 / class133.field2231));
        int var4 = class306.field5228 + ((int) ((float) class185.field3081.field4393 / class133.field2231));
        if (!arg2) {
            field5010 = 1.3831898F;
        }
        int var5 = class138.field2299 + ((int) ((float) class185.field3081.field4381 / class133.field2231));
        if (var3 < 0) {
            class306.field5228 = (int) ((float) class185.field3081.field4393 / class133.field2231);
        }
        int var6 = class138.field2299 - ((int) ((float) class185.field3081.field4381 / class133.field2231));
        if (class118.field1916 < var4) {
            class306.field5228 = class118.field1916 - ((int) ((float) class185.field3081.field4393 / class133.field2231));
        }
        if (var6 < 0) {
            class138.field2299 = (int) ((float) class185.field3081.field4381 / class133.field2231);
        }
        if (class33.field639 < var5) {
            class138.field2299 = class33.field639 - ((int) ((float) class185.field3081.field4381 / class133.field2231));
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILoh;II)[Lje;", line = 100)
    public static final class70[] method2105(int arg0, class15 arg1, int arg2, int arg3) {
        field5042++;
        if (arg0 != 4961) {
            method2104(-35, 118, false);
        }
        return class230.method1688(arg3, arg2, 1221, arg1) ? class142.method1046(1) : null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)J", line = 136)
    public static final long method2106(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        return var3 == null || var3.field212 == null ? 0L : var3.field212.field4780;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 194)
    public static void method2107(int arg0) {
        field5044 = (short[][]) null;
        field5035 = null;
        if (arg0 != 0) {
            method2106(-45, -83, -125);
        }
        field5040 = null;
    }
}
