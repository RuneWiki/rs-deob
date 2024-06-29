import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class133 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2401 = 0;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
    public static volatile boolean field2405 = true;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Z")
    public static boolean field2404 = false;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[[I")
    public static int[][] field2406 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lkh;")
    public static class117 field2403 = class224.method1450((byte) 14, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static void method887(byte arg0) {
        field2403 = null;
        if (arg0 > -120) {
            field2404 = false;
        }
        field2406 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    public static final int method888(int arg0, int arg1) {
        int var2 = 106 % ((arg0 - 26) / 39);
        int var3 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        field2402++;
        int var4 = (var3 >>> 2 & 0xB3333333) + (var3 & 0x33333333);
        int var5 = var4 + (var4 >>> 4) & 0xF0F0F0F;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }
}
