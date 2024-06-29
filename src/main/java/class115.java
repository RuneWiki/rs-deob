import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 implements Runnable {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Z")
    public boolean field2597 = true;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field2592 = new Object();

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field2600 = 0;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
    public int[] field2599 = new int[500];

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "[I")
    public int[] field2602 = new int[500];

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2595 = 0;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lje;")
    public static class67 field2598 = class85.method592(255, "Registrierter Benutzer");

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lje;")
    public static class67 field2591 = class85.method592(255, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2593 = new CRC32();

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lje;")
    private static class67 field2606 = class85.method592(255, "Prepared sound engine");

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Lje;")
    private static class67 field2608 = class85.method592(255, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lje;")
    public static class67 field2601 = field2606;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lje;")
    public static class67 field2605 = field2608;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lje;")
    public static class67 field2607 = class85.method592(255, "<)4col>");

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lfd;")
    public static class40 field2596;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILna;)V")
    public static final void method928(int arg0, class91 arg1) {
        field2594++;
        if (class127.field2798 != null) {
            try {
                class127.field2798.method1174(false, 0L);
                class127.field2798.method1173(24, -1, arg1.field2043, arg1.field1991);
            } catch (Exception var2) {
            }
        }
        if (arg0 == 18196) {
            arg1.field2043 += 24;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static void method929(boolean arg0) {
        field2596 = null;
        field2607 = null;
        field2598 = null;
        field2591 = null;
        field2601 = null;
        field2593 = null;
        field2605 = null;
        if (arg0) {
            field2606 = null;
            field2608 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2597) {
            Object var1 = this.field2592;
            synchronized (this.field2592) {
                if (this.field2600 < 500) {
                    this.field2599[this.field2600] = class135.field3070;
                    this.field2602[this.field2600] = class104.field2361;
                    this.field2600++;
                }
            }
            class104.method822(-121, 50L);
        }
        field2604++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 67 % ((arg1 - 45) / 53);
        for (int var6 = 0; var6 < class86.field1918; var6++) {
            if (arg4 < class75.field1625[var6] + class56.field1114[var6] && class75.field1625[var6] < arg0 + arg4 && arg2 < class30.field540[var6] + class141.field3228[var6] && arg2 + arg3 > class30.field540[var6]) {
                class80.field1774[var6] = true;
            }
        }
        field2589++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II[B)I")
    public static final int method931(int arg0, int arg1, byte[] arg2) {
        field2590++;
        if (arg1 != 0) {
            field2595 = 60;
        }
        return class143.method1104(arg0, 0, arg2, 0);
    }
}
