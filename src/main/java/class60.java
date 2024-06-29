import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class60 implements Runnable {

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Ld;")
    private class142 field903 = new class142();

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public int field906 = 0;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Z")
    private boolean field907 = false;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field905;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[Z")
    public static boolean[] field893 = new boolean[8];

    @OriginalMember(owner = "client!b", name = "f", descriptor = "C")
    public static char field896;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field891;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[[B")
    public static byte[][] field892;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvi;I)V", line = 6)
    private final void method533(class6 arg0, int arg1) {
        field895++;
        if (arg1 != 8) {
            this.field907 = false;
        }
        class142 var3 = this.field903;
        synchronized (this.field903) {
            this.field903.method1076(arg0, (byte) -59);
            this.field906++;
            this.field903.notifyAll();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lbm;II)Lvi;", line = 22)
    public final class6 method534(class137 arg0, int arg1, int arg2) {
        field900++;
        class6 var4 = new class6();
        var4.field56 = 1;
        class142 var5 = this.field903;
        synchronized (this.field903) {
            class6 var6 = (class6) this.field903.method1077(18667);
            while (true) {
                if (var6 == null) {
                    if (arg2 >= -21) {
                        this.field903 = (class142) null;
                    }
                    break;
                }
                if ((long) arg1 == var6.field1262 && var6.field54 == arg0 && var6.field56 == 2) {
                    var4.field53 = var6.field53;
                    var4.field5004 = false;
                    return var4;
                }
                var6 = (class6) this.field903.method1068(29540);
            }
        }
        var4.field53 = arg0.method1042(arg1, (byte) -18);
        var4.field4998 = true;
        var4.field5004 = false;
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V", line = 64)
    public static final void method535(String arg0, String arg1, byte arg2, int arg3) {
        field902++;
        class67.field989 = arg1;
        class190.field3039 = arg0;
        class162.field2409 = arg3;
        if (class190.field3039.equals("") || class67.field989.equals("")) {
            class311.field4847 = 3;
        } else if (class73.field1051 == -1) {
            class81.field1137 = 1;
            class203.field3231 = 0;
            class261.field3872 = 0;
            class311.field4847 = -3;
            class35 var4 = new class35(128);
            var4.method262((byte) 81, 10);
            var4.method259(-15195, (int) (Math.random() * 9.9999999E7D));
            var4.method261(1523335144, class224.method1597(true, class190.field3039));
            var4.method259(-15195, (int) (Math.random() * 9.9999999E7D));
            var4.method277(class67.field989, 4773);
            var4.method259(-15195, (int) (Math.random() * 9.9999999E7D));
            var4.method302((byte) -67, class77.field1078, class49.field764);
            class159.field2372.field455 = 0;
            class159.field2372.method262((byte) 81, 24);
            class159.field2372.method262((byte) 81, var4.field455 + 2);
            if (arg2 != -110) {
                method539(19);
            }
            class159.field2372.method263(532, (byte) 122);
            class159.field2372.method278(0, var4.field455, (byte) 24, var4.field437);
        } else {
            class126.method955(-120);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([J[IB)V", line = 109)
    public static final void method536(long[] arg0, int[] arg1, byte arg2) {
        class72.method596(arg0, arg0.length - 1, 0, 19013, arg1);
        field897++;
        if (arg2 != 61) {
            method535((String) null, (String) null, (byte) 12, 52);
        }
    }

    @OriginalMember(owner = "client!b", name = "run", descriptor = "()V", line = 123)
    public final void run() {
        field898++;
        while (!this.field907) {
            class142 var1 = this.field903;
            class6 var2;
            synchronized (this.field903) {
                var2 = (class6) this.field903.method1070(true);
                if (var2 == null) {
                    try {
                        this.field903.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field906--;
            }
            try {
                if (var2.field56 == 2) {
                    var2.field54.method1041(var2.field53, (int) var2.field1262, 107, var2.field53.length);
                } else if (var2.field56 == 3) {
                    var2.field53 = var2.field54.method1042((int) var2.field1262, (byte) -18);
                }
            } catch (Exception var6) {
                class50.method464((byte) 45, (String) null, var6);
            }
            var2.field5004 = false;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 172)
    public final void method537(int arg0) {
        field904++;
        this.field907 = true;
        class142 var2 = this.field903;
        synchronized (this.field903) {
            this.field903.notifyAll();
        }
        try {
            if (arg0 != -30432) {
                field891 = (String[]) null;
            }
            this.field905.join();
        } catch (InterruptedException var5) {
        }
        this.field905 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BIILbm;)Lvi;", line = 191)
    public final class6 method538(byte[] arg0, int arg1, int arg2, class137 arg3) {
        if (arg2 != 8471) {
            method536((long[]) null, (int[]) null, (byte) -68);
        }
        field894++;
        class6 var5 = new class6();
        var5.field1262 = (long) arg1;
        var5.field56 = 2;
        var5.field4998 = false;
        var5.field53 = arg0;
        var5.field54 = arg3;
        this.method533(var5, 8);
        return var5;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V", line = 210)
    public static void method539(int arg0) {
        field893 = null;
        field891 = null;
        if (arg0 != 0) {
            field896 = '\u0003';
        }
        field892 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLjava/lang/String;Lek;)Ljava/lang/String;", line = 223)
    public static final String method540(byte arg0, String arg1, class184 arg2) {
        field901++;
        if (arg1.indexOf("%") != -1) {
            label52: while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label52;
                                                        }
                                                        String var9 = "";
                                                        if (class297.field4662 != null) {
                                                            if (class297.field4662.field3590 == null) {
                                                                var9 = class258.method1795((byte) 121, class297.field4662.field3588);
                                                            } else {
                                                                var9 = (String) class297.field4662.field3590;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class156.method1136(class290.method2049(-10320, arg2, 4), 999999999) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class156.method1136(class290.method2049(-10320, arg2, 3), 999999999) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class156.method1136(class290.method2049(-10320, arg2, 2), 999999999) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class156.method1136(class290.method2049(-10320, arg2, 1), 999999999) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class156.method1136(class290.method2049(-10320, arg2, 0), 999999999) + arg1.substring(var3 + 2);
            }
        }
        int var10 = -112 / ((arg0 - 76) / 37);
        return arg1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILbm;I)Lvi;", line = 313)
    public final class6 method541(int arg0, class137 arg1, int arg2) {
        class6 var4 = new class6();
        var4.field4998 = false;
        var4.field56 = 3;
        var4.field54 = arg1;
        field899++;
        var4.field1262 = (long) arg0;
        this.method533(var4, arg2 ^ 0xA);
        if (arg2 != 2) {
            field891 = (String[]) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 341)
    public class60() {
        class233 var1 = class301.field4715.method163(5, (byte) -121, this);
        while (var1.field3585 == 0) {
            class97.method768(10L, 89);
        }
        if (var1.field3585 == 2) {
            throw new RuntimeException();
        }
        this.field905 = (Thread) var1.field3590;
    }
}
