import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class494 {

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    public int field7095;

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7102 = new String[] { method3734(method3733("Ei+&x\u001b")), method3734(method3733("Ei+&{\u001b")), method3734(method3733("Ei+&N\\[>zS]ob")), method3734(method3733("Ei+&\u0006Zf#|\u0004\u001b")) };

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "Lvha;")
    public static class713 field7098 = new class713(7, 7);

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "Lvaa;")
    public static class494 field7099 = new class494(0, 1);

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lvea;")
    public static class288 field7100;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lot;")
    public static class616 field7093;

    @OriginalMember(owner = "client!vaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        try {
            field7097++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7102[2] + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 15)
    public static void method3731(int arg0) {
        try {
            if (arg0 == -341) {
                field7098 = null;
                field7100 = null;
                field7099 = null;
                field7093 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7102[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(II)V", line = 33)
    public class494(int arg0, int arg1) {
        try {
            this.field7095 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7102[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIII)V", line = 44)
    public static final void method3732(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field7094++;
            class313 var5 = class196.method1670((long) arg3 | (long) arg0 << 32, 18, arg4 ^ 0xD081289E);
            var5.method2636((byte) 121);
            var5.field4958 = arg2;
            var5.field4951 = arg1;
            if (arg4 != 796841760) {
                method3731(112);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7102[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3733(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3734(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 74;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
