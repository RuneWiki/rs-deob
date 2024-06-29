import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class151 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[[B")
    public byte[][] field2417 = new byte[6][258];

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "[Z")
    public boolean[] field2424 = new boolean[16];

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "[I")
    public int[] field2434 = new int[16];

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "[I")
    public int[] field2431 = new int[6];

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "[I")
    public int[] field2422 = new int[257];

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[[I")
    public int[][] field2415 = new int[6][258];

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public int field2441 = 0;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "[[I")
    public int[][] field2442 = new int[6][258];

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "[I")
    public int[] field2429 = new int[256];

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public int field2416 = 0;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "[B")
    public byte[] field2428 = new byte[18002];

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "[B")
    public byte[] field2445 = new byte[4096];

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "[Z")
    public boolean[] field2451 = new boolean[256];

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "[B")
    public byte[] field2452 = new byte[18002];

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[[I")
    public int[][] field2414 = new int[6][258];

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "[B")
    public byte[] field2439 = new byte[256];

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[I")
    public static int[] field2430 = new int[200];

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "[I")
    public static int[] field2436 = new int[100];

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "Z")
    public static boolean field2438 = false;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "B")
    public byte field2437;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public int field2418;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "Ljj;")
    public static class134 field2447;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "[B")
    public byte[] field2413;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "[B")
    public byte[] field2433;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BZI[Leb;II)V")
    public static final void method1023(byte arg0, boolean arg1, int arg2, class103[] arg3, int arg4, int arg5) {
        field2450++;
        if (arg0 < 115) {
            field2438 = false;
        }
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class103 var7 = arg3[var6];
            if (var7 != null && var7.field1602 == arg2) {
                class254.method1660(arg4, arg1, var7, arg5, -3);
                class242.method1593(arg5, arg4, 14988, var7);
                if (var7.field1639 > var7.field1561 - var7.field1693) {
                    var7.field1639 = var7.field1561 - var7.field1693;
                }
                if (var7.field1590 > var7.field1721 - var7.field1691) {
                    var7.field1590 = var7.field1721 - var7.field1691;
                }
                if (var7.field1590 < 0) {
                    var7.field1590 = 0;
                }
                if (var7.field1639 < 0) {
                    var7.field1639 = 0;
                }
                if (var7.field1655 == 0) {
                    class88.method624(arg1, (byte) 115, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    public static final void method1024(int arg0, int arg1) {
        field2446++;
        class283 var2 = class46.method360(arg1, -92, arg0);
        var2.method1900(true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)I")
    public static final int method1025(int arg0, int arg1, int arg2) {
        field2449++;
        if (arg0 != 26965) {
            method1024(-112, -3);
        }
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1026(int arg0) {
        if (arg0 < 84) {
            field2453 = 56;
        }
        field2436 = null;
        field2430 = null;
        field2447 = null;
    }
}
