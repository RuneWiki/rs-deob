import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Lij;")
    public static class50 field648 = class78.method578(125, "; Expires=");

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field660 = -1;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Z")
    public static final boolean method270(int arg0, int arg1) {
        if (arg0 == -2) {
            field654++;
            return (arg1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class112.field1978 != null) {
            class63.field1215 = 0;
            class65.field1256 = -1;
            class241.field4161 = -1;
        }
        field661++;
    }

    @OriginalMember(owner = "client!fi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field650++;
        if (class112.field1978 != null) {
            class63.field1215 = 0;
            class65.field1256 = arg0.getX();
            class241.field4161 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method271(byte arg0) {
        field648 = null;
        if (arg0 != -125) {
            field649 = 113;
        }
    }

    @OriginalMember(owner = "client!fi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field658++;
        if (class112.field1978 != null) {
            class63.field1215 = 0;
            class123.field2158 = arg0.getX();
            class24.field534 = arg0.getY();
            class219.field3657 = class104.method785(-1);
            if (arg0.isMetaDown()) {
                class103.field1884 = 2;
                class36.field708 = 2;
            } else {
                class103.field1884 = 1;
                class36.field708 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field656++;
    }

    @OriginalMember(owner = "client!fi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field655++;
    }

    @OriginalMember(owner = "client!fi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class112.field1978 != null) {
            class63.field1215 = 0;
            class65.field1256 = arg0.getX();
            class241.field4161 = arg0.getY();
        }
        field653++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([Lnh;IIZ)V")
    public static final void method272(class57[] arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 < arg2) {
            int var4 = arg2 + 1;
            int var5 = arg1 - 1;
            int var6 = (arg1 + arg2) / 2;
            class57 var7 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var7;
            while (var5 < var4) {
                boolean var8 = true;
                do {
                    var4--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class244.field4251[var9] == 2) {
                            var11 = var7.field1035;
                            var10 = arg0[var4].field1035;
                        } else if (class244.field4251[var9] == 1) {
                            var10 = arg0[var4].field1038;
                            var11 = var7.field1038;
                            if (var11 == -1 && class179.field2988[var9] == 1) {
                                var11 = 2001;
                            }
                            if (var10 == -1 && class179.field2988[var9] == 1) {
                                var10 = 2001;
                            }
                        } else if (class244.field4251[var9] == 3) {
                            var10 = arg0[var4].field1034 ? 1 : 0;
                            var11 = var7.field1034 ? 1 : 0;
                        } else {
                            var10 = arg0[var4].field1032;
                            var11 = var7.field1032;
                        }
                        if (var10 != var11) {
                            if ((class179.field2988[var9] != 1 || var10 <= var11) && (class179.field2988[var9] != 0 || var11 <= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var5++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class244.field4251[var13] == 2) {
                            var14 = var7.field1035;
                            var15 = arg0[var5].field1035;
                        } else if (class244.field4251[var13] == 1) {
                            var14 = var7.field1038;
                            if (var14 == -1 && class179.field2988[var13] == 1) {
                                var14 = 2001;
                            }
                            var15 = arg0[var5].field1038;
                            if (var15 == -1 && class179.field2988[var13] == 1) {
                                var15 = 2001;
                            }
                        } else if (class244.field4251[var13] == 3) {
                            var15 = arg0[var5].field1034 ? 1 : 0;
                            var14 = var7.field1034 ? 1 : 0;
                        } else {
                            var15 = arg0[var5].field1032;
                            var14 = var7.field1032;
                        }
                        if (var14 != var15) {
                            if ((class179.field2988[var13] != 1 || var15 >= var14) && (class179.field2988[var13] != 0 || var14 >= var15)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var5 < var4) {
                    class57 var16 = arg0[var5];
                    arg0[var5] = arg0[var4];
                    arg0[var4] = var16;
                }
            }
            method272(arg0, arg1, var4, arg3);
            method272(arg0, var4 + 1, arg2, true);
        }
        if (!arg3) {
            field648 = null;
        }
        field652++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILff;)V")
    public static final void method273(int arg0, class237 arg1) {
        field659++;
        arg1.field4028 = false;
        if (arg1.field3996 != -1) {
            class186 var2 = class123.method891(-5664, arg1.field3996);
            if (var2 == null || var2.field3043 == null) {
                arg1.field3996 = -1;
            } else {
                arg1.field3994++;
                if (var2.field3043.length > arg1.field3982 && arg1.field3994 > var2.field3038[arg1.field3982]) {
                    arg1.field3982++;
                    arg1.field3994 = 1;
                    class5.method33(arg1.field4027, arg1.field3982, ~arg0, arg1.field3990, var2, class239.field4067 == arg1);
                }
                if (arg1.field3982 >= var2.field3043.length) {
                    arg1.field3994 = 0;
                    arg1.field3982 = 0;
                    class5.method33(arg1.field4027, arg1.field3982, ~arg0, arg1.field3990, var2, class239.field4067 == arg1);
                }
            }
        }
        if (arg1.field3966 != -1 && class244.field4245 >= arg1.field3997) {
            if (arg1.field3973 < 0) {
                arg1.field3973 = 0;
            }
            int var3 = class210.method1405(1, arg1.field3966).field1951;
            if (var3 == -1) {
                arg1.field3966 = -1;
            } else {
                class186 var4 = class123.method891(-5664, var3);
                if (var4 == null || var4.field3043 == null) {
                    arg1.field3966 = -1;
                } else {
                    arg1.field4014++;
                    if (var4.field3043.length > arg1.field3973 && var4.field3038[arg1.field3973] < arg1.field4014) {
                        arg1.field3973++;
                        arg1.field4014 = 1;
                        class5.method33(arg1.field4027, arg1.field3973, 0, arg1.field3990, var4, class239.field4067 == arg1);
                    }
                    if (var4.field3043.length <= arg1.field3973) {
                        arg1.field3966 = -1;
                    }
                }
            }
        }
        if (arg1.field4002 != -1 && arg1.field3989 <= 1) {
            class186 var5 = class123.method891(-5664, arg1.field4002);
            if (var5.field3041 == 1 && arg1.field4032 > 0 && class244.field4245 >= arg1.field4004 && class244.field4245 > arg1.field4021) {
                arg1.field3989 = 1;
                return;
            }
        }
        if (arg1.field4002 != -1 && arg1.field3989 == 0) {
            class186 var6 = class123.method891(arg0 ^ 0x161F, arg1.field4002);
            if (var6 == null || var6.field3043 == null) {
                arg1.field4002 = -1;
            } else {
                arg1.field3985++;
                if (var6.field3043.length > arg1.field4034 && arg1.field3985 > var6.field3038[arg1.field4034]) {
                    arg1.field3985 = 1;
                    arg1.field4034++;
                    class5.method33(arg1.field4027, arg1.field4034, 0, arg1.field3990, var6, class239.field4067 == arg1);
                }
                if (arg1.field4034 >= var6.field3043.length) {
                    arg1.field4034 -= var6.field3030;
                    arg1.field4005++;
                    if (var6.field3040 <= arg1.field4005) {
                        arg1.field4002 = -1;
                    } else if (arg1.field4034 >= 0 && var6.field3043.length > arg1.field4034) {
                        class5.method33(arg1.field4027, arg1.field4034, 0, arg1.field3990, var6, class239.field4067 == arg1);
                    } else {
                        arg1.field4002 = -1;
                    }
                }
                arg1.field4028 = var6.field3057;
            }
        }
        if (arg0 != -1) {
            field648 = null;
        }
        if (arg1.field3989 > 0) {
            arg1.field3989--;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V")
    public static final void method274(int arg0, int arg1) {
        if (arg0 == 37) {
            class252.field4369 = 3.0D;
        } else if (arg0 == 50) {
            class252.field4369 = 4.0D;
        } else if (arg0 == 75) {
            class252.field4369 = 6.0D;
        } else {
            class252.field4369 = 8.0D;
        }
        if (arg1 < 78) {
            method274(72, -24);
        }
        class254.field4393 = -1;
        class254.field4393 = -1;
        field651++;
    }

    @OriginalMember(owner = "client!fi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field657++;
        if (class112.field1978 != null) {
            class63.field1215 = 0;
            class65.field1256 = arg0.getX();
            class241.field4161 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field646++;
        if (class112.field1978 != null) {
            class63.field1215 = 0;
            class36.field708 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field645++;
        if (class112.field1978 != null) {
            class36.field708 = 0;
        }
    }
}
