import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class97 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    private int field1526 = 0;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    private int field1525 = -1;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Z")
    public static volatile boolean field1528 = false;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1523 = 0;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1524 = 0;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field1538 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfj;BI)V")
    public final void method691(class274 arg0, byte arg1, int arg2) {
        int var4 = 60 % ((-arg1 - 46) / 33);
        while (true) {
            int var5 = arg0.method1849(255);
            if (var5 == 0) {
                field1521++;
                return;
            }
            this.method694((byte) 83, var5, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lgi;BLgi;)V")
    public static final void method692(class164 arg0, byte arg1, class164 arg2) {
        field1530++;
        class183.field3043 = class13.method111(-21486, 0, arg0, arg2, class288.field4663);
        class268.field4336 = (class190) class183.field3043;
        class207.field3313 = class13.method111(-21486, 0, arg0, arg2, class80.field1301);
        int var3 = -79 % ((36 - arg1) / 55);
        class170.field2792 = class13.method111(-21486, 0, arg0, arg2, class41.field620);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
    private final void method693(byte arg0, int arg1) {
        int var3 = -31 / ((73 - arg0) / 53);
        field1532++;
        double var4 = (double) ((arg1 & 0xFF0F93) >> 16) / 256.0D;
        double var6 = (double) ((arg1 & 0xFF93) >> 8) / 256.0D;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var4;
        if (var6 > var4) {
            var10 = var6;
        }
        double var12 = 0.0D;
        if (var8 > var10) {
            var10 = var8;
        }
        double var14 = 0.0D;
        double var16 = var4;
        if (var6 < var4) {
            var16 = var6;
        }
        if (var16 > var8) {
            var16 = var8;
        }
        double var18 = (var10 + var16) / 2.0D;
        this.field1522 = (int) (var18 * 256.0D);
        if (var10 != var16) {
            if (var18 < 0.5D) {
                var12 = (var10 - var16) / (var10 + var16);
            }
            if (var18 >= 0.5D) {
                var12 = (var10 - var16) / (2.0D - var10 - var16);
            }
            if (var4 == var10) {
                var14 = (var6 - var8) / (var10 - var16);
            } else if (var6 == var10) {
                var14 = (var8 - var4) / (var10 - var16) + 2.0D;
            } else if (var8 == var10) {
                var14 = (var4 - var6) / (var10 - var16) + 4.0D;
            }
        }
        if (this.field1522 < 0) {
            this.field1522 = 0;
        } else if (this.field1522 > 255) {
            this.field1522 = 255;
        }
        double var20 = var14 / 6.0D;
        if (var18 > 0.5D) {
            this.field1536 = (int) ((1.0D - var18) * var12 * 512.0D);
        } else {
            this.field1536 = (int) (var12 * var18 * 512.0D);
        }
        this.field1529 = (int) (var12 * 256.0D);
        if (this.field1529 < 0) {
            this.field1529 = 0;
        } else if (this.field1529 > 255) {
            this.field1529 = 255;
        }
        if (this.field1536 < 1) {
            this.field1536 = 1;
        }
        this.field1531 = (int) ((double) this.field1536 * var20);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BILfj;I)V")
    private final void method694(byte arg0, int arg1, class274 arg2, int arg3) {
        field1535++;
        if (arg1 == 1) {
            this.field1526 = arg2.method1812(true);
            this.method693((byte) -117, this.field1526);
        } else if (arg1 == 2) {
            this.field1525 = arg2.method1837(252);
            if (this.field1525 == 65535) {
                this.field1525 = -1;
            }
        } else if (arg1 == 3) {
            arg2.method1837(arg0 ^ 0xAF);
        }
        if (arg0 != 83) {
            method696((byte) 29, false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static final void method695(int arg0) {
        class57.field830 = 0;
        field1538 = 0;
        class173.method1233(true);
        class53.method331(0);
        class59.method383((byte) -37);
        field1527++;
        class124.method852(94);
        int var1 = 0;
        int var2 = 104 / ((63 - arg0) / 44);
        while (field1538 > var1) {
            int var4 = class75.field1214[var1];
            if (class274.field4472 != class28.field494[var4].field907) {
                if (class28.field494[var4].field215 > 0) {
                    class48.method316(class28.field494[var4], 97);
                }
                class28.field494[var4] = null;
            }
            var1++;
        }
        if (class271.field4366 != class229.field3584.field4458) {
            throw new RuntimeException("gpp1 pos:" + class229.field3584.field4458 + " psize:" + class271.field4366);
        }
        for (int var3 = 0; var3 < class134.field2172; var3++) {
            if (class28.field494[class111.field1708[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class134.field2172);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
    public static final void method696(byte arg0, boolean arg1) {
        field1537++;
        for (class273 var2 = (class273) class203.field3282.method1553(true); var2 != null; var2 = (class273) class203.field3282.method1551(0)) {
            if (var2.field4413 != null) {
                class89.field1397.method1357(var2.field4413);
                var2.field4413 = null;
            }
            if (var2.field4419 != null) {
                class89.field1397.method1357(var2.field4419);
                var2.field4419 = null;
            }
            var2.method952((byte) 119);
        }
        if (arg0 <= 66) {
            method692((class164) null, (byte) -71, (class164) null);
        }
        if (!arg1) {
            return;
        }
        for (class273 var3 = (class273) class66.field1071.method1553(true); var3 != null; var3 = (class273) class66.field1071.method1551(0)) {
            if (var3.field4413 != null) {
                class89.field1397.method1357(var3.field4413);
                var3.field4413 = null;
            }
            var3.method952((byte) 109);
        }
        for (class273 var4 = (class273) class33.field546.method379(-21146); var4 != null; var4 = (class273) class33.field546.method369(true)) {
            if (var4.field4413 != null) {
                class89.field1397.method1357(var4.field4413);
                var4.field4413 = null;
            }
            var4.method952((byte) 24);
        }
    }
}
