import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class234 extends OutputStream {

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3622 = new String[] { method2036(method2035("dMVoN")), method2036(method2035("dMVlN")), method2036(method2035("{Z\u0014B")), method2036(method2035("n\u0001V\u0000\u001b")), method2036(method2035("dMVY\u0014|[\u001d\u0006")) };

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field3618 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!qb", name = "write", descriptor = "(I)V", line = 8)
    public final void write(int arg0) throws IOException {
        try {
            field3619++;
            throw new IOException();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3622[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lkv;B)V", line = 20)
    public static final void method2033(class281 arg0, byte arg1) {
        try {
            arg0.field4577 = null;
            field3621++;
            int var2 = arg0.field4578.length;
            if (arg1 != 28) {
                method2034(9, -6);
            }
            for (int var3 = 0; var3 < var2; var3++) {
                arg0.field4578[var3].field7120 = false;
            }
            class71[] var4 = class571.field8275;
            synchronized (class571.field8275) {
                if (var2 < class571.field8275.length && class97.field1433[var2] < 200) {
                    class571.field8275[var2].method748(117, arg0);
                    int var10002 = class97.field1433[var2]++;
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3622[1] + (arg0 == null ? field3622[2] : field3622[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V", line = 50)
    public static final void method2034(int arg0, int arg1) {
        try {
            class29 var2 = class159.field2287;
            synchronized (class159.field2287) {
                class159.field2287.method294(arg1, -630);
                int var3 = -75 % ((arg0 - 22) / 49);
            }
            field3620++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3622[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2035(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2036(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
