import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class129 {

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lm;")
    public class79 field1765;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "[I")
    public static int[] field1766 = new int[4];

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "[I")
    public static int[] field1770 = new int[100];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Llk;", line = 5)
    public static final class311 method819(int arg0, int arg1) {
        int var2 = 113 / ((arg0 + 24) / 58);
        field1755++;
        return class503.field7399 && arg1 >= class166.field2152 && class116.field1632 >= arg1 ? class301.field3902[arg1 - class166.field2152] : null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIBI)V", line = 25)
    public final void method826(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 53) {
            this.method833(-19, 84, 1, 111);
        }
        field1759++;
        this.method875(arg4, arg2, arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V", line = 36)
    public static final void method827(int arg0) {
        if (arg0 <= 60) {
            return;
        }
        if (class342.field4357 < 102) {
            class342.field4357 += 6;
        }
        field1764++;
        if (class458.field6411 != 0) {
            class92.field1277 -= class458.field6411 * 5;
            if (class92.field1277 >= class165.field2139) {
                class92.field1277 = class165.field2139 - 1;
            }
            if (class92.field1277 < 0) {
                class92.field1277 = 0;
            }
            class458.field6411 = 0;
        }
        for (int var1 = 0; var1 < class437.field5995; var1++) {
            int var2 = class171.field2216[var1].method1057((byte) -117);
            char var3 = class171.field2216[var1].method1054(false);
            if (var2 == 84) {
                class57.method329(-17544);
            } else if (class439.field6113.method1488((byte) 123, 82) && var2 == 66) {
                if (class338.field4326 != null) {
                    String var4 = "";
                    for (int var5 = class99.field1384.length - 1; var5 >= 0; var5--) {
                        if (class99.field1384[var5] != null && class99.field1384[var5].length() > 0) {
                            var4 = var4 + class99.field1384[var5] + '\n';
                        }
                    }
                    class338.field4326.setContents(new StringSelection(var4), null);
                }
            } else if (class439.field6113.method1488((byte) 123, 82) && var2 == 67) {
                if (class338.field4326 != null) {
                    Transferable var6 = class338.field4326.getContents(null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class332.method1978((byte) -90, '\n', var7);
                                if (var8.length <= 1) {
                                    class268.field3398 = class268.field3398 + var7;
                                } else {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class268.field3398 = var8[var9];
                                        class57.method329(-17544);
                                    }
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class502.field7381 > 0) {
                class268.field3398 = class268.field3398.substring(0, class502.field7381 - 1) + class268.field3398.substring(class502.field7381);
                class502.field7381--;
            } else if (var2 == 101 && class502.field7381 < class268.field3398.length()) {
                class268.field3398 = class268.field3398.substring(0, class502.field7381) + class268.field3398.substring(class502.field7381 + 1);
            } else if (var2 == 96 && class502.field7381 > 0) {
                class502.field7381--;
            } else if (var2 == 97 && class502.field7381 < class268.field3398.length()) {
                class502.field7381++;
            } else if (var2 == 102) {
                class502.field7381 = 0;
            } else if (var2 == 103) {
                class502.field7381 = class268.field3398.length();
            } else if (var2 == 104 && class295.field3838 < class99.field1384.length) {
                class295.field3838++;
                class297.method1784(true);
                class502.field7381 = class268.field3398.length();
            } else if (var2 == 105 && class295.field3838 > 0) {
                class295.field3838--;
                class297.method1784(true);
                class502.field7381 = class268.field3398.length();
            } else if (class216.method1389(var3, 10291) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class268.field3398 = class268.field3398.substring(0, class502.field7381) + class171.field2216[var1].method1054(false) + class268.field3398.substring(class502.field7381);
                class502.field7381++;
            }
        }
        class437.field5995 = 0;
        class218.method1396((byte) 110);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lhs;Ljava/awt/Canvas;Lm;IIB)Lqa;", line = 215)
    public static final synchronized class129 method839(class441 arg0, Canvas arg1, class79 arg2, int arg3, int arg4, byte arg5) {
        field1767++;
        int var6 = -1;
        if (arg5 > -64) {
            return null;
        }
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class30.field506[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class129 var9;
        if (arg4 == 0) {
            var9 = class239.method1515(arg1, (byte) 70, arg2, var6);
        } else if (arg4 == 1) {
            var9 = class162.method1079(arg2, var6, (byte) 95, arg3, arg1, arg0);
        } else if (arg4 == 2) {
            var9 = class315.method1875(-47, arg2, arg0, var6, arg1);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class30.field506[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 277)
    protected void finalize() {
        field1763++;
        this.method878((byte) -122);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V", line = 297)
    public static void method858(int arg0) {
        field1766 = null;
        int var1 = 45 / ((-arg0 - 27) / 51);
        field1770 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V", line = 314)
    public final void method866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == -5152) {
            this.method861(arg2, arg4, arg3, arg0, arg5, 1);
            field1758++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 340)
    public final void method878(byte arg0) {
        field1769++;
        class30.field506[this.field1760] = false;
        this.method893();
        if (arg0 != -122) {
            this.field1765 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIBI)V", line = 356)
    public final void method881(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.method883(arg1, arg2, arg0, arg4, 1);
        field1761++;
        if (arg3 >= -19) {
            field1756 = -86;
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V", line = 401)
    public final void method902(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = -67 / ((arg5 + 47) / 46);
        field1768++;
        this.method918(arg4, arg1, arg3, arg2, arg0, 1);
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V", line = 421)
    public static final void method907(int arg0) {
        if (arg0 > -94) {
            field1756 = 49;
        }
        if (class512.field7538 != null) {
            class193.field2500.method2128((byte) -12);
            class459.method2711();
            class21.method148((byte) -109);
            class222.method1422(-2);
            class495.method2960(true);
            class418.method2458(32436);
            if (class11.field190 != null) {
                class11.field190.method2811(0);
            }
            class318.method1897(true);
            class312.method1859(5);
            class346.method2039(false);
            class398.method2369(30935, false);
            class214.method1362(-1);
            for (int var1 = 0; var1 < 2048; var1++) {
                class518 var5 = class76.field952[var1];
                if (var5 != null) {
                    var5.field5250 = null;
                    for (int var6 = 0; var6 < var5.field5242.length; var6++) {
                        var5.field5242[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class527.field7791.length; var2++) {
                class295 var3 = class527.field7791[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5242.length; var4++) {
                        var3.field5242[var4] = null;
                    }
                }
            }
            class512.field7538.method878((byte) -122);
            class512.field7538 = null;
        }
        field1757++;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V", line = 499)
    public final void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < -20) {
            this.method891(arg1, arg3, arg2, arg4, arg0, 1);
            field1771++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILm;)V", line = 526)
    public class129(int arg0, class79 arg1) {
        this.field1760 = arg0;
        this.field1765 = arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V", line = 535)
    public final void method920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method904(arg1, arg2, arg4, arg3, arg0);
        field1762++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method817(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method818(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method820(int arg0);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public abstract void method821(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public abstract void method822();

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public abstract void method823(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lc;Liv;Lia;Laq;I)V")
    public abstract void method824(class507 arg0, class287 arg1, class142 arg2, class530 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method825(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
    public abstract float method828();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lia;)V")
    public abstract void method829(class142 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
    public abstract void method831();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ll;)V")
    public abstract void method832(class125 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method833(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
    public abstract boolean method834();

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
    public abstract int[] method835(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
    public abstract void method836();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Liv;)V")
    public abstract void method838(class287 arg0);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
    public abstract void method840(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public abstract void method841();

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
    public abstract void method842(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()I")
    public abstract int method843();

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
    public abstract boolean method844();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method845(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
    public abstract void method846(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Lia;")
    public abstract class142 method847();

    @OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
    public abstract void method848(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Ll;")
    public abstract class125 method849(int arg0);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
    public abstract boolean method850();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lne;Z)Lf;")
    public abstract class404 method851(class136 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method852(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method853(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
    public abstract boolean method854();

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
    public abstract void method855(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
    public abstract void method856();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method857(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Lvh;")
    public abstract class191 method859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lvh;Lvh;FLvh;)Lvh;")
    public abstract class191 method860(class191 arg0, class191 arg1, float arg2, class191 arg3);

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
    public abstract void method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lvh;)V")
    public abstract void method862(class191 arg0);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
    public abstract float method863();

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
    public abstract void method864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
    public abstract void method865();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lov;[Lne;Z)Loa;")
    public abstract class167 method867(class278 arg0, class136[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Liv;Lia;[Laq;I)V")
    public abstract void method868(class507[] arg0, class287 arg1, class142 arg2, class530[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILea;II)V")
    public abstract void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class113 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lve;")
    public abstract class182 method870(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
    public abstract int method871();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
    public abstract int method872();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Lia;[Laq;I)V")
    public abstract void method873(class507[] arg0, class142 arg1, class530[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public abstract void method874(int arg0);

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
    public abstract void method875(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
    public abstract int method876();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method877(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public abstract boolean method879();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method880(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
    public abstract boolean method882();

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
    public abstract void method883(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
    public abstract boolean method884();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
    public abstract int method885(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public abstract boolean method886();

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
    public abstract boolean method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Luu;IIII)Lc;")
    public abstract class507 method888(class420 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
    public abstract int method889();

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
    public abstract boolean method890();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
    public abstract void method892();

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()V")
    public abstract void method893();

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
    public abstract void method894(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method895(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lea;")
    public abstract class113 method896(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public abstract boolean method897();

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
    public abstract boolean method898();

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
    public abstract void method899(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
    public abstract void method900(int arg0);

    @OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
    public abstract void method901(float arg0);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
    public abstract boolean method903();

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
    public abstract void method904(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class404 method905(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lve;)V")
    public abstract void method906(int arg0, class182[] arg1);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
    public abstract void method908(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public abstract class251 method909(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
    public abstract void method911();

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILea;II)V")
    public abstract void method912(int arg0, class113 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
    public abstract void method913(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)V")
    public abstract void method914(int arg0);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
    public abstract boolean method915();

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Lia;")
    public abstract class142 method916();

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
    public abstract int method917();

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
    public abstract void method918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method919(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class404 method921(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
    public abstract void method922(int arg0);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public abstract boolean method923();

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
    public abstract boolean method924();

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
    public abstract void method925(int arg0, int arg1, int arg2, int arg3);
}
