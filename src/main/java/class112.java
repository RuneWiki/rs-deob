import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class112 {

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "[J")
    private long[] field1729 = new long[8];

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "[B")
    private byte[] field1728 = new byte[64];

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "[J")
    private long[] field1733 = new long[8];

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "[J")
    private long[] field1731 = new long[8];

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    private int field1736 = 0;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    private int field1737 = 0;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "[J")
    private long[] field1734 = new long[8];

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "[J")
    private long[] field1738 = new long[8];

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "[B")
    private byte[] field1740 = new byte[32];

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "[S")
    public static short[] field1732;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([BJI)V")
    public final void method902(byte[] arg0, long arg1, int arg2) {
        field1735++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field1736 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        int var12 = 84 / ((34 - arg2) / 60);
        while (var10 >= 0) {
            int var17 = (this.field1740[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field1740[var10] = (byte) var17;
            var11 = var17 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg1 > 8L) {
            int var16 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var16 < 0 || var16 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field1728[this.field1737] = (byte) method903(this.field1728[this.field1737], var16 >>> var7);
            this.field1736 += 8 - var7;
            this.field1737++;
            if (this.field1736 == 512) {
                this.method906((byte) 58);
                this.field1736 = this.field1737 = 0;
            }
            this.field1728[this.field1737] = (byte) class636.method3603(255, var16 << 8 - var7);
            arg1 -= 8L;
            var5++;
            this.field1736 += var7;
        }
        int var13;
        if (arg1 <= 0L) {
            var13 = 0;
        } else {
            var13 = arg0[var5] << var6 & 0xFF;
            this.field1728[this.field1737] = (byte) method903(this.field1728[this.field1737], var13 >>> var7);
        }
        if (((long) var7 + arg1) < 8L) {
            this.field1736 = (int) ((long) this.field1736 + arg1);
            return;
        }
        this.field1737++;
        this.field1736 += 8 - var7;
        long var14 = arg1 - (long) (8 - var7);
        if (this.field1736 == 512) {
            this.method906((byte) 58);
            this.field1736 = this.field1737 = 0;
        }
        this.field1728[this.field1737] = (byte) class636.method3603(255, var13 << 8 - var7);
        this.field1736 += (int) var14;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)I")
    public static int method903(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
    public final void method904(int arg0) {
        field1739++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field1740[var2] = 0;
        }
        this.field1728[0] = 0;
        this.field1736 = this.field1737 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field1738[var3] = 0L;
        }
        if (arg0 != 255) {
            this.field1738 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([BII)V")
    public final void method905(byte[] arg0, int arg1, int arg2) {
        this.field1728[this.field1737] = (byte) method903(this.field1728[this.field1737], 0x80 >>> class636.method3603(this.field1736, 7));
        field1742++;
        this.field1737++;
        if (this.field1737 > 32) {
            while (true) {
                if (this.field1737 >= 64) {
                    this.method906((byte) 58);
                    this.field1737 = 0;
                    break;
                }
                this.field1728[this.field1737++] = 0;
            }
        }
        while (this.field1737 < 32) {
            this.field1728[this.field1737++] = 0;
        }
        class571.method3313(this.field1740, 0, this.field1728, 32, 32);
        this.method906((byte) 58);
        if (arg2 < 109) {
            return;
        }
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field1738[var4];
            arg0[var5] = (byte) ((int) (var6 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
    private final void method906(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field1729[var2] = class22.method120(class399.method2467(255L, (long) this.field1728[var3 + 7]), class22.method120(class399.method2467((long) this.field1728[var3 + 6], 255L) << 8, class22.method120(class399.method2467(0xFFL << 16, (long) this.field1728[var3 + 5] << 16), class22.method120(class399.method2467(0xFFL << 24, (long) this.field1728[var3 + 4] << 24), class22.method120(class22.method120(class22.method120(class399.method2467(255L, (long) this.field1728[var3 + 1]) << 48, (long) this.field1728[var3] << 56), class399.method2467(255L, (long) this.field1728[var3 + 2]) << 40), class399.method2467(255L, (long) this.field1728[var3 + 3]) << 32)))));
            var2++;
            var3 += 8;
        }
        field1727++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field1731[var4] = class22.method120(this.field1729[var4], this.field1734[var4] = this.field1738[var4]);
        }
        if (arg0 != 58) {
            this.field1738 = null;
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field1733[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field1733[var7] = class22.method120(this.field1733[var7], class265.field4128[var13][class636.method3603(255, (int) (this.field1734[class636.method3603(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1734[var8] = this.field1733[var8];
            }
            this.field1734[0] = class22.method120(this.field1734[0], class265.field4124[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field1733[var9] = this.field1734[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field1733[var9] = class22.method120(this.field1733[var9], class265.field4128[var11][class636.method3603(255, (int) (this.field1731[class636.method3603(var9 - var11, 7)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field1731[var10] = this.field1733[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field1738[var6] = class22.method120(this.field1738[var6], class22.method120(this.field1731[var6], this.field1729[var6]));
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
    public static void method907(byte arg0) {
        field1732 = null;
        if (arg0 != 61) {
            field1741 = -49;
        }
    }
}
