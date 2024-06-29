import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class261 {

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[B")
    public byte[] field4273 = new byte[18002];

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
    public int[] field4275 = new int[256];

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[I")
    public int[] field4276 = new int[257];

    @OriginalMember(owner = "client!k", name = "l", descriptor = "[[I")
    public int[][] field4282 = new int[6][258];

    @OriginalMember(owner = "client!k", name = "t", descriptor = "[B")
    public byte[] field4290 = new byte[18002];

    @OriginalMember(owner = "client!k", name = "r", descriptor = "[I")
    public int[] field4288 = new int[16];

    @OriginalMember(owner = "client!k", name = "x", descriptor = "[[B")
    public byte[][] field4294 = new byte[6][258];

    @OriginalMember(owner = "client!k", name = "w", descriptor = "[[I")
    public int[][] field4293 = new int[6][258];

    @OriginalMember(owner = "client!k", name = "y", descriptor = "[Z")
    public boolean[] field4295 = new boolean[256];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[[I")
    public int[][] field4271 = new int[6][258];

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public int field4301 = 0;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "[B")
    public byte[] field4299 = new byte[256];

    @OriginalMember(owner = "client!k", name = "B", descriptor = "[B")
    public byte[] field4298 = new byte[4096];

    @OriginalMember(owner = "client!k", name = "G", descriptor = "[I")
    public int[] field4303 = new int[6];

    @OriginalMember(owner = "client!k", name = "F", descriptor = "[Z")
    public boolean[] field4302 = new boolean[16];

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public int field4305 = 0;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Len;")
    public static class49 field4296 = new class49();

    @OriginalMember(owner = "client!k", name = "H", descriptor = "Lsf;")
    public static class124 field4304 = new class124(64);

    @OriginalMember(owner = "client!k", name = "K", descriptor = "[Z")
    public static boolean[] field4307 = new boolean[112];

    @OriginalMember(owner = "client!k", name = "p", descriptor = "B")
    public byte field4286;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public int field4274;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public int field4277;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field4278;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public int field4279;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public int field4281;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public int field4291;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public int field4297;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "[B")
    public byte[] field4287;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "[B")
    public byte[] field4289;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)I", line = 15)
    public static final int method1838(byte arg0, int arg1) {
        field4306++;
        int var2 = -16 % ((arg0 - 16) / 43);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZII)I", line = 63)
    public static final int method1839(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field4296 = (class49) null;
        }
        int var3 = arg2 >> 31 & arg1 - 1;
        field4280++;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 99)
    public static void method1840(int arg0) {
        field4304 = null;
        if (arg0 < 56) {
            method1840(82);
        }
        field4307 = null;
        field4296 = null;
    }
}
