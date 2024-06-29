import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class180 {

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "B")
    private byte field2336;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public int field2335;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2345 = new String[] { method1504(method1503("B 3~?")), method1504(method1503("Vb3\u0011j")), method1504(method1503("B 3z?")), method1504(method1503("C9qS")), method1504(method1503("B 3}?")), method1504(method1503("B 3{?")), method1504(method1503("B 3|?")), method1504(method1503("B 3\u0003~C%i\u0001?")) };

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "[B")
    public static byte[] field2339 = new byte[32896];

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field2342;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public static final void method1498(byte arg0) {
        try {
            field2333++;
            class646.field9186 = true;
            if (arg0 <= 34) {
                field2339 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2345[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
    public final int method1499(byte arg0) {
        try {
            if (arg0 != 19) {
                field2342 = null;
            }
            field2337++;
            return this.field2336 & 0x7;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2345[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1500(int arg0) {
        try {
            if (arg0 == -20521) {
                field2339 = null;
                field2342 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2345[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I")
    public final int method1501(int arg0) {
        try {
            field2338++;
            if (arg0 != 8021) {
                this.field2336 = -48;
            }
            return (this.field2336 & 0x8) == 8 ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2345[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Leea;Z)V")
    public static final void method1502(class476 arg0, boolean arg1) {
        try {
            field2340++;
            arg0.method3678(-1);
            int var2 = class241.field3470;
            class339 var3 = class203.field2988 = class748.field10666[var2] = new class339();
            var3.field2200 = var2;
            if (!arg1) {
                field2342 = null;
            }
            int var4 = arg0.method3677(-50, 30);
            byte var5 = (byte) (var4 >> 28);
            int var6 = var4 >> 14 & 0x3FFF;
            int var7 = var4 & 0x3FFF;
            var3.field2252[0] = var6 - class537.field7895;
            var3.field2969 = (var3.field2252[0] << 9) + (var3.method1437((byte) -28) << 8);
            var3.field2256[0] = var7 - class655.field9286;
            var3.field2984 = (var3.field2256[0] << 9) + (var3.method1437((byte) -28) << 8);
            class693.field9689 = var3.field2981 = var3.field2971 = var5;
            if (class23.method275(1, var3.field2252[0], var3.field2256[0])) {
                var3.field2971++;
            }
            if (class320.field4366[var2] != null) {
                var3.method2722(class320.field4366[var2], 5100);
            }
            class689.field9642 = 0;
            class599.field8595[class689.field9642++] = var2;
            class356.field5179[var2] = 0;
            class597.field8584 = 0;
            for (int var8 = 1; var8 < 2048; var8++) {
                if (var2 != var8) {
                    int var9 = arg0.method3677(-64, 18);
                    int var10 = var9 >> 16;
                    int var11 = (var9 & 0xFFBF) >> 8;
                    int var12 = var9 & 0xFF;
                    class570 var13 = class429.field6194[var8] = new class570();
                    var13.field8274 = 0;
                    var13.field8268 = false;
                    var13.field8271 = -1;
                    var13.field8269 = (var10 << 28) + var12 + (var11 << 14);
                    var13.field8273 = false;
                    class751.field10698[class597.field8584++] = var8;
                    class356.field5179[var8] = 0;
                }
            }
            arg0.method3681(-80);
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field2345[2] + (arg0 == null ? field2345[3] : field2345[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
    public class180() {
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljc;)V")
    public class180(class711 arg0) {
        try {
            this.field2336 = arg0.method5125((byte) -108);
            this.field2334 = arg0.method5116((byte) -109);
            this.field2344 = arg0.method5113(18443);
            this.field2343 = arg0.method5113(18443);
            this.field2335 = arg0.method5113(18443);
            this.field2341 = arg0.method5113(18443);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2345[7] + (arg0 == null ? field2345[3] : field2345[1]) + ')');
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2339[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field2342 = new String[100];
    }

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1503(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1504(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
