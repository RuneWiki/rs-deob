import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class206 {

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lek;")
    private class159 field3596;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Lf;")
    private class35 field3605;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Luh;")
    private class98 field3609;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Ljd;")
    public static class85 field3595 = class221.method1499("Lade Konfiguration )2 ", (byte) 98);

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field3594 = 0;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field3608 = -1;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[I")
    public static int[] field3611 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field3602 = -1;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lik;")
    private class247 field3604;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[Lqh;")
    private class195[] field3597;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method1405(int arg0) {
        int var1 = 107 % ((18 - arg0) / 33);
        field3595 = null;
        field3611 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)I")
    public static final int method1406(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field3606 = -35;
        }
        field3610++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public final void method1407(int arg0) {
        field3600++;
        if (this.field3597 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3597.length; var2++) {
            if (this.field3597[var2] != null) {
                this.field3597[var2].method1335((byte) -110);
            }
        }
        if (arg0 != 65535) {
            method1405(80);
        }
        for (int var3 = 0; var3 < this.field3597.length; var3++) {
            if (this.field3597[var3] != null) {
                this.field3597[var3].method1338(1);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lok;ILok;ZZ)Lqh;")
    private final class195 method1408(class38 arg0, int arg1, class38 arg2, boolean arg3, boolean arg4) {
        field3607++;
        if (this.field3604 == null) {
            throw new RuntimeException();
        }
        this.field3604.field4224 = arg1 * 8 + 5;
        if (this.field3604.field4238.length <= this.field3604.field4224) {
            throw new RuntimeException();
        } else if (this.field3597[arg1] == null) {
            int var6 = this.field3604.method1712(6357);
            if (arg4) {
                int var7 = this.field3604.method1712(6357);
                class195 var8 = new class195(arg1, arg2, arg0, this.field3596, this.field3605, var6, var7, arg3);
                this.field3597[arg1] = var8;
                return var8;
            } else {
                return null;
            }
        } else {
            return this.field3597[arg1];
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static final void method1409(int arg0) {
        field3598++;
        class129.field2267 = class59.field1073;
        class231.method1548(false, (byte) 127);
        class78.method545(arg0 - 24407);
        class39.method262((byte) -127, class129.field2267);
        class22.field308 = new class44();
        class22.field308.field1042 = 3000;
        class22.field308.field1027 = 3000;
        class28.method198(-73, class161.field2773);
        class169.method1136(true, 10);
        if (arg0 != 11204) {
            method1406(113, 14, 25, true);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILok;Lok;)Lqh;")
    public final class195 method1410(int arg0, int arg1, class38 arg2, class38 arg3) {
        field3601++;
        return arg1 == 0 ? this.method1408(arg3, arg0, arg2, true, true) : null;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)Z")
    public final boolean method1411(int arg0) {
        if (arg0 != -13159) {
            return true;
        }
        field3592++;
        if (this.field3604 != null) {
            return true;
        }
        if (this.field3609 == null) {
            if (this.field3596.method1037(arg0 ^ 0x42C2)) {
                return false;
            }
            this.field3609 = this.field3596.method1047(255, 255, true, (byte) 0, 3571);
        }
        if (this.field3609.field3776) {
            return false;
        } else {
            this.field3604 = new class247(this.field3609.method691((byte) -77));
            this.field3597 = new class195[(this.field3604.field4238.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
    public static final void method1412(int arg0) {
        int var1 = 0;
        if (arg0 != 17236) {
            method1406(36, 113, 44, false);
        }
        while (class241.field4151 > var1) {
            int var2 = class36.field564[var1];
            class17 var3 = class194.field3320[var2];
            int var4 = class189.field3249.method1711((byte) -67);
            if ((var4 & 0x10) != 0) {
                var3.field1038 = class189.field3249.method1694((byte) -100);
                var3.field1046 = class189.field3249.method1683(-2);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1007 = class189.field3249.method1697(65280);
                if (var3.field1007 == 65535) {
                    var3.field1007 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class189.field3249.method1694((byte) -100);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class189.field3249.method1687(arg0 ^ 0x433B);
                class180.method1232(var3, var5, var6, 123);
            }
            if ((var4 & 0x40) != 0) {
                int var7 = class189.field3249.method1711((byte) -67);
                int var8 = class189.field3249.method1678(false);
                var3.method391(class151.field2555, var7, -16218, var8);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1064 = class189.field3249.method1697(65280);
                int var9 = class189.field3249.method1665((byte) -65);
                if (var3.field1064 == 65535) {
                    var3.field1064 = -1;
                }
                var3.field1051 = var9 >> 16;
                var3.field1026 = 0;
                var3.field1019 = (var9 & 0xFFFF) + class151.field2555;
                var3.field1022 = 0;
                if (var3.field1019 > class151.field2555) {
                    var3.field1022 = -1;
                }
                if (var3.field1064 != -1 && class151.field2555 == var3.field1019) {
                    int var10 = class87.method647((byte) 41, var3.field1064).field1329;
                    if (var10 != -1) {
                        class106 var11 = class101.method704(1, var10);
                        if (var11 != null && var11.field1857 != null) {
                            class163.method1080(var11, var3.field1042, var3.field1027, 0, arg0 ^ 0x168B, false);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field247.method1801(-124)) {
                    class154.method1011(var3, (byte) 99);
                }
                var3.field247 = class55.method370(true, class189.field3249.method1697(arg0 ^ 0xBC54));
                var3.method389(var3.field247.field4700, (byte) -82);
                var3.field1014 = var3.field247.field4666;
                var3.field1041 = var3.field247.field4711;
                var3.field1033 = var3.field247.field4651;
                var3.field1011 = var3.field247.field4678;
                var3.field1024 = var3.field247.field4661;
                var3.field1049 = var3.field247.field4681;
                var3.field1013 = var3.field247.field4676;
                var3.field1006 = var3.field247.field4712;
                if (var3.field247.method1801(-127)) {
                    class1.method3(var3, class116.field2066, var3.field1066[0], 0, 128, (class44) null, (class199) null, var3.field1043[0]);
                }
            }
            if ((var4 & 0x8) != 0) {
                int var12 = class189.field3249.method1678(false);
                int var13 = class189.field3249.method1678(false);
                var3.method391(class151.field2555, var12, -16218, var13);
                var3.field1004 = class151.field2555 + 300;
                var3.field1039 = class189.field3249.method1711((byte) -67);
            }
            if ((var4 & 0x2) != 0) {
                var3.field1060 = class189.field3249.method1692(123);
                var3.field1070 = 100;
            }
            var1++;
        }
        field3591++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1413(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 21 / ((arg3 - 38) / 43);
        field3603++;
        if (class222.method1508(0, arg7)) {
            client.method991(class215.field3774[arg7], -1, arg4, arg6, arg0, arg2, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lek;Lf;)V")
    public class206(class159 arg0, class35 arg1) {
        this.field3596 = arg0;
        this.field3605 = arg1;
        if (!this.field3596.method1037(-29093)) {
            this.field3609 = this.field3596.method1047(255, 255, true, (byte) 0, 3571);
        }
    }
}
