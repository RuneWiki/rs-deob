import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class115 implements Runnable {

    @OriginalMember(owner = "client!te", name = "m", descriptor = "[Lcl;")
    public volatile class145[] field2061 = new class145[2];

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Z")
    public volatile boolean field2060 = false;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Z")
    public volatile boolean field2049 = false;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field2054 = 0;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "S")
    public static short field2056 = 320;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field2052 = 0;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "S")
    public static short field2059 = 1;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[S")
    public static short[] field2062 = new short[256];

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field2050 = 1;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lme;")
    public class295 field2055;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "[[[B")
    public static byte[][][] field2053;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B[S)[S", line = 9)
    public static final short[] method862(byte arg0, short[] arg1) {
        field2058++;
        int var2 = -100 / ((30 - arg0) / 51);
        if (arg1 == null) {
            return null;
        } else {
            short[] var3 = new short[arg1.length];
            class275.method1934(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 34)
    public static void method863(int arg0) {
        field2062 = null;
        if (arg0 != 1) {
            method863(92);
        }
        field2053 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!te", name = "run", descriptor = "()V", line = 77)
    public final void run() {
        this.field2049 = true;
        field2057++;
        try {
            while (!this.field2060) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class145 var2 = this.field2061[var1];
                    if (var2 != null) {
                        var2.method1002(155);
                    }
                }
                class237.method1628((byte) -88, 10L);
                class68.method510(this.field2055, (Object) null, false);
            }
        } catch (Exception var7) {
            class107.method796(var7, (byte) 19, (String) null);
        } finally {
            this.field2049 = false;
        }
    }
}
