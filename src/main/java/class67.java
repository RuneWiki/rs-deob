import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class67 implements Runnable {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lce;")
    private class216 field933 = new class216();

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field940 = 0;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
    private boolean field948 = false;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field939;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field941 = 0;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "[I")
    public static int[] field942 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Llf;")
    public static class211 field931 = new class211(64);

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "B")
    public static byte field943;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Ldl;")
    public static class123 field934;

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
    public final void run() {
        field946++;
        while (!this.field948) {
            class216 var1 = this.field933;
            class175 var2;
            synchronized (this.field933) {
                var2 = (class175) this.field933.method1464(true);
                if (var2 == null) {
                    try {
                        this.field933.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field940--;
            }
            try {
                if (var2.field2734 == 2) {
                    var2.field2740.method1609(var2.field2739.length, 255, var2.field2739, (int) var2.field1958);
                } else if (var2.field2734 == 3) {
                    var2.field2739 = var2.field2740.method1613(false, (int) var2.field1958);
                }
            } catch (Exception var6) {
                class48.method359(1, var6, (String) null);
            }
            var2.field854 = false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ld;II)Lbc;")
    public final class175 method453(class237 arg0, int arg1, int arg2) {
        if (arg2 != 10) {
            this.run();
        }
        field935++;
        class175 var4 = new class175();
        var4.field2734 = 1;
        class216 var5 = this.field933;
        synchronized (this.field933) {
            class175 var6 = (class175) this.field933.method1467(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field1958 && var6.field2740 == arg0 && var6.field2734 == 2) {
                    var4.field854 = false;
                    var4.field2739 = var6.field2739;
                    return var4;
                }
                var6 = (class175) this.field933.method1461((byte) -116);
            }
        }
        var4.field2739 = arg0.method1613(false, arg1);
        var4.field857 = true;
        var4.field854 = false;
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZLd;)Lbc;")
    public final class175 method454(int arg0, boolean arg1, class237 arg2) {
        if (!arg1) {
            field942 = null;
        }
        field932++;
        class175 var4 = new class175();
        var4.field857 = false;
        var4.field1958 = (long) arg0;
        var4.field2734 = 3;
        var4.field2740 = arg2;
        this.method458(-82, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method455(int arg0) {
        field942 = null;
        field934 = null;
        field931 = null;
        if (arg0 != 33) {
            field943 = 73;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
    public static final void method456(boolean arg0, int arg1) {
        field936++;
        class287 var2 = class261.method1786(arg1, arg0, 9);
        var2.method1912((byte) -26);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg1 - arg9;
        field945++;
        int var12 = arg6 - arg5;
        int var13 = 983040 / arg10;
        int var14 = -1;
        int var15 = 983040 / arg0;
        if (class78.field1111 > 0) {
            if (class10.field147 <= 10) {
                var14 = class10.field147 * 5;
            } else {
                var14 = (10 + 10 - class10.field147) * 5;
            }
        }
        for (int var16 = -var13; var16 < var11 + var13; var16++) {
            int var18 = (var16 + 1) * arg10 + arg2 >> 16;
            int var19 = arg10 * var16 + arg2 >> 16;
            int var20 = var18 - var19;
            if (var20 > 0) {
                int var21 = arg4 + var19;
                int var22 = arg9 + var16 >> 6;
                int var10000 = arg4 + var18;
                if (var22 >= 0 && var22 <= class39.field537.length - 1) {
                    int[][] var24 = class39.field537[var22];
                    for (int var25 = -var15; var25 < (var12 + var15); var25++) {
                        int var26 = arg0 * var25 + arg8 >> 16;
                        int var27 = (var25 + 1) * arg0 + arg8 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            var10000 = arg7 + var27;
                            int var30 = arg7 + var26;
                            int var31 = arg5 + var25 >> 6;
                            if (var31 >= 0 && var24.length - 1 >= var31 && var24[var31] != null) {
                                int var32 = (arg5 + var25 & 0x3F << 6) + (arg9 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class181 var34 = class25.method224(var33 - 1, 0);
                                    if (!class224.field3628[var34.field2847]) {
                                        if (var14 != -1 && class63.field888 == var34.field2847) {
                                            class202 var35 = new class202();
                                            var35.field3164 = var30;
                                            var35.field3167 = var34.field2847;
                                            var35.field3162 = var21;
                                            class105.field1624.method349(var35, true);
                                        } else {
                                            class93.field1442[var34.field2847].method71(var21 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != -31784) {
            return;
        }
        for (class202 var17 = (class202) class105.field1624.method350(8240); var17 != null; var17 = (class202) class105.field1624.method353((byte) -122)) {
            class127.method871(var17.field3162, var17.field3164, 15, 16776960, var14);
            class127.method871(var17.field3162, var17.field3164, 13, 16776960, var14);
            class127.method871(var17.field3162, var17.field3164, 11, 16776960, var14);
            class127.method871(var17.field3162, var17.field3164, 9, 16776960, var14);
            class93.field1442[var17.field3167].method71(var17.field3162 - 7, var17.field3164 + -7);
        }
        class105.field1624.method346(true);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILbc;)V")
    private final void method458(int arg0, class175 arg1) {
        field947++;
        class216 var3 = this.field933;
        synchronized (this.field933) {
            if (arg0 >= -23) {
                field942 = null;
            }
            this.field933.method1466(arg1, 114);
            this.field940++;
            this.field933.notifyAll();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([BIILd;)Lbc;")
    public final class175 method459(byte[] arg0, int arg1, int arg2, class237 arg3) {
        field937++;
        class175 var5 = new class175();
        var5.field857 = false;
        var5.field1958 = (long) arg1;
        var5.field2740 = arg3;
        var5.field2734 = arg2;
        var5.field2739 = arg0;
        this.method458(-30, var5);
        return var5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLjava/awt/Color;ZLjava/lang/String;I)V")
    public static final void method460(byte arg0, Color arg1, boolean arg2, String arg3, int arg4) {
        if (arg0 != -57) {
            return;
        }
        field944++;
        try {
            Graphics var5 = class86.field1364.getGraphics();
            if (class227.field3674 == null) {
                class227.field3674 = new Font("Helvetica", 1, 13);
                class287.field4551 = class86.field1364.getFontMetrics(class227.field3674);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class135.field1960, class98.field1510);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class142.field2089 == null) {
                    class142.field2089 = class86.field1364.createImage(304, 34);
                }
                Graphics var6 = class142.field2089.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class227.field3674);
                var6.setColor(Color.white);
                var6.drawString(arg3, (304 - class287.field4551.stringWidth(arg3)) / 2, 22);
                var5.drawImage(class142.field2089, class135.field1960 / 2 - 152, class98.field1510 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class135.field1960 / 2 - 152;
                int var8 = class98.field1510 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect((arg4 * 3) + var7 + 2, var8 + 2, 300 - (arg4 * 3), 30);
                var5.setFont(class227.field3674);
                var5.setColor(Color.white);
                var5.drawString(arg3, var7 + (304 - class287.field4551.stringWidth(arg3)) / 2, var8 + 22);
            }
            if (class204.field3202 != null) {
                var5.setFont(class227.field3674);
                var5.setColor(Color.white);
                var5.drawString(class204.field3202, class135.field1960 / 2 - (class287.field4551.stringWidth(class204.field3202) / 2), class98.field1510 / 2 + -26);
            }
        } catch (Exception var10) {
            class86.field1364.repaint();
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public final void method461(int arg0) {
        this.field948 = true;
        class216 var2 = this.field933;
        synchronized (this.field933) {
            this.field933.notifyAll();
            if (arg0 != 22) {
                field931 = null;
            }
        }
        field938++;
        try {
            this.field939.join();
        } catch (InterruptedException var3) {
        }
        this.field939 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class67() {
        class208 var1 = class2.field23.method134((byte) 126, 5, this);
        while (var1.field3247 == 0) {
            class170.method1183(10L, (byte) 89);
        }
        if (var1.field3247 == 2) {
            throw new RuntimeException();
        }
        this.field939 = (Thread) var1.field3249;
    }
}
