import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class330 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Lsf;")
    public static class108 field5635 = class140.method973(255, "Examiner");

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lsf;")
    public static class108 field5632 = class140.method973(255, "Schlie-8en");

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "[Loj;")
    public static class328[] field5644 = new class328[4];

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Lsf;")
    public static class108 field5643 = class140.method973(255, "0(U");

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lf;")
    public static class250 field5631;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "[I")
    public static int[] field5642;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2258(int arg0, int arg1) {
        class232.method1619(0);
        field5630++;
        class156.method1087((byte) 55);
        if (arg1 > -70) {
            method2261((byte) 9, (class163) null);
        }
        int var2 = class177.method1251(0, arg0).field3781;
        if (var2 == 0) {
            return;
        }
        int var3 = class261.field4594[arg0];
        if (var2 == 9) {
            class3.field55 = var3;
        }
        if (var2 == 5) {
            class155.field2798 = var3;
        }
        if (var2 == 6) {
            class220.field3917 = var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 56)
    public final void keyTyped(KeyEvent arg0) {
        field5636++;
        if (class229.field3987 != null) {
            int var2 = class75.method492(104, arg0);
            if (var2 >= 0) {
                int var3 = class200.field3614 + 1 & 0x7F;
                if (class8.field93 != var3) {
                    class211.field3769[class200.field3614] = -1;
                    class292.field5113[class200.field3614] = var2;
                    class200.field3614 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!rc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 92)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class229.field3987 != null) {
            class114.field1984 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class287.field5016.length > var2) {
                var3 = class287.field5016[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class206.field3693 >= 0 && var3 >= 0) {
                class17.field213[class206.field3693] = ~var3;
                class206.field3693 = class206.field3693 + 1 & 0x7F;
                if (class301.field5233 == class206.field3693) {
                    class206.field3693 = -1;
                }
            }
        }
        arg0.consume();
        field5637++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BJ)Lsf;", line = 125)
    public static final class108 method2259(byte arg0, long arg1) {
        field5633++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            if (arg0 >= -34) {
                field5640 = 87;
            }
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class60.field905[(int) (var7 - (arg1 * 37L))];
            }
            class108 var9 = new class108();
            var9.field1884 = var6;
            var9.field1870 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 181)
    public final synchronized void focusLost(FocusEvent arg0) {
        field5638++;
        if (class229.field3987 != null) {
            class206.field3693 = -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 203)
    public static final void method2260(int arg0) {
        if (arg0 != 28440) {
            field5635 = (class108) null;
        }
        class177.field3222.method644((byte) 60);
        field5628++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLng;)V", line = 244)
    public static final void method2261(byte arg0, class163 arg1) {
        field5634++;
        long var2 = 0L;
        if (arg1.field2909 == 0) {
            var2 = class282.method2031(arg1.field2926, arg1.field2929, arg1.field2908);
        }
        if (arg1.field2909 == 1) {
            var2 = class289.method2068(arg1.field2926, arg1.field2929, arg1.field2908);
        }
        if (arg0 != -29) {
            return;
        }
        if (arg1.field2909 == 2) {
            var2 = class312.method2175(arg1.field2926, arg1.field2929, arg1.field2908);
        }
        int var4 = 0;
        int var5 = -1;
        int var6 = 0;
        if (arg1.field2909 == 3) {
            var2 = class45.method325(arg1.field2926, arg1.field2929, arg1.field2908);
        }
        if (var2 != 0L) {
            var4 = (int) var2 >> 14 & 0x1F;
            var6 = (int) var2 >> 20 & 0x3;
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg1.field2913 = var4;
        arg1.field2912 = var6;
        arg1.field2920 = var5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lsf;I)V", line = 293)
    public static final void method2262(class108 arg0, int arg1) {
        field5639++;
        if (arg1 != 37) {
            field5644 = (class328[]) null;
        }
        for (class173 var2 = (class173) class128.field2182.method13(0); var2 != null; var2 = (class173) class128.field2182.method15((byte) 47)) {
            if (var2.field3170.method779(arg0, arg1 + 56)) {
                class132.field2261 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 317)
    public final void focusGained(FocusEvent arg0) {
        field5629++;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 340)
    public static void method2263(int arg0) {
        field5631 = null;
        field5632 = null;
        field5643 = null;
        field5642 = null;
        field5644 = null;
        field5635 = null;
        int var1 = 76 % ((arg0 + 9) / 42);
    }

    @OriginalMember(owner = "client!rc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 354)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field5641++;
        if (class229.field3987 == null) {
            return;
        }
        class114.field1984 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class287.field5016.length) {
            var3 = class287.field5016[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class206.field3693 >= 0 && var3 >= 0) {
            class17.field213[class206.field3693] = var3;
            class206.field3693 = class206.field3693 + 1 & 0x7F;
            if (class301.field5233 == class206.field3693) {
                class206.field3693 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class200.field3614 + 1 & 0x7F;
            if (class8.field93 != var4) {
                class211.field3769[class200.field3614] = var3;
                class292.field5113[class200.field3614] = -1;
                class200.field3614 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
