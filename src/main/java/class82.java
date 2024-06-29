import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class82 implements Runnable {

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "Leea;")
    private class114 field917 = new class114();

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field912 = new Thread(this);

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field911 = 0;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "[I")
    public static int[] field916 = new int[3];

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    public static int field925 = -1;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "J")
    public static long field927 = 0L;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "Lkca;")
    public static class73 field924 = new class73(39, 3);

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "Lkea;")
    public static class203 field919;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public static void method537(byte arg0) {
        field916 = null;
        field919 = null;
        field924 = null;
        int var1 = 102 / ((arg0 - 60) / 43);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public static final void method538(int arg0) {
        if (class133.field1673 == 8) {
            class353.method2235(4, 1);
        } else if (class133.field1673 == 4 || class133.field1673 == 5) {
            class353.method2235(2, 1);
        } else if (class133.field1673 == 11) {
            class353.method2235(2, 1);
        }
        if (arg0 >= -41) {
            method542(-93, (byte) -91);
        }
        field920++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IB)I")
    public static final int method539(int arg0, byte arg1) {
        field910++;
        return arg1 <= 31 ? -40 : arg0 >>> 7;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLuj;)V")
    private final void method540(byte arg0, class324 arg1) {
        field918++;
        class114 var3 = this.field917;
        synchronized (this.field917) {
            this.field917.method706(arg1, true);
            this.field917.notify();
        }
        int var4 = 2 / ((arg0 + 52) / 40);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
    public static final int method541(int arg0, int arg1, String arg2, String arg3) {
        field913++;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || (var7 - var9) < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class157.method907((byte) 37, var22);
            var9 = class157.method907((byte) 100, var24);
            char var26 = class440.method2741(var22, 253, arg1);
            char var27 = class440.method2741(var24, 253, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class628.method3599(arg1, var28, 18220) - class628.method3599(arg1, var29, arg0 ^ 0x472C);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = arg0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class628.method3599(arg1, var20, 18220) - class628.method3599(arg1, var21, 18220);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class628.method3599(arg1, var14, 18220) - class628.method3599(arg1, var15, arg0 + 18220);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qu", name = "run", descriptor = "()V")
    public final void run() {
        field914++;
        while (true) {
            class114 var1 = this.field917;
            class126 var3;
            synchronized (this.field917) {
                class324 var2;
                for (var2 = this.field917.method714(true); var2 == null; var2 = this.field917.method714(true)) {
                    try {
                        this.field917.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class126)) {
                    return;
                }
                var3 = (class126) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1560).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1563 = var5;
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
    public class82() {
        this.field912.setDaemon(true);
        this.field912.start();
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(IB)I")
    public static final int method542(int arg0, byte arg1) {
        field909++;
        if (arg1 != -61) {
            field919 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/String;I)Lqm;")
    public final class126 method543(String arg0, int arg1) {
        if (arg1 != -10585) {
            return null;
        }
        field915++;
        if (this.field912 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class126 var3 = new class126(arg0);
            this.method540((byte) 38, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
    public final void method544(int arg0) {
        field922++;
        if (this.field912 == null) {
            return;
        }
        this.method540((byte) 86, new class324());
        if (arg0 <= 22) {
            this.method544(32);
        }
        try {
            this.field912.join();
        } catch (InterruptedException var2) {
        }
        this.field912 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIII)Ldw;")
    public static final class622 method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field921++;
        long var7 = (long) arg3 * 76724863L ^ (long) arg2 * 32147369L ^ (long) arg4 * 986053L ^ (long) arg0 * 475427L ^ (long) arg6 * 97549L ^ (long) arg5 * 67481L;
        class622 var9 = (class622) class133.field1672.method1801(0, var7);
        int var10 = -26 % ((arg1 + 86) / 38);
        if (var9 == null) {
            class622 var11 = class108.field1302.method308(arg5, arg6, arg0, arg4, arg2, arg3);
            class133.field1672.method1808(var7, var11, (byte) -65);
            return var11;
        } else {
            return var9;
        }
    }
}
