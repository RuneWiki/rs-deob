import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class52 extends class156 {

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "[J")
    private long[] field904 = new long[10];

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    private int field906 = 256;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    private int field909 = 1;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    private int field910 = 0;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "J")
    private long field900 = class276.method1861((byte) 122);

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "[I")
    public static int[] field911 = new int[128];

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "[Z")
    public static boolean[] field912 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field914 = 0;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "[I")
    public static int[] field901;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)I")
    public static final int method397(boolean arg0, int arg1) {
        field907++;
        if (!arg0) {
            return -106;
        }
        if (class5.field69 != null) {
            class5.field69.method7((byte) 18);
            class5.field69 = null;
        }
        class124.field2014++;
        if (class124.field2014 > 4) {
            class162.field2587 = 0;
            class124.field2014 = 0;
            return arg1;
        }
        class162.field2587 = 0;
        if (class78.field1253 == class143.field2308) {
            class143.field2308 = class95.field1554;
        } else {
            class143.field2308 = class78.field1253;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method398(int arg0) {
        field912 = null;
        field901 = null;
        field911 = null;
        int var1 = 100 % ((64 - arg0) / 58);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)I")
    public static final int method399(int arg0) {
        field905++;
        if (arg0 > -25) {
            return 69;
        } else if (class266.field4217) {
            return 0;
        } else if (class257.method1757(-5)) {
            return class229.field3785 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIZLqh;Lqh;)Lqi;")
    public static final class129 method400(int arg0, int arg1, boolean arg2, class201 arg3, class201 arg4) {
        field902++;
        boolean var5 = true;
        int[] var6 = arg4.method1360(1, arg1);
        if (arg0 != 10) {
            return null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method1372(var6[var7], arg1, -401709663);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg2) {
                    var10 = arg3.method1372(var9, 0, -401709663);
                } else {
                    var10 = arg3.method1372(0, var9, -401709663);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class129(arg4, arg3, arg1, arg2);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public final void method401(byte arg0) {
        field903++;
        if (arg0 <= 41) {
            this.method401((byte) -20);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field904[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)I")
    public final int method402(byte arg0, int arg1, int arg2) {
        field913++;
        int var4 = this.field906;
        this.field906 = 300;
        int var5 = this.field909;
        this.field909 = 1;
        this.field900 = class276.method1861((byte) 122);
        if (this.field904[this.field908] == 0L) {
            this.field909 = var5;
            this.field906 = var4;
        } else if (this.field904[this.field908] < this.field900) {
            this.field906 = (int) ((long) (arg1 * 2560) / (this.field900 - this.field904[this.field908]));
        }
        if (arg0 != 85) {
            return -90;
        }
        if (this.field906 < 25) {
            this.field906 = 25;
        }
        if (this.field906 > 256) {
            this.field906 = 256;
            this.field909 = (int) ((long) arg1 - ((this.field900 - this.field904[this.field908]) / 10L));
        }
        if (this.field909 > arg1) {
            this.field909 = arg1;
        }
        this.field904[this.field908] = this.field900;
        this.field908 = (this.field908 + 1) % 10;
        if (this.field909 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field904[var6] != 0L) {
                    this.field904[var6] -= -((long) this.field909);
                }
            }
        }
        if (arg2 > this.field909) {
            this.field909 = arg2;
        }
        int var7 = 0;
        class43.method358((long) this.field909, false);
        while (this.field910 < 256) {
            this.field910 += this.field906;
            var7++;
        }
        this.field910 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class52() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field904[var1] = this.field900;
        }
    }
}
