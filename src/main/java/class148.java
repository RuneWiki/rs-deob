import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class148 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2430 = "Loading...";

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2427 = "Allocating memory";

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "Lih;")
    public static class143 field2423;

    @OriginalMember(owner = "client!pn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 12)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class277.field4249 != null) {
            class31.field569 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class2.field38.length) {
                var3 = class2.field38[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class280.field4312 >= 0 && var3 >= 0) {
                class164.field2656[class280.field4312] = ~var3;
                class280.field4312 = class280.field4312 + 1 & 0x7F;
                if (class280.field4312 == class235.field3703) {
                    class280.field4312 = -1;
                }
            }
        }
        arg0.consume();
        field2432++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 43)
    public static final void method963(int arg0) {
        field2436++;
        if (arg0 != 1) {
            method968(38);
        }
        class204.field3339.method1884(-22054);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 56)
    public static final void method964(int arg0) {
        if (arg0 != -22548) {
            return;
        }
        for (class174 var1 = (class174) class233.field3643.method424(-100); var1 != null; var1 = (class174) class233.field3643.method425(-32547)) {
            if (var1.field2807) {
                var1.method1097(128);
            }
        }
        for (class174 var2 = (class174) class264.field4094.method424(-117); var2 != null; var2 = (class174) class264.field4094.method425(arg0 - 9999)) {
            if (var2.field2807) {
                var2.method1097(128);
            }
        }
        field2439++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Lic;", line = 88)
    public static final class21 method965(int arg0, int arg1) {
        if (arg1 != -25784) {
            return (class21) null;
        }
        field2424++;
        if (arg0 == 0) {
            return new class43();
        } else if (arg0 == 1) {
            return new class132();
        } else if (arg0 == 2) {
            return new class277();
        } else if (arg0 == 3) {
            return new class211();
        } else if (arg0 == 4) {
            return new class63();
        } else if (arg0 == 5) {
            return new class285();
        } else if (arg0 == 6) {
            return new class329();
        } else if (arg0 == 7) {
            return new class94();
        } else if (arg0 == 8) {
            return new class188();
        } else if (arg0 == 9) {
            return new class42();
        } else if (arg0 == 10) {
            return new class23();
        } else if (arg0 == 11) {
            return new class325();
        } else if (arg0 == 12) {
            return new class248();
        } else if (arg0 == 13) {
            return new class232();
        } else if (arg0 == 14) {
            return new class291();
        } else if (arg0 == 15) {
            return new class235();
        } else if (arg0 == 16) {
            return new class171();
        } else if (arg0 == 17) {
            return new class131();
        } else if (arg0 == 18) {
            return new class196();
        } else if (arg0 == 19) {
            return new class330();
        } else if (arg0 == 20) {
            return new class326();
        } else if (arg0 == 21) {
            return new class149();
        } else if (arg0 == 22) {
            return new class34();
        } else if (arg0 == 23) {
            return new class224();
        } else if (arg0 == 24) {
            return new class200();
        } else if (arg0 == 25) {
            return new class280();
        } else if (arg0 == 26) {
            return new class236();
        } else if (arg0 == 27) {
            return new class168();
        } else if (arg0 == 28) {
            return new class269();
        } else if (arg0 == 29) {
            return new class199();
        } else if (arg0 == 30) {
            return new class121();
        } else if (arg0 == 31) {
            return new class38();
        } else if (arg0 == 32) {
            return new class66();
        } else if (arg0 == 33) {
            return new class142();
        } else if (arg0 == 34) {
            return new class157();
        } else if (arg0 == 35) {
            return new class227();
        } else if (arg0 == 36) {
            return new class85();
        } else if (arg0 == 37) {
            return new class158();
        } else if (arg0 == 38) {
            return new class180();
        } else if (arg0 == 39) {
            return new class45();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 409)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class277.field4249 != null) {
            class31.field569 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class2.field38.length > var2) {
                var3 = class2.field38[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class280.field4312 >= 0 && var3 >= 0) {
                class164.field2656[class280.field4312] = var3;
                class280.field4312 = class280.field4312 + 1 & 0x7F;
                if (class280.field4312 == class235.field3703) {
                    class280.field4312 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class136.field2280 + 1 & 0x7F;
                if (class119.field2074 != var4) {
                    class285.field4412[class136.field2280] = var3;
                    class90.field1668[class136.field2280] = '\u0000';
                    class136.field2280 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2434++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BILbm;)Z", line = 467)
    public static final boolean method966(byte arg0, int arg1, class307 arg2) {
        field2431++;
        byte[] var3 = arg2.method2045(0, arg1);
        if (var3 == null) {
            return false;
        }
        if (arg0 <= 86) {
            method968(-91);
        }
        class135.method880(var3, (byte) -90);
        return true;
    }

    @OriginalMember(owner = "client!pn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 490)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class277.field4249 != null) {
            class280.field4312 = -1;
        }
        field2435++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BJ)V", line = 506)
    public static final void method967(byte arg0, long arg1) {
        field2433++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 < 100) {
            field2430 = (String) null;
        }
        class286.field4420++;
        class14.field263.method80(217, (byte) 126);
        class14.field263.method1353((byte) -105, arg1);
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V", line = 524)
    public static void method968(int arg0) {
        field2430 = null;
        field2423 = null;
        field2427 = null;
        if (arg0 >= -22) {
            field2423 = (class143) null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)V", line = 538)
    public static final void method969(int arg0, int arg1) {
        int var2 = -90 / ((arg1 - 7) / 57);
        class141.field2333.method1883(2047773287, arg0);
        field2428++;
        class325.field4965.method1883(2047773287, arg0);
        class85.field1611.method1883(2047773287, arg0);
    }

    @OriginalMember(owner = "client!pn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 550)
    public final void keyTyped(KeyEvent arg0) {
        if (class277.field4249 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class228.method1516(160, var2)) {
                int var3 = class136.field2280 + 1 & 0x7F;
                if (class119.field2074 != var3) {
                    class285.field4412[class136.field2280] = -1;
                    class90.field1668[class136.field2280] = var2;
                    class136.field2280 = var3;
                }
            }
        }
        field2425++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 579)
    public static final void method970(byte arg0) {
        class271.field4186 = 0;
        field2429++;
        int var1 = -68 % ((50 - arg0) / 57);
        class307.field4634 = 0;
        class166.field2676 = 0;
        class171.field2754 = -1;
        class264.field4098 = false;
        class157.field2565 = -3;
        class322.field4911 = 1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([[IZLml;II[[FIIIZBI[ZI[IZZ[[FII[[F[[I)V", line = 596)
    public static final void method971(int[][] arg0, boolean arg1, class16 arg2, int arg3, int arg4, float[][] arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10, int arg11, boolean[] arg12, int arg13, int[] arg14, boolean arg15, boolean arg16, float[][] arg17, int arg18, int arg19, float[][] arg20, int[][] arg21) {
        int var22 = (arg4 << 8) + (arg9 ? 255 : 0);
        field2426++;
        int var23 = (arg16 ? 255 : 0) + (arg6 << 8);
        int var24 = (arg3 << 8) + (arg15 ? 255 : 0);
        int var25 = (arg11 << 8) + (arg1 ? 255 : 0);
        int[] var26 = new int[arg14.length / 2];
        for (int var27 = arg19; var27 < var26.length; var27++) {
            int var28 = arg14[var27 + var27];
            int[][] var29 = arg0 == null || arg12 == null || !arg12[var27] ? arg21 : arg0;
            int var30 = arg14[var27 + var27 + 1];
            var26[var27] = class225.method1491(arg8, var23, arg5, var30, var25, arg7, arg17, var28, (float) arg13, 256, false, var29, var24, var22, arg20, arg0, arg2, arg10);
        }
        arg2.method116(arg18, arg8, arg7, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!pn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 631)
    public final void focusGained(FocusEvent arg0) {
        field2438++;
    }
}
