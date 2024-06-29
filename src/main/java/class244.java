import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class244 {

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3369 = "Loading...";

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lik;")
    public static class410 field3366 = new class410(50);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field3374 = 0;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lik;")
    public static class410 field3375 = new class410(64);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lrk;")
    public static class427 field3372;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lfp;")
    public static class7 field3377;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient;")
    public static client field3371;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[Lsa;")
    public static class411[] field3367;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZJI)Ljava/lang/String;", line = 6)
    public static final String method1600(int arg0, int arg1, boolean arg2, long arg3, int arg4) {
        field3373++;
        char var6 = ',';
        char var7 = (char) arg0;
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            arg3 = -arg3;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg3 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 84)
    public static final void method1601(int arg0, int arg1, int arg2, Class arg3) {
        class224 var4 = class118.field1653[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class26 var5 = var4.field3129; var5 != null; var5 = var5.field463) {
            class228 var6 = var5.field460;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3172 == arg1 && var6.field3161 == arg2) {
                class167.method1262(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V", line = 120)
    public static void method1602(byte arg0) {
        field3372 = null;
        field3375 = null;
        field3367 = null;
        field3371 = null;
        field3366 = null;
        field3377 = null;
        int var1 = 81 / ((arg0 + 59) / 63);
        field3369 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)Lda;", line = 135)
    public static final class303 method1603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 3) {
            field3371 = null;
        }
        field3370++;
        class300[] var5 = null;
        class190 var6 = class78.method670(arg3, true);
        if (var6.field2727 != null) {
            var5 = new class300[var6.field2727.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class397 var8 = class77.method665(var6.field2727[var7], (byte) 91);
                var5[var7] = new class300(var8.field5558, var8.field5556, var8.field5561, var8.field5557, var8.field5552, var8.field5550, var8.field5560, var8.field5553);
            }
        }
        return new class303(var6.field2730, var5, var6.field2740, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lrk;Lpe;B)V", line = 176)
    public static final void method1604(class427 arg0, class391 arg1, byte arg2) {
        field3376++;
        if (class348.field4723) {
            return;
        }
        arg1.method104(0);
        if (arg2 < 83) {
            method1603(30, -106, -16, 118, 93);
        }
        class442.field6361 = arg1.method213(class214.method1456(arg0, class239.field3316), true);
        class442.field6361.method722((class249.field3414 - class442.field6361.method740()) / 2, (class258.field3488 - class442.field6361.method739()) / 2);
        class96.field1391 = arg1.method213(class214.method1456(arg0, class232.field3200), true);
        class96.field1391.method722((class249.field3414 - class96.field1391.method740()) / 2, 18);
        class348.field4723 = true;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)I", line = 201)
    public static final int method1605(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3368++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            if (arg1 != 1023) {
                method1602((byte) -11);
            }
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)J")
    public abstract long method775(byte arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)I")
    public abstract int method777(int arg0, byte arg1);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
    public abstract void method776(byte arg0);
}
