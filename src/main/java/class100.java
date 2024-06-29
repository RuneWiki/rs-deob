import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class100 extends class204 {

    @OriginalMember(owner = "client!se", name = "y", descriptor = "[I")
    private final int[] field1707 = new int[this.field3373];

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lph;")
    private static class229 field1700 = class266.method1858("Loading title screen )2 ", 0);

    @OriginalMember(owner = "client!se", name = "A", descriptor = "Lph;")
    public static class229 field1709 = field1700;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field1717 = 0;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    private int field1708;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[B")
    private byte[] field1703;

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class100(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field3373; var7++) {
            this.field1707[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lsi;ILsi;II)Lmf;", line = 25)
    public static final class31 method766(class66 arg0, int arg1, class66 arg2, int arg3, int arg4) {
        field1704++;
        if (class176.method1264(arg1, (byte) 69, arg2, arg3)) {
            if (arg4 != 0) {
                field1718 = 87;
            }
            return class72.method564(-101, arg0.method523(arg4 ^ -77, arg3, arg1));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BJ)Lph;", line = 52)
    public static final class229 method767(byte arg0, long arg1) {
        field1715++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else if (arg0 <= 2) {
            return (class229) null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class58.field819[(int) (var7 - (arg1 * 37L))];
            }
            class229 var9 = new class229();
            var9.field3772 = var6;
            var9.field3785 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 96)
    public static final void method768(byte arg0) {
        class265.field4460.method1415(-18218);
        field1712++;
        if (arg0 < 126) {
            field1709 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V", line = 114)
    public final void method487(int arg0) {
        field1719++;
        this.field1711 = Math.abs(this.field1711);
        if (this.field1711 >= 4096) {
            this.field1711 = 4095;
        }
        this.method17(this.field1708++, (byte) (this.field1711 >> 4));
        if (arg0 == -1331241396) {
            this.field1711 = 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)I", line = 136)
    public static final int method769(int arg0, byte arg1) {
        if (class121.field2031 != null) {
            class121.field2031.method534(-1);
            class121.field2031 = null;
        }
        if (arg1 != -17) {
            method767((byte) 94, 70L);
        }
        class226.field3711++;
        field1705++;
        if (class226.field3711 > 4) {
            class226.field3711 = 0;
            class149.field2414 = 0;
            return arg0;
        }
        if (class313.field5273 == class148.field2387) {
            class313.field5273 = class196.field3276;
        } else {
            class313.field5273 = class148.field2387;
        }
        class149.field2414 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 179)
    public final void method490(int arg0) {
        this.field1711 = 0;
        this.field1708 = 0;
        field1716++;
        int var2 = -92 % ((arg0 + 46) / 60);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IB)V", line = 199)
    public void method17(int arg0, byte arg1) {
        this.field1703[this.field1708++] = (byte) (class243.method1696(127, arg1 >> 1) + 127);
        field1713++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 207)
    public final void method486(int arg0, int arg1, int arg2) {
        if (arg2 != -13897) {
            method773((byte) 51);
        }
        field1701++;
        this.field1711 += this.field1707[arg1] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I", line = 218)
    public static final int method770(int arg0, int arg1) {
        field1710++;
        return arg0 == 0 ? arg1 & 0xFF : -92;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V", line = 235)
    public static final void method771(int arg0) {
        field1706++;
        class321.method2177();
        if (arg0 != 8978) {
            field1700 = (class229) null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class160.field2592[var1].method818(arg0 ^ 0xFFFFDC84);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V", line = 254)
    public static void method772(int arg0) {
        field1700 = null;
        field1709 = null;
        if (arg0 <= 45) {
            method770(31, -31);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V", line = 265)
    public static final void method773(byte arg0) {
        class105.field1779 = null;
        class260.field4346 = null;
        if (arg0 != 114) {
            field1718 = -96;
        }
        class239.field3954 = null;
        class234.field3864 = null;
        field1702++;
        class74.field1250 = null;
        class37.field602 = null;
        class221.field3625 = null;
        class69.field1102 = null;
        class213.field3517 = null;
        class217.field3558 = null;
        class307.field5182 = null;
        class237.field3905 = null;
        class300.field4872 = null;
        class256.field4272 = null;
        class243.field4014 = null;
        class314.field5342 = null;
        class58.field820 = null;
        class325.field5552 = null;
        class181.field2959 = null;
        class303.field5060 = null;
        class250.field4161 = null;
        class250.field4160 = null;
        class145.field2355 = null;
    }
}
