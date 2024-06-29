import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class118 {

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public int field1584 = -1;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "Z")
    public boolean field1592 = true;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    private int field1598 = 0;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public int field1595 = 128;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Ljm;")
    public static class485 field1583 = new class485(8, -1);

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field1593 = -1;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "Lfg;")
    public static class83 field1591 = new class83(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "F")
    public static float field1588;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "Lrf;")
    public static class57 field1585;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILlh;I)V", line = 3)
    private final void method745(int arg0, class365 arg1, int arg2) {
        field1590++;
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 1) {
            this.field1598 = arg1.method2111(arg2 - 4);
            this.method748(256, this.field1598);
        } else if (arg0 == 2) {
            this.field1584 = arg1.method2062((byte) 14);
            if (this.field1584 != 65535) {
                return;
            }
            this.field1584 = -1;
        } else if (arg0 == 3) {
            this.field1595 = arg1.method2062((byte) 14) << 0;
            return;
        } else if (arg0 == 4) {
            this.field1592 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 54)
    public static final void method746(int arg0) {
        if (class510.field7495 < 1024.0F) {
            class510.field7495 = 1024.0F;
        }
        field1587++;
        if (class510.field7495 > 3072.0F) {
            class510.field7495 = 3072.0F;
        }
        while (class40.field553 >= 16384.0F) {
            class40.field553 -= 16384.0F;
        }
        while (class40.field553 < 0.0F) {
            class40.field553 += 16384.0F;
        }
        int var1 = class254.field3530 >> 7;
        int var2 = class67.field934 >> 7;
        if (arg0 >= -1) {
            field1585 = null;
        }
        int var3 = class186.method1118(class254.field3530, class67.field934, 12840, class400.field5571);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && class442.field6435 - 4 > var1 && var2 < (class232.field3217 - 4)) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class400.field5571;
                    if (var7 < 3 && class426.method2553(var6, var5, 1)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class225.field3173.field7615 != null && class225.field3173.field7615[var7] != null) {
                        var8 = (class225.field3173.field7615[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 - (class383.field5391[var7].method221(var5, var6) - var8);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class277.field3741) {
            class277.field3741 += (var10 - class277.field3741) / 24;
        } else if (class277.field3741 > var10) {
            class277.field3741 += (var10 - class277.field3741) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V", line = 138)
    public static void method747(int arg0) {
        field1583 = null;
        field1585 = null;
        field1591 = null;
        if (arg0 != -283863673) {
            field1583 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V", line = 155)
    private final void method748(int arg0, int arg1) {
        field1596++;
        double var3 = (double) ((arg1 & 0xFF0C03) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field1586 = (int) (var15 * 256.0D);
        this.field1597 = (int) ((double) arg0 * var17);
        double var19 = var13 / 6.0D;
        if ((var17 > 0.5D)) {
            this.field1589 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1589 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1597 < 0) {
            this.field1597 = 0;
        } else if (this.field1597 > 255) {
            this.field1597 = 255;
        }
        if (this.field1586 < 0) {
            this.field1586 = 0;
        } else if (this.field1586 > 255) {
            this.field1586 = 255;
        }
        if (this.field1589 < 1) {
            this.field1589 = 1;
        }
        this.field1599 = (int) ((double) this.field1589 * var19);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILlh;)V", line = 251)
    public final void method749(int arg0, class365 arg1) {
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                if (arg0 != -28791) {
                    this.field1598 = -81;
                }
                field1594++;
                return;
            }
            this.method745(var3, arg1, 2);
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)I", line = 280)
    public static int method750(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
