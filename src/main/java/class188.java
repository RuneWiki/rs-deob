import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class188 extends class178 {

    @OriginalMember(owner = "client!s", name = "M", descriptor = "[Lai;")
    public static class10[] field3334 = new class10[4];

    @OriginalMember(owner = "client!s", name = "T", descriptor = "B")
    public byte field3341;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "D")
    public static double field3339;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "Lnd;")
    public class142 field3340;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "Lda;")
    public static class35 field3335;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
    public static final void method1162(int arg0) {
        field3332++;
        Object var1 = class224.field3898;
        synchronized (class224.field3898) {
            if (class237.field4412 == 0) {
                class174.field3151.method263(new class78(), 5, false);
            }
            if (arg0 != 9768) {
                field3335 = null;
            }
            class237.field4412 = 600;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIII)V")
    public static final void method1163(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class28.field600 == 1) {
            class216.field3769[class211.field3692 / 100].method545(class109.field1938 - 8, class33.field668 - 8);
        }
        if (class28.field600 == 2) {
            class216.field3769[class211.field3692 / 100 + 4].method545(class109.field1938 - 8, class33.field668 - 8);
        }
        if (arg1 <= 37) {
            method1164(-62L, (byte) 68);
        }
        field3336++;
        class204.method1290(3008);
        if (!class196.field3482) {
            return;
        }
        int var5 = arg2 + 512 - 5;
        int var6 = arg3 + 20;
        class227.field3955.method1261(class126.method761(new class151[] { class131.field2411, class137.method874(class93.field1737, false) }, 10260), var5, var6, 16776960, -1);
        Runtime var7 = Runtime.getRuntime();
        int var8 = 16776960;
        int var10 = var6 + 15;
        int var9 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        if (var9 > 32768 && class13.field300) {
            var8 = 16711680;
        }
        if (var9 > 65536 && !class13.field300) {
            var8 = 16711680;
        }
        class227.field3955.method1261(class126.method761(new class151[] { class123.field2207, class137.method874(var9, false), class48.field991 }, 10260), var5, var10, var8, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JB)V")
    public static final void method1164(long arg0, byte arg1) {
        if (arg1 != -37) {
            method1163(29, (byte) 33, -8, -102, 12);
        }
        field3344++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public static void method1165(int arg0) {
        if (arg0 == -1) {
            field3334 = null;
            field3335 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
    public static final void method1166(int arg0) {
        class124.field2227.method1026(arg0 ^ 0xFF0000FF);
        if (arg0 != 16776960) {
            method1163(122, (byte) -8, 51, -53, 58);
        }
        field3343++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZIZ)I")
    public static final int method1167(boolean arg0, int arg1, boolean arg2) {
        field3342++;
        int var3 = arg1;
        if (arg0) {
            var3 = class232.field4227 + class170.field3095 + arg1;
        }
        if (arg2) {
            var3 += class232.field4263 + class206.field3655;
        }
        return var3;
    }
}
