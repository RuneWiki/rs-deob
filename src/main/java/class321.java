import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class321 {

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lri;")
    public static class73 field4584 = new class73(56, 9);

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Lri;")
    public static class73 field4603 = new class73(94, 6);

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "J")
    public static long field4606 = 0L;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "B")
    public byte field4581;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "B")
    public byte field4583;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "B")
    public byte field4585;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "B")
    public byte field4591;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "B")
    public byte field4594;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "B")
    public byte field4601;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "B")
    public byte field4604;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Lum;")
    public static class362 field4599;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "S")
    public short field4602;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Z")
    public boolean field4586;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Z")
    public boolean field4588;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Z")
    public boolean field4589;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Z")
    public boolean field4590;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Z")
    public boolean field4593;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Z")
    public boolean field4596;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Z")
    public boolean field4597;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Z")
    public boolean field4600;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "Z")
    public boolean field4605;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIB)V")
    public static final void method1991(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4595++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        class415.method2491(arg1 + arg2, -arg1 + arg2, class339.field4800[arg0], arg3, -31541);
        if (arg4 != -36) {
            field4603 = null;
        }
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class339.field4800[arg0 + var6];
                int[] var10 = class339.field4800[arg0 - var6];
                int var11 = arg2 + var5;
                int var12 = arg2 - var5;
                class415.method2491(var11, var12, var9, arg3, -31541);
                class415.method2491(var11, var12, var10, arg3, arg4 - 31505);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class339.field4800[arg0 + var5];
            int[] var16 = class339.field4800[arg0 - var5];
            class415.method2491(var13, var14, var15, arg3, -31541);
            class415.method2491(var13, var14, var16, arg3, -31541);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static final void method1992(int arg0) {
        field4598++;
        class291.method1861((byte) -104, class356.field5469);
        class79.field1188++;
        class356.field5471.method1410(class14.method89(false), -27645);
        int var1 = -74 / ((arg0 + 58) / 57);
        class356.field5471.method1413(-120, class4.field57);
        class356.field5471.method1413(-128, class116.field1743);
        class356.field5471.method1410(class426.field6401.field982, -27645);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method1993(byte arg0) {
        if (arg0 >= 117) {
            field4603 = null;
            field4599 = null;
            field4584 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLic;Lic;)I")
    public static final int method1994(byte arg0, class491 arg1, class491 arg2) {
        field4582++;
        int var3 = 0;
        if (arg1.method2924((byte) -128, class407.field6142)) {
            var3++;
        }
        if (arg1.method2924((byte) -125, class180.field2656)) {
            var3++;
        }
        if (arg1.method2924((byte) -128, class142.field2121)) {
            var3++;
        }
        if (arg2.method2924((byte) -126, class407.field6142)) {
            var3++;
        }
        if (arg2.method2924((byte) -125, class180.field2656)) {
            var3++;
        }
        if (arg2.method2924((byte) -127, class142.field2121)) {
            var3++;
        }
        if (arg0 >= -34) {
            field4599 = null;
        }
        return var3;
    }
}
