import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class630 {

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "J")
    public long field9062;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "Ltia;")
    private class278 field9055;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9063 = new String[] { method4588(method4587("3E\u0015\u0011s")), method4588(method4587("3E\u0015\u0013s")), method4588(method4587("3E\u0015\u0014s")), method4588(method4587(",CW<")), method4588(method4587("9\u0018\u0015~&")), method4588(method4587("3E\u0015\u0012s")), method4588(method4587("3E\u0015l2,_Ons")), method4588(method4587("3E\u001562,WW9!'\u001e")) };

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "[I")
    public static int[] field9057 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "Lhl;")
    public static class556 field9056 = new class556(92, -2);

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I[[BLpj;)V", line = 4)
    public static final void method4583(int arg0, byte[][] arg1, class154 arg2) {
        try {
            if (arg0 != 9395) {
                method4584((byte) -3);
            }
            field9054++;
            int var3 = class548.field8055.length;
            for (int var4 = 0; var4 < var3; var4++) {
                byte[] var5 = arg1[var4];
                if (var5 != null) {
                    int var6 = (class543.field7995[var4] >> 8) * 64 - class397.field6289;
                    int var7 = (class543.field7995[var4] & 0xFF) * 64 - class141.field2011;
                    class672.method4864(103);
                    arg2.method1395(class662.field9437, class297.field4841, (byte) -103, var7, var6, var5);
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9063[5] + arg0 + ',' + (arg1 == null ? field9063[3] : field9063[4]) + ',' + (arg2 == null ? field9063[3] : field9063[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 40)
    public static void method4584(byte arg0) {
        try {
            if (arg0 <= 40) {
                method4583(113, null, null);
            }
            field9057 = null;
            field9056 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9063[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 54)
    public static final void method4585(int arg0) {
        try {
            field9059++;
            if (arg0 != 255) {
                method4585(-48);
            }
            if (class536.field7868 != null) {
                try {
                    class536.field7868.close();
                } catch (IOException var2) {
                }
            }
            class536.field7868 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9063[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "finalize", descriptor = "()V", line = 85)
    protected final void finalize() throws Throwable {
        try {
            this.field9055.method2380(true, this.field9062);
            field9061++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9063[7] + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V", line = 95)
    public static final void method4586(int arg0, int arg1) {
        try {
            field9058++;
            if (class504.method3798(127, arg1)) {
                if (arg0 < 119) {
                    method4584((byte) 78);
                }
                class683[] var2 = class309.field5028[arg1];
                for (int var3 = 0; var3 < var2.length; var3++) {
                    class683 var4 = var2[var3];
                    if (var4 != null) {
                        var4.field9769 = 0;
                        var4.field9874 = 0;
                        var4.field9873 = 1;
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9063[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Ltia;J[Ltaa;)V", line = 134)
    public class630(class278 arg0, long arg1, class431[] arg2) {
        try {
            this.field9062 = arg1;
            this.field9055 = arg0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9063[6] + (arg0 == null ? field9063[3] : field9063[4]) + ',' + arg1 + ',' + (arg2 == null ? field9063[3] : field9063[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4587(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4588(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 66;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
