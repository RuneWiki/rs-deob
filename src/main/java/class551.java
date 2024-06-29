import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class551 extends class755 {

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "Ljava/lang/String;")
    private String field8212 = null;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "J")
    private long field8208 = -1L;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8214 = new String[] { method4152(method4151("2@?P\u0018")), method4152(method4151("2@?\\\u0018")), method4152(method4151("2@?Z\u0018")), method4152(method4151("!\u001c?6M")), method4152(method4151("4G}t")), method4152(method4151("2@?[\u0018")), method4152(method4151("z_tuR?@\u007fy]?\b")), method4152(method4151("2@?Y\u0018")), method4152(method4151("7W|zU(ZpkX`")), method4152(method4151("2@?]\u0018")) };

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "[C")
    public static char[] field8209 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "B")
    private byte field8210;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    private int field8204;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLib;)V")
    public final void method1992(byte arg0, class163 arg1) {
        try {
            if (arg1.method1455((byte) 62) != 255) {
                arg1.field2201--;
                this.field8208 = arg1.method1435(-128);
            }
            field8206++;
            this.field8212 = arg1.method1401(0);
            this.field8204 = arg1.method1445((byte) 122);
            this.field8210 = arg1.method1414(1);
            int var3 = 63 / ((arg0 - 3) / 51);
            arg1.method1435(15);
            if (class515.field7439) {
                System.out.println(field8214[8] + this.field8208 + field8214[6] + this.field8212);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8214[7] + arg0 + ',' + (arg1 == null ? field8214[4] : field8214[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BII)Z")
    public static final boolean method4147(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 == 101) {
                field8211++;
                return (arg2 & 0x100100) != 0;
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8214[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)I")
    public static final int method4148(int arg0) {
        try {
            field8205++;
            if ((double) class161.field2159 == 3.0D) {
                return 37;
            } else if ((double) class161.field2159 == 4.0D) {
                return 50;
            } else if (arg0 != 50) {
                return -20;
            } else if ((double) class161.field2159 == 6.0D) {
                return 75;
            } else if ((double) class161.field2159 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8214[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static final void method4149(int arg0) {
        try {
            class289.field4305.method655(17, 1, class289.field4305.field824);
            field8207++;
            class289.field4305.method655(17, 1, class289.field4305.field825);
            class289.field4305.method655(17, 2, class289.field4305.field798);
            class289.field4305.method655(17, 2, class289.field4305.field808);
            class289.field4305.method655(17, 1, class289.field4305.field845);
            class289.field4305.method655(17, 1, class289.field4305.field806);
            class289.field4305.method655(17, 1, class289.field4305.field833);
            class289.field4305.method655(17, 1, class289.field4305.field822);
            class289.field4305.method655(17, 1, class289.field4305.field811);
            class289.field4305.method655(17, 1, class289.field4305.field835);
            class289.field4305.method655(17, 1, class289.field4305.field810);
            class289.field4305.method655(17, 1, class289.field4305.field801);
            class289.field4305.method655(17, 0, class289.field4305.field799);
            class289.field4305.method655(17, 1, class289.field4305.field827);
            class289.field4305.method655(17, 0, class289.field4305.field848);
            class289.field4305.method655(17, 0, class289.field4305.field826);
            class289.field4305.method655(17, 1, class289.field4305.field823);
            class289.field4305.method655(17, 0, class289.field4305.field818);
            class289.field4305.method655(17, 0, class289.field4305.field832);
            class287.method2330(4);
            if (arg0 > 90) {
                class289.field4305.method655(17, 1, class289.field4305.field842);
                class289.field4305.method655(17, 3, class289.field4305.field814);
                class735.method5364(2);
                class745.method5429(-6124);
                class431.field6338 = true;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8214[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
    public static void method4150(int arg0) {
        try {
            if (arg0 <= 34) {
                field8209 = null;
            }
            field8209 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8214[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILwca;)V")
    public final void method1990(int arg0, class705 arg1) {
        try {
            field8213++;
            class662 var3 = new class662();
            if (arg0 != -1) {
                method4149(27);
            }
            var3.field9571 = this.field8212;
            var3.field9569 = this.field8204;
            var3.field9568 = this.field8210;
            arg1.method5153(arg0 + 92, var3);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8214[2] + arg0 + ',' + (arg1 == null ? field8214[4] : field8214[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4151(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4152(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
