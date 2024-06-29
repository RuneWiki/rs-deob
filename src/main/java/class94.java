import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class94 extends class40 {

    @OriginalMember(owner = "client!vga", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field1064 = new String[] { method804(method803("%\rRB3{")), method804(method803("%\rRB5{")), method804(method803(":\u0004")), method804(method803("=\u001f_\u0000")), method804(method803("(D\u001dB\n")), method804(method803("%\rRB4{")), method804(method803("%\rRB1{")), method804(method803("%\rRB6{")), method804(method803("%\rRB2{")) };

    @OriginalMember(owner = "client!vga", name = "G", descriptor = "Lel;")
    public static class573 field1058 = new class573(41, 7);

    @OriginalMember(owner = "client!vga", name = "H", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!vga", name = "F", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!vga", name = "K", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!vga", name = "I", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!vga", name = "J", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!vga", name = "M", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!vga", name = "L", descriptor = "[B")
    private byte[] field1057;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIB)V", line = 4)
    public final void method270(int arg0, int arg1, byte arg2) {
        try {
            field1063++;
            int var4 = arg0 * 2;
            byte var7 = (byte) ((arg2 >> 1 & 0x7F) + 127);
            if (arg1 != 4096) {
                method801(null, false, 80);
            }
            this.field1057[var4++] = var7;
            this.field1057[var4] = var7;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1064[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V", line = 21)
    public static final void method798(int arg0) {
        try {
            field1060++;
            for (class655 var1 = (class655) class492.field7058.method4068(false); var1 != null; var1 = (class655) class492.field7058.method4072(-62)) {
                if (var1.field9459 > 1) {
                    var1.field9459 = 0;
                    class71.field775.method1556(((class417) var1.field9457.field7916.field529).field6154, var1, 1);
                    var1.field9457.method4069((byte) -65);
                }
            }
            class593.field8707 = 0;
            if (arg0 >= 125) {
                class184.field2547 = 0;
                class728.field10549.method3879(70);
                class244.field3740.method970(-99);
                class492.field7058.method4069((byte) -45);
                class216.field3297 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1064[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIII)[B", line = 53)
    public final byte[] method799(int arg0, int arg1, int arg2, int arg3) {
        try {
            field1056++;
            this.field1057 = new byte[arg0 * arg2 * arg3 * 2];
            if (arg1 != 17968) {
                this.field1057 = null;
            }
            this.method1867(arg2, arg3, arg0, (byte) -120);
            return this.field1057;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1064[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "(I)V", line = 66)
    public static void method800(int arg0) {
        try {
            int var1 = 76 / ((-arg0 - 15) / 55);
            field1058 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1064[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 75)
    public static final Object method801(byte[] arg0, boolean arg1, int arg2) {
        try {
            field1059++;
            if (arg0 == null) {
                return null;
            }
            if (arg2 < arg0.length && !class408.field6048) {
                try {
                    class307 var3 = (class307) Class.forName(field1064[2]).getDeclaredConstructor().newInstance();
                    var3.method823(arg0, 14);
                    return var3;
                } catch (Throwable var5) {
                    class408.field6048 = true;
                }
            }
            return arg1 ? class324.method2753(arg0, false) : arg0;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1064[5] + (arg0 == null ? field1064[3] : field1064[4]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(IIB)Z", line = 106)
    public static final boolean method802(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 >= -102) {
                method802(-91, -127, (byte) 53);
            }
            field1061++;
            return (arg0 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1064[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "()V", line = 117)
    public class94() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method803(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method804(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
