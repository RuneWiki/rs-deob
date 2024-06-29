import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 implements Runnable {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lwd;")
    public static class150 field146 = class2.method9(true, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field151 = 0;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field149 = 0;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field147 = 0;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lwd;")
    private static class150 field159 = class2.method9(true, "Loading config )2 ");

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lwd;")
    public static class150 field155 = field159;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "J")
    public static long field160 = 0L;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lqd;")
    public static class114 field162;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I")
    public static final int method36(int arg0) {
        if (arg0 != 20385) {
            method37(73L, (byte) -29);
        }
        field158++;
        int var1 = 3;
        if (class97.field2230 < 310) {
            int var2 = class61.field1591 >> 7;
            int var3 = class46.field1248 >> 7;
            int var4 = class46.field1244.field3000 >> 7;
            int var5 = class46.field1244.field2939 >> 7;
            int var6;
            if (var5 <= var3) {
                var6 = var3 - var5;
            } else {
                var6 = var5 - var3;
            }
            int var7;
            if (var4 > var2) {
                var7 = var4 - var2;
            } else {
                var7 = var2 - var4;
            }
            if ((class131.field3097[class17.field466][var2][var3] & 0x4) != 0) {
                var1 = class17.field466;
            }
            if (var7 > var6) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var2 != var4) {
                    var9 += var8;
                    if (var4 > var2) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    if ((class131.field3097[class17.field466][var2][var3] & 0x4) != 0) {
                        var1 = class17.field466;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var5 > var3) {
                            var3++;
                        } else if (var5 < var3) {
                            var3--;
                        }
                        if ((class131.field3097[class17.field466][var2][var3] & 0x4) != 0) {
                            var1 = class17.field466;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var3 != var5) {
                    if (var3 < var5) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    if ((class131.field3097[class17.field466][var2][var3] & 0x4) != 0) {
                        var1 = class17.field466;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var4 > var2) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class131.field3097[class17.field466][var2][var3] & 0x4) != 0) {
                            var1 = class17.field466;
                        }
                    }
                }
            }
        }
        if ((class131.field3097[class17.field466][class46.field1244.field3000 >> 7][class46.field1244.field2939 >> 7] & 0x4) != 0) {
            var1 = class17.field466;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
    public final void run() {
        field153++;
        try {
            while (true) {
                class103 var1 = class73.field1821;
                class91 var2;
                synchronized (class73.field1821) {
                    var2 = (class91) class73.field1821.method702((byte) -128);
                }
                if (var2 == null) {
                    class72.method548(-101, 100L);
                    Object var3 = class55.field1435;
                    synchronized (class55.field1435) {
                        if (class106.field2385 <= 1) {
                            class106.field2385 = 0;
                            class55.field1435.notifyAll();
                            return;
                        }
                        class106.field2385--;
                    }
                } else {
                    if (var2.field2122 == 0) {
                        var2.field2133.method731(var2.field2123.length, (int) var2.field2228, var2.field2123, -19045);
                        class103 var5 = class73.field1821;
                        synchronized (class73.field1821) {
                            var2.method678((byte) -26);
                        }
                    } else if (var2.field2122 == 1) {
                        var2.field2123 = var2.field2133.method732((byte) 125, (int) var2.field2228);
                        class103 var4 = class73.field1821;
                        synchronized (class73.field1821) {
                            class31.field916.method711(var2, 0);
                        }
                    }
                    Object var6 = class55.field1435;
                    synchronized (class55.field1435) {
                        if (class106.field2385 <= 1) {
                            class106.field2385 = 0;
                            class55.field1435.notifyAll();
                            return;
                        }
                        class106.field2385 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class61.method467(null, (byte) -117, var17);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(JB)V")
    public static final void method37(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != -105) {
            method37(49L, (byte) -10);
        }
        field152++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method38(byte arg0) {
        field146 = null;
        if (arg0 != 38) {
            method38((byte) -34);
        }
        field162 = null;
        field155 = null;
        field159 = null;
    }
}
