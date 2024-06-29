import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class335 extends class199 {

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "I")
    private int field5232 = 4096;

    @OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
    private int field5237 = 4096;

    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "I")
    private int field5240 = 4096;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "[I")
    public static int[] field5230 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ca", name = "ab", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ca", name = "bb", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ca", name = "db", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ca", name = "eb", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "Ltj;")
    public static class354 field5234;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V", line = 4)
    public static void method2337(int arg0) {
        if (arg0 != 0) {
            method2340(59, (byte) -94);
        }
        field5234 = null;
        field5230 = null;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)Lfg;", line = 24)
    public static final class352 method2338(byte arg0) {
        field5228++;
        if (class38.field457 == null) {
            return null;
        }
        int var1 = 81 % ((38 - arg0) / 42);
        class271.field3887.method1129(-16646, class38.field457);
        class352 var2 = (class352) class271.field3887.method1128((byte) -79);
        class287 var3 = class282.method1924(true, var2.field5493);
        return var3 != null && var3.field4149 && var3.method1968(-1) ? var2 : class288.method1978(2048);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(II)I", line = 48)
    public static int method2339(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLfd;I)V", line = 56)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field5231++;
        if (arg0 != -43) {
            method2338((byte) -4);
        }
        if (arg2 == 0) {
            this.field5237 = arg1.method2083((byte) -16);
        } else if (arg2 == 1) {
            this.field5232 = arg1.method2083((byte) -94);
        } else if (arg2 == 2) {
            this.field5240 = arg1.method2083((byte) -46);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 105)
    public class335() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Lvd;", line = 110)
    public static final class355 method2340(int arg0, byte arg1) {
        field5233++;
        class355 var2 = (class355) class210.field2973.method2265((long) arg0, (byte) -121);
        if (var2 != null) {
            return var2;
        } else if (arg1 >= -46) {
            return (class355) null;
        } else {
            byte[] var3 = class351.field5488.method1089(31, (byte) 120, arg0);
            class355 var4 = new class355();
            if (var3 != null) {
                var4.method2472(true, new class299(var3), arg0);
            }
            class210.field2973.method2257(-127, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lfh;III)[Lma;", line = 138)
    public static final class145[] method2341(class140 arg0, int arg1, int arg2, int arg3) {
        int var4 = -95 / ((-arg2 - 58) / 53);
        field5235++;
        return class134.method1020(1, arg0, arg1, arg3) ? class359.method2495(0) : null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[[I", line = 152)
    public final int[][] method215(int arg0, int arg1) {
        field5229++;
        if (arg1 != -29869) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field2796.method2187(arg0, -62);
        if (this.field2796.field4667) {
            int[][] var4 = this.method1459(0, arg0, (byte) -51);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class95.field1235; var11++) {
                int var12 = var6[var11];
                int var13 = var9[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var7[var11] = this.field5237 * var12 >> 12;
                    var8[var11] = this.field5232 * var13 >> 12;
                    var10[var11] = this.field5240 * var14 >> 12;
                } else {
                    var7[var11] = this.field5237;
                    var8[var11] = this.field5232;
                    var10[var11] = this.field5240;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(II)I", line = 224)
    public static final int method2342(int arg0, int arg1) {
        if (arg0 != -31511) {
            field5227 = -1;
        }
        int var2 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xB3333333);
        field5238++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
