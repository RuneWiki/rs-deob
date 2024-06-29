import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class443 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "[B")
    public byte[] field6501 = new byte[4096];

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public int field6507 = 0;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "[[I")
    public int[][] field6513 = new int[6][258];

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "[Z")
    public boolean[] field6515 = new boolean[16];

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "[I")
    public int[] field6518 = new int[256];

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "[B")
    public byte[] field6502 = new byte[18002];

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "[[I")
    public int[][] field6520 = new int[6][258];

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "[B")
    public byte[] field6525 = new byte[18002];

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "[[B")
    public byte[][] field6527 = new byte[6][258];

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "[I")
    public int[] field6532 = new int[16];

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "[Z")
    public boolean[] field6514 = new boolean[256];

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "[I")
    public int[] field6530 = new int[257];

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "[B")
    public byte[] field6531 = new byte[256];

    @OriginalMember(owner = "client!qr", name = "D", descriptor = "[[I")
    public int[][] field6529 = new int[6][258];

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "[I")
    public int[] field6523 = new int[6];

    @OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
    public int field6538 = 0;

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "Ljg;")
    public static class241 field6528 = new class241(8);

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "Lnn;")
    public static class151 field6536 = new class151("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!qr", name = "L", descriptor = "Lnn;")
    public static class151 field6537 = new class151("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "B")
    public byte field6534;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public int field6504;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public int field6505;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public int field6506;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public int field6509;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public int field6510;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public int field6511;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public int field6512;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public int field6517;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public int field6522;

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
    public int field6524;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
    public int field6526;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "I")
    public int field6535;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "Lkd;")
    public static class359 field6521;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "[B")
    public byte[] field6508;

    @OriginalMember(owner = "client!qr", name = "N", descriptor = "[B")
    public byte[] field6539;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V")
    public static final void method2707(int arg0, int arg1) {
        class426.field6263 = 100;
        class71.field911 = arg0;
        field6533++;
        class327.field4919 = -1;
        class354.field5228 = 3;
        if (arg1 != 100948170) {
            method2707(65, 116);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public static void method2708(boolean arg0) {
        field6528 = null;
        if (!arg0) {
            method2709((byte) -73);
        }
        field6536 = null;
        field6521 = null;
        field6537 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public static final void method2709(byte arg0) {
        if (arg0 != -107) {
            return;
        }
        field6516++;
        if (class19.field263 == 10 || class19.field263 == 28) {
            class50.method285(5000, class185.field2790 >> 10, (byte) -92, class196.field2967 >> 10);
        } else if (class113.field1500.field1900 >= 0 && (class115.field1522 * 128) > class113.field1500.field1900 && class113.field1500.field1892 >= 0 && class198.field3004 * 128 > class113.field1500.field1892) {
            class50.method285(5000, class113.field1500.field2019[0] >> 3, (byte) -16, class113.field1500.field2018[0] >> 3);
        } else {
            class50.method285(5000, class115.field1522 >> 4, (byte) -69, class198.field3004 >> 4);
        }
        class241.method1487(30721);
        class153.method945(true);
        class284.method1744((byte) 109);
        class161.method977(true);
    }
}
