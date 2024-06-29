import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class786 extends class114 {

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11359 = new String[] { method5663(method5662("{1\u00035o#")), method5663(method5662("p}L5S")), method5663(method5662("e&\u000ew")), method5663(method5662("{1\u00035j#")), method5663(method5662("{1\u00035l#")), method5663(method5662("{1\u00035m#")) };

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "[I")
    public static int[] field11358 = new int[5];

    @OriginalMember(owner = "client!pba", name = "n", descriptor = "I")
    private int field11350;

    @OriginalMember(owner = "client!pba", name = "r", descriptor = "I")
    public static int field11351;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
    public static int field11352;

    @OriginalMember(owner = "client!pba", name = "p", descriptor = "I")
    private int field11353;

    @OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
    public static int field11355;

    @OriginalMember(owner = "client!pba", name = "k", descriptor = "I")
    private int field11356;

    @OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
    private int field11357;

    @OriginalMember(owner = "client!pba", name = "o", descriptor = "Lng;")
    public static class429 field11354;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILwfa;)V", line = 6)
    public final void method115(int arg0, class286 arg1) {
        try {
            arg1.method2317(this.field11353, this.field11350, this.field11357, -1, this.field11356);
            field11351++;
            if (arg0 != 95) {
                this.field11353 = 123;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11359[3] + arg0 + ',' + (arg1 == null ? field11359[2] : field11359[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(Z)V", line = 17)
    public static void method5660(boolean arg0) {
        try {
            field11358 = null;
            if (arg0) {
                field11354 = null;
            }
            field11354 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11359[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ljc;I)V", line = 35)
    public final void method116(class711 arg0, int arg1) {
        try {
            field11355++;
            this.field11353 = arg0.method5113(arg1 + 46243);
            if (arg1 == -27800) {
                this.field11357 = arg0.method5113(18443);
                this.field11356 = arg0.method5128(0);
                this.field11350 = arg0.method5128(0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11359[0] + (arg0 == null ? field11359[2] : field11359[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)I", line = 54)
    public static final int method5661(int arg0, int arg1) {
        try {
            if (arg0 <= 69) {
                method5660(false);
            }
            field11352++;
            byte var2;
            if (arg1 > 12000) {
                class162.method1372((byte) -114);
                var2 = 4;
            } else if (arg1 > 5000) {
                var2 = 3;
                class90.method887(250);
            } else if (arg1 > 2000) {
                class450.method3490(98);
                var2 = 2;
            } else {
                class479.method3708(true, 66);
                var2 = 1;
            }
            if (class451.field6612.field9134.method4717(3) != 2) {
                class451.field6612.method4681(2, class451.field6612.field9137, (byte) -111);
                class279.method2271(7, false, 2);
            }
            class536.method4064(10);
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11359[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5662(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5663(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
