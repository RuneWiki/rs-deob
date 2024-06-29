import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class108 extends class27 {

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    private int field1553 = 2048;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    private int field1556 = 12288;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    private int field1559 = 8192;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    private int field1552 = 4096;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    private int field1554 = 0;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    private int field1555 = 2048;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    private int field1562 = 0;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field1561 = 0;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field1557 = 0;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field1566 = 0;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "Lph;")
    public static class361 field1567;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(JIBI)Z", line = 5)
    public static final boolean method825(long arg0, int arg1, byte arg2, int arg3) {
        field1558++;
        if (arg2 != -66) {
            field1567 = (class361) null;
        }
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        int var7 = ((int) arg0 & 0x3826B5) >> 20;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class261 var8 = class30.method212(0, var6);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field3962;
                var10 = var8.field3907;
            } else {
                var9 = var8.field3907;
                var10 = var8.field3962;
            }
            int var11 = var8.field3922;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class49.method416(var10, var9, class1.field55.field5186[0], 0, true, 0, var11, class1.field55.field5162[0], arg1, arg3, true);
        } else {
            class49.method416(0, 0, class1.field55.field5186[0], var5 + 1, true, var7, 0, class1.field55.field5162[0], arg1, arg3, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)Luo;", line = 51)
    public static final class316 method826(int arg0) {
        field1564++;
        if (arg0 == 4096) {
            return class179.field2563 >= class270.field4099.length ? null : class270.field4099[class179.field2563++];
        } else {
            return (class316) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V", line = 66)
    public static void method827(int arg0) {
        if (arg0 < 78) {
            method825(6L, 80, (byte) 65, 108);
        }
        field1567 = null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIB)Z", line = 78)
    private final boolean method828(int arg0, int arg1, byte arg2) {
        int var4 = (arg0 + arg1) * this.field1556 >> 12;
        field1569++;
        int var5 = client.field646[(var4 * 255 & 0xFF441) >> 12];
        int var6 = (var5 << 12) / this.field1556;
        int var7 = (var6 << 12) / this.field1559;
        if (arg2 != -56) {
            this.method829(122, -11, 20);
        }
        int var8 = this.field1552 * var7 >> 12;
        return arg1 - arg0 < var8 && -var8 < arg1 - arg0;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 177)
    public class108() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILsb;I)V", line = 101)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            return;
        }
        field1563++;
        if (arg2 == 0) {
            this.field1555 = arg1.method1317((byte) 5);
        } else if (arg2 == 1) {
            this.field1562 = arg1.method1317((byte) 72);
        } else if (arg2 == 2) {
            this.field1554 = arg1.method1317((byte) 89);
        } else if (arg2 == 3) {
            this.field1553 = arg1.method1317((byte) 55);
        } else if (arg2 == 4) {
            this.field1556 = arg1.method1317((byte) 76);
        } else if (arg2 == 5) {
            this.field1552 = arg1.method1317((byte) 115);
        } else if (arg2 == 6) {
            this.field1559 = arg1.method1317((byte) 121);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)Z", line = 183)
    private final boolean method829(int arg0, int arg1, int arg2) {
        int var4 = (arg0 - arg1) * this.field1556 >> 12;
        int var5 = client.field646[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field1556;
        field1568++;
        int var7 = (var6 << 12) / this.field1559;
        if (arg2 == -4096) {
            int var8 = this.field1552 * var7 >> 12;
            return var8 > (arg1 + arg0) && (-var8) < (arg0 + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V", line = 207)
    public final void method22(int arg0) {
        class172.method1206(28820);
        if (arg0 > -63) {
            this.field1556 = -87;
        }
        field1565++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)[I", line = 252)
    public final int[] method18(int arg0, byte arg1) {
        field1560++;
        int[] var3 = this.field375.method2087(arg1 ^ 0x79, arg0);
        if (this.field375.field4382) {
            int var4 = class215.field3175[arg0] - 2048;
            for (int var5 = 0; var5 < class209.field3053; var5++) {
                int var6 = class251.field3721[var5] - 2048;
                int var7 = this.field1555 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 - 4096 : var8;
                int var10 = this.field1554 + var6;
                int var11 = this.field1562 + var4;
                int var12 = this.field1553 + var4;
                int var13 = var12 >= -2048 ? var12 : var12 + 4096;
                int var14 = var11 < -2048 ? var11 + 4096 : var11;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = var13 > 2048 ? var13 - 4096 : var13;
                int var17 = var10 >= -2048 ? var10 : var10 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method829(var15, var9, -4096) || this.method828(var18, var16, (byte) -56) ? 4096 : 0;
            }
        }
        if (arg1 != -62) {
            field1557 = -117;
        }
        return var3;
    }
}
