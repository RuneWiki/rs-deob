import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class731 extends class61 {

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field10448 = new String[] { method5326(method5325("\u0010#t-\u000e")), method5326(method5325("\u0010#t.\u000e")), method5326(method5325("\u0010#t)\u000e")), method5326(method5325("\u0010#t,\u000e")) };

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "Lmq;")
    public static class657 field10446 = new class657();

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "[[[I")
    public static int[][][] field10447 = new int[2][][];

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field10441;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field10442;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public static int field10445;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "[B")
    private byte[] field10443;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)[B", line = 4)
    public final byte[] method5322(int arg0, int arg1, int arg2, int arg3) {
        try {
            field10441++;
            this.field10443 = new byte[arg2 * arg3 * arg0 * 2];
            if (arg1 < 124) {
                method5324((byte) 36);
            }
            this.method5049((byte) -48, arg3, arg0, arg2);
            return this.field10443;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10448[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V", line = 20)
    public static final void method5323(int arg0) {
        try {
            class248.field3552.method779((byte) 98);
            field10442++;
            class129.field1611.method4758((byte) -36);
            class732.field10450.method2753(true);
            class101.field1359.method2827(arg0 - 16702);
            class321.field4379.method596(-1);
            class153.field1955.method3241(9);
            class10.field132.method1885(127);
            class11.field153.method3475(19311);
            class16.field203.method5240(1);
            class640.field9099.method1943((byte) -63);
            class272.field3853.method858(47);
            class135.field1750.method3955(arg0 - 333);
            class772.field10996.method2793(0);
            class123.field1553.method2208(false);
            class319.field4356.method2506((byte) 125);
            class646.field9183.method5248(arg0 + 12597);
            class202.field2972.method610((byte) 80);
            class671.field9451.method1275(16);
            class463.field6758.method4693(0);
            class345.field5030.method4353((byte) 38);
            class443.field6547.method4509(33);
            class505.field7396.method4305(20);
            class561.field8158.method1408((byte) 56);
            class525.method3992(23);
            class739.method5362(false);
            class60.method646(66);
            class339.method2724(20876);
            if (class398.field5793 != class35.field426) {
                for (int var1 = 0; var1 < class322.field4395.length; var1++) {
                    class322.field4395[var1] = null;
                }
                class642.field9151 = 0;
            }
            class526.method3996(119);
            class414.method3231(25606);
            class344.method2763(true);
            class278.method2265(false);
            if (arg0 == -4245) {
                class796.method5741(-121);
                class158.field2027.method2043(false);
                class236.field3418.method123();
                class153.method1297((byte) 37);
                class606.method4475(-1);
                class531.field7700.method513((byte) 22);
                class45.field645.method513((byte) 22);
                class217.field3180.method513((byte) 22);
                class767.field10953.method513((byte) 22);
                class395.field5736.method513((byte) 22);
                class203.field2987.method513((byte) 22);
                class379.field5540.method513((byte) 22);
                class378.field5529.method513((byte) 22);
                class524.field7640.method513((byte) 22);
                class156.field1990.method513((byte) 22);
                class489.field7167.method513((byte) 22);
                class98.field1330.method513((byte) 22);
                class788.field11371.method513((byte) 22);
                class151.field1933.method513((byte) 22);
                class449.field6575.method513((byte) 22);
                class654.field9281.method513((byte) 22);
                class343.field4991.method513((byte) 22);
                class234.field3375.method513((byte) 22);
                class347.field5047.method513((byte) 22);
                class691.field9674.method513((byte) 22);
                class493.field7240.method513((byte) 22);
                class776.field11061.method513((byte) 22);
                class430.field6237.method513((byte) 22);
                class622.field8890.method513((byte) 22);
                class130.field1620.method513((byte) 22);
                class151.field1929.method513((byte) 22);
                class164.field2118.method513((byte) 22);
                class765.field10939.method513((byte) 22);
                class551.field8050.method513((byte) 22);
                class353.field5121.method513((byte) 22);
                class268.field3796.method513((byte) 22);
                class194.field2701.method513((byte) 22);
                class135.field1751.method513((byte) 22);
                class255.field3662.method2043(false);
                class565.field8248.method2043(false);
                class30.field378.method2043(false);
                class282.field3973.method2043(false);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10448[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBB)V", line = 118)
    public final void method665(int arg0, byte arg1, byte arg2) {
        try {
            field10444++;
            byte var8 = (byte) (((arg1 & 0xFF) >> 1) + 127);
            int var4 = arg0 * 2;
            int var10001 = var4;
            int var9 = var4 + 1;
            this.field10443[var10001] = var8;
            int var5 = 95 / ((arg2 + 39) / 55);
            this.field10443[var9] = var8;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10448[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 132)
    public class731() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V", line = 135)
    public static void method5324(byte arg0) {
        try {
            field10446 = null;
            if (arg0 == 62) {
                field10447 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10448[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5325(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5326(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
