import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class120 extends class23 {

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field1697 = -1;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lui;")
    public static class375 field1690 = new class375("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "F")
    public float field1693;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "F")
    public float field1698;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "F")
    public float field1699;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "F")
    public float field1701;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "F")
    public float field1704;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "F")
    public float field1708;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "F")
    public float field1710;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "F")
    public float field1712;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "F")
    public float field1717;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "F")
    public float field1718;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "F")
    public float field1719;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "F")
    public float field1720;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public static final void method769(byte arg0) {
        field1692++;
        class115.method745(class337.field5242, (long) class405.field6116, (byte) 66);
        if (class329.field5062 != -1) {
            class201.method1404(class329.field5062, -127);
        }
        for (int var1 = 0; var1 < class425.field6335; var1++) {
            if (class326.field5002[var1]) {
                class527.field7783[var1] = true;
            }
            class15.field252[var1] = class326.field5002[var1];
            class326.field5002[var1] = false;
        }
        if (arg0 > -52) {
            return;
        }
        class336.field5233 = class405.field6116;
        if (class337.field5242.method1132()) {
            class369.field5663 = true;
        }
        if (class329.field5062 != -1) {
            class425.field6335 = 0;
            class309.method1992((byte) -113);
        }
        class337.field5242.method1107();
        class35.method262(class170.field2470, (byte) 87);
        class501.field7485 = 0;
    }

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "(III)V")
    public final void method185(int arg0, int arg1, int arg2) {
        this.field1719 = arg2;
        field1705++;
        this.field1699 = this.field1712 = this.field1710 = this.field1718 = this.field1693 = this.field1717 = 0.0F;
        this.field1704 = this.field1698 = this.field1708 = 1.0F;
        this.field1720 = arg0;
        this.field1701 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "(IIIIII)V")
    public final void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1691++;
        float var7 = class165.field2405[arg3 & 0x3FFF];
        float var8 = class165.field2400[arg3 & 0x3FFF];
        float var9 = class165.field2405[arg4 & 0x3FFF];
        float var10 = class165.field2400[arg4 & 0x3FFF];
        float var11 = class165.field2405[arg5 & 0x3FFF];
        float var12 = class165.field2400[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1710 = var7 * var12;
        this.field1699 = -var9 * var12 + var10 * var13;
        this.field1704 = var9 * var11 + var10 * var14;
        this.field1717 = var9 * var13 + var10 * var12;
        this.field1708 = var7 * var9;
        this.field1693 = -var10 * var11 + var9 * var14;
        this.field1712 = var7 * var10;
        this.field1718 = -var8;
        this.field1698 = var7 * var11;
        this.field1720 = (float) (-arg0) * this.field1704 - ((float) arg1 * this.field1710) - ((float) arg2 * this.field1693);
        this.field1701 = (float) (-arg0) * this.field1699 - ((float) arg1 * this.field1698) - (float) arg2 * this.field1717;
        this.field1719 = (float) (-arg0) * this.field1712 - ((float) arg1 * this.field1718) - (float) arg2 * this.field1708;
    }

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "(I)V")
    public final void method175(int arg0) {
        this.field1698 = 1.0F;
        field1702++;
        this.field1704 = this.field1708 = class165.field2405[arg0 & 0x3FFF];
        this.field1693 = class165.field2400[arg0 & 0x3FFF];
        this.field1712 = -this.field1693;
        this.field1710 = this.field1720 = this.field1699 = this.field1717 = this.field1701 = this.field1718 = this.field1719 = 0.0F;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static void method770(boolean arg0) {
        if (!arg0) {
            method776(null, -67);
        }
        field1690 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)[F")
    public final float[] method771(int arg0) {
        class77.field1062[6] = this.field1718;
        class77.field1062[5] = this.field1698;
        class77.field1062[13] = this.field1701;
        class77.field1062[12] = this.field1720;
        class77.field1062[14] = this.field1719;
        field1694++;
        class77.field1062[8] = this.field1693;
        class77.field1062[10] = this.field1708;
        class77.field1062[arg0] = this.field1704;
        class77.field1062[2] = this.field1712;
        class77.field1062[1] = this.field1699;
        class77.field1062[9] = this.field1717;
        class77.field1062[4] = this.field1710;
        return class77.field1062;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BZLrk;)V")
    public static final void method772(byte arg0, boolean arg1, class194 arg2) {
        field1716++;
        if (class12.field201 >= 400) {
            return;
        }
        int var3 = 11 / ((40 - arg0) / 63);
        class329 var4 = arg2.field2768;
        if (var4.field5068 != null) {
            var4 = var4.method2125(class36.field583, false);
            if (var4 == null) {
                return;
            }
        }
        if (!var4.field5088) {
            return;
        }
        String var5 = var4.field5080;
        if (var4.field5039 != 0) {
            String var6 = class393.field5983 == class259.field3610 ? class410.field6172.method2335((byte) -100, class288.field4292) : class371.field5698.method2335((byte) -100, class288.field4292);
            var5 = var5 + class483.method2883(class339.field5365.field4930, var4.field5039, 29424) + " (" + var6 + var4.field5039 + ")";
        }
        if (!class500.field7455) {
            if (!arg1) {
                String[] var7 = var4.field5096;
                if (class124.field1774) {
                    var7 = class428.method2566(var7, 5);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (class393.field5983 != class23.field352 || !var7[var8].equalsIgnoreCase(class313.field4775.method2335((byte) -100, class288.field4292)))) {
                            byte var9 = 0;
                            if (var8 == 0) {
                                var9 = 50;
                            }
                            int var10 = class286.field4260;
                            if (var8 == 1) {
                                var9 = 47;
                            }
                            if (var8 == 2) {
                                var9 = 8;
                            }
                            if (var8 == 3) {
                                var9 = 12;
                            }
                            if (var4.field5065 == var8) {
                                var10 = var4.field5043;
                            }
                            if (var8 == 4) {
                                var9 = 23;
                            }
                            if (var4.field5095 == var8) {
                                var10 = var4.field5077;
                            }
                            class294.method1898(-1, 0, (long) arg2.field5254, false, var10, true, var7[var8], "<col=ffff00>" + var5, 0, -1, var9);
                            class346.field5409++;
                        }
                    }
                }
                if (class393.field5983 == class23.field352 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class313.field4775.method2335((byte) -100, class288.field4292))) {
                            short var12 = 0;
                            if (var4.field5039 > class339.field5365.field4930) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 50;
                            }
                            if (var11 == 1) {
                                var13 = 47;
                            }
                            if (var11 == 2) {
                                var13 = 8;
                            }
                            if (var11 == 3) {
                                var13 = 12;
                            }
                            if (var11 == 4) {
                                var13 = 23;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class202.field2844++;
                            class294.method1898(-1, 0, (long) arg2.field5254, false, var4.field5034, true, var7[var11], "<col=ffff00>" + var5, 0, -1, var13);
                        }
                    }
                }
            }
            class294.method1898(-1, 0, (long) arg2.field5254, arg1, class107.field1517, true, class179.field2549.method2335((byte) -100, class288.field4292), "<col=ffff00>" + var5, 0, -1, 1009);
            class487.field7138++;
        } else if (!arg1) {
            class109 var14 = class57.field764 == -1 ? null : class209.field2960.method3083(class57.field764, 39);
            if ((class303.field4468 & 0x2) != 0) {
                if (var14 == null || var4.method2120(-1, class57.field764, var14.field1532) != var14.field1532) {
                    class294.method1898(-1, 0, (long) arg2.field5254, false, class261.field3635, true, class266.field3714, class509.field7572 + " -> <col=ffff00>" + var5, 0, -1, 30);
                    class435.field6471++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "na", descriptor = "(I)V")
    public final void method186(int arg0) {
        field1706++;
        float var2 = class165.field2405[arg0 & 0x3FFF];
        float var3 = class165.field2400[arg0 & 0x3FFF];
        float var4 = this.field1699;
        float var5 = this.field1698;
        float var6 = this.field1717;
        this.field1699 = var2 * var4 - (this.field1712 * var3);
        float var7 = this.field1701;
        this.field1712 = this.field1712 * var2 + var3 * var4;
        this.field1698 = var2 * var5 - (this.field1718 * var3);
        this.field1717 = var2 * var6 - (this.field1708 * var3);
        this.field1718 = this.field1718 * var2 + var3 * var5;
        this.field1708 = this.field1708 * var2 + var3 * var6;
        this.field1701 = var2 * var7 - (this.field1719 * var3);
        this.field1719 = this.field1719 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "([I)V")
    public final void method176(int[] arg0) {
        field1714++;
        float var2 = (float) arg0[0] - this.field1720;
        float var3 = (float) arg0[1] - this.field1701;
        float var4 = (float) arg0[2] - this.field1719;
        arg0[1] = (int) (this.field1718 * var4 + this.field1710 * var2 + this.field1698 * var3);
        arg0[2] = (int) (this.field1708 * var4 + this.field1717 * var3 + this.field1693 * var2);
        arg0[0] = (int) (this.field1712 * var4 + this.field1704 * var2 + this.field1699 * var3);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lia;I)V")
    public final void method773(class23 arg0, int arg1) {
        field1715++;
        class120 var3 = (class120) arg0;
        this.field1704 = var3.field1704;
        this.field1693 = var3.field1712;
        this.field1710 = var3.field1699;
        this.field1698 = var3.field1698;
        this.field1717 = var3.field1718;
        this.field1712 = var3.field1693;
        this.field1699 = var3.field1710;
        this.field1718 = var3.field1717;
        this.field1708 = var3.field1708;
        this.field1720 = -(this.field1693 * var3.field1719 + this.field1710 * var3.field1701 + this.field1704 * var3.field1720);
        this.field1701 = -(this.field1717 * var3.field1719 + this.field1699 * var3.field1720 + this.field1698 * var3.field1701);
        this.field1719 = -(this.field1708 * var3.field1719 + this.field1718 * var3.field1701 + this.field1712 * var3.field1720);
        if (arg1 != 1) {
            this.field1710 = -0.5113813F;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)[F")
    public final float[] method774(byte arg0) {
        class77.field1062[5] = this.field1698;
        class77.field1062[8] = this.field1693;
        class77.field1062[2] = this.field1712;
        class77.field1062[10] = this.field1708;
        field1703++;
        if (arg0 > -43) {
            this.field1701 = -1.5369457F;
        }
        class77.field1062[6] = this.field1718;
        class77.field1062[9] = this.field1717;
        class77.field1062[0] = this.field1704;
        class77.field1062[14] = 0.0F;
        class77.field1062[13] = 0.0F;
        class77.field1062[1] = this.field1699;
        class77.field1062[12] = 0.0F;
        class77.field1062[4] = this.field1710;
        return class77.field1062;
    }

    @OriginalMember(owner = "client!rc", name = "ZA", descriptor = "(III)V")
    public final void method177(int arg0, int arg1, int arg2) {
        this.field1701 += arg1;
        this.field1719 += arg2;
        this.field1720 += arg0;
        field1696++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIFFIIF)V")
    public final void method775(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6) {
        field1689++;
        if (arg5 == 0) {
            this.field1699 = this.field1712 = this.field1710 = this.field1718 = this.field1693 = this.field1717 = 0.0F;
            this.field1698 = arg0;
            this.field1704 = arg4;
            this.field1708 = 1.0F;
        } else {
            float var8 = class165.field2405[arg5 & 0x3FFF];
            float var9 = class165.field2400[arg5 & 0x3FFF];
            this.field1698 = (float) arg0 * var8;
            this.field1704 = (float) arg4 * var8;
            this.field1699 = (float) arg4 * var9;
            this.field1712 = this.field1718 = this.field1693 = this.field1717 = 0.0F;
            this.field1708 = 1.0F;
            this.field1710 = (float) arg0 * -var9;
        }
        this.field1719 = arg6;
        this.field1720 = arg2;
        this.field1701 = arg3;
        if (arg1 != 16383) {
            this.method177(-13, 124, -1);
        }
    }

    @OriginalMember(owner = "client!rc", name = "YA", descriptor = "(I)V")
    public final void method182(int arg0) {
        field1709++;
        this.field1704 = 1.0F;
        this.field1698 = this.field1708 = class165.field2405[arg0 & 0x3FFF];
        this.field1718 = class165.field2400[arg0 & 0x3FFF];
        this.field1717 = -this.field1718;
        this.field1710 = this.field1693 = this.field1720 = this.field1699 = this.field1701 = this.field1712 = this.field1719 = 0.0F;
    }

    @OriginalMember(owner = "client!rc", name = "ma", descriptor = "(I)V")
    public final void method178(int arg0) {
        field1707++;
        this.field1708 = 1.0F;
        this.field1704 = this.field1698 = class165.field2405[arg0 & 0x3FFF];
        this.field1699 = class165.field2400[arg0 & 0x3FFF];
        this.field1710 = -this.field1699;
        this.field1693 = this.field1720 = this.field1717 = this.field1701 = this.field1712 = this.field1718 = this.field1719 = 0.0F;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lmu;")
    public static final class213 method776(Canvas arg0, int arg1) {
        field1700++;
        try {
            Class var2 = Class.forName("oo");
            class213 var3 = (class213) var2.getDeclaredConstructor().newInstance();
            var3.method79(true, arg0);
            int var4 = 76 / ((arg1 + 37) / 52);
            return var3;
        } catch (Throwable var6) {
            class281 var5 = new class281();
            var5.method79(true, arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[I)V")
    public final void method174(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1708 + (float) arg0 * this.field1712 + (float) arg1 * this.field1718 + this.field1719);
        field1688++;
        arg3[1] = (int) ((float) arg2 * this.field1717 + (float) arg0 * this.field1699 + (float) arg1 * this.field1698 + this.field1701);
        arg3[0] = (int) ((float) arg2 * this.field1693 + (float) arg0 * this.field1704 + (float) arg1 * this.field1710 + this.field1720);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()Lia;")
    public final class23 method183() {
        field1711++;
        class120 var1 = new class120();
        var1.field1701 = this.field1701;
        var1.field1712 = this.field1712;
        var1.field1717 = this.field1717;
        var1.field1698 = this.field1698;
        var1.field1704 = this.field1704;
        var1.field1719 = this.field1719;
        var1.field1718 = this.field1718;
        var1.field1693 = this.field1693;
        var1.field1699 = this.field1699;
        var1.field1710 = this.field1710;
        var1.field1720 = this.field1720;
        var1.field1708 = this.field1708;
        return var1;
    }

    @OriginalMember(owner = "client!rc", name = "HA", descriptor = "()V")
    public final void method189() {
        this.field1699 = this.field1712 = this.field1710 = this.field1718 = this.field1693 = this.field1717 = this.field1720 = this.field1701 = this.field1719 = 0.0F;
        this.field1704 = this.field1698 = this.field1708 = 1.0F;
        field1721++;
    }

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "(III[I)V")
    public final void method188(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1708 + (float) arg0 * this.field1712 + (float) arg1 * this.field1718);
        arg3[0] = (int) ((float) arg2 * this.field1693 + (float) arg0 * this.field1704 + (float) arg1 * this.field1710);
        arg3[1] = (int) ((float) arg2 * this.field1717 + (float) arg0 * this.field1699 + (float) arg1 * this.field1698);
        field1713++;
    }

    @OriginalMember(owner = "client!rc", name = "ba", descriptor = "(Lia;)V")
    public final void method179(class23 arg0) {
        field1687++;
        class120 var2 = (class120) arg0;
        this.field1698 = var2.field1698;
        this.field1717 = var2.field1717;
        this.field1719 = var2.field1719;
        this.field1701 = var2.field1701;
        this.field1693 = var2.field1693;
        this.field1712 = var2.field1712;
        this.field1720 = var2.field1720;
        this.field1718 = var2.field1718;
        this.field1710 = var2.field1710;
        this.field1699 = var2.field1699;
        this.field1704 = var2.field1704;
        this.field1708 = var2.field1708;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public final void method181(int arg0) {
        field1695++;
        float var2 = class165.field2405[arg0 & 0x3FFF];
        float var3 = class165.field2400[arg0 & 0x3FFF];
        float var4 = this.field1704;
        float var5 = this.field1710;
        float var6 = this.field1693;
        this.field1704 = this.field1712 * var3 + var2 * var4;
        float var7 = this.field1720;
        this.field1710 = this.field1718 * var3 + var2 * var5;
        this.field1712 = this.field1712 * var2 - var3 * var4;
        this.field1718 = this.field1718 * var2 - (var3 * var5);
        this.field1693 = this.field1708 * var3 + var2 * var6;
        this.field1720 = this.field1719 * var3 + var2 * var7;
        this.field1708 = this.field1708 * var2 - var3 * var6;
        this.field1719 = this.field1719 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class120() {
        this.method189();
    }

    static {
        new class375("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }
}
