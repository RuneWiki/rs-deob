import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class104 {

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1376 = new String[] { method999(method998("vC8'2/")), method999(method998("vC8&2/")), method999(method998("iWz\u0002")), method999(method998("|\f8@\u000e")) };

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Z")
    public static boolean field1371 = false;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lmv;")
    public static class125 field1372 = new class125(91, 1);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1373 = 1409;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
    public static int[] field1374 = new int[1000];

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Ldfa;")
    public static class477 field1375 = new class477(8);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqa;)V")
    public abstract void method733(class104 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III[I)V")
    public abstract void method740(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method996(int arg0) {
        try {
            field1375 = null;
            field1374 = null;
            field1372 = null;
            if (arg0 != 91) {
                method997((byte) 53, null);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1376[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public abstract void method729(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjc;)Lli;")
    public static final class521 method997(byte arg0, class711 arg1) {
        try {
            if (arg0 < 96) {
                field1375 = null;
            }
            field1370++;
            return new class521(arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5087((byte) -26), arg1.method5085(true), arg1.method5128(0));
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1376[1] + arg0 + ',' + (arg1 == null ? field1376[2] : field1376[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(III[I)V")
    public abstract void method718(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public abstract void method741(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([I)V")
    public abstract void method743(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)V")
    public abstract void method721(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public abstract void method719(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
    public abstract void method739(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method742(int arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public abstract void method736(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lqa;")
    public abstract class104 method737();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III[I)V")
    public abstract void method732(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public abstract void method724(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public abstract void method735();

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method998(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method999(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
