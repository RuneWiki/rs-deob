import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 implements Runnable {

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[Ldb;")
    public volatile class24[] field2414 = new class24[2];

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Z")
    public volatile boolean field2419 = false;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
    public volatile boolean field2424 = false;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lic;")
    public static class59 field2418 = class59.method433(0, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2416 = -1;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2413 = 0;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "[Z")
    public static boolean[] field2423 = new boolean[112];

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lic;")
    private static class59 field2425 = class59.method433(0, "Checking for updates )2 ");

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lic;")
    public static class59 field2417 = field2425;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lje;")
    public class67 field2422;

    @OriginalMember(owner = "client!ne", name = "run", descriptor = "()V")
    public final void run() {
        this.field2424 = true;
        field2420++;
        try {
            while (!this.field2419) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class24 var2 = this.field2414[var1];
                    if (var2 != null) {
                        var2.method155(-112);
                    }
                }
                class126.method962(false, 10L);
                class54.method402(this.field2422, null, (byte) -127);
            }
        } catch (Exception var9) {
            class86.method704(var9, null, 4436);
        } finally {
            Object var6 = null;
            this.field2424 = false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[B)Lic;")
    public static final class59 method783(int arg0, int arg1, int arg2, byte[] arg3) {
        field2421++;
        if (arg2 <= 26) {
            method784((byte) -9, -104);
        }
        class59 var4 = new class59();
        var4.field1418 = 0;
        var4.field1448 = new byte[arg0];
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field1448[var4.field1418++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)Lic;")
    public static final class59 method784(byte arg0, int arg1) {
        if (arg0 == 98) {
            field2411++;
            return class46.method358(new class59[] { class46.method361(arg1 >> 24 & 0xFF, 88), class131.field2946, class46.method361(arg1 >> 16 & 0xFF, -85), class131.field2946, class46.method361(arg1 >> 8 & 0xFF, 61), class131.field2946, class46.method361(arg1 & 0xFF, -110) }, (byte) -75);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILic;Ldd;Lic;)Lce;")
    public static final class20 method785(int arg0, class59 arg1, class26 arg2, class59 arg3) {
        field2412++;
        if (arg0 != 112) {
            method786(-32, null, -56);
        }
        int var4 = arg2.method201(arg1, -1);
        int var5 = arg2.method196(arg0 ^ 0x76, var4, arg3);
        return class134.method1037(var4, arg2, var5, 114);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjf;I)V")
    public static final void method786(int arg0, class68 arg1, int arg2) {
        field2415++;
        if (arg2 != 0) {
            method784((byte) -52, 107);
        }
        class81.method667(arg1.field1751, arg1.field1730, arg2 + 40, arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method787(int arg0) {
        field2423 = null;
        if (arg0 != 0) {
            field2423 = null;
        }
        field2425 = null;
        field2418 = null;
        field2417 = null;
    }
}
