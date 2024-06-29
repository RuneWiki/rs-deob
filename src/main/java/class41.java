import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 extends Canvas {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field979;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lod;")
    private static class101 field988 = class46.method335(-97, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lod;")
    public static class101 field981 = field988;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Llb;")
    public static class78 field983 = new class78();

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Lod;")
    public static class101 field992 = class46.method335(70, "mod_icons");

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lod;")
    public static class101 field994 = class46.method335(84, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Lod;")
    public static class101 field995 = class46.method335(97, "Null");

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lod;")
    private static class101 field990 = class46.method335(-55, "Loaded wordpack");

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lod;")
    public static class101 field996 = field990;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lod;")
    public static class101 field997 = class46.method335(-117, ")1p");

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lod;")
    private static class101 field999 = class46.method335(75, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lod;")
    public static class101 field998 = class46.method335(-53, "<col=ffff00>");

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Lod;")
    public static class101 field993 = field999;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!fe", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field984++;
        this.field979.paint(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
    public static int method307(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fe", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field979.update(arg0);
        field986++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method308(int arg0) {
        if (arg0 <= 22) {
            field997 = null;
        }
        field985++;
        for (class156 var1 = (class156) class17.field345.method523(false); var1 != null; var1 = (class156) class17.field345.method527(true)) {
            if (var1.field3595 == -1) {
                var1.field3589 = 0;
                class140.method1118((byte) 86, var1);
            } else {
                var1.method959(11835);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class41(Component arg0) {
        this.field979 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIB)V")
    public static final void method309(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != -89) {
            return;
        }
        int var6 = class33.field857.method556(arg3, arg0, arg1);
        field987++;
        if (var6 != 0) {
            int var7 = class33.field857.method554(arg3, arg0, arg1, var6);
            int var8 = var7 & 0x1F;
            int var9 = var7 >> 6 & 0x3;
            int[] var10 = class130.field2956.field2692;
            int var11 = arg2;
            if (var6 > 0) {
                var11 = arg4;
            }
            int var12 = arg0 * 4 + (52736 - arg1 * 512) * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class24 var14 = class94.method652(var13, 0);
            if (var14.field578 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var9 == 1) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var9 == 2) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 3 + 512] = var11;
                        var10[var12 + 3 + 1024] = var11;
                        var10[var12 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1536 + 1] = var11;
                        var10[var12 + 1536 + 2] = var11;
                        var10[var12 + 1539] = var11;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var10[var12] = var11;
                    } else if (var9 == 1) {
                        var10[var12 + 3] = var11;
                    } else if (var9 == 2) {
                        var10[var12 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var10[var12 + 1536] = var11;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var9 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var9 == 1) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 3 + 512] = var11;
                        var10[var12 + 1027] = var11;
                        var10[var12 + 3 + 1536] = var11;
                    } else if (var9 == 2) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1537] = var11;
                        var10[var12 + 1536 + 2] = var11;
                        var10[var12 + 1536 + 3] = var11;
                    }
                }
            } else {
                class116 var15 = class27.field726[var14.field578];
                if (var15 != null) {
                    int var16 = (var14.field599 * 4 - var15.field2574) / 2;
                    int var17 = (var14.field613 * 4 - var15.field2572) / 2;
                    var15.method884(arg0 * 4 + var17 + 48, 48 - -((-var14.field599 + 104 + -arg1) * 4) + var16);
                }
            }
        }
        int var18 = class33.field857.method565(arg3, arg0, arg1);
        if (var18 != 0) {
            int var19 = class33.field857.method554(arg3, arg0, arg1, var18);
            int var20 = var19 & 0x1F;
            int var21 = var19 >> 6 & 0x3;
            int var22 = var18 >> 14 & 0x7FFF;
            class24 var23 = class94.method652(var22, arg5 ^ 0xFFFFFFA7);
            if (var23.field578 != -1) {
                class116 var27 = class27.field726[var23.field578];
                if (var27 != null) {
                    int var28 = (var23.field613 * 4 - var27.field2572) / 2;
                    int var29 = (var23.field599 * 4 - var27.field2574) / 2;
                    var27.method884(arg0 * 4 + var28 + 48, (104 - (var23.field599 + arg1)) * 4 + 48 + var29);
                }
            } else if (var20 == 9) {
                int[] var24 = class130.field2956.field2692;
                int var25 = 15658734;
                if (var18 > 0) {
                    var25 = 15597568;
                }
                int var26 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var24[var26 + 1536] = var25;
                    var24[var26 + 1024 + 1] = var25;
                    var24[var26 + 2 + 512] = var25;
                    var24[var26 + 3] = var25;
                } else {
                    var24[var26] = var25;
                    var24[var26 + 513] = var25;
                    var24[var26 + 1024 + 2] = var25;
                    var24[var26 + 1536 + 3] = var25;
                }
            }
        }
        int var30 = class33.field857.method572(arg3, arg0, arg1);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class24 var32 = class94.method652(var31, 0);
        if (var32.field578 == -1) {
            return;
        }
        class116 var33 = class27.field726[var32.field578];
        if (var33 != null) {
            int var34 = (var32.field613 * 4 - var33.field2572) / 2;
            int var35 = (var32.field599 * 4 - var33.field2574) / 2;
            var33.method884(var34 + arg0 * 4 + 48, (104 - arg1 + -var32.field599) * 4 + var35 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static void method310(int arg0) {
        field994 = null;
        field996 = null;
        field999 = null;
        field992 = null;
        field990 = null;
        field998 = null;
        field997 = null;
        field981 = null;
        field988 = null;
        if (arg0 > -112) {
            field999 = null;
        }
        field995 = null;
        field983 = null;
        field993 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)[Lrd;")
    public static final class122[] method311(byte arg0) {
        field982++;
        class122[] var1 = new class122[class82.field1781];
        for (int var2 = 0; var2 < class82.field1781; var2++) {
            class122 var3 = var1[var2] = new class122();
            var3.field2694 = class6.field94;
            var3.field2689 = class34.field862;
            var3.field2691 = class2.field31[var2];
            var3.field2695 = class32.field822[var2];
            var3.field2693 = class150.field3434[var2];
            var3.field2690 = class138.field3173[var2];
            int var4 = var3.field2693 * var3.field2690;
            byte[] var5 = class67.field1503[var2];
            var3.field2692 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field2692[var6] = class93.field1998[method307(var5[var6], 255)];
            }
        }
        class63.method433(4096);
        if (arg0 == 123) {
            return var1;
        } else {
            return null;
        }
    }
}
