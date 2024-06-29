import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 implements Runnable {

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lmc;")
    private class197 field916 = new class197();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "Z")
    private boolean field931 = false;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public int field932 = 0;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field929;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Z")
    public static boolean field918 = false;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    public static int[] field921 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field912 = 0;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Loa;")
    private static class99 field920 = class221.method1463(2844, "purple:");

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Loa;")
    public static class99 field915 = field920;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Loa;")
    public static class99 field924 = field920;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static volatile int field927 = 0;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field922 = 500;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Loa;")
    public static class99 field928 = class221.method1463(2844, "<col=ffb000>");

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[Lai;")
    public static class86[] field917;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILtg;II)[Lde;")
    public static final class109[] method377(int arg0, class182 arg1, int arg2, int arg3) {
        field930++;
        if (class153.method1016(arg0, 21451, arg1, arg3)) {
            if (arg2 != 2047) {
                method378(-98, -69, -4, (byte) 1, 13, (class139) null, (class107) null);
            }
            return class122.method806(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIBILpi;Ltf;)V")
    public static final void method378(int arg0, int arg1, int arg2, byte arg3, int arg4, class139 arg5, class107 arg6) {
        field909++;
        if (arg5 == null) {
            return;
        }
        int var7 = class239.field4129 + class124.field2178 & 0x7FF;
        int var8 = arg1 * arg1 + (arg2 * arg2);
        int var9 = Math.max(arg6.field1933 / 2, arg6.field1793 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = -112 % ((arg3 + 35) / 41);
        int var11 = class134.field2344[var7];
        int var12 = var11 * 256 / (class260.field4542 + 256);
        int var13 = class134.field2339[var7];
        int var14 = var13 * 256 / (class260.field4542 + 256);
        int var15 = arg2 * var14 + (arg1 * var12) >> 16;
        int var16 = arg2 * var12 - (arg1 * var14) >> 16;
        ((class4) arg5).method44(arg6.field1933 / 2 + arg0 + var15 - (arg5.field2456 / 2), arg4 - arg5.field2459 / 2 + arg6.field1793 / 2 + -var16, arg6.field1930, arg6.field1858);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method379(int arg0) {
        field928 = null;
        field921 = null;
        field920 = null;
        if (arg0 >= -50) {
            field912 = 57;
        }
        field917 = null;
        field915 = null;
        field924 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILic;)Lke;")
    public final class108 method380(int arg0, int arg1, class141 arg2) {
        class108 var4 = new class108();
        field919++;
        var4.field1767 = false;
        var4.field3476 = (long) arg1;
        var4.field1952 = 3;
        var4.field1951 = arg2;
        if (arg0 != -7949) {
            method377(-50, (class182) null, 27, 118);
        }
        this.method384(var4, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public final void method381(byte arg0) {
        if (arg0 != -83) {
            this.method383((byte) -66, (class141) null, -37);
        }
        this.field931 = true;
        class197 var2 = this.field916;
        synchronized (this.field916) {
            this.field916.notifyAll();
        }
        field914++;
        try {
            this.field929.join();
        } catch (InterruptedException var3) {
        }
        this.field929 = null;
    }

    @OriginalMember(owner = "client!i", name = "run", descriptor = "()V")
    public final void run() {
        field910++;
        while (!this.field931) {
            class197 var1 = this.field916;
            class108 var2;
            synchronized (this.field916) {
                var2 = (class108) this.field916.method1329((byte) 52);
                if (var2 == null) {
                    try {
                        this.field916.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field932--;
            }
            try {
                if (var2.field1952 == 2) {
                    var2.field1951.method953(var2.field1956, var2.field1956.length, false, (int) var2.field3476);
                } else if (var2.field1952 == 3) {
                    var2.field1956 = var2.field1951.method959((int) var2.field3476, 1);
                }
            } catch (Exception var6) {
                class196.method1315(false, var6, (String) null);
            }
            var2.field1766 = false;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[BILic;)Lke;")
    public final class108 method382(int arg0, byte[] arg1, int arg2, class141 arg3) {
        if (arg2 >= -65) {
            return null;
        }
        field923++;
        class108 var5 = new class108();
        var5.field1952 = 2;
        var5.field1767 = false;
        var5.field1956 = arg1;
        var5.field1951 = arg3;
        var5.field3476 = (long) arg0;
        this.method384(var5, (byte) -125);
        return var5;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLic;I)Lke;")
    public final class108 method383(byte arg0, class141 arg1, int arg2) {
        class108 var4 = new class108();
        field913++;
        var4.field1952 = 1;
        class197 var5 = this.field916;
        synchronized (this.field916) {
            int var6 = 57 / ((arg0 - 41) / 47);
            class108 var7 = (class108) this.field916.method1325(-75);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if ((long) arg2 == var7.field3476 && var7.field1951 == arg1 && var7.field1952 == 2) {
                    var4.field1766 = false;
                    var4.field1956 = var7.field1956;
                    return var4;
                }
                var7 = (class108) this.field916.method1326(-103);
            }
        }
        var4.field1956 = arg1.method959(arg2, 1);
        var4.field1766 = false;
        var4.field1767 = true;
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lke;B)V")
    private final void method384(class108 arg0, byte arg1) {
        field911++;
        class197 var3 = this.field916;
        synchronized (this.field916) {
            this.field916.method1323(-27664, arg0);
            this.field932++;
            this.field916.notifyAll();
            int var4 = 125 % ((arg1 + 52) / 43);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILmi;)V")
    public static final void method385(int arg0, class260 arg1) {
        field925++;
        class171.method1151(-115, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class56() {
        class275 var1 = class24.field368.method594(-30175, this, 5);
        while (var1.field4844 == 0) {
            class100.method711(0, 10L);
        }
        if (var1.field4844 == 2) {
            throw new RuntimeException();
        }
        this.field929 = (Thread) var1.field4843;
    }
}
