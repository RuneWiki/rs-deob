import jaggl.OpenGL;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class117 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[F")
    private float[] field1810 = new float[16];

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Low;")
    private class235 field1815 = new class235(786336);

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    private int field1817 = class100.method743(1600, (byte) -115);

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "[I")
    private int[] field1822 = new int[1600];

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    private int field1824 = 0;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "[I")
    private int[] field1825 = new int[64];

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "[[Ltr;")
    private class197[][] field1823 = new class197[1600][64];

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "[[Ltr;")
    private class197[][] field1826 = new class197[64][768];

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "[I")
    private int[] field1827 = new int[8191];

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "F")
    private static float field1811;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Ljd;")
    private class157 field1818;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Ljd;")
    private class157 field1819;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Ljd;")
    private class157 field1820;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lus;")
    private class1 field1821;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lci;")
    public static class320 field1814;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lts;")
    public static class380 field1812;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "[Laa;")
    public static class343[] field1816;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[[S")
    public static short[][] field1805;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILbt;)V")
    public final void method844(int arg0, class33 arg1) {
        this.field1821 = arg1.method193(267135248, true, 24, 196584, null);
        field1804++;
        if (arg0 < -73) {
            this.field1820 = new class157(this.field1821, 5126, 2, 0);
            this.field1819 = new class157(this.field1821, 5126, 3, 8);
            this.field1818 = new class157(this.field1821, 5121, 4, 20);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method845(int arg0) {
        field1814 = null;
        if (arg0 == 0) {
            field1816 = null;
            field1812 = null;
            field1805 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/lang/Object;Lul;)V")
    public static final void method846(int arg0, Object arg1, class411 arg2) {
        field1809++;
        if (arg2.field5803 == null) {
            return;
        }
        for (int var3 = arg0; var3 < 50 && arg2.field5803.peekEvent() != null; var3++) {
            class477.method2826(1L, 0);
        }
        if (arg1 != null) {
            arg2.field5803.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lbt;B)V")
    private final void method847(class33 arg0, byte arg1) {
        if (arg1 > -65) {
            this.method844(39, null);
        }
        field1811 = arg0.field720;
        field1807++;
        arg0.method227(1);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method286(-1, false);
        arg0.method204(-2, 1);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lbt;I)V")
    private final void method848(class33 arg0, int arg1) {
        field1808++;
        arg0.method286(-1, true);
        OpenGL.glEnable(arg1);
        OpenGL.glEnable(16385);
        if (field1811 != arg0.field720) {
            arg0.method331(field1811);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lbt;BLwg;)V")
    public final void method849(class33 arg0, byte arg1, class300 arg2) {
        field1813++;
        if (arg0.field654 == null || arg1 <= 47) {
            return;
        }
        this.method847(arg0, (byte) -66);
        float var4 = arg0.field654.field7816;
        float var5 = arg0.field654.field7814;
        float var6 = arg0.field654.field7796;
        float var7 = arg0.field654.field7819;
        try {
            if (arg2.field4473) {
                int var8 = arg2.field4472 - arg2.field4471;
                int var9;
                if (var8 + 2 > 1600) {
                    var9 = class100.method743(var8, (byte) -103) + 1 - this.field1817;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var8 += 2;
                    var9 = 0;
                }
                class488 var10 = arg2.field4470.field46;
                class488 var11 = var10.field7056;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field1824 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field1822[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field1825[var16] = 0;
                    }
                    while (var10 != var11) {
                        class197 var17 = (class197) var11;
                        if (var14) {
                            var14 = false;
                            var12 = var17.field2879;
                            var13 = var17.field2877;
                        } else if (var17.field2879 != var12 || var17.field2877 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field2876 >> 12) * var6 + (float) (var17.field2882 >> 12) * var5 + (float) (var17.field2874 >> 12) * var4 + var7) - arg2.field4471 >> var9;
                        if (var18 < 1600) {
                            if (this.field1822[var18] >= 64) {
                                label191: {
                                    if (this.field1822[var18] == 64) {
                                        if (this.field1824 == 64) {
                                            break label191;
                                        }
                                        this.field1822[var18] += this.field1824++ + 1;
                                    }
                                    this.field1826[this.field1822[var18] - 65][this.field1825[this.field1822[var18] - 64 - 1]++] = var17;
                                }
                            } else {
                                this.field1823[var18][this.field1822[var18]++] = var17;
                            }
                        }
                        var11 = var11.field7056;
                    }
                    if (var12 >= 0) {
                        arg0.method285(false, arg0.field609.method1864(41, var12));
                        arg0.method249(arg0.field2505.method93((byte) 54, var12).field813, -2);
                    } else {
                        arg0.method285(false, null);
                    }
                    if (var13 && field1811 != arg0.field720) {
                        arg0.method331(field1811);
                    } else if (arg0.field720 != 1.0F) {
                        arg0.method331(1.0F);
                    }
                    this.method850(64, var8, arg0);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class488 var22 = arg2.field4470.field46;
                for (class488 var23 = var22.field7056; var23 != var22; var23 = var23.field7056) {
                    class197 var24 = (class197) var23;
                    int var25 = (int) ((float) (var24.field2876 >> 12) * var6 + (float) (var24.field2882 >> 12) * var5 + (float) (var24.field2874 >> 12) * var4 + var7);
                    if (var20 > var25) {
                        var20 = var25;
                    }
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    this.field1827[var19++] = var25;
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = 1 - (this.field1817 - class100.method743(var26, (byte) -84));
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                int var28 = 0;
                class488 var29 = var22.field7056;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field1824 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field1822[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field1825[var34] = 0;
                    }
                    while (var22 != var29) {
                        class197 var35 = (class197) var29;
                        if (var32) {
                            var30 = var35.field2879;
                            var32 = false;
                            var31 = var35.field2877;
                        }
                        if (var28 > 0 && (var35.field2879 != var30 || var31 != var35.field2877)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field1827[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field1822[var36] < 64) {
                                this.field1823[var36][this.field1822[var36]++] = var35;
                            } else {
                                label142: {
                                    if (this.field1822[var36] == 64) {
                                        if (this.field1824 == 64) {
                                            break label142;
                                        }
                                        this.field1822[var36] += this.field1824++ + 1;
                                    }
                                    this.field1826[this.field1822[var36] - 64 - 1][this.field1825[this.field1822[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field7056;
                    }
                    if (var30 >= 0) {
                        arg0.method285(false, arg0.field609.method1864(98, var30));
                        arg0.method249(arg0.field2505.method93((byte) -64, var30).field813, -2);
                    } else {
                        arg0.method285(false, null);
                    }
                    if (var31 && field1811 != arg0.field720) {
                        arg0.method331(field1811);
                    } else if (arg0.field720 != 1.0F) {
                        arg0.method331(1.0F);
                    }
                    this.method850(-90, var26, arg0);
                }
            }
        } catch (Exception var37) {
        }
        this.method848(arg0, 16384);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILbt;)V")
    private final void method850(int arg0, int arg1, class33 arg2) {
        field1806++;
        OpenGL.glGetFloatv(2982, this.field1810, 0);
        float var4 = this.field1810[0];
        float var5 = this.field1810[4];
        float var6 = this.field1810[8];
        float var7 = this.field1810[1];
        float var8 = this.field1810[5];
        float var9 = this.field1810[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        int var13 = 105 / ((8 - arg0) / 48);
        float var14 = var4 - var7;
        float var15 = var5 - var8;
        float var16 = var6 - var9;
        float var17 = var7 - var4;
        float var18 = var8 - var5;
        this.field1815.field7558 = 0;
        float var19 = var9 - var6;
        if (arg2.field713) {
            for (int var45 = arg1 - 1; var45 >= 0; var45--) {
                int var46 = this.field1822[var45] > 64 ? 64 : this.field1822[var45];
                if (var46 > 0) {
                    for (int var47 = var46 - 1; var47 >= 0; var47--) {
                        class197 var60 = this.field1823[var45][var47];
                        int var61 = var60.field2875;
                        byte var62 = (byte) (var61 >> 16);
                        byte var63 = (byte) (var61 >> 8);
                        byte var64 = (byte) var61;
                        byte var65 = (byte) (var61 >>> 24);
                        float var66 = (float) (var60.field2874 >> 12);
                        float var67 = (float) (var60.field2882 >> 12);
                        float var68 = (float) (var60.field2876 >> 12);
                        int var69 = var60.field2878 >> 12;
                        this.field1815.method1558((byte) 117, 0.0F);
                        this.field1815.method1558((byte) 117, 0.0F);
                        this.field1815.method1558((byte) 117, (float) (-var69) * var10 + var66);
                        this.field1815.method1558((byte) 117, (float) (-var69) * var11 + var67);
                        this.field1815.method1558((byte) 117, (float) (-var69) * var12 + var68);
                        this.field1815.method3048(-2034159384, var62);
                        this.field1815.method3048(-2034159384, var63);
                        this.field1815.method3048(-2034159384, var64);
                        this.field1815.method3048(-2034159384, var65);
                        this.field1815.method1558((byte) 117, 1.0F);
                        this.field1815.method1558((byte) 117, 0.0F);
                        this.field1815.method1558((byte) 117, (float) var69 * var14 + var66);
                        this.field1815.method1558((byte) 117, (float) var69 * var15 + var67);
                        this.field1815.method1558((byte) 117, (float) var69 * var16 + var68);
                        this.field1815.method3048(-2034159384, var62);
                        this.field1815.method3048(-2034159384, var63);
                        this.field1815.method3048(-2034159384, var64);
                        this.field1815.method3048(-2034159384, var65);
                        this.field1815.method1558((byte) 117, 1.0F);
                        this.field1815.method1558((byte) 117, 1.0F);
                        this.field1815.method1558((byte) 117, (float) var69 * var10 + var66);
                        this.field1815.method1558((byte) 117, (float) var69 * var11 + var67);
                        this.field1815.method1558((byte) 117, (float) var69 * var12 + var68);
                        this.field1815.method3048(-2034159384, var62);
                        this.field1815.method3048(-2034159384, var63);
                        this.field1815.method3048(-2034159384, var64);
                        this.field1815.method3048(-2034159384, var65);
                        this.field1815.method1558((byte) 117, 0.0F);
                        this.field1815.method1558((byte) 117, 1.0F);
                        this.field1815.method1558((byte) 117, (float) var69 * var17 + var66);
                        this.field1815.method1558((byte) 117, (float) var69 * var18 + var67);
                        this.field1815.method1558((byte) 117, (float) var69 * var19 + var68);
                        this.field1815.method3048(-2034159384, var62);
                        this.field1815.method3048(-2034159384, var63);
                        this.field1815.method3048(-2034159384, var64);
                        this.field1815.method3048(-2034159384, var65);
                    }
                    if (this.field1822[var45] > 64) {
                        int var48 = this.field1822[var45] - 65;
                        for (int var49 = this.field1825[var48] - 1; var49 >= 0; var49--) {
                            class197 var50 = this.field1826[var48][var49];
                            int var51 = var50.field2875;
                            byte var52 = (byte) (var51 >> 16);
                            byte var53 = (byte) (var51 >> 8);
                            byte var54 = (byte) var51;
                            byte var55 = (byte) (var51 >>> 24);
                            float var56 = (float) (var50.field2874 >> 12);
                            float var57 = (float) (var50.field2882 >> 12);
                            float var58 = (float) (var50.field2876 >> 12);
                            int var59 = var50.field2878 >> 12;
                            this.field1815.method1558((byte) 117, 0.0F);
                            this.field1815.method1558((byte) 117, 0.0F);
                            this.field1815.method1558((byte) 117, (float) (-var59) * var10 + var56);
                            this.field1815.method1558((byte) 117, (float) (-var59) * var11 + var57);
                            this.field1815.method1558((byte) 117, (float) (-var59) * var12 + var58);
                            this.field1815.method3048(-2034159384, var52);
                            this.field1815.method3048(-2034159384, var53);
                            this.field1815.method3048(-2034159384, var54);
                            this.field1815.method3048(-2034159384, var55);
                            this.field1815.method1558((byte) 117, 1.0F);
                            this.field1815.method1558((byte) 117, 0.0F);
                            this.field1815.method1558((byte) 117, (float) var59 * var14 + var56);
                            this.field1815.method1558((byte) 117, (float) var59 * var15 + var57);
                            this.field1815.method1558((byte) 117, (float) var59 * var16 + var58);
                            this.field1815.method3048(-2034159384, var52);
                            this.field1815.method3048(-2034159384, var53);
                            this.field1815.method3048(-2034159384, var54);
                            this.field1815.method3048(-2034159384, var55);
                            this.field1815.method1558((byte) 117, 1.0F);
                            this.field1815.method1558((byte) 117, 1.0F);
                            this.field1815.method1558((byte) 117, (float) var59 * var10 + var56);
                            this.field1815.method1558((byte) 117, (float) var59 * var11 + var57);
                            this.field1815.method1558((byte) 117, (float) var59 * var12 + var58);
                            this.field1815.method3048(-2034159384, var52);
                            this.field1815.method3048(-2034159384, var53);
                            this.field1815.method3048(-2034159384, var54);
                            this.field1815.method3048(-2034159384, var55);
                            this.field1815.method1558((byte) 117, 0.0F);
                            this.field1815.method1558((byte) 117, 1.0F);
                            this.field1815.method1558((byte) 117, (float) var59 * var17 + var56);
                            this.field1815.method1558((byte) 117, (float) var59 * var18 + var57);
                            this.field1815.method1558((byte) 117, (float) var59 * var19 + var58);
                            this.field1815.method3048(-2034159384, var52);
                            this.field1815.method3048(-2034159384, var53);
                            this.field1815.method3048(-2034159384, var54);
                            this.field1815.method3048(-2034159384, var55);
                        }
                    }
                }
            }
        } else {
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = this.field1822[var20] > 64 ? 64 : this.field1822[var20];
                if (var21 > 0) {
                    for (int var22 = var21 - 1; var22 >= 0; var22--) {
                        class197 var35 = this.field1823[var20][var22];
                        int var36 = var35.field2875;
                        byte var37 = (byte) (var36 >> 16);
                        byte var38 = (byte) (var36 >> 8);
                        byte var39 = (byte) var36;
                        byte var40 = (byte) (var36 >>> 24);
                        float var41 = (float) (var35.field2874 >> 12);
                        float var42 = (float) (var35.field2882 >> 12);
                        float var43 = (float) (var35.field2876 >> 12);
                        int var44 = var35.field2878 >> 12;
                        this.field1815.method1559(-105, 0.0F);
                        this.field1815.method1559(-107, 0.0F);
                        this.field1815.method1559(-123, (float) (-var44) * var10 + var41);
                        this.field1815.method1559(-117, (float) (-var44) * var11 + var42);
                        this.field1815.method1559(-120, (float) (-var44) * var12 + var43);
                        this.field1815.method3048(-2034159384, var37);
                        this.field1815.method3048(-2034159384, var38);
                        this.field1815.method3048(-2034159384, var39);
                        this.field1815.method3048(-2034159384, var40);
                        this.field1815.method1559(-110, 1.0F);
                        this.field1815.method1559(-96, 0.0F);
                        this.field1815.method1559(-110, (float) var44 * var14 + var41);
                        this.field1815.method1559(-122, (float) var44 * var15 + var42);
                        this.field1815.method1559(-127, (float) var44 * var16 + var43);
                        this.field1815.method3048(-2034159384, var37);
                        this.field1815.method3048(-2034159384, var38);
                        this.field1815.method3048(-2034159384, var39);
                        this.field1815.method3048(-2034159384, var40);
                        this.field1815.method1559(-114, 1.0F);
                        this.field1815.method1559(-102, 1.0F);
                        this.field1815.method1559(-103, (float) var44 * var10 + var41);
                        this.field1815.method1559(-122, (float) var44 * var11 + var42);
                        this.field1815.method1559(-125, (float) var44 * var12 + var43);
                        this.field1815.method3048(-2034159384, var37);
                        this.field1815.method3048(-2034159384, var38);
                        this.field1815.method3048(-2034159384, var39);
                        this.field1815.method3048(-2034159384, var40);
                        this.field1815.method1559(-103, 0.0F);
                        this.field1815.method1559(-109, 1.0F);
                        this.field1815.method1559(-109, (float) var44 * var17 + var41);
                        this.field1815.method1559(-105, (float) var44 * var18 + var42);
                        this.field1815.method1559(-113, (float) var44 * var19 + var43);
                        this.field1815.method3048(-2034159384, var37);
                        this.field1815.method3048(-2034159384, var38);
                        this.field1815.method3048(-2034159384, var39);
                        this.field1815.method3048(-2034159384, var40);
                    }
                    if (this.field1822[var20] > 64) {
                        int var23 = this.field1822[var20] - 1 - 64;
                        for (int var24 = this.field1825[var23] - 1; var24 >= 0; var24--) {
                            class197 var25 = this.field1826[var23][var24];
                            int var26 = var25.field2875;
                            byte var27 = (byte) (var26 >> 16);
                            byte var28 = (byte) (var26 >> 8);
                            byte var29 = (byte) var26;
                            byte var30 = (byte) (var26 >>> 24);
                            float var31 = (float) (var25.field2874 >> 12);
                            float var32 = (float) (var25.field2882 >> 12);
                            float var33 = (float) (var25.field2876 >> 12);
                            int var34 = var25.field2878 >> 12;
                            this.field1815.method1559(-103, 0.0F);
                            this.field1815.method1559(-115, 0.0F);
                            this.field1815.method1559(-105, (float) (-var34) * var10 + var31);
                            this.field1815.method1559(-126, (float) (-var34) * var11 + var32);
                            this.field1815.method1559(-115, (float) (-var34) * var12 + var33);
                            this.field1815.method3048(-2034159384, var27);
                            this.field1815.method3048(-2034159384, var28);
                            this.field1815.method3048(-2034159384, var29);
                            this.field1815.method3048(-2034159384, var30);
                            this.field1815.method1559(-119, 1.0F);
                            this.field1815.method1559(-117, 0.0F);
                            this.field1815.method1559(-103, (float) var34 * var14 + var31);
                            this.field1815.method1559(-127, (float) var34 * var15 + var32);
                            this.field1815.method1559(-124, (float) var34 * var16 + var33);
                            this.field1815.method3048(-2034159384, var27);
                            this.field1815.method3048(-2034159384, var28);
                            this.field1815.method3048(-2034159384, var29);
                            this.field1815.method3048(-2034159384, var30);
                            this.field1815.method1559(-126, 1.0F);
                            this.field1815.method1559(-111, 1.0F);
                            this.field1815.method1559(-107, (float) var34 * var10 + var31);
                            this.field1815.method1559(-119, (float) var34 * var11 + var32);
                            this.field1815.method1559(-115, (float) var34 * var12 + var33);
                            this.field1815.method3048(-2034159384, var27);
                            this.field1815.method3048(-2034159384, var28);
                            this.field1815.method3048(-2034159384, var29);
                            this.field1815.method3048(-2034159384, var30);
                            this.field1815.method1559(-108, 0.0F);
                            this.field1815.method1559(-114, 1.0F);
                            this.field1815.method1559(-102, (float) var34 * var17 + var31);
                            this.field1815.method1559(-97, (float) var34 * var18 + var32);
                            this.field1815.method1559(-128, (float) var34 * var19 + var33);
                            this.field1815.method3048(-2034159384, var27);
                            this.field1815.method3048(-2034159384, var28);
                            this.field1815.method3048(-2034159384, var29);
                            this.field1815.method3048(-2034159384, var30);
                        }
                    }
                }
            }
        }
        if (this.field1815.field7558 != 0) {
            this.field1821.method1(24, this.field1815.field7558, 71, this.field1815.field7545);
            arg2.method319(this.field1818, null, this.field1820, 22146, this.field1819);
            arg2.method343(0, 7, 3, this.field1815.field7558 / 24);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lnt;Lmm;)V")
    public static final void method851(class152 arg0, class188 arg1) {
        if (!arg1.field2757) {
            return;
        }
        short var2 = arg1.field2752;
        short var3 = arg1.field2759;
        byte var4 = arg1.field2769;
        byte var5 = arg1.field2763;
        int var6 = (var2 << class322.field4795) + class185.field2738;
        int var7 = (var3 << class322.field4795) + class185.field2738;
        class188[][] var8 = class461.field6675[var4];
        float var9;
        if (class477.field6942 == class146.field2262) {
            class141.field2179.method203(class393.field5594[0].method143(var6, var7), class397.method2390(var2, var3), class451.method2683(var2, var3), class49.method444(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class141.field2179.method221(3000.0F, var9 * 1.5F);
        if (arg1.field2758) {
            if (class55.field1000) {
                if (var4 > 0) {
                    class188 var10 = class461.field6675[var4 - 1][var2][var3];
                    if (var10 != null && var10.field2757) {
                        return;
                    }
                }
                if (var2 <= class295.field4418 && var2 > class11.field111) {
                    class188 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field2757 && (var11.field2758 || (arg1.field2771 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class295.field4418 && var2 < class520.field7589 - 1) {
                    class188 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field2757 && (var12.field2758 || (arg1.field2771 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class118.field1845 && var3 > class27.field383) {
                    class188 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field2757 && (var13.field2758 || (arg1.field2771 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class118.field1845 && var3 < class56.field1010 - 1) {
                    class188 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field2757 && (var14.field2758 || (arg1.field2771 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class55.field1000 = true;
            }
            arg1.field2758 = false;
            if (arg1.field2772 != null) {
                class188 var15 = arg1.field2772;
                class141.field2179.method221(3000.0F, (201.5F - (float) (var15.field2763 + 1) * 50.0F) * 1.5F);
                if (!class526.method3116(var15.field2763, var2, var3)) {
                    class146.field2262[var15.field2763].method144(var2, var3);
                }
                class468 var16 = var15.field2764;
                if (var16 != null) {
                    if (class530.field7833) {
                        if ((var16.field6797 & arg1.field2768) == 0) {
                            class176.method1225(arg0, var4, var2, var3);
                        } else {
                            class370.method2267(arg0, var16.field6797, var5, var2, var3);
                        }
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    var16.method554(0, class141.field2179);
                }
                for (class317 var17 = var15.field2773; var17 != null; var17 = var17.field4709) {
                    class478 var18 = var17.field4711;
                    if (var18 != null) {
                        if (class530.field7833) {
                            class176.method1225(arg0, var4, var2, var3);
                            class141.field2179.method226(arg0.field2311, arg0.field2314);
                        }
                        var18.method554(0, class141.field2179);
                    }
                }
                class141.field2179.method221(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class526.method3116(var5, var2, var3);
            if (var19) {
                class146.field2262[var5].method144(var2, var3);
                class108 var20 = arg1.field2756;
                if (var20 != null && var20.field1619) {
                    if (var20.field1618) {
                        class141.field2179.method221(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class530.field7833) {
                        class176.method1225(arg0, var4, var2, var3);
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    class166 var21 = var20.method554(0, class141.field2179);
                    if (var21 != null) {
                        var21.field2501 = var20;
                        var21.field2495 = var4;
                        var21.field2500 = var2;
                        var21.field2496 = var3;
                        class302.field4481.method905(var21, 0);
                    }
                    if (var20.field1618) {
                        class141.field2179.method221(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class468 var24 = arg1.field2764;
            class469 var25 = arg1.field2755;
            if (var24 != null || var25 != null) {
                if (class295.field4418 == var2) {
                    var22++;
                } else if (class295.field4418 < var2) {
                    var22 += 2;
                }
                if (class118.field1845 == var3) {
                    var22 += 3;
                } else if (class118.field1845 > var3) {
                    var22 += 6;
                }
                var23 = class349.field5130[var22];
                arg1.field2768 = class512.field7443[var22];
            }
            if (var24 != null) {
                if ((var24.field6797 & class244.field3647[var22]) == 0) {
                    arg1.field2754 = 0;
                } else if (var24.field6797 == 16) {
                    arg1.field2754 = 3;
                    arg1.field2766 = class349.field5121[var22];
                    arg1.field2762 = (byte) (3 - arg1.field2766);
                } else if (var24.field6797 == 32) {
                    arg1.field2754 = 6;
                    arg1.field2766 = class417.field5906[var22];
                    arg1.field2762 = (byte) (6 - arg1.field2766);
                } else if (var24.field6797 == 64) {
                    arg1.field2754 = 12;
                    arg1.field2766 = class235.field3508[var22];
                    arg1.field2762 = (byte) (12 - arg1.field2766);
                } else {
                    arg1.field2754 = 9;
                    arg1.field2766 = class220.field3365[var22];
                    arg1.field2762 = (byte) (9 - arg1.field2766);
                }
                if ((var24.field6797 & var23) != 0 && !class106.method779(var5, var2, var3, var24.field6797)) {
                    if (class530.field7833) {
                        class176.method1225(arg0, var4, var2, var3);
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    class166 var26 = var24.method554(0, class141.field2179);
                    if (var26 != null) {
                        var26.field2501 = var24;
                        var26.field2495 = var4;
                        var26.field2500 = var2;
                        var26.field2496 = var3;
                        class302.field4481.method905(var26, 0);
                    }
                }
                class468 var27 = arg1.field2751;
                if (var27 != null && (var27.field6797 & var23) != 0 && !class106.method779(var5, var2, var3, var27.field6797)) {
                    if (class530.field7833) {
                        class176.method1225(arg0, var4, var2, var3);
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    class166 var28 = var27.method554(0, class141.field2179);
                    if (var28 != null) {
                        var28.field2501 = var27;
                        var28.field2495 = var4;
                        var28.field2500 = var2;
                        var28.field2496 = var3;
                        class302.field4481.method905(var28, 0);
                    }
                }
            }
            if (var25 != null && !class451.method2685(var5, var2, var3, var25.method910(8))) {
                class469 var29 = arg1.field2774;
                class141.field2179.method221(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field6813 & var23) != 0) {
                    if (class530.field7833) {
                        class176.method1225(arg0, var4, var2, var3);
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    class166 var30 = var25.method554(0, class141.field2179);
                    if (var30 != null) {
                        var30.field2501 = var25;
                        var30.field2495 = var4;
                        var30.field2500 = var2;
                        var30.field2496 = var3;
                        class302.field4481.method905(var30, 0);
                    }
                } else if (var25.field6813 == 256) {
                    int var31 = var25.field6807 - class510.field7387;
                    int var32 = var25.field6806 - class14.field161;
                    int var33 = var25.field6800;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class530.field7833) {
                        class176.method1225(arg0, var4, var2, var3);
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    if (var35 < var34) {
                        class166 var36 = var25.method554(0, class141.field2179);
                        if (var36 != null) {
                            var36.field2501 = var25;
                            var36.field2495 = var4;
                            var36.field2500 = var2;
                            var36.field2496 = var3;
                            class302.field4481.method905(var36, 0);
                        }
                    } else if (var29 != null) {
                        class166 var37 = var29.method554(0, class141.field2179);
                        if (var37 != null) {
                            var37.field2501 = var29;
                            var37.field2495 = var4;
                            var37.field2500 = var2;
                            var37.field2496 = var3;
                            class302.field4481.method905(var37, 0);
                        }
                    }
                }
                class141.field2179.method221(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class108 var38 = arg1.field2756;
                if (var38 != null && !var38.field1619) {
                    if (var38.field1618) {
                        class141.field2179.method221(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class530.field7833) {
                        class176.method1225(arg0, var4, var2, var3);
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    class166 var39 = var38.method554(0, class141.field2179);
                    if (var39 != null) {
                        var39.field2501 = var38;
                        var39.field2495 = var4;
                        var39.field2500 = var2;
                        var39.field2496 = var3;
                        class302.field4481.method905(var39, 0);
                    }
                    if (var38.field1618) {
                        class141.field2179.method221(3000.0F, var9 * 1.5F);
                    }
                }
                class467 var40 = arg1.field2753;
                if (var40 != null && !var40.field6785) {
                    if (class530.field7833) {
                        class176.method1225(arg0, var4, var2, var3);
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    class166 var41 = var40.method554(0, class141.field2179);
                    if (var41 != null) {
                        var41.field2501 = var40;
                        var41.field2495 = var4;
                        var41.field2500 = var2;
                        var41.field2496 = var3;
                        class302.field4481.method905(var41, 0);
                    }
                }
            }
            byte var42 = arg1.field2771;
            if (var42 != 0) {
                if (var2 < class295.field4418 && (var42 & 0x4) != 0) {
                    class188 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field2757) {
                        class386.field5506.method775((byte) -66, var43);
                    }
                }
                if (var3 < class118.field1845 && (var42 & 0x2) != 0) {
                    class188 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field2757) {
                        class386.field5506.method775((byte) -83, var44);
                    }
                }
                if (var2 > class295.field4418 && (var42 & 0x1) != 0) {
                    class188 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field2757) {
                        class386.field5506.method775((byte) -127, var45);
                    }
                }
                if (var3 > class118.field1845 && (var42 & 0x8) != 0) {
                    class188 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field2757) {
                        class386.field5506.method775((byte) -83, var46);
                    }
                }
            }
        }
        if (arg1.field2754 != 0) {
            boolean var47 = true;
            for (class317 var48 = arg1.field2773; var48 != null; var48 = var48.field4709) {
                if (class226.field3411 != var48.field4711.field6960 && (var48.field4714 & arg1.field2754) == arg1.field2766) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class468 var49 = arg1.field2764;
                if (!class106.method779(var5, var2, var3, var49.field6797)) {
                    if (class530.field7833) {
                        label682: {
                            if (var49.field6797 >= 16) {
                                int var50 = var2 - class295.field4418;
                                int var51 = var3 - class118.field1845;
                                if (var49.field6797 == 16) {
                                    int var52 = var50 - class185.field2738;
                                    int var53 = class185.field2738 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class337.field5000) {
                                        class176.method1225(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field6797 == 32) {
                                    int var54 = class185.field2738 + var50;
                                    int var55 = class185.field2738 + var51;
                                    if (var55 < -var54 && var2 < class394.field5608 && var3 < class337.field5000) {
                                        class176.method1225(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field6797 == 64) {
                                    int var56 = class185.field2738 + var50;
                                    int var57 = var51 - class185.field2738;
                                    if (var57 > var56 && var2 < class394.field5608 && var3 > 0) {
                                        class176.method1225(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field6797 == 128) {
                                    int var58 = var50 - class185.field2738;
                                    int var59 = var51 - class185.field2738;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class176.method1225(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class176.method1225(arg0, var4, var2, var3);
                        }
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    class166 var60 = var49.method554(0, class141.field2179);
                    if (var60 != null) {
                        var60.field2501 = var49;
                        var60.field2495 = var4;
                        var60.field2500 = var2;
                        var60.field2496 = var3;
                        class302.field4481.method905(var60, 0);
                    }
                }
                arg1.field2754 = 0;
            }
        }
        if (arg1.field2750) {
            try {
                arg1.field2750 = false;
                int var61 = 0;
                label625: for (class317 var62 = arg1.field2773; var62 != null; var62 = var62.field4709) {
                    class478 var63 = var62.field4711;
                    if (class226.field3411 != var63.field6960) {
                        for (int var64 = var63.field6971; var64 <= var63.field6970; var64++) {
                            for (int var65 = var63.field6962; var65 <= var63.field6959; var65++) {
                                class188 var66 = var8[var64][var65];
                                if (var66.field2758) {
                                    arg1.field2750 = true;
                                    continue label625;
                                }
                                if (var66.field2754 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field6971) {
                                        var67++;
                                    }
                                    if (var64 < var63.field6970) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field6962) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field6959) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field2754) == arg1.field2762) {
                                        arg1.field2750 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class295.field4418 - var63.field6971;
                        int var69 = var63.field6970 - class295.field4418;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class118.field1845 - var63.field6962;
                        int var71 = var63.field6959 - class118.field1845;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field2315[var61] = var63;
                        arg0.field2319[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class478 var75 = arg0.field2315[var74];
                        if (class226.field3411 != var75.field6960) {
                            int var76 = arg0.field2319[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field6961 - class510.field7387;
                                int var78 = var75.field6965 - class14.field161;
                                int var79 = arg0.field2315[var73].field6961 - class510.field7387;
                                int var80 = arg0.field2315[var73].field6965 - class14.field161;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class478 var81 = arg0.field2315[var73];
                    var81.field6960 = class226.field3411;
                    if (!class7.method27(var5, var81.field6971, var81.field6970, var81.field6962, var81.field6959, var81.method1792(false))) {
                        if (class530.field7833) {
                            if (var81.field6957 == 0) {
                                class231.method1544(arg0, var4, var81.field6971, var81.field6962, var81.field6970, var81.field6959);
                            } else {
                                class176.method1225(arg0, var4, var2, var3);
                                int var82 = var2 - class295.field4418;
                                int var83 = var3 - class118.field1845;
                                if (var81.field6957 == 2) {
                                    if (var83 > -var82) {
                                        class33.method344(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class33.method344(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class33.method344(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class33.method344(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class141.field2179.method226(arg0.field2311, arg0.field2314);
                        }
                        class166 var84 = var81.method554(0, class141.field2179);
                        if (var84 != null) {
                            var84.field2501 = var81;
                            var84.field2495 = var4;
                            var84.field2500 = var81.field6971;
                            var84.field2496 = var81.field6962;
                            class302.field4481.method905(var84, 0);
                        }
                    }
                    for (int var85 = var81.field6971; var85 <= var81.field6970; var85++) {
                        for (int var86 = var81.field6962; var86 <= var81.field6959; var86++) {
                            class188 var87 = var8[var85][var86];
                            if (var87.field2754 != 0) {
                                class386.field5506.method775((byte) -52, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field2757) {
                                class386.field5506.method775((byte) -14, var87);
                            }
                        }
                    }
                }
                if (arg1.field2750) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field2750 = false;
            }
        }
        if (arg1.field2767 != null && (byte) (class442.field6292 & 0xFF) == arg1.field2761) {
            class300 var88 = arg1.field2767;
            int var89 = class146.field2262[var4].method156(var2, var3);
            int var90;
            if (var4 < class251.field3740 - 1) {
                var90 = class146.field2262[var4].method156(var2, var3) - class146.field2262[var4 + 1].method156(var2, var3);
            } else {
                var90 = 0x8 << class322.field4795;
            }
            class98.field1538.method43(var6, var89, var7, arg0.field2316);
            int var91 = arg0.field2316[2];
            class98.field1538.method43(var6, var89 - var90, var7, arg0.field2316);
            int var92 = arg0.field2316[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class336.field4969;
            int var96 = class336.field4969 + var94;
            var88.field4471 = var95;
            var88.field4472 = var96;
            var88.field4473 = true;
            class141.field2179.method253(var88);
        }
        if (!arg1.field2757) {
            return;
        }
        if (arg1.field2754 != 0) {
            return;
        }
        if (var2 <= class295.field4418 && var2 > class11.field111) {
            class188 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field2757) {
                return;
            }
        }
        if (var2 >= class295.field4418 && var2 < class520.field7589 - 1) {
            class188 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field2757) {
                return;
            }
        }
        if (var3 <= class118.field1845 && var3 > class27.field383) {
            class188 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field2757) {
                return;
            }
        }
        if (var3 >= class118.field1845 && var3 < class56.field1010 - 1) {
            class188 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field2757) {
                return;
            }
        }
        arg1.field2757 = false;
        class229.field3440--;
        class467 var101 = arg1.field2753;
        if (var101 != null && var101.field6785) {
            if (class530.field7833) {
                class176.method1225(arg0, var4, var2, var3);
                class141.field2179.method226(arg0.field2311, arg0.field2314);
            }
            class166 var102 = var101.method554(0, class141.field2179);
            if (var102 != null) {
                var102.field2501 = var101;
                var102.field2495 = var4;
                var102.field2500 = var2;
                var102.field2496 = var3;
                class302.field4481.method905(var102, 0);
            }
        }
        if (arg1.field2768 != 0) {
            class469 var103 = arg1.field2755;
            if (var103 != null && !class451.method2685(var5, var2, var3, var103.method910(8))) {
                if ((var103.field6813 & arg1.field2768) != 0) {
                    if (class530.field7833) {
                        class176.method1225(arg0, var4, var2, var3);
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    class166 var104 = var103.method554(0, class141.field2179);
                    if (var104 != null) {
                        var104.field2501 = var103;
                        var104.field2495 = var4;
                        var104.field2500 = var2;
                        var104.field2496 = var3;
                        class302.field4481.method905(var104, 0);
                    }
                } else if (var103.field6813 == 256) {
                    int var105 = var103.field6807 - class510.field7387;
                    int var106 = var103.field6806 - class14.field161;
                    int var107 = var103.field6800;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class530.field7833) {
                        class176.method1225(arg0, var4, var2, var3);
                        class141.field2179.method226(arg0.field2311, arg0.field2314);
                    }
                    class469 var110 = arg1.field2774;
                    if (var109 > var108) {
                        class166 var111 = var103.method554(0, class141.field2179);
                        if (var111 != null) {
                            var111.field2501 = var103;
                            var111.field2495 = var4;
                            var111.field2500 = var2;
                            var111.field2496 = var3;
                            class302.field4481.method905(var111, 0);
                        }
                    } else if (var110 != null) {
                        class166 var112 = var110.method554(0, class141.field2179);
                        if (var112 != null) {
                            var112.field2501 = var110;
                            var112.field2495 = var4;
                            var112.field2500 = var2;
                            var112.field2496 = var3;
                            class302.field4481.method905(var112, 0);
                        }
                    }
                }
            }
            class468 var113 = arg1.field2764;
            class468 var114 = arg1.field2751;
            if (var114 != null && (var114.field6797 & arg1.field2768) != 0 && !class106.method779(var5, var2, var3, var114.field6797)) {
                if (class530.field7833) {
                    class370.method2267(arg0, var114.field6797, var4, var2, var3);
                    class141.field2179.method226(arg0.field2311, arg0.field2314);
                }
                class166 var115 = var114.method554(0, class141.field2179);
                if (var115 != null) {
                    var115.field2501 = var114;
                    var115.field2495 = var4;
                    var115.field2500 = var2;
                    var115.field2496 = var3;
                    class302.field4481.method905(var115, 0);
                }
            }
            if (var113 != null && (var113.field6797 & arg1.field2768) != 0 && !class106.method779(var5, var2, var3, var113.field6797)) {
                if (class530.field7833) {
                    class370.method2267(arg0, var113.field6797, var4, var2, var3);
                    class141.field2179.method226(arg0.field2311, arg0.field2314);
                }
                class166 var116 = var113.method554(0, class141.field2179);
                if (var116 != null) {
                    var116.field2501 = var113;
                    var116.field2495 = var4;
                    var116.field2500 = var2;
                    var116.field2496 = var3;
                    class302.field4481.method905(var116, 0);
                }
            }
        }
        if (var4 < class251.field3740 - 1) {
            class188 var117 = class461.field6675[var4 + 1][var2][var3];
            if (var117 != null && var117.field2757) {
                class386.field5506.method776(0, var117);
            }
        }
        if (var2 < class295.field4418) {
            class188 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field2757) {
                class386.field5506.method775((byte) -20, var118);
            }
        }
        if (var3 < class118.field1845) {
            class188 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field2757) {
                class386.field5506.method775((byte) -125, var119);
            }
        }
        if (var2 > class295.field4418) {
            class188 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field2757) {
                class386.field5506.method775((byte) -67, var120);
            }
        }
        if (var3 > class118.field1845) {
            class188 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field2757) {
                class386.field5506.method775((byte) -87, var121);
            }
        }
    }
}
