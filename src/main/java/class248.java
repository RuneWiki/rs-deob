import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class248 extends class76 {

    @OriginalMember(owner = "client!uf", name = "rb", descriptor = "I")
    private int field4288 = -1;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "Lia;")
    public static class257 field4269 = class28.method234(83, ": ");

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field4272 = 2;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "[I")
    public static int[] field4274 = new int[25];

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "Lia;")
    public static class257 field4271 = class28.method234(93, "<col=ff0000>");

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "Lia;")
    public static class257 field4275 = class28.method234(-76, "document)3cookie=(R");

    @OriginalMember(owner = "client!uf", name = "qb", descriptor = "Lie;")
    public static class117 field4287 = new class117(50);

    @OriginalMember(owner = "client!uf", name = "tb", descriptor = "Z")
    public static boolean field4290 = true;

    @OriginalMember(owner = "client!uf", name = "sb", descriptor = "Lsc;")
    public static class56 field4289 = new class56(4096);

    @OriginalMember(owner = "client!uf", name = "ub", descriptor = "I")
    public static int field4291 = 0;

    @OriginalMember(owner = "client!uf", name = "xb", descriptor = "I")
    public static int field4294 = 0;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "I")
    private int field4277;

    @OriginalMember(owner = "client!uf", name = "hb", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!uf", name = "ib", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!uf", name = "jb", descriptor = "I")
    private int field4280;

    @OriginalMember(owner = "client!uf", name = "kb", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!uf", name = "lb", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!uf", name = "nb", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!uf", name = "ob", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!uf", name = "pb", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!uf", name = "wb", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!uf", name = "vb", descriptor = "Laa;")
    public static class85 field4292;

    @OriginalMember(owner = "client!uf", name = "mb", descriptor = "[I")
    private int[] field4283;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field4281;
        if (arg2 == 0) {
            this.field4288 = arg0.method1063(-17162);
        }
        if (arg1 > -86) {
            this.field4277 = 19;
        }
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)I")
    public final int method564(int arg0) {
        if (arg0 != -1) {
            field4294 = -72;
        }
        ++field4279;
        return this.field4288;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class248() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
    public static void method1622(byte arg0) {
        field4271 = null;
        if (arg0 < 82) {
            method1623((class229) null, (byte[]) null, -91, (byte) -6);
        }
        field4287 = null;
        field4292 = null;
        field4274 = null;
        field4275 = null;
        field4289 = null;
        field4269 = null;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
    public final void method557(int arg0) {
        super.method557(arg0);
        this.field4283 = null;
        ++field4270;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ls;[BIB)V")
    public static final void method1623(class229 arg0, byte[] arg1, int arg2, byte arg3) {
        ++field4285;
        class108 var4 = new class108();
        var4.field2018 = arg0;
        if (arg3 < -90) {
            var4.field2010 = 0;
            var4.field2016 = arg1;
            var4.field573 = (long) arg2;
            class33 var5 = class34.field659;
            synchronized (class34.field659) {
                class34.field659.method287(var4, 0);
            }
            class30.method251((byte) 105);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        if (arg1 <= 2) {
            return null;
        } else {
            int[][] var3 = super.field1485.method649(arg0, true);
            if (super.field1485.field1692 && this.method1627(64)) {
                int[] var4 = var3[0];
                int var5 = (~class13.field249 == ~this.field4277 ? arg0 : this.field4277 * arg0 / class13.field249) * this.field4280;
                int[] var6 = var3[2];
                int[] var7 = var3[1];
                if (class96.field1807 == this.field4280) {
                    for (int var8 = 0; ~var8 > ~class96.field1807; ++var8) {
                        int var9 = this.field4283[var5++];
                        var6[var8] = class30.method252(4080, var9 << 4);
                        var7[var8] = class30.method252(var9 >> 4, 4080);
                        var4[var8] = class30.method252(var9, 16711680) >> 12;
                    }
                } else {
                    for (int var10 = 0; var10 < class96.field1807; ++var10) {
                        int var11 = this.field4280 * var10 / class96.field1807;
                        int var12 = this.field4283[var5 - -var11];
                        var6[var10] = class30.method252(var12, 255) << 4;
                        var7[var10] = class30.method252(var12 >> 4, 4080);
                        var4[var10] = class30.method252(4080, var12 >> 12);
                    }
                }
            }
            ++field4273;
            return var3;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLmb;)V")
    public static final void method1624(byte arg0, class178 arg1) {
        if (arg0 != -89) {
            method1625(-40, -66, 99, 76, -65, 40, 15);
        }
        class160.field2806 = arg1;
        ++field4286;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4278;
        class12[] var7 = class156.field2719;
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class12 var9 = var7[var8];
            if (var9 != null && ~var9.field224 == -3) {
                class55.method420(arg4 >> 1, (-class244.field4232 + var9.field223 << 7) - -var9.field230, arg6 >> 1, (byte) -100, arg1, (var9.field237 - class231.field3878 << 7) - -var9.field221, var9.field233 * 2, arg2);
                if (~class74.field1441 < 0 && class7.field153 % 20 < 10) {
                    class241.field4190[var9.field220].method486(arg3 - -class74.field1441 + -12, arg0 - -class250.field4317 - 28);
                }
            }
        }
        if (arg5 != 147734087) {
            field4292 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)V")
    public static final void method1626(int arg0, byte arg1) {
        ++field4282;
        if (class31.method258(arg0, 0)) {
            class44[] var2 = class28.field539[arg0];
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class44 var5 = var2[var3];
                if (var5 != null) {
                    var5.field903 = 0;
                    var5.field955 = 0;
                }
            }
            int var4 = 62 % ((arg1 - 75) / 44);
        }
    }

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "(I)Z")
    private final boolean method1627(int arg0) {
        ++field4284;
        if (this.field4283 != null) {
            return true;
        } else {
            if (arg0 != 64) {
                this.method157(121, (byte) -126);
            }
            if (this.field4288 >= 0) {
                int var2 = class96.field1807;
                int var3 = class13.field249;
                int var4 = class143.field2510.method88(this.field4288, true) ? 64 : 128;
                this.field4283 = class143.field2510.method89(this.field4288, true);
                this.field4277 = var4;
                this.field4280 = var4;
                class91.method675(434406988, var3, var2);
                return this.field4283 != null;
            } else {
                return false;
            }
        }
    }
}
