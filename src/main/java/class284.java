import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class284 implements Runnable {

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Lju;")
    private class83 field4277 = new class83();

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "Z")
    private boolean field4283 = false;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public int field4280 = 0;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field4282;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Lbj;")
    public static class162 field4279 = new class162(40, 3);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLfq;I)Lrf;", line = 3)
    public final class59 method1771(boolean arg0, class137 arg1, int arg2) {
        field4267++;
        class59 var4 = new class59();
        var4.field3034 = arg2;
        var4.field1237 = arg1;
        var4.field1235 = 3;
        var4.field581 = false;
        if (arg0) {
            this.method1775(!arg0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 23)
    public final void method1772(int arg0) {
        field4271++;
        this.field4283 = true;
        class83 var2 = this.field4277;
        synchronized (this.field4277) {
            this.field4277.notifyAll();
            if (arg0 >= -15) {
                this.method1771(false, null, 50);
            }
        }
        try {
            this.field4282.join();
        } catch (InterruptedException var3) {
        }
        this.field4282 = null;
    }

    @OriginalMember(owner = "client!rm", name = "run", descriptor = "()V", line = 42)
    public final void run() {
        field4269++;
        while (!this.field4283) {
            class83 var1 = this.field4277;
            class59 var2;
            synchronized (this.field4277) {
                var2 = (class59) this.field4277.method777((byte) -18);
                if (var2 == null) {
                    try {
                        this.field4277.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4280--;
            }
            try {
                if (var2.field1235 == 2) {
                    var2.field1237.method1036((int) var2.field3034, var2.field1230, var2.field1230.length, (byte) -74);
                } else if (var2.field1235 == 3) {
                    var2.field1230 = var2.field1237.method1037((byte) 119, (int) var2.field3034);
                }
            } catch (Exception var6) {
                class486.method2913(null, var6, (byte) -123);
            }
            var2.field582 = false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BILfq;[B)Lrf;", line = 88)
    public final class59 method1773(byte arg0, int arg1, class137 arg2, byte[] arg3) {
        field4268++;
        class59 var5 = new class59();
        if (arg0 != 25) {
            return null;
        }
        var5.field3034 = arg1;
        var5.field581 = false;
        var5.field1235 = 2;
        var5.field1237 = arg2;
        var5.field1230 = arg3;
        this.method1775(false, var5);
        return var5;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 108)
    public static void method1774(int arg0) {
        if (arg0 == -3) {
            field4279 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLrf;)V", line = 118)
    private final void method1775(boolean arg0, class59 arg1) {
        field4273++;
        class83 var3 = this.field4277;
        synchronized (this.field4277) {
            this.field4277.method776(0, arg1);
            this.field4280++;
            if (arg0) {
                field4279 = null;
            }
            this.field4277.notifyAll();
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)I", line = 134)
    public static final int method1776(int arg0, int arg1, int arg2) {
        field4272++;
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 != 126) {
            method1776(-65, -114, -53);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)I", line = 156)
    public static final int method1777(int arg0, int arg1, int arg2) {
        field4274++;
        int var3 = -23 % ((arg1 + 57) / 58);
        int var4 = class76.method685(4, -1, arg2 + 91923, arg0 + 45365) + (class76.method685(2, -1, arg2 + 37821, arg0 + 10294) - 128 >> 1) + (class76.method685(1, -1, arg2, arg0) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLfq;I)Lrf;", line = 178)
    public final class59 method1778(byte arg0, class137 arg1, int arg2) {
        field4270++;
        class59 var4 = new class59();
        var4.field1235 = 1;
        int var5 = -28 / ((arg0 - 86) / 36);
        class83 var6 = this.field4277;
        synchronized (this.field4277) {
            class59 var7 = (class59) this.field4277.method779(1);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if ((long) arg2 == var7.field3034 && var7.field1237 == arg1 && var7.field1235 == 2) {
                    var4.field582 = false;
                    var4.field1230 = var7.field1230;
                    return var4;
                }
                var7 = (class59) this.field4277.method780((byte) 110);
            }
        }
        var4.field1230 = arg1.method1037((byte) 97, arg2);
        var4.field581 = true;
        var4.field582 = false;
        return var4;
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)Z", line = 215)
    public static final boolean method1779(int arg0, int arg1, int arg2) {
        field4275++;
        if (arg0 == 35) {
            return (arg2 & 0x580) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Llt;)V", line = 241)
    public class284(class480 arg0) {
        class121 var2 = arg0.method2860(-79, 5, this);
        while (var2.field2119 == 0) {
            class50.method470(10L, -5);
        }
        if (var2.field2119 == 2) {
            throw new RuntimeException();
        }
        this.field4282 = (Thread) var2.field2115;
    }
}
