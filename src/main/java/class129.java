import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class129 extends class149 {

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "Lwj;")
    public static class270 field1910 = new class270(61, -2);

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "[B")
    private byte[] field1906;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 4)
    public static final boolean method888(boolean arg0, String arg1) {
        field1913++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class18.field235; var2++) {
            if (arg1.equalsIgnoreCase(class267.field3692[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class353.field5182[var2])) {
                return true;
            }
        }
        if (arg0) {
            method894(null, (byte) -10);
        }
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(B)V", line = 39)
    public static void method889(byte arg0) {
        field1910 = null;
        if (arg0 != 112) {
            field1910 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)Z", line = 52)
    public static final boolean method890(int arg0) {
        field1912++;
        if (arg0 != 12600) {
            method894(null, (byte) 97);
        }
        return class48.field570;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 65)
    public class129() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIII)[B", line = 68)
    public final byte[] method891(int arg0, int arg1, int arg2, int arg3) {
        this.field1906 = new byte[arg0 * arg2 * arg3 * 2];
        int var5 = -116 % ((-arg1 - 3) / 50);
        field1908++;
        this.method421(arg3, (byte) 90, arg2, arg0);
        return this.field1906;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBZ)V", line = 83)
    public final void method892(int arg0, byte arg1, boolean arg2) {
        field1907++;
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field1906[var10001] = var4;
        if (arg2) {
            this.method892(-51, (byte) 71, false);
        }
        this.field1906[var6] = var4;
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V", line = 98)
    public static final void method893(int arg0) {
        class375.field5498 = 0;
        field1911++;
        if (arg0 != 127) {
            field1914 = -93;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class149.field2152[var1] = null;
            class413.field6033[var1] = 1;
            class455.field6688[var1] = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([BB)[B", line = 121)
    public static final byte[] method894(byte[] arg0, byte arg1) {
        field1909++;
        class391 var2 = new class391(arg0);
        if (arg1 >= -53) {
            return null;
        }
        int var3 = var2.method2348(-2);
        int var4 = var2.method2361((byte) -56);
        if (var4 < 0 || class149.field2144 != 0 && var4 > class149.field2144) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2362(var4, var5, 0, (byte) -54);
            return var5;
        } else {
            int var6 = var2.method2361((byte) -56);
            if (var6 < 0 || !(class149.field2144 == 0 || class149.field2144 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class34.method205(var7, var6, arg0, var4, 9);
            } else {
                class417.field6053.method1246((byte) -116, var2, var7);
            }
            return var7;
        }
    }
}
