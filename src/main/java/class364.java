import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class364 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ljv;")
    private class55 field5511 = new class55(64);

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lbu;")
    private class17 field5510;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field5513 = -1;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lpi;")
    public static class342 field5512 = new class342("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "[I")
    public static int[] field5516 = new int[1];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Lmu;")
    public static class195 field5515;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[S")
    public static short[] field5514;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Lbv;", line = 3)
    public final class199 method2281(int arg0, byte arg1) {
        field5508++;
        class55 var3 = this.field5511;
        class199 var4;
        synchronized (this.field5511) {
            var4 = (class199) this.field5511.method494(0, (long) arg0);
        }
        if (arg1 != 104) {
            this.field5511 = null;
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5510.method114(arg0, 5, -21);
        class199 var6 = new class199();
        if (var5 != null) {
            var6.method1377(new class145(var5), -23985);
        }
        class55 var7 = this.field5511;
        synchronized (this.field5511) {
            this.field5511.method485((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIZII)V", line = 44)
    public static final void method2282(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field5509++;
        if (!arg2 && class185.field2771 == arg1 && class187.field2781 == arg3 && class430.field6392 == class163.field2525 || class443.field6623.method2840(255, class169.field2624)) {
            return;
        }
        class430.field6392 = class163.field2525;
        class185.field2771 = arg1;
        class187.field2781 = arg3;
        if (class443.field6623.method2840(arg4 ^ 0x1CFD, class169.field2624)) {
            class430.field6392 = 0;
        }
        if (arg0) {
            class244.method1590(28, (byte) 33);
        } else {
            class244.method1590(25, (byte) 35);
        }
        if (arg4 != 7170) {
            return;
        }
        client.method1351((byte) 119, true, class516.field7590.method2180(client.field2870, 29491), class464.field6944);
        int var5 = class200.field2931;
        class200.field2931 = (class185.field2771 - (class33.field662 >> 4)) * 8;
        int var6 = class403.field6059;
        class403.field6059 = (class187.field2781 - (class121.field1966 >> 4)) * 8;
        class241.field3476 = class509.method3042(class185.field2771 * 8, class187.field2781 * 8);
        class306.field4687 = null;
        int var7 = class200.field2931 - var5;
        int var8 = class403.field6059 - var6;
        if (arg0) {
            class510.field7529 = 0;
            int var9 = class33.field662 * 128 - 128;
            int var10 = class121.field1966 * 128 - 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class255 var12 = class34.field668[var11];
                if (var12 != null) {
                    var12.field6228 -= var7 * 128;
                    var12.field6233 -= var8 * 128;
                    if (var12.field6228 >= 0 && var9 >= var12.field6228 && var12.field6233 >= 0 && var12.field6233 <= var10) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field7692[var14] -= var7;
                            var12.field7694[var14] -= var8;
                            if (var12.field7692[var14] < 0 || var12.field7692[var14] >= class33.field662 || var12.field7694[var14] < 0 || var12.field7694[var14] >= class121.field1966) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class148.field2363[class510.field7529++] = var11;
                        } else {
                            class34.field668[var11].method1648(-56, null);
                            class34.field668[var11] = null;
                        }
                    } else {
                        class34.field668[var11].method1648(-119, null);
                        class34.field668[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class255 var23 = class34.field668[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field7692[var24] -= var7;
                        var23.field7694[var24] -= var8;
                    }
                    var23.field6233 -= var8 * 128;
                    var23.field6228 -= var7 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class256 var21 = class183.field2747[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field7692[var22] -= var7;
                    var21.field7694[var22] -= var8;
                }
                var21.field6233 -= var8 * 128;
                var21.field6228 -= var7 * 128;
            }
        }
        class128[] var17 = class45.field835;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class128 var20 = var17[var18];
            if (var20 != null) {
                var20.field2040 -= var8 * 128;
                var20.field2031 -= var7 * 128;
            }
        }
        class501.method2999(-96, var8, var7);
        for (class408 var19 = (class408) class431.field6415.method2427(arg4 - 7058); var19 != null; var19 = (class408) class431.field6415.method2422(-122)) {
            var19.field6126 -= var7;
            var19.field6119 -= var8;
            if (class412.field6157 != 3 && (var19.field6126 < 0 || var19.field6119 < 0 || var19.field6126 >= class33.field662 || var19.field6119 >= class121.field1966)) {
                var19.method2090(arg4 - 7171);
            }
        }
        if (class467.field6967 != 0) {
            class467.field6967 -= var7;
            class308.field4710 -= var8;
        }
        class385.method2383(true);
        if (arg0) {
            class420.field6283 -= var7;
            class184.field2758 -= var8;
            class405.field6075 -= var8 * 128;
            class40.field732 -= var7 * 128;
            class403.field6053 -= var8;
            class236.field3422 -= var7;
            if (Math.abs(var7) > class33.field662 || Math.abs(var8) > class121.field1966) {
                class418.method2527((byte) -111);
            }
        } else if (class85.field1473 == 4) {
            class206.field2980 -= var8 * 128;
            class141.field2245 -= var7 * 128;
            class524.field7771 -= var8 * 128;
            class305.field4654 -= var7 * 128;
        } else {
            class85.field1473 = 1;
        }
        class429.method2573(338);
        class427.method2563((byte) -64);
        class167.field2596.method2419((byte) 114);
        class149.field2372.method2419((byte) 111);
        class343.field5157.method1637(arg4 ^ 0x78E5);
        class288.method1827((byte) 125);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 274)
    public static void method2283(byte arg0) {
        field5514 = null;
        field5516 = null;
        if (arg0 < -91) {
            field5512 = null;
            field5515 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Loq;ILbu;)V", line = 297)
    public class364(class239 arg0, int arg1, class17 arg2) {
        this.field5510 = arg2;
        this.field5510.method119(29630, 5);
    }
}
