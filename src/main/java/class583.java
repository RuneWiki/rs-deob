import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class583 {

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8422 = new String[] { method4321(method4320("\fC^\b=")), method4321(method4320("\fC^\u000b=")), method4321(method4320("\u0016\n^gh")), method4321(method4320("\u0003Q\u001c%")) };

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field8417 = new String[5];

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Luu;")
    public static class240 field8420 = new class240(5, 1);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lcu;")
    public static class66 field8421;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[BII)Z")
    public static final boolean method4318(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        try {
            field8418++;
            boolean var6 = true;
            class711 var7 = new class711(arg3);
            int var8 = arg0;
            label86: while (true) {
                int var9 = var7.method5105((byte) 28);
                if (var9 == 0) {
                    return var6;
                }
                var8 += var9;
                int var10 = 0;
                boolean var11 = false;
                while (true) {
                    int var15;
                    class789 var18;
                    do {
                        int var16;
                        int var17;
                        do {
                            do {
                                do {
                                    do {
                                        while (var11) {
                                            int var19 = var7.method5090(arg0 ^ 0x62);
                                            if (var19 == 0) {
                                                continue label86;
                                            }
                                            var7.method5128(~arg0);
                                        }
                                        int var12 = var7.method5090(-48);
                                        if (var12 == 0) {
                                            continue label86;
                                        }
                                        var10 += var12 - 1;
                                        int var13 = var10 & 0x3F;
                                        int var14 = (var10 & 0xFE3) >> 6;
                                        var15 = var7.method5128(0) >> 2;
                                        var16 = var14 + arg2;
                                        var17 = arg4 + var13;
                                    } while (var16 <= 0);
                                } while (var17 <= 0);
                            } while (var16 >= arg5 - 1);
                        } while (var17 >= (arg1 - 1));
                        var18 = class101.field1359.method2832(120, var8);
                    } while (var15 == 22 && class451.field6612.field9091.method3900(3) == 0 && var18.field11409 == 0 && var18.field11480 != 1 && !var18.field11462);
                    if (!var18.method5690(true)) {
                        class185.field2400++;
                        var6 = false;
                    }
                    var11 = true;
                }
            }
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field8422[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8422[3] : field8422[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method4319(int arg0) {
        try {
            field8420 = null;
            field8421 = null;
            field8417 = null;
            if (arg0 < 99) {
                method4318(-103, 125, 84, null, -74, -8);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8422[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4320(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4321(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
