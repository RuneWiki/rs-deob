import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class551 extends class459 {

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field8086 = new String[] { method4093(method4092("\u0004xR}a")), method4093(method4092("\u0004xRza")), method4093(method4092("\u0004xR\u0002 \u0019w\b\u0000a")), method4093(method4092("\u0004xRxa")), method4093(method4092("\u0004xR\u007fa")), method4093(method4092("\u0003{\u0010[i")), method4093(method4092("\u0004xRya")), method4093(method4092("\u0004xR{a")), method4093(method4092("\u0004xR|a")) };

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "Lhl;")
    public static class556 field8077 = new class556(69, 0);

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "Liha;")
    public static class29 field8082 = new class29(3000000, 200);

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field8085 = -1;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public int field8073;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public int field8076;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public int field8081;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "Lgda;")
    public static class58 field8080;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Ljava/lang/String;")
    public String field8072;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)J", line = 4)
    public final long method4085(int arg0) {
        try {
            ++field8078;
            if (arg0 != 63) {
                this.field8073 = -65;
            }
            return super.field7075 & Long.MAX_VALUE;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8086[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V", line = 18)
    public final void method4086(int arg0) {
        try {
            super.field7075 |= Long.MIN_VALUE;
            int var2 = 97 % ((14 - arg0) / 38);
            ++field8074;
            if (~this.method4085(63) == -1L) {
                class502.field7512.method5142(this, (byte) -63);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8086[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)I", line = 33)
    public final int method4087(byte arg0) {
        try {
            ++field8075;
            int var2 = -107 % ((-43 - arg0) / 43);
            return (int) (255L & super.field8252 >>> 56);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8086[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)J", line = 44)
    public final long method4088(byte arg0) {
        try {
            ++field8084;
            int var2 = -101 / ((-16 - arg0) / 45);
            return super.field8252 & 72057594037927935L;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8086[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V", line = 58)
    public final void method4089(int arg0) {
        try {
            ++field8079;
            super.field7075 = class712.method5167(arg0 ^ -2339) - -500L | Long.MIN_VALUE & super.field7075;
            class77.field1149.method5142(this, (byte) -63);
            if (arg0 != 63) {
                field8082 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8086[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 73)
    public static void method4090(int arg0) {
        try {
            field8082 = null;
            if (arg0 == 708402086) {
                field8080 = null;
                field8077 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8086[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IJ)V", line = 89)
    public class551(int arg0, long arg1) {
        try {
            super.field8252 = (long) arg0 << 56 | arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8086[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIII)V", line = 98)
    public static final void method4091(boolean arg0, int arg1, int arg2, int arg3) {
        try {
            ++field8083;
            String var4 = field8086[5] + arg1 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (63 & arg3) + "," + (63 & arg2);
            System.out.println(var4);
            class164.method1543(5, true, arg0, var4);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8086[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4092(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4093(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 124;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
