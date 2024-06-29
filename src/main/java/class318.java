import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class318 implements Runnable {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lkp;")
    private class456 field3975 = new class456();

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public int field3977 = 0;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Z")
    private boolean field3978 = false;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field3983;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 3)
    public final void method1845(int arg0) {
        field3981++;
        this.field3978 = true;
        class456 var2 = this.field3975;
        synchronized (this.field3975) {
            this.field3975.notifyAll();
        }
        try {
            this.field3983.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 2) {
            this.method1850((byte) 5, null, 64);
        }
        this.field3983 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lhfa;I)V", line = 22)
    private final void method1846(class290 arg0, int arg1) {
        field3980++;
        if (arg1 != -316) {
            return;
        }
        class456 var3 = this.field3975;
        synchronized (this.field3975) {
            this.field3975.method2504((byte) -114, arg0);
            this.field3977++;
            this.field3975.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/io/File;IZ)[B", line = 37)
    public static final byte[] method1847(File arg0, int arg1, boolean arg2) {
        field3982++;
        try {
            byte[] var3 = new byte[arg1];
            class366.method2134(arg1, 0, arg0, var3);
            if (!arg2) {
                method1849(37, (byte) -55);
            }
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lqj;)V", line = 203)
    public class318(class476 arg0) {
        class218 var2 = arg0.method2592(5, this, (byte) 104);
        while (var2.field2546 == 0) {
            class700.method3867(29279, 10L);
        }
        if (var2.field2546 == 2) {
            throw new RuntimeException();
        }
        this.field3983 = (Thread) var2.field2547;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lkf;II[B)Lhfa;", line = 66)
    public final class290 method1848(class237 arg0, int arg1, int arg2, byte[] arg3) {
        field3985++;
        if (arg2 != 255) {
            field3987 = -15;
        }
        class290 var5 = new class290();
        var5.field3666 = 2;
        var5.field5343 = false;
        var5.field3659 = arg3;
        var5.field4648 = arg1;
        var5.field3667 = arg0;
        this.method1846(var5, -316);
        return var5;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IB)I", line = 86)
    public static final int method1849(int arg0, byte arg1) {
        field3974++;
        return arg1 < 49 ? 45 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLkf;I)Lhfa;", line = 99)
    public final class290 method1850(byte arg0, class237 arg1, int arg2) {
        field3986++;
        class290 var4 = new class290();
        var4.field3666 = 1;
        class456 var5 = this.field3975;
        synchronized (this.field3975) {
            class290 var6 = (class290) this.field3975.method2502(false);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field4648 && var6.field3667 == arg1 && var6.field3666 == 2) {
                    var4.field3659 = var6.field3659;
                    var4.field5346 = false;
                    return var4;
                }
                var6 = (class290) this.field3975.method2509((byte) -118);
            }
        }
        var4.field3659 = arg1.method1432(arg2, -31510);
        var4.field5346 = false;
        if (arg0 >= -99) {
            this.field3977 = 94;
        }
        var4.field5343 = true;
        return var4;
    }

    @OriginalMember(owner = "client!cs", name = "run", descriptor = "()V", line = 135)
    public final void run() {
        while (!this.field3978) {
            class456 var1 = this.field3975;
            class290 var2;
            synchronized (this.field3975) {
                var2 = (class290) this.field3975.method2507((byte) 80);
                if (var2 == null) {
                    try {
                        this.field3975.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3977--;
            }
            try {
                if (var2.field3666 == 2) {
                    var2.field3667.method1430(var2.field3659.length, var2.field3659, 124, (int) var2.field4648);
                } else if (var2.field3666 == 3) {
                    var2.field3659 = var2.field3667.method1432((int) var2.field4648, -31510);
                }
            } catch (Exception var6) {
                class564.method2994((byte) 34, null, var6);
            }
            var2.field5346 = false;
        }
        field3976++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILkf;Z)Lhfa;", line = 185)
    public final class290 method1851(int arg0, class237 arg1, boolean arg2) {
        field3984++;
        class290 var4 = new class290();
        if (!arg2) {
            return null;
        }
        var4.field4648 = arg0;
        var4.field3667 = arg1;
        var4.field3666 = 3;
        var4.field5343 = false;
        this.method1846(var4, -316);
        return var4;
    }
}
