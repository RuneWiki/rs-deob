import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class58 extends class51 {

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lea;")
    public static class38 field1446 = class9.method46((byte) 109, "mapscene");

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lea;")
    public static class38 field1451 = class9.method46((byte) 117, "scrollen:");

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lea;")
    public static class38 field1450 = class9.method46((byte) 106, "sl_stars");

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "Lea;")
    public static class38 field1457 = class9.method46((byte) 125, " x ");

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lea;")
    private static class38 field1449 = class9.method46((byte) 110, "glow1:");

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "Lea;")
    public static class38 field1447 = field1449;

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "Lea;")
    public static class38 field1459 = field1449;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "Ldd;")
    public static class32 field1448;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)V")
    public static final void method419(int arg0) {
        class90.field2056 = 0;
        ++field1456;
        class136.field2850 = 0;
        class101.method833((byte) -12);
        class139.method1000(arg0 + -13798);
        class137.method989((byte) 91);
        if (arg0 != 13896) {
            field1450 = null;
        }
        for (int var1 = 0; ~var1 > ~class136.field2850; ++var1) {
            int var3 = class39.field868[var1];
            if (~class45.field1098 != ~class105.field2343[var3].field381) {
                class105.field2343[var3].field2298 = null;
                class105.field2343[var3] = null;
            }
        }
        if (~class14.field285 != ~class192.field3794.field1620) {
            throw new RuntimeException("gnp1 pos:" + class192.field3794.field1620 + " psize:" + class14.field285);
        } else {
            for (int var2 = 0; ~class177.field3593 < ~var2; ++var2) {
                if (class105.field2343[class170.field3488[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class177.field3593);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "(I)V")
    public static void method420(int arg0) {
        field1450 = null;
        field1451 = null;
        field1446 = null;
        field1459 = null;
        if (arg0 < 56) {
            method420(-103);
        }
        field1447 = null;
        field1448 = null;
        field1449 = null;
        field1457 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class58() {
        this(0);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIII)I")
    public static final int method421(int arg0, int arg1, int arg2, int arg3) {
        ++field1455;
        if (arg1 != 1816459564) {
            return -64;
        } else {
            int var4 = -arg3 + 256;
            return ((arg2 & 65280) * var4 - -((arg0 & 65280) * arg3) & 16711680) + (-16711936 & (arg0 & 16711935) * arg3 + (16711935 & arg2) * var4) >> 8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.method422(255, arg0.method466(-26256544));
        }
        if (!arg2) {
            this.field1444 = -73;
        }
        ++field1460;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        if (arg0 <= 111) {
            return null;
        } else {
            ++field1453;
            int[][] var3 = super.field1292.method720(false, arg1);
            if (super.field1292.field2032) {
                int[] var4 = var3[0];
                int[] var5 = var3[2];
                int[] var6 = var3[1];
                for (int var7 = 0; class86.field2008 > var7; ++var7) {
                    var4[var7] = this.field1444;
                    var6[var7] = this.field1454;
                    var5[var7] = this.field1458;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V")
    private class58(int arg0) {
        super(0, false);
        this.method422(255, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
    private final void method422(int arg0, int arg1) {
        this.field1458 = arg1 << 4 & 4080;
        this.field1444 = (arg1 & 16711680) >> 12;
        ++field1452;
        this.field1454 = (65280 & arg1) >> 4;
        if (arg0 != 255) {
            this.field1458 = 40;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)I")
    public static final int method423(int arg0, int arg1) {
        ++field1461;
        int var2 = (1431655765 & arg1) - -(1431655765 & arg1 >>> 1);
        int var3 = (1932735283 & var2 >>> 2) + (var2 & 858993459);
        int var4 = 252645135 & (var3 >>> 4) + var3;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 != 1152557602) {
            method419(-58);
        }
        return var6 & 255;
    }
}
