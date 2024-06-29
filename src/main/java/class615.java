import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class615 {

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    private int field8837 = 0;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Ldea;")
    private class205 field8830;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
    public static int[] field8829 = new int[250];

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8835 = new BigInteger("8b078a3163d7f83bb59e66cbd09dcbfeb59b643e9846da6955143b46217e16b2f3c98a697fd6885353831abe858d9f007486e4f8f8683d4c8395519bb4033ea9", 16);

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "Lmc;")
    public static class114 field8838 = null;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Lej;")
    public static class104 field8839 = new class104("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Lik;")
    private class176 field8836;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static void method3590(int arg0) {
        field8835 = null;
        field8839 = null;
        if (arg0 != -1) {
            field8827 = -12;
        }
        field8838 = null;
        field8829 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)Lik;")
    public final class176 method3591(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field8832++;
            this.field8837 = 0;
            return this.method3595((byte) 4);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V")
    public static final void method3592(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8831++;
        if (arg2 > -27) {
            return;
        }
        for (class421 var5 = (class421) class41.field806.method456((byte) -41); var5 != null; var5 = (class421) class41.field806.method460((byte) 38)) {
            class270.method1757(arg3, var5, arg4, arg1, arg0, (byte) 55);
        }
        for (class421 var6 = (class421) class495.field6924.method456((byte) -36); var6 != null; var6 = (class421) class495.field6924.method460((byte) 80)) {
            byte var11 = 1;
            class107 var12 = var6.field5920.method349(true);
            if (var6.field5920.field567) {
                var11 = 0;
            } else if (var6.field5920.field554 == var12.field1617 || var6.field5920.field554 == var12.field1629 || var6.field5920.field554 == var12.field1652 || var6.field5920.field554 == var12.field1641) {
                var11 = 2;
            } else if (var6.field5920.field554 == var12.field1647 || var6.field5920.field554 == var12.field1627 || var6.field5920.field554 == var12.field1642 || var6.field5920.field554 == var12.field1636) {
                var11 = 3;
            }
            if (var6.field5918 != var11) {
                int var13 = class522.method3011(var6.field5920, true);
                if (var6.field5915 != var13) {
                    if (var6.field5904 != null) {
                        class204.field2869.method2731(var6.field5904);
                        var6.field5904 = null;
                    }
                    var6.field5915 = var13;
                }
                var6.field5918 = var11;
            }
            var6.field5914 = var6.field5920.field6037;
            var6.field5913 = var6.field5920.field6037 + (var6.field5920.method337(0) << 6);
            var6.field5906 = var6.field5920.field6029;
            var6.field5922 = var6.field5920.field6029 + (var6.field5920.method337(0) << 6);
            class270.method1757(arg3, var6, arg4, arg1, arg0, (byte) 55);
        }
        for (class421 var7 = (class421) class480.field6765.method1248(-1); var7 != null; var7 = (class421) class480.field6765.method1245((byte) 95)) {
            byte var8 = 1;
            class107 var9 = var7.field5907.method349(true);
            if (var7.field5907.field567) {
                var8 = 0;
            } else if (var7.field5907.field554 == var9.field1617 || var7.field5907.field554 == var9.field1629 || var7.field5907.field554 == var9.field1652 || var7.field5907.field554 == var9.field1641) {
                var8 = 2;
            } else if (var7.field5907.field554 == var9.field1647 || var7.field5907.field554 == var9.field1627 || var7.field5907.field554 == var9.field1642 || var7.field5907.field554 == var9.field1636) {
                var8 = 3;
            }
            if (var7.field5918 != var8) {
                int var10 = class443.method2622(-46, var7.field5907);
                if (var7.field5915 != var10) {
                    if (var7.field5904 != null) {
                        class204.field2869.method2731(var7.field5904);
                        var7.field5904 = null;
                    }
                    var7.field5915 = var10;
                }
                var7.field5918 = var8;
            }
            var7.field5914 = var7.field5907.field6037;
            var7.field5913 = var7.field5907.field6037 + (var7.field5907.method337(0) << 6);
            var7.field5906 = var7.field5907.field6029;
            var7.field5922 = var7.field5907.field6029 + (var7.field5907.method337(0) << 6);
            class270.method1757(arg3, var7, arg4, arg1, arg0, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lmc;Lqa;ZII)V")
    public static final void method3593(class114 arg0, class207 arg1, boolean arg2, int arg3, int arg4) {
        field8828++;
        class310 var5 = arg0.method810(arg2, arg1);
        if (var5 == null) {
            return;
        }
        arg1.method1308(arg4, arg3, arg0.field1853 + arg4, arg0.field1769 + arg3);
        if (class634.field9270 == 2 || class634.field9270 == 5 || class143.field2208 == null) {
            arg1.method1347(-16777216, var5, arg4, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class107.field1653 == 4) {
            var6 = class592.field8507;
            var7 = (int) (-class1.field13) & 0x3FFF;
            var9 = 4096;
            var8 = class312.field4212;
        } else {
            var6 = class645.field9372.field6037;
            var7 = (int) (-class1.field13) + class2.field27 & 0x3FFF;
            var8 = class645.field9372.field6029;
            var9 = 4096 - (class353.field4779 * 16);
        }
        int var10 = var6 / 32 + 48 + 208 - (class32.field513 * 2);
        int var11 = class611.field8786 * 4 + 48 - (var8 / 32) - ((class611.field8786 - 104) * 2);
        class143.field2208.method496((float) arg0.field1853 / 2.0F + (float) arg4, (float) arg0.field1769 / 2.0F + (float) arg3, (float) var10, (float) var11, var9, var7 << 2, var5, arg4, arg3);
        for (class10 var12 = (class10) class257.field3568.method456((byte) -61); var12 != null; var12 = (class10) class257.field3568.method460((byte) -83)) {
            int var58 = var12.field106;
            int var59 = ((class246.field3427.field7378[var58] & 0xFFFEBAD) >> 14) - class519.field7304;
            int var60 = (class246.field3427.field7378[var58] & 0x3FFF) - class6.field80;
            int var61 = var59 * 4 + 2 - var6 / 32;
            int var62 = var60 * 4 + 2 - (var8 / 32);
            class604.method3557(var61, var5, arg1, (byte) -44, arg3, var62, arg0, arg4, class246.field3427.field7380[var58]);
        }
        for (int var13 = 0; var13 < class370.field5018; var13++) {
            int var55 = class481.field6788[var13] * 4 + 2 - (var6 / 32);
            int var56 = class393.field5550[var13] * 4 + 2 - (var8 / 32);
            class364 var57 = class18.field227.method1201((byte) -94, class534.field7471[var13]);
            if (var57.field4904 != null) {
                var57 = var57.method2183(!arg2, class189.field2681);
                if (var57 == null || var57.field4909 == -1) {
                    continue;
                }
            }
            class604.method3557(var55, var5, arg1, (byte) -44, arg3, var56, arg0, arg4, var57.field4909);
        }
        for (class93 var14 = (class93) class220.field3147.method1248(-1); var14 != null; var14 = (class93) class220.field3147.method1245((byte) 95)) {
            int var50 = (int) (var14.field2524 >> 28 & 0x3L);
            if (class210.field2962 == var50) {
                int var51 = (int) (var14.field2524 & 0x3FFFL) - class519.field7304;
                int var52 = (int) (var14.field2524 >> 14 & 0x3FFFL) - class6.field80;
                int var53 = var51 * 4 + (2 - var6 / 32);
                int var54 = var52 * 4 + 2 - (var8 / 32);
                class401.method2397(arg4, var53, var5, var54, class457.field6440[0], arg0, arg3, 2);
            }
        }
        for (int var15 = 0; var15 < class480.field6764; var15++) {
            class576 var45 = (class576) class278.field3837.method1242(0, (long) class586.field8386[var15]);
            if (var45 != null) {
                class109 var46 = var45.field7929;
                if (var46.method767(0) && class645.field9372.field6035 == var46.field6035) {
                    class593 var47 = var46.field1669;
                    if (var47 != null && var47.field8532 != null) {
                        var47 = var47.method3516(class189.field2681, 94);
                    }
                    if (var47 != null && var47.field8576 && var47.field8541) {
                        int var48 = var46.field6037 / 32 - (var6 / 32);
                        int var49 = var46.field6029 / 32 - (var8 / 32);
                        if (var47.field8546 == -1) {
                            class401.method2397(arg4, var48, var5, var49, class457.field6440[1], arg0, arg3, 2);
                        } else {
                            class604.method3557(var48, var5, arg1, (byte) -44, arg3, var49, arg0, arg4, var47.field8546);
                        }
                    }
                }
            }
        }
        int var16 = class559.field7738;
        int[] var17 = class358.field4825;
        for (int var18 = 0; var18 < var16; var18++) {
            class188 var37 = class349.field4696[var17[var18]];
            if (var37 != null && var37.method1173(0) && class645.field9372 != var37 && class645.field9372.field6035 == var37.field6035) {
                int var38 = var37.field6037 / 32 - (var6 / 32);
                int var39 = var37.field6029 / 32 - var8 / 32;
                boolean var40 = false;
                for (int var41 = 0; var41 < class367.field4989; var41++) {
                    if (var37.field2630.equals(class474.field6677[var41]) && class345.field4645[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class594.field8603; var43++) {
                    if (var37.field2630.equals(class587.field8394[var43].field1389)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class645.field9372.field2639 != 0 && var37.field2639 != 0 && class645.field9372.field2639 == var37.field2639) {
                    var44 = true;
                }
                if (var37.field2661) {
                    class401.method2397(arg4, var38, var5, var39, class457.field6440[6], arg0, arg3, 2);
                } else if (var40) {
                    class401.method2397(arg4, var38, var5, var39, class457.field6440[3], arg0, arg3, 2);
                } else if (var42) {
                    class401.method2397(arg4, var38, var5, var39, class457.field6440[5], arg0, arg3, 2);
                } else if (var44) {
                    class401.method2397(arg4, var38, var5, var39, class457.field6440[4], arg0, arg3, 2);
                } else {
                    class401.method2397(arg4, var38, var5, var39, class457.field6440[2], arg0, arg3, 2);
                }
            }
        }
        class201[] var19 = class132.field2113;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class201 var23 = var19[var20];
            if (var23 != null && var23.field2819 != 0 && class405.field5763 % 20 < 10) {
                if (var23.field2819 == 1) {
                    class576 var24 = (class576) class278.field3837.method1242(0, (long) var23.field2817);
                    if (var24 != null) {
                        class109 var25 = var24.field7929;
                        int var26 = var25.field6037 / 32 - (var6 / 32);
                        int var27 = var25.field6029 / 32 - var8 / 32;
                        class380.method2251(var26, var27, arg3, var23.field2824, arg4, -19791, arg0, 360000L, var5);
                    }
                }
                if (var23.field2819 == 2) {
                    int var28 = var23.field2822 / 32 - (var6 / 32);
                    int var29 = var23.field2826 / 32 - var8 / 32;
                    long var30 = (long) (var23.field2820 << 5);
                    long var32 = var30 * var30;
                    class380.method2251(var28, var29, arg3, var23.field2824, arg4, -19791, arg0, var32, var5);
                }
                if (var23.field2819 == 10 && var23.field2817 >= 0 && class349.field4696.length > var23.field2817) {
                    class188 var34 = class349.field4696[var23.field2817];
                    if (var34 != null) {
                        int var35 = var34.field6037 / 32 - (var6 / 32);
                        int var36 = var34.field6029 / 32 - (var8 / 32);
                        class380.method2251(var35, var36, arg3, var23.field2824, arg4, -19791, arg0, 360000L, var5);
                    }
                }
            }
        }
        if (class107.field1653 == 4) {
            return;
        }
        if (class145.field2248 != 0) {
            int var21 = (class145.field2248 * 4 + 2 - (-(class645.field9372.method337(0) * 2) + 2)) - (var6 / 32);
            int var22 = class118.field1943 * 4 - (var8 / 32) - (-((class645.field9372.method337(0) - 1) * 2) + -2);
            class401.method2397(arg4, var21, var5, var22, class336.field4487[class76.field1205 ? 1 : 0], arg0, arg3, 2);
        }
        arg1.method1368(arg0.field1769 / 2 + arg3 - 1, 3, 3, -1, arg0.field1853 / 2 + arg4 - 1, (byte) -16);
        return;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZILmc;)V")
    public static final void method3594(int arg0, boolean arg1, int arg2, class114 arg3) {
        if (arg3.field1813 == 0) {
            arg3.field1814 = arg3.field1845;
        } else if (arg3.field1813 == 1) {
            arg3.field1814 = (arg0 - arg3.field1769) / 2 + arg3.field1845;
        } else if (arg3.field1813 == 2) {
            arg3.field1814 = arg0 - arg3.field1845 - arg3.field1769;
        } else if (arg3.field1813 == 3) {
            arg3.field1814 = arg3.field1845 * arg0 >> 14;
        } else if (arg3.field1813 == 4) {
            arg3.field1814 = (arg3.field1845 * arg0 >> 14) + (arg0 - arg3.field1769) / 2;
        } else {
            arg3.field1814 = arg0 - (arg3.field1845 * arg0 >> 14) - arg3.field1769;
        }
        if (arg3.field1765 == 0) {
            arg3.field1767 = arg3.field1798;
        } else if (arg3.field1765 == 1) {
            arg3.field1767 = (arg2 - arg3.field1853) / 2 + arg3.field1798;
        } else if (arg3.field1765 == 2) {
            arg3.field1767 = arg2 - arg3.field1853 - arg3.field1798;
        } else if (arg3.field1765 == 3) {
            arg3.field1767 = arg3.field1798 * arg2 >> 14;
        } else if (arg3.field1765 == 4) {
            arg3.field1767 = (arg3.field1798 * arg2 >> 14) + (arg2 - arg3.field1853) / 2;
        } else {
            arg3.field1767 = arg2 - (arg3.field1798 * arg2 >> 14) - arg3.field1853;
        }
        field8833++;
        if (arg1) {
            method3593(null, null, false, 8, 82);
        }
        if (!class168.field2427) {
            return;
        }
        if (client.method1534(arg3).field6963 == 0 && arg3.field1880 != 0) {
            return;
        }
        if (arg3.field1767 < 0) {
            arg3.field1767 = 0;
        } else if (arg2 < arg3.field1853 + arg3.field1767) {
            arg3.field1767 = arg2 - arg3.field1853;
        }
        if (arg3.field1814 < 0) {
            arg3.field1814 = 0;
            return;
        }
        if (arg0 < (arg3.field1814 + arg3.field1769)) {
            arg3.field1814 = arg0 - arg3.field1769;
            return;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Lik;")
    public final class176 method3595(byte arg0) {
        field8834++;
        if (this.field8837 > 0 && this.field8830.field2885[this.field8837 - 1] != this.field8836) {
            class176 var2 = this.field8836;
            this.field8836 = var2.field2516;
            return var2;
        }
        while (this.field8837 < this.field8830.field2870) {
            class176 var3 = this.field8830.field2885[this.field8837++].field2516;
            if (this.field8830.field2885[this.field8837 - 1] != var3) {
                this.field8836 = var3.field2516;
                return var3;
            }
        }
        return arg0 == 4 ? null : null;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
    public class615() {
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ldea;)V")
    public class615(class205 arg0) {
        this.field8830 = arg0;
    }
}
