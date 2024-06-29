import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class244 {

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "Lnj;")
    private class162 field3412 = new class162(64);

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "Lnj;")
    public class162 field3416 = new class162(30);

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "Lmg;")
    private class101 field3405;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Lmg;")
    public class101 field3407;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "[I")
    public static int[] field3406 = new int[256];

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "[I")
    public static int[] field3415 = new int[50];

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3419;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    public int field3420;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public final void method1475(byte arg0) {
        field3408++;
        class162 var2 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.method1066(4080);
        }
        class162 var3 = this.field3416;
        synchronized (this.field3416) {
            this.field3416.method1066(4080);
        }
        if (arg0 < 56) {
            field3417 = 85;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static void method1476(int arg0) {
        field3419 = null;
        if (arg0 >= -15) {
            field3409 = -74;
        }
        field3415 = null;
        field3406 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V")
    public final void method1477(byte arg0, int arg1) {
        if (arg0 != 90) {
            this.method1482(-37);
        }
        this.field3420 = arg1;
        field3410++;
        class162 var3 = this.field3416;
        synchronized (this.field3416) {
            this.field3416.method1068(0);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
    public static final void method1478(int arg0, int arg1) {
        int var2 = -96 / ((arg1 - 23) / 36);
        if (class88.field1282 == 0) {
            class121.field1817.method548(arg0, false);
        } else {
            class88.field1281 = arg0;
        }
        field3404++;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)Lqi;")
    public final class398 method1479(int arg0, byte arg1) {
        field3411++;
        class162 var3 = this.field3412;
        class398 var4;
        synchronized (this.field3412) {
            var4 = (class398) this.field3412.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3405.method727(class267.method1600(0, arg0), class202.method1257(arg0, 111), 85);
        if (arg1 >= -111) {
            this.field3416 = null;
        }
        class398 var6 = new class398();
        var6.field5804 = this;
        var6.field5802 = arg0;
        if (var5 != null) {
            var6.method2403(new class391(var5), -93);
        }
        class162 var7 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)V")
    public final void method1480(int arg0, int arg1) {
        class162 var3 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.method1065((byte) -95, arg1);
        }
        if (arg0 != -18148) {
            return;
        }
        field3403++;
        class162 var4 = this.field3416;
        synchronized (this.field3416) {
            this.field3416.method1065((byte) -95, arg1);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1481(byte arg0, byte[] arg1) {
        field3414++;
        int var2 = arg1.length;
        if (arg0 != 4) {
            field3409 = 102;
        }
        byte[] var3 = new byte[var2];
        class91.method678(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
    public final void method1482(int arg0) {
        field3413++;
        class162 var2 = this.field3412;
        synchronized (this.field3412) {
            this.field3412.method1068(arg0 ^ arg0);
        }
        class162 var3 = this.field3416;
        synchronized (this.field3416) {
            this.field3416.method1068(0);
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lal;ILmg;Lmg;)V")
    public class244(class66 arg0, int arg1, class101 arg2, class101 arg3) {
        this.field3405 = arg2;
        this.field3407 = arg3;
        int var5 = this.field3405.method746(44) - 1;
        this.field3405.method753(var5, -91);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3406[var0] = var1;
        }
        field3417 = 0;
        field3418 = 0;
        field3419 = new String[100];
    }
}
