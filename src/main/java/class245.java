import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class245 {

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lwh;")
    private class167 field4285 = new class167();

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    private int field4287;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    private int field4277;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Ltg;")
    private class215 field4278;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[I")
    public static int[] field4279 = new int[200];

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lha;")
    public static class63 field4275;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
    public static final void method1610(int arg0, int arg1) {
        field4283++;
        if (arg1 >= 52) {
            class255.field4476.method1611(-18767, arg0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
    public final void method1611(int arg0, int arg1) {
        if (arg0 != -18767) {
            field4279 = null;
        }
        if (class82.field1591 != null) {
            for (class156 var3 = (class156) this.field4285.method1132(1742); var3 != null; var3 = (class156) this.field4285.method1139(arg0 + 18644)) {
                if (var3.method104(-111)) {
                    if (var3.method103(arg0 ^ 0x491B) == null) {
                        var3.method560(arg0 + 1213);
                        var3.method704((byte) 73);
                        this.field4277++;
                    }
                } else if ((++var3.field1990) > ((long) arg1)) {
                    class156 var4 = class82.field1591.method758(var3, (byte) 122);
                    this.field4278.method1380((byte) 126, var4, var3.field1560);
                    class209.method1358((byte) -74, var4, var3);
                    var3.method560(-17554);
                    var3.method704((byte) 73);
                }
            }
        }
        field4286++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method1612(byte arg0) {
        field4275 = null;
        field4279 = null;
        int var1 = -75 / ((80 - arg0) / 41);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    public final void method1613(byte arg0) {
        if (arg0 == 94) {
            field4281++;
            this.field4285.method1131((byte) -39);
            this.field4278.method1387(false);
            this.field4277 = this.field4287;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public final void method1614(int arg0) {
        for (class156 var2 = (class156) this.field4285.method1132(1742); var2 != null; var2 = (class156) this.field4285.method1139(-105)) {
            if (var2.method104(-112)) {
                var2.method560(-17554);
                var2.method704((byte) 73);
                this.field4277++;
            }
        }
        field4280++;
        int var3 = 13 % ((arg0 - 51) / 56);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
    public final void method1615(Object arg0, int arg1, long arg2) {
        field4282++;
        this.method1616((byte) 28, arg2);
        if (this.field4277 == 0) {
            class156 var5 = (class156) this.field4285.method1138(2265);
            var5.method560(-17554);
            var5.method704((byte) 73);
        } else {
            this.field4277--;
        }
        if (arg1 > 95) {
            class212 var6 = new class212(arg0);
            this.field4278.method1380((byte) 125, var6, arg2);
            this.field4285.method1135(71, var6);
            var6.field1990 = 0L;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BJ)V")
    public final void method1616(byte arg0, long arg1) {
        field4284++;
        class156 var4 = (class156) this.field4278.method1381(arg1, arg0 - 111);
        if (var4 != null) {
            var4.method560(-17554);
            var4.method704((byte) 73);
            this.field4277++;
        }
        if (arg0 != 28) {
            this.field4287 = -4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method1617(int arg0, long arg1) {
        field4276++;
        if (arg0 != 14366) {
            method1612((byte) 64);
        }
        class156 var4 = (class156) this.field4278.method1381(arg1, 90);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method103(-105);
        if (var5 == null) {
            var4.method560(-17554);
            var4.method704((byte) 73);
            this.field4277++;
            return null;
        }
        if (var4.method104(-109)) {
            class212 var6 = new class212(var5);
            this.field4278.method1380((byte) -40, var6, var4.field1560);
            this.field4285.method1135(99, var6);
            var6.field1990 = 0L;
            var4.method560(arg0 ^ 0xFFFF8370);
            var4.method704((byte) 73);
        } else {
            this.field4285.method1135(arg0 ^ 0x385B, var4);
            var4.field1990 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
    public class245(int arg0) {
        this.field4287 = arg0;
        int var2 = 1;
        this.field4277 = arg0;
        while (arg0 > (var2 + var2)) {
            var2 += var2;
        }
        this.field4278 = new class215(var2);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIILa;JZ)V")
    public static final void method1618(int arg0, int arg1, int arg2, int arg3, class20 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class90 var8 = new class90();
        var8.field1734 = arg4;
        var8.field1744 = arg1 * 128 + 64;
        var8.field1735 = arg2 * 128 + 64;
        var8.field1740 = arg3;
        var8.field1746 = arg5;
        if (class110.field2124[arg0][arg1][arg2] == null) {
            class110.field2124[arg0][arg1][arg2] = new class16(arg0, arg1, arg2);
        }
        class110.field2124[arg0][arg1][arg2].field225 = var8;
    }
}
