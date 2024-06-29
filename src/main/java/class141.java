import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class141 implements Runnable {

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[Lfk;")
    public volatile class45[] field2451 = new class45[2];

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Z")
    public volatile boolean field2446 = false;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Z")
    public volatile boolean field2457 = false;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2445 = 0;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Ljf;")
    public static class229 field2452 = class212.method1457((byte) 66, "runes");

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Ljf;")
    public static class229 field2447 = class212.method1457((byte) 90, "Chargement du module texte )2 ");

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Ljf;")
    private static class229 field2454 = class212.method1457((byte) 77, "Face here");

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Ljf;")
    public static class229 field2449 = field2454;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "F")
    public static float field2448;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lkn;")
    public class198 field2455;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)V", line = 13)
    public static final void method984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2444++;
        int var7 = arg4 + arg6;
        int var8 = arg0 - arg6;
        for (int var9 = arg4; var9 < var7; var9++) {
            class34.method306(arg5, class173.field3021[var9], (byte) 121, arg3, arg1);
        }
        for (int var10 = arg0; var10 > var8; var10--) {
            class34.method306(arg5, class173.field3021[var10], (byte) 126, arg3, arg1);
        }
        int var11 = arg3 - arg6;
        int var12 = arg5 + arg6;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class173.field3021[var13];
            class34.method306(arg5, var14, (byte) 125, var12, arg1);
            class34.method306(var11, var14, (byte) 111, arg3, arg1);
        }
        int var15 = -98 / ((arg2 - 79) / 37);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I", line = 59)
    public static final int method985(int arg0, int arg1) {
        field2453++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg0 != -2) {
            field2452 = (class229) null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 111)
    public static void method986(byte arg0) {
        field2454 = null;
        field2449 = null;
        field2452 = null;
        if (arg0 != 34) {
            field2445 = 115;
        }
        field2447 = null;
    }

    @OriginalMember(owner = "client!jd", name = "run", descriptor = "()V", line = 135)
    public final void run() {
        this.field2457 = true;
        field2456++;
        try {
            while (!this.field2446) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class45 var2 = this.field2451[var1];
                    if (var2 != null) {
                        var2.method402(0);
                    }
                }
                class235.method1675((byte) -22, 10L);
                class127.method899(this.field2455, 116, (Object) null);
            }
        } catch (Exception var7) {
            class201.method1407(1, (String) null, var7);
        } finally {
            this.field2457 = false;
        }
    }
}
