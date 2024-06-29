import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class118 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "[[I")
    public static int[][] field1653 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lmq;")
    public static class104 field1651 = new class104(20);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[B")
    public static byte[] field1654 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method743(int arg0) {
        field1653 = null;
        field1654 = null;
        field1651 = null;
        if (arg0 >= -99) {
            method744(-28, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)I")
    public static final int method744(int arg0, byte arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = 67 % ((arg1 + 57) / 46);
        field1652++;
        int var4 = (var2 & 0x33333333) + (var2 >>> 2 & 0xF3333333);
        int var5 = var4 + (var4 >>> 4) & 0xF0F0F0F;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }
}
