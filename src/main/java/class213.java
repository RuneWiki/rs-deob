import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class213 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lpj;")
    public static class237 field3633 = class33.method353("::fpsoff", 25);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "[I")
    public static int[] field3635 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field3632 = -1;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3627 = new CRC32();

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Z")
    public static boolean field3641 = false;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "[[I")
    public static int[][] field3643 = new int[5][5000];

    @OriginalMember(owner = "client!re", name = "u", descriptor = "[I")
    public static int[] field3644 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "[I")
    public static int[] field3637;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "[Lcj;")
    public static class115[] field3642;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "[[I")
    public static int[][] field3639;

    @OriginalMember(owner = "client!re", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3628++;
        if (class87.field1600 == null) {
            return;
        }
        class146.field2609 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class120.field2093.length) {
            var3 = class120.field2093[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class159.field2865 >= 0 && var3 >= 0) {
            class113.field1982[class159.field2865] = var3;
            class159.field2865 = class159.field2865 + 1 & 0x7F;
            if (class178.field3127 == class159.field2865) {
                class159.field2865 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class131.field2293 + 1 & 0x7F;
            if (class206.field3512 != var4) {
                class125.field2189[class131.field2293] = var3;
                class139.field2397[class131.field2293] = -1;
                class131.field2293 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!re", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3636++;
        if (class87.field1600 != null) {
            int var2 = class80.method619(arg0, -96);
            if (var2 >= 0) {
                int var3 = class131.field2293 + 1 & 0x7F;
                if (class206.field3512 != var3) {
                    class125.field2189[class131.field2293] = -1;
                    class139.field2397[class131.field2293] = var2;
                    class131.field2293 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZII)V")
    public static final void method1424(boolean arg0, int arg1, int arg2) {
        field3624++;
        if (!arg0) {
            field3633 = null;
        }
        class270 var3 = class202.method1368(-15, 13, arg2);
        var3.method1793(13);
        var3.field4619 = arg1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public static final void method1425(int arg0, int arg1) {
        if (arg0 >= 123) {
            class190.field3304.method939(arg1, 1);
            field3625++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([S[Lpj;III)V")
    public static final void method1426(short[] arg0, class237[] arg1, int arg2, int arg3, int arg4) {
        if (arg3 > arg2) {
            int var5 = arg2;
            int var6 = (arg2 + arg3) / 2;
            class237 var7 = arg1[var6];
            arg1[var6] = arg1[arg3];
            arg1[arg3] = var7;
            short var8 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].method1577(var7, (byte) 18)) {
                    class237 var10 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg1[arg3] = arg1[var5];
            arg1[var5] = var7;
            arg0[arg3] = arg0[var5];
            arg0[var5] = var8;
            method1426(arg0, arg1, arg2, var5 - 1, 1);
            method1426(arg0, arg1, var5 + 1, arg3, arg4);
        }
        field3638++;
        if (arg4 != 1) {
            field3639 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3629++;
        if (class87.field1600 != null) {
            class159.field2865 = -1;
        }
    }

    @OriginalMember(owner = "client!re", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class87.field1600 != null) {
            class146.field2609 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class120.field2093.length) {
                var3 = class120.field2093[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class159.field2865 >= 0 && var3 >= 0) {
                class113.field1982[class159.field2865] = ~var3;
                class159.field2865 = class159.field2865 + 1 & 0x7F;
                if (class178.field3127 == class159.field2865) {
                    class159.field2865 = -1;
                }
            }
        }
        field3630++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILsb;)V")
    public static final void method1427(int arg0, class215 arg1) {
        arg1.field3696 = arg1.field3723;
        field3626++;
        if (arg1.field3740 == 0) {
            arg1.field3701 = 0;
            return;
        }
        if (arg1.field3722 != -1 && arg1.field3688 == 0) {
            class256 var2 = class256.method1732(arg1.field3722, true);
            if (arg1.field3703 > 0 && var2.field4392 == 0) {
                arg1.field3701++;
                return;
            }
            if (arg1.field3703 <= 0 && var2.field4387 == 0) {
                arg1.field3701++;
                return;
            }
        }
        int var3 = arg1.field3700;
        int var4 = arg1.field3710;
        int var5 = arg1.field3715[arg1.field3740 - 1] * 128 + arg1.method1441((byte) 63) * 64;
        int var6 = arg1.field3743[arg1.field3740 - 1] * 128 + (arg1.method1441((byte) 98) * 64);
        if ((var5 - var4) > 256 || (var5 - var4) < -256 || var6 - var3 > 256 || (var6 - var3) < -256) {
            arg1.field3710 = var5;
            arg1.field3700 = var6;
            return;
        }
        if (var4 < var5) {
            if (var6 > var3) {
                arg1.field3717 = 1280;
            } else if (var3 <= var6) {
                arg1.field3717 = 1536;
            } else {
                arg1.field3717 = 1792;
            }
        } else if (var5 >= var4) {
            if (var6 > var3) {
                arg1.field3717 = 1024;
            } else if (var6 < var3) {
                arg1.field3717 = 0;
            }
        } else if (var6 > var3) {
            arg1.field3717 = 768;
        } else if (var6 < var3) {
            arg1.field3717 = 256;
        } else {
            arg1.field3717 = 512;
        }
        int var7 = arg1.field3712;
        int var8 = arg1.field3717 - arg1.field3697 & 0x7FF;
        int var9 = 4;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field3711;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field3726;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field3679;
        }
        boolean var10 = true;
        if (var7 == -1) {
            var7 = arg1.field3711;
        }
        arg1.field3696 = var7;
        if (arg1 instanceof class210) {
            var10 = ((class210) arg1).field3586.field3977;
        }
        if (var10) {
            if (arg1.field3717 != arg1.field3697 && arg1.field3719 == -1 && arg1.field3677 != 0) {
                var9 = 2;
            }
            if (arg1.field3740 > 2) {
                var9 = 6;
            }
            if (arg1.field3740 > 3) {
                var9 = 8;
            }
            if (arg1.field3701 > 0 && arg1.field3740 > 1) {
                var9 = 8;
                arg1.field3701--;
            }
        } else {
            if (arg1.field3740 > 1) {
                var9 = 6;
            }
            if (arg1.field3740 > 2) {
                var9 = 8;
            }
            if (arg1.field3701 > 0 && arg1.field3740 > 1) {
                var9 = 8;
                arg1.field3701--;
            }
        }
        if (arg1.field3683[arg1.field3740 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var4) {
            arg1.field3710 += var9;
            if (arg1.field3710 > var5) {
                arg1.field3710 = var5;
            }
        } else if (var4 > var5) {
            arg1.field3710 -= var9;
            if (var5 > arg1.field3710) {
                arg1.field3710 = var5;
            }
        }
        if (var9 >= 8 && arg1.field3711 == arg1.field3696 && arg1.field3741 != -1) {
            arg1.field3696 = arg1.field3741;
        }
        if (arg0 < 59) {
            return;
        }
        if (var6 > var3) {
            arg1.field3700 += var9;
            if (arg1.field3700 > var6) {
                arg1.field3700 = var6;
            }
        } else if (var6 < var3) {
            arg1.field3700 -= var9;
            if (var6 > arg1.field3700) {
                arg1.field3700 = var6;
            }
        }
        if (arg1.field3710 != var5 || arg1.field3700 != var6) {
            return;
        }
        arg1.field3740--;
        if (arg1.field3703 > 0) {
            arg1.field3703--;
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1428(int arg0) {
        field3642 = null;
        field3637 = null;
        field3633 = null;
        field3639 = null;
        if (arg0 < 47) {
            method1424(true, -87, 8);
        }
        field3627 = null;
        field3644 = null;
        field3635 = null;
        field3643 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static final void method1429(byte arg0) {
        if (arg0 != -125) {
            return;
        }
        while (class65.field1288.method364(class120.field2130, arg0 ^ 0x26) >= 11) {
            int var1 = class65.field1288.method358(200, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class232.field4025[var1] == null) {
                var2 = true;
                class232.field4025[var1] = new class271();
                if (class169.field2969[var1] != null) {
                    class232.field4025[var1].method1801(class169.field2969[var1], (byte) 104);
                }
            }
            class126.field2202[class258.field4439++] = var1;
            class271 var3 = class232.field4025[var1];
            var3.field3692 = class241.field4246;
            int var4 = class65.field1288.method358(200, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class65.field1288.method358(arg0 ^ 0xFFFFFF4B, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class65.field1288.method358(200, 1);
            int var7 = class65.field1288.method358(200, 1);
            if (var7 == 1) {
                class117.field2062[class155.field2752++] = var1;
            }
            int var8 = field3644[class65.field1288.method358(200, 3)];
            if (var2) {
                var3.field3717 = var3.field3697 = var8;
            }
            var3.method1803(0, class229.field3911.field3743[0] + var5, class229.field3911.field3715[0] + var4, var6 == 1);
        }
        field3631++;
        class65.field1288.method360(true);
    }

    @OriginalMember(owner = "client!re", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3640++;
    }
}
