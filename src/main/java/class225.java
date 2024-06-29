import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class225 extends class197 {

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Ljd;")
    public static class85 field3924 = class221.method1499("VOLL", (byte) 91);

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Lge;")
    public static class68 field3926;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[[[I")
    public static int[][][] field3920;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg2; var6++) {
            class183.method1260(arg4, arg0, 122, class146.field2488[var6], arg3);
        }
        if (arg1 != 8048) {
            method1518(-9, -91, -66, 124, 44, -65);
        }
        field3927++;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
    public static final int method1519(int arg0) {
        if (arg0 <= 124) {
            field3920 = null;
        }
        field3925++;
        return 16;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljd;Z)V")
    public static final void method1520(class85 arg0, boolean arg1) {
        field3928++;
        if (!arg1 || class118.field2111 == null) {
            return;
        }
        long var2 = arg0.method624(false);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class118.field2111.length > var4 && class118.field2111[var4].field4377 != var2) {
            var4++;
        }
        if (class118.field2111.length > var4 && class118.field2111[var4] != null) {
            class207.field3618.method483(-24260, 1);
            class134.field2331++;
            class207.field3618.method1674((byte) 101, class118.field2111[var4].field4377);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
    public static final void method1521(byte arg0, int arg1) {
        field3923++;
        class127.field2218.method1267(arg1, (byte) -116);
        int var2 = -94 % ((arg0 + 37) / 51);
        class221.field3875.method1267(arg1, (byte) -83);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Lph;")
    public static final class76 method1522(int arg0, int arg1) {
        field3922++;
        class76 var2 = (class76) class127.field2236.method1472((long) arg1, arg0 ^ 0x6A3E);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class12.field192.method464(-1, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class76 var4 = new class76();
        class247 var5 = new class247(var3);
        var5.field4224 = var5.field4238.length - 2;
        int var6 = var5.method1694((byte) -100);
        int var7 = var5.field4238.length - var6 - 2 - 12;
        var5.field4224 = var7;
        int var8 = var5.method1712(arg0 ^ 0xFFFFE70D);
        var4.field1411 = var5.method1694((byte) -100);
        var4.field1413 = var5.method1694((byte) -100);
        var4.field1418 = var5.method1694((byte) -100);
        var4.field1412 = var5.method1694((byte) -100);
        int var9 = var5.method1711((byte) -67);
        if (var9 > 0) {
            var4.field1409 = new class204[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1694((byte) -100);
                class204 var12 = new class204(class113.method804(var11, arg0 + 112));
                var4.field1409[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1712(6357);
                    int var14 = var5.method1712(6357);
                    var12.method1393(new class105(var14), (long) var13, 817);
                }
            }
        }
        var5.field4224 = 0;
        var4.field1402 = var5.method1708(0);
        var4.field1408 = new class85[var8];
        var4.field1407 = new int[var8];
        int var15 = 0;
        var4.field1416 = new int[var8];
        while (var5.field4224 < var7) {
            int var16 = var5.method1694((byte) -100);
            if (var16 == 3) {
                var4.field1408[var15] = var5.method1692(115);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field1407[var15] = var5.method1711((byte) -67);
            } else {
                var4.field1407[var15] = var5.method1712(6357);
            }
            var4.field1416[var15++] = var16;
        }
        if (arg0 != -40) {
            method1518(28, -76, -26, -45, 15, 119);
        }
        class127.field2236.method1468(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static void method1523(int arg0) {
        field3920 = null;
        field3924 = null;
        if (arg0 != -101) {
            method1518(-122, 104, -101, -89, 16, 83);
        }
        field3926 = null;
    }
}
