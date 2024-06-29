import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class192 implements Runnable {

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lrd;")
    private class225 field2873 = new class225();

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "Z")
    private boolean field2883 = false;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public int field2884 = 0;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field2880;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2870 = new CRC32();

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Ll;")
    public static class133 field2872;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Ll;")
    public static class133 field2882;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lne;")
    public static class88 field2881;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILhf;B)Lmj;", line = 5)
    public final class47 method1364(int arg0, class314 arg1, byte arg2) {
        field2875++;
        class47 var4 = new class47();
        var4.field773 = 1;
        class225 var5 = this.field2873;
        synchronized (this.field2873) {
            for (class47 var6 = (class47) this.field2873.method1589(0); var6 != null; var6 = (class47) this.field2873.method1591((byte) 82)) {
                if ((long) arg0 == var6.field2980 && var6.field771 == arg1 && var6.field773 == 2) {
                    var4.field769 = var6.field769;
                    var4.field2317 = false;
                    return var4;
                }
            }
        }
        var4.field769 = arg1.method2131(false, arg0);
        var4.field2317 = false;
        var4.field2312 = true;
        return arg2 > -79 ? (class47) null : var4;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[BLhf;)Lmj;", line = 50)
    public final class47 method1365(int arg0, int arg1, byte[] arg2, class314 arg3) {
        class47 var5 = new class47();
        if (arg1 >= -123) {
            return (class47) null;
        }
        var5.field769 = arg2;
        var5.field771 = arg3;
        var5.field2312 = false;
        var5.field2980 = (long) arg0;
        field2879++;
        var5.field773 = 2;
        this.method1366(2, var5);
        return var5;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILmj;)V", line = 83)
    private final void method1366(int arg0, class47 arg1) {
        class225 var3 = this.field2873;
        synchronized (this.field2873) {
            this.field2873.method1595(true, arg1);
            this.field2884++;
            this.field2873.notifyAll();
        }
        int var5 = 127 / ((45 - arg0) / 42);
        field2876++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 97)
    public static final void method1367(int arg0) {
        field2868++;
        int var1 = class10.field132.method759(false, 8);
        if (var1 < class310.field4816) {
            for (int var2 = var1; var2 < class310.field4816; var2++) {
                class310.field4817[class67.field1117++] = class103.field1606[var2];
            }
        }
        if (class310.field4816 < var1) {
            throw new RuntimeException("gppov1");
        }
        class310.field4816 = 0;
        if (arg0 != 3) {
            field2871 = 26;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class103.field1606[var3];
            class33 var5 = class254.field3992[var4];
            int var6 = class10.field132.method759(false, 1);
            if (var6 == 0) {
                class103.field1606[class310.field4816++] = var4;
                var5.field1857 = class227.field3618;
            } else {
                int var7 = class10.field132.method759(false, 2);
                if (var7 == 0) {
                    class103.field1606[class310.field4816++] = var4;
                    var5.field1857 = class227.field3618;
                    class260.field4065[class98.field1562++] = var4;
                } else if (var7 == 1) {
                    class103.field1606[class310.field4816++] = var4;
                    var5.field1857 = class227.field3618;
                    int var8 = class10.field132.method759(false, 3);
                    var5.method893(var8, 23172, 1);
                    int var9 = class10.field132.method759(false, 1);
                    if (var9 == 1) {
                        class260.field4065[class98.field1562++] = var4;
                    }
                } else if (var7 == 2) {
                    class103.field1606[class310.field4816++] = var4;
                    var5.field1857 = class227.field3618;
                    if (class10.field132.method759(false, 1) == 1) {
                        int var11 = class10.field132.method759(false, 3);
                        var5.method893(var11, 23172, 2);
                        int var12 = class10.field132.method759(false, 3);
                        var5.method893(var12, arg0 + 23169, 2);
                    } else {
                        int var10 = class10.field132.method759(false, 3);
                        var5.method893(var10, 23172, 0);
                    }
                    int var13 = class10.field132.method759(false, 1);
                    if (var13 == 1) {
                        class260.field4065[class98.field1562++] = var4;
                    }
                } else if (var7 == 3) {
                    class310.field4817[class67.field1117++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 210)
    public static void method1368(int arg0) {
        field2872 = null;
        field2881 = null;
        field2882 = null;
        if (arg0 == 10) {
            field2870 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "run", descriptor = "()V", line = 223)
    public final void run() {
        while (!this.field2883) {
            class225 var1 = this.field2873;
            class47 var2;
            synchronized (this.field2873) {
                var2 = (class47) this.field2873.method1596((byte) 102);
                if (var2 == null) {
                    try {
                        this.field2873.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2884--;
            }
            try {
                if (var2.field773 == 2) {
                    var2.field771.method2130((int) var2.field2980, var2.field769, var2.field769.length, 113);
                } else if (var2.field773 == 3) {
                    var2.field769 = var2.field771.method2131(false, (int) var2.field2980);
                }
            } catch (Exception var7) {
                class184.method1322(var7, (String) null, (byte) -24);
            }
            var2.field2317 = false;
        }
        field2877++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lhf;II)Lmj;", line = 268)
    public final class47 method1369(class314 arg0, int arg1, int arg2) {
        field2878++;
        if (arg2 != 1) {
            this.field2883 = false;
        }
        class47 var4 = new class47();
        var4.field771 = arg0;
        var4.field773 = 3;
        var4.field2312 = false;
        var4.field2980 = (long) arg1;
        this.method1366(arg2 ^ 0x73, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 344)
    public class192() {
        class197 var1 = class32.field471.method1291(5, 24229, this);
        while (var1.field2956 == 0) {
            class5.method26(0, 10L);
        }
        if (var1.field2956 == 2) {
            throw new RuntimeException();
        }
        this.field2880 = (Thread) var1.field2959;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V", line = 295)
    public final void method1370(int arg0) {
        field2874++;
        this.field2883 = true;
        class225 var2 = this.field2873;
        synchronized (this.field2873) {
            if (arg0 != -2) {
                field2872 = (class133) null;
            }
            this.field2873.notifyAll();
        }
        try {
            this.field2880.join();
        } catch (InterruptedException var5) {
        }
        this.field2880 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)[Lin;", line = 320)
    public static final class168[] method1371(boolean arg0) {
        field2869++;
        class168[] var1 = new class168[class290.field4519];
        for (int var2 = 0; var2 < class290.field4519; var2++) {
            var1[var2] = new class168(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], class306.field4757[var2], class63.field1002);
        }
        if (!arg0) {
            method1368(-93);
        }
        class7.method56((byte) 59);
        return var1;
    }
}
