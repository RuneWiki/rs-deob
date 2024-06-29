import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class588 {

    @OriginalMember(owner = "client!via", name = "g", descriptor = "Loo;")
    private class652 field8292 = new class652(64);

    @OriginalMember(owner = "client!via", name = "i", descriptor = "Lwia;")
    private class791 field8294;

    @OriginalMember(owner = "client!via", name = "f", descriptor = "Lfba;")
    public static class27 field8291 = new class27(7, 7);

    @OriginalMember(owner = "client!via", name = "k", descriptor = "Z")
    public static boolean field8296 = false;

    @OriginalMember(owner = "client!via", name = "l", descriptor = "Ldt;")
    public static class252 field8297 = new class252("stellardawn", "Stellar Dawn", 1);

    @OriginalMember(owner = "client!via", name = "n", descriptor = "F")
    public static float field8299;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!via", name = "e", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!via", name = "h", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!via", name = "j", descriptor = "J")
    public static long field8295;

    @OriginalMember(owner = "client!via", name = "m", descriptor = "Lwia;")
    public static class791 field8298;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II)V")
    public final void method3426(int arg0, int arg1) {
        class652 var3 = this.field8292;
        synchronized (this.field8292) {
            this.field8292.method3741(arg1, 0);
        }
        if (arg0 != 16384) {
            this.method3429(64);
        }
        field8287++;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
    public static final void method3427(byte arg0) {
        field8289++;
        if (arg0 <= 34) {
            return;
        }
        short var1 = 1024;
        short var2 = 3072;
        if (class576.field8120) {
            if (class459.field6424) {
                var1 = 2048;
            }
            var2 = 4096;
        }
        if ((float) var1 > class642.field8990) {
            class642.field8990 = var1;
        }
        if ((float) var2 < class642.field8990) {
            class642.field8990 = var2;
        }
        while (class758.field10460 >= 16384.0F) {
            class758.field10460 -= 16384.0F;
        }
        while (class758.field10460 < 0.0F) {
            class758.field10460 += 16384.0F;
        }
        int var3 = class310.field4429 >> 9;
        int var4 = class198.field3037 >> 9;
        int var5 = class702.method3970(class310.field4429, class368.field5113, -20103, class198.field3037);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && (class768.field10571 - 4) > var3 && class350.field4898 - 4 > var4) {
            for (int var7 = var3 - 4; var7 <= (var3 + 4); var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class368.field5113;
                    if (var9 < 3 && class124.method941(4, var8, var7)) {
                        var9++;
                    }
                    int var10 = 0;
                    if (class442.field6036.field7840 != null && class442.field6036.field7840[var9] != null) {
                        var10 = (class442.field6036.field7840[var9][var7][var8] & 0xFF) * 8 << 2;
                    }
                    if (class208.field3219 != null && class208.field3219[var9] != null) {
                        int var11 = var5 + var10 - class208.field3219[var9].method1904(var8, (byte) -123, var7);
                        if (var11 > var6) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (var12 > 786432) {
            var12 = 786432;
        }
        if (var12 < 262144) {
            var12 = 262144;
        }
        if (var12 > class527.field7531) {
            class527.field7531 += (var12 - class527.field7531) / 24;
        } else if (class527.field7531 > var12) {
            class527.field7531 += (var12 - class527.field7531) / 80;
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(B)V")
    public static void method3428(byte arg0) {
        field8297 = null;
        if (arg0 >= -91) {
            method3427((byte) -68);
        }
        field8291 = null;
        field8298 = null;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I)V")
    public final void method3429(int arg0) {
        field8290++;
        class652 var2 = this.field8292;
        synchronized (this.field8292) {
            this.field8292.method3735(2);
            int var3 = -6 % ((arg0 - 64) / 57);
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IB)Ltn;")
    public final class93 method3430(int arg0, byte arg1) {
        if (arg1 != 116) {
            return null;
        }
        field8293++;
        class652 var3 = this.field8292;
        class93 var4;
        synchronized (this.field8292) {
            var4 = (class93) this.field8292.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field8294;
        byte[] var6;
        synchronized (this.field8294) {
            var6 = this.field8294.method4339(arg0, 0, 35);
        }
        class93 var7 = new class93();
        if (var6 != null) {
            var7.method688(new class494(var6), -1);
        }
        var7.method690(-16);
        class652 var8 = this.field8292;
        synchronized (this.field8292) {
            this.field8292.method3739((long) arg0, (byte) 29, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V")
    public final void method3431(int arg0) {
        field8286++;
        if (arg0 != -10162) {
            this.method3431(-23);
        }
        class652 var2 = this.field8292;
        synchronized (this.field8292) {
            this.field8292.method3743(8);
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(I)V")
    public static final void method3432(int arg0) {
        field8288++;
        class652 var1 = class663.field9221;
        synchronized (class663.field9221) {
            class663.field9221.method3743(arg0 ^ 0xF7);
        }
        if (arg0 != 255) {
            method3432(-97);
        }
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class588(class252 arg0, int arg1, class791 arg2) {
        this.field8294 = arg2;
        if (this.field8294 != null) {
            this.field8294.method4353(35, true);
        }
    }
}
