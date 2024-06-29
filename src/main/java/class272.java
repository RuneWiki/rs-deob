import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class272 implements Runnable {

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Lwo;")
    private class522 field3710 = new class522();

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field3711 = new Thread(this);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Luf;")
    public static class310 field3702 = new class310(24, 3);

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lfg;")
    public static class83 field3708 = new class83("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3712 = "";

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Lmr;")
    public static class95 field3714;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[Lf;")
    public static class529[] field3713;

    @OriginalMember(owner = "client!sg", name = "run", descriptor = "()V")
    public final void run() {
        field3703++;
        while (true) {
            class522 var1 = this.field3710;
            class344 var3;
            synchronized (this.field3710) {
                class499 var2;
                for (var2 = this.field3710.method3071((byte) 123); var2 == null; var2 = this.field3710.method3071((byte) -125)) {
                    try {
                        this.field3710.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class344)) {
                    return;
                }
                var3 = (class344) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field4735).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field4733 = var5;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BII)Z")
    public static final boolean method1547(byte arg0, int arg1, int arg2) {
        if (arg0 != 59) {
            method1547((byte) 83, -1, 3);
        }
        field3704++;
        if ((class435.method2594(arg2, -33, arg1) | (arg2 & 0x10000) != 0) || class174.method1074(arg0 + 8133, arg2, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class213.method1280(arg2, arg1, false);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILki;)V")
    private final void method1548(int arg0, class499 arg1) {
        class522 var3 = this.field3710;
        synchronized (this.field3710) {
            this.field3710.method3070(arg1, (byte) -127);
            if (arg0 != 0) {
                this.method1552(91, null);
            }
            this.field3710.notify();
        }
        field3707++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1549(byte arg0) {
        field3708 = null;
        field3702 = null;
        if (arg0 != -43) {
            method1549((byte) -46);
        }
        field3712 = null;
        field3713 = null;
        field3714 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public final void method1550(int arg0) {
        field3709++;
        if (this.field3711 == null) {
            return;
        }
        this.method1548(0, new class499());
        try {
            if (arg0 <= 87) {
                return;
            }
            this.field3711.join();
        } catch (InterruptedException var2) {
        }
        this.field3711 = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static final void method1551(int arg0) {
        field3705++;
        int var1 = class245.field3417.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class245.field3417[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class295.field4082; var4++) {
                    if (class461.field6705[var4] == class101.field1378[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class461.field6705[class295.field4082] = class101.field1378[var2];
                    var3 = class295.field4082++;
                }
                class365 var5 = new class365(class245.field3417[var2]);
                int var6 = 0;
                while (var5.field5069 < class245.field3417[var2].length && var6 < 511 && class166.field2352 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2062((byte) 14);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FAF) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class101.field1378[var2] >> 8) * 64 + var10 - class215.field3059;
                    int var13 = (class101.field1378[var2] & 0xFF) * 64 - (class79.field1134 - var11);
                    class336 var14 = class398.field5549.method2819(var5.method2062((byte) 14), arg0 ^ 0x10C9);
                    if (class179.field2534[var7] == null && (var14.field4598 & 0x1) > 0 && class304.field4173 == var9 && var12 >= 0 && class442.field6435 > (var12 + var14.field4637) && var13 >= 0 && class232.field3217 > var13 + var14.field4637) {
                        class179.field2534[var7] = new class405();
                        class179.field2534[var7].field297 = var7;
                        class405 var15 = class179.field2534[var7];
                        class54.field750[class166.field2352++] = var7;
                        var15.field298 = class393.field5484;
                        var15.method2343(var14, -122);
                        var15.method171(var15.field5623.field4637, arg0 - 4267);
                        var15.field333 = var15.field5623.field4622 << 3;
                        if (var15.field333 == 0) {
                            var15.method169(true, 0);
                        } else {
                            var15.method169(true, (var15.field5623.field4623 + 4 & 0xC7E00007) << 11);
                        }
                        var15.method2342(var9, var13, true, false, var12, var15.method167(-1));
                    }
                }
            }
        }
        if (arg0 != 4267) {
            method1547((byte) -91, -106, -88);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/lang/String;)Llm;")
    public final class344 method1552(int arg0, String arg1) {
        field3706++;
        if (this.field3711 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class344 var3 = new class344(arg1);
            this.method1548(0, var3);
            return arg0 <= 25 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class272() {
        this.field3711.setDaemon(true);
        this.field3711.start();
    }
}
