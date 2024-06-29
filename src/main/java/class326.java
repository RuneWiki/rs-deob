import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class326 {

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "S")
    public short field4452;

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
    public int field4460;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "B")
    public byte field4459;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "Z")
    public boolean field4461;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "S")
    public short field4458;

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "S")
    public short field4464;

    @OriginalMember(owner = "client!uia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4467 = new String[] { method2577(method2576("vlTp\u0002+")), method2577(method2576("mpY2")), method2577(method2576("vlTp\u0001+")), method2577(method2576("x+\u001bp=")), method2577(method2576("vlTp|jk\\*~+")) };

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "Ldfa;")
    public static class477 field4453 = new class477(16);

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "[[I")
    public static int[][] field4463 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public static int field4462 = -1;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public static int field4466 = 0;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)V")
    public static void method2574(byte arg0) {
        try {
            field4463 = null;
            field4453 = null;
            int var1 = -58 % ((arg0 - 11) / 42);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4467[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(ZLml;)V")
    public static final void method2575(boolean arg0, class194 arg1) {
        try {
            field4455++;
            if (arg0) {
                if (class490.field7181 == null) {
                    class553 var2 = new class553();
                    byte[] var3 = var2.method4135(128, (byte) 99, 16, 128);
                    class490.field7181 = class663.method4794(var3, (byte) -57, false);
                }
                if (class276.field3900 == null) {
                    class731 var4 = new class731();
                    byte[] var5 = var4.method5322(128, 126, 128, 16);
                    class276.field3900 = class663.method4794(var5, (byte) -57, false);
                }
                class209 var6 = arg1.field2759;
                if (var6.method1772((byte) -112) && class261.field3700 == null) {
                    byte[] var7 = class123.method1105(0.5F, new class619(419684), arg0, 16.0F, 128, 16, 8, 4.0F, 128, 4.0F, 0.6F);
                    class261.field3700 = class663.method4794(var7, (byte) -57, false);
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4467[2] + arg0 + ',' + (arg1 == null ? field4467[1] : field4467[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        try {
            this.field4454 = arg1;
            this.field4452 = (short) arg6;
            this.field4457 = arg11;
            this.field4460 = arg0;
            this.field4459 = (byte) arg8;
            this.field4461 = arg10;
            this.field4456 = arg2;
            this.field4458 = (short) arg5;
            this.field4465 = arg3;
            this.field4464 = (short) arg4;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field4467[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2576(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2577(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
