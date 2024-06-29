import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class28 extends class44 {

    @OriginalMember(owner = "client!ec", name = "Fb", descriptor = "I")
    private int field795 = 0;

    @OriginalMember(owner = "client!ec", name = "Kb", descriptor = "I")
    private int field800 = 0;

    @OriginalMember(owner = "client!ec", name = "Pb", descriptor = "I")
    private int field805 = 128;

    @OriginalMember(owner = "client!ec", name = "xb", descriptor = "I")
    public int field787 = -1;

    @OriginalMember(owner = "client!ec", name = "Tb", descriptor = "[I")
    private int[] field809 = new int[6];

    @OriginalMember(owner = "client!ec", name = "Sb", descriptor = "I")
    private int field808 = 0;

    @OriginalMember(owner = "client!ec", name = "Xb", descriptor = "I")
    private int field813 = 128;

    @OriginalMember(owner = "client!ec", name = "Wb", descriptor = "[I")
    private int[] field812 = new int[6];

    @OriginalMember(owner = "client!ec", name = "Ab", descriptor = "La;")
    public static class1 field790 = class113.method934(-11538, "::noclip");

    @OriginalMember(owner = "client!ec", name = "Gb", descriptor = "La;")
    public static class1 field796 = class113.method934(-11538, "Nehmen");

    @OriginalMember(owner = "client!ec", name = "Cb", descriptor = "La;")
    public static class1 field792 = class113.method934(-11538, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ec", name = "Jb", descriptor = "La;")
    private static class1 field799 = class113.method934(-11538, "Loaded input handler");

    @OriginalMember(owner = "client!ec", name = "Bb", descriptor = "La;")
    public static class1 field791 = class113.method934(-11538, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ec", name = "Mb", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!ec", name = "Qb", descriptor = "La;")
    public static class1 field806 = class113.method934(-11538, " )2> @yel@");

    @OriginalMember(owner = "client!ec", name = "tb", descriptor = "La;")
    private static class1 field783 = class113.method934(-11538, "Loading textures )2 ");

    @OriginalMember(owner = "client!ec", name = "Nb", descriptor = "La;")
    private static class1 field803 = class113.method934(-11538, "level)2");

    @OriginalMember(owner = "client!ec", name = "wb", descriptor = "La;")
    public static class1 field786 = field803;

    @OriginalMember(owner = "client!ec", name = "Vb", descriptor = "La;")
    public static class1 field811 = class113.method934(-11538, "leuchten3:");

    @OriginalMember(owner = "client!ec", name = "Hb", descriptor = "La;")
    public static class1 field797 = field799;

    @OriginalMember(owner = "client!ec", name = "Eb", descriptor = "La;")
    public static class1 field794 = field783;

    @OriginalMember(owner = "client!ec", name = "sb", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ec", name = "ub", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ec", name = "yb", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ec", name = "zb", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ec", name = "Db", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!ec", name = "Ob", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ec", name = "Rb", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ec", name = "Ub", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!ec", name = "Ib", descriptor = "Lwb;")
    public static class133 field798;

    @OriginalMember(owner = "client!ec", name = "vb", descriptor = "Ljd;")
    public static class58 field785;

    @OriginalMember(owner = "client!ec", name = "Lb", descriptor = "[Le;")
    public static class25[] field801;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBLba;)V", line = 25)
    private final void method370(int arg0, byte arg1, class8 arg2) {
        if (arg1 > -100) {
            this.field808 = -55;
        }
        if (arg0 == 1) {
            this.field793 = arg2.method146(65280);
        } else if (arg0 == 2) {
            this.field787 = arg2.method146(65280);
        } else if (arg0 == 4) {
            this.field805 = arg2.method146(65280);
        } else if (arg0 == 5) {
            this.field813 = arg2.method146(65280);
        } else if (arg0 == 6) {
            this.field808 = arg2.method146(65280);
        } else if (arg0 == 7) {
            this.field800 = arg2.method145(false);
        } else if (arg0 == 8) {
            this.field795 = arg2.method145(false);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field809[arg0 - 40] = arg2.method146(65280);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field812[arg0 - 50] = arg2.method146(65280);
        }
        field804++;
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V", line = 73)
    public static void method371(int arg0) {
        if (arg0 != -3254) {
            method371(-111);
        }
        field791 = null;
        field798 = null;
        field797 = null;
        field783 = null;
        field801 = null;
        field785 = null;
        field799 = null;
        field806 = null;
        field794 = null;
        field811 = null;
        field790 = null;
        field786 = null;
        field803 = null;
        field796 = null;
        field792 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lpa;", line = 101)
    public final class91 method372(int arg0, int arg1) {
        field788++;
        class91 var3 = (class91) class74.field1844.method264((long) this.field810, (byte) 50);
        if (var3 == null) {
            var3 = class91.method801(class76.field1904, this.field793, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field809[0] != 0) {
                    var3.method774(this.field809[var4], this.field812[var4]);
                }
            }
            var3.method781();
            var3.method773(this.field800 + 64, this.field795 + 850, -30, -50, -30, true);
            class74.field1844.method263(-7208, (long) this.field810, var3);
        }
        class91 var5;
        if (this.field787 == -1 || arg0 == -1) {
            var5 = var3.method777(true);
        } else {
            var5 = class4.method104(this.field787, 2).method494((byte) -87, var3, arg0);
        }
        if (arg1 != 2) {
            return null;
        }
        if (this.field805 != 128 || this.field813 != 128) {
            var5.method792(this.field805, this.field813, this.field805);
        }
        if (this.field808 != 0) {
            if (this.field808 == 90) {
                var5.method784();
            }
            if (this.field808 == 180) {
                var5.method784();
                var5.method784();
            }
            if (this.field808 == 270) {
                var5.method784();
                var5.method784();
                var5.method784();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lbd;BLa;La;)[Le;", line = 171)
    public static final class25[] method373(class11 arg0, byte arg1, class1 arg2, class1 arg3) {
        field782++;
        int var4 = arg0.method229(0, arg2);
        if (arg1 > -53) {
            field783 = null;
        }
        int var5 = arg0.method225(-118, var4, arg3);
        return class50.method520(7729, arg0, var5, var4);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lba;B)V", line = 197)
    public final void method374(class8 arg0, byte arg1) {
        field789++;
        while (true) {
            int var3 = arg0.method145(false);
            if (var3 == 0) {
                int var4 = -3 / ((-arg1 - 30) / 53);
                return;
            }
            this.method370(var3, (byte) -107, arg0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V", line = 267)
    public static final void method375(boolean arg0) {
        field784++;
        try {
            if (class22.field694 == 0) {
                if (class57.field1453 != null) {
                    class57.field1453.method1018(63);
                    class57.field1453 = null;
                }
                class78.field1922 = false;
                class22.field694 = 1;
                client.field578 = 0;
                class52.field1383 = null;
            }
            if (class22.field694 == 1) {
                if (class52.field1383 == null) {
                    class52.field1383 = class39.field1072.method660(3, class17.field546);
                }
                if (class52.field1383.field816 == 2) {
                    throw new IOException();
                }
                if (class52.field1383.field816 == 1) {
                    class57.field1453 = new class129((Socket) class52.field1383.field819, class39.field1072);
                    class22.field694 = 2;
                    class52.field1383 = null;
                }
            }
            if (!arg0) {
                field797 = null;
            }
            if (class22.field694 == 2) {
                long var1 = class74.field1846 = class123.field3074.method9((byte) 93);
                class70.field1729.field268 = 0;
                class70.field1729.method142(14, (byte) -128);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class70.field1729.method142(var3, (byte) -128);
                class57.field1453.method1019(2, (byte) -19, 0, class70.field1729.field285);
                class22.field694 = 3;
                class15.field489.field268 = 0;
            }
            if (class22.field694 == 3) {
                int var4 = class57.field1453.method1025(52);
                if (var4 != 0) {
                    class63.method615(5, var4);
                    return;
                }
                class15.field489.field268 = 0;
                class22.field694 = 4;
            }
            if (class22.field694 == 4) {
                if (class15.field489.field268 < 8) {
                    int var5 = class57.field1453.method1023(-127);
                    if (var5 > 8 - class15.field489.field268) {
                        var5 = 8 - class15.field489.field268;
                    }
                    if (var5 > 0) {
                        class57.field1453.method1017(class15.field489.field268, var5, -128, class15.field489.field285);
                        class15.field489.field268 += var5;
                    }
                }
                if (class15.field489.field268 == 8) {
                    class15.field489.field268 = 0;
                    class128.field3135 = class15.field489.method175(1362367312);
                    class22.field694 = 5;
                }
            }
            if (class22.field694 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class128.field3135 >> 32), (int) class128.field3135 };
                class70.field1729.field268 = 0;
                class70.field1729.method142(10, (byte) -128);
                class70.field1729.method183(63, var6[0]);
                class70.field1729.method183(113, var6[1]);
                class70.field1729.method183(113, var6[2]);
                class70.field1729.method183(91, var6[3]);
                class70.field1729.method183(63, class39.field1072.field1704);
                class70.field1729.method158(class123.field3074.method9((byte) 97), false);
                class70.field1729.method182(class123.field3058, (byte) -3);
                class70.field1729.method143(class80.field1996, class36.field965, 19280);
                class121.field3006.field268 = 0;
                if (class103.field2602 == 40) {
                    class121.field3006.method142(18, (byte) -128);
                } else {
                    class121.field3006.method142(16, (byte) -128);
                }
                class121.field3006.method142(class70.field1729.field268 + 57, (byte) -128);
                class121.field3006.method183(60, 435);
                class121.field3006.method142(class93.field2335 ? 1 : 0, (byte) -128);
                class121.field3006.method183(85, class52.field1381.field367);
                class121.field3006.method183(95, class19.field658.field367);
                class121.field3006.method183(100, class95.field2379.field367);
                class121.field3006.method183(75, class131.field3203.field367);
                class121.field3006.method183(92, class80.field2034.field367);
                class121.field3006.method183(42, class128.field3134.field367);
                class121.field3006.method183(108, class108.field2705.field367);
                class121.field3006.method183(108, class76.field1893.field367);
                class121.field3006.method183(49, class42.field1088.field367);
                class121.field3006.method183(61, class70.field1755.field367);
                class121.field3006.method183(80, class62.field1545.field367);
                class121.field3006.method183(61, class93.field2327.field367);
                class121.field3006.method183(101, class109.field2742.field367);
                class121.field3006.method152(class70.field1729.field268, class70.field1729.field285, 0, 8636);
                class57.field1453.method1019(class121.field3006.field268, (byte) -19, 0, class121.field3006.field285);
                class70.field1729.method417(-1, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class15.field489.method417(-1, var6);
                class22.field694 = 6;
            }
            if (class22.field694 == 6 && class57.field1453.method1023(-126) > 0) {
                int var8 = class57.field1453.method1025(63);
                if (var8 == 21 && class103.field2602 == 20) {
                    class22.field694 = 7;
                } else if (var8 == 2) {
                    class22.field694 = 9;
                } else if (var8 == 15 && class103.field2602 == 40) {
                    class78.method719(0);
                    return;
                } else if (var8 == 23 && class34.field897 < 1) {
                    class34.field897++;
                    class22.field694 = 0;
                } else {
                    class63.method615(5, var8);
                    return;
                }
            }
            if (class22.field694 == 7 && class57.field1453.method1023(-128) > 0) {
                class72.field1766 = class57.field1453.method1025(85) * 60 + 180;
                class22.field694 = 8;
            }
            if (class22.field694 == 8) {
                client.field578 = 0;
                class72.method681(class116.method959(-83, new class1[] { class48.method504(class72.field1766 / 60, -1), class79.field1934 }), class14.field469, class62.field1564, (byte) -82);
                if (--class72.field1766 <= 0) {
                    class22.field694 = 0;
                }
            } else {
                if (class22.field694 == 9 && class57.field1453.method1023(-121) >= 8) {
                    class37.field1005 = class57.field1453.method1025(99);
                    class45.field1188 = class57.field1453.method1025(38) == 1;
                    class67.field1686 = class57.field1453.method1025(86);
                    class67.field1686 <<= 0x8;
                    class67.field1686 += class57.field1453.method1025(16);
                    class89.field2192 = class57.field1453.method1025(37);
                    class57.field1453.method1017(0, 1, -127, class15.field489.field285);
                    class15.field489.field268 = 0;
                    class112.field2764 = class15.field489.method410((byte) 49);
                    class57.field1453.method1017(0, 2, -127, class15.field489.field285);
                    class15.field489.field268 = 0;
                    class100.field2550 = class15.field489.method146(65280);
                    class22.field694 = 10;
                }
                if (class22.field694 != 10) {
                    client.field578++;
                    if (client.field578 > 2000) {
                        if (class34.field897 < 1) {
                            class34.field897++;
                            if (class34.field916 == class17.field546) {
                                class17.field546 = class5.field224;
                            } else {
                                class17.field546 = class34.field916;
                            }
                            class22.field694 = 0;
                        } else {
                            class63.method615(5, -3);
                        }
                    }
                } else if (class57.field1453.method1023(-124) >= class100.field2550) {
                    class15.field489.field268 = 0;
                    class57.field1453.method1017(0, class100.field2550, -128, class15.field489.field285);
                    client.method292(0);
                    class103.field2607 = -1;
                    class52.method527(false, 5688);
                    class112.field2764 = -1;
                }
            }
        } catch (IOException var9) {
            if (class34.field897 < 1) {
                if (class34.field916 == class17.field546) {
                    class17.field546 = class5.field224;
                } else {
                    class17.field546 = class34.field916;
                }
                class34.field897++;
                class22.field694 = 0;
            } else {
                class63.method615(5, -2);
            }
        }
    }
}
