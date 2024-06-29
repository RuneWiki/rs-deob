import java.awt.event.KeyEvent;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class142 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lwh;")
    private class206 field2641 = null;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    private int field2638 = 65000;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Lwh;")
    private class206 field2648 = null;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    private int field2642;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field2646 = 3353893;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[J")
    public static long[] field2640 = new long[200];

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Lsg;")
    public static class169 field2656 = class165.method1060("mapback", 1536);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lsg;")
    public static class169 field2637 = class165.method1060("title)3jpg", 1536);

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Lsg;")
    public static class169 field2653 = class165.method1060("Startseite auf (WSpielkonto wiederherstellen(W)3", 1536);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Z")
    public static boolean field2636 = false;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Lca;")
    public static class21 field2654 = new class21();

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Lqd;")
    public static class148 field2655;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "[[Lqf;")
    public static class150[][] field2647;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static final void method939(int arg0) {
        field2645++;
        class3.field59 = new class163(arg0);
    }

    @OriginalMember(owner = "client!pg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2644++;
        return "Cache:" + this.field2642;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[BZII)Z")
    private final boolean method940(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field2650++;
        class206 var6 = this.field2641;
        synchronized (this.field2641) {
            try {
                int var8;
                if (arg2) {
                    if ((long) (arg3 * 6 + 6) > this.field2648.method1344(-1367)) {
                        return false;
                    }
                    this.field2648.method1342((long) (arg3 * 6), false);
                    this.field2648.method1337(class92.field1727, 6, 0, (byte) 110);
                    var8 = ((class92.field1727[4] & 0xFF) << 8) + (class92.field1727[3] << 16 & 0xFF0000) + (class92.field1727[5] & 0xFF);
                    if (var8 <= 0 || (long) var8 > this.field2641.method1344(-1367) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2641.method1344(-1367) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class92.field1727[3] = (byte) (var8 >> 16);
                class92.field1727[2] = (byte) arg0;
                class92.field1727[1] = (byte) (arg0 >> 8);
                class92.field1727[4] = (byte) (var8 >> 8);
                class92.field1727[5] = (byte) var8;
                int var10 = 0;
                class92.field1727[0] = (byte) (arg0 >> 16);
                int var11 = 0;
                if (arg4 != 16711680) {
                    this.field2648 = null;
                }
                this.field2648.method1342((long) (arg3 * 6), false);
                this.field2648.method1333(0, 6, 0, class92.field1727);
                while (arg0 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label108: {
                            this.field2641.method1342((long) (var8 * 520), false);
                            try {
                                this.field2641.method1337(class92.field1727, 8, 0, (byte) 106);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class92.field1727[0] & 0xFF) << 8) + (class92.field1727[1] & 0xFF);
                            var12 = (class92.field1727[6] & 0xFF) + ((class92.field1727[5] & 0xFF) << 8) + ((class92.field1727[4] & 0xFF) << 16);
                            int var14 = ((class92.field1727[2] & 0xFF) << 8) + (class92.field1727[3] & 0xFF);
                            int var15 = class92.field1727[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field2642 == var15) {
                                if (var12 >= 0 && this.field2641.method1344(-1367) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg0 - var10;
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field2641.method1344(-1367) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class92.field1727[7] = (byte) this.field2642;
                    class92.field1727[1] = (byte) arg3;
                    class92.field1727[3] = (byte) var11;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class92.field1727[2] = (byte) (var11 >> 8);
                    var11++;
                    class92.field1727[0] = (byte) (arg3 >> 8);
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class92.field1727[6] = (byte) var12;
                    class92.field1727[4] = (byte) (var12 >> 16);
                    class92.field1727[5] = (byte) (var12 >> 8);
                    this.field2641.method1342((long) (var8 * 520), false);
                    var8 = var12;
                    this.field2641.method1333(0, 8, 0, class92.field1727);
                    this.field2641.method1333(var10, var18, 0, arg1);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI[BI)Z")
    public final boolean method941(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 46) {
            field2654 = null;
        }
        field2651++;
        class206 var5 = this.field2641;
        synchronized (this.field2641) {
            if (arg3 < 0 || this.field2638 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method940(arg3, arg2, true, arg1, 16711680);
            if (!var6) {
                var6 = this.method940(arg3, arg2, false, arg1, 16711680);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[B")
    public final byte[] method942(boolean arg0, int arg1) {
        field2652++;
        class206 var3 = this.field2641;
        synchronized (this.field2641) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field2648.method1344(-1367)) {
                    return null;
                }
                this.field2648.method1342((long) (arg1 * 6), arg0);
                this.field2648.method1337(class92.field1727, 6, 0, (byte) 118);
                int var5 = ((class92.field1727[0] & 0xFF) << 16) + ((class92.field1727[1] & 0xFF) << 8) + (class92.field1727[2] & 0xFF);
                int var6 = (class92.field1727[5] & 0xFF) + ((class92.field1727[4] & 0xFF) << 8) + ((class92.field1727[3] & 0xFF) << 16);
                if (var5 < 0 || this.field2638 < var5) {
                    return null;
                } else if (var6 > 0 && this.field2641.method1344(-1367) / 520L >= (long) var6) {
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    while (var5 > var9) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2641.method1342((long) (var6 * 520), false);
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field2641.method1337(class92.field1727, var13 + 8, 0, (byte) 105);
                        int var14 = ((class92.field1727[0] & 0xFF) << 8) + (class92.field1727[1] & 0xFF);
                        int var15 = class92.field1727[7] & 0xFF;
                        int var16 = ((class92.field1727[2] & 0xFF) << 8) + (class92.field1727[3] & 0xFF);
                        int var17 = (class92.field1727[6] & 0xFF) + ((class92.field1727[5] & 0xFF) << 8) + ((class92.field1727[4] & 0xFF) << 16);
                        if (arg1 == var14 && var11 == var16 && this.field2642 == var15) {
                            if (var17 >= 0 && (long) var17 <= this.field2641.method1344(-1367) / 520L) {
                                var6 = var17;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class92.field1727[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLqf;)Z")
    public static final boolean method943(byte arg0, class150 arg1) {
        int var2 = arg1.field2872;
        if (arg0 != 32) {
            return false;
        }
        field2649++;
        if (var2 == 205) {
            class70.field1320 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class63.field1163.method5(var3, var4 == 1, (byte) -97);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class63.field1163.method10(true, var6 == 1, var5);
        }
        if (var2 == 324) {
            class63.field1163.method11(21845, false);
        }
        if (var2 == 325) {
            class63.field1163.method11(21845, true);
        }
        if (var2 == 326) {
            class141.field2621.method1024(56, (byte) -94);
            class63.field1163.method7(class141.field2621, arg0 ^ 0x24);
            class86.field1572++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILwh;Lwh;I)V")
    public class142(int arg0, class206 arg1, class206 arg2, int arg3) {
        this.field2642 = arg0;
        this.field2641 = arg1;
        this.field2638 = arg3;
        this.field2648 = arg2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method944(byte arg0, KeyEvent arg1) {
        field2639++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (arg0 >= -58) {
            field2653 = null;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public static void method945(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2656 = null;
        field2647 = null;
        field2654 = null;
        field2637 = null;
        field2653 = null;
        field2640 = null;
        field2655 = null;
    }
}
