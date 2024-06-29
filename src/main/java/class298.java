import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class class298 extends class206 {

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field4697;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4707 = new String[] { method2519(method2518("{$\u0007e\u0017f ]gV")), method2519(method2518("f<E5")), method2519(method2518("sg\u0007w\u0003")), method2519(method2518("{$\u0007\u0010V")), method2519(method2518("{$\u0007\u0015V")), method2519(method2518("{$\u0007\u0013V")), method2519(method2518("{$\u0007\u0012V")) };

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field4700 = 0;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4702 = new BigInteger(method2519(method2518("1,Lo\u0018l/O;J<(\u001cmL0qMlM=}\u00108Ik~MjO?{MjLnz\u001ejJ0q\u0018aOl/OjK>{\u001d?I0-\u001ch\u001cl/MnKj\u007f\u001daJ;}\u0011;\u0018<~\u00108\u001cj\u007fLn\u001bl-K;F0p\u001b<J?+\u0010;O1~Hh\u001b0q\u0010mF8x\u001b8I;~\u001fl\u001a?*\u001chJ9-\u001c")), 16);

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "[I")
    public static int[] field4704 = new int[16384];

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "[I")
    public static int[] field4703 = new int[16384];

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4705;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public int field4695;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public abstract void method139(OggPacket arg0, byte arg1);

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class298(OggStreamState arg0) {
        try {
            this.field4697 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4707[0] + (arg0 == null ? field4707[1] : field4707[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method2514(byte arg0) {
        try {
            field4705 = null;
            field4704 = null;
            field4703 = null;
            if (arg0 == 44) {
                field4702 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4707[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILtia;IIB)V")
    public static final void method2515(int arg0, class280 arg1, int arg2, int arg3, byte arg4) {
        try {
            arg1.field4197.method1412(true, arg0);
            field4696++;
            arg1.field4197.method1446(arg2, (byte) 98);
            arg1.field4197.method1406(arg3, 380332136);
            int var5 = 70 / ((62 - arg4) / 52);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4707[4] + arg0 + ',' + (arg1 == null ? field4707[1] : field4707[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method2516(OggPacket arg0, byte arg1) {
        try {
            this.method139(arg0, (byte) 70);
            field4701++;
            if (arg1 <= 88) {
                this.method138((byte) 36);
            }
            this.field4695++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4707[5] + (arg0 == null ? field4707[1] : field4707[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)V")
    public static final void method2517(int arg0, boolean arg1) {
        try {
            if (arg1) {
                if (class742.field10801 != -1) {
                    class273.method2258((byte) 21, class742.field10801);
                }
                for (class454 var2 = (class454) class661.field9563.method971(347); var2 != null; var2 = (class454) class661.field9563.method973(true)) {
                    if (!var2.method1823(0)) {
                        var2 = (class454) class661.field9563.method971(347);
                        if (var2 == null) {
                            break;
                        }
                    }
                    class440.method3381(var2, arg0 ^ 0x4000, true, false);
                }
                class742.field10801 = -1;
                class661.field9563 = new class112(8);
                class29.method200(4096);
                class742.field10801 = class461.field6733;
                class580.method4335((byte) 38, false);
                class649.method4771((byte) 93);
                class782.method5666(class742.field10801);
            }
            field4694++;
            if (arg0 != 16384) {
                field4702 = null;
            }
            class534.method4033(arg0 ^ 0xFFFFBFC1);
            class765.field11059 = false;
            class296.method2422(1008);
            class311.field4926 = -1;
            class85.method721(class474.field6882, (byte) 39);
            class225.field3446 = new class726();
            class225.field3446.field6197 = class648.field9378 * 512 / 2;
            class225.field3446.field3859[0] = class648.field9378 / 2;
            class225.field3446.field6211 = class659.field9506 * 512 / 2;
            class225.field3446.field3863[0] = class659.field9506 / 2;
            class683.field9899 = 0;
            class271.field4116 = 0;
            if (class185.field2559 == 2) {
                class683.field9899 = class315.field4975 << 9;
                class271.field4116 = class361.field5517 << 9;
            } else {
                class93.method794(56);
            }
            class745.method5429(-6124);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4707[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
    public abstract void method138(byte arg0);

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4704[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field4703[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field4705 = new String[100];
        field4706 = 0;
    }

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2518(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2519(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
