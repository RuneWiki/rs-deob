import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class53 extends class102 {

    @OriginalMember(owner = "client!we", name = "K", descriptor = "[B")
    public byte[] field931;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "[I")
    public static int[] field929 = new int[1000];

    @OriginalMember(owner = "client!we", name = "L", descriptor = "[[S")
    public static short[][] field932 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)I")
    public static final int method363(int arg0, byte arg1) {
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        field930++;
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 >= -71) {
            method363(-59, (byte) 11);
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([B)V")
    public class53(byte[] arg0) {
        this.field931 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public static void method364(int arg0) {
        if (arg0 == 26507) {
            field929 = null;
            field932 = null;
        }
    }
}
