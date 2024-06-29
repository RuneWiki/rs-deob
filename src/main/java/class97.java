import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class97 {

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "Ljp;")
    private class236 field1465 = new class236(64);

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lpc;")
    private class473 field1464;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "Los;")
    public static class305 field1466 = new class305();

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "[[I")
    public static int[][] field1469 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Lto;")
    public static class8 field1468;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIBI)V")
    public static final void method692(int arg0, int arg1, byte arg2, int arg3) {
        field1463++;
        if (class497.field6886 == null) {
            return;
        }
        long var4 = (long) (arg0 << 28 | arg3 << 14 | arg1);
        class289 var6 = (class289) class436.field5982.method182(var4, (byte) 71);
        if (var6 == null) {
            class376.method2177(arg0, arg1, arg3);
            return;
        }
        int var7 = 38 / ((arg2 - 32) / 59);
        class238 var8 = (class238) var6.field3780.method1672((byte) -122);
        if (var8 == null) {
            class376.method2177(arg0, arg1, arg3);
            return;
        }
        class215 var9 = (class215) class376.method2177(arg0, arg1, arg3);
        if (var9 == null) {
            var9 = new class215();
        } else {
            var9.field2902 = var9.field2901 = -1;
        }
        var9.field2907 = var8.field3180;
        var9.field2904 = var8.field3179;
        label44: while (true) {
            class238 var10 = (class238) var6.field3780.method1668(-1);
            if (var10 == null) {
                break;
            }
            if (var9.field2904 != var10.field3179) {
                var9.field2902 = var10.field3179;
                var9.field2899 = var10.field3180;
                while (true) {
                    class238 var11 = (class238) var6.field3780.method1668(-1);
                    if (var11 == null) {
                        break label44;
                    }
                    if (var9.field2904 != var11.field3179 && var9.field2902 != var11.field3179) {
                        var9.field2901 = var11.field3179;
                        var9.field2903 = var11.field3180;
                    }
                }
            }
        }
        int var12 = class210.method1330(arg0, (byte) -96, (arg1 << 7) + 64, (arg3 << 7) + 64);
        class255.method1536(arg0, arg1, arg3, var12, var9);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)Ldd;")
    public final class495 method693(int arg0, int arg1) {
        field1467++;
        class236 var3 = this.field1465;
        class495 var4;
        synchronized (this.field1465) {
            var4 = (class495) this.field1465.method1456((long) arg0, 118);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1464.method2708(11, arg0, (byte) 54);
        int var6 = 98 / ((62 - arg1) / 56);
        class495 var7 = new class495();
        if (var5 != null) {
            var7.method2844(new class379(var5), (byte) 41);
        }
        class236 var8 = this.field1465;
        synchronized (this.field1465) {
            this.field1465.method1462(var7, (long) arg0, -87);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public final void method694(int arg0) {
        field1470++;
        if (arg0 != 6) {
            this.method693(10, 4);
        }
        class236 var2 = this.field1465;
        synchronized (this.field1465) {
            this.field1465.method1459(arg0 ^ 0x4A96);
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
    public final void method695(int arg0) {
        int var2 = 17 / (-arg0 / 37);
        field1462++;
        class236 var3 = this.field1465;
        synchronized (this.field1465) {
            this.field1465.method1458((byte) 101);
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V")
    public final void method696(int arg0, int arg1) {
        field1461++;
        class236 var3 = this.field1465;
        synchronized (this.field1465) {
            this.field1465.method1461(arg1 ^ 0xFFFFFFFC, arg0);
        }
        if (arg1 != 7) {
            this.field1464 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public static void method697(byte arg0) {
        field1469 = null;
        if (arg0 != -95) {
            method692(47, -58, (byte) -78, 37);
        }
        field1468 = null;
        field1466 = null;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class97(class234 arg0, int arg1, class473 arg2) {
        this.field1464 = arg2;
        if (this.field1464 != null) {
            this.field1464.method2710(11, (byte) -108);
        }
    }
}
