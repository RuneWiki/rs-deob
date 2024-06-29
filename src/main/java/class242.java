import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class242 {

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "[B")
    public byte[] field4174 = new byte[18002];

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public int field4164 = 0;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "[B")
    public byte[] field4175 = new byte[4096];

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public int field4182 = 0;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "[[I")
    public int[][] field4162 = new int[6][258];

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "[I")
    public int[] field4180 = new int[257];

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[I")
    public int[] field4166 = new int[6];

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "[I")
    public int[] field4191 = new int[256];

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "[Z")
    public boolean[] field4168 = new boolean[16];

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[B")
    public byte[] field4163 = new byte[256];

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "[[I")
    public int[][] field4190 = new int[6][258];

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "[Z")
    public boolean[] field4172 = new boolean[256];

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "[B")
    public byte[] field4186 = new byte[18002];

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "[[B")
    public byte[][] field4193 = new byte[6][258];

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "[I")
    public int[] field4195 = new int[16];

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[[I")
    public int[][] field4160 = new int[6][258];

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "[J")
    public static long[] field4188 = new long[256];

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field4194 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "Loa;")
    public static class99 field4196 = class221.method1463(2844, "mapdots");

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "Z")
    public static boolean field4197;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "B")
    public byte field4161;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public int field4165;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public int field4167;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public int field4169;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field4171;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public int field4176;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Ltg;")
    public static class182 field4177;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "Ltg;")
    public static class182 field4199;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[B")
    public byte[] field4170;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "[B")
    public byte[] field4173;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "[Lte;")
    public static class77[] field4198;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method1574(int arg0) {
        field4198 = null;
        int var1 = -42 / ((arg0 + 70) / 35);
        field4196 = null;
        field4177 = null;
        field4199 = null;
        field4188 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4188[var0] = var1;
        }
        field4197 = true;
    }
}
