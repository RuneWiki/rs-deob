import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class82 extends class213 {

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    private int field1576 = -1;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    private int field1583 = 0;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "Lvd;")
    public static class222 field1572 = class212.method1357("mapfunction", 10731);

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "[I")
    public static int[] field1579 = new int[99];

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "Z")
    public static boolean field1582;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "[Lvd;")
    public static class222[] field1581;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILka;)V")
    private final void method534(int arg0, int arg1, int arg2, class109 arg3) {
        if (arg1 == 1) {
            this.field1583 = arg3.method701(869322848);
            this.method539(this.field1583, arg0 - 406647416);
        } else if (arg1 == 2) {
            this.field1576 = arg3.method675(arg0 - 22310);
            if (this.field1576 == 65535) {
                this.field1576 = -1;
            }
        } else if (arg1 == 3) {
            arg3.method675(2);
        }
        field1577++;
        if (arg0 != 22312) {
            field1581 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    public static final void method535(int arg0) {
        for (int var1 = arg0; var1 < class38.field859; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class122.field2328[var1];
            }
            class38 var6 = class54.field1024[var5];
            if (var6 != null && var6.field1376 > 0) {
                var6.field1376--;
                if (var6.field1376 == 0) {
                    var6.field1374 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class173.field3263; var2++) {
            int var3 = class113.field2123[var2];
            class193 var4 = class202.field3696[var3];
            if (var4 != null && var4.field1376 > 0) {
                var4.field1376--;
                if (var4.field1376 == 0) {
                    var4.field1374 = null;
                }
            }
        }
        field1573++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILka;I)V")
    public final void method536(int arg0, class109 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method662((byte) -108);
            if (var4 == 0) {
                field1569++;
                if (arg0 != -3) {
                    field1579 = null;
                    return;
                }
                return;
            }
            this.method534(arg0 ^ 0xFFFFA8D5, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1579 = null;
        field1572 = null;
        if (arg0 != 16752821) {
            method537(-75);
        }
        field1581 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIBI)V")
    public static final void method538(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1575++;
        if (arg2 >= class112.field2107 && arg3 <= class127.field2448 && arg5 >= class129.field2514 && class230.field4322 >= arg1) {
            class217.method1378(arg5, -1, arg0, arg1, arg3, arg2);
        } else {
            class192.method1199(-16092, arg0, arg3, arg1, arg5, arg2);
        }
        if (arg4 != -9) {
            method538(-88, -55, -103, -123, (byte) -32, -78);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
    private final void method539(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field1578++;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1 != -406625104) {
            method537(88);
        }
        double var9 = var3;
        double var11 = var3;
        if (var3 < var7) {
            var11 = var7;
        }
        if (var7 < var3) {
            var9 = var7;
        }
        if (var9 > var5) {
            var9 = var5;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var11 < var5) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field1580 = (int) (var17 * 256.0D);
        if (this.field1580 < 0) {
            this.field1580 = 0;
        } else if (this.field1580 > 255) {
            this.field1580 = 255;
        }
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (-var9 + var11) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field1570 = (int) (var15 * 256.0D);
        if (this.field1570 < 0) {
            this.field1570 = 0;
        } else if (this.field1570 > 255) {
            this.field1570 = 255;
        }
        if (var17 > 0.5D) {
            this.field1574 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1574 = (int) (var15 * var17 * 512.0D);
        }
        double var19 = var13 / 6.0D;
        if (this.field1574 < 1) {
            this.field1574 = 1;
        }
        this.field1571 = (int) ((double) this.field1574 * var19);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1579[var1] = var0 / 4;
        }
        field1582 = false;
        field1581 = new class222[100];
    }
}
