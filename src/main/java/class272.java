import java.awt.Frame;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class272 {

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "Z")
    private boolean field4082 = false;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "I")
    public int field4088 = 0;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public int field4071 = 0;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "Lqfa;")
    public static class85 field4072 = new class85(89, 3);

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    private int field4074;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public int field4076;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public int field4078;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public int field4080;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
    public int field4089;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "J")
    public long field4075;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
    public static void method1773(int arg0) {
        field4072 = null;
        if (arg0 != 11388) {
            field4072 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
    public final void method1774(int arg0) {
        field4077++;
        this.field4087 = class509.field7220[this.field4074 << 3];
        long var2 = (long) this.field4080;
        long var4 = (long) this.field4086;
        long var6 = (long) this.field4076;
        this.field4083 = (int) Math.sqrt((double) (var4 * var4 + var2 * var2 + var6 * var6));
        if (this.field4084 == 0) {
            this.field4084 = 1;
        }
        if (this.field4078 == 0) {
            this.field4075 = 2147483647L;
        } else if (this.field4078 == 1) {
            this.field4075 = (this.field4083 * 8 / this.field4084);
            this.field4075 *= this.field4075;
        } else if (this.field4078 == 2) {
            this.field4075 = (this.field4083 * 8 / this.field4084);
        }
        if (arg0 <= 56) {
            this.field4084 = 55;
        }
        if (this.field4082) {
            this.field4083 *= -1;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLqh;)V")
    public final void method1775(boolean arg0, class61 arg1) {
        if (!arg0) {
            return;
        }
        field4091++;
        while (true) {
            int var3 = arg1.method732(-559537960);
            if (var3 == 0) {
                return;
            }
            this.method1779(var3, -11, arg1);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1776(String arg0, int arg1) {
        field4073++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class655.method3728(arg0, true);
        if (var2 == null || arg1 != 1) {
            return;
        }
        for (int var3 = 0; var3 < class164.field2749; var3++) {
            String var4 = class343.field5109[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class655.method3728(var4, true);
            if (var5 != null && var5.equals(var2)) {
                class164.field2749--;
                for (int var6 = var3; var6 < class164.field2749; var6++) {
                    class343.field5109[var6] = class343.field5109[var6 + 1];
                    class673.field9579[var6] = class673.field9579[var6 + 1];
                    class706.field9939[var6] = class706.field9939[var6 + 1];
                    class275.field4105[var6] = class275.field4105[var6 + 1];
                    class305.field4519[var6] = class305.field4519[var6 + 1];
                    class44.field1098[var6] = class44.field1098[var6 + 1];
                }
                class658.field9494++;
                class63.field1431 = class104.field1844;
                class275 var7 = class185.method1355(arg1 - 1, class559.field7903, class395.field5772);
                var7.field4103.method693((byte) 106, class511.method3019(arg0, -105));
                var7.field4103.method750(123, arg0);
                class140.method1141(var7, 19321);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILn;IIIB)Ljava/awt/Frame;")
    public static final Frame method1777(int arg0, class17 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4081++;
        if (!arg1.method406(0)) {
            return null;
        }
        if (arg0 == 0) {
            class202[] var6 = class223.method1534(1769, arg1);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3116 == arg4 && var6[var8].field3112 == arg3 && (arg2 == 0 || var6[var8].field3117 == arg2) && (!var7 || var6[var8].field3119 > arg0)) {
                    arg0 = var6[var8].field3119;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class456 var9 = arg1.method393(arg4, arg3, arg2, arg0, true);
        while (var9.field6502 == 0) {
            class185.method1354(10L, 10);
        }
        if (arg5 >= -120) {
            return null;
        }
        Frame var10 = (Frame) var9.field6499;
        if (var10 == null) {
            return null;
        } else if (var9.field6502 == 2) {
            class291.method1945(arg1, (byte) -65, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/io/File;Ljava/lang/String;)V")
    public static final void method1778(byte arg0, File arg1, String arg2) {
        if (arg0 <= 1) {
            field4072 = null;
        }
        field4079++;
        class4.field464.put(arg2, arg1);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILqh;)V")
    private final void method1779(int arg0, int arg1, class61 arg2) {
        field4090++;
        if (arg1 != -11) {
            return;
        }
        if (arg0 == 1) {
            this.field4074 = arg2.method723((byte) -25);
        } else if (arg0 == 2) {
            arg2.method732(-559537960);
        } else if (arg0 == 3) {
            this.field4080 = arg2.method730(117);
            this.field4086 = arg2.method730(-125);
            this.field4076 = arg2.method730(100);
        } else if (arg0 == 4) {
            this.field4078 = arg2.method732(-559537960);
            this.field4084 = arg2.method730(109);
        } else if (arg0 == 6) {
            this.field4089 = arg2.method732(-559537960);
        } else if (arg0 == 8) {
            this.field4071 = 1;
        } else if (arg0 == 9) {
            this.field4088 = 1;
        } else if (arg0 == 10) {
            this.field4082 = true;
            return;
        }
    }
}
