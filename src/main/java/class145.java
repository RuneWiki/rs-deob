import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class145 extends class280 {

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Z")
    public static boolean field2352 = false;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2358 = -1;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2370 = "scroll:";

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    public static int field2379 = 0;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "[Lpa;")
    public static class220[] field2374 = new class220[6];

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public int field2356;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public int field2364;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public int field2368;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "Lmk;")
    public class105 field2363;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "Lwe;")
    public class15 field2365;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lhg;")
    public class182 field2348;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "Ljd;")
    public class89 field2357;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "[Lsi;")
    public static class204[] field2354;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "[[[B")
    public static byte[][][] field2371;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public final void method1039(byte arg0) {
        this.field2365 = null;
        this.field2357 = null;
        this.field2363 = null;
        if (arg0 < -107) {
            field2372++;
            this.field2348 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)V")
    public static final void method1040(byte arg0, int arg1, int arg2) {
        if (arg0 < 68) {
            field2358 = 126;
        }
        class201 var3 = class94.method738(-107, arg2, 12);
        field2359++;
        var3.method1477(0);
        var3.field3226 = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/util/Random;BI)I")
    public static final int method1041(Random arg0, byte arg1, int arg2) {
        field2355++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class64.method468((byte) 101, arg2)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            if (arg1 <= 122) {
                field2374 = null;
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class234.method1652(arg2, var4, -120);
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
    public static void method1042(int arg0) {
        field2370 = null;
        field2354 = null;
        field2371 = null;
        field2374 = null;
        int var1 = 87 / ((arg0 + 44) / 49);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZIII)V")
    public static final void method1043(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class70.method500(arg0, arg4, arg0 + arg2, arg3 + arg4);
        class70.method508(arg0, arg4, arg2, arg3, 0);
        field2378++;
        if (class101.field1498 < 100) {
            return;
        }
        if (class156.field2567 == null || class156.field2567.field3270 != arg2 || class156.field2567.field3271 != arg3) {
            class140 var5 = new class140(arg2, arg3);
            class70.method511(var5.field2251, arg2, arg3);
            class182.method1353(0, class52.field753, 0, 0, arg2, 0, class85.field1245, (byte) -28, arg3);
            class156.field2567 = var5;
            class29.field367.method111((byte) 50);
        }
        class156.field2567.method69(arg0, arg4);
        int var6 = class206.field3316 * arg2 / class85.field1245 + arg0;
        int var7 = arg4 + (class84.field1214 * arg3 / class52.field753);
        int var8 = class286.field4546 * arg3 / class52.field753;
        int var9 = 16711680;
        if (class175.field2850 == 1) {
            var9 = 16777215;
        }
        if (arg1) {
            method1040((byte) 104, 109, 10);
        }
        int var10 = class77.field1116 * arg2 / class85.field1245;
        class70.method515(var6, var7, var10, var8, var9, 128);
        class70.method505(var6, var7, var10, var8, var9);
        if (class180.field2905 <= 0) {
            return;
        }
        int var11;
        if (class62.field905 <= 10) {
            var11 = class62.field905 * 25;
        } else {
            var11 = (20 - class62.field905) * 25;
        }
        for (class96 var12 = (class96) class56.field806.method1384(2); var12 != null; var12 = (class96) class56.field806.method1388((byte) 98)) {
            if (class121.field1764 == var12.field1417) {
                int var13 = var12.field1418 * arg2 / class85.field1245 + arg0;
                int var14 = var12.field1422 * arg3 / class52.field753 + arg4;
                class70.method515(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
            }
        }
    }
}
