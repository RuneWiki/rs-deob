import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public abstract class class505 {

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field7301 = 0;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field7298 = 0;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Z")
    public static boolean field7299 = false;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field7304 = 0;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "Lqt;")
    public static class459 field7300 = new class459(0, -1);

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lth;[[BB)V", line = 6)
    public static final void method2946(class431 arg0, byte[][] arg1, byte arg2) {
        field7302++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class519 var11 = new class519(var10);
                int var12 = class475.field6929[var5] >> 8;
                int var13 = class475.field6929[var5] & 0xFF;
                int var14 = var12 * 64 - class82.field1315;
                int var15 = var13 * 64 - class501.field7240;
                class259.method1668(8101);
                arg0.method2515(class19.field213, class82.field1315, var14, var15, 0, class501.field7240, var11);
                arg0.method2561(var14, var3, arg2 ^ 0x69, class76.field1256, var15, var11);
                if (!arg0.field6006 && (class473.field6897 / 8) == var12 && class122.field1908 / 8 == var13 && var3[0] != -1) {
                    class391.field5551 = class175.field2614.method1021(class59.field1057, var3[3], var3[1], var3[2], var3[0], -111);
                    class358.field5198 = var3[4];
                }
            }
        }
        int var6 = 0;
        if (arg2 != 105) {
            return;
        }
        while (var4 > var6) {
            int var7 = (class475.field6929[var6] >> 8) * 64 - class82.field1315;
            int var8 = (class475.field6929[var6] & 0xFF) * 64 - class501.field7240;
            byte[] var9 = arg1[var6];
            if (var9 == null && class122.field1908 < 800) {
                class259.method1668(8101);
                arg0.method2512(64, var8, 64, (byte) 122, var7);
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)V", line = 99)
    public static void method2947(byte arg0) {
        if (arg0 >= 0) {
            method2946(null, null, (byte) -62);
        }
        field7300 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)Lmh;")
    public abstract class454 method80(byte arg0);

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)Z")
    public abstract boolean method74(int arg0, int arg1);

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public abstract void method84(int arg0);

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public abstract void method81(int arg0);
}
