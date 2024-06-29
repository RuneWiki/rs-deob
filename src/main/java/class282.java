import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class282 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Z")
    private boolean field4994 = false;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field4980 = 20;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "[[I")
    public static int[][] field4983 = new int[5][5000];

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field4996 = 0;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "F")
    public static float field4988;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "Z")
    public static boolean field4998;

    @OriginalMember(owner = "client!hb", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
    public final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4972++;
        try {
            if (class231.field3953 == null) {
                class199.field3390 = arg0;
                class37.field549 = arg0;
                class46.field721 = 0;
                class95.field1488 = arg3;
                class249.field4479 = arg2;
                class131.field2193 = arg2;
                class118.field1996 = 0;
                class231.field3953 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class177.field2957 == null) {
                    class66.field1052 = class177.field2957 = new class207(this, arg4, (String) null, 0);
                }
                class251 var7 = class177.field2957.method1423(this, arg1 ^ 0xFFFFFF8C, arg1);
                while (var7.field4488 == 0) {
                    class144.method1008(93, 10L);
                }
            } else {
                class62.field1023++;
                if (class62.field1023 >= 3) {
                    this.method1891(1, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class200.method1392(58, (String) null, var9);
            this.method1891(1, "crash");
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public abstract void method782(int arg0);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public abstract void method780(int arg0);

    @OriginalMember(owner = "client!hb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4969++;
        if (class71.field1114 == null) {
            return class177.field2957 == null || class177.field2957.field3504 == this ? super.getParameter(arg0) : class177.field2957.field3504.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lpe;B)Lpe;")
    public static final class237 method1888(class237 arg0, byte arg1) {
        field4992++;
        if (arg1 < 9) {
            method1888((class237) null, (byte) -21);
        }
        class237 var2 = client.method783(arg0);
        if (var2 == null) {
            var2 = arg0.field4215;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg10 - arg8;
        if (class118.field2004 > arg10) {
            var11++;
        }
        int var12 = arg9 - arg7;
        if (class243.field4368 > arg9) {
            var12++;
        }
        field4973++;
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var44 = arg3 * var13 + arg4 >> 16;
            int var45 = (var13 + 1) * arg3 + arg4 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg7 + var13 >> 6;
                if (var47 >= 0 && var47 <= (class265.field4649.length - 1)) {
                    int[][] var48 = class265.field4649[var47];
                    int var49 = arg1 + var45;
                    byte[][] var50 = class201.field3408[var47];
                    byte[][] var51 = class190.field3265[var47];
                    byte[][] var52 = class260.field4607[var47];
                    int var53 = arg1 + var44;
                    byte[][] var54 = class186.field3120[var47];
                    byte[][] var55 = class27.field390[var47];
                    for (int var56 = 0; var56 < var11; var56++) {
                        int var57 = arg5 * var56 + arg2 >> 16;
                        int var58 = arg2 + ((var56 + 1) * arg5) >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg0 + var57;
                            int var61 = arg0 + var58;
                            int var62 = arg8 + var56 >> 6;
                            int var63 = arg8 + var56 & 0x3F;
                            int var64 = arg7 + var13 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var62 < 0 || var48.length - 1 < var62 || var48[var62] == null) {
                                if (class73.field1155.field125 != -1) {
                                    var66 = class73.field1155.field125;
                                } else if ((var13 + arg7 & 0x4) == (arg8 + var56 & 0x4)) {
                                    var66 = class177.field2961[class290.field5107 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var62 < 0 || (var48.length - 1) < var62) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class122.method873(var53, var60, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var48[var62][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var50[var62] == null ? 0 : class177.field2961[var50[var62][var65] & 0xFF];
                            int var68 = var51[var62] == null ? 0 : class177.field2961[var51[var62][var65] & 0xFF];
                            if (var67 == 0 && var68 == 0) {
                                class122.method873(var53, var60, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    byte var69 = var52[var62] == null ? 0 : var52[var62][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class122.method873(var53, var60, var46, var59, var67);
                                    } else {
                                        class218.method1529(true, var70 >> 2, var59, var67, var46, var66, var60, class122.field2050, (byte) 123, var53, var69 & 0x3);
                                    }
                                }
                                if (var68 != 0) {
                                    byte var71 = var55[var62][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class122.method873(var53, var60, var46, var59, var68);
                                    }
                                    class218.method1529(var67 == 0, var72 >> 2, var59, var68, var46, 0, var60, class122.field2050, (byte) 93, var53, var71 & 0x3);
                                }
                            }
                            if (var54[var62] != null) {
                                int var73 = var54[var62][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var53;
                                    } else {
                                        var74 = var49 - 1;
                                    }
                                    int var75;
                                    if (var59 == 1) {
                                        var75 = var60;
                                    } else {
                                        var75 = var61 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var73 -= 4;
                                        var76 = 13369344;
                                    }
                                    if (var73 == 1) {
                                        class122.method882(var53, var60, var59, var76);
                                    } else if (var73 == 2) {
                                        class122.method865(var53, var60, var46, var76);
                                    } else if (var73 == 3) {
                                        class122.method882(var74, var60, var59, var76);
                                    } else if (var73 == 4) {
                                        class122.method865(var53, var75, var46, var76);
                                    } else if (var73 == 9) {
                                        class122.method882(var53, var60, var59, 16777215);
                                        class122.method865(var53, var60, var46, var76);
                                    } else if (var73 == 10) {
                                        class122.method882(var74, var60, var59, 16777215);
                                        class122.method865(var53, var60, var46, var76);
                                    } else if (var73 == 11) {
                                        class122.method882(var74, var60, var59, 16777215);
                                        class122.method865(var53, var75, var46, var76);
                                    } else if (var73 == 12) {
                                        class122.method882(var53, var60, var59, 16777215);
                                        class122.method865(var53, var75, var46, var76);
                                    } else if (var73 == 17) {
                                        class122.method865(var53, var60, 1, var76);
                                    } else if (var73 == 18) {
                                        class122.method865(var74, var60, 1, var76);
                                    } else if (var73 == 19) {
                                        class122.method865(var74, var75, 1, var76);
                                    } else if (var73 == 20) {
                                        class122.method865(var53, var75, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class122.method865(var53 + var78, -var78 + var75, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class122.method865(var53 + var77, var60 + var77, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg1 + var45;
                    int var80 = arg1 + var44;
                    for (int var81 = 0; var81 < var11; var81++) {
                        int var82;
                        if (class73.field1155.field125 != -1) {
                            var82 = class73.field1155.field125;
                        } else if ((var13 + arg7 & 0x4) == (var81 + arg8 & 0x4)) {
                            var82 = class177.field2961[class290.field5107 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var83 = ((var81 + 1) * arg5 + arg2 >> 16) + arg0;
                        int var84 = (arg2 + (arg5 * var81) >> 16) + arg0;
                        int var85 = var83 - var84;
                        class122.method873(var80, var84, var46, var85, var82);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var12 + 2; var14++) {
            int var15 = arg3 * var14 + arg4 >> 16;
            int var16 = arg4 + ((var14 + 1) * arg3) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg1 + var15;
                var10000 = arg1 + var16;
                int var20 = arg7 + var14 >> 6;
                if (var20 >= 0 && var20 <= (class107.field1676.length - 1)) {
                    short[][] var21 = class107.field1676[var20];
                    for (int var22 = -2; var22 < (var11 + 2); var22++) {
                        int var23 = arg5 * var22 + arg2 >> 16;
                        int var24 = (var22 + 1) * arg5 + arg2 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg0 + var24;
                            int var27 = arg0 + var23;
                            int var28 = var22 + arg8 >> 6;
                            if (var28 >= 0 && var28 <= var21.length - 1) {
                                int var29 = ((arg8 + var22 & 0x3F) << 6) + (var14 + arg7 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = (var21[var28][var29] & 0xD74E) >> 14;
                                    int var31 = var21[var28][var29] & 0x3FFF;
                                    if (var31 != 0) {
                                        if (var30 == 0) {
                                            int var41 = class126.field2120[var31 - 1].field3524 * var17 / 4;
                                            int var42 = class126.field2120[var31 - 1].field3528 * var25 / 4;
                                            if (var41 != 0 && var42 != 0) {
                                                int var43 = class126.field2120[var31 - 1].field3529 * var25 / 4;
                                                class126.field2120[var31 - 1].method101(var18, var27 - var43, var41, var42);
                                            }
                                        } else if (var30 == 1) {
                                            int var32 = class279.field4932[var31 - 1].field3524 * var17 / 4;
                                            int var33 = class279.field4932[var31 - 1].field3528 * var25 / 4;
                                            if (var32 != 0 && var33 != 0) {
                                                int var34 = class279.field4932[var31 - 1].field3529 * var25 / 4;
                                                class279.field4932[var31 - 1].method101(var18, var27 - var34, var32, var33);
                                            }
                                        } else if (var30 == 2) {
                                            int var35 = class121.field2041[var31 - 1].field3524 * var17 / 4;
                                            int var36 = class121.field2041[var31 - 1].field3528 * var25 / 4;
                                            if (var35 != 0 && var36 != 0) {
                                                int var37 = class121.field2041[var31 - 1].field3529 * var25 / 4;
                                                class121.field2041[var31 - 1].method101(var18, var27 - var37, var35, var36);
                                            }
                                        } else if (var30 == 3) {
                                            int var38 = class48.field767[var31 - 1].field3524 * var17 / 4;
                                            int var39 = class48.field767[var31 - 1].field3528 * var25 / 4;
                                            if (var38 != 0 && var39 != 0) {
                                                int var40 = class48.field767[var31 - 1].field3529 * var25 / 4;
                                                class48.field767[var31 - 1].method101(var18, var27 - var40, var38, var39);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg6 != 1) {
            method1896(-20, 11, 82);
        }
    }

    @OriginalMember(owner = "client!hb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field4960++;
        this.destroy();
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    private final void method1890(int arg0) {
        field4989++;
        long var2 = class149.method1024(-14898);
        long var4 = class170.field2849[class189.field3254];
        class170.field2849[class189.field3254] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class131.field2178 = ((var6 >> 1) + 32000) / var6;
        }
        class189.field3254 = class189.field3254 + 1 & 0x1F;
        if ((class179.field2987++) > 50) {
            class179.field2987 -= 50;
            class190.field3268 = true;
            class93.field1466.setSize(class249.field4479, class199.field3390);
            class93.field1466.setVisible(true);
            if (class71.field1114 != null && class112.field1911 == null) {
                Insets var7 = class71.field1114.getInsets();
                class93.field1466.setLocation(class118.field1996 + var7.left, class46.field721 + var7.top);
            } else {
                class93.field1466.setLocation(class118.field1996, class46.field721);
            }
        }
        this.method798(-30410);
        if (arg0 >= -76) {
            this.method1890(109);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1891(int arg0, String arg1) {
        if (arg0 != 1) {
            this.method1893((byte) -74);
        }
        field4975++;
        if (this.field4994) {
            return;
        }
        this.field4994 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!hb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field4962++;
        class179.field2980 = false;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public abstract void method798(int arg0);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)Z")
    public final boolean method1892(int arg0) {
        field4987++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1891(arg0, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public abstract void method786(boolean arg0);

    @OriginalMember(owner = "client!hb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4970++;
        class179.field2980 = true;
        class190.field3268 = true;
    }

    @OriginalMember(owner = "client!hb", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4986++;
        if (class71.field1114 == null) {
            return class177.field2957 == null || class177.field2957.field3504 == this ? super.getCodeBase() : class177.field2957.field3504.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4991++;
        if (class71.field1114 == null) {
            return class177.field2957 == null || class177.field2957.field3504 == this ? super.getDocumentBase() : class177.field2957.field3504.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    private final void method1893(byte arg0) {
        long var2 = class149.method1024(-14898);
        field4968++;
        long var4 = class223.field3829[class30.field455];
        if (arg0 <= 4) {
            return;
        }
        class223.field3829[class30.field455] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class30.field455 = class30.field455 + 1 & 0x1F;
        synchronized (this) {
            class112.field1914 = class179.field2980;
        }
        this.method791(-122);
    }

    @OriginalMember(owner = "client!hb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4978++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1894(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field4981++;
        try {
            class199.field3390 = arg4;
            class37.field549 = arg4;
            class95.field1488 = arg6;
            class231.field3953 = this;
            class249.field4479 = arg1;
            class131.field2193 = arg1;
            class46.field721 = 0;
            class118.field1996 = 0;
            class71.field1114 = new Frame();
            class71.field1114.setTitle("Jagex");
            class71.field1114.setResizable(true);
            class71.field1114.addWindowListener(this);
            class71.field1114.setVisible(true);
            class71.field1114.toFront();
            if (arg5 != 31878) {
                field4983 = null;
            }
            Insets var8 = class71.field1114.getInsets();
            class71.field1114.setSize(class131.field2193 + var8.left + var8.right, class37.field549 + var8.top - -var8.bottom);
            class66.field1052 = class177.field2957 = new class207((Applet) null, arg0, arg3, arg2);
            class251 var9 = class177.field2957.method1423(this, arg5 ^ 0xFFFF832D, 1);
            while (var9.field4488 == 0) {
                class144.method1008(123, 10L);
            }
        } catch (Exception var11) {
            class200.method1392(58, (String) null, var11);
        }
    }

    @OriginalMember(owner = "client!hb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4964++;
    }

    @OriginalMember(owner = "client!hb", name = "run", descriptor = "()V")
    public final void run() {
        field4974++;
        try {
            if (class207.field3498 != null) {
                String var1 = class207.field3498.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class207.field3510;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1891(1, "wrongjava");
                        return;
                    }
                    class112.field1912 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class207.field3510 == null || class207.field3510.equals("1.4.2"))) {
                    this.method1891(1, "wrongjava");
                    return;
                }
            }
            if (class207.field3510 != null && class207.field3510.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class207.field3510.length() > var3) {
                    char var5 = class207.field3510.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var5 - (48 - var4 * 10);
                    var3++;
                }
                if (var4 >= 5) {
                    class30.field452 = true;
                }
            }
            if (class177.field2957.field3504 != null) {
                Method var6 = class207.field3518;
                if (var6 != null) {
                    try {
                        var6.invoke(class177.field2957.field3504, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class190.method1315((byte) 53);
            this.method1897(-1);
            class276.field4897 = class86.method569(class199.field3390, -94, class93.field1466, class249.field4479);
            this.method780(-41);
            class17.field238 = class291.method1951(-22738);
            while (class49.field773 == 0L || class149.method1024(-14898) < class49.field773) {
                class175.field2930 = class17.field238.method481(field4980, (byte) 9, class112.field1912);
                for (int var7 = 0; var7 < class175.field2930; var7++) {
                    this.method1893((byte) 93);
                }
                this.method1890(-117);
                class19.method126(class93.field1466, class177.field2957, (byte) -125);
            }
        } catch (Exception var10) {
            class200.method1392(58, (String) null, var10);
            this.method1891(1, "crash");
        }
        this.method1895(0, true);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
    private final void method1895(int arg0, boolean arg1) {
        field4993++;
        synchronized (this) {
            if (class172.field2892) {
                return;
            }
            class172.field2892 = true;
        }
        if (class177.field2957.field3504 != null) {
            class177.field2957.field3504.destroy();
        }
        try {
            this.method782(arg0);
        } catch (Exception var9) {
        }
        if (class93.field1466 != null) {
            try {
                class93.field1466.removeFocusListener(this);
                class93.field1466.getParent().remove(class93.field1466);
            } catch (Exception var8) {
            }
        }
        if (class177.field2957 != null) {
            try {
                class177.field2957.method1426((byte) -107);
            } catch (Exception var7) {
            }
        }
        this.method786(false);
        if (class71.field1114 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
    public static final void method1896(int arg0, int arg1, int arg2) {
        field4982++;
        class274 var3 = class166.method1116(13, arg1, true);
        if (arg2 != 30707) {
            field4996 = 8;
        }
        var3.method1835(-41);
        var3.field4802 = arg0;
    }

    @OriginalMember(owner = "client!hb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4984++;
    }

    @OriginalMember(owner = "client!hb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4995++;
        if (class231.field3953 != this || class172.field2892) {
            return;
        }
        class190.field3268 = true;
        if (class30.field452 && (class149.method1024(-14898) - class4.field81) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class131.field2193 <= var2.width && class37.field549 <= var2.height) {
                class204.field3483 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4990++;
    }

    @OriginalMember(owner = "client!hb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4963++;
        if (class71.field1114 == null) {
            return class177.field2957 == null || class177.field2957.field3504 == this ? super.getAppletContext() : class177.field2957.field3504.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4976++;
    }

    @OriginalMember(owner = "client!hb", name = "start", descriptor = "()V")
    public final void start() {
        field4966++;
        if (class231.field3953 == this && !class172.field2892) {
            class49.field773 = 0L;
        }
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
    public abstract void method791(int arg0);

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
    public final synchronized void method1897(int arg0) {
        if (class93.field1466 != null) {
            class93.field1466.removeFocusListener(this);
            class93.field1466.getParent().remove(class93.field1466);
        }
        field4967++;
        Container var2;
        if (class112.field1911 != null) {
            var2 = class112.field1911;
        } else if (class71.field1114 == null) {
            var2 = class177.field2957.field3504;
        } else {
            var2 = class71.field1114;
        }
        var2.setLayout((LayoutManager) null);
        class93.field1466 = new class39(this);
        var2.add(class93.field1466);
        class93.field1466.setSize(class249.field4479, class199.field3390);
        class93.field1466.setVisible(true);
        if (class71.field1114 == var2) {
            Insets var3 = class71.field1114.getInsets();
            class93.field1466.setLocation(class118.field1996 + var3.left, class46.field721 + var3.top);
        } else {
            class93.field1466.setLocation(class118.field1996, class46.field721);
        }
        if (arg0 != -1) {
            providesignlink((class207) null);
        }
        class93.field1466.addFocusListener(this);
        class93.field1466.requestFocus();
        class112.field1914 = true;
        class179.field2980 = true;
        class190.field3268 = true;
        class204.field3483 = false;
        class4.field81 = class149.method1024(-14898);
    }

    @OriginalMember(owner = "client!hb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4977++;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static void method1898(byte arg0) {
        if (arg0 != -13) {
            field4983 = null;
        }
        field4983 = null;
    }

    @OriginalMember(owner = "client!hb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4979++;
    }

    @OriginalMember(owner = "client!hb", name = "stop", descriptor = "()V")
    public final void stop() {
        field4961++;
        if (class231.field3953 == this && !class172.field2892) {
            class49.field773 = class149.method1024(-14898) + 4000L;
        }
    }

    @OriginalMember(owner = "client!hb", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4971++;
        if (class231.field3953 == this && !class172.field2892) {
            class49.field773 = class149.method1024(-14898);
            class144.method1008(116, 5000L);
            class66.field1052 = null;
            this.method1895(0, false);
        }
    }

    @OriginalMember(owner = "client!hb", name = "providesignlink", descriptor = "(Llb;)V")
    public static final void providesignlink(class207 arg0) {
        class177.field2957 = arg0;
        class66.field1052 = arg0;
        field4965++;
    }
}
