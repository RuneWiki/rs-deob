import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class113 implements Runnable {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Lwq;")
    private class92 field1381 = new class92();

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field1382 = new Thread(this);

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
    public static int[] field1384 = new int[50];

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Liq;")
    public static class362 field1387 = new class362("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "J")
    public static long field1392 = 0L;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lon;")
    public static class184 field1390 = null;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field1395 = -1;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "[[I")
    public static int[][] field1396 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[I")
    public static int[] field1391;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLqf;)V")
    private final void method702(boolean arg0, class406 arg1) {
        field1383++;
        class92 var3 = this.field1381;
        synchronized (this.field1381) {
            this.field1381.method509((byte) 126, arg1);
            if (arg0) {
                field1395 = 99;
            }
            this.field1381.notify();
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[IB)[I")
    public static final int[] method703(int arg0, int[] arg1, byte arg2) {
        field1394++;
        if (arg2 < 47) {
            field1392 = 28L;
        }
        int[] var3 = new int[1152];
        int var4 = 0;
        for (int var5 = 0; var5 < 32; var5++) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg1[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg1[var4 - 1] != 0) {
                        var7 = arg0;
                    } else if (var5 > 0 && arg1[var4 - 36] != 0) {
                        var7 = arg0;
                    } else if (var6 < 35 && arg1[var4 + 1] != 0) {
                        var7 = arg0;
                    } else if (var5 < 31 && arg1[var4 + 36] != 0) {
                        var7 = arg0;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "run", descriptor = "()V")
    public final void run() {
        field1389++;
        while (true) {
            class92 var1 = this.field1381;
            class21 var3;
            synchronized (this.field1381) {
                class406 var2;
                for (var2 = this.field1381.method513(-2); var2 == null; var2 = this.field1381.method513(-2)) {
                    try {
                        this.field1381.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class21)) {
                    return;
                }
                var3 = (class21) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field275).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field273 = var5;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public final void method704(int arg0) {
        field1386++;
        if (this.field1382 == null) {
            return;
        }
        this.method702(false, new class406());
        try {
            this.field1382.join();
        } catch (InterruptedException var2) {
        }
        if (arg0 <= -87) {
            this.field1382 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;B)Lo;")
    public final class21 method705(String arg0, byte arg1) {
        field1385++;
        if (arg1 > -18) {
            this.method704(57);
        }
        if (this.field1382 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class21 var3 = new class21(arg0);
            this.method702(false, var3);
            return var3;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
    public static final void method706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 4) {
            return;
        }
        field1388++;
        float var5 = (float) class308.field4364 / (float) class308.field4359;
        int var6 = arg0;
        int var7 = arg2;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg3 - (arg0 - var6) / 2;
        int var9 = arg4 - (arg2 - var7) / 2;
        class324.field4619 = class308.field4359 * var8 / var6;
        class401.field5727 = -1;
        field1395 = -1;
        class419.field5993 = class308.field4364 - class308.field4364 * var9 / var7;
        class181.method1221(arg1 - 4);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static void method707(int arg0) {
        field1387 = null;
        field1396 = null;
        field1390 = null;
        field1391 = null;
        if (arg0 != -1421) {
            field1392 = 87L;
        }
        field1384 = null;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class113() {
        this.field1382.setDaemon(true);
        this.field1382.start();
    }
}
