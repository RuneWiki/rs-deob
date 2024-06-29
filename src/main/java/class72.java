import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class72 implements Runnable {

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lwca;")
    private class708 field1006 = new class708();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public int field1014 = 0;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Z")
    private boolean field1015 = false;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field1016;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1018 = new String[] { method761(method760("s\u0018\u001e$@")), method761(method760("l\u0005\\\t")), method761(method760("y^\u001eK\u0015")), method761(method760("s\u0018\u001eY\u0001l\u0019D[@")), method761(method760("s\u0018\u001e#@")), method761(method760("s\u0018\u001e @")), method761(method760("s\u0018\u001e!@")), method761(method760("s\u0018\u001e\u0017\u001dlX")), method761(method760("s\u0018\u001e'@")), method761(method760("s\u0018\u001e&@")) };

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Z")
    public static boolean field1013 = false;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "B")
    public static byte field1017;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "J")
    public static long field1004;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B[BLdca;I)Llba;")
    public final class576 method754(byte arg0, byte[] arg1, class186 arg2, int arg3) {
        try {
            field1011++;
            class576 var5 = new class576();
            var5.field8302 = arg2;
            var5.field11244 = false;
            if (arg0 != -4) {
                this.method756(35, -40, null);
            }
            var5.field8307 = 2;
            var5.field7075 = arg3;
            var5.field8300 = arg1;
            this.method757(var5, (byte) 118);
            return var5;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1018[9] + arg0 + ',' + (arg1 == null ? field1018[1] : field1018[2]) + ',' + (arg2 == null ? field1018[1] : field1018[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)Z")
    public static final boolean method755(boolean arg0, int arg1) {
        try {
            if (!arg0) {
                method755(false, 78);
            }
            field1009++;
            return arg1 == 3 || arg1 == 7 || arg1 == 9 || arg1 == 11;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1018[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IILdca;)Llba;")
    public final class576 method756(int arg0, int arg1, class186 arg2) {
        try {
            field1003++;
            if (arg1 != 31009) {
                field1013 = false;
            }
            class576 var4 = new class576();
            var4.field8307 = 3;
            var4.field7075 = arg0;
            var4.field11244 = false;
            var4.field8302 = arg2;
            this.method757(var4, (byte) 118);
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1018[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1018[1] : field1018[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Llba;B)V")
    private final void method757(class576 arg0, byte arg1) {
        try {
            field1005++;
            class708 var3 = this.field1006;
            synchronized (this.field1006) {
                this.field1006.method5142(arg0, (byte) -63);
                this.field1014++;
                if (arg1 == 118) {
                    this.field1006.notifyAll();
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1018[4] + (arg0 == null ? field1018[1] : field1018[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (!this.field1015) {
                class708 var1 = this.field1006;
                class576 var2;
                synchronized (this.field1006) {
                    var2 = (class576) this.field1006.method5149((byte) 52);
                    if (var2 == null) {
                        try {
                            this.field1006.wait();
                        } catch (InterruptedException var7) {
                        }
                        continue;
                    }
                    this.field1014--;
                }
                try {
                    if (var2.field8307 == 2) {
                        var2.field8302.method1746((int) var2.field7075, 730, var2.field8300.length, var2.field8300);
                    } else if (var2.field8307 == 3) {
                        var2.field8300 = var2.field8302.method1747((int) var2.field7075, (byte) 115);
                    }
                } catch (Exception var8) {
                    class622.method4544(var8, null, true);
                }
                var2.field11246 = false;
            }
            field1008++;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field1018[7] + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILdca;)Llba;")
    public final class576 method758(int arg0, int arg1, class186 arg2) {
        try {
            field1010++;
            class576 var4 = new class576();
            var4.field8307 = arg1;
            class708 var5 = this.field1006;
            synchronized (this.field1006) {
                for (class576 var6 = (class576) this.field1006.method5147((byte) 116); var6 != null; var6 = (class576) this.field1006.method5144(arg1 ^ 0x101)) {
                    if (((long) arg0) == var6.field7075 && var6.field8302 == arg2 && var6.field8307 == 2) {
                        var4.field11246 = false;
                        var4.field8300 = var6.field8300;
                        return var4;
                    }
                }
            }
            var4.field8300 = arg2.method1747(arg0, (byte) 125);
            var4.field11246 = false;
            var4.field11244 = true;
            return var4;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field1018[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1018[1] : field1018[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public final void method759(int arg0) {
        try {
            this.field1015 = true;
            field1007++;
            class708 var2 = this.field1006;
            synchronized (this.field1006) {
                if (arg0 != -4) {
                    field1004 = -39L;
                }
                this.field1006.notifyAll();
            }
            try {
                this.field1016.join();
            } catch (InterruptedException var4) {
            }
            this.field1016 = null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1018[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ltga;)V")
    public class72(class61 arg0) {
        try {
            class218 var2 = arg0.method643(this, 5, 22);
            while (var2.field3402 == 0) {
                class524.method3918(-4, 10L);
            }
            if (var2.field3402 == 2) {
                throw new RuntimeException();
            }
            this.field1016 = (Thread) var2.field3407;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1018[3] + (arg0 == null ? field1018[1] : field1018[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method760(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method761(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
