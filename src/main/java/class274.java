import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class274 {

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "Liha;")
    private class29 field4393 = new class29(64);

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "Lgda;")
    private class58 field4394;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "Lgda;")
    private class58 field4395;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4402 = new String[] { method2355(method2354("pZ\u0019B")), method2355(method2354("e\u0001[\u0000\u0019")), method2355(method2354("qL\u0014\u0000XwA\u001cZZ6")), method2355(method2354("qL\u0014\u0000&6")), method2355(method2354("qL\u0014\u0000'6")), method2355(method2354("qL\u0014\u0000%6")) };

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "[I")
    public static int[] field4399 = new int[1];

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "S")
    public static short field4400 = 256;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "Llt;")
    public static class706 field4401 = new class706(2, -1);

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "[Lhk;")
    public static class107[] field4397;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static void method2351(int arg0) {
        try {
            field4397 = null;
            field4401 = null;
            if (arg0 >= -110) {
                method2351(-115);
            }
            field4399 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4402[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)V")
    public static final void method2352(int arg0, int arg1) {
        try {
            field4396++;
            class551 var2 = class380.method3113(arg1 ^ 0xFFFF7F88, (long) arg0, 9);
            if (arg1 == 32768) {
                var2.method4089(arg1 ^ 0x803F);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4402[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(II)Lbda;")
    public final class533 method2353(int arg0, int arg1) {
        try {
            field4398++;
            class533 var3 = (class533) this.field4393.method302(-81, (long) arg0);
            if (var3 != null) {
                return var3;
            }
            byte[] var4;
            if (arg0 < 32768) {
                var4 = this.field4395.method604((byte) 50, arg0, 0);
            } else {
                var4 = this.field4394.method604((byte) 110, arg0 & 0x7FFF, 0);
            }
            if (arg1 != 31611) {
                field4400 = -109;
            }
            class533 var5 = new class533();
            if (var4 != null) {
                var5.method3978(-1, new class176(var4));
            }
            if (arg0 >= 32768) {
                var5.method3974(arg1 - 31653);
            }
            this.field4393.method295(false, (long) arg0, var5);
            return var5;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field4402[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(ILgda;Lgda;)V")
    public class274(int arg0, class58 arg1, class58 arg2) {
        try {
            this.field4394 = arg2;
            this.field4395 = arg1;
            if (this.field4395 != null) {
                this.field4395.method580(88, 0);
            }
            if (this.field4394 != null) {
                this.field4394.method580(62, 0);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4402[2] + arg0 + ',' + (arg1 == null ? field4402[0] : field4402[1]) + ',' + (arg2 == null ? field4402[0] : field4402[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2354(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2355(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
