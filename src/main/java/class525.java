import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class525 extends class141 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Lqw;")
    private class84 field7280 = new class84();

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "Lqw;")
    private class84 field7296 = new class84();

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "[Z")
    private boolean[] field7297 = new boolean[112];

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Lvba;")
    public static class45 field7284 = new class45();

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field7289 = 0;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "Ljava/awt/Component;")
    private Component field7299;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public final void method985(byte arg0) {
        this.method3049((byte) 64);
        if (arg0 > -62) {
            field7289 = 27;
        }
        field7298++;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)I")
    private final int method3041(byte arg0) {
        field7294++;
        int var2 = 0;
        if (this.field7297[81]) {
            var2 |= 0x1;
        }
        if (arg0 < 121) {
            field7284 = null;
        }
        if (this.field7297[82]) {
            var2 |= 0x4;
        }
        if (this.field7297[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field7276++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class759.method4175(var2, (byte) -120)) {
            this.method3044((byte) -60, -1, var2, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V")
    public static final void method3042(int arg0) {
        field7295++;
        if (class462.field6576 != null) {
            return;
        }
        class462.field6576 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = arg0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var11 = var16;
                    var9 = var8;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var9 = var16;
                    var11 = var8;
                    var10 = var17;
                } else if (var14 == 4) {
                    var10 = var16;
                    var9 = var18;
                    var11 = var8;
                } else if (var14 == 5) {
                    var11 = var17;
                    var9 = var8;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class462.field6576[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public final synchronized void method980(int arg0) {
        this.field7280.method690(20134);
        field7282++;
        class308 var2 = (class308) this.field7296.method687((byte) -99);
        if (arg0 != 201) {
            method3046(-72);
        }
        while (var2 != null) {
            var2.field4378 = this.method3041((byte) 123);
            if (var2.field4374 == 0) {
                if (!this.field7297[var2.field4367]) {
                    class308 var3 = new class308();
                    var3.field4366 = var2.field4366;
                    var3.field4378 = var2.field4378;
                    var3.field4374 = 0;
                    var3.field4367 = var2.field4367;
                    var3.field4375 = '\u0000';
                    this.field7280.method689(var3, 125);
                    this.field7297[var2.field4367] = true;
                }
                var2.field4374 = 2;
                this.field7280.method689(var2, 114);
            } else if (var2.field4374 == 1) {
                if (this.field7297[var2.field4367]) {
                    this.field7280.method689(var2, arg0 ^ 0xBE);
                    this.field7297[var2.field4367] = false;
                }
            } else if (var2.field4374 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field7297[var4]) {
                        class308 var5 = new class308();
                        var5.field4378 = var2.field4378;
                        var5.field4374 = 1;
                        var5.field4367 = var4;
                        var5.field4366 = var2.field4366;
                        var5.field4375 = '\u0000';
                        this.field7280.method689(var5, -47);
                        this.field7297[var4] = false;
                    }
                }
            } else if (var2.field4374 == 3) {
                this.field7280.method689(var2, 125);
            }
            var2 = (class308) this.field7296.method687((byte) -125);
        }
    }

    @OriginalMember(owner = "client!lm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field7291++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
    private final void method3043(int arg0, KeyEvent arg1, int arg2) {
        field7283++;
        int var4 = arg1.getKeyCode();
        int var5 = -18 % ((arg2 + 22) / 53);
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class88.field1241.length) {
            int var7 = class88.field1241[var4];
            if (arg0 == 0 && (var7 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var7 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method3044((byte) -125, var6, '\u0000', arg0);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BICI)V")
    private final void method3044(byte arg0, int arg1, char arg2, int arg3) {
        field7290++;
        class308 var5 = new class308();
        var5.field4374 = arg3;
        if (arg0 >= -45) {
            this.field7299 = null;
        }
        var5.field4375 = arg2;
        var5.field4367 = arg1;
        var5.field4366 = class401.method2440(false);
        this.field7296.method689(var5, -38);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3045(int arg0, String arg1) {
        int var2 = -53 % ((arg0 + 73) / 49);
        field7293++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
    public static final void method3046(int arg0) {
        if (arg0 == 0) {
            if (class419.field6025 == 2) {
                class97.field1384[0].method585(class267.field3910[0]);
                class97.field1384[1].method585(class267.field3910[1]);
            } else if (class419.field6025 == 3) {
                class97.field1384[0].method585(class267.field3910[0]);
                class97.field1384[1].method585(class267.field3910[1]);
                class97.field1384[2].method585(class267.field3910[2]);
            } else {
                class97.field1384[0].method585(class267.field3910[0]);
                class97.field1384[1].method585(class267.field3910[1]);
                class97.field1384[2].method585(class267.field3910[2]);
                class97.field1384[3].method585(class267.field3910[3]);
            }
        } else if (arg0 == 1) {
            if (class419.field6025 == 2) {
                class97.field1384[0].method585(class267.field3910[2]);
            } else if (class419.field6025 == 3) {
                class97.field1384[0].method585(class267.field3910[3]);
                class97.field1384[1].method585(class267.field3910[4]);
            } else {
                class97.field1384[0].method585(class267.field3910[4]);
                class97.field1384[1].method585(class267.field3910[5]);
                class97.field1384[2].method585(class267.field3910[6]);
            }
        } else if (arg0 == 2) {
            if (class419.field6025 == 2) {
                class97.field1384[0].method585(class267.field3910[3]);
                return;
            }
            if (class419.field6025 == 3) {
                class97.field1384[0].method585(class267.field3910[5]);
                return;
            }
            class97.field1384[0].method585(class267.field3910[7]);
        }
    }

    @OriginalMember(owner = "client!lm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field7281++;
        this.method3044((byte) -47, 0, '\u0000', -1);
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V")
    public static void method3047(int arg0) {
        field7284 = null;
        if (arg0 != 29333) {
            field7284 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BZ)V")
    public static final void method3048(byte arg0, boolean arg1) {
        if (arg1 && class752.field10158 != null) {
            class741.field10035 = class752.field10158.field2576;
        } else {
            class741.field10035 = -1;
        }
        field7287++;
        class254.field3722 = null;
        class735.field9966 = null;
        class286.field4101 = 0;
        class752.field10158 = null;
        class752.method4116();
        class752.field10168.method690(20134);
        class213.field2800 = -1;
        class313.field4423 = -1;
        int var2 = 17 % ((54 - arg0) / 43);
        class537.field7443 = null;
        class577.field7875 = null;
        class55.field649 = null;
        class626.field8488 = null;
        class43.field461 = null;
        class752.field10164 = null;
        class767.field10537 = null;
        class698.field9253 = null;
        class171.field2242 = null;
        class490.field6824 = null;
        if (class752.field10153 != null) {
            class752.field10153.method2072(-4);
            class752.field10153.method2067(-13764, 64, 128);
        }
        if (class752.field10151 != null) {
            class752.field10151.method3179(34, 64, 64);
        }
        if (class752.field10150 != null) {
            class752.field10150.method1363(64, (byte) -81);
        }
        class547.field7563.method3715(64, (byte) 69);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Z")
    public final boolean method983(int arg0, int arg1) {
        field7288++;
        if (arg0 != 101) {
            this.method3050(null, (byte) 30);
        }
        return arg1 >= 0 && arg1 < 112 ? this.field7297[arg1] : false;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V")
    private final void method3049(byte arg0) {
        field7285++;
        if (this.field7299 == null) {
            return;
        }
        this.field7299.removeKeyListener(this);
        this.field7299.removeFocusListener(this);
        this.field7299 = null;
        if (arg0 != 64) {
            this.field7296 = null;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field7297[var2] = false;
        }
        this.field7280.method690(arg0 ^ 0x4EE6);
        this.field7296.method690(20134);
    }

    @OriginalMember(owner = "client!lm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field7279++;
        this.method3043(1, arg0, -125);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Loea;")
    public final class622 method981(boolean arg0) {
        if (arg0) {
            field7278++;
            return (class622) this.field7280.method687((byte) -122);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method3043(0, arg0, 47);
        field7286++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method3050(Component arg0, byte arg1) {
        if (arg1 <= 93) {
            return;
        }
        field7277++;
        this.method3049((byte) 64);
        this.field7299 = arg0;
        Method var3 = class248.field3256;
        if (var3 != null) {
            try {
                var3.invoke(this.field7299, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field7299.addKeyListener(this);
        this.field7299.addFocusListener(this);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class525(Component arg0) {
        class551.method3165(190);
        this.method3050(arg0, (byte) 108);
    }
}
