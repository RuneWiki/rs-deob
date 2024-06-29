import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class21 extends class13 {

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    private int field378 = 1;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    private int field391 = 0;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    private int field394 = 0;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Lkn;")
    public static class442 field377 = new class442("K", "T", "K", "K");

    @OriginalMember(owner = "client!o", name = "P", descriptor = "Lkn;")
    public static class442 field387 = new class442(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Lkn;")
    public static class442 field389 = new class442("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!o", name = "S", descriptor = "[Lbr;")
    public static class223[] field390 = new class223[4];

    @OriginalMember(owner = "client!o", name = "V", descriptor = "Z")
    public static boolean field393 = false;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Lwd;")
    public static class149 field380;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "[Lkr;")
    public static class447[] field384;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lkc;Lnq;Lnq;I)V", line = 4)
    public static final void method277(class68 arg0, class268 arg1, class268 arg2, int arg3) {
        class124.field1717 = arg2;
        class7.field109 = arg0;
        class397.field5676 = arg1;
        if (arg3 == 14830) {
            ++field388;
            if (class397.field5676 != null) {
                class357.field4883 = class397.field5676.method1739(67, 1);
            }
            if (class124.field1717 != null) {
                class347.field4748 = class124.field1717.method1739(101, 1);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)V", line = 23)
    public static final void method278(int arg0, byte arg1, int arg2) {
        if (arg1 >= -38) {
            method281(101);
        }
        int var3 = class52.field731 * arg0 >> 8;
        ++field386;
        if (~arg2 == 0 && !class429.field6078) {
            class112.method790(-122);
        } else if (~arg2 != 0 && (~class434.field6125 != ~arg2 || !class326.method2096((byte) 124)) && var3 != 0 && !class429.field6078) {
            class393.method2488(arg2, 0, class362.field5004, 2, false, var3, (byte) 92);
        }
        class434.field6125 = arg2;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 48)
    public final void method33(int arg0) {
        class282.method1845(-101);
        ++field379;
        int var2 = 40 % ((2 - arg0) / 51);
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V", line = 58)
    public static void method279(byte arg0) {
        if (arg0 == 106) {
            field377 = null;
            field389 = null;
            field384 = null;
            field390 = null;
            field387 = null;
            field380 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[I", line = 73)
    public final int[] method29(boolean arg0, int arg1) {
        ++field392;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            return null;
        } else {
            if (super.field263.field1845) {
                int var4 = class277.field3873[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; class269.field3751 > var6; ++var6) {
                    int var7 = class296.field4148[var6];
                    int var8 = var7 - 2048 >> 1;
                    int var11;
                    if (~this.field391 != -1) {
                        int var9 = var8 * var8 - -(var5 * var5) >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field378 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field378;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (this.field394 == 0) {
                        var12 = class139.field1995[(var12 & 4082) >> 4] + 4096 >> 1;
                    } else if (this.field394 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V", line = 149)
    public static final void method280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == 2048) {
            if (~class154.field2161 >= ~arg2 && arg3 <= class233.field3350 && ~class290.field4058 >= ~arg5 && arg4 <= class442.field6212) {
                class178.method1170(arg4, arg3, arg1, 106, arg2, arg5);
            } else {
                class361.method2323(arg4, arg3, arg1, 122, arg2, arg5);
            }
            ++field381;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 167)
    public class21() {
        super(0, true);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 170)
    public static final void method281(int arg0) {
        ++field383;
        if (class217.field2997 == null) {
            if (arg0 == 0) {
                int var1 = class180.field2469;
                int var2 = class237.field3366;
                int var3 = -var1 + class197.field2713 - class47.field661;
                int var4 = -class214.field2993 + -var2 + class335.field4614;
                if (~var1 < -1 || var3 > 0 || var2 > 0 || var4 > 0) {
                    try {
                        Container var5;
                        if (class79.field1119 == null) {
                            var5 = class241.field3426.field4121;
                        } else {
                            var5 = class79.field1119;
                        }
                        int var6 = 0;
                        int var7 = 0;
                        if (class79.field1119 == var5) {
                            Insets var8 = class79.field1119.getInsets();
                            var7 = var8.top;
                            var6 = var8.left;
                        }
                        Graphics var9 = var5.getGraphics();
                        var9.setColor(Color.black);
                        if (~var1 < -1) {
                            var9.fillRect(var6, var7, var1, class335.field4614);
                        }
                        if (~var2 < -1) {
                            var9.fillRect(var6, var7, class197.field2713, var2);
                        }
                        if (~var3 < -1) {
                            var9.fillRect(class197.field2713 + var6 + -var3, var7, var3, class335.field4614);
                        }
                        if (var4 > 0) {
                            var9.fillRect(var6, class335.field4614 + var7 + -var4, class197.field2713, var4);
                            return;
                        }
                    } catch (Exception var10) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lkh;BI)V", line = 242)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 <= 50) {
            field380 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field378 = arg0.method172((byte) 52);
                }
            } else {
                this.field394 = arg0.method172((byte) 52);
            }
        } else {
            this.field391 = arg0.method172((byte) 52);
        }
        ++field385;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIB)I", line = 301)
    public static final int method282(int arg0, int arg1, byte arg2) {
        ++field382;
        if (arg2 <= 16) {
            method281(-90);
        }
        int var3 = 0;
        while (~arg0 < -1) {
            var3 = var3 << 1 | arg1 & 1;
            --arg0;
            arg1 >>>= 1;
        }
        return var3;
    }
}
