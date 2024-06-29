import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class245 {

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lbf;")
    private class209 field4066 = new class209(256);

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lbf;")
    private class209 field4072 = new class209(256);

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lni;")
    private class202 field4064;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lni;")
    private class202 field4058;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lma;")
    public static class5 field4067 = class12.method119("rect_debug=", (byte) 104);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field4063 = 0;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static volatile int field4069 = -1;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lma;")
    public static class5 field4070 = class12.method119("name_icons", (byte) 82);

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lma;")
    private static class5 field4071 = class12.method119("Take", (byte) 122);

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lma;")
    public static class5 field4061 = field4071;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lje;")
    public static class158 field4073;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([III)Lda;", line = 8)
    public final class26 method1716(int[] arg0, int arg1, int arg2) {
        field4056++;
        if (this.field4058.method1332((byte) 125) == arg2) {
            return this.method1722(0, 0, arg1, arg0);
        } else if (this.field4058.method1326((byte) -100, arg1) == 1) {
            return this.method1722(0, arg1, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I", line = 56)
    public static final int method1717(int arg0, int arg1) {
        if (arg0 == -1025244664) {
            field4068++;
            return arg1 >>> 8;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI[I)Lda;", line = 72)
    public final class26 method1718(byte arg0, int arg1, int[] arg2) {
        field4062++;
        if (this.field4064.method1332((byte) 126) == 1) {
            return this.method1721(arg2, 0, arg1, (byte) 115);
        } else if (this.field4064.method1326((byte) -115, arg1) == 1) {
            return this.method1721(arg2, arg1, 0, (byte) 73);
        } else {
            if (arg0 >= -22) {
                method1720(66);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JB)Lma;", line = 95)
    public static final class5 method1719(long arg0, byte arg1) {
        field4057++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class70.field1103[(int) (var7 - (arg0 * 37L))];
            }
            class5 var9 = new class5();
            var9.field57 = var6;
            var9.field72 = var6.length;
            if (arg1 != -45) {
                method1723(21);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 140)
    public static final void method1720(int arg0) {
        class99.field1478.method523(arg0 + 90);
        field4059++;
        class166.field2528.method523(124);
        if (arg0 != 37) {
            field4073 = (class158) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([IIIB)Lda;", line = 154)
    private final class26 method1721(int[] arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg2 ^ (arg1 >>> 12 | (arg1 & 0xFFF) << 4);
        int var6 = var5 | arg1 << 16;
        field4055++;
        long var7 = (long) var6;
        class26 var9 = (class26) this.field4072.method1372(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 != null && arg0[0] <= 0) {
            return null;
        } else if (arg3 <= 62) {
            return (class26) null;
        } else {
            class6 var10 = class6.method83(this.field4064, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class26 var11 = var10.method81();
            this.field4072.method1376(var7, -1, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field429.length;
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[I)Lda;", line = 190)
    private final class26 method1722(int arg0, int arg1, int arg2, int[] arg3) {
        field4060++;
        int var5 = arg2 ^ (arg1 << 4 & 0xFFF8 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class26 var9 = (class26) this.field4072.method1372(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class64 var10 = (class64) this.field4066.method1372(false, var7);
            if (var10 == null) {
                var10 = class64.method465(this.field4058, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field4066.method1376(var7, arg0 - 1, var10);
            }
            class26 var11 = var10.method457(arg3);
            if (var11 == null) {
                return null;
            }
            var10.method1997(arg0 ^ 0xFFFF950B);
            if (arg0 != 0) {
                this.field4072 = (class209) null;
            }
            this.field4072.method1376(var7, -1, var11);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lni;Lni;)V", line = 280)
    public class245(class202 arg0, class202 arg1) {
        this.field4064 = arg0;
        this.field4058 = arg1;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 263)
    public static void method1723(int arg0) {
        if (arg0 != -2) {
            method1717(95, -70);
        }
        field4070 = null;
        field4073 = null;
        field4071 = null;
        field4067 = null;
        field4061 = null;
    }
}
