import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class257 extends class140 {

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field3573;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lnp;")
    private class278 field3576;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lae;")
    private class503 field3570;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3565 = 0;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "J")
    public static long field3571 = 0L;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[I")
    public static int[] field3575 = new int[8];

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BIII)I", line = 4)
    public final int method964(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3567++;
        int var5 = 83 % ((arg2 + 54) / 62);
        return this.field3576.method1688(-112, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 15)
    public final void method966(boolean arg0) {
        field3574++;
        this.field3576.method1686(92);
        if (arg0) {
            this.field3570.method2846((byte) -10);
        }
    }

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() {
        this.method971(3289650);
        field3564++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 40)
    public final void method971(int arg0) {
        try {
            this.field3573.close();
        } catch (IOException var2) {
        }
        field3566++;
        if (arg0 == 3289650) {
            this.field3576.method1684(-14641);
            this.field3570.method2844(arg0 ^ 0xFFCDCDCD);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "([BIII)V", line = 56)
    public final void method969(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        this.field3570.method2850(arg0, arg3, (byte) 76, arg1);
        field3578++;
        if (arg2 != -11679) {
            field3571 = -87L;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V", line = 69)
    public static final void method1618(byte arg0) {
        field3569++;
        int var1 = class321.field4715 * 512 + 256;
        int var2 = class329.field4827 * 512 + 256;
        int var3 = class394.method2340(var1, -1, class432.field5993, var2) - class209.field2739;
        if (client.field3007 < 100) {
            if (class132.field1679 < var1) {
                class132.field1679 += class379.field5445 + ((var1 - class132.field1679) * client.field3007 / 1000);
                if (class132.field1679 > var1) {
                    class132.field1679 = var1;
                }
            }
            if (var3 > class628.field8545) {
                class628.field8545 += (var3 - class628.field8545) * client.field3007 / 1000 + class379.field5445;
                if (class628.field8545 > var3) {
                    class628.field8545 = var3;
                }
            }
            if (var1 < class132.field1679) {
                class132.field1679 -= class379.field5445 + ((class132.field1679 - var1) * client.field3007 / 1000);
                if (var1 > class132.field1679) {
                    class132.field1679 = var1;
                }
            }
            if (class471.field6379 < var2) {
                class471.field6379 += (var2 - class471.field6379) * client.field3007 / 1000 + class379.field5445;
                if (class471.field6379 > var2) {
                    class471.field6379 = var2;
                }
            }
            if (class628.field8545 > var3) {
                class628.field8545 -= (class628.field8545 - var3) * client.field3007 / 1000 + class379.field5445;
                if (var3 > class628.field8545) {
                    class628.field8545 = var3;
                }
            }
            if (var2 < class471.field6379) {
                class471.field6379 -= class379.field5445 + ((class471.field6379 - var2) * client.field3007 / 1000);
                if (var2 > class471.field6379) {
                    class471.field6379 = var2;
                }
            }
        } else {
            class132.field1679 = class321.field4715 * 512 + 256;
            class471.field6379 = class329.field4827 * 512 + 256;
            class628.field8545 = class394.method2340(class132.field1679, -1, class432.field5993, class471.field6379) - class209.field2739;
        }
        int var4 = class18.field164 * 512 + 256;
        int var5 = class495.field6699 * 512 + 256;
        int var6 = class394.method2340(var4, -1, class432.field5993, var5) - class198.field2618;
        int var7 = var4 - class132.field1679;
        int var8 = var6 - class628.field8545;
        int var9 = var5 - class471.field6379;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class336.field4947) {
            class336.field4947 += (var11 - class336.field4947 >> 3) * class15.field128 / 1000 + class556.field7593 << 3;
            if (class336.field4947 > var11) {
                class336.field4947 = var11;
            }
        }
        if (class336.field4947 > var11) {
            class336.field4947 -= (class336.field4947 - var11 >> 3) * class15.field128 / 1000 + class556.field7593 << 3;
            if (var11 > class336.field4947) {
                class336.field4947 = var11;
            }
        }
        int var13 = var12 - class261.field3603;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class261.field3603 += class15.field128 * var14 / 1000 + class556.field7593 << 3;
            class261.field3603 &= 0x3FFF;
        }
        if (var14 < 0) {
            class261.field3603 -= class556.field7593 + (-var14 * class15.field128 / 1000) << 3;
            class261.field3603 &= 0x3FFF;
        }
        int var15 = var12 - class261.field3603;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (arg0 >= -64) {
            return;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class253.field3493 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class261.field3603 = var12;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V", line = 243)
    public static void method1619(byte arg0) {
        field3575 = null;
        if (arg0 != -115) {
            method1619((byte) 101);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 253)
    public class257(Socket arg0, int arg1) throws IOException {
        this.field3573 = arg0;
        this.field3573.setSoTimeout(30000);
        this.field3573.setTcpNoDelay(true);
        this.field3576 = new class278(this.field3573.getInputStream(), arg1);
        this.field3570 = new class503(this.field3573.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Z", line = 265)
    public final boolean method965(byte arg0, int arg1) throws IOException {
        int var3 = 127 % ((48 - arg0) / 49);
        field3577++;
        return this.field3576.method1689(true, arg1);
    }
}
