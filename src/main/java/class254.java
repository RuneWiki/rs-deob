import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class254 {

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!eia", name = "h", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!eia", name = "k", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!eia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3947 = new String[] { method2157(method2156("J\u0003~\u0012\"\u0007")), method2157(method2156("TD1\u0012\u001c")), method2157(method2156("A\u001fsP")), method2157(method2156("J\u0003~\u0012#\u0007")), method2157(method2156("J\u0003~\u0012%\u0007")), method2157(method2156("J\u0003~\u0012]F\u0004vH_\u0007")), method2157(method2156("J\u0003~\u0012$\u0007")), method2157(method2156("J\u0003~\u0012 \u0007")) };

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "I")
    public static int field3940 = -2;

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "J")
    public static long field3942 = 0L;

    @OriginalMember(owner = "client!eia", name = "j", descriptor = "Leba;")
    public static class614 field3944 = new class614();

    @OriginalMember(owner = "client!eia", name = "g", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!eia", name = "i", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)V")
    public static void method2151(byte arg0) {
        try {
            int var1 = -7 % ((arg0 + 2) / 56);
            field3944 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3947[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(JI)V")
    public static final void method2152(long arg0, int arg1) {
        try {
            class555.field8262.setTime(new Date(arg0));
            field3939++;
            if (arg1 <= 58) {
                method2153(null, 108);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3947[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lcn;I)V")
    public static final void method2153(class541 arg0, int arg1) {
        try {
            if (~arg0.field8042 == arg1 && arg0.field8100 != -1) {
                class415.method3226(class610.field8913, (byte) 16, arg0);
            }
            field3936++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3947[3] + (arg0 == null ? field3947[2] : field3947[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(IIII)V")
    public class254(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field3937 = arg0;
            this.field3946 = arg3;
            this.field3945 = arg2;
            this.field3938 = arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3947[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(III)V")
    public static final void method2154(int arg0, int arg1, int arg2) {
        try {
            field3943++;
            if (arg2 != -6) {
                method2154(-50, 116, -74);
            }
            class313 var3 = class196.method1670((long) arg1, 1, -35);
            var3.method2636((byte) 83);
            var3.field4951 = arg0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3947[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)Leia;")
    public final class254 method2155(int arg0, int arg1) {
        try {
            if (arg0 <= 57) {
                this.field3945 = 35;
            }
            field3941++;
            return new class254(this.field3937, arg1, this.field3945, this.field3946);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3947[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2156(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2157(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
